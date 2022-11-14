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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHriDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_DEC", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'parameter'", "'length_unit'", "'build'", "'floor'", "':'", "'add'", "'rectangular_surface'", "'with'", "'coordinates_vertex_A'", "'coordinates_vertex_C'", "'point_of_interest'", "'coordinates'", "'define'", "'robots'", "'robot'", "'type'", "'charge_percentage'", "'humans'", "'human'", "'speed'", "'dexterity'", "'fatigue_profile'", "'free_will_profile'", "'mission'", "'do'", "'for'", "'target'", "'queries'", "'of'", "'compute'", "'duration'", "'runs'", "'('", "';'", "')'", "'m'", "'km'", "'cm'", "'turtlebot3_burger'", "'tiago'", "'pepper'", "'young_healthy'", "'young_sick'", "'elderly_healthy'", "'elderly_sick'", "'covid_patient'", "'normal'", "'high'", "'low'", "'disabled'", "'robot_leader'", "'robot_follower'", "'robot_transporter'", "'robot_competitor'", "'robot_rescuer'", "'robot_client'", "'simulation'", "'probability_of_success'", "'expected_fatigue'", "'expected_charge'", "'probability_of_failure'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_DEC=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=6;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalHriDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHriDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHriDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHriDsl.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalHriDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalHriDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalHriDsl.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalHriDsl.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_parameter_0_0= ruleParameter ) )? ( (lv_scenarios_1_0= ruleScenario ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_parameter_0_0 = null;

        EObject lv_scenarios_1_0 = null;



        	enterRule();

        try {
            // InternalHriDsl.g:78:2: ( ( ( (lv_parameter_0_0= ruleParameter ) )? ( (lv_scenarios_1_0= ruleScenario ) )* ) )
            // InternalHriDsl.g:79:2: ( ( (lv_parameter_0_0= ruleParameter ) )? ( (lv_scenarios_1_0= ruleScenario ) )* )
            {
            // InternalHriDsl.g:79:2: ( ( (lv_parameter_0_0= ruleParameter ) )? ( (lv_scenarios_1_0= ruleScenario ) )* )
            // InternalHriDsl.g:80:3: ( (lv_parameter_0_0= ruleParameter ) )? ( (lv_scenarios_1_0= ruleScenario ) )*
            {
            // InternalHriDsl.g:80:3: ( (lv_parameter_0_0= ruleParameter ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalHriDsl.g:81:4: (lv_parameter_0_0= ruleParameter )
                    {
                    // InternalHriDsl.g:81:4: (lv_parameter_0_0= ruleParameter )
                    // InternalHriDsl.g:82:5: lv_parameter_0_0= ruleParameter
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getParameterParameterParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_parameter_0_0=ruleParameter();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"parameter",
                    						lv_parameter_0_0,
                    						"it.polimi.hri_designtime.HriDsl.Parameter");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalHriDsl.g:99:3: ( (lv_scenarios_1_0= ruleScenario ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalHriDsl.g:100:4: (lv_scenarios_1_0= ruleScenario )
            	    {
            	    // InternalHriDsl.g:100:4: (lv_scenarios_1_0= ruleScenario )
            	    // InternalHriDsl.g:101:5: lv_scenarios_1_0= ruleScenario
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getScenariosScenarioParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_scenarios_1_0=ruleScenario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"scenarios",
            	    						lv_scenarios_1_0,
            	    						"it.polimi.hri_designtime.HriDsl.Scenario");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleParameter"
    // InternalHriDsl.g:122:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalHriDsl.g:122:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalHriDsl.g:123:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalHriDsl.g:129:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'parameter' otherlv_1= 'length_unit' ( (lv_length_unit_2_0= ruleLength_unit ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_length_unit_2_0 = null;



        	enterRule();

        try {
            // InternalHriDsl.g:135:2: ( (otherlv_0= 'parameter' otherlv_1= 'length_unit' ( (lv_length_unit_2_0= ruleLength_unit ) ) ) )
            // InternalHriDsl.g:136:2: (otherlv_0= 'parameter' otherlv_1= 'length_unit' ( (lv_length_unit_2_0= ruleLength_unit ) ) )
            {
            // InternalHriDsl.g:136:2: (otherlv_0= 'parameter' otherlv_1= 'length_unit' ( (lv_length_unit_2_0= ruleLength_unit ) ) )
            // InternalHriDsl.g:137:3: otherlv_0= 'parameter' otherlv_1= 'length_unit' ( (lv_length_unit_2_0= ruleLength_unit ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getLength_unitKeyword_1());
            		
            // InternalHriDsl.g:145:3: ( (lv_length_unit_2_0= ruleLength_unit ) )
            // InternalHriDsl.g:146:4: (lv_length_unit_2_0= ruleLength_unit )
            {
            // InternalHriDsl.g:146:4: (lv_length_unit_2_0= ruleLength_unit )
            // InternalHriDsl.g:147:5: lv_length_unit_2_0= ruleLength_unit
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getLength_unitLength_unitEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_length_unit_2_0=ruleLength_unit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"length_unit",
            						lv_length_unit_2_0,
            						"it.polimi.hri_designtime.HriDsl.Length_unit");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleScenario"
    // InternalHriDsl.g:168:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalHriDsl.g:168:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalHriDsl.g:169:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalHriDsl.g:175:1: ruleScenario returns [EObject current=null] : ( ( (lv_floor_0_0= ruleFloor ) ) ( (lv_robots_1_0= ruleRobots ) ) ( (lv_humans_2_0= ruleHumans ) ) ( (lv_missions_3_0= ruleMission ) )+ ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        EObject lv_floor_0_0 = null;

        EObject lv_robots_1_0 = null;

        EObject lv_humans_2_0 = null;

        EObject lv_missions_3_0 = null;



        	enterRule();

        try {
            // InternalHriDsl.g:181:2: ( ( ( (lv_floor_0_0= ruleFloor ) ) ( (lv_robots_1_0= ruleRobots ) ) ( (lv_humans_2_0= ruleHumans ) ) ( (lv_missions_3_0= ruleMission ) )+ ) )
            // InternalHriDsl.g:182:2: ( ( (lv_floor_0_0= ruleFloor ) ) ( (lv_robots_1_0= ruleRobots ) ) ( (lv_humans_2_0= ruleHumans ) ) ( (lv_missions_3_0= ruleMission ) )+ )
            {
            // InternalHriDsl.g:182:2: ( ( (lv_floor_0_0= ruleFloor ) ) ( (lv_robots_1_0= ruleRobots ) ) ( (lv_humans_2_0= ruleHumans ) ) ( (lv_missions_3_0= ruleMission ) )+ )
            // InternalHriDsl.g:183:3: ( (lv_floor_0_0= ruleFloor ) ) ( (lv_robots_1_0= ruleRobots ) ) ( (lv_humans_2_0= ruleHumans ) ) ( (lv_missions_3_0= ruleMission ) )+
            {
            // InternalHriDsl.g:183:3: ( (lv_floor_0_0= ruleFloor ) )
            // InternalHriDsl.g:184:4: (lv_floor_0_0= ruleFloor )
            {
            // InternalHriDsl.g:184:4: (lv_floor_0_0= ruleFloor )
            // InternalHriDsl.g:185:5: lv_floor_0_0= ruleFloor
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getFloorFloorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_floor_0_0=ruleFloor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"floor",
            						lv_floor_0_0,
            						"it.polimi.hri_designtime.HriDsl.Floor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHriDsl.g:202:3: ( (lv_robots_1_0= ruleRobots ) )
            // InternalHriDsl.g:203:4: (lv_robots_1_0= ruleRobots )
            {
            // InternalHriDsl.g:203:4: (lv_robots_1_0= ruleRobots )
            // InternalHriDsl.g:204:5: lv_robots_1_0= ruleRobots
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getRobotsRobotsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_robots_1_0=ruleRobots();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"robots",
            						lv_robots_1_0,
            						"it.polimi.hri_designtime.HriDsl.Robots");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHriDsl.g:221:3: ( (lv_humans_2_0= ruleHumans ) )
            // InternalHriDsl.g:222:4: (lv_humans_2_0= ruleHumans )
            {
            // InternalHriDsl.g:222:4: (lv_humans_2_0= ruleHumans )
            // InternalHriDsl.g:223:5: lv_humans_2_0= ruleHumans
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getHumansHumansParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_humans_2_0=ruleHumans();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"humans",
            						lv_humans_2_0,
            						"it.polimi.hri_designtime.HriDsl.Humans");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHriDsl.g:240:3: ( (lv_missions_3_0= ruleMission ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalHriDsl.g:241:4: (lv_missions_3_0= ruleMission )
            	    {
            	    // InternalHriDsl.g:241:4: (lv_missions_3_0= ruleMission )
            	    // InternalHriDsl.g:242:5: lv_missions_3_0= ruleMission
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getMissionsMissionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_missions_3_0=ruleMission();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"missions",
            	    						lv_missions_3_0,
            	    						"it.polimi.hri_designtime.HriDsl.Mission");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleFloor"
    // InternalHriDsl.g:263:1: entryRuleFloor returns [EObject current=null] : iv_ruleFloor= ruleFloor EOF ;
    public final EObject entryRuleFloor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloor = null;


        try {
            // InternalHriDsl.g:263:46: (iv_ruleFloor= ruleFloor EOF )
            // InternalHriDsl.g:264:2: iv_ruleFloor= ruleFloor EOF
            {
             newCompositeNode(grammarAccess.getFloorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloor=ruleFloor();

            state._fsp--;

             current =iv_ruleFloor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloor"


    // $ANTLR start "ruleFloor"
    // InternalHriDsl.g:270:1: ruleFloor returns [EObject current=null] : (otherlv_0= 'build' otherlv_1= 'floor' ( (lv_floor_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_surfaces_4_0= ruleSurface ) )+ ( (lv_points_5_0= rulePoint ) )+ ) ;
    public final EObject ruleFloor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_floor_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_surfaces_4_0 = null;

        EObject lv_points_5_0 = null;



        	enterRule();

        try {
            // InternalHriDsl.g:276:2: ( (otherlv_0= 'build' otherlv_1= 'floor' ( (lv_floor_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_surfaces_4_0= ruleSurface ) )+ ( (lv_points_5_0= rulePoint ) )+ ) )
            // InternalHriDsl.g:277:2: (otherlv_0= 'build' otherlv_1= 'floor' ( (lv_floor_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_surfaces_4_0= ruleSurface ) )+ ( (lv_points_5_0= rulePoint ) )+ )
            {
            // InternalHriDsl.g:277:2: (otherlv_0= 'build' otherlv_1= 'floor' ( (lv_floor_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_surfaces_4_0= ruleSurface ) )+ ( (lv_points_5_0= rulePoint ) )+ )
            // InternalHriDsl.g:278:3: otherlv_0= 'build' otherlv_1= 'floor' ( (lv_floor_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_surfaces_4_0= ruleSurface ) )+ ( (lv_points_5_0= rulePoint ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFloorAccess().getBuildKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFloorAccess().getFloorKeyword_1());
            		
            // InternalHriDsl.g:286:3: ( (lv_floor_name_2_0= RULE_ID ) )
            // InternalHriDsl.g:287:4: (lv_floor_name_2_0= RULE_ID )
            {
            // InternalHriDsl.g:287:4: (lv_floor_name_2_0= RULE_ID )
            // InternalHriDsl.g:288:5: lv_floor_name_2_0= RULE_ID
            {
            lv_floor_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_floor_name_2_0, grammarAccess.getFloorAccess().getFloor_nameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFloorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"floor_name",
            						lv_floor_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getFloorAccess().getColonKeyword_3());
            		
            // InternalHriDsl.g:308:3: ( (lv_surfaces_4_0= ruleSurface ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==19) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalHriDsl.g:309:4: (lv_surfaces_4_0= ruleSurface )
            	    {
            	    // InternalHriDsl.g:309:4: (lv_surfaces_4_0= ruleSurface )
            	    // InternalHriDsl.g:310:5: lv_surfaces_4_0= ruleSurface
            	    {

            	    					newCompositeNode(grammarAccess.getFloorAccess().getSurfacesSurfaceParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_surfaces_4_0=ruleSurface();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFloorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"surfaces",
            	    						lv_surfaces_4_0,
            	    						"it.polimi.hri_designtime.HriDsl.Surface");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // InternalHriDsl.g:327:3: ( (lv_points_5_0= rulePoint ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalHriDsl.g:328:4: (lv_points_5_0= rulePoint )
            	    {
            	    // InternalHriDsl.g:328:4: (lv_points_5_0= rulePoint )
            	    // InternalHriDsl.g:329:5: lv_points_5_0= rulePoint
            	    {

            	    					newCompositeNode(grammarAccess.getFloorAccess().getPointsPointParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_points_5_0=rulePoint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFloorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"points",
            	    						lv_points_5_0,
            	    						"it.polimi.hri_designtime.HriDsl.Point");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloor"


    // $ANTLR start "entryRuleSurface"
    // InternalHriDsl.g:350:1: entryRuleSurface returns [EObject current=null] : iv_ruleSurface= ruleSurface EOF ;
    public final EObject entryRuleSurface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurface = null;


        try {
            // InternalHriDsl.g:350:48: (iv_ruleSurface= ruleSurface EOF )
            // InternalHriDsl.g:351:2: iv_ruleSurface= ruleSurface EOF
            {
             newCompositeNode(grammarAccess.getSurfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSurface=ruleSurface();

            state._fsp--;

             current =iv_ruleSurface; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSurface"


    // $ANTLR start "ruleSurface"
    // InternalHriDsl.g:357:1: ruleSurface returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'rectangular_surface' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'with' ( (lv_vertices_4_0= ruleVertices ) ) ) ;
    public final EObject ruleSurface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_vertices_4_0 = null;



        	enterRule();

        try {
            // InternalHriDsl.g:363:2: ( (otherlv_0= 'add' otherlv_1= 'rectangular_surface' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'with' ( (lv_vertices_4_0= ruleVertices ) ) ) )
            // InternalHriDsl.g:364:2: (otherlv_0= 'add' otherlv_1= 'rectangular_surface' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'with' ( (lv_vertices_4_0= ruleVertices ) ) )
            {
            // InternalHriDsl.g:364:2: (otherlv_0= 'add' otherlv_1= 'rectangular_surface' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'with' ( (lv_vertices_4_0= ruleVertices ) ) )
            // InternalHriDsl.g:365:3: otherlv_0= 'add' otherlv_1= 'rectangular_surface' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'with' ( (lv_vertices_4_0= ruleVertices ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSurfaceAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getSurfaceAccess().getRectangular_surfaceKeyword_1());
            		
            // InternalHriDsl.g:373:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalHriDsl.g:374:4: (lv_name_2_0= RULE_ID )
            {
            // InternalHriDsl.g:374:4: (lv_name_2_0= RULE_ID )
            // InternalHriDsl.g:375:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSurfaceAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSurfaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getSurfaceAccess().getWithKeyword_3());
            		
            // InternalHriDsl.g:395:3: ( (lv_vertices_4_0= ruleVertices ) )
            // InternalHriDsl.g:396:4: (lv_vertices_4_0= ruleVertices )
            {
            // InternalHriDsl.g:396:4: (lv_vertices_4_0= ruleVertices )
            // InternalHriDsl.g:397:5: lv_vertices_4_0= ruleVertices
            {

            					newCompositeNode(grammarAccess.getSurfaceAccess().getVerticesVerticesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_vertices_4_0=ruleVertices();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSurfaceRule());
            					}
            					set(
            						current,
            						"vertices",
            						lv_vertices_4_0,
            						"it.polimi.hri_designtime.HriDsl.Vertices");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSurface"


    // $ANTLR start "entryRuleVertices"
    // InternalHriDsl.g:418:1: entryRuleVertices returns [EObject current=null] : iv_ruleVertices= ruleVertices EOF ;
    public final EObject entryRuleVertices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVertices = null;


        try {
            // InternalHriDsl.g:418:49: (iv_ruleVertices= ruleVertices EOF )
            // InternalHriDsl.g:419:2: iv_ruleVertices= ruleVertices EOF
            {
             newCompositeNode(grammarAccess.getVerticesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVertices=ruleVertices();

            state._fsp--;

             current =iv_ruleVertices; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVertices"


    // $ANTLR start "ruleVertices"
    // InternalHriDsl.g:425:1: ruleVertices returns [EObject current=null] : (otherlv_0= 'coordinates_vertex_A' ( (lv_vertex_A_1_0= ruleCoordinates ) ) otherlv_2= 'coordinates_vertex_C' ( (lv_vertex_C_3_0= ruleCoordinates ) ) ) ;
    public final EObject ruleVertices() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_vertex_A_1_0 = null;

        EObject lv_vertex_C_3_0 = null;



        	enterRule();

        try {
            // InternalHriDsl.g:431:2: ( (otherlv_0= 'coordinates_vertex_A' ( (lv_vertex_A_1_0= ruleCoordinates ) ) otherlv_2= 'coordinates_vertex_C' ( (lv_vertex_C_3_0= ruleCoordinates ) ) ) )
            // InternalHriDsl.g:432:2: (otherlv_0= 'coordinates_vertex_A' ( (lv_vertex_A_1_0= ruleCoordinates ) ) otherlv_2= 'coordinates_vertex_C' ( (lv_vertex_C_3_0= ruleCoordinates ) ) )
            {
            // InternalHriDsl.g:432:2: (otherlv_0= 'coordinates_vertex_A' ( (lv_vertex_A_1_0= ruleCoordinates ) ) otherlv_2= 'coordinates_vertex_C' ( (lv_vertex_C_3_0= ruleCoordinates ) ) )
            // InternalHriDsl.g:433:3: otherlv_0= 'coordinates_vertex_A' ( (lv_vertex_A_1_0= ruleCoordinates ) ) otherlv_2= 'coordinates_vertex_C' ( (lv_vertex_C_3_0= ruleCoordinates ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getVerticesAccess().getCoordinates_vertex_AKeyword_0());
            		
            // InternalHriDsl.g:437:3: ( (lv_vertex_A_1_0= ruleCoordinates ) )
            // InternalHriDsl.g:438:4: (lv_vertex_A_1_0= ruleCoordinates )
            {
            // InternalHriDsl.g:438:4: (lv_vertex_A_1_0= ruleCoordinates )
            // InternalHriDsl.g:439:5: lv_vertex_A_1_0= ruleCoordinates
            {

            					newCompositeNode(grammarAccess.getVerticesAccess().getVertex_ACoordinatesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_vertex_A_1_0=ruleCoordinates();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerticesRule());
            					}
            					set(
            						current,
            						"vertex_A",
            						lv_vertex_A_1_0,
            						"it.polimi.hri_designtime.HriDsl.Coordinates");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getVerticesAccess().getCoordinates_vertex_CKeyword_2());
            		
            // InternalHriDsl.g:460:3: ( (lv_vertex_C_3_0= ruleCoordinates ) )
            // InternalHriDsl.g:461:4: (lv_vertex_C_3_0= ruleCoordinates )
            {
            // InternalHriDsl.g:461:4: (lv_vertex_C_3_0= ruleCoordinates )
            // InternalHriDsl.g:462:5: lv_vertex_C_3_0= ruleCoordinates
            {

            					newCompositeNode(grammarAccess.getVerticesAccess().getVertex_CCoordinatesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_vertex_C_3_0=ruleCoordinates();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerticesRule());
            					}
            					set(
            						current,
            						"vertex_C",
            						lv_vertex_C_3_0,
            						"it.polimi.hri_designtime.HriDsl.Coordinates");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVertices"


    // $ANTLR start "entryRulePoint"
    // InternalHriDsl.g:483:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalHriDsl.g:483:46: (iv_rulePoint= rulePoint EOF )
            // InternalHriDsl.g:484:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalHriDsl.g:490:1: rulePoint returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'point_of_interest' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'with' otherlv_4= 'coordinates' ( (lv_coordinates_5_0= ruleCoordinates ) ) ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_coordinates_5_0 = null;



        	enterRule();

        try {
            // InternalHriDsl.g:496:2: ( (otherlv_0= 'add' otherlv_1= 'point_of_interest' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'with' otherlv_4= 'coordinates' ( (lv_coordinates_5_0= ruleCoordinates ) ) ) )
            // InternalHriDsl.g:497:2: (otherlv_0= 'add' otherlv_1= 'point_of_interest' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'with' otherlv_4= 'coordinates' ( (lv_coordinates_5_0= ruleCoordinates ) ) )
            {
            // InternalHriDsl.g:497:2: (otherlv_0= 'add' otherlv_1= 'point_of_interest' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'with' otherlv_4= 'coordinates' ( (lv_coordinates_5_0= ruleCoordinates ) ) )
            // InternalHriDsl.g:498:3: otherlv_0= 'add' otherlv_1= 'point_of_interest' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'with' otherlv_4= 'coordinates' ( (lv_coordinates_5_0= ruleCoordinates ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getPointAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getPointAccess().getPoint_of_interestKeyword_1());
            		
            // InternalHriDsl.g:506:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalHriDsl.g:507:4: (lv_name_2_0= RULE_ID )
            {
            // InternalHriDsl.g:507:4: (lv_name_2_0= RULE_ID )
            // InternalHriDsl.g:508:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPointAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getPointAccess().getWithKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getPointAccess().getCoordinatesKeyword_4());
            		
            // InternalHriDsl.g:532:3: ( (lv_coordinates_5_0= ruleCoordinates ) )
            // InternalHriDsl.g:533:4: (lv_coordinates_5_0= ruleCoordinates )
            {
            // InternalHriDsl.g:533:4: (lv_coordinates_5_0= ruleCoordinates )
            // InternalHriDsl.g:534:5: lv_coordinates_5_0= ruleCoordinates
            {

            					newCompositeNode(grammarAccess.getPointAccess().getCoordinatesCoordinatesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_coordinates_5_0=ruleCoordinates();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPointRule());
            					}
            					set(
            						current,
            						"coordinates",
            						lv_coordinates_5_0,
            						"it.polimi.hri_designtime.HriDsl.Coordinates");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleRobots"
    // InternalHriDsl.g:555:1: entryRuleRobots returns [EObject current=null] : iv_ruleRobots= ruleRobots EOF ;
    public final EObject entryRuleRobots() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobots = null;


        try {
            // InternalHriDsl.g:555:47: (iv_ruleRobots= ruleRobots EOF )
            // InternalHriDsl.g:556:2: iv_ruleRobots= ruleRobots EOF
            {
             newCompositeNode(grammarAccess.getRobotsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobots=ruleRobots();

            state._fsp--;

             current =iv_ruleRobots; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRobots"


    // $ANTLR start "ruleRobots"
    // InternalHriDsl.g:562:1: ruleRobots returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'robots' otherlv_2= ':' ( (lv_robots_3_0= ruleRobot ) )+ ) ;
    public final EObject ruleRobots() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_robots_3_0 = null;



        	enterRule();

        try {
            // InternalHriDsl.g:568:2: ( (otherlv_0= 'define' otherlv_1= 'robots' otherlv_2= ':' ( (lv_robots_3_0= ruleRobot ) )+ ) )
            // InternalHriDsl.g:569:2: (otherlv_0= 'define' otherlv_1= 'robots' otherlv_2= ':' ( (lv_robots_3_0= ruleRobot ) )+ )
            {
            // InternalHriDsl.g:569:2: (otherlv_0= 'define' otherlv_1= 'robots' otherlv_2= ':' ( (lv_robots_3_0= ruleRobot ) )+ )
            // InternalHriDsl.g:570:3: otherlv_0= 'define' otherlv_1= 'robots' otherlv_2= ':' ( (lv_robots_3_0= ruleRobot ) )+
            {
            otherlv_0=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotsAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotsAccess().getRobotsKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getRobotsAccess().getColonKeyword_2());
            		
            // InternalHriDsl.g:582:3: ( (lv_robots_3_0= ruleRobot ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalHriDsl.g:583:4: (lv_robots_3_0= ruleRobot )
            	    {
            	    // InternalHriDsl.g:583:4: (lv_robots_3_0= ruleRobot )
            	    // InternalHriDsl.g:584:5: lv_robots_3_0= ruleRobot
            	    {

            	    					newCompositeNode(grammarAccess.getRobotsAccess().getRobotsRobotParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_robots_3_0=ruleRobot();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRobotsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"robots",
            	    						lv_robots_3_0,
            	    						"it.polimi.hri_designtime.HriDsl.Robot");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRobots"


    // $ANTLR start "entryRuleRobot"
    // InternalHriDsl.g:605:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalHriDsl.g:605:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalHriDsl.g:606:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalHriDsl.g:612:1: ruleRobot returns [EObject current=null] : (otherlv_0= 'robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'coordinates' ( (lv_coordinates_4_0= ruleCoordinates ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleType ) ) otherlv_7= 'charge_percentage' ( (lv_charge_percentage_8_0= RULE_INT ) ) ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_charge_percentage_8_0=null;
        EObject lv_coordinates_4_0 = null;

        Enumerator lv_type_6_0 = null;



        	enterRule();

        try {
            // InternalHriDsl.g:618:2: ( (otherlv_0= 'robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'coordinates' ( (lv_coordinates_4_0= ruleCoordinates ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleType ) ) otherlv_7= 'charge_percentage' ( (lv_charge_percentage_8_0= RULE_INT ) ) ) )
            // InternalHriDsl.g:619:2: (otherlv_0= 'robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'coordinates' ( (lv_coordinates_4_0= ruleCoordinates ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleType ) ) otherlv_7= 'charge_percentage' ( (lv_charge_percentage_8_0= RULE_INT ) ) )
            {
            // InternalHriDsl.g:619:2: (otherlv_0= 'robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'coordinates' ( (lv_coordinates_4_0= ruleCoordinates ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleType ) ) otherlv_7= 'charge_percentage' ( (lv_charge_percentage_8_0= RULE_INT ) ) )
            // InternalHriDsl.g:620:3: otherlv_0= 'robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'coordinates' ( (lv_coordinates_4_0= ruleCoordinates ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleType ) ) otherlv_7= 'charge_percentage' ( (lv_charge_percentage_8_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotAccess().getRobotKeyword_0());
            		
            // InternalHriDsl.g:624:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalHriDsl.g:625:4: (lv_name_1_0= RULE_ID )
            {
            // InternalHriDsl.g:625:4: (lv_name_1_0= RULE_ID )
            // InternalHriDsl.g:626:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getRobotAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getRobotAccess().getCoordinatesKeyword_3());
            		
            // InternalHriDsl.g:650:3: ( (lv_coordinates_4_0= ruleCoordinates ) )
            // InternalHriDsl.g:651:4: (lv_coordinates_4_0= ruleCoordinates )
            {
            // InternalHriDsl.g:651:4: (lv_coordinates_4_0= ruleCoordinates )
            // InternalHriDsl.g:652:5: lv_coordinates_4_0= ruleCoordinates
            {

            					newCompositeNode(grammarAccess.getRobotAccess().getCoordinatesCoordinatesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_coordinates_4_0=ruleCoordinates();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotRule());
            					}
            					set(
            						current,
            						"coordinates",
            						lv_coordinates_4_0,
            						"it.polimi.hri_designtime.HriDsl.Coordinates");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getRobotAccess().getTypeKeyword_5());
            		
            // InternalHriDsl.g:673:3: ( (lv_type_6_0= ruleType ) )
            // InternalHriDsl.g:674:4: (lv_type_6_0= ruleType )
            {
            // InternalHriDsl.g:674:4: (lv_type_6_0= ruleType )
            // InternalHriDsl.g:675:5: lv_type_6_0= ruleType
            {

            					newCompositeNode(grammarAccess.getRobotAccess().getTypeTypeEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_25);
            lv_type_6_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_6_0,
            						"it.polimi.hri_designtime.HriDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getRobotAccess().getCharge_percentageKeyword_7());
            		
            // InternalHriDsl.g:696:3: ( (lv_charge_percentage_8_0= RULE_INT ) )
            // InternalHriDsl.g:697:4: (lv_charge_percentage_8_0= RULE_INT )
            {
            // InternalHriDsl.g:697:4: (lv_charge_percentage_8_0= RULE_INT )
            // InternalHriDsl.g:698:5: lv_charge_percentage_8_0= RULE_INT
            {
            lv_charge_percentage_8_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_charge_percentage_8_0, grammarAccess.getRobotAccess().getCharge_percentageINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"charge_percentage",
            						lv_charge_percentage_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleHumans"
    // InternalHriDsl.g:718:1: entryRuleHumans returns [EObject current=null] : iv_ruleHumans= ruleHumans EOF ;
    public final EObject entryRuleHumans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHumans = null;


        try {
            // InternalHriDsl.g:718:47: (iv_ruleHumans= ruleHumans EOF )
            // InternalHriDsl.g:719:2: iv_ruleHumans= ruleHumans EOF
            {
             newCompositeNode(grammarAccess.getHumansRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHumans=ruleHumans();

            state._fsp--;

             current =iv_ruleHumans; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHumans"


    // $ANTLR start "ruleHumans"
    // InternalHriDsl.g:725:1: ruleHumans returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'humans' otherlv_2= ':' ( (lv_humans_3_0= ruleHuman ) )+ ) ;
    public final EObject ruleHumans() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_humans_3_0 = null;



        	enterRule();

        try {
            // InternalHriDsl.g:731:2: ( (otherlv_0= 'define' otherlv_1= 'humans' otherlv_2= ':' ( (lv_humans_3_0= ruleHuman ) )+ ) )
            // InternalHriDsl.g:732:2: (otherlv_0= 'define' otherlv_1= 'humans' otherlv_2= ':' ( (lv_humans_3_0= ruleHuman ) )+ )
            {
            // InternalHriDsl.g:732:2: (otherlv_0= 'define' otherlv_1= 'humans' otherlv_2= ':' ( (lv_humans_3_0= ruleHuman ) )+ )
            // InternalHriDsl.g:733:3: otherlv_0= 'define' otherlv_1= 'humans' otherlv_2= ':' ( (lv_humans_3_0= ruleHuman ) )+
            {
            otherlv_0=(Token)match(input,25,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getHumansAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getHumansAccess().getHumansKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getHumansAccess().getColonKeyword_2());
            		
            // InternalHriDsl.g:745:3: ( (lv_humans_3_0= ruleHuman ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalHriDsl.g:746:4: (lv_humans_3_0= ruleHuman )
            	    {
            	    // InternalHriDsl.g:746:4: (lv_humans_3_0= ruleHuman )
            	    // InternalHriDsl.g:747:5: lv_humans_3_0= ruleHuman
            	    {

            	    					newCompositeNode(grammarAccess.getHumansAccess().getHumansHumanParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_humans_3_0=ruleHuman();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHumansRule());
            	    					}
            	    					add(
            	    						current,
            	    						"humans",
            	    						lv_humans_3_0,
            	    						"it.polimi.hri_designtime.HriDsl.Human");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHumans"


    // $ANTLR start "entryRuleHuman"
    // InternalHriDsl.g:768:1: entryRuleHuman returns [EObject current=null] : iv_ruleHuman= ruleHuman EOF ;
    public final EObject entryRuleHuman() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHuman = null;


        try {
            // InternalHriDsl.g:768:46: (iv_ruleHuman= ruleHuman EOF )
            // InternalHriDsl.g:769:2: iv_ruleHuman= ruleHuman EOF
            {
             newCompositeNode(grammarAccess.getHumanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHuman=ruleHuman();

            state._fsp--;

             current =iv_ruleHuman; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHuman"


    // $ANTLR start "ruleHuman"
    // InternalHriDsl.g:775:1: ruleHuman returns [EObject current=null] : (otherlv_0= 'human' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'coordinates' ( (lv_coordinates_4_0= ruleCoordinates ) ) otherlv_5= 'speed' ( (lv_speed_6_0= RULE_FLOAT ) ) otherlv_7= 'dexterity' ( (lv_dext_8_0= RULE_INT ) ) otherlv_9= 'fatigue_profile' ( (lv_fatigue_profile_10_0= ruleFatigue_profile ) ) otherlv_11= 'free_will_profile' ( (lv_free_will_profile_12_0= ruleFree_will_profile ) ) ) ;
    public final EObject ruleHuman() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_speed_6_0=null;
        Token otherlv_7=null;
        Token lv_dext_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_coordinates_4_0 = null;

        Enumerator lv_fatigue_profile_10_0 = null;

        Enumerator lv_free_will_profile_12_0 = null;



        	enterRule();

        try {
            // InternalHriDsl.g:781:2: ( (otherlv_0= 'human' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'coordinates' ( (lv_coordinates_4_0= ruleCoordinates ) ) otherlv_5= 'speed' ( (lv_speed_6_0= RULE_FLOAT ) ) otherlv_7= 'dexterity' ( (lv_dext_8_0= RULE_INT ) ) otherlv_9= 'fatigue_profile' ( (lv_fatigue_profile_10_0= ruleFatigue_profile ) ) otherlv_11= 'free_will_profile' ( (lv_free_will_profile_12_0= ruleFree_will_profile ) ) ) )
            // InternalHriDsl.g:782:2: (otherlv_0= 'human' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'coordinates' ( (lv_coordinates_4_0= ruleCoordinates ) ) otherlv_5= 'speed' ( (lv_speed_6_0= RULE_FLOAT ) ) otherlv_7= 'dexterity' ( (lv_dext_8_0= RULE_INT ) ) otherlv_9= 'fatigue_profile' ( (lv_fatigue_profile_10_0= ruleFatigue_profile ) ) otherlv_11= 'free_will_profile' ( (lv_free_will_profile_12_0= ruleFree_will_profile ) ) )
            {
            // InternalHriDsl.g:782:2: (otherlv_0= 'human' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'coordinates' ( (lv_coordinates_4_0= ruleCoordinates ) ) otherlv_5= 'speed' ( (lv_speed_6_0= RULE_FLOAT ) ) otherlv_7= 'dexterity' ( (lv_dext_8_0= RULE_INT ) ) otherlv_9= 'fatigue_profile' ( (lv_fatigue_profile_10_0= ruleFatigue_profile ) ) otherlv_11= 'free_will_profile' ( (lv_free_will_profile_12_0= ruleFree_will_profile ) ) )
            // InternalHriDsl.g:783:3: otherlv_0= 'human' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'coordinates' ( (lv_coordinates_4_0= ruleCoordinates ) ) otherlv_5= 'speed' ( (lv_speed_6_0= RULE_FLOAT ) ) otherlv_7= 'dexterity' ( (lv_dext_8_0= RULE_INT ) ) otherlv_9= 'fatigue_profile' ( (lv_fatigue_profile_10_0= ruleFatigue_profile ) ) otherlv_11= 'free_will_profile' ( (lv_free_will_profile_12_0= ruleFree_will_profile ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getHumanAccess().getHumanKeyword_0());
            		
            // InternalHriDsl.g:787:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalHriDsl.g:788:4: (lv_name_1_0= RULE_ID )
            {
            // InternalHriDsl.g:788:4: (lv_name_1_0= RULE_ID )
            // InternalHriDsl.g:789:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getHumanAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHumanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getHumanAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getHumanAccess().getCoordinatesKeyword_3());
            		
            // InternalHriDsl.g:813:3: ( (lv_coordinates_4_0= ruleCoordinates ) )
            // InternalHriDsl.g:814:4: (lv_coordinates_4_0= ruleCoordinates )
            {
            // InternalHriDsl.g:814:4: (lv_coordinates_4_0= ruleCoordinates )
            // InternalHriDsl.g:815:5: lv_coordinates_4_0= ruleCoordinates
            {

            					newCompositeNode(grammarAccess.getHumanAccess().getCoordinatesCoordinatesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_30);
            lv_coordinates_4_0=ruleCoordinates();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHumanRule());
            					}
            					set(
            						current,
            						"coordinates",
            						lv_coordinates_4_0,
            						"it.polimi.hri_designtime.HriDsl.Coordinates");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_31); 

            			newLeafNode(otherlv_5, grammarAccess.getHumanAccess().getSpeedKeyword_5());
            		
            // InternalHriDsl.g:836:3: ( (lv_speed_6_0= RULE_FLOAT ) )
            // InternalHriDsl.g:837:4: (lv_speed_6_0= RULE_FLOAT )
            {
            // InternalHriDsl.g:837:4: (lv_speed_6_0= RULE_FLOAT )
            // InternalHriDsl.g:838:5: lv_speed_6_0= RULE_FLOAT
            {
            lv_speed_6_0=(Token)match(input,RULE_FLOAT,FOLLOW_32); 

            					newLeafNode(lv_speed_6_0, grammarAccess.getHumanAccess().getSpeedFLOATTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHumanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"speed",
            						lv_speed_6_0,
            						"it.polimi.hri_designtime.HriDsl.FLOAT");
            				

            }


            }

            otherlv_7=(Token)match(input,33,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getHumanAccess().getDexterityKeyword_7());
            		
            // InternalHriDsl.g:858:3: ( (lv_dext_8_0= RULE_INT ) )
            // InternalHriDsl.g:859:4: (lv_dext_8_0= RULE_INT )
            {
            // InternalHriDsl.g:859:4: (lv_dext_8_0= RULE_INT )
            // InternalHriDsl.g:860:5: lv_dext_8_0= RULE_INT
            {
            lv_dext_8_0=(Token)match(input,RULE_INT,FOLLOW_33); 

            					newLeafNode(lv_dext_8_0, grammarAccess.getHumanAccess().getDextINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHumanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dext",
            						lv_dext_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,34,FOLLOW_34); 

            			newLeafNode(otherlv_9, grammarAccess.getHumanAccess().getFatigue_profileKeyword_9());
            		
            // InternalHriDsl.g:880:3: ( (lv_fatigue_profile_10_0= ruleFatigue_profile ) )
            // InternalHriDsl.g:881:4: (lv_fatigue_profile_10_0= ruleFatigue_profile )
            {
            // InternalHriDsl.g:881:4: (lv_fatigue_profile_10_0= ruleFatigue_profile )
            // InternalHriDsl.g:882:5: lv_fatigue_profile_10_0= ruleFatigue_profile
            {

            					newCompositeNode(grammarAccess.getHumanAccess().getFatigue_profileFatigue_profileEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_35);
            lv_fatigue_profile_10_0=ruleFatigue_profile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHumanRule());
            					}
            					set(
            						current,
            						"fatigue_profile",
            						lv_fatigue_profile_10_0,
            						"it.polimi.hri_designtime.HriDsl.Fatigue_profile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,35,FOLLOW_36); 

            			newLeafNode(otherlv_11, grammarAccess.getHumanAccess().getFree_will_profileKeyword_11());
            		
            // InternalHriDsl.g:903:3: ( (lv_free_will_profile_12_0= ruleFree_will_profile ) )
            // InternalHriDsl.g:904:4: (lv_free_will_profile_12_0= ruleFree_will_profile )
            {
            // InternalHriDsl.g:904:4: (lv_free_will_profile_12_0= ruleFree_will_profile )
            // InternalHriDsl.g:905:5: lv_free_will_profile_12_0= ruleFree_will_profile
            {

            					newCompositeNode(grammarAccess.getHumanAccess().getFree_will_profileFree_will_profileEnumRuleCall_12_0());
            				
            pushFollow(FOLLOW_2);
            lv_free_will_profile_12_0=ruleFree_will_profile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHumanRule());
            					}
            					set(
            						current,
            						"free_will_profile",
            						lv_free_will_profile_12_0,
            						"it.polimi.hri_designtime.HriDsl.Free_will_profile");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHuman"


    // $ANTLR start "entryRuleMission"
    // InternalHriDsl.g:926:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalHriDsl.g:926:48: (iv_ruleMission= ruleMission EOF )
            // InternalHriDsl.g:927:2: iv_ruleMission= ruleMission EOF
            {
             newCompositeNode(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMission=ruleMission();

            state._fsp--;

             current =iv_ruleMission; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalHriDsl.g:933:1: ruleMission returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'mission' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_assignments_4_0= ruleAssignment ) )+ ( (lv_queries_5_0= ruleQueries ) ) ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_assignments_4_0 = null;

        EObject lv_queries_5_0 = null;



        	enterRule();

        try {
            // InternalHriDsl.g:939:2: ( (otherlv_0= 'define' otherlv_1= 'mission' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_assignments_4_0= ruleAssignment ) )+ ( (lv_queries_5_0= ruleQueries ) ) ) )
            // InternalHriDsl.g:940:2: (otherlv_0= 'define' otherlv_1= 'mission' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_assignments_4_0= ruleAssignment ) )+ ( (lv_queries_5_0= ruleQueries ) ) )
            {
            // InternalHriDsl.g:940:2: (otherlv_0= 'define' otherlv_1= 'mission' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_assignments_4_0= ruleAssignment ) )+ ( (lv_queries_5_0= ruleQueries ) ) )
            // InternalHriDsl.g:941:3: otherlv_0= 'define' otherlv_1= 'mission' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_assignments_4_0= ruleAssignment ) )+ ( (lv_queries_5_0= ruleQueries ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionAccess().getMissionKeyword_1());
            		
            // InternalHriDsl.g:949:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalHriDsl.g:950:4: (lv_name_2_0= RULE_ID )
            {
            // InternalHriDsl.g:950:4: (lv_name_2_0= RULE_ID )
            // InternalHriDsl.g:951:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMissionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getColonKeyword_3());
            		
            // InternalHriDsl.g:971:3: ( (lv_assignments_4_0= ruleAssignment ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==37) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalHriDsl.g:972:4: (lv_assignments_4_0= ruleAssignment )
            	    {
            	    // InternalHriDsl.g:972:4: (lv_assignments_4_0= ruleAssignment )
            	    // InternalHriDsl.g:973:5: lv_assignments_4_0= ruleAssignment
            	    {

            	    					newCompositeNode(grammarAccess.getMissionAccess().getAssignmentsAssignmentParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_assignments_4_0=ruleAssignment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMissionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assignments",
            	    						lv_assignments_4_0,
            	    						"it.polimi.hri_designtime.HriDsl.Assignment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // InternalHriDsl.g:990:3: ( (lv_queries_5_0= ruleQueries ) )
            // InternalHriDsl.g:991:4: (lv_queries_5_0= ruleQueries )
            {
            // InternalHriDsl.g:991:4: (lv_queries_5_0= ruleQueries )
            // InternalHriDsl.g:992:5: lv_queries_5_0= ruleQueries
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getQueriesQueriesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_queries_5_0=ruleQueries();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionRule());
            					}
            					set(
            						current,
            						"queries",
            						lv_queries_5_0,
            						"it.polimi.hri_designtime.HriDsl.Queries");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleAssignment"
    // InternalHriDsl.g:1013:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalHriDsl.g:1013:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalHriDsl.g:1014:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalHriDsl.g:1020:1: ruleAssignment returns [EObject current=null] : (otherlv_0= 'do' ( (lv_pattern_1_0= rulePattern ) ) otherlv_2= 'for' ( (lv_client_3_0= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'target' ( (lv_target_6_0= RULE_ID ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_client_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_target_6_0=null;
        Enumerator lv_pattern_1_0 = null;



        	enterRule();

        try {
            // InternalHriDsl.g:1026:2: ( (otherlv_0= 'do' ( (lv_pattern_1_0= rulePattern ) ) otherlv_2= 'for' ( (lv_client_3_0= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'target' ( (lv_target_6_0= RULE_ID ) ) ) )
            // InternalHriDsl.g:1027:2: (otherlv_0= 'do' ( (lv_pattern_1_0= rulePattern ) ) otherlv_2= 'for' ( (lv_client_3_0= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'target' ( (lv_target_6_0= RULE_ID ) ) )
            {
            // InternalHriDsl.g:1027:2: (otherlv_0= 'do' ( (lv_pattern_1_0= rulePattern ) ) otherlv_2= 'for' ( (lv_client_3_0= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'target' ( (lv_target_6_0= RULE_ID ) ) )
            // InternalHriDsl.g:1028:3: otherlv_0= 'do' ( (lv_pattern_1_0= rulePattern ) ) otherlv_2= 'for' ( (lv_client_3_0= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'target' ( (lv_target_6_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getDoKeyword_0());
            		
            // InternalHriDsl.g:1032:3: ( (lv_pattern_1_0= rulePattern ) )
            // InternalHriDsl.g:1033:4: (lv_pattern_1_0= rulePattern )
            {
            // InternalHriDsl.g:1033:4: (lv_pattern_1_0= rulePattern )
            // InternalHriDsl.g:1034:5: lv_pattern_1_0= rulePattern
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getPatternPatternEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_41);
            lv_pattern_1_0=rulePattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"pattern",
            						lv_pattern_1_0,
            						"it.polimi.hri_designtime.HriDsl.Pattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getForKeyword_2());
            		
            // InternalHriDsl.g:1055:3: ( (lv_client_3_0= RULE_ID ) )
            // InternalHriDsl.g:1056:4: (lv_client_3_0= RULE_ID )
            {
            // InternalHriDsl.g:1056:4: (lv_client_3_0= RULE_ID )
            // InternalHriDsl.g:1057:5: lv_client_3_0= RULE_ID
            {
            lv_client_3_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_client_3_0, grammarAccess.getAssignmentAccess().getClientIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"client",
            						lv_client_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_42); 

            			newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getWithKeyword_4());
            		
            otherlv_5=(Token)match(input,39,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getAssignmentAccess().getTargetKeyword_5());
            		
            // InternalHriDsl.g:1081:3: ( (lv_target_6_0= RULE_ID ) )
            // InternalHriDsl.g:1082:4: (lv_target_6_0= RULE_ID )
            {
            // InternalHriDsl.g:1082:4: (lv_target_6_0= RULE_ID )
            // InternalHriDsl.g:1083:5: lv_target_6_0= RULE_ID
            {
            lv_target_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_target_6_0, grammarAccess.getAssignmentAccess().getTargetIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleQueries"
    // InternalHriDsl.g:1103:1: entryRuleQueries returns [EObject current=null] : iv_ruleQueries= ruleQueries EOF ;
    public final EObject entryRuleQueries() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueries = null;


        try {
            // InternalHriDsl.g:1103:48: (iv_ruleQueries= ruleQueries EOF )
            // InternalHriDsl.g:1104:2: iv_ruleQueries= ruleQueries EOF
            {
             newCompositeNode(grammarAccess.getQueriesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueries=ruleQueries();

            state._fsp--;

             current =iv_ruleQueries; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQueries"


    // $ANTLR start "ruleQueries"
    // InternalHriDsl.g:1110:1: ruleQueries returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'queries' otherlv_2= 'of' otherlv_3= 'mission' ( (lv_mission_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_queries_6_0= ruleQuery ) )+ ) ;
    public final EObject ruleQueries() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_mission_4_0=null;
        Token otherlv_5=null;
        EObject lv_queries_6_0 = null;



        	enterRule();

        try {
            // InternalHriDsl.g:1116:2: ( (otherlv_0= 'define' otherlv_1= 'queries' otherlv_2= 'of' otherlv_3= 'mission' ( (lv_mission_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_queries_6_0= ruleQuery ) )+ ) )
            // InternalHriDsl.g:1117:2: (otherlv_0= 'define' otherlv_1= 'queries' otherlv_2= 'of' otherlv_3= 'mission' ( (lv_mission_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_queries_6_0= ruleQuery ) )+ )
            {
            // InternalHriDsl.g:1117:2: (otherlv_0= 'define' otherlv_1= 'queries' otherlv_2= 'of' otherlv_3= 'mission' ( (lv_mission_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_queries_6_0= ruleQuery ) )+ )
            // InternalHriDsl.g:1118:3: otherlv_0= 'define' otherlv_1= 'queries' otherlv_2= 'of' otherlv_3= 'mission' ( (lv_mission_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_queries_6_0= ruleQuery ) )+
            {
            otherlv_0=(Token)match(input,25,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getQueriesAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,40,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getQueriesAccess().getQueriesKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getQueriesAccess().getOfKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getQueriesAccess().getMissionKeyword_3());
            		
            // InternalHriDsl.g:1134:3: ( (lv_mission_4_0= RULE_ID ) )
            // InternalHriDsl.g:1135:4: (lv_mission_4_0= RULE_ID )
            {
            // InternalHriDsl.g:1135:4: (lv_mission_4_0= RULE_ID )
            // InternalHriDsl.g:1136:5: lv_mission_4_0= RULE_ID
            {
            lv_mission_4_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_mission_4_0, grammarAccess.getQueriesAccess().getMissionIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueriesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mission",
            						lv_mission_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_45); 

            			newLeafNode(otherlv_5, grammarAccess.getQueriesAccess().getColonKeyword_5());
            		
            // InternalHriDsl.g:1156:3: ( (lv_queries_6_0= ruleQuery ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==42) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalHriDsl.g:1157:4: (lv_queries_6_0= ruleQuery )
            	    {
            	    // InternalHriDsl.g:1157:4: (lv_queries_6_0= ruleQuery )
            	    // InternalHriDsl.g:1158:5: lv_queries_6_0= ruleQuery
            	    {

            	    					newCompositeNode(grammarAccess.getQueriesAccess().getQueriesQueryParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_46);
            	    lv_queries_6_0=ruleQuery();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQueriesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"queries",
            	    						lv_queries_6_0,
            	    						"it.polimi.hri_designtime.HriDsl.Query");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQueries"


    // $ANTLR start "entryRuleQuery"
    // InternalHriDsl.g:1179:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalHriDsl.g:1179:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalHriDsl.g:1180:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalHriDsl.g:1186:1: ruleQuery returns [EObject current=null] : (otherlv_0= 'compute' ( (lv_query_type_1_0= ruleQuery_type ) ) otherlv_2= 'with' otherlv_3= 'duration' ( (lv_duration_4_0= RULE_INT ) ) otherlv_5= 'runs' ( (lv_runs_6_0= RULE_INT ) ) ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_duration_4_0=null;
        Token otherlv_5=null;
        Token lv_runs_6_0=null;
        Enumerator lv_query_type_1_0 = null;



        	enterRule();

        try {
            // InternalHriDsl.g:1192:2: ( (otherlv_0= 'compute' ( (lv_query_type_1_0= ruleQuery_type ) ) otherlv_2= 'with' otherlv_3= 'duration' ( (lv_duration_4_0= RULE_INT ) ) otherlv_5= 'runs' ( (lv_runs_6_0= RULE_INT ) ) ) )
            // InternalHriDsl.g:1193:2: (otherlv_0= 'compute' ( (lv_query_type_1_0= ruleQuery_type ) ) otherlv_2= 'with' otherlv_3= 'duration' ( (lv_duration_4_0= RULE_INT ) ) otherlv_5= 'runs' ( (lv_runs_6_0= RULE_INT ) ) )
            {
            // InternalHriDsl.g:1193:2: (otherlv_0= 'compute' ( (lv_query_type_1_0= ruleQuery_type ) ) otherlv_2= 'with' otherlv_3= 'duration' ( (lv_duration_4_0= RULE_INT ) ) otherlv_5= 'runs' ( (lv_runs_6_0= RULE_INT ) ) )
            // InternalHriDsl.g:1194:3: otherlv_0= 'compute' ( (lv_query_type_1_0= ruleQuery_type ) ) otherlv_2= 'with' otherlv_3= 'duration' ( (lv_duration_4_0= RULE_INT ) ) otherlv_5= 'runs' ( (lv_runs_6_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getQueryAccess().getComputeKeyword_0());
            		
            // InternalHriDsl.g:1198:3: ( (lv_query_type_1_0= ruleQuery_type ) )
            // InternalHriDsl.g:1199:4: (lv_query_type_1_0= ruleQuery_type )
            {
            // InternalHriDsl.g:1199:4: (lv_query_type_1_0= ruleQuery_type )
            // InternalHriDsl.g:1200:5: lv_query_type_1_0= ruleQuery_type
            {

            					newCompositeNode(grammarAccess.getQueryAccess().getQuery_typeQuery_typeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_query_type_1_0=ruleQuery_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryRule());
            					}
            					set(
            						current,
            						"query_type",
            						lv_query_type_1_0,
            						"it.polimi.hri_designtime.HriDsl.Query_type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getQueryAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,43,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getQueryAccess().getDurationKeyword_3());
            		
            // InternalHriDsl.g:1225:3: ( (lv_duration_4_0= RULE_INT ) )
            // InternalHriDsl.g:1226:4: (lv_duration_4_0= RULE_INT )
            {
            // InternalHriDsl.g:1226:4: (lv_duration_4_0= RULE_INT )
            // InternalHriDsl.g:1227:5: lv_duration_4_0= RULE_INT
            {
            lv_duration_4_0=(Token)match(input,RULE_INT,FOLLOW_49); 

            					newLeafNode(lv_duration_4_0, grammarAccess.getQueryAccess().getDurationINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"duration",
            						lv_duration_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,44,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getQueryAccess().getRunsKeyword_5());
            		
            // InternalHriDsl.g:1247:3: ( (lv_runs_6_0= RULE_INT ) )
            // InternalHriDsl.g:1248:4: (lv_runs_6_0= RULE_INT )
            {
            // InternalHriDsl.g:1248:4: (lv_runs_6_0= RULE_INT )
            // InternalHriDsl.g:1249:5: lv_runs_6_0= RULE_INT
            {
            lv_runs_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_runs_6_0, grammarAccess.getQueryAccess().getRunsINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"runs",
            						lv_runs_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleCoordinates"
    // InternalHriDsl.g:1269:1: entryRuleCoordinates returns [EObject current=null] : iv_ruleCoordinates= ruleCoordinates EOF ;
    public final EObject entryRuleCoordinates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinates = null;


        try {
            // InternalHriDsl.g:1269:52: (iv_ruleCoordinates= ruleCoordinates EOF )
            // InternalHriDsl.g:1270:2: iv_ruleCoordinates= ruleCoordinates EOF
            {
             newCompositeNode(grammarAccess.getCoordinatesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinates=ruleCoordinates();

            state._fsp--;

             current =iv_ruleCoordinates; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoordinates"


    // $ANTLR start "ruleCoordinates"
    // InternalHriDsl.g:1276:1: ruleCoordinates returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= RULE_FLOAT ) ) otherlv_2= ';' ( (lv_y_3_0= RULE_FLOAT ) ) otherlv_4= ')' ) ;
    public final EObject ruleCoordinates() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalHriDsl.g:1282:2: ( (otherlv_0= '(' ( (lv_x_1_0= RULE_FLOAT ) ) otherlv_2= ';' ( (lv_y_3_0= RULE_FLOAT ) ) otherlv_4= ')' ) )
            // InternalHriDsl.g:1283:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_FLOAT ) ) otherlv_2= ';' ( (lv_y_3_0= RULE_FLOAT ) ) otherlv_4= ')' )
            {
            // InternalHriDsl.g:1283:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_FLOAT ) ) otherlv_2= ';' ( (lv_y_3_0= RULE_FLOAT ) ) otherlv_4= ')' )
            // InternalHriDsl.g:1284:3: otherlv_0= '(' ( (lv_x_1_0= RULE_FLOAT ) ) otherlv_2= ';' ( (lv_y_3_0= RULE_FLOAT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinatesAccess().getLeftParenthesisKeyword_0());
            		
            // InternalHriDsl.g:1288:3: ( (lv_x_1_0= RULE_FLOAT ) )
            // InternalHriDsl.g:1289:4: (lv_x_1_0= RULE_FLOAT )
            {
            // InternalHriDsl.g:1289:4: (lv_x_1_0= RULE_FLOAT )
            // InternalHriDsl.g:1290:5: lv_x_1_0= RULE_FLOAT
            {
            lv_x_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_50); 

            					newLeafNode(lv_x_1_0, grammarAccess.getCoordinatesAccess().getXFLOATTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinatesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_1_0,
            						"it.polimi.hri_designtime.HriDsl.FLOAT");
            				

            }


            }

            otherlv_2=(Token)match(input,46,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getCoordinatesAccess().getSemicolonKeyword_2());
            		
            // InternalHriDsl.g:1310:3: ( (lv_y_3_0= RULE_FLOAT ) )
            // InternalHriDsl.g:1311:4: (lv_y_3_0= RULE_FLOAT )
            {
            // InternalHriDsl.g:1311:4: (lv_y_3_0= RULE_FLOAT )
            // InternalHriDsl.g:1312:5: lv_y_3_0= RULE_FLOAT
            {
            lv_y_3_0=(Token)match(input,RULE_FLOAT,FOLLOW_51); 

            					newLeafNode(lv_y_3_0, grammarAccess.getCoordinatesAccess().getYFLOATTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinatesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_3_0,
            						"it.polimi.hri_designtime.HriDsl.FLOAT");
            				

            }


            }

            otherlv_4=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCoordinatesAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoordinates"


    // $ANTLR start "ruleLength_unit"
    // InternalHriDsl.g:1336:1: ruleLength_unit returns [Enumerator current=null] : ( (enumLiteral_0= 'm' ) | (enumLiteral_1= 'km' ) | (enumLiteral_2= 'cm' ) ) ;
    public final Enumerator ruleLength_unit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalHriDsl.g:1342:2: ( ( (enumLiteral_0= 'm' ) | (enumLiteral_1= 'km' ) | (enumLiteral_2= 'cm' ) ) )
            // InternalHriDsl.g:1343:2: ( (enumLiteral_0= 'm' ) | (enumLiteral_1= 'km' ) | (enumLiteral_2= 'cm' ) )
            {
            // InternalHriDsl.g:1343:2: ( (enumLiteral_0= 'm' ) | (enumLiteral_1= 'km' ) | (enumLiteral_2= 'cm' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt10=1;
                }
                break;
            case 49:
                {
                alt10=2;
                }
                break;
            case 50:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalHriDsl.g:1344:3: (enumLiteral_0= 'm' )
                    {
                    // InternalHriDsl.g:1344:3: (enumLiteral_0= 'm' )
                    // InternalHriDsl.g:1345:4: enumLiteral_0= 'm'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getLength_unitAccess().getMETEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLength_unitAccess().getMETEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:1352:3: (enumLiteral_1= 'km' )
                    {
                    // InternalHriDsl.g:1352:3: (enumLiteral_1= 'km' )
                    // InternalHriDsl.g:1353:4: enumLiteral_1= 'km'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getLength_unitAccess().getKILOMETEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLength_unitAccess().getKILOMETEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:1360:3: (enumLiteral_2= 'cm' )
                    {
                    // InternalHriDsl.g:1360:3: (enumLiteral_2= 'cm' )
                    // InternalHriDsl.g:1361:4: enumLiteral_2= 'cm'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getLength_unitAccess().getCENTIMETEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLength_unitAccess().getCENTIMETEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLength_unit"


    // $ANTLR start "ruleType"
    // InternalHriDsl.g:1371:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'turtlebot3_burger' ) | (enumLiteral_1= 'tiago' ) | (enumLiteral_2= 'pepper' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalHriDsl.g:1377:2: ( ( (enumLiteral_0= 'turtlebot3_burger' ) | (enumLiteral_1= 'tiago' ) | (enumLiteral_2= 'pepper' ) ) )
            // InternalHriDsl.g:1378:2: ( (enumLiteral_0= 'turtlebot3_burger' ) | (enumLiteral_1= 'tiago' ) | (enumLiteral_2= 'pepper' ) )
            {
            // InternalHriDsl.g:1378:2: ( (enumLiteral_0= 'turtlebot3_burger' ) | (enumLiteral_1= 'tiago' ) | (enumLiteral_2= 'pepper' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt11=1;
                }
                break;
            case 52:
                {
                alt11=2;
                }
                break;
            case 53:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalHriDsl.g:1379:3: (enumLiteral_0= 'turtlebot3_burger' )
                    {
                    // InternalHriDsl.g:1379:3: (enumLiteral_0= 'turtlebot3_burger' )
                    // InternalHriDsl.g:1380:4: enumLiteral_0= 'turtlebot3_burger'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getTURTLEBOT3_BURGEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getTURTLEBOT3_BURGEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:1387:3: (enumLiteral_1= 'tiago' )
                    {
                    // InternalHriDsl.g:1387:3: (enumLiteral_1= 'tiago' )
                    // InternalHriDsl.g:1388:4: enumLiteral_1= 'tiago'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getTIAGOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getTIAGOEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:1395:3: (enumLiteral_2= 'pepper' )
                    {
                    // InternalHriDsl.g:1395:3: (enumLiteral_2= 'pepper' )
                    // InternalHriDsl.g:1396:4: enumLiteral_2= 'pepper'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getPEPPEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getPEPPEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "ruleFatigue_profile"
    // InternalHriDsl.g:1406:1: ruleFatigue_profile returns [Enumerator current=null] : ( (enumLiteral_0= 'young_healthy' ) | (enumLiteral_1= 'young_sick' ) | (enumLiteral_2= 'elderly_healthy' ) | (enumLiteral_3= 'elderly_sick' ) | (enumLiteral_4= 'covid_patient' ) ) ;
    public final Enumerator ruleFatigue_profile() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalHriDsl.g:1412:2: ( ( (enumLiteral_0= 'young_healthy' ) | (enumLiteral_1= 'young_sick' ) | (enumLiteral_2= 'elderly_healthy' ) | (enumLiteral_3= 'elderly_sick' ) | (enumLiteral_4= 'covid_patient' ) ) )
            // InternalHriDsl.g:1413:2: ( (enumLiteral_0= 'young_healthy' ) | (enumLiteral_1= 'young_sick' ) | (enumLiteral_2= 'elderly_healthy' ) | (enumLiteral_3= 'elderly_sick' ) | (enumLiteral_4= 'covid_patient' ) )
            {
            // InternalHriDsl.g:1413:2: ( (enumLiteral_0= 'young_healthy' ) | (enumLiteral_1= 'young_sick' ) | (enumLiteral_2= 'elderly_healthy' ) | (enumLiteral_3= 'elderly_sick' ) | (enumLiteral_4= 'covid_patient' ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt12=1;
                }
                break;
            case 55:
                {
                alt12=2;
                }
                break;
            case 56:
                {
                alt12=3;
                }
                break;
            case 57:
                {
                alt12=4;
                }
                break;
            case 58:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalHriDsl.g:1414:3: (enumLiteral_0= 'young_healthy' )
                    {
                    // InternalHriDsl.g:1414:3: (enumLiteral_0= 'young_healthy' )
                    // InternalHriDsl.g:1415:4: enumLiteral_0= 'young_healthy'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getFatigue_profileAccess().getYOUNG_HEALTHYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFatigue_profileAccess().getYOUNG_HEALTHYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:1422:3: (enumLiteral_1= 'young_sick' )
                    {
                    // InternalHriDsl.g:1422:3: (enumLiteral_1= 'young_sick' )
                    // InternalHriDsl.g:1423:4: enumLiteral_1= 'young_sick'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getFatigue_profileAccess().getYOUNG_SICKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFatigue_profileAccess().getYOUNG_SICKEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:1430:3: (enumLiteral_2= 'elderly_healthy' )
                    {
                    // InternalHriDsl.g:1430:3: (enumLiteral_2= 'elderly_healthy' )
                    // InternalHriDsl.g:1431:4: enumLiteral_2= 'elderly_healthy'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getFatigue_profileAccess().getELDERLY_HEALTHYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFatigue_profileAccess().getELDERLY_HEALTHYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:1438:3: (enumLiteral_3= 'elderly_sick' )
                    {
                    // InternalHriDsl.g:1438:3: (enumLiteral_3= 'elderly_sick' )
                    // InternalHriDsl.g:1439:4: enumLiteral_3= 'elderly_sick'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getFatigue_profileAccess().getELDERLY_SICKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFatigue_profileAccess().getELDERLY_SICKEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHriDsl.g:1446:3: (enumLiteral_4= 'covid_patient' )
                    {
                    // InternalHriDsl.g:1446:3: (enumLiteral_4= 'covid_patient' )
                    // InternalHriDsl.g:1447:4: enumLiteral_4= 'covid_patient'
                    {
                    enumLiteral_4=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getFatigue_profileAccess().getCOVID_PATIENTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFatigue_profileAccess().getCOVID_PATIENTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFatigue_profile"


    // $ANTLR start "ruleFree_will_profile"
    // InternalHriDsl.g:1457:1: ruleFree_will_profile returns [Enumerator current=null] : ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'low' ) | (enumLiteral_3= 'disabled' ) ) ;
    public final Enumerator ruleFree_will_profile() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalHriDsl.g:1463:2: ( ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'low' ) | (enumLiteral_3= 'disabled' ) ) )
            // InternalHriDsl.g:1464:2: ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'low' ) | (enumLiteral_3= 'disabled' ) )
            {
            // InternalHriDsl.g:1464:2: ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'low' ) | (enumLiteral_3= 'disabled' ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt13=1;
                }
                break;
            case 60:
                {
                alt13=2;
                }
                break;
            case 61:
                {
                alt13=3;
                }
                break;
            case 62:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalHriDsl.g:1465:3: (enumLiteral_0= 'normal' )
                    {
                    // InternalHriDsl.g:1465:3: (enumLiteral_0= 'normal' )
                    // InternalHriDsl.g:1466:4: enumLiteral_0= 'normal'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getFree_will_profileAccess().getNORMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFree_will_profileAccess().getNORMALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:1473:3: (enumLiteral_1= 'high' )
                    {
                    // InternalHriDsl.g:1473:3: (enumLiteral_1= 'high' )
                    // InternalHriDsl.g:1474:4: enumLiteral_1= 'high'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getFree_will_profileAccess().getHIGHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFree_will_profileAccess().getHIGHEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:1481:3: (enumLiteral_2= 'low' )
                    {
                    // InternalHriDsl.g:1481:3: (enumLiteral_2= 'low' )
                    // InternalHriDsl.g:1482:4: enumLiteral_2= 'low'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getFree_will_profileAccess().getLOWEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFree_will_profileAccess().getLOWEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:1489:3: (enumLiteral_3= 'disabled' )
                    {
                    // InternalHriDsl.g:1489:3: (enumLiteral_3= 'disabled' )
                    // InternalHriDsl.g:1490:4: enumLiteral_3= 'disabled'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getFree_will_profileAccess().getDISABLEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFree_will_profileAccess().getDISABLEDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFree_will_profile"


    // $ANTLR start "rulePattern"
    // InternalHriDsl.g:1500:1: rulePattern returns [Enumerator current=null] : ( (enumLiteral_0= 'robot_leader' ) | (enumLiteral_1= 'robot_follower' ) | (enumLiteral_2= 'robot_transporter' ) | (enumLiteral_3= 'robot_competitor' ) | (enumLiteral_4= 'robot_rescuer' ) | (enumLiteral_5= 'robot_client' ) ) ;
    public final Enumerator rulePattern() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalHriDsl.g:1506:2: ( ( (enumLiteral_0= 'robot_leader' ) | (enumLiteral_1= 'robot_follower' ) | (enumLiteral_2= 'robot_transporter' ) | (enumLiteral_3= 'robot_competitor' ) | (enumLiteral_4= 'robot_rescuer' ) | (enumLiteral_5= 'robot_client' ) ) )
            // InternalHriDsl.g:1507:2: ( (enumLiteral_0= 'robot_leader' ) | (enumLiteral_1= 'robot_follower' ) | (enumLiteral_2= 'robot_transporter' ) | (enumLiteral_3= 'robot_competitor' ) | (enumLiteral_4= 'robot_rescuer' ) | (enumLiteral_5= 'robot_client' ) )
            {
            // InternalHriDsl.g:1507:2: ( (enumLiteral_0= 'robot_leader' ) | (enumLiteral_1= 'robot_follower' ) | (enumLiteral_2= 'robot_transporter' ) | (enumLiteral_3= 'robot_competitor' ) | (enumLiteral_4= 'robot_rescuer' ) | (enumLiteral_5= 'robot_client' ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt14=1;
                }
                break;
            case 64:
                {
                alt14=2;
                }
                break;
            case 65:
                {
                alt14=3;
                }
                break;
            case 66:
                {
                alt14=4;
                }
                break;
            case 67:
                {
                alt14=5;
                }
                break;
            case 68:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalHriDsl.g:1508:3: (enumLiteral_0= 'robot_leader' )
                    {
                    // InternalHriDsl.g:1508:3: (enumLiteral_0= 'robot_leader' )
                    // InternalHriDsl.g:1509:4: enumLiteral_0= 'robot_leader'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getPatternAccess().getROBOT_LEADEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPatternAccess().getROBOT_LEADEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:1516:3: (enumLiteral_1= 'robot_follower' )
                    {
                    // InternalHriDsl.g:1516:3: (enumLiteral_1= 'robot_follower' )
                    // InternalHriDsl.g:1517:4: enumLiteral_1= 'robot_follower'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getPatternAccess().getROBOT_FOLLOWEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPatternAccess().getROBOT_FOLLOWEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:1524:3: (enumLiteral_2= 'robot_transporter' )
                    {
                    // InternalHriDsl.g:1524:3: (enumLiteral_2= 'robot_transporter' )
                    // InternalHriDsl.g:1525:4: enumLiteral_2= 'robot_transporter'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getPatternAccess().getROBOT_TRANSPORTEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPatternAccess().getROBOT_TRANSPORTEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:1532:3: (enumLiteral_3= 'robot_competitor' )
                    {
                    // InternalHriDsl.g:1532:3: (enumLiteral_3= 'robot_competitor' )
                    // InternalHriDsl.g:1533:4: enumLiteral_3= 'robot_competitor'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getPatternAccess().getROBOT_COMPETITOREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPatternAccess().getROBOT_COMPETITOREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHriDsl.g:1540:3: (enumLiteral_4= 'robot_rescuer' )
                    {
                    // InternalHriDsl.g:1540:3: (enumLiteral_4= 'robot_rescuer' )
                    // InternalHriDsl.g:1541:4: enumLiteral_4= 'robot_rescuer'
                    {
                    enumLiteral_4=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getPatternAccess().getROBOT_RESCUEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPatternAccess().getROBOT_RESCUEREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalHriDsl.g:1548:3: (enumLiteral_5= 'robot_client' )
                    {
                    // InternalHriDsl.g:1548:3: (enumLiteral_5= 'robot_client' )
                    // InternalHriDsl.g:1549:4: enumLiteral_5= 'robot_client'
                    {
                    enumLiteral_5=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getPatternAccess().getROBOT_ASSISTANTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPatternAccess().getROBOT_ASSISTANTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "ruleQuery_type"
    // InternalHriDsl.g:1559:1: ruleQuery_type returns [Enumerator current=null] : ( (enumLiteral_0= 'simulation' ) | (enumLiteral_1= 'probability_of_success' ) | (enumLiteral_2= 'expected_fatigue' ) | (enumLiteral_3= 'expected_charge' ) | (enumLiteral_4= 'probability_of_failure' ) ) ;
    public final Enumerator ruleQuery_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalHriDsl.g:1565:2: ( ( (enumLiteral_0= 'simulation' ) | (enumLiteral_1= 'probability_of_success' ) | (enumLiteral_2= 'expected_fatigue' ) | (enumLiteral_3= 'expected_charge' ) | (enumLiteral_4= 'probability_of_failure' ) ) )
            // InternalHriDsl.g:1566:2: ( (enumLiteral_0= 'simulation' ) | (enumLiteral_1= 'probability_of_success' ) | (enumLiteral_2= 'expected_fatigue' ) | (enumLiteral_3= 'expected_charge' ) | (enumLiteral_4= 'probability_of_failure' ) )
            {
            // InternalHriDsl.g:1566:2: ( (enumLiteral_0= 'simulation' ) | (enumLiteral_1= 'probability_of_success' ) | (enumLiteral_2= 'expected_fatigue' ) | (enumLiteral_3= 'expected_charge' ) | (enumLiteral_4= 'probability_of_failure' ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt15=1;
                }
                break;
            case 70:
                {
                alt15=2;
                }
                break;
            case 71:
                {
                alt15=3;
                }
                break;
            case 72:
                {
                alt15=4;
                }
                break;
            case 73:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalHriDsl.g:1567:3: (enumLiteral_0= 'simulation' )
                    {
                    // InternalHriDsl.g:1567:3: (enumLiteral_0= 'simulation' )
                    // InternalHriDsl.g:1568:4: enumLiteral_0= 'simulation'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getQuery_typeAccess().getSIMULATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQuery_typeAccess().getSIMULATIONEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:1575:3: (enumLiteral_1= 'probability_of_success' )
                    {
                    // InternalHriDsl.g:1575:3: (enumLiteral_1= 'probability_of_success' )
                    // InternalHriDsl.g:1576:4: enumLiteral_1= 'probability_of_success'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getQuery_typeAccess().getPROBABILITY_OF_SUCCESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQuery_typeAccess().getPROBABILITY_OF_SUCCESSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:1583:3: (enumLiteral_2= 'expected_fatigue' )
                    {
                    // InternalHriDsl.g:1583:3: (enumLiteral_2= 'expected_fatigue' )
                    // InternalHriDsl.g:1584:4: enumLiteral_2= 'expected_fatigue'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getQuery_typeAccess().getEXPECTED_FATIGUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getQuery_typeAccess().getEXPECTED_FATIGUEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:1591:3: (enumLiteral_3= 'expected_charge' )
                    {
                    // InternalHriDsl.g:1591:3: (enumLiteral_3= 'expected_charge' )
                    // InternalHriDsl.g:1592:4: enumLiteral_3= 'expected_charge'
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getQuery_typeAccess().getEXPECTED_CHARGEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getQuery_typeAccess().getEXPECTED_CHARGEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHriDsl.g:1599:3: (enumLiteral_4= 'probability_of_failure' )
                    {
                    // InternalHriDsl.g:1599:3: (enumLiteral_4= 'probability_of_failure' )
                    // InternalHriDsl.g:1600:4: enumLiteral_4= 'probability_of_failure'
                    {
                    enumLiteral_4=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getQuery_typeAccess().getPROBABILITY_OF_FAILUREEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getQuery_typeAccess().getPROBABILITY_OF_FAILUREEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuery_type"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0038000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x07C0000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x7800000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8000000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x00000000000003E0L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000800000000000L});

}