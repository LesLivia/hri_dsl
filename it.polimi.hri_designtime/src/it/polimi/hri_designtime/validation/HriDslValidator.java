/*
 * generated by Xtext 2.28.0
 */
package it.polimi.hri_designtime.validation;


import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.HashMap;
import java.util.HashSet;
import org.eclipse.xtext.validation.Check;

import it.polimi.hri_designtime.hriDsl.Assignment;
import it.polimi.hri_designtime.hriDsl.HriDslPackage;
import it.polimi.hri_designtime.hriDsl.Floor;
import it.polimi.hri_designtime.hriDsl.Behavioral_model;
import it.polimi.hri_designtime.hriDsl.Free_will_profile;
import it.polimi.hri_designtime.hriDsl.Human;
import it.polimi.hri_designtime.hriDsl.Humans;
import it.polimi.hri_designtime.hriDsl.Mission;
import it.polimi.hri_designtime.hriDsl.Model;
import it.polimi.hri_designtime.hriDsl.Point;
import it.polimi.hri_designtime.hriDsl.Robot;
import it.polimi.hri_designtime.hriDsl.Robots;
import it.polimi.hri_designtime.hriDsl.Scenario;
import it.polimi.hri_designtime.hriDsl.Surface;
import it.polimi.hri_designtime.generator.Operations;


/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class HriDslValidator extends AbstractHriDslValidator {	
	
	@Check
	public void checkUniqueFloorName(Model model) {
		HashSet<String> floorSet = new HashSet<String>();
		
		if(model.getScenarios() != null) {
			for(Scenario s: model.getScenarios()) {
				if(s.getFloor() != null && s.getFloor().getFloor_name() != null && !floorSet.add(s.getFloor().getFloor_name())){
					error("Error: " + "Layout name \"" + s.getFloor().getFloor_name() + "\" already in use.\n" + "Layout name must be unique.", s.getFloor(), HriDslPackage.Literals.FLOOR__FLOOR_NAME);
				}
			}
		}
	}
	
	@Check
	public void checkUniqueSurfaceName(Floor floor) {
		HashSet<String> surfaceSet = new HashSet<String>();
		
		if(floor.getSurfaces() != null) {
			for(Surface s: floor.getSurfaces()) {
				if(s.getName() != null && !surfaceSet.add(s.getName())){
					error("Error: " + "Area name \"" + s.getName() + "\" already in use in this layour.\n" + "Area name must be unique within the same layout.", s, HriDslPackage.Literals.SURFACE__NAME);
				}
			}
		}
	}
	
	@Check
	public void checkVerticesValidity(Surface surface) {
		if(surface.getVertices() != null && surface.getVertices().getVertex_A() != null && surface.getVertices().getVertex_C() != null) {
			float Vertex_A_coordinate_x = surface.getVertices().getVertex_A().getX();
			float Vertex_A_coordinate_y = surface.getVertices().getVertex_A().getY();
			float Vertex_C_coordinate_x = surface.getVertices().getVertex_C().getX();
			float Vertex_C_coordinate_y = surface.getVertices().getVertex_C().getY();
			
				if(Vertex_A_coordinate_x == Vertex_C_coordinate_x) {
					error("Error: " + "Coordinates must be different.\n" + "Area vertices cannot overlap or be aligned.\n" + "Area representation:\nA ---- B\n   |     |\nD ---- C", surface.getVertices().getVertex_C(), HriDslPackage.Literals.COORDINATES__X);
				}
				if(Vertex_A_coordinate_y == Vertex_C_coordinate_y) {
					error("Error: " + "Coordinates must be different.\n" + "Area vertices cannot overlap or be aligned.\n" + "Area representation:\nA ---- B\n   |     |\nD ---- C", surface.getVertices().getVertex_C(), HriDslPackage.Literals.COORDINATES__Y);
				}
			
		}
	}
	
	@Check
	public void checkOverlappingRectangles(Floor floor) {
		HashSet<Integer> indexSet = new HashSet<Integer>();
		
		if(floor.getSurfaces() != null){
			for(int i=0; i < floor.getSurfaces().size()-1; i++){
				for(int j=i+1; j < floor.getSurfaces().size(); j++){
					if(floor.getSurfaces().get(i).getVertices() != null && floor.getSurfaces().get(j).getVertices() != null && floor.getSurfaces().get(i).getVertices().getVertex_A() != null && floor.getSurfaces().get(j).getVertices().getVertex_A() != null && floor.getSurfaces().get(i).getVertices().getVertex_C() != null && floor.getSurfaces().get(j).getVertices().getVertex_C() != null){
						if(floor.getSurfaces().get(i).getVertices().getVertex_A().getX() == floor.getSurfaces().get(j).getVertices().getVertex_A().getX() && floor.getSurfaces().get(i).getVertices().getVertex_A().getY() == floor.getSurfaces().get(j).getVertices().getVertex_A().getY() && floor.getSurfaces().get(i).getVertices().getVertex_C().getX() == floor.getSurfaces().get(j).getVertices().getVertex_C().getX() && floor.getSurfaces().get(i).getVertices().getVertex_C().getY() == floor.getSurfaces().get(j).getVertices().getVertex_C().getY()) {
							if(indexSet.add(j)) {
								error("Error: " + "Area \"" + floor.getSurfaces().get(j).getName() + "\" and the area \"" + floor.getSurfaces().get(i).getName() + "\" overlap.\n" + "Two areas cannot share vertices.", floor.getSurfaces().get(j), HriDslPackage.Literals.SURFACE__NAME);
							}
						}
					}
				}
			}
		}
	}
	
	@Check
	public void checkUniquePointName(Floor floor) {
		HashSet<String> pointSet = new HashSet<String>();
		
		if(floor.getPoints() != null) {
			for(Point p: floor.getPoints()) {
				if(p.getName() != null && !pointSet.add(p.getName())){
					error("Error: " + "POI name \"" + p.getName() + "\" already in use in this layout.\n" + "POI name must be unique within the same layout.", p, HriDslPackage.Literals.POINT__NAME);
				}
			}
		}
	}
	
	@Check
	public void checkPointValidity(Floor floor) {
		Operations op = new Operations();
		
		if(floor.getPoints() != null && floor.getSurfaces() != null){
			for(Point p: floor.getPoints()) {
				if(p.getCoordinates() != null && p.getName() != null){
					boolean valid = false;
					for(Surface s: floor.getSurfaces()){
						if(s.getVertices() != null && s.getVertices().getVertex_A() != null && s.getVertices().getVertex_C() != null){
							Rectangle2D.Float r = op.createRectangle(s);
							if(r != null) {
								if(r.contains(p.getCoordinates().getX(), p.getCoordinates().getY())){
									valid = true;
									break;
								}
							}
						}
					}
					if(!valid){
						error("Error: " + "POI \"" + p.getName() + "\" is not valid.\n" + "POI coordinates must belong to an area.", p, HriDslPackage.Literals.POINT__NAME);
					}
				}
			}
		}
	}
	
	
	@Check
	public void checkExistingRech(Floor floor) {
		boolean valid = false;
		if(floor.getPoints() != null && floor.getSurfaces() != null){
			for(Point p: floor.getPoints()) {
				if(!valid) {
					valid = p.getName().equals("RECH");
				}
			}
		}
		if(!valid){
			error("Error: Layout not valid.\"" + floor.getFloor_name() + "Robot's recharging station POI must be specified.\n Define a POI named 'RECH'.", HriDslPackage.Literals.FLOOR__FLOOR_NAME);
		}
	}
	
	@Check
	public void checkUniqueRobotName(Robots robots) {
		HashSet<String> robotSet = new HashSet<String>();
		
		if(robots.getRobots() != null){
			for(Robot r: robots.getRobots()) {
				if(r.getName() != null && !robotSet.add(r.getName())){
					error("Error: " + "Robot name \"" + r.getName() + "\" already in use in this layout.\n" + "Robot name must be unique within the same layout.", r, HriDslPackage.Literals.ROBOT__NAME);
				}
			}
		}
	}
	
	@Check
	public void checkUniqueRobotHumanPosition(Scenario scenario) {
		HashMap<Point2D.Float, String> positionMap = new HashMap<Point2D.Float, String>();
		String name = new String();
		
		if(scenario.getRobots() != null && scenario.getRobots().getRobots() != null){
			for(Robot r: scenario.getRobots().getRobots()) {
				if(r.getCoordinates() != null && r.getName() != null){
					name = positionMap.putIfAbsent(new Point2D.Float(r.getCoordinates().getX(), r.getCoordinates().getY()), r.getName());
					if(name != null) {
						error("Error: " + "the robot coordinates \"(" + r.getCoordinates().getX() + ";" + r.getCoordinates().getY() + ")\" has already been used for " + name + ".\n" + "Change starting location.", r, HriDslPackage.Literals.ROBOT__NAME);
					}
				}
			}
		}
		if(scenario.getHumans() != null && scenario.getHumans().getHumans() != null){
			for(Human h: scenario.getHumans().getHumans()) {
				if(h.getCoordinates() != null && h.getName() != null){
					name = positionMap.putIfAbsent(new Point2D.Float(h.getCoordinates().getX(), h.getCoordinates().getY()), h.getName());
					if(name != null) {
						error("Error: " + "Human coordinates \"(" + h.getCoordinates().getX() + ";" + h.getCoordinates().getY() + ")\" already in use for " + name + ".\n" + "Change starting location.", h, HriDslPackage.Literals.HUMAN__NAME);
					}
				}
			}
		}
	}
	
	public static final String PERCENTAGE = "percentage";
	@Check
	public void checkChargePercentage(Robot robot) {
		if(robot.getCharge_percentage() > 100) {
			error("Error: " + "Robot charge cannot be more than 100", robot, HriDslPackage.Literals.ROBOT__CHARGE_PERCENTAGE, HriDslValidator.PERCENTAGE, String.valueOf(robot.getCharge_percentage()));
		}
	}
	
	@Check
	public void checkRobotPositionValidity(Scenario scenario) {
		Operations op = new Operations();
		
		if(scenario.getRobots() != null && scenario.getRobots().getRobots() != null && scenario.getFloor() != null && scenario.getFloor().getSurfaces() != null){
			for(Robot robot: scenario.getRobots().getRobots()) {
				if(robot.getCoordinates() != null && robot.getName() != null){
					boolean valid = false;
					for(Surface s: scenario.getFloor().getSurfaces()) {
						if(s.getVertices() != null && s.getVertices().getVertex_A() != null && s.getVertices().getVertex_C() != null) {
							Rectangle2D.Float rectangle = op.createRectangle(s);
							if(rectangle != null) {
								if(rectangle.contains(robot.getCoordinates().getX(), robot.getCoordinates().getY())) {
									valid = true;
									break;
								}
							}
						}
					}
					if(!valid) {
						error("Error: " + "Robot coordinates \"" + robot.getName() + "\" not valid.\n" + "Robot coordinates must belong to an area.", robot, HriDslPackage.Literals.ROBOT__NAME);
					}
				}
			}
		}
	}
	
	@Check
	public void checkUniqueHumanName(Humans humans) {
		HashSet<String> humansSet = new HashSet<String>();
		
		if(humans.getHumans() != null){
			for(Human h: humans.getHumans()){
				if(h.getName() != null && !humansSet.add(h.getName())){
					error("Error: " + "Human name \"" + h.getName() + "\" already in use in this layout.\n" + "Human name must be unique within the same layout.", h, HriDslPackage.Literals.HUMAN__NAME);
				}
			}
		}
	}
	
	
	
	@Check
	public void checkHumanPositionValidity(Scenario scenario) {
		Operations op = new Operations();
		
		if(scenario.getHumans() != null && scenario.getHumans().getHumans() != null && scenario.getFloor() != null && scenario.getFloor().getSurfaces() != null){
			for(Human human: scenario.getHumans().getHumans()) {
				if(human.getCoordinates() != null && human.getName() != null){
					boolean valid = false;
					for(Surface s: scenario.getFloor().getSurfaces()) {
						if(s.getVertices() != null && s.getVertices().getVertex_A() != null && s.getVertices().getVertex_C() != null){
							Rectangle2D.Float rectangle = op.createRectangle(s);
							if(rectangle != null) {
								if(rectangle.contains(human.getCoordinates().getX(), human.getCoordinates().getY())) {
									valid = true;
									break;
								}
							}
						}
					}
					if(!valid) {
						error("Error: " + "Human coordinates \"" + human.getName() + "\" not valid.\n" + "Human coordinates must belong to an area.", human, HriDslPackage.Literals.HUMAN__NAME);
					}
				}
			}
		}
	}
	
	@Check
	public void checkUniqueMissionName(Scenario scenario) {
		HashSet<String> missionsSet = new HashSet<String>();
		
		if(scenario.getMissions() != null) {
			for(Mission m: scenario.getMissions()) {
				if(m.getName() != null && !missionsSet.add(m.getName())){
					error("Error: " + "Mission name \"" + m.getName() + "\" already in use in this layout.\n" + "Mission name must be unique within the same layout.", m, HriDslPackage.Literals.MISSION__NAME);
				}
			}
		}
	}
	
	@Check
	public void checkAllHumansAreServed(Scenario scenario) {
		
		if(scenario.getMissions() != null && scenario.getHumans() != null && scenario.getHumans().getHumans() != null){
			for(Mission m: scenario.getMissions()){
				if(m.getName() != null && m.getAssignments() != null){
					for(Human h: scenario.getHumans().getHumans()){
						if(h.getName() != null){
							boolean valid = false;
							for(Assignment a: m.getAssignments()) {
								if(a.getClient() != null && a.getClient().equals(h.getName())) {
									valid = true;
									break;
								}
							}
							if(!valid){
								error("Error: " + "Mission \"" + m.getName() + "\" does not contain an assignment for human \"" + h.getName() + "\".\n" + "The mission must contain an assignment for each human within the layout.", m, HriDslPackage.Literals.MISSION__NAME);
							}
						}
					}
				}
			}
		}
	}
	
	@Check
	public void checkExistingHuman(Scenario scenario) {
		
		if(scenario.getMissions() != null && scenario.getHumans() != null && scenario.getHumans().getHumans() != null){
			for(Mission m: scenario.getMissions()){
				if(m.getAssignments() != null){
					for(Assignment a: m.getAssignments()) {
						if(a.getClient() != null){
							boolean valid = false;
							for(Human h: scenario.getHumans().getHumans()){
								if(h.getName() != null && a.getClient().equals(h.getName())) {
									valid = true;
									break;
								}
							}
							if(!valid){
								error("Error: " + "Human \"" + a.getClient() + "\" does not exist.\n" + "Use a valid human name.", a, HriDslPackage.Literals.ASSIGNMENT__CLIENT);
							}
						}
					}
				}
			}
		}
	}
/*	
	@Check
	public void checkDuplicates(Mission mission){
		HashSet<String> humanSet = new HashSet<String>();
		
		if(mission.getAssignments() != null){
			for(Assignment a: mission.getAssignments()){
				if(a.getClient() != null && !humanSet.add(a.getClient())) {
					error("Error: " + "Human \"" + a.getClient() + "\"already present in this mission.\n", a, HriDslPackage.Literals.ASSIGNMENT__CLIENT);
				}
			}
		}
	}
*/	
	@Check
	public void checkExistingPoint(Scenario scenario) {
		
		if(scenario.getMissions() != null && scenario.getFloor() != null && scenario.getFloor().getPoints() != null){
			for(Mission m: scenario.getMissions()){
				if(m.getAssignments() != null){
					for(Assignment a: m.getAssignments()) {
						if(a.getTarget() != null){
							boolean valid = false;
							for(Point p: scenario.getFloor().getPoints()){
								if(p.getName() != null && a.getTarget().equals(p.getName())) {
									valid = true;
									break;
								}
							}
							if(!valid){
								error("Error: " + "Target \"" + a.getTarget() + "\" does not exist.\n" + "Enter a valid POI name.", a, HriDslPackage.Literals.ASSIGNMENT__TARGET);
							}
						}
					}
				}
			}
		}
	}
	
	@Check
	public void checkPoint(Scenario scenario) {
		
		if(scenario.getFloor() != null && scenario.getFloor().getPoints() != null && scenario.getMissions() != null){
			for(Point p: scenario.getFloor().getPoints()){
				if(p.getName() != null){
					boolean valid = false;
					for(Mission m: scenario.getMissions()){
						if(m.getAssignments() != null){
							for(Assignment a: m.getAssignments()) {
								if(a.getTarget() != null && a.getTarget().equals(p.getName())) {
									valid = true;
									break;
								}
							}
						}
						if(valid){break;}
					}
					if(!valid){
						warning("Warning: " + "POI \"" + p.getName() + "\" not used.", p, HriDslPackage.Literals.POINT__NAME);
					}
				}
			}
		}
	}
	
	public static final String QUERY_DEFINITION = "query_definition";
	@Check
	public void checkQuery(Mission mission) {
		
		if(mission.getQueries() != null && mission.getQueries().getMission() != null) {
			if(mission.getName() != null && !mission.getName().equals(mission.getQueries().getMission())){
				error("Error: " + "Mission name \"" + mission.getQueries().getMission() + "\" should be \"" + mission.getName() + "\".", mission.getQueries(), HriDslPackage.Literals.QUERIES__MISSION, HriDslValidator.QUERY_DEFINITION, mission.getQueries().getMission(),mission.getName());
			}
		}
	}
	@Check
	public void checkFreeWillModel(Model m) {
		Behavioral_model free_will_model = m.getParameter().get(0).getFree_will_model();
		Scenario scenario = m.getScenarios().get(0);
		
		if (free_will_model == Behavioral_model.BASE) {
			for (Human human: scenario.getHumans().getHumans()){
				if (human.getFree_will_profile() != Free_will_profile.NORMAL && human.getFree_will_profile() != Free_will_profile.LOW && human.getFree_will_profile() != Free_will_profile.HIGH) {
					System.out.println("Dentro If");
					error("Error: " + "Human Freewill Profile is \"" + human.getFree_will_profile() + "\" instead it should be one of the base human free will profile.", human, HriDslPackage.Literals.HUMAN__FREE_WILL_PROFILE);
				}
			}

			
			
		}else if(free_will_model == Behavioral_model.ERRORS) {
			for (Human human: scenario.getHumans().getHumans()){
				if (human.getFree_will_profile() == Free_will_profile.LOW || human.getFree_will_profile() == Free_will_profile.HIGH) {
					error("Error: " + "Human Freewill Profile is \"" + human.getFree_will_profile() + "\" instead it should be one of the Extended human free will profile.", human, HriDslPackage.Literals.HUMAN__FREE_WILL_PROFILE);
				}
			}
		}
	}

}
