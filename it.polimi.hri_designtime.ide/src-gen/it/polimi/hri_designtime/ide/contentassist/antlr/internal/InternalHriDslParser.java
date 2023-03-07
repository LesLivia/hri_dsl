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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FLOAT", "RULE_INT", "RULE_STRING", "RULE_DEC", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'b'", "'e'", "'m'", "'km'", "'cm'", "'turtlebot3_burger'", "'turtlebot3_wafflepi'", "'tiago'", "'pepper'", "'young_healthy'", "'young_sick'", "'elderly_healthy'", "'elderly_sick'", "'covid_patient'", "'normal'", "'high'", "'low'", "'disabled'", "'busy'", "'free'", "'unexperienced'", "'experienced'", "'critical'", "'stable'", "'distracted'", "'focused'", "'robot_leader'", "'robot_follower'", "'robot_transporter'", "'robot_competitor'", "'robot_rescuer'", "'robot_client'", "'simulation'", "'probability_of_success'", "'expected_fatigue'", "'expected_charge'", "'probability_of_failure'", "'parameter'", "'length_unit'", "'free_will_model'", "'define'", "'layout'", "':'", "'area'", "'in'", "'poi'", "'robots'", "'robot'", "'type'", "'charge'", "'humans'", "'human'", "'speed'", "'dexterity'", "'is'", "'freewill'", "'mission'", "'do'", "'for'", "'with'", "'target'", "'queries'", "'of'", "'compute'", "'duration'", "'runs'", "'('", "','", "')'"
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
    public static final int RULE_INT=6;
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
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=5;
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
    // InternalHriDsl.g:87:1: ruleParameter : ( ( rule__Parameter__UnorderedGroup ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:91:2: ( ( ( rule__Parameter__UnorderedGroup ) ) )
            // InternalHriDsl.g:92:2: ( ( rule__Parameter__UnorderedGroup ) )
            {
            // InternalHriDsl.g:92:2: ( ( rule__Parameter__UnorderedGroup ) )
            // InternalHriDsl.g:93:3: ( rule__Parameter__UnorderedGroup )
            {
             before(grammarAccess.getParameterAccess().getUnorderedGroup()); 
            // InternalHriDsl.g:94:3: ( rule__Parameter__UnorderedGroup )
            // InternalHriDsl.g:94:4: rule__Parameter__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getUnorderedGroup()); 

            }


            }

        }
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


    // $ANTLR start "ruleFree_will_model"
    // InternalHriDsl.g:453:1: ruleFree_will_model : ( ( rule__Free_will_model__Alternatives ) ) ;
    public final void ruleFree_will_model() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:457:1: ( ( ( rule__Free_will_model__Alternatives ) ) )
            // InternalHriDsl.g:458:2: ( ( rule__Free_will_model__Alternatives ) )
            {
            // InternalHriDsl.g:458:2: ( ( rule__Free_will_model__Alternatives ) )
            // InternalHriDsl.g:459:3: ( rule__Free_will_model__Alternatives )
            {
             before(grammarAccess.getFree_will_modelAccess().getAlternatives()); 
            // InternalHriDsl.g:460:3: ( rule__Free_will_model__Alternatives )
            // InternalHriDsl.g:460:4: rule__Free_will_model__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Free_will_model__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFree_will_modelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFree_will_model"


    // $ANTLR start "ruleLength_unit"
    // InternalHriDsl.g:469:1: ruleLength_unit : ( ( rule__Length_unit__Alternatives ) ) ;
    public final void ruleLength_unit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:473:1: ( ( ( rule__Length_unit__Alternatives ) ) )
            // InternalHriDsl.g:474:2: ( ( rule__Length_unit__Alternatives ) )
            {
            // InternalHriDsl.g:474:2: ( ( rule__Length_unit__Alternatives ) )
            // InternalHriDsl.g:475:3: ( rule__Length_unit__Alternatives )
            {
             before(grammarAccess.getLength_unitAccess().getAlternatives()); 
            // InternalHriDsl.g:476:3: ( rule__Length_unit__Alternatives )
            // InternalHriDsl.g:476:4: rule__Length_unit__Alternatives
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
    // InternalHriDsl.g:485:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:489:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalHriDsl.g:490:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalHriDsl.g:490:2: ( ( rule__Type__Alternatives ) )
            // InternalHriDsl.g:491:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalHriDsl.g:492:3: ( rule__Type__Alternatives )
            // InternalHriDsl.g:492:4: rule__Type__Alternatives
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
    // InternalHriDsl.g:501:1: ruleFatigue_profile : ( ( rule__Fatigue_profile__Alternatives ) ) ;
    public final void ruleFatigue_profile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:505:1: ( ( ( rule__Fatigue_profile__Alternatives ) ) )
            // InternalHriDsl.g:506:2: ( ( rule__Fatigue_profile__Alternatives ) )
            {
            // InternalHriDsl.g:506:2: ( ( rule__Fatigue_profile__Alternatives ) )
            // InternalHriDsl.g:507:3: ( rule__Fatigue_profile__Alternatives )
            {
             before(grammarAccess.getFatigue_profileAccess().getAlternatives()); 
            // InternalHriDsl.g:508:3: ( rule__Fatigue_profile__Alternatives )
            // InternalHriDsl.g:508:4: rule__Fatigue_profile__Alternatives
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
    // InternalHriDsl.g:517:1: ruleFree_will_profile : ( ( rule__Free_will_profile__Alternatives ) ) ;
    public final void ruleFree_will_profile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:521:1: ( ( ( rule__Free_will_profile__Alternatives ) ) )
            // InternalHriDsl.g:522:2: ( ( rule__Free_will_profile__Alternatives ) )
            {
            // InternalHriDsl.g:522:2: ( ( rule__Free_will_profile__Alternatives ) )
            // InternalHriDsl.g:523:3: ( rule__Free_will_profile__Alternatives )
            {
             before(grammarAccess.getFree_will_profileAccess().getAlternatives()); 
            // InternalHriDsl.g:524:3: ( rule__Free_will_profile__Alternatives )
            // InternalHriDsl.g:524:4: rule__Free_will_profile__Alternatives
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
    // InternalHriDsl.g:533:1: rulePattern : ( ( rule__Pattern__Alternatives ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:537:1: ( ( ( rule__Pattern__Alternatives ) ) )
            // InternalHriDsl.g:538:2: ( ( rule__Pattern__Alternatives ) )
            {
            // InternalHriDsl.g:538:2: ( ( rule__Pattern__Alternatives ) )
            // InternalHriDsl.g:539:3: ( rule__Pattern__Alternatives )
            {
             before(grammarAccess.getPatternAccess().getAlternatives()); 
            // InternalHriDsl.g:540:3: ( rule__Pattern__Alternatives )
            // InternalHriDsl.g:540:4: rule__Pattern__Alternatives
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
    // InternalHriDsl.g:549:1: ruleQuery_type : ( ( rule__Query_type__Alternatives ) ) ;
    public final void ruleQuery_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:553:1: ( ( ( rule__Query_type__Alternatives ) ) )
            // InternalHriDsl.g:554:2: ( ( rule__Query_type__Alternatives ) )
            {
            // InternalHriDsl.g:554:2: ( ( rule__Query_type__Alternatives ) )
            // InternalHriDsl.g:555:3: ( rule__Query_type__Alternatives )
            {
             before(grammarAccess.getQuery_typeAccess().getAlternatives()); 
            // InternalHriDsl.g:556:3: ( rule__Query_type__Alternatives )
            // InternalHriDsl.g:556:4: rule__Query_type__Alternatives
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


    // $ANTLR start "rule__Free_will_model__Alternatives"
    // InternalHriDsl.g:564:1: rule__Free_will_model__Alternatives : ( ( ( 'b' ) ) | ( ( 'e' ) ) );
    public final void rule__Free_will_model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:568:1: ( ( ( 'b' ) ) | ( ( 'e' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalHriDsl.g:569:2: ( ( 'b' ) )
                    {
                    // InternalHriDsl.g:569:2: ( ( 'b' ) )
                    // InternalHriDsl.g:570:3: ( 'b' )
                    {
                     before(grammarAccess.getFree_will_modelAccess().getBASEEnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:571:3: ( 'b' )
                    // InternalHriDsl.g:571:4: 'b'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_modelAccess().getBASEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:575:2: ( ( 'e' ) )
                    {
                    // InternalHriDsl.g:575:2: ( ( 'e' ) )
                    // InternalHriDsl.g:576:3: ( 'e' )
                    {
                     before(grammarAccess.getFree_will_modelAccess().getEXTENDEDEnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:577:3: ( 'e' )
                    // InternalHriDsl.g:577:4: 'e'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_modelAccess().getEXTENDEDEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Free_will_model__Alternatives"


    // $ANTLR start "rule__Length_unit__Alternatives"
    // InternalHriDsl.g:585:1: rule__Length_unit__Alternatives : ( ( ( 'm' ) ) | ( ( 'km' ) ) | ( ( 'cm' ) ) );
    public final void rule__Length_unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:589:1: ( ( ( 'm' ) ) | ( ( 'km' ) ) | ( ( 'cm' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
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
                    // InternalHriDsl.g:590:2: ( ( 'm' ) )
                    {
                    // InternalHriDsl.g:590:2: ( ( 'm' ) )
                    // InternalHriDsl.g:591:3: ( 'm' )
                    {
                     before(grammarAccess.getLength_unitAccess().getMETEREnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:592:3: ( 'm' )
                    // InternalHriDsl.g:592:4: 'm'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getLength_unitAccess().getMETEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:596:2: ( ( 'km' ) )
                    {
                    // InternalHriDsl.g:596:2: ( ( 'km' ) )
                    // InternalHriDsl.g:597:3: ( 'km' )
                    {
                     before(grammarAccess.getLength_unitAccess().getKILOMETEREnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:598:3: ( 'km' )
                    // InternalHriDsl.g:598:4: 'km'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getLength_unitAccess().getKILOMETEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:602:2: ( ( 'cm' ) )
                    {
                    // InternalHriDsl.g:602:2: ( ( 'cm' ) )
                    // InternalHriDsl.g:603:3: ( 'cm' )
                    {
                     before(grammarAccess.getLength_unitAccess().getCENTIMETEREnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:604:3: ( 'cm' )
                    // InternalHriDsl.g:604:4: 'cm'
                    {
                    match(input,17,FOLLOW_2); 

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
    // InternalHriDsl.g:612:1: rule__Type__Alternatives : ( ( ( 'turtlebot3_burger' ) ) | ( ( 'turtlebot3_wafflepi' ) ) | ( ( 'tiago' ) ) | ( ( 'pepper' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:616:1: ( ( ( 'turtlebot3_burger' ) ) | ( ( 'turtlebot3_wafflepi' ) ) | ( ( 'tiago' ) ) | ( ( 'pepper' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 21:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalHriDsl.g:617:2: ( ( 'turtlebot3_burger' ) )
                    {
                    // InternalHriDsl.g:617:2: ( ( 'turtlebot3_burger' ) )
                    // InternalHriDsl.g:618:3: ( 'turtlebot3_burger' )
                    {
                     before(grammarAccess.getTypeAccess().getTURTLEBOT3_BURGEREnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:619:3: ( 'turtlebot3_burger' )
                    // InternalHriDsl.g:619:4: 'turtlebot3_burger'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getTURTLEBOT3_BURGEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:623:2: ( ( 'turtlebot3_wafflepi' ) )
                    {
                    // InternalHriDsl.g:623:2: ( ( 'turtlebot3_wafflepi' ) )
                    // InternalHriDsl.g:624:3: ( 'turtlebot3_wafflepi' )
                    {
                     before(grammarAccess.getTypeAccess().getTURTLEBOT3_WAFFLEPIEnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:625:3: ( 'turtlebot3_wafflepi' )
                    // InternalHriDsl.g:625:4: 'turtlebot3_wafflepi'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getTURTLEBOT3_WAFFLEPIEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:629:2: ( ( 'tiago' ) )
                    {
                    // InternalHriDsl.g:629:2: ( ( 'tiago' ) )
                    // InternalHriDsl.g:630:3: ( 'tiago' )
                    {
                     before(grammarAccess.getTypeAccess().getTIAGOEnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:631:3: ( 'tiago' )
                    // InternalHriDsl.g:631:4: 'tiago'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getTIAGOEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:635:2: ( ( 'pepper' ) )
                    {
                    // InternalHriDsl.g:635:2: ( ( 'pepper' ) )
                    // InternalHriDsl.g:636:3: ( 'pepper' )
                    {
                     before(grammarAccess.getTypeAccess().getPEPPEREnumLiteralDeclaration_3()); 
                    // InternalHriDsl.g:637:3: ( 'pepper' )
                    // InternalHriDsl.g:637:4: 'pepper'
                    {
                    match(input,21,FOLLOW_2); 

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
    // InternalHriDsl.g:645:1: rule__Fatigue_profile__Alternatives : ( ( ( 'young_healthy' ) ) | ( ( 'young_sick' ) ) | ( ( 'elderly_healthy' ) ) | ( ( 'elderly_sick' ) ) | ( ( 'covid_patient' ) ) );
    public final void rule__Fatigue_profile__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:649:1: ( ( ( 'young_healthy' ) ) | ( ( 'young_sick' ) ) | ( ( 'elderly_healthy' ) ) | ( ( 'elderly_sick' ) ) | ( ( 'covid_patient' ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case 24:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            case 26:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalHriDsl.g:650:2: ( ( 'young_healthy' ) )
                    {
                    // InternalHriDsl.g:650:2: ( ( 'young_healthy' ) )
                    // InternalHriDsl.g:651:3: ( 'young_healthy' )
                    {
                     before(grammarAccess.getFatigue_profileAccess().getYOUNG_HEALTHYEnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:652:3: ( 'young_healthy' )
                    // InternalHriDsl.g:652:4: 'young_healthy'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getFatigue_profileAccess().getYOUNG_HEALTHYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:656:2: ( ( 'young_sick' ) )
                    {
                    // InternalHriDsl.g:656:2: ( ( 'young_sick' ) )
                    // InternalHriDsl.g:657:3: ( 'young_sick' )
                    {
                     before(grammarAccess.getFatigue_profileAccess().getYOUNG_SICKEnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:658:3: ( 'young_sick' )
                    // InternalHriDsl.g:658:4: 'young_sick'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getFatigue_profileAccess().getYOUNG_SICKEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:662:2: ( ( 'elderly_healthy' ) )
                    {
                    // InternalHriDsl.g:662:2: ( ( 'elderly_healthy' ) )
                    // InternalHriDsl.g:663:3: ( 'elderly_healthy' )
                    {
                     before(grammarAccess.getFatigue_profileAccess().getELDERLY_HEALTHYEnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:664:3: ( 'elderly_healthy' )
                    // InternalHriDsl.g:664:4: 'elderly_healthy'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getFatigue_profileAccess().getELDERLY_HEALTHYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:668:2: ( ( 'elderly_sick' ) )
                    {
                    // InternalHriDsl.g:668:2: ( ( 'elderly_sick' ) )
                    // InternalHriDsl.g:669:3: ( 'elderly_sick' )
                    {
                     before(grammarAccess.getFatigue_profileAccess().getELDERLY_SICKEnumLiteralDeclaration_3()); 
                    // InternalHriDsl.g:670:3: ( 'elderly_sick' )
                    // InternalHriDsl.g:670:4: 'elderly_sick'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getFatigue_profileAccess().getELDERLY_SICKEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHriDsl.g:674:2: ( ( 'covid_patient' ) )
                    {
                    // InternalHriDsl.g:674:2: ( ( 'covid_patient' ) )
                    // InternalHriDsl.g:675:3: ( 'covid_patient' )
                    {
                     before(grammarAccess.getFatigue_profileAccess().getCOVID_PATIENTEnumLiteralDeclaration_4()); 
                    // InternalHriDsl.g:676:3: ( 'covid_patient' )
                    // InternalHriDsl.g:676:4: 'covid_patient'
                    {
                    match(input,26,FOLLOW_2); 

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
    // InternalHriDsl.g:684:1: rule__Free_will_profile__Alternatives : ( ( ( 'normal' ) ) | ( ( 'high' ) ) | ( ( 'low' ) ) | ( ( 'disabled' ) ) | ( ( 'busy' ) ) | ( ( 'free' ) ) | ( ( 'unexperienced' ) ) | ( ( 'experienced' ) ) | ( ( 'critical' ) ) | ( ( 'stable' ) ) | ( ( 'distracted' ) ) | ( ( 'focused' ) ) );
    public final void rule__Free_will_profile__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:688:1: ( ( ( 'normal' ) ) | ( ( 'high' ) ) | ( ( 'low' ) ) | ( ( 'disabled' ) ) | ( ( 'busy' ) ) | ( ( 'free' ) ) | ( ( 'unexperienced' ) ) | ( ( 'experienced' ) ) | ( ( 'critical' ) ) | ( ( 'stable' ) ) | ( ( 'distracted' ) ) | ( ( 'focused' ) ) )
            int alt5=12;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt5=1;
                }
                break;
            case 28:
                {
                alt5=2;
                }
                break;
            case 29:
                {
                alt5=3;
                }
                break;
            case 30:
                {
                alt5=4;
                }
                break;
            case 31:
                {
                alt5=5;
                }
                break;
            case 32:
                {
                alt5=6;
                }
                break;
            case 33:
                {
                alt5=7;
                }
                break;
            case 34:
                {
                alt5=8;
                }
                break;
            case 35:
                {
                alt5=9;
                }
                break;
            case 36:
                {
                alt5=10;
                }
                break;
            case 37:
                {
                alt5=11;
                }
                break;
            case 38:
                {
                alt5=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalHriDsl.g:689:2: ( ( 'normal' ) )
                    {
                    // InternalHriDsl.g:689:2: ( ( 'normal' ) )
                    // InternalHriDsl.g:690:3: ( 'normal' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getNORMALEnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:691:3: ( 'normal' )
                    // InternalHriDsl.g:691:4: 'normal'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getNORMALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:695:2: ( ( 'high' ) )
                    {
                    // InternalHriDsl.g:695:2: ( ( 'high' ) )
                    // InternalHriDsl.g:696:3: ( 'high' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getHIGHEnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:697:3: ( 'high' )
                    // InternalHriDsl.g:697:4: 'high'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getHIGHEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:701:2: ( ( 'low' ) )
                    {
                    // InternalHriDsl.g:701:2: ( ( 'low' ) )
                    // InternalHriDsl.g:702:3: ( 'low' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getLOWEnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:703:3: ( 'low' )
                    // InternalHriDsl.g:703:4: 'low'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getLOWEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:707:2: ( ( 'disabled' ) )
                    {
                    // InternalHriDsl.g:707:2: ( ( 'disabled' ) )
                    // InternalHriDsl.g:708:3: ( 'disabled' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getDISABLEDEnumLiteralDeclaration_3()); 
                    // InternalHriDsl.g:709:3: ( 'disabled' )
                    // InternalHriDsl.g:709:4: 'disabled'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getDISABLEDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHriDsl.g:713:2: ( ( 'busy' ) )
                    {
                    // InternalHriDsl.g:713:2: ( ( 'busy' ) )
                    // InternalHriDsl.g:714:3: ( 'busy' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getBUSYEnumLiteralDeclaration_4()); 
                    // InternalHriDsl.g:715:3: ( 'busy' )
                    // InternalHriDsl.g:715:4: 'busy'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getBUSYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHriDsl.g:719:2: ( ( 'free' ) )
                    {
                    // InternalHriDsl.g:719:2: ( ( 'free' ) )
                    // InternalHriDsl.g:720:3: ( 'free' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getFREEEnumLiteralDeclaration_5()); 
                    // InternalHriDsl.g:721:3: ( 'free' )
                    // InternalHriDsl.g:721:4: 'free'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getFREEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalHriDsl.g:725:2: ( ( 'unexperienced' ) )
                    {
                    // InternalHriDsl.g:725:2: ( ( 'unexperienced' ) )
                    // InternalHriDsl.g:726:3: ( 'unexperienced' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getUNEXPERIENCEDEnumLiteralDeclaration_6()); 
                    // InternalHriDsl.g:727:3: ( 'unexperienced' )
                    // InternalHriDsl.g:727:4: 'unexperienced'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getUNEXPERIENCEDEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalHriDsl.g:731:2: ( ( 'experienced' ) )
                    {
                    // InternalHriDsl.g:731:2: ( ( 'experienced' ) )
                    // InternalHriDsl.g:732:3: ( 'experienced' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getEXPERIENCEDEnumLiteralDeclaration_7()); 
                    // InternalHriDsl.g:733:3: ( 'experienced' )
                    // InternalHriDsl.g:733:4: 'experienced'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getEXPERIENCEDEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalHriDsl.g:737:2: ( ( 'critical' ) )
                    {
                    // InternalHriDsl.g:737:2: ( ( 'critical' ) )
                    // InternalHriDsl.g:738:3: ( 'critical' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getCRITICALEnumLiteralDeclaration_8()); 
                    // InternalHriDsl.g:739:3: ( 'critical' )
                    // InternalHriDsl.g:739:4: 'critical'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getCRITICALEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalHriDsl.g:743:2: ( ( 'stable' ) )
                    {
                    // InternalHriDsl.g:743:2: ( ( 'stable' ) )
                    // InternalHriDsl.g:744:3: ( 'stable' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getSTABLEEnumLiteralDeclaration_9()); 
                    // InternalHriDsl.g:745:3: ( 'stable' )
                    // InternalHriDsl.g:745:4: 'stable'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getSTABLEEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalHriDsl.g:749:2: ( ( 'distracted' ) )
                    {
                    // InternalHriDsl.g:749:2: ( ( 'distracted' ) )
                    // InternalHriDsl.g:750:3: ( 'distracted' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getDISTRACTEDEnumLiteralDeclaration_10()); 
                    // InternalHriDsl.g:751:3: ( 'distracted' )
                    // InternalHriDsl.g:751:4: 'distracted'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getDISTRACTEDEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalHriDsl.g:755:2: ( ( 'focused' ) )
                    {
                    // InternalHriDsl.g:755:2: ( ( 'focused' ) )
                    // InternalHriDsl.g:756:3: ( 'focused' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getFOCUSEDEnumLiteralDeclaration_11()); 
                    // InternalHriDsl.g:757:3: ( 'focused' )
                    // InternalHriDsl.g:757:4: 'focused'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getFOCUSEDEnumLiteralDeclaration_11()); 

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
    // InternalHriDsl.g:765:1: rule__Pattern__Alternatives : ( ( ( 'robot_leader' ) ) | ( ( 'robot_follower' ) ) | ( ( 'robot_transporter' ) ) | ( ( 'robot_competitor' ) ) | ( ( 'robot_rescuer' ) ) | ( ( 'robot_client' ) ) );
    public final void rule__Pattern__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:769:1: ( ( ( 'robot_leader' ) ) | ( ( 'robot_follower' ) ) | ( ( 'robot_transporter' ) ) | ( ( 'robot_competitor' ) ) | ( ( 'robot_rescuer' ) ) | ( ( 'robot_client' ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt6=1;
                }
                break;
            case 40:
                {
                alt6=2;
                }
                break;
            case 41:
                {
                alt6=3;
                }
                break;
            case 42:
                {
                alt6=4;
                }
                break;
            case 43:
                {
                alt6=5;
                }
                break;
            case 44:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalHriDsl.g:770:2: ( ( 'robot_leader' ) )
                    {
                    // InternalHriDsl.g:770:2: ( ( 'robot_leader' ) )
                    // InternalHriDsl.g:771:3: ( 'robot_leader' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_LEADEREnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:772:3: ( 'robot_leader' )
                    // InternalHriDsl.g:772:4: 'robot_leader'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getPatternAccess().getROBOT_LEADEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:776:2: ( ( 'robot_follower' ) )
                    {
                    // InternalHriDsl.g:776:2: ( ( 'robot_follower' ) )
                    // InternalHriDsl.g:777:3: ( 'robot_follower' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_FOLLOWEREnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:778:3: ( 'robot_follower' )
                    // InternalHriDsl.g:778:4: 'robot_follower'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getPatternAccess().getROBOT_FOLLOWEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:782:2: ( ( 'robot_transporter' ) )
                    {
                    // InternalHriDsl.g:782:2: ( ( 'robot_transporter' ) )
                    // InternalHriDsl.g:783:3: ( 'robot_transporter' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_TRANSPORTEREnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:784:3: ( 'robot_transporter' )
                    // InternalHriDsl.g:784:4: 'robot_transporter'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getPatternAccess().getROBOT_TRANSPORTEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:788:2: ( ( 'robot_competitor' ) )
                    {
                    // InternalHriDsl.g:788:2: ( ( 'robot_competitor' ) )
                    // InternalHriDsl.g:789:3: ( 'robot_competitor' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_COMPETITOREnumLiteralDeclaration_3()); 
                    // InternalHriDsl.g:790:3: ( 'robot_competitor' )
                    // InternalHriDsl.g:790:4: 'robot_competitor'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getPatternAccess().getROBOT_COMPETITOREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHriDsl.g:794:2: ( ( 'robot_rescuer' ) )
                    {
                    // InternalHriDsl.g:794:2: ( ( 'robot_rescuer' ) )
                    // InternalHriDsl.g:795:3: ( 'robot_rescuer' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_RESCUEREnumLiteralDeclaration_4()); 
                    // InternalHriDsl.g:796:3: ( 'robot_rescuer' )
                    // InternalHriDsl.g:796:4: 'robot_rescuer'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getPatternAccess().getROBOT_RESCUEREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHriDsl.g:800:2: ( ( 'robot_client' ) )
                    {
                    // InternalHriDsl.g:800:2: ( ( 'robot_client' ) )
                    // InternalHriDsl.g:801:3: ( 'robot_client' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_ASSISTANTEnumLiteralDeclaration_5()); 
                    // InternalHriDsl.g:802:3: ( 'robot_client' )
                    // InternalHriDsl.g:802:4: 'robot_client'
                    {
                    match(input,44,FOLLOW_2); 

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
    // InternalHriDsl.g:810:1: rule__Query_type__Alternatives : ( ( ( 'simulation' ) ) | ( ( 'probability_of_success' ) ) | ( ( 'expected_fatigue' ) ) | ( ( 'expected_charge' ) ) | ( ( 'probability_of_failure' ) ) );
    public final void rule__Query_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:814:1: ( ( ( 'simulation' ) ) | ( ( 'probability_of_success' ) ) | ( ( 'expected_fatigue' ) ) | ( ( 'expected_charge' ) ) | ( ( 'probability_of_failure' ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt7=1;
                }
                break;
            case 46:
                {
                alt7=2;
                }
                break;
            case 47:
                {
                alt7=3;
                }
                break;
            case 48:
                {
                alt7=4;
                }
                break;
            case 49:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalHriDsl.g:815:2: ( ( 'simulation' ) )
                    {
                    // InternalHriDsl.g:815:2: ( ( 'simulation' ) )
                    // InternalHriDsl.g:816:3: ( 'simulation' )
                    {
                     before(grammarAccess.getQuery_typeAccess().getSIMULATIONEnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:817:3: ( 'simulation' )
                    // InternalHriDsl.g:817:4: 'simulation'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuery_typeAccess().getSIMULATIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:821:2: ( ( 'probability_of_success' ) )
                    {
                    // InternalHriDsl.g:821:2: ( ( 'probability_of_success' ) )
                    // InternalHriDsl.g:822:3: ( 'probability_of_success' )
                    {
                     before(grammarAccess.getQuery_typeAccess().getPROBABILITY_OF_SUCCESSEnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:823:3: ( 'probability_of_success' )
                    // InternalHriDsl.g:823:4: 'probability_of_success'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuery_typeAccess().getPROBABILITY_OF_SUCCESSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:827:2: ( ( 'expected_fatigue' ) )
                    {
                    // InternalHriDsl.g:827:2: ( ( 'expected_fatigue' ) )
                    // InternalHriDsl.g:828:3: ( 'expected_fatigue' )
                    {
                     before(grammarAccess.getQuery_typeAccess().getEXPECTED_FATIGUEEnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:829:3: ( 'expected_fatigue' )
                    // InternalHriDsl.g:829:4: 'expected_fatigue'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuery_typeAccess().getEXPECTED_FATIGUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:833:2: ( ( 'expected_charge' ) )
                    {
                    // InternalHriDsl.g:833:2: ( ( 'expected_charge' ) )
                    // InternalHriDsl.g:834:3: ( 'expected_charge' )
                    {
                     before(grammarAccess.getQuery_typeAccess().getEXPECTED_CHARGEEnumLiteralDeclaration_3()); 
                    // InternalHriDsl.g:835:3: ( 'expected_charge' )
                    // InternalHriDsl.g:835:4: 'expected_charge'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuery_typeAccess().getEXPECTED_CHARGEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHriDsl.g:839:2: ( ( 'probability_of_failure' ) )
                    {
                    // InternalHriDsl.g:839:2: ( ( 'probability_of_failure' ) )
                    // InternalHriDsl.g:840:3: ( 'probability_of_failure' )
                    {
                     before(grammarAccess.getQuery_typeAccess().getPROBABILITY_OF_FAILUREEnumLiteralDeclaration_4()); 
                    // InternalHriDsl.g:841:3: ( 'probability_of_failure' )
                    // InternalHriDsl.g:841:4: 'probability_of_failure'
                    {
                    match(input,49,FOLLOW_2); 

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
    // InternalHriDsl.g:849:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:853:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalHriDsl.g:854:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalHriDsl.g:861:1: rule__Model__Group__0__Impl : ( ( rule__Model__ParameterAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:865:1: ( ( ( rule__Model__ParameterAssignment_0 )? ) )
            // InternalHriDsl.g:866:1: ( ( rule__Model__ParameterAssignment_0 )? )
            {
            // InternalHriDsl.g:866:1: ( ( rule__Model__ParameterAssignment_0 )? )
            // InternalHriDsl.g:867:2: ( rule__Model__ParameterAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getParameterAssignment_0()); 
            // InternalHriDsl.g:868:2: ( rule__Model__ParameterAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==50) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalHriDsl.g:868:3: rule__Model__ParameterAssignment_0
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
    // InternalHriDsl.g:876:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:880:1: ( rule__Model__Group__1__Impl )
            // InternalHriDsl.g:881:2: rule__Model__Group__1__Impl
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
    // InternalHriDsl.g:887:1: rule__Model__Group__1__Impl : ( ( rule__Model__ScenariosAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:891:1: ( ( ( rule__Model__ScenariosAssignment_1 )* ) )
            // InternalHriDsl.g:892:1: ( ( rule__Model__ScenariosAssignment_1 )* )
            {
            // InternalHriDsl.g:892:1: ( ( rule__Model__ScenariosAssignment_1 )* )
            // InternalHriDsl.g:893:2: ( rule__Model__ScenariosAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getScenariosAssignment_1()); 
            // InternalHriDsl.g:894:2: ( rule__Model__ScenariosAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==53) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalHriDsl.g:894:3: rule__Model__ScenariosAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ScenariosAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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


    // $ANTLR start "rule__Parameter__Group_0__0"
    // InternalHriDsl.g:903:1: rule__Parameter__Group_0__0 : rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1 ;
    public final void rule__Parameter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:907:1: ( rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1 )
            // InternalHriDsl.g:908:2: rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Parameter__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_0__1();

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
    // $ANTLR end "rule__Parameter__Group_0__0"


    // $ANTLR start "rule__Parameter__Group_0__0__Impl"
    // InternalHriDsl.g:915:1: rule__Parameter__Group_0__0__Impl : ( 'parameter' ) ;
    public final void rule__Parameter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:919:1: ( ( 'parameter' ) )
            // InternalHriDsl.g:920:1: ( 'parameter' )
            {
            // InternalHriDsl.g:920:1: ( 'parameter' )
            // InternalHriDsl.g:921:2: 'parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_0__0__Impl"


    // $ANTLR start "rule__Parameter__Group_0__1"
    // InternalHriDsl.g:930:1: rule__Parameter__Group_0__1 : rule__Parameter__Group_0__1__Impl rule__Parameter__Group_0__2 ;
    public final void rule__Parameter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:934:1: ( rule__Parameter__Group_0__1__Impl rule__Parameter__Group_0__2 )
            // InternalHriDsl.g:935:2: rule__Parameter__Group_0__1__Impl rule__Parameter__Group_0__2
            {
            pushFollow(FOLLOW_6);
            rule__Parameter__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_0__2();

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
    // $ANTLR end "rule__Parameter__Group_0__1"


    // $ANTLR start "rule__Parameter__Group_0__1__Impl"
    // InternalHriDsl.g:942:1: rule__Parameter__Group_0__1__Impl : ( 'length_unit' ) ;
    public final void rule__Parameter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:946:1: ( ( 'length_unit' ) )
            // InternalHriDsl.g:947:1: ( 'length_unit' )
            {
            // InternalHriDsl.g:947:1: ( 'length_unit' )
            // InternalHriDsl.g:948:2: 'length_unit'
            {
             before(grammarAccess.getParameterAccess().getLength_unitKeyword_0_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getLength_unitKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_0__1__Impl"


    // $ANTLR start "rule__Parameter__Group_0__2"
    // InternalHriDsl.g:957:1: rule__Parameter__Group_0__2 : rule__Parameter__Group_0__2__Impl ;
    public final void rule__Parameter__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:961:1: ( rule__Parameter__Group_0__2__Impl )
            // InternalHriDsl.g:962:2: rule__Parameter__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_0__2__Impl();

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
    // $ANTLR end "rule__Parameter__Group_0__2"


    // $ANTLR start "rule__Parameter__Group_0__2__Impl"
    // InternalHriDsl.g:968:1: rule__Parameter__Group_0__2__Impl : ( ( rule__Parameter__Length_unitAssignment_0_2 ) ) ;
    public final void rule__Parameter__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:972:1: ( ( ( rule__Parameter__Length_unitAssignment_0_2 ) ) )
            // InternalHriDsl.g:973:1: ( ( rule__Parameter__Length_unitAssignment_0_2 ) )
            {
            // InternalHriDsl.g:973:1: ( ( rule__Parameter__Length_unitAssignment_0_2 ) )
            // InternalHriDsl.g:974:2: ( rule__Parameter__Length_unitAssignment_0_2 )
            {
             before(grammarAccess.getParameterAccess().getLength_unitAssignment_0_2()); 
            // InternalHriDsl.g:975:2: ( rule__Parameter__Length_unitAssignment_0_2 )
            // InternalHriDsl.g:975:3: rule__Parameter__Length_unitAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Length_unitAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getLength_unitAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_0__2__Impl"


    // $ANTLR start "rule__Parameter__Group_1__0"
    // InternalHriDsl.g:984:1: rule__Parameter__Group_1__0 : rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1 ;
    public final void rule__Parameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:988:1: ( rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1 )
            // InternalHriDsl.g:989:2: rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Parameter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_1__1();

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
    // $ANTLR end "rule__Parameter__Group_1__0"


    // $ANTLR start "rule__Parameter__Group_1__0__Impl"
    // InternalHriDsl.g:996:1: rule__Parameter__Group_1__0__Impl : ( 'parameter' ) ;
    public final void rule__Parameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1000:1: ( ( 'parameter' ) )
            // InternalHriDsl.g:1001:1: ( 'parameter' )
            {
            // InternalHriDsl.g:1001:1: ( 'parameter' )
            // InternalHriDsl.g:1002:2: 'parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1__0__Impl"


    // $ANTLR start "rule__Parameter__Group_1__1"
    // InternalHriDsl.g:1011:1: rule__Parameter__Group_1__1 : rule__Parameter__Group_1__1__Impl rule__Parameter__Group_1__2 ;
    public final void rule__Parameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1015:1: ( rule__Parameter__Group_1__1__Impl rule__Parameter__Group_1__2 )
            // InternalHriDsl.g:1016:2: rule__Parameter__Group_1__1__Impl rule__Parameter__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__Parameter__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_1__2();

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
    // $ANTLR end "rule__Parameter__Group_1__1"


    // $ANTLR start "rule__Parameter__Group_1__1__Impl"
    // InternalHriDsl.g:1023:1: rule__Parameter__Group_1__1__Impl : ( 'free_will_model' ) ;
    public final void rule__Parameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1027:1: ( ( 'free_will_model' ) )
            // InternalHriDsl.g:1028:1: ( 'free_will_model' )
            {
            // InternalHriDsl.g:1028:1: ( 'free_will_model' )
            // InternalHriDsl.g:1029:2: 'free_will_model'
            {
             before(grammarAccess.getParameterAccess().getFree_will_modelKeyword_1_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getFree_will_modelKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group_1__2"
    // InternalHriDsl.g:1038:1: rule__Parameter__Group_1__2 : rule__Parameter__Group_1__2__Impl ;
    public final void rule__Parameter__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1042:1: ( rule__Parameter__Group_1__2__Impl )
            // InternalHriDsl.g:1043:2: rule__Parameter__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_1__2__Impl();

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
    // $ANTLR end "rule__Parameter__Group_1__2"


    // $ANTLR start "rule__Parameter__Group_1__2__Impl"
    // InternalHriDsl.g:1049:1: rule__Parameter__Group_1__2__Impl : ( ( rule__Parameter__Free_will_modelAssignment_1_2 ) ) ;
    public final void rule__Parameter__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1053:1: ( ( ( rule__Parameter__Free_will_modelAssignment_1_2 ) ) )
            // InternalHriDsl.g:1054:1: ( ( rule__Parameter__Free_will_modelAssignment_1_2 ) )
            {
            // InternalHriDsl.g:1054:1: ( ( rule__Parameter__Free_will_modelAssignment_1_2 ) )
            // InternalHriDsl.g:1055:2: ( rule__Parameter__Free_will_modelAssignment_1_2 )
            {
             before(grammarAccess.getParameterAccess().getFree_will_modelAssignment_1_2()); 
            // InternalHriDsl.g:1056:2: ( rule__Parameter__Free_will_modelAssignment_1_2 )
            // InternalHriDsl.g:1056:3: rule__Parameter__Free_will_modelAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Free_will_modelAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getFree_will_modelAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1__2__Impl"


    // $ANTLR start "rule__Scenario__Group__0"
    // InternalHriDsl.g:1065:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1069:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalHriDsl.g:1070:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
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
    // InternalHriDsl.g:1077:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__FloorAssignment_0 ) ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1081:1: ( ( ( rule__Scenario__FloorAssignment_0 ) ) )
            // InternalHriDsl.g:1082:1: ( ( rule__Scenario__FloorAssignment_0 ) )
            {
            // InternalHriDsl.g:1082:1: ( ( rule__Scenario__FloorAssignment_0 ) )
            // InternalHriDsl.g:1083:2: ( rule__Scenario__FloorAssignment_0 )
            {
             before(grammarAccess.getScenarioAccess().getFloorAssignment_0()); 
            // InternalHriDsl.g:1084:2: ( rule__Scenario__FloorAssignment_0 )
            // InternalHriDsl.g:1084:3: rule__Scenario__FloorAssignment_0
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
    // InternalHriDsl.g:1092:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1096:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalHriDsl.g:1097:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
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
    // InternalHriDsl.g:1104:1: rule__Scenario__Group__1__Impl : ( ( rule__Scenario__RobotsAssignment_1 ) ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1108:1: ( ( ( rule__Scenario__RobotsAssignment_1 ) ) )
            // InternalHriDsl.g:1109:1: ( ( rule__Scenario__RobotsAssignment_1 ) )
            {
            // InternalHriDsl.g:1109:1: ( ( rule__Scenario__RobotsAssignment_1 ) )
            // InternalHriDsl.g:1110:2: ( rule__Scenario__RobotsAssignment_1 )
            {
             before(grammarAccess.getScenarioAccess().getRobotsAssignment_1()); 
            // InternalHriDsl.g:1111:2: ( rule__Scenario__RobotsAssignment_1 )
            // InternalHriDsl.g:1111:3: rule__Scenario__RobotsAssignment_1
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
    // InternalHriDsl.g:1119:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1123:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalHriDsl.g:1124:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
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
    // InternalHriDsl.g:1131:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__HumansAssignment_2 ) ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1135:1: ( ( ( rule__Scenario__HumansAssignment_2 ) ) )
            // InternalHriDsl.g:1136:1: ( ( rule__Scenario__HumansAssignment_2 ) )
            {
            // InternalHriDsl.g:1136:1: ( ( rule__Scenario__HumansAssignment_2 ) )
            // InternalHriDsl.g:1137:2: ( rule__Scenario__HumansAssignment_2 )
            {
             before(grammarAccess.getScenarioAccess().getHumansAssignment_2()); 
            // InternalHriDsl.g:1138:2: ( rule__Scenario__HumansAssignment_2 )
            // InternalHriDsl.g:1138:3: rule__Scenario__HumansAssignment_2
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
    // InternalHriDsl.g:1146:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1150:1: ( rule__Scenario__Group__3__Impl )
            // InternalHriDsl.g:1151:2: rule__Scenario__Group__3__Impl
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
    // InternalHriDsl.g:1157:1: rule__Scenario__Group__3__Impl : ( ( ( rule__Scenario__MissionsAssignment_3 ) ) ( ( rule__Scenario__MissionsAssignment_3 )* ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1161:1: ( ( ( ( rule__Scenario__MissionsAssignment_3 ) ) ( ( rule__Scenario__MissionsAssignment_3 )* ) ) )
            // InternalHriDsl.g:1162:1: ( ( ( rule__Scenario__MissionsAssignment_3 ) ) ( ( rule__Scenario__MissionsAssignment_3 )* ) )
            {
            // InternalHriDsl.g:1162:1: ( ( ( rule__Scenario__MissionsAssignment_3 ) ) ( ( rule__Scenario__MissionsAssignment_3 )* ) )
            // InternalHriDsl.g:1163:2: ( ( rule__Scenario__MissionsAssignment_3 ) ) ( ( rule__Scenario__MissionsAssignment_3 )* )
            {
            // InternalHriDsl.g:1163:2: ( ( rule__Scenario__MissionsAssignment_3 ) )
            // InternalHriDsl.g:1164:3: ( rule__Scenario__MissionsAssignment_3 )
            {
             before(grammarAccess.getScenarioAccess().getMissionsAssignment_3()); 
            // InternalHriDsl.g:1165:3: ( rule__Scenario__MissionsAssignment_3 )
            // InternalHriDsl.g:1165:4: rule__Scenario__MissionsAssignment_3
            {
            pushFollow(FOLLOW_4);
            rule__Scenario__MissionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getMissionsAssignment_3()); 

            }

            // InternalHriDsl.g:1168:2: ( ( rule__Scenario__MissionsAssignment_3 )* )
            // InternalHriDsl.g:1169:3: ( rule__Scenario__MissionsAssignment_3 )*
            {
             before(grammarAccess.getScenarioAccess().getMissionsAssignment_3()); 
            // InternalHriDsl.g:1170:3: ( rule__Scenario__MissionsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==53) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==69) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalHriDsl.g:1170:4: rule__Scenario__MissionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Scenario__MissionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalHriDsl.g:1180:1: rule__Floor__Group__0 : rule__Floor__Group__0__Impl rule__Floor__Group__1 ;
    public final void rule__Floor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1184:1: ( rule__Floor__Group__0__Impl rule__Floor__Group__1 )
            // InternalHriDsl.g:1185:2: rule__Floor__Group__0__Impl rule__Floor__Group__1
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
    // InternalHriDsl.g:1192:1: rule__Floor__Group__0__Impl : ( 'define' ) ;
    public final void rule__Floor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1196:1: ( ( 'define' ) )
            // InternalHriDsl.g:1197:1: ( 'define' )
            {
            // InternalHriDsl.g:1197:1: ( 'define' )
            // InternalHriDsl.g:1198:2: 'define'
            {
             before(grammarAccess.getFloorAccess().getDefineKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalHriDsl.g:1207:1: rule__Floor__Group__1 : rule__Floor__Group__1__Impl rule__Floor__Group__2 ;
    public final void rule__Floor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1211:1: ( rule__Floor__Group__1__Impl rule__Floor__Group__2 )
            // InternalHriDsl.g:1212:2: rule__Floor__Group__1__Impl rule__Floor__Group__2
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
    // InternalHriDsl.g:1219:1: rule__Floor__Group__1__Impl : ( 'layout' ) ;
    public final void rule__Floor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1223:1: ( ( 'layout' ) )
            // InternalHriDsl.g:1224:1: ( 'layout' )
            {
            // InternalHriDsl.g:1224:1: ( 'layout' )
            // InternalHriDsl.g:1225:2: 'layout'
            {
             before(grammarAccess.getFloorAccess().getLayoutKeyword_1()); 
            match(input,54,FOLLOW_2); 
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
    // InternalHriDsl.g:1234:1: rule__Floor__Group__2 : rule__Floor__Group__2__Impl rule__Floor__Group__3 ;
    public final void rule__Floor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1238:1: ( rule__Floor__Group__2__Impl rule__Floor__Group__3 )
            // InternalHriDsl.g:1239:2: rule__Floor__Group__2__Impl rule__Floor__Group__3
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
    // InternalHriDsl.g:1246:1: rule__Floor__Group__2__Impl : ( ( rule__Floor__Floor_nameAssignment_2 ) ) ;
    public final void rule__Floor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1250:1: ( ( ( rule__Floor__Floor_nameAssignment_2 ) ) )
            // InternalHriDsl.g:1251:1: ( ( rule__Floor__Floor_nameAssignment_2 ) )
            {
            // InternalHriDsl.g:1251:1: ( ( rule__Floor__Floor_nameAssignment_2 ) )
            // InternalHriDsl.g:1252:2: ( rule__Floor__Floor_nameAssignment_2 )
            {
             before(grammarAccess.getFloorAccess().getFloor_nameAssignment_2()); 
            // InternalHriDsl.g:1253:2: ( rule__Floor__Floor_nameAssignment_2 )
            // InternalHriDsl.g:1253:3: rule__Floor__Floor_nameAssignment_2
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
    // InternalHriDsl.g:1261:1: rule__Floor__Group__3 : rule__Floor__Group__3__Impl rule__Floor__Group__4 ;
    public final void rule__Floor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1265:1: ( rule__Floor__Group__3__Impl rule__Floor__Group__4 )
            // InternalHriDsl.g:1266:2: rule__Floor__Group__3__Impl rule__Floor__Group__4
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
    // InternalHriDsl.g:1273:1: rule__Floor__Group__3__Impl : ( ':' ) ;
    public final void rule__Floor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1277:1: ( ( ':' ) )
            // InternalHriDsl.g:1278:1: ( ':' )
            {
            // InternalHriDsl.g:1278:1: ( ':' )
            // InternalHriDsl.g:1279:2: ':'
            {
             before(grammarAccess.getFloorAccess().getColonKeyword_3()); 
            match(input,55,FOLLOW_2); 
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
    // InternalHriDsl.g:1288:1: rule__Floor__Group__4 : rule__Floor__Group__4__Impl rule__Floor__Group__5 ;
    public final void rule__Floor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1292:1: ( rule__Floor__Group__4__Impl rule__Floor__Group__5 )
            // InternalHriDsl.g:1293:2: rule__Floor__Group__4__Impl rule__Floor__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalHriDsl.g:1300:1: rule__Floor__Group__4__Impl : ( ( ( rule__Floor__SurfacesAssignment_4 ) ) ( ( rule__Floor__SurfacesAssignment_4 )* ) ) ;
    public final void rule__Floor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1304:1: ( ( ( ( rule__Floor__SurfacesAssignment_4 ) ) ( ( rule__Floor__SurfacesAssignment_4 )* ) ) )
            // InternalHriDsl.g:1305:1: ( ( ( rule__Floor__SurfacesAssignment_4 ) ) ( ( rule__Floor__SurfacesAssignment_4 )* ) )
            {
            // InternalHriDsl.g:1305:1: ( ( ( rule__Floor__SurfacesAssignment_4 ) ) ( ( rule__Floor__SurfacesAssignment_4 )* ) )
            // InternalHriDsl.g:1306:2: ( ( rule__Floor__SurfacesAssignment_4 ) ) ( ( rule__Floor__SurfacesAssignment_4 )* )
            {
            // InternalHriDsl.g:1306:2: ( ( rule__Floor__SurfacesAssignment_4 ) )
            // InternalHriDsl.g:1307:3: ( rule__Floor__SurfacesAssignment_4 )
            {
             before(grammarAccess.getFloorAccess().getSurfacesAssignment_4()); 
            // InternalHriDsl.g:1308:3: ( rule__Floor__SurfacesAssignment_4 )
            // InternalHriDsl.g:1308:4: rule__Floor__SurfacesAssignment_4
            {
            pushFollow(FOLLOW_14);
            rule__Floor__SurfacesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getSurfacesAssignment_4()); 

            }

            // InternalHriDsl.g:1311:2: ( ( rule__Floor__SurfacesAssignment_4 )* )
            // InternalHriDsl.g:1312:3: ( rule__Floor__SurfacesAssignment_4 )*
            {
             before(grammarAccess.getFloorAccess().getSurfacesAssignment_4()); 
            // InternalHriDsl.g:1313:3: ( rule__Floor__SurfacesAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==56) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalHriDsl.g:1313:4: rule__Floor__SurfacesAssignment_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Floor__SurfacesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalHriDsl.g:1322:1: rule__Floor__Group__5 : rule__Floor__Group__5__Impl ;
    public final void rule__Floor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1326:1: ( rule__Floor__Group__5__Impl )
            // InternalHriDsl.g:1327:2: rule__Floor__Group__5__Impl
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
    // InternalHriDsl.g:1333:1: rule__Floor__Group__5__Impl : ( ( ( rule__Floor__PointsAssignment_5 ) ) ( ( rule__Floor__PointsAssignment_5 )* ) ) ;
    public final void rule__Floor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1337:1: ( ( ( ( rule__Floor__PointsAssignment_5 ) ) ( ( rule__Floor__PointsAssignment_5 )* ) ) )
            // InternalHriDsl.g:1338:1: ( ( ( rule__Floor__PointsAssignment_5 ) ) ( ( rule__Floor__PointsAssignment_5 )* ) )
            {
            // InternalHriDsl.g:1338:1: ( ( ( rule__Floor__PointsAssignment_5 ) ) ( ( rule__Floor__PointsAssignment_5 )* ) )
            // InternalHriDsl.g:1339:2: ( ( rule__Floor__PointsAssignment_5 ) ) ( ( rule__Floor__PointsAssignment_5 )* )
            {
            // InternalHriDsl.g:1339:2: ( ( rule__Floor__PointsAssignment_5 ) )
            // InternalHriDsl.g:1340:3: ( rule__Floor__PointsAssignment_5 )
            {
             before(grammarAccess.getFloorAccess().getPointsAssignment_5()); 
            // InternalHriDsl.g:1341:3: ( rule__Floor__PointsAssignment_5 )
            // InternalHriDsl.g:1341:4: rule__Floor__PointsAssignment_5
            {
            pushFollow(FOLLOW_15);
            rule__Floor__PointsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getPointsAssignment_5()); 

            }

            // InternalHriDsl.g:1344:2: ( ( rule__Floor__PointsAssignment_5 )* )
            // InternalHriDsl.g:1345:3: ( rule__Floor__PointsAssignment_5 )*
            {
             before(grammarAccess.getFloorAccess().getPointsAssignment_5()); 
            // InternalHriDsl.g:1346:3: ( rule__Floor__PointsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==58) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalHriDsl.g:1346:4: rule__Floor__PointsAssignment_5
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Floor__PointsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalHriDsl.g:1356:1: rule__Surface__Group__0 : rule__Surface__Group__0__Impl rule__Surface__Group__1 ;
    public final void rule__Surface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1360:1: ( rule__Surface__Group__0__Impl rule__Surface__Group__1 )
            // InternalHriDsl.g:1361:2: rule__Surface__Group__0__Impl rule__Surface__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalHriDsl.g:1368:1: rule__Surface__Group__0__Impl : ( 'area' ) ;
    public final void rule__Surface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1372:1: ( ( 'area' ) )
            // InternalHriDsl.g:1373:1: ( 'area' )
            {
            // InternalHriDsl.g:1373:1: ( 'area' )
            // InternalHriDsl.g:1374:2: 'area'
            {
             before(grammarAccess.getSurfaceAccess().getAreaKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalHriDsl.g:1383:1: rule__Surface__Group__1 : rule__Surface__Group__1__Impl rule__Surface__Group__2 ;
    public final void rule__Surface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1387:1: ( rule__Surface__Group__1__Impl rule__Surface__Group__2 )
            // InternalHriDsl.g:1388:2: rule__Surface__Group__1__Impl rule__Surface__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalHriDsl.g:1395:1: rule__Surface__Group__1__Impl : ( ( rule__Surface__NameAssignment_1 ) ) ;
    public final void rule__Surface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1399:1: ( ( ( rule__Surface__NameAssignment_1 ) ) )
            // InternalHriDsl.g:1400:1: ( ( rule__Surface__NameAssignment_1 ) )
            {
            // InternalHriDsl.g:1400:1: ( ( rule__Surface__NameAssignment_1 ) )
            // InternalHriDsl.g:1401:2: ( rule__Surface__NameAssignment_1 )
            {
             before(grammarAccess.getSurfaceAccess().getNameAssignment_1()); 
            // InternalHriDsl.g:1402:2: ( rule__Surface__NameAssignment_1 )
            // InternalHriDsl.g:1402:3: rule__Surface__NameAssignment_1
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
    // InternalHriDsl.g:1410:1: rule__Surface__Group__2 : rule__Surface__Group__2__Impl rule__Surface__Group__3 ;
    public final void rule__Surface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1414:1: ( rule__Surface__Group__2__Impl rule__Surface__Group__3 )
            // InternalHriDsl.g:1415:2: rule__Surface__Group__2__Impl rule__Surface__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalHriDsl.g:1422:1: rule__Surface__Group__2__Impl : ( 'in' ) ;
    public final void rule__Surface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1426:1: ( ( 'in' ) )
            // InternalHriDsl.g:1427:1: ( 'in' )
            {
            // InternalHriDsl.g:1427:1: ( 'in' )
            // InternalHriDsl.g:1428:2: 'in'
            {
             before(grammarAccess.getSurfaceAccess().getInKeyword_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalHriDsl.g:1437:1: rule__Surface__Group__3 : rule__Surface__Group__3__Impl ;
    public final void rule__Surface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1441:1: ( rule__Surface__Group__3__Impl )
            // InternalHriDsl.g:1442:2: rule__Surface__Group__3__Impl
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
    // InternalHriDsl.g:1448:1: rule__Surface__Group__3__Impl : ( ( rule__Surface__VerticesAssignment_3 ) ) ;
    public final void rule__Surface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1452:1: ( ( ( rule__Surface__VerticesAssignment_3 ) ) )
            // InternalHriDsl.g:1453:1: ( ( rule__Surface__VerticesAssignment_3 ) )
            {
            // InternalHriDsl.g:1453:1: ( ( rule__Surface__VerticesAssignment_3 ) )
            // InternalHriDsl.g:1454:2: ( rule__Surface__VerticesAssignment_3 )
            {
             before(grammarAccess.getSurfaceAccess().getVerticesAssignment_3()); 
            // InternalHriDsl.g:1455:2: ( rule__Surface__VerticesAssignment_3 )
            // InternalHriDsl.g:1455:3: rule__Surface__VerticesAssignment_3
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
    // InternalHriDsl.g:1464:1: rule__Vertices__Group__0 : rule__Vertices__Group__0__Impl rule__Vertices__Group__1 ;
    public final void rule__Vertices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1468:1: ( rule__Vertices__Group__0__Impl rule__Vertices__Group__1 )
            // InternalHriDsl.g:1469:2: rule__Vertices__Group__0__Impl rule__Vertices__Group__1
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
    // InternalHriDsl.g:1476:1: rule__Vertices__Group__0__Impl : ( ( rule__Vertices__Vertex_AAssignment_0 ) ) ;
    public final void rule__Vertices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1480:1: ( ( ( rule__Vertices__Vertex_AAssignment_0 ) ) )
            // InternalHriDsl.g:1481:1: ( ( rule__Vertices__Vertex_AAssignment_0 ) )
            {
            // InternalHriDsl.g:1481:1: ( ( rule__Vertices__Vertex_AAssignment_0 ) )
            // InternalHriDsl.g:1482:2: ( rule__Vertices__Vertex_AAssignment_0 )
            {
             before(grammarAccess.getVerticesAccess().getVertex_AAssignment_0()); 
            // InternalHriDsl.g:1483:2: ( rule__Vertices__Vertex_AAssignment_0 )
            // InternalHriDsl.g:1483:3: rule__Vertices__Vertex_AAssignment_0
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
    // InternalHriDsl.g:1491:1: rule__Vertices__Group__1 : rule__Vertices__Group__1__Impl ;
    public final void rule__Vertices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1495:1: ( rule__Vertices__Group__1__Impl )
            // InternalHriDsl.g:1496:2: rule__Vertices__Group__1__Impl
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
    // InternalHriDsl.g:1502:1: rule__Vertices__Group__1__Impl : ( ( rule__Vertices__Vertex_CAssignment_1 ) ) ;
    public final void rule__Vertices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1506:1: ( ( ( rule__Vertices__Vertex_CAssignment_1 ) ) )
            // InternalHriDsl.g:1507:1: ( ( rule__Vertices__Vertex_CAssignment_1 ) )
            {
            // InternalHriDsl.g:1507:1: ( ( rule__Vertices__Vertex_CAssignment_1 ) )
            // InternalHriDsl.g:1508:2: ( rule__Vertices__Vertex_CAssignment_1 )
            {
             before(grammarAccess.getVerticesAccess().getVertex_CAssignment_1()); 
            // InternalHriDsl.g:1509:2: ( rule__Vertices__Vertex_CAssignment_1 )
            // InternalHriDsl.g:1509:3: rule__Vertices__Vertex_CAssignment_1
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
    // InternalHriDsl.g:1518:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1522:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalHriDsl.g:1523:2: rule__Point__Group__0__Impl rule__Point__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalHriDsl.g:1530:1: rule__Point__Group__0__Impl : ( 'poi' ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1534:1: ( ( 'poi' ) )
            // InternalHriDsl.g:1535:1: ( 'poi' )
            {
            // InternalHriDsl.g:1535:1: ( 'poi' )
            // InternalHriDsl.g:1536:2: 'poi'
            {
             before(grammarAccess.getPointAccess().getPoiKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalHriDsl.g:1545:1: rule__Point__Group__1 : rule__Point__Group__1__Impl rule__Point__Group__2 ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1549:1: ( rule__Point__Group__1__Impl rule__Point__Group__2 )
            // InternalHriDsl.g:1550:2: rule__Point__Group__1__Impl rule__Point__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalHriDsl.g:1557:1: rule__Point__Group__1__Impl : ( ( rule__Point__NameAssignment_1 ) ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1561:1: ( ( ( rule__Point__NameAssignment_1 ) ) )
            // InternalHriDsl.g:1562:1: ( ( rule__Point__NameAssignment_1 ) )
            {
            // InternalHriDsl.g:1562:1: ( ( rule__Point__NameAssignment_1 ) )
            // InternalHriDsl.g:1563:2: ( rule__Point__NameAssignment_1 )
            {
             before(grammarAccess.getPointAccess().getNameAssignment_1()); 
            // InternalHriDsl.g:1564:2: ( rule__Point__NameAssignment_1 )
            // InternalHriDsl.g:1564:3: rule__Point__NameAssignment_1
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
    // InternalHriDsl.g:1572:1: rule__Point__Group__2 : rule__Point__Group__2__Impl rule__Point__Group__3 ;
    public final void rule__Point__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1576:1: ( rule__Point__Group__2__Impl rule__Point__Group__3 )
            // InternalHriDsl.g:1577:2: rule__Point__Group__2__Impl rule__Point__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalHriDsl.g:1584:1: rule__Point__Group__2__Impl : ( 'in' ) ;
    public final void rule__Point__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1588:1: ( ( 'in' ) )
            // InternalHriDsl.g:1589:1: ( 'in' )
            {
            // InternalHriDsl.g:1589:1: ( 'in' )
            // InternalHriDsl.g:1590:2: 'in'
            {
             before(grammarAccess.getPointAccess().getInKeyword_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalHriDsl.g:1599:1: rule__Point__Group__3 : rule__Point__Group__3__Impl ;
    public final void rule__Point__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1603:1: ( rule__Point__Group__3__Impl )
            // InternalHriDsl.g:1604:2: rule__Point__Group__3__Impl
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
    // InternalHriDsl.g:1610:1: rule__Point__Group__3__Impl : ( ( rule__Point__CoordinatesAssignment_3 ) ) ;
    public final void rule__Point__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1614:1: ( ( ( rule__Point__CoordinatesAssignment_3 ) ) )
            // InternalHriDsl.g:1615:1: ( ( rule__Point__CoordinatesAssignment_3 ) )
            {
            // InternalHriDsl.g:1615:1: ( ( rule__Point__CoordinatesAssignment_3 ) )
            // InternalHriDsl.g:1616:2: ( rule__Point__CoordinatesAssignment_3 )
            {
             before(grammarAccess.getPointAccess().getCoordinatesAssignment_3()); 
            // InternalHriDsl.g:1617:2: ( rule__Point__CoordinatesAssignment_3 )
            // InternalHriDsl.g:1617:3: rule__Point__CoordinatesAssignment_3
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
    // InternalHriDsl.g:1626:1: rule__Robots__Group__0 : rule__Robots__Group__0__Impl rule__Robots__Group__1 ;
    public final void rule__Robots__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1630:1: ( rule__Robots__Group__0__Impl rule__Robots__Group__1 )
            // InternalHriDsl.g:1631:2: rule__Robots__Group__0__Impl rule__Robots__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalHriDsl.g:1638:1: rule__Robots__Group__0__Impl : ( 'define' ) ;
    public final void rule__Robots__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1642:1: ( ( 'define' ) )
            // InternalHriDsl.g:1643:1: ( 'define' )
            {
            // InternalHriDsl.g:1643:1: ( 'define' )
            // InternalHriDsl.g:1644:2: 'define'
            {
             before(grammarAccess.getRobotsAccess().getDefineKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalHriDsl.g:1653:1: rule__Robots__Group__1 : rule__Robots__Group__1__Impl rule__Robots__Group__2 ;
    public final void rule__Robots__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1657:1: ( rule__Robots__Group__1__Impl rule__Robots__Group__2 )
            // InternalHriDsl.g:1658:2: rule__Robots__Group__1__Impl rule__Robots__Group__2
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
    // InternalHriDsl.g:1665:1: rule__Robots__Group__1__Impl : ( 'robots' ) ;
    public final void rule__Robots__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1669:1: ( ( 'robots' ) )
            // InternalHriDsl.g:1670:1: ( 'robots' )
            {
            // InternalHriDsl.g:1670:1: ( 'robots' )
            // InternalHriDsl.g:1671:2: 'robots'
            {
             before(grammarAccess.getRobotsAccess().getRobotsKeyword_1()); 
            match(input,59,FOLLOW_2); 
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
    // InternalHriDsl.g:1680:1: rule__Robots__Group__2 : rule__Robots__Group__2__Impl rule__Robots__Group__3 ;
    public final void rule__Robots__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1684:1: ( rule__Robots__Group__2__Impl rule__Robots__Group__3 )
            // InternalHriDsl.g:1685:2: rule__Robots__Group__2__Impl rule__Robots__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalHriDsl.g:1692:1: rule__Robots__Group__2__Impl : ( ':' ) ;
    public final void rule__Robots__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1696:1: ( ( ':' ) )
            // InternalHriDsl.g:1697:1: ( ':' )
            {
            // InternalHriDsl.g:1697:1: ( ':' )
            // InternalHriDsl.g:1698:2: ':'
            {
             before(grammarAccess.getRobotsAccess().getColonKeyword_2()); 
            match(input,55,FOLLOW_2); 
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
    // InternalHriDsl.g:1707:1: rule__Robots__Group__3 : rule__Robots__Group__3__Impl ;
    public final void rule__Robots__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1711:1: ( rule__Robots__Group__3__Impl )
            // InternalHriDsl.g:1712:2: rule__Robots__Group__3__Impl
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
    // InternalHriDsl.g:1718:1: rule__Robots__Group__3__Impl : ( ( ( rule__Robots__RobotsAssignment_3 ) ) ( ( rule__Robots__RobotsAssignment_3 )* ) ) ;
    public final void rule__Robots__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1722:1: ( ( ( ( rule__Robots__RobotsAssignment_3 ) ) ( ( rule__Robots__RobotsAssignment_3 )* ) ) )
            // InternalHriDsl.g:1723:1: ( ( ( rule__Robots__RobotsAssignment_3 ) ) ( ( rule__Robots__RobotsAssignment_3 )* ) )
            {
            // InternalHriDsl.g:1723:1: ( ( ( rule__Robots__RobotsAssignment_3 ) ) ( ( rule__Robots__RobotsAssignment_3 )* ) )
            // InternalHriDsl.g:1724:2: ( ( rule__Robots__RobotsAssignment_3 ) ) ( ( rule__Robots__RobotsAssignment_3 )* )
            {
            // InternalHriDsl.g:1724:2: ( ( rule__Robots__RobotsAssignment_3 ) )
            // InternalHriDsl.g:1725:3: ( rule__Robots__RobotsAssignment_3 )
            {
             before(grammarAccess.getRobotsAccess().getRobotsAssignment_3()); 
            // InternalHriDsl.g:1726:3: ( rule__Robots__RobotsAssignment_3 )
            // InternalHriDsl.g:1726:4: rule__Robots__RobotsAssignment_3
            {
            pushFollow(FOLLOW_20);
            rule__Robots__RobotsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRobotsAccess().getRobotsAssignment_3()); 

            }

            // InternalHriDsl.g:1729:2: ( ( rule__Robots__RobotsAssignment_3 )* )
            // InternalHriDsl.g:1730:3: ( rule__Robots__RobotsAssignment_3 )*
            {
             before(grammarAccess.getRobotsAccess().getRobotsAssignment_3()); 
            // InternalHriDsl.g:1731:3: ( rule__Robots__RobotsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==60) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalHriDsl.g:1731:4: rule__Robots__RobotsAssignment_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Robots__RobotsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalHriDsl.g:1741:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1745:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalHriDsl.g:1746:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
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
    // InternalHriDsl.g:1753:1: rule__Robot__Group__0__Impl : ( 'robot' ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1757:1: ( ( 'robot' ) )
            // InternalHriDsl.g:1758:1: ( 'robot' )
            {
            // InternalHriDsl.g:1758:1: ( 'robot' )
            // InternalHriDsl.g:1759:2: 'robot'
            {
             before(grammarAccess.getRobotAccess().getRobotKeyword_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalHriDsl.g:1768:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1772:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalHriDsl.g:1773:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalHriDsl.g:1780:1: rule__Robot__Group__1__Impl : ( ( rule__Robot__NameAssignment_1 ) ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1784:1: ( ( ( rule__Robot__NameAssignment_1 ) ) )
            // InternalHriDsl.g:1785:1: ( ( rule__Robot__NameAssignment_1 ) )
            {
            // InternalHriDsl.g:1785:1: ( ( rule__Robot__NameAssignment_1 ) )
            // InternalHriDsl.g:1786:2: ( rule__Robot__NameAssignment_1 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_1()); 
            // InternalHriDsl.g:1787:2: ( rule__Robot__NameAssignment_1 )
            // InternalHriDsl.g:1787:3: rule__Robot__NameAssignment_1
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
    // InternalHriDsl.g:1795:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl rule__Robot__Group__3 ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1799:1: ( rule__Robot__Group__2__Impl rule__Robot__Group__3 )
            // InternalHriDsl.g:1800:2: rule__Robot__Group__2__Impl rule__Robot__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalHriDsl.g:1807:1: rule__Robot__Group__2__Impl : ( 'in' ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1811:1: ( ( 'in' ) )
            // InternalHriDsl.g:1812:1: ( 'in' )
            {
            // InternalHriDsl.g:1812:1: ( 'in' )
            // InternalHriDsl.g:1813:2: 'in'
            {
             before(grammarAccess.getRobotAccess().getInKeyword_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalHriDsl.g:1822:1: rule__Robot__Group__3 : rule__Robot__Group__3__Impl rule__Robot__Group__4 ;
    public final void rule__Robot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1826:1: ( rule__Robot__Group__3__Impl rule__Robot__Group__4 )
            // InternalHriDsl.g:1827:2: rule__Robot__Group__3__Impl rule__Robot__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalHriDsl.g:1834:1: rule__Robot__Group__3__Impl : ( ( rule__Robot__CoordinatesAssignment_3 ) ) ;
    public final void rule__Robot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1838:1: ( ( ( rule__Robot__CoordinatesAssignment_3 ) ) )
            // InternalHriDsl.g:1839:1: ( ( rule__Robot__CoordinatesAssignment_3 ) )
            {
            // InternalHriDsl.g:1839:1: ( ( rule__Robot__CoordinatesAssignment_3 ) )
            // InternalHriDsl.g:1840:2: ( rule__Robot__CoordinatesAssignment_3 )
            {
             before(grammarAccess.getRobotAccess().getCoordinatesAssignment_3()); 
            // InternalHriDsl.g:1841:2: ( rule__Robot__CoordinatesAssignment_3 )
            // InternalHriDsl.g:1841:3: rule__Robot__CoordinatesAssignment_3
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
    // InternalHriDsl.g:1849:1: rule__Robot__Group__4 : rule__Robot__Group__4__Impl rule__Robot__Group__5 ;
    public final void rule__Robot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1853:1: ( rule__Robot__Group__4__Impl rule__Robot__Group__5 )
            // InternalHriDsl.g:1854:2: rule__Robot__Group__4__Impl rule__Robot__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalHriDsl.g:1861:1: rule__Robot__Group__4__Impl : ( 'type' ) ;
    public final void rule__Robot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1865:1: ( ( 'type' ) )
            // InternalHriDsl.g:1866:1: ( 'type' )
            {
            // InternalHriDsl.g:1866:1: ( 'type' )
            // InternalHriDsl.g:1867:2: 'type'
            {
             before(grammarAccess.getRobotAccess().getTypeKeyword_4()); 
            match(input,61,FOLLOW_2); 
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
    // InternalHriDsl.g:1876:1: rule__Robot__Group__5 : rule__Robot__Group__5__Impl rule__Robot__Group__6 ;
    public final void rule__Robot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1880:1: ( rule__Robot__Group__5__Impl rule__Robot__Group__6 )
            // InternalHriDsl.g:1881:2: rule__Robot__Group__5__Impl rule__Robot__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalHriDsl.g:1888:1: rule__Robot__Group__5__Impl : ( ( rule__Robot__TypeAssignment_5 ) ) ;
    public final void rule__Robot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1892:1: ( ( ( rule__Robot__TypeAssignment_5 ) ) )
            // InternalHriDsl.g:1893:1: ( ( rule__Robot__TypeAssignment_5 ) )
            {
            // InternalHriDsl.g:1893:1: ( ( rule__Robot__TypeAssignment_5 ) )
            // InternalHriDsl.g:1894:2: ( rule__Robot__TypeAssignment_5 )
            {
             before(grammarAccess.getRobotAccess().getTypeAssignment_5()); 
            // InternalHriDsl.g:1895:2: ( rule__Robot__TypeAssignment_5 )
            // InternalHriDsl.g:1895:3: rule__Robot__TypeAssignment_5
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
    // InternalHriDsl.g:1903:1: rule__Robot__Group__6 : rule__Robot__Group__6__Impl rule__Robot__Group__7 ;
    public final void rule__Robot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1907:1: ( rule__Robot__Group__6__Impl rule__Robot__Group__7 )
            // InternalHriDsl.g:1908:2: rule__Robot__Group__6__Impl rule__Robot__Group__7
            {
            pushFollow(FOLLOW_24);
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
    // InternalHriDsl.g:1915:1: rule__Robot__Group__6__Impl : ( 'charge' ) ;
    public final void rule__Robot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1919:1: ( ( 'charge' ) )
            // InternalHriDsl.g:1920:1: ( 'charge' )
            {
            // InternalHriDsl.g:1920:1: ( 'charge' )
            // InternalHriDsl.g:1921:2: 'charge'
            {
             before(grammarAccess.getRobotAccess().getChargeKeyword_6()); 
            match(input,62,FOLLOW_2); 
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
    // InternalHriDsl.g:1930:1: rule__Robot__Group__7 : rule__Robot__Group__7__Impl ;
    public final void rule__Robot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1934:1: ( rule__Robot__Group__7__Impl )
            // InternalHriDsl.g:1935:2: rule__Robot__Group__7__Impl
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
    // InternalHriDsl.g:1941:1: rule__Robot__Group__7__Impl : ( ( rule__Robot__Charge_percentageAssignment_7 ) ) ;
    public final void rule__Robot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1945:1: ( ( ( rule__Robot__Charge_percentageAssignment_7 ) ) )
            // InternalHriDsl.g:1946:1: ( ( rule__Robot__Charge_percentageAssignment_7 ) )
            {
            // InternalHriDsl.g:1946:1: ( ( rule__Robot__Charge_percentageAssignment_7 ) )
            // InternalHriDsl.g:1947:2: ( rule__Robot__Charge_percentageAssignment_7 )
            {
             before(grammarAccess.getRobotAccess().getCharge_percentageAssignment_7()); 
            // InternalHriDsl.g:1948:2: ( rule__Robot__Charge_percentageAssignment_7 )
            // InternalHriDsl.g:1948:3: rule__Robot__Charge_percentageAssignment_7
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
    // InternalHriDsl.g:1957:1: rule__Humans__Group__0 : rule__Humans__Group__0__Impl rule__Humans__Group__1 ;
    public final void rule__Humans__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1961:1: ( rule__Humans__Group__0__Impl rule__Humans__Group__1 )
            // InternalHriDsl.g:1962:2: rule__Humans__Group__0__Impl rule__Humans__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalHriDsl.g:1969:1: rule__Humans__Group__0__Impl : ( 'define' ) ;
    public final void rule__Humans__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1973:1: ( ( 'define' ) )
            // InternalHriDsl.g:1974:1: ( 'define' )
            {
            // InternalHriDsl.g:1974:1: ( 'define' )
            // InternalHriDsl.g:1975:2: 'define'
            {
             before(grammarAccess.getHumansAccess().getDefineKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalHriDsl.g:1984:1: rule__Humans__Group__1 : rule__Humans__Group__1__Impl rule__Humans__Group__2 ;
    public final void rule__Humans__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1988:1: ( rule__Humans__Group__1__Impl rule__Humans__Group__2 )
            // InternalHriDsl.g:1989:2: rule__Humans__Group__1__Impl rule__Humans__Group__2
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
    // InternalHriDsl.g:1996:1: rule__Humans__Group__1__Impl : ( 'humans' ) ;
    public final void rule__Humans__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2000:1: ( ( 'humans' ) )
            // InternalHriDsl.g:2001:1: ( 'humans' )
            {
            // InternalHriDsl.g:2001:1: ( 'humans' )
            // InternalHriDsl.g:2002:2: 'humans'
            {
             before(grammarAccess.getHumansAccess().getHumansKeyword_1()); 
            match(input,63,FOLLOW_2); 
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
    // InternalHriDsl.g:2011:1: rule__Humans__Group__2 : rule__Humans__Group__2__Impl rule__Humans__Group__3 ;
    public final void rule__Humans__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2015:1: ( rule__Humans__Group__2__Impl rule__Humans__Group__3 )
            // InternalHriDsl.g:2016:2: rule__Humans__Group__2__Impl rule__Humans__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalHriDsl.g:2023:1: rule__Humans__Group__2__Impl : ( ':' ) ;
    public final void rule__Humans__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2027:1: ( ( ':' ) )
            // InternalHriDsl.g:2028:1: ( ':' )
            {
            // InternalHriDsl.g:2028:1: ( ':' )
            // InternalHriDsl.g:2029:2: ':'
            {
             before(grammarAccess.getHumansAccess().getColonKeyword_2()); 
            match(input,55,FOLLOW_2); 
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
    // InternalHriDsl.g:2038:1: rule__Humans__Group__3 : rule__Humans__Group__3__Impl ;
    public final void rule__Humans__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2042:1: ( rule__Humans__Group__3__Impl )
            // InternalHriDsl.g:2043:2: rule__Humans__Group__3__Impl
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
    // InternalHriDsl.g:2049:1: rule__Humans__Group__3__Impl : ( ( ( rule__Humans__HumansAssignment_3 ) ) ( ( rule__Humans__HumansAssignment_3 )* ) ) ;
    public final void rule__Humans__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2053:1: ( ( ( ( rule__Humans__HumansAssignment_3 ) ) ( ( rule__Humans__HumansAssignment_3 )* ) ) )
            // InternalHriDsl.g:2054:1: ( ( ( rule__Humans__HumansAssignment_3 ) ) ( ( rule__Humans__HumansAssignment_3 )* ) )
            {
            // InternalHriDsl.g:2054:1: ( ( ( rule__Humans__HumansAssignment_3 ) ) ( ( rule__Humans__HumansAssignment_3 )* ) )
            // InternalHriDsl.g:2055:2: ( ( rule__Humans__HumansAssignment_3 ) ) ( ( rule__Humans__HumansAssignment_3 )* )
            {
            // InternalHriDsl.g:2055:2: ( ( rule__Humans__HumansAssignment_3 ) )
            // InternalHriDsl.g:2056:3: ( rule__Humans__HumansAssignment_3 )
            {
             before(grammarAccess.getHumansAccess().getHumansAssignment_3()); 
            // InternalHriDsl.g:2057:3: ( rule__Humans__HumansAssignment_3 )
            // InternalHriDsl.g:2057:4: rule__Humans__HumansAssignment_3
            {
            pushFollow(FOLLOW_27);
            rule__Humans__HumansAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHumansAccess().getHumansAssignment_3()); 

            }

            // InternalHriDsl.g:2060:2: ( ( rule__Humans__HumansAssignment_3 )* )
            // InternalHriDsl.g:2061:3: ( rule__Humans__HumansAssignment_3 )*
            {
             before(grammarAccess.getHumansAccess().getHumansAssignment_3()); 
            // InternalHriDsl.g:2062:3: ( rule__Humans__HumansAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==64) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalHriDsl.g:2062:4: rule__Humans__HumansAssignment_3
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Humans__HumansAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalHriDsl.g:2072:1: rule__Human__Group__0 : rule__Human__Group__0__Impl rule__Human__Group__1 ;
    public final void rule__Human__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2076:1: ( rule__Human__Group__0__Impl rule__Human__Group__1 )
            // InternalHriDsl.g:2077:2: rule__Human__Group__0__Impl rule__Human__Group__1
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
    // InternalHriDsl.g:2084:1: rule__Human__Group__0__Impl : ( 'human' ) ;
    public final void rule__Human__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2088:1: ( ( 'human' ) )
            // InternalHriDsl.g:2089:1: ( 'human' )
            {
            // InternalHriDsl.g:2089:1: ( 'human' )
            // InternalHriDsl.g:2090:2: 'human'
            {
             before(grammarAccess.getHumanAccess().getHumanKeyword_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalHriDsl.g:2099:1: rule__Human__Group__1 : rule__Human__Group__1__Impl rule__Human__Group__2 ;
    public final void rule__Human__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2103:1: ( rule__Human__Group__1__Impl rule__Human__Group__2 )
            // InternalHriDsl.g:2104:2: rule__Human__Group__1__Impl rule__Human__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalHriDsl.g:2111:1: rule__Human__Group__1__Impl : ( ( rule__Human__NameAssignment_1 ) ) ;
    public final void rule__Human__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2115:1: ( ( ( rule__Human__NameAssignment_1 ) ) )
            // InternalHriDsl.g:2116:1: ( ( rule__Human__NameAssignment_1 ) )
            {
            // InternalHriDsl.g:2116:1: ( ( rule__Human__NameAssignment_1 ) )
            // InternalHriDsl.g:2117:2: ( rule__Human__NameAssignment_1 )
            {
             before(grammarAccess.getHumanAccess().getNameAssignment_1()); 
            // InternalHriDsl.g:2118:2: ( rule__Human__NameAssignment_1 )
            // InternalHriDsl.g:2118:3: rule__Human__NameAssignment_1
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
    // InternalHriDsl.g:2126:1: rule__Human__Group__2 : rule__Human__Group__2__Impl rule__Human__Group__3 ;
    public final void rule__Human__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2130:1: ( rule__Human__Group__2__Impl rule__Human__Group__3 )
            // InternalHriDsl.g:2131:2: rule__Human__Group__2__Impl rule__Human__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalHriDsl.g:2138:1: rule__Human__Group__2__Impl : ( 'in' ) ;
    public final void rule__Human__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2142:1: ( ( 'in' ) )
            // InternalHriDsl.g:2143:1: ( 'in' )
            {
            // InternalHriDsl.g:2143:1: ( 'in' )
            // InternalHriDsl.g:2144:2: 'in'
            {
             before(grammarAccess.getHumanAccess().getInKeyword_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalHriDsl.g:2153:1: rule__Human__Group__3 : rule__Human__Group__3__Impl rule__Human__Group__4 ;
    public final void rule__Human__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2157:1: ( rule__Human__Group__3__Impl rule__Human__Group__4 )
            // InternalHriDsl.g:2158:2: rule__Human__Group__3__Impl rule__Human__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalHriDsl.g:2165:1: rule__Human__Group__3__Impl : ( ( rule__Human__CoordinatesAssignment_3 ) ) ;
    public final void rule__Human__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2169:1: ( ( ( rule__Human__CoordinatesAssignment_3 ) ) )
            // InternalHriDsl.g:2170:1: ( ( rule__Human__CoordinatesAssignment_3 ) )
            {
            // InternalHriDsl.g:2170:1: ( ( rule__Human__CoordinatesAssignment_3 ) )
            // InternalHriDsl.g:2171:2: ( rule__Human__CoordinatesAssignment_3 )
            {
             before(grammarAccess.getHumanAccess().getCoordinatesAssignment_3()); 
            // InternalHriDsl.g:2172:2: ( rule__Human__CoordinatesAssignment_3 )
            // InternalHriDsl.g:2172:3: rule__Human__CoordinatesAssignment_3
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
    // InternalHriDsl.g:2180:1: rule__Human__Group__4 : rule__Human__Group__4__Impl rule__Human__Group__5 ;
    public final void rule__Human__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2184:1: ( rule__Human__Group__4__Impl rule__Human__Group__5 )
            // InternalHriDsl.g:2185:2: rule__Human__Group__4__Impl rule__Human__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalHriDsl.g:2192:1: rule__Human__Group__4__Impl : ( 'speed' ) ;
    public final void rule__Human__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2196:1: ( ( 'speed' ) )
            // InternalHriDsl.g:2197:1: ( 'speed' )
            {
            // InternalHriDsl.g:2197:1: ( 'speed' )
            // InternalHriDsl.g:2198:2: 'speed'
            {
             before(grammarAccess.getHumanAccess().getSpeedKeyword_4()); 
            match(input,65,FOLLOW_2); 
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
    // InternalHriDsl.g:2207:1: rule__Human__Group__5 : rule__Human__Group__5__Impl rule__Human__Group__6 ;
    public final void rule__Human__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2211:1: ( rule__Human__Group__5__Impl rule__Human__Group__6 )
            // InternalHriDsl.g:2212:2: rule__Human__Group__5__Impl rule__Human__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalHriDsl.g:2219:1: rule__Human__Group__5__Impl : ( ( rule__Human__SpeedAssignment_5 ) ) ;
    public final void rule__Human__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2223:1: ( ( ( rule__Human__SpeedAssignment_5 ) ) )
            // InternalHriDsl.g:2224:1: ( ( rule__Human__SpeedAssignment_5 ) )
            {
            // InternalHriDsl.g:2224:1: ( ( rule__Human__SpeedAssignment_5 ) )
            // InternalHriDsl.g:2225:2: ( rule__Human__SpeedAssignment_5 )
            {
             before(grammarAccess.getHumanAccess().getSpeedAssignment_5()); 
            // InternalHriDsl.g:2226:2: ( rule__Human__SpeedAssignment_5 )
            // InternalHriDsl.g:2226:3: rule__Human__SpeedAssignment_5
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
    // InternalHriDsl.g:2234:1: rule__Human__Group__6 : rule__Human__Group__6__Impl rule__Human__Group__7 ;
    public final void rule__Human__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2238:1: ( rule__Human__Group__6__Impl rule__Human__Group__7 )
            // InternalHriDsl.g:2239:2: rule__Human__Group__6__Impl rule__Human__Group__7
            {
            pushFollow(FOLLOW_30);
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
    // InternalHriDsl.g:2246:1: rule__Human__Group__6__Impl : ( 'dexterity' ) ;
    public final void rule__Human__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2250:1: ( ( 'dexterity' ) )
            // InternalHriDsl.g:2251:1: ( 'dexterity' )
            {
            // InternalHriDsl.g:2251:1: ( 'dexterity' )
            // InternalHriDsl.g:2252:2: 'dexterity'
            {
             before(grammarAccess.getHumanAccess().getDexterityKeyword_6()); 
            match(input,66,FOLLOW_2); 
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
    // InternalHriDsl.g:2261:1: rule__Human__Group__7 : rule__Human__Group__7__Impl rule__Human__Group__8 ;
    public final void rule__Human__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2265:1: ( rule__Human__Group__7__Impl rule__Human__Group__8 )
            // InternalHriDsl.g:2266:2: rule__Human__Group__7__Impl rule__Human__Group__8
            {
            pushFollow(FOLLOW_31);
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
    // InternalHriDsl.g:2273:1: rule__Human__Group__7__Impl : ( ( rule__Human__DextAssignment_7 ) ) ;
    public final void rule__Human__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2277:1: ( ( ( rule__Human__DextAssignment_7 ) ) )
            // InternalHriDsl.g:2278:1: ( ( rule__Human__DextAssignment_7 ) )
            {
            // InternalHriDsl.g:2278:1: ( ( rule__Human__DextAssignment_7 ) )
            // InternalHriDsl.g:2279:2: ( rule__Human__DextAssignment_7 )
            {
             before(grammarAccess.getHumanAccess().getDextAssignment_7()); 
            // InternalHriDsl.g:2280:2: ( rule__Human__DextAssignment_7 )
            // InternalHriDsl.g:2280:3: rule__Human__DextAssignment_7
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
    // InternalHriDsl.g:2288:1: rule__Human__Group__8 : rule__Human__Group__8__Impl rule__Human__Group__9 ;
    public final void rule__Human__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2292:1: ( rule__Human__Group__8__Impl rule__Human__Group__9 )
            // InternalHriDsl.g:2293:2: rule__Human__Group__8__Impl rule__Human__Group__9
            {
            pushFollow(FOLLOW_32);
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
    // InternalHriDsl.g:2300:1: rule__Human__Group__8__Impl : ( 'is' ) ;
    public final void rule__Human__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2304:1: ( ( 'is' ) )
            // InternalHriDsl.g:2305:1: ( 'is' )
            {
            // InternalHriDsl.g:2305:1: ( 'is' )
            // InternalHriDsl.g:2306:2: 'is'
            {
             before(grammarAccess.getHumanAccess().getIsKeyword_8()); 
            match(input,67,FOLLOW_2); 
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
    // InternalHriDsl.g:2315:1: rule__Human__Group__9 : rule__Human__Group__9__Impl rule__Human__Group__10 ;
    public final void rule__Human__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2319:1: ( rule__Human__Group__9__Impl rule__Human__Group__10 )
            // InternalHriDsl.g:2320:2: rule__Human__Group__9__Impl rule__Human__Group__10
            {
            pushFollow(FOLLOW_33);
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
    // InternalHriDsl.g:2327:1: rule__Human__Group__9__Impl : ( ( rule__Human__Fatigue_profileAssignment_9 ) ) ;
    public final void rule__Human__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2331:1: ( ( ( rule__Human__Fatigue_profileAssignment_9 ) ) )
            // InternalHriDsl.g:2332:1: ( ( rule__Human__Fatigue_profileAssignment_9 ) )
            {
            // InternalHriDsl.g:2332:1: ( ( rule__Human__Fatigue_profileAssignment_9 ) )
            // InternalHriDsl.g:2333:2: ( rule__Human__Fatigue_profileAssignment_9 )
            {
             before(grammarAccess.getHumanAccess().getFatigue_profileAssignment_9()); 
            // InternalHriDsl.g:2334:2: ( rule__Human__Fatigue_profileAssignment_9 )
            // InternalHriDsl.g:2334:3: rule__Human__Fatigue_profileAssignment_9
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
    // InternalHriDsl.g:2342:1: rule__Human__Group__10 : rule__Human__Group__10__Impl rule__Human__Group__11 ;
    public final void rule__Human__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2346:1: ( rule__Human__Group__10__Impl rule__Human__Group__11 )
            // InternalHriDsl.g:2347:2: rule__Human__Group__10__Impl rule__Human__Group__11
            {
            pushFollow(FOLLOW_34);
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
    // InternalHriDsl.g:2354:1: rule__Human__Group__10__Impl : ( 'freewill' ) ;
    public final void rule__Human__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2358:1: ( ( 'freewill' ) )
            // InternalHriDsl.g:2359:1: ( 'freewill' )
            {
            // InternalHriDsl.g:2359:1: ( 'freewill' )
            // InternalHriDsl.g:2360:2: 'freewill'
            {
             before(grammarAccess.getHumanAccess().getFreewillKeyword_10()); 
            match(input,68,FOLLOW_2); 
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
    // InternalHriDsl.g:2369:1: rule__Human__Group__11 : rule__Human__Group__11__Impl ;
    public final void rule__Human__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2373:1: ( rule__Human__Group__11__Impl )
            // InternalHriDsl.g:2374:2: rule__Human__Group__11__Impl
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
    // InternalHriDsl.g:2380:1: rule__Human__Group__11__Impl : ( ( rule__Human__Free_will_profileAssignment_11 ) ) ;
    public final void rule__Human__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2384:1: ( ( ( rule__Human__Free_will_profileAssignment_11 ) ) )
            // InternalHriDsl.g:2385:1: ( ( rule__Human__Free_will_profileAssignment_11 ) )
            {
            // InternalHriDsl.g:2385:1: ( ( rule__Human__Free_will_profileAssignment_11 ) )
            // InternalHriDsl.g:2386:2: ( rule__Human__Free_will_profileAssignment_11 )
            {
             before(grammarAccess.getHumanAccess().getFree_will_profileAssignment_11()); 
            // InternalHriDsl.g:2387:2: ( rule__Human__Free_will_profileAssignment_11 )
            // InternalHriDsl.g:2387:3: rule__Human__Free_will_profileAssignment_11
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
    // InternalHriDsl.g:2396:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2400:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalHriDsl.g:2401:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalHriDsl.g:2408:1: rule__Mission__Group__0__Impl : ( 'define' ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2412:1: ( ( 'define' ) )
            // InternalHriDsl.g:2413:1: ( 'define' )
            {
            // InternalHriDsl.g:2413:1: ( 'define' )
            // InternalHriDsl.g:2414:2: 'define'
            {
             before(grammarAccess.getMissionAccess().getDefineKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalHriDsl.g:2423:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl rule__Mission__Group__2 ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2427:1: ( rule__Mission__Group__1__Impl rule__Mission__Group__2 )
            // InternalHriDsl.g:2428:2: rule__Mission__Group__1__Impl rule__Mission__Group__2
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
    // InternalHriDsl.g:2435:1: rule__Mission__Group__1__Impl : ( 'mission' ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2439:1: ( ( 'mission' ) )
            // InternalHriDsl.g:2440:1: ( 'mission' )
            {
            // InternalHriDsl.g:2440:1: ( 'mission' )
            // InternalHriDsl.g:2441:2: 'mission'
            {
             before(grammarAccess.getMissionAccess().getMissionKeyword_1()); 
            match(input,69,FOLLOW_2); 
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
    // InternalHriDsl.g:2450:1: rule__Mission__Group__2 : rule__Mission__Group__2__Impl rule__Mission__Group__3 ;
    public final void rule__Mission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2454:1: ( rule__Mission__Group__2__Impl rule__Mission__Group__3 )
            // InternalHriDsl.g:2455:2: rule__Mission__Group__2__Impl rule__Mission__Group__3
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
    // InternalHriDsl.g:2462:1: rule__Mission__Group__2__Impl : ( ( rule__Mission__NameAssignment_2 ) ) ;
    public final void rule__Mission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2466:1: ( ( ( rule__Mission__NameAssignment_2 ) ) )
            // InternalHriDsl.g:2467:1: ( ( rule__Mission__NameAssignment_2 ) )
            {
            // InternalHriDsl.g:2467:1: ( ( rule__Mission__NameAssignment_2 ) )
            // InternalHriDsl.g:2468:2: ( rule__Mission__NameAssignment_2 )
            {
             before(grammarAccess.getMissionAccess().getNameAssignment_2()); 
            // InternalHriDsl.g:2469:2: ( rule__Mission__NameAssignment_2 )
            // InternalHriDsl.g:2469:3: rule__Mission__NameAssignment_2
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
    // InternalHriDsl.g:2477:1: rule__Mission__Group__3 : rule__Mission__Group__3__Impl rule__Mission__Group__4 ;
    public final void rule__Mission__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2481:1: ( rule__Mission__Group__3__Impl rule__Mission__Group__4 )
            // InternalHriDsl.g:2482:2: rule__Mission__Group__3__Impl rule__Mission__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalHriDsl.g:2489:1: rule__Mission__Group__3__Impl : ( ':' ) ;
    public final void rule__Mission__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2493:1: ( ( ':' ) )
            // InternalHriDsl.g:2494:1: ( ':' )
            {
            // InternalHriDsl.g:2494:1: ( ':' )
            // InternalHriDsl.g:2495:2: ':'
            {
             before(grammarAccess.getMissionAccess().getColonKeyword_3()); 
            match(input,55,FOLLOW_2); 
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
    // InternalHriDsl.g:2504:1: rule__Mission__Group__4 : rule__Mission__Group__4__Impl rule__Mission__Group__5 ;
    public final void rule__Mission__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2508:1: ( rule__Mission__Group__4__Impl rule__Mission__Group__5 )
            // InternalHriDsl.g:2509:2: rule__Mission__Group__4__Impl rule__Mission__Group__5
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
    // InternalHriDsl.g:2516:1: rule__Mission__Group__4__Impl : ( ( ( rule__Mission__AssignmentsAssignment_4 ) ) ( ( rule__Mission__AssignmentsAssignment_4 )* ) ) ;
    public final void rule__Mission__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2520:1: ( ( ( ( rule__Mission__AssignmentsAssignment_4 ) ) ( ( rule__Mission__AssignmentsAssignment_4 )* ) ) )
            // InternalHriDsl.g:2521:1: ( ( ( rule__Mission__AssignmentsAssignment_4 ) ) ( ( rule__Mission__AssignmentsAssignment_4 )* ) )
            {
            // InternalHriDsl.g:2521:1: ( ( ( rule__Mission__AssignmentsAssignment_4 ) ) ( ( rule__Mission__AssignmentsAssignment_4 )* ) )
            // InternalHriDsl.g:2522:2: ( ( rule__Mission__AssignmentsAssignment_4 ) ) ( ( rule__Mission__AssignmentsAssignment_4 )* )
            {
            // InternalHriDsl.g:2522:2: ( ( rule__Mission__AssignmentsAssignment_4 ) )
            // InternalHriDsl.g:2523:3: ( rule__Mission__AssignmentsAssignment_4 )
            {
             before(grammarAccess.getMissionAccess().getAssignmentsAssignment_4()); 
            // InternalHriDsl.g:2524:3: ( rule__Mission__AssignmentsAssignment_4 )
            // InternalHriDsl.g:2524:4: rule__Mission__AssignmentsAssignment_4
            {
            pushFollow(FOLLOW_37);
            rule__Mission__AssignmentsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getAssignmentsAssignment_4()); 

            }

            // InternalHriDsl.g:2527:2: ( ( rule__Mission__AssignmentsAssignment_4 )* )
            // InternalHriDsl.g:2528:3: ( rule__Mission__AssignmentsAssignment_4 )*
            {
             before(grammarAccess.getMissionAccess().getAssignmentsAssignment_4()); 
            // InternalHriDsl.g:2529:3: ( rule__Mission__AssignmentsAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==70) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalHriDsl.g:2529:4: rule__Mission__AssignmentsAssignment_4
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Mission__AssignmentsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalHriDsl.g:2538:1: rule__Mission__Group__5 : rule__Mission__Group__5__Impl ;
    public final void rule__Mission__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2542:1: ( rule__Mission__Group__5__Impl )
            // InternalHriDsl.g:2543:2: rule__Mission__Group__5__Impl
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
    // InternalHriDsl.g:2549:1: rule__Mission__Group__5__Impl : ( ( rule__Mission__QueriesAssignment_5 ) ) ;
    public final void rule__Mission__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2553:1: ( ( ( rule__Mission__QueriesAssignment_5 ) ) )
            // InternalHriDsl.g:2554:1: ( ( rule__Mission__QueriesAssignment_5 ) )
            {
            // InternalHriDsl.g:2554:1: ( ( rule__Mission__QueriesAssignment_5 ) )
            // InternalHriDsl.g:2555:2: ( rule__Mission__QueriesAssignment_5 )
            {
             before(grammarAccess.getMissionAccess().getQueriesAssignment_5()); 
            // InternalHriDsl.g:2556:2: ( rule__Mission__QueriesAssignment_5 )
            // InternalHriDsl.g:2556:3: rule__Mission__QueriesAssignment_5
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
    // InternalHriDsl.g:2565:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2569:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalHriDsl.g:2570:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalHriDsl.g:2577:1: rule__Assignment__Group__0__Impl : ( 'do' ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2581:1: ( ( 'do' ) )
            // InternalHriDsl.g:2582:1: ( 'do' )
            {
            // InternalHriDsl.g:2582:1: ( 'do' )
            // InternalHriDsl.g:2583:2: 'do'
            {
             before(grammarAccess.getAssignmentAccess().getDoKeyword_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalHriDsl.g:2592:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2596:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalHriDsl.g:2597:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalHriDsl.g:2604:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__PatternAssignment_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2608:1: ( ( ( rule__Assignment__PatternAssignment_1 ) ) )
            // InternalHriDsl.g:2609:1: ( ( rule__Assignment__PatternAssignment_1 ) )
            {
            // InternalHriDsl.g:2609:1: ( ( rule__Assignment__PatternAssignment_1 ) )
            // InternalHriDsl.g:2610:2: ( rule__Assignment__PatternAssignment_1 )
            {
             before(grammarAccess.getAssignmentAccess().getPatternAssignment_1()); 
            // InternalHriDsl.g:2611:2: ( rule__Assignment__PatternAssignment_1 )
            // InternalHriDsl.g:2611:3: rule__Assignment__PatternAssignment_1
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
    // InternalHriDsl.g:2619:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2623:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // InternalHriDsl.g:2624:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
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
    // InternalHriDsl.g:2631:1: rule__Assignment__Group__2__Impl : ( 'for' ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2635:1: ( ( 'for' ) )
            // InternalHriDsl.g:2636:1: ( 'for' )
            {
            // InternalHriDsl.g:2636:1: ( 'for' )
            // InternalHriDsl.g:2637:2: 'for'
            {
             before(grammarAccess.getAssignmentAccess().getForKeyword_2()); 
            match(input,71,FOLLOW_2); 
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
    // InternalHriDsl.g:2646:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl rule__Assignment__Group__4 ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2650:1: ( rule__Assignment__Group__3__Impl rule__Assignment__Group__4 )
            // InternalHriDsl.g:2651:2: rule__Assignment__Group__3__Impl rule__Assignment__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalHriDsl.g:2658:1: rule__Assignment__Group__3__Impl : ( ( rule__Assignment__ClientAssignment_3 ) ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2662:1: ( ( ( rule__Assignment__ClientAssignment_3 ) ) )
            // InternalHriDsl.g:2663:1: ( ( rule__Assignment__ClientAssignment_3 ) )
            {
            // InternalHriDsl.g:2663:1: ( ( rule__Assignment__ClientAssignment_3 ) )
            // InternalHriDsl.g:2664:2: ( rule__Assignment__ClientAssignment_3 )
            {
             before(grammarAccess.getAssignmentAccess().getClientAssignment_3()); 
            // InternalHriDsl.g:2665:2: ( rule__Assignment__ClientAssignment_3 )
            // InternalHriDsl.g:2665:3: rule__Assignment__ClientAssignment_3
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
    // InternalHriDsl.g:2673:1: rule__Assignment__Group__4 : rule__Assignment__Group__4__Impl rule__Assignment__Group__5 ;
    public final void rule__Assignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2677:1: ( rule__Assignment__Group__4__Impl rule__Assignment__Group__5 )
            // InternalHriDsl.g:2678:2: rule__Assignment__Group__4__Impl rule__Assignment__Group__5
            {
            pushFollow(FOLLOW_41);
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
    // InternalHriDsl.g:2685:1: rule__Assignment__Group__4__Impl : ( 'with' ) ;
    public final void rule__Assignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2689:1: ( ( 'with' ) )
            // InternalHriDsl.g:2690:1: ( 'with' )
            {
            // InternalHriDsl.g:2690:1: ( 'with' )
            // InternalHriDsl.g:2691:2: 'with'
            {
             before(grammarAccess.getAssignmentAccess().getWithKeyword_4()); 
            match(input,72,FOLLOW_2); 
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
    // InternalHriDsl.g:2700:1: rule__Assignment__Group__5 : rule__Assignment__Group__5__Impl rule__Assignment__Group__6 ;
    public final void rule__Assignment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2704:1: ( rule__Assignment__Group__5__Impl rule__Assignment__Group__6 )
            // InternalHriDsl.g:2705:2: rule__Assignment__Group__5__Impl rule__Assignment__Group__6
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
    // InternalHriDsl.g:2712:1: rule__Assignment__Group__5__Impl : ( 'target' ) ;
    public final void rule__Assignment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2716:1: ( ( 'target' ) )
            // InternalHriDsl.g:2717:1: ( 'target' )
            {
            // InternalHriDsl.g:2717:1: ( 'target' )
            // InternalHriDsl.g:2718:2: 'target'
            {
             before(grammarAccess.getAssignmentAccess().getTargetKeyword_5()); 
            match(input,73,FOLLOW_2); 
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
    // InternalHriDsl.g:2727:1: rule__Assignment__Group__6 : rule__Assignment__Group__6__Impl ;
    public final void rule__Assignment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2731:1: ( rule__Assignment__Group__6__Impl )
            // InternalHriDsl.g:2732:2: rule__Assignment__Group__6__Impl
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
    // InternalHriDsl.g:2738:1: rule__Assignment__Group__6__Impl : ( ( rule__Assignment__TargetAssignment_6 ) ) ;
    public final void rule__Assignment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2742:1: ( ( ( rule__Assignment__TargetAssignment_6 ) ) )
            // InternalHriDsl.g:2743:1: ( ( rule__Assignment__TargetAssignment_6 ) )
            {
            // InternalHriDsl.g:2743:1: ( ( rule__Assignment__TargetAssignment_6 ) )
            // InternalHriDsl.g:2744:2: ( rule__Assignment__TargetAssignment_6 )
            {
             before(grammarAccess.getAssignmentAccess().getTargetAssignment_6()); 
            // InternalHriDsl.g:2745:2: ( rule__Assignment__TargetAssignment_6 )
            // InternalHriDsl.g:2745:3: rule__Assignment__TargetAssignment_6
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
    // InternalHriDsl.g:2754:1: rule__Queries__Group__0 : rule__Queries__Group__0__Impl rule__Queries__Group__1 ;
    public final void rule__Queries__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2758:1: ( rule__Queries__Group__0__Impl rule__Queries__Group__1 )
            // InternalHriDsl.g:2759:2: rule__Queries__Group__0__Impl rule__Queries__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalHriDsl.g:2766:1: rule__Queries__Group__0__Impl : ( 'define' ) ;
    public final void rule__Queries__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2770:1: ( ( 'define' ) )
            // InternalHriDsl.g:2771:1: ( 'define' )
            {
            // InternalHriDsl.g:2771:1: ( 'define' )
            // InternalHriDsl.g:2772:2: 'define'
            {
             before(grammarAccess.getQueriesAccess().getDefineKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalHriDsl.g:2781:1: rule__Queries__Group__1 : rule__Queries__Group__1__Impl rule__Queries__Group__2 ;
    public final void rule__Queries__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2785:1: ( rule__Queries__Group__1__Impl rule__Queries__Group__2 )
            // InternalHriDsl.g:2786:2: rule__Queries__Group__1__Impl rule__Queries__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalHriDsl.g:2793:1: rule__Queries__Group__1__Impl : ( 'queries' ) ;
    public final void rule__Queries__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2797:1: ( ( 'queries' ) )
            // InternalHriDsl.g:2798:1: ( 'queries' )
            {
            // InternalHriDsl.g:2798:1: ( 'queries' )
            // InternalHriDsl.g:2799:2: 'queries'
            {
             before(grammarAccess.getQueriesAccess().getQueriesKeyword_1()); 
            match(input,74,FOLLOW_2); 
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
    // InternalHriDsl.g:2808:1: rule__Queries__Group__2 : rule__Queries__Group__2__Impl rule__Queries__Group__3 ;
    public final void rule__Queries__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2812:1: ( rule__Queries__Group__2__Impl rule__Queries__Group__3 )
            // InternalHriDsl.g:2813:2: rule__Queries__Group__2__Impl rule__Queries__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalHriDsl.g:2820:1: rule__Queries__Group__2__Impl : ( 'of' ) ;
    public final void rule__Queries__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2824:1: ( ( 'of' ) )
            // InternalHriDsl.g:2825:1: ( 'of' )
            {
            // InternalHriDsl.g:2825:1: ( 'of' )
            // InternalHriDsl.g:2826:2: 'of'
            {
             before(grammarAccess.getQueriesAccess().getOfKeyword_2()); 
            match(input,75,FOLLOW_2); 
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
    // InternalHriDsl.g:2835:1: rule__Queries__Group__3 : rule__Queries__Group__3__Impl rule__Queries__Group__4 ;
    public final void rule__Queries__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2839:1: ( rule__Queries__Group__3__Impl rule__Queries__Group__4 )
            // InternalHriDsl.g:2840:2: rule__Queries__Group__3__Impl rule__Queries__Group__4
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
    // InternalHriDsl.g:2847:1: rule__Queries__Group__3__Impl : ( 'mission' ) ;
    public final void rule__Queries__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2851:1: ( ( 'mission' ) )
            // InternalHriDsl.g:2852:1: ( 'mission' )
            {
            // InternalHriDsl.g:2852:1: ( 'mission' )
            // InternalHriDsl.g:2853:2: 'mission'
            {
             before(grammarAccess.getQueriesAccess().getMissionKeyword_3()); 
            match(input,69,FOLLOW_2); 
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
    // InternalHriDsl.g:2862:1: rule__Queries__Group__4 : rule__Queries__Group__4__Impl rule__Queries__Group__5 ;
    public final void rule__Queries__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2866:1: ( rule__Queries__Group__4__Impl rule__Queries__Group__5 )
            // InternalHriDsl.g:2867:2: rule__Queries__Group__4__Impl rule__Queries__Group__5
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
    // InternalHriDsl.g:2874:1: rule__Queries__Group__4__Impl : ( ( rule__Queries__MissionAssignment_4 ) ) ;
    public final void rule__Queries__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2878:1: ( ( ( rule__Queries__MissionAssignment_4 ) ) )
            // InternalHriDsl.g:2879:1: ( ( rule__Queries__MissionAssignment_4 ) )
            {
            // InternalHriDsl.g:2879:1: ( ( rule__Queries__MissionAssignment_4 ) )
            // InternalHriDsl.g:2880:2: ( rule__Queries__MissionAssignment_4 )
            {
             before(grammarAccess.getQueriesAccess().getMissionAssignment_4()); 
            // InternalHriDsl.g:2881:2: ( rule__Queries__MissionAssignment_4 )
            // InternalHriDsl.g:2881:3: rule__Queries__MissionAssignment_4
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
    // InternalHriDsl.g:2889:1: rule__Queries__Group__5 : rule__Queries__Group__5__Impl rule__Queries__Group__6 ;
    public final void rule__Queries__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2893:1: ( rule__Queries__Group__5__Impl rule__Queries__Group__6 )
            // InternalHriDsl.g:2894:2: rule__Queries__Group__5__Impl rule__Queries__Group__6
            {
            pushFollow(FOLLOW_44);
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
    // InternalHriDsl.g:2901:1: rule__Queries__Group__5__Impl : ( ':' ) ;
    public final void rule__Queries__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2905:1: ( ( ':' ) )
            // InternalHriDsl.g:2906:1: ( ':' )
            {
            // InternalHriDsl.g:2906:1: ( ':' )
            // InternalHriDsl.g:2907:2: ':'
            {
             before(grammarAccess.getQueriesAccess().getColonKeyword_5()); 
            match(input,55,FOLLOW_2); 
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
    // InternalHriDsl.g:2916:1: rule__Queries__Group__6 : rule__Queries__Group__6__Impl ;
    public final void rule__Queries__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2920:1: ( rule__Queries__Group__6__Impl )
            // InternalHriDsl.g:2921:2: rule__Queries__Group__6__Impl
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
    // InternalHriDsl.g:2927:1: rule__Queries__Group__6__Impl : ( ( ( rule__Queries__QueriesAssignment_6 ) ) ( ( rule__Queries__QueriesAssignment_6 )* ) ) ;
    public final void rule__Queries__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2931:1: ( ( ( ( rule__Queries__QueriesAssignment_6 ) ) ( ( rule__Queries__QueriesAssignment_6 )* ) ) )
            // InternalHriDsl.g:2932:1: ( ( ( rule__Queries__QueriesAssignment_6 ) ) ( ( rule__Queries__QueriesAssignment_6 )* ) )
            {
            // InternalHriDsl.g:2932:1: ( ( ( rule__Queries__QueriesAssignment_6 ) ) ( ( rule__Queries__QueriesAssignment_6 )* ) )
            // InternalHriDsl.g:2933:2: ( ( rule__Queries__QueriesAssignment_6 ) ) ( ( rule__Queries__QueriesAssignment_6 )* )
            {
            // InternalHriDsl.g:2933:2: ( ( rule__Queries__QueriesAssignment_6 ) )
            // InternalHriDsl.g:2934:3: ( rule__Queries__QueriesAssignment_6 )
            {
             before(grammarAccess.getQueriesAccess().getQueriesAssignment_6()); 
            // InternalHriDsl.g:2935:3: ( rule__Queries__QueriesAssignment_6 )
            // InternalHriDsl.g:2935:4: rule__Queries__QueriesAssignment_6
            {
            pushFollow(FOLLOW_45);
            rule__Queries__QueriesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getQueriesAccess().getQueriesAssignment_6()); 

            }

            // InternalHriDsl.g:2938:2: ( ( rule__Queries__QueriesAssignment_6 )* )
            // InternalHriDsl.g:2939:3: ( rule__Queries__QueriesAssignment_6 )*
            {
             before(grammarAccess.getQueriesAccess().getQueriesAssignment_6()); 
            // InternalHriDsl.g:2940:3: ( rule__Queries__QueriesAssignment_6 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==76) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalHriDsl.g:2940:4: rule__Queries__QueriesAssignment_6
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__Queries__QueriesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalHriDsl.g:2950:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2954:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalHriDsl.g:2955:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalHriDsl.g:2962:1: rule__Query__Group__0__Impl : ( 'compute' ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2966:1: ( ( 'compute' ) )
            // InternalHriDsl.g:2967:1: ( 'compute' )
            {
            // InternalHriDsl.g:2967:1: ( 'compute' )
            // InternalHriDsl.g:2968:2: 'compute'
            {
             before(grammarAccess.getQueryAccess().getComputeKeyword_0()); 
            match(input,76,FOLLOW_2); 
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
    // InternalHriDsl.g:2977:1: rule__Query__Group__1 : rule__Query__Group__1__Impl rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2981:1: ( rule__Query__Group__1__Impl rule__Query__Group__2 )
            // InternalHriDsl.g:2982:2: rule__Query__Group__1__Impl rule__Query__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalHriDsl.g:2989:1: rule__Query__Group__1__Impl : ( ( rule__Query__Query_typeAssignment_1 ) ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2993:1: ( ( ( rule__Query__Query_typeAssignment_1 ) ) )
            // InternalHriDsl.g:2994:1: ( ( rule__Query__Query_typeAssignment_1 ) )
            {
            // InternalHriDsl.g:2994:1: ( ( rule__Query__Query_typeAssignment_1 ) )
            // InternalHriDsl.g:2995:2: ( rule__Query__Query_typeAssignment_1 )
            {
             before(grammarAccess.getQueryAccess().getQuery_typeAssignment_1()); 
            // InternalHriDsl.g:2996:2: ( rule__Query__Query_typeAssignment_1 )
            // InternalHriDsl.g:2996:3: rule__Query__Query_typeAssignment_1
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
    // InternalHriDsl.g:3004:1: rule__Query__Group__2 : rule__Query__Group__2__Impl rule__Query__Group__3 ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3008:1: ( rule__Query__Group__2__Impl rule__Query__Group__3 )
            // InternalHriDsl.g:3009:2: rule__Query__Group__2__Impl rule__Query__Group__3
            {
            pushFollow(FOLLOW_47);
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
    // InternalHriDsl.g:3016:1: rule__Query__Group__2__Impl : ( 'with' ) ;
    public final void rule__Query__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3020:1: ( ( 'with' ) )
            // InternalHriDsl.g:3021:1: ( 'with' )
            {
            // InternalHriDsl.g:3021:1: ( 'with' )
            // InternalHriDsl.g:3022:2: 'with'
            {
             before(grammarAccess.getQueryAccess().getWithKeyword_2()); 
            match(input,72,FOLLOW_2); 
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
    // InternalHriDsl.g:3031:1: rule__Query__Group__3 : rule__Query__Group__3__Impl rule__Query__Group__4 ;
    public final void rule__Query__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3035:1: ( rule__Query__Group__3__Impl rule__Query__Group__4 )
            // InternalHriDsl.g:3036:2: rule__Query__Group__3__Impl rule__Query__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalHriDsl.g:3043:1: rule__Query__Group__3__Impl : ( 'duration' ) ;
    public final void rule__Query__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3047:1: ( ( 'duration' ) )
            // InternalHriDsl.g:3048:1: ( 'duration' )
            {
            // InternalHriDsl.g:3048:1: ( 'duration' )
            // InternalHriDsl.g:3049:2: 'duration'
            {
             before(grammarAccess.getQueryAccess().getDurationKeyword_3()); 
            match(input,77,FOLLOW_2); 
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
    // InternalHriDsl.g:3058:1: rule__Query__Group__4 : rule__Query__Group__4__Impl rule__Query__Group__5 ;
    public final void rule__Query__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3062:1: ( rule__Query__Group__4__Impl rule__Query__Group__5 )
            // InternalHriDsl.g:3063:2: rule__Query__Group__4__Impl rule__Query__Group__5
            {
            pushFollow(FOLLOW_48);
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
    // InternalHriDsl.g:3070:1: rule__Query__Group__4__Impl : ( ( rule__Query__DurationAssignment_4 ) ) ;
    public final void rule__Query__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3074:1: ( ( ( rule__Query__DurationAssignment_4 ) ) )
            // InternalHriDsl.g:3075:1: ( ( rule__Query__DurationAssignment_4 ) )
            {
            // InternalHriDsl.g:3075:1: ( ( rule__Query__DurationAssignment_4 ) )
            // InternalHriDsl.g:3076:2: ( rule__Query__DurationAssignment_4 )
            {
             before(grammarAccess.getQueryAccess().getDurationAssignment_4()); 
            // InternalHriDsl.g:3077:2: ( rule__Query__DurationAssignment_4 )
            // InternalHriDsl.g:3077:3: rule__Query__DurationAssignment_4
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
    // InternalHriDsl.g:3085:1: rule__Query__Group__5 : rule__Query__Group__5__Impl rule__Query__Group__6 ;
    public final void rule__Query__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3089:1: ( rule__Query__Group__5__Impl rule__Query__Group__6 )
            // InternalHriDsl.g:3090:2: rule__Query__Group__5__Impl rule__Query__Group__6
            {
            pushFollow(FOLLOW_49);
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
    // InternalHriDsl.g:3097:1: rule__Query__Group__5__Impl : ( 'runs' ) ;
    public final void rule__Query__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3101:1: ( ( 'runs' ) )
            // InternalHriDsl.g:3102:1: ( 'runs' )
            {
            // InternalHriDsl.g:3102:1: ( 'runs' )
            // InternalHriDsl.g:3103:2: 'runs'
            {
             before(grammarAccess.getQueryAccess().getRunsKeyword_5()); 
            match(input,78,FOLLOW_2); 
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
    // InternalHriDsl.g:3112:1: rule__Query__Group__6 : rule__Query__Group__6__Impl ;
    public final void rule__Query__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3116:1: ( rule__Query__Group__6__Impl )
            // InternalHriDsl.g:3117:2: rule__Query__Group__6__Impl
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
    // InternalHriDsl.g:3123:1: rule__Query__Group__6__Impl : ( ( rule__Query__RunsAssignment_6 ) ) ;
    public final void rule__Query__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3127:1: ( ( ( rule__Query__RunsAssignment_6 ) ) )
            // InternalHriDsl.g:3128:1: ( ( rule__Query__RunsAssignment_6 ) )
            {
            // InternalHriDsl.g:3128:1: ( ( rule__Query__RunsAssignment_6 ) )
            // InternalHriDsl.g:3129:2: ( rule__Query__RunsAssignment_6 )
            {
             before(grammarAccess.getQueryAccess().getRunsAssignment_6()); 
            // InternalHriDsl.g:3130:2: ( rule__Query__RunsAssignment_6 )
            // InternalHriDsl.g:3130:3: rule__Query__RunsAssignment_6
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
    // InternalHriDsl.g:3139:1: rule__Coordinates__Group__0 : rule__Coordinates__Group__0__Impl rule__Coordinates__Group__1 ;
    public final void rule__Coordinates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3143:1: ( rule__Coordinates__Group__0__Impl rule__Coordinates__Group__1 )
            // InternalHriDsl.g:3144:2: rule__Coordinates__Group__0__Impl rule__Coordinates__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalHriDsl.g:3151:1: rule__Coordinates__Group__0__Impl : ( '(' ) ;
    public final void rule__Coordinates__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3155:1: ( ( '(' ) )
            // InternalHriDsl.g:3156:1: ( '(' )
            {
            // InternalHriDsl.g:3156:1: ( '(' )
            // InternalHriDsl.g:3157:2: '('
            {
             before(grammarAccess.getCoordinatesAccess().getLeftParenthesisKeyword_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalHriDsl.g:3166:1: rule__Coordinates__Group__1 : rule__Coordinates__Group__1__Impl rule__Coordinates__Group__2 ;
    public final void rule__Coordinates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3170:1: ( rule__Coordinates__Group__1__Impl rule__Coordinates__Group__2 )
            // InternalHriDsl.g:3171:2: rule__Coordinates__Group__1__Impl rule__Coordinates__Group__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalHriDsl.g:3178:1: rule__Coordinates__Group__1__Impl : ( ( rule__Coordinates__XAssignment_1 ) ) ;
    public final void rule__Coordinates__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3182:1: ( ( ( rule__Coordinates__XAssignment_1 ) ) )
            // InternalHriDsl.g:3183:1: ( ( rule__Coordinates__XAssignment_1 ) )
            {
            // InternalHriDsl.g:3183:1: ( ( rule__Coordinates__XAssignment_1 ) )
            // InternalHriDsl.g:3184:2: ( rule__Coordinates__XAssignment_1 )
            {
             before(grammarAccess.getCoordinatesAccess().getXAssignment_1()); 
            // InternalHriDsl.g:3185:2: ( rule__Coordinates__XAssignment_1 )
            // InternalHriDsl.g:3185:3: rule__Coordinates__XAssignment_1
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
    // InternalHriDsl.g:3193:1: rule__Coordinates__Group__2 : rule__Coordinates__Group__2__Impl rule__Coordinates__Group__3 ;
    public final void rule__Coordinates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3197:1: ( rule__Coordinates__Group__2__Impl rule__Coordinates__Group__3 )
            // InternalHriDsl.g:3198:2: rule__Coordinates__Group__2__Impl rule__Coordinates__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalHriDsl.g:3205:1: rule__Coordinates__Group__2__Impl : ( ',' ) ;
    public final void rule__Coordinates__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3209:1: ( ( ',' ) )
            // InternalHriDsl.g:3210:1: ( ',' )
            {
            // InternalHriDsl.g:3210:1: ( ',' )
            // InternalHriDsl.g:3211:2: ','
            {
             before(grammarAccess.getCoordinatesAccess().getCommaKeyword_2()); 
            match(input,80,FOLLOW_2); 
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
    // InternalHriDsl.g:3220:1: rule__Coordinates__Group__3 : rule__Coordinates__Group__3__Impl rule__Coordinates__Group__4 ;
    public final void rule__Coordinates__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3224:1: ( rule__Coordinates__Group__3__Impl rule__Coordinates__Group__4 )
            // InternalHriDsl.g:3225:2: rule__Coordinates__Group__3__Impl rule__Coordinates__Group__4
            {
            pushFollow(FOLLOW_51);
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
    // InternalHriDsl.g:3232:1: rule__Coordinates__Group__3__Impl : ( ( rule__Coordinates__YAssignment_3 ) ) ;
    public final void rule__Coordinates__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3236:1: ( ( ( rule__Coordinates__YAssignment_3 ) ) )
            // InternalHriDsl.g:3237:1: ( ( rule__Coordinates__YAssignment_3 ) )
            {
            // InternalHriDsl.g:3237:1: ( ( rule__Coordinates__YAssignment_3 ) )
            // InternalHriDsl.g:3238:2: ( rule__Coordinates__YAssignment_3 )
            {
             before(grammarAccess.getCoordinatesAccess().getYAssignment_3()); 
            // InternalHriDsl.g:3239:2: ( rule__Coordinates__YAssignment_3 )
            // InternalHriDsl.g:3239:3: rule__Coordinates__YAssignment_3
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
    // InternalHriDsl.g:3247:1: rule__Coordinates__Group__4 : rule__Coordinates__Group__4__Impl ;
    public final void rule__Coordinates__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3251:1: ( rule__Coordinates__Group__4__Impl )
            // InternalHriDsl.g:3252:2: rule__Coordinates__Group__4__Impl
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
    // InternalHriDsl.g:3258:1: rule__Coordinates__Group__4__Impl : ( ')' ) ;
    public final void rule__Coordinates__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3262:1: ( ( ')' ) )
            // InternalHriDsl.g:3263:1: ( ')' )
            {
            // InternalHriDsl.g:3263:1: ( ')' )
            // InternalHriDsl.g:3264:2: ')'
            {
             before(grammarAccess.getCoordinatesAccess().getRightParenthesisKeyword_4()); 
            match(input,81,FOLLOW_2); 
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


    // $ANTLR start "rule__Parameter__UnorderedGroup"
    // InternalHriDsl.g:3274:1: rule__Parameter__UnorderedGroup : rule__Parameter__UnorderedGroup__0 {...}?;
    public final void rule__Parameter__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getParameterAccess().getUnorderedGroup());
        	
        try {
            // InternalHriDsl.g:3279:1: ( rule__Parameter__UnorderedGroup__0 {...}?)
            // InternalHriDsl.g:3280:2: rule__Parameter__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getParameterAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__Parameter__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getParameterAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getParameterAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__UnorderedGroup"


    // $ANTLR start "rule__Parameter__UnorderedGroup__Impl"
    // InternalHriDsl.g:3288:1: rule__Parameter__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Parameter__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_1__0 ) ) ) ) ) ;
    public final void rule__Parameter__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalHriDsl.g:3293:1: ( ( ({...}? => ( ( ( rule__Parameter__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_1__0 ) ) ) ) ) )
            // InternalHriDsl.g:3294:3: ( ({...}? => ( ( ( rule__Parameter__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_1__0 ) ) ) ) )
            {
            // InternalHriDsl.g:3294:3: ( ({...}? => ( ( ( rule__Parameter__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_1__0 ) ) ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( LA17_0 == 50 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 0) ) ) {
                int LA17_1 = input.LA(2);

                if ( LA17_1 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 1) ) {
                    alt17=2;
                }
                else if ( LA17_1 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 0) ) {
                    alt17=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalHriDsl.g:3295:3: ({...}? => ( ( ( rule__Parameter__Group_0__0 ) ) ) )
                    {
                    // InternalHriDsl.g:3295:3: ({...}? => ( ( ( rule__Parameter__Group_0__0 ) ) ) )
                    // InternalHriDsl.g:3296:4: {...}? => ( ( ( rule__Parameter__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Parameter__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalHriDsl.g:3296:103: ( ( ( rule__Parameter__Group_0__0 ) ) )
                    // InternalHriDsl.g:3297:5: ( ( rule__Parameter__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalHriDsl.g:3303:5: ( ( rule__Parameter__Group_0__0 ) )
                    // InternalHriDsl.g:3304:6: ( rule__Parameter__Group_0__0 )
                    {
                     before(grammarAccess.getParameterAccess().getGroup_0()); 
                    // InternalHriDsl.g:3305:6: ( rule__Parameter__Group_0__0 )
                    // InternalHriDsl.g:3305:7: rule__Parameter__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:3310:3: ({...}? => ( ( ( rule__Parameter__Group_1__0 ) ) ) )
                    {
                    // InternalHriDsl.g:3310:3: ({...}? => ( ( ( rule__Parameter__Group_1__0 ) ) ) )
                    // InternalHriDsl.g:3311:4: {...}? => ( ( ( rule__Parameter__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Parameter__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalHriDsl.g:3311:103: ( ( ( rule__Parameter__Group_1__0 ) ) )
                    // InternalHriDsl.g:3312:5: ( ( rule__Parameter__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalHriDsl.g:3318:5: ( ( rule__Parameter__Group_1__0 ) )
                    // InternalHriDsl.g:3319:6: ( rule__Parameter__Group_1__0 )
                    {
                     before(grammarAccess.getParameterAccess().getGroup_1()); 
                    // InternalHriDsl.g:3320:6: ( rule__Parameter__Group_1__0 )
                    // InternalHriDsl.g:3320:7: rule__Parameter__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__UnorderedGroup__Impl"


    // $ANTLR start "rule__Parameter__UnorderedGroup__0"
    // InternalHriDsl.g:3333:1: rule__Parameter__UnorderedGroup__0 : rule__Parameter__UnorderedGroup__Impl ( rule__Parameter__UnorderedGroup__1 )? ;
    public final void rule__Parameter__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3337:1: ( rule__Parameter__UnorderedGroup__Impl ( rule__Parameter__UnorderedGroup__1 )? )
            // InternalHriDsl.g:3338:2: rule__Parameter__UnorderedGroup__Impl ( rule__Parameter__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_52);
            rule__Parameter__UnorderedGroup__Impl();

            state._fsp--;

            // InternalHriDsl.g:3339:2: ( rule__Parameter__UnorderedGroup__1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( LA18_0 == 50 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 0) ) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalHriDsl.g:3339:2: rule__Parameter__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__UnorderedGroup__0"


    // $ANTLR start "rule__Parameter__UnorderedGroup__1"
    // InternalHriDsl.g:3345:1: rule__Parameter__UnorderedGroup__1 : rule__Parameter__UnorderedGroup__Impl ;
    public final void rule__Parameter__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3349:1: ( rule__Parameter__UnorderedGroup__Impl )
            // InternalHriDsl.g:3350:2: rule__Parameter__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__UnorderedGroup__Impl();

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
    // $ANTLR end "rule__Parameter__UnorderedGroup__1"


    // $ANTLR start "rule__Model__ParameterAssignment_0"
    // InternalHriDsl.g:3357:1: rule__Model__ParameterAssignment_0 : ( ruleParameter ) ;
    public final void rule__Model__ParameterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3361:1: ( ( ruleParameter ) )
            // InternalHriDsl.g:3362:2: ( ruleParameter )
            {
            // InternalHriDsl.g:3362:2: ( ruleParameter )
            // InternalHriDsl.g:3363:3: ruleParameter
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
    // InternalHriDsl.g:3372:1: rule__Model__ScenariosAssignment_1 : ( ruleScenario ) ;
    public final void rule__Model__ScenariosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3376:1: ( ( ruleScenario ) )
            // InternalHriDsl.g:3377:2: ( ruleScenario )
            {
            // InternalHriDsl.g:3377:2: ( ruleScenario )
            // InternalHriDsl.g:3378:3: ruleScenario
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


    // $ANTLR start "rule__Parameter__Length_unitAssignment_0_2"
    // InternalHriDsl.g:3387:1: rule__Parameter__Length_unitAssignment_0_2 : ( ruleLength_unit ) ;
    public final void rule__Parameter__Length_unitAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3391:1: ( ( ruleLength_unit ) )
            // InternalHriDsl.g:3392:2: ( ruleLength_unit )
            {
            // InternalHriDsl.g:3392:2: ( ruleLength_unit )
            // InternalHriDsl.g:3393:3: ruleLength_unit
            {
             before(grammarAccess.getParameterAccess().getLength_unitLength_unitEnumRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLength_unit();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getLength_unitLength_unitEnumRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Length_unitAssignment_0_2"


    // $ANTLR start "rule__Parameter__Free_will_modelAssignment_1_2"
    // InternalHriDsl.g:3402:1: rule__Parameter__Free_will_modelAssignment_1_2 : ( ruleFree_will_model ) ;
    public final void rule__Parameter__Free_will_modelAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3406:1: ( ( ruleFree_will_model ) )
            // InternalHriDsl.g:3407:2: ( ruleFree_will_model )
            {
            // InternalHriDsl.g:3407:2: ( ruleFree_will_model )
            // InternalHriDsl.g:3408:3: ruleFree_will_model
            {
             before(grammarAccess.getParameterAccess().getFree_will_modelFree_will_modelEnumRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFree_will_model();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getFree_will_modelFree_will_modelEnumRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Free_will_modelAssignment_1_2"


    // $ANTLR start "rule__Scenario__FloorAssignment_0"
    // InternalHriDsl.g:3417:1: rule__Scenario__FloorAssignment_0 : ( ruleFloor ) ;
    public final void rule__Scenario__FloorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3421:1: ( ( ruleFloor ) )
            // InternalHriDsl.g:3422:2: ( ruleFloor )
            {
            // InternalHriDsl.g:3422:2: ( ruleFloor )
            // InternalHriDsl.g:3423:3: ruleFloor
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
    // InternalHriDsl.g:3432:1: rule__Scenario__RobotsAssignment_1 : ( ruleRobots ) ;
    public final void rule__Scenario__RobotsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3436:1: ( ( ruleRobots ) )
            // InternalHriDsl.g:3437:2: ( ruleRobots )
            {
            // InternalHriDsl.g:3437:2: ( ruleRobots )
            // InternalHriDsl.g:3438:3: ruleRobots
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
    // InternalHriDsl.g:3447:1: rule__Scenario__HumansAssignment_2 : ( ruleHumans ) ;
    public final void rule__Scenario__HumansAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3451:1: ( ( ruleHumans ) )
            // InternalHriDsl.g:3452:2: ( ruleHumans )
            {
            // InternalHriDsl.g:3452:2: ( ruleHumans )
            // InternalHriDsl.g:3453:3: ruleHumans
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
    // InternalHriDsl.g:3462:1: rule__Scenario__MissionsAssignment_3 : ( ruleMission ) ;
    public final void rule__Scenario__MissionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3466:1: ( ( ruleMission ) )
            // InternalHriDsl.g:3467:2: ( ruleMission )
            {
            // InternalHriDsl.g:3467:2: ( ruleMission )
            // InternalHriDsl.g:3468:3: ruleMission
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
    // InternalHriDsl.g:3477:1: rule__Floor__Floor_nameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Floor__Floor_nameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3481:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3482:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3482:2: ( RULE_ID )
            // InternalHriDsl.g:3483:3: RULE_ID
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
    // InternalHriDsl.g:3492:1: rule__Floor__SurfacesAssignment_4 : ( ruleSurface ) ;
    public final void rule__Floor__SurfacesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3496:1: ( ( ruleSurface ) )
            // InternalHriDsl.g:3497:2: ( ruleSurface )
            {
            // InternalHriDsl.g:3497:2: ( ruleSurface )
            // InternalHriDsl.g:3498:3: ruleSurface
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
    // InternalHriDsl.g:3507:1: rule__Floor__PointsAssignment_5 : ( rulePoint ) ;
    public final void rule__Floor__PointsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3511:1: ( ( rulePoint ) )
            // InternalHriDsl.g:3512:2: ( rulePoint )
            {
            // InternalHriDsl.g:3512:2: ( rulePoint )
            // InternalHriDsl.g:3513:3: rulePoint
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
    // InternalHriDsl.g:3522:1: rule__Surface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Surface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3526:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3527:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3527:2: ( RULE_ID )
            // InternalHriDsl.g:3528:3: RULE_ID
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
    // InternalHriDsl.g:3537:1: rule__Surface__VerticesAssignment_3 : ( ruleVertices ) ;
    public final void rule__Surface__VerticesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3541:1: ( ( ruleVertices ) )
            // InternalHriDsl.g:3542:2: ( ruleVertices )
            {
            // InternalHriDsl.g:3542:2: ( ruleVertices )
            // InternalHriDsl.g:3543:3: ruleVertices
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
    // InternalHriDsl.g:3552:1: rule__Vertices__Vertex_AAssignment_0 : ( ruleCoordinates ) ;
    public final void rule__Vertices__Vertex_AAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3556:1: ( ( ruleCoordinates ) )
            // InternalHriDsl.g:3557:2: ( ruleCoordinates )
            {
            // InternalHriDsl.g:3557:2: ( ruleCoordinates )
            // InternalHriDsl.g:3558:3: ruleCoordinates
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
    // InternalHriDsl.g:3567:1: rule__Vertices__Vertex_CAssignment_1 : ( ruleCoordinates ) ;
    public final void rule__Vertices__Vertex_CAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3571:1: ( ( ruleCoordinates ) )
            // InternalHriDsl.g:3572:2: ( ruleCoordinates )
            {
            // InternalHriDsl.g:3572:2: ( ruleCoordinates )
            // InternalHriDsl.g:3573:3: ruleCoordinates
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
    // InternalHriDsl.g:3582:1: rule__Point__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Point__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3586:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3587:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3587:2: ( RULE_ID )
            // InternalHriDsl.g:3588:3: RULE_ID
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
    // InternalHriDsl.g:3597:1: rule__Point__CoordinatesAssignment_3 : ( ruleCoordinates ) ;
    public final void rule__Point__CoordinatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3601:1: ( ( ruleCoordinates ) )
            // InternalHriDsl.g:3602:2: ( ruleCoordinates )
            {
            // InternalHriDsl.g:3602:2: ( ruleCoordinates )
            // InternalHriDsl.g:3603:3: ruleCoordinates
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
    // InternalHriDsl.g:3612:1: rule__Robots__RobotsAssignment_3 : ( ruleRobot ) ;
    public final void rule__Robots__RobotsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3616:1: ( ( ruleRobot ) )
            // InternalHriDsl.g:3617:2: ( ruleRobot )
            {
            // InternalHriDsl.g:3617:2: ( ruleRobot )
            // InternalHriDsl.g:3618:3: ruleRobot
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
    // InternalHriDsl.g:3627:1: rule__Robot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Robot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3631:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3632:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3632:2: ( RULE_ID )
            // InternalHriDsl.g:3633:3: RULE_ID
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
    // InternalHriDsl.g:3642:1: rule__Robot__CoordinatesAssignment_3 : ( ruleCoordinates ) ;
    public final void rule__Robot__CoordinatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3646:1: ( ( ruleCoordinates ) )
            // InternalHriDsl.g:3647:2: ( ruleCoordinates )
            {
            // InternalHriDsl.g:3647:2: ( ruleCoordinates )
            // InternalHriDsl.g:3648:3: ruleCoordinates
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
    // InternalHriDsl.g:3657:1: rule__Robot__TypeAssignment_5 : ( ruleType ) ;
    public final void rule__Robot__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3661:1: ( ( ruleType ) )
            // InternalHriDsl.g:3662:2: ( ruleType )
            {
            // InternalHriDsl.g:3662:2: ( ruleType )
            // InternalHriDsl.g:3663:3: ruleType
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
    // InternalHriDsl.g:3672:1: rule__Robot__Charge_percentageAssignment_7 : ( RULE_FLOAT ) ;
    public final void rule__Robot__Charge_percentageAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3676:1: ( ( RULE_FLOAT ) )
            // InternalHriDsl.g:3677:2: ( RULE_FLOAT )
            {
            // InternalHriDsl.g:3677:2: ( RULE_FLOAT )
            // InternalHriDsl.g:3678:3: RULE_FLOAT
            {
             before(grammarAccess.getRobotAccess().getCharge_percentageFLOATTerminalRuleCall_7_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getCharge_percentageFLOATTerminalRuleCall_7_0()); 

            }


            }

        }
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
    // InternalHriDsl.g:3687:1: rule__Humans__HumansAssignment_3 : ( ruleHuman ) ;
    public final void rule__Humans__HumansAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3691:1: ( ( ruleHuman ) )
            // InternalHriDsl.g:3692:2: ( ruleHuman )
            {
            // InternalHriDsl.g:3692:2: ( ruleHuman )
            // InternalHriDsl.g:3693:3: ruleHuman
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
    // InternalHriDsl.g:3702:1: rule__Human__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Human__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3706:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3707:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3707:2: ( RULE_ID )
            // InternalHriDsl.g:3708:3: RULE_ID
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
    // InternalHriDsl.g:3717:1: rule__Human__CoordinatesAssignment_3 : ( ruleCoordinates ) ;
    public final void rule__Human__CoordinatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3721:1: ( ( ruleCoordinates ) )
            // InternalHriDsl.g:3722:2: ( ruleCoordinates )
            {
            // InternalHriDsl.g:3722:2: ( ruleCoordinates )
            // InternalHriDsl.g:3723:3: ruleCoordinates
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
    // InternalHriDsl.g:3732:1: rule__Human__SpeedAssignment_5 : ( RULE_FLOAT ) ;
    public final void rule__Human__SpeedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3736:1: ( ( RULE_FLOAT ) )
            // InternalHriDsl.g:3737:2: ( RULE_FLOAT )
            {
            // InternalHriDsl.g:3737:2: ( RULE_FLOAT )
            // InternalHriDsl.g:3738:3: RULE_FLOAT
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
    // InternalHriDsl.g:3747:1: rule__Human__DextAssignment_7 : ( RULE_INT ) ;
    public final void rule__Human__DextAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3751:1: ( ( RULE_INT ) )
            // InternalHriDsl.g:3752:2: ( RULE_INT )
            {
            // InternalHriDsl.g:3752:2: ( RULE_INT )
            // InternalHriDsl.g:3753:3: RULE_INT
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
    // InternalHriDsl.g:3762:1: rule__Human__Fatigue_profileAssignment_9 : ( ruleFatigue_profile ) ;
    public final void rule__Human__Fatigue_profileAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3766:1: ( ( ruleFatigue_profile ) )
            // InternalHriDsl.g:3767:2: ( ruleFatigue_profile )
            {
            // InternalHriDsl.g:3767:2: ( ruleFatigue_profile )
            // InternalHriDsl.g:3768:3: ruleFatigue_profile
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
    // InternalHriDsl.g:3777:1: rule__Human__Free_will_profileAssignment_11 : ( ruleFree_will_profile ) ;
    public final void rule__Human__Free_will_profileAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3781:1: ( ( ruleFree_will_profile ) )
            // InternalHriDsl.g:3782:2: ( ruleFree_will_profile )
            {
            // InternalHriDsl.g:3782:2: ( ruleFree_will_profile )
            // InternalHriDsl.g:3783:3: ruleFree_will_profile
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
    // InternalHriDsl.g:3792:1: rule__Mission__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Mission__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3796:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3797:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3797:2: ( RULE_ID )
            // InternalHriDsl.g:3798:3: RULE_ID
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
    // InternalHriDsl.g:3807:1: rule__Mission__AssignmentsAssignment_4 : ( ruleAssignment ) ;
    public final void rule__Mission__AssignmentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3811:1: ( ( ruleAssignment ) )
            // InternalHriDsl.g:3812:2: ( ruleAssignment )
            {
            // InternalHriDsl.g:3812:2: ( ruleAssignment )
            // InternalHriDsl.g:3813:3: ruleAssignment
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
    // InternalHriDsl.g:3822:1: rule__Mission__QueriesAssignment_5 : ( ruleQueries ) ;
    public final void rule__Mission__QueriesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3826:1: ( ( ruleQueries ) )
            // InternalHriDsl.g:3827:2: ( ruleQueries )
            {
            // InternalHriDsl.g:3827:2: ( ruleQueries )
            // InternalHriDsl.g:3828:3: ruleQueries
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
    // InternalHriDsl.g:3837:1: rule__Assignment__PatternAssignment_1 : ( rulePattern ) ;
    public final void rule__Assignment__PatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3841:1: ( ( rulePattern ) )
            // InternalHriDsl.g:3842:2: ( rulePattern )
            {
            // InternalHriDsl.g:3842:2: ( rulePattern )
            // InternalHriDsl.g:3843:3: rulePattern
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
    // InternalHriDsl.g:3852:1: rule__Assignment__ClientAssignment_3 : ( RULE_ID ) ;
    public final void rule__Assignment__ClientAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3856:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3857:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3857:2: ( RULE_ID )
            // InternalHriDsl.g:3858:3: RULE_ID
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
    // InternalHriDsl.g:3867:1: rule__Assignment__TargetAssignment_6 : ( RULE_ID ) ;
    public final void rule__Assignment__TargetAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3871:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3872:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3872:2: ( RULE_ID )
            // InternalHriDsl.g:3873:3: RULE_ID
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
    // InternalHriDsl.g:3882:1: rule__Queries__MissionAssignment_4 : ( RULE_ID ) ;
    public final void rule__Queries__MissionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3886:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3887:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3887:2: ( RULE_ID )
            // InternalHriDsl.g:3888:3: RULE_ID
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
    // InternalHriDsl.g:3897:1: rule__Queries__QueriesAssignment_6 : ( ruleQuery ) ;
    public final void rule__Queries__QueriesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3901:1: ( ( ruleQuery ) )
            // InternalHriDsl.g:3902:2: ( ruleQuery )
            {
            // InternalHriDsl.g:3902:2: ( ruleQuery )
            // InternalHriDsl.g:3903:3: ruleQuery
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
    // InternalHriDsl.g:3912:1: rule__Query__Query_typeAssignment_1 : ( ruleQuery_type ) ;
    public final void rule__Query__Query_typeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3916:1: ( ( ruleQuery_type ) )
            // InternalHriDsl.g:3917:2: ( ruleQuery_type )
            {
            // InternalHriDsl.g:3917:2: ( ruleQuery_type )
            // InternalHriDsl.g:3918:3: ruleQuery_type
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
    // InternalHriDsl.g:3927:1: rule__Query__DurationAssignment_4 : ( RULE_INT ) ;
    public final void rule__Query__DurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3931:1: ( ( RULE_INT ) )
            // InternalHriDsl.g:3932:2: ( RULE_INT )
            {
            // InternalHriDsl.g:3932:2: ( RULE_INT )
            // InternalHriDsl.g:3933:3: RULE_INT
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
    // InternalHriDsl.g:3942:1: rule__Query__RunsAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Query__RunsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3946:1: ( ( RULE_STRING ) )
            // InternalHriDsl.g:3947:2: ( RULE_STRING )
            {
            // InternalHriDsl.g:3947:2: ( RULE_STRING )
            // InternalHriDsl.g:3948:3: RULE_STRING
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
    // InternalHriDsl.g:3957:1: rule__Coordinates__XAssignment_1 : ( RULE_FLOAT ) ;
    public final void rule__Coordinates__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3961:1: ( ( RULE_FLOAT ) )
            // InternalHriDsl.g:3962:2: ( RULE_FLOAT )
            {
            // InternalHriDsl.g:3962:2: ( RULE_FLOAT )
            // InternalHriDsl.g:3963:3: RULE_FLOAT
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
    // InternalHriDsl.g:3972:1: rule__Coordinates__YAssignment_3 : ( RULE_FLOAT ) ;
    public final void rule__Coordinates__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3976:1: ( ( RULE_FLOAT ) )
            // InternalHriDsl.g:3977:2: ( RULE_FLOAT )
            {
            // InternalHriDsl.g:3977:2: ( RULE_FLOAT )
            // InternalHriDsl.g:3978:3: RULE_FLOAT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000007C00000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000007FF8000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00001F8000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0003E00000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0004000000000002L});

}
