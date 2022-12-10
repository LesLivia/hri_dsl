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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_DEC", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'m'", "'km'", "'cm'", "'turtlebot3_burger'", "'turtlebot3_wafflepi'", "'tiago'", "'pepper'", "'young_healthy'", "'young_sick'", "'elderly_healthy'", "'elderly_sick'", "'covid_patient'", "'normal'", "'high'", "'low'", "'disabled'", "'robot_leader'", "'robot_follower'", "'robot_transporter'", "'robot_competitor'", "'robot_rescuer'", "'robot_client'", "'simulation'", "'probability_of_success'", "'expected_fatigue'", "'expected_charge'", "'probability_of_failure'", "'parameter'", "'length_unit'", "'define'", "'layout'", "':'", "'area'", "'in'", "'poi'", "'robots'", "'robot'", "'type'", "'charge'", "'humans'", "'human'", "'speed'", "'dexterity'", "'is'", "'freewill'", "'mission'", "'do'", "'for'", "'with'", "'target'", "'queries'", "'of'", "'compute'", "'duration'", "'runs'", "'('", "','", "')'"
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
    public static final int RULE_DEC=8;
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
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
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
    // InternalHriDsl.g:575:1: rule__Type__Alternatives : ( ( ( 'turtlebot3_burger' ) ) | ( ( 'turtlebot3_wafflepi' ) ) | ( ( 'tiago' ) ) | ( ( 'pepper' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:579:1: ( ( ( 'turtlebot3_burger' ) ) | ( ( 'turtlebot3_wafflepi' ) ) | ( ( 'tiago' ) ) | ( ( 'pepper' ) ) )
            int alt2=4;
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
            case 19:
                {
                alt2=4;
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
                    // InternalHriDsl.g:586:2: ( ( 'turtlebot3_wafflepi' ) )
                    {
                    // InternalHriDsl.g:586:2: ( ( 'turtlebot3_wafflepi' ) )
                    // InternalHriDsl.g:587:3: ( 'turtlebot3_wafflepi' )
                    {
                     before(grammarAccess.getTypeAccess().getTURTLEBOT3_WAFFLEPIEnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:588:3: ( 'turtlebot3_wafflepi' )
                    // InternalHriDsl.g:588:4: 'turtlebot3_wafflepi'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getTURTLEBOT3_WAFFLEPIEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:592:2: ( ( 'tiago' ) )
                    {
                    // InternalHriDsl.g:592:2: ( ( 'tiago' ) )
                    // InternalHriDsl.g:593:3: ( 'tiago' )
                    {
                     before(grammarAccess.getTypeAccess().getTIAGOEnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:594:3: ( 'tiago' )
                    // InternalHriDsl.g:594:4: 'tiago'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getTIAGOEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:598:2: ( ( 'pepper' ) )
                    {
                    // InternalHriDsl.g:598:2: ( ( 'pepper' ) )
                    // InternalHriDsl.g:599:3: ( 'pepper' )
                    {
                     before(grammarAccess.getTypeAccess().getPEPPEREnumLiteralDeclaration_3()); 
                    // InternalHriDsl.g:600:3: ( 'pepper' )
                    // InternalHriDsl.g:600:4: 'pepper'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getPEPPEREnumLiteralDeclaration_3()); 

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
    // InternalHriDsl.g:608:1: rule__Fatigue_profile__Alternatives : ( ( ( 'young_healthy' ) ) | ( ( 'young_sick' ) ) | ( ( 'elderly_healthy' ) ) | ( ( 'elderly_sick' ) ) | ( ( 'covid_patient' ) ) );
    public final void rule__Fatigue_profile__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:612:1: ( ( ( 'young_healthy' ) ) | ( ( 'young_sick' ) ) | ( ( 'elderly_healthy' ) ) | ( ( 'elderly_sick' ) ) | ( ( 'covid_patient' ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            case 23:
                {
                alt3=4;
                }
                break;
            case 24:
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
                    // InternalHriDsl.g:613:2: ( ( 'young_healthy' ) )
                    {
                    // InternalHriDsl.g:613:2: ( ( 'young_healthy' ) )
                    // InternalHriDsl.g:614:3: ( 'young_healthy' )
                    {
                     before(grammarAccess.getFatigue_profileAccess().getYOUNG_HEALTHYEnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:615:3: ( 'young_healthy' )
                    // InternalHriDsl.g:615:4: 'young_healthy'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getFatigue_profileAccess().getYOUNG_HEALTHYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:619:2: ( ( 'young_sick' ) )
                    {
                    // InternalHriDsl.g:619:2: ( ( 'young_sick' ) )
                    // InternalHriDsl.g:620:3: ( 'young_sick' )
                    {
                     before(grammarAccess.getFatigue_profileAccess().getYOUNG_SICKEnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:621:3: ( 'young_sick' )
                    // InternalHriDsl.g:621:4: 'young_sick'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getFatigue_profileAccess().getYOUNG_SICKEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:625:2: ( ( 'elderly_healthy' ) )
                    {
                    // InternalHriDsl.g:625:2: ( ( 'elderly_healthy' ) )
                    // InternalHriDsl.g:626:3: ( 'elderly_healthy' )
                    {
                     before(grammarAccess.getFatigue_profileAccess().getELDERLY_HEALTHYEnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:627:3: ( 'elderly_healthy' )
                    // InternalHriDsl.g:627:4: 'elderly_healthy'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getFatigue_profileAccess().getELDERLY_HEALTHYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:631:2: ( ( 'elderly_sick' ) )
                    {
                    // InternalHriDsl.g:631:2: ( ( 'elderly_sick' ) )
                    // InternalHriDsl.g:632:3: ( 'elderly_sick' )
                    {
                     before(grammarAccess.getFatigue_profileAccess().getELDERLY_SICKEnumLiteralDeclaration_3()); 
                    // InternalHriDsl.g:633:3: ( 'elderly_sick' )
                    // InternalHriDsl.g:633:4: 'elderly_sick'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getFatigue_profileAccess().getELDERLY_SICKEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHriDsl.g:637:2: ( ( 'covid_patient' ) )
                    {
                    // InternalHriDsl.g:637:2: ( ( 'covid_patient' ) )
                    // InternalHriDsl.g:638:3: ( 'covid_patient' )
                    {
                     before(grammarAccess.getFatigue_profileAccess().getCOVID_PATIENTEnumLiteralDeclaration_4()); 
                    // InternalHriDsl.g:639:3: ( 'covid_patient' )
                    // InternalHriDsl.g:639:4: 'covid_patient'
                    {
                    match(input,24,FOLLOW_2); 

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
    // InternalHriDsl.g:647:1: rule__Free_will_profile__Alternatives : ( ( ( 'normal' ) ) | ( ( 'high' ) ) | ( ( 'low' ) ) | ( ( 'disabled' ) ) );
    public final void rule__Free_will_profile__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:651:1: ( ( ( 'normal' ) ) | ( ( 'high' ) ) | ( ( 'low' ) ) | ( ( 'disabled' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case 27:
                {
                alt4=3;
                }
                break;
            case 28:
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
                    // InternalHriDsl.g:652:2: ( ( 'normal' ) )
                    {
                    // InternalHriDsl.g:652:2: ( ( 'normal' ) )
                    // InternalHriDsl.g:653:3: ( 'normal' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getNORMALEnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:654:3: ( 'normal' )
                    // InternalHriDsl.g:654:4: 'normal'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getNORMALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:658:2: ( ( 'high' ) )
                    {
                    // InternalHriDsl.g:658:2: ( ( 'high' ) )
                    // InternalHriDsl.g:659:3: ( 'high' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getHIGHEnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:660:3: ( 'high' )
                    // InternalHriDsl.g:660:4: 'high'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getHIGHEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:664:2: ( ( 'low' ) )
                    {
                    // InternalHriDsl.g:664:2: ( ( 'low' ) )
                    // InternalHriDsl.g:665:3: ( 'low' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getLOWEnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:666:3: ( 'low' )
                    // InternalHriDsl.g:666:4: 'low'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getLOWEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:670:2: ( ( 'disabled' ) )
                    {
                    // InternalHriDsl.g:670:2: ( ( 'disabled' ) )
                    // InternalHriDsl.g:671:3: ( 'disabled' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getDISABLEDEnumLiteralDeclaration_3()); 
                    // InternalHriDsl.g:672:3: ( 'disabled' )
                    // InternalHriDsl.g:672:4: 'disabled'
                    {
                    match(input,28,FOLLOW_2); 

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
    // InternalHriDsl.g:680:1: rule__Pattern__Alternatives : ( ( ( 'robot_leader' ) ) | ( ( 'robot_follower' ) ) | ( ( 'robot_transporter' ) ) | ( ( 'robot_competitor' ) ) | ( ( 'robot_rescuer' ) ) | ( ( 'robot_client' ) ) );
    public final void rule__Pattern__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:684:1: ( ( ( 'robot_leader' ) ) | ( ( 'robot_follower' ) ) | ( ( 'robot_transporter' ) ) | ( ( 'robot_competitor' ) ) | ( ( 'robot_rescuer' ) ) | ( ( 'robot_client' ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt5=1;
                }
                break;
            case 30:
                {
                alt5=2;
                }
                break;
            case 31:
                {
                alt5=3;
                }
                break;
            case 32:
                {
                alt5=4;
                }
                break;
            case 33:
                {
                alt5=5;
                }
                break;
            case 34:
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
                    // InternalHriDsl.g:685:2: ( ( 'robot_leader' ) )
                    {
                    // InternalHriDsl.g:685:2: ( ( 'robot_leader' ) )
                    // InternalHriDsl.g:686:3: ( 'robot_leader' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_LEADEREnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:687:3: ( 'robot_leader' )
                    // InternalHriDsl.g:687:4: 'robot_leader'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getPatternAccess().getROBOT_LEADEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:691:2: ( ( 'robot_follower' ) )
                    {
                    // InternalHriDsl.g:691:2: ( ( 'robot_follower' ) )
                    // InternalHriDsl.g:692:3: ( 'robot_follower' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_FOLLOWEREnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:693:3: ( 'robot_follower' )
                    // InternalHriDsl.g:693:4: 'robot_follower'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getPatternAccess().getROBOT_FOLLOWEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:697:2: ( ( 'robot_transporter' ) )
                    {
                    // InternalHriDsl.g:697:2: ( ( 'robot_transporter' ) )
                    // InternalHriDsl.g:698:3: ( 'robot_transporter' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_TRANSPORTEREnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:699:3: ( 'robot_transporter' )
                    // InternalHriDsl.g:699:4: 'robot_transporter'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getPatternAccess().getROBOT_TRANSPORTEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:703:2: ( ( 'robot_competitor' ) )
                    {
                    // InternalHriDsl.g:703:2: ( ( 'robot_competitor' ) )
                    // InternalHriDsl.g:704:3: ( 'robot_competitor' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_COMPETITOREnumLiteralDeclaration_3()); 
                    // InternalHriDsl.g:705:3: ( 'robot_competitor' )
                    // InternalHriDsl.g:705:4: 'robot_competitor'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getPatternAccess().getROBOT_COMPETITOREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHriDsl.g:709:2: ( ( 'robot_rescuer' ) )
                    {
                    // InternalHriDsl.g:709:2: ( ( 'robot_rescuer' ) )
                    // InternalHriDsl.g:710:3: ( 'robot_rescuer' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_RESCUEREnumLiteralDeclaration_4()); 
                    // InternalHriDsl.g:711:3: ( 'robot_rescuer' )
                    // InternalHriDsl.g:711:4: 'robot_rescuer'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getPatternAccess().getROBOT_RESCUEREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHriDsl.g:715:2: ( ( 'robot_client' ) )
                    {
                    // InternalHriDsl.g:715:2: ( ( 'robot_client' ) )
                    // InternalHriDsl.g:716:3: ( 'robot_client' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_ASSISTANTEnumLiteralDeclaration_5()); 
                    // InternalHriDsl.g:717:3: ( 'robot_client' )
                    // InternalHriDsl.g:717:4: 'robot_client'
                    {
                    match(input,34,FOLLOW_2); 

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
    // InternalHriDsl.g:725:1: rule__Query_type__Alternatives : ( ( ( 'simulation' ) ) | ( ( 'probability_of_success' ) ) | ( ( 'expected_fatigue' ) ) | ( ( 'expected_charge' ) ) | ( ( 'probability_of_failure' ) ) );
    public final void rule__Query_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:729:1: ( ( ( 'simulation' ) ) | ( ( 'probability_of_success' ) ) | ( ( 'expected_fatigue' ) ) | ( ( 'expected_charge' ) ) | ( ( 'probability_of_failure' ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt6=1;
                }
                break;
            case 36:
                {
                alt6=2;
                }
                break;
            case 37:
                {
                alt6=3;
                }
                break;
            case 38:
                {
                alt6=4;
                }
                break;
            case 39:
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
                    // InternalHriDsl.g:730:2: ( ( 'simulation' ) )
                    {
                    // InternalHriDsl.g:730:2: ( ( 'simulation' ) )
                    // InternalHriDsl.g:731:3: ( 'simulation' )
                    {
                     before(grammarAccess.getQuery_typeAccess().getSIMULATIONEnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:732:3: ( 'simulation' )
                    // InternalHriDsl.g:732:4: 'simulation'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuery_typeAccess().getSIMULATIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:736:2: ( ( 'probability_of_success' ) )
                    {
                    // InternalHriDsl.g:736:2: ( ( 'probability_of_success' ) )
                    // InternalHriDsl.g:737:3: ( 'probability_of_success' )
                    {
                     before(grammarAccess.getQuery_typeAccess().getPROBABILITY_OF_SUCCESSEnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:738:3: ( 'probability_of_success' )
                    // InternalHriDsl.g:738:4: 'probability_of_success'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuery_typeAccess().getPROBABILITY_OF_SUCCESSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:742:2: ( ( 'expected_fatigue' ) )
                    {
                    // InternalHriDsl.g:742:2: ( ( 'expected_fatigue' ) )
                    // InternalHriDsl.g:743:3: ( 'expected_fatigue' )
                    {
                     before(grammarAccess.getQuery_typeAccess().getEXPECTED_FATIGUEEnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:744:3: ( 'expected_fatigue' )
                    // InternalHriDsl.g:744:4: 'expected_fatigue'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuery_typeAccess().getEXPECTED_FATIGUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:748:2: ( ( 'expected_charge' ) )
                    {
                    // InternalHriDsl.g:748:2: ( ( 'expected_charge' ) )
                    // InternalHriDsl.g:749:3: ( 'expected_charge' )
                    {
                     before(grammarAccess.getQuery_typeAccess().getEXPECTED_CHARGEEnumLiteralDeclaration_3()); 
                    // InternalHriDsl.g:750:3: ( 'expected_charge' )
                    // InternalHriDsl.g:750:4: 'expected_charge'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuery_typeAccess().getEXPECTED_CHARGEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHriDsl.g:754:2: ( ( 'probability_of_failure' ) )
                    {
                    // InternalHriDsl.g:754:2: ( ( 'probability_of_failure' ) )
                    // InternalHriDsl.g:755:3: ( 'probability_of_failure' )
                    {
                     before(grammarAccess.getQuery_typeAccess().getPROBABILITY_OF_FAILUREEnumLiteralDeclaration_4()); 
                    // InternalHriDsl.g:756:3: ( 'probability_of_failure' )
                    // InternalHriDsl.g:756:4: 'probability_of_failure'
                    {
                    match(input,39,FOLLOW_2); 

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
    // InternalHriDsl.g:764:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:768:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalHriDsl.g:769:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalHriDsl.g:776:1: rule__Model__Group__0__Impl : ( ( rule__Model__ParameterAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:780:1: ( ( ( rule__Model__ParameterAssignment_0 )? ) )
            // InternalHriDsl.g:781:1: ( ( rule__Model__ParameterAssignment_0 )? )
            {
            // InternalHriDsl.g:781:1: ( ( rule__Model__ParameterAssignment_0 )? )
            // InternalHriDsl.g:782:2: ( rule__Model__ParameterAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getParameterAssignment_0()); 
            // InternalHriDsl.g:783:2: ( rule__Model__ParameterAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==40) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalHriDsl.g:783:3: rule__Model__ParameterAssignment_0
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
    // InternalHriDsl.g:791:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:795:1: ( rule__Model__Group__1__Impl )
            // InternalHriDsl.g:796:2: rule__Model__Group__1__Impl
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
    // InternalHriDsl.g:802:1: rule__Model__Group__1__Impl : ( ( rule__Model__ScenariosAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:806:1: ( ( ( rule__Model__ScenariosAssignment_1 )* ) )
            // InternalHriDsl.g:807:1: ( ( rule__Model__ScenariosAssignment_1 )* )
            {
            // InternalHriDsl.g:807:1: ( ( rule__Model__ScenariosAssignment_1 )* )
            // InternalHriDsl.g:808:2: ( rule__Model__ScenariosAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getScenariosAssignment_1()); 
            // InternalHriDsl.g:809:2: ( rule__Model__ScenariosAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==42) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalHriDsl.g:809:3: rule__Model__ScenariosAssignment_1
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
    // InternalHriDsl.g:818:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:822:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalHriDsl.g:823:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalHriDsl.g:830:1: rule__Parameter__Group__0__Impl : ( 'parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:834:1: ( ( 'parameter' ) )
            // InternalHriDsl.g:835:1: ( 'parameter' )
            {
            // InternalHriDsl.g:835:1: ( 'parameter' )
            // InternalHriDsl.g:836:2: 'parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalHriDsl.g:845:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:849:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalHriDsl.g:850:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalHriDsl.g:857:1: rule__Parameter__Group__1__Impl : ( 'length_unit' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:861:1: ( ( 'length_unit' ) )
            // InternalHriDsl.g:862:1: ( 'length_unit' )
            {
            // InternalHriDsl.g:862:1: ( 'length_unit' )
            // InternalHriDsl.g:863:2: 'length_unit'
            {
             before(grammarAccess.getParameterAccess().getLength_unitKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalHriDsl.g:872:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:876:1: ( rule__Parameter__Group__2__Impl )
            // InternalHriDsl.g:877:2: rule__Parameter__Group__2__Impl
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
    // InternalHriDsl.g:883:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__Length_unitAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:887:1: ( ( ( rule__Parameter__Length_unitAssignment_2 ) ) )
            // InternalHriDsl.g:888:1: ( ( rule__Parameter__Length_unitAssignment_2 ) )
            {
            // InternalHriDsl.g:888:1: ( ( rule__Parameter__Length_unitAssignment_2 ) )
            // InternalHriDsl.g:889:2: ( rule__Parameter__Length_unitAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getLength_unitAssignment_2()); 
            // InternalHriDsl.g:890:2: ( rule__Parameter__Length_unitAssignment_2 )
            // InternalHriDsl.g:890:3: rule__Parameter__Length_unitAssignment_2
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
    // InternalHriDsl.g:899:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:903:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalHriDsl.g:904:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalHriDsl.g:911:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__FloorAssignment_0 ) ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:915:1: ( ( ( rule__Scenario__FloorAssignment_0 ) ) )
            // InternalHriDsl.g:916:1: ( ( rule__Scenario__FloorAssignment_0 ) )
            {
            // InternalHriDsl.g:916:1: ( ( rule__Scenario__FloorAssignment_0 ) )
            // InternalHriDsl.g:917:2: ( rule__Scenario__FloorAssignment_0 )
            {
             before(grammarAccess.getScenarioAccess().getFloorAssignment_0()); 
            // InternalHriDsl.g:918:2: ( rule__Scenario__FloorAssignment_0 )
            // InternalHriDsl.g:918:3: rule__Scenario__FloorAssignment_0
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
    // InternalHriDsl.g:926:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:930:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalHriDsl.g:931:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalHriDsl.g:938:1: rule__Scenario__Group__1__Impl : ( ( rule__Scenario__RobotsAssignment_1 ) ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:942:1: ( ( ( rule__Scenario__RobotsAssignment_1 ) ) )
            // InternalHriDsl.g:943:1: ( ( rule__Scenario__RobotsAssignment_1 ) )
            {
            // InternalHriDsl.g:943:1: ( ( rule__Scenario__RobotsAssignment_1 ) )
            // InternalHriDsl.g:944:2: ( rule__Scenario__RobotsAssignment_1 )
            {
             before(grammarAccess.getScenarioAccess().getRobotsAssignment_1()); 
            // InternalHriDsl.g:945:2: ( rule__Scenario__RobotsAssignment_1 )
            // InternalHriDsl.g:945:3: rule__Scenario__RobotsAssignment_1
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
    // InternalHriDsl.g:953:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:957:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalHriDsl.g:958:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalHriDsl.g:965:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__HumansAssignment_2 ) ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:969:1: ( ( ( rule__Scenario__HumansAssignment_2 ) ) )
            // InternalHriDsl.g:970:1: ( ( rule__Scenario__HumansAssignment_2 ) )
            {
            // InternalHriDsl.g:970:1: ( ( rule__Scenario__HumansAssignment_2 ) )
            // InternalHriDsl.g:971:2: ( rule__Scenario__HumansAssignment_2 )
            {
             before(grammarAccess.getScenarioAccess().getHumansAssignment_2()); 
            // InternalHriDsl.g:972:2: ( rule__Scenario__HumansAssignment_2 )
            // InternalHriDsl.g:972:3: rule__Scenario__HumansAssignment_2
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
    // InternalHriDsl.g:980:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:984:1: ( rule__Scenario__Group__3__Impl )
            // InternalHriDsl.g:985:2: rule__Scenario__Group__3__Impl
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
    // InternalHriDsl.g:991:1: rule__Scenario__Group__3__Impl : ( ( ( rule__Scenario__MissionsAssignment_3 ) ) ( ( rule__Scenario__MissionsAssignment_3 )* ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:995:1: ( ( ( ( rule__Scenario__MissionsAssignment_3 ) ) ( ( rule__Scenario__MissionsAssignment_3 )* ) ) )
            // InternalHriDsl.g:996:1: ( ( ( rule__Scenario__MissionsAssignment_3 ) ) ( ( rule__Scenario__MissionsAssignment_3 )* ) )
            {
            // InternalHriDsl.g:996:1: ( ( ( rule__Scenario__MissionsAssignment_3 ) ) ( ( rule__Scenario__MissionsAssignment_3 )* ) )
            // InternalHriDsl.g:997:2: ( ( rule__Scenario__MissionsAssignment_3 ) ) ( ( rule__Scenario__MissionsAssignment_3 )* )
            {
            // InternalHriDsl.g:997:2: ( ( rule__Scenario__MissionsAssignment_3 ) )
            // InternalHriDsl.g:998:3: ( rule__Scenario__MissionsAssignment_3 )
            {
             before(grammarAccess.getScenarioAccess().getMissionsAssignment_3()); 
            // InternalHriDsl.g:999:3: ( rule__Scenario__MissionsAssignment_3 )
            // InternalHriDsl.g:999:4: rule__Scenario__MissionsAssignment_3
            {
            pushFollow(FOLLOW_4);
            rule__Scenario__MissionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getMissionsAssignment_3()); 

            }

            // InternalHriDsl.g:1002:2: ( ( rule__Scenario__MissionsAssignment_3 )* )
            // InternalHriDsl.g:1003:3: ( rule__Scenario__MissionsAssignment_3 )*
            {
             before(grammarAccess.getScenarioAccess().getMissionsAssignment_3()); 
            // InternalHriDsl.g:1004:3: ( rule__Scenario__MissionsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==42) ) {
                    int LA9_2 = input.LA(2);

                    if ( (LA9_2==58) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalHriDsl.g:1004:4: rule__Scenario__MissionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
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
    // InternalHriDsl.g:1014:1: rule__Floor__Group__0 : rule__Floor__Group__0__Impl rule__Floor__Group__1 ;
    public final void rule__Floor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1018:1: ( rule__Floor__Group__0__Impl rule__Floor__Group__1 )
            // InternalHriDsl.g:1019:2: rule__Floor__Group__0__Impl rule__Floor__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalHriDsl.g:1026:1: rule__Floor__Group__0__Impl : ( 'define' ) ;
    public final void rule__Floor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1030:1: ( ( 'define' ) )
            // InternalHriDsl.g:1031:1: ( 'define' )
            {
            // InternalHriDsl.g:1031:1: ( 'define' )
            // InternalHriDsl.g:1032:2: 'define'
            {
             before(grammarAccess.getFloorAccess().getDefineKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getDefineKeyword_0()); 

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
    // InternalHriDsl.g:1041:1: rule__Floor__Group__1 : rule__Floor__Group__1__Impl rule__Floor__Group__2 ;
    public final void rule__Floor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1045:1: ( rule__Floor__Group__1__Impl rule__Floor__Group__2 )
            // InternalHriDsl.g:1046:2: rule__Floor__Group__1__Impl rule__Floor__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalHriDsl.g:1053:1: rule__Floor__Group__1__Impl : ( 'layout' ) ;
    public final void rule__Floor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1057:1: ( ( 'layout' ) )
            // InternalHriDsl.g:1058:1: ( 'layout' )
            {
            // InternalHriDsl.g:1058:1: ( 'layout' )
            // InternalHriDsl.g:1059:2: 'layout'
            {
             before(grammarAccess.getFloorAccess().getLayoutKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getLayoutKeyword_1()); 

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
    // InternalHriDsl.g:1068:1: rule__Floor__Group__2 : rule__Floor__Group__2__Impl rule__Floor__Group__3 ;
    public final void rule__Floor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1072:1: ( rule__Floor__Group__2__Impl rule__Floor__Group__3 )
            // InternalHriDsl.g:1073:2: rule__Floor__Group__2__Impl rule__Floor__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalHriDsl.g:1080:1: rule__Floor__Group__2__Impl : ( ( rule__Floor__Floor_nameAssignment_2 ) ) ;
    public final void rule__Floor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1084:1: ( ( ( rule__Floor__Floor_nameAssignment_2 ) ) )
            // InternalHriDsl.g:1085:1: ( ( rule__Floor__Floor_nameAssignment_2 ) )
            {
            // InternalHriDsl.g:1085:1: ( ( rule__Floor__Floor_nameAssignment_2 ) )
            // InternalHriDsl.g:1086:2: ( rule__Floor__Floor_nameAssignment_2 )
            {
             before(grammarAccess.getFloorAccess().getFloor_nameAssignment_2()); 
            // InternalHriDsl.g:1087:2: ( rule__Floor__Floor_nameAssignment_2 )
            // InternalHriDsl.g:1087:3: rule__Floor__Floor_nameAssignment_2
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
    // InternalHriDsl.g:1095:1: rule__Floor__Group__3 : rule__Floor__Group__3__Impl rule__Floor__Group__4 ;
    public final void rule__Floor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1099:1: ( rule__Floor__Group__3__Impl rule__Floor__Group__4 )
            // InternalHriDsl.g:1100:2: rule__Floor__Group__3__Impl rule__Floor__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalHriDsl.g:1107:1: rule__Floor__Group__3__Impl : ( ':' ) ;
    public final void rule__Floor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1111:1: ( ( ':' ) )
            // InternalHriDsl.g:1112:1: ( ':' )
            {
            // InternalHriDsl.g:1112:1: ( ':' )
            // InternalHriDsl.g:1113:2: ':'
            {
             before(grammarAccess.getFloorAccess().getColonKeyword_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalHriDsl.g:1122:1: rule__Floor__Group__4 : rule__Floor__Group__4__Impl rule__Floor__Group__5 ;
    public final void rule__Floor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1126:1: ( rule__Floor__Group__4__Impl rule__Floor__Group__5 )
            // InternalHriDsl.g:1127:2: rule__Floor__Group__4__Impl rule__Floor__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalHriDsl.g:1134:1: rule__Floor__Group__4__Impl : ( ( ( rule__Floor__SurfacesAssignment_4 ) ) ( ( rule__Floor__SurfacesAssignment_4 )* ) ) ;
    public final void rule__Floor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1138:1: ( ( ( ( rule__Floor__SurfacesAssignment_4 ) ) ( ( rule__Floor__SurfacesAssignment_4 )* ) ) )
            // InternalHriDsl.g:1139:1: ( ( ( rule__Floor__SurfacesAssignment_4 ) ) ( ( rule__Floor__SurfacesAssignment_4 )* ) )
            {
            // InternalHriDsl.g:1139:1: ( ( ( rule__Floor__SurfacesAssignment_4 ) ) ( ( rule__Floor__SurfacesAssignment_4 )* ) )
            // InternalHriDsl.g:1140:2: ( ( rule__Floor__SurfacesAssignment_4 ) ) ( ( rule__Floor__SurfacesAssignment_4 )* )
            {
            // InternalHriDsl.g:1140:2: ( ( rule__Floor__SurfacesAssignment_4 ) )
            // InternalHriDsl.g:1141:3: ( rule__Floor__SurfacesAssignment_4 )
            {
             before(grammarAccess.getFloorAccess().getSurfacesAssignment_4()); 
            // InternalHriDsl.g:1142:3: ( rule__Floor__SurfacesAssignment_4 )
            // InternalHriDsl.g:1142:4: rule__Floor__SurfacesAssignment_4
            {
            pushFollow(FOLLOW_12);
            rule__Floor__SurfacesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getSurfacesAssignment_4()); 

            }

            // InternalHriDsl.g:1145:2: ( ( rule__Floor__SurfacesAssignment_4 )* )
            // InternalHriDsl.g:1146:3: ( rule__Floor__SurfacesAssignment_4 )*
            {
             before(grammarAccess.getFloorAccess().getSurfacesAssignment_4()); 
            // InternalHriDsl.g:1147:3: ( rule__Floor__SurfacesAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==45) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalHriDsl.g:1147:4: rule__Floor__SurfacesAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalHriDsl.g:1156:1: rule__Floor__Group__5 : rule__Floor__Group__5__Impl ;
    public final void rule__Floor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1160:1: ( rule__Floor__Group__5__Impl )
            // InternalHriDsl.g:1161:2: rule__Floor__Group__5__Impl
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
    // InternalHriDsl.g:1167:1: rule__Floor__Group__5__Impl : ( ( ( rule__Floor__PointsAssignment_5 ) ) ( ( rule__Floor__PointsAssignment_5 )* ) ) ;
    public final void rule__Floor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1171:1: ( ( ( ( rule__Floor__PointsAssignment_5 ) ) ( ( rule__Floor__PointsAssignment_5 )* ) ) )
            // InternalHriDsl.g:1172:1: ( ( ( rule__Floor__PointsAssignment_5 ) ) ( ( rule__Floor__PointsAssignment_5 )* ) )
            {
            // InternalHriDsl.g:1172:1: ( ( ( rule__Floor__PointsAssignment_5 ) ) ( ( rule__Floor__PointsAssignment_5 )* ) )
            // InternalHriDsl.g:1173:2: ( ( rule__Floor__PointsAssignment_5 ) ) ( ( rule__Floor__PointsAssignment_5 )* )
            {
            // InternalHriDsl.g:1173:2: ( ( rule__Floor__PointsAssignment_5 ) )
            // InternalHriDsl.g:1174:3: ( rule__Floor__PointsAssignment_5 )
            {
             before(grammarAccess.getFloorAccess().getPointsAssignment_5()); 
            // InternalHriDsl.g:1175:3: ( rule__Floor__PointsAssignment_5 )
            // InternalHriDsl.g:1175:4: rule__Floor__PointsAssignment_5
            {
            pushFollow(FOLLOW_13);
            rule__Floor__PointsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getPointsAssignment_5()); 

            }

            // InternalHriDsl.g:1178:2: ( ( rule__Floor__PointsAssignment_5 )* )
            // InternalHriDsl.g:1179:3: ( rule__Floor__PointsAssignment_5 )*
            {
             before(grammarAccess.getFloorAccess().getPointsAssignment_5()); 
            // InternalHriDsl.g:1180:3: ( rule__Floor__PointsAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==47) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalHriDsl.g:1180:4: rule__Floor__PointsAssignment_5
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
    // InternalHriDsl.g:1190:1: rule__Surface__Group__0 : rule__Surface__Group__0__Impl rule__Surface__Group__1 ;
    public final void rule__Surface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1194:1: ( rule__Surface__Group__0__Impl rule__Surface__Group__1 )
            // InternalHriDsl.g:1195:2: rule__Surface__Group__0__Impl rule__Surface__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalHriDsl.g:1202:1: rule__Surface__Group__0__Impl : ( 'area' ) ;
    public final void rule__Surface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1206:1: ( ( 'area' ) )
            // InternalHriDsl.g:1207:1: ( 'area' )
            {
            // InternalHriDsl.g:1207:1: ( 'area' )
            // InternalHriDsl.g:1208:2: 'area'
            {
             before(grammarAccess.getSurfaceAccess().getAreaKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSurfaceAccess().getAreaKeyword_0()); 

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
    // InternalHriDsl.g:1217:1: rule__Surface__Group__1 : rule__Surface__Group__1__Impl rule__Surface__Group__2 ;
    public final void rule__Surface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1221:1: ( rule__Surface__Group__1__Impl rule__Surface__Group__2 )
            // InternalHriDsl.g:1222:2: rule__Surface__Group__1__Impl rule__Surface__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalHriDsl.g:1229:1: rule__Surface__Group__1__Impl : ( ( rule__Surface__NameAssignment_1 ) ) ;
    public final void rule__Surface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1233:1: ( ( ( rule__Surface__NameAssignment_1 ) ) )
            // InternalHriDsl.g:1234:1: ( ( rule__Surface__NameAssignment_1 ) )
            {
            // InternalHriDsl.g:1234:1: ( ( rule__Surface__NameAssignment_1 ) )
            // InternalHriDsl.g:1235:2: ( rule__Surface__NameAssignment_1 )
            {
             before(grammarAccess.getSurfaceAccess().getNameAssignment_1()); 
            // InternalHriDsl.g:1236:2: ( rule__Surface__NameAssignment_1 )
            // InternalHriDsl.g:1236:3: rule__Surface__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Surface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSurfaceAccess().getNameAssignment_1()); 

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
    // InternalHriDsl.g:1244:1: rule__Surface__Group__2 : rule__Surface__Group__2__Impl rule__Surface__Group__3 ;
    public final void rule__Surface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1248:1: ( rule__Surface__Group__2__Impl rule__Surface__Group__3 )
            // InternalHriDsl.g:1249:2: rule__Surface__Group__2__Impl rule__Surface__Group__3
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
    // InternalHriDsl.g:1256:1: rule__Surface__Group__2__Impl : ( 'in' ) ;
    public final void rule__Surface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1260:1: ( ( 'in' ) )
            // InternalHriDsl.g:1261:1: ( 'in' )
            {
            // InternalHriDsl.g:1261:1: ( 'in' )
            // InternalHriDsl.g:1262:2: 'in'
            {
             before(grammarAccess.getSurfaceAccess().getInKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSurfaceAccess().getInKeyword_2()); 

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
    // InternalHriDsl.g:1271:1: rule__Surface__Group__3 : rule__Surface__Group__3__Impl ;
    public final void rule__Surface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1275:1: ( rule__Surface__Group__3__Impl )
            // InternalHriDsl.g:1276:2: rule__Surface__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Surface__Group__3__Impl();

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
    // InternalHriDsl.g:1282:1: rule__Surface__Group__3__Impl : ( ( rule__Surface__VerticesAssignment_3 ) ) ;
    public final void rule__Surface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1286:1: ( ( ( rule__Surface__VerticesAssignment_3 ) ) )
            // InternalHriDsl.g:1287:1: ( ( rule__Surface__VerticesAssignment_3 ) )
            {
            // InternalHriDsl.g:1287:1: ( ( rule__Surface__VerticesAssignment_3 ) )
            // InternalHriDsl.g:1288:2: ( rule__Surface__VerticesAssignment_3 )
            {
             before(grammarAccess.getSurfaceAccess().getVerticesAssignment_3()); 
            // InternalHriDsl.g:1289:2: ( rule__Surface__VerticesAssignment_3 )
            // InternalHriDsl.g:1289:3: rule__Surface__VerticesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Surface__VerticesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSurfaceAccess().getVerticesAssignment_3()); 

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


    // $ANTLR start "rule__Vertices__Group__0"
    // InternalHriDsl.g:1298:1: rule__Vertices__Group__0 : rule__Vertices__Group__0__Impl rule__Vertices__Group__1 ;
    public final void rule__Vertices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1302:1: ( rule__Vertices__Group__0__Impl rule__Vertices__Group__1 )
            // InternalHriDsl.g:1303:2: rule__Vertices__Group__0__Impl rule__Vertices__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalHriDsl.g:1310:1: rule__Vertices__Group__0__Impl : ( ( rule__Vertices__Vertex_AAssignment_0 ) ) ;
    public final void rule__Vertices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1314:1: ( ( ( rule__Vertices__Vertex_AAssignment_0 ) ) )
            // InternalHriDsl.g:1315:1: ( ( rule__Vertices__Vertex_AAssignment_0 ) )
            {
            // InternalHriDsl.g:1315:1: ( ( rule__Vertices__Vertex_AAssignment_0 ) )
            // InternalHriDsl.g:1316:2: ( rule__Vertices__Vertex_AAssignment_0 )
            {
             before(grammarAccess.getVerticesAccess().getVertex_AAssignment_0()); 
            // InternalHriDsl.g:1317:2: ( rule__Vertices__Vertex_AAssignment_0 )
            // InternalHriDsl.g:1317:3: rule__Vertices__Vertex_AAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Vertices__Vertex_AAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVerticesAccess().getVertex_AAssignment_0()); 

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
    // InternalHriDsl.g:1325:1: rule__Vertices__Group__1 : rule__Vertices__Group__1__Impl ;
    public final void rule__Vertices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1329:1: ( rule__Vertices__Group__1__Impl )
            // InternalHriDsl.g:1330:2: rule__Vertices__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vertices__Group__1__Impl();

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
    // InternalHriDsl.g:1336:1: rule__Vertices__Group__1__Impl : ( ( rule__Vertices__Vertex_CAssignment_1 ) ) ;
    public final void rule__Vertices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1340:1: ( ( ( rule__Vertices__Vertex_CAssignment_1 ) ) )
            // InternalHriDsl.g:1341:1: ( ( rule__Vertices__Vertex_CAssignment_1 ) )
            {
            // InternalHriDsl.g:1341:1: ( ( rule__Vertices__Vertex_CAssignment_1 ) )
            // InternalHriDsl.g:1342:2: ( rule__Vertices__Vertex_CAssignment_1 )
            {
             before(grammarAccess.getVerticesAccess().getVertex_CAssignment_1()); 
            // InternalHriDsl.g:1343:2: ( rule__Vertices__Vertex_CAssignment_1 )
            // InternalHriDsl.g:1343:3: rule__Vertices__Vertex_CAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Vertices__Vertex_CAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVerticesAccess().getVertex_CAssignment_1()); 

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


    // $ANTLR start "rule__Point__Group__0"
    // InternalHriDsl.g:1352:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1356:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalHriDsl.g:1357:2: rule__Point__Group__0__Impl rule__Point__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalHriDsl.g:1364:1: rule__Point__Group__0__Impl : ( 'poi' ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1368:1: ( ( 'poi' ) )
            // InternalHriDsl.g:1369:1: ( 'poi' )
            {
            // InternalHriDsl.g:1369:1: ( 'poi' )
            // InternalHriDsl.g:1370:2: 'poi'
            {
             before(grammarAccess.getPointAccess().getPoiKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getPoiKeyword_0()); 

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
    // InternalHriDsl.g:1379:1: rule__Point__Group__1 : rule__Point__Group__1__Impl rule__Point__Group__2 ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1383:1: ( rule__Point__Group__1__Impl rule__Point__Group__2 )
            // InternalHriDsl.g:1384:2: rule__Point__Group__1__Impl rule__Point__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalHriDsl.g:1391:1: rule__Point__Group__1__Impl : ( ( rule__Point__NameAssignment_1 ) ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1395:1: ( ( ( rule__Point__NameAssignment_1 ) ) )
            // InternalHriDsl.g:1396:1: ( ( rule__Point__NameAssignment_1 ) )
            {
            // InternalHriDsl.g:1396:1: ( ( rule__Point__NameAssignment_1 ) )
            // InternalHriDsl.g:1397:2: ( rule__Point__NameAssignment_1 )
            {
             before(grammarAccess.getPointAccess().getNameAssignment_1()); 
            // InternalHriDsl.g:1398:2: ( rule__Point__NameAssignment_1 )
            // InternalHriDsl.g:1398:3: rule__Point__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Point__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getNameAssignment_1()); 

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
    // InternalHriDsl.g:1406:1: rule__Point__Group__2 : rule__Point__Group__2__Impl rule__Point__Group__3 ;
    public final void rule__Point__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1410:1: ( rule__Point__Group__2__Impl rule__Point__Group__3 )
            // InternalHriDsl.g:1411:2: rule__Point__Group__2__Impl rule__Point__Group__3
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
    // InternalHriDsl.g:1418:1: rule__Point__Group__2__Impl : ( 'in' ) ;
    public final void rule__Point__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1422:1: ( ( 'in' ) )
            // InternalHriDsl.g:1423:1: ( 'in' )
            {
            // InternalHriDsl.g:1423:1: ( 'in' )
            // InternalHriDsl.g:1424:2: 'in'
            {
             before(grammarAccess.getPointAccess().getInKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getInKeyword_2()); 

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
    // InternalHriDsl.g:1433:1: rule__Point__Group__3 : rule__Point__Group__3__Impl ;
    public final void rule__Point__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1437:1: ( rule__Point__Group__3__Impl )
            // InternalHriDsl.g:1438:2: rule__Point__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group__3__Impl();

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
    // InternalHriDsl.g:1444:1: rule__Point__Group__3__Impl : ( ( rule__Point__CoordinatesAssignment_3 ) ) ;
    public final void rule__Point__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1448:1: ( ( ( rule__Point__CoordinatesAssignment_3 ) ) )
            // InternalHriDsl.g:1449:1: ( ( rule__Point__CoordinatesAssignment_3 ) )
            {
            // InternalHriDsl.g:1449:1: ( ( rule__Point__CoordinatesAssignment_3 ) )
            // InternalHriDsl.g:1450:2: ( rule__Point__CoordinatesAssignment_3 )
            {
             before(grammarAccess.getPointAccess().getCoordinatesAssignment_3()); 
            // InternalHriDsl.g:1451:2: ( rule__Point__CoordinatesAssignment_3 )
            // InternalHriDsl.g:1451:3: rule__Point__CoordinatesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Point__CoordinatesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getCoordinatesAssignment_3()); 

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


    // $ANTLR start "rule__Robots__Group__0"
    // InternalHriDsl.g:1460:1: rule__Robots__Group__0 : rule__Robots__Group__0__Impl rule__Robots__Group__1 ;
    public final void rule__Robots__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1464:1: ( rule__Robots__Group__0__Impl rule__Robots__Group__1 )
            // InternalHriDsl.g:1465:2: rule__Robots__Group__0__Impl rule__Robots__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalHriDsl.g:1472:1: rule__Robots__Group__0__Impl : ( 'define' ) ;
    public final void rule__Robots__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1476:1: ( ( 'define' ) )
            // InternalHriDsl.g:1477:1: ( 'define' )
            {
            // InternalHriDsl.g:1477:1: ( 'define' )
            // InternalHriDsl.g:1478:2: 'define'
            {
             before(grammarAccess.getRobotsAccess().getDefineKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalHriDsl.g:1487:1: rule__Robots__Group__1 : rule__Robots__Group__1__Impl rule__Robots__Group__2 ;
    public final void rule__Robots__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1491:1: ( rule__Robots__Group__1__Impl rule__Robots__Group__2 )
            // InternalHriDsl.g:1492:2: rule__Robots__Group__1__Impl rule__Robots__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalHriDsl.g:1499:1: rule__Robots__Group__1__Impl : ( 'robots' ) ;
    public final void rule__Robots__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1503:1: ( ( 'robots' ) )
            // InternalHriDsl.g:1504:1: ( 'robots' )
            {
            // InternalHriDsl.g:1504:1: ( 'robots' )
            // InternalHriDsl.g:1505:2: 'robots'
            {
             before(grammarAccess.getRobotsAccess().getRobotsKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalHriDsl.g:1514:1: rule__Robots__Group__2 : rule__Robots__Group__2__Impl rule__Robots__Group__3 ;
    public final void rule__Robots__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1518:1: ( rule__Robots__Group__2__Impl rule__Robots__Group__3 )
            // InternalHriDsl.g:1519:2: rule__Robots__Group__2__Impl rule__Robots__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalHriDsl.g:1526:1: rule__Robots__Group__2__Impl : ( ':' ) ;
    public final void rule__Robots__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1530:1: ( ( ':' ) )
            // InternalHriDsl.g:1531:1: ( ':' )
            {
            // InternalHriDsl.g:1531:1: ( ':' )
            // InternalHriDsl.g:1532:2: ':'
            {
             before(grammarAccess.getRobotsAccess().getColonKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalHriDsl.g:1541:1: rule__Robots__Group__3 : rule__Robots__Group__3__Impl ;
    public final void rule__Robots__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1545:1: ( rule__Robots__Group__3__Impl )
            // InternalHriDsl.g:1546:2: rule__Robots__Group__3__Impl
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
    // InternalHriDsl.g:1552:1: rule__Robots__Group__3__Impl : ( ( ( rule__Robots__RobotsAssignment_3 ) ) ( ( rule__Robots__RobotsAssignment_3 )* ) ) ;
    public final void rule__Robots__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1556:1: ( ( ( ( rule__Robots__RobotsAssignment_3 ) ) ( ( rule__Robots__RobotsAssignment_3 )* ) ) )
            // InternalHriDsl.g:1557:1: ( ( ( rule__Robots__RobotsAssignment_3 ) ) ( ( rule__Robots__RobotsAssignment_3 )* ) )
            {
            // InternalHriDsl.g:1557:1: ( ( ( rule__Robots__RobotsAssignment_3 ) ) ( ( rule__Robots__RobotsAssignment_3 )* ) )
            // InternalHriDsl.g:1558:2: ( ( rule__Robots__RobotsAssignment_3 ) ) ( ( rule__Robots__RobotsAssignment_3 )* )
            {
            // InternalHriDsl.g:1558:2: ( ( rule__Robots__RobotsAssignment_3 ) )
            // InternalHriDsl.g:1559:3: ( rule__Robots__RobotsAssignment_3 )
            {
             before(grammarAccess.getRobotsAccess().getRobotsAssignment_3()); 
            // InternalHriDsl.g:1560:3: ( rule__Robots__RobotsAssignment_3 )
            // InternalHriDsl.g:1560:4: rule__Robots__RobotsAssignment_3
            {
            pushFollow(FOLLOW_18);
            rule__Robots__RobotsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRobotsAccess().getRobotsAssignment_3()); 

            }

            // InternalHriDsl.g:1563:2: ( ( rule__Robots__RobotsAssignment_3 )* )
            // InternalHriDsl.g:1564:3: ( rule__Robots__RobotsAssignment_3 )*
            {
             before(grammarAccess.getRobotsAccess().getRobotsAssignment_3()); 
            // InternalHriDsl.g:1565:3: ( rule__Robots__RobotsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==49) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalHriDsl.g:1565:4: rule__Robots__RobotsAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
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
    // InternalHriDsl.g:1575:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1579:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalHriDsl.g:1580:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalHriDsl.g:1587:1: rule__Robot__Group__0__Impl : ( 'robot' ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1591:1: ( ( 'robot' ) )
            // InternalHriDsl.g:1592:1: ( 'robot' )
            {
            // InternalHriDsl.g:1592:1: ( 'robot' )
            // InternalHriDsl.g:1593:2: 'robot'
            {
             before(grammarAccess.getRobotAccess().getRobotKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalHriDsl.g:1602:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1606:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalHriDsl.g:1607:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalHriDsl.g:1614:1: rule__Robot__Group__1__Impl : ( ( rule__Robot__NameAssignment_1 ) ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1618:1: ( ( ( rule__Robot__NameAssignment_1 ) ) )
            // InternalHriDsl.g:1619:1: ( ( rule__Robot__NameAssignment_1 ) )
            {
            // InternalHriDsl.g:1619:1: ( ( rule__Robot__NameAssignment_1 ) )
            // InternalHriDsl.g:1620:2: ( rule__Robot__NameAssignment_1 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_1()); 
            // InternalHriDsl.g:1621:2: ( rule__Robot__NameAssignment_1 )
            // InternalHriDsl.g:1621:3: rule__Robot__NameAssignment_1
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
    // InternalHriDsl.g:1629:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl rule__Robot__Group__3 ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1633:1: ( rule__Robot__Group__2__Impl rule__Robot__Group__3 )
            // InternalHriDsl.g:1634:2: rule__Robot__Group__2__Impl rule__Robot__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalHriDsl.g:1641:1: rule__Robot__Group__2__Impl : ( 'in' ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1645:1: ( ( 'in' ) )
            // InternalHriDsl.g:1646:1: ( 'in' )
            {
            // InternalHriDsl.g:1646:1: ( 'in' )
            // InternalHriDsl.g:1647:2: 'in'
            {
             before(grammarAccess.getRobotAccess().getInKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getInKeyword_2()); 

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
    // InternalHriDsl.g:1656:1: rule__Robot__Group__3 : rule__Robot__Group__3__Impl rule__Robot__Group__4 ;
    public final void rule__Robot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1660:1: ( rule__Robot__Group__3__Impl rule__Robot__Group__4 )
            // InternalHriDsl.g:1661:2: rule__Robot__Group__3__Impl rule__Robot__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalHriDsl.g:1668:1: rule__Robot__Group__3__Impl : ( ( rule__Robot__CoordinatesAssignment_3 ) ) ;
    public final void rule__Robot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1672:1: ( ( ( rule__Robot__CoordinatesAssignment_3 ) ) )
            // InternalHriDsl.g:1673:1: ( ( rule__Robot__CoordinatesAssignment_3 ) )
            {
            // InternalHriDsl.g:1673:1: ( ( rule__Robot__CoordinatesAssignment_3 ) )
            // InternalHriDsl.g:1674:2: ( rule__Robot__CoordinatesAssignment_3 )
            {
             before(grammarAccess.getRobotAccess().getCoordinatesAssignment_3()); 
            // InternalHriDsl.g:1675:2: ( rule__Robot__CoordinatesAssignment_3 )
            // InternalHriDsl.g:1675:3: rule__Robot__CoordinatesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Robot__CoordinatesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getCoordinatesAssignment_3()); 

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
    // InternalHriDsl.g:1683:1: rule__Robot__Group__4 : rule__Robot__Group__4__Impl rule__Robot__Group__5 ;
    public final void rule__Robot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1687:1: ( rule__Robot__Group__4__Impl rule__Robot__Group__5 )
            // InternalHriDsl.g:1688:2: rule__Robot__Group__4__Impl rule__Robot__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalHriDsl.g:1695:1: rule__Robot__Group__4__Impl : ( 'type' ) ;
    public final void rule__Robot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1699:1: ( ( 'type' ) )
            // InternalHriDsl.g:1700:1: ( 'type' )
            {
            // InternalHriDsl.g:1700:1: ( 'type' )
            // InternalHriDsl.g:1701:2: 'type'
            {
             before(grammarAccess.getRobotAccess().getTypeKeyword_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getTypeKeyword_4()); 

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
    // InternalHriDsl.g:1710:1: rule__Robot__Group__5 : rule__Robot__Group__5__Impl rule__Robot__Group__6 ;
    public final void rule__Robot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1714:1: ( rule__Robot__Group__5__Impl rule__Robot__Group__6 )
            // InternalHriDsl.g:1715:2: rule__Robot__Group__5__Impl rule__Robot__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalHriDsl.g:1722:1: rule__Robot__Group__5__Impl : ( ( rule__Robot__TypeAssignment_5 ) ) ;
    public final void rule__Robot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1726:1: ( ( ( rule__Robot__TypeAssignment_5 ) ) )
            // InternalHriDsl.g:1727:1: ( ( rule__Robot__TypeAssignment_5 ) )
            {
            // InternalHriDsl.g:1727:1: ( ( rule__Robot__TypeAssignment_5 ) )
            // InternalHriDsl.g:1728:2: ( rule__Robot__TypeAssignment_5 )
            {
             before(grammarAccess.getRobotAccess().getTypeAssignment_5()); 
            // InternalHriDsl.g:1729:2: ( rule__Robot__TypeAssignment_5 )
            // InternalHriDsl.g:1729:3: rule__Robot__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Robot__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getTypeAssignment_5()); 

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
    // InternalHriDsl.g:1737:1: rule__Robot__Group__6 : rule__Robot__Group__6__Impl rule__Robot__Group__7 ;
    public final void rule__Robot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1741:1: ( rule__Robot__Group__6__Impl rule__Robot__Group__7 )
            // InternalHriDsl.g:1742:2: rule__Robot__Group__6__Impl rule__Robot__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalHriDsl.g:1749:1: rule__Robot__Group__6__Impl : ( 'charge' ) ;
    public final void rule__Robot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1753:1: ( ( 'charge' ) )
            // InternalHriDsl.g:1754:1: ( 'charge' )
            {
            // InternalHriDsl.g:1754:1: ( 'charge' )
            // InternalHriDsl.g:1755:2: 'charge'
            {
             before(grammarAccess.getRobotAccess().getChargeKeyword_6()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getChargeKeyword_6()); 

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
    // InternalHriDsl.g:1764:1: rule__Robot__Group__7 : rule__Robot__Group__7__Impl ;
    public final void rule__Robot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1768:1: ( rule__Robot__Group__7__Impl )
            // InternalHriDsl.g:1769:2: rule__Robot__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__7__Impl();

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
    // InternalHriDsl.g:1775:1: rule__Robot__Group__7__Impl : ( ( rule__Robot__Charge_percentageAssignment_7 ) ) ;
    public final void rule__Robot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1779:1: ( ( ( rule__Robot__Charge_percentageAssignment_7 ) ) )
            // InternalHriDsl.g:1780:1: ( ( rule__Robot__Charge_percentageAssignment_7 ) )
            {
            // InternalHriDsl.g:1780:1: ( ( rule__Robot__Charge_percentageAssignment_7 ) )
            // InternalHriDsl.g:1781:2: ( rule__Robot__Charge_percentageAssignment_7 )
            {
             before(grammarAccess.getRobotAccess().getCharge_percentageAssignment_7()); 
            // InternalHriDsl.g:1782:2: ( rule__Robot__Charge_percentageAssignment_7 )
            // InternalHriDsl.g:1782:3: rule__Robot__Charge_percentageAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Charge_percentageAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getCharge_percentageAssignment_7()); 

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


    // $ANTLR start "rule__Humans__Group__0"
    // InternalHriDsl.g:1791:1: rule__Humans__Group__0 : rule__Humans__Group__0__Impl rule__Humans__Group__1 ;
    public final void rule__Humans__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1795:1: ( rule__Humans__Group__0__Impl rule__Humans__Group__1 )
            // InternalHriDsl.g:1796:2: rule__Humans__Group__0__Impl rule__Humans__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalHriDsl.g:1803:1: rule__Humans__Group__0__Impl : ( 'define' ) ;
    public final void rule__Humans__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1807:1: ( ( 'define' ) )
            // InternalHriDsl.g:1808:1: ( 'define' )
            {
            // InternalHriDsl.g:1808:1: ( 'define' )
            // InternalHriDsl.g:1809:2: 'define'
            {
             before(grammarAccess.getHumansAccess().getDefineKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalHriDsl.g:1818:1: rule__Humans__Group__1 : rule__Humans__Group__1__Impl rule__Humans__Group__2 ;
    public final void rule__Humans__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1822:1: ( rule__Humans__Group__1__Impl rule__Humans__Group__2 )
            // InternalHriDsl.g:1823:2: rule__Humans__Group__1__Impl rule__Humans__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalHriDsl.g:1830:1: rule__Humans__Group__1__Impl : ( 'humans' ) ;
    public final void rule__Humans__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1834:1: ( ( 'humans' ) )
            // InternalHriDsl.g:1835:1: ( 'humans' )
            {
            // InternalHriDsl.g:1835:1: ( 'humans' )
            // InternalHriDsl.g:1836:2: 'humans'
            {
             before(grammarAccess.getHumansAccess().getHumansKeyword_1()); 
            match(input,52,FOLLOW_2); 
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
    // InternalHriDsl.g:1845:1: rule__Humans__Group__2 : rule__Humans__Group__2__Impl rule__Humans__Group__3 ;
    public final void rule__Humans__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1849:1: ( rule__Humans__Group__2__Impl rule__Humans__Group__3 )
            // InternalHriDsl.g:1850:2: rule__Humans__Group__2__Impl rule__Humans__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalHriDsl.g:1857:1: rule__Humans__Group__2__Impl : ( ':' ) ;
    public final void rule__Humans__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1861:1: ( ( ':' ) )
            // InternalHriDsl.g:1862:1: ( ':' )
            {
            // InternalHriDsl.g:1862:1: ( ':' )
            // InternalHriDsl.g:1863:2: ':'
            {
             before(grammarAccess.getHumansAccess().getColonKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalHriDsl.g:1872:1: rule__Humans__Group__3 : rule__Humans__Group__3__Impl ;
    public final void rule__Humans__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1876:1: ( rule__Humans__Group__3__Impl )
            // InternalHriDsl.g:1877:2: rule__Humans__Group__3__Impl
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
    // InternalHriDsl.g:1883:1: rule__Humans__Group__3__Impl : ( ( ( rule__Humans__HumansAssignment_3 ) ) ( ( rule__Humans__HumansAssignment_3 )* ) ) ;
    public final void rule__Humans__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1887:1: ( ( ( ( rule__Humans__HumansAssignment_3 ) ) ( ( rule__Humans__HumansAssignment_3 )* ) ) )
            // InternalHriDsl.g:1888:1: ( ( ( rule__Humans__HumansAssignment_3 ) ) ( ( rule__Humans__HumansAssignment_3 )* ) )
            {
            // InternalHriDsl.g:1888:1: ( ( ( rule__Humans__HumansAssignment_3 ) ) ( ( rule__Humans__HumansAssignment_3 )* ) )
            // InternalHriDsl.g:1889:2: ( ( rule__Humans__HumansAssignment_3 ) ) ( ( rule__Humans__HumansAssignment_3 )* )
            {
            // InternalHriDsl.g:1889:2: ( ( rule__Humans__HumansAssignment_3 ) )
            // InternalHriDsl.g:1890:3: ( rule__Humans__HumansAssignment_3 )
            {
             before(grammarAccess.getHumansAccess().getHumansAssignment_3()); 
            // InternalHriDsl.g:1891:3: ( rule__Humans__HumansAssignment_3 )
            // InternalHriDsl.g:1891:4: rule__Humans__HumansAssignment_3
            {
            pushFollow(FOLLOW_25);
            rule__Humans__HumansAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHumansAccess().getHumansAssignment_3()); 

            }

            // InternalHriDsl.g:1894:2: ( ( rule__Humans__HumansAssignment_3 )* )
            // InternalHriDsl.g:1895:3: ( rule__Humans__HumansAssignment_3 )*
            {
             before(grammarAccess.getHumansAccess().getHumansAssignment_3()); 
            // InternalHriDsl.g:1896:3: ( rule__Humans__HumansAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==53) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalHriDsl.g:1896:4: rule__Humans__HumansAssignment_3
            	    {
            	    pushFollow(FOLLOW_25);
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
    // InternalHriDsl.g:1906:1: rule__Human__Group__0 : rule__Human__Group__0__Impl rule__Human__Group__1 ;
    public final void rule__Human__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1910:1: ( rule__Human__Group__0__Impl rule__Human__Group__1 )
            // InternalHriDsl.g:1911:2: rule__Human__Group__0__Impl rule__Human__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalHriDsl.g:1918:1: rule__Human__Group__0__Impl : ( 'human' ) ;
    public final void rule__Human__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1922:1: ( ( 'human' ) )
            // InternalHriDsl.g:1923:1: ( 'human' )
            {
            // InternalHriDsl.g:1923:1: ( 'human' )
            // InternalHriDsl.g:1924:2: 'human'
            {
             before(grammarAccess.getHumanAccess().getHumanKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalHriDsl.g:1933:1: rule__Human__Group__1 : rule__Human__Group__1__Impl rule__Human__Group__2 ;
    public final void rule__Human__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1937:1: ( rule__Human__Group__1__Impl rule__Human__Group__2 )
            // InternalHriDsl.g:1938:2: rule__Human__Group__1__Impl rule__Human__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalHriDsl.g:1945:1: rule__Human__Group__1__Impl : ( ( rule__Human__NameAssignment_1 ) ) ;
    public final void rule__Human__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1949:1: ( ( ( rule__Human__NameAssignment_1 ) ) )
            // InternalHriDsl.g:1950:1: ( ( rule__Human__NameAssignment_1 ) )
            {
            // InternalHriDsl.g:1950:1: ( ( rule__Human__NameAssignment_1 ) )
            // InternalHriDsl.g:1951:2: ( rule__Human__NameAssignment_1 )
            {
             before(grammarAccess.getHumanAccess().getNameAssignment_1()); 
            // InternalHriDsl.g:1952:2: ( rule__Human__NameAssignment_1 )
            // InternalHriDsl.g:1952:3: rule__Human__NameAssignment_1
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
    // InternalHriDsl.g:1960:1: rule__Human__Group__2 : rule__Human__Group__2__Impl rule__Human__Group__3 ;
    public final void rule__Human__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1964:1: ( rule__Human__Group__2__Impl rule__Human__Group__3 )
            // InternalHriDsl.g:1965:2: rule__Human__Group__2__Impl rule__Human__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalHriDsl.g:1972:1: rule__Human__Group__2__Impl : ( 'in' ) ;
    public final void rule__Human__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1976:1: ( ( 'in' ) )
            // InternalHriDsl.g:1977:1: ( 'in' )
            {
            // InternalHriDsl.g:1977:1: ( 'in' )
            // InternalHriDsl.g:1978:2: 'in'
            {
             before(grammarAccess.getHumanAccess().getInKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getHumanAccess().getInKeyword_2()); 

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
    // InternalHriDsl.g:1987:1: rule__Human__Group__3 : rule__Human__Group__3__Impl rule__Human__Group__4 ;
    public final void rule__Human__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1991:1: ( rule__Human__Group__3__Impl rule__Human__Group__4 )
            // InternalHriDsl.g:1992:2: rule__Human__Group__3__Impl rule__Human__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalHriDsl.g:1999:1: rule__Human__Group__3__Impl : ( ( rule__Human__CoordinatesAssignment_3 ) ) ;
    public final void rule__Human__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2003:1: ( ( ( rule__Human__CoordinatesAssignment_3 ) ) )
            // InternalHriDsl.g:2004:1: ( ( rule__Human__CoordinatesAssignment_3 ) )
            {
            // InternalHriDsl.g:2004:1: ( ( rule__Human__CoordinatesAssignment_3 ) )
            // InternalHriDsl.g:2005:2: ( rule__Human__CoordinatesAssignment_3 )
            {
             before(grammarAccess.getHumanAccess().getCoordinatesAssignment_3()); 
            // InternalHriDsl.g:2006:2: ( rule__Human__CoordinatesAssignment_3 )
            // InternalHriDsl.g:2006:3: rule__Human__CoordinatesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Human__CoordinatesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHumanAccess().getCoordinatesAssignment_3()); 

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
    // InternalHriDsl.g:2014:1: rule__Human__Group__4 : rule__Human__Group__4__Impl rule__Human__Group__5 ;
    public final void rule__Human__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2018:1: ( rule__Human__Group__4__Impl rule__Human__Group__5 )
            // InternalHriDsl.g:2019:2: rule__Human__Group__4__Impl rule__Human__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalHriDsl.g:2026:1: rule__Human__Group__4__Impl : ( 'speed' ) ;
    public final void rule__Human__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2030:1: ( ( 'speed' ) )
            // InternalHriDsl.g:2031:1: ( 'speed' )
            {
            // InternalHriDsl.g:2031:1: ( 'speed' )
            // InternalHriDsl.g:2032:2: 'speed'
            {
             before(grammarAccess.getHumanAccess().getSpeedKeyword_4()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getHumanAccess().getSpeedKeyword_4()); 

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
    // InternalHriDsl.g:2041:1: rule__Human__Group__5 : rule__Human__Group__5__Impl rule__Human__Group__6 ;
    public final void rule__Human__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2045:1: ( rule__Human__Group__5__Impl rule__Human__Group__6 )
            // InternalHriDsl.g:2046:2: rule__Human__Group__5__Impl rule__Human__Group__6
            {
            pushFollow(FOLLOW_28);
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
    // InternalHriDsl.g:2053:1: rule__Human__Group__5__Impl : ( ( rule__Human__SpeedAssignment_5 ) ) ;
    public final void rule__Human__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2057:1: ( ( ( rule__Human__SpeedAssignment_5 ) ) )
            // InternalHriDsl.g:2058:1: ( ( rule__Human__SpeedAssignment_5 ) )
            {
            // InternalHriDsl.g:2058:1: ( ( rule__Human__SpeedAssignment_5 ) )
            // InternalHriDsl.g:2059:2: ( rule__Human__SpeedAssignment_5 )
            {
             before(grammarAccess.getHumanAccess().getSpeedAssignment_5()); 
            // InternalHriDsl.g:2060:2: ( rule__Human__SpeedAssignment_5 )
            // InternalHriDsl.g:2060:3: rule__Human__SpeedAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Human__SpeedAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getHumanAccess().getSpeedAssignment_5()); 

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
    // InternalHriDsl.g:2068:1: rule__Human__Group__6 : rule__Human__Group__6__Impl rule__Human__Group__7 ;
    public final void rule__Human__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2072:1: ( rule__Human__Group__6__Impl rule__Human__Group__7 )
            // InternalHriDsl.g:2073:2: rule__Human__Group__6__Impl rule__Human__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalHriDsl.g:2080:1: rule__Human__Group__6__Impl : ( 'dexterity' ) ;
    public final void rule__Human__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2084:1: ( ( 'dexterity' ) )
            // InternalHriDsl.g:2085:1: ( 'dexterity' )
            {
            // InternalHriDsl.g:2085:1: ( 'dexterity' )
            // InternalHriDsl.g:2086:2: 'dexterity'
            {
             before(grammarAccess.getHumanAccess().getDexterityKeyword_6()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getHumanAccess().getDexterityKeyword_6()); 

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
    // InternalHriDsl.g:2095:1: rule__Human__Group__7 : rule__Human__Group__7__Impl rule__Human__Group__8 ;
    public final void rule__Human__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2099:1: ( rule__Human__Group__7__Impl rule__Human__Group__8 )
            // InternalHriDsl.g:2100:2: rule__Human__Group__7__Impl rule__Human__Group__8
            {
            pushFollow(FOLLOW_29);
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
    // InternalHriDsl.g:2107:1: rule__Human__Group__7__Impl : ( ( rule__Human__DextAssignment_7 ) ) ;
    public final void rule__Human__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2111:1: ( ( ( rule__Human__DextAssignment_7 ) ) )
            // InternalHriDsl.g:2112:1: ( ( rule__Human__DextAssignment_7 ) )
            {
            // InternalHriDsl.g:2112:1: ( ( rule__Human__DextAssignment_7 ) )
            // InternalHriDsl.g:2113:2: ( rule__Human__DextAssignment_7 )
            {
             before(grammarAccess.getHumanAccess().getDextAssignment_7()); 
            // InternalHriDsl.g:2114:2: ( rule__Human__DextAssignment_7 )
            // InternalHriDsl.g:2114:3: rule__Human__DextAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Human__DextAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getHumanAccess().getDextAssignment_7()); 

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
    // InternalHriDsl.g:2122:1: rule__Human__Group__8 : rule__Human__Group__8__Impl rule__Human__Group__9 ;
    public final void rule__Human__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2126:1: ( rule__Human__Group__8__Impl rule__Human__Group__9 )
            // InternalHriDsl.g:2127:2: rule__Human__Group__8__Impl rule__Human__Group__9
            {
            pushFollow(FOLLOW_30);
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
    // InternalHriDsl.g:2134:1: rule__Human__Group__8__Impl : ( 'is' ) ;
    public final void rule__Human__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2138:1: ( ( 'is' ) )
            // InternalHriDsl.g:2139:1: ( 'is' )
            {
            // InternalHriDsl.g:2139:1: ( 'is' )
            // InternalHriDsl.g:2140:2: 'is'
            {
             before(grammarAccess.getHumanAccess().getIsKeyword_8()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getHumanAccess().getIsKeyword_8()); 

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
    // InternalHriDsl.g:2149:1: rule__Human__Group__9 : rule__Human__Group__9__Impl rule__Human__Group__10 ;
    public final void rule__Human__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2153:1: ( rule__Human__Group__9__Impl rule__Human__Group__10 )
            // InternalHriDsl.g:2154:2: rule__Human__Group__9__Impl rule__Human__Group__10
            {
            pushFollow(FOLLOW_31);
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
    // InternalHriDsl.g:2161:1: rule__Human__Group__9__Impl : ( ( rule__Human__Fatigue_profileAssignment_9 ) ) ;
    public final void rule__Human__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2165:1: ( ( ( rule__Human__Fatigue_profileAssignment_9 ) ) )
            // InternalHriDsl.g:2166:1: ( ( rule__Human__Fatigue_profileAssignment_9 ) )
            {
            // InternalHriDsl.g:2166:1: ( ( rule__Human__Fatigue_profileAssignment_9 ) )
            // InternalHriDsl.g:2167:2: ( rule__Human__Fatigue_profileAssignment_9 )
            {
             before(grammarAccess.getHumanAccess().getFatigue_profileAssignment_9()); 
            // InternalHriDsl.g:2168:2: ( rule__Human__Fatigue_profileAssignment_9 )
            // InternalHriDsl.g:2168:3: rule__Human__Fatigue_profileAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Human__Fatigue_profileAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getHumanAccess().getFatigue_profileAssignment_9()); 

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
    // InternalHriDsl.g:2176:1: rule__Human__Group__10 : rule__Human__Group__10__Impl rule__Human__Group__11 ;
    public final void rule__Human__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2180:1: ( rule__Human__Group__10__Impl rule__Human__Group__11 )
            // InternalHriDsl.g:2181:2: rule__Human__Group__10__Impl rule__Human__Group__11
            {
            pushFollow(FOLLOW_32);
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
    // InternalHriDsl.g:2188:1: rule__Human__Group__10__Impl : ( 'freewill' ) ;
    public final void rule__Human__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2192:1: ( ( 'freewill' ) )
            // InternalHriDsl.g:2193:1: ( 'freewill' )
            {
            // InternalHriDsl.g:2193:1: ( 'freewill' )
            // InternalHriDsl.g:2194:2: 'freewill'
            {
             before(grammarAccess.getHumanAccess().getFreewillKeyword_10()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getHumanAccess().getFreewillKeyword_10()); 

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
    // InternalHriDsl.g:2203:1: rule__Human__Group__11 : rule__Human__Group__11__Impl ;
    public final void rule__Human__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2207:1: ( rule__Human__Group__11__Impl )
            // InternalHriDsl.g:2208:2: rule__Human__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Human__Group__11__Impl();

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
    // InternalHriDsl.g:2214:1: rule__Human__Group__11__Impl : ( ( rule__Human__Free_will_profileAssignment_11 ) ) ;
    public final void rule__Human__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2218:1: ( ( ( rule__Human__Free_will_profileAssignment_11 ) ) )
            // InternalHriDsl.g:2219:1: ( ( rule__Human__Free_will_profileAssignment_11 ) )
            {
            // InternalHriDsl.g:2219:1: ( ( rule__Human__Free_will_profileAssignment_11 ) )
            // InternalHriDsl.g:2220:2: ( rule__Human__Free_will_profileAssignment_11 )
            {
             before(grammarAccess.getHumanAccess().getFree_will_profileAssignment_11()); 
            // InternalHriDsl.g:2221:2: ( rule__Human__Free_will_profileAssignment_11 )
            // InternalHriDsl.g:2221:3: rule__Human__Free_will_profileAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Human__Free_will_profileAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getHumanAccess().getFree_will_profileAssignment_11()); 

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


    // $ANTLR start "rule__Mission__Group__0"
    // InternalHriDsl.g:2230:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2234:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalHriDsl.g:2235:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalHriDsl.g:2242:1: rule__Mission__Group__0__Impl : ( 'define' ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2246:1: ( ( 'define' ) )
            // InternalHriDsl.g:2247:1: ( 'define' )
            {
            // InternalHriDsl.g:2247:1: ( 'define' )
            // InternalHriDsl.g:2248:2: 'define'
            {
             before(grammarAccess.getMissionAccess().getDefineKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalHriDsl.g:2257:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl rule__Mission__Group__2 ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2261:1: ( rule__Mission__Group__1__Impl rule__Mission__Group__2 )
            // InternalHriDsl.g:2262:2: rule__Mission__Group__1__Impl rule__Mission__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalHriDsl.g:2269:1: rule__Mission__Group__1__Impl : ( 'mission' ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2273:1: ( ( 'mission' ) )
            // InternalHriDsl.g:2274:1: ( 'mission' )
            {
            // InternalHriDsl.g:2274:1: ( 'mission' )
            // InternalHriDsl.g:2275:2: 'mission'
            {
             before(grammarAccess.getMissionAccess().getMissionKeyword_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalHriDsl.g:2284:1: rule__Mission__Group__2 : rule__Mission__Group__2__Impl rule__Mission__Group__3 ;
    public final void rule__Mission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2288:1: ( rule__Mission__Group__2__Impl rule__Mission__Group__3 )
            // InternalHriDsl.g:2289:2: rule__Mission__Group__2__Impl rule__Mission__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalHriDsl.g:2296:1: rule__Mission__Group__2__Impl : ( ( rule__Mission__NameAssignment_2 ) ) ;
    public final void rule__Mission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2300:1: ( ( ( rule__Mission__NameAssignment_2 ) ) )
            // InternalHriDsl.g:2301:1: ( ( rule__Mission__NameAssignment_2 ) )
            {
            // InternalHriDsl.g:2301:1: ( ( rule__Mission__NameAssignment_2 ) )
            // InternalHriDsl.g:2302:2: ( rule__Mission__NameAssignment_2 )
            {
             before(grammarAccess.getMissionAccess().getNameAssignment_2()); 
            // InternalHriDsl.g:2303:2: ( rule__Mission__NameAssignment_2 )
            // InternalHriDsl.g:2303:3: rule__Mission__NameAssignment_2
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
    // InternalHriDsl.g:2311:1: rule__Mission__Group__3 : rule__Mission__Group__3__Impl rule__Mission__Group__4 ;
    public final void rule__Mission__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2315:1: ( rule__Mission__Group__3__Impl rule__Mission__Group__4 )
            // InternalHriDsl.g:2316:2: rule__Mission__Group__3__Impl rule__Mission__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalHriDsl.g:2323:1: rule__Mission__Group__3__Impl : ( ':' ) ;
    public final void rule__Mission__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2327:1: ( ( ':' ) )
            // InternalHriDsl.g:2328:1: ( ':' )
            {
            // InternalHriDsl.g:2328:1: ( ':' )
            // InternalHriDsl.g:2329:2: ':'
            {
             before(grammarAccess.getMissionAccess().getColonKeyword_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalHriDsl.g:2338:1: rule__Mission__Group__4 : rule__Mission__Group__4__Impl rule__Mission__Group__5 ;
    public final void rule__Mission__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2342:1: ( rule__Mission__Group__4__Impl rule__Mission__Group__5 )
            // InternalHriDsl.g:2343:2: rule__Mission__Group__4__Impl rule__Mission__Group__5
            {
            pushFollow(FOLLOW_3);
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
    // InternalHriDsl.g:2350:1: rule__Mission__Group__4__Impl : ( ( ( rule__Mission__AssignmentsAssignment_4 ) ) ( ( rule__Mission__AssignmentsAssignment_4 )* ) ) ;
    public final void rule__Mission__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2354:1: ( ( ( ( rule__Mission__AssignmentsAssignment_4 ) ) ( ( rule__Mission__AssignmentsAssignment_4 )* ) ) )
            // InternalHriDsl.g:2355:1: ( ( ( rule__Mission__AssignmentsAssignment_4 ) ) ( ( rule__Mission__AssignmentsAssignment_4 )* ) )
            {
            // InternalHriDsl.g:2355:1: ( ( ( rule__Mission__AssignmentsAssignment_4 ) ) ( ( rule__Mission__AssignmentsAssignment_4 )* ) )
            // InternalHriDsl.g:2356:2: ( ( rule__Mission__AssignmentsAssignment_4 ) ) ( ( rule__Mission__AssignmentsAssignment_4 )* )
            {
            // InternalHriDsl.g:2356:2: ( ( rule__Mission__AssignmentsAssignment_4 ) )
            // InternalHriDsl.g:2357:3: ( rule__Mission__AssignmentsAssignment_4 )
            {
             before(grammarAccess.getMissionAccess().getAssignmentsAssignment_4()); 
            // InternalHriDsl.g:2358:3: ( rule__Mission__AssignmentsAssignment_4 )
            // InternalHriDsl.g:2358:4: rule__Mission__AssignmentsAssignment_4
            {
            pushFollow(FOLLOW_35);
            rule__Mission__AssignmentsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getAssignmentsAssignment_4()); 

            }

            // InternalHriDsl.g:2361:2: ( ( rule__Mission__AssignmentsAssignment_4 )* )
            // InternalHriDsl.g:2362:3: ( rule__Mission__AssignmentsAssignment_4 )*
            {
             before(grammarAccess.getMissionAccess().getAssignmentsAssignment_4()); 
            // InternalHriDsl.g:2363:3: ( rule__Mission__AssignmentsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==59) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalHriDsl.g:2363:4: rule__Mission__AssignmentsAssignment_4
            	    {
            	    pushFollow(FOLLOW_35);
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
    // InternalHriDsl.g:2372:1: rule__Mission__Group__5 : rule__Mission__Group__5__Impl ;
    public final void rule__Mission__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2376:1: ( rule__Mission__Group__5__Impl )
            // InternalHriDsl.g:2377:2: rule__Mission__Group__5__Impl
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
    // InternalHriDsl.g:2383:1: rule__Mission__Group__5__Impl : ( ( rule__Mission__QueriesAssignment_5 ) ) ;
    public final void rule__Mission__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2387:1: ( ( ( rule__Mission__QueriesAssignment_5 ) ) )
            // InternalHriDsl.g:2388:1: ( ( rule__Mission__QueriesAssignment_5 ) )
            {
            // InternalHriDsl.g:2388:1: ( ( rule__Mission__QueriesAssignment_5 ) )
            // InternalHriDsl.g:2389:2: ( rule__Mission__QueriesAssignment_5 )
            {
             before(grammarAccess.getMissionAccess().getQueriesAssignment_5()); 
            // InternalHriDsl.g:2390:2: ( rule__Mission__QueriesAssignment_5 )
            // InternalHriDsl.g:2390:3: rule__Mission__QueriesAssignment_5
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
    // InternalHriDsl.g:2399:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2403:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalHriDsl.g:2404:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalHriDsl.g:2411:1: rule__Assignment__Group__0__Impl : ( 'do' ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2415:1: ( ( 'do' ) )
            // InternalHriDsl.g:2416:1: ( 'do' )
            {
            // InternalHriDsl.g:2416:1: ( 'do' )
            // InternalHriDsl.g:2417:2: 'do'
            {
             before(grammarAccess.getAssignmentAccess().getDoKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalHriDsl.g:2426:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2430:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalHriDsl.g:2431:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalHriDsl.g:2438:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__PatternAssignment_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2442:1: ( ( ( rule__Assignment__PatternAssignment_1 ) ) )
            // InternalHriDsl.g:2443:1: ( ( rule__Assignment__PatternAssignment_1 ) )
            {
            // InternalHriDsl.g:2443:1: ( ( rule__Assignment__PatternAssignment_1 ) )
            // InternalHriDsl.g:2444:2: ( rule__Assignment__PatternAssignment_1 )
            {
             before(grammarAccess.getAssignmentAccess().getPatternAssignment_1()); 
            // InternalHriDsl.g:2445:2: ( rule__Assignment__PatternAssignment_1 )
            // InternalHriDsl.g:2445:3: rule__Assignment__PatternAssignment_1
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
    // InternalHriDsl.g:2453:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2457:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // InternalHriDsl.g:2458:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalHriDsl.g:2465:1: rule__Assignment__Group__2__Impl : ( 'for' ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2469:1: ( ( 'for' ) )
            // InternalHriDsl.g:2470:1: ( 'for' )
            {
            // InternalHriDsl.g:2470:1: ( 'for' )
            // InternalHriDsl.g:2471:2: 'for'
            {
             before(grammarAccess.getAssignmentAccess().getForKeyword_2()); 
            match(input,60,FOLLOW_2); 
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
    // InternalHriDsl.g:2480:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl rule__Assignment__Group__4 ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2484:1: ( rule__Assignment__Group__3__Impl rule__Assignment__Group__4 )
            // InternalHriDsl.g:2485:2: rule__Assignment__Group__3__Impl rule__Assignment__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalHriDsl.g:2492:1: rule__Assignment__Group__3__Impl : ( ( rule__Assignment__ClientAssignment_3 ) ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2496:1: ( ( ( rule__Assignment__ClientAssignment_3 ) ) )
            // InternalHriDsl.g:2497:1: ( ( rule__Assignment__ClientAssignment_3 ) )
            {
            // InternalHriDsl.g:2497:1: ( ( rule__Assignment__ClientAssignment_3 ) )
            // InternalHriDsl.g:2498:2: ( rule__Assignment__ClientAssignment_3 )
            {
             before(grammarAccess.getAssignmentAccess().getClientAssignment_3()); 
            // InternalHriDsl.g:2499:2: ( rule__Assignment__ClientAssignment_3 )
            // InternalHriDsl.g:2499:3: rule__Assignment__ClientAssignment_3
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
    // InternalHriDsl.g:2507:1: rule__Assignment__Group__4 : rule__Assignment__Group__4__Impl rule__Assignment__Group__5 ;
    public final void rule__Assignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2511:1: ( rule__Assignment__Group__4__Impl rule__Assignment__Group__5 )
            // InternalHriDsl.g:2512:2: rule__Assignment__Group__4__Impl rule__Assignment__Group__5
            {
            pushFollow(FOLLOW_39);
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
    // InternalHriDsl.g:2519:1: rule__Assignment__Group__4__Impl : ( 'with' ) ;
    public final void rule__Assignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2523:1: ( ( 'with' ) )
            // InternalHriDsl.g:2524:1: ( 'with' )
            {
            // InternalHriDsl.g:2524:1: ( 'with' )
            // InternalHriDsl.g:2525:2: 'with'
            {
             before(grammarAccess.getAssignmentAccess().getWithKeyword_4()); 
            match(input,61,FOLLOW_2); 
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
    // InternalHriDsl.g:2534:1: rule__Assignment__Group__5 : rule__Assignment__Group__5__Impl rule__Assignment__Group__6 ;
    public final void rule__Assignment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2538:1: ( rule__Assignment__Group__5__Impl rule__Assignment__Group__6 )
            // InternalHriDsl.g:2539:2: rule__Assignment__Group__5__Impl rule__Assignment__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalHriDsl.g:2546:1: rule__Assignment__Group__5__Impl : ( 'target' ) ;
    public final void rule__Assignment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2550:1: ( ( 'target' ) )
            // InternalHriDsl.g:2551:1: ( 'target' )
            {
            // InternalHriDsl.g:2551:1: ( 'target' )
            // InternalHriDsl.g:2552:2: 'target'
            {
             before(grammarAccess.getAssignmentAccess().getTargetKeyword_5()); 
            match(input,62,FOLLOW_2); 
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
    // InternalHriDsl.g:2561:1: rule__Assignment__Group__6 : rule__Assignment__Group__6__Impl ;
    public final void rule__Assignment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2565:1: ( rule__Assignment__Group__6__Impl )
            // InternalHriDsl.g:2566:2: rule__Assignment__Group__6__Impl
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
    // InternalHriDsl.g:2572:1: rule__Assignment__Group__6__Impl : ( ( rule__Assignment__TargetAssignment_6 ) ) ;
    public final void rule__Assignment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2576:1: ( ( ( rule__Assignment__TargetAssignment_6 ) ) )
            // InternalHriDsl.g:2577:1: ( ( rule__Assignment__TargetAssignment_6 ) )
            {
            // InternalHriDsl.g:2577:1: ( ( rule__Assignment__TargetAssignment_6 ) )
            // InternalHriDsl.g:2578:2: ( rule__Assignment__TargetAssignment_6 )
            {
             before(grammarAccess.getAssignmentAccess().getTargetAssignment_6()); 
            // InternalHriDsl.g:2579:2: ( rule__Assignment__TargetAssignment_6 )
            // InternalHriDsl.g:2579:3: rule__Assignment__TargetAssignment_6
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
    // InternalHriDsl.g:2588:1: rule__Queries__Group__0 : rule__Queries__Group__0__Impl rule__Queries__Group__1 ;
    public final void rule__Queries__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2592:1: ( rule__Queries__Group__0__Impl rule__Queries__Group__1 )
            // InternalHriDsl.g:2593:2: rule__Queries__Group__0__Impl rule__Queries__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalHriDsl.g:2600:1: rule__Queries__Group__0__Impl : ( 'define' ) ;
    public final void rule__Queries__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2604:1: ( ( 'define' ) )
            // InternalHriDsl.g:2605:1: ( 'define' )
            {
            // InternalHriDsl.g:2605:1: ( 'define' )
            // InternalHriDsl.g:2606:2: 'define'
            {
             before(grammarAccess.getQueriesAccess().getDefineKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalHriDsl.g:2615:1: rule__Queries__Group__1 : rule__Queries__Group__1__Impl rule__Queries__Group__2 ;
    public final void rule__Queries__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2619:1: ( rule__Queries__Group__1__Impl rule__Queries__Group__2 )
            // InternalHriDsl.g:2620:2: rule__Queries__Group__1__Impl rule__Queries__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalHriDsl.g:2627:1: rule__Queries__Group__1__Impl : ( 'queries' ) ;
    public final void rule__Queries__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2631:1: ( ( 'queries' ) )
            // InternalHriDsl.g:2632:1: ( 'queries' )
            {
            // InternalHriDsl.g:2632:1: ( 'queries' )
            // InternalHriDsl.g:2633:2: 'queries'
            {
             before(grammarAccess.getQueriesAccess().getQueriesKeyword_1()); 
            match(input,63,FOLLOW_2); 
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
    // InternalHriDsl.g:2642:1: rule__Queries__Group__2 : rule__Queries__Group__2__Impl rule__Queries__Group__3 ;
    public final void rule__Queries__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2646:1: ( rule__Queries__Group__2__Impl rule__Queries__Group__3 )
            // InternalHriDsl.g:2647:2: rule__Queries__Group__2__Impl rule__Queries__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalHriDsl.g:2654:1: rule__Queries__Group__2__Impl : ( 'of' ) ;
    public final void rule__Queries__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2658:1: ( ( 'of' ) )
            // InternalHriDsl.g:2659:1: ( 'of' )
            {
            // InternalHriDsl.g:2659:1: ( 'of' )
            // InternalHriDsl.g:2660:2: 'of'
            {
             before(grammarAccess.getQueriesAccess().getOfKeyword_2()); 
            match(input,64,FOLLOW_2); 
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
    // InternalHriDsl.g:2669:1: rule__Queries__Group__3 : rule__Queries__Group__3__Impl rule__Queries__Group__4 ;
    public final void rule__Queries__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2673:1: ( rule__Queries__Group__3__Impl rule__Queries__Group__4 )
            // InternalHriDsl.g:2674:2: rule__Queries__Group__3__Impl rule__Queries__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalHriDsl.g:2681:1: rule__Queries__Group__3__Impl : ( 'mission' ) ;
    public final void rule__Queries__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2685:1: ( ( 'mission' ) )
            // InternalHriDsl.g:2686:1: ( 'mission' )
            {
            // InternalHriDsl.g:2686:1: ( 'mission' )
            // InternalHriDsl.g:2687:2: 'mission'
            {
             before(grammarAccess.getQueriesAccess().getMissionKeyword_3()); 
            match(input,58,FOLLOW_2); 
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
    // InternalHriDsl.g:2696:1: rule__Queries__Group__4 : rule__Queries__Group__4__Impl rule__Queries__Group__5 ;
    public final void rule__Queries__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2700:1: ( rule__Queries__Group__4__Impl rule__Queries__Group__5 )
            // InternalHriDsl.g:2701:2: rule__Queries__Group__4__Impl rule__Queries__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalHriDsl.g:2708:1: rule__Queries__Group__4__Impl : ( ( rule__Queries__MissionAssignment_4 ) ) ;
    public final void rule__Queries__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2712:1: ( ( ( rule__Queries__MissionAssignment_4 ) ) )
            // InternalHriDsl.g:2713:1: ( ( rule__Queries__MissionAssignment_4 ) )
            {
            // InternalHriDsl.g:2713:1: ( ( rule__Queries__MissionAssignment_4 ) )
            // InternalHriDsl.g:2714:2: ( rule__Queries__MissionAssignment_4 )
            {
             before(grammarAccess.getQueriesAccess().getMissionAssignment_4()); 
            // InternalHriDsl.g:2715:2: ( rule__Queries__MissionAssignment_4 )
            // InternalHriDsl.g:2715:3: rule__Queries__MissionAssignment_4
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
    // InternalHriDsl.g:2723:1: rule__Queries__Group__5 : rule__Queries__Group__5__Impl rule__Queries__Group__6 ;
    public final void rule__Queries__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2727:1: ( rule__Queries__Group__5__Impl rule__Queries__Group__6 )
            // InternalHriDsl.g:2728:2: rule__Queries__Group__5__Impl rule__Queries__Group__6
            {
            pushFollow(FOLLOW_42);
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
    // InternalHriDsl.g:2735:1: rule__Queries__Group__5__Impl : ( ':' ) ;
    public final void rule__Queries__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2739:1: ( ( ':' ) )
            // InternalHriDsl.g:2740:1: ( ':' )
            {
            // InternalHriDsl.g:2740:1: ( ':' )
            // InternalHriDsl.g:2741:2: ':'
            {
             before(grammarAccess.getQueriesAccess().getColonKeyword_5()); 
            match(input,44,FOLLOW_2); 
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
    // InternalHriDsl.g:2750:1: rule__Queries__Group__6 : rule__Queries__Group__6__Impl ;
    public final void rule__Queries__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2754:1: ( rule__Queries__Group__6__Impl )
            // InternalHriDsl.g:2755:2: rule__Queries__Group__6__Impl
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
    // InternalHriDsl.g:2761:1: rule__Queries__Group__6__Impl : ( ( ( rule__Queries__QueriesAssignment_6 ) ) ( ( rule__Queries__QueriesAssignment_6 )* ) ) ;
    public final void rule__Queries__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2765:1: ( ( ( ( rule__Queries__QueriesAssignment_6 ) ) ( ( rule__Queries__QueriesAssignment_6 )* ) ) )
            // InternalHriDsl.g:2766:1: ( ( ( rule__Queries__QueriesAssignment_6 ) ) ( ( rule__Queries__QueriesAssignment_6 )* ) )
            {
            // InternalHriDsl.g:2766:1: ( ( ( rule__Queries__QueriesAssignment_6 ) ) ( ( rule__Queries__QueriesAssignment_6 )* ) )
            // InternalHriDsl.g:2767:2: ( ( rule__Queries__QueriesAssignment_6 ) ) ( ( rule__Queries__QueriesAssignment_6 )* )
            {
            // InternalHriDsl.g:2767:2: ( ( rule__Queries__QueriesAssignment_6 ) )
            // InternalHriDsl.g:2768:3: ( rule__Queries__QueriesAssignment_6 )
            {
             before(grammarAccess.getQueriesAccess().getQueriesAssignment_6()); 
            // InternalHriDsl.g:2769:3: ( rule__Queries__QueriesAssignment_6 )
            // InternalHriDsl.g:2769:4: rule__Queries__QueriesAssignment_6
            {
            pushFollow(FOLLOW_43);
            rule__Queries__QueriesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getQueriesAccess().getQueriesAssignment_6()); 

            }

            // InternalHriDsl.g:2772:2: ( ( rule__Queries__QueriesAssignment_6 )* )
            // InternalHriDsl.g:2773:3: ( rule__Queries__QueriesAssignment_6 )*
            {
             before(grammarAccess.getQueriesAccess().getQueriesAssignment_6()); 
            // InternalHriDsl.g:2774:3: ( rule__Queries__QueriesAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==65) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalHriDsl.g:2774:4: rule__Queries__QueriesAssignment_6
            	    {
            	    pushFollow(FOLLOW_43);
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
    // InternalHriDsl.g:2784:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2788:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalHriDsl.g:2789:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalHriDsl.g:2796:1: rule__Query__Group__0__Impl : ( 'compute' ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2800:1: ( ( 'compute' ) )
            // InternalHriDsl.g:2801:1: ( 'compute' )
            {
            // InternalHriDsl.g:2801:1: ( 'compute' )
            // InternalHriDsl.g:2802:2: 'compute'
            {
             before(grammarAccess.getQueryAccess().getComputeKeyword_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalHriDsl.g:2811:1: rule__Query__Group__1 : rule__Query__Group__1__Impl rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2815:1: ( rule__Query__Group__1__Impl rule__Query__Group__2 )
            // InternalHriDsl.g:2816:2: rule__Query__Group__1__Impl rule__Query__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalHriDsl.g:2823:1: rule__Query__Group__1__Impl : ( ( rule__Query__Query_typeAssignment_1 ) ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2827:1: ( ( ( rule__Query__Query_typeAssignment_1 ) ) )
            // InternalHriDsl.g:2828:1: ( ( rule__Query__Query_typeAssignment_1 ) )
            {
            // InternalHriDsl.g:2828:1: ( ( rule__Query__Query_typeAssignment_1 ) )
            // InternalHriDsl.g:2829:2: ( rule__Query__Query_typeAssignment_1 )
            {
             before(grammarAccess.getQueryAccess().getQuery_typeAssignment_1()); 
            // InternalHriDsl.g:2830:2: ( rule__Query__Query_typeAssignment_1 )
            // InternalHriDsl.g:2830:3: rule__Query__Query_typeAssignment_1
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
    // InternalHriDsl.g:2838:1: rule__Query__Group__2 : rule__Query__Group__2__Impl rule__Query__Group__3 ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2842:1: ( rule__Query__Group__2__Impl rule__Query__Group__3 )
            // InternalHriDsl.g:2843:2: rule__Query__Group__2__Impl rule__Query__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalHriDsl.g:2850:1: rule__Query__Group__2__Impl : ( 'with' ) ;
    public final void rule__Query__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2854:1: ( ( 'with' ) )
            // InternalHriDsl.g:2855:1: ( 'with' )
            {
            // InternalHriDsl.g:2855:1: ( 'with' )
            // InternalHriDsl.g:2856:2: 'with'
            {
             before(grammarAccess.getQueryAccess().getWithKeyword_2()); 
            match(input,61,FOLLOW_2); 
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
    // InternalHriDsl.g:2865:1: rule__Query__Group__3 : rule__Query__Group__3__Impl rule__Query__Group__4 ;
    public final void rule__Query__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2869:1: ( rule__Query__Group__3__Impl rule__Query__Group__4 )
            // InternalHriDsl.g:2870:2: rule__Query__Group__3__Impl rule__Query__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalHriDsl.g:2877:1: rule__Query__Group__3__Impl : ( 'duration' ) ;
    public final void rule__Query__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2881:1: ( ( 'duration' ) )
            // InternalHriDsl.g:2882:1: ( 'duration' )
            {
            // InternalHriDsl.g:2882:1: ( 'duration' )
            // InternalHriDsl.g:2883:2: 'duration'
            {
             before(grammarAccess.getQueryAccess().getDurationKeyword_3()); 
            match(input,66,FOLLOW_2); 
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
    // InternalHriDsl.g:2892:1: rule__Query__Group__4 : rule__Query__Group__4__Impl rule__Query__Group__5 ;
    public final void rule__Query__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2896:1: ( rule__Query__Group__4__Impl rule__Query__Group__5 )
            // InternalHriDsl.g:2897:2: rule__Query__Group__4__Impl rule__Query__Group__5
            {
            pushFollow(FOLLOW_46);
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
    // InternalHriDsl.g:2904:1: rule__Query__Group__4__Impl : ( ( rule__Query__DurationAssignment_4 ) ) ;
    public final void rule__Query__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2908:1: ( ( ( rule__Query__DurationAssignment_4 ) ) )
            // InternalHriDsl.g:2909:1: ( ( rule__Query__DurationAssignment_4 ) )
            {
            // InternalHriDsl.g:2909:1: ( ( rule__Query__DurationAssignment_4 ) )
            // InternalHriDsl.g:2910:2: ( rule__Query__DurationAssignment_4 )
            {
             before(grammarAccess.getQueryAccess().getDurationAssignment_4()); 
            // InternalHriDsl.g:2911:2: ( rule__Query__DurationAssignment_4 )
            // InternalHriDsl.g:2911:3: rule__Query__DurationAssignment_4
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
    // InternalHriDsl.g:2919:1: rule__Query__Group__5 : rule__Query__Group__5__Impl rule__Query__Group__6 ;
    public final void rule__Query__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2923:1: ( rule__Query__Group__5__Impl rule__Query__Group__6 )
            // InternalHriDsl.g:2924:2: rule__Query__Group__5__Impl rule__Query__Group__6
            {
            pushFollow(FOLLOW_47);
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
    // InternalHriDsl.g:2931:1: rule__Query__Group__5__Impl : ( 'runs' ) ;
    public final void rule__Query__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2935:1: ( ( 'runs' ) )
            // InternalHriDsl.g:2936:1: ( 'runs' )
            {
            // InternalHriDsl.g:2936:1: ( 'runs' )
            // InternalHriDsl.g:2937:2: 'runs'
            {
             before(grammarAccess.getQueryAccess().getRunsKeyword_5()); 
            match(input,67,FOLLOW_2); 
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
    // InternalHriDsl.g:2946:1: rule__Query__Group__6 : rule__Query__Group__6__Impl ;
    public final void rule__Query__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2950:1: ( rule__Query__Group__6__Impl )
            // InternalHriDsl.g:2951:2: rule__Query__Group__6__Impl
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
    // InternalHriDsl.g:2957:1: rule__Query__Group__6__Impl : ( ( rule__Query__RunsAssignment_6 ) ) ;
    public final void rule__Query__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2961:1: ( ( ( rule__Query__RunsAssignment_6 ) ) )
            // InternalHriDsl.g:2962:1: ( ( rule__Query__RunsAssignment_6 ) )
            {
            // InternalHriDsl.g:2962:1: ( ( rule__Query__RunsAssignment_6 ) )
            // InternalHriDsl.g:2963:2: ( rule__Query__RunsAssignment_6 )
            {
             before(grammarAccess.getQueryAccess().getRunsAssignment_6()); 
            // InternalHriDsl.g:2964:2: ( rule__Query__RunsAssignment_6 )
            // InternalHriDsl.g:2964:3: rule__Query__RunsAssignment_6
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
    // InternalHriDsl.g:2973:1: rule__Coordinates__Group__0 : rule__Coordinates__Group__0__Impl rule__Coordinates__Group__1 ;
    public final void rule__Coordinates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2977:1: ( rule__Coordinates__Group__0__Impl rule__Coordinates__Group__1 )
            // InternalHriDsl.g:2978:2: rule__Coordinates__Group__0__Impl rule__Coordinates__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalHriDsl.g:2985:1: rule__Coordinates__Group__0__Impl : ( '(' ) ;
    public final void rule__Coordinates__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2989:1: ( ( '(' ) )
            // InternalHriDsl.g:2990:1: ( '(' )
            {
            // InternalHriDsl.g:2990:1: ( '(' )
            // InternalHriDsl.g:2991:2: '('
            {
             before(grammarAccess.getCoordinatesAccess().getLeftParenthesisKeyword_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalHriDsl.g:3000:1: rule__Coordinates__Group__1 : rule__Coordinates__Group__1__Impl rule__Coordinates__Group__2 ;
    public final void rule__Coordinates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3004:1: ( rule__Coordinates__Group__1__Impl rule__Coordinates__Group__2 )
            // InternalHriDsl.g:3005:2: rule__Coordinates__Group__1__Impl rule__Coordinates__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalHriDsl.g:3012:1: rule__Coordinates__Group__1__Impl : ( ( rule__Coordinates__XAssignment_1 ) ) ;
    public final void rule__Coordinates__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3016:1: ( ( ( rule__Coordinates__XAssignment_1 ) ) )
            // InternalHriDsl.g:3017:1: ( ( rule__Coordinates__XAssignment_1 ) )
            {
            // InternalHriDsl.g:3017:1: ( ( rule__Coordinates__XAssignment_1 ) )
            // InternalHriDsl.g:3018:2: ( rule__Coordinates__XAssignment_1 )
            {
             before(grammarAccess.getCoordinatesAccess().getXAssignment_1()); 
            // InternalHriDsl.g:3019:2: ( rule__Coordinates__XAssignment_1 )
            // InternalHriDsl.g:3019:3: rule__Coordinates__XAssignment_1
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
    // InternalHriDsl.g:3027:1: rule__Coordinates__Group__2 : rule__Coordinates__Group__2__Impl rule__Coordinates__Group__3 ;
    public final void rule__Coordinates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3031:1: ( rule__Coordinates__Group__2__Impl rule__Coordinates__Group__3 )
            // InternalHriDsl.g:3032:2: rule__Coordinates__Group__2__Impl rule__Coordinates__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalHriDsl.g:3039:1: rule__Coordinates__Group__2__Impl : ( ',' ) ;
    public final void rule__Coordinates__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3043:1: ( ( ',' ) )
            // InternalHriDsl.g:3044:1: ( ',' )
            {
            // InternalHriDsl.g:3044:1: ( ',' )
            // InternalHriDsl.g:3045:2: ','
            {
             before(grammarAccess.getCoordinatesAccess().getCommaKeyword_2()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getCoordinatesAccess().getCommaKeyword_2()); 

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
    // InternalHriDsl.g:3054:1: rule__Coordinates__Group__3 : rule__Coordinates__Group__3__Impl rule__Coordinates__Group__4 ;
    public final void rule__Coordinates__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3058:1: ( rule__Coordinates__Group__3__Impl rule__Coordinates__Group__4 )
            // InternalHriDsl.g:3059:2: rule__Coordinates__Group__3__Impl rule__Coordinates__Group__4
            {
            pushFollow(FOLLOW_49);
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
    // InternalHriDsl.g:3066:1: rule__Coordinates__Group__3__Impl : ( ( rule__Coordinates__YAssignment_3 ) ) ;
    public final void rule__Coordinates__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3070:1: ( ( ( rule__Coordinates__YAssignment_3 ) ) )
            // InternalHriDsl.g:3071:1: ( ( rule__Coordinates__YAssignment_3 ) )
            {
            // InternalHriDsl.g:3071:1: ( ( rule__Coordinates__YAssignment_3 ) )
            // InternalHriDsl.g:3072:2: ( rule__Coordinates__YAssignment_3 )
            {
             before(grammarAccess.getCoordinatesAccess().getYAssignment_3()); 
            // InternalHriDsl.g:3073:2: ( rule__Coordinates__YAssignment_3 )
            // InternalHriDsl.g:3073:3: rule__Coordinates__YAssignment_3
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
    // InternalHriDsl.g:3081:1: rule__Coordinates__Group__4 : rule__Coordinates__Group__4__Impl ;
    public final void rule__Coordinates__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3085:1: ( rule__Coordinates__Group__4__Impl )
            // InternalHriDsl.g:3086:2: rule__Coordinates__Group__4__Impl
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
    // InternalHriDsl.g:3092:1: rule__Coordinates__Group__4__Impl : ( ')' ) ;
    public final void rule__Coordinates__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3096:1: ( ( ')' ) )
            // InternalHriDsl.g:3097:1: ( ')' )
            {
            // InternalHriDsl.g:3097:1: ( ')' )
            // InternalHriDsl.g:3098:2: ')'
            {
             before(grammarAccess.getCoordinatesAccess().getRightParenthesisKeyword_4()); 
            match(input,70,FOLLOW_2); 
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
    // InternalHriDsl.g:3108:1: rule__Model__ParameterAssignment_0 : ( ruleParameter ) ;
    public final void rule__Model__ParameterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3112:1: ( ( ruleParameter ) )
            // InternalHriDsl.g:3113:2: ( ruleParameter )
            {
            // InternalHriDsl.g:3113:2: ( ruleParameter )
            // InternalHriDsl.g:3114:3: ruleParameter
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
    // InternalHriDsl.g:3123:1: rule__Model__ScenariosAssignment_1 : ( ruleScenario ) ;
    public final void rule__Model__ScenariosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3127:1: ( ( ruleScenario ) )
            // InternalHriDsl.g:3128:2: ( ruleScenario )
            {
            // InternalHriDsl.g:3128:2: ( ruleScenario )
            // InternalHriDsl.g:3129:3: ruleScenario
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
    // InternalHriDsl.g:3138:1: rule__Parameter__Length_unitAssignment_2 : ( ruleLength_unit ) ;
    public final void rule__Parameter__Length_unitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3142:1: ( ( ruleLength_unit ) )
            // InternalHriDsl.g:3143:2: ( ruleLength_unit )
            {
            // InternalHriDsl.g:3143:2: ( ruleLength_unit )
            // InternalHriDsl.g:3144:3: ruleLength_unit
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
    // InternalHriDsl.g:3153:1: rule__Scenario__FloorAssignment_0 : ( ruleFloor ) ;
    public final void rule__Scenario__FloorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3157:1: ( ( ruleFloor ) )
            // InternalHriDsl.g:3158:2: ( ruleFloor )
            {
            // InternalHriDsl.g:3158:2: ( ruleFloor )
            // InternalHriDsl.g:3159:3: ruleFloor
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
    // InternalHriDsl.g:3168:1: rule__Scenario__RobotsAssignment_1 : ( ruleRobots ) ;
    public final void rule__Scenario__RobotsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3172:1: ( ( ruleRobots ) )
            // InternalHriDsl.g:3173:2: ( ruleRobots )
            {
            // InternalHriDsl.g:3173:2: ( ruleRobots )
            // InternalHriDsl.g:3174:3: ruleRobots
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
    // InternalHriDsl.g:3183:1: rule__Scenario__HumansAssignment_2 : ( ruleHumans ) ;
    public final void rule__Scenario__HumansAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3187:1: ( ( ruleHumans ) )
            // InternalHriDsl.g:3188:2: ( ruleHumans )
            {
            // InternalHriDsl.g:3188:2: ( ruleHumans )
            // InternalHriDsl.g:3189:3: ruleHumans
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
    // InternalHriDsl.g:3198:1: rule__Scenario__MissionsAssignment_3 : ( ruleMission ) ;
    public final void rule__Scenario__MissionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3202:1: ( ( ruleMission ) )
            // InternalHriDsl.g:3203:2: ( ruleMission )
            {
            // InternalHriDsl.g:3203:2: ( ruleMission )
            // InternalHriDsl.g:3204:3: ruleMission
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
    // InternalHriDsl.g:3213:1: rule__Floor__Floor_nameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Floor__Floor_nameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3217:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3218:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3218:2: ( RULE_ID )
            // InternalHriDsl.g:3219:3: RULE_ID
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
    // InternalHriDsl.g:3228:1: rule__Floor__SurfacesAssignment_4 : ( ruleSurface ) ;
    public final void rule__Floor__SurfacesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3232:1: ( ( ruleSurface ) )
            // InternalHriDsl.g:3233:2: ( ruleSurface )
            {
            // InternalHriDsl.g:3233:2: ( ruleSurface )
            // InternalHriDsl.g:3234:3: ruleSurface
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
    // InternalHriDsl.g:3243:1: rule__Floor__PointsAssignment_5 : ( rulePoint ) ;
    public final void rule__Floor__PointsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3247:1: ( ( rulePoint ) )
            // InternalHriDsl.g:3248:2: ( rulePoint )
            {
            // InternalHriDsl.g:3248:2: ( rulePoint )
            // InternalHriDsl.g:3249:3: rulePoint
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


    // $ANTLR start "rule__Surface__NameAssignment_1"
    // InternalHriDsl.g:3258:1: rule__Surface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Surface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3262:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3263:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3263:2: ( RULE_ID )
            // InternalHriDsl.g:3264:3: RULE_ID
            {
             before(grammarAccess.getSurfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSurfaceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Surface__NameAssignment_1"


    // $ANTLR start "rule__Surface__VerticesAssignment_3"
    // InternalHriDsl.g:3273:1: rule__Surface__VerticesAssignment_3 : ( ruleVertices ) ;
    public final void rule__Surface__VerticesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3277:1: ( ( ruleVertices ) )
            // InternalHriDsl.g:3278:2: ( ruleVertices )
            {
            // InternalHriDsl.g:3278:2: ( ruleVertices )
            // InternalHriDsl.g:3279:3: ruleVertices
            {
             before(grammarAccess.getSurfaceAccess().getVerticesVerticesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVertices();

            state._fsp--;

             after(grammarAccess.getSurfaceAccess().getVerticesVerticesParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Surface__VerticesAssignment_3"


    // $ANTLR start "rule__Vertices__Vertex_AAssignment_0"
    // InternalHriDsl.g:3288:1: rule__Vertices__Vertex_AAssignment_0 : ( ruleCoordinates ) ;
    public final void rule__Vertices__Vertex_AAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3292:1: ( ( ruleCoordinates ) )
            // InternalHriDsl.g:3293:2: ( ruleCoordinates )
            {
            // InternalHriDsl.g:3293:2: ( ruleCoordinates )
            // InternalHriDsl.g:3294:3: ruleCoordinates
            {
             before(grammarAccess.getVerticesAccess().getVertex_ACoordinatesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinates();

            state._fsp--;

             after(grammarAccess.getVerticesAccess().getVertex_ACoordinatesParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Vertices__Vertex_AAssignment_0"


    // $ANTLR start "rule__Vertices__Vertex_CAssignment_1"
    // InternalHriDsl.g:3303:1: rule__Vertices__Vertex_CAssignment_1 : ( ruleCoordinates ) ;
    public final void rule__Vertices__Vertex_CAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3307:1: ( ( ruleCoordinates ) )
            // InternalHriDsl.g:3308:2: ( ruleCoordinates )
            {
            // InternalHriDsl.g:3308:2: ( ruleCoordinates )
            // InternalHriDsl.g:3309:3: ruleCoordinates
            {
             before(grammarAccess.getVerticesAccess().getVertex_CCoordinatesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinates();

            state._fsp--;

             after(grammarAccess.getVerticesAccess().getVertex_CCoordinatesParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Vertices__Vertex_CAssignment_1"


    // $ANTLR start "rule__Point__NameAssignment_1"
    // InternalHriDsl.g:3318:1: rule__Point__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Point__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3322:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3323:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3323:2: ( RULE_ID )
            // InternalHriDsl.g:3324:3: RULE_ID
            {
             before(grammarAccess.getPointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Point__NameAssignment_1"


    // $ANTLR start "rule__Point__CoordinatesAssignment_3"
    // InternalHriDsl.g:3333:1: rule__Point__CoordinatesAssignment_3 : ( ruleCoordinates ) ;
    public final void rule__Point__CoordinatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3337:1: ( ( ruleCoordinates ) )
            // InternalHriDsl.g:3338:2: ( ruleCoordinates )
            {
            // InternalHriDsl.g:3338:2: ( ruleCoordinates )
            // InternalHriDsl.g:3339:3: ruleCoordinates
            {
             before(grammarAccess.getPointAccess().getCoordinatesCoordinatesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinates();

            state._fsp--;

             after(grammarAccess.getPointAccess().getCoordinatesCoordinatesParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Point__CoordinatesAssignment_3"


    // $ANTLR start "rule__Robots__RobotsAssignment_3"
    // InternalHriDsl.g:3348:1: rule__Robots__RobotsAssignment_3 : ( ruleRobot ) ;
    public final void rule__Robots__RobotsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3352:1: ( ( ruleRobot ) )
            // InternalHriDsl.g:3353:2: ( ruleRobot )
            {
            // InternalHriDsl.g:3353:2: ( ruleRobot )
            // InternalHriDsl.g:3354:3: ruleRobot
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
    // InternalHriDsl.g:3363:1: rule__Robot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Robot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3367:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3368:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3368:2: ( RULE_ID )
            // InternalHriDsl.g:3369:3: RULE_ID
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


    // $ANTLR start "rule__Robot__CoordinatesAssignment_3"
    // InternalHriDsl.g:3378:1: rule__Robot__CoordinatesAssignment_3 : ( ruleCoordinates ) ;
    public final void rule__Robot__CoordinatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3382:1: ( ( ruleCoordinates ) )
            // InternalHriDsl.g:3383:2: ( ruleCoordinates )
            {
            // InternalHriDsl.g:3383:2: ( ruleCoordinates )
            // InternalHriDsl.g:3384:3: ruleCoordinates
            {
             before(grammarAccess.getRobotAccess().getCoordinatesCoordinatesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinates();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getCoordinatesCoordinatesParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Robot__CoordinatesAssignment_3"


    // $ANTLR start "rule__Robot__TypeAssignment_5"
    // InternalHriDsl.g:3393:1: rule__Robot__TypeAssignment_5 : ( ruleType ) ;
    public final void rule__Robot__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3397:1: ( ( ruleType ) )
            // InternalHriDsl.g:3398:2: ( ruleType )
            {
            // InternalHriDsl.g:3398:2: ( ruleType )
            // InternalHriDsl.g:3399:3: ruleType
            {
             before(grammarAccess.getRobotAccess().getTypeTypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getTypeTypeEnumRuleCall_5_0()); 

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
    // $ANTLR end "rule__Robot__TypeAssignment_5"


    // $ANTLR start "rule__Robot__Charge_percentageAssignment_7"
    // InternalHriDsl.g:3408:1: rule__Robot__Charge_percentageAssignment_7 : ( RULE_INT ) ;
    public final void rule__Robot__Charge_percentageAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3412:1: ( ( RULE_INT ) )
            // InternalHriDsl.g:3413:2: ( RULE_INT )
            {
            // InternalHriDsl.g:3413:2: ( RULE_INT )
            // InternalHriDsl.g:3414:3: RULE_INT
            {
             before(grammarAccess.getRobotAccess().getCharge_percentageINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getCharge_percentageINTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Robot__Charge_percentageAssignment_7"


    // $ANTLR start "rule__Humans__HumansAssignment_3"
    // InternalHriDsl.g:3423:1: rule__Humans__HumansAssignment_3 : ( ruleHuman ) ;
    public final void rule__Humans__HumansAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3427:1: ( ( ruleHuman ) )
            // InternalHriDsl.g:3428:2: ( ruleHuman )
            {
            // InternalHriDsl.g:3428:2: ( ruleHuman )
            // InternalHriDsl.g:3429:3: ruleHuman
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
    // InternalHriDsl.g:3438:1: rule__Human__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Human__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3442:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3443:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3443:2: ( RULE_ID )
            // InternalHriDsl.g:3444:3: RULE_ID
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


    // $ANTLR start "rule__Human__CoordinatesAssignment_3"
    // InternalHriDsl.g:3453:1: rule__Human__CoordinatesAssignment_3 : ( ruleCoordinates ) ;
    public final void rule__Human__CoordinatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3457:1: ( ( ruleCoordinates ) )
            // InternalHriDsl.g:3458:2: ( ruleCoordinates )
            {
            // InternalHriDsl.g:3458:2: ( ruleCoordinates )
            // InternalHriDsl.g:3459:3: ruleCoordinates
            {
             before(grammarAccess.getHumanAccess().getCoordinatesCoordinatesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinates();

            state._fsp--;

             after(grammarAccess.getHumanAccess().getCoordinatesCoordinatesParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Human__CoordinatesAssignment_3"


    // $ANTLR start "rule__Human__SpeedAssignment_5"
    // InternalHriDsl.g:3468:1: rule__Human__SpeedAssignment_5 : ( RULE_FLOAT ) ;
    public final void rule__Human__SpeedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3472:1: ( ( RULE_FLOAT ) )
            // InternalHriDsl.g:3473:2: ( RULE_FLOAT )
            {
            // InternalHriDsl.g:3473:2: ( RULE_FLOAT )
            // InternalHriDsl.g:3474:3: RULE_FLOAT
            {
             before(grammarAccess.getHumanAccess().getSpeedFLOATTerminalRuleCall_5_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getHumanAccess().getSpeedFLOATTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Human__SpeedAssignment_5"


    // $ANTLR start "rule__Human__DextAssignment_7"
    // InternalHriDsl.g:3483:1: rule__Human__DextAssignment_7 : ( RULE_INT ) ;
    public final void rule__Human__DextAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3487:1: ( ( RULE_INT ) )
            // InternalHriDsl.g:3488:2: ( RULE_INT )
            {
            // InternalHriDsl.g:3488:2: ( RULE_INT )
            // InternalHriDsl.g:3489:3: RULE_INT
            {
             before(grammarAccess.getHumanAccess().getDextINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHumanAccess().getDextINTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Human__DextAssignment_7"


    // $ANTLR start "rule__Human__Fatigue_profileAssignment_9"
    // InternalHriDsl.g:3498:1: rule__Human__Fatigue_profileAssignment_9 : ( ruleFatigue_profile ) ;
    public final void rule__Human__Fatigue_profileAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3502:1: ( ( ruleFatigue_profile ) )
            // InternalHriDsl.g:3503:2: ( ruleFatigue_profile )
            {
            // InternalHriDsl.g:3503:2: ( ruleFatigue_profile )
            // InternalHriDsl.g:3504:3: ruleFatigue_profile
            {
             before(grammarAccess.getHumanAccess().getFatigue_profileFatigue_profileEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleFatigue_profile();

            state._fsp--;

             after(grammarAccess.getHumanAccess().getFatigue_profileFatigue_profileEnumRuleCall_9_0()); 

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
    // $ANTLR end "rule__Human__Fatigue_profileAssignment_9"


    // $ANTLR start "rule__Human__Free_will_profileAssignment_11"
    // InternalHriDsl.g:3513:1: rule__Human__Free_will_profileAssignment_11 : ( ruleFree_will_profile ) ;
    public final void rule__Human__Free_will_profileAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3517:1: ( ( ruleFree_will_profile ) )
            // InternalHriDsl.g:3518:2: ( ruleFree_will_profile )
            {
            // InternalHriDsl.g:3518:2: ( ruleFree_will_profile )
            // InternalHriDsl.g:3519:3: ruleFree_will_profile
            {
             before(grammarAccess.getHumanAccess().getFree_will_profileFree_will_profileEnumRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleFree_will_profile();

            state._fsp--;

             after(grammarAccess.getHumanAccess().getFree_will_profileFree_will_profileEnumRuleCall_11_0()); 

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
    // $ANTLR end "rule__Human__Free_will_profileAssignment_11"


    // $ANTLR start "rule__Mission__NameAssignment_2"
    // InternalHriDsl.g:3528:1: rule__Mission__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Mission__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3532:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3533:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3533:2: ( RULE_ID )
            // InternalHriDsl.g:3534:3: RULE_ID
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
    // InternalHriDsl.g:3543:1: rule__Mission__AssignmentsAssignment_4 : ( ruleAssignment ) ;
    public final void rule__Mission__AssignmentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3547:1: ( ( ruleAssignment ) )
            // InternalHriDsl.g:3548:2: ( ruleAssignment )
            {
            // InternalHriDsl.g:3548:2: ( ruleAssignment )
            // InternalHriDsl.g:3549:3: ruleAssignment
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
    // InternalHriDsl.g:3558:1: rule__Mission__QueriesAssignment_5 : ( ruleQueries ) ;
    public final void rule__Mission__QueriesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3562:1: ( ( ruleQueries ) )
            // InternalHriDsl.g:3563:2: ( ruleQueries )
            {
            // InternalHriDsl.g:3563:2: ( ruleQueries )
            // InternalHriDsl.g:3564:3: ruleQueries
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
    // InternalHriDsl.g:3573:1: rule__Assignment__PatternAssignment_1 : ( rulePattern ) ;
    public final void rule__Assignment__PatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3577:1: ( ( rulePattern ) )
            // InternalHriDsl.g:3578:2: ( rulePattern )
            {
            // InternalHriDsl.g:3578:2: ( rulePattern )
            // InternalHriDsl.g:3579:3: rulePattern
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
    // InternalHriDsl.g:3588:1: rule__Assignment__ClientAssignment_3 : ( RULE_ID ) ;
    public final void rule__Assignment__ClientAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3592:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3593:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3593:2: ( RULE_ID )
            // InternalHriDsl.g:3594:3: RULE_ID
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
    // InternalHriDsl.g:3603:1: rule__Assignment__TargetAssignment_6 : ( RULE_ID ) ;
    public final void rule__Assignment__TargetAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3607:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3608:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3608:2: ( RULE_ID )
            // InternalHriDsl.g:3609:3: RULE_ID
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
    // InternalHriDsl.g:3618:1: rule__Queries__MissionAssignment_4 : ( RULE_ID ) ;
    public final void rule__Queries__MissionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3622:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3623:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3623:2: ( RULE_ID )
            // InternalHriDsl.g:3624:3: RULE_ID
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
    // InternalHriDsl.g:3633:1: rule__Queries__QueriesAssignment_6 : ( ruleQuery ) ;
    public final void rule__Queries__QueriesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3637:1: ( ( ruleQuery ) )
            // InternalHriDsl.g:3638:2: ( ruleQuery )
            {
            // InternalHriDsl.g:3638:2: ( ruleQuery )
            // InternalHriDsl.g:3639:3: ruleQuery
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
    // InternalHriDsl.g:3648:1: rule__Query__Query_typeAssignment_1 : ( ruleQuery_type ) ;
    public final void rule__Query__Query_typeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3652:1: ( ( ruleQuery_type ) )
            // InternalHriDsl.g:3653:2: ( ruleQuery_type )
            {
            // InternalHriDsl.g:3653:2: ( ruleQuery_type )
            // InternalHriDsl.g:3654:3: ruleQuery_type
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
    // InternalHriDsl.g:3663:1: rule__Query__DurationAssignment_4 : ( RULE_INT ) ;
    public final void rule__Query__DurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3667:1: ( ( RULE_INT ) )
            // InternalHriDsl.g:3668:2: ( RULE_INT )
            {
            // InternalHriDsl.g:3668:2: ( RULE_INT )
            // InternalHriDsl.g:3669:3: RULE_INT
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
    // InternalHriDsl.g:3678:1: rule__Query__RunsAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Query__RunsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3682:1: ( ( RULE_STRING ) )
            // InternalHriDsl.g:3683:2: ( RULE_STRING )
            {
            // InternalHriDsl.g:3683:2: ( RULE_STRING )
            // InternalHriDsl.g:3684:3: RULE_STRING
            {
             before(grammarAccess.getQueryAccess().getRunsSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getRunsSTRINGTerminalRuleCall_6_0()); 

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
    // InternalHriDsl.g:3693:1: rule__Coordinates__XAssignment_1 : ( RULE_FLOAT ) ;
    public final void rule__Coordinates__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3697:1: ( ( RULE_FLOAT ) )
            // InternalHriDsl.g:3698:2: ( RULE_FLOAT )
            {
            // InternalHriDsl.g:3698:2: ( RULE_FLOAT )
            // InternalHriDsl.g:3699:3: RULE_FLOAT
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
    // InternalHriDsl.g:3708:1: rule__Coordinates__YAssignment_3 : ( RULE_FLOAT ) ;
    public final void rule__Coordinates__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3712:1: ( ( RULE_FLOAT ) )
            // InternalHriDsl.g:3713:2: ( RULE_FLOAT )
            {
            // InternalHriDsl.g:3713:2: ( RULE_FLOAT )
            // InternalHriDsl.g:3714:3: RULE_FLOAT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000007E0000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000000F800000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});

}