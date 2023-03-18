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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FLOAT", "RULE_INT", "RULE_STRING", "RULE_DEC", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'base'", "'err'", "'cog1'", "'cog2'", "'m'", "'km'", "'cm'", "'turtlebot3_burger'", "'turtlebot3_wafflepi'", "'tiago'", "'pepper'", "'young_healthy'", "'young_sick'", "'elderly_healthy'", "'elderly_sick'", "'covid_patient'", "'normal'", "'high'", "'low'", "'disabled'", "'busy'", "'free'", "'unexperienced'", "'experienced'", "'critical'", "'stable'", "'distracted'", "'focused'", "'robot_leader'", "'robot_follower'", "'robot_transporter'", "'robot_competitor'", "'robot_rescuer'", "'robot_client'", "'simulation'", "'probability_of_success'", "'expected_fatigue'", "'expected_charge'", "'probability_of_failure'", "'parameter'", "'length_unit'", "'free_will_model'", "'define'", "'layout'", "':'", "'area'", "'in'", "'poi'", "'robots'", "'robot'", "'type'", "'charge'", "'humans'", "'human'", "'speed'", "'dexterity'", "'is'", "'freewill'", "'mission'", "'do'", "'for'", "'with'", "'target'", "'queries'", "'of'", "'compute'", "'duration'", "'runs'", "'('", "','", "')'"
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
    public static final int T__82=82;
    public static final int T__83=83;
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


    // $ANTLR start "ruleBehavioral_model"
    // InternalHriDsl.g:453:1: ruleBehavioral_model : ( ( rule__Behavioral_model__Alternatives ) ) ;
    public final void ruleBehavioral_model() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:457:1: ( ( ( rule__Behavioral_model__Alternatives ) ) )
            // InternalHriDsl.g:458:2: ( ( rule__Behavioral_model__Alternatives ) )
            {
            // InternalHriDsl.g:458:2: ( ( rule__Behavioral_model__Alternatives ) )
            // InternalHriDsl.g:459:3: ( rule__Behavioral_model__Alternatives )
            {
             before(grammarAccess.getBehavioral_modelAccess().getAlternatives()); 
            // InternalHriDsl.g:460:3: ( rule__Behavioral_model__Alternatives )
            // InternalHriDsl.g:460:4: rule__Behavioral_model__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Behavioral_model__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBehavioral_modelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehavioral_model"


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


    // $ANTLR start "rule__Behavioral_model__Alternatives"
    // InternalHriDsl.g:564:1: rule__Behavioral_model__Alternatives : ( ( ( 'base' ) ) | ( ( 'err' ) ) | ( ( 'cog1' ) ) | ( ( 'cog2' ) ) );
    public final void rule__Behavioral_model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:568:1: ( ( ( 'base' ) ) | ( ( 'err' ) ) | ( ( 'cog1' ) ) | ( ( 'cog2' ) ) )
            int alt1=4;
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
            case 16:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalHriDsl.g:569:2: ( ( 'base' ) )
                    {
                    // InternalHriDsl.g:569:2: ( ( 'base' ) )
                    // InternalHriDsl.g:570:3: ( 'base' )
                    {
                     before(grammarAccess.getBehavioral_modelAccess().getBASEEnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:571:3: ( 'base' )
                    // InternalHriDsl.g:571:4: 'base'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getBehavioral_modelAccess().getBASEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:575:2: ( ( 'err' ) )
                    {
                    // InternalHriDsl.g:575:2: ( ( 'err' ) )
                    // InternalHriDsl.g:576:3: ( 'err' )
                    {
                     before(grammarAccess.getBehavioral_modelAccess().getERRORSEnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:577:3: ( 'err' )
                    // InternalHriDsl.g:577:4: 'err'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBehavioral_modelAccess().getERRORSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:581:2: ( ( 'cog1' ) )
                    {
                    // InternalHriDsl.g:581:2: ( ( 'cog1' ) )
                    // InternalHriDsl.g:582:3: ( 'cog1' )
                    {
                     before(grammarAccess.getBehavioral_modelAccess().getCOG_V1EnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:583:3: ( 'cog1' )
                    // InternalHriDsl.g:583:4: 'cog1'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBehavioral_modelAccess().getCOG_V1EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:587:2: ( ( 'cog2' ) )
                    {
                    // InternalHriDsl.g:587:2: ( ( 'cog2' ) )
                    // InternalHriDsl.g:588:3: ( 'cog2' )
                    {
                     before(grammarAccess.getBehavioral_modelAccess().getCOG_V2EnumLiteralDeclaration_3()); 
                    // InternalHriDsl.g:589:3: ( 'cog2' )
                    // InternalHriDsl.g:589:4: 'cog2'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getBehavioral_modelAccess().getCOG_V2EnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Behavioral_model__Alternatives"


    // $ANTLR start "rule__Length_unit__Alternatives"
    // InternalHriDsl.g:597:1: rule__Length_unit__Alternatives : ( ( ( 'm' ) ) | ( ( 'km' ) ) | ( ( 'cm' ) ) );
    public final void rule__Length_unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:601:1: ( ( ( 'm' ) ) | ( ( 'km' ) ) | ( ( 'cm' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 19:
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
                    // InternalHriDsl.g:602:2: ( ( 'm' ) )
                    {
                    // InternalHriDsl.g:602:2: ( ( 'm' ) )
                    // InternalHriDsl.g:603:3: ( 'm' )
                    {
                     before(grammarAccess.getLength_unitAccess().getMETEREnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:604:3: ( 'm' )
                    // InternalHriDsl.g:604:4: 'm'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getLength_unitAccess().getMETEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:608:2: ( ( 'km' ) )
                    {
                    // InternalHriDsl.g:608:2: ( ( 'km' ) )
                    // InternalHriDsl.g:609:3: ( 'km' )
                    {
                     before(grammarAccess.getLength_unitAccess().getKILOMETEREnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:610:3: ( 'km' )
                    // InternalHriDsl.g:610:4: 'km'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getLength_unitAccess().getKILOMETEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:614:2: ( ( 'cm' ) )
                    {
                    // InternalHriDsl.g:614:2: ( ( 'cm' ) )
                    // InternalHriDsl.g:615:3: ( 'cm' )
                    {
                     before(grammarAccess.getLength_unitAccess().getCENTIMETEREnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:616:3: ( 'cm' )
                    // InternalHriDsl.g:616:4: 'cm'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalHriDsl.g:624:1: rule__Type__Alternatives : ( ( ( 'turtlebot3_burger' ) ) | ( ( 'turtlebot3_wafflepi' ) ) | ( ( 'tiago' ) ) | ( ( 'pepper' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:628:1: ( ( ( 'turtlebot3_burger' ) ) | ( ( 'turtlebot3_wafflepi' ) ) | ( ( 'tiago' ) ) | ( ( 'pepper' ) ) )
            int alt3=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalHriDsl.g:629:2: ( ( 'turtlebot3_burger' ) )
                    {
                    // InternalHriDsl.g:629:2: ( ( 'turtlebot3_burger' ) )
                    // InternalHriDsl.g:630:3: ( 'turtlebot3_burger' )
                    {
                     before(grammarAccess.getTypeAccess().getTURTLEBOT3_BURGEREnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:631:3: ( 'turtlebot3_burger' )
                    // InternalHriDsl.g:631:4: 'turtlebot3_burger'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getTURTLEBOT3_BURGEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:635:2: ( ( 'turtlebot3_wafflepi' ) )
                    {
                    // InternalHriDsl.g:635:2: ( ( 'turtlebot3_wafflepi' ) )
                    // InternalHriDsl.g:636:3: ( 'turtlebot3_wafflepi' )
                    {
                     before(grammarAccess.getTypeAccess().getTURTLEBOT3_WAFFLEPIEnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:637:3: ( 'turtlebot3_wafflepi' )
                    // InternalHriDsl.g:637:4: 'turtlebot3_wafflepi'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getTURTLEBOT3_WAFFLEPIEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:641:2: ( ( 'tiago' ) )
                    {
                    // InternalHriDsl.g:641:2: ( ( 'tiago' ) )
                    // InternalHriDsl.g:642:3: ( 'tiago' )
                    {
                     before(grammarAccess.getTypeAccess().getTIAGOEnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:643:3: ( 'tiago' )
                    // InternalHriDsl.g:643:4: 'tiago'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getTIAGOEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:647:2: ( ( 'pepper' ) )
                    {
                    // InternalHriDsl.g:647:2: ( ( 'pepper' ) )
                    // InternalHriDsl.g:648:3: ( 'pepper' )
                    {
                     before(grammarAccess.getTypeAccess().getPEPPEREnumLiteralDeclaration_3()); 
                    // InternalHriDsl.g:649:3: ( 'pepper' )
                    // InternalHriDsl.g:649:4: 'pepper'
                    {
                    match(input,23,FOLLOW_2); 

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
    // InternalHriDsl.g:657:1: rule__Fatigue_profile__Alternatives : ( ( ( 'young_healthy' ) ) | ( ( 'young_sick' ) ) | ( ( 'elderly_healthy' ) ) | ( ( 'elderly_sick' ) ) | ( ( 'covid_patient' ) ) );
    public final void rule__Fatigue_profile__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:661:1: ( ( ( 'young_healthy' ) ) | ( ( 'young_sick' ) ) | ( ( 'elderly_healthy' ) ) | ( ( 'elderly_sick' ) ) | ( ( 'covid_patient' ) ) )
            int alt4=5;
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
            case 28:
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
                    // InternalHriDsl.g:662:2: ( ( 'young_healthy' ) )
                    {
                    // InternalHriDsl.g:662:2: ( ( 'young_healthy' ) )
                    // InternalHriDsl.g:663:3: ( 'young_healthy' )
                    {
                     before(grammarAccess.getFatigue_profileAccess().getYOUNG_HEALTHYEnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:664:3: ( 'young_healthy' )
                    // InternalHriDsl.g:664:4: 'young_healthy'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getFatigue_profileAccess().getYOUNG_HEALTHYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:668:2: ( ( 'young_sick' ) )
                    {
                    // InternalHriDsl.g:668:2: ( ( 'young_sick' ) )
                    // InternalHriDsl.g:669:3: ( 'young_sick' )
                    {
                     before(grammarAccess.getFatigue_profileAccess().getYOUNG_SICKEnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:670:3: ( 'young_sick' )
                    // InternalHriDsl.g:670:4: 'young_sick'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getFatigue_profileAccess().getYOUNG_SICKEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:674:2: ( ( 'elderly_healthy' ) )
                    {
                    // InternalHriDsl.g:674:2: ( ( 'elderly_healthy' ) )
                    // InternalHriDsl.g:675:3: ( 'elderly_healthy' )
                    {
                     before(grammarAccess.getFatigue_profileAccess().getELDERLY_HEALTHYEnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:676:3: ( 'elderly_healthy' )
                    // InternalHriDsl.g:676:4: 'elderly_healthy'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getFatigue_profileAccess().getELDERLY_HEALTHYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:680:2: ( ( 'elderly_sick' ) )
                    {
                    // InternalHriDsl.g:680:2: ( ( 'elderly_sick' ) )
                    // InternalHriDsl.g:681:3: ( 'elderly_sick' )
                    {
                     before(grammarAccess.getFatigue_profileAccess().getELDERLY_SICKEnumLiteralDeclaration_3()); 
                    // InternalHriDsl.g:682:3: ( 'elderly_sick' )
                    // InternalHriDsl.g:682:4: 'elderly_sick'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getFatigue_profileAccess().getELDERLY_SICKEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHriDsl.g:686:2: ( ( 'covid_patient' ) )
                    {
                    // InternalHriDsl.g:686:2: ( ( 'covid_patient' ) )
                    // InternalHriDsl.g:687:3: ( 'covid_patient' )
                    {
                     before(grammarAccess.getFatigue_profileAccess().getCOVID_PATIENTEnumLiteralDeclaration_4()); 
                    // InternalHriDsl.g:688:3: ( 'covid_patient' )
                    // InternalHriDsl.g:688:4: 'covid_patient'
                    {
                    match(input,28,FOLLOW_2); 

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
    // InternalHriDsl.g:696:1: rule__Free_will_profile__Alternatives : ( ( ( 'normal' ) ) | ( ( 'high' ) ) | ( ( 'low' ) ) | ( ( 'disabled' ) ) | ( ( 'busy' ) ) | ( ( 'free' ) ) | ( ( 'unexperienced' ) ) | ( ( 'experienced' ) ) | ( ( 'critical' ) ) | ( ( 'stable' ) ) | ( ( 'distracted' ) ) | ( ( 'focused' ) ) );
    public final void rule__Free_will_profile__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:700:1: ( ( ( 'normal' ) ) | ( ( 'high' ) ) | ( ( 'low' ) ) | ( ( 'disabled' ) ) | ( ( 'busy' ) ) | ( ( 'free' ) ) | ( ( 'unexperienced' ) ) | ( ( 'experienced' ) ) | ( ( 'critical' ) ) | ( ( 'stable' ) ) | ( ( 'distracted' ) ) | ( ( 'focused' ) ) )
            int alt5=12;
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
            case 35:
                {
                alt5=7;
                }
                break;
            case 36:
                {
                alt5=8;
                }
                break;
            case 37:
                {
                alt5=9;
                }
                break;
            case 38:
                {
                alt5=10;
                }
                break;
            case 39:
                {
                alt5=11;
                }
                break;
            case 40:
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
                    // InternalHriDsl.g:701:2: ( ( 'normal' ) )
                    {
                    // InternalHriDsl.g:701:2: ( ( 'normal' ) )
                    // InternalHriDsl.g:702:3: ( 'normal' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getNORMALEnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:703:3: ( 'normal' )
                    // InternalHriDsl.g:703:4: 'normal'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getNORMALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:707:2: ( ( 'high' ) )
                    {
                    // InternalHriDsl.g:707:2: ( ( 'high' ) )
                    // InternalHriDsl.g:708:3: ( 'high' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getHIGHEnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:709:3: ( 'high' )
                    // InternalHriDsl.g:709:4: 'high'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getHIGHEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:713:2: ( ( 'low' ) )
                    {
                    // InternalHriDsl.g:713:2: ( ( 'low' ) )
                    // InternalHriDsl.g:714:3: ( 'low' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getLOWEnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:715:3: ( 'low' )
                    // InternalHriDsl.g:715:4: 'low'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getLOWEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:719:2: ( ( 'disabled' ) )
                    {
                    // InternalHriDsl.g:719:2: ( ( 'disabled' ) )
                    // InternalHriDsl.g:720:3: ( 'disabled' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getDISABLEDEnumLiteralDeclaration_3()); 
                    // InternalHriDsl.g:721:3: ( 'disabled' )
                    // InternalHriDsl.g:721:4: 'disabled'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getDISABLEDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHriDsl.g:725:2: ( ( 'busy' ) )
                    {
                    // InternalHriDsl.g:725:2: ( ( 'busy' ) )
                    // InternalHriDsl.g:726:3: ( 'busy' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getBUSYEnumLiteralDeclaration_4()); 
                    // InternalHriDsl.g:727:3: ( 'busy' )
                    // InternalHriDsl.g:727:4: 'busy'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getBUSYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHriDsl.g:731:2: ( ( 'free' ) )
                    {
                    // InternalHriDsl.g:731:2: ( ( 'free' ) )
                    // InternalHriDsl.g:732:3: ( 'free' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getFREEEnumLiteralDeclaration_5()); 
                    // InternalHriDsl.g:733:3: ( 'free' )
                    // InternalHriDsl.g:733:4: 'free'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getFREEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalHriDsl.g:737:2: ( ( 'unexperienced' ) )
                    {
                    // InternalHriDsl.g:737:2: ( ( 'unexperienced' ) )
                    // InternalHriDsl.g:738:3: ( 'unexperienced' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getUNEXPERIENCEDEnumLiteralDeclaration_6()); 
                    // InternalHriDsl.g:739:3: ( 'unexperienced' )
                    // InternalHriDsl.g:739:4: 'unexperienced'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getUNEXPERIENCEDEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalHriDsl.g:743:2: ( ( 'experienced' ) )
                    {
                    // InternalHriDsl.g:743:2: ( ( 'experienced' ) )
                    // InternalHriDsl.g:744:3: ( 'experienced' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getEXPERIENCEDEnumLiteralDeclaration_7()); 
                    // InternalHriDsl.g:745:3: ( 'experienced' )
                    // InternalHriDsl.g:745:4: 'experienced'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getEXPERIENCEDEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalHriDsl.g:749:2: ( ( 'critical' ) )
                    {
                    // InternalHriDsl.g:749:2: ( ( 'critical' ) )
                    // InternalHriDsl.g:750:3: ( 'critical' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getCRITICALEnumLiteralDeclaration_8()); 
                    // InternalHriDsl.g:751:3: ( 'critical' )
                    // InternalHriDsl.g:751:4: 'critical'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getCRITICALEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalHriDsl.g:755:2: ( ( 'stable' ) )
                    {
                    // InternalHriDsl.g:755:2: ( ( 'stable' ) )
                    // InternalHriDsl.g:756:3: ( 'stable' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getSTABLEEnumLiteralDeclaration_9()); 
                    // InternalHriDsl.g:757:3: ( 'stable' )
                    // InternalHriDsl.g:757:4: 'stable'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getSTABLEEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalHriDsl.g:761:2: ( ( 'distracted' ) )
                    {
                    // InternalHriDsl.g:761:2: ( ( 'distracted' ) )
                    // InternalHriDsl.g:762:3: ( 'distracted' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getDISTRACTEDEnumLiteralDeclaration_10()); 
                    // InternalHriDsl.g:763:3: ( 'distracted' )
                    // InternalHriDsl.g:763:4: 'distracted'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getFree_will_profileAccess().getDISTRACTEDEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalHriDsl.g:767:2: ( ( 'focused' ) )
                    {
                    // InternalHriDsl.g:767:2: ( ( 'focused' ) )
                    // InternalHriDsl.g:768:3: ( 'focused' )
                    {
                     before(grammarAccess.getFree_will_profileAccess().getFOCUSEDEnumLiteralDeclaration_11()); 
                    // InternalHriDsl.g:769:3: ( 'focused' )
                    // InternalHriDsl.g:769:4: 'focused'
                    {
                    match(input,40,FOLLOW_2); 

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
    // InternalHriDsl.g:777:1: rule__Pattern__Alternatives : ( ( ( 'robot_leader' ) ) | ( ( 'robot_follower' ) ) | ( ( 'robot_transporter' ) ) | ( ( 'robot_competitor' ) ) | ( ( 'robot_rescuer' ) ) | ( ( 'robot_client' ) ) );
    public final void rule__Pattern__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:781:1: ( ( ( 'robot_leader' ) ) | ( ( 'robot_follower' ) ) | ( ( 'robot_transporter' ) ) | ( ( 'robot_competitor' ) ) | ( ( 'robot_rescuer' ) ) | ( ( 'robot_client' ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt6=1;
                }
                break;
            case 42:
                {
                alt6=2;
                }
                break;
            case 43:
                {
                alt6=3;
                }
                break;
            case 44:
                {
                alt6=4;
                }
                break;
            case 45:
                {
                alt6=5;
                }
                break;
            case 46:
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
                    // InternalHriDsl.g:782:2: ( ( 'robot_leader' ) )
                    {
                    // InternalHriDsl.g:782:2: ( ( 'robot_leader' ) )
                    // InternalHriDsl.g:783:3: ( 'robot_leader' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_LEADEREnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:784:3: ( 'robot_leader' )
                    // InternalHriDsl.g:784:4: 'robot_leader'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getPatternAccess().getROBOT_LEADEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:788:2: ( ( 'robot_follower' ) )
                    {
                    // InternalHriDsl.g:788:2: ( ( 'robot_follower' ) )
                    // InternalHriDsl.g:789:3: ( 'robot_follower' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_FOLLOWEREnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:790:3: ( 'robot_follower' )
                    // InternalHriDsl.g:790:4: 'robot_follower'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getPatternAccess().getROBOT_FOLLOWEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:794:2: ( ( 'robot_transporter' ) )
                    {
                    // InternalHriDsl.g:794:2: ( ( 'robot_transporter' ) )
                    // InternalHriDsl.g:795:3: ( 'robot_transporter' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_TRANSPORTEREnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:796:3: ( 'robot_transporter' )
                    // InternalHriDsl.g:796:4: 'robot_transporter'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getPatternAccess().getROBOT_TRANSPORTEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:800:2: ( ( 'robot_competitor' ) )
                    {
                    // InternalHriDsl.g:800:2: ( ( 'robot_competitor' ) )
                    // InternalHriDsl.g:801:3: ( 'robot_competitor' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_COMPETITOREnumLiteralDeclaration_3()); 
                    // InternalHriDsl.g:802:3: ( 'robot_competitor' )
                    // InternalHriDsl.g:802:4: 'robot_competitor'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getPatternAccess().getROBOT_COMPETITOREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHriDsl.g:806:2: ( ( 'robot_rescuer' ) )
                    {
                    // InternalHriDsl.g:806:2: ( ( 'robot_rescuer' ) )
                    // InternalHriDsl.g:807:3: ( 'robot_rescuer' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_RESCUEREnumLiteralDeclaration_4()); 
                    // InternalHriDsl.g:808:3: ( 'robot_rescuer' )
                    // InternalHriDsl.g:808:4: 'robot_rescuer'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getPatternAccess().getROBOT_RESCUEREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHriDsl.g:812:2: ( ( 'robot_client' ) )
                    {
                    // InternalHriDsl.g:812:2: ( ( 'robot_client' ) )
                    // InternalHriDsl.g:813:3: ( 'robot_client' )
                    {
                     before(grammarAccess.getPatternAccess().getROBOT_ASSISTANTEnumLiteralDeclaration_5()); 
                    // InternalHriDsl.g:814:3: ( 'robot_client' )
                    // InternalHriDsl.g:814:4: 'robot_client'
                    {
                    match(input,46,FOLLOW_2); 

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
    // InternalHriDsl.g:822:1: rule__Query_type__Alternatives : ( ( ( 'simulation' ) ) | ( ( 'probability_of_success' ) ) | ( ( 'expected_fatigue' ) ) | ( ( 'expected_charge' ) ) | ( ( 'probability_of_failure' ) ) );
    public final void rule__Query_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:826:1: ( ( ( 'simulation' ) ) | ( ( 'probability_of_success' ) ) | ( ( 'expected_fatigue' ) ) | ( ( 'expected_charge' ) ) | ( ( 'probability_of_failure' ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt7=1;
                }
                break;
            case 48:
                {
                alt7=2;
                }
                break;
            case 49:
                {
                alt7=3;
                }
                break;
            case 50:
                {
                alt7=4;
                }
                break;
            case 51:
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
                    // InternalHriDsl.g:827:2: ( ( 'simulation' ) )
                    {
                    // InternalHriDsl.g:827:2: ( ( 'simulation' ) )
                    // InternalHriDsl.g:828:3: ( 'simulation' )
                    {
                     before(grammarAccess.getQuery_typeAccess().getSIMULATIONEnumLiteralDeclaration_0()); 
                    // InternalHriDsl.g:829:3: ( 'simulation' )
                    // InternalHriDsl.g:829:4: 'simulation'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuery_typeAccess().getSIMULATIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHriDsl.g:833:2: ( ( 'probability_of_success' ) )
                    {
                    // InternalHriDsl.g:833:2: ( ( 'probability_of_success' ) )
                    // InternalHriDsl.g:834:3: ( 'probability_of_success' )
                    {
                     before(grammarAccess.getQuery_typeAccess().getPROBABILITY_OF_SUCCESSEnumLiteralDeclaration_1()); 
                    // InternalHriDsl.g:835:3: ( 'probability_of_success' )
                    // InternalHriDsl.g:835:4: 'probability_of_success'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuery_typeAccess().getPROBABILITY_OF_SUCCESSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHriDsl.g:839:2: ( ( 'expected_fatigue' ) )
                    {
                    // InternalHriDsl.g:839:2: ( ( 'expected_fatigue' ) )
                    // InternalHriDsl.g:840:3: ( 'expected_fatigue' )
                    {
                     before(grammarAccess.getQuery_typeAccess().getEXPECTED_FATIGUEEnumLiteralDeclaration_2()); 
                    // InternalHriDsl.g:841:3: ( 'expected_fatigue' )
                    // InternalHriDsl.g:841:4: 'expected_fatigue'
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuery_typeAccess().getEXPECTED_FATIGUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHriDsl.g:845:2: ( ( 'expected_charge' ) )
                    {
                    // InternalHriDsl.g:845:2: ( ( 'expected_charge' ) )
                    // InternalHriDsl.g:846:3: ( 'expected_charge' )
                    {
                     before(grammarAccess.getQuery_typeAccess().getEXPECTED_CHARGEEnumLiteralDeclaration_3()); 
                    // InternalHriDsl.g:847:3: ( 'expected_charge' )
                    // InternalHriDsl.g:847:4: 'expected_charge'
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuery_typeAccess().getEXPECTED_CHARGEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHriDsl.g:851:2: ( ( 'probability_of_failure' ) )
                    {
                    // InternalHriDsl.g:851:2: ( ( 'probability_of_failure' ) )
                    // InternalHriDsl.g:852:3: ( 'probability_of_failure' )
                    {
                     before(grammarAccess.getQuery_typeAccess().getPROBABILITY_OF_FAILUREEnumLiteralDeclaration_4()); 
                    // InternalHriDsl.g:853:3: ( 'probability_of_failure' )
                    // InternalHriDsl.g:853:4: 'probability_of_failure'
                    {
                    match(input,51,FOLLOW_2); 

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
    // InternalHriDsl.g:861:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:865:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalHriDsl.g:866:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalHriDsl.g:873:1: rule__Model__Group__0__Impl : ( ( rule__Model__ParameterAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:877:1: ( ( ( rule__Model__ParameterAssignment_0 )? ) )
            // InternalHriDsl.g:878:1: ( ( rule__Model__ParameterAssignment_0 )? )
            {
            // InternalHriDsl.g:878:1: ( ( rule__Model__ParameterAssignment_0 )? )
            // InternalHriDsl.g:879:2: ( rule__Model__ParameterAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getParameterAssignment_0()); 
            // InternalHriDsl.g:880:2: ( rule__Model__ParameterAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==52) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalHriDsl.g:880:3: rule__Model__ParameterAssignment_0
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
    // InternalHriDsl.g:888:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:892:1: ( rule__Model__Group__1__Impl )
            // InternalHriDsl.g:893:2: rule__Model__Group__1__Impl
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
    // InternalHriDsl.g:899:1: rule__Model__Group__1__Impl : ( ( rule__Model__ScenariosAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:903:1: ( ( ( rule__Model__ScenariosAssignment_1 )* ) )
            // InternalHriDsl.g:904:1: ( ( rule__Model__ScenariosAssignment_1 )* )
            {
            // InternalHriDsl.g:904:1: ( ( rule__Model__ScenariosAssignment_1 )* )
            // InternalHriDsl.g:905:2: ( rule__Model__ScenariosAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getScenariosAssignment_1()); 
            // InternalHriDsl.g:906:2: ( rule__Model__ScenariosAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==55) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalHriDsl.g:906:3: rule__Model__ScenariosAssignment_1
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
    // InternalHriDsl.g:915:1: rule__Parameter__Group_0__0 : rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1 ;
    public final void rule__Parameter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:919:1: ( rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1 )
            // InternalHriDsl.g:920:2: rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1
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
    // InternalHriDsl.g:927:1: rule__Parameter__Group_0__0__Impl : ( 'parameter' ) ;
    public final void rule__Parameter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:931:1: ( ( 'parameter' ) )
            // InternalHriDsl.g:932:1: ( 'parameter' )
            {
            // InternalHriDsl.g:932:1: ( 'parameter' )
            // InternalHriDsl.g:933:2: 'parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalHriDsl.g:942:1: rule__Parameter__Group_0__1 : rule__Parameter__Group_0__1__Impl rule__Parameter__Group_0__2 ;
    public final void rule__Parameter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:946:1: ( rule__Parameter__Group_0__1__Impl rule__Parameter__Group_0__2 )
            // InternalHriDsl.g:947:2: rule__Parameter__Group_0__1__Impl rule__Parameter__Group_0__2
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
    // InternalHriDsl.g:954:1: rule__Parameter__Group_0__1__Impl : ( 'length_unit' ) ;
    public final void rule__Parameter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:958:1: ( ( 'length_unit' ) )
            // InternalHriDsl.g:959:1: ( 'length_unit' )
            {
            // InternalHriDsl.g:959:1: ( 'length_unit' )
            // InternalHriDsl.g:960:2: 'length_unit'
            {
             before(grammarAccess.getParameterAccess().getLength_unitKeyword_0_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalHriDsl.g:969:1: rule__Parameter__Group_0__2 : rule__Parameter__Group_0__2__Impl ;
    public final void rule__Parameter__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:973:1: ( rule__Parameter__Group_0__2__Impl )
            // InternalHriDsl.g:974:2: rule__Parameter__Group_0__2__Impl
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
    // InternalHriDsl.g:980:1: rule__Parameter__Group_0__2__Impl : ( ( rule__Parameter__Length_unitAssignment_0_2 ) ) ;
    public final void rule__Parameter__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:984:1: ( ( ( rule__Parameter__Length_unitAssignment_0_2 ) ) )
            // InternalHriDsl.g:985:1: ( ( rule__Parameter__Length_unitAssignment_0_2 ) )
            {
            // InternalHriDsl.g:985:1: ( ( rule__Parameter__Length_unitAssignment_0_2 ) )
            // InternalHriDsl.g:986:2: ( rule__Parameter__Length_unitAssignment_0_2 )
            {
             before(grammarAccess.getParameterAccess().getLength_unitAssignment_0_2()); 
            // InternalHriDsl.g:987:2: ( rule__Parameter__Length_unitAssignment_0_2 )
            // InternalHriDsl.g:987:3: rule__Parameter__Length_unitAssignment_0_2
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
    // InternalHriDsl.g:996:1: rule__Parameter__Group_1__0 : rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1 ;
    public final void rule__Parameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1000:1: ( rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1 )
            // InternalHriDsl.g:1001:2: rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1
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
    // InternalHriDsl.g:1008:1: rule__Parameter__Group_1__0__Impl : ( 'parameter' ) ;
    public final void rule__Parameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1012:1: ( ( 'parameter' ) )
            // InternalHriDsl.g:1013:1: ( 'parameter' )
            {
            // InternalHriDsl.g:1013:1: ( 'parameter' )
            // InternalHriDsl.g:1014:2: 'parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_1_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalHriDsl.g:1023:1: rule__Parameter__Group_1__1 : rule__Parameter__Group_1__1__Impl rule__Parameter__Group_1__2 ;
    public final void rule__Parameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1027:1: ( rule__Parameter__Group_1__1__Impl rule__Parameter__Group_1__2 )
            // InternalHriDsl.g:1028:2: rule__Parameter__Group_1__1__Impl rule__Parameter__Group_1__2
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
    // InternalHriDsl.g:1035:1: rule__Parameter__Group_1__1__Impl : ( 'free_will_model' ) ;
    public final void rule__Parameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1039:1: ( ( 'free_will_model' ) )
            // InternalHriDsl.g:1040:1: ( 'free_will_model' )
            {
            // InternalHriDsl.g:1040:1: ( 'free_will_model' )
            // InternalHriDsl.g:1041:2: 'free_will_model'
            {
             before(grammarAccess.getParameterAccess().getFree_will_modelKeyword_1_1()); 
            match(input,54,FOLLOW_2); 
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
    // InternalHriDsl.g:1050:1: rule__Parameter__Group_1__2 : rule__Parameter__Group_1__2__Impl ;
    public final void rule__Parameter__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1054:1: ( rule__Parameter__Group_1__2__Impl )
            // InternalHriDsl.g:1055:2: rule__Parameter__Group_1__2__Impl
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
    // InternalHriDsl.g:1061:1: rule__Parameter__Group_1__2__Impl : ( ( rule__Parameter__Free_will_modelAssignment_1_2 ) ) ;
    public final void rule__Parameter__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1065:1: ( ( ( rule__Parameter__Free_will_modelAssignment_1_2 ) ) )
            // InternalHriDsl.g:1066:1: ( ( rule__Parameter__Free_will_modelAssignment_1_2 ) )
            {
            // InternalHriDsl.g:1066:1: ( ( rule__Parameter__Free_will_modelAssignment_1_2 ) )
            // InternalHriDsl.g:1067:2: ( rule__Parameter__Free_will_modelAssignment_1_2 )
            {
             before(grammarAccess.getParameterAccess().getFree_will_modelAssignment_1_2()); 
            // InternalHriDsl.g:1068:2: ( rule__Parameter__Free_will_modelAssignment_1_2 )
            // InternalHriDsl.g:1068:3: rule__Parameter__Free_will_modelAssignment_1_2
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
    // InternalHriDsl.g:1077:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1081:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalHriDsl.g:1082:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
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
    // InternalHriDsl.g:1089:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__FloorAssignment_0 ) ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1093:1: ( ( ( rule__Scenario__FloorAssignment_0 ) ) )
            // InternalHriDsl.g:1094:1: ( ( rule__Scenario__FloorAssignment_0 ) )
            {
            // InternalHriDsl.g:1094:1: ( ( rule__Scenario__FloorAssignment_0 ) )
            // InternalHriDsl.g:1095:2: ( rule__Scenario__FloorAssignment_0 )
            {
             before(grammarAccess.getScenarioAccess().getFloorAssignment_0()); 
            // InternalHriDsl.g:1096:2: ( rule__Scenario__FloorAssignment_0 )
            // InternalHriDsl.g:1096:3: rule__Scenario__FloorAssignment_0
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
    // InternalHriDsl.g:1104:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1108:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalHriDsl.g:1109:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
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
    // InternalHriDsl.g:1116:1: rule__Scenario__Group__1__Impl : ( ( rule__Scenario__RobotsAssignment_1 ) ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1120:1: ( ( ( rule__Scenario__RobotsAssignment_1 ) ) )
            // InternalHriDsl.g:1121:1: ( ( rule__Scenario__RobotsAssignment_1 ) )
            {
            // InternalHriDsl.g:1121:1: ( ( rule__Scenario__RobotsAssignment_1 ) )
            // InternalHriDsl.g:1122:2: ( rule__Scenario__RobotsAssignment_1 )
            {
             before(grammarAccess.getScenarioAccess().getRobotsAssignment_1()); 
            // InternalHriDsl.g:1123:2: ( rule__Scenario__RobotsAssignment_1 )
            // InternalHriDsl.g:1123:3: rule__Scenario__RobotsAssignment_1
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
    // InternalHriDsl.g:1131:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1135:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalHriDsl.g:1136:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
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
    // InternalHriDsl.g:1143:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__HumansAssignment_2 ) ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1147:1: ( ( ( rule__Scenario__HumansAssignment_2 ) ) )
            // InternalHriDsl.g:1148:1: ( ( rule__Scenario__HumansAssignment_2 ) )
            {
            // InternalHriDsl.g:1148:1: ( ( rule__Scenario__HumansAssignment_2 ) )
            // InternalHriDsl.g:1149:2: ( rule__Scenario__HumansAssignment_2 )
            {
             before(grammarAccess.getScenarioAccess().getHumansAssignment_2()); 
            // InternalHriDsl.g:1150:2: ( rule__Scenario__HumansAssignment_2 )
            // InternalHriDsl.g:1150:3: rule__Scenario__HumansAssignment_2
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
    // InternalHriDsl.g:1158:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1162:1: ( rule__Scenario__Group__3__Impl )
            // InternalHriDsl.g:1163:2: rule__Scenario__Group__3__Impl
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
    // InternalHriDsl.g:1169:1: rule__Scenario__Group__3__Impl : ( ( ( rule__Scenario__MissionsAssignment_3 ) ) ( ( rule__Scenario__MissionsAssignment_3 )* ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1173:1: ( ( ( ( rule__Scenario__MissionsAssignment_3 ) ) ( ( rule__Scenario__MissionsAssignment_3 )* ) ) )
            // InternalHriDsl.g:1174:1: ( ( ( rule__Scenario__MissionsAssignment_3 ) ) ( ( rule__Scenario__MissionsAssignment_3 )* ) )
            {
            // InternalHriDsl.g:1174:1: ( ( ( rule__Scenario__MissionsAssignment_3 ) ) ( ( rule__Scenario__MissionsAssignment_3 )* ) )
            // InternalHriDsl.g:1175:2: ( ( rule__Scenario__MissionsAssignment_3 ) ) ( ( rule__Scenario__MissionsAssignment_3 )* )
            {
            // InternalHriDsl.g:1175:2: ( ( rule__Scenario__MissionsAssignment_3 ) )
            // InternalHriDsl.g:1176:3: ( rule__Scenario__MissionsAssignment_3 )
            {
             before(grammarAccess.getScenarioAccess().getMissionsAssignment_3()); 
            // InternalHriDsl.g:1177:3: ( rule__Scenario__MissionsAssignment_3 )
            // InternalHriDsl.g:1177:4: rule__Scenario__MissionsAssignment_3
            {
            pushFollow(FOLLOW_4);
            rule__Scenario__MissionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getMissionsAssignment_3()); 

            }

            // InternalHriDsl.g:1180:2: ( ( rule__Scenario__MissionsAssignment_3 )* )
            // InternalHriDsl.g:1181:3: ( rule__Scenario__MissionsAssignment_3 )*
            {
             before(grammarAccess.getScenarioAccess().getMissionsAssignment_3()); 
            // InternalHriDsl.g:1182:3: ( rule__Scenario__MissionsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==55) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==71) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalHriDsl.g:1182:4: rule__Scenario__MissionsAssignment_3
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
    // InternalHriDsl.g:1192:1: rule__Floor__Group__0 : rule__Floor__Group__0__Impl rule__Floor__Group__1 ;
    public final void rule__Floor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1196:1: ( rule__Floor__Group__0__Impl rule__Floor__Group__1 )
            // InternalHriDsl.g:1197:2: rule__Floor__Group__0__Impl rule__Floor__Group__1
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
    // InternalHriDsl.g:1204:1: rule__Floor__Group__0__Impl : ( 'define' ) ;
    public final void rule__Floor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1208:1: ( ( 'define' ) )
            // InternalHriDsl.g:1209:1: ( 'define' )
            {
            // InternalHriDsl.g:1209:1: ( 'define' )
            // InternalHriDsl.g:1210:2: 'define'
            {
             before(grammarAccess.getFloorAccess().getDefineKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalHriDsl.g:1219:1: rule__Floor__Group__1 : rule__Floor__Group__1__Impl rule__Floor__Group__2 ;
    public final void rule__Floor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1223:1: ( rule__Floor__Group__1__Impl rule__Floor__Group__2 )
            // InternalHriDsl.g:1224:2: rule__Floor__Group__1__Impl rule__Floor__Group__2
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
    // InternalHriDsl.g:1231:1: rule__Floor__Group__1__Impl : ( 'layout' ) ;
    public final void rule__Floor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1235:1: ( ( 'layout' ) )
            // InternalHriDsl.g:1236:1: ( 'layout' )
            {
            // InternalHriDsl.g:1236:1: ( 'layout' )
            // InternalHriDsl.g:1237:2: 'layout'
            {
             before(grammarAccess.getFloorAccess().getLayoutKeyword_1()); 
            match(input,56,FOLLOW_2); 
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
    // InternalHriDsl.g:1246:1: rule__Floor__Group__2 : rule__Floor__Group__2__Impl rule__Floor__Group__3 ;
    public final void rule__Floor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1250:1: ( rule__Floor__Group__2__Impl rule__Floor__Group__3 )
            // InternalHriDsl.g:1251:2: rule__Floor__Group__2__Impl rule__Floor__Group__3
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
    // InternalHriDsl.g:1258:1: rule__Floor__Group__2__Impl : ( ( rule__Floor__Floor_nameAssignment_2 ) ) ;
    public final void rule__Floor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1262:1: ( ( ( rule__Floor__Floor_nameAssignment_2 ) ) )
            // InternalHriDsl.g:1263:1: ( ( rule__Floor__Floor_nameAssignment_2 ) )
            {
            // InternalHriDsl.g:1263:1: ( ( rule__Floor__Floor_nameAssignment_2 ) )
            // InternalHriDsl.g:1264:2: ( rule__Floor__Floor_nameAssignment_2 )
            {
             before(grammarAccess.getFloorAccess().getFloor_nameAssignment_2()); 
            // InternalHriDsl.g:1265:2: ( rule__Floor__Floor_nameAssignment_2 )
            // InternalHriDsl.g:1265:3: rule__Floor__Floor_nameAssignment_2
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
    // InternalHriDsl.g:1273:1: rule__Floor__Group__3 : rule__Floor__Group__3__Impl rule__Floor__Group__4 ;
    public final void rule__Floor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1277:1: ( rule__Floor__Group__3__Impl rule__Floor__Group__4 )
            // InternalHriDsl.g:1278:2: rule__Floor__Group__3__Impl rule__Floor__Group__4
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
    // InternalHriDsl.g:1285:1: rule__Floor__Group__3__Impl : ( ':' ) ;
    public final void rule__Floor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1289:1: ( ( ':' ) )
            // InternalHriDsl.g:1290:1: ( ':' )
            {
            // InternalHriDsl.g:1290:1: ( ':' )
            // InternalHriDsl.g:1291:2: ':'
            {
             before(grammarAccess.getFloorAccess().getColonKeyword_3()); 
            match(input,57,FOLLOW_2); 
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
    // InternalHriDsl.g:1300:1: rule__Floor__Group__4 : rule__Floor__Group__4__Impl rule__Floor__Group__5 ;
    public final void rule__Floor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1304:1: ( rule__Floor__Group__4__Impl rule__Floor__Group__5 )
            // InternalHriDsl.g:1305:2: rule__Floor__Group__4__Impl rule__Floor__Group__5
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
    // InternalHriDsl.g:1312:1: rule__Floor__Group__4__Impl : ( ( ( rule__Floor__SurfacesAssignment_4 ) ) ( ( rule__Floor__SurfacesAssignment_4 )* ) ) ;
    public final void rule__Floor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1316:1: ( ( ( ( rule__Floor__SurfacesAssignment_4 ) ) ( ( rule__Floor__SurfacesAssignment_4 )* ) ) )
            // InternalHriDsl.g:1317:1: ( ( ( rule__Floor__SurfacesAssignment_4 ) ) ( ( rule__Floor__SurfacesAssignment_4 )* ) )
            {
            // InternalHriDsl.g:1317:1: ( ( ( rule__Floor__SurfacesAssignment_4 ) ) ( ( rule__Floor__SurfacesAssignment_4 )* ) )
            // InternalHriDsl.g:1318:2: ( ( rule__Floor__SurfacesAssignment_4 ) ) ( ( rule__Floor__SurfacesAssignment_4 )* )
            {
            // InternalHriDsl.g:1318:2: ( ( rule__Floor__SurfacesAssignment_4 ) )
            // InternalHriDsl.g:1319:3: ( rule__Floor__SurfacesAssignment_4 )
            {
             before(grammarAccess.getFloorAccess().getSurfacesAssignment_4()); 
            // InternalHriDsl.g:1320:3: ( rule__Floor__SurfacesAssignment_4 )
            // InternalHriDsl.g:1320:4: rule__Floor__SurfacesAssignment_4
            {
            pushFollow(FOLLOW_14);
            rule__Floor__SurfacesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getSurfacesAssignment_4()); 

            }

            // InternalHriDsl.g:1323:2: ( ( rule__Floor__SurfacesAssignment_4 )* )
            // InternalHriDsl.g:1324:3: ( rule__Floor__SurfacesAssignment_4 )*
            {
             before(grammarAccess.getFloorAccess().getSurfacesAssignment_4()); 
            // InternalHriDsl.g:1325:3: ( rule__Floor__SurfacesAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==58) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalHriDsl.g:1325:4: rule__Floor__SurfacesAssignment_4
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
    // InternalHriDsl.g:1334:1: rule__Floor__Group__5 : rule__Floor__Group__5__Impl ;
    public final void rule__Floor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1338:1: ( rule__Floor__Group__5__Impl )
            // InternalHriDsl.g:1339:2: rule__Floor__Group__5__Impl
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
    // InternalHriDsl.g:1345:1: rule__Floor__Group__5__Impl : ( ( ( rule__Floor__PointsAssignment_5 ) ) ( ( rule__Floor__PointsAssignment_5 )* ) ) ;
    public final void rule__Floor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1349:1: ( ( ( ( rule__Floor__PointsAssignment_5 ) ) ( ( rule__Floor__PointsAssignment_5 )* ) ) )
            // InternalHriDsl.g:1350:1: ( ( ( rule__Floor__PointsAssignment_5 ) ) ( ( rule__Floor__PointsAssignment_5 )* ) )
            {
            // InternalHriDsl.g:1350:1: ( ( ( rule__Floor__PointsAssignment_5 ) ) ( ( rule__Floor__PointsAssignment_5 )* ) )
            // InternalHriDsl.g:1351:2: ( ( rule__Floor__PointsAssignment_5 ) ) ( ( rule__Floor__PointsAssignment_5 )* )
            {
            // InternalHriDsl.g:1351:2: ( ( rule__Floor__PointsAssignment_5 ) )
            // InternalHriDsl.g:1352:3: ( rule__Floor__PointsAssignment_5 )
            {
             before(grammarAccess.getFloorAccess().getPointsAssignment_5()); 
            // InternalHriDsl.g:1353:3: ( rule__Floor__PointsAssignment_5 )
            // InternalHriDsl.g:1353:4: rule__Floor__PointsAssignment_5
            {
            pushFollow(FOLLOW_15);
            rule__Floor__PointsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getPointsAssignment_5()); 

            }

            // InternalHriDsl.g:1356:2: ( ( rule__Floor__PointsAssignment_5 )* )
            // InternalHriDsl.g:1357:3: ( rule__Floor__PointsAssignment_5 )*
            {
             before(grammarAccess.getFloorAccess().getPointsAssignment_5()); 
            // InternalHriDsl.g:1358:3: ( rule__Floor__PointsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==60) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalHriDsl.g:1358:4: rule__Floor__PointsAssignment_5
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
    // InternalHriDsl.g:1368:1: rule__Surface__Group__0 : rule__Surface__Group__0__Impl rule__Surface__Group__1 ;
    public final void rule__Surface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1372:1: ( rule__Surface__Group__0__Impl rule__Surface__Group__1 )
            // InternalHriDsl.g:1373:2: rule__Surface__Group__0__Impl rule__Surface__Group__1
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
    // InternalHriDsl.g:1380:1: rule__Surface__Group__0__Impl : ( 'area' ) ;
    public final void rule__Surface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1384:1: ( ( 'area' ) )
            // InternalHriDsl.g:1385:1: ( 'area' )
            {
            // InternalHriDsl.g:1385:1: ( 'area' )
            // InternalHriDsl.g:1386:2: 'area'
            {
             before(grammarAccess.getSurfaceAccess().getAreaKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalHriDsl.g:1395:1: rule__Surface__Group__1 : rule__Surface__Group__1__Impl rule__Surface__Group__2 ;
    public final void rule__Surface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1399:1: ( rule__Surface__Group__1__Impl rule__Surface__Group__2 )
            // InternalHriDsl.g:1400:2: rule__Surface__Group__1__Impl rule__Surface__Group__2
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
    // InternalHriDsl.g:1407:1: rule__Surface__Group__1__Impl : ( ( rule__Surface__NameAssignment_1 ) ) ;
    public final void rule__Surface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1411:1: ( ( ( rule__Surface__NameAssignment_1 ) ) )
            // InternalHriDsl.g:1412:1: ( ( rule__Surface__NameAssignment_1 ) )
            {
            // InternalHriDsl.g:1412:1: ( ( rule__Surface__NameAssignment_1 ) )
            // InternalHriDsl.g:1413:2: ( rule__Surface__NameAssignment_1 )
            {
             before(grammarAccess.getSurfaceAccess().getNameAssignment_1()); 
            // InternalHriDsl.g:1414:2: ( rule__Surface__NameAssignment_1 )
            // InternalHriDsl.g:1414:3: rule__Surface__NameAssignment_1
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
    // InternalHriDsl.g:1422:1: rule__Surface__Group__2 : rule__Surface__Group__2__Impl rule__Surface__Group__3 ;
    public final void rule__Surface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1426:1: ( rule__Surface__Group__2__Impl rule__Surface__Group__3 )
            // InternalHriDsl.g:1427:2: rule__Surface__Group__2__Impl rule__Surface__Group__3
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
    // InternalHriDsl.g:1434:1: rule__Surface__Group__2__Impl : ( 'in' ) ;
    public final void rule__Surface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1438:1: ( ( 'in' ) )
            // InternalHriDsl.g:1439:1: ( 'in' )
            {
            // InternalHriDsl.g:1439:1: ( 'in' )
            // InternalHriDsl.g:1440:2: 'in'
            {
             before(grammarAccess.getSurfaceAccess().getInKeyword_2()); 
            match(input,59,FOLLOW_2); 
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
    // InternalHriDsl.g:1449:1: rule__Surface__Group__3 : rule__Surface__Group__3__Impl ;
    public final void rule__Surface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1453:1: ( rule__Surface__Group__3__Impl )
            // InternalHriDsl.g:1454:2: rule__Surface__Group__3__Impl
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
    // InternalHriDsl.g:1460:1: rule__Surface__Group__3__Impl : ( ( rule__Surface__VerticesAssignment_3 ) ) ;
    public final void rule__Surface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1464:1: ( ( ( rule__Surface__VerticesAssignment_3 ) ) )
            // InternalHriDsl.g:1465:1: ( ( rule__Surface__VerticesAssignment_3 ) )
            {
            // InternalHriDsl.g:1465:1: ( ( rule__Surface__VerticesAssignment_3 ) )
            // InternalHriDsl.g:1466:2: ( rule__Surface__VerticesAssignment_3 )
            {
             before(grammarAccess.getSurfaceAccess().getVerticesAssignment_3()); 
            // InternalHriDsl.g:1467:2: ( rule__Surface__VerticesAssignment_3 )
            // InternalHriDsl.g:1467:3: rule__Surface__VerticesAssignment_3
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
    // InternalHriDsl.g:1476:1: rule__Vertices__Group__0 : rule__Vertices__Group__0__Impl rule__Vertices__Group__1 ;
    public final void rule__Vertices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1480:1: ( rule__Vertices__Group__0__Impl rule__Vertices__Group__1 )
            // InternalHriDsl.g:1481:2: rule__Vertices__Group__0__Impl rule__Vertices__Group__1
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
    // InternalHriDsl.g:1488:1: rule__Vertices__Group__0__Impl : ( ( rule__Vertices__Vertex_AAssignment_0 ) ) ;
    public final void rule__Vertices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1492:1: ( ( ( rule__Vertices__Vertex_AAssignment_0 ) ) )
            // InternalHriDsl.g:1493:1: ( ( rule__Vertices__Vertex_AAssignment_0 ) )
            {
            // InternalHriDsl.g:1493:1: ( ( rule__Vertices__Vertex_AAssignment_0 ) )
            // InternalHriDsl.g:1494:2: ( rule__Vertices__Vertex_AAssignment_0 )
            {
             before(grammarAccess.getVerticesAccess().getVertex_AAssignment_0()); 
            // InternalHriDsl.g:1495:2: ( rule__Vertices__Vertex_AAssignment_0 )
            // InternalHriDsl.g:1495:3: rule__Vertices__Vertex_AAssignment_0
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
    // InternalHriDsl.g:1503:1: rule__Vertices__Group__1 : rule__Vertices__Group__1__Impl ;
    public final void rule__Vertices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1507:1: ( rule__Vertices__Group__1__Impl )
            // InternalHriDsl.g:1508:2: rule__Vertices__Group__1__Impl
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
    // InternalHriDsl.g:1514:1: rule__Vertices__Group__1__Impl : ( ( rule__Vertices__Vertex_CAssignment_1 ) ) ;
    public final void rule__Vertices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1518:1: ( ( ( rule__Vertices__Vertex_CAssignment_1 ) ) )
            // InternalHriDsl.g:1519:1: ( ( rule__Vertices__Vertex_CAssignment_1 ) )
            {
            // InternalHriDsl.g:1519:1: ( ( rule__Vertices__Vertex_CAssignment_1 ) )
            // InternalHriDsl.g:1520:2: ( rule__Vertices__Vertex_CAssignment_1 )
            {
             before(grammarAccess.getVerticesAccess().getVertex_CAssignment_1()); 
            // InternalHriDsl.g:1521:2: ( rule__Vertices__Vertex_CAssignment_1 )
            // InternalHriDsl.g:1521:3: rule__Vertices__Vertex_CAssignment_1
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
    // InternalHriDsl.g:1530:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1534:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalHriDsl.g:1535:2: rule__Point__Group__0__Impl rule__Point__Group__1
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
    // InternalHriDsl.g:1542:1: rule__Point__Group__0__Impl : ( 'poi' ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1546:1: ( ( 'poi' ) )
            // InternalHriDsl.g:1547:1: ( 'poi' )
            {
            // InternalHriDsl.g:1547:1: ( 'poi' )
            // InternalHriDsl.g:1548:2: 'poi'
            {
             before(grammarAccess.getPointAccess().getPoiKeyword_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalHriDsl.g:1557:1: rule__Point__Group__1 : rule__Point__Group__1__Impl rule__Point__Group__2 ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1561:1: ( rule__Point__Group__1__Impl rule__Point__Group__2 )
            // InternalHriDsl.g:1562:2: rule__Point__Group__1__Impl rule__Point__Group__2
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
    // InternalHriDsl.g:1569:1: rule__Point__Group__1__Impl : ( ( rule__Point__NameAssignment_1 ) ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1573:1: ( ( ( rule__Point__NameAssignment_1 ) ) )
            // InternalHriDsl.g:1574:1: ( ( rule__Point__NameAssignment_1 ) )
            {
            // InternalHriDsl.g:1574:1: ( ( rule__Point__NameAssignment_1 ) )
            // InternalHriDsl.g:1575:2: ( rule__Point__NameAssignment_1 )
            {
             before(grammarAccess.getPointAccess().getNameAssignment_1()); 
            // InternalHriDsl.g:1576:2: ( rule__Point__NameAssignment_1 )
            // InternalHriDsl.g:1576:3: rule__Point__NameAssignment_1
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
    // InternalHriDsl.g:1584:1: rule__Point__Group__2 : rule__Point__Group__2__Impl rule__Point__Group__3 ;
    public final void rule__Point__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1588:1: ( rule__Point__Group__2__Impl rule__Point__Group__3 )
            // InternalHriDsl.g:1589:2: rule__Point__Group__2__Impl rule__Point__Group__3
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
    // InternalHriDsl.g:1596:1: rule__Point__Group__2__Impl : ( 'in' ) ;
    public final void rule__Point__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1600:1: ( ( 'in' ) )
            // InternalHriDsl.g:1601:1: ( 'in' )
            {
            // InternalHriDsl.g:1601:1: ( 'in' )
            // InternalHriDsl.g:1602:2: 'in'
            {
             before(grammarAccess.getPointAccess().getInKeyword_2()); 
            match(input,59,FOLLOW_2); 
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
    // InternalHriDsl.g:1611:1: rule__Point__Group__3 : rule__Point__Group__3__Impl ;
    public final void rule__Point__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1615:1: ( rule__Point__Group__3__Impl )
            // InternalHriDsl.g:1616:2: rule__Point__Group__3__Impl
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
    // InternalHriDsl.g:1622:1: rule__Point__Group__3__Impl : ( ( rule__Point__CoordinatesAssignment_3 ) ) ;
    public final void rule__Point__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1626:1: ( ( ( rule__Point__CoordinatesAssignment_3 ) ) )
            // InternalHriDsl.g:1627:1: ( ( rule__Point__CoordinatesAssignment_3 ) )
            {
            // InternalHriDsl.g:1627:1: ( ( rule__Point__CoordinatesAssignment_3 ) )
            // InternalHriDsl.g:1628:2: ( rule__Point__CoordinatesAssignment_3 )
            {
             before(grammarAccess.getPointAccess().getCoordinatesAssignment_3()); 
            // InternalHriDsl.g:1629:2: ( rule__Point__CoordinatesAssignment_3 )
            // InternalHriDsl.g:1629:3: rule__Point__CoordinatesAssignment_3
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
    // InternalHriDsl.g:1638:1: rule__Robots__Group__0 : rule__Robots__Group__0__Impl rule__Robots__Group__1 ;
    public final void rule__Robots__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1642:1: ( rule__Robots__Group__0__Impl rule__Robots__Group__1 )
            // InternalHriDsl.g:1643:2: rule__Robots__Group__0__Impl rule__Robots__Group__1
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
    // InternalHriDsl.g:1650:1: rule__Robots__Group__0__Impl : ( 'define' ) ;
    public final void rule__Robots__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1654:1: ( ( 'define' ) )
            // InternalHriDsl.g:1655:1: ( 'define' )
            {
            // InternalHriDsl.g:1655:1: ( 'define' )
            // InternalHriDsl.g:1656:2: 'define'
            {
             before(grammarAccess.getRobotsAccess().getDefineKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalHriDsl.g:1665:1: rule__Robots__Group__1 : rule__Robots__Group__1__Impl rule__Robots__Group__2 ;
    public final void rule__Robots__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1669:1: ( rule__Robots__Group__1__Impl rule__Robots__Group__2 )
            // InternalHriDsl.g:1670:2: rule__Robots__Group__1__Impl rule__Robots__Group__2
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
    // InternalHriDsl.g:1677:1: rule__Robots__Group__1__Impl : ( 'robots' ) ;
    public final void rule__Robots__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1681:1: ( ( 'robots' ) )
            // InternalHriDsl.g:1682:1: ( 'robots' )
            {
            // InternalHriDsl.g:1682:1: ( 'robots' )
            // InternalHriDsl.g:1683:2: 'robots'
            {
             before(grammarAccess.getRobotsAccess().getRobotsKeyword_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalHriDsl.g:1692:1: rule__Robots__Group__2 : rule__Robots__Group__2__Impl rule__Robots__Group__3 ;
    public final void rule__Robots__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1696:1: ( rule__Robots__Group__2__Impl rule__Robots__Group__3 )
            // InternalHriDsl.g:1697:2: rule__Robots__Group__2__Impl rule__Robots__Group__3
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
    // InternalHriDsl.g:1704:1: rule__Robots__Group__2__Impl : ( ':' ) ;
    public final void rule__Robots__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1708:1: ( ( ':' ) )
            // InternalHriDsl.g:1709:1: ( ':' )
            {
            // InternalHriDsl.g:1709:1: ( ':' )
            // InternalHriDsl.g:1710:2: ':'
            {
             before(grammarAccess.getRobotsAccess().getColonKeyword_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalHriDsl.g:1719:1: rule__Robots__Group__3 : rule__Robots__Group__3__Impl ;
    public final void rule__Robots__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1723:1: ( rule__Robots__Group__3__Impl )
            // InternalHriDsl.g:1724:2: rule__Robots__Group__3__Impl
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
    // InternalHriDsl.g:1730:1: rule__Robots__Group__3__Impl : ( ( ( rule__Robots__RobotsAssignment_3 ) ) ( ( rule__Robots__RobotsAssignment_3 )* ) ) ;
    public final void rule__Robots__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1734:1: ( ( ( ( rule__Robots__RobotsAssignment_3 ) ) ( ( rule__Robots__RobotsAssignment_3 )* ) ) )
            // InternalHriDsl.g:1735:1: ( ( ( rule__Robots__RobotsAssignment_3 ) ) ( ( rule__Robots__RobotsAssignment_3 )* ) )
            {
            // InternalHriDsl.g:1735:1: ( ( ( rule__Robots__RobotsAssignment_3 ) ) ( ( rule__Robots__RobotsAssignment_3 )* ) )
            // InternalHriDsl.g:1736:2: ( ( rule__Robots__RobotsAssignment_3 ) ) ( ( rule__Robots__RobotsAssignment_3 )* )
            {
            // InternalHriDsl.g:1736:2: ( ( rule__Robots__RobotsAssignment_3 ) )
            // InternalHriDsl.g:1737:3: ( rule__Robots__RobotsAssignment_3 )
            {
             before(grammarAccess.getRobotsAccess().getRobotsAssignment_3()); 
            // InternalHriDsl.g:1738:3: ( rule__Robots__RobotsAssignment_3 )
            // InternalHriDsl.g:1738:4: rule__Robots__RobotsAssignment_3
            {
            pushFollow(FOLLOW_20);
            rule__Robots__RobotsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRobotsAccess().getRobotsAssignment_3()); 

            }

            // InternalHriDsl.g:1741:2: ( ( rule__Robots__RobotsAssignment_3 )* )
            // InternalHriDsl.g:1742:3: ( rule__Robots__RobotsAssignment_3 )*
            {
             before(grammarAccess.getRobotsAccess().getRobotsAssignment_3()); 
            // InternalHriDsl.g:1743:3: ( rule__Robots__RobotsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==62) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalHriDsl.g:1743:4: rule__Robots__RobotsAssignment_3
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
    // InternalHriDsl.g:1753:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1757:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalHriDsl.g:1758:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
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
    // InternalHriDsl.g:1765:1: rule__Robot__Group__0__Impl : ( 'robot' ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1769:1: ( ( 'robot' ) )
            // InternalHriDsl.g:1770:1: ( 'robot' )
            {
            // InternalHriDsl.g:1770:1: ( 'robot' )
            // InternalHriDsl.g:1771:2: 'robot'
            {
             before(grammarAccess.getRobotAccess().getRobotKeyword_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalHriDsl.g:1780:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1784:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalHriDsl.g:1785:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
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
    // InternalHriDsl.g:1792:1: rule__Robot__Group__1__Impl : ( ( rule__Robot__NameAssignment_1 ) ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1796:1: ( ( ( rule__Robot__NameAssignment_1 ) ) )
            // InternalHriDsl.g:1797:1: ( ( rule__Robot__NameAssignment_1 ) )
            {
            // InternalHriDsl.g:1797:1: ( ( rule__Robot__NameAssignment_1 ) )
            // InternalHriDsl.g:1798:2: ( rule__Robot__NameAssignment_1 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_1()); 
            // InternalHriDsl.g:1799:2: ( rule__Robot__NameAssignment_1 )
            // InternalHriDsl.g:1799:3: rule__Robot__NameAssignment_1
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
    // InternalHriDsl.g:1807:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl rule__Robot__Group__3 ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1811:1: ( rule__Robot__Group__2__Impl rule__Robot__Group__3 )
            // InternalHriDsl.g:1812:2: rule__Robot__Group__2__Impl rule__Robot__Group__3
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
    // InternalHriDsl.g:1819:1: rule__Robot__Group__2__Impl : ( 'in' ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1823:1: ( ( 'in' ) )
            // InternalHriDsl.g:1824:1: ( 'in' )
            {
            // InternalHriDsl.g:1824:1: ( 'in' )
            // InternalHriDsl.g:1825:2: 'in'
            {
             before(grammarAccess.getRobotAccess().getInKeyword_2()); 
            match(input,59,FOLLOW_2); 
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
    // InternalHriDsl.g:1834:1: rule__Robot__Group__3 : rule__Robot__Group__3__Impl rule__Robot__Group__4 ;
    public final void rule__Robot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1838:1: ( rule__Robot__Group__3__Impl rule__Robot__Group__4 )
            // InternalHriDsl.g:1839:2: rule__Robot__Group__3__Impl rule__Robot__Group__4
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
    // InternalHriDsl.g:1846:1: rule__Robot__Group__3__Impl : ( ( rule__Robot__CoordinatesAssignment_3 ) ) ;
    public final void rule__Robot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1850:1: ( ( ( rule__Robot__CoordinatesAssignment_3 ) ) )
            // InternalHriDsl.g:1851:1: ( ( rule__Robot__CoordinatesAssignment_3 ) )
            {
            // InternalHriDsl.g:1851:1: ( ( rule__Robot__CoordinatesAssignment_3 ) )
            // InternalHriDsl.g:1852:2: ( rule__Robot__CoordinatesAssignment_3 )
            {
             before(grammarAccess.getRobotAccess().getCoordinatesAssignment_3()); 
            // InternalHriDsl.g:1853:2: ( rule__Robot__CoordinatesAssignment_3 )
            // InternalHriDsl.g:1853:3: rule__Robot__CoordinatesAssignment_3
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
    // InternalHriDsl.g:1861:1: rule__Robot__Group__4 : rule__Robot__Group__4__Impl rule__Robot__Group__5 ;
    public final void rule__Robot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1865:1: ( rule__Robot__Group__4__Impl rule__Robot__Group__5 )
            // InternalHriDsl.g:1866:2: rule__Robot__Group__4__Impl rule__Robot__Group__5
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
    // InternalHriDsl.g:1873:1: rule__Robot__Group__4__Impl : ( 'type' ) ;
    public final void rule__Robot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1877:1: ( ( 'type' ) )
            // InternalHriDsl.g:1878:1: ( 'type' )
            {
            // InternalHriDsl.g:1878:1: ( 'type' )
            // InternalHriDsl.g:1879:2: 'type'
            {
             before(grammarAccess.getRobotAccess().getTypeKeyword_4()); 
            match(input,63,FOLLOW_2); 
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
    // InternalHriDsl.g:1888:1: rule__Robot__Group__5 : rule__Robot__Group__5__Impl rule__Robot__Group__6 ;
    public final void rule__Robot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1892:1: ( rule__Robot__Group__5__Impl rule__Robot__Group__6 )
            // InternalHriDsl.g:1893:2: rule__Robot__Group__5__Impl rule__Robot__Group__6
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
    // InternalHriDsl.g:1900:1: rule__Robot__Group__5__Impl : ( ( rule__Robot__TypeAssignment_5 ) ) ;
    public final void rule__Robot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1904:1: ( ( ( rule__Robot__TypeAssignment_5 ) ) )
            // InternalHriDsl.g:1905:1: ( ( rule__Robot__TypeAssignment_5 ) )
            {
            // InternalHriDsl.g:1905:1: ( ( rule__Robot__TypeAssignment_5 ) )
            // InternalHriDsl.g:1906:2: ( rule__Robot__TypeAssignment_5 )
            {
             before(grammarAccess.getRobotAccess().getTypeAssignment_5()); 
            // InternalHriDsl.g:1907:2: ( rule__Robot__TypeAssignment_5 )
            // InternalHriDsl.g:1907:3: rule__Robot__TypeAssignment_5
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
    // InternalHriDsl.g:1915:1: rule__Robot__Group__6 : rule__Robot__Group__6__Impl rule__Robot__Group__7 ;
    public final void rule__Robot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1919:1: ( rule__Robot__Group__6__Impl rule__Robot__Group__7 )
            // InternalHriDsl.g:1920:2: rule__Robot__Group__6__Impl rule__Robot__Group__7
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
    // InternalHriDsl.g:1927:1: rule__Robot__Group__6__Impl : ( 'charge' ) ;
    public final void rule__Robot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1931:1: ( ( 'charge' ) )
            // InternalHriDsl.g:1932:1: ( 'charge' )
            {
            // InternalHriDsl.g:1932:1: ( 'charge' )
            // InternalHriDsl.g:1933:2: 'charge'
            {
             before(grammarAccess.getRobotAccess().getChargeKeyword_6()); 
            match(input,64,FOLLOW_2); 
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
    // InternalHriDsl.g:1942:1: rule__Robot__Group__7 : rule__Robot__Group__7__Impl ;
    public final void rule__Robot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1946:1: ( rule__Robot__Group__7__Impl )
            // InternalHriDsl.g:1947:2: rule__Robot__Group__7__Impl
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
    // InternalHriDsl.g:1953:1: rule__Robot__Group__7__Impl : ( ( rule__Robot__Charge_percentageAssignment_7 ) ) ;
    public final void rule__Robot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1957:1: ( ( ( rule__Robot__Charge_percentageAssignment_7 ) ) )
            // InternalHriDsl.g:1958:1: ( ( rule__Robot__Charge_percentageAssignment_7 ) )
            {
            // InternalHriDsl.g:1958:1: ( ( rule__Robot__Charge_percentageAssignment_7 ) )
            // InternalHriDsl.g:1959:2: ( rule__Robot__Charge_percentageAssignment_7 )
            {
             before(grammarAccess.getRobotAccess().getCharge_percentageAssignment_7()); 
            // InternalHriDsl.g:1960:2: ( rule__Robot__Charge_percentageAssignment_7 )
            // InternalHriDsl.g:1960:3: rule__Robot__Charge_percentageAssignment_7
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
    // InternalHriDsl.g:1969:1: rule__Humans__Group__0 : rule__Humans__Group__0__Impl rule__Humans__Group__1 ;
    public final void rule__Humans__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1973:1: ( rule__Humans__Group__0__Impl rule__Humans__Group__1 )
            // InternalHriDsl.g:1974:2: rule__Humans__Group__0__Impl rule__Humans__Group__1
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
    // InternalHriDsl.g:1981:1: rule__Humans__Group__0__Impl : ( 'define' ) ;
    public final void rule__Humans__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:1985:1: ( ( 'define' ) )
            // InternalHriDsl.g:1986:1: ( 'define' )
            {
            // InternalHriDsl.g:1986:1: ( 'define' )
            // InternalHriDsl.g:1987:2: 'define'
            {
             before(grammarAccess.getHumansAccess().getDefineKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalHriDsl.g:1996:1: rule__Humans__Group__1 : rule__Humans__Group__1__Impl rule__Humans__Group__2 ;
    public final void rule__Humans__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2000:1: ( rule__Humans__Group__1__Impl rule__Humans__Group__2 )
            // InternalHriDsl.g:2001:2: rule__Humans__Group__1__Impl rule__Humans__Group__2
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
    // InternalHriDsl.g:2008:1: rule__Humans__Group__1__Impl : ( 'humans' ) ;
    public final void rule__Humans__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2012:1: ( ( 'humans' ) )
            // InternalHriDsl.g:2013:1: ( 'humans' )
            {
            // InternalHriDsl.g:2013:1: ( 'humans' )
            // InternalHriDsl.g:2014:2: 'humans'
            {
             before(grammarAccess.getHumansAccess().getHumansKeyword_1()); 
            match(input,65,FOLLOW_2); 
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
    // InternalHriDsl.g:2023:1: rule__Humans__Group__2 : rule__Humans__Group__2__Impl rule__Humans__Group__3 ;
    public final void rule__Humans__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2027:1: ( rule__Humans__Group__2__Impl rule__Humans__Group__3 )
            // InternalHriDsl.g:2028:2: rule__Humans__Group__2__Impl rule__Humans__Group__3
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
    // InternalHriDsl.g:2035:1: rule__Humans__Group__2__Impl : ( ':' ) ;
    public final void rule__Humans__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2039:1: ( ( ':' ) )
            // InternalHriDsl.g:2040:1: ( ':' )
            {
            // InternalHriDsl.g:2040:1: ( ':' )
            // InternalHriDsl.g:2041:2: ':'
            {
             before(grammarAccess.getHumansAccess().getColonKeyword_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalHriDsl.g:2050:1: rule__Humans__Group__3 : rule__Humans__Group__3__Impl ;
    public final void rule__Humans__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2054:1: ( rule__Humans__Group__3__Impl )
            // InternalHriDsl.g:2055:2: rule__Humans__Group__3__Impl
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
    // InternalHriDsl.g:2061:1: rule__Humans__Group__3__Impl : ( ( ( rule__Humans__HumansAssignment_3 ) ) ( ( rule__Humans__HumansAssignment_3 )* ) ) ;
    public final void rule__Humans__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2065:1: ( ( ( ( rule__Humans__HumansAssignment_3 ) ) ( ( rule__Humans__HumansAssignment_3 )* ) ) )
            // InternalHriDsl.g:2066:1: ( ( ( rule__Humans__HumansAssignment_3 ) ) ( ( rule__Humans__HumansAssignment_3 )* ) )
            {
            // InternalHriDsl.g:2066:1: ( ( ( rule__Humans__HumansAssignment_3 ) ) ( ( rule__Humans__HumansAssignment_3 )* ) )
            // InternalHriDsl.g:2067:2: ( ( rule__Humans__HumansAssignment_3 ) ) ( ( rule__Humans__HumansAssignment_3 )* )
            {
            // InternalHriDsl.g:2067:2: ( ( rule__Humans__HumansAssignment_3 ) )
            // InternalHriDsl.g:2068:3: ( rule__Humans__HumansAssignment_3 )
            {
             before(grammarAccess.getHumansAccess().getHumansAssignment_3()); 
            // InternalHriDsl.g:2069:3: ( rule__Humans__HumansAssignment_3 )
            // InternalHriDsl.g:2069:4: rule__Humans__HumansAssignment_3
            {
            pushFollow(FOLLOW_27);
            rule__Humans__HumansAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHumansAccess().getHumansAssignment_3()); 

            }

            // InternalHriDsl.g:2072:2: ( ( rule__Humans__HumansAssignment_3 )* )
            // InternalHriDsl.g:2073:3: ( rule__Humans__HumansAssignment_3 )*
            {
             before(grammarAccess.getHumansAccess().getHumansAssignment_3()); 
            // InternalHriDsl.g:2074:3: ( rule__Humans__HumansAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==66) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalHriDsl.g:2074:4: rule__Humans__HumansAssignment_3
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
    // InternalHriDsl.g:2084:1: rule__Human__Group__0 : rule__Human__Group__0__Impl rule__Human__Group__1 ;
    public final void rule__Human__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2088:1: ( rule__Human__Group__0__Impl rule__Human__Group__1 )
            // InternalHriDsl.g:2089:2: rule__Human__Group__0__Impl rule__Human__Group__1
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
    // InternalHriDsl.g:2096:1: rule__Human__Group__0__Impl : ( 'human' ) ;
    public final void rule__Human__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2100:1: ( ( 'human' ) )
            // InternalHriDsl.g:2101:1: ( 'human' )
            {
            // InternalHriDsl.g:2101:1: ( 'human' )
            // InternalHriDsl.g:2102:2: 'human'
            {
             before(grammarAccess.getHumanAccess().getHumanKeyword_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalHriDsl.g:2111:1: rule__Human__Group__1 : rule__Human__Group__1__Impl rule__Human__Group__2 ;
    public final void rule__Human__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2115:1: ( rule__Human__Group__1__Impl rule__Human__Group__2 )
            // InternalHriDsl.g:2116:2: rule__Human__Group__1__Impl rule__Human__Group__2
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
    // InternalHriDsl.g:2123:1: rule__Human__Group__1__Impl : ( ( rule__Human__NameAssignment_1 ) ) ;
    public final void rule__Human__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2127:1: ( ( ( rule__Human__NameAssignment_1 ) ) )
            // InternalHriDsl.g:2128:1: ( ( rule__Human__NameAssignment_1 ) )
            {
            // InternalHriDsl.g:2128:1: ( ( rule__Human__NameAssignment_1 ) )
            // InternalHriDsl.g:2129:2: ( rule__Human__NameAssignment_1 )
            {
             before(grammarAccess.getHumanAccess().getNameAssignment_1()); 
            // InternalHriDsl.g:2130:2: ( rule__Human__NameAssignment_1 )
            // InternalHriDsl.g:2130:3: rule__Human__NameAssignment_1
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
    // InternalHriDsl.g:2138:1: rule__Human__Group__2 : rule__Human__Group__2__Impl rule__Human__Group__3 ;
    public final void rule__Human__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2142:1: ( rule__Human__Group__2__Impl rule__Human__Group__3 )
            // InternalHriDsl.g:2143:2: rule__Human__Group__2__Impl rule__Human__Group__3
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
    // InternalHriDsl.g:2150:1: rule__Human__Group__2__Impl : ( 'in' ) ;
    public final void rule__Human__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2154:1: ( ( 'in' ) )
            // InternalHriDsl.g:2155:1: ( 'in' )
            {
            // InternalHriDsl.g:2155:1: ( 'in' )
            // InternalHriDsl.g:2156:2: 'in'
            {
             before(grammarAccess.getHumanAccess().getInKeyword_2()); 
            match(input,59,FOLLOW_2); 
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
    // InternalHriDsl.g:2165:1: rule__Human__Group__3 : rule__Human__Group__3__Impl rule__Human__Group__4 ;
    public final void rule__Human__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2169:1: ( rule__Human__Group__3__Impl rule__Human__Group__4 )
            // InternalHriDsl.g:2170:2: rule__Human__Group__3__Impl rule__Human__Group__4
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
    // InternalHriDsl.g:2177:1: rule__Human__Group__3__Impl : ( ( rule__Human__CoordinatesAssignment_3 ) ) ;
    public final void rule__Human__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2181:1: ( ( ( rule__Human__CoordinatesAssignment_3 ) ) )
            // InternalHriDsl.g:2182:1: ( ( rule__Human__CoordinatesAssignment_3 ) )
            {
            // InternalHriDsl.g:2182:1: ( ( rule__Human__CoordinatesAssignment_3 ) )
            // InternalHriDsl.g:2183:2: ( rule__Human__CoordinatesAssignment_3 )
            {
             before(grammarAccess.getHumanAccess().getCoordinatesAssignment_3()); 
            // InternalHriDsl.g:2184:2: ( rule__Human__CoordinatesAssignment_3 )
            // InternalHriDsl.g:2184:3: rule__Human__CoordinatesAssignment_3
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
    // InternalHriDsl.g:2192:1: rule__Human__Group__4 : rule__Human__Group__4__Impl rule__Human__Group__5 ;
    public final void rule__Human__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2196:1: ( rule__Human__Group__4__Impl rule__Human__Group__5 )
            // InternalHriDsl.g:2197:2: rule__Human__Group__4__Impl rule__Human__Group__5
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
    // InternalHriDsl.g:2204:1: rule__Human__Group__4__Impl : ( 'speed' ) ;
    public final void rule__Human__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2208:1: ( ( 'speed' ) )
            // InternalHriDsl.g:2209:1: ( 'speed' )
            {
            // InternalHriDsl.g:2209:1: ( 'speed' )
            // InternalHriDsl.g:2210:2: 'speed'
            {
             before(grammarAccess.getHumanAccess().getSpeedKeyword_4()); 
            match(input,67,FOLLOW_2); 
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
    // InternalHriDsl.g:2219:1: rule__Human__Group__5 : rule__Human__Group__5__Impl rule__Human__Group__6 ;
    public final void rule__Human__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2223:1: ( rule__Human__Group__5__Impl rule__Human__Group__6 )
            // InternalHriDsl.g:2224:2: rule__Human__Group__5__Impl rule__Human__Group__6
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
    // InternalHriDsl.g:2231:1: rule__Human__Group__5__Impl : ( ( rule__Human__SpeedAssignment_5 ) ) ;
    public final void rule__Human__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2235:1: ( ( ( rule__Human__SpeedAssignment_5 ) ) )
            // InternalHriDsl.g:2236:1: ( ( rule__Human__SpeedAssignment_5 ) )
            {
            // InternalHriDsl.g:2236:1: ( ( rule__Human__SpeedAssignment_5 ) )
            // InternalHriDsl.g:2237:2: ( rule__Human__SpeedAssignment_5 )
            {
             before(grammarAccess.getHumanAccess().getSpeedAssignment_5()); 
            // InternalHriDsl.g:2238:2: ( rule__Human__SpeedAssignment_5 )
            // InternalHriDsl.g:2238:3: rule__Human__SpeedAssignment_5
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
    // InternalHriDsl.g:2246:1: rule__Human__Group__6 : rule__Human__Group__6__Impl rule__Human__Group__7 ;
    public final void rule__Human__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2250:1: ( rule__Human__Group__6__Impl rule__Human__Group__7 )
            // InternalHriDsl.g:2251:2: rule__Human__Group__6__Impl rule__Human__Group__7
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
    // InternalHriDsl.g:2258:1: rule__Human__Group__6__Impl : ( 'dexterity' ) ;
    public final void rule__Human__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2262:1: ( ( 'dexterity' ) )
            // InternalHriDsl.g:2263:1: ( 'dexterity' )
            {
            // InternalHriDsl.g:2263:1: ( 'dexterity' )
            // InternalHriDsl.g:2264:2: 'dexterity'
            {
             before(grammarAccess.getHumanAccess().getDexterityKeyword_6()); 
            match(input,68,FOLLOW_2); 
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
    // InternalHriDsl.g:2273:1: rule__Human__Group__7 : rule__Human__Group__7__Impl rule__Human__Group__8 ;
    public final void rule__Human__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2277:1: ( rule__Human__Group__7__Impl rule__Human__Group__8 )
            // InternalHriDsl.g:2278:2: rule__Human__Group__7__Impl rule__Human__Group__8
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
    // InternalHriDsl.g:2285:1: rule__Human__Group__7__Impl : ( ( rule__Human__DextAssignment_7 ) ) ;
    public final void rule__Human__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2289:1: ( ( ( rule__Human__DextAssignment_7 ) ) )
            // InternalHriDsl.g:2290:1: ( ( rule__Human__DextAssignment_7 ) )
            {
            // InternalHriDsl.g:2290:1: ( ( rule__Human__DextAssignment_7 ) )
            // InternalHriDsl.g:2291:2: ( rule__Human__DextAssignment_7 )
            {
             before(grammarAccess.getHumanAccess().getDextAssignment_7()); 
            // InternalHriDsl.g:2292:2: ( rule__Human__DextAssignment_7 )
            // InternalHriDsl.g:2292:3: rule__Human__DextAssignment_7
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
    // InternalHriDsl.g:2300:1: rule__Human__Group__8 : rule__Human__Group__8__Impl rule__Human__Group__9 ;
    public final void rule__Human__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2304:1: ( rule__Human__Group__8__Impl rule__Human__Group__9 )
            // InternalHriDsl.g:2305:2: rule__Human__Group__8__Impl rule__Human__Group__9
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
    // InternalHriDsl.g:2312:1: rule__Human__Group__8__Impl : ( 'is' ) ;
    public final void rule__Human__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2316:1: ( ( 'is' ) )
            // InternalHriDsl.g:2317:1: ( 'is' )
            {
            // InternalHriDsl.g:2317:1: ( 'is' )
            // InternalHriDsl.g:2318:2: 'is'
            {
             before(grammarAccess.getHumanAccess().getIsKeyword_8()); 
            match(input,69,FOLLOW_2); 
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
    // InternalHriDsl.g:2327:1: rule__Human__Group__9 : rule__Human__Group__9__Impl rule__Human__Group__10 ;
    public final void rule__Human__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2331:1: ( rule__Human__Group__9__Impl rule__Human__Group__10 )
            // InternalHriDsl.g:2332:2: rule__Human__Group__9__Impl rule__Human__Group__10
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
    // InternalHriDsl.g:2339:1: rule__Human__Group__9__Impl : ( ( rule__Human__Fatigue_profileAssignment_9 ) ) ;
    public final void rule__Human__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2343:1: ( ( ( rule__Human__Fatigue_profileAssignment_9 ) ) )
            // InternalHriDsl.g:2344:1: ( ( rule__Human__Fatigue_profileAssignment_9 ) )
            {
            // InternalHriDsl.g:2344:1: ( ( rule__Human__Fatigue_profileAssignment_9 ) )
            // InternalHriDsl.g:2345:2: ( rule__Human__Fatigue_profileAssignment_9 )
            {
             before(grammarAccess.getHumanAccess().getFatigue_profileAssignment_9()); 
            // InternalHriDsl.g:2346:2: ( rule__Human__Fatigue_profileAssignment_9 )
            // InternalHriDsl.g:2346:3: rule__Human__Fatigue_profileAssignment_9
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
    // InternalHriDsl.g:2354:1: rule__Human__Group__10 : rule__Human__Group__10__Impl rule__Human__Group__11 ;
    public final void rule__Human__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2358:1: ( rule__Human__Group__10__Impl rule__Human__Group__11 )
            // InternalHriDsl.g:2359:2: rule__Human__Group__10__Impl rule__Human__Group__11
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
    // InternalHriDsl.g:2366:1: rule__Human__Group__10__Impl : ( 'freewill' ) ;
    public final void rule__Human__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2370:1: ( ( 'freewill' ) )
            // InternalHriDsl.g:2371:1: ( 'freewill' )
            {
            // InternalHriDsl.g:2371:1: ( 'freewill' )
            // InternalHriDsl.g:2372:2: 'freewill'
            {
             before(grammarAccess.getHumanAccess().getFreewillKeyword_10()); 
            match(input,70,FOLLOW_2); 
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
    // InternalHriDsl.g:2381:1: rule__Human__Group__11 : rule__Human__Group__11__Impl ;
    public final void rule__Human__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2385:1: ( rule__Human__Group__11__Impl )
            // InternalHriDsl.g:2386:2: rule__Human__Group__11__Impl
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
    // InternalHriDsl.g:2392:1: rule__Human__Group__11__Impl : ( ( rule__Human__Free_will_profileAssignment_11 ) ) ;
    public final void rule__Human__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2396:1: ( ( ( rule__Human__Free_will_profileAssignment_11 ) ) )
            // InternalHriDsl.g:2397:1: ( ( rule__Human__Free_will_profileAssignment_11 ) )
            {
            // InternalHriDsl.g:2397:1: ( ( rule__Human__Free_will_profileAssignment_11 ) )
            // InternalHriDsl.g:2398:2: ( rule__Human__Free_will_profileAssignment_11 )
            {
             before(grammarAccess.getHumanAccess().getFree_will_profileAssignment_11()); 
            // InternalHriDsl.g:2399:2: ( rule__Human__Free_will_profileAssignment_11 )
            // InternalHriDsl.g:2399:3: rule__Human__Free_will_profileAssignment_11
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
    // InternalHriDsl.g:2408:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2412:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalHriDsl.g:2413:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
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
    // InternalHriDsl.g:2420:1: rule__Mission__Group__0__Impl : ( 'define' ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2424:1: ( ( 'define' ) )
            // InternalHriDsl.g:2425:1: ( 'define' )
            {
            // InternalHriDsl.g:2425:1: ( 'define' )
            // InternalHriDsl.g:2426:2: 'define'
            {
             before(grammarAccess.getMissionAccess().getDefineKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalHriDsl.g:2435:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl rule__Mission__Group__2 ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2439:1: ( rule__Mission__Group__1__Impl rule__Mission__Group__2 )
            // InternalHriDsl.g:2440:2: rule__Mission__Group__1__Impl rule__Mission__Group__2
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
    // InternalHriDsl.g:2447:1: rule__Mission__Group__1__Impl : ( 'mission' ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2451:1: ( ( 'mission' ) )
            // InternalHriDsl.g:2452:1: ( 'mission' )
            {
            // InternalHriDsl.g:2452:1: ( 'mission' )
            // InternalHriDsl.g:2453:2: 'mission'
            {
             before(grammarAccess.getMissionAccess().getMissionKeyword_1()); 
            match(input,71,FOLLOW_2); 
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
    // InternalHriDsl.g:2462:1: rule__Mission__Group__2 : rule__Mission__Group__2__Impl rule__Mission__Group__3 ;
    public final void rule__Mission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2466:1: ( rule__Mission__Group__2__Impl rule__Mission__Group__3 )
            // InternalHriDsl.g:2467:2: rule__Mission__Group__2__Impl rule__Mission__Group__3
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
    // InternalHriDsl.g:2474:1: rule__Mission__Group__2__Impl : ( ( rule__Mission__NameAssignment_2 ) ) ;
    public final void rule__Mission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2478:1: ( ( ( rule__Mission__NameAssignment_2 ) ) )
            // InternalHriDsl.g:2479:1: ( ( rule__Mission__NameAssignment_2 ) )
            {
            // InternalHriDsl.g:2479:1: ( ( rule__Mission__NameAssignment_2 ) )
            // InternalHriDsl.g:2480:2: ( rule__Mission__NameAssignment_2 )
            {
             before(grammarAccess.getMissionAccess().getNameAssignment_2()); 
            // InternalHriDsl.g:2481:2: ( rule__Mission__NameAssignment_2 )
            // InternalHriDsl.g:2481:3: rule__Mission__NameAssignment_2
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
    // InternalHriDsl.g:2489:1: rule__Mission__Group__3 : rule__Mission__Group__3__Impl rule__Mission__Group__4 ;
    public final void rule__Mission__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2493:1: ( rule__Mission__Group__3__Impl rule__Mission__Group__4 )
            // InternalHriDsl.g:2494:2: rule__Mission__Group__3__Impl rule__Mission__Group__4
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
    // InternalHriDsl.g:2501:1: rule__Mission__Group__3__Impl : ( ':' ) ;
    public final void rule__Mission__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2505:1: ( ( ':' ) )
            // InternalHriDsl.g:2506:1: ( ':' )
            {
            // InternalHriDsl.g:2506:1: ( ':' )
            // InternalHriDsl.g:2507:2: ':'
            {
             before(grammarAccess.getMissionAccess().getColonKeyword_3()); 
            match(input,57,FOLLOW_2); 
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
    // InternalHriDsl.g:2516:1: rule__Mission__Group__4 : rule__Mission__Group__4__Impl rule__Mission__Group__5 ;
    public final void rule__Mission__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2520:1: ( rule__Mission__Group__4__Impl rule__Mission__Group__5 )
            // InternalHriDsl.g:2521:2: rule__Mission__Group__4__Impl rule__Mission__Group__5
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
    // InternalHriDsl.g:2528:1: rule__Mission__Group__4__Impl : ( ( ( rule__Mission__AssignmentsAssignment_4 ) ) ( ( rule__Mission__AssignmentsAssignment_4 )* ) ) ;
    public final void rule__Mission__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2532:1: ( ( ( ( rule__Mission__AssignmentsAssignment_4 ) ) ( ( rule__Mission__AssignmentsAssignment_4 )* ) ) )
            // InternalHriDsl.g:2533:1: ( ( ( rule__Mission__AssignmentsAssignment_4 ) ) ( ( rule__Mission__AssignmentsAssignment_4 )* ) )
            {
            // InternalHriDsl.g:2533:1: ( ( ( rule__Mission__AssignmentsAssignment_4 ) ) ( ( rule__Mission__AssignmentsAssignment_4 )* ) )
            // InternalHriDsl.g:2534:2: ( ( rule__Mission__AssignmentsAssignment_4 ) ) ( ( rule__Mission__AssignmentsAssignment_4 )* )
            {
            // InternalHriDsl.g:2534:2: ( ( rule__Mission__AssignmentsAssignment_4 ) )
            // InternalHriDsl.g:2535:3: ( rule__Mission__AssignmentsAssignment_4 )
            {
             before(grammarAccess.getMissionAccess().getAssignmentsAssignment_4()); 
            // InternalHriDsl.g:2536:3: ( rule__Mission__AssignmentsAssignment_4 )
            // InternalHriDsl.g:2536:4: rule__Mission__AssignmentsAssignment_4
            {
            pushFollow(FOLLOW_37);
            rule__Mission__AssignmentsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getAssignmentsAssignment_4()); 

            }

            // InternalHriDsl.g:2539:2: ( ( rule__Mission__AssignmentsAssignment_4 )* )
            // InternalHriDsl.g:2540:3: ( rule__Mission__AssignmentsAssignment_4 )*
            {
             before(grammarAccess.getMissionAccess().getAssignmentsAssignment_4()); 
            // InternalHriDsl.g:2541:3: ( rule__Mission__AssignmentsAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==72) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalHriDsl.g:2541:4: rule__Mission__AssignmentsAssignment_4
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
    // InternalHriDsl.g:2550:1: rule__Mission__Group__5 : rule__Mission__Group__5__Impl ;
    public final void rule__Mission__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2554:1: ( rule__Mission__Group__5__Impl )
            // InternalHriDsl.g:2555:2: rule__Mission__Group__5__Impl
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
    // InternalHriDsl.g:2561:1: rule__Mission__Group__5__Impl : ( ( rule__Mission__QueriesAssignment_5 ) ) ;
    public final void rule__Mission__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2565:1: ( ( ( rule__Mission__QueriesAssignment_5 ) ) )
            // InternalHriDsl.g:2566:1: ( ( rule__Mission__QueriesAssignment_5 ) )
            {
            // InternalHriDsl.g:2566:1: ( ( rule__Mission__QueriesAssignment_5 ) )
            // InternalHriDsl.g:2567:2: ( rule__Mission__QueriesAssignment_5 )
            {
             before(grammarAccess.getMissionAccess().getQueriesAssignment_5()); 
            // InternalHriDsl.g:2568:2: ( rule__Mission__QueriesAssignment_5 )
            // InternalHriDsl.g:2568:3: rule__Mission__QueriesAssignment_5
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
    // InternalHriDsl.g:2577:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2581:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalHriDsl.g:2582:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
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
    // InternalHriDsl.g:2589:1: rule__Assignment__Group__0__Impl : ( 'do' ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2593:1: ( ( 'do' ) )
            // InternalHriDsl.g:2594:1: ( 'do' )
            {
            // InternalHriDsl.g:2594:1: ( 'do' )
            // InternalHriDsl.g:2595:2: 'do'
            {
             before(grammarAccess.getAssignmentAccess().getDoKeyword_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalHriDsl.g:2604:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2608:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalHriDsl.g:2609:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
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
    // InternalHriDsl.g:2616:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__PatternAssignment_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2620:1: ( ( ( rule__Assignment__PatternAssignment_1 ) ) )
            // InternalHriDsl.g:2621:1: ( ( rule__Assignment__PatternAssignment_1 ) )
            {
            // InternalHriDsl.g:2621:1: ( ( rule__Assignment__PatternAssignment_1 ) )
            // InternalHriDsl.g:2622:2: ( rule__Assignment__PatternAssignment_1 )
            {
             before(grammarAccess.getAssignmentAccess().getPatternAssignment_1()); 
            // InternalHriDsl.g:2623:2: ( rule__Assignment__PatternAssignment_1 )
            // InternalHriDsl.g:2623:3: rule__Assignment__PatternAssignment_1
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
    // InternalHriDsl.g:2631:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2635:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // InternalHriDsl.g:2636:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
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
    // InternalHriDsl.g:2643:1: rule__Assignment__Group__2__Impl : ( 'for' ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2647:1: ( ( 'for' ) )
            // InternalHriDsl.g:2648:1: ( 'for' )
            {
            // InternalHriDsl.g:2648:1: ( 'for' )
            // InternalHriDsl.g:2649:2: 'for'
            {
             before(grammarAccess.getAssignmentAccess().getForKeyword_2()); 
            match(input,73,FOLLOW_2); 
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
    // InternalHriDsl.g:2658:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl rule__Assignment__Group__4 ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2662:1: ( rule__Assignment__Group__3__Impl rule__Assignment__Group__4 )
            // InternalHriDsl.g:2663:2: rule__Assignment__Group__3__Impl rule__Assignment__Group__4
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
    // InternalHriDsl.g:2670:1: rule__Assignment__Group__3__Impl : ( ( rule__Assignment__ClientAssignment_3 ) ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2674:1: ( ( ( rule__Assignment__ClientAssignment_3 ) ) )
            // InternalHriDsl.g:2675:1: ( ( rule__Assignment__ClientAssignment_3 ) )
            {
            // InternalHriDsl.g:2675:1: ( ( rule__Assignment__ClientAssignment_3 ) )
            // InternalHriDsl.g:2676:2: ( rule__Assignment__ClientAssignment_3 )
            {
             before(grammarAccess.getAssignmentAccess().getClientAssignment_3()); 
            // InternalHriDsl.g:2677:2: ( rule__Assignment__ClientAssignment_3 )
            // InternalHriDsl.g:2677:3: rule__Assignment__ClientAssignment_3
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
    // InternalHriDsl.g:2685:1: rule__Assignment__Group__4 : rule__Assignment__Group__4__Impl rule__Assignment__Group__5 ;
    public final void rule__Assignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2689:1: ( rule__Assignment__Group__4__Impl rule__Assignment__Group__5 )
            // InternalHriDsl.g:2690:2: rule__Assignment__Group__4__Impl rule__Assignment__Group__5
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
    // InternalHriDsl.g:2697:1: rule__Assignment__Group__4__Impl : ( 'with' ) ;
    public final void rule__Assignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2701:1: ( ( 'with' ) )
            // InternalHriDsl.g:2702:1: ( 'with' )
            {
            // InternalHriDsl.g:2702:1: ( 'with' )
            // InternalHriDsl.g:2703:2: 'with'
            {
             before(grammarAccess.getAssignmentAccess().getWithKeyword_4()); 
            match(input,74,FOLLOW_2); 
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
    // InternalHriDsl.g:2712:1: rule__Assignment__Group__5 : rule__Assignment__Group__5__Impl rule__Assignment__Group__6 ;
    public final void rule__Assignment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2716:1: ( rule__Assignment__Group__5__Impl rule__Assignment__Group__6 )
            // InternalHriDsl.g:2717:2: rule__Assignment__Group__5__Impl rule__Assignment__Group__6
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
    // InternalHriDsl.g:2724:1: rule__Assignment__Group__5__Impl : ( 'target' ) ;
    public final void rule__Assignment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2728:1: ( ( 'target' ) )
            // InternalHriDsl.g:2729:1: ( 'target' )
            {
            // InternalHriDsl.g:2729:1: ( 'target' )
            // InternalHriDsl.g:2730:2: 'target'
            {
             before(grammarAccess.getAssignmentAccess().getTargetKeyword_5()); 
            match(input,75,FOLLOW_2); 
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
    // InternalHriDsl.g:2739:1: rule__Assignment__Group__6 : rule__Assignment__Group__6__Impl ;
    public final void rule__Assignment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2743:1: ( rule__Assignment__Group__6__Impl )
            // InternalHriDsl.g:2744:2: rule__Assignment__Group__6__Impl
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
    // InternalHriDsl.g:2750:1: rule__Assignment__Group__6__Impl : ( ( rule__Assignment__TargetAssignment_6 ) ) ;
    public final void rule__Assignment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2754:1: ( ( ( rule__Assignment__TargetAssignment_6 ) ) )
            // InternalHriDsl.g:2755:1: ( ( rule__Assignment__TargetAssignment_6 ) )
            {
            // InternalHriDsl.g:2755:1: ( ( rule__Assignment__TargetAssignment_6 ) )
            // InternalHriDsl.g:2756:2: ( rule__Assignment__TargetAssignment_6 )
            {
             before(grammarAccess.getAssignmentAccess().getTargetAssignment_6()); 
            // InternalHriDsl.g:2757:2: ( rule__Assignment__TargetAssignment_6 )
            // InternalHriDsl.g:2757:3: rule__Assignment__TargetAssignment_6
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
    // InternalHriDsl.g:2766:1: rule__Queries__Group__0 : rule__Queries__Group__0__Impl rule__Queries__Group__1 ;
    public final void rule__Queries__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2770:1: ( rule__Queries__Group__0__Impl rule__Queries__Group__1 )
            // InternalHriDsl.g:2771:2: rule__Queries__Group__0__Impl rule__Queries__Group__1
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
    // InternalHriDsl.g:2778:1: rule__Queries__Group__0__Impl : ( 'define' ) ;
    public final void rule__Queries__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2782:1: ( ( 'define' ) )
            // InternalHriDsl.g:2783:1: ( 'define' )
            {
            // InternalHriDsl.g:2783:1: ( 'define' )
            // InternalHriDsl.g:2784:2: 'define'
            {
             before(grammarAccess.getQueriesAccess().getDefineKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalHriDsl.g:2793:1: rule__Queries__Group__1 : rule__Queries__Group__1__Impl rule__Queries__Group__2 ;
    public final void rule__Queries__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2797:1: ( rule__Queries__Group__1__Impl rule__Queries__Group__2 )
            // InternalHriDsl.g:2798:2: rule__Queries__Group__1__Impl rule__Queries__Group__2
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
    // InternalHriDsl.g:2805:1: rule__Queries__Group__1__Impl : ( 'queries' ) ;
    public final void rule__Queries__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2809:1: ( ( 'queries' ) )
            // InternalHriDsl.g:2810:1: ( 'queries' )
            {
            // InternalHriDsl.g:2810:1: ( 'queries' )
            // InternalHriDsl.g:2811:2: 'queries'
            {
             before(grammarAccess.getQueriesAccess().getQueriesKeyword_1()); 
            match(input,76,FOLLOW_2); 
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
    // InternalHriDsl.g:2820:1: rule__Queries__Group__2 : rule__Queries__Group__2__Impl rule__Queries__Group__3 ;
    public final void rule__Queries__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2824:1: ( rule__Queries__Group__2__Impl rule__Queries__Group__3 )
            // InternalHriDsl.g:2825:2: rule__Queries__Group__2__Impl rule__Queries__Group__3
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
    // InternalHriDsl.g:2832:1: rule__Queries__Group__2__Impl : ( 'of' ) ;
    public final void rule__Queries__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2836:1: ( ( 'of' ) )
            // InternalHriDsl.g:2837:1: ( 'of' )
            {
            // InternalHriDsl.g:2837:1: ( 'of' )
            // InternalHriDsl.g:2838:2: 'of'
            {
             before(grammarAccess.getQueriesAccess().getOfKeyword_2()); 
            match(input,77,FOLLOW_2); 
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
    // InternalHriDsl.g:2847:1: rule__Queries__Group__3 : rule__Queries__Group__3__Impl rule__Queries__Group__4 ;
    public final void rule__Queries__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2851:1: ( rule__Queries__Group__3__Impl rule__Queries__Group__4 )
            // InternalHriDsl.g:2852:2: rule__Queries__Group__3__Impl rule__Queries__Group__4
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
    // InternalHriDsl.g:2859:1: rule__Queries__Group__3__Impl : ( 'mission' ) ;
    public final void rule__Queries__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2863:1: ( ( 'mission' ) )
            // InternalHriDsl.g:2864:1: ( 'mission' )
            {
            // InternalHriDsl.g:2864:1: ( 'mission' )
            // InternalHriDsl.g:2865:2: 'mission'
            {
             before(grammarAccess.getQueriesAccess().getMissionKeyword_3()); 
            match(input,71,FOLLOW_2); 
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
    // InternalHriDsl.g:2874:1: rule__Queries__Group__4 : rule__Queries__Group__4__Impl rule__Queries__Group__5 ;
    public final void rule__Queries__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2878:1: ( rule__Queries__Group__4__Impl rule__Queries__Group__5 )
            // InternalHriDsl.g:2879:2: rule__Queries__Group__4__Impl rule__Queries__Group__5
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
    // InternalHriDsl.g:2886:1: rule__Queries__Group__4__Impl : ( ( rule__Queries__MissionAssignment_4 ) ) ;
    public final void rule__Queries__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2890:1: ( ( ( rule__Queries__MissionAssignment_4 ) ) )
            // InternalHriDsl.g:2891:1: ( ( rule__Queries__MissionAssignment_4 ) )
            {
            // InternalHriDsl.g:2891:1: ( ( rule__Queries__MissionAssignment_4 ) )
            // InternalHriDsl.g:2892:2: ( rule__Queries__MissionAssignment_4 )
            {
             before(grammarAccess.getQueriesAccess().getMissionAssignment_4()); 
            // InternalHriDsl.g:2893:2: ( rule__Queries__MissionAssignment_4 )
            // InternalHriDsl.g:2893:3: rule__Queries__MissionAssignment_4
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
    // InternalHriDsl.g:2901:1: rule__Queries__Group__5 : rule__Queries__Group__5__Impl rule__Queries__Group__6 ;
    public final void rule__Queries__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2905:1: ( rule__Queries__Group__5__Impl rule__Queries__Group__6 )
            // InternalHriDsl.g:2906:2: rule__Queries__Group__5__Impl rule__Queries__Group__6
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
    // InternalHriDsl.g:2913:1: rule__Queries__Group__5__Impl : ( ':' ) ;
    public final void rule__Queries__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2917:1: ( ( ':' ) )
            // InternalHriDsl.g:2918:1: ( ':' )
            {
            // InternalHriDsl.g:2918:1: ( ':' )
            // InternalHriDsl.g:2919:2: ':'
            {
             before(grammarAccess.getQueriesAccess().getColonKeyword_5()); 
            match(input,57,FOLLOW_2); 
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
    // InternalHriDsl.g:2928:1: rule__Queries__Group__6 : rule__Queries__Group__6__Impl ;
    public final void rule__Queries__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2932:1: ( rule__Queries__Group__6__Impl )
            // InternalHriDsl.g:2933:2: rule__Queries__Group__6__Impl
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
    // InternalHriDsl.g:2939:1: rule__Queries__Group__6__Impl : ( ( ( rule__Queries__QueriesAssignment_6 ) ) ( ( rule__Queries__QueriesAssignment_6 )* ) ) ;
    public final void rule__Queries__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2943:1: ( ( ( ( rule__Queries__QueriesAssignment_6 ) ) ( ( rule__Queries__QueriesAssignment_6 )* ) ) )
            // InternalHriDsl.g:2944:1: ( ( ( rule__Queries__QueriesAssignment_6 ) ) ( ( rule__Queries__QueriesAssignment_6 )* ) )
            {
            // InternalHriDsl.g:2944:1: ( ( ( rule__Queries__QueriesAssignment_6 ) ) ( ( rule__Queries__QueriesAssignment_6 )* ) )
            // InternalHriDsl.g:2945:2: ( ( rule__Queries__QueriesAssignment_6 ) ) ( ( rule__Queries__QueriesAssignment_6 )* )
            {
            // InternalHriDsl.g:2945:2: ( ( rule__Queries__QueriesAssignment_6 ) )
            // InternalHriDsl.g:2946:3: ( rule__Queries__QueriesAssignment_6 )
            {
             before(grammarAccess.getQueriesAccess().getQueriesAssignment_6()); 
            // InternalHriDsl.g:2947:3: ( rule__Queries__QueriesAssignment_6 )
            // InternalHriDsl.g:2947:4: rule__Queries__QueriesAssignment_6
            {
            pushFollow(FOLLOW_45);
            rule__Queries__QueriesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getQueriesAccess().getQueriesAssignment_6()); 

            }

            // InternalHriDsl.g:2950:2: ( ( rule__Queries__QueriesAssignment_6 )* )
            // InternalHriDsl.g:2951:3: ( rule__Queries__QueriesAssignment_6 )*
            {
             before(grammarAccess.getQueriesAccess().getQueriesAssignment_6()); 
            // InternalHriDsl.g:2952:3: ( rule__Queries__QueriesAssignment_6 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==78) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalHriDsl.g:2952:4: rule__Queries__QueriesAssignment_6
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
    // InternalHriDsl.g:2962:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2966:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalHriDsl.g:2967:2: rule__Query__Group__0__Impl rule__Query__Group__1
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
    // InternalHriDsl.g:2974:1: rule__Query__Group__0__Impl : ( 'compute' ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2978:1: ( ( 'compute' ) )
            // InternalHriDsl.g:2979:1: ( 'compute' )
            {
            // InternalHriDsl.g:2979:1: ( 'compute' )
            // InternalHriDsl.g:2980:2: 'compute'
            {
             before(grammarAccess.getQueryAccess().getComputeKeyword_0()); 
            match(input,78,FOLLOW_2); 
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
    // InternalHriDsl.g:2989:1: rule__Query__Group__1 : rule__Query__Group__1__Impl rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:2993:1: ( rule__Query__Group__1__Impl rule__Query__Group__2 )
            // InternalHriDsl.g:2994:2: rule__Query__Group__1__Impl rule__Query__Group__2
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
    // InternalHriDsl.g:3001:1: rule__Query__Group__1__Impl : ( ( rule__Query__Query_typeAssignment_1 ) ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3005:1: ( ( ( rule__Query__Query_typeAssignment_1 ) ) )
            // InternalHriDsl.g:3006:1: ( ( rule__Query__Query_typeAssignment_1 ) )
            {
            // InternalHriDsl.g:3006:1: ( ( rule__Query__Query_typeAssignment_1 ) )
            // InternalHriDsl.g:3007:2: ( rule__Query__Query_typeAssignment_1 )
            {
             before(grammarAccess.getQueryAccess().getQuery_typeAssignment_1()); 
            // InternalHriDsl.g:3008:2: ( rule__Query__Query_typeAssignment_1 )
            // InternalHriDsl.g:3008:3: rule__Query__Query_typeAssignment_1
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
    // InternalHriDsl.g:3016:1: rule__Query__Group__2 : rule__Query__Group__2__Impl rule__Query__Group__3 ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3020:1: ( rule__Query__Group__2__Impl rule__Query__Group__3 )
            // InternalHriDsl.g:3021:2: rule__Query__Group__2__Impl rule__Query__Group__3
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
    // InternalHriDsl.g:3028:1: rule__Query__Group__2__Impl : ( 'with' ) ;
    public final void rule__Query__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3032:1: ( ( 'with' ) )
            // InternalHriDsl.g:3033:1: ( 'with' )
            {
            // InternalHriDsl.g:3033:1: ( 'with' )
            // InternalHriDsl.g:3034:2: 'with'
            {
             before(grammarAccess.getQueryAccess().getWithKeyword_2()); 
            match(input,74,FOLLOW_2); 
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
    // InternalHriDsl.g:3043:1: rule__Query__Group__3 : rule__Query__Group__3__Impl rule__Query__Group__4 ;
    public final void rule__Query__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3047:1: ( rule__Query__Group__3__Impl rule__Query__Group__4 )
            // InternalHriDsl.g:3048:2: rule__Query__Group__3__Impl rule__Query__Group__4
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
    // InternalHriDsl.g:3055:1: rule__Query__Group__3__Impl : ( 'duration' ) ;
    public final void rule__Query__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3059:1: ( ( 'duration' ) )
            // InternalHriDsl.g:3060:1: ( 'duration' )
            {
            // InternalHriDsl.g:3060:1: ( 'duration' )
            // InternalHriDsl.g:3061:2: 'duration'
            {
             before(grammarAccess.getQueryAccess().getDurationKeyword_3()); 
            match(input,79,FOLLOW_2); 
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
    // InternalHriDsl.g:3070:1: rule__Query__Group__4 : rule__Query__Group__4__Impl rule__Query__Group__5 ;
    public final void rule__Query__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3074:1: ( rule__Query__Group__4__Impl rule__Query__Group__5 )
            // InternalHriDsl.g:3075:2: rule__Query__Group__4__Impl rule__Query__Group__5
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
    // InternalHriDsl.g:3082:1: rule__Query__Group__4__Impl : ( ( rule__Query__DurationAssignment_4 ) ) ;
    public final void rule__Query__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3086:1: ( ( ( rule__Query__DurationAssignment_4 ) ) )
            // InternalHriDsl.g:3087:1: ( ( rule__Query__DurationAssignment_4 ) )
            {
            // InternalHriDsl.g:3087:1: ( ( rule__Query__DurationAssignment_4 ) )
            // InternalHriDsl.g:3088:2: ( rule__Query__DurationAssignment_4 )
            {
             before(grammarAccess.getQueryAccess().getDurationAssignment_4()); 
            // InternalHriDsl.g:3089:2: ( rule__Query__DurationAssignment_4 )
            // InternalHriDsl.g:3089:3: rule__Query__DurationAssignment_4
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
    // InternalHriDsl.g:3097:1: rule__Query__Group__5 : rule__Query__Group__5__Impl rule__Query__Group__6 ;
    public final void rule__Query__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3101:1: ( rule__Query__Group__5__Impl rule__Query__Group__6 )
            // InternalHriDsl.g:3102:2: rule__Query__Group__5__Impl rule__Query__Group__6
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
    // InternalHriDsl.g:3109:1: rule__Query__Group__5__Impl : ( 'runs' ) ;
    public final void rule__Query__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3113:1: ( ( 'runs' ) )
            // InternalHriDsl.g:3114:1: ( 'runs' )
            {
            // InternalHriDsl.g:3114:1: ( 'runs' )
            // InternalHriDsl.g:3115:2: 'runs'
            {
             before(grammarAccess.getQueryAccess().getRunsKeyword_5()); 
            match(input,80,FOLLOW_2); 
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
    // InternalHriDsl.g:3124:1: rule__Query__Group__6 : rule__Query__Group__6__Impl ;
    public final void rule__Query__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3128:1: ( rule__Query__Group__6__Impl )
            // InternalHriDsl.g:3129:2: rule__Query__Group__6__Impl
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
    // InternalHriDsl.g:3135:1: rule__Query__Group__6__Impl : ( ( rule__Query__RunsAssignment_6 ) ) ;
    public final void rule__Query__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3139:1: ( ( ( rule__Query__RunsAssignment_6 ) ) )
            // InternalHriDsl.g:3140:1: ( ( rule__Query__RunsAssignment_6 ) )
            {
            // InternalHriDsl.g:3140:1: ( ( rule__Query__RunsAssignment_6 ) )
            // InternalHriDsl.g:3141:2: ( rule__Query__RunsAssignment_6 )
            {
             before(grammarAccess.getQueryAccess().getRunsAssignment_6()); 
            // InternalHriDsl.g:3142:2: ( rule__Query__RunsAssignment_6 )
            // InternalHriDsl.g:3142:3: rule__Query__RunsAssignment_6
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
    // InternalHriDsl.g:3151:1: rule__Coordinates__Group__0 : rule__Coordinates__Group__0__Impl rule__Coordinates__Group__1 ;
    public final void rule__Coordinates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3155:1: ( rule__Coordinates__Group__0__Impl rule__Coordinates__Group__1 )
            // InternalHriDsl.g:3156:2: rule__Coordinates__Group__0__Impl rule__Coordinates__Group__1
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
    // InternalHriDsl.g:3163:1: rule__Coordinates__Group__0__Impl : ( '(' ) ;
    public final void rule__Coordinates__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3167:1: ( ( '(' ) )
            // InternalHriDsl.g:3168:1: ( '(' )
            {
            // InternalHriDsl.g:3168:1: ( '(' )
            // InternalHriDsl.g:3169:2: '('
            {
             before(grammarAccess.getCoordinatesAccess().getLeftParenthesisKeyword_0()); 
            match(input,81,FOLLOW_2); 
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
    // InternalHriDsl.g:3178:1: rule__Coordinates__Group__1 : rule__Coordinates__Group__1__Impl rule__Coordinates__Group__2 ;
    public final void rule__Coordinates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3182:1: ( rule__Coordinates__Group__1__Impl rule__Coordinates__Group__2 )
            // InternalHriDsl.g:3183:2: rule__Coordinates__Group__1__Impl rule__Coordinates__Group__2
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
    // InternalHriDsl.g:3190:1: rule__Coordinates__Group__1__Impl : ( ( rule__Coordinates__XAssignment_1 ) ) ;
    public final void rule__Coordinates__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3194:1: ( ( ( rule__Coordinates__XAssignment_1 ) ) )
            // InternalHriDsl.g:3195:1: ( ( rule__Coordinates__XAssignment_1 ) )
            {
            // InternalHriDsl.g:3195:1: ( ( rule__Coordinates__XAssignment_1 ) )
            // InternalHriDsl.g:3196:2: ( rule__Coordinates__XAssignment_1 )
            {
             before(grammarAccess.getCoordinatesAccess().getXAssignment_1()); 
            // InternalHriDsl.g:3197:2: ( rule__Coordinates__XAssignment_1 )
            // InternalHriDsl.g:3197:3: rule__Coordinates__XAssignment_1
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
    // InternalHriDsl.g:3205:1: rule__Coordinates__Group__2 : rule__Coordinates__Group__2__Impl rule__Coordinates__Group__3 ;
    public final void rule__Coordinates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3209:1: ( rule__Coordinates__Group__2__Impl rule__Coordinates__Group__3 )
            // InternalHriDsl.g:3210:2: rule__Coordinates__Group__2__Impl rule__Coordinates__Group__3
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
    // InternalHriDsl.g:3217:1: rule__Coordinates__Group__2__Impl : ( ',' ) ;
    public final void rule__Coordinates__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3221:1: ( ( ',' ) )
            // InternalHriDsl.g:3222:1: ( ',' )
            {
            // InternalHriDsl.g:3222:1: ( ',' )
            // InternalHriDsl.g:3223:2: ','
            {
             before(grammarAccess.getCoordinatesAccess().getCommaKeyword_2()); 
            match(input,82,FOLLOW_2); 
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
    // InternalHriDsl.g:3232:1: rule__Coordinates__Group__3 : rule__Coordinates__Group__3__Impl rule__Coordinates__Group__4 ;
    public final void rule__Coordinates__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3236:1: ( rule__Coordinates__Group__3__Impl rule__Coordinates__Group__4 )
            // InternalHriDsl.g:3237:2: rule__Coordinates__Group__3__Impl rule__Coordinates__Group__4
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
    // InternalHriDsl.g:3244:1: rule__Coordinates__Group__3__Impl : ( ( rule__Coordinates__YAssignment_3 ) ) ;
    public final void rule__Coordinates__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3248:1: ( ( ( rule__Coordinates__YAssignment_3 ) ) )
            // InternalHriDsl.g:3249:1: ( ( rule__Coordinates__YAssignment_3 ) )
            {
            // InternalHriDsl.g:3249:1: ( ( rule__Coordinates__YAssignment_3 ) )
            // InternalHriDsl.g:3250:2: ( rule__Coordinates__YAssignment_3 )
            {
             before(grammarAccess.getCoordinatesAccess().getYAssignment_3()); 
            // InternalHriDsl.g:3251:2: ( rule__Coordinates__YAssignment_3 )
            // InternalHriDsl.g:3251:3: rule__Coordinates__YAssignment_3
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
    // InternalHriDsl.g:3259:1: rule__Coordinates__Group__4 : rule__Coordinates__Group__4__Impl ;
    public final void rule__Coordinates__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3263:1: ( rule__Coordinates__Group__4__Impl )
            // InternalHriDsl.g:3264:2: rule__Coordinates__Group__4__Impl
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
    // InternalHriDsl.g:3270:1: rule__Coordinates__Group__4__Impl : ( ')' ) ;
    public final void rule__Coordinates__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3274:1: ( ( ')' ) )
            // InternalHriDsl.g:3275:1: ( ')' )
            {
            // InternalHriDsl.g:3275:1: ( ')' )
            // InternalHriDsl.g:3276:2: ')'
            {
             before(grammarAccess.getCoordinatesAccess().getRightParenthesisKeyword_4()); 
            match(input,83,FOLLOW_2); 
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
    // InternalHriDsl.g:3286:1: rule__Parameter__UnorderedGroup : rule__Parameter__UnorderedGroup__0 {...}?;
    public final void rule__Parameter__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getParameterAccess().getUnorderedGroup());
        	
        try {
            // InternalHriDsl.g:3291:1: ( rule__Parameter__UnorderedGroup__0 {...}?)
            // InternalHriDsl.g:3292:2: rule__Parameter__UnorderedGroup__0 {...}?
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
    // InternalHriDsl.g:3300:1: rule__Parameter__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Parameter__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_1__0 ) ) ) ) ) ;
    public final void rule__Parameter__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalHriDsl.g:3305:1: ( ( ({...}? => ( ( ( rule__Parameter__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_1__0 ) ) ) ) ) )
            // InternalHriDsl.g:3306:3: ( ({...}? => ( ( ( rule__Parameter__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_1__0 ) ) ) ) )
            {
            // InternalHriDsl.g:3306:3: ( ({...}? => ( ( ( rule__Parameter__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Parameter__Group_1__0 ) ) ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( LA17_0 == 52 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 0) ) ) {
                int LA17_1 = input.LA(2);

                if ( LA17_1 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 1) ) {
                    alt17=2;
                }
                else if ( LA17_1 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 0) ) {
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
                    // InternalHriDsl.g:3307:3: ({...}? => ( ( ( rule__Parameter__Group_0__0 ) ) ) )
                    {
                    // InternalHriDsl.g:3307:3: ({...}? => ( ( ( rule__Parameter__Group_0__0 ) ) ) )
                    // InternalHriDsl.g:3308:4: {...}? => ( ( ( rule__Parameter__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Parameter__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalHriDsl.g:3308:103: ( ( ( rule__Parameter__Group_0__0 ) ) )
                    // InternalHriDsl.g:3309:5: ( ( rule__Parameter__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalHriDsl.g:3315:5: ( ( rule__Parameter__Group_0__0 ) )
                    // InternalHriDsl.g:3316:6: ( rule__Parameter__Group_0__0 )
                    {
                     before(grammarAccess.getParameterAccess().getGroup_0()); 
                    // InternalHriDsl.g:3317:6: ( rule__Parameter__Group_0__0 )
                    // InternalHriDsl.g:3317:7: rule__Parameter__Group_0__0
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
                    // InternalHriDsl.g:3322:3: ({...}? => ( ( ( rule__Parameter__Group_1__0 ) ) ) )
                    {
                    // InternalHriDsl.g:3322:3: ({...}? => ( ( ( rule__Parameter__Group_1__0 ) ) ) )
                    // InternalHriDsl.g:3323:4: {...}? => ( ( ( rule__Parameter__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Parameter__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalHriDsl.g:3323:103: ( ( ( rule__Parameter__Group_1__0 ) ) )
                    // InternalHriDsl.g:3324:5: ( ( rule__Parameter__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalHriDsl.g:3330:5: ( ( rule__Parameter__Group_1__0 ) )
                    // InternalHriDsl.g:3331:6: ( rule__Parameter__Group_1__0 )
                    {
                     before(grammarAccess.getParameterAccess().getGroup_1()); 
                    // InternalHriDsl.g:3332:6: ( rule__Parameter__Group_1__0 )
                    // InternalHriDsl.g:3332:7: rule__Parameter__Group_1__0
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
    // InternalHriDsl.g:3345:1: rule__Parameter__UnorderedGroup__0 : rule__Parameter__UnorderedGroup__Impl ( rule__Parameter__UnorderedGroup__1 )? ;
    public final void rule__Parameter__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3349:1: ( rule__Parameter__UnorderedGroup__Impl ( rule__Parameter__UnorderedGroup__1 )? )
            // InternalHriDsl.g:3350:2: rule__Parameter__UnorderedGroup__Impl ( rule__Parameter__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_52);
            rule__Parameter__UnorderedGroup__Impl();

            state._fsp--;

            // InternalHriDsl.g:3351:2: ( rule__Parameter__UnorderedGroup__1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( LA18_0 == 52 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 0) ) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalHriDsl.g:3351:2: rule__Parameter__UnorderedGroup__1
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
    // InternalHriDsl.g:3357:1: rule__Parameter__UnorderedGroup__1 : rule__Parameter__UnorderedGroup__Impl ;
    public final void rule__Parameter__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3361:1: ( rule__Parameter__UnorderedGroup__Impl )
            // InternalHriDsl.g:3362:2: rule__Parameter__UnorderedGroup__Impl
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
    // InternalHriDsl.g:3369:1: rule__Model__ParameterAssignment_0 : ( ruleParameter ) ;
    public final void rule__Model__ParameterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3373:1: ( ( ruleParameter ) )
            // InternalHriDsl.g:3374:2: ( ruleParameter )
            {
            // InternalHriDsl.g:3374:2: ( ruleParameter )
            // InternalHriDsl.g:3375:3: ruleParameter
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
    // InternalHriDsl.g:3384:1: rule__Model__ScenariosAssignment_1 : ( ruleScenario ) ;
    public final void rule__Model__ScenariosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3388:1: ( ( ruleScenario ) )
            // InternalHriDsl.g:3389:2: ( ruleScenario )
            {
            // InternalHriDsl.g:3389:2: ( ruleScenario )
            // InternalHriDsl.g:3390:3: ruleScenario
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
    // InternalHriDsl.g:3399:1: rule__Parameter__Length_unitAssignment_0_2 : ( ruleLength_unit ) ;
    public final void rule__Parameter__Length_unitAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3403:1: ( ( ruleLength_unit ) )
            // InternalHriDsl.g:3404:2: ( ruleLength_unit )
            {
            // InternalHriDsl.g:3404:2: ( ruleLength_unit )
            // InternalHriDsl.g:3405:3: ruleLength_unit
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
    // InternalHriDsl.g:3414:1: rule__Parameter__Free_will_modelAssignment_1_2 : ( ruleBehavioral_model ) ;
    public final void rule__Parameter__Free_will_modelAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3418:1: ( ( ruleBehavioral_model ) )
            // InternalHriDsl.g:3419:2: ( ruleBehavioral_model )
            {
            // InternalHriDsl.g:3419:2: ( ruleBehavioral_model )
            // InternalHriDsl.g:3420:3: ruleBehavioral_model
            {
             before(grammarAccess.getParameterAccess().getFree_will_modelBehavioral_modelEnumRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBehavioral_model();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getFree_will_modelBehavioral_modelEnumRuleCall_1_2_0()); 

            }


            }

        }
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
    // InternalHriDsl.g:3429:1: rule__Scenario__FloorAssignment_0 : ( ruleFloor ) ;
    public final void rule__Scenario__FloorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3433:1: ( ( ruleFloor ) )
            // InternalHriDsl.g:3434:2: ( ruleFloor )
            {
            // InternalHriDsl.g:3434:2: ( ruleFloor )
            // InternalHriDsl.g:3435:3: ruleFloor
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
    // InternalHriDsl.g:3444:1: rule__Scenario__RobotsAssignment_1 : ( ruleRobots ) ;
    public final void rule__Scenario__RobotsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3448:1: ( ( ruleRobots ) )
            // InternalHriDsl.g:3449:2: ( ruleRobots )
            {
            // InternalHriDsl.g:3449:2: ( ruleRobots )
            // InternalHriDsl.g:3450:3: ruleRobots
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
    // InternalHriDsl.g:3459:1: rule__Scenario__HumansAssignment_2 : ( ruleHumans ) ;
    public final void rule__Scenario__HumansAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3463:1: ( ( ruleHumans ) )
            // InternalHriDsl.g:3464:2: ( ruleHumans )
            {
            // InternalHriDsl.g:3464:2: ( ruleHumans )
            // InternalHriDsl.g:3465:3: ruleHumans
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
    // InternalHriDsl.g:3474:1: rule__Scenario__MissionsAssignment_3 : ( ruleMission ) ;
    public final void rule__Scenario__MissionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3478:1: ( ( ruleMission ) )
            // InternalHriDsl.g:3479:2: ( ruleMission )
            {
            // InternalHriDsl.g:3479:2: ( ruleMission )
            // InternalHriDsl.g:3480:3: ruleMission
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
    // InternalHriDsl.g:3489:1: rule__Floor__Floor_nameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Floor__Floor_nameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3493:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3494:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3494:2: ( RULE_ID )
            // InternalHriDsl.g:3495:3: RULE_ID
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
    // InternalHriDsl.g:3504:1: rule__Floor__SurfacesAssignment_4 : ( ruleSurface ) ;
    public final void rule__Floor__SurfacesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3508:1: ( ( ruleSurface ) )
            // InternalHriDsl.g:3509:2: ( ruleSurface )
            {
            // InternalHriDsl.g:3509:2: ( ruleSurface )
            // InternalHriDsl.g:3510:3: ruleSurface
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
    // InternalHriDsl.g:3519:1: rule__Floor__PointsAssignment_5 : ( rulePoint ) ;
    public final void rule__Floor__PointsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3523:1: ( ( rulePoint ) )
            // InternalHriDsl.g:3524:2: ( rulePoint )
            {
            // InternalHriDsl.g:3524:2: ( rulePoint )
            // InternalHriDsl.g:3525:3: rulePoint
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
    // InternalHriDsl.g:3534:1: rule__Surface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Surface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3538:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3539:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3539:2: ( RULE_ID )
            // InternalHriDsl.g:3540:3: RULE_ID
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
    // InternalHriDsl.g:3549:1: rule__Surface__VerticesAssignment_3 : ( ruleVertices ) ;
    public final void rule__Surface__VerticesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3553:1: ( ( ruleVertices ) )
            // InternalHriDsl.g:3554:2: ( ruleVertices )
            {
            // InternalHriDsl.g:3554:2: ( ruleVertices )
            // InternalHriDsl.g:3555:3: ruleVertices
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
    // InternalHriDsl.g:3564:1: rule__Vertices__Vertex_AAssignment_0 : ( ruleCoordinates ) ;
    public final void rule__Vertices__Vertex_AAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3568:1: ( ( ruleCoordinates ) )
            // InternalHriDsl.g:3569:2: ( ruleCoordinates )
            {
            // InternalHriDsl.g:3569:2: ( ruleCoordinates )
            // InternalHriDsl.g:3570:3: ruleCoordinates
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
    // InternalHriDsl.g:3579:1: rule__Vertices__Vertex_CAssignment_1 : ( ruleCoordinates ) ;
    public final void rule__Vertices__Vertex_CAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3583:1: ( ( ruleCoordinates ) )
            // InternalHriDsl.g:3584:2: ( ruleCoordinates )
            {
            // InternalHriDsl.g:3584:2: ( ruleCoordinates )
            // InternalHriDsl.g:3585:3: ruleCoordinates
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
    // InternalHriDsl.g:3594:1: rule__Point__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Point__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3598:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3599:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3599:2: ( RULE_ID )
            // InternalHriDsl.g:3600:3: RULE_ID
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
    // InternalHriDsl.g:3609:1: rule__Point__CoordinatesAssignment_3 : ( ruleCoordinates ) ;
    public final void rule__Point__CoordinatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3613:1: ( ( ruleCoordinates ) )
            // InternalHriDsl.g:3614:2: ( ruleCoordinates )
            {
            // InternalHriDsl.g:3614:2: ( ruleCoordinates )
            // InternalHriDsl.g:3615:3: ruleCoordinates
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
    // InternalHriDsl.g:3624:1: rule__Robots__RobotsAssignment_3 : ( ruleRobot ) ;
    public final void rule__Robots__RobotsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3628:1: ( ( ruleRobot ) )
            // InternalHriDsl.g:3629:2: ( ruleRobot )
            {
            // InternalHriDsl.g:3629:2: ( ruleRobot )
            // InternalHriDsl.g:3630:3: ruleRobot
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
    // InternalHriDsl.g:3639:1: rule__Robot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Robot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3643:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3644:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3644:2: ( RULE_ID )
            // InternalHriDsl.g:3645:3: RULE_ID
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
    // InternalHriDsl.g:3654:1: rule__Robot__CoordinatesAssignment_3 : ( ruleCoordinates ) ;
    public final void rule__Robot__CoordinatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3658:1: ( ( ruleCoordinates ) )
            // InternalHriDsl.g:3659:2: ( ruleCoordinates )
            {
            // InternalHriDsl.g:3659:2: ( ruleCoordinates )
            // InternalHriDsl.g:3660:3: ruleCoordinates
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
    // InternalHriDsl.g:3669:1: rule__Robot__TypeAssignment_5 : ( ruleType ) ;
    public final void rule__Robot__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3673:1: ( ( ruleType ) )
            // InternalHriDsl.g:3674:2: ( ruleType )
            {
            // InternalHriDsl.g:3674:2: ( ruleType )
            // InternalHriDsl.g:3675:3: ruleType
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
    // InternalHriDsl.g:3684:1: rule__Robot__Charge_percentageAssignment_7 : ( RULE_FLOAT ) ;
    public final void rule__Robot__Charge_percentageAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3688:1: ( ( RULE_FLOAT ) )
            // InternalHriDsl.g:3689:2: ( RULE_FLOAT )
            {
            // InternalHriDsl.g:3689:2: ( RULE_FLOAT )
            // InternalHriDsl.g:3690:3: RULE_FLOAT
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
    // InternalHriDsl.g:3699:1: rule__Humans__HumansAssignment_3 : ( ruleHuman ) ;
    public final void rule__Humans__HumansAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3703:1: ( ( ruleHuman ) )
            // InternalHriDsl.g:3704:2: ( ruleHuman )
            {
            // InternalHriDsl.g:3704:2: ( ruleHuman )
            // InternalHriDsl.g:3705:3: ruleHuman
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
    // InternalHriDsl.g:3714:1: rule__Human__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Human__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3718:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3719:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3719:2: ( RULE_ID )
            // InternalHriDsl.g:3720:3: RULE_ID
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
    // InternalHriDsl.g:3729:1: rule__Human__CoordinatesAssignment_3 : ( ruleCoordinates ) ;
    public final void rule__Human__CoordinatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3733:1: ( ( ruleCoordinates ) )
            // InternalHriDsl.g:3734:2: ( ruleCoordinates )
            {
            // InternalHriDsl.g:3734:2: ( ruleCoordinates )
            // InternalHriDsl.g:3735:3: ruleCoordinates
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
    // InternalHriDsl.g:3744:1: rule__Human__SpeedAssignment_5 : ( RULE_FLOAT ) ;
    public final void rule__Human__SpeedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3748:1: ( ( RULE_FLOAT ) )
            // InternalHriDsl.g:3749:2: ( RULE_FLOAT )
            {
            // InternalHriDsl.g:3749:2: ( RULE_FLOAT )
            // InternalHriDsl.g:3750:3: RULE_FLOAT
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
    // InternalHriDsl.g:3759:1: rule__Human__DextAssignment_7 : ( RULE_INT ) ;
    public final void rule__Human__DextAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3763:1: ( ( RULE_INT ) )
            // InternalHriDsl.g:3764:2: ( RULE_INT )
            {
            // InternalHriDsl.g:3764:2: ( RULE_INT )
            // InternalHriDsl.g:3765:3: RULE_INT
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
    // InternalHriDsl.g:3774:1: rule__Human__Fatigue_profileAssignment_9 : ( ruleFatigue_profile ) ;
    public final void rule__Human__Fatigue_profileAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3778:1: ( ( ruleFatigue_profile ) )
            // InternalHriDsl.g:3779:2: ( ruleFatigue_profile )
            {
            // InternalHriDsl.g:3779:2: ( ruleFatigue_profile )
            // InternalHriDsl.g:3780:3: ruleFatigue_profile
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
    // InternalHriDsl.g:3789:1: rule__Human__Free_will_profileAssignment_11 : ( ruleFree_will_profile ) ;
    public final void rule__Human__Free_will_profileAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3793:1: ( ( ruleFree_will_profile ) )
            // InternalHriDsl.g:3794:2: ( ruleFree_will_profile )
            {
            // InternalHriDsl.g:3794:2: ( ruleFree_will_profile )
            // InternalHriDsl.g:3795:3: ruleFree_will_profile
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
    // InternalHriDsl.g:3804:1: rule__Mission__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Mission__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3808:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3809:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3809:2: ( RULE_ID )
            // InternalHriDsl.g:3810:3: RULE_ID
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
    // InternalHriDsl.g:3819:1: rule__Mission__AssignmentsAssignment_4 : ( ruleAssignment ) ;
    public final void rule__Mission__AssignmentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3823:1: ( ( ruleAssignment ) )
            // InternalHriDsl.g:3824:2: ( ruleAssignment )
            {
            // InternalHriDsl.g:3824:2: ( ruleAssignment )
            // InternalHriDsl.g:3825:3: ruleAssignment
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
    // InternalHriDsl.g:3834:1: rule__Mission__QueriesAssignment_5 : ( ruleQueries ) ;
    public final void rule__Mission__QueriesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3838:1: ( ( ruleQueries ) )
            // InternalHriDsl.g:3839:2: ( ruleQueries )
            {
            // InternalHriDsl.g:3839:2: ( ruleQueries )
            // InternalHriDsl.g:3840:3: ruleQueries
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
    // InternalHriDsl.g:3849:1: rule__Assignment__PatternAssignment_1 : ( rulePattern ) ;
    public final void rule__Assignment__PatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3853:1: ( ( rulePattern ) )
            // InternalHriDsl.g:3854:2: ( rulePattern )
            {
            // InternalHriDsl.g:3854:2: ( rulePattern )
            // InternalHriDsl.g:3855:3: rulePattern
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
    // InternalHriDsl.g:3864:1: rule__Assignment__ClientAssignment_3 : ( RULE_ID ) ;
    public final void rule__Assignment__ClientAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3868:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3869:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3869:2: ( RULE_ID )
            // InternalHriDsl.g:3870:3: RULE_ID
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
    // InternalHriDsl.g:3879:1: rule__Assignment__TargetAssignment_6 : ( RULE_ID ) ;
    public final void rule__Assignment__TargetAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3883:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3884:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3884:2: ( RULE_ID )
            // InternalHriDsl.g:3885:3: RULE_ID
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
    // InternalHriDsl.g:3894:1: rule__Queries__MissionAssignment_4 : ( RULE_ID ) ;
    public final void rule__Queries__MissionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3898:1: ( ( RULE_ID ) )
            // InternalHriDsl.g:3899:2: ( RULE_ID )
            {
            // InternalHriDsl.g:3899:2: ( RULE_ID )
            // InternalHriDsl.g:3900:3: RULE_ID
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
    // InternalHriDsl.g:3909:1: rule__Queries__QueriesAssignment_6 : ( ruleQuery ) ;
    public final void rule__Queries__QueriesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3913:1: ( ( ruleQuery ) )
            // InternalHriDsl.g:3914:2: ( ruleQuery )
            {
            // InternalHriDsl.g:3914:2: ( ruleQuery )
            // InternalHriDsl.g:3915:3: ruleQuery
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
    // InternalHriDsl.g:3924:1: rule__Query__Query_typeAssignment_1 : ( ruleQuery_type ) ;
    public final void rule__Query__Query_typeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3928:1: ( ( ruleQuery_type ) )
            // InternalHriDsl.g:3929:2: ( ruleQuery_type )
            {
            // InternalHriDsl.g:3929:2: ( ruleQuery_type )
            // InternalHriDsl.g:3930:3: ruleQuery_type
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
    // InternalHriDsl.g:3939:1: rule__Query__DurationAssignment_4 : ( RULE_INT ) ;
    public final void rule__Query__DurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3943:1: ( ( RULE_INT ) )
            // InternalHriDsl.g:3944:2: ( RULE_INT )
            {
            // InternalHriDsl.g:3944:2: ( RULE_INT )
            // InternalHriDsl.g:3945:3: RULE_INT
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
    // InternalHriDsl.g:3954:1: rule__Query__RunsAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Query__RunsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3958:1: ( ( RULE_STRING ) )
            // InternalHriDsl.g:3959:2: ( RULE_STRING )
            {
            // InternalHriDsl.g:3959:2: ( RULE_STRING )
            // InternalHriDsl.g:3960:3: RULE_STRING
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
    // InternalHriDsl.g:3969:1: rule__Coordinates__XAssignment_1 : ( RULE_FLOAT ) ;
    public final void rule__Coordinates__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3973:1: ( ( RULE_FLOAT ) )
            // InternalHriDsl.g:3974:2: ( RULE_FLOAT )
            {
            // InternalHriDsl.g:3974:2: ( RULE_FLOAT )
            // InternalHriDsl.g:3975:3: RULE_FLOAT
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
    // InternalHriDsl.g:3984:1: rule__Coordinates__YAssignment_3 : ( RULE_FLOAT ) ;
    public final void rule__Coordinates__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHriDsl.g:3988:1: ( ( RULE_FLOAT ) )
            // InternalHriDsl.g:3989:2: ( RULE_FLOAT )
            {
            // InternalHriDsl.g:3989:2: ( RULE_FLOAT )
            // InternalHriDsl.g:3990:3: RULE_FLOAT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000001F000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00007E0000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x000F800000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000000002L});

}
