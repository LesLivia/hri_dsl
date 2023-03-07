/*
 * generated by Xtext 2.29.0
 */
package it.polimi.hri_designtime.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import it.polimi.hri_designtime.ide.contentassist.antlr.internal.InternalHriDslParser;
import it.polimi.hri_designtime.services.HriDslGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class HriDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(HriDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, HriDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getFree_will_modelAccess().getAlternatives(), "rule__Free_will_model__Alternatives");
			builder.put(grammarAccess.getLength_unitAccess().getAlternatives(), "rule__Length_unit__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getFatigue_profileAccess().getAlternatives(), "rule__Fatigue_profile__Alternatives");
			builder.put(grammarAccess.getFree_will_profileAccess().getAlternatives(), "rule__Free_will_profile__Alternatives");
			builder.put(grammarAccess.getPatternAccess().getAlternatives(), "rule__Pattern__Alternatives");
			builder.put(grammarAccess.getQuery_typeAccess().getAlternatives(), "rule__Query_type__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_0(), "rule__Parameter__Group_0__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_1(), "rule__Parameter__Group_1__0");
			builder.put(grammarAccess.getScenarioAccess().getGroup(), "rule__Scenario__Group__0");
			builder.put(grammarAccess.getFloorAccess().getGroup(), "rule__Floor__Group__0");
			builder.put(grammarAccess.getSurfaceAccess().getGroup(), "rule__Surface__Group__0");
			builder.put(grammarAccess.getVerticesAccess().getGroup(), "rule__Vertices__Group__0");
			builder.put(grammarAccess.getPointAccess().getGroup(), "rule__Point__Group__0");
			builder.put(grammarAccess.getRobotsAccess().getGroup(), "rule__Robots__Group__0");
			builder.put(grammarAccess.getRobotAccess().getGroup(), "rule__Robot__Group__0");
			builder.put(grammarAccess.getHumansAccess().getGroup(), "rule__Humans__Group__0");
			builder.put(grammarAccess.getHumanAccess().getGroup(), "rule__Human__Group__0");
			builder.put(grammarAccess.getMissionAccess().getGroup(), "rule__Mission__Group__0");
			builder.put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
			builder.put(grammarAccess.getQueriesAccess().getGroup(), "rule__Queries__Group__0");
			builder.put(grammarAccess.getQueryAccess().getGroup(), "rule__Query__Group__0");
			builder.put(grammarAccess.getCoordinatesAccess().getGroup(), "rule__Coordinates__Group__0");
			builder.put(grammarAccess.getModelAccess().getParameterAssignment_0(), "rule__Model__ParameterAssignment_0");
			builder.put(grammarAccess.getModelAccess().getScenariosAssignment_1(), "rule__Model__ScenariosAssignment_1");
			builder.put(grammarAccess.getParameterAccess().getLength_unitAssignment_0_2(), "rule__Parameter__Length_unitAssignment_0_2");
			builder.put(grammarAccess.getParameterAccess().getFree_will_modelAssignment_1_2(), "rule__Parameter__Free_will_modelAssignment_1_2");
			builder.put(grammarAccess.getScenarioAccess().getFloorAssignment_0(), "rule__Scenario__FloorAssignment_0");
			builder.put(grammarAccess.getScenarioAccess().getRobotsAssignment_1(), "rule__Scenario__RobotsAssignment_1");
			builder.put(grammarAccess.getScenarioAccess().getHumansAssignment_2(), "rule__Scenario__HumansAssignment_2");
			builder.put(grammarAccess.getScenarioAccess().getMissionsAssignment_3(), "rule__Scenario__MissionsAssignment_3");
			builder.put(grammarAccess.getFloorAccess().getFloor_nameAssignment_2(), "rule__Floor__Floor_nameAssignment_2");
			builder.put(grammarAccess.getFloorAccess().getSurfacesAssignment_4(), "rule__Floor__SurfacesAssignment_4");
			builder.put(grammarAccess.getFloorAccess().getPointsAssignment_5(), "rule__Floor__PointsAssignment_5");
			builder.put(grammarAccess.getSurfaceAccess().getNameAssignment_1(), "rule__Surface__NameAssignment_1");
			builder.put(grammarAccess.getSurfaceAccess().getVerticesAssignment_3(), "rule__Surface__VerticesAssignment_3");
			builder.put(grammarAccess.getVerticesAccess().getVertex_AAssignment_0(), "rule__Vertices__Vertex_AAssignment_0");
			builder.put(grammarAccess.getVerticesAccess().getVertex_CAssignment_1(), "rule__Vertices__Vertex_CAssignment_1");
			builder.put(grammarAccess.getPointAccess().getNameAssignment_1(), "rule__Point__NameAssignment_1");
			builder.put(grammarAccess.getPointAccess().getCoordinatesAssignment_3(), "rule__Point__CoordinatesAssignment_3");
			builder.put(grammarAccess.getRobotsAccess().getRobotsAssignment_3(), "rule__Robots__RobotsAssignment_3");
			builder.put(grammarAccess.getRobotAccess().getNameAssignment_1(), "rule__Robot__NameAssignment_1");
			builder.put(grammarAccess.getRobotAccess().getCoordinatesAssignment_3(), "rule__Robot__CoordinatesAssignment_3");
			builder.put(grammarAccess.getRobotAccess().getTypeAssignment_5(), "rule__Robot__TypeAssignment_5");
			builder.put(grammarAccess.getRobotAccess().getCharge_percentageAssignment_7(), "rule__Robot__Charge_percentageAssignment_7");
			builder.put(grammarAccess.getHumansAccess().getHumansAssignment_3(), "rule__Humans__HumansAssignment_3");
			builder.put(grammarAccess.getHumanAccess().getNameAssignment_1(), "rule__Human__NameAssignment_1");
			builder.put(grammarAccess.getHumanAccess().getCoordinatesAssignment_3(), "rule__Human__CoordinatesAssignment_3");
			builder.put(grammarAccess.getHumanAccess().getSpeedAssignment_5(), "rule__Human__SpeedAssignment_5");
			builder.put(grammarAccess.getHumanAccess().getDextAssignment_7(), "rule__Human__DextAssignment_7");
			builder.put(grammarAccess.getHumanAccess().getFatigue_profileAssignment_9(), "rule__Human__Fatigue_profileAssignment_9");
			builder.put(grammarAccess.getHumanAccess().getFree_will_profileAssignment_11(), "rule__Human__Free_will_profileAssignment_11");
			builder.put(grammarAccess.getMissionAccess().getNameAssignment_2(), "rule__Mission__NameAssignment_2");
			builder.put(grammarAccess.getMissionAccess().getAssignmentsAssignment_4(), "rule__Mission__AssignmentsAssignment_4");
			builder.put(grammarAccess.getMissionAccess().getQueriesAssignment_5(), "rule__Mission__QueriesAssignment_5");
			builder.put(grammarAccess.getAssignmentAccess().getPatternAssignment_1(), "rule__Assignment__PatternAssignment_1");
			builder.put(grammarAccess.getAssignmentAccess().getClientAssignment_3(), "rule__Assignment__ClientAssignment_3");
			builder.put(grammarAccess.getAssignmentAccess().getTargetAssignment_6(), "rule__Assignment__TargetAssignment_6");
			builder.put(grammarAccess.getQueriesAccess().getMissionAssignment_4(), "rule__Queries__MissionAssignment_4");
			builder.put(grammarAccess.getQueriesAccess().getQueriesAssignment_6(), "rule__Queries__QueriesAssignment_6");
			builder.put(grammarAccess.getQueryAccess().getQuery_typeAssignment_1(), "rule__Query__Query_typeAssignment_1");
			builder.put(grammarAccess.getQueryAccess().getDurationAssignment_4(), "rule__Query__DurationAssignment_4");
			builder.put(grammarAccess.getQueryAccess().getRunsAssignment_6(), "rule__Query__RunsAssignment_6");
			builder.put(grammarAccess.getCoordinatesAccess().getXAssignment_1(), "rule__Coordinates__XAssignment_1");
			builder.put(grammarAccess.getCoordinatesAccess().getYAssignment_3(), "rule__Coordinates__YAssignment_3");
			builder.put(grammarAccess.getParameterAccess().getUnorderedGroup(), "rule__Parameter__UnorderedGroup");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private HriDslGrammarAccess grammarAccess;

	@Override
	protected InternalHriDslParser createParser() {
		InternalHriDslParser result = new InternalHriDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public HriDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(HriDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
