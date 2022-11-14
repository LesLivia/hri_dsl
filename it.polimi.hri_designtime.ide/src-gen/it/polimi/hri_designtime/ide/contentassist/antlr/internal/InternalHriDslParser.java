package it.polimi.hri_designtime.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import it.polimi.hri_designtime.services.HriDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHriDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_DEC", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'m'", "'km'", "'cm'", "'turtlebot3_burger'", "'tiago'", "'pepper'", "'young_healthy'", "'young_sick'", "'elderly_healthy'", "'elderly_sick'", "'covid_patient'", "'normal'", "'high'", "'low'", "'disabled'", "'robot_leader'", "'robot_follower'", "'robot_transporter'", "'robot_competitor'", "'robot_rescuer'", "'robot_client'", "'simulation'", "'probability_of_success'", "'expected_fatigue'", "'expected_charge'", "'probability_of_failure'", "'parameter'", "'length_unit'", "'build'", "'floor'", "':'", "'add'", "'rectangular_surface'", "'with'", "'coordinates_vertex_A'", "'coordinates_vertex_C'", "'point_of_interest'", "'coordinates'", "'define'", "'robots'", "'robot'", "'type'", "'charge_percentage'", "'humans'", "'human'", "'speed'", "'dexterity'", "'fatigue_profile'", "'free_will_profile'", "'mission'", "'do'", "'for'", "'target'", "'queries'", "'of'", "'compute'", "'duration'", "'runs'", "'('", "';'", "')'"
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

    	public void setGrammarAccess(HriDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalHriDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalHriDsl.g:54:1: ( ruleModel EOF )
            // InternalHriDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalHriDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalHriDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalHriDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalHriDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalHriDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalHriDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleParameter"
    // InternalHriDsl.g:78:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalHriDsl.g:79:1: ( ruleParameter EOF )
            // InternalHriDsl.g:80:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalHriDsl.g:87:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:91:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalHriDsl.g:92:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalHriDsl.g:92:2: ( ( rule__Parameter__Group__0 ) )
            // InternalHriDsl.g:93:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalHriDsl.g:94:3: ( rule__Parameter__Group__0 )
            // InternalHriDsl.g:94:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleScenario"
    // InternalHriDsl.g:103:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // InternalHriDsl.g:104:1: ( ruleScenario EOF )
            // InternalHriDsl.g:105:1: ruleScenario EOF
            {
             before(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getScenarioRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalHriDsl.g:112:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:116:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // InternalHriDsl.g:117:2: ( ( rule__Scenario__Group__0 ) )
            {
            // InternalHriDsl.g:117:2: ( ( rule__Scenario__Group__0 ) )
            // InternalHriDsl.g:118:3: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // InternalHriDsl.g:119:3: ( rule__Scenario__Group__0 )
            // InternalHriDsl.g:119:4: rule__Scenario__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleFloor"
    // InternalHriDsl.g:128:1: entryRuleFloor : ruleFloor EOF ;
    public final void entryRuleFloor() throws RecognitionException {
        try {
            // InternalHriDsl.g:129:1: ( ruleFloor EOF )
            // InternalHriDsl.g:130:1: ruleFloor EOF
            {
             before(grammarAccess.getFloorRule()); 
            pushFollow(FOLLOW_1);
            ruleFloor();

            state._fsp--;

             after(grammarAccess.getFloorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloor"


    // $ANTLR start "ruleFloor"
    // InternalHriDsl.g:137:1: ruleFloor : ( ( rule__Floor__Group__0 ) ) ;
    public final void ruleFloor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:141:2: ( ( ( rule__Floor__Group__0 ) ) )
            // InternalHriDsl.g:142:2: ( ( rule__Floor__Group__0 ) )
            {
            // InternalHriDsl.g:142:2: ( ( rule__Floor__Group__0 ) )
            // InternalHriDsl.g:143:3: ( rule__Floor__Group__0 )
            {
             before(grammarAccess.getFloorAccess().getGroup()); 
            // InternalHriDsl.g:144:3: ( rule__Floor__Group__0 )
            // InternalHriDsl.g:144:4: rule__Floor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Floor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloor"


    // $ANTLR start "entryRuleSurface"
    // InternalHriDsl.g:153:1: entryRuleSurface : ruleSurface EOF ;
    public final void entryRuleSurface() throws RecognitionException {
        try {
            // InternalHriDsl.g:154:1: ( ruleSurface EOF )
            // InternalHriDsl.g:155:1: ruleSurface EOF
            {
             before(grammarAccess.getSurfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleSurface();

            state._fsp--;

             after(grammarAccess.getSurfaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSurface"


    // $ANTLR start "ruleSurface"
    // InternalHriDsl.g:162:1: ruleSurface : ( ( rule__Surface__Group__0 ) ) ;
    public final void ruleSurface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:166:2: ( ( ( rule__Surface__Group__0 ) ) )
            // InternalHriDsl.g:167:2: ( ( rule__Surface__Group__0 ) )
            {
            // InternalHriDsl.g:167:2: ( ( rule__Surface__Group__0 ) )
            // InternalHriDsl.g:168:3: ( rule__Surface__Group__0 )
            {
             before(grammarAccess.getSurfaceAccess().getGroup()); 
            // InternalHriDsl.g:169:3: ( rule__Surface__Group__0 )
            // InternalHriDsl.g:169:4: rule__Surface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Surface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSurfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSurface"


    // $ANTLR start "entryRuleVertices"
    // InternalHriDsl.g:178:1: entryRuleVertices : ruleVertices EOF ;
    public final void entryRuleVertices() throws RecognitionException {
        try {
            // InternalHriDsl.g:179:1: ( ruleVertices EOF )
            // InternalHriDsl.g:180:1: ruleVertices EOF
            {
             before(grammarAccess.getVerticesRule()); 
            pushFollow(FOLLOW_1);
            ruleVertices();

            state._fsp--;

             after(grammarAccess.getVerticesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVertices"


    // $ANTLR start "ruleVertices"
    // InternalHriDsl.g:187:1: ruleVertices : ( ( rule__Vertices__Group__0 ) ) ;
    public final void ruleVertices() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:191:2: ( ( ( rule__Vertices__Group__0 ) ) )
            // InternalHriDsl.g:192:2: ( ( rule__Vertices__Group__0 ) )
            {
            // InternalHriDsl.g:192:2: ( ( rule__Vertices__Group__0 ) )
            // InternalHriDsl.g:193:3: ( rule__Vertices__Group__0 )
            {
             before(grammarAccess.getVerticesAccess().getGroup()); 
            // InternalHriDsl.g:194:3: ( rule__Vertices__Group__0 )
            // InternalHriDsl.g:194:4: rule__Vertices__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Vertices__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVerticesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVertices"


    // $ANTLR start "entryRulePoint"
    // InternalHriDsl.g:203:1: entryRulePoint : rulePoint EOF ;
    public final void entryRulePoint() throws RecognitionException {
        try {
            // InternalHriDsl.g:204:1: ( rulePoint EOF )
            // InternalHriDsl.g:205:1: rulePoint EOF
            {
             before(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalHriDsl.g:212:1: rulePoint : ( ( rule__Point__Group__0 ) ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:216:2: ( ( ( rule__Point__Group__0 ) ) )
            // InternalHriDsl.g:217:2: ( ( rule__Point__Group__0 ) )
            {
            // InternalHriDsl.g:217:2: ( ( rule__Point__Group__0 ) )
            // InternalHriDsl.g:218:3: ( rule__Point__Group__0 )
            {
             before(grammarAccess.getPointAccess().getGroup()); 
            // InternalHriDsl.g:219:3: ( rule__Point__Group__0 )
            // InternalHriDsl.g:219:4: rule__Point__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleRobots"
    // InternalHriDsl.g:228:1: entryRuleRobots : ruleRobots EOF ;
    public final void entryRuleRobots() throws RecognitionException {
        try {
            // InternalHriDsl.g:229:1: ( ruleRobots EOF )
            // InternalHriDsl.g:230:1: ruleRobots EOF
            {
             before(grammarAccess.getRobotsRule()); 
            pushFollow(FOLLOW_1);
            ruleRobots();

            state._fsp--;

             after(grammarAccess.getRobotsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRobots"


    // $ANTLR start "ruleRobots"
    // InternalHriDsl.g:237:1: ruleRobots : ( ( rule__Robots__Group__0 ) ) ;
    public final void ruleRobots() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:241:2: ( ( ( rule__Robots__Group__0 ) ) )
            // InternalHriDsl.g:242:2: ( ( rule__Robots__Group__0 ) )
            {
            // InternalHriDsl.g:242:2: ( ( rule__Robots__Group__0 ) )
            // InternalHriDsl.g:243:3: ( rule__Robots__Group__0 )
            {
             before(grammarAccess.getRobotsAccess().getGroup()); 
            // InternalHriDsl.g:244:3: ( rule__Robots__Group__0 )
            // InternalHriDsl.g:244:4: rule__Robots__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Robots__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRobotsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRobots"


    // $ANTLR start "entryRuleRobot"
    // InternalHriDsl.g:253:1: entryRuleRobot : ruleRobot EOF ;
    public final void entryRuleRobot() throws RecognitionException {
        try {
            // InternalHriDsl.g:254:1: ( ruleRobot EOF )
            // InternalHriDsl.g:255:1: ruleRobot EOF
            {
             before(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            ruleRobot();

            state._fsp--;

             after(grammarAccess.getRobotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalHriDsl.g:262:1: ruleRobot : ( ( rule__Robot__Group__0 ) ) ;
    public final void ruleRobot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:266:2: ( ( ( rule__Robot__Group__0 ) ) )
            // InternalHriDsl.g:267:2: ( ( rule__Robot__Group__0 ) )
            {
            // InternalHriDsl.g:267:2: ( ( rule__Robot__Group__0 ) )
            // InternalHriDsl.g:268:3: ( rule__Robot__Group__0 )
            {
             before(grammarAccess.getRobotAccess().getGroup()); 
            // InternalHriDsl.g:269:3: ( rule__Robot__Group__0 )
            // InternalHriDsl.g:269:4: rule__Robot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleHumans"
    // InternalHriDsl.g:278:1: entryRuleHumans : ruleHumans EOF ;
    public final void entryRuleHumans() throws RecognitionException {
        try {
            // InternalHriDsl.g:279:1: ( ruleHumans EOF )
            // InternalHriDsl.g:280:1: ruleHumans EOF
            {
             before(grammarAccess.getHumansRule()); 
            pushFollow(FOLLOW_1);
            ruleHumans();

            state._fsp--;

             after(grammarAccess.getHumansRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHumans"


    // $ANTLR start "ruleHumans"
    // InternalHriDsl.g:287:1: ruleHumans : ( ( rule__Humans__Group__0 ) ) ;
    public final void ruleHumans() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:291:2: ( ( ( rule__Humans__Group__0 ) ) )
            // InternalHriDsl.g:292:2: ( ( rule__Humans__Group__0 ) )
            {
            // InternalHriDsl.g:292:2: ( ( rule__Humans__Group__0 ) )
            // InternalHriDsl.g:293:3: ( rule__Humans__Group__0 )
            {
             before(grammarAccess.getHumansAccess().getGroup()); 
            // InternalHriDsl.g:294:3: ( rule__Humans__Group__0 )
            // InternalHriDsl.g:294:4: rule__Humans__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Humans__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHumansAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHumans"


    // $ANTLR start "entryRuleHuman"
    // InternalHriDsl.g:303:1: entryRuleHuman : ruleHuman EOF ;
    public final void entryRuleHuman() throws RecognitionException {
        try {
            // InternalHriDsl.g:304:1: ( ruleHuman EOF )
            // InternalHriDsl.g:305:1: ruleHuman EOF
            {
             before(grammarAccess.getHumanRule()); 
            pushFollow(FOLLOW_1);
            ruleHuman();

            state._fsp--;

             after(grammarAccess.getHumanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHuman"


    // $ANTLR start "ruleHuman"
    // InternalHriDsl.g:312:1: ruleHuman : ( ( rule__Human__Group__0 ) ) ;
    public final void ruleHuman() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:316:2: ( ( ( rule__Human__Group__0 ) ) )
            // InternalHriDsl.g:317:2: ( ( rule__Human__Group__0 ) )
            {
            // InternalHriDsl.g:317:2: ( ( rule__Human__Group__0 ) )
            // InternalHriDsl.g:318:3: ( rule__Human__Group__0 )
            {
             before(grammarAccess.getHumanAccess().getGroup()); 
            // InternalHriDsl.g:319:3: ( rule__Human__Group__0 )
            // InternalHriDsl.g:319:4: rule__Human__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Human__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHumanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHuman"


    // $ANTLR start "entryRuleMission"
    // InternalHriDsl.g:328:1: entryRuleMission : ruleMission EOF ;
    public final void entryRuleMission() throws RecognitionException {
        try {
            // InternalHriDsl.g:329:1: ( ruleMission EOF )
            // InternalHriDsl.g:330:1: ruleMission EOF
            {
             before(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            ruleMission();

            state._fsp--;

             after(grammarAccess.getMissionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalHriDsl.g:337:1: ruleMission : ( ( rule__Mission__Group__0 ) ) ;
    public final void ruleMission() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:341:2: ( ( ( rule__Mission__Group__0 ) ) )
            // InternalHriDsl.g:342:2: ( ( rule__Mission__Group__0 ) )
            {
            // InternalHriDsl.g:342:2: ( ( rule__Mission__Group__0 ) )
            // InternalHriDsl.g:343:3: ( rule__Mission__Group__0 )
            {
             before(grammarAccess.getMissionAccess().getGroup()); 
            // InternalHriDsl.g:344:3: ( rule__Mission__Group__0 )
            // InternalHriDsl.g:344:4: rule__Mission__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleAssignment"
    // InternalHriDsl.g:353:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalHriDsl.g:354:1: ( ruleAssignment EOF )
            // InternalHriDsl.g:355:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalHriDsl.g:362:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:366:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalHriDsl.g:367:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalHriDsl.g:367:2: ( ( rule__Assignment__Group__0 ) )
            // InternalHriDsl.g:368:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalHriDsl.g:369:3: ( rule__Assignment__Group__0 )
            // InternalHriDsl.g:369:4: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleQueries"
    // InternalHriDsl.g:378:1: entryRuleQueries : ruleQueries EOF ;
    public final void entryRuleQueries() throws RecognitionException {
        try {
            // InternalHriDsl.g:379:1: ( ruleQueries EOF )
            // InternalHriDsl.g:380:1: ruleQueries EOF
            {
             before(grammarAccess.getQueriesRule()); 
            pushFollow(FOLLOW_1);
            ruleQueries();

            state._fsp--;

             after(grammarAccess.getQueriesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQueries"


    // $ANTLR start "ruleQueries"
    // InternalHriDsl.g:387:1: ruleQueries : ( ( rule__Queries__Group__0 ) ) ;
    public final void ruleQueries() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:391:2: ( ( ( rule__Queries__Group__0 ) ) )
            // InternalHriDsl.g:392:2: ( ( rule__Queries__Group__0 ) )
            {
            // InternalHriDsl.g:392:2: ( ( rule__Queries__Group__0 ) )
            // InternalHriDsl.g:393:3: ( rule__Queries__Group__0 )
            {
             before(grammarAccess.getQueriesAccess().getGroup()); 
            // InternalHriDsl.g:394:3: ( rule__Queries__Group__0 )
            // InternalHriDsl.g:394:4: rule__Queries__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Queries__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueriesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueries"


    // $ANTLR start "entryRuleQuery"
    // InternalHriDsl.g:403:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalHriDsl.g:404:1: ( ruleQuery EOF )
            // InternalHriDsl.g:405:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalHriDsl.g:412:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:416:2: ( ( ( rule__Query__Group__0 ) ) )
            // InternalHriDsl.g:417:2: ( ( rule__Query__Group__0 ) )
            {
            // InternalHriDsl.g:417:2: ( ( rule__Query__Group__0 ) )
            // InternalHriDsl.g:418:3: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // InternalHriDsl.g:419:3: ( rule__Query__Group__0 )
            // InternalHriDsl.g:419:4: rule__Query__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleCoordinates"
    // InternalHriDsl.g:428:1: entryRuleCoordinates : ruleCoordinates EOF ;
    public final void entryRuleCoordinates() throws RecognitionException {
        try {
            // InternalHriDsl.g:429:1: ( ruleCoordinates EOF )
            // InternalHriDsl.g:430:1: ruleCoordinates EOF
            {
             before(grammarAccess.getCoordinatesRule()); 
            pushFollow(FOLLOW_1);
            ruleCoordinates();

            state._fsp--;

             after(grammarAccess.getCoordinatesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCoordinates"


    // $ANTLR start "ruleCoordinates"
    // InternalHriDsl.g:437:1: ruleCoordinates : ( ( rule__Coordinates__Group__0 ) ) ;
    public final void ruleCoordinates() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:441:2: ( ( ( rule__Coordinates__Group__0 ) ) )
            // InternalHriDsl.g:442:2: ( ( rule__Coordinates__Group__0 ) )
            {
            // InternalHriDsl.g:442:2: ( ( rule__Coordinates__Group__0 ) )
            // InternalHriDsl.g:443:3: ( rule__Coordinates__Group__0 )
            {
             before(grammarAccess.getCoordinatesAccess().getGroup()); 
            // InternalHriDsl.g:444:3: ( rule__Coordinates__Group__0 )
            // InternalHriDsl.g:444:4: rule__Coordinates__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Coordinates__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoordinatesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoordinates"


    // $ANTLR start "ruleLength_unit"
    // InternalHriDsl.g:453:1: ruleLength_unit : ( ( rule__Length_unit__Alternatives ) ) ;
    public final void ruleLength_unit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:457:1: ( ( ( rule__Length_unit__Alternatives ) ) )
            // InternalHriDsl.g:458:2: ( ( rule__Length_unit__Alternatives ) )
            {
            // InternalHriDsl.g:458:2: ( ( rule__Length_unit__Alternatives ) )
            // InternalHriDsl.g:459:3: ( rule__Length_unit__Alternatives )
            {
             before(grammarAccess.getLength_unitAccess().getAlternatives()); 
            // InternalHriDsl.g:460:3: ( rule__Length_unit__Alternatives )
            // InternalHriDsl.g:460:4: rule__Length_unit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Length_unit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLength_unitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLength_unit"


    // $ANTLR start "ruleType"
    // InternalHriDsl.g:469:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:473:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalHriDsl.g:474:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalHriDsl.g:474:2: ( ( rule__Type__Alternatives ) )
            // InternalHriDsl.g:475:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalHriDsl.g:476:3: ( rule__Type__Alternatives )
            // InternalHriDsl.g:476:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "ruleFatigue_profile"
    // InternalHriDsl.g:485:1: ruleFatigue_profile : ( ( rule__Fatigue_profile__Alternatives ) ) ;
    public final void ruleFatigue_profile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:489:1: ( ( ( rule__Fatigue_profile__Alternatives ) ) )
            // InternalHriDsl.g:490:2: ( ( rule__Fatigue_profile__Alternatives ) )
            {
            // InternalHriDsl.g:490:2: ( ( rule__Fatigue_profile__Alternatives ) )
            // InternalHriDsl.g:491:3: ( rule__Fatigue_profile__Alternatives )
            {
             before(grammarAccess.getFatigue_profileAccess().getAlternatives()); 
            // InternalHriDsl.g:492:3: ( rule__Fatigue_profile__Alternatives )
            // InternalHriDsl.g:492:4: rule__Fatigue_profile__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Fatigue_profile__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFatigue_profileAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFatigue_profile"


    // $ANTLR start "ruleFree_will_profile"
    // InternalHriDsl.g:501:1: ruleFree_will_profile : ( ( rule__Free_will_profile__Alternatives ) ) ;
    public final void ruleFree_will_profile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:505:1: ( ( ( rule__Free_will_profile__Alternatives ) ) )
            // InternalHriDsl.g:506:2: ( ( rule__Free_will_profile__Alternatives ) )
            {
            // InternalHriDsl.g:506:2: ( ( rule__Free_will_profile__Alternatives ) )
            // InternalHriDsl.g:507:3: ( rule__Free_will_profile__Alternatives )
            {
             before(grammarAccess.getFree_will_profileAccess().getAlternatives()); 
            // InternalHriDsl.g:508:3: ( rule__Free_will_profile__Alternatives )
            // InternalHriDsl.g:508:4: rule__Free_will_profile__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Free_will_profile__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFree_will_profileAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFree_will_profile"


    // $ANTLR start "rulePattern"
    // InternalHriDsl.g:517:1: rulePattern : ( ( rule__Pattern__Alternatives ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:521:1: ( ( ( rule__Pattern__Alternatives ) ) )
            // InternalHriDsl.g:522:2: ( ( rule__Pattern__Alternatives ) )
            {
            // InternalHriDsl.g:522:2: ( ( rule__Pattern__Alternatives ) )
            // InternalHriDsl.g:523:3: ( rule__Pattern__Alternatives )
            {
             before(grammarAccess.getPatternAccess().getAlternatives()); 
            // InternalHriDsl.g:524:3: ( rule__Pattern__Alternatives )
            // InternalHriDsl.g:524:4: rule__Pattern__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "ruleQuery_type"
    // InternalHriDsl.g:533:1: ruleQuery_type : ( ( rule__Query_type__Alternatives ) ) ;
    public final void ruleQuery_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:537:1: ( ( ( rule__Query_type__Alternatives ) ) )
            // InternalHriDsl.g:538:2: ( ( rule__Query_type__Alternatives ) )
            {
            // InternalHriDsl.g:538:2: ( ( rule__Query_type__Alternatives ) )
            // InternalHriDsl.g:539:3: ( rule__Query_type__Alternatives )
            {
             before(grammarAccess.getQuery_typeAccess().getAlternatives()); 
            // InternalHriDsl.g:540:3: ( rule__Query_type__Alternatives )
            // InternalHriDsl.g:540:4: rule__Query_type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Query_type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuery_typeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuery_type"


    // $ANTLR start "rule__Length_unit__Alternatives"
    // InternalHriDsl.g:548:1: rule__Length_unit__Alternatives : ( ( ( 'm' ) ) | ( ( 'km' ) ) | ( ( 'cm' ) ) );
    public final void rule__Length_unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:552:1: ( ( ( 'm' ) ) | ( ( 'km' ) ) | ( ( 'cm' ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalHriDsl.g:553:2: ( ( 'm' ) )
                    {
                    // InternalHriDsl.g:553:2: ( ( 'm' ) )
                    // InternalHriDsl.g:554:3: ( 'm' )
                    {
                     before(grammarAccess.getLength_unitAccess().getMETEREnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:555:3: ( 'm' )
                    // InternalHriDsl.g:555:4: 'm'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getLength_unitAccess().getMETEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:559:2: ( ( 'km' ) )
                    {
                    // InternalHriDsl.g:559:2: ( ( 'km' ) )
                    // InternalHriDsl.g:560:3: ( 'km' )
                    {
                     before(grammarAccess.getLength_unitAccess().getKILOMETEREnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:561:3: ( 'km' )
                    // InternalHriDsl.g:561:4: 'km'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getLength_unitAccess().getKILOMETEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:565:2: ( ( 'cm' ) )
                    {
                    // InternalHriDsl.g:565:2: ( ( 'cm' ) )
                    // InternalHriDsl.g:566:3: ( 'cm' )
                    {
                     before(grammarAccess.getLength_unitAccess().getCENTIMETEREnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:567:3: ( 'cm' )
                    // InternalHriDsl.g:567:4: 'cm'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getLength_unitAccess().getCENTIMETEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Length_unit__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalHriDsl.g:575:1: rule__Type__Alternatives : ( ( ( 'turtlebot3_burger' ) ) | ( ( 'tiago' ) ) | ( ( 'pepper' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:579:1: ( ( ( 'turtlebot3_burger' ) ) | ( ( 'tiago' ) ) | ( ( 'pepper' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalHriDsl.g:580:2: ( ( 'turtlebot3_burger' ) )
                    {
                    // InternalHriDsl.g:580:2: ( ( 'turtlebot3_burger' ) )
                    // InternalHriDsl.g:581:3: ( 'turtlebot3_burger' )
                    {
                     before(grammarAccess.getTypeAccess().getTURTLEBOT3_BURGEREnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:582:3: ( 'turtlebot3_burger' )
                    // InternalHriDsl.g:582:4: 'turtlebot3_burger'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getTURTLEBOT3_BURGEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:586:2: ( ( 'tiago' ) )
                    {
                    // InternalHriDsl.g:586:2: ( ( 'tiago' ) )
                    // InternalHriDsl.g:587:3: ( 'tiago' )
                    {
                     before(grammarAccess.getTypeAccess().getTIAGOEnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:588:3: ( 'tiago' )
                    // InternalHriDsl.g:588:4: 'tiago'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getTIAGOEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:592:2: ( ( 'pepper' ) )
                    {
                    // InternalHriDsl.g:592:2: ( ( 'pepper' ) )
                    // InternalHriDsl.g:593:3: ( 'pepper' )
                    {
                     before(grammarAccess.getTypeAccess().getPEPPEREnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:594:3: ( 'pepper' )
                    // InternalHriDsl.g:594:4: 'pepper'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getPEPPEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Fatigue_profile__Alternatives"
    // InternalHriDsl.g:602:1: rule__Fatigue_profile__Alternatives : ( ( ( 'young_healthy' ) ) | ( ( 'young_sick' ) ) | ( ( 'elderly_healthy' ) ) | ( ( 'elderly_sick' ) ) | ( ( 'covid_patient' ) ) );
    public final void rule__Fatigue_profile__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:606:1: ( ( ( 'young_healthy' ) ) | ( ( 'young_sick' ) ) | ( ( 'elderly_healthy' ) ) | ( ( 'elderly_sick' ) ) | ( ( 'covid_patient' ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            case 22:
                {
                alt3=4;
                }
                break;
            case 23:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalHriDsl.g:607:2: ( ( 'young_healthy' ) )
                    {
                    // InternalHriDsl.g:607:2: ( ( 'young_healthy' ) )
                    // InternalHriDsl.g:608:3: ( 'young_healthy' )
                    {
                     before(grammarAccess.getFatigue_profileAccess().getYOUNG_HEALTHYEnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:609:3: ( 'young_healthy' )
                    // InternalHriDsl.g:609:4: 'young_healthy'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getFatigue_profileAccess().getYOUNG_HEALTHYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:613:2: ( ( 'young_sick' ) )
                    {
                    // InternalHriDsl.g:613:2: ( ( 'young_sick' ) )
                    // InternalHriDsl.g:614:3: ( 'young_sick' )
                    {
                     before(grammarAccess.getFatigue_profileAccess().getYOUNG_SICKEnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:615:3: ( 'young_sick' )
                    // InternalHriDsl.g:615:4: 'young_sick'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getFatigue_profileAccess().getYOUNG_SICKEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:619:2: ( ( 'elderly_healthy' ) )
                    {
                    // InternalHriDsl.g:619:2: ( ( 'elderly_healthy' ) )
                    // InternalHriDsl.g:620:3: ( 'elderly_healthy' )
                    {
                     before(grammarAccess.getFatigue_profileAccess().getELDERLY_HEALTHYEnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:621:3: ( 'elderly_healthy' )
                    // InternalHriDsl.g:621:4: 'elderly_healthy'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getFatigue_profileAccess().getELDERLY_HEALTHYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:625:2: ( ( 'elderly_sick' ) )
                    {
                    // InternalHriDsl.g:625:2: ( ( 'elderly_sick' ) )
                    // InternalHriDsl.g:626:3: ( 'elderly_sick' )
                    {
                     before(grammarAccess.getFatigue_profileAccess().getELDERLY_SICKEnumLiteralDeclaration_3()); 
                    // InternalHriDsl.g:627:3: ( 'elderly_sick' )
                    // InternalHriDsl.g:627:4: 'elderly_sick'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getFatigue_profileAccess().getELDERLY_SICKEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHriDsl.g:631:2: ( ( 'covid_patient' ) )
                    {
                    // InternalHriDsl.g:631:2: ( ( 'covid_patient' ) )
                    // InternalHriDsl.g:632:3: ( 'covid_patient' )
                    {
                     before(grammarAccess.getFatigue_profileAccess().getCOVID_PATIENTEnumLiteralDeclaration_4()); 
                    // InternalHriDsl.g:633:3: ( 'covid_patient' )
                    // InternalHriDsl.g:633:4: 'covid_patient'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getFatigue_profileAccess().getCOVID_PATIENTEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fatigue_profile__Alternatives"


    // $ANTLR start "rule__Free_will_profile__Alternatives"
    // InternalHriDsl.g:641:1: rule__Free_will_profile__Alternatives : ( ( ( 'normal' ) ) | ( ( 'high' ) ) | ( ( 'low' ) ) | ( ( 'disabled' ) ) );
    public final void rule__Free_will_profile__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:645:1: ( ( ( 'normal' ) ) | ( ( 'high' ) ) | ( ( 'low' ) ) | ( ( 'disabled' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case 26:
                {
                alt4=3;
                }
                break;
            case 27:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalHriDsl.g:646:2: ( ( 'normal' ) )
                    {
                    // InternalHriDsl.g:646:2: ( ( 'normal' ) )
                    // InternalHriDsl.g:647:3: ( 'normal' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getNORMALEnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:648:3: ( 'normal' )
                    // InternalHriDsl.g:648:4: 'normal'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getNORMALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:652:2: ( ( 'high' ) )
                    {
                    // InternalHriDsl.g:652:2: ( ( 'high' ) )
                    // InternalHriDsl.g:653:3: ( 'high' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getHIGHEnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:654:3: ( 'high' )
                    // InternalHriDsl.g:654:4: 'high'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getHIGHEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:658:2: ( ( 'low' ) )
                    {
                    // InternalHriDsl.g:658:2: ( ( 'low' ) )
                    // InternalHriDsl.g:659:3: ( 'low' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getLOWEnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:660:3: ( 'low' )
                    // InternalHriDsl.g:660:4: 'low'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getLOWEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:664:2: ( ( 'disabled' ) )
                    {
                    // InternalHriDsl.g:664:2: ( ( 'disabled' ) )
                    // InternalHriDsl.g:665:3: ( 'disabled' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getDISABLEDEnumLiteralDeclaration_3()); 
                    // InternalHriDsl.g:666:3: ( 'disabled' )
                    // InternalHriDsl.g:666:4: 'disabled'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getDISABLEDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Free_will_profile__Alternatives"


    // $ANTLR start "rule__Pattern__Alternatives"
    // InternalHriDsl.g:674:1: rule__Pattern__Alternatives : ( ( ( 'robot_leader' ) ) | ( ( 'robot_follower' ) ) | ( ( 'robot_transporter' ) ) | ( ( 'robot_competitor' ) ) | ( ( 'robot_rescuer' ) ) | ( ( 'robot_client' ) ) );
    public final void rule__Pattern__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:678:1: ( ( ( 'robot_leader' ) ) | ( ( 'robot_follower' ) ) | ( ( 'robot_transporter' ) ) | ( ( 'robot_competitor' ) ) | ( ( 'robot_rescuer' ) ) | ( ( 'robot_client' ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt5=1;
                }
                break;
            case 29:
                {
                alt5=2;
                }
                break;
            case 30:
                {
                alt5=3;
                }
                break;
            case 31:
                {
                alt5=4;
                }
                break;
            case 32:
                {
                alt5=5;
                }
                break;
            case 33:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalHriDsl.g:679:2: ( ( 'robot_leader' ) )
                    {
                    // InternalHriDsl.g:679:2: ( ( 'robot_leader' ) )
                    // InternalHriDsl.g:680:3: ( 'robot_leader' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_LEADEREnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:681:3: ( 'robot_leader' )
                    // InternalHriDsl.g:681:4: 'robot_leader'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getPatternAccess().getROBOT_LEADEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:685:2: ( ( 'robot_follower' ) )
                    {
                    // InternalHriDsl.g:685:2: ( ( 'robot_follower' ) )
                    // InternalHriDsl.g:686:3: ( 'robot_follower' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_FOLLOWEREnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:687:3: ( 'robot_follower' )
                    // InternalHriDsl.g:687:4: 'robot_follower'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getPatternAccess().getROBOT_FOLLOWEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:691:2: ( ( 'robot_transporter' ) )
                    {
                    // InternalHriDsl.g:691:2: ( ( 'robot_transporter' ) )
                    // InternalHriDsl.g:692:3: ( 'robot_transporter' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_TRANSPORTEREnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:693:3: ( 'robot_transporter' )
                    // InternalHriDsl.g:693:4: 'robot_transporter'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getPatternAccess().getROBOT_TRANSPORTEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:697:2: ( ( 'robot_competitor' ) )
                    {
                    // InternalHriDsl.g:697:2: ( ( 'robot_competitor' ) )
                    // InternalHriDsl.g:698:3: ( 'robot_competitor' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_COMPETITOREnumLiteralDeclaration_3()); 
                    // InternalHriDsl.g:699:3: ( 'robot_competitor' )
                    // InternalHriDsl.g:699:4: 'robot_competitor'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getPatternAccess().getROBOT_COMPETITOREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHriDsl.g:703:2: ( ( 'robot_rescuer' ) )
                    {
                    // InternalHriDsl.g:703:2: ( ( 'robot_rescuer' ) )
                    // InternalHriDsl.g:704:3: ( 'robot_rescuer' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_RESCUEREnumLiteralDeclaration_4()); 
                    // InternalHriDsl.g:705:3: ( 'robot_rescuer' )
                    // InternalHriDsl.g:705:4: 'robot_rescuer'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getPatternAccess().getROBOT_RESCUEREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHriDsl.g:709:2: ( ( 'robot_client' ) )
                    {
                    // InternalHriDsl.g:709:2: ( ( 'robot_client' ) )
                    // InternalHriDsl.g:710:3: ( 'robot_client' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_ASSISTANTEnumLiteralDeclaration_5()); 
                    // InternalHriDsl.g:711:3: ( 'robot_client' )
                    // InternalHriDsl.g:711:4: 'robot_client'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getPatternAccess().getROBOT_ASSISTANTEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Alternatives"


    // $ANTLR start "rule__Query_type__Alternatives"
    // InternalHriDsl.g:719:1: rule__Query_type__Alternatives : ( ( ( 'simulation' ) ) | ( ( 'probability_of_success' ) ) | ( ( 'expected_fatigue' ) ) | ( ( 'expected_charge' ) ) | ( ( 'probability_of_failure' ) ) );
    public final void rule__Query_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:723:1: ( ( ( 'simulation' ) ) | ( ( 'probability_of_success' ) ) | ( ( 'expected_fatigue' ) ) | ( ( 'expected_charge' ) ) | ( ( 'probability_of_failure' ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt6=1;
                }
                break;
            case 35:
                {
                alt6=2;
                }
                break;
            case 36:
                {
                alt6=3;
                }
                break;
            case 37:
                {
                alt6=4;
                }
                break;
            case 38:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalHriDsl.g:724:2: ( ( 'simulation' ) )
                    {
                    // InternalHriDsl.g:724:2: ( ( 'simulation' ) )
                    // InternalHriDsl.g:725:3: ( 'simulation' )
                    {
                     before(grammarAccess.getQuery_typeAccess().getSIMULATIONEnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:726:3: ( 'simulation' )
                    // InternalHriDsl.g:726:4: 'simulation'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuery_typeAccess().getSIMULATIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:730:2: ( ( 'probability_of_success' ) )
                    {
                    // InternalHriDsl.g:730:2: ( ( 'probability_of_success' ) )
                    // InternalHriDsl.g:731:3: ( 'probability_of_success' )
                    {
                     before(grammarAccess.getQuery_typeAccess().getPROBABILITY_OF_SUCCESSEnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:732:3: ( 'probability_of_success' )
                    // InternalHriDsl.g:732:4: 'probability_of_success'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuery_typeAccess().getPROBABILITY_OF_SUCCESSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:736:2: ( ( 'expected_fatigue' ) )
                    {
                    // InternalHriDsl.g:736:2: ( ( 'expected_fatigue' ) )
                    // InternalHriDsl.g:737:3: ( 'expected_fatigue' )
                    {
                     before(grammarAccess.getQuery_typeAccess().getEXPECTED_FATIGUEEnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:738:3: ( 'expected_fatigue' )
                    // InternalHriDsl.g:738:4: 'expected_fatigue'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuery_typeAccess().getEXPECTED_FATIGUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:742:2: ( ( 'expected_charge' ) )
                    {
                    // InternalHriDsl.g:742:2: ( ( 'expected_charge' ) )
                    // InternalHriDsl.g:743:3: ( 'expected_charge' )
                    {
                     before(grammarAccess.getQuery_typeAccess().getEXPECTED_CHARGEEnumLiteralDeclaration_3()); 
                    // InternalHriDsl.g:744:3: ( 'expected_charge' )
                    // InternalHriDsl.g:744:4: 'expected_charge'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuery_typeAccess().getEXPECTED_CHARGEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHriDsl.g:748:2: ( ( 'probability_of_failure' ) )
                    {
                    // InternalHriDsl.g:748:2: ( ( 'probability_of_failure' ) )
                    // InternalHriDsl.g:749:3: ( 'probability_of_failure' )
                    {
                     before(grammarAccess.getQuery_typeAccess().getPROBABILITY_OF_FAILUREEnumLiteralDeclaration_4()); 
                    // InternalHriDsl.g:750:3: ( 'probability_of_failure' )
                    // InternalHriDsl.g:750:4: 'probability_of_failure'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuery_typeAccess().getPROBABILITY_OF_FAILUREEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query_type__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalHriDsl.g:758:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:762:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalHriDsl.g:763:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalHriDsl.g:770:1: rule__Model__Group__0__Impl : ( ( rule__Model__ParameterAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:774:1: ( ( ( rule__Model__ParameterAssignment_0 )? ) )
            // InternalHriDsl.g:775:1: ( ( rule__Model__ParameterAssignment_0 )? )
            {
            // InternalHriDsl.g:775:1: ( ( rule__Model__ParameterAssignment_0 )? )
            // InternalHriDsl.g:776:2: ( rule__Model__ParameterAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getParameterAssignment_0()); 
            // InternalHriDsl.g:777:2: ( rule__Model__ParameterAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==39) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalHriDsl.g:777:3: rule__Model__ParameterAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ParameterAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getParameterAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalHriDsl.g:785:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:789:1: ( rule__Model__Group__1__Impl )
            // InternalHriDsl.g:790:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalHriDsl.g:796:1: rule__Model__Group__1__Impl : ( ( rule__Model__ScenariosAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:800:1: ( ( ( rule__Model__ScenariosAssignment_1 )* ) )
            // InternalHriDsl.g:801:1: ( ( rule__Model__ScenariosAssignment_1 )* )
            {
            // InternalHriDsl.g:801:1: ( ( rule__Model__ScenariosAssignment_1 )* )
            // InternalHriDsl.g:802:2: ( rule__Model__ScenariosAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getScenariosAssignment_1()); 
            // InternalHriDsl.g:803:2: ( rule__Model__ScenariosAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==41) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalHriDsl.g:803:3: rule__Model__ScenariosAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ScenariosAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getScenariosAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalHriDsl.g:812:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:816:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalHriDsl.g:817:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalHriDsl.g:824:1: rule__Parameter__Group__0__Impl : ( 'parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:828:1: ( ( 'parameter' ) )
            // InternalHriDsl.g:829:1: ( 'parameter' )
            {
            // InternalHriDsl.g:829:1: ( 'parameter' )
            // InternalHriDsl.g:830:2: 'parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalHriDsl.g:839:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:843:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalHriDsl.g:844:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalHriDsl.g:851:1: rule__Parameter__Group__1__Impl : ( 'length_unit' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:855:1: ( ( 'length_unit' ) )
            // InternalHriDsl.g:856:1: ( 'length_unit' )
            {
            // InternalHriDsl.g:856:1: ( 'length_unit' )
            // InternalHriDsl.g:857:2: 'length_unit'
            {
             before(grammarAccess.getParameterAccess().getLength_unitKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getLength_unitKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalHriDsl.g:866:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:870:1: ( rule__Parameter__Group__2__Impl )
            // InternalHriDsl.g:871:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalHriDsl.g:877:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__Length_unitAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:881:1: ( ( ( rule__Parameter__Length_unitAssignment_2 ) ) )
            // InternalHriDsl.g:882:1: ( ( rule__Parameter__Length_unitAssignment_2 ) )
            {
            // InternalHriDsl.g:882:1: ( ( rule__Parameter__Length_unitAssignment_2 ) )
            // InternalHriDsl.g:883:2: ( rule__Parameter__Length_unitAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getLength_unitAssignment_2()); 
            // InternalHriDsl.g:884:2: ( rule__Parameter__Length_unitAssignment_2 )
            // InternalHriDsl.g:884:3: rule__Parameter__Length_unitAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Length_unitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getLength_unitAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Scenario__Group__0"
    // InternalHriDsl.g:893:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:897:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalHriDsl.g:898:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Scenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__0"


    // $ANTLR start "rule__Scenario__Group__0__Impl"
    // InternalHriDsl.g:905:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__FloorAssignment_0 ) ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:909:1: ( ( ( rule__Scenario__FloorAssignment_0 ) ) )
            // InternalHriDsl.g:910:1: ( ( rule__Scenario__FloorAssignment_0 ) )
            {
            // InternalHriDsl.g:910:1: ( ( rule__Scenario__FloorAssignment_0 ) )
            // InternalHriDsl.g:911:2: ( rule__Scenario__FloorAssignment_0 )
            {
             before(grammarAccess.getScenarioAccess().getFloorAssignment_0()); 
            // InternalHriDsl.g:912:2: ( rule__Scenario__FloorAssignment_0 )
            // InternalHriDsl.g:912:3: rule__Scenario__FloorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__FloorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getFloorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__0__Impl"


    // $ANTLR start "rule__Scenario__Group__1"
    // InternalHriDsl.g:920:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:924:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalHriDsl.g:925:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Scenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__1"


    // $ANTLR start "rule__Scenario__Group__1__Impl"
    // InternalHriDsl.g:932:1: rule__Scenario__Group__1__Impl : ( ( rule__Scenario__RobotsAssignment_1 ) ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:936:1: ( ( ( rule__Scenario__RobotsAssignment_1 ) ) )
            // InternalHriDsl.g:937:1: ( ( rule__Scenario__RobotsAssignment_1 ) )
            {
            // InternalHriDsl.g:937:1: ( ( rule__Scenario__RobotsAssignment_1 ) )
            // InternalHriDsl.g:938:2: ( rule__Scenario__RobotsAssignment_1 )
            {
             before(grammarAccess.getScenarioAccess().getRobotsAssignment_1()); 
            // InternalHriDsl.g:939:2: ( rule__Scenario__RobotsAssignment_1 )
            // InternalHriDsl.g:939:3: rule__Scenario__RobotsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__RobotsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getRobotsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__1__Impl"


    // $ANTLR start "rule__Scenario__Group__2"
    // InternalHriDsl.g:947:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:951:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalHriDsl.g:952:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Scenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__2"


    // $ANTLR start "rule__Scenario__Group__2__Impl"
    // InternalHriDsl.g:959:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__HumansAssignment_2 ) ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:963:1: ( ( ( rule__Scenario__HumansAssignment_2 ) ) )
            // InternalHriDsl.g:964:1: ( ( rule__Scenario__HumansAssignment_2 ) )
            {
            // InternalHriDsl.g:964:1: ( ( rule__Scenario__HumansAssignment_2 ) )
            // InternalHriDsl.g:965:2: ( rule__Scenario__HumansAssignment_2 )
            {
             before(grammarAccess.getScenarioAccess().getHumansAssignment_2()); 
            // InternalHriDsl.g:966:2: ( rule__Scenario__HumansAssignment_2 )
            // InternalHriDsl.g:966:3: rule__Scenario__HumansAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__HumansAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getHumansAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__2__Impl"


    // $ANTLR start "rule__Scenario__Group__3"
    // InternalHriDsl.g:974:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:978:1: ( rule__Scenario__Group__3__Impl )
            // InternalHriDsl.g:979:2: rule__Scenario__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__3"


    // $ANTLR start "rule__Scenario__Group__3__Impl"
    // InternalHriDsl.g:985:1: rule__Scenario__Group__3__Impl : ( ( ( rule__Scenario__MissionsAssignment_3 ) ) ( ( rule__Scenario__MissionsAssignment_3 )* ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:989:1: ( ( ( ( rule__Scenario__MissionsAssignment_3 ) ) ( ( rule__Scenario__MissionsAssignment_3 )* ) ) )
            // InternalHriDsl.g:990:1: ( ( ( rule__Scenario__MissionsAssignment_3 ) ) ( ( rule__Scenario__MissionsAssignment_3 )* ) )
            {
            // InternalHriDsl.g:990:1: ( ( ( rule__Scenario__MissionsAssignment_3 ) ) ( ( rule__Scenario__MissionsAssignment_3 )* ) )
            // InternalHriDsl.g:991:2: ( ( rule__Scenario__MissionsAssignment_3 ) ) ( ( rule__Scenario__MissionsAssignment_3 )* )
            {
            // InternalHriDsl.g:991:2: ( ( rule__Scenario__MissionsAssignment_3 ) )
            // InternalHriDsl.g:992:3: ( rule__Scenario__MissionsAssignment_3 )
            {
             before(grammarAccess.getScenarioAccess().getMissionsAssignment_3()); 
            // InternalHriDsl.g:993:3: ( rule__Scenario__MissionsAssignment_3 )
            // InternalHriDsl.g:993:4: rule__Scenario__MissionsAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__Scenario__MissionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getMissionsAssignment_3()); 

            }

            // InternalHriDsl.g:996:2: ( ( rule__Scenario__MissionsAssignment_3 )* )
            // InternalHriDsl.g:997:3: ( rule__Scenario__MissionsAssignment_3 )*
            {
             before(grammarAccess.getScenarioAccess().getMissionsAssignment_3()); 
            // InternalHriDsl.g:998:3: ( rule__Scenario__MissionsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==51) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalHriDsl.g:998:4: rule__Scenario__MissionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Scenario__MissionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getMissionsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__3__Impl"


    // $ANTLR start "rule__Floor__Group__0"
    // InternalHriDsl.g:1008:1: rule__Floor__Group__0 : rule__Floor__Group__0__Impl rule__Floor__Group__1 ;
    public final void rule__Floor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1012:1: ( rule__Floor__Group__0__Impl rule__Floor__Group__1 )
            // InternalHriDsl.g:1013:2: rule__Floor__Group__0__Impl rule__Floor__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Floor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__0"


    // $ANTLR start "rule__Floor__Group__0__Impl"
    // InternalHriDsl.g:1020:1: rule__Floor__Group__0__Impl : ( 'build' ) ;
    public final void rule__Floor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1024:1: ( ( 'build' ) )
            // InternalHriDsl.g:1025:1: ( 'build' )
            {
            // InternalHriDsl.g:1025:1: ( 'build' )
            // InternalHriDsl.g:1026:2: 'build'
            {
             before(grammarAccess.getFloorAccess().getBuildKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getBuildKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__0__Impl"


    // $ANTLR start "rule__Floor__Group__1"
    // InternalHriDsl.g:1035:1: rule__Floor__Group__1 : rule__Floor__Group__1__Impl rule__Floor__Group__2 ;
    public final void rule__Floor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1039:1: ( rule__Floor__Group__1__Impl rule__Floor__Group__2 )
            // InternalHriDsl.g:1040:2: rule__Floor__Group__1__Impl rule__Floor__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Floor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__1"


    // $ANTLR start "rule__Floor__Group__1__Impl"
    // InternalHriDsl.g:1047:1: rule__Floor__Group__1__Impl : ( 'floor' ) ;
    public final void rule__Floor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1051:1: ( ( 'floor' ) )
            // InternalHriDsl.g:1052:1: ( 'floor' )
            {
            // InternalHriDsl.g:1052:1: ( 'floor' )
            // InternalHriDsl.g:1053:2: 'floor'
            {
             before(grammarAccess.getFloorAccess().getFloorKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getFloorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__1__Impl"


    // $ANTLR start "rule__Floor__Group__2"
    // InternalHriDsl.g:1062:1: rule__Floor__Group__2 : rule__Floor__Group__2__Impl rule__Floor__Group__3 ;
    public final void rule__Floor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1066:1: ( rule__Floor__Group__2__Impl rule__Floor__Group__3 )
            // InternalHriDsl.g:1067:2: rule__Floor__Group__2__Impl rule__Floor__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Floor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__2"


    // $ANTLR start "rule__Floor__Group__2__Impl"
    // InternalHriDsl.g:1074:1: rule__Floor__Group__2__Impl : ( ( rule__Floor__Floor_nameAssignment_2 ) ) ;
    public final void rule__Floor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1078:1: ( ( ( rule__Floor__Floor_nameAssignment_2 ) ) )
            // InternalHriDsl.g:1079:1: ( ( rule__Floor__Floor_nameAssignment_2 ) )
            {
            // InternalHriDsl.g:1079:1: ( ( rule__Floor__Floor_nameAssignment_2 ) )
            // InternalHriDsl.g:1080:2: ( rule__Floor__Floor_nameAssignment_2 )
            {
             before(grammarAccess.getFloorAccess().getFloor_nameAssignment_2()); 
            // InternalHriDsl.g:1081:2: ( rule__Floor__Floor_nameAssignment_2 )
            // InternalHriDsl.g:1081:3: rule__Floor__Floor_nameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Floor__Floor_nameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getFloor_nameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__2__Impl"


    // $ANTLR start "rule__Floor__Group__3"
    // InternalHriDsl.g:1089:1: rule__Floor__Group__3 : rule__Floor__Group__3__Impl rule__Floor__Group__4 ;
    public final void rule__Floor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1093:1: ( rule__Floor__Group__3__Impl rule__Floor__Group__4 )
            // InternalHriDsl.g:1094:2: rule__Floor__Group__3__Impl rule__Floor__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Floor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__3"


    // $ANTLR start "rule__Floor__Group__3__Impl"
    // InternalHriDsl.g:1101:1: rule__Floor__Group__3__Impl : ( ':' ) ;
    public final void rule__Floor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1105:1: ( ( ':' ) )
            // InternalHriDsl.g:1106:1: ( ':' )
            {
            // InternalHriDsl.g:1106:1: ( ':' )
            // InternalHriDsl.g:1107:2: ':'
            {
             before(grammarAccess.getFloorAccess().getColonKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__3__Impl"


    // $ANTLR start "rule__Floor__Group__4"
    // InternalHriDsl.g:1116:1: rule__Floor__Group__4 : rule__Floor__Group__4__Impl rule__Floor__Group__5 ;
    public final void rule__Floor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1120:1: ( rule__Floor__Group__4__Impl rule__Floor__Group__5 )
            // InternalHriDsl.g:1121:2: rule__Floor__Group__4__Impl rule__Floor__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Floor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__4"


    // $ANTLR start "rule__Floor__Group__4__Impl"
    // InternalHriDsl.g:1128:1: rule__Floor__Group__4__Impl : ( ( ( rule__Floor__SurfacesAssignment_4 ) ) ( ( rule__Floor__SurfacesAssignment_4 )* ) ) ;
    public final void rule__Floor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1132:1: ( ( ( ( rule__Floor__SurfacesAssignment_4 ) ) ( ( rule__Floor__SurfacesAssignment_4 )* ) ) )
            // InternalHriDsl.g:1133:1: ( ( ( rule__Floor__SurfacesAssignment_4 ) ) ( ( rule__Floor__SurfacesAssignment_4 )* ) )
            {
            // InternalHriDsl.g:1133:1: ( ( ( rule__Floor__SurfacesAssignment_4 ) ) ( ( rule__Floor__SurfacesAssignment_4 )* ) )
            // InternalHriDsl.g:1134:2: ( ( rule__Floor__SurfacesAssignment_4 ) ) ( ( rule__Floor__SurfacesAssignment_4 )* )
            {
            // InternalHriDsl.g:1134:2: ( ( rule__Floor__SurfacesAssignment_4 ) )
            // InternalHriDsl.g:1135:3: ( rule__Floor__SurfacesAssignment_4 )
            {
             before(grammarAccess.getFloorAccess().getSurfacesAssignment_4()); 
            // InternalHriDsl.g:1136:3: ( rule__Floor__SurfacesAssignment_4 )
            // InternalHriDsl.g:1136:4: rule__Floor__SurfacesAssignment_4
            {
            pushFollow(FOLLOW_13);
            rule__Floor__SurfacesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getSurfacesAssignment_4()); 

            }

            // InternalHriDsl.g:1139:2: ( ( rule__Floor__SurfacesAssignment_4 )* )
            // InternalHriDsl.g:1140:3: ( rule__Floor__SurfacesAssignment_4 )*
            {
             before(grammarAccess.getFloorAccess().getSurfacesAssignment_4()); 
            // InternalHriDsl.g:1141:3: ( rule__Floor__SurfacesAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==44) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==45) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalHriDsl.g:1141:4: rule__Floor__SurfacesAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Floor__SurfacesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFloorAccess().getSurfacesAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__4__Impl"


    // $ANTLR start "rule__Floor__Group__5"
    // InternalHriDsl.g:1150:1: rule__Floor__Group__5 : rule__Floor__Group__5__Impl ;
    public final void rule__Floor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1154:1: ( rule__Floor__Group__5__Impl )
            // InternalHriDsl.g:1155:2: rule__Floor__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Floor__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__5"


    // $ANTLR start "rule__Floor__Group__5__Impl"
    // InternalHriDsl.g:1161:1: rule__Floor__Group__5__Impl : ( ( ( rule__Floor__PointsAssignment_5 ) ) ( ( rule__Floor__PointsAssignment_5 )* ) ) ;
    public final void rule__Floor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1165:1: ( ( ( ( rule__Floor__PointsAssignment_5 ) ) ( ( rule__Floor__PointsAssignment_5 )* ) ) )
            // InternalHriDsl.g:1166:1: ( ( ( rule__Floor__PointsAssignment_5 ) ) ( ( rule__Floor__PointsAssignment_5 )* ) )
            {
            // InternalHriDsl.g:1166:1: ( ( ( rule__Floor__PointsAssignment_5 ) ) ( ( rule__Floor__PointsAssignment_5 )* ) )
            // InternalHriDsl.g:1167:2: ( ( rule__Floor__PointsAssignment_5 ) ) ( ( rule__Floor__PointsAssignment_5 )* )
            {
            // InternalHriDsl.g:1167:2: ( ( rule__Floor__PointsAssignment_5 ) )
            // InternalHriDsl.g:1168:3: ( rule__Floor__PointsAssignment_5 )
            {
             before(grammarAccess.getFloorAccess().getPointsAssignment_5()); 
            // InternalHriDsl.g:1169:3: ( rule__Floor__PointsAssignment_5 )
            // InternalHriDsl.g:1169:4: rule__Floor__PointsAssignment_5
            {
            pushFollow(FOLLOW_13);
            rule__Floor__PointsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getPointsAssignment_5()); 

            }

            // InternalHriDsl.g:1172:2: ( ( rule__Floor__PointsAssignment_5 )* )
            // InternalHriDsl.g:1173:3: ( rule__Floor__PointsAssignment_5 )*
            {
             before(grammarAccess.getFloorAccess().getPointsAssignment_5()); 
            // InternalHriDsl.g:1174:3: ( rule__Floor__PointsAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==44) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalHriDsl.g:1174:4: rule__Floor__PointsAssignment_5
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Floor__PointsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getFloorAccess().getPointsAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__5__Impl"


    // $ANTLR start "rule__Surface__Group__0"
    // InternalHriDsl.g:1184:1: rule__Surface__Group__0 : rule__Surface__Group__0__Impl rule__Surface__Group__1 ;
    public final void rule__Surface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1188:1: ( rule__Surface__Group__0__Impl rule__Surface__Group__1 )
            // InternalHriDsl.g:1189:2: rule__Surface__Group__0__Impl rule__Surface__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Surface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Surface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Surface__Group__0"


    // $ANTLR start "rule__Surface__Group__0__Impl"
    // InternalHriDsl.g:1196:1: rule__Surface__Group__0__Impl : ( 'add' ) ;
    public final void rule__Surface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1200:1: ( ( 'add' ) )
            // InternalHriDsl.g:1201:1: ( 'add' )
            {
            // InternalHriDsl.g:1201:1: ( 'add' )
            // InternalHriDsl.g:1202:2: 'add'
            {
             before(grammarAccess.getSurfaceAccess().getAddKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSurfaceAccess().getAddKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Surface__Group__0__Impl"


    // $ANTLR start "rule__Surface__Group__1"
    // InternalHriDsl.g:1211:1: rule__Surface__Group__1 : rule__Surface__Group__1__Impl rule__Surface__Group__2 ;
    public final void rule__Surface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1215:1: ( rule__Surface__Group__1__Impl rule__Surface__Group__2 )
            // InternalHriDsl.g:1216:2: rule__Surface__Group__1__Impl rule__Surface__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Surface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Surface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Surface__Group__1"


    // $ANTLR start "rule__Surface__Group__1__Impl"
    // InternalHriDsl.g:1223:1: rule__Surface__Group__1__Impl : ( 'rectangular_surface' ) ;
    public final void rule__Surface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1227:1: ( ( 'rectangular_surface' ) )
            // InternalHriDsl.g:1228:1: ( 'rectangular_surface' )
            {
            // InternalHriDsl.g:1228:1: ( 'rectangular_surface' )
            // InternalHriDsl.g:1229:2: 'rectangular_surface'
            {
             before(grammarAccess.getSurfaceAccess().getRectangular_surfaceKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSurfaceAccess().getRectangular_surfaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Surface__Group__1__Impl"


    // $ANTLR start "rule__Surface__Group__2"
    // InternalHriDsl.g:1238:1: rule__Surface__Group__2 : rule__Surface__Group__2__Impl rule__Surface__Group__3 ;
    public final void rule__Surface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1242:1: ( rule__Surface__Group__2__Impl rule__Surface__Group__3 )
            // InternalHriDsl.g:1243:2: rule__Surface__Group__2__Impl rule__Surface__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Surface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Surface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Surface__Group__2"


    // $ANTLR start "rule__Surface__Group__2__Impl"
    // InternalHriDsl.g:1250:1: rule__Surface__Group__2__Impl : ( ( rule__Surface__NameAssignment_2 ) ) ;
    public final void rule__Surface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1254:1: ( ( ( rule__Surface__NameAssignment_2 ) ) )
            // InternalHriDsl.g:1255:1: ( ( rule__Surface__NameAssignment_2 ) )
            {
            // InternalHriDsl.g:1255:1: ( ( rule__Surface__NameAssignment_2 ) )
            // InternalHriDsl.g:1256:2: ( rule__Surface__NameAssignment_2 )
            {
             before(grammarAccess.getSurfaceAccess().getNameAssignment_2()); 
            // InternalHriDsl.g:1257:2: ( rule__Surface__NameAssignment_2 )
            // InternalHriDsl.g:1257:3: rule__Surface__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Surface__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSurfaceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Surface__Group__2__Impl"


    // $ANTLR start "rule__Surface__Group__3"
    // InternalHriDsl.g:1265:1: rule__Surface__Group__3 : rule__Surface__Group__3__Impl rule__Surface__Group__4 ;
    public final void rule__Surface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1269:1: ( rule__Surface__Group__3__Impl rule__Surface__Group__4 )
            // InternalHriDsl.g:1270:2: rule__Surface__Group__3__Impl rule__Surface__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Surface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Surface__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Surface__Group__3"


    // $ANTLR start "rule__Surface__Group__3__Impl"
    // InternalHriDsl.g:1277:1: rule__Surface__Group__3__Impl : ( 'with' ) ;
    public final void rule__Surface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1281:1: ( ( 'with' ) )
            // InternalHriDsl.g:1282:1: ( 'with' )
            {
            // InternalHriDsl.g:1282:1: ( 'with' )
            // InternalHriDsl.g:1283:2: 'with'
            {
             before(grammarAccess.getSurfaceAccess().getWithKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSurfaceAccess().getWithKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Surface__Group__3__Impl"


    // $ANTLR start "rule__Surface__Group__4"
    // InternalHriDsl.g:1292:1: rule__Surface__Group__4 : rule__Surface__Group__4__Impl ;
    public final void rule__Surface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1296:1: ( rule__Surface__Group__4__Impl )
            // InternalHriDsl.g:1297:2: rule__Surface__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Surface__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Surface__Group__4"


    // $ANTLR start "rule__Surface__Group__4__Impl"
    // InternalHriDsl.g:1303:1: rule__Surface__Group__4__Impl : ( ( rule__Surface__VerticesAssignment_4 ) ) ;
    public final void rule__Surface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1307:1: ( ( ( rule__Surface__VerticesAssignment_4 ) ) )
            // InternalHriDsl.g:1308:1: ( ( rule__Surface__VerticesAssignment_4 ) )
            {
            // InternalHriDsl.g:1308:1: ( ( rule__Surface__VerticesAssignment_4 ) )
            // InternalHriDsl.g:1309:2: ( rule__Surface__VerticesAssignment_4 )
            {
             before(grammarAccess.getSurfaceAccess().getVerticesAssignment_4()); 
            // InternalHriDsl.g:1310:2: ( rule__Surface__VerticesAssignment_4 )
            // InternalHriDsl.g:1310:3: rule__Surface__VerticesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Surface__VerticesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSurfaceAccess().getVerticesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Surface__Group__4__Impl"


    // $ANTLR start "rule__Vertices__Group__0"
    // InternalHriDsl.g:1319:1: rule__Vertices__Group__0 : rule__Vertices__Group__0__Impl rule__Vertices__Group__1 ;
    public final void rule__Vertices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1323:1: ( rule__Vertices__Group__0__Impl rule__Vertices__Group__1 )
            // InternalHriDsl.g:1324:2: rule__Vertices__Group__0__Impl rule__Vertices__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Vertices__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vertices__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertices__Group__0"


    // $ANTLR start "rule__Vertices__Group__0__Impl"
    // InternalHriDsl.g:1331:1: rule__Vertices__Group__0__Impl : ( 'coordinates_vertex_A' ) ;
    public final void rule__Vertices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1335:1: ( ( 'coordinates_vertex_A' ) )
            // InternalHriDsl.g:1336:1: ( 'coordinates_vertex_A' )
            {
            // InternalHriDsl.g:1336:1: ( 'coordinates_vertex_A' )
            // InternalHriDsl.g:1337:2: 'coordinates_vertex_A'
            {
             before(grammarAccess.getVerticesAccess().getCoordinates_vertex_AKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getVerticesAccess().getCoordinates_vertex_AKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertices__Group__0__Impl"


    // $ANTLR start "rule__Vertices__Group__1"
    // InternalHriDsl.g:1346:1: rule__Vertices__Group__1 : rule__Vertices__Group__1__Impl rule__Vertices__Group__2 ;
    public final void rule__Vertices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1350:1: ( rule__Vertices__Group__1__Impl rule__Vertices__Group__2 )
            // InternalHriDsl.g:1351:2: rule__Vertices__Group__1__Impl rule__Vertices__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Vertices__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vertices__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertices__Group__1"


    // $ANTLR start "rule__Vertices__Group__1__Impl"
    // InternalHriDsl.g:1358:1: rule__Vertices__Group__1__Impl : ( ( rule__Vertices__Vertex_AAssignment_1 ) ) ;
    public final void rule__Vertices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1362:1: ( ( ( rule__Vertices__Vertex_AAssignment_1 ) ) )
            // InternalHriDsl.g:1363:1: ( ( rule__Vertices__Vertex_AAssignment_1 ) )
            {
            // InternalHriDsl.g:1363:1: ( ( rule__Vertices__Vertex_AAssignment_1 ) )
            // InternalHriDsl.g:1364:2: ( rule__Vertices__Vertex_AAssignment_1 )
            {
             before(grammarAccess.getVerticesAccess().getVertex_AAssignment_1()); 
            // InternalHriDsl.g:1365:2: ( rule__Vertices__Vertex_AAssignment_1 )
            // InternalHriDsl.g:1365:3: rule__Vertices__Vertex_AAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Vertices__Vertex_AAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVerticesAccess().getVertex_AAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertices__Group__1__Impl"


    // $ANTLR start "rule__Vertices__Group__2"
    // InternalHriDsl.g:1373:1: rule__Vertices__Group__2 : rule__Vertices__Group__2__Impl rule__Vertices__Group__3 ;
    public final void rule__Vertices__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1377:1: ( rule__Vertices__Group__2__Impl rule__Vertices__Group__3 )
            // InternalHriDsl.g:1378:2: rule__Vertices__Group__2__Impl rule__Vertices__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Vertices__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vertices__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertices__Group__2"


    // $ANTLR start "rule__Vertices__Group__2__Impl"
    // InternalHriDsl.g:1385:1: rule__Vertices__Group__2__Impl : ( 'coordinates_vertex_C' ) ;
    public final void rule__Vertices__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1389:1: ( ( 'coordinates_vertex_C' ) )
            // InternalHriDsl.g:1390:1: ( 'coordinates_vertex_C' )
            {
            // InternalHriDsl.g:1390:1: ( 'coordinates_vertex_C' )
            // InternalHriDsl.g:1391:2: 'coordinates_vertex_C'
            {
             before(grammarAccess.getVerticesAccess().getCoordinates_vertex_CKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getVerticesAccess().getCoordinates_vertex_CKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertices__Group__2__Impl"


    // $ANTLR start "rule__Vertices__Group__3"
    // InternalHriDsl.g:1400:1: rule__Vertices__Group__3 : rule__Vertices__Group__3__Impl ;
    public final void rule__Vertices__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1404:1: ( rule__Vertices__Group__3__Impl )
            // InternalHriDsl.g:1405:2: rule__Vertices__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vertices__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertices__Group__3"


    // $ANTLR start "rule__Vertices__Group__3__Impl"
    // InternalHriDsl.g:1411:1: rule__Vertices__Group__3__Impl : ( ( rule__Vertices__Vertex_CAssignment_3 ) ) ;
    public final void rule__Vertices__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1415:1: ( ( ( rule__Vertices__Vertex_CAssignment_3 ) ) )
            // InternalHriDsl.g:1416:1: ( ( rule__Vertices__Vertex_CAssignment_3 ) )
            {
            // InternalHriDsl.g:1416:1: ( ( rule__Vertices__Vertex_CAssignment_3 ) )
            // InternalHriDsl.g:1417:2: ( rule__Vertices__Vertex_CAssignment_3 )
            {
             before(grammarAccess.getVerticesAccess().getVertex_CAssignment_3()); 
            // InternalHriDsl.g:1418:2: ( rule__Vertices__Vertex_CAssignment_3 )
            // InternalHriDsl.g:1418:3: rule__Vertices__Vertex_CAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Vertices__Vertex_CAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVerticesAccess().getVertex_CAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertices__Group__3__Impl"


    // $ANTLR start "rule__Point__Group__0"
    // InternalHriDsl.g:1427:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1431:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalHriDsl.g:1432:2: rule__Point__Group__0__Impl rule__Point__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Point__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__0"


    // $ANTLR start "rule__Point__Group__0__Impl"
    // InternalHriDsl.g:1439:1: rule__Point__Group__0__Impl : ( 'add' ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1443:1: ( ( 'add' ) )
            // InternalHriDsl.g:1444:1: ( 'add' )
            {
            // InternalHriDsl.g:1444:1: ( 'add' )
            // InternalHriDsl.g:1445:2: 'add'
            {
             before(grammarAccess.getPointAccess().getAddKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getAddKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__0__Impl"


    // $ANTLR start "rule__Point__Group__1"
    // InternalHriDsl.g:1454:1: rule__Point__Group__1 : rule__Point__Group__1__Impl rule__Point__Group__2 ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1458:1: ( rule__Point__Group__1__Impl rule__Point__Group__2 )
            // InternalHriDsl.g:1459:2: rule__Point__Group__1__Impl rule__Point__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Point__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__1"


    // $ANTLR start "rule__Point__Group__1__Impl"
    // InternalHriDsl.g:1466:1: rule__Point__Group__1__Impl : ( 'point_of_interest' ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1470:1: ( ( 'point_of_interest' ) )
            // InternalHriDsl.g:1471:1: ( 'point_of_interest' )
            {
            // InternalHriDsl.g:1471:1: ( 'point_of_interest' )
            // InternalHriDsl.g:1472:2: 'point_of_interest'
            {
             before(grammarAccess.getPointAccess().getPoint_of_interestKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getPoint_of_interestKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__1__Impl"


    // $ANTLR start "rule__Point__Group__2"
    // InternalHriDsl.g:1481:1: rule__Point__Group__2 : rule__Point__Group__2__Impl rule__Point__Group__3 ;
    public final void rule__Point__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1485:1: ( rule__Point__Group__2__Impl rule__Point__Group__3 )
            // InternalHriDsl.g:1486:2: rule__Point__Group__2__Impl rule__Point__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Point__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__2"


    // $ANTLR start "rule__Point__Group__2__Impl"
    // InternalHriDsl.g:1493:1: rule__Point__Group__2__Impl : ( ( rule__Point__NameAssignment_2 ) ) ;
    public final void rule__Point__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1497:1: ( ( ( rule__Point__NameAssignment_2 ) ) )
            // InternalHriDsl.g:1498:1: ( ( rule__Point__NameAssignment_2 ) )
            {
            // InternalHriDsl.g:1498:1: ( ( rule__Point__NameAssignment_2 ) )
            // InternalHriDsl.g:1499:2: ( rule__Point__NameAssignment_2 )
            {
             before(grammarAccess.getPointAccess().getNameAssignment_2()); 
            // InternalHriDsl.g:1500:2: ( rule__Point__NameAssignment_2 )
            // InternalHriDsl.g:1500:3: rule__Point__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Point__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__2__Impl"


    // $ANTLR start "rule__Point__Group__3"
    // InternalHriDsl.g:1508:1: rule__Point__Group__3 : rule__Point__Group__3__Impl rule__Point__Group__4 ;
    public final void rule__Point__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1512:1: ( rule__Point__Group__3__Impl rule__Point__Group__4 )
            // InternalHriDsl.g:1513:2: rule__Point__Group__3__Impl rule__Point__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Point__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__3"


    // $ANTLR start "rule__Point__Group__3__Impl"
    // InternalHriDsl.g:1520:1: rule__Point__Group__3__Impl : ( 'with' ) ;
    public final void rule__Point__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1524:1: ( ( 'with' ) )
            // InternalHriDsl.g:1525:1: ( 'with' )
            {
            // InternalHriDsl.g:1525:1: ( 'with' )
            // InternalHriDsl.g:1526:2: 'with'
            {
             before(grammarAccess.getPointAccess().getWithKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getWithKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__3__Impl"


    // $ANTLR start "rule__Point__Group__4"
    // InternalHriDsl.g:1535:1: rule__Point__Group__4 : rule__Point__Group__4__Impl rule__Point__Group__5 ;
    public final void rule__Point__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1539:1: ( rule__Point__Group__4__Impl rule__Point__Group__5 )
            // InternalHriDsl.g:1540:2: rule__Point__Group__4__Impl rule__Point__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Point__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__4"


    // $ANTLR start "rule__Point__Group__4__Impl"
    // InternalHriDsl.g:1547:1: rule__Point__Group__4__Impl : ( 'coordinates' ) ;
    public final void rule__Point__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1551:1: ( ( 'coordinates' ) )
            // InternalHriDsl.g:1552:1: ( 'coordinates' )
            {
            // InternalHriDsl.g:1552:1: ( 'coordinates' )
            // InternalHriDsl.g:1553:2: 'coordinates'
            {
             before(grammarAccess.getPointAccess().getCoordinatesKeyword_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getCoordinatesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__4__Impl"


    // $ANTLR start "rule__Point__Group__5"
    // InternalHriDsl.g:1562:1: rule__Point__Group__5 : rule__Point__Group__5__Impl ;
    public final void rule__Point__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1566:1: ( rule__Point__Group__5__Impl )
            // InternalHriDsl.g:1567:2: rule__Point__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__5"


    // $ANTLR start "rule__Point__Group__5__Impl"
    // InternalHriDsl.g:1573:1: rule__Point__Group__5__Impl : ( ( rule__Point__CoordinatesAssignment_5 ) ) ;
    public final void rule__Point__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1577:1: ( ( ( rule__Point__CoordinatesAssignment_5 ) ) )
            // InternalHriDsl.g:1578:1: ( ( rule__Point__CoordinatesAssignment_5 ) )
            {
            // InternalHriDsl.g:1578:1: ( ( rule__Point__CoordinatesAssignment_5 ) )
            // InternalHriDsl.g:1579:2: ( rule__Point__CoordinatesAssignment_5 )
            {
             before(grammarAccess.getPointAccess().getCoordinatesAssignment_5()); 
            // InternalHriDsl.g:1580:2: ( rule__Point__CoordinatesAssignment_5 )
            // InternalHriDsl.g:1580:3: rule__Point__CoordinatesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Point__CoordinatesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getCoordinatesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__5__Impl"


    // $ANTLR start "rule__Robots__Group__0"
    // InternalHriDsl.g:1589:1: rule__Robots__Group__0 : rule__Robots__Group__0__Impl rule__Robots__Group__1 ;
    public final void rule__Robots__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1593:1: ( rule__Robots__Group__0__Impl rule__Robots__Group__1 )
            // InternalHriDsl.g:1594:2: rule__Robots__Group__0__Impl rule__Robots__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Robots__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robots__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robots__Group__0"


    // $ANTLR start "rule__Robots__Group__0__Impl"
    // InternalHriDsl.g:1601:1: rule__Robots__Group__0__Impl : ( 'define' ) ;
    public final void rule__Robots__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1605:1: ( ( 'define' ) )
            // InternalHriDsl.g:1606:1: ( 'define' )
            {
            // InternalHriDsl.g:1606:1: ( 'define' )
            // InternalHriDsl.g:1607:2: 'define'
            {
             before(grammarAccess.getRobotsAccess().getDefineKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getRobotsAccess().getDefineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robots__Group__0__Impl"


    // $ANTLR start "rule__Robots__Group__1"
    // InternalHriDsl.g:1616:1: rule__Robots__Group__1 : rule__Robots__Group__1__Impl rule__Robots__Group__2 ;
    public final void rule__Robots__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1620:1: ( rule__Robots__Group__1__Impl rule__Robots__Group__2 )
            // InternalHriDsl.g:1621:2: rule__Robots__Group__1__Impl rule__Robots__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Robots__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robots__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robots__Group__1"


    // $ANTLR start "rule__Robots__Group__1__Impl"
    // InternalHriDsl.g:1628:1: rule__Robots__Group__1__Impl : ( 'robots' ) ;
    public final void rule__Robots__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1632:1: ( ( 'robots' ) )
            // InternalHriDsl.g:1633:1: ( 'robots' )
            {
            // InternalHriDsl.g:1633:1: ( 'robots' )
            // InternalHriDsl.g:1634:2: 'robots'
            {
             before(grammarAccess.getRobotsAccess().getRobotsKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getRobotsAccess().getRobotsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robots__Group__1__Impl"


    // $ANTLR start "rule__Robots__Group__2"
    // InternalHriDsl.g:1643:1: rule__Robots__Group__2 : rule__Robots__Group__2__Impl rule__Robots__Group__3 ;
    public final void rule__Robots__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1647:1: ( rule__Robots__Group__2__Impl rule__Robots__Group__3 )
            // InternalHriDsl.g:1648:2: rule__Robots__Group__2__Impl rule__Robots__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Robots__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robots__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robots__Group__2"


    // $ANTLR start "rule__Robots__Group__2__Impl"
    // InternalHriDsl.g:1655:1: rule__Robots__Group__2__Impl : ( ':' ) ;
    public final void rule__Robots__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1659:1: ( ( ':' ) )
            // InternalHriDsl.g:1660:1: ( ':' )
            {
            // InternalHriDsl.g:1660:1: ( ':' )
            // InternalHriDsl.g:1661:2: ':'
            {
             before(grammarAccess.getRobotsAccess().getColonKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getRobotsAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robots__Group__2__Impl"


    // $ANTLR start "rule__Robots__Group__3"
    // InternalHriDsl.g:1670:1: rule__Robots__Group__3 : rule__Robots__Group__3__Impl ;
    public final void rule__Robots__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1674:1: ( rule__Robots__Group__3__Impl )
            // InternalHriDsl.g:1675:2: rule__Robots__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robots__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robots__Group__3"


    // $ANTLR start "rule__Robots__Group__3__Impl"
    // InternalHriDsl.g:1681:1: rule__Robots__Group__3__Impl : ( ( ( rule__Robots__RobotsAssignment_3 ) ) ( ( rule__Robots__RobotsAssignment_3 )* ) ) ;
    public final void rule__Robots__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1685:1: ( ( ( ( rule__Robots__RobotsAssignment_3 ) ) ( ( rule__Robots__RobotsAssignment_3 )* ) ) )
            // InternalHriDsl.g:1686:1: ( ( ( rule__Robots__RobotsAssignment_3 ) ) ( ( rule__Robots__RobotsAssignment_3 )* ) )
            {
            // InternalHriDsl.g:1686:1: ( ( ( rule__Robots__RobotsAssignment_3 ) ) ( ( rule__Robots__RobotsAssignment_3 )* ) )
            // InternalHriDsl.g:1687:2: ( ( rule__Robots__RobotsAssignment_3 ) ) ( ( rule__Robots__RobotsAssignment_3 )* )
            {
            // InternalHriDsl.g:1687:2: ( ( rule__Robots__RobotsAssignment_3 ) )
            // InternalHriDsl.g:1688:3: ( rule__Robots__RobotsAssignment_3 )
            {
             before(grammarAccess.getRobotsAccess().getRobotsAssignment_3()); 
            // InternalHriDsl.g:1689:3: ( rule__Robots__RobotsAssignment_3 )
            // InternalHriDsl.g:1689:4: rule__Robots__RobotsAssignment_3
            {
            pushFollow(FOLLOW_23);
            rule__Robots__RobotsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRobotsAccess().getRobotsAssignment_3()); 

            }

            // InternalHriDsl.g:1692:2: ( ( rule__Robots__RobotsAssignment_3 )* )
            // InternalHriDsl.g:1693:3: ( rule__Robots__RobotsAssignment_3 )*
            {
             before(grammarAccess.getRobotsAccess().getRobotsAssignment_3()); 
            // InternalHriDsl.g:1694:3: ( rule__Robots__RobotsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==53) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalHriDsl.g:1694:4: rule__Robots__RobotsAssignment_3
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Robots__RobotsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRobotsAccess().getRobotsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robots__Group__3__Impl"


    // $ANTLR start "rule__Robot__Group__0"
    // InternalHriDsl.g:1704:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1708:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalHriDsl.g:1709:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Robot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__0"


    // $ANTLR start "rule__Robot__Group__0__Impl"
    // InternalHriDsl.g:1716:1: rule__Robot__Group__0__Impl : ( 'robot' ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1720:1: ( ( 'robot' ) )
            // InternalHriDsl.g:1721:1: ( 'robot' )
            {
            // InternalHriDsl.g:1721:1: ( 'robot' )
            // InternalHriDsl.g:1722:2: 'robot'
            {
             before(grammarAccess.getRobotAccess().getRobotKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRobotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__0__Impl"


    // $ANTLR start "rule__Robot__Group__1"
    // InternalHriDsl.g:1731:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1735:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalHriDsl.g:1736:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Robot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__1"


    // $ANTLR start "rule__Robot__Group__1__Impl"
    // InternalHriDsl.g:1743:1: rule__Robot__Group__1__Impl : ( ( rule__Robot__NameAssignment_1 ) ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1747:1: ( ( ( rule__Robot__NameAssignment_1 ) ) )
            // InternalHriDsl.g:1748:1: ( ( rule__Robot__NameAssignment_1 ) )
            {
            // InternalHriDsl.g:1748:1: ( ( rule__Robot__NameAssignment_1 ) )
            // InternalHriDsl.g:1749:2: ( rule__Robot__NameAssignment_1 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_1()); 
            // InternalHriDsl.g:1750:2: ( rule__Robot__NameAssignment_1 )
            // InternalHriDsl.g:1750:3: rule__Robot__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Robot__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__1__Impl"


    // $ANTLR start "rule__Robot__Group__2"
    // InternalHriDsl.g:1758:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl rule__Robot__Group__3 ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1762:1: ( rule__Robot__Group__2__Impl rule__Robot__Group__3 )
            // InternalHriDsl.g:1763:2: rule__Robot__Group__2__Impl rule__Robot__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Robot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__2"


    // $ANTLR start "rule__Robot__Group__2__Impl"
    // InternalHriDsl.g:1770:1: rule__Robot__Group__2__Impl : ( 'with' ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1774:1: ( ( 'with' ) )
            // InternalHriDsl.g:1775:1: ( 'with' )
            {
            // InternalHriDsl.g:1775:1: ( 'with' )
            // InternalHriDsl.g:1776:2: 'with'
            {
             before(grammarAccess.getRobotAccess().getWithKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__2__Impl"


    // $ANTLR start "rule__Robot__Group__3"
    // InternalHriDsl.g:1785:1: rule__Robot__Group__3 : rule__Robot__Group__3__Impl rule__Robot__Group__4 ;
    public final void rule__Robot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1789:1: ( rule__Robot__Group__3__Impl rule__Robot__Group__4 )
            // InternalHriDsl.g:1790:2: rule__Robot__Group__3__Impl rule__Robot__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Robot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__3"


    // $ANTLR start "rule__Robot__Group__3__Impl"
    // InternalHriDsl.g:1797:1: rule__Robot__Group__3__Impl : ( 'coordinates' ) ;
    public final void rule__Robot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1801:1: ( ( 'coordinates' ) )
            // InternalHriDsl.g:1802:1: ( 'coordinates' )
            {
            // InternalHriDsl.g:1802:1: ( 'coordinates' )
            // InternalHriDsl.g:1803:2: 'coordinates'
            {
             before(grammarAccess.getRobotAccess().getCoordinatesKeyword_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getCoordinatesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__3__Impl"


    // $ANTLR start "rule__Robot__Group__4"
    // InternalHriDsl.g:1812:1: rule__Robot__Group__4 : rule__Robot__Group__4__Impl rule__Robot__Group__5 ;
    public final void rule__Robot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1816:1: ( rule__Robot__Group__4__Impl rule__Robot__Group__5 )
            // InternalHriDsl.g:1817:2: rule__Robot__Group__4__Impl rule__Robot__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Robot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__4"


    // $ANTLR start "rule__Robot__Group__4__Impl"
    // InternalHriDsl.g:1824:1: rule__Robot__Group__4__Impl : ( ( rule__Robot__CoordinatesAssignment_4 ) ) ;
    public final void rule__Robot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1828:1: ( ( ( rule__Robot__CoordinatesAssignment_4 ) ) )
            // InternalHriDsl.g:1829:1: ( ( rule__Robot__CoordinatesAssignment_4 ) )
            {
            // InternalHriDsl.g:1829:1: ( ( rule__Robot__CoordinatesAssignment_4 ) )
            // InternalHriDsl.g:1830:2: ( rule__Robot__CoordinatesAssignment_4 )
            {
             before(grammarAccess.getRobotAccess().getCoordinatesAssignment_4()); 
            // InternalHriDsl.g:1831:2: ( rule__Robot__CoordinatesAssignment_4 )
            // InternalHriDsl.g:1831:3: rule__Robot__CoordinatesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Robot__CoordinatesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getCoordinatesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__4__Impl"


    // $ANTLR start "rule__Robot__Group__5"
    // InternalHriDsl.g:1839:1: rule__Robot__Group__5 : rule__Robot__Group__5__Impl rule__Robot__Group__6 ;
    public final void rule__Robot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1843:1: ( rule__Robot__Group__5__Impl rule__Robot__Group__6 )
            // InternalHriDsl.g:1844:2: rule__Robot__Group__5__Impl rule__Robot__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__Robot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__5"


    // $ANTLR start "rule__Robot__Group__5__Impl"
    // InternalHriDsl.g:1851:1: rule__Robot__Group__5__Impl : ( 'type' ) ;
    public final void rule__Robot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1855:1: ( ( 'type' ) )
            // InternalHriDsl.g:1856:1: ( 'type' )
            {
            // InternalHriDsl.g:1856:1: ( 'type' )
            // InternalHriDsl.g:1857:2: 'type'
            {
             before(grammarAccess.getRobotAccess().getTypeKeyword_5()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getTypeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__5__Impl"


    // $ANTLR start "rule__Robot__Group__6"
    // InternalHriDsl.g:1866:1: rule__Robot__Group__6 : rule__Robot__Group__6__Impl rule__Robot__Group__7 ;
    public final void rule__Robot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1870:1: ( rule__Robot__Group__6__Impl rule__Robot__Group__7 )
            // InternalHriDsl.g:1871:2: rule__Robot__Group__6__Impl rule__Robot__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Robot__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__6"


    // $ANTLR start "rule__Robot__Group__6__Impl"
    // InternalHriDsl.g:1878:1: rule__Robot__Group__6__Impl : ( ( rule__Robot__TypeAssignment_6 ) ) ;
    public final void rule__Robot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1882:1: ( ( ( rule__Robot__TypeAssignment_6 ) ) )
            // InternalHriDsl.g:1883:1: ( ( rule__Robot__TypeAssignment_6 ) )
            {
            // InternalHriDsl.g:1883:1: ( ( rule__Robot__TypeAssignment_6 ) )
            // InternalHriDsl.g:1884:2: ( rule__Robot__TypeAssignment_6 )
            {
             before(grammarAccess.getRobotAccess().getTypeAssignment_6()); 
            // InternalHriDsl.g:1885:2: ( rule__Robot__TypeAssignment_6 )
            // InternalHriDsl.g:1885:3: rule__Robot__TypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Robot__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__6__Impl"


    // $ANTLR start "rule__Robot__Group__7"
    // InternalHriDsl.g:1893:1: rule__Robot__Group__7 : rule__Robot__Group__7__Impl rule__Robot__Group__8 ;
    public final void rule__Robot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1897:1: ( rule__Robot__Group__7__Impl rule__Robot__Group__8 )
            // InternalHriDsl.g:1898:2: rule__Robot__Group__7__Impl rule__Robot__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__Robot__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__7"


    // $ANTLR start "rule__Robot__Group__7__Impl"
    // InternalHriDsl.g:1905:1: rule__Robot__Group__7__Impl : ( 'charge_percentage' ) ;
    public final void rule__Robot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1909:1: ( ( 'charge_percentage' ) )
            // InternalHriDsl.g:1910:1: ( 'charge_percentage' )
            {
            // InternalHriDsl.g:1910:1: ( 'charge_percentage' )
            // InternalHriDsl.g:1911:2: 'charge_percentage'
            {
             before(grammarAccess.getRobotAccess().getCharge_percentageKeyword_7()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getCharge_percentageKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__7__Impl"


    // $ANTLR start "rule__Robot__Group__8"
    // InternalHriDsl.g:1920:1: rule__Robot__Group__8 : rule__Robot__Group__8__Impl ;
    public final void rule__Robot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1924:1: ( rule__Robot__Group__8__Impl )
            // InternalHriDsl.g:1925:2: rule__Robot__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__8"


    // $ANTLR start "rule__Robot__Group__8__Impl"
    // InternalHriDsl.g:1931:1: rule__Robot__Group__8__Impl : ( ( rule__Robot__Charge_percentageAssignment_8 ) ) ;
    public final void rule__Robot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1935:1: ( ( ( rule__Robot__Charge_percentageAssignment_8 ) ) )
            // InternalHriDsl.g:1936:1: ( ( rule__Robot__Charge_percentageAssignment_8 ) )
            {
            // InternalHriDsl.g:1936:1: ( ( rule__Robot__Charge_percentageAssignment_8 ) )
            // InternalHriDsl.g:1937:2: ( rule__Robot__Charge_percentageAssignment_8 )
            {
             before(grammarAccess.getRobotAccess().getCharge_percentageAssignment_8()); 
            // InternalHriDsl.g:1938:2: ( rule__Robot__Charge_percentageAssignment_8 )
            // InternalHriDsl.g:1938:3: rule__Robot__Charge_percentageAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Charge_percentageAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getCharge_percentageAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__8__Impl"


    // $ANTLR start "rule__Humans__Group__0"
    // InternalHriDsl.g:1947:1: rule__Humans__Group__0 : rule__Humans__Group__0__Impl rule__Humans__Group__1 ;
    public final void rule__Humans__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1951:1: ( rule__Humans__Group__0__Impl rule__Humans__Group__1 )
            // InternalHriDsl.g:1952:2: rule__Humans__Group__0__Impl rule__Humans__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Humans__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Humans__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Humans__Group__0"


    // $ANTLR start "rule__Humans__Group__0__Impl"
    // InternalHriDsl.g:1959:1: rule__Humans__Group__0__Impl : ( 'define' ) ;
    public final void rule__Humans__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1963:1: ( ( 'define' ) )
            // InternalHriDsl.g:1964:1: ( 'define' )
            {
            // InternalHriDsl.g:1964:1: ( 'define' )
            // InternalHriDsl.g:1965:2: 'define'
            {
             before(grammarAccess.getHumansAccess().getDefineKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getHumansAccess().getDefineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Humans__Group__0__Impl"


    // $ANTLR start "rule__Humans__Group__1"
    // InternalHriDsl.g:1974:1: rule__Humans__Group__1 : rule__Humans__Group__1__Impl rule__Humans__Group__2 ;
    public final void rule__Humans__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1978:1: ( rule__Humans__Group__1__Impl rule__Humans__Group__2 )
            // InternalHriDsl.g:1979:2: rule__Humans__Group__1__Impl rule__Humans__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Humans__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Humans__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Humans__Group__1"


    // $ANTLR start "rule__Humans__Group__1__Impl"
    // InternalHriDsl.g:1986:1: rule__Humans__Group__1__Impl : ( 'humans' ) ;
    public final void rule__Humans__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1990:1: ( ( 'humans' ) )
            // InternalHriDsl.g:1991:1: ( 'humans' )
            {
            // InternalHriDsl.g:1991:1: ( 'humans' )
            // InternalHriDsl.g:1992:2: 'humans'
            {
             before(grammarAccess.getHumansAccess().getHumansKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getHumansAccess().getHumansKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Humans__Group__1__Impl"


    // $ANTLR start "rule__Humans__Group__2"
    // InternalHriDsl.g:2001:1: rule__Humans__Group__2 : rule__Humans__Group__2__Impl rule__Humans__Group__3 ;
    public final void rule__Humans__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2005:1: ( rule__Humans__Group__2__Impl rule__Humans__Group__3 )
            // InternalHriDsl.g:2006:2: rule__Humans__Group__2__Impl rule__Humans__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Humans__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Humans__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Humans__Group__2"


    // $ANTLR start "rule__Humans__Group__2__Impl"
    // InternalHriDsl.g:2013:1: rule__Humans__Group__2__Impl : ( ':' ) ;
    public final void rule__Humans__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2017:1: ( ( ':' ) )
            // InternalHriDsl.g:2018:1: ( ':' )
            {
            // InternalHriDsl.g:2018:1: ( ':' )
            // InternalHriDsl.g:2019:2: ':'
            {
             before(grammarAccess.getHumansAccess().getColonKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getHumansAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Humans__Group__2__Impl"


    // $ANTLR start "rule__Humans__Group__3"
    // InternalHriDsl.g:2028:1: rule__Humans__Group__3 : rule__Humans__Group__3__Impl ;
    public final void rule__Humans__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2032:1: ( rule__Humans__Group__3__Impl )
            // InternalHriDsl.g:2033:2: rule__Humans__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Humans__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Humans__Group__3"


    // $ANTLR start "rule__Humans__Group__3__Impl"
    // InternalHriDsl.g:2039:1: rule__Humans__Group__3__Impl : ( ( ( rule__Humans__HumansAssignment_3 ) ) ( ( rule__Humans__HumansAssignment_3 )* ) ) ;
    public final void rule__Humans__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2043:1: ( ( ( ( rule__Humans__HumansAssignment_3 ) ) ( ( rule__Humans__HumansAssignment_3 )* ) ) )
            // InternalHriDsl.g:2044:1: ( ( ( rule__Humans__HumansAssignment_3 ) ) ( ( rule__Humans__HumansAssignment_3 )* ) )
            {
            // InternalHriDsl.g:2044:1: ( ( ( rule__Humans__HumansAssignment_3 ) ) ( ( rule__Humans__HumansAssignment_3 )* ) )
            // InternalHriDsl.g:2045:2: ( ( rule__Humans__HumansAssignment_3 ) ) ( ( rule__Humans__HumansAssignment_3 )* )
            {
            // InternalHriDsl.g:2045:2: ( ( rule__Humans__HumansAssignment_3 ) )
            // InternalHriDsl.g:2046:3: ( rule__Humans__HumansAssignment_3 )
            {
             before(grammarAccess.getHumansAccess().getHumansAssignment_3()); 
            // InternalHriDsl.g:2047:3: ( rule__Humans__HumansAssignment_3 )
            // InternalHriDsl.g:2047:4: rule__Humans__HumansAssignment_3
            {
            pushFollow(FOLLOW_30);
            rule__Humans__HumansAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHumansAccess().getHumansAssignment_3()); 

            }

            // InternalHriDsl.g:2050:2: ( ( rule__Humans__HumansAssignment_3 )* )
            // InternalHriDsl.g:2051:3: ( rule__Humans__HumansAssignment_3 )*
            {
             before(grammarAccess.getHumansAccess().getHumansAssignment_3()); 
            // InternalHriDsl.g:2052:3: ( rule__Humans__HumansAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==57) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalHriDsl.g:2052:4: rule__Humans__HumansAssignment_3
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Humans__HumansAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getHumansAccess().getHumansAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Humans__Group__3__Impl"


    // $ANTLR start "rule__Human__Group__0"
    // InternalHriDsl.g:2062:1: rule__Human__Group__0 : rule__Human__Group__0__Impl rule__Human__Group__1 ;
    public final void rule__Human__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2066:1: ( rule__Human__Group__0__Impl rule__Human__Group__1 )
            // InternalHriDsl.g:2067:2: rule__Human__Group__0__Impl rule__Human__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Human__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Human__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__0"


    // $ANTLR start "rule__Human__Group__0__Impl"
    // InternalHriDsl.g:2074:1: rule__Human__Group__0__Impl : ( 'human' ) ;
    public final void rule__Human__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2078:1: ( ( 'human' ) )
            // InternalHriDsl.g:2079:1: ( 'human' )
            {
            // InternalHriDsl.g:2079:1: ( 'human' )
            // InternalHriDsl.g:2080:2: 'human'
            {
             before(grammarAccess.getHumanAccess().getHumanKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getHumanAccess().getHumanKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__0__Impl"


    // $ANTLR start "rule__Human__Group__1"
    // InternalHriDsl.g:2089:1: rule__Human__Group__1 : rule__Human__Group__1__Impl rule__Human__Group__2 ;
    public final void rule__Human__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2093:1: ( rule__Human__Group__1__Impl rule__Human__Group__2 )
            // InternalHriDsl.g:2094:2: rule__Human__Group__1__Impl rule__Human__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Human__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Human__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__1"


    // $ANTLR start "rule__Human__Group__1__Impl"
    // InternalHriDsl.g:2101:1: rule__Human__Group__1__Impl : ( ( rule__Human__NameAssignment_1 ) ) ;
    public final void rule__Human__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2105:1: ( ( ( rule__Human__NameAssignment_1 ) ) )
            // InternalHriDsl.g:2106:1: ( ( rule__Human__NameAssignment_1 ) )
            {
            // InternalHriDsl.g:2106:1: ( ( rule__Human__NameAssignment_1 ) )
            // InternalHriDsl.g:2107:2: ( rule__Human__NameAssignment_1 )
            {
             before(grammarAccess.getHumanAccess().getNameAssignment_1()); 
            // InternalHriDsl.g:2108:2: ( rule__Human__NameAssignment_1 )
            // InternalHriDsl.g:2108:3: rule__Human__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Human__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHumanAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__1__Impl"


    // $ANTLR start "rule__Human__Group__2"
    // InternalHriDsl.g:2116:1: rule__Human__Group__2 : rule__Human__Group__2__Impl rule__Human__Group__3 ;
    public final void rule__Human__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2120:1: ( rule__Human__Group__2__Impl rule__Human__Group__3 )
            // InternalHriDsl.g:2121:2: rule__Human__Group__2__Impl rule__Human__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Human__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Human__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__2"


    // $ANTLR start "rule__Human__Group__2__Impl"
    // InternalHriDsl.g:2128:1: rule__Human__Group__2__Impl : ( 'with' ) ;
    public final void rule__Human__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2132:1: ( ( 'with' ) )
            // InternalHriDsl.g:2133:1: ( 'with' )
            {
            // InternalHriDsl.g:2133:1: ( 'with' )
            // InternalHriDsl.g:2134:2: 'with'
            {
             before(grammarAccess.getHumanAccess().getWithKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getHumanAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__2__Impl"


    // $ANTLR start "rule__Human__Group__3"
    // InternalHriDsl.g:2143:1: rule__Human__Group__3 : rule__Human__Group__3__Impl rule__Human__Group__4 ;
    public final void rule__Human__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2147:1: ( rule__Human__Group__3__Impl rule__Human__Group__4 )
            // InternalHriDsl.g:2148:2: rule__Human__Group__3__Impl rule__Human__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Human__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Human__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__3"


    // $ANTLR start "rule__Human__Group__3__Impl"
    // InternalHriDsl.g:2155:1: rule__Human__Group__3__Impl : ( 'coordinates' ) ;
    public final void rule__Human__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2159:1: ( ( 'coordinates' ) )
            // InternalHriDsl.g:2160:1: ( 'coordinates' )
            {
            // InternalHriDsl.g:2160:1: ( 'coordinates' )
            // InternalHriDsl.g:2161:2: 'coordinates'
            {
             before(grammarAccess.getHumanAccess().getCoordinatesKeyword_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getHumanAccess().getCoordinatesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__3__Impl"


    // $ANTLR start "rule__Human__Group__4"
    // InternalHriDsl.g:2170:1: rule__Human__Group__4 : rule__Human__Group__4__Impl rule__Human__Group__5 ;
    public final void rule__Human__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2174:1: ( rule__Human__Group__4__Impl rule__Human__Group__5 )
            // InternalHriDsl.g:2175:2: rule__Human__Group__4__Impl rule__Human__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__Human__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Human__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__4"


    // $ANTLR start "rule__Human__Group__4__Impl"
    // InternalHriDsl.g:2182:1: rule__Human__Group__4__Impl : ( ( rule__Human__CoordinatesAssignment_4 ) ) ;
    public final void rule__Human__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2186:1: ( ( ( rule__Human__CoordinatesAssignment_4 ) ) )
            // InternalHriDsl.g:2187:1: ( ( rule__Human__CoordinatesAssignment_4 ) )
            {
            // InternalHriDsl.g:2187:1: ( ( rule__Human__CoordinatesAssignment_4 ) )
            // InternalHriDsl.g:2188:2: ( rule__Human__CoordinatesAssignment_4 )
            {
             before(grammarAccess.getHumanAccess().getCoordinatesAssignment_4()); 
            // InternalHriDsl.g:2189:2: ( rule__Human__CoordinatesAssignment_4 )
            // InternalHriDsl.g:2189:3: rule__Human__CoordinatesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Human__CoordinatesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHumanAccess().getCoordinatesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__4__Impl"


    // $ANTLR start "rule__Human__Group__5"
    // InternalHriDsl.g:2197:1: rule__Human__Group__5 : rule__Human__Group__5__Impl rule__Human__Group__6 ;
    public final void rule__Human__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2201:1: ( rule__Human__Group__5__Impl rule__Human__Group__6 )
            // InternalHriDsl.g:2202:2: rule__Human__Group__5__Impl rule__Human__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__Human__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Human__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__5"


    // $ANTLR start "rule__Human__Group__5__Impl"
    // InternalHriDsl.g:2209:1: rule__Human__Group__5__Impl : ( 'speed' ) ;
    public final void rule__Human__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2213:1: ( ( 'speed' ) )
            // InternalHriDsl.g:2214:1: ( 'speed' )
            {
            // InternalHriDsl.g:2214:1: ( 'speed' )
            // InternalHriDsl.g:2215:2: 'speed'
            {
             before(grammarAccess.getHumanAccess().getSpeedKeyword_5()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getHumanAccess().getSpeedKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__5__Impl"


    // $ANTLR start "rule__Human__Group__6"
    // InternalHriDsl.g:2224:1: rule__Human__Group__6 : rule__Human__Group__6__Impl rule__Human__Group__7 ;
    public final void rule__Human__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2228:1: ( rule__Human__Group__6__Impl rule__Human__Group__7 )
            // InternalHriDsl.g:2229:2: rule__Human__Group__6__Impl rule__Human__Group__7
            {
            pushFollow(FOLLOW_33);
            rule__Human__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Human__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__6"


    // $ANTLR start "rule__Human__Group__6__Impl"
    // InternalHriDsl.g:2236:1: rule__Human__Group__6__Impl : ( ( rule__Human__SpeedAssignment_6 ) ) ;
    public final void rule__Human__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2240:1: ( ( ( rule__Human__SpeedAssignment_6 ) ) )
            // InternalHriDsl.g:2241:1: ( ( rule__Human__SpeedAssignment_6 ) )
            {
            // InternalHriDsl.g:2241:1: ( ( rule__Human__SpeedAssignment_6 ) )
            // InternalHriDsl.g:2242:2: ( rule__Human__SpeedAssignment_6 )
            {
             before(grammarAccess.getHumanAccess().getSpeedAssignment_6()); 
            // InternalHriDsl.g:2243:2: ( rule__Human__SpeedAssignment_6 )
            // InternalHriDsl.g:2243:3: rule__Human__SpeedAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Human__SpeedAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getHumanAccess().getSpeedAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__6__Impl"


    // $ANTLR start "rule__Human__Group__7"
    // InternalHriDsl.g:2251:1: rule__Human__Group__7 : rule__Human__Group__7__Impl rule__Human__Group__8 ;
    public final void rule__Human__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2255:1: ( rule__Human__Group__7__Impl rule__Human__Group__8 )
            // InternalHriDsl.g:2256:2: rule__Human__Group__7__Impl rule__Human__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__Human__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Human__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__7"


    // $ANTLR start "rule__Human__Group__7__Impl"
    // InternalHriDsl.g:2263:1: rule__Human__Group__7__Impl : ( 'dexterity' ) ;
    public final void rule__Human__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2267:1: ( ( 'dexterity' ) )
            // InternalHriDsl.g:2268:1: ( 'dexterity' )
            {
            // InternalHriDsl.g:2268:1: ( 'dexterity' )
            // InternalHriDsl.g:2269:2: 'dexterity'
            {
             before(grammarAccess.getHumanAccess().getDexterityKeyword_7()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getHumanAccess().getDexterityKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__7__Impl"


    // $ANTLR start "rule__Human__Group__8"
    // InternalHriDsl.g:2278:1: rule__Human__Group__8 : rule__Human__Group__8__Impl rule__Human__Group__9 ;
    public final void rule__Human__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2282:1: ( rule__Human__Group__8__Impl rule__Human__Group__9 )
            // InternalHriDsl.g:2283:2: rule__Human__Group__8__Impl rule__Human__Group__9
            {
            pushFollow(FOLLOW_34);
            rule__Human__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Human__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__8"


    // $ANTLR start "rule__Human__Group__8__Impl"
    // InternalHriDsl.g:2290:1: rule__Human__Group__8__Impl : ( ( rule__Human__DextAssignment_8 ) ) ;
    public final void rule__Human__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2294:1: ( ( ( rule__Human__DextAssignment_8 ) ) )
            // InternalHriDsl.g:2295:1: ( ( rule__Human__DextAssignment_8 ) )
            {
            // InternalHriDsl.g:2295:1: ( ( rule__Human__DextAssignment_8 ) )
            // InternalHriDsl.g:2296:2: ( rule__Human__DextAssignment_8 )
            {
             before(grammarAccess.getHumanAccess().getDextAssignment_8()); 
            // InternalHriDsl.g:2297:2: ( rule__Human__DextAssignment_8 )
            // InternalHriDsl.g:2297:3: rule__Human__DextAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Human__DextAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getHumanAccess().getDextAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__8__Impl"


    // $ANTLR start "rule__Human__Group__9"
    // InternalHriDsl.g:2305:1: rule__Human__Group__9 : rule__Human__Group__9__Impl rule__Human__Group__10 ;
    public final void rule__Human__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2309:1: ( rule__Human__Group__9__Impl rule__Human__Group__10 )
            // InternalHriDsl.g:2310:2: rule__Human__Group__9__Impl rule__Human__Group__10
            {
            pushFollow(FOLLOW_35);
            rule__Human__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Human__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__9"


    // $ANTLR start "rule__Human__Group__9__Impl"
    // InternalHriDsl.g:2317:1: rule__Human__Group__9__Impl : ( 'fatigue_profile' ) ;
    public final void rule__Human__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2321:1: ( ( 'fatigue_profile' ) )
            // InternalHriDsl.g:2322:1: ( 'fatigue_profile' )
            {
            // InternalHriDsl.g:2322:1: ( 'fatigue_profile' )
            // InternalHriDsl.g:2323:2: 'fatigue_profile'
            {
             before(grammarAccess.getHumanAccess().getFatigue_profileKeyword_9()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getHumanAccess().getFatigue_profileKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__9__Impl"


    // $ANTLR start "rule__Human__Group__10"
    // InternalHriDsl.g:2332:1: rule__Human__Group__10 : rule__Human__Group__10__Impl rule__Human__Group__11 ;
    public final void rule__Human__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2336:1: ( rule__Human__Group__10__Impl rule__Human__Group__11 )
            // InternalHriDsl.g:2337:2: rule__Human__Group__10__Impl rule__Human__Group__11
            {
            pushFollow(FOLLOW_36);
            rule__Human__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Human__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__10"


    // $ANTLR start "rule__Human__Group__10__Impl"
    // InternalHriDsl.g:2344:1: rule__Human__Group__10__Impl : ( ( rule__Human__Fatigue_profileAssignment_10 ) ) ;
    public final void rule__Human__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2348:1: ( ( ( rule__Human__Fatigue_profileAssignment_10 ) ) )
            // InternalHriDsl.g:2349:1: ( ( rule__Human__Fatigue_profileAssignment_10 ) )
            {
            // InternalHriDsl.g:2349:1: ( ( rule__Human__Fatigue_profileAssignment_10 ) )
            // InternalHriDsl.g:2350:2: ( rule__Human__Fatigue_profileAssignment_10 )
            {
             before(grammarAccess.getHumanAccess().getFatigue_profileAssignment_10()); 
            // InternalHriDsl.g:2351:2: ( rule__Human__Fatigue_profileAssignment_10 )
            // InternalHriDsl.g:2351:3: rule__Human__Fatigue_profileAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Human__Fatigue_profileAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getHumanAccess().getFatigue_profileAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__10__Impl"


    // $ANTLR start "rule__Human__Group__11"
    // InternalHriDsl.g:2359:1: rule__Human__Group__11 : rule__Human__Group__11__Impl rule__Human__Group__12 ;
    public final void rule__Human__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2363:1: ( rule__Human__Group__11__Impl rule__Human__Group__12 )
            // InternalHriDsl.g:2364:2: rule__Human__Group__11__Impl rule__Human__Group__12
            {
            pushFollow(FOLLOW_37);
            rule__Human__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Human__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__11"


    // $ANTLR start "rule__Human__Group__11__Impl"
    // InternalHriDsl.g:2371:1: rule__Human__Group__11__Impl : ( 'free_will_profile' ) ;
    public final void rule__Human__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2375:1: ( ( 'free_will_profile' ) )
            // InternalHriDsl.g:2376:1: ( 'free_will_profile' )
            {
            // InternalHriDsl.g:2376:1: ( 'free_will_profile' )
            // InternalHriDsl.g:2377:2: 'free_will_profile'
            {
             before(grammarAccess.getHumanAccess().getFree_will_profileKeyword_11()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getHumanAccess().getFree_will_profileKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__11__Impl"


    // $ANTLR start "rule__Human__Group__12"
    // InternalHriDsl.g:2386:1: rule__Human__Group__12 : rule__Human__Group__12__Impl ;
    public final void rule__Human__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2390:1: ( rule__Human__Group__12__Impl )
            // InternalHriDsl.g:2391:2: rule__Human__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Human__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__12"


    // $ANTLR start "rule__Human__Group__12__Impl"
    // InternalHriDsl.g:2397:1: rule__Human__Group__12__Impl : ( ( rule__Human__Free_will_profileAssignment_12 ) ) ;
    public final void rule__Human__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2401:1: ( ( ( rule__Human__Free_will_profileAssignment_12 ) ) )
            // InternalHriDsl.g:2402:1: ( ( rule__Human__Free_will_profileAssignment_12 ) )
            {
            // InternalHriDsl.g:2402:1: ( ( rule__Human__Free_will_profileAssignment_12 ) )
            // InternalHriDsl.g:2403:2: ( rule__Human__Free_will_profileAssignment_12 )
            {
             before(grammarAccess.getHumanAccess().getFree_will_profileAssignment_12()); 
            // InternalHriDsl.g:2404:2: ( rule__Human__Free_will_profileAssignment_12 )
            // InternalHriDsl.g:2404:3: rule__Human__Free_will_profileAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Human__Free_will_profileAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getHumanAccess().getFree_will_profileAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Group__12__Impl"


    // $ANTLR start "rule__Mission__Group__0"
    // InternalHriDsl.g:2413:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2417:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalHriDsl.g:2418:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Mission__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__0"


    // $ANTLR start "rule__Mission__Group__0__Impl"
    // InternalHriDsl.g:2425:1: rule__Mission__Group__0__Impl : ( 'define' ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2429:1: ( ( 'define' ) )
            // InternalHriDsl.g:2430:1: ( 'define' )
            {
            // InternalHriDsl.g:2430:1: ( 'define' )
            // InternalHriDsl.g:2431:2: 'define'
            {
             before(grammarAccess.getMissionAccess().getDefineKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getDefineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__0__Impl"


    // $ANTLR start "rule__Mission__Group__1"
    // InternalHriDsl.g:2440:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl rule__Mission__Group__2 ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2444:1: ( rule__Mission__Group__1__Impl rule__Mission__Group__2 )
            // InternalHriDsl.g:2445:2: rule__Mission__Group__1__Impl rule__Mission__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Mission__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__1"


    // $ANTLR start "rule__Mission__Group__1__Impl"
    // InternalHriDsl.g:2452:1: rule__Mission__Group__1__Impl : ( 'mission' ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2456:1: ( ( 'mission' ) )
            // InternalHriDsl.g:2457:1: ( 'mission' )
            {
            // InternalHriDsl.g:2457:1: ( 'mission' )
            // InternalHriDsl.g:2458:2: 'mission'
            {
             before(grammarAccess.getMissionAccess().getMissionKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getMissionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__1__Impl"


    // $ANTLR start "rule__Mission__Group__2"
    // InternalHriDsl.g:2467:1: rule__Mission__Group__2 : rule__Mission__Group__2__Impl rule__Mission__Group__3 ;
    public final void rule__Mission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2471:1: ( rule__Mission__Group__2__Impl rule__Mission__Group__3 )
            // InternalHriDsl.g:2472:2: rule__Mission__Group__2__Impl rule__Mission__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Mission__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__2"


    // $ANTLR start "rule__Mission__Group__2__Impl"
    // InternalHriDsl.g:2479:1: rule__Mission__Group__2__Impl : ( ( rule__Mission__NameAssignment_2 ) ) ;
    public final void rule__Mission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2483:1: ( ( ( rule__Mission__NameAssignment_2 ) ) )
            // InternalHriDsl.g:2484:1: ( ( rule__Mission__NameAssignment_2 ) )
            {
            // InternalHriDsl.g:2484:1: ( ( rule__Mission__NameAssignment_2 ) )
            // InternalHriDsl.g:2485:2: ( rule__Mission__NameAssignment_2 )
            {
             before(grammarAccess.getMissionAccess().getNameAssignment_2()); 
            // InternalHriDsl.g:2486:2: ( rule__Mission__NameAssignment_2 )
            // InternalHriDsl.g:2486:3: rule__Mission__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Mission__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__2__Impl"


    // $ANTLR start "rule__Mission__Group__3"
    // InternalHriDsl.g:2494:1: rule__Mission__Group__3 : rule__Mission__Group__3__Impl rule__Mission__Group__4 ;
    public final void rule__Mission__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2498:1: ( rule__Mission__Group__3__Impl rule__Mission__Group__4 )
            // InternalHriDsl.g:2499:2: rule__Mission__Group__3__Impl rule__Mission__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__Mission__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__3"


    // $ANTLR start "rule__Mission__Group__3__Impl"
    // InternalHriDsl.g:2506:1: rule__Mission__Group__3__Impl : ( ':' ) ;
    public final void rule__Mission__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2510:1: ( ( ':' ) )
            // InternalHriDsl.g:2511:1: ( ':' )
            {
            // InternalHriDsl.g:2511:1: ( ':' )
            // InternalHriDsl.g:2512:2: ':'
            {
             before(grammarAccess.getMissionAccess().getColonKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__3__Impl"


    // $ANTLR start "rule__Mission__Group__4"
    // InternalHriDsl.g:2521:1: rule__Mission__Group__4 : rule__Mission__Group__4__Impl rule__Mission__Group__5 ;
    public final void rule__Mission__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2525:1: ( rule__Mission__Group__4__Impl rule__Mission__Group__5 )
            // InternalHriDsl.g:2526:2: rule__Mission__Group__4__Impl rule__Mission__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Mission__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__4"


    // $ANTLR start "rule__Mission__Group__4__Impl"
    // InternalHriDsl.g:2533:1: rule__Mission__Group__4__Impl : ( ( ( rule__Mission__AssignmentsAssignment_4 ) ) ( ( rule__Mission__AssignmentsAssignment_4 )* ) ) ;
    public final void rule__Mission__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2537:1: ( ( ( ( rule__Mission__AssignmentsAssignment_4 ) ) ( ( rule__Mission__AssignmentsAssignment_4 )* ) ) )
            // InternalHriDsl.g:2538:1: ( ( ( rule__Mission__AssignmentsAssignment_4 ) ) ( ( rule__Mission__AssignmentsAssignment_4 )* ) )
            {
            // InternalHriDsl.g:2538:1: ( ( ( rule__Mission__AssignmentsAssignment_4 ) ) ( ( rule__Mission__AssignmentsAssignment_4 )* ) )
            // InternalHriDsl.g:2539:2: ( ( rule__Mission__AssignmentsAssignment_4 ) ) ( ( rule__Mission__AssignmentsAssignment_4 )* )
            {
            // InternalHriDsl.g:2539:2: ( ( rule__Mission__AssignmentsAssignment_4 ) )
            // InternalHriDsl.g:2540:3: ( rule__Mission__AssignmentsAssignment_4 )
            {
             before(grammarAccess.getMissionAccess().getAssignmentsAssignment_4()); 
            // InternalHriDsl.g:2541:3: ( rule__Mission__AssignmentsAssignment_4 )
            // InternalHriDsl.g:2541:4: rule__Mission__AssignmentsAssignment_4
            {
            pushFollow(FOLLOW_40);
            rule__Mission__AssignmentsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getAssignmentsAssignment_4()); 

            }

            // InternalHriDsl.g:2544:2: ( ( rule__Mission__AssignmentsAssignment_4 )* )
            // InternalHriDsl.g:2545:3: ( rule__Mission__AssignmentsAssignment_4 )*
            {
             before(grammarAccess.getMissionAccess().getAssignmentsAssignment_4()); 
            // InternalHriDsl.g:2546:3: ( rule__Mission__AssignmentsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==63) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalHriDsl.g:2546:4: rule__Mission__AssignmentsAssignment_4
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__Mission__AssignmentsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getAssignmentsAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__4__Impl"


    // $ANTLR start "rule__Mission__Group__5"
    // InternalHriDsl.g:2555:1: rule__Mission__Group__5 : rule__Mission__Group__5__Impl ;
    public final void rule__Mission__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2559:1: ( rule__Mission__Group__5__Impl )
            // InternalHriDsl.g:2560:2: rule__Mission__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__5"


    // $ANTLR start "rule__Mission__Group__5__Impl"
    // InternalHriDsl.g:2566:1: rule__Mission__Group__5__Impl : ( ( rule__Mission__QueriesAssignment_5 ) ) ;
    public final void rule__Mission__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2570:1: ( ( ( rule__Mission__QueriesAssignment_5 ) ) )
            // InternalHriDsl.g:2571:1: ( ( rule__Mission__QueriesAssignment_5 ) )
            {
            // InternalHriDsl.g:2571:1: ( ( rule__Mission__QueriesAssignment_5 ) )
            // InternalHriDsl.g:2572:2: ( rule__Mission__QueriesAssignment_5 )
            {
             before(grammarAccess.getMissionAccess().getQueriesAssignment_5()); 
            // InternalHriDsl.g:2573:2: ( rule__Mission__QueriesAssignment_5 )
            // InternalHriDsl.g:2573:3: rule__Mission__QueriesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Mission__QueriesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getQueriesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__5__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalHriDsl.g:2582:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2586:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalHriDsl.g:2587:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalHriDsl.g:2594:1: rule__Assignment__Group__0__Impl : ( 'do' ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2598:1: ( ( 'do' ) )
            // InternalHriDsl.g:2599:1: ( 'do' )
            {
            // InternalHriDsl.g:2599:1: ( 'do' )
            // InternalHriDsl.g:2600:2: 'do'
            {
             before(grammarAccess.getAssignmentAccess().getDoKeyword_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getDoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalHriDsl.g:2609:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2613:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalHriDsl.g:2614:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalHriDsl.g:2621:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__PatternAssignment_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2625:1: ( ( ( rule__Assignment__PatternAssignment_1 ) ) )
            // InternalHriDsl.g:2626:1: ( ( rule__Assignment__PatternAssignment_1 ) )
            {
            // InternalHriDsl.g:2626:1: ( ( rule__Assignment__PatternAssignment_1 ) )
            // InternalHriDsl.g:2627:2: ( rule__Assignment__PatternAssignment_1 )
            {
             before(grammarAccess.getAssignmentAccess().getPatternAssignment_1()); 
            // InternalHriDsl.g:2628:2: ( rule__Assignment__PatternAssignment_1 )
            // InternalHriDsl.g:2628:3: rule__Assignment__PatternAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__PatternAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getPatternAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalHriDsl.g:2636:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2640:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // InternalHriDsl.g:2641:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Assignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalHriDsl.g:2648:1: rule__Assignment__Group__2__Impl : ( 'for' ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2652:1: ( ( 'for' ) )
            // InternalHriDsl.g:2653:1: ( 'for' )
            {
            // InternalHriDsl.g:2653:1: ( 'for' )
            // InternalHriDsl.g:2654:2: 'for'
            {
             before(grammarAccess.getAssignmentAccess().getForKeyword_2()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getForKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Assignment__Group__3"
    // InternalHriDsl.g:2663:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl rule__Assignment__Group__4 ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2667:1: ( rule__Assignment__Group__3__Impl rule__Assignment__Group__4 )
            // InternalHriDsl.g:2668:2: rule__Assignment__Group__3__Impl rule__Assignment__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Assignment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3"


    // $ANTLR start "rule__Assignment__Group__3__Impl"
    // InternalHriDsl.g:2675:1: rule__Assignment__Group__3__Impl : ( ( rule__Assignment__ClientAssignment_3 ) ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2679:1: ( ( ( rule__Assignment__ClientAssignment_3 ) ) )
            // InternalHriDsl.g:2680:1: ( ( rule__Assignment__ClientAssignment_3 ) )
            {
            // InternalHriDsl.g:2680:1: ( ( rule__Assignment__ClientAssignment_3 ) )
            // InternalHriDsl.g:2681:2: ( rule__Assignment__ClientAssignment_3 )
            {
             before(grammarAccess.getAssignmentAccess().getClientAssignment_3()); 
            // InternalHriDsl.g:2682:2: ( rule__Assignment__ClientAssignment_3 )
            // InternalHriDsl.g:2682:3: rule__Assignment__ClientAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ClientAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getClientAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3__Impl"


    // $ANTLR start "rule__Assignment__Group__4"
    // InternalHriDsl.g:2690:1: rule__Assignment__Group__4 : rule__Assignment__Group__4__Impl rule__Assignment__Group__5 ;
    public final void rule__Assignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2694:1: ( rule__Assignment__Group__4__Impl rule__Assignment__Group__5 )
            // InternalHriDsl.g:2695:2: rule__Assignment__Group__4__Impl rule__Assignment__Group__5
            {
            pushFollow(FOLLOW_43);
            rule__Assignment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__4"


    // $ANTLR start "rule__Assignment__Group__4__Impl"
    // InternalHriDsl.g:2702:1: rule__Assignment__Group__4__Impl : ( 'with' ) ;
    public final void rule__Assignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2706:1: ( ( 'with' ) )
            // InternalHriDsl.g:2707:1: ( 'with' )
            {
            // InternalHriDsl.g:2707:1: ( 'with' )
            // InternalHriDsl.g:2708:2: 'with'
            {
             before(grammarAccess.getAssignmentAccess().getWithKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getWithKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__4__Impl"


    // $ANTLR start "rule__Assignment__Group__5"
    // InternalHriDsl.g:2717:1: rule__Assignment__Group__5 : rule__Assignment__Group__5__Impl rule__Assignment__Group__6 ;
    public final void rule__Assignment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2721:1: ( rule__Assignment__Group__5__Impl rule__Assignment__Group__6 )
            // InternalHriDsl.g:2722:2: rule__Assignment__Group__5__Impl rule__Assignment__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Assignment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__5"


    // $ANTLR start "rule__Assignment__Group__5__Impl"
    // InternalHriDsl.g:2729:1: rule__Assignment__Group__5__Impl : ( 'target' ) ;
    public final void rule__Assignment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2733:1: ( ( 'target' ) )
            // InternalHriDsl.g:2734:1: ( 'target' )
            {
            // InternalHriDsl.g:2734:1: ( 'target' )
            // InternalHriDsl.g:2735:2: 'target'
            {
             before(grammarAccess.getAssignmentAccess().getTargetKeyword_5()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getTargetKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__5__Impl"


    // $ANTLR start "rule__Assignment__Group__6"
    // InternalHriDsl.g:2744:1: rule__Assignment__Group__6 : rule__Assignment__Group__6__Impl ;
    public final void rule__Assignment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2748:1: ( rule__Assignment__Group__6__Impl )
            // InternalHriDsl.g:2749:2: rule__Assignment__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__6"


    // $ANTLR start "rule__Assignment__Group__6__Impl"
    // InternalHriDsl.g:2755:1: rule__Assignment__Group__6__Impl : ( ( rule__Assignment__TargetAssignment_6 ) ) ;
    public final void rule__Assignment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2759:1: ( ( ( rule__Assignment__TargetAssignment_6 ) ) )
            // InternalHriDsl.g:2760:1: ( ( rule__Assignment__TargetAssignment_6 ) )
            {
            // InternalHriDsl.g:2760:1: ( ( rule__Assignment__TargetAssignment_6 ) )
            // InternalHriDsl.g:2761:2: ( rule__Assignment__TargetAssignment_6 )
            {
             before(grammarAccess.getAssignmentAccess().getTargetAssignment_6()); 
            // InternalHriDsl.g:2762:2: ( rule__Assignment__TargetAssignment_6 )
            // InternalHriDsl.g:2762:3: rule__Assignment__TargetAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__TargetAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getTargetAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__6__Impl"


    // $ANTLR start "rule__Queries__Group__0"
    // InternalHriDsl.g:2771:1: rule__Queries__Group__0 : rule__Queries__Group__0__Impl rule__Queries__Group__1 ;
    public final void rule__Queries__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2775:1: ( rule__Queries__Group__0__Impl rule__Queries__Group__1 )
            // InternalHriDsl.g:2776:2: rule__Queries__Group__0__Impl rule__Queries__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__Queries__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Queries__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Queries__Group__0"


    // $ANTLR start "rule__Queries__Group__0__Impl"
    // InternalHriDsl.g:2783:1: rule__Queries__Group__0__Impl : ( 'define' ) ;
    public final void rule__Queries__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2787:1: ( ( 'define' ) )
            // InternalHriDsl.g:2788:1: ( 'define' )
            {
            // InternalHriDsl.g:2788:1: ( 'define' )
            // InternalHriDsl.g:2789:2: 'define'
            {
             before(grammarAccess.getQueriesAccess().getDefineKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getQueriesAccess().getDefineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Queries__Group__0__Impl"


    // $ANTLR start "rule__Queries__Group__1"
    // InternalHriDsl.g:2798:1: rule__Queries__Group__1 : rule__Queries__Group__1__Impl rule__Queries__Group__2 ;
    public final void rule__Queries__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2802:1: ( rule__Queries__Group__1__Impl rule__Queries__Group__2 )
            // InternalHriDsl.g:2803:2: rule__Queries__Group__1__Impl rule__Queries__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__Queries__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Queries__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Queries__Group__1"


    // $ANTLR start "rule__Queries__Group__1__Impl"
    // InternalHriDsl.g:2810:1: rule__Queries__Group__1__Impl : ( 'queries' ) ;
    public final void rule__Queries__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2814:1: ( ( 'queries' ) )
            // InternalHriDsl.g:2815:1: ( 'queries' )
            {
            // InternalHriDsl.g:2815:1: ( 'queries' )
            // InternalHriDsl.g:2816:2: 'queries'
            {
             before(grammarAccess.getQueriesAccess().getQueriesKeyword_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getQueriesAccess().getQueriesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Queries__Group__1__Impl"


    // $ANTLR start "rule__Queries__Group__2"
    // InternalHriDsl.g:2825:1: rule__Queries__Group__2 : rule__Queries__Group__2__Impl rule__Queries__Group__3 ;
    public final void rule__Queries__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2829:1: ( rule__Queries__Group__2__Impl rule__Queries__Group__3 )
            // InternalHriDsl.g:2830:2: rule__Queries__Group__2__Impl rule__Queries__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__Queries__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Queries__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Queries__Group__2"


    // $ANTLR start "rule__Queries__Group__2__Impl"
    // InternalHriDsl.g:2837:1: rule__Queries__Group__2__Impl : ( 'of' ) ;
    public final void rule__Queries__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2841:1: ( ( 'of' ) )
            // InternalHriDsl.g:2842:1: ( 'of' )
            {
            // InternalHriDsl.g:2842:1: ( 'of' )
            // InternalHriDsl.g:2843:2: 'of'
            {
             before(grammarAccess.getQueriesAccess().getOfKeyword_2()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getQueriesAccess().getOfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Queries__Group__2__Impl"


    // $ANTLR start "rule__Queries__Group__3"
    // InternalHriDsl.g:2852:1: rule__Queries__Group__3 : rule__Queries__Group__3__Impl rule__Queries__Group__4 ;
    public final void rule__Queries__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2856:1: ( rule__Queries__Group__3__Impl rule__Queries__Group__4 )
            // InternalHriDsl.g:2857:2: rule__Queries__Group__3__Impl rule__Queries__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Queries__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Queries__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Queries__Group__3"


    // $ANTLR start "rule__Queries__Group__3__Impl"
    // InternalHriDsl.g:2864:1: rule__Queries__Group__3__Impl : ( 'mission' ) ;
    public final void rule__Queries__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2868:1: ( ( 'mission' ) )
            // InternalHriDsl.g:2869:1: ( 'mission' )
            {
            // InternalHriDsl.g:2869:1: ( 'mission' )
            // InternalHriDsl.g:2870:2: 'mission'
            {
             before(grammarAccess.getQueriesAccess().getMissionKeyword_3()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getQueriesAccess().getMissionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Queries__Group__3__Impl"


    // $ANTLR start "rule__Queries__Group__4"
    // InternalHriDsl.g:2879:1: rule__Queries__Group__4 : rule__Queries__Group__4__Impl rule__Queries__Group__5 ;
    public final void rule__Queries__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2883:1: ( rule__Queries__Group__4__Impl rule__Queries__Group__5 )
            // InternalHriDsl.g:2884:2: rule__Queries__Group__4__Impl rule__Queries__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Queries__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Queries__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Queries__Group__4"


    // $ANTLR start "rule__Queries__Group__4__Impl"
    // InternalHriDsl.g:2891:1: rule__Queries__Group__4__Impl : ( ( rule__Queries__MissionAssignment_4 ) ) ;
    public final void rule__Queries__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2895:1: ( ( ( rule__Queries__MissionAssignment_4 ) ) )
            // InternalHriDsl.g:2896:1: ( ( rule__Queries__MissionAssignment_4 ) )
            {
            // InternalHriDsl.g:2896:1: ( ( rule__Queries__MissionAssignment_4 ) )
            // InternalHriDsl.g:2897:2: ( rule__Queries__MissionAssignment_4 )
            {
             before(grammarAccess.getQueriesAccess().getMissionAssignment_4()); 
            // InternalHriDsl.g:2898:2: ( rule__Queries__MissionAssignment_4 )
            // InternalHriDsl.g:2898:3: rule__Queries__MissionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Queries__MissionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQueriesAccess().getMissionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Queries__Group__4__Impl"


    // $ANTLR start "rule__Queries__Group__5"
    // InternalHriDsl.g:2906:1: rule__Queries__Group__5 : rule__Queries__Group__5__Impl rule__Queries__Group__6 ;
    public final void rule__Queries__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2910:1: ( rule__Queries__Group__5__Impl rule__Queries__Group__6 )
            // InternalHriDsl.g:2911:2: rule__Queries__Group__5__Impl rule__Queries__Group__6
            {
            pushFollow(FOLLOW_46);
            rule__Queries__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Queries__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Queries__Group__5"


    // $ANTLR start "rule__Queries__Group__5__Impl"
    // InternalHriDsl.g:2918:1: rule__Queries__Group__5__Impl : ( ':' ) ;
    public final void rule__Queries__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2922:1: ( ( ':' ) )
            // InternalHriDsl.g:2923:1: ( ':' )
            {
            // InternalHriDsl.g:2923:1: ( ':' )
            // InternalHriDsl.g:2924:2: ':'
            {
             before(grammarAccess.getQueriesAccess().getColonKeyword_5()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getQueriesAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Queries__Group__5__Impl"


    // $ANTLR start "rule__Queries__Group__6"
    // InternalHriDsl.g:2933:1: rule__Queries__Group__6 : rule__Queries__Group__6__Impl ;
    public final void rule__Queries__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2937:1: ( rule__Queries__Group__6__Impl )
            // InternalHriDsl.g:2938:2: rule__Queries__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Queries__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Queries__Group__6"


    // $ANTLR start "rule__Queries__Group__6__Impl"
    // InternalHriDsl.g:2944:1: rule__Queries__Group__6__Impl : ( ( ( rule__Queries__QueriesAssignment_6 ) ) ( ( rule__Queries__QueriesAssignment_6 )* ) ) ;
    public final void rule__Queries__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2948:1: ( ( ( ( rule__Queries__QueriesAssignment_6 ) ) ( ( rule__Queries__QueriesAssignment_6 )* ) ) )
            // InternalHriDsl.g:2949:1: ( ( ( rule__Queries__QueriesAssignment_6 ) ) ( ( rule__Queries__QueriesAssignment_6 )* ) )
            {
            // InternalHriDsl.g:2949:1: ( ( ( rule__Queries__QueriesAssignment_6 ) ) ( ( rule__Queries__QueriesAssignment_6 )* ) )
            // InternalHriDsl.g:2950:2: ( ( rule__Queries__QueriesAssignment_6 ) ) ( ( rule__Queries__QueriesAssignment_6 )* )
            {
            // InternalHriDsl.g:2950:2: ( ( rule__Queries__QueriesAssignment_6 ) )
            // InternalHriDsl.g:2951:3: ( rule__Queries__QueriesAssignment_6 )
            {
             before(grammarAccess.getQueriesAccess().getQueriesAssignment_6()); 
            // InternalHriDsl.g:2952:3: ( rule__Queries__QueriesAssignment_6 )
            // InternalHriDsl.g:2952:4: rule__Queries__QueriesAssignment_6
            {
            pushFollow(FOLLOW_47);
            rule__Queries__QueriesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getQueriesAccess().getQueriesAssignment_6()); 

            }

            // InternalHriDsl.g:2955:2: ( ( rule__Queries__QueriesAssignment_6 )* )
            // InternalHriDsl.g:2956:3: ( rule__Queries__QueriesAssignment_6 )*
            {
             before(grammarAccess.getQueriesAccess().getQueriesAssignment_6()); 
            // InternalHriDsl.g:2957:3: ( rule__Queries__QueriesAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==68) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalHriDsl.g:2957:4: rule__Queries__QueriesAssignment_6
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__Queries__QueriesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getQueriesAccess().getQueriesAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Queries__Group__6__Impl"


    // $ANTLR start "rule__Query__Group__0"
    // InternalHriDsl.g:2967:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2971:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalHriDsl.g:2972:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__Query__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0"


    // $ANTLR start "rule__Query__Group__0__Impl"
    // InternalHriDsl.g:2979:1: rule__Query__Group__0__Impl : ( 'compute' ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2983:1: ( ( 'compute' ) )
            // InternalHriDsl.g:2984:1: ( 'compute' )
            {
            // InternalHriDsl.g:2984:1: ( 'compute' )
            // InternalHriDsl.g:2985:2: 'compute'
            {
             before(grammarAccess.getQueryAccess().getComputeKeyword_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getComputeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0__Impl"


    // $ANTLR start "rule__Query__Group__1"
    // InternalHriDsl.g:2994:1: rule__Query__Group__1 : rule__Query__Group__1__Impl rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2998:1: ( rule__Query__Group__1__Impl rule__Query__Group__2 )
            // InternalHriDsl.g:2999:2: rule__Query__Group__1__Impl rule__Query__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Query__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1"


    // $ANTLR start "rule__Query__Group__1__Impl"
    // InternalHriDsl.g:3006:1: rule__Query__Group__1__Impl : ( ( rule__Query__Query_typeAssignment_1 ) ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3010:1: ( ( ( rule__Query__Query_typeAssignment_1 ) ) )
            // InternalHriDsl.g:3011:1: ( ( rule__Query__Query_typeAssignment_1 ) )
            {
            // InternalHriDsl.g:3011:1: ( ( rule__Query__Query_typeAssignment_1 ) )
            // InternalHriDsl.g:3012:2: ( rule__Query__Query_typeAssignment_1 )
            {
             before(grammarAccess.getQueryAccess().getQuery_typeAssignment_1()); 
            // InternalHriDsl.g:3013:2: ( rule__Query__Query_typeAssignment_1 )
            // InternalHriDsl.g:3013:3: rule__Query__Query_typeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Query__Query_typeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getQuery_typeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1__Impl"


    // $ANTLR start "rule__Query__Group__2"
    // InternalHriDsl.g:3021:1: rule__Query__Group__2 : rule__Query__Group__2__Impl rule__Query__Group__3 ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3025:1: ( rule__Query__Group__2__Impl rule__Query__Group__3 )
            // InternalHriDsl.g:3026:2: rule__Query__Group__2__Impl rule__Query__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__Query__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__2"


    // $ANTLR start "rule__Query__Group__2__Impl"
    // InternalHriDsl.g:3033:1: rule__Query__Group__2__Impl : ( 'with' ) ;
    public final void rule__Query__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3037:1: ( ( 'with' ) )
            // InternalHriDsl.g:3038:1: ( 'with' )
            {
            // InternalHriDsl.g:3038:1: ( 'with' )
            // InternalHriDsl.g:3039:2: 'with'
            {
             before(grammarAccess.getQueryAccess().getWithKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__2__Impl"


    // $ANTLR start "rule__Query__Group__3"
    // InternalHriDsl.g:3048:1: rule__Query__Group__3 : rule__Query__Group__3__Impl rule__Query__Group__4 ;
    public final void rule__Query__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3052:1: ( rule__Query__Group__3__Impl rule__Query__Group__4 )
            // InternalHriDsl.g:3053:2: rule__Query__Group__3__Impl rule__Query__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Query__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__3"


    // $ANTLR start "rule__Query__Group__3__Impl"
    // InternalHriDsl.g:3060:1: rule__Query__Group__3__Impl : ( 'duration' ) ;
    public final void rule__Query__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3064:1: ( ( 'duration' ) )
            // InternalHriDsl.g:3065:1: ( 'duration' )
            {
            // InternalHriDsl.g:3065:1: ( 'duration' )
            // InternalHriDsl.g:3066:2: 'duration'
            {
             before(grammarAccess.getQueryAccess().getDurationKeyword_3()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getDurationKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__3__Impl"


    // $ANTLR start "rule__Query__Group__4"
    // InternalHriDsl.g:3075:1: rule__Query__Group__4 : rule__Query__Group__4__Impl rule__Query__Group__5 ;
    public final void rule__Query__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3079:1: ( rule__Query__Group__4__Impl rule__Query__Group__5 )
            // InternalHriDsl.g:3080:2: rule__Query__Group__4__Impl rule__Query__Group__5
            {
            pushFollow(FOLLOW_50);
            rule__Query__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__4"


    // $ANTLR start "rule__Query__Group__4__Impl"
    // InternalHriDsl.g:3087:1: rule__Query__Group__4__Impl : ( ( rule__Query__DurationAssignment_4 ) ) ;
    public final void rule__Query__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3091:1: ( ( ( rule__Query__DurationAssignment_4 ) ) )
            // InternalHriDsl.g:3092:1: ( ( rule__Query__DurationAssignment_4 ) )
            {
            // InternalHriDsl.g:3092:1: ( ( rule__Query__DurationAssignment_4 ) )
            // InternalHriDsl.g:3093:2: ( rule__Query__DurationAssignment_4 )
            {
             before(grammarAccess.getQueryAccess().getDurationAssignment_4()); 
            // InternalHriDsl.g:3094:2: ( rule__Query__DurationAssignment_4 )
            // InternalHriDsl.g:3094:3: rule__Query__DurationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Query__DurationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getDurationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__4__Impl"


    // $ANTLR start "rule__Query__Group__5"
    // InternalHriDsl.g:3102:1: rule__Query__Group__5 : rule__Query__Group__5__Impl rule__Query__Group__6 ;
    public final void rule__Query__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3106:1: ( rule__Query__Group__5__Impl rule__Query__Group__6 )
            // InternalHriDsl.g:3107:2: rule__Query__Group__5__Impl rule__Query__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__Query__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__5"


    // $ANTLR start "rule__Query__Group__5__Impl"
    // InternalHriDsl.g:3114:1: rule__Query__Group__5__Impl : ( 'runs' ) ;
    public final void rule__Query__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3118:1: ( ( 'runs' ) )
            // InternalHriDsl.g:3119:1: ( 'runs' )
            {
            // InternalHriDsl.g:3119:1: ( 'runs' )
            // InternalHriDsl.g:3120:2: 'runs'
            {
             before(grammarAccess.getQueryAccess().getRunsKeyword_5()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getRunsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__5__Impl"


    // $ANTLR start "rule__Query__Group__6"
    // InternalHriDsl.g:3129:1: rule__Query__Group__6 : rule__Query__Group__6__Impl ;
    public final void rule__Query__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3133:1: ( rule__Query__Group__6__Impl )
            // InternalHriDsl.g:3134:2: rule__Query__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__6"


    // $ANTLR start "rule__Query__Group__6__Impl"
    // InternalHriDsl.g:3140:1: rule__Query__Group__6__Impl : ( ( rule__Query__RunsAssignment_6 ) ) ;
    public final void rule__Query__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3144:1: ( ( ( rule__Query__RunsAssignment_6 ) ) )
            // InternalHriDsl.g:3145:1: ( ( rule__Query__RunsAssignment_6 ) )
            {
            // InternalHriDsl.g:3145:1: ( ( rule__Query__RunsAssignment_6 ) )
            // InternalHriDsl.g:3146:2: ( rule__Query__RunsAssignment_6 )
            {
             before(grammarAccess.getQueryAccess().getRunsAssignment_6()); 
            // InternalHriDsl.g:3147:2: ( rule__Query__RunsAssignment_6 )
            // InternalHriDsl.g:3147:3: rule__Query__RunsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Query__RunsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getRunsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__6__Impl"


    // $ANTLR start "rule__Coordinates__Group__0"
    // InternalHriDsl.g:3156:1: rule__Coordinates__Group__0 : rule__Coordinates__Group__0__Impl rule__Coordinates__Group__1 ;
    public final void rule__Coordinates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3160:1: ( rule__Coordinates__Group__0__Impl rule__Coordinates__Group__1 )
            // InternalHriDsl.g:3161:2: rule__Coordinates__Group__0__Impl rule__Coordinates__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Coordinates__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordinates__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__0"


    // $ANTLR start "rule__Coordinates__Group__0__Impl"
    // InternalHriDsl.g:3168:1: rule__Coordinates__Group__0__Impl : ( '(' ) ;
    public final void rule__Coordinates__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3172:1: ( ( '(' ) )
            // InternalHriDsl.g:3173:1: ( '(' )
            {
            // InternalHriDsl.g:3173:1: ( '(' )
            // InternalHriDsl.g:3174:2: '('
            {
             before(grammarAccess.getCoordinatesAccess().getLeftParenthesisKeyword_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getCoordinatesAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__0__Impl"


    // $ANTLR start "rule__Coordinates__Group__1"
    // InternalHriDsl.g:3183:1: rule__Coordinates__Group__1 : rule__Coordinates__Group__1__Impl rule__Coordinates__Group__2 ;
    public final void rule__Coordinates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3187:1: ( rule__Coordinates__Group__1__Impl rule__Coordinates__Group__2 )
            // InternalHriDsl.g:3188:2: rule__Coordinates__Group__1__Impl rule__Coordinates__Group__2
            {
            pushFollow(FOLLOW_51);
            rule__Coordinates__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordinates__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__1"


    // $ANTLR start "rule__Coordinates__Group__1__Impl"
    // InternalHriDsl.g:3195:1: rule__Coordinates__Group__1__Impl : ( ( rule__Coordinates__XAssignment_1 ) ) ;
    public final void rule__Coordinates__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3199:1: ( ( ( rule__Coordinates__XAssignment_1 ) ) )
            // InternalHriDsl.g:3200:1: ( ( rule__Coordinates__XAssignment_1 ) )
            {
            // InternalHriDsl.g:3200:1: ( ( rule__Coordinates__XAssignment_1 ) )
            // InternalHriDsl.g:3201:2: ( rule__Coordinates__XAssignment_1 )
            {
             before(grammarAccess.getCoordinatesAccess().getXAssignment_1()); 
            // InternalHriDsl.g:3202:2: ( rule__Coordinates__XAssignment_1 )
            // InternalHriDsl.g:3202:3: rule__Coordinates__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Coordinates__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoordinatesAccess().getXAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__1__Impl"


    // $ANTLR start "rule__Coordinates__Group__2"
    // InternalHriDsl.g:3210:1: rule__Coordinates__Group__2 : rule__Coordinates__Group__2__Impl rule__Coordinates__Group__3 ;
    public final void rule__Coordinates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3214:1: ( rule__Coordinates__Group__2__Impl rule__Coordinates__Group__3 )
            // InternalHriDsl.g:3215:2: rule__Coordinates__Group__2__Impl rule__Coordinates__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Coordinates__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordinates__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__2"


    // $ANTLR start "rule__Coordinates__Group__2__Impl"
    // InternalHriDsl.g:3222:1: rule__Coordinates__Group__2__Impl : ( ';' ) ;
    public final void rule__Coordinates__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3226:1: ( ( ';' ) )
            // InternalHriDsl.g:3227:1: ( ';' )
            {
            // InternalHriDsl.g:3227:1: ( ';' )
            // InternalHriDsl.g:3228:2: ';'
            {
             before(grammarAccess.getCoordinatesAccess().getSemicolonKeyword_2()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getCoordinatesAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__2__Impl"


    // $ANTLR start "rule__Coordinates__Group__3"
    // InternalHriDsl.g:3237:1: rule__Coordinates__Group__3 : rule__Coordinates__Group__3__Impl rule__Coordinates__Group__4 ;
    public final void rule__Coordinates__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3241:1: ( rule__Coordinates__Group__3__Impl rule__Coordinates__Group__4 )
            // InternalHriDsl.g:3242:2: rule__Coordinates__Group__3__Impl rule__Coordinates__Group__4
            {
            pushFollow(FOLLOW_52);
            rule__Coordinates__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordinates__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__3"


    // $ANTLR start "rule__Coordinates__Group__3__Impl"
    // InternalHriDsl.g:3249:1: rule__Coordinates__Group__3__Impl : ( ( rule__Coordinates__YAssignment_3 ) ) ;
    public final void rule__Coordinates__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3253:1: ( ( ( rule__Coordinates__YAssignment_3 ) ) )
            // InternalHriDsl.g:3254:1: ( ( rule__Coordinates__YAssignment_3 ) )
            {
            // InternalHriDsl.g:3254:1: ( ( rule__Coordinates__YAssignment_3 ) )
            // InternalHriDsl.g:3255:2: ( rule__Coordinates__YAssignment_3 )
            {
             before(grammarAccess.getCoordinatesAccess().getYAssignment_3()); 
            // InternalHriDsl.g:3256:2: ( rule__Coordinates__YAssignment_3 )
            // InternalHriDsl.g:3256:3: rule__Coordinates__YAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Coordinates__YAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCoordinatesAccess().getYAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__3__Impl"


    // $ANTLR start "rule__Coordinates__Group__4"
    // InternalHriDsl.g:3264:1: rule__Coordinates__Group__4 : rule__Coordinates__Group__4__Impl ;
    public final void rule__Coordinates__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3268:1: ( rule__Coordinates__Group__4__Impl )
            // InternalHriDsl.g:3269:2: rule__Coordinates__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Coordinates__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__4"


    // $ANTLR start "rule__Coordinates__Group__4__Impl"
    // InternalHriDsl.g:3275:1: rule__Coordinates__Group__4__Impl : ( ')' ) ;
    public final void rule__Coordinates__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3279:1: ( ( ')' ) )
            // InternalHriDsl.g:3280:1: ( ')' )
            {
            // InternalHriDsl.g:3280:1: ( ')' )
            // InternalHriDsl.g:3281:2: ')'
            {
             before(grammarAccess.getCoordinatesAccess().getRightParenthesisKeyword_4()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getCoordinatesAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__4__Impl"


    // $ANTLR start "rule__Model__ParameterAssignment_0"
    // InternalHriDsl.g:3291:1: rule__Model__ParameterAssignment_0 : ( ruleParameter ) ;
    public final void rule__Model__ParameterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3295:1: ( ( ruleParameter ) )
            // InternalHriDsl.g:3296:2: ( ruleParameter )
            {
            // InternalHriDsl.g:3296:2: ( ruleParameter )
            // InternalHriDsl.g:3297:3: ruleParameter
            {
             before(grammarAccess.getModelAccess().getParameterParameterParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getModelAccess().getParameterParameterParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ParameterAssignment_0"


    // $ANTLR start "rule__Model__ScenariosAssignment_1"
    // InternalHriDsl.g:3306:1: rule__Model__ScenariosAssignment_1 : ( ruleScenario ) ;
    public final void rule__Model__ScenariosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3310:1: ( ( ruleScenario ) )
            // InternalHriDsl.g:3311:2: ( ruleScenario )
            {
            // InternalHriDsl.g:3311:2: ( ruleScenario )
            // InternalHriDsl.g:3312:3: ruleScenario
            {
             before(grammarAccess.getModelAccess().getScenariosScenarioParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getModelAccess().getScenariosScenarioParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ScenariosAssignment_1"


    // $ANTLR start "rule__Parameter__Length_unitAssignment_2"
    // InternalHriDsl.g:3321:1: rule__Parameter__Length_unitAssignment_2 : ( ruleLength_unit ) ;
    public final void rule__Parameter__Length_unitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3325:1: ( ( ruleLength_unit ) )
            // InternalHriDsl.g:3326:2: ( ruleLength_unit )
            {
            // InternalHriDsl.g:3326:2: ( ruleLength_unit )
            // InternalHriDsl.g:3327:3: ruleLength_unit
            {
             before(grammarAccess.getParameterAccess().getLength_unitLength_unitEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLength_unit();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getLength_unitLength_unitEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Length_unitAssignment_2"


    // $ANTLR start "rule__Scenario__FloorAssignment_0"
    // InternalHriDsl.g:3336:1: rule__Scenario__FloorAssignment_0 : ( ruleFloor ) ;
    public final void rule__Scenario__FloorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3340:1: ( ( ruleFloor ) )
            // InternalHriDsl.g:3341:2: ( ruleFloor )
            {
            // InternalHriDsl.g:3341:2: ( ruleFloor )
            // InternalHriDsl.g:3342:3: ruleFloor
            {
             before(grammarAccess.getScenarioAccess().getFloorFloorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFloor();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getFloorFloorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__FloorAssignment_0"


    // $ANTLR start "rule__Scenario__RobotsAssignment_1"
    // InternalHriDsl.g:3351:1: rule__Scenario__RobotsAssignment_1 : ( ruleRobots ) ;
    public final void rule__Scenario__RobotsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3355:1: ( ( ruleRobots ) )
            // InternalHriDsl.g:3356:2: ( ruleRobots )
            {
            // InternalHriDsl.g:3356:2: ( ruleRobots )
            // InternalHriDsl.g:3357:3: ruleRobots
            {
             before(grammarAccess.getScenarioAccess().getRobotsRobotsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRobots();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getRobotsRobotsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__RobotsAssignment_1"


    // $ANTLR start "rule__Scenario__HumansAssignment_2"
    // InternalHriDsl.g:3366:1: rule__Scenario__HumansAssignment_2 : ( ruleHumans ) ;
    public final void rule__Scenario__HumansAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3370:1: ( ( ruleHumans ) )
            // InternalHriDsl.g:3371:2: ( ruleHumans )
            {
            // InternalHriDsl.g:3371:2: ( ruleHumans )
            // InternalHriDsl.g:3372:3: ruleHumans
            {
             before(grammarAccess.getScenarioAccess().getHumansHumansParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleHumans();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getHumansHumansParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__HumansAssignment_2"


    // $ANTLR start "rule__Scenario__MissionsAssignment_3"
    // InternalHriDsl.g:3381:1: rule__Scenario__MissionsAssignment_3 : ( ruleMission ) ;
    public final void rule__Scenario__MissionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3385:1: ( ( ruleMission ) )
            // InternalHriDsl.g:3386:2: ( ruleMission )
            {
            // InternalHriDsl.g:3386:2: ( ruleMission )
            // InternalHriDsl.g:3387:3: ruleMission
            {
             before(grammarAccess.getScenarioAccess().getMissionsMissionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMission();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getMissionsMissionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__MissionsAssignment_3"


    // $ANTLR start "rule__Floor__Floor_nameAssignment_2"
    // InternalHriDsl.g:3396:1: rule__Floor__Floor_nameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Floor__Floor_nameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3400:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3401:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3401:2: ( RULE_ID )
            // InternalHriDsl.g:3402:3: RULE_ID
            {
             before(grammarAccess.getFloorAccess().getFloor_nameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getFloor_nameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Floor_nameAssignment_2"


    // $ANTLR start "rule__Floor__SurfacesAssignment_4"
    // InternalHriDsl.g:3411:1: rule__Floor__SurfacesAssignment_4 : ( ruleSurface ) ;
    public final void rule__Floor__SurfacesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3415:1: ( ( ruleSurface ) )
            // InternalHriDsl.g:3416:2: ( ruleSurface )
            {
            // InternalHriDsl.g:3416:2: ( ruleSurface )
            // InternalHriDsl.g:3417:3: ruleSurface
            {
             before(grammarAccess.getFloorAccess().getSurfacesSurfaceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSurface();

            state._fsp--;

             after(grammarAccess.getFloorAccess().getSurfacesSurfaceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__SurfacesAssignment_4"


    // $ANTLR start "rule__Floor__PointsAssignment_5"
    // InternalHriDsl.g:3426:1: rule__Floor__PointsAssignment_5 : ( rulePoint ) ;
    public final void rule__Floor__PointsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3430:1: ( ( rulePoint ) )
            // InternalHriDsl.g:3431:2: ( rulePoint )
            {
            // InternalHriDsl.g:3431:2: ( rulePoint )
            // InternalHriDsl.g:3432:3: rulePoint
            {
             before(grammarAccess.getFloorAccess().getPointsPointParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getFloorAccess().getPointsPointParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__PointsAssignment_5"


    // $ANTLR start "rule__Surface__NameAssignment_2"
    // InternalHriDsl.g:3441:1: rule__Surface__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Surface__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3445:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3446:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3446:2: ( RULE_ID )
            // InternalHriDsl.g:3447:3: RULE_ID
            {
             before(grammarAccess.getSurfaceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSurfaceAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Surface__NameAssignment_2"


    // $ANTLR start "rule__Surface__VerticesAssignment_4"
    // InternalHriDsl.g:3456:1: rule__Surface__VerticesAssignment_4 : ( ruleVertices ) ;
    public final void rule__Surface__VerticesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3460:1: ( ( ruleVertices ) )
            // InternalHriDsl.g:3461:2: ( ruleVertices )
            {
            // InternalHriDsl.g:3461:2: ( ruleVertices )
            // InternalHriDsl.g:3462:3: ruleVertices
            {
             before(grammarAccess.getSurfaceAccess().getVerticesVerticesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVertices();

            state._fsp--;

             after(grammarAccess.getSurfaceAccess().getVerticesVerticesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Surface__VerticesAssignment_4"


    // $ANTLR start "rule__Vertices__Vertex_AAssignment_1"
    // InternalHriDsl.g:3471:1: rule__Vertices__Vertex_AAssignment_1 : ( ruleCoordinates ) ;
    public final void rule__Vertices__Vertex_AAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3475:1: ( ( ruleCoordinates ) )
            // InternalHriDsl.g:3476:2: ( ruleCoordinates )
            {
            // InternalHriDsl.g:3476:2: ( ruleCoordinates )
            // InternalHriDsl.g:3477:3: ruleCoordinates
            {
             before(grammarAccess.getVerticesAccess().getVertex_ACoordinatesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinates();

            state._fsp--;

             after(grammarAccess.getVerticesAccess().getVertex_ACoordinatesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertices__Vertex_AAssignment_1"


    // $ANTLR start "rule__Vertices__Vertex_CAssignment_3"
    // InternalHriDsl.g:3486:1: rule__Vertices__Vertex_CAssignment_3 : ( ruleCoordinates ) ;
    public final void rule__Vertices__Vertex_CAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3490:1: ( ( ruleCoordinates ) )
            // InternalHriDsl.g:3491:2: ( ruleCoordinates )
            {
            // InternalHriDsl.g:3491:2: ( ruleCoordinates )
            // InternalHriDsl.g:3492:3: ruleCoordinates
            {
             before(grammarAccess.getVerticesAccess().getVertex_CCoordinatesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinates();

            state._fsp--;

             after(grammarAccess.getVerticesAccess().getVertex_CCoordinatesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertices__Vertex_CAssignment_3"


    // $ANTLR start "rule__Point__NameAssignment_2"
    // InternalHriDsl.g:3501:1: rule__Point__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Point__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3505:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3506:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3506:2: ( RULE_ID )
            // InternalHriDsl.g:3507:3: RULE_ID
            {
             before(grammarAccess.getPointAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__NameAssignment_2"


    // $ANTLR start "rule__Point__CoordinatesAssignment_5"
    // InternalHriDsl.g:3516:1: rule__Point__CoordinatesAssignment_5 : ( ruleCoordinates ) ;
    public final void rule__Point__CoordinatesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3520:1: ( ( ruleCoordinates ) )
            // InternalHriDsl.g:3521:2: ( ruleCoordinates )
            {
            // InternalHriDsl.g:3521:2: ( ruleCoordinates )
            // InternalHriDsl.g:3522:3: ruleCoordinates
            {
             before(grammarAccess.getPointAccess().getCoordinatesCoordinatesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinates();

            state._fsp--;

             after(grammarAccess.getPointAccess().getCoordinatesCoordinatesParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__CoordinatesAssignment_5"


    // $ANTLR start "rule__Robots__RobotsAssignment_3"
    // InternalHriDsl.g:3531:1: rule__Robots__RobotsAssignment_3 : ( ruleRobot ) ;
    public final void rule__Robots__RobotsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3535:1: ( ( ruleRobot ) )
            // InternalHriDsl.g:3536:2: ( ruleRobot )
            {
            // InternalHriDsl.g:3536:2: ( ruleRobot )
            // InternalHriDsl.g:3537:3: ruleRobot
            {
             before(grammarAccess.getRobotsAccess().getRobotsRobotParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRobot();

            state._fsp--;

             after(grammarAccess.getRobotsAccess().getRobotsRobotParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robots__RobotsAssignment_3"


    // $ANTLR start "rule__Robot__NameAssignment_1"
    // InternalHriDsl.g:3546:1: rule__Robot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Robot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3550:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3551:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3551:2: ( RULE_ID )
            // InternalHriDsl.g:3552:3: RULE_ID
            {
             before(grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__NameAssignment_1"


    // $ANTLR start "rule__Robot__CoordinatesAssignment_4"
    // InternalHriDsl.g:3561:1: rule__Robot__CoordinatesAssignment_4 : ( ruleCoordinates ) ;
    public final void rule__Robot__CoordinatesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3565:1: ( ( ruleCoordinates ) )
            // InternalHriDsl.g:3566:2: ( ruleCoordinates )
            {
            // InternalHriDsl.g:3566:2: ( ruleCoordinates )
            // InternalHriDsl.g:3567:3: ruleCoordinates
            {
             before(grammarAccess.getRobotAccess().getCoordinatesCoordinatesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinates();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getCoordinatesCoordinatesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__CoordinatesAssignment_4"


    // $ANTLR start "rule__Robot__TypeAssignment_6"
    // InternalHriDsl.g:3576:1: rule__Robot__TypeAssignment_6 : ( ruleType ) ;
    public final void rule__Robot__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3580:1: ( ( ruleType ) )
            // InternalHriDsl.g:3581:2: ( ruleType )
            {
            // InternalHriDsl.g:3581:2: ( ruleType )
            // InternalHriDsl.g:3582:3: ruleType
            {
             before(grammarAccess.getRobotAccess().getTypeTypeEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getTypeTypeEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__TypeAssignment_6"


    // $ANTLR start "rule__Robot__Charge_percentageAssignment_8"
    // InternalHriDsl.g:3591:1: rule__Robot__Charge_percentageAssignment_8 : ( RULE_INT ) ;
    public final void rule__Robot__Charge_percentageAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3595:1: ( ( RULE_INT ) )
            // InternalHriDsl.g:3596:2: ( RULE_INT )
            {
            // InternalHriDsl.g:3596:2: ( RULE_INT )
            // InternalHriDsl.g:3597:3: RULE_INT
            {
             before(grammarAccess.getRobotAccess().getCharge_percentageINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getCharge_percentageINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Charge_percentageAssignment_8"


    // $ANTLR start "rule__Humans__HumansAssignment_3"
    // InternalHriDsl.g:3606:1: rule__Humans__HumansAssignment_3 : ( ruleHuman ) ;
    public final void rule__Humans__HumansAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3610:1: ( ( ruleHuman ) )
            // InternalHriDsl.g:3611:2: ( ruleHuman )
            {
            // InternalHriDsl.g:3611:2: ( ruleHuman )
            // InternalHriDsl.g:3612:3: ruleHuman
            {
             before(grammarAccess.getHumansAccess().getHumansHumanParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleHuman();

            state._fsp--;

             after(grammarAccess.getHumansAccess().getHumansHumanParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Humans__HumansAssignment_3"


    // $ANTLR start "rule__Human__NameAssignment_1"
    // InternalHriDsl.g:3621:1: rule__Human__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Human__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3625:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3626:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3626:2: ( RULE_ID )
            // InternalHriDsl.g:3627:3: RULE_ID
            {
             before(grammarAccess.getHumanAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHumanAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__NameAssignment_1"


    // $ANTLR start "rule__Human__CoordinatesAssignment_4"
    // InternalHriDsl.g:3636:1: rule__Human__CoordinatesAssignment_4 : ( ruleCoordinates ) ;
    public final void rule__Human__CoordinatesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3640:1: ( ( ruleCoordinates ) )
            // InternalHriDsl.g:3641:2: ( ruleCoordinates )
            {
            // InternalHriDsl.g:3641:2: ( ruleCoordinates )
            // InternalHriDsl.g:3642:3: ruleCoordinates
            {
             before(grammarAccess.getHumanAccess().getCoordinatesCoordinatesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinates();

            state._fsp--;

             after(grammarAccess.getHumanAccess().getCoordinatesCoordinatesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__CoordinatesAssignment_4"


    // $ANTLR start "rule__Human__SpeedAssignment_6"
    // InternalHriDsl.g:3651:1: rule__Human__SpeedAssignment_6 : ( RULE_FLOAT ) ;
    public final void rule__Human__SpeedAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3655:1: ( ( RULE_FLOAT ) )
            // InternalHriDsl.g:3656:2: ( RULE_FLOAT )
            {
            // InternalHriDsl.g:3656:2: ( RULE_FLOAT )
            // InternalHriDsl.g:3657:3: RULE_FLOAT
            {
             before(grammarAccess.getHumanAccess().getSpeedFLOATTerminalRuleCall_6_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getHumanAccess().getSpeedFLOATTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__SpeedAssignment_6"


    // $ANTLR start "rule__Human__DextAssignment_8"
    // InternalHriDsl.g:3666:1: rule__Human__DextAssignment_8 : ( RULE_INT ) ;
    public final void rule__Human__DextAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3670:1: ( ( RULE_INT ) )
            // InternalHriDsl.g:3671:2: ( RULE_INT )
            {
            // InternalHriDsl.g:3671:2: ( RULE_INT )
            // InternalHriDsl.g:3672:3: RULE_INT
            {
             before(grammarAccess.getHumanAccess().getDextINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHumanAccess().getDextINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__DextAssignment_8"


    // $ANTLR start "rule__Human__Fatigue_profileAssignment_10"
    // InternalHriDsl.g:3681:1: rule__Human__Fatigue_profileAssignment_10 : ( ruleFatigue_profile ) ;
    public final void rule__Human__Fatigue_profileAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3685:1: ( ( ruleFatigue_profile ) )
            // InternalHriDsl.g:3686:2: ( ruleFatigue_profile )
            {
            // InternalHriDsl.g:3686:2: ( ruleFatigue_profile )
            // InternalHriDsl.g:3687:3: ruleFatigue_profile
            {
             before(grammarAccess.getHumanAccess().getFatigue_profileFatigue_profileEnumRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleFatigue_profile();

            state._fsp--;

             after(grammarAccess.getHumanAccess().getFatigue_profileFatigue_profileEnumRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Fatigue_profileAssignment_10"


    // $ANTLR start "rule__Human__Free_will_profileAssignment_12"
    // InternalHriDsl.g:3696:1: rule__Human__Free_will_profileAssignment_12 : ( ruleFree_will_profile ) ;
    public final void rule__Human__Free_will_profileAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3700:1: ( ( ruleFree_will_profile ) )
            // InternalHriDsl.g:3701:2: ( ruleFree_will_profile )
            {
            // InternalHriDsl.g:3701:2: ( ruleFree_will_profile )
            // InternalHriDsl.g:3702:3: ruleFree_will_profile
            {
             before(grammarAccess.getHumanAccess().getFree_will_profileFree_will_profileEnumRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleFree_will_profile();

            state._fsp--;

             after(grammarAccess.getHumanAccess().getFree_will_profileFree_will_profileEnumRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Human__Free_will_profileAssignment_12"


    // $ANTLR start "rule__Mission__NameAssignment_2"
    // InternalHriDsl.g:3711:1: rule__Mission__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Mission__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3715:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3716:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3716:2: ( RULE_ID )
            // InternalHriDsl.g:3717:3: RULE_ID
            {
             before(grammarAccess.getMissionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__NameAssignment_2"


    // $ANTLR start "rule__Mission__AssignmentsAssignment_4"
    // InternalHriDsl.g:3726:1: rule__Mission__AssignmentsAssignment_4 : ( ruleAssignment ) ;
    public final void rule__Mission__AssignmentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3730:1: ( ( ruleAssignment ) )
            // InternalHriDsl.g:3731:2: ( ruleAssignment )
            {
            // InternalHriDsl.g:3731:2: ( ruleAssignment )
            // InternalHriDsl.g:3732:3: ruleAssignment
            {
             before(grammarAccess.getMissionAccess().getAssignmentsAssignmentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getAssignmentsAssignmentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__AssignmentsAssignment_4"


    // $ANTLR start "rule__Mission__QueriesAssignment_5"
    // InternalHriDsl.g:3741:1: rule__Mission__QueriesAssignment_5 : ( ruleQueries ) ;
    public final void rule__Mission__QueriesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3745:1: ( ( ruleQueries ) )
            // InternalHriDsl.g:3746:2: ( ruleQueries )
            {
            // InternalHriDsl.g:3746:2: ( ruleQueries )
            // InternalHriDsl.g:3747:3: ruleQueries
            {
             before(grammarAccess.getMissionAccess().getQueriesQueriesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleQueries();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getQueriesQueriesParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__QueriesAssignment_5"


    // $ANTLR start "rule__Assignment__PatternAssignment_1"
    // InternalHriDsl.g:3756:1: rule__Assignment__PatternAssignment_1 : ( rulePattern ) ;
    public final void rule__Assignment__PatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3760:1: ( ( rulePattern ) )
            // InternalHriDsl.g:3761:2: ( rulePattern )
            {
            // InternalHriDsl.g:3761:2: ( rulePattern )
            // InternalHriDsl.g:3762:3: rulePattern
            {
             before(grammarAccess.getAssignmentAccess().getPatternPatternEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getPatternPatternEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__PatternAssignment_1"


    // $ANTLR start "rule__Assignment__ClientAssignment_3"
    // InternalHriDsl.g:3771:1: rule__Assignment__ClientAssignment_3 : ( RULE_ID ) ;
    public final void rule__Assignment__ClientAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3775:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3776:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3776:2: ( RULE_ID )
            // InternalHriDsl.g:3777:3: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getClientIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getClientIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ClientAssignment_3"


    // $ANTLR start "rule__Assignment__TargetAssignment_6"
    // InternalHriDsl.g:3786:1: rule__Assignment__TargetAssignment_6 : ( RULE_ID ) ;
    public final void rule__Assignment__TargetAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3790:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3791:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3791:2: ( RULE_ID )
            // InternalHriDsl.g:3792:3: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getTargetIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getTargetIDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__TargetAssignment_6"


    // $ANTLR start "rule__Queries__MissionAssignment_4"
    // InternalHriDsl.g:3801:1: rule__Queries__MissionAssignment_4 : ( RULE_ID ) ;
    public final void rule__Queries__MissionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3805:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3806:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3806:2: ( RULE_ID )
            // InternalHriDsl.g:3807:3: RULE_ID
            {
             before(grammarAccess.getQueriesAccess().getMissionIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueriesAccess().getMissionIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Queries__MissionAssignment_4"


    // $ANTLR start "rule__Queries__QueriesAssignment_6"
    // InternalHriDsl.g:3816:1: rule__Queries__QueriesAssignment_6 : ( ruleQuery ) ;
    public final void rule__Queries__QueriesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3820:1: ( ( ruleQuery ) )
            // InternalHriDsl.g:3821:2: ( ruleQuery )
            {
            // InternalHriDsl.g:3821:2: ( ruleQuery )
            // InternalHriDsl.g:3822:3: ruleQuery
            {
             before(grammarAccess.getQueriesAccess().getQueriesQueryParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueriesAccess().getQueriesQueryParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Queries__QueriesAssignment_6"


    // $ANTLR start "rule__Query__Query_typeAssignment_1"
    // InternalHriDsl.g:3831:1: rule__Query__Query_typeAssignment_1 : ( ruleQuery_type ) ;
    public final void rule__Query__Query_typeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3835:1: ( ( ruleQuery_type ) )
            // InternalHriDsl.g:3836:2: ( ruleQuery_type )
            {
            // InternalHriDsl.g:3836:2: ( ruleQuery_type )
            // InternalHriDsl.g:3837:3: ruleQuery_type
            {
             before(grammarAccess.getQueryAccess().getQuery_typeQuery_typeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuery_type();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getQuery_typeQuery_typeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Query_typeAssignment_1"


    // $ANTLR start "rule__Query__DurationAssignment_4"
    // InternalHriDsl.g:3846:1: rule__Query__DurationAssignment_4 : ( RULE_INT ) ;
    public final void rule__Query__DurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3850:1: ( ( RULE_INT ) )
            // InternalHriDsl.g:3851:2: ( RULE_INT )
            {
            // InternalHriDsl.g:3851:2: ( RULE_INT )
            // InternalHriDsl.g:3852:3: RULE_INT
            {
             before(grammarAccess.getQueryAccess().getDurationINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getDurationINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__DurationAssignment_4"


    // $ANTLR start "rule__Query__RunsAssignment_6"
    // InternalHriDsl.g:3861:1: rule__Query__RunsAssignment_6 : ( RULE_INT ) ;
    public final void rule__Query__RunsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3865:1: ( ( RULE_INT ) )
            // InternalHriDsl.g:3866:2: ( RULE_INT )
            {
            // InternalHriDsl.g:3866:2: ( RULE_INT )
            // InternalHriDsl.g:3867:3: RULE_INT
            {
             before(grammarAccess.getQueryAccess().getRunsINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getRunsINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__RunsAssignment_6"


    // $ANTLR start "rule__Coordinates__XAssignment_1"
    // InternalHriDsl.g:3876:1: rule__Coordinates__XAssignment_1 : ( RULE_FLOAT ) ;
    public final void rule__Coordinates__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3880:1: ( ( RULE_FLOAT ) )
            // InternalHriDsl.g:3881:2: ( RULE_FLOAT )
            {
            // InternalHriDsl.g:3881:2: ( RULE_FLOAT )
            // InternalHriDsl.g:3882:3: RULE_FLOAT
            {
             before(grammarAccess.getCoordinatesAccess().getXFLOATTerminalRuleCall_1_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getCoordinatesAccess().getXFLOATTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__XAssignment_1"


    // $ANTLR start "rule__Coordinates__YAssignment_3"
    // InternalHriDsl.g:3891:1: rule__Coordinates__YAssignment_3 : ( RULE_FLOAT ) ;
    public final void rule__Coordinates__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3895:1: ( ( RULE_FLOAT ) )
            // InternalHriDsl.g:3896:2: ( RULE_FLOAT )
            {
            // InternalHriDsl.g:3896:2: ( RULE_FLOAT )
            // InternalHriDsl.g:3897:3: RULE_FLOAT
            {
             before(grammarAccess.getCoordinatesAccess().getYFLOATTerminalRuleCall_3_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getCoordinatesAccess().getYFLOATTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__YAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000F80000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000007C00000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});

}