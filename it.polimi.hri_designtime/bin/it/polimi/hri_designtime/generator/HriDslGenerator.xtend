/*
 * generated by Xtext 2.28.0
 */
package it.polimi.hri_designtime.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import java.awt.geom.Rectangle2D
import java.util.ArrayList
import java.util.HashMap
import java.awt.geom.Point2D
import java.util.HashSet
import it.polimi.hri_designtime.hriDsl.Scenario
import it.polimi.hri_designtime.hriDsl.Query
import it.polimi.hri_designtime.hriDsl.Robot
import it.polimi.hri_designtime.hriDsl.Surface
import it.polimi.hri_designtime.hriDsl.Human
import it.polimi.hri_designtime.hriDsl.Assignment
import it.polimi.hri_designtime.hriDsl.Point
import it.polimi.hri_designtime.hriDsl.Mission
import it.polimi.hri_designtime.hriDsl.Floor
import it.polimi.hri_designtime.hriDsl.Parameter

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class HriDslGenerator extends AbstractGenerator {
	
	ArrayList<Point2D.Float> intersections;
	int max_n;
	Operations op;
	Json f;
	Parameter parameter;

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		op = new Operations();
		f = new Json();
		parameter = resource.allContents.filter(Parameter).head;		
				
		for( scenario: resource.allContents.filter(Scenario).toIterable){
			intersections = new ArrayList<Point2D.Float>();
			max_n = op.computeIntersections(scenario.floor, intersections);
			for(mission: scenario.missions){
				fsa.generateFile(resource.URI.lastSegment.substring(0,resource.URI.lastSegment.indexOf(".hri")) + '/' + scenario.floor.floor_name + '/' + mission.name +'.json', f.pScenario( scenario, mission, intersections, max_n, parameter));
			}
		}		
	}
}

class Json{
	
	Operations op = new Operations();
		
	def pQuery(Query q)'''
	{ "type": "«switch q.query_type.toString { case "simulation" : '''sim'''
  									  case "probability_of_success" : '''pscs'''
  									  case "expected_fatigue": '''eftg'''
  									  case "expected_charge": '''echg'''
  									  case "probability_of_failure": '''pfail''' 
  									  default : null}»", "tau": «q.duration», "n": «(q.runs == 0? -1: q.runs)» }'''
	
	def pRobots(int id, Robot r, Parameter parameter)'''
	{ "name": "«r.name»", "r_id": «id», «switch r.type.toString { case "turtlebot3_burger" : '''"v": «op.unitConversion(0.22f, parameter)», "a": «op.unitConversion(0.22f, parameter)»'''  
	  									  				   case "tiago" : '''"v": «op.unitConversion(1.0f, parameter)», "a": «op.unitConversion(1.0f, parameter)»'''  
	  									  				   case "pepper" : '''"v": «op.unitConversion(0.83f, parameter)», "a": «op.unitConversion(0.83f, parameter)»'''  
	  									  				   default : null}», "start": [«r.coordinates.x», «r.coordinates.y»], "chg": «r.charge_percentage» }'''
	
	def pAreas(Surface s)'''
	{ "p1": [«s.vertices.vertex_A.x», «s.vertices.vertex_A.y»], "p2": [«s.vertices.vertex_C.x», «s.vertices.vertex_A.y»], "p3": [«s.vertices.vertex_C.x», «s.vertices.vertex_C.y»], "p4": [«s.vertices.vertex_A.x», «s.vertices.vertex_C.y»] }'''
	
	def pIntersect(float x, float y)'''
	{ "p": [«x», «y»] }'''
	
	def pHumans(int id, Human h, Assignment a, Point p)'''
	«IF h.name.equals(a.client)»«IF a.target.equals(p.name)»
		{ "name": "«h.name»", "h_id": «id», "v": «h.speed», "ptrn": "«switch a.pattern.toString { case "robot_leader" : '''FOLLOWER'''
			  									  				   			   			case "robot_follower" : '''LEADER'''
			  									  				   			   			case "robot_transporter" : '''RECIPIENT'''
			  									  				   			  			case "robot_competitor" : '''COMPETITOR''' 
			  									  				   			   			case "robot_rescuer" : '''ASSISTANT'''          
			  									  				   			   			case "robot_client" : '''RESCUER'''   
			  									  				   			   			default : null}»", "p_f": "«switch h.fatigue_profile.toString { case "young_healthy" : '''y/h'''
			  									  				   			   			  									  				   case "young_sick" : '''y/s'''
			  									  				   			   			  									  				   case "elderly_healthy" : '''e/h'''
			  									  				   			   			  									  				   case "elderly_sick" : '''e/s'''
			  									  				   			   			  									  				   case "covid_patient" : '''c'''  
			  									  				   			   			  									  				   default : null}»", "p_fw": "«switch h.free_will_profile.toString { case "normal" : '''n'''
			  									  				   			   			  									  				   			  									  		   case "high" : '''h'''
			  									  				   			   			  									  				   			  									  		   case "low" : '''l'''
			  									  				   			   			  									  				   			  									  		   case "disabled" : '''d'''								                                                              				                                         
			  									  				   			   			  									  				   			  									  		   default : null}»", "start": [«h.coordinates.x», «h.coordinates.y»], "dest": [«p.coordinates.x», «p.coordinates.y»], "dext": «(h.dext == 0? -1: h.dext)», "same_as": -1, "path": -1 }«ENDIF»«ENDIF»'''
	
	def pScenario(Scenario scenario, Mission mission, ArrayList<Point2D.Float> intersections, int max_n, Parameter parameter)'''
	{
		"queries": [«'\n\t\t'»«FOR q: mission.queries.queries SEPARATOR ',\n\t\t' »«pQuery(q)»«ENDFOR»],
		"humans": [«'\n\t\t'»«var hid = 1»«FOR h: scenario.humans.humans SEPARATOR ',\n\t\t' »«pHumans(hid++, h, mission.assignments.findFirst[a| a.client.equals(h.name)], scenario.floor.points.findFirst[p| p.name.equals(mission.assignments.findFirst[a| a.client.equals(h.name)].target)])»«ENDFOR»],
		"robots": [«'\n\t\t'»«var rid = 1»«FOR r: scenario.robots.robots SEPARATOR ',\n\t\t' »«pRobots(rid++, r, parameter)»«ENDFOR»],
		"areas": [«'\n\t\t'»«FOR s: scenario.floor.surfaces SEPARATOR ',\n\t\t' »«pAreas(s)»«ENDFOR»],
		"intersect": [«'\n\t\t'»«FOR i: intersections SEPARATOR ',\n\t\t'»«pIntersect(i.getX.floatValue, i.getY.floatValue)»«ENDFOR»], 
		"max_neigh": «max_n»
	}'''
	
}

class Operations{
	
	int max_n;
	HashSet<Point2D.Float> n;
	Rectangle2D temp_r;
	HashSet<Point2D.Float> points_set;
	HashMap<Rectangle2D.Float, HashSet<Point2D.Float>> rectangles_map;
	ArrayList<Rectangle2D.Float> rectangles;
	HashMap<Point2D.Float, HashSet<Rectangle2D.Float>> points_map;
	
	def computeIntersections(Floor floor, ArrayList<Point2D.Float> intersections){
		
		points_set = new HashSet<Point2D.Float>();
		rectangles_map = new HashMap<Rectangle2D.Float, HashSet<Point2D.Float>>();
		points_map = new HashMap<Point2D.Float, HashSet<Rectangle2D.Float>>();
		rectangles = new ArrayList<Rectangle2D.Float>();
		
		for(s: floor.surfaces){
			rectangles.add(createRectangle(s));
			rectangles_map.put(rectangles.last, new HashSet<Point2D.Float>());
		}
		
		for(var i=0; i < rectangles.size-1; i++){
			for(var j=i+1; j < rectangles.size; j++){
				if( intersects(rectangles.get(i), rectangles.get(j))){
					temp_r = rectangles.get(i).createIntersection(rectangles.get(j));
					points_set.add(new Point2D.Float(temp_r.getCenterX.floatValue, temp_r.getCenterY.floatValue));
				}
			}
		}
		
		for(p: points_set){
			points_map.put(p, new HashSet<Rectangle2D.Float>())
			for(r: rectangles){
				if(r.contains(p)){
					rectangles_map.get(r).add(p);
					points_map.get(p).add(r);
				}
			}
		}
				
		max_n = 0;
		for(p: points_set){			
			n = new HashSet<Point2D.Float>();
			for(r: points_map.get(p)){
				n.addAll(rectangles_map.get(r));
			}
			if(n.size-1 > max_n){
				max_n = n.size-1;
			}		
		}
		
		intersections.addAll(points_set);
		return max_n;
	}
	
	def private intersects(Rectangle2D.Float r1, Rectangle2D.Float r2){
		if((r1.getY < r2.getY+r2.getHeight && r1.getY+r1.getHeight > r2.getY) && (r1.getX < r2.getX+r2.getWidth && r1.getX+r1.getWidth > r2.getX)){
			return true;
		}
		else{
			return false;
		}
	}
	
	def createRectangle(Surface s){
		if(s.vertices.vertex_A.x != s.vertices.vertex_C.x && s.vertices.vertex_A.y != s.vertices.vertex_C.y){
			var A = new Point2D.Float(s.vertices.vertex_A.x, s.vertices.vertex_A.y);
			var B = new Point2D.Float(s.vertices.vertex_C.x, s.vertices.vertex_A.y);
			var C = new Point2D.Float(s.vertices.vertex_C.x, s.vertices.vertex_C.y);
			var D = new Point2D.Float(s.vertices.vertex_A.x, s.vertices.vertex_C.y);
			var tempList = new ArrayList<Point2D.Float>();
			tempList.add(A);
			if(tempList.get(0).getX <= B.getX && tempList.get(0).getY <= B.getY){
				tempList.add(B);
			}
			else{
				tempList.add(0, B);
			}
			if(tempList.get(0).getX <= C.getX && tempList.get(0).getY <= C.getY){
				tempList.add(C);
			}
			else{
				tempList.add(0, C);
			}
			if(tempList.get(0).getX <= D.getX && tempList.get(0).getY <= D.getY){
				tempList.add(D);
			}
			else{
				tempList.add(0, D);
			}
			
			val vertex = tempList.remove(0);
			var width = tempList.findFirst[e|e.getY == vertex.getY].getX - vertex.getX;
			var height = tempList.findFirst[e|e.getX == vertex.getX].getY - vertex.getY; 
			
			return new Rectangle2D.Float(vertex.getX.floatValue, vertex.getY.floatValue, width.floatValue, height.floatValue);		
	    }
	}
	
	def unitConversion(float f, Parameter parameter){
		var length_unit = "m";
		var result = 0.0f;
		
		if(parameter !== null){
			length_unit = parameter.length_unit.toString;
		}
		switch (length_unit) {
			case "m": {
				result = f;
			}
			case "km": {
				result = f/1000.0f;
			}
			case "cm": {
				result = f*100.0f;
			}
			default: { }
		}
		
		return result;
	}
	
}
