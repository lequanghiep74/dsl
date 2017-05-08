package org.xtext.example.domainmodel.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.domainmodel.services.DomainmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainmodelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DIGIT", "RULE_REAL", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'run'", "'||'", "'&&'", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'>'", "'<'", "'='", "'>='", "'<='", "'Int'", "'Real'", "'Bool'", "'String'", "'('", "')'", "'!'", "'enum'", "'{'", "'}'", "'define'", "'precondition'", "'testcase'", "'function'", "','"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_DIGIT=5;
    public static final int RULE_REAL=6;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDomainmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainmodelParser.tokenNames; }
    public String getGrammarFileName() { return "../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g"; }


     
     	private DomainmodelGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DomainmodelGrammarAccess grammarAccess) {
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
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:61:1: ( ruleModel EOF )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:69:1: ruleModel : ( ( rule__Model__MyDSLAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:73:2: ( ( ( rule__Model__MyDSLAssignment )* ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:74:1: ( ( rule__Model__MyDSLAssignment )* )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:74:1: ( ( rule__Model__MyDSLAssignment )* )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:75:1: ( rule__Model__MyDSLAssignment )*
            {
             before(grammarAccess.getModelAccess().getMyDSLAssignment()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:76:1: ( rule__Model__MyDSLAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==34||(LA1_0>=37 && LA1_0<=40)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:76:2: rule__Model__MyDSLAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__MyDSLAssignment_in_ruleModel94);
            	    rule__Model__MyDSLAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getMyDSLAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRulemyDSL"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:88:1: entryRulemyDSL : rulemyDSL EOF ;
    public final void entryRulemyDSL() throws RecognitionException {
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:89:1: ( rulemyDSL EOF )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:90:1: rulemyDSL EOF
            {
             before(grammarAccess.getMyDSLRule()); 
            pushFollow(FOLLOW_rulemyDSL_in_entryRulemyDSL122);
            rulemyDSL();

            state._fsp--;

             after(grammarAccess.getMyDSLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemyDSL129); 

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
    // $ANTLR end "entryRulemyDSL"


    // $ANTLR start "rulemyDSL"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:97:1: rulemyDSL : ( ( rule__MyDSL__Alternatives ) ) ;
    public final void rulemyDSL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:101:2: ( ( ( rule__MyDSL__Alternatives ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:102:1: ( ( rule__MyDSL__Alternatives ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:102:1: ( ( rule__MyDSL__Alternatives ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:103:1: ( rule__MyDSL__Alternatives )
            {
             before(grammarAccess.getMyDSLAccess().getAlternatives()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:104:1: ( rule__MyDSL__Alternatives )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:104:2: rule__MyDSL__Alternatives
            {
            pushFollow(FOLLOW_rule__MyDSL__Alternatives_in_rulemyDSL155);
            rule__MyDSL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMyDSLAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemyDSL"


    // $ANTLR start "entryRuleConditionOperation"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:116:1: entryRuleConditionOperation : ruleConditionOperation EOF ;
    public final void entryRuleConditionOperation() throws RecognitionException {
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:117:1: ( ruleConditionOperation EOF )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:118:1: ruleConditionOperation EOF
            {
             before(grammarAccess.getConditionOperationRule()); 
            pushFollow(FOLLOW_ruleConditionOperation_in_entryRuleConditionOperation182);
            ruleConditionOperation();

            state._fsp--;

             after(grammarAccess.getConditionOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionOperation189); 

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
    // $ANTLR end "entryRuleConditionOperation"


    // $ANTLR start "ruleConditionOperation"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:125:1: ruleConditionOperation : ( ( rule__ConditionOperation__Alternatives ) ) ;
    public final void ruleConditionOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:129:2: ( ( ( rule__ConditionOperation__Alternatives ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:130:1: ( ( rule__ConditionOperation__Alternatives ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:130:1: ( ( rule__ConditionOperation__Alternatives ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:131:1: ( rule__ConditionOperation__Alternatives )
            {
             before(grammarAccess.getConditionOperationAccess().getAlternatives()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:132:1: ( rule__ConditionOperation__Alternatives )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:132:2: rule__ConditionOperation__Alternatives
            {
            pushFollow(FOLLOW_rule__ConditionOperation__Alternatives_in_ruleConditionOperation215);
            rule__ConditionOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionOperation"


    // $ANTLR start "entryRuleMathOperation"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:144:1: entryRuleMathOperation : ruleMathOperation EOF ;
    public final void entryRuleMathOperation() throws RecognitionException {
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:145:1: ( ruleMathOperation EOF )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:146:1: ruleMathOperation EOF
            {
             before(grammarAccess.getMathOperationRule()); 
            pushFollow(FOLLOW_ruleMathOperation_in_entryRuleMathOperation242);
            ruleMathOperation();

            state._fsp--;

             after(grammarAccess.getMathOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathOperation249); 

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
    // $ANTLR end "entryRuleMathOperation"


    // $ANTLR start "ruleMathOperation"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:153:1: ruleMathOperation : ( ( rule__MathOperation__Alternatives ) ) ;
    public final void ruleMathOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:157:2: ( ( ( rule__MathOperation__Alternatives ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:158:1: ( ( rule__MathOperation__Alternatives ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:158:1: ( ( rule__MathOperation__Alternatives ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:159:1: ( rule__MathOperation__Alternatives )
            {
             before(grammarAccess.getMathOperationAccess().getAlternatives()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:160:1: ( rule__MathOperation__Alternatives )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:160:2: rule__MathOperation__Alternatives
            {
            pushFollow(FOLLOW_rule__MathOperation__Alternatives_in_ruleMathOperation275);
            rule__MathOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMathOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMathOperation"


    // $ANTLR start "entryRuleCompareOperation"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:172:1: entryRuleCompareOperation : ruleCompareOperation EOF ;
    public final void entryRuleCompareOperation() throws RecognitionException {
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:173:1: ( ruleCompareOperation EOF )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:174:1: ruleCompareOperation EOF
            {
             before(grammarAccess.getCompareOperationRule()); 
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation302);
            ruleCompareOperation();

            state._fsp--;

             after(grammarAccess.getCompareOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation309); 

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
    // $ANTLR end "entryRuleCompareOperation"


    // $ANTLR start "ruleCompareOperation"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:181:1: ruleCompareOperation : ( ( rule__CompareOperation__Alternatives ) ) ;
    public final void ruleCompareOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:185:2: ( ( ( rule__CompareOperation__Alternatives ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:186:1: ( ( rule__CompareOperation__Alternatives ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:186:1: ( ( rule__CompareOperation__Alternatives ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:187:1: ( rule__CompareOperation__Alternatives )
            {
             before(grammarAccess.getCompareOperationAccess().getAlternatives()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:188:1: ( rule__CompareOperation__Alternatives )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:188:2: rule__CompareOperation__Alternatives
            {
            pushFollow(FOLLOW_rule__CompareOperation__Alternatives_in_ruleCompareOperation335);
            rule__CompareOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompareOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleVariable"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:200:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:201:1: ( ruleVariable EOF )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:202:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable362);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable369); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:209:1: ruleVariable : ( ( rule__Variable__Alternatives ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:213:2: ( ( ( rule__Variable__Alternatives ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:214:1: ( ( rule__Variable__Alternatives ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:214:1: ( ( rule__Variable__Alternatives ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:215:1: ( rule__Variable__Alternatives )
            {
             before(grammarAccess.getVariableAccess().getAlternatives()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:216:1: ( rule__Variable__Alternatives )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:216:2: rule__Variable__Alternatives
            {
            pushFollow(FOLLOW_rule__Variable__Alternatives_in_ruleVariable395);
            rule__Variable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleMathFormula"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:228:1: entryRuleMathFormula : ruleMathFormula EOF ;
    public final void entryRuleMathFormula() throws RecognitionException {
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:229:1: ( ruleMathFormula EOF )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:230:1: ruleMathFormula EOF
            {
             before(grammarAccess.getMathFormulaRule()); 
            pushFollow(FOLLOW_ruleMathFormula_in_entryRuleMathFormula422);
            ruleMathFormula();

            state._fsp--;

             after(grammarAccess.getMathFormulaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathFormula429); 

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
    // $ANTLR end "entryRuleMathFormula"


    // $ANTLR start "ruleMathFormula"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:237:1: ruleMathFormula : ( ( rule__MathFormula__Group__0 ) ) ;
    public final void ruleMathFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:241:2: ( ( ( rule__MathFormula__Group__0 ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:242:1: ( ( rule__MathFormula__Group__0 ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:242:1: ( ( rule__MathFormula__Group__0 ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:243:1: ( rule__MathFormula__Group__0 )
            {
             before(grammarAccess.getMathFormulaAccess().getGroup()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:244:1: ( rule__MathFormula__Group__0 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:244:2: rule__MathFormula__Group__0
            {
            pushFollow(FOLLOW_rule__MathFormula__Group__0_in_ruleMathFormula455);
            rule__MathFormula__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMathFormulaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMathFormula"


    // $ANTLR start "entryRuleCompareFormula"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:256:1: entryRuleCompareFormula : ruleCompareFormula EOF ;
    public final void entryRuleCompareFormula() throws RecognitionException {
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:257:1: ( ruleCompareFormula EOF )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:258:1: ruleCompareFormula EOF
            {
             before(grammarAccess.getCompareFormulaRule()); 
            pushFollow(FOLLOW_ruleCompareFormula_in_entryRuleCompareFormula482);
            ruleCompareFormula();

            state._fsp--;

             after(grammarAccess.getCompareFormulaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareFormula489); 

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
    // $ANTLR end "entryRuleCompareFormula"


    // $ANTLR start "ruleCompareFormula"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:265:1: ruleCompareFormula : ( ( rule__CompareFormula__Alternatives ) ) ;
    public final void ruleCompareFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:269:2: ( ( ( rule__CompareFormula__Alternatives ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:270:1: ( ( rule__CompareFormula__Alternatives ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:270:1: ( ( rule__CompareFormula__Alternatives ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:271:1: ( rule__CompareFormula__Alternatives )
            {
             before(grammarAccess.getCompareFormulaAccess().getAlternatives()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:272:1: ( rule__CompareFormula__Alternatives )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:272:2: rule__CompareFormula__Alternatives
            {
            pushFollow(FOLLOW_rule__CompareFormula__Alternatives_in_ruleCompareFormula515);
            rule__CompareFormula__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompareFormulaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompareFormula"


    // $ANTLR start "entryRuleMyID"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:284:1: entryRuleMyID : ruleMyID EOF ;
    public final void entryRuleMyID() throws RecognitionException {
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:285:1: ( ruleMyID EOF )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:286:1: ruleMyID EOF
            {
             before(grammarAccess.getMyIDRule()); 
            pushFollow(FOLLOW_ruleMyID_in_entryRuleMyID542);
            ruleMyID();

            state._fsp--;

             after(grammarAccess.getMyIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMyID549); 

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
    // $ANTLR end "entryRuleMyID"


    // $ANTLR start "ruleMyID"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:293:1: ruleMyID : ( ( rule__MyID__Group__0 ) ) ;
    public final void ruleMyID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:297:2: ( ( ( rule__MyID__Group__0 ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:298:1: ( ( rule__MyID__Group__0 ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:298:1: ( ( rule__MyID__Group__0 ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:299:1: ( rule__MyID__Group__0 )
            {
             before(grammarAccess.getMyIDAccess().getGroup()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:300:1: ( rule__MyID__Group__0 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:300:2: rule__MyID__Group__0
            {
            pushFollow(FOLLOW_rule__MyID__Group__0_in_ruleMyID575);
            rule__MyID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMyID"


    // $ANTLR start "entryRuleTestcaseElement"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:312:1: entryRuleTestcaseElement : ruleTestcaseElement EOF ;
    public final void entryRuleTestcaseElement() throws RecognitionException {
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:313:1: ( ruleTestcaseElement EOF )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:314:1: ruleTestcaseElement EOF
            {
             before(grammarAccess.getTestcaseElementRule()); 
            pushFollow(FOLLOW_ruleTestcaseElement_in_entryRuleTestcaseElement602);
            ruleTestcaseElement();

            state._fsp--;

             after(grammarAccess.getTestcaseElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestcaseElement609); 

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
    // $ANTLR end "entryRuleTestcaseElement"


    // $ANTLR start "ruleTestcaseElement"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:321:1: ruleTestcaseElement : ( ( rule__TestcaseElement__Alternatives ) ) ;
    public final void ruleTestcaseElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:325:2: ( ( ( rule__TestcaseElement__Alternatives ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:326:1: ( ( rule__TestcaseElement__Alternatives ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:326:1: ( ( rule__TestcaseElement__Alternatives ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:327:1: ( rule__TestcaseElement__Alternatives )
            {
             before(grammarAccess.getTestcaseElementAccess().getAlternatives()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:328:1: ( rule__TestcaseElement__Alternatives )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:328:2: rule__TestcaseElement__Alternatives
            {
            pushFollow(FOLLOW_rule__TestcaseElement__Alternatives_in_ruleTestcaseElement635);
            rule__TestcaseElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTestcaseElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTestcaseElement"


    // $ANTLR start "entryRuleEnum"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:340:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:341:1: ( ruleEnum EOF )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:342:1: ruleEnum EOF
            {
             before(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum662);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEnumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum669); 

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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:349:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:353:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:354:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:354:1: ( ( rule__Enum__Group__0 ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:355:1: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:356:1: ( rule__Enum__Group__0 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:356:2: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_rule__Enum__Group__0_in_ruleEnum695);
            rule__Enum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumOptions"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:368:1: entryRuleEnumOptions : ruleEnumOptions EOF ;
    public final void entryRuleEnumOptions() throws RecognitionException {
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:369:1: ( ruleEnumOptions EOF )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:370:1: ruleEnumOptions EOF
            {
             before(grammarAccess.getEnumOptionsRule()); 
            pushFollow(FOLLOW_ruleEnumOptions_in_entryRuleEnumOptions722);
            ruleEnumOptions();

            state._fsp--;

             after(grammarAccess.getEnumOptionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumOptions729); 

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
    // $ANTLR end "entryRuleEnumOptions"


    // $ANTLR start "ruleEnumOptions"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:377:1: ruleEnumOptions : ( ( RULE_ID )* ) ;
    public final void ruleEnumOptions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:381:2: ( ( ( RULE_ID )* ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:382:1: ( ( RULE_ID )* )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:382:1: ( ( RULE_ID )* )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:383:1: ( RULE_ID )*
            {
             before(grammarAccess.getEnumOptionsAccess().getIDTerminalRuleCall()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:384:1: ( RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:384:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumOptions756); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getEnumOptionsAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumOptions"


    // $ANTLR start "entryRuleDefine"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:396:1: entryRuleDefine : ruleDefine EOF ;
    public final void entryRuleDefine() throws RecognitionException {
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:397:1: ( ruleDefine EOF )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:398:1: ruleDefine EOF
            {
             before(grammarAccess.getDefineRule()); 
            pushFollow(FOLLOW_ruleDefine_in_entryRuleDefine784);
            ruleDefine();

            state._fsp--;

             after(grammarAccess.getDefineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefine791); 

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
    // $ANTLR end "entryRuleDefine"


    // $ANTLR start "ruleDefine"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:405:1: ruleDefine : ( ( rule__Define__Group__0 ) ) ;
    public final void ruleDefine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:409:2: ( ( ( rule__Define__Group__0 ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:410:1: ( ( rule__Define__Group__0 ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:410:1: ( ( rule__Define__Group__0 ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:411:1: ( rule__Define__Group__0 )
            {
             before(grammarAccess.getDefineAccess().getGroup()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:412:1: ( rule__Define__Group__0 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:412:2: rule__Define__Group__0
            {
            pushFollow(FOLLOW_rule__Define__Group__0_in_ruleDefine817);
            rule__Define__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefine"


    // $ANTLR start "entryRulePrecondition"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:424:1: entryRulePrecondition : rulePrecondition EOF ;
    public final void entryRulePrecondition() throws RecognitionException {
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:425:1: ( rulePrecondition EOF )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:426:1: rulePrecondition EOF
            {
             before(grammarAccess.getPreconditionRule()); 
            pushFollow(FOLLOW_rulePrecondition_in_entryRulePrecondition844);
            rulePrecondition();

            state._fsp--;

             after(grammarAccess.getPreconditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrecondition851); 

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
    // $ANTLR end "entryRulePrecondition"


    // $ANTLR start "rulePrecondition"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:433:1: rulePrecondition : ( ( rule__Precondition__Group__0 ) ) ;
    public final void rulePrecondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:437:2: ( ( ( rule__Precondition__Group__0 ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:438:1: ( ( rule__Precondition__Group__0 ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:438:1: ( ( rule__Precondition__Group__0 ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:439:1: ( rule__Precondition__Group__0 )
            {
             before(grammarAccess.getPreconditionAccess().getGroup()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:440:1: ( rule__Precondition__Group__0 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:440:2: rule__Precondition__Group__0
            {
            pushFollow(FOLLOW_rule__Precondition__Group__0_in_rulePrecondition877);
            rule__Precondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrecondition"


    // $ANTLR start "entryRuleTestCondition"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:452:1: entryRuleTestCondition : ruleTestCondition EOF ;
    public final void entryRuleTestCondition() throws RecognitionException {
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:453:1: ( ruleTestCondition EOF )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:454:1: ruleTestCondition EOF
            {
             before(grammarAccess.getTestConditionRule()); 
            pushFollow(FOLLOW_ruleTestCondition_in_entryRuleTestCondition904);
            ruleTestCondition();

            state._fsp--;

             after(grammarAccess.getTestConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestCondition911); 

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
    // $ANTLR end "entryRuleTestCondition"


    // $ANTLR start "ruleTestCondition"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:461:1: ruleTestCondition : ( ( rule__TestCondition__Group__0 ) ) ;
    public final void ruleTestCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:465:2: ( ( ( rule__TestCondition__Group__0 ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:466:1: ( ( rule__TestCondition__Group__0 ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:466:1: ( ( rule__TestCondition__Group__0 ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:467:1: ( rule__TestCondition__Group__0 )
            {
             before(grammarAccess.getTestConditionAccess().getGroup()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:468:1: ( rule__TestCondition__Group__0 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:468:2: rule__TestCondition__Group__0
            {
            pushFollow(FOLLOW_rule__TestCondition__Group__0_in_ruleTestCondition937);
            rule__TestCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTestCondition"


    // $ANTLR start "entryRuleTestcase"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:480:1: entryRuleTestcase : ruleTestcase EOF ;
    public final void entryRuleTestcase() throws RecognitionException {
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:481:1: ( ruleTestcase EOF )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:482:1: ruleTestcase EOF
            {
             before(grammarAccess.getTestcaseRule()); 
            pushFollow(FOLLOW_ruleTestcase_in_entryRuleTestcase964);
            ruleTestcase();

            state._fsp--;

             after(grammarAccess.getTestcaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestcase971); 

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
    // $ANTLR end "entryRuleTestcase"


    // $ANTLR start "ruleTestcase"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:489:1: ruleTestcase : ( ( rule__Testcase__Group__0 ) ) ;
    public final void ruleTestcase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:493:2: ( ( ( rule__Testcase__Group__0 ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:494:1: ( ( rule__Testcase__Group__0 ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:494:1: ( ( rule__Testcase__Group__0 ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:495:1: ( rule__Testcase__Group__0 )
            {
             before(grammarAccess.getTestcaseAccess().getGroup()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:496:1: ( rule__Testcase__Group__0 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:496:2: rule__Testcase__Group__0
            {
            pushFollow(FOLLOW_rule__Testcase__Group__0_in_ruleTestcase997);
            rule__Testcase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestcaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTestcase"


    // $ANTLR start "entryRuleDatatype"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:508:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:509:1: ( ruleDatatype EOF )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:510:1: ruleDatatype EOF
            {
             before(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype1024);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getDatatypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype1031); 

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
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:517:1: ruleDatatype : ( ( rule__Datatype__Alternatives ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:521:2: ( ( ( rule__Datatype__Alternatives ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:522:1: ( ( rule__Datatype__Alternatives ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:522:1: ( ( rule__Datatype__Alternatives ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:523:1: ( rule__Datatype__Alternatives )
            {
             before(grammarAccess.getDatatypeAccess().getAlternatives()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:524:1: ( rule__Datatype__Alternatives )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:524:2: rule__Datatype__Alternatives
            {
            pushFollow(FOLLOW_rule__Datatype__Alternatives_in_ruleDatatype1057);
            rule__Datatype__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleFunction"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:536:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:537:1: ( ruleFunction EOF )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:538:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction1084);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction1091); 

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:545:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:549:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:550:1: ( ( rule__Function__Group__0 ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:550:1: ( ( rule__Function__Group__0 ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:551:1: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:552:1: ( rule__Function__Group__0 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:552:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_ruleFunction1117);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleRun"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:564:1: entryRuleRun : ruleRun EOF ;
    public final void entryRuleRun() throws RecognitionException {
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:565:1: ( ruleRun EOF )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:566:1: ruleRun EOF
            {
             before(grammarAccess.getRunRule()); 
            pushFollow(FOLLOW_ruleRun_in_entryRuleRun1144);
            ruleRun();

            state._fsp--;

             after(grammarAccess.getRunRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRun1151); 

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
    // $ANTLR end "entryRuleRun"


    // $ANTLR start "ruleRun"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:573:1: ruleRun : ( 'run' ) ;
    public final void ruleRun() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:577:2: ( ( 'run' ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:578:1: ( 'run' )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:578:1: ( 'run' )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:579:1: 'run'
            {
             before(grammarAccess.getRunAccess().getRunKeyword()); 
            match(input,13,FOLLOW_13_in_ruleRun1178); 
             after(grammarAccess.getRunAccess().getRunKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRun"


    // $ANTLR start "rule__MyDSL__Alternatives"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:594:1: rule__MyDSL__Alternatives : ( ( ruleEnum ) | ( ruleDefine ) | ( rulePrecondition ) | ( ruleTestcase ) | ( ruleFunction ) | ( ruleRun ) );
    public final void rule__MyDSL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:598:1: ( ( ruleEnum ) | ( ruleDefine ) | ( rulePrecondition ) | ( ruleTestcase ) | ( ruleFunction ) | ( ruleRun ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt3=1;
                }
                break;
            case 37:
                {
                alt3=2;
                }
                break;
            case 38:
                {
                alt3=3;
                }
                break;
            case 39:
                {
                alt3=4;
                }
                break;
            case 40:
                {
                alt3=5;
                }
                break;
            case 13:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:599:1: ( ruleEnum )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:599:1: ( ruleEnum )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:600:1: ruleEnum
                    {
                     before(grammarAccess.getMyDSLAccess().getEnumParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEnum_in_rule__MyDSL__Alternatives1215);
                    ruleEnum();

                    state._fsp--;

                     after(grammarAccess.getMyDSLAccess().getEnumParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:605:6: ( ruleDefine )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:605:6: ( ruleDefine )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:606:1: ruleDefine
                    {
                     before(grammarAccess.getMyDSLAccess().getDefineParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDefine_in_rule__MyDSL__Alternatives1232);
                    ruleDefine();

                    state._fsp--;

                     after(grammarAccess.getMyDSLAccess().getDefineParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:611:6: ( rulePrecondition )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:611:6: ( rulePrecondition )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:612:1: rulePrecondition
                    {
                     before(grammarAccess.getMyDSLAccess().getPreconditionParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePrecondition_in_rule__MyDSL__Alternatives1249);
                    rulePrecondition();

                    state._fsp--;

                     after(grammarAccess.getMyDSLAccess().getPreconditionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:617:6: ( ruleTestcase )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:617:6: ( ruleTestcase )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:618:1: ruleTestcase
                    {
                     before(grammarAccess.getMyDSLAccess().getTestcaseParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleTestcase_in_rule__MyDSL__Alternatives1266);
                    ruleTestcase();

                    state._fsp--;

                     after(grammarAccess.getMyDSLAccess().getTestcaseParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:623:6: ( ruleFunction )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:623:6: ( ruleFunction )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:624:1: ruleFunction
                    {
                     before(grammarAccess.getMyDSLAccess().getFunctionParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleFunction_in_rule__MyDSL__Alternatives1283);
                    ruleFunction();

                    state._fsp--;

                     after(grammarAccess.getMyDSLAccess().getFunctionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:629:6: ( ruleRun )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:629:6: ( ruleRun )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:630:1: ruleRun
                    {
                     before(grammarAccess.getMyDSLAccess().getRunParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleRun_in_rule__MyDSL__Alternatives1300);
                    ruleRun();

                    state._fsp--;

                     after(grammarAccess.getMyDSLAccess().getRunParserRuleCall_5()); 

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
    // $ANTLR end "rule__MyDSL__Alternatives"


    // $ANTLR start "rule__ConditionOperation__Alternatives"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:640:1: rule__ConditionOperation__Alternatives : ( ( '||' ) | ( '&&' ) );
    public final void rule__ConditionOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:644:1: ( ( '||' ) | ( '&&' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:645:1: ( '||' )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:645:1: ( '||' )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:646:1: '||'
                    {
                     before(grammarAccess.getConditionOperationAccess().getVerticalLineVerticalLineKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__ConditionOperation__Alternatives1333); 
                     after(grammarAccess.getConditionOperationAccess().getVerticalLineVerticalLineKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:653:6: ( '&&' )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:653:6: ( '&&' )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:654:1: '&&'
                    {
                     before(grammarAccess.getConditionOperationAccess().getAmpersandAmpersandKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__ConditionOperation__Alternatives1353); 
                     after(grammarAccess.getConditionOperationAccess().getAmpersandAmpersandKeyword_1()); 

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
    // $ANTLR end "rule__ConditionOperation__Alternatives"


    // $ANTLR start "rule__MathOperation__Alternatives"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:666:1: rule__MathOperation__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '^' ) | ( '%' ) );
    public final void rule__MathOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:670:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '^' ) | ( '%' ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 19:
                {
                alt5=4;
                }
                break;
            case 20:
                {
                alt5=5;
                }
                break;
            case 21:
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
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:671:1: ( '+' )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:671:1: ( '+' )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:672:1: '+'
                    {
                     before(grammarAccess.getMathOperationAccess().getPlusSignKeyword_0()); 
                    match(input,16,FOLLOW_16_in_rule__MathOperation__Alternatives1388); 
                     after(grammarAccess.getMathOperationAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:679:6: ( '-' )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:679:6: ( '-' )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:680:1: '-'
                    {
                     before(grammarAccess.getMathOperationAccess().getHyphenMinusKeyword_1()); 
                    match(input,17,FOLLOW_17_in_rule__MathOperation__Alternatives1408); 
                     after(grammarAccess.getMathOperationAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:687:6: ( '*' )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:687:6: ( '*' )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:688:1: '*'
                    {
                     before(grammarAccess.getMathOperationAccess().getAsteriskKeyword_2()); 
                    match(input,18,FOLLOW_18_in_rule__MathOperation__Alternatives1428); 
                     after(grammarAccess.getMathOperationAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:695:6: ( '/' )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:695:6: ( '/' )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:696:1: '/'
                    {
                     before(grammarAccess.getMathOperationAccess().getSolidusKeyword_3()); 
                    match(input,19,FOLLOW_19_in_rule__MathOperation__Alternatives1448); 
                     after(grammarAccess.getMathOperationAccess().getSolidusKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:703:6: ( '^' )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:703:6: ( '^' )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:704:1: '^'
                    {
                     before(grammarAccess.getMathOperationAccess().getCircumflexAccentKeyword_4()); 
                    match(input,20,FOLLOW_20_in_rule__MathOperation__Alternatives1468); 
                     after(grammarAccess.getMathOperationAccess().getCircumflexAccentKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:711:6: ( '%' )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:711:6: ( '%' )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:712:1: '%'
                    {
                     before(grammarAccess.getMathOperationAccess().getPercentSignKeyword_5()); 
                    match(input,21,FOLLOW_21_in_rule__MathOperation__Alternatives1488); 
                     after(grammarAccess.getMathOperationAccess().getPercentSignKeyword_5()); 

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
    // $ANTLR end "rule__MathOperation__Alternatives"


    // $ANTLR start "rule__CompareOperation__Alternatives"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:724:1: rule__CompareOperation__Alternatives : ( ( '>' ) | ( '<' ) | ( '=' ) | ( '>=' ) | ( '<=' ) );
    public final void rule__CompareOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:728:1: ( ( '>' ) | ( '<' ) | ( '=' ) | ( '>=' ) | ( '<=' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            case 25:
                {
                alt6=4;
                }
                break;
            case 26:
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
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:729:1: ( '>' )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:729:1: ( '>' )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:730:1: '>'
                    {
                     before(grammarAccess.getCompareOperationAccess().getGreaterThanSignKeyword_0()); 
                    match(input,22,FOLLOW_22_in_rule__CompareOperation__Alternatives1523); 
                     after(grammarAccess.getCompareOperationAccess().getGreaterThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:737:6: ( '<' )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:737:6: ( '<' )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:738:1: '<'
                    {
                     before(grammarAccess.getCompareOperationAccess().getLessThanSignKeyword_1()); 
                    match(input,23,FOLLOW_23_in_rule__CompareOperation__Alternatives1543); 
                     after(grammarAccess.getCompareOperationAccess().getLessThanSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:745:6: ( '=' )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:745:6: ( '=' )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:746:1: '='
                    {
                     before(grammarAccess.getCompareOperationAccess().getEqualsSignKeyword_2()); 
                    match(input,24,FOLLOW_24_in_rule__CompareOperation__Alternatives1563); 
                     after(grammarAccess.getCompareOperationAccess().getEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:753:6: ( '>=' )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:753:6: ( '>=' )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:754:1: '>='
                    {
                     before(grammarAccess.getCompareOperationAccess().getGreaterThanSignEqualsSignKeyword_3()); 
                    match(input,25,FOLLOW_25_in_rule__CompareOperation__Alternatives1583); 
                     after(grammarAccess.getCompareOperationAccess().getGreaterThanSignEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:761:6: ( '<=' )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:761:6: ( '<=' )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:762:1: '<='
                    {
                     before(grammarAccess.getCompareOperationAccess().getLessThanSignEqualsSignKeyword_4()); 
                    match(input,26,FOLLOW_26_in_rule__CompareOperation__Alternatives1603); 
                     after(grammarAccess.getCompareOperationAccess().getLessThanSignEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__CompareOperation__Alternatives"


    // $ANTLR start "rule__Variable__Alternatives"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:774:1: rule__Variable__Alternatives : ( ( ruleMyID ) | ( RULE_DIGIT ) | ( RULE_REAL ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:778:1: ( ( ruleMyID ) | ( RULE_DIGIT ) | ( RULE_REAL ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 17:
            case 33:
                {
                alt7=1;
                }
                break;
            case RULE_DIGIT:
                {
                alt7=2;
                }
                break;
            case RULE_REAL:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:779:1: ( ruleMyID )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:779:1: ( ruleMyID )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:780:1: ruleMyID
                    {
                     before(grammarAccess.getVariableAccess().getMyIDParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMyID_in_rule__Variable__Alternatives1637);
                    ruleMyID();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getMyIDParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:785:6: ( RULE_DIGIT )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:785:6: ( RULE_DIGIT )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:786:1: RULE_DIGIT
                    {
                     before(grammarAccess.getVariableAccess().getDIGITTerminalRuleCall_1()); 
                    match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_rule__Variable__Alternatives1654); 
                     after(grammarAccess.getVariableAccess().getDIGITTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:791:6: ( RULE_REAL )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:791:6: ( RULE_REAL )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:792:1: RULE_REAL
                    {
                     before(grammarAccess.getVariableAccess().getREALTerminalRuleCall_2()); 
                    match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__Variable__Alternatives1671); 
                     after(grammarAccess.getVariableAccess().getREALTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Variable__Alternatives"


    // $ANTLR start "rule__CompareFormula__Alternatives"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:802:1: rule__CompareFormula__Alternatives : ( ( ( rule__CompareFormula__Group_0__0 ) ) | ( ( rule__CompareFormula__Group_1__0 ) ) );
    public final void rule__CompareFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:806:1: ( ( ( rule__CompareFormula__Group_0__0 ) ) | ( ( rule__CompareFormula__Group_1__0 ) ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:807:1: ( ( rule__CompareFormula__Group_0__0 ) )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:807:1: ( ( rule__CompareFormula__Group_0__0 ) )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:808:1: ( rule__CompareFormula__Group_0__0 )
                    {
                     before(grammarAccess.getCompareFormulaAccess().getGroup_0()); 
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:809:1: ( rule__CompareFormula__Group_0__0 )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:809:2: rule__CompareFormula__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CompareFormula__Group_0__0_in_rule__CompareFormula__Alternatives1703);
                    rule__CompareFormula__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompareFormulaAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:813:6: ( ( rule__CompareFormula__Group_1__0 ) )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:813:6: ( ( rule__CompareFormula__Group_1__0 ) )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:814:1: ( rule__CompareFormula__Group_1__0 )
                    {
                     before(grammarAccess.getCompareFormulaAccess().getGroup_1()); 
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:815:1: ( rule__CompareFormula__Group_1__0 )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:815:2: rule__CompareFormula__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CompareFormula__Group_1__0_in_rule__CompareFormula__Alternatives1721);
                    rule__CompareFormula__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompareFormulaAccess().getGroup_1()); 

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
    // $ANTLR end "rule__CompareFormula__Alternatives"


    // $ANTLR start "rule__MyID__Alternatives_1"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:824:1: rule__MyID__Alternatives_1 : ( ( RULE_ID ) | ( ( rule__MyID__Group_1_1__0 ) ) );
    public final void rule__MyID__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:828:1: ( ( RULE_ID ) | ( ( rule__MyID__Group_1_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==33) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:829:1: ( RULE_ID )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:829:1: ( RULE_ID )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:830:1: RULE_ID
                    {
                     before(grammarAccess.getMyIDAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MyID__Alternatives_11754); 
                     after(grammarAccess.getMyIDAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:835:6: ( ( rule__MyID__Group_1_1__0 ) )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:835:6: ( ( rule__MyID__Group_1_1__0 ) )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:836:1: ( rule__MyID__Group_1_1__0 )
                    {
                     before(grammarAccess.getMyIDAccess().getGroup_1_1()); 
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:837:1: ( rule__MyID__Group_1_1__0 )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:837:2: rule__MyID__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__MyID__Group_1_1__0_in_rule__MyID__Alternatives_11771);
                    rule__MyID__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMyIDAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__MyID__Alternatives_1"


    // $ANTLR start "rule__TestcaseElement__Alternatives"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:846:1: rule__TestcaseElement__Alternatives : ( ( ruleCompareFormula ) | ( ruleMathFormula ) );
    public final void rule__TestcaseElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:850:1: ( ( ruleCompareFormula ) | ( ruleMathFormula ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:851:1: ( ruleCompareFormula )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:851:1: ( ruleCompareFormula )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:852:1: ruleCompareFormula
                    {
                     before(grammarAccess.getTestcaseElementAccess().getCompareFormulaParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCompareFormula_in_rule__TestcaseElement__Alternatives1804);
                    ruleCompareFormula();

                    state._fsp--;

                     after(grammarAccess.getTestcaseElementAccess().getCompareFormulaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:857:6: ( ruleMathFormula )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:857:6: ( ruleMathFormula )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:858:1: ruleMathFormula
                    {
                     before(grammarAccess.getTestcaseElementAccess().getMathFormulaParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMathFormula_in_rule__TestcaseElement__Alternatives1821);
                    ruleMathFormula();

                    state._fsp--;

                     after(grammarAccess.getTestcaseElementAccess().getMathFormulaParserRuleCall_1()); 

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
    // $ANTLR end "rule__TestcaseElement__Alternatives"


    // $ANTLR start "rule__Enum__Alternatives_1"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:868:1: rule__Enum__Alternatives_1 : ( ( RULE_ID ) | ( 'Int' ) | ( 'Real' ) | ( 'Bool' ) | ( 'String' ) );
    public final void rule__Enum__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:872:1: ( ( RULE_ID ) | ( 'Int' ) | ( 'Real' ) | ( 'Bool' ) | ( 'String' ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case 27:
                {
                alt11=2;
                }
                break;
            case 28:
                {
                alt11=3;
                }
                break;
            case 29:
                {
                alt11=4;
                }
                break;
            case 30:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:873:1: ( RULE_ID )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:873:1: ( RULE_ID )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:874:1: RULE_ID
                    {
                     before(grammarAccess.getEnumAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__Alternatives_11853); 
                     after(grammarAccess.getEnumAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:879:6: ( 'Int' )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:879:6: ( 'Int' )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:880:1: 'Int'
                    {
                     before(grammarAccess.getEnumAccess().getIntKeyword_1_1()); 
                    match(input,27,FOLLOW_27_in_rule__Enum__Alternatives_11871); 
                     after(grammarAccess.getEnumAccess().getIntKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:887:6: ( 'Real' )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:887:6: ( 'Real' )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:888:1: 'Real'
                    {
                     before(grammarAccess.getEnumAccess().getRealKeyword_1_2()); 
                    match(input,28,FOLLOW_28_in_rule__Enum__Alternatives_11891); 
                     after(grammarAccess.getEnumAccess().getRealKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:895:6: ( 'Bool' )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:895:6: ( 'Bool' )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:896:1: 'Bool'
                    {
                     before(grammarAccess.getEnumAccess().getBoolKeyword_1_3()); 
                    match(input,29,FOLLOW_29_in_rule__Enum__Alternatives_11911); 
                     after(grammarAccess.getEnumAccess().getBoolKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:903:6: ( 'String' )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:903:6: ( 'String' )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:904:1: 'String'
                    {
                     before(grammarAccess.getEnumAccess().getStringKeyword_1_4()); 
                    match(input,30,FOLLOW_30_in_rule__Enum__Alternatives_11931); 
                     after(grammarAccess.getEnumAccess().getStringKeyword_1_4()); 

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
    // $ANTLR end "rule__Enum__Alternatives_1"


    // $ANTLR start "rule__Define__Alternatives_4"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:916:1: rule__Define__Alternatives_4 : ( ( ruleCompareFormula ) | ( ruleMyID ) );
    public final void rule__Define__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:920:1: ( ( ruleCompareFormula ) | ( ruleMyID ) )
            int alt12=2;
            switch ( input.LA(1) ) {
            case RULE_DIGIT:
            case RULE_REAL:
            case 31:
                {
                alt12=1;
                }
                break;
            case 17:
                {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        {
                        alt12=1;
                        }
                        break;
                    case 32:
                        {
                        int LA12_5 = input.LA(4);

                        if ( ((LA12_5>=22 && LA12_5<=26)) ) {
                            alt12=1;
                        }
                        else if ( ((LA12_5>=14 && LA12_5<=15)||LA12_5==36) ) {
                            alt12=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 14:
                    case 15:
                    case 36:
                        {
                        alt12=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 3, input);

                        throw nvae;
                    }

                }
                else if ( (LA12_2==33) ) {
                    int LA12_4 = input.LA(3);

                    if ( (LA12_4==RULE_ID) ) {
                        switch ( input.LA(4) ) {
                        case 32:
                            {
                            int LA12_5 = input.LA(5);

                            if ( ((LA12_5>=22 && LA12_5<=26)) ) {
                                alt12=1;
                            }
                            else if ( ((LA12_5>=14 && LA12_5<=15)||LA12_5==36) ) {
                                alt12=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 12, 5, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 14:
                        case 15:
                        case 36:
                            {
                            alt12=2;
                            }
                            break;
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                            {
                            alt12=1;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 7, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    {
                    alt12=1;
                    }
                    break;
                case 32:
                    {
                    int LA12_5 = input.LA(3);

                    if ( ((LA12_5>=22 && LA12_5<=26)) ) {
                        alt12=1;
                    }
                    else if ( ((LA12_5>=14 && LA12_5<=15)||LA12_5==36) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                case 15:
                case 36:
                    {
                    alt12=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 3, input);

                    throw nvae;
                }

                }
                break;
            case 33:
                {
                int LA12_4 = input.LA(2);

                if ( (LA12_4==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 32:
                        {
                        int LA12_5 = input.LA(4);

                        if ( ((LA12_5>=22 && LA12_5<=26)) ) {
                            alt12=1;
                        }
                        else if ( ((LA12_5>=14 && LA12_5<=15)||LA12_5==36) ) {
                            alt12=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 14:
                    case 15:
                    case 36:
                        {
                        alt12=2;
                        }
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        {
                        alt12=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 7, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:921:1: ( ruleCompareFormula )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:921:1: ( ruleCompareFormula )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:922:1: ruleCompareFormula
                    {
                     before(grammarAccess.getDefineAccess().getCompareFormulaParserRuleCall_4_0()); 
                    pushFollow(FOLLOW_ruleCompareFormula_in_rule__Define__Alternatives_41965);
                    ruleCompareFormula();

                    state._fsp--;

                     after(grammarAccess.getDefineAccess().getCompareFormulaParserRuleCall_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:927:6: ( ruleMyID )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:927:6: ( ruleMyID )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:928:1: ruleMyID
                    {
                     before(grammarAccess.getDefineAccess().getMyIDParserRuleCall_4_1()); 
                    pushFollow(FOLLOW_ruleMyID_in_rule__Define__Alternatives_41982);
                    ruleMyID();

                    state._fsp--;

                     after(grammarAccess.getDefineAccess().getMyIDParserRuleCall_4_1()); 

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
    // $ANTLR end "rule__Define__Alternatives_4"


    // $ANTLR start "rule__Define__Alternatives_6_2"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:938:1: rule__Define__Alternatives_6_2 : ( ( ruleCompareFormula ) | ( ruleMyID ) );
    public final void rule__Define__Alternatives_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:942:1: ( ( ruleCompareFormula ) | ( ruleMyID ) )
            int alt13=2;
            switch ( input.LA(1) ) {
            case RULE_DIGIT:
            case RULE_REAL:
            case 31:
                {
                alt13=1;
                }
                break;
            case 17:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 32:
                        {
                        int LA13_5 = input.LA(4);

                        if ( ((LA13_5>=14 && LA13_5<=15)||LA13_5==36) ) {
                            alt13=2;
                        }
                        else if ( ((LA13_5>=22 && LA13_5<=26)) ) {
                            alt13=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 14:
                    case 15:
                    case 36:
                        {
                        alt13=2;
                        }
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        {
                        alt13=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;
                    }

                }
                else if ( (LA13_2==33) ) {
                    int LA13_4 = input.LA(3);

                    if ( (LA13_4==RULE_ID) ) {
                        switch ( input.LA(4) ) {
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                            {
                            alt13=1;
                            }
                            break;
                        case 32:
                            {
                            int LA13_5 = input.LA(5);

                            if ( ((LA13_5>=14 && LA13_5<=15)||LA13_5==36) ) {
                                alt13=2;
                            }
                            else if ( ((LA13_5>=22 && LA13_5<=26)) ) {
                                alt13=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 5, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 14:
                        case 15:
                        case 36:
                            {
                            alt13=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 7, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 32:
                    {
                    int LA13_5 = input.LA(3);

                    if ( ((LA13_5>=14 && LA13_5<=15)||LA13_5==36) ) {
                        alt13=2;
                    }
                    else if ( ((LA13_5>=22 && LA13_5<=26)) ) {
                        alt13=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                case 15:
                case 36:
                    {
                    alt13=2;
                    }
                    break;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    {
                    alt13=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;
                }

                }
                break;
            case 33:
                {
                int LA13_4 = input.LA(2);

                if ( (LA13_4==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        {
                        alt13=1;
                        }
                        break;
                    case 32:
                        {
                        int LA13_5 = input.LA(4);

                        if ( ((LA13_5>=14 && LA13_5<=15)||LA13_5==36) ) {
                            alt13=2;
                        }
                        else if ( ((LA13_5>=22 && LA13_5<=26)) ) {
                            alt13=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 14:
                    case 15:
                    case 36:
                        {
                        alt13=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 7, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:943:1: ( ruleCompareFormula )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:943:1: ( ruleCompareFormula )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:944:1: ruleCompareFormula
                    {
                     before(grammarAccess.getDefineAccess().getCompareFormulaParserRuleCall_6_2_0()); 
                    pushFollow(FOLLOW_ruleCompareFormula_in_rule__Define__Alternatives_6_22014);
                    ruleCompareFormula();

                    state._fsp--;

                     after(grammarAccess.getDefineAccess().getCompareFormulaParserRuleCall_6_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:949:6: ( ruleMyID )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:949:6: ( ruleMyID )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:950:1: ruleMyID
                    {
                     before(grammarAccess.getDefineAccess().getMyIDParserRuleCall_6_2_1()); 
                    pushFollow(FOLLOW_ruleMyID_in_rule__Define__Alternatives_6_22031);
                    ruleMyID();

                    state._fsp--;

                     after(grammarAccess.getDefineAccess().getMyIDParserRuleCall_6_2_1()); 

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
    // $ANTLR end "rule__Define__Alternatives_6_2"


    // $ANTLR start "rule__Datatype__Alternatives"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:960:1: rule__Datatype__Alternatives : ( ( 'Int' ) | ( 'Real' ) | ( 'Bool' ) | ( 'String' ) );
    public final void rule__Datatype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:964:1: ( ( 'Int' ) | ( 'Real' ) | ( 'Bool' ) | ( 'String' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt14=1;
                }
                break;
            case 28:
                {
                alt14=2;
                }
                break;
            case 29:
                {
                alt14=3;
                }
                break;
            case 30:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:965:1: ( 'Int' )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:965:1: ( 'Int' )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:966:1: 'Int'
                    {
                     before(grammarAccess.getDatatypeAccess().getIntKeyword_0()); 
                    match(input,27,FOLLOW_27_in_rule__Datatype__Alternatives2064); 
                     after(grammarAccess.getDatatypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:973:6: ( 'Real' )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:973:6: ( 'Real' )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:974:1: 'Real'
                    {
                     before(grammarAccess.getDatatypeAccess().getRealKeyword_1()); 
                    match(input,28,FOLLOW_28_in_rule__Datatype__Alternatives2084); 
                     after(grammarAccess.getDatatypeAccess().getRealKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:981:6: ( 'Bool' )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:981:6: ( 'Bool' )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:982:1: 'Bool'
                    {
                     before(grammarAccess.getDatatypeAccess().getBoolKeyword_2()); 
                    match(input,29,FOLLOW_29_in_rule__Datatype__Alternatives2104); 
                     after(grammarAccess.getDatatypeAccess().getBoolKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:989:6: ( 'String' )
                    {
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:989:6: ( 'String' )
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:990:1: 'String'
                    {
                     before(grammarAccess.getDatatypeAccess().getStringKeyword_3()); 
                    match(input,30,FOLLOW_30_in_rule__Datatype__Alternatives2124); 
                     after(grammarAccess.getDatatypeAccess().getStringKeyword_3()); 

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
    // $ANTLR end "rule__Datatype__Alternatives"


    // $ANTLR start "rule__MathFormula__Group__0"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1004:1: rule__MathFormula__Group__0 : rule__MathFormula__Group__0__Impl rule__MathFormula__Group__1 ;
    public final void rule__MathFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1008:1: ( rule__MathFormula__Group__0__Impl rule__MathFormula__Group__1 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1009:2: rule__MathFormula__Group__0__Impl rule__MathFormula__Group__1
            {
            pushFollow(FOLLOW_rule__MathFormula__Group__0__Impl_in_rule__MathFormula__Group__02156);
            rule__MathFormula__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathFormula__Group__1_in_rule__MathFormula__Group__02159);
            rule__MathFormula__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathFormula__Group__0"


    // $ANTLR start "rule__MathFormula__Group__0__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1016:1: rule__MathFormula__Group__0__Impl : ( ( '(' )? ) ;
    public final void rule__MathFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1020:1: ( ( ( '(' )? ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1021:1: ( ( '(' )? )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1021:1: ( ( '(' )? )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1022:1: ( '(' )?
            {
             before(grammarAccess.getMathFormulaAccess().getLeftParenthesisKeyword_0()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1023:1: ( '(' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1024:2: '('
                    {
                    match(input,31,FOLLOW_31_in_rule__MathFormula__Group__0__Impl2188); 

                    }
                    break;

            }

             after(grammarAccess.getMathFormulaAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathFormula__Group__0__Impl"


    // $ANTLR start "rule__MathFormula__Group__1"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1035:1: rule__MathFormula__Group__1 : rule__MathFormula__Group__1__Impl rule__MathFormula__Group__2 ;
    public final void rule__MathFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1039:1: ( rule__MathFormula__Group__1__Impl rule__MathFormula__Group__2 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1040:2: rule__MathFormula__Group__1__Impl rule__MathFormula__Group__2
            {
            pushFollow(FOLLOW_rule__MathFormula__Group__1__Impl_in_rule__MathFormula__Group__12221);
            rule__MathFormula__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathFormula__Group__2_in_rule__MathFormula__Group__12224);
            rule__MathFormula__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathFormula__Group__1"


    // $ANTLR start "rule__MathFormula__Group__1__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1047:1: rule__MathFormula__Group__1__Impl : ( ruleVariable ) ;
    public final void rule__MathFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1051:1: ( ( ruleVariable ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1052:1: ( ruleVariable )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1052:1: ( ruleVariable )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1053:1: ruleVariable
            {
             before(grammarAccess.getMathFormulaAccess().getVariableParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__MathFormula__Group__1__Impl2251);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getMathFormulaAccess().getVariableParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathFormula__Group__1__Impl"


    // $ANTLR start "rule__MathFormula__Group__2"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1064:1: rule__MathFormula__Group__2 : rule__MathFormula__Group__2__Impl rule__MathFormula__Group__3 ;
    public final void rule__MathFormula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1068:1: ( rule__MathFormula__Group__2__Impl rule__MathFormula__Group__3 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1069:2: rule__MathFormula__Group__2__Impl rule__MathFormula__Group__3
            {
            pushFollow(FOLLOW_rule__MathFormula__Group__2__Impl_in_rule__MathFormula__Group__22280);
            rule__MathFormula__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathFormula__Group__3_in_rule__MathFormula__Group__22283);
            rule__MathFormula__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathFormula__Group__2"


    // $ANTLR start "rule__MathFormula__Group__2__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1076:1: rule__MathFormula__Group__2__Impl : ( ( rule__MathFormula__Group_2__0 )* ) ;
    public final void rule__MathFormula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1080:1: ( ( ( rule__MathFormula__Group_2__0 )* ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1081:1: ( ( rule__MathFormula__Group_2__0 )* )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1081:1: ( ( rule__MathFormula__Group_2__0 )* )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1082:1: ( rule__MathFormula__Group_2__0 )*
            {
             before(grammarAccess.getMathFormulaAccess().getGroup_2()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1083:1: ( rule__MathFormula__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=16 && LA16_0<=21)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1083:2: rule__MathFormula__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MathFormula__Group_2__0_in_rule__MathFormula__Group__2__Impl2310);
            	    rule__MathFormula__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMathFormulaAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathFormula__Group__2__Impl"


    // $ANTLR start "rule__MathFormula__Group__3"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1093:1: rule__MathFormula__Group__3 : rule__MathFormula__Group__3__Impl ;
    public final void rule__MathFormula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1097:1: ( rule__MathFormula__Group__3__Impl )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1098:2: rule__MathFormula__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MathFormula__Group__3__Impl_in_rule__MathFormula__Group__32341);
            rule__MathFormula__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathFormula__Group__3"


    // $ANTLR start "rule__MathFormula__Group__3__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1104:1: rule__MathFormula__Group__3__Impl : ( ( ')' )? ) ;
    public final void rule__MathFormula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1108:1: ( ( ( ')' )? ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1109:1: ( ( ')' )? )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1109:1: ( ( ')' )? )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1110:1: ( ')' )?
            {
             before(grammarAccess.getMathFormulaAccess().getRightParenthesisKeyword_3()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1111:1: ( ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1112:2: ')'
                    {
                    match(input,32,FOLLOW_32_in_rule__MathFormula__Group__3__Impl2370); 

                    }
                    break;

            }

             after(grammarAccess.getMathFormulaAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathFormula__Group__3__Impl"


    // $ANTLR start "rule__MathFormula__Group_2__0"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1131:1: rule__MathFormula__Group_2__0 : rule__MathFormula__Group_2__0__Impl rule__MathFormula__Group_2__1 ;
    public final void rule__MathFormula__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1135:1: ( rule__MathFormula__Group_2__0__Impl rule__MathFormula__Group_2__1 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1136:2: rule__MathFormula__Group_2__0__Impl rule__MathFormula__Group_2__1
            {
            pushFollow(FOLLOW_rule__MathFormula__Group_2__0__Impl_in_rule__MathFormula__Group_2__02411);
            rule__MathFormula__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathFormula__Group_2__1_in_rule__MathFormula__Group_2__02414);
            rule__MathFormula__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathFormula__Group_2__0"


    // $ANTLR start "rule__MathFormula__Group_2__0__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1143:1: rule__MathFormula__Group_2__0__Impl : ( ruleMathOperation ) ;
    public final void rule__MathFormula__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1147:1: ( ( ruleMathOperation ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1148:1: ( ruleMathOperation )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1148:1: ( ruleMathOperation )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1149:1: ruleMathOperation
            {
             before(grammarAccess.getMathFormulaAccess().getMathOperationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMathOperation_in_rule__MathFormula__Group_2__0__Impl2441);
            ruleMathOperation();

            state._fsp--;

             after(grammarAccess.getMathFormulaAccess().getMathOperationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathFormula__Group_2__0__Impl"


    // $ANTLR start "rule__MathFormula__Group_2__1"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1160:1: rule__MathFormula__Group_2__1 : rule__MathFormula__Group_2__1__Impl ;
    public final void rule__MathFormula__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1164:1: ( rule__MathFormula__Group_2__1__Impl )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1165:2: rule__MathFormula__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MathFormula__Group_2__1__Impl_in_rule__MathFormula__Group_2__12470);
            rule__MathFormula__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathFormula__Group_2__1"


    // $ANTLR start "rule__MathFormula__Group_2__1__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1171:1: rule__MathFormula__Group_2__1__Impl : ( ruleVariable ) ;
    public final void rule__MathFormula__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1175:1: ( ( ruleVariable ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1176:1: ( ruleVariable )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1176:1: ( ruleVariable )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1177:1: ruleVariable
            {
             before(grammarAccess.getMathFormulaAccess().getVariableParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__MathFormula__Group_2__1__Impl2497);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getMathFormulaAccess().getVariableParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathFormula__Group_2__1__Impl"


    // $ANTLR start "rule__CompareFormula__Group_0__0"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1192:1: rule__CompareFormula__Group_0__0 : rule__CompareFormula__Group_0__0__Impl rule__CompareFormula__Group_0__1 ;
    public final void rule__CompareFormula__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1196:1: ( rule__CompareFormula__Group_0__0__Impl rule__CompareFormula__Group_0__1 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1197:2: rule__CompareFormula__Group_0__0__Impl rule__CompareFormula__Group_0__1
            {
            pushFollow(FOLLOW_rule__CompareFormula__Group_0__0__Impl_in_rule__CompareFormula__Group_0__02530);
            rule__CompareFormula__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareFormula__Group_0__1_in_rule__CompareFormula__Group_0__02533);
            rule__CompareFormula__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareFormula__Group_0__0"


    // $ANTLR start "rule__CompareFormula__Group_0__0__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1204:1: rule__CompareFormula__Group_0__0__Impl : ( ruleMathFormula ) ;
    public final void rule__CompareFormula__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1208:1: ( ( ruleMathFormula ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1209:1: ( ruleMathFormula )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1209:1: ( ruleMathFormula )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1210:1: ruleMathFormula
            {
             before(grammarAccess.getCompareFormulaAccess().getMathFormulaParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMathFormula_in_rule__CompareFormula__Group_0__0__Impl2560);
            ruleMathFormula();

            state._fsp--;

             after(grammarAccess.getCompareFormulaAccess().getMathFormulaParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareFormula__Group_0__0__Impl"


    // $ANTLR start "rule__CompareFormula__Group_0__1"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1221:1: rule__CompareFormula__Group_0__1 : rule__CompareFormula__Group_0__1__Impl rule__CompareFormula__Group_0__2 ;
    public final void rule__CompareFormula__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1225:1: ( rule__CompareFormula__Group_0__1__Impl rule__CompareFormula__Group_0__2 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1226:2: rule__CompareFormula__Group_0__1__Impl rule__CompareFormula__Group_0__2
            {
            pushFollow(FOLLOW_rule__CompareFormula__Group_0__1__Impl_in_rule__CompareFormula__Group_0__12589);
            rule__CompareFormula__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareFormula__Group_0__2_in_rule__CompareFormula__Group_0__12592);
            rule__CompareFormula__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareFormula__Group_0__1"


    // $ANTLR start "rule__CompareFormula__Group_0__1__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1233:1: rule__CompareFormula__Group_0__1__Impl : ( ruleCompareOperation ) ;
    public final void rule__CompareFormula__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1237:1: ( ( ruleCompareOperation ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1238:1: ( ruleCompareOperation )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1238:1: ( ruleCompareOperation )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1239:1: ruleCompareOperation
            {
             before(grammarAccess.getCompareFormulaAccess().getCompareOperationParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleCompareOperation_in_rule__CompareFormula__Group_0__1__Impl2619);
            ruleCompareOperation();

            state._fsp--;

             after(grammarAccess.getCompareFormulaAccess().getCompareOperationParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareFormula__Group_0__1__Impl"


    // $ANTLR start "rule__CompareFormula__Group_0__2"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1250:1: rule__CompareFormula__Group_0__2 : rule__CompareFormula__Group_0__2__Impl ;
    public final void rule__CompareFormula__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1254:1: ( rule__CompareFormula__Group_0__2__Impl )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1255:2: rule__CompareFormula__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__CompareFormula__Group_0__2__Impl_in_rule__CompareFormula__Group_0__22648);
            rule__CompareFormula__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareFormula__Group_0__2"


    // $ANTLR start "rule__CompareFormula__Group_0__2__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1261:1: rule__CompareFormula__Group_0__2__Impl : ( ruleMathFormula ) ;
    public final void rule__CompareFormula__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1265:1: ( ( ruleMathFormula ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1266:1: ( ruleMathFormula )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1266:1: ( ruleMathFormula )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1267:1: ruleMathFormula
            {
             before(grammarAccess.getCompareFormulaAccess().getMathFormulaParserRuleCall_0_2()); 
            pushFollow(FOLLOW_ruleMathFormula_in_rule__CompareFormula__Group_0__2__Impl2675);
            ruleMathFormula();

            state._fsp--;

             after(grammarAccess.getCompareFormulaAccess().getMathFormulaParserRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareFormula__Group_0__2__Impl"


    // $ANTLR start "rule__CompareFormula__Group_1__0"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1284:1: rule__CompareFormula__Group_1__0 : rule__CompareFormula__Group_1__0__Impl rule__CompareFormula__Group_1__1 ;
    public final void rule__CompareFormula__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1288:1: ( rule__CompareFormula__Group_1__0__Impl rule__CompareFormula__Group_1__1 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1289:2: rule__CompareFormula__Group_1__0__Impl rule__CompareFormula__Group_1__1
            {
            pushFollow(FOLLOW_rule__CompareFormula__Group_1__0__Impl_in_rule__CompareFormula__Group_1__02710);
            rule__CompareFormula__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareFormula__Group_1__1_in_rule__CompareFormula__Group_1__02713);
            rule__CompareFormula__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareFormula__Group_1__0"


    // $ANTLR start "rule__CompareFormula__Group_1__0__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1296:1: rule__CompareFormula__Group_1__0__Impl : ( ruleMathFormula ) ;
    public final void rule__CompareFormula__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1300:1: ( ( ruleMathFormula ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1301:1: ( ruleMathFormula )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1301:1: ( ruleMathFormula )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1302:1: ruleMathFormula
            {
             before(grammarAccess.getCompareFormulaAccess().getMathFormulaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMathFormula_in_rule__CompareFormula__Group_1__0__Impl2740);
            ruleMathFormula();

            state._fsp--;

             after(grammarAccess.getCompareFormulaAccess().getMathFormulaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareFormula__Group_1__0__Impl"


    // $ANTLR start "rule__CompareFormula__Group_1__1"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1313:1: rule__CompareFormula__Group_1__1 : rule__CompareFormula__Group_1__1__Impl rule__CompareFormula__Group_1__2 ;
    public final void rule__CompareFormula__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1317:1: ( rule__CompareFormula__Group_1__1__Impl rule__CompareFormula__Group_1__2 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1318:2: rule__CompareFormula__Group_1__1__Impl rule__CompareFormula__Group_1__2
            {
            pushFollow(FOLLOW_rule__CompareFormula__Group_1__1__Impl_in_rule__CompareFormula__Group_1__12769);
            rule__CompareFormula__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareFormula__Group_1__2_in_rule__CompareFormula__Group_1__12772);
            rule__CompareFormula__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareFormula__Group_1__1"


    // $ANTLR start "rule__CompareFormula__Group_1__1__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1325:1: rule__CompareFormula__Group_1__1__Impl : ( ruleCompareOperation ) ;
    public final void rule__CompareFormula__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1329:1: ( ( ruleCompareOperation ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1330:1: ( ruleCompareOperation )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1330:1: ( ruleCompareOperation )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1331:1: ruleCompareOperation
            {
             before(grammarAccess.getCompareFormulaAccess().getCompareOperationParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleCompareOperation_in_rule__CompareFormula__Group_1__1__Impl2799);
            ruleCompareOperation();

            state._fsp--;

             after(grammarAccess.getCompareFormulaAccess().getCompareOperationParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareFormula__Group_1__1__Impl"


    // $ANTLR start "rule__CompareFormula__Group_1__2"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1342:1: rule__CompareFormula__Group_1__2 : rule__CompareFormula__Group_1__2__Impl ;
    public final void rule__CompareFormula__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1346:1: ( rule__CompareFormula__Group_1__2__Impl )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1347:2: rule__CompareFormula__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__CompareFormula__Group_1__2__Impl_in_rule__CompareFormula__Group_1__22828);
            rule__CompareFormula__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareFormula__Group_1__2"


    // $ANTLR start "rule__CompareFormula__Group_1__2__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1353:1: rule__CompareFormula__Group_1__2__Impl : ( RULE_STRING ) ;
    public final void rule__CompareFormula__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1357:1: ( ( RULE_STRING ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1358:1: ( RULE_STRING )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1358:1: ( RULE_STRING )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1359:1: RULE_STRING
            {
             before(grammarAccess.getCompareFormulaAccess().getSTRINGTerminalRuleCall_1_2()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CompareFormula__Group_1__2__Impl2855); 
             after(grammarAccess.getCompareFormulaAccess().getSTRINGTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareFormula__Group_1__2__Impl"


    // $ANTLR start "rule__MyID__Group__0"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1376:1: rule__MyID__Group__0 : rule__MyID__Group__0__Impl rule__MyID__Group__1 ;
    public final void rule__MyID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1380:1: ( rule__MyID__Group__0__Impl rule__MyID__Group__1 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1381:2: rule__MyID__Group__0__Impl rule__MyID__Group__1
            {
            pushFollow(FOLLOW_rule__MyID__Group__0__Impl_in_rule__MyID__Group__02890);
            rule__MyID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MyID__Group__1_in_rule__MyID__Group__02893);
            rule__MyID__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyID__Group__0"


    // $ANTLR start "rule__MyID__Group__0__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1388:1: rule__MyID__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__MyID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1392:1: ( ( ( '-' )? ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1393:1: ( ( '-' )? )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1393:1: ( ( '-' )? )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1394:1: ( '-' )?
            {
             before(grammarAccess.getMyIDAccess().getHyphenMinusKeyword_0()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1395:1: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1396:2: '-'
                    {
                    match(input,17,FOLLOW_17_in_rule__MyID__Group__0__Impl2922); 

                    }
                    break;

            }

             after(grammarAccess.getMyIDAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyID__Group__0__Impl"


    // $ANTLR start "rule__MyID__Group__1"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1407:1: rule__MyID__Group__1 : rule__MyID__Group__1__Impl ;
    public final void rule__MyID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1411:1: ( rule__MyID__Group__1__Impl )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1412:2: rule__MyID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MyID__Group__1__Impl_in_rule__MyID__Group__12955);
            rule__MyID__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyID__Group__1"


    // $ANTLR start "rule__MyID__Group__1__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1418:1: rule__MyID__Group__1__Impl : ( ( rule__MyID__Alternatives_1 ) ) ;
    public final void rule__MyID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1422:1: ( ( ( rule__MyID__Alternatives_1 ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1423:1: ( ( rule__MyID__Alternatives_1 ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1423:1: ( ( rule__MyID__Alternatives_1 ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1424:1: ( rule__MyID__Alternatives_1 )
            {
             before(grammarAccess.getMyIDAccess().getAlternatives_1()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1425:1: ( rule__MyID__Alternatives_1 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1425:2: rule__MyID__Alternatives_1
            {
            pushFollow(FOLLOW_rule__MyID__Alternatives_1_in_rule__MyID__Group__1__Impl2982);
            rule__MyID__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getMyIDAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyID__Group__1__Impl"


    // $ANTLR start "rule__MyID__Group_1_1__0"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1439:1: rule__MyID__Group_1_1__0 : rule__MyID__Group_1_1__0__Impl rule__MyID__Group_1_1__1 ;
    public final void rule__MyID__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1443:1: ( rule__MyID__Group_1_1__0__Impl rule__MyID__Group_1_1__1 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1444:2: rule__MyID__Group_1_1__0__Impl rule__MyID__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__MyID__Group_1_1__0__Impl_in_rule__MyID__Group_1_1__03016);
            rule__MyID__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MyID__Group_1_1__1_in_rule__MyID__Group_1_1__03019);
            rule__MyID__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyID__Group_1_1__0"


    // $ANTLR start "rule__MyID__Group_1_1__0__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1451:1: rule__MyID__Group_1_1__0__Impl : ( '!' ) ;
    public final void rule__MyID__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1455:1: ( ( '!' ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1456:1: ( '!' )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1456:1: ( '!' )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1457:1: '!'
            {
             before(grammarAccess.getMyIDAccess().getExclamationMarkKeyword_1_1_0()); 
            match(input,33,FOLLOW_33_in_rule__MyID__Group_1_1__0__Impl3047); 
             after(grammarAccess.getMyIDAccess().getExclamationMarkKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyID__Group_1_1__0__Impl"


    // $ANTLR start "rule__MyID__Group_1_1__1"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1470:1: rule__MyID__Group_1_1__1 : rule__MyID__Group_1_1__1__Impl ;
    public final void rule__MyID__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1474:1: ( rule__MyID__Group_1_1__1__Impl )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1475:2: rule__MyID__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MyID__Group_1_1__1__Impl_in_rule__MyID__Group_1_1__13078);
            rule__MyID__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyID__Group_1_1__1"


    // $ANTLR start "rule__MyID__Group_1_1__1__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1481:1: rule__MyID__Group_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__MyID__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1485:1: ( ( RULE_ID ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1486:1: ( RULE_ID )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1486:1: ( RULE_ID )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1487:1: RULE_ID
            {
             before(grammarAccess.getMyIDAccess().getIDTerminalRuleCall_1_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MyID__Group_1_1__1__Impl3105); 
             after(grammarAccess.getMyIDAccess().getIDTerminalRuleCall_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyID__Group_1_1__1__Impl"


    // $ANTLR start "rule__Enum__Group__0"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1502:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1506:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1507:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__03138);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__03141);
            rule__Enum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0"


    // $ANTLR start "rule__Enum__Group__0__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1514:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1518:1: ( ( 'enum' ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1519:1: ( 'enum' )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1519:1: ( 'enum' )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1520:1: 'enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Enum__Group__0__Impl3169); 
             after(grammarAccess.getEnumAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0__Impl"


    // $ANTLR start "rule__Enum__Group__1"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1533:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1537:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1538:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__13200);
            rule__Enum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__13203);
            rule__Enum__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1"


    // $ANTLR start "rule__Enum__Group__1__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1545:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__Alternatives_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1549:1: ( ( ( rule__Enum__Alternatives_1 ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1550:1: ( ( rule__Enum__Alternatives_1 ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1550:1: ( ( rule__Enum__Alternatives_1 ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1551:1: ( rule__Enum__Alternatives_1 )
            {
             before(grammarAccess.getEnumAccess().getAlternatives_1()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1552:1: ( rule__Enum__Alternatives_1 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1552:2: rule__Enum__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Enum__Alternatives_1_in_rule__Enum__Group__1__Impl3230);
            rule__Enum__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1__Impl"


    // $ANTLR start "rule__Enum__Group__2"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1562:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1566:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1567:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__23260);
            rule__Enum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__23263);
            rule__Enum__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__2"


    // $ANTLR start "rule__Enum__Group__2__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1574:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1578:1: ( ( '{' ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1579:1: ( '{' )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1579:1: ( '{' )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1580:1: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__Enum__Group__2__Impl3291); 
             after(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__2__Impl"


    // $ANTLR start "rule__Enum__Group__3"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1593:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1597:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1598:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__33322);
            rule__Enum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__33325);
            rule__Enum__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__3"


    // $ANTLR start "rule__Enum__Group__3__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1605:1: rule__Enum__Group__3__Impl : ( ruleEnumOptions ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1609:1: ( ( ruleEnumOptions ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1610:1: ( ruleEnumOptions )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1610:1: ( ruleEnumOptions )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1611:1: ruleEnumOptions
            {
             before(grammarAccess.getEnumAccess().getEnumOptionsParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleEnumOptions_in_rule__Enum__Group__3__Impl3352);
            ruleEnumOptions();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getEnumOptionsParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__3__Impl"


    // $ANTLR start "rule__Enum__Group__4"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1622:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1626:1: ( rule__Enum__Group__4__Impl )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1627:2: rule__Enum__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__43381);
            rule__Enum__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__4"


    // $ANTLR start "rule__Enum__Group__4__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1633:1: rule__Enum__Group__4__Impl : ( '}' ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1637:1: ( ( '}' ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1638:1: ( '}' )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1638:1: ( '}' )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1639:1: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4()); 
            match(input,36,FOLLOW_36_in_rule__Enum__Group__4__Impl3409); 
             after(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__4__Impl"


    // $ANTLR start "rule__Define__Group__0"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1662:1: rule__Define__Group__0 : rule__Define__Group__0__Impl rule__Define__Group__1 ;
    public final void rule__Define__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1666:1: ( rule__Define__Group__0__Impl rule__Define__Group__1 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1667:2: rule__Define__Group__0__Impl rule__Define__Group__1
            {
            pushFollow(FOLLOW_rule__Define__Group__0__Impl_in_rule__Define__Group__03450);
            rule__Define__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Define__Group__1_in_rule__Define__Group__03453);
            rule__Define__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__0"


    // $ANTLR start "rule__Define__Group__0__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1674:1: rule__Define__Group__0__Impl : ( 'define' ) ;
    public final void rule__Define__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1678:1: ( ( 'define' ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1679:1: ( 'define' )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1679:1: ( 'define' )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1680:1: 'define'
            {
             before(grammarAccess.getDefineAccess().getDefineKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Define__Group__0__Impl3481); 
             after(grammarAccess.getDefineAccess().getDefineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__0__Impl"


    // $ANTLR start "rule__Define__Group__1"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1693:1: rule__Define__Group__1 : rule__Define__Group__1__Impl rule__Define__Group__2 ;
    public final void rule__Define__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1697:1: ( rule__Define__Group__1__Impl rule__Define__Group__2 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1698:2: rule__Define__Group__1__Impl rule__Define__Group__2
            {
            pushFollow(FOLLOW_rule__Define__Group__1__Impl_in_rule__Define__Group__13512);
            rule__Define__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Define__Group__2_in_rule__Define__Group__13515);
            rule__Define__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__1"


    // $ANTLR start "rule__Define__Group__1__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1705:1: rule__Define__Group__1__Impl : ( ( rule__Define__NameAssignment_1 ) ) ;
    public final void rule__Define__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1709:1: ( ( ( rule__Define__NameAssignment_1 ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1710:1: ( ( rule__Define__NameAssignment_1 ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1710:1: ( ( rule__Define__NameAssignment_1 ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1711:1: ( rule__Define__NameAssignment_1 )
            {
             before(grammarAccess.getDefineAccess().getNameAssignment_1()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1712:1: ( rule__Define__NameAssignment_1 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1712:2: rule__Define__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Define__NameAssignment_1_in_rule__Define__Group__1__Impl3542);
            rule__Define__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefineAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__1__Impl"


    // $ANTLR start "rule__Define__Group__2"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1722:1: rule__Define__Group__2 : rule__Define__Group__2__Impl rule__Define__Group__3 ;
    public final void rule__Define__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1726:1: ( rule__Define__Group__2__Impl rule__Define__Group__3 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1727:2: rule__Define__Group__2__Impl rule__Define__Group__3
            {
            pushFollow(FOLLOW_rule__Define__Group__2__Impl_in_rule__Define__Group__23572);
            rule__Define__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Define__Group__3_in_rule__Define__Group__23575);
            rule__Define__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__2"


    // $ANTLR start "rule__Define__Group__2__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1734:1: rule__Define__Group__2__Impl : ( '{' ) ;
    public final void rule__Define__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1738:1: ( ( '{' ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1739:1: ( '{' )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1739:1: ( '{' )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1740:1: '{'
            {
             before(grammarAccess.getDefineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__Define__Group__2__Impl3603); 
             after(grammarAccess.getDefineAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__2__Impl"


    // $ANTLR start "rule__Define__Group__3"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1753:1: rule__Define__Group__3 : rule__Define__Group__3__Impl rule__Define__Group__4 ;
    public final void rule__Define__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1757:1: ( rule__Define__Group__3__Impl rule__Define__Group__4 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1758:2: rule__Define__Group__3__Impl rule__Define__Group__4
            {
            pushFollow(FOLLOW_rule__Define__Group__3__Impl_in_rule__Define__Group__33634);
            rule__Define__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Define__Group__4_in_rule__Define__Group__33637);
            rule__Define__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__3"


    // $ANTLR start "rule__Define__Group__3__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1765:1: rule__Define__Group__3__Impl : ( ( '(' )? ) ;
    public final void rule__Define__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1769:1: ( ( ( '(' )? ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1770:1: ( ( '(' )? )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1770:1: ( ( '(' )? )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1771:1: ( '(' )?
            {
             before(grammarAccess.getDefineAccess().getLeftParenthesisKeyword_3()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1772:1: ( '(' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1773:2: '('
                    {
                    match(input,31,FOLLOW_31_in_rule__Define__Group__3__Impl3666); 

                    }
                    break;

            }

             after(grammarAccess.getDefineAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__3__Impl"


    // $ANTLR start "rule__Define__Group__4"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1784:1: rule__Define__Group__4 : rule__Define__Group__4__Impl rule__Define__Group__5 ;
    public final void rule__Define__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1788:1: ( rule__Define__Group__4__Impl rule__Define__Group__5 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1789:2: rule__Define__Group__4__Impl rule__Define__Group__5
            {
            pushFollow(FOLLOW_rule__Define__Group__4__Impl_in_rule__Define__Group__43699);
            rule__Define__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Define__Group__5_in_rule__Define__Group__43702);
            rule__Define__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__4"


    // $ANTLR start "rule__Define__Group__4__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1796:1: rule__Define__Group__4__Impl : ( ( rule__Define__Alternatives_4 ) ) ;
    public final void rule__Define__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1800:1: ( ( ( rule__Define__Alternatives_4 ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1801:1: ( ( rule__Define__Alternatives_4 ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1801:1: ( ( rule__Define__Alternatives_4 ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1802:1: ( rule__Define__Alternatives_4 )
            {
             before(grammarAccess.getDefineAccess().getAlternatives_4()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1803:1: ( rule__Define__Alternatives_4 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1803:2: rule__Define__Alternatives_4
            {
            pushFollow(FOLLOW_rule__Define__Alternatives_4_in_rule__Define__Group__4__Impl3729);
            rule__Define__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getDefineAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__4__Impl"


    // $ANTLR start "rule__Define__Group__5"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1813:1: rule__Define__Group__5 : rule__Define__Group__5__Impl rule__Define__Group__6 ;
    public final void rule__Define__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1817:1: ( rule__Define__Group__5__Impl rule__Define__Group__6 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1818:2: rule__Define__Group__5__Impl rule__Define__Group__6
            {
            pushFollow(FOLLOW_rule__Define__Group__5__Impl_in_rule__Define__Group__53759);
            rule__Define__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Define__Group__6_in_rule__Define__Group__53762);
            rule__Define__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__5"


    // $ANTLR start "rule__Define__Group__5__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1825:1: rule__Define__Group__5__Impl : ( ( ')' )? ) ;
    public final void rule__Define__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1829:1: ( ( ( ')' )? ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1830:1: ( ( ')' )? )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1830:1: ( ( ')' )? )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1831:1: ( ')' )?
            {
             before(grammarAccess.getDefineAccess().getRightParenthesisKeyword_5()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1832:1: ( ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1833:2: ')'
                    {
                    match(input,32,FOLLOW_32_in_rule__Define__Group__5__Impl3791); 

                    }
                    break;

            }

             after(grammarAccess.getDefineAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__5__Impl"


    // $ANTLR start "rule__Define__Group__6"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1844:1: rule__Define__Group__6 : rule__Define__Group__6__Impl rule__Define__Group__7 ;
    public final void rule__Define__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1848:1: ( rule__Define__Group__6__Impl rule__Define__Group__7 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1849:2: rule__Define__Group__6__Impl rule__Define__Group__7
            {
            pushFollow(FOLLOW_rule__Define__Group__6__Impl_in_rule__Define__Group__63824);
            rule__Define__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Define__Group__7_in_rule__Define__Group__63827);
            rule__Define__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__6"


    // $ANTLR start "rule__Define__Group__6__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1856:1: rule__Define__Group__6__Impl : ( ( rule__Define__Group_6__0 )* ) ;
    public final void rule__Define__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1860:1: ( ( ( rule__Define__Group_6__0 )* ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1861:1: ( ( rule__Define__Group_6__0 )* )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1861:1: ( ( rule__Define__Group_6__0 )* )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1862:1: ( rule__Define__Group_6__0 )*
            {
             before(grammarAccess.getDefineAccess().getGroup_6()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1863:1: ( rule__Define__Group_6__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=14 && LA21_0<=15)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1863:2: rule__Define__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Define__Group_6__0_in_rule__Define__Group__6__Impl3854);
            	    rule__Define__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getDefineAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__6__Impl"


    // $ANTLR start "rule__Define__Group__7"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1873:1: rule__Define__Group__7 : rule__Define__Group__7__Impl ;
    public final void rule__Define__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1877:1: ( rule__Define__Group__7__Impl )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1878:2: rule__Define__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Define__Group__7__Impl_in_rule__Define__Group__73885);
            rule__Define__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__7"


    // $ANTLR start "rule__Define__Group__7__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1884:1: rule__Define__Group__7__Impl : ( '}' ) ;
    public final void rule__Define__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1888:1: ( ( '}' ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1889:1: ( '}' )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1889:1: ( '}' )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1890:1: '}'
            {
             before(grammarAccess.getDefineAccess().getRightCurlyBracketKeyword_7()); 
            match(input,36,FOLLOW_36_in_rule__Define__Group__7__Impl3913); 
             after(grammarAccess.getDefineAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__7__Impl"


    // $ANTLR start "rule__Define__Group_6__0"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1919:1: rule__Define__Group_6__0 : rule__Define__Group_6__0__Impl rule__Define__Group_6__1 ;
    public final void rule__Define__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1923:1: ( rule__Define__Group_6__0__Impl rule__Define__Group_6__1 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1924:2: rule__Define__Group_6__0__Impl rule__Define__Group_6__1
            {
            pushFollow(FOLLOW_rule__Define__Group_6__0__Impl_in_rule__Define__Group_6__03960);
            rule__Define__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Define__Group_6__1_in_rule__Define__Group_6__03963);
            rule__Define__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group_6__0"


    // $ANTLR start "rule__Define__Group_6__0__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1931:1: rule__Define__Group_6__0__Impl : ( ruleConditionOperation ) ;
    public final void rule__Define__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1935:1: ( ( ruleConditionOperation ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1936:1: ( ruleConditionOperation )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1936:1: ( ruleConditionOperation )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1937:1: ruleConditionOperation
            {
             before(grammarAccess.getDefineAccess().getConditionOperationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleConditionOperation_in_rule__Define__Group_6__0__Impl3990);
            ruleConditionOperation();

            state._fsp--;

             after(grammarAccess.getDefineAccess().getConditionOperationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group_6__0__Impl"


    // $ANTLR start "rule__Define__Group_6__1"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1948:1: rule__Define__Group_6__1 : rule__Define__Group_6__1__Impl rule__Define__Group_6__2 ;
    public final void rule__Define__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1952:1: ( rule__Define__Group_6__1__Impl rule__Define__Group_6__2 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1953:2: rule__Define__Group_6__1__Impl rule__Define__Group_6__2
            {
            pushFollow(FOLLOW_rule__Define__Group_6__1__Impl_in_rule__Define__Group_6__14019);
            rule__Define__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Define__Group_6__2_in_rule__Define__Group_6__14022);
            rule__Define__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group_6__1"


    // $ANTLR start "rule__Define__Group_6__1__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1960:1: rule__Define__Group_6__1__Impl : ( ( '(' )? ) ;
    public final void rule__Define__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1964:1: ( ( ( '(' )? ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1965:1: ( ( '(' )? )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1965:1: ( ( '(' )? )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1966:1: ( '(' )?
            {
             before(grammarAccess.getDefineAccess().getLeftParenthesisKeyword_6_1()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1967:1: ( '(' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1968:2: '('
                    {
                    match(input,31,FOLLOW_31_in_rule__Define__Group_6__1__Impl4051); 

                    }
                    break;

            }

             after(grammarAccess.getDefineAccess().getLeftParenthesisKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group_6__1__Impl"


    // $ANTLR start "rule__Define__Group_6__2"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1979:1: rule__Define__Group_6__2 : rule__Define__Group_6__2__Impl rule__Define__Group_6__3 ;
    public final void rule__Define__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1983:1: ( rule__Define__Group_6__2__Impl rule__Define__Group_6__3 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1984:2: rule__Define__Group_6__2__Impl rule__Define__Group_6__3
            {
            pushFollow(FOLLOW_rule__Define__Group_6__2__Impl_in_rule__Define__Group_6__24084);
            rule__Define__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Define__Group_6__3_in_rule__Define__Group_6__24087);
            rule__Define__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group_6__2"


    // $ANTLR start "rule__Define__Group_6__2__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1991:1: rule__Define__Group_6__2__Impl : ( ( rule__Define__Alternatives_6_2 ) ) ;
    public final void rule__Define__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1995:1: ( ( ( rule__Define__Alternatives_6_2 ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1996:1: ( ( rule__Define__Alternatives_6_2 ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1996:1: ( ( rule__Define__Alternatives_6_2 ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1997:1: ( rule__Define__Alternatives_6_2 )
            {
             before(grammarAccess.getDefineAccess().getAlternatives_6_2()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1998:1: ( rule__Define__Alternatives_6_2 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:1998:2: rule__Define__Alternatives_6_2
            {
            pushFollow(FOLLOW_rule__Define__Alternatives_6_2_in_rule__Define__Group_6__2__Impl4114);
            rule__Define__Alternatives_6_2();

            state._fsp--;


            }

             after(grammarAccess.getDefineAccess().getAlternatives_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group_6__2__Impl"


    // $ANTLR start "rule__Define__Group_6__3"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2008:1: rule__Define__Group_6__3 : rule__Define__Group_6__3__Impl ;
    public final void rule__Define__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2012:1: ( rule__Define__Group_6__3__Impl )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2013:2: rule__Define__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Define__Group_6__3__Impl_in_rule__Define__Group_6__34144);
            rule__Define__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group_6__3"


    // $ANTLR start "rule__Define__Group_6__3__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2019:1: rule__Define__Group_6__3__Impl : ( ( ')' )? ) ;
    public final void rule__Define__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2023:1: ( ( ( ')' )? ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2024:1: ( ( ')' )? )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2024:1: ( ( ')' )? )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2025:1: ( ')' )?
            {
             before(grammarAccess.getDefineAccess().getRightParenthesisKeyword_6_3()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2026:1: ( ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2027:2: ')'
                    {
                    match(input,32,FOLLOW_32_in_rule__Define__Group_6__3__Impl4173); 

                    }
                    break;

            }

             after(grammarAccess.getDefineAccess().getRightParenthesisKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group_6__3__Impl"


    // $ANTLR start "rule__Precondition__Group__0"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2046:1: rule__Precondition__Group__0 : rule__Precondition__Group__0__Impl rule__Precondition__Group__1 ;
    public final void rule__Precondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2050:1: ( rule__Precondition__Group__0__Impl rule__Precondition__Group__1 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2051:2: rule__Precondition__Group__0__Impl rule__Precondition__Group__1
            {
            pushFollow(FOLLOW_rule__Precondition__Group__0__Impl_in_rule__Precondition__Group__04214);
            rule__Precondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precondition__Group__1_in_rule__Precondition__Group__04217);
            rule__Precondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__0"


    // $ANTLR start "rule__Precondition__Group__0__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2058:1: rule__Precondition__Group__0__Impl : ( 'precondition' ) ;
    public final void rule__Precondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2062:1: ( ( 'precondition' ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2063:1: ( 'precondition' )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2063:1: ( 'precondition' )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2064:1: 'precondition'
            {
             before(grammarAccess.getPreconditionAccess().getPreconditionKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Precondition__Group__0__Impl4245); 
             after(grammarAccess.getPreconditionAccess().getPreconditionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__0__Impl"


    // $ANTLR start "rule__Precondition__Group__1"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2077:1: rule__Precondition__Group__1 : rule__Precondition__Group__1__Impl rule__Precondition__Group__2 ;
    public final void rule__Precondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2081:1: ( rule__Precondition__Group__1__Impl rule__Precondition__Group__2 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2082:2: rule__Precondition__Group__1__Impl rule__Precondition__Group__2
            {
            pushFollow(FOLLOW_rule__Precondition__Group__1__Impl_in_rule__Precondition__Group__14276);
            rule__Precondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precondition__Group__2_in_rule__Precondition__Group__14279);
            rule__Precondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__1"


    // $ANTLR start "rule__Precondition__Group__1__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2089:1: rule__Precondition__Group__1__Impl : ( '{' ) ;
    public final void rule__Precondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2093:1: ( ( '{' ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2094:1: ( '{' )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2094:1: ( '{' )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2095:1: '{'
            {
             before(grammarAccess.getPreconditionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__Precondition__Group__1__Impl4307); 
             after(grammarAccess.getPreconditionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__1__Impl"


    // $ANTLR start "rule__Precondition__Group__2"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2108:1: rule__Precondition__Group__2 : rule__Precondition__Group__2__Impl rule__Precondition__Group__3 ;
    public final void rule__Precondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2112:1: ( rule__Precondition__Group__2__Impl rule__Precondition__Group__3 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2113:2: rule__Precondition__Group__2__Impl rule__Precondition__Group__3
            {
            pushFollow(FOLLOW_rule__Precondition__Group__2__Impl_in_rule__Precondition__Group__24338);
            rule__Precondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precondition__Group__3_in_rule__Precondition__Group__24341);
            rule__Precondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__2"


    // $ANTLR start "rule__Precondition__Group__2__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2120:1: rule__Precondition__Group__2__Impl : ( ruleCompareFormula ) ;
    public final void rule__Precondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2124:1: ( ( ruleCompareFormula ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2125:1: ( ruleCompareFormula )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2125:1: ( ruleCompareFormula )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2126:1: ruleCompareFormula
            {
             before(grammarAccess.getPreconditionAccess().getCompareFormulaParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleCompareFormula_in_rule__Precondition__Group__2__Impl4368);
            ruleCompareFormula();

            state._fsp--;

             after(grammarAccess.getPreconditionAccess().getCompareFormulaParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__2__Impl"


    // $ANTLR start "rule__Precondition__Group__3"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2137:1: rule__Precondition__Group__3 : rule__Precondition__Group__3__Impl rule__Precondition__Group__4 ;
    public final void rule__Precondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2141:1: ( rule__Precondition__Group__3__Impl rule__Precondition__Group__4 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2142:2: rule__Precondition__Group__3__Impl rule__Precondition__Group__4
            {
            pushFollow(FOLLOW_rule__Precondition__Group__3__Impl_in_rule__Precondition__Group__34397);
            rule__Precondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precondition__Group__4_in_rule__Precondition__Group__34400);
            rule__Precondition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__3"


    // $ANTLR start "rule__Precondition__Group__3__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2149:1: rule__Precondition__Group__3__Impl : ( ( rule__Precondition__Group_3__0 )* ) ;
    public final void rule__Precondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2153:1: ( ( ( rule__Precondition__Group_3__0 )* ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2154:1: ( ( rule__Precondition__Group_3__0 )* )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2154:1: ( ( rule__Precondition__Group_3__0 )* )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2155:1: ( rule__Precondition__Group_3__0 )*
            {
             before(grammarAccess.getPreconditionAccess().getGroup_3()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2156:1: ( rule__Precondition__Group_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=14 && LA24_0<=15)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2156:2: rule__Precondition__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Precondition__Group_3__0_in_rule__Precondition__Group__3__Impl4427);
            	    rule__Precondition__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getPreconditionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__3__Impl"


    // $ANTLR start "rule__Precondition__Group__4"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2166:1: rule__Precondition__Group__4 : rule__Precondition__Group__4__Impl ;
    public final void rule__Precondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2170:1: ( rule__Precondition__Group__4__Impl )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2171:2: rule__Precondition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Precondition__Group__4__Impl_in_rule__Precondition__Group__44458);
            rule__Precondition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__4"


    // $ANTLR start "rule__Precondition__Group__4__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2177:1: rule__Precondition__Group__4__Impl : ( '}' ) ;
    public final void rule__Precondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2181:1: ( ( '}' ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2182:1: ( '}' )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2182:1: ( '}' )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2183:1: '}'
            {
             before(grammarAccess.getPreconditionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,36,FOLLOW_36_in_rule__Precondition__Group__4__Impl4486); 
             after(grammarAccess.getPreconditionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__4__Impl"


    // $ANTLR start "rule__Precondition__Group_3__0"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2206:1: rule__Precondition__Group_3__0 : rule__Precondition__Group_3__0__Impl rule__Precondition__Group_3__1 ;
    public final void rule__Precondition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2210:1: ( rule__Precondition__Group_3__0__Impl rule__Precondition__Group_3__1 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2211:2: rule__Precondition__Group_3__0__Impl rule__Precondition__Group_3__1
            {
            pushFollow(FOLLOW_rule__Precondition__Group_3__0__Impl_in_rule__Precondition__Group_3__04527);
            rule__Precondition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precondition__Group_3__1_in_rule__Precondition__Group_3__04530);
            rule__Precondition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group_3__0"


    // $ANTLR start "rule__Precondition__Group_3__0__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2218:1: rule__Precondition__Group_3__0__Impl : ( ruleConditionOperation ) ;
    public final void rule__Precondition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2222:1: ( ( ruleConditionOperation ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2223:1: ( ruleConditionOperation )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2223:1: ( ruleConditionOperation )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2224:1: ruleConditionOperation
            {
             before(grammarAccess.getPreconditionAccess().getConditionOperationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConditionOperation_in_rule__Precondition__Group_3__0__Impl4557);
            ruleConditionOperation();

            state._fsp--;

             after(grammarAccess.getPreconditionAccess().getConditionOperationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group_3__0__Impl"


    // $ANTLR start "rule__Precondition__Group_3__1"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2235:1: rule__Precondition__Group_3__1 : rule__Precondition__Group_3__1__Impl ;
    public final void rule__Precondition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2239:1: ( rule__Precondition__Group_3__1__Impl )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2240:2: rule__Precondition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Precondition__Group_3__1__Impl_in_rule__Precondition__Group_3__14586);
            rule__Precondition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group_3__1"


    // $ANTLR start "rule__Precondition__Group_3__1__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2246:1: rule__Precondition__Group_3__1__Impl : ( ruleCompareFormula ) ;
    public final void rule__Precondition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2250:1: ( ( ruleCompareFormula ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2251:1: ( ruleCompareFormula )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2251:1: ( ruleCompareFormula )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2252:1: ruleCompareFormula
            {
             before(grammarAccess.getPreconditionAccess().getCompareFormulaParserRuleCall_3_1()); 
            pushFollow(FOLLOW_ruleCompareFormula_in_rule__Precondition__Group_3__1__Impl4613);
            ruleCompareFormula();

            state._fsp--;

             after(grammarAccess.getPreconditionAccess().getCompareFormulaParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group_3__1__Impl"


    // $ANTLR start "rule__TestCondition__Group__0"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2267:1: rule__TestCondition__Group__0 : rule__TestCondition__Group__0__Impl rule__TestCondition__Group__1 ;
    public final void rule__TestCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2271:1: ( rule__TestCondition__Group__0__Impl rule__TestCondition__Group__1 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2272:2: rule__TestCondition__Group__0__Impl rule__TestCondition__Group__1
            {
            pushFollow(FOLLOW_rule__TestCondition__Group__0__Impl_in_rule__TestCondition__Group__04646);
            rule__TestCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestCondition__Group__1_in_rule__TestCondition__Group__04649);
            rule__TestCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group__0"


    // $ANTLR start "rule__TestCondition__Group__0__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2279:1: rule__TestCondition__Group__0__Impl : ( RULE_STRING ) ;
    public final void rule__TestCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2283:1: ( ( RULE_STRING ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2284:1: ( RULE_STRING )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2284:1: ( RULE_STRING )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2285:1: RULE_STRING
            {
             before(grammarAccess.getTestConditionAccess().getSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TestCondition__Group__0__Impl4676); 
             after(grammarAccess.getTestConditionAccess().getSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group__0__Impl"


    // $ANTLR start "rule__TestCondition__Group__1"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2296:1: rule__TestCondition__Group__1 : rule__TestCondition__Group__1__Impl ;
    public final void rule__TestCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2300:1: ( rule__TestCondition__Group__1__Impl )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2301:2: rule__TestCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TestCondition__Group__1__Impl_in_rule__TestCondition__Group__14705);
            rule__TestCondition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group__1"


    // $ANTLR start "rule__TestCondition__Group__1__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2307:1: rule__TestCondition__Group__1__Impl : ( ( rule__TestCondition__Group_1__0 )? ) ;
    public final void rule__TestCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2311:1: ( ( ( rule__TestCondition__Group_1__0 )? ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2312:1: ( ( rule__TestCondition__Group_1__0 )? )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2312:1: ( ( rule__TestCondition__Group_1__0 )? )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2313:1: ( rule__TestCondition__Group_1__0 )?
            {
             before(grammarAccess.getTestConditionAccess().getGroup_1()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2314:1: ( rule__TestCondition__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_REAL)||LA25_0==17||LA25_0==31||LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2314:2: rule__TestCondition__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TestCondition__Group_1__0_in_rule__TestCondition__Group__1__Impl4732);
                    rule__TestCondition__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTestConditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group__1__Impl"


    // $ANTLR start "rule__TestCondition__Group_1__0"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2328:1: rule__TestCondition__Group_1__0 : rule__TestCondition__Group_1__0__Impl rule__TestCondition__Group_1__1 ;
    public final void rule__TestCondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2332:1: ( rule__TestCondition__Group_1__0__Impl rule__TestCondition__Group_1__1 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2333:2: rule__TestCondition__Group_1__0__Impl rule__TestCondition__Group_1__1
            {
            pushFollow(FOLLOW_rule__TestCondition__Group_1__0__Impl_in_rule__TestCondition__Group_1__04767);
            rule__TestCondition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestCondition__Group_1__1_in_rule__TestCondition__Group_1__04770);
            rule__TestCondition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group_1__0"


    // $ANTLR start "rule__TestCondition__Group_1__0__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2340:1: rule__TestCondition__Group_1__0__Impl : ( ( '(' )? ) ;
    public final void rule__TestCondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2344:1: ( ( ( '(' )? ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2345:1: ( ( '(' )? )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2345:1: ( ( '(' )? )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2346:1: ( '(' )?
            {
             before(grammarAccess.getTestConditionAccess().getLeftParenthesisKeyword_1_0()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2347:1: ( '(' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2348:2: '('
                    {
                    match(input,31,FOLLOW_31_in_rule__TestCondition__Group_1__0__Impl4799); 

                    }
                    break;

            }

             after(grammarAccess.getTestConditionAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group_1__0__Impl"


    // $ANTLR start "rule__TestCondition__Group_1__1"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2359:1: rule__TestCondition__Group_1__1 : rule__TestCondition__Group_1__1__Impl rule__TestCondition__Group_1__2 ;
    public final void rule__TestCondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2363:1: ( rule__TestCondition__Group_1__1__Impl rule__TestCondition__Group_1__2 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2364:2: rule__TestCondition__Group_1__1__Impl rule__TestCondition__Group_1__2
            {
            pushFollow(FOLLOW_rule__TestCondition__Group_1__1__Impl_in_rule__TestCondition__Group_1__14832);
            rule__TestCondition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestCondition__Group_1__2_in_rule__TestCondition__Group_1__14835);
            rule__TestCondition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group_1__1"


    // $ANTLR start "rule__TestCondition__Group_1__1__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2371:1: rule__TestCondition__Group_1__1__Impl : ( ruleTestcaseElement ) ;
    public final void rule__TestCondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2375:1: ( ( ruleTestcaseElement ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2376:1: ( ruleTestcaseElement )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2376:1: ( ruleTestcaseElement )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2377:1: ruleTestcaseElement
            {
             before(grammarAccess.getTestConditionAccess().getTestcaseElementParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleTestcaseElement_in_rule__TestCondition__Group_1__1__Impl4862);
            ruleTestcaseElement();

            state._fsp--;

             after(grammarAccess.getTestConditionAccess().getTestcaseElementParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group_1__1__Impl"


    // $ANTLR start "rule__TestCondition__Group_1__2"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2388:1: rule__TestCondition__Group_1__2 : rule__TestCondition__Group_1__2__Impl rule__TestCondition__Group_1__3 ;
    public final void rule__TestCondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2392:1: ( rule__TestCondition__Group_1__2__Impl rule__TestCondition__Group_1__3 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2393:2: rule__TestCondition__Group_1__2__Impl rule__TestCondition__Group_1__3
            {
            pushFollow(FOLLOW_rule__TestCondition__Group_1__2__Impl_in_rule__TestCondition__Group_1__24891);
            rule__TestCondition__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestCondition__Group_1__3_in_rule__TestCondition__Group_1__24894);
            rule__TestCondition__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group_1__2"


    // $ANTLR start "rule__TestCondition__Group_1__2__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2400:1: rule__TestCondition__Group_1__2__Impl : ( ( ')' )? ) ;
    public final void rule__TestCondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2404:1: ( ( ( ')' )? ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2405:1: ( ( ')' )? )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2405:1: ( ( ')' )? )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2406:1: ( ')' )?
            {
             before(grammarAccess.getTestConditionAccess().getRightParenthesisKeyword_1_2()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2407:1: ( ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2408:2: ')'
                    {
                    match(input,32,FOLLOW_32_in_rule__TestCondition__Group_1__2__Impl4923); 

                    }
                    break;

            }

             after(grammarAccess.getTestConditionAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group_1__2__Impl"


    // $ANTLR start "rule__TestCondition__Group_1__3"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2419:1: rule__TestCondition__Group_1__3 : rule__TestCondition__Group_1__3__Impl rule__TestCondition__Group_1__4 ;
    public final void rule__TestCondition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2423:1: ( rule__TestCondition__Group_1__3__Impl rule__TestCondition__Group_1__4 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2424:2: rule__TestCondition__Group_1__3__Impl rule__TestCondition__Group_1__4
            {
            pushFollow(FOLLOW_rule__TestCondition__Group_1__3__Impl_in_rule__TestCondition__Group_1__34956);
            rule__TestCondition__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestCondition__Group_1__4_in_rule__TestCondition__Group_1__34959);
            rule__TestCondition__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group_1__3"


    // $ANTLR start "rule__TestCondition__Group_1__3__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2431:1: rule__TestCondition__Group_1__3__Impl : ( ( '(' )? ) ;
    public final void rule__TestCondition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2435:1: ( ( ( '(' )? ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2436:1: ( ( '(' )? )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2436:1: ( ( '(' )? )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2437:1: ( '(' )?
            {
             before(grammarAccess.getTestConditionAccess().getLeftParenthesisKeyword_1_3()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2438:1: ( '(' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2439:2: '('
                    {
                    match(input,31,FOLLOW_31_in_rule__TestCondition__Group_1__3__Impl4988); 

                    }
                    break;

            }

             after(grammarAccess.getTestConditionAccess().getLeftParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group_1__3__Impl"


    // $ANTLR start "rule__TestCondition__Group_1__4"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2450:1: rule__TestCondition__Group_1__4 : rule__TestCondition__Group_1__4__Impl rule__TestCondition__Group_1__5 ;
    public final void rule__TestCondition__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2454:1: ( rule__TestCondition__Group_1__4__Impl rule__TestCondition__Group_1__5 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2455:2: rule__TestCondition__Group_1__4__Impl rule__TestCondition__Group_1__5
            {
            pushFollow(FOLLOW_rule__TestCondition__Group_1__4__Impl_in_rule__TestCondition__Group_1__45021);
            rule__TestCondition__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestCondition__Group_1__5_in_rule__TestCondition__Group_1__45024);
            rule__TestCondition__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group_1__4"


    // $ANTLR start "rule__TestCondition__Group_1__4__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2462:1: rule__TestCondition__Group_1__4__Impl : ( ( rule__TestCondition__Group_1_4__0 )* ) ;
    public final void rule__TestCondition__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2466:1: ( ( ( rule__TestCondition__Group_1_4__0 )* ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2467:1: ( ( rule__TestCondition__Group_1_4__0 )* )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2467:1: ( ( rule__TestCondition__Group_1_4__0 )* )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2468:1: ( rule__TestCondition__Group_1_4__0 )*
            {
             before(grammarAccess.getTestConditionAccess().getGroup_1_4()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2469:1: ( rule__TestCondition__Group_1_4__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=14 && LA29_0<=15)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2469:2: rule__TestCondition__Group_1_4__0
            	    {
            	    pushFollow(FOLLOW_rule__TestCondition__Group_1_4__0_in_rule__TestCondition__Group_1__4__Impl5051);
            	    rule__TestCondition__Group_1_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getTestConditionAccess().getGroup_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group_1__4__Impl"


    // $ANTLR start "rule__TestCondition__Group_1__5"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2479:1: rule__TestCondition__Group_1__5 : rule__TestCondition__Group_1__5__Impl ;
    public final void rule__TestCondition__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2483:1: ( rule__TestCondition__Group_1__5__Impl )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2484:2: rule__TestCondition__Group_1__5__Impl
            {
            pushFollow(FOLLOW_rule__TestCondition__Group_1__5__Impl_in_rule__TestCondition__Group_1__55082);
            rule__TestCondition__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group_1__5"


    // $ANTLR start "rule__TestCondition__Group_1__5__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2490:1: rule__TestCondition__Group_1__5__Impl : ( ( ')' )? ) ;
    public final void rule__TestCondition__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2494:1: ( ( ( ')' )? ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2495:1: ( ( ')' )? )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2495:1: ( ( ')' )? )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2496:1: ( ')' )?
            {
             before(grammarAccess.getTestConditionAccess().getRightParenthesisKeyword_1_5()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2497:1: ( ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2498:2: ')'
                    {
                    match(input,32,FOLLOW_32_in_rule__TestCondition__Group_1__5__Impl5111); 

                    }
                    break;

            }

             after(grammarAccess.getTestConditionAccess().getRightParenthesisKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group_1__5__Impl"


    // $ANTLR start "rule__TestCondition__Group_1_4__0"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2521:1: rule__TestCondition__Group_1_4__0 : rule__TestCondition__Group_1_4__0__Impl rule__TestCondition__Group_1_4__1 ;
    public final void rule__TestCondition__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2525:1: ( rule__TestCondition__Group_1_4__0__Impl rule__TestCondition__Group_1_4__1 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2526:2: rule__TestCondition__Group_1_4__0__Impl rule__TestCondition__Group_1_4__1
            {
            pushFollow(FOLLOW_rule__TestCondition__Group_1_4__0__Impl_in_rule__TestCondition__Group_1_4__05156);
            rule__TestCondition__Group_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestCondition__Group_1_4__1_in_rule__TestCondition__Group_1_4__05159);
            rule__TestCondition__Group_1_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group_1_4__0"


    // $ANTLR start "rule__TestCondition__Group_1_4__0__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2533:1: rule__TestCondition__Group_1_4__0__Impl : ( ruleConditionOperation ) ;
    public final void rule__TestCondition__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2537:1: ( ( ruleConditionOperation ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2538:1: ( ruleConditionOperation )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2538:1: ( ruleConditionOperation )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2539:1: ruleConditionOperation
            {
             before(grammarAccess.getTestConditionAccess().getConditionOperationParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_ruleConditionOperation_in_rule__TestCondition__Group_1_4__0__Impl5186);
            ruleConditionOperation();

            state._fsp--;

             after(grammarAccess.getTestConditionAccess().getConditionOperationParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group_1_4__0__Impl"


    // $ANTLR start "rule__TestCondition__Group_1_4__1"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2550:1: rule__TestCondition__Group_1_4__1 : rule__TestCondition__Group_1_4__1__Impl rule__TestCondition__Group_1_4__2 ;
    public final void rule__TestCondition__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2554:1: ( rule__TestCondition__Group_1_4__1__Impl rule__TestCondition__Group_1_4__2 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2555:2: rule__TestCondition__Group_1_4__1__Impl rule__TestCondition__Group_1_4__2
            {
            pushFollow(FOLLOW_rule__TestCondition__Group_1_4__1__Impl_in_rule__TestCondition__Group_1_4__15215);
            rule__TestCondition__Group_1_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestCondition__Group_1_4__2_in_rule__TestCondition__Group_1_4__15218);
            rule__TestCondition__Group_1_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group_1_4__1"


    // $ANTLR start "rule__TestCondition__Group_1_4__1__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2562:1: rule__TestCondition__Group_1_4__1__Impl : ( ( '(' )? ) ;
    public final void rule__TestCondition__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2566:1: ( ( ( '(' )? ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2567:1: ( ( '(' )? )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2567:1: ( ( '(' )? )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2568:1: ( '(' )?
            {
             before(grammarAccess.getTestConditionAccess().getLeftParenthesisKeyword_1_4_1()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2569:1: ( '(' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2570:2: '('
                    {
                    match(input,31,FOLLOW_31_in_rule__TestCondition__Group_1_4__1__Impl5247); 

                    }
                    break;

            }

             after(grammarAccess.getTestConditionAccess().getLeftParenthesisKeyword_1_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group_1_4__1__Impl"


    // $ANTLR start "rule__TestCondition__Group_1_4__2"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2581:1: rule__TestCondition__Group_1_4__2 : rule__TestCondition__Group_1_4__2__Impl rule__TestCondition__Group_1_4__3 ;
    public final void rule__TestCondition__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2585:1: ( rule__TestCondition__Group_1_4__2__Impl rule__TestCondition__Group_1_4__3 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2586:2: rule__TestCondition__Group_1_4__2__Impl rule__TestCondition__Group_1_4__3
            {
            pushFollow(FOLLOW_rule__TestCondition__Group_1_4__2__Impl_in_rule__TestCondition__Group_1_4__25280);
            rule__TestCondition__Group_1_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestCondition__Group_1_4__3_in_rule__TestCondition__Group_1_4__25283);
            rule__TestCondition__Group_1_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group_1_4__2"


    // $ANTLR start "rule__TestCondition__Group_1_4__2__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2593:1: rule__TestCondition__Group_1_4__2__Impl : ( ruleTestcaseElement ) ;
    public final void rule__TestCondition__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2597:1: ( ( ruleTestcaseElement ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2598:1: ( ruleTestcaseElement )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2598:1: ( ruleTestcaseElement )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2599:1: ruleTestcaseElement
            {
             before(grammarAccess.getTestConditionAccess().getTestcaseElementParserRuleCall_1_4_2()); 
            pushFollow(FOLLOW_ruleTestcaseElement_in_rule__TestCondition__Group_1_4__2__Impl5310);
            ruleTestcaseElement();

            state._fsp--;

             after(grammarAccess.getTestConditionAccess().getTestcaseElementParserRuleCall_1_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group_1_4__2__Impl"


    // $ANTLR start "rule__TestCondition__Group_1_4__3"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2610:1: rule__TestCondition__Group_1_4__3 : rule__TestCondition__Group_1_4__3__Impl ;
    public final void rule__TestCondition__Group_1_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2614:1: ( rule__TestCondition__Group_1_4__3__Impl )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2615:2: rule__TestCondition__Group_1_4__3__Impl
            {
            pushFollow(FOLLOW_rule__TestCondition__Group_1_4__3__Impl_in_rule__TestCondition__Group_1_4__35339);
            rule__TestCondition__Group_1_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group_1_4__3"


    // $ANTLR start "rule__TestCondition__Group_1_4__3__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2621:1: rule__TestCondition__Group_1_4__3__Impl : ( ( ')' )? ) ;
    public final void rule__TestCondition__Group_1_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2625:1: ( ( ( ')' )? ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2626:1: ( ( ')' )? )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2626:1: ( ( ')' )? )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2627:1: ( ')' )?
            {
             before(grammarAccess.getTestConditionAccess().getRightParenthesisKeyword_1_4_3()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2628:1: ( ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==32) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2629:2: ')'
                    {
                    match(input,32,FOLLOW_32_in_rule__TestCondition__Group_1_4__3__Impl5368); 

                    }
                    break;

            }

             after(grammarAccess.getTestConditionAccess().getRightParenthesisKeyword_1_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCondition__Group_1_4__3__Impl"


    // $ANTLR start "rule__Testcase__Group__0"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2648:1: rule__Testcase__Group__0 : rule__Testcase__Group__0__Impl rule__Testcase__Group__1 ;
    public final void rule__Testcase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2652:1: ( rule__Testcase__Group__0__Impl rule__Testcase__Group__1 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2653:2: rule__Testcase__Group__0__Impl rule__Testcase__Group__1
            {
            pushFollow(FOLLOW_rule__Testcase__Group__0__Impl_in_rule__Testcase__Group__05409);
            rule__Testcase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Testcase__Group__1_in_rule__Testcase__Group__05412);
            rule__Testcase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testcase__Group__0"


    // $ANTLR start "rule__Testcase__Group__0__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2660:1: rule__Testcase__Group__0__Impl : ( 'testcase' ) ;
    public final void rule__Testcase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2664:1: ( ( 'testcase' ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2665:1: ( 'testcase' )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2665:1: ( 'testcase' )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2666:1: 'testcase'
            {
             before(grammarAccess.getTestcaseAccess().getTestcaseKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Testcase__Group__0__Impl5440); 
             after(grammarAccess.getTestcaseAccess().getTestcaseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testcase__Group__0__Impl"


    // $ANTLR start "rule__Testcase__Group__1"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2679:1: rule__Testcase__Group__1 : rule__Testcase__Group__1__Impl rule__Testcase__Group__2 ;
    public final void rule__Testcase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2683:1: ( rule__Testcase__Group__1__Impl rule__Testcase__Group__2 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2684:2: rule__Testcase__Group__1__Impl rule__Testcase__Group__2
            {
            pushFollow(FOLLOW_rule__Testcase__Group__1__Impl_in_rule__Testcase__Group__15471);
            rule__Testcase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Testcase__Group__2_in_rule__Testcase__Group__15474);
            rule__Testcase__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testcase__Group__1"


    // $ANTLR start "rule__Testcase__Group__1__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2691:1: rule__Testcase__Group__1__Impl : ( '{' ) ;
    public final void rule__Testcase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2695:1: ( ( '{' ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2696:1: ( '{' )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2696:1: ( '{' )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2697:1: '{'
            {
             before(grammarAccess.getTestcaseAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__Testcase__Group__1__Impl5502); 
             after(grammarAccess.getTestcaseAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testcase__Group__1__Impl"


    // $ANTLR start "rule__Testcase__Group__2"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2710:1: rule__Testcase__Group__2 : rule__Testcase__Group__2__Impl rule__Testcase__Group__3 ;
    public final void rule__Testcase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2714:1: ( rule__Testcase__Group__2__Impl rule__Testcase__Group__3 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2715:2: rule__Testcase__Group__2__Impl rule__Testcase__Group__3
            {
            pushFollow(FOLLOW_rule__Testcase__Group__2__Impl_in_rule__Testcase__Group__25533);
            rule__Testcase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Testcase__Group__3_in_rule__Testcase__Group__25536);
            rule__Testcase__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testcase__Group__2"


    // $ANTLR start "rule__Testcase__Group__2__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2722:1: rule__Testcase__Group__2__Impl : ( ( ruleTestCondition )* ) ;
    public final void rule__Testcase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2726:1: ( ( ( ruleTestCondition )* ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2727:1: ( ( ruleTestCondition )* )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2727:1: ( ( ruleTestCondition )* )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2728:1: ( ruleTestCondition )*
            {
             before(grammarAccess.getTestcaseAccess().getTestConditionParserRuleCall_2()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2729:1: ( ruleTestCondition )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_STRING) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2729:3: ruleTestCondition
            	    {
            	    pushFollow(FOLLOW_ruleTestCondition_in_rule__Testcase__Group__2__Impl5564);
            	    ruleTestCondition();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getTestcaseAccess().getTestConditionParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testcase__Group__2__Impl"


    // $ANTLR start "rule__Testcase__Group__3"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2739:1: rule__Testcase__Group__3 : rule__Testcase__Group__3__Impl ;
    public final void rule__Testcase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2743:1: ( rule__Testcase__Group__3__Impl )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2744:2: rule__Testcase__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Testcase__Group__3__Impl_in_rule__Testcase__Group__35595);
            rule__Testcase__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testcase__Group__3"


    // $ANTLR start "rule__Testcase__Group__3__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2750:1: rule__Testcase__Group__3__Impl : ( '}' ) ;
    public final void rule__Testcase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2754:1: ( ( '}' ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2755:1: ( '}' )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2755:1: ( '}' )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2756:1: '}'
            {
             before(grammarAccess.getTestcaseAccess().getRightCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_36_in_rule__Testcase__Group__3__Impl5623); 
             after(grammarAccess.getTestcaseAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testcase__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2777:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2781:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2782:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__05662);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__05665);
            rule__Function__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2789:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2793:1: ( ( 'function' ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2794:1: ( 'function' )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2794:1: ( 'function' )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2795:1: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Function__Group__0__Impl5693); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2808:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2812:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2813:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__15724);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__15727);
            rule__Function__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2820:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2824:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2825:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2825:1: ( ( rule__Function__NameAssignment_1 ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2826:1: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2827:1: ( rule__Function__NameAssignment_1 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2827:2: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl5754);
            rule__Function__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2837:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2841:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2842:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__25784);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__25787);
            rule__Function__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2849:1: rule__Function__Group__2__Impl : ( '(' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2853:1: ( ( '(' ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2854:1: ( '(' )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2854:1: ( '(' )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2855:1: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__Function__Group__2__Impl5815); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2868:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2872:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2873:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__35846);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__35849);
            rule__Function__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2880:1: rule__Function__Group__3__Impl : ( ( rule__Function__Group_3__0 )* ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2884:1: ( ( ( rule__Function__Group_3__0 )* ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2885:1: ( ( rule__Function__Group_3__0 )* )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2885:1: ( ( rule__Function__Group_3__0 )* )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2886:1: ( rule__Function__Group_3__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_3()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2887:1: ( rule__Function__Group_3__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=27 && LA34_0<=30)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2887:2: rule__Function__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Function__Group_3__0_in_rule__Function__Group__3__Impl5876);
            	    rule__Function__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2897:1: rule__Function__Group__4 : rule__Function__Group__4__Impl ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2901:1: ( rule__Function__Group__4__Impl )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2902:2: rule__Function__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__45907);
            rule__Function__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2908:1: rule__Function__Group__4__Impl : ( ')' ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2912:1: ( ( ')' ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2913:1: ( ')' )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2913:1: ( ')' )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2914:1: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 
            match(input,32,FOLLOW_32_in_rule__Function__Group__4__Impl5935); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group_3__0"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2937:1: rule__Function__Group_3__0 : rule__Function__Group_3__0__Impl rule__Function__Group_3__1 ;
    public final void rule__Function__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2941:1: ( rule__Function__Group_3__0__Impl rule__Function__Group_3__1 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2942:2: rule__Function__Group_3__0__Impl rule__Function__Group_3__1
            {
            pushFollow(FOLLOW_rule__Function__Group_3__0__Impl_in_rule__Function__Group_3__05976);
            rule__Function__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_3__1_in_rule__Function__Group_3__05979);
            rule__Function__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3__0"


    // $ANTLR start "rule__Function__Group_3__0__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2949:1: rule__Function__Group_3__0__Impl : ( ruleDatatype ) ;
    public final void rule__Function__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2953:1: ( ( ruleDatatype ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2954:1: ( ruleDatatype )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2954:1: ( ruleDatatype )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2955:1: ruleDatatype
            {
             before(grammarAccess.getFunctionAccess().getDatatypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDatatype_in_rule__Function__Group_3__0__Impl6006);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getDatatypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3__0__Impl"


    // $ANTLR start "rule__Function__Group_3__1"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2966:1: rule__Function__Group_3__1 : rule__Function__Group_3__1__Impl rule__Function__Group_3__2 ;
    public final void rule__Function__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2970:1: ( rule__Function__Group_3__1__Impl rule__Function__Group_3__2 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2971:2: rule__Function__Group_3__1__Impl rule__Function__Group_3__2
            {
            pushFollow(FOLLOW_rule__Function__Group_3__1__Impl_in_rule__Function__Group_3__16035);
            rule__Function__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_3__2_in_rule__Function__Group_3__16038);
            rule__Function__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3__1"


    // $ANTLR start "rule__Function__Group_3__1__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2978:1: rule__Function__Group_3__1__Impl : ( ( rule__Function__NameAssignment_3_1 ) ) ;
    public final void rule__Function__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2982:1: ( ( ( rule__Function__NameAssignment_3_1 ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2983:1: ( ( rule__Function__NameAssignment_3_1 ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2983:1: ( ( rule__Function__NameAssignment_3_1 ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2984:1: ( rule__Function__NameAssignment_3_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_3_1()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2985:1: ( rule__Function__NameAssignment_3_1 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2985:2: rule__Function__NameAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_3_1_in_rule__Function__Group_3__1__Impl6065);
            rule__Function__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3__1__Impl"


    // $ANTLR start "rule__Function__Group_3__2"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2995:1: rule__Function__Group_3__2 : rule__Function__Group_3__2__Impl ;
    public final void rule__Function__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:2999:1: ( rule__Function__Group_3__2__Impl )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3000:2: rule__Function__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_3__2__Impl_in_rule__Function__Group_3__26095);
            rule__Function__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3__2"


    // $ANTLR start "rule__Function__Group_3__2__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3006:1: rule__Function__Group_3__2__Impl : ( ( rule__Function__Group_3_2__0 )* ) ;
    public final void rule__Function__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3010:1: ( ( ( rule__Function__Group_3_2__0 )* ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3011:1: ( ( rule__Function__Group_3_2__0 )* )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3011:1: ( ( rule__Function__Group_3_2__0 )* )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3012:1: ( rule__Function__Group_3_2__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_3_2()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3013:1: ( rule__Function__Group_3_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==41) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3013:2: rule__Function__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Function__Group_3_2__0_in_rule__Function__Group_3__2__Impl6122);
            	    rule__Function__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3__2__Impl"


    // $ANTLR start "rule__Function__Group_3_2__0"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3029:1: rule__Function__Group_3_2__0 : rule__Function__Group_3_2__0__Impl rule__Function__Group_3_2__1 ;
    public final void rule__Function__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3033:1: ( rule__Function__Group_3_2__0__Impl rule__Function__Group_3_2__1 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3034:2: rule__Function__Group_3_2__0__Impl rule__Function__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Function__Group_3_2__0__Impl_in_rule__Function__Group_3_2__06159);
            rule__Function__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_3_2__1_in_rule__Function__Group_3_2__06162);
            rule__Function__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3_2__0"


    // $ANTLR start "rule__Function__Group_3_2__0__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3041:1: rule__Function__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Function__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3045:1: ( ( ',' ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3046:1: ( ',' )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3046:1: ( ',' )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3047:1: ','
            {
             before(grammarAccess.getFunctionAccess().getCommaKeyword_3_2_0()); 
            match(input,41,FOLLOW_41_in_rule__Function__Group_3_2__0__Impl6190); 
             after(grammarAccess.getFunctionAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3_2__0__Impl"


    // $ANTLR start "rule__Function__Group_3_2__1"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3060:1: rule__Function__Group_3_2__1 : rule__Function__Group_3_2__1__Impl rule__Function__Group_3_2__2 ;
    public final void rule__Function__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3064:1: ( rule__Function__Group_3_2__1__Impl rule__Function__Group_3_2__2 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3065:2: rule__Function__Group_3_2__1__Impl rule__Function__Group_3_2__2
            {
            pushFollow(FOLLOW_rule__Function__Group_3_2__1__Impl_in_rule__Function__Group_3_2__16221);
            rule__Function__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_3_2__2_in_rule__Function__Group_3_2__16224);
            rule__Function__Group_3_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3_2__1"


    // $ANTLR start "rule__Function__Group_3_2__1__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3072:1: rule__Function__Group_3_2__1__Impl : ( ruleDatatype ) ;
    public final void rule__Function__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3076:1: ( ( ruleDatatype ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3077:1: ( ruleDatatype )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3077:1: ( ruleDatatype )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3078:1: ruleDatatype
            {
             before(grammarAccess.getFunctionAccess().getDatatypeParserRuleCall_3_2_1()); 
            pushFollow(FOLLOW_ruleDatatype_in_rule__Function__Group_3_2__1__Impl6251);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getDatatypeParserRuleCall_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3_2__1__Impl"


    // $ANTLR start "rule__Function__Group_3_2__2"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3089:1: rule__Function__Group_3_2__2 : rule__Function__Group_3_2__2__Impl ;
    public final void rule__Function__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3093:1: ( rule__Function__Group_3_2__2__Impl )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3094:2: rule__Function__Group_3_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_3_2__2__Impl_in_rule__Function__Group_3_2__26280);
            rule__Function__Group_3_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3_2__2"


    // $ANTLR start "rule__Function__Group_3_2__2__Impl"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3100:1: rule__Function__Group_3_2__2__Impl : ( ( rule__Function__NameAssignment_3_2_2 ) ) ;
    public final void rule__Function__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3104:1: ( ( ( rule__Function__NameAssignment_3_2_2 ) ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3105:1: ( ( rule__Function__NameAssignment_3_2_2 ) )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3105:1: ( ( rule__Function__NameAssignment_3_2_2 ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3106:1: ( rule__Function__NameAssignment_3_2_2 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_3_2_2()); 
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3107:1: ( rule__Function__NameAssignment_3_2_2 )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3107:2: rule__Function__NameAssignment_3_2_2
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_3_2_2_in_rule__Function__Group_3_2__2__Impl6307);
            rule__Function__NameAssignment_3_2_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_3_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3_2__2__Impl"


    // $ANTLR start "rule__Model__MyDSLAssignment"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3124:1: rule__Model__MyDSLAssignment : ( rulemyDSL ) ;
    public final void rule__Model__MyDSLAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3128:1: ( ( rulemyDSL ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3129:1: ( rulemyDSL )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3129:1: ( rulemyDSL )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3130:1: rulemyDSL
            {
             before(grammarAccess.getModelAccess().getMyDSLMyDSLParserRuleCall_0()); 
            pushFollow(FOLLOW_rulemyDSL_in_rule__Model__MyDSLAssignment6348);
            rulemyDSL();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMyDSLMyDSLParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MyDSLAssignment"


    // $ANTLR start "rule__Define__NameAssignment_1"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3139:1: rule__Define__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Define__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3143:1: ( ( RULE_ID ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3144:1: ( RULE_ID )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3144:1: ( RULE_ID )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3145:1: RULE_ID
            {
             before(grammarAccess.getDefineAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Define__NameAssignment_16379); 
             after(grammarAccess.getDefineAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__NameAssignment_1"


    // $ANTLR start "rule__Function__NameAssignment_1"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3154:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3158:1: ( ( RULE_ID ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3159:1: ( RULE_ID )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3159:1: ( RULE_ID )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3160:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__NameAssignment_16410); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_1"


    // $ANTLR start "rule__Function__NameAssignment_3_1"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3169:1: rule__Function__NameAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3173:1: ( ( RULE_ID ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3174:1: ( RULE_ID )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3174:1: ( RULE_ID )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3175:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__NameAssignment_3_16441); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_3_1"


    // $ANTLR start "rule__Function__NameAssignment_3_2_2"
    // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3184:1: rule__Function__NameAssignment_3_2_2 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3188:1: ( ( RULE_ID ) )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3189:1: ( RULE_ID )
            {
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3189:1: ( RULE_ID )
            // ../com.capstone.dsl.ui/src-gen/org/xtext/example/domainmodel/ui/contentassist/antlr/internal/InternalDomainmodel.g:3190:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_3_2_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__NameAssignment_3_2_26472); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_3_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_3_2_2"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA8_eotS =
        "\34\uffff";
    static final String DFA8_eofS =
        "\34\uffff";
    static final String DFA8_minS =
        "\3\4\1\20\1\4\2\20\6\4\1\26\5\4\1\20\1\4\1\20\1\4\2\20\2\uffff"+
        "\1\20";
    static final String DFA8_maxS =
        "\3\41\1\40\1\4\2\40\6\41\1\32\5\41\1\40\1\41\1\40\1\4\2\40\2\uffff"+
        "\1\40";
    static final String DFA8_acceptS =
        "\31\uffff\1\1\1\2\1\uffff";
    static final String DFA8_specialS =
        "\34\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\3\1\5\1\6\12\uffff\1\2\15\uffff\1\1\1\uffff\1\4",
            "\1\3\1\5\1\6\12\uffff\1\2\17\uffff\1\4",
            "\1\3\34\uffff\1\4",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\5\uffff"+
            "\1\15",
            "\1\23",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\5\uffff"+
            "\1\15",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\5\uffff"+
            "\1\15",
            "\1\25\1\27\1\30\12\uffff\1\24\17\uffff\1\26",
            "\1\25\1\27\1\30\12\uffff\1\24\17\uffff\1\26",
            "\1\25\1\27\1\30\12\uffff\1\24\17\uffff\1\26",
            "\1\25\1\27\1\30\12\uffff\1\24\17\uffff\1\26",
            "\1\25\1\27\1\30\12\uffff\1\24\17\uffff\1\26",
            "\1\25\1\27\1\30\12\uffff\1\24\17\uffff\1\26",
            "\1\16\1\17\1\20\1\21\1\22",
            "\3\31\1\32\11\uffff\1\31\15\uffff\1\31\1\uffff\1\31",
            "\3\31\1\32\11\uffff\1\31\15\uffff\1\31\1\uffff\1\31",
            "\3\31\1\32\11\uffff\1\31\15\uffff\1\31\1\uffff\1\31",
            "\3\31\1\32\11\uffff\1\31\15\uffff\1\31\1\uffff\1\31",
            "\3\31\1\32\11\uffff\1\31\15\uffff\1\31\1\uffff\1\31",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\5\uffff"+
            "\1\15",
            "\1\25\34\uffff\1\26",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\5\uffff"+
            "\1\15",
            "\1\33",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\5\uffff"+
            "\1\15",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\5\uffff"+
            "\1\15",
            "",
            "",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\5\uffff"+
            "\1\15"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "802:1: rule__CompareFormula__Alternatives : ( ( ( rule__CompareFormula__Group_0__0 ) ) | ( ( rule__CompareFormula__Group_1__0 ) ) );";
        }
    }
    static final String DFA10_eotS =
        "\27\uffff";
    static final String DFA10_eofS =
        "\3\uffff\1\17\1\uffff\2\17\6\uffff\1\17\2\uffff\1\17\1\uffff\1"+
        "\17\1\uffff\3\17";
    static final String DFA10_minS =
        "\3\4\1\7\1\4\2\7\6\4\1\7\2\uffff\1\7\1\4\1\7\1\4\3\7";
    static final String DFA10_maxS =
        "\3\41\1\44\1\4\2\44\6\41\1\44\2\uffff\1\44\1\41\1\44\1\4\3\44";
    static final String DFA10_acceptS =
        "\16\uffff\1\1\1\2\7\uffff";
    static final String DFA10_specialS =
        "\27\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\3\1\5\1\6\12\uffff\1\2\15\uffff\1\1\1\uffff\1\4",
            "\1\3\1\5\1\6\12\uffff\1\2\17\uffff\1\4",
            "\1\3\34\uffff\1\4",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\4\uffff"+
            "\1\17\1\15\3\uffff\1\17",
            "\1\20",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\4\uffff"+
            "\1\17\1\15\3\uffff\1\17",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\4\uffff"+
            "\1\17\1\15\3\uffff\1\17",
            "\1\22\1\24\1\25\12\uffff\1\21\17\uffff\1\23",
            "\1\22\1\24\1\25\12\uffff\1\21\17\uffff\1\23",
            "\1\22\1\24\1\25\12\uffff\1\21\17\uffff\1\23",
            "\1\22\1\24\1\25\12\uffff\1\21\17\uffff\1\23",
            "\1\22\1\24\1\25\12\uffff\1\21\17\uffff\1\23",
            "\1\22\1\24\1\25\12\uffff\1\21\17\uffff\1\23",
            "\1\17\6\uffff\2\17\6\uffff\5\16\4\uffff\2\17\3\uffff\1\17",
            "",
            "",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\4\uffff"+
            "\1\17\1\15\3\uffff\1\17",
            "\1\22\34\uffff\1\23",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\4\uffff"+
            "\1\17\1\15\3\uffff\1\17",
            "\1\26",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\4\uffff"+
            "\1\17\1\15\3\uffff\1\17",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\4\uffff"+
            "\1\17\1\15\3\uffff\1\17",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\4\uffff"+
            "\1\17\1\15\3\uffff\1\17"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "846:1: rule__TestcaseElement__Alternatives : ( ( ruleCompareFormula ) | ( ruleMathFormula ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MyDSLAssignment_in_ruleModel94 = new BitSet(new long[]{0x000001E400002002L});
    public static final BitSet FOLLOW_rulemyDSL_in_entryRulemyDSL122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemyDSL129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyDSL__Alternatives_in_rulemyDSL155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionOperation_in_entryRuleConditionOperation182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionOperation189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionOperation__Alternatives_in_ruleConditionOperation215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathOperation_in_entryRuleMathOperation242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathOperation249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathOperation__Alternatives_in_ruleMathOperation275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Alternatives_in_ruleCompareOperation335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Alternatives_in_ruleVariable395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathFormula_in_entryRuleMathFormula422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathFormula429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathFormula__Group__0_in_ruleMathFormula455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareFormula_in_entryRuleCompareFormula482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareFormula489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareFormula__Alternatives_in_ruleCompareFormula515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyID_in_entryRuleMyID542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMyID549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyID__Group__0_in_ruleMyID575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestcaseElement_in_entryRuleTestcaseElement602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestcaseElement609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestcaseElement__Alternatives_in_ruleTestcaseElement635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumOptions_in_entryRuleEnumOptions722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumOptions729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumOptions756 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDefine_in_entryRuleDefine784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefine791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group__0_in_ruleDefine817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecondition_in_entryRulePrecondition844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrecondition851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__Group__0_in_rulePrecondition877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestCondition_in_entryRuleTestCondition904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestCondition911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCondition__Group__0_in_ruleTestCondition937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestcase_in_entryRuleTestcase964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestcase971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Testcase__Group__0_in_ruleTestcase997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype1024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Alternatives_in_ruleDatatype1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction1084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_ruleFunction1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRun_in_entryRuleRun1144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRun1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleRun1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__MyDSL__Alternatives1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefine_in_rule__MyDSL__Alternatives1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecondition_in_rule__MyDSL__Alternatives1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestcase_in_rule__MyDSL__Alternatives1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__MyDSL__Alternatives1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRun_in_rule__MyDSL__Alternatives1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ConditionOperation__Alternatives1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ConditionOperation__Alternatives1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__MathOperation__Alternatives1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MathOperation__Alternatives1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MathOperation__Alternatives1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MathOperation__Alternatives1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MathOperation__Alternatives1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MathOperation__Alternatives1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CompareOperation__Alternatives1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CompareOperation__Alternatives1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CompareOperation__Alternatives1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CompareOperation__Alternatives1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CompareOperation__Alternatives1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyID_in_rule__Variable__Alternatives1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_rule__Variable__Alternatives1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__Variable__Alternatives1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareFormula__Group_0__0_in_rule__CompareFormula__Alternatives1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareFormula__Group_1__0_in_rule__CompareFormula__Alternatives1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MyID__Alternatives_11754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyID__Group_1_1__0_in_rule__MyID__Alternatives_11771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareFormula_in_rule__TestcaseElement__Alternatives1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathFormula_in_rule__TestcaseElement__Alternatives1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__Alternatives_11853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Enum__Alternatives_11871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Enum__Alternatives_11891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Enum__Alternatives_11911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Enum__Alternatives_11931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareFormula_in_rule__Define__Alternatives_41965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyID_in_rule__Define__Alternatives_41982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareFormula_in_rule__Define__Alternatives_6_22014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyID_in_rule__Define__Alternatives_6_22031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Datatype__Alternatives2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Datatype__Alternatives2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Datatype__Alternatives2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Datatype__Alternatives2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathFormula__Group__0__Impl_in_rule__MathFormula__Group__02156 = new BitSet(new long[]{0x0000000200020070L});
    public static final BitSet FOLLOW_rule__MathFormula__Group__1_in_rule__MathFormula__Group__02159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MathFormula__Group__0__Impl2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathFormula__Group__1__Impl_in_rule__MathFormula__Group__12221 = new BitSet(new long[]{0x00000001003F0000L});
    public static final BitSet FOLLOW_rule__MathFormula__Group__2_in_rule__MathFormula__Group__12224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__MathFormula__Group__1__Impl2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathFormula__Group__2__Impl_in_rule__MathFormula__Group__22280 = new BitSet(new long[]{0x00000001003F0000L});
    public static final BitSet FOLLOW_rule__MathFormula__Group__3_in_rule__MathFormula__Group__22283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathFormula__Group_2__0_in_rule__MathFormula__Group__2__Impl2310 = new BitSet(new long[]{0x00000000003F0002L});
    public static final BitSet FOLLOW_rule__MathFormula__Group__3__Impl_in_rule__MathFormula__Group__32341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MathFormula__Group__3__Impl2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathFormula__Group_2__0__Impl_in_rule__MathFormula__Group_2__02411 = new BitSet(new long[]{0x0000000200020070L});
    public static final BitSet FOLLOW_rule__MathFormula__Group_2__1_in_rule__MathFormula__Group_2__02414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathOperation_in_rule__MathFormula__Group_2__0__Impl2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathFormula__Group_2__1__Impl_in_rule__MathFormula__Group_2__12470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__MathFormula__Group_2__1__Impl2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareFormula__Group_0__0__Impl_in_rule__CompareFormula__Group_0__02530 = new BitSet(new long[]{0x0000000007C00000L});
    public static final BitSet FOLLOW_rule__CompareFormula__Group_0__1_in_rule__CompareFormula__Group_0__02533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathFormula_in_rule__CompareFormula__Group_0__0__Impl2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareFormula__Group_0__1__Impl_in_rule__CompareFormula__Group_0__12589 = new BitSet(new long[]{0x0000000280020070L});
    public static final BitSet FOLLOW_rule__CompareFormula__Group_0__2_in_rule__CompareFormula__Group_0__12592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_rule__CompareFormula__Group_0__1__Impl2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareFormula__Group_0__2__Impl_in_rule__CompareFormula__Group_0__22648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathFormula_in_rule__CompareFormula__Group_0__2__Impl2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareFormula__Group_1__0__Impl_in_rule__CompareFormula__Group_1__02710 = new BitSet(new long[]{0x0000000007C00000L});
    public static final BitSet FOLLOW_rule__CompareFormula__Group_1__1_in_rule__CompareFormula__Group_1__02713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathFormula_in_rule__CompareFormula__Group_1__0__Impl2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareFormula__Group_1__1__Impl_in_rule__CompareFormula__Group_1__12769 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__CompareFormula__Group_1__2_in_rule__CompareFormula__Group_1__12772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_rule__CompareFormula__Group_1__1__Impl2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareFormula__Group_1__2__Impl_in_rule__CompareFormula__Group_1__22828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CompareFormula__Group_1__2__Impl2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyID__Group__0__Impl_in_rule__MyID__Group__02890 = new BitSet(new long[]{0x0000000200020010L});
    public static final BitSet FOLLOW_rule__MyID__Group__1_in_rule__MyID__Group__02893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MyID__Group__0__Impl2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyID__Group__1__Impl_in_rule__MyID__Group__12955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyID__Alternatives_1_in_rule__MyID__Group__1__Impl2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyID__Group_1_1__0__Impl_in_rule__MyID__Group_1_1__03016 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MyID__Group_1_1__1_in_rule__MyID__Group_1_1__03019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__MyID__Group_1_1__0__Impl3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyID__Group_1_1__1__Impl_in_rule__MyID__Group_1_1__13078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MyID__Group_1_1__1__Impl3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__03138 = new BitSet(new long[]{0x0000000078000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__03141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Enum__Group__0__Impl3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__13200 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__13203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Alternatives_1_in_rule__Enum__Group__1__Impl3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__23260 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__23263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Enum__Group__2__Impl3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__33322 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__33325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumOptions_in_rule__Enum__Group__3__Impl3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__43381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Enum__Group__4__Impl3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group__0__Impl_in_rule__Define__Group__03450 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Define__Group__1_in_rule__Define__Group__03453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Define__Group__0__Impl3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group__1__Impl_in_rule__Define__Group__13512 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Define__Group__2_in_rule__Define__Group__13515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__NameAssignment_1_in_rule__Define__Group__1__Impl3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group__2__Impl_in_rule__Define__Group__23572 = new BitSet(new long[]{0x0000000280020070L});
    public static final BitSet FOLLOW_rule__Define__Group__3_in_rule__Define__Group__23575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Define__Group__2__Impl3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group__3__Impl_in_rule__Define__Group__33634 = new BitSet(new long[]{0x0000000280020070L});
    public static final BitSet FOLLOW_rule__Define__Group__4_in_rule__Define__Group__33637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Define__Group__3__Impl3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group__4__Impl_in_rule__Define__Group__43699 = new BitSet(new long[]{0x000000110000C000L});
    public static final BitSet FOLLOW_rule__Define__Group__5_in_rule__Define__Group__43702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Alternatives_4_in_rule__Define__Group__4__Impl3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group__5__Impl_in_rule__Define__Group__53759 = new BitSet(new long[]{0x000000110000C000L});
    public static final BitSet FOLLOW_rule__Define__Group__6_in_rule__Define__Group__53762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Define__Group__5__Impl3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group__6__Impl_in_rule__Define__Group__63824 = new BitSet(new long[]{0x000000110000C000L});
    public static final BitSet FOLLOW_rule__Define__Group__7_in_rule__Define__Group__63827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group_6__0_in_rule__Define__Group__6__Impl3854 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__Define__Group__7__Impl_in_rule__Define__Group__73885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Define__Group__7__Impl3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group_6__0__Impl_in_rule__Define__Group_6__03960 = new BitSet(new long[]{0x0000000280020070L});
    public static final BitSet FOLLOW_rule__Define__Group_6__1_in_rule__Define__Group_6__03963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionOperation_in_rule__Define__Group_6__0__Impl3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group_6__1__Impl_in_rule__Define__Group_6__14019 = new BitSet(new long[]{0x0000000280020070L});
    public static final BitSet FOLLOW_rule__Define__Group_6__2_in_rule__Define__Group_6__14022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Define__Group_6__1__Impl4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group_6__2__Impl_in_rule__Define__Group_6__24084 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Define__Group_6__3_in_rule__Define__Group_6__24087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Alternatives_6_2_in_rule__Define__Group_6__2__Impl4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group_6__3__Impl_in_rule__Define__Group_6__34144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Define__Group_6__3__Impl4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__Group__0__Impl_in_rule__Precondition__Group__04214 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Precondition__Group__1_in_rule__Precondition__Group__04217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Precondition__Group__0__Impl4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__Group__1__Impl_in_rule__Precondition__Group__14276 = new BitSet(new long[]{0x0000000280020070L});
    public static final BitSet FOLLOW_rule__Precondition__Group__2_in_rule__Precondition__Group__14279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Precondition__Group__1__Impl4307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__Group__2__Impl_in_rule__Precondition__Group__24338 = new BitSet(new long[]{0x000000100000C000L});
    public static final BitSet FOLLOW_rule__Precondition__Group__3_in_rule__Precondition__Group__24341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareFormula_in_rule__Precondition__Group__2__Impl4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__Group__3__Impl_in_rule__Precondition__Group__34397 = new BitSet(new long[]{0x000000100000C000L});
    public static final BitSet FOLLOW_rule__Precondition__Group__4_in_rule__Precondition__Group__34400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__Group_3__0_in_rule__Precondition__Group__3__Impl4427 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__Precondition__Group__4__Impl_in_rule__Precondition__Group__44458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Precondition__Group__4__Impl4486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__Group_3__0__Impl_in_rule__Precondition__Group_3__04527 = new BitSet(new long[]{0x0000000280020070L});
    public static final BitSet FOLLOW_rule__Precondition__Group_3__1_in_rule__Precondition__Group_3__04530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionOperation_in_rule__Precondition__Group_3__0__Impl4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__Group_3__1__Impl_in_rule__Precondition__Group_3__14586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareFormula_in_rule__Precondition__Group_3__1__Impl4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCondition__Group__0__Impl_in_rule__TestCondition__Group__04646 = new BitSet(new long[]{0x0000000280020070L});
    public static final BitSet FOLLOW_rule__TestCondition__Group__1_in_rule__TestCondition__Group__04649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TestCondition__Group__0__Impl4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCondition__Group__1__Impl_in_rule__TestCondition__Group__14705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCondition__Group_1__0_in_rule__TestCondition__Group__1__Impl4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCondition__Group_1__0__Impl_in_rule__TestCondition__Group_1__04767 = new BitSet(new long[]{0x0000000280020070L});
    public static final BitSet FOLLOW_rule__TestCondition__Group_1__1_in_rule__TestCondition__Group_1__04770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TestCondition__Group_1__0__Impl4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCondition__Group_1__1__Impl_in_rule__TestCondition__Group_1__14832 = new BitSet(new long[]{0x000000018000C000L});
    public static final BitSet FOLLOW_rule__TestCondition__Group_1__2_in_rule__TestCondition__Group_1__14835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestcaseElement_in_rule__TestCondition__Group_1__1__Impl4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCondition__Group_1__2__Impl_in_rule__TestCondition__Group_1__24891 = new BitSet(new long[]{0x000000018000C000L});
    public static final BitSet FOLLOW_rule__TestCondition__Group_1__3_in_rule__TestCondition__Group_1__24894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TestCondition__Group_1__2__Impl4923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCondition__Group_1__3__Impl_in_rule__TestCondition__Group_1__34956 = new BitSet(new long[]{0x000000018000C000L});
    public static final BitSet FOLLOW_rule__TestCondition__Group_1__4_in_rule__TestCondition__Group_1__34959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TestCondition__Group_1__3__Impl4988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCondition__Group_1__4__Impl_in_rule__TestCondition__Group_1__45021 = new BitSet(new long[]{0x000000018000C000L});
    public static final BitSet FOLLOW_rule__TestCondition__Group_1__5_in_rule__TestCondition__Group_1__45024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCondition__Group_1_4__0_in_rule__TestCondition__Group_1__4__Impl5051 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__TestCondition__Group_1__5__Impl_in_rule__TestCondition__Group_1__55082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TestCondition__Group_1__5__Impl5111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCondition__Group_1_4__0__Impl_in_rule__TestCondition__Group_1_4__05156 = new BitSet(new long[]{0x0000000280020070L});
    public static final BitSet FOLLOW_rule__TestCondition__Group_1_4__1_in_rule__TestCondition__Group_1_4__05159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionOperation_in_rule__TestCondition__Group_1_4__0__Impl5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCondition__Group_1_4__1__Impl_in_rule__TestCondition__Group_1_4__15215 = new BitSet(new long[]{0x0000000280020070L});
    public static final BitSet FOLLOW_rule__TestCondition__Group_1_4__2_in_rule__TestCondition__Group_1_4__15218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TestCondition__Group_1_4__1__Impl5247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCondition__Group_1_4__2__Impl_in_rule__TestCondition__Group_1_4__25280 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__TestCondition__Group_1_4__3_in_rule__TestCondition__Group_1_4__25283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestcaseElement_in_rule__TestCondition__Group_1_4__2__Impl5310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCondition__Group_1_4__3__Impl_in_rule__TestCondition__Group_1_4__35339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TestCondition__Group_1_4__3__Impl5368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Testcase__Group__0__Impl_in_rule__Testcase__Group__05409 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Testcase__Group__1_in_rule__Testcase__Group__05412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Testcase__Group__0__Impl5440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Testcase__Group__1__Impl_in_rule__Testcase__Group__15471 = new BitSet(new long[]{0x0000001000000080L});
    public static final BitSet FOLLOW_rule__Testcase__Group__2_in_rule__Testcase__Group__15474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Testcase__Group__1__Impl5502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Testcase__Group__2__Impl_in_rule__Testcase__Group__25533 = new BitSet(new long[]{0x0000001000000080L});
    public static final BitSet FOLLOW_rule__Testcase__Group__3_in_rule__Testcase__Group__25536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestCondition_in_rule__Testcase__Group__2__Impl5564 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Testcase__Group__3__Impl_in_rule__Testcase__Group__35595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Testcase__Group__3__Impl5623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__05662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__05665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Function__Group__0__Impl5693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__15724 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__15727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl5754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__25784 = new BitSet(new long[]{0x0000000178000000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__25787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Function__Group__2__Impl5815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__35846 = new BitSet(new long[]{0x0000000178000000L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__35849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_3__0_in_rule__Function__Group__3__Impl5876 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__45907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Function__Group__4__Impl5935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_3__0__Impl_in_rule__Function__Group_3__05976 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group_3__1_in_rule__Function__Group_3__05979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_rule__Function__Group_3__0__Impl6006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_3__1__Impl_in_rule__Function__Group_3__16035 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Function__Group_3__2_in_rule__Function__Group_3__16038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_3_1_in_rule__Function__Group_3__1__Impl6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_3__2__Impl_in_rule__Function__Group_3__26095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_3_2__0_in_rule__Function__Group_3__2__Impl6122 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_3_2__0__Impl_in_rule__Function__Group_3_2__06159 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_rule__Function__Group_3_2__1_in_rule__Function__Group_3_2__06162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Function__Group_3_2__0__Impl6190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_3_2__1__Impl_in_rule__Function__Group_3_2__16221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group_3_2__2_in_rule__Function__Group_3_2__16224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_rule__Function__Group_3_2__1__Impl6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_3_2__2__Impl_in_rule__Function__Group_3_2__26280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_3_2_2_in_rule__Function__Group_3_2__2__Impl6307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemyDSL_in_rule__Model__MyDSLAssignment6348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Define__NameAssignment_16379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__NameAssignment_16410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__NameAssignment_3_16441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__NameAssignment_3_2_26472 = new BitSet(new long[]{0x0000000000000002L});

}