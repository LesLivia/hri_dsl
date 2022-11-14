/*
 * generated by Xtext 2.28.0
 */
grammar InternalHriDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package it.polimi.hri_designtime.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package it.polimi.hri_designtime.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.polimi.hri_designtime.services.HriDslGrammarAccess;

}

@parser::members {

 	private HriDslGrammarAccess grammarAccess;

    public InternalHriDslParser(TokenStream input, HriDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected HriDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getParameterParameterParserRuleCall_0_0());
				}
				lv_parameter_0_0=ruleParameter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"parameter",
						lv_parameter_0_0,
						"it.polimi.hri_designtime.HriDsl.Parameter");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getScenariosScenarioParserRuleCall_1_0());
				}
				lv_scenarios_1_0=ruleScenario
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"scenarios",
						lv_scenarios_1_0,
						"it.polimi.hri_designtime.HriDsl.Scenario");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	iv_ruleParameter=ruleParameter
	{ $current=$iv_ruleParameter.current; }
	EOF;

// Rule Parameter
ruleParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='parameter'
		{
			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
		}
		otherlv_1='length_unit'
		{
			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getLength_unitKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParameterAccess().getLength_unitLength_unitEnumRuleCall_2_0());
				}
				lv_length_unit_2_0=ruleLength_unit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParameterRule());
					}
					set(
						$current,
						"length_unit",
						lv_length_unit_2_0,
						"it.polimi.hri_designtime.HriDsl.Length_unit");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleScenario
entryRuleScenario returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScenarioRule()); }
	iv_ruleScenario=ruleScenario
	{ $current=$iv_ruleScenario.current; }
	EOF;

// Rule Scenario
ruleScenario returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getFloorFloorParserRuleCall_0_0());
				}
				lv_floor_0_0=ruleFloor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					set(
						$current,
						"floor",
						lv_floor_0_0,
						"it.polimi.hri_designtime.HriDsl.Floor");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getRobotsRobotsParserRuleCall_1_0());
				}
				lv_robots_1_0=ruleRobots
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					set(
						$current,
						"robots",
						lv_robots_1_0,
						"it.polimi.hri_designtime.HriDsl.Robots");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getHumansHumansParserRuleCall_2_0());
				}
				lv_humans_2_0=ruleHumans
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					set(
						$current,
						"humans",
						lv_humans_2_0,
						"it.polimi.hri_designtime.HriDsl.Humans");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getMissionsMissionParserRuleCall_3_0());
				}
				lv_missions_3_0=ruleMission
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					add(
						$current,
						"missions",
						lv_missions_3_0,
						"it.polimi.hri_designtime.HriDsl.Mission");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleFloor
entryRuleFloor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFloorRule()); }
	iv_ruleFloor=ruleFloor
	{ $current=$iv_ruleFloor.current; }
	EOF;

// Rule Floor
ruleFloor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='build'
		{
			newLeafNode(otherlv_0, grammarAccess.getFloorAccess().getBuildKeyword_0());
		}
		otherlv_1='floor'
		{
			newLeafNode(otherlv_1, grammarAccess.getFloorAccess().getFloorKeyword_1());
		}
		(
			(
				lv_floor_name_2_0=RULE_ID
				{
					newLeafNode(lv_floor_name_2_0, grammarAccess.getFloorAccess().getFloor_nameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFloorRule());
					}
					setWithLastConsumed(
						$current,
						"floor_name",
						lv_floor_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getFloorAccess().getColonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFloorAccess().getSurfacesSurfaceParserRuleCall_4_0());
				}
				lv_surfaces_4_0=ruleSurface
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFloorRule());
					}
					add(
						$current,
						"surfaces",
						lv_surfaces_4_0,
						"it.polimi.hri_designtime.HriDsl.Surface");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getFloorAccess().getPointsPointParserRuleCall_5_0());
				}
				lv_points_5_0=rulePoint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFloorRule());
					}
					add(
						$current,
						"points",
						lv_points_5_0,
						"it.polimi.hri_designtime.HriDsl.Point");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleSurface
entryRuleSurface returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSurfaceRule()); }
	iv_ruleSurface=ruleSurface
	{ $current=$iv_ruleSurface.current; }
	EOF;

// Rule Surface
ruleSurface returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='add'
		{
			newLeafNode(otherlv_0, grammarAccess.getSurfaceAccess().getAddKeyword_0());
		}
		otherlv_1='rectangular_surface'
		{
			newLeafNode(otherlv_1, grammarAccess.getSurfaceAccess().getRectangular_surfaceKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getSurfaceAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSurfaceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='with'
		{
			newLeafNode(otherlv_3, grammarAccess.getSurfaceAccess().getWithKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSurfaceAccess().getVerticesVerticesParserRuleCall_4_0());
				}
				lv_vertices_4_0=ruleVertices
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSurfaceRule());
					}
					set(
						$current,
						"vertices",
						lv_vertices_4_0,
						"it.polimi.hri_designtime.HriDsl.Vertices");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleVertices
entryRuleVertices returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVerticesRule()); }
	iv_ruleVertices=ruleVertices
	{ $current=$iv_ruleVertices.current; }
	EOF;

// Rule Vertices
ruleVertices returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='coordinates_vertex_A'
		{
			newLeafNode(otherlv_0, grammarAccess.getVerticesAccess().getCoordinates_vertex_AKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVerticesAccess().getVertex_ACoordinatesParserRuleCall_1_0());
				}
				lv_vertex_A_1_0=ruleCoordinates
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVerticesRule());
					}
					set(
						$current,
						"vertex_A",
						lv_vertex_A_1_0,
						"it.polimi.hri_designtime.HriDsl.Coordinates");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='coordinates_vertex_C'
		{
			newLeafNode(otherlv_2, grammarAccess.getVerticesAccess().getCoordinates_vertex_CKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVerticesAccess().getVertex_CCoordinatesParserRuleCall_3_0());
				}
				lv_vertex_C_3_0=ruleCoordinates
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVerticesRule());
					}
					set(
						$current,
						"vertex_C",
						lv_vertex_C_3_0,
						"it.polimi.hri_designtime.HriDsl.Coordinates");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePoint
entryRulePoint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPointRule()); }
	iv_rulePoint=rulePoint
	{ $current=$iv_rulePoint.current; }
	EOF;

// Rule Point
rulePoint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='add'
		{
			newLeafNode(otherlv_0, grammarAccess.getPointAccess().getAddKeyword_0());
		}
		otherlv_1='point_of_interest'
		{
			newLeafNode(otherlv_1, grammarAccess.getPointAccess().getPoint_of_interestKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getPointAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPointRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='with'
		{
			newLeafNode(otherlv_3, grammarAccess.getPointAccess().getWithKeyword_3());
		}
		otherlv_4='coordinates'
		{
			newLeafNode(otherlv_4, grammarAccess.getPointAccess().getCoordinatesKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPointAccess().getCoordinatesCoordinatesParserRuleCall_5_0());
				}
				lv_coordinates_5_0=ruleCoordinates
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPointRule());
					}
					set(
						$current,
						"coordinates",
						lv_coordinates_5_0,
						"it.polimi.hri_designtime.HriDsl.Coordinates");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRobots
entryRuleRobots returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRobotsRule()); }
	iv_ruleRobots=ruleRobots
	{ $current=$iv_ruleRobots.current; }
	EOF;

// Rule Robots
ruleRobots returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='define'
		{
			newLeafNode(otherlv_0, grammarAccess.getRobotsAccess().getDefineKeyword_0());
		}
		otherlv_1='robots'
		{
			newLeafNode(otherlv_1, grammarAccess.getRobotsAccess().getRobotsKeyword_1());
		}
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getRobotsAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRobotsAccess().getRobotsRobotParserRuleCall_3_0());
				}
				lv_robots_3_0=ruleRobot
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRobotsRule());
					}
					add(
						$current,
						"robots",
						lv_robots_3_0,
						"it.polimi.hri_designtime.HriDsl.Robot");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleRobot
entryRuleRobot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRobotRule()); }
	iv_ruleRobot=ruleRobot
	{ $current=$iv_ruleRobot.current; }
	EOF;

// Rule Robot
ruleRobot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='robot'
		{
			newLeafNode(otherlv_0, grammarAccess.getRobotAccess().getRobotKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRobotRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='with'
		{
			newLeafNode(otherlv_2, grammarAccess.getRobotAccess().getWithKeyword_2());
		}
		otherlv_3='coordinates'
		{
			newLeafNode(otherlv_3, grammarAccess.getRobotAccess().getCoordinatesKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRobotAccess().getCoordinatesCoordinatesParserRuleCall_4_0());
				}
				lv_coordinates_4_0=ruleCoordinates
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRobotRule());
					}
					set(
						$current,
						"coordinates",
						lv_coordinates_4_0,
						"it.polimi.hri_designtime.HriDsl.Coordinates");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='type'
		{
			newLeafNode(otherlv_5, grammarAccess.getRobotAccess().getTypeKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRobotAccess().getTypeTypeEnumRuleCall_6_0());
				}
				lv_type_6_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRobotRule());
					}
					set(
						$current,
						"type",
						lv_type_6_0,
						"it.polimi.hri_designtime.HriDsl.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='charge_percentage'
		{
			newLeafNode(otherlv_7, grammarAccess.getRobotAccess().getCharge_percentageKeyword_7());
		}
		(
			(
				lv_charge_percentage_8_0=RULE_INT
				{
					newLeafNode(lv_charge_percentage_8_0, grammarAccess.getRobotAccess().getCharge_percentageINTTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRobotRule());
					}
					setWithLastConsumed(
						$current,
						"charge_percentage",
						lv_charge_percentage_8_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleHumans
entryRuleHumans returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHumansRule()); }
	iv_ruleHumans=ruleHumans
	{ $current=$iv_ruleHumans.current; }
	EOF;

// Rule Humans
ruleHumans returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='define'
		{
			newLeafNode(otherlv_0, grammarAccess.getHumansAccess().getDefineKeyword_0());
		}
		otherlv_1='humans'
		{
			newLeafNode(otherlv_1, grammarAccess.getHumansAccess().getHumansKeyword_1());
		}
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getHumansAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHumansAccess().getHumansHumanParserRuleCall_3_0());
				}
				lv_humans_3_0=ruleHuman
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHumansRule());
					}
					add(
						$current,
						"humans",
						lv_humans_3_0,
						"it.polimi.hri_designtime.HriDsl.Human");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleHuman
entryRuleHuman returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHumanRule()); }
	iv_ruleHuman=ruleHuman
	{ $current=$iv_ruleHuman.current; }
	EOF;

// Rule Human
ruleHuman returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='human'
		{
			newLeafNode(otherlv_0, grammarAccess.getHumanAccess().getHumanKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getHumanAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHumanRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='with'
		{
			newLeafNode(otherlv_2, grammarAccess.getHumanAccess().getWithKeyword_2());
		}
		otherlv_3='coordinates'
		{
			newLeafNode(otherlv_3, grammarAccess.getHumanAccess().getCoordinatesKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHumanAccess().getCoordinatesCoordinatesParserRuleCall_4_0());
				}
				lv_coordinates_4_0=ruleCoordinates
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHumanRule());
					}
					set(
						$current,
						"coordinates",
						lv_coordinates_4_0,
						"it.polimi.hri_designtime.HriDsl.Coordinates");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='speed'
		{
			newLeafNode(otherlv_5, grammarAccess.getHumanAccess().getSpeedKeyword_5());
		}
		(
			(
				lv_speed_6_0=RULE_FLOAT
				{
					newLeafNode(lv_speed_6_0, grammarAccess.getHumanAccess().getSpeedFLOATTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHumanRule());
					}
					setWithLastConsumed(
						$current,
						"speed",
						lv_speed_6_0,
						"it.polimi.hri_designtime.HriDsl.FLOAT");
				}
			)
		)
		otherlv_7='dexterity'
		{
			newLeafNode(otherlv_7, grammarAccess.getHumanAccess().getDexterityKeyword_7());
		}
		(
			(
				lv_dext_8_0=RULE_INT
				{
					newLeafNode(lv_dext_8_0, grammarAccess.getHumanAccess().getDextINTTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHumanRule());
					}
					setWithLastConsumed(
						$current,
						"dext",
						lv_dext_8_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_9='fatigue_profile'
		{
			newLeafNode(otherlv_9, grammarAccess.getHumanAccess().getFatigue_profileKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHumanAccess().getFatigue_profileFatigue_profileEnumRuleCall_10_0());
				}
				lv_fatigue_profile_10_0=ruleFatigue_profile
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHumanRule());
					}
					set(
						$current,
						"fatigue_profile",
						lv_fatigue_profile_10_0,
						"it.polimi.hri_designtime.HriDsl.Fatigue_profile");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_11='free_will_profile'
		{
			newLeafNode(otherlv_11, grammarAccess.getHumanAccess().getFree_will_profileKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHumanAccess().getFree_will_profileFree_will_profileEnumRuleCall_12_0());
				}
				lv_free_will_profile_12_0=ruleFree_will_profile
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHumanRule());
					}
					set(
						$current,
						"free_will_profile",
						lv_free_will_profile_12_0,
						"it.polimi.hri_designtime.HriDsl.Free_will_profile");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleMission
entryRuleMission returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMissionRule()); }
	iv_ruleMission=ruleMission
	{ $current=$iv_ruleMission.current; }
	EOF;

// Rule Mission
ruleMission returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='define'
		{
			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getDefineKeyword_0());
		}
		otherlv_1='mission'
		{
			newLeafNode(otherlv_1, grammarAccess.getMissionAccess().getMissionKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getMissionAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMissionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getColonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMissionAccess().getAssignmentsAssignmentParserRuleCall_4_0());
				}
				lv_assignments_4_0=ruleAssignment
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMissionRule());
					}
					add(
						$current,
						"assignments",
						lv_assignments_4_0,
						"it.polimi.hri_designtime.HriDsl.Assignment");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getMissionAccess().getQueriesQueriesParserRuleCall_5_0());
				}
				lv_queries_5_0=ruleQueries
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMissionRule());
					}
					set(
						$current,
						"queries",
						lv_queries_5_0,
						"it.polimi.hri_designtime.HriDsl.Queries");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAssignment
entryRuleAssignment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssignmentRule()); }
	iv_ruleAssignment=ruleAssignment
	{ $current=$iv_ruleAssignment.current; }
	EOF;

// Rule Assignment
ruleAssignment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='do'
		{
			newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getDoKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssignmentAccess().getPatternPatternEnumRuleCall_1_0());
				}
				lv_pattern_1_0=rulePattern
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssignmentRule());
					}
					set(
						$current,
						"pattern",
						lv_pattern_1_0,
						"it.polimi.hri_designtime.HriDsl.Pattern");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='for'
		{
			newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getForKeyword_2());
		}
		(
			(
				lv_client_3_0=RULE_ID
				{
					newLeafNode(lv_client_3_0, grammarAccess.getAssignmentAccess().getClientIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssignmentRule());
					}
					setWithLastConsumed(
						$current,
						"client",
						lv_client_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4='with'
		{
			newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getWithKeyword_4());
		}
		otherlv_5='target'
		{
			newLeafNode(otherlv_5, grammarAccess.getAssignmentAccess().getTargetKeyword_5());
		}
		(
			(
				lv_target_6_0=RULE_ID
				{
					newLeafNode(lv_target_6_0, grammarAccess.getAssignmentAccess().getTargetIDTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssignmentRule());
					}
					setWithLastConsumed(
						$current,
						"target",
						lv_target_6_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleQueries
entryRuleQueries returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQueriesRule()); }
	iv_ruleQueries=ruleQueries
	{ $current=$iv_ruleQueries.current; }
	EOF;

// Rule Queries
ruleQueries returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='define'
		{
			newLeafNode(otherlv_0, grammarAccess.getQueriesAccess().getDefineKeyword_0());
		}
		otherlv_1='queries'
		{
			newLeafNode(otherlv_1, grammarAccess.getQueriesAccess().getQueriesKeyword_1());
		}
		otherlv_2='of'
		{
			newLeafNode(otherlv_2, grammarAccess.getQueriesAccess().getOfKeyword_2());
		}
		otherlv_3='mission'
		{
			newLeafNode(otherlv_3, grammarAccess.getQueriesAccess().getMissionKeyword_3());
		}
		(
			(
				lv_mission_4_0=RULE_ID
				{
					newLeafNode(lv_mission_4_0, grammarAccess.getQueriesAccess().getMissionIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getQueriesRule());
					}
					setWithLastConsumed(
						$current,
						"mission",
						lv_mission_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5=':'
		{
			newLeafNode(otherlv_5, grammarAccess.getQueriesAccess().getColonKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getQueriesAccess().getQueriesQueryParserRuleCall_6_0());
				}
				lv_queries_6_0=ruleQuery
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQueriesRule());
					}
					add(
						$current,
						"queries",
						lv_queries_6_0,
						"it.polimi.hri_designtime.HriDsl.Query");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleQuery
entryRuleQuery returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQueryRule()); }
	iv_ruleQuery=ruleQuery
	{ $current=$iv_ruleQuery.current; }
	EOF;

// Rule Query
ruleQuery returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='compute'
		{
			newLeafNode(otherlv_0, grammarAccess.getQueryAccess().getComputeKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getQueryAccess().getQuery_typeQuery_typeEnumRuleCall_1_0());
				}
				lv_query_type_1_0=ruleQuery_type
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQueryRule());
					}
					set(
						$current,
						"query_type",
						lv_query_type_1_0,
						"it.polimi.hri_designtime.HriDsl.Query_type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='with'
		{
			newLeafNode(otherlv_2, grammarAccess.getQueryAccess().getWithKeyword_2());
		}
		otherlv_3='duration'
		{
			newLeafNode(otherlv_3, grammarAccess.getQueryAccess().getDurationKeyword_3());
		}
		(
			(
				lv_duration_4_0=RULE_INT
				{
					newLeafNode(lv_duration_4_0, grammarAccess.getQueryAccess().getDurationINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getQueryRule());
					}
					setWithLastConsumed(
						$current,
						"duration",
						lv_duration_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_5='runs'
		{
			newLeafNode(otherlv_5, grammarAccess.getQueryAccess().getRunsKeyword_5());
		}
		(
			(
				lv_runs_6_0=RULE_INT
				{
					newLeafNode(lv_runs_6_0, grammarAccess.getQueryAccess().getRunsINTTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getQueryRule());
					}
					setWithLastConsumed(
						$current,
						"runs",
						lv_runs_6_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleCoordinates
entryRuleCoordinates returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCoordinatesRule()); }
	iv_ruleCoordinates=ruleCoordinates
	{ $current=$iv_ruleCoordinates.current; }
	EOF;

// Rule Coordinates
ruleCoordinates returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getCoordinatesAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				lv_x_1_0=RULE_FLOAT
				{
					newLeafNode(lv_x_1_0, grammarAccess.getCoordinatesAccess().getXFLOATTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinatesRule());
					}
					setWithLastConsumed(
						$current,
						"x",
						lv_x_1_0,
						"it.polimi.hri_designtime.HriDsl.FLOAT");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getCoordinatesAccess().getSemicolonKeyword_2());
		}
		(
			(
				lv_y_3_0=RULE_FLOAT
				{
					newLeafNode(lv_y_3_0, grammarAccess.getCoordinatesAccess().getYFLOATTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinatesRule());
					}
					setWithLastConsumed(
						$current,
						"y",
						lv_y_3_0,
						"it.polimi.hri_designtime.HriDsl.FLOAT");
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getCoordinatesAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Rule Length_unit
ruleLength_unit returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='m'
			{
				$current = grammarAccess.getLength_unitAccess().getMETEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getLength_unitAccess().getMETEREnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='km'
			{
				$current = grammarAccess.getLength_unitAccess().getKILOMETEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getLength_unitAccess().getKILOMETEREnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='cm'
			{
				$current = grammarAccess.getLength_unitAccess().getCENTIMETEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getLength_unitAccess().getCENTIMETEREnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule Type
ruleType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='turtlebot3_burger'
			{
				$current = grammarAccess.getTypeAccess().getTURTLEBOT3_BURGEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getTURTLEBOT3_BURGEREnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='tiago'
			{
				$current = grammarAccess.getTypeAccess().getTIAGOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getTIAGOEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='pepper'
			{
				$current = grammarAccess.getTypeAccess().getPEPPEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getPEPPEREnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule Fatigue_profile
ruleFatigue_profile returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='young_healthy'
			{
				$current = grammarAccess.getFatigue_profileAccess().getYOUNG_HEALTHYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getFatigue_profileAccess().getYOUNG_HEALTHYEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='young_sick'
			{
				$current = grammarAccess.getFatigue_profileAccess().getYOUNG_SICKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getFatigue_profileAccess().getYOUNG_SICKEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='elderly_healthy'
			{
				$current = grammarAccess.getFatigue_profileAccess().getELDERLY_HEALTHYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getFatigue_profileAccess().getELDERLY_HEALTHYEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='elderly_sick'
			{
				$current = grammarAccess.getFatigue_profileAccess().getELDERLY_SICKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getFatigue_profileAccess().getELDERLY_SICKEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='covid_patient'
			{
				$current = grammarAccess.getFatigue_profileAccess().getCOVID_PATIENTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getFatigue_profileAccess().getCOVID_PATIENTEnumLiteralDeclaration_4());
			}
		)
	)
;

// Rule Free_will_profile
ruleFree_will_profile returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='normal'
			{
				$current = grammarAccess.getFree_will_profileAccess().getNORMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getFree_will_profileAccess().getNORMALEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='high'
			{
				$current = grammarAccess.getFree_will_profileAccess().getHIGHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getFree_will_profileAccess().getHIGHEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='low'
			{
				$current = grammarAccess.getFree_will_profileAccess().getLOWEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getFree_will_profileAccess().getLOWEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='disabled'
			{
				$current = grammarAccess.getFree_will_profileAccess().getDISABLEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getFree_will_profileAccess().getDISABLEDEnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule Pattern
rulePattern returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='robot_leader'
			{
				$current = grammarAccess.getPatternAccess().getROBOT_LEADEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getPatternAccess().getROBOT_LEADEREnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='robot_follower'
			{
				$current = grammarAccess.getPatternAccess().getROBOT_FOLLOWEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getPatternAccess().getROBOT_FOLLOWEREnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='robot_transporter'
			{
				$current = grammarAccess.getPatternAccess().getROBOT_TRANSPORTEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getPatternAccess().getROBOT_TRANSPORTEREnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='robot_competitor'
			{
				$current = grammarAccess.getPatternAccess().getROBOT_COMPETITOREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getPatternAccess().getROBOT_COMPETITOREnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='robot_rescuer'
			{
				$current = grammarAccess.getPatternAccess().getROBOT_RESCUEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getPatternAccess().getROBOT_RESCUEREnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='robot_client'
			{
				$current = grammarAccess.getPatternAccess().getROBOT_ASSISTANTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getPatternAccess().getROBOT_ASSISTANTEnumLiteralDeclaration_5());
			}
		)
	)
;

// Rule Query_type
ruleQuery_type returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='simulation'
			{
				$current = grammarAccess.getQuery_typeAccess().getSIMULATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getQuery_typeAccess().getSIMULATIONEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='probability_of_success'
			{
				$current = grammarAccess.getQuery_typeAccess().getPROBABILITY_OF_SUCCESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getQuery_typeAccess().getPROBABILITY_OF_SUCCESSEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='expected_fatigue'
			{
				$current = grammarAccess.getQuery_typeAccess().getEXPECTED_FATIGUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getQuery_typeAccess().getEXPECTED_FATIGUEEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='expected_charge'
			{
				$current = grammarAccess.getQuery_typeAccess().getEXPECTED_CHARGEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getQuery_typeAccess().getEXPECTED_CHARGEEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='probability_of_failure'
			{
				$current = grammarAccess.getQuery_typeAccess().getPROBABILITY_OF_FAILUREEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getQuery_typeAccess().getPROBABILITY_OF_FAILUREEnumLiteralDeclaration_4());
			}
		)
	)
;

RULE_FLOAT : RULE_INT RULE_DEC;

fragment RULE_DEC : '.' RULE_INT;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;