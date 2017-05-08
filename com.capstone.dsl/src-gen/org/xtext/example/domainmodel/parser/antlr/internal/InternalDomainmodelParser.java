package org.xtext.example.domainmodel.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.domainmodel.services.DomainmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainmodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DIGIT", "RULE_REAL", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'||'", "'&&'", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'>'", "'<'", "'='", "'>='", "'<='", "'('", "')'", "'!'", "'enum'", "'Int'", "'Real'", "'Bool'", "'String'", "'{'", "'}'", "'define'", "'precondition'", "'testcase'", "'function'", "','", "'run'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_DIGIT=4;
    public static final int RULE_REAL=5;
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
    public String getGrammarFileName() { return "../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g"; }



     	private DomainmodelGrammarAccess grammarAccess;
     	
        public InternalDomainmodelParser(TokenStream input, DomainmodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected DomainmodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:76:1: ruleModel returns [EObject current=null] : ( (lv_myDSL_0_0= rulemyDSL ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_myDSL_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:79:28: ( ( (lv_myDSL_0_0= rulemyDSL ) )* )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:80:1: ( (lv_myDSL_0_0= rulemyDSL ) )*
            {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:80:1: ( (lv_myDSL_0_0= rulemyDSL ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==29||(LA1_0>=36 && LA1_0<=39)||LA1_0==41) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:81:1: (lv_myDSL_0_0= rulemyDSL )
            	    {
            	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:81:1: (lv_myDSL_0_0= rulemyDSL )
            	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:82:3: lv_myDSL_0_0= rulemyDSL
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getMyDSLMyDSLParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulemyDSL_in_ruleModel130);
            	    lv_myDSL_0_0=rulemyDSL();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"myDSL",
            	            		lv_myDSL_0_0, 
            	            		"myDSL");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRulemyDSL"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:106:1: entryRulemyDSL returns [EObject current=null] : iv_rulemyDSL= rulemyDSL EOF ;
    public final EObject entryRulemyDSL() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyDSL = null;


        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:107:2: (iv_rulemyDSL= rulemyDSL EOF )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:108:2: iv_rulemyDSL= rulemyDSL EOF
            {
             newCompositeNode(grammarAccess.getMyDSLRule()); 
            pushFollow(FOLLOW_rulemyDSL_in_entryRulemyDSL166);
            iv_rulemyDSL=rulemyDSL();

            state._fsp--;

             current =iv_rulemyDSL; 
            match(input,EOF,FOLLOW_EOF_in_entryRulemyDSL176); 

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
    // $ANTLR end "entryRulemyDSL"


    // $ANTLR start "rulemyDSL"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:115:1: rulemyDSL returns [EObject current=null] : ( ruleEnum | this_Define_1= ruleDefine | rulePrecondition | ruleTestcase | this_Function_4= ruleFunction | ruleRun ) ;
    public final EObject rulemyDSL() throws RecognitionException {
        EObject current = null;

        EObject this_Define_1 = null;

        EObject this_Function_4 = null;


         enterRule(); 
            
        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:118:28: ( ( ruleEnum | this_Define_1= ruleDefine | rulePrecondition | ruleTestcase | this_Function_4= ruleFunction | ruleRun ) )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:119:1: ( ruleEnum | this_Define_1= ruleDefine | rulePrecondition | ruleTestcase | this_Function_4= ruleFunction | ruleRun )
            {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:119:1: ( ruleEnum | this_Define_1= ruleDefine | rulePrecondition | ruleTestcase | this_Function_4= ruleFunction | ruleRun )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt2=1;
                }
                break;
            case 36:
                {
                alt2=2;
                }
                break;
            case 37:
                {
                alt2=3;
                }
                break;
            case 38:
                {
                alt2=4;
                }
                break;
            case 39:
                {
                alt2=5;
                }
                break;
            case 41:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:120:5: ruleEnum
                    {
                     
                            newCompositeNode(grammarAccess.getMyDSLAccess().getEnumParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEnum_in_rulemyDSL217);
                    ruleEnum();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:129:5: this_Define_1= ruleDefine
                    {
                     
                            newCompositeNode(grammarAccess.getMyDSLAccess().getDefineParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDefine_in_rulemyDSL244);
                    this_Define_1=ruleDefine();

                    state._fsp--;

                     
                            current = this_Define_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:139:5: rulePrecondition
                    {
                     
                            newCompositeNode(grammarAccess.getMyDSLAccess().getPreconditionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePrecondition_in_rulemyDSL265);
                    rulePrecondition();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:148:5: ruleTestcase
                    {
                     
                            newCompositeNode(grammarAccess.getMyDSLAccess().getTestcaseParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTestcase_in_rulemyDSL286);
                    ruleTestcase();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:157:5: this_Function_4= ruleFunction
                    {
                     
                            newCompositeNode(grammarAccess.getMyDSLAccess().getFunctionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleFunction_in_rulemyDSL313);
                    this_Function_4=ruleFunction();

                    state._fsp--;

                     
                            current = this_Function_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:167:5: ruleRun
                    {
                     
                            newCompositeNode(grammarAccess.getMyDSLAccess().getRunParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleRun_in_rulemyDSL334);
                    ruleRun();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "rulemyDSL"


    // $ANTLR start "entryRuleConditionOperation"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:182:1: entryRuleConditionOperation returns [String current=null] : iv_ruleConditionOperation= ruleConditionOperation EOF ;
    public final String entryRuleConditionOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionOperation = null;


        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:183:2: (iv_ruleConditionOperation= ruleConditionOperation EOF )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:184:2: iv_ruleConditionOperation= ruleConditionOperation EOF
            {
             newCompositeNode(grammarAccess.getConditionOperationRule()); 
            pushFollow(FOLLOW_ruleConditionOperation_in_entryRuleConditionOperation370);
            iv_ruleConditionOperation=ruleConditionOperation();

            state._fsp--;

             current =iv_ruleConditionOperation.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionOperation381); 

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
    // $ANTLR end "entryRuleConditionOperation"


    // $ANTLR start "ruleConditionOperation"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:191:1: ruleConditionOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '||' | kw= '&&' ) ;
    public final AntlrDatatypeRuleToken ruleConditionOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:194:28: ( (kw= '||' | kw= '&&' ) )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:195:1: (kw= '||' | kw= '&&' )
            {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:195:1: (kw= '||' | kw= '&&' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:196:2: kw= '||'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleConditionOperation419); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConditionOperationAccess().getVerticalLineVerticalLineKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:203:2: kw= '&&'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleConditionOperation438); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConditionOperationAccess().getAmpersandAmpersandKeyword_1()); 
                        

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
    // $ANTLR end "ruleConditionOperation"


    // $ANTLR start "entryRuleMathOperation"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:216:1: entryRuleMathOperation returns [String current=null] : iv_ruleMathOperation= ruleMathOperation EOF ;
    public final String entryRuleMathOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMathOperation = null;


        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:217:2: (iv_ruleMathOperation= ruleMathOperation EOF )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:218:2: iv_ruleMathOperation= ruleMathOperation EOF
            {
             newCompositeNode(grammarAccess.getMathOperationRule()); 
            pushFollow(FOLLOW_ruleMathOperation_in_entryRuleMathOperation479);
            iv_ruleMathOperation=ruleMathOperation();

            state._fsp--;

             current =iv_ruleMathOperation.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathOperation490); 

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
    // $ANTLR end "entryRuleMathOperation"


    // $ANTLR start "ruleMathOperation"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:225:1: ruleMathOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleMathOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:228:28: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' | kw= '%' ) )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:229:1: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' | kw= '%' )
            {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:229:1: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' | kw= '%' )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            case 19:
                {
                alt4=5;
                }
                break;
            case 20:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:230:2: kw= '+'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleMathOperation528); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMathOperationAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:237:2: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleMathOperation547); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMathOperationAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:244:2: kw= '*'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleMathOperation566); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMathOperationAccess().getAsteriskKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:251:2: kw= '/'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleMathOperation585); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMathOperationAccess().getSolidusKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:258:2: kw= '^'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleMathOperation604); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMathOperationAccess().getCircumflexAccentKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:265:2: kw= '%'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleMathOperation623); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMathOperationAccess().getPercentSignKeyword_5()); 
                        

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
    // $ANTLR end "ruleMathOperation"


    // $ANTLR start "entryRuleCompareOperation"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:278:1: entryRuleCompareOperation returns [String current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final String entryRuleCompareOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompareOperation = null;


        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:279:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:280:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
             newCompositeNode(grammarAccess.getCompareOperationRule()); 
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation664);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;

             current =iv_ruleCompareOperation.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation675); 

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
    // $ANTLR end "entryRuleCompareOperation"


    // $ANTLR start "ruleCompareOperation"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:287:1: ruleCompareOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '=' | kw= '>=' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken ruleCompareOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:290:28: ( (kw= '>' | kw= '<' | kw= '=' | kw= '>=' | kw= '<=' ) )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:291:1: (kw= '>' | kw= '<' | kw= '=' | kw= '>=' | kw= '<=' )
            {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:291:1: (kw= '>' | kw= '<' | kw= '=' | kw= '>=' | kw= '<=' )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            case 24:
                {
                alt5=4;
                }
                break;
            case 25:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:292:2: kw= '>'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleCompareOperation713); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompareOperationAccess().getGreaterThanSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:299:2: kw= '<'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleCompareOperation732); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompareOperationAccess().getLessThanSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:306:2: kw= '='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleCompareOperation751); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompareOperationAccess().getEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:313:2: kw= '>='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleCompareOperation770); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompareOperationAccess().getGreaterThanSignEqualsSignKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:320:2: kw= '<='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleCompareOperation789); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompareOperationAccess().getLessThanSignEqualsSignKeyword_4()); 
                        

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
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleVariable"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:333:1: entryRuleVariable returns [String current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final String entryRuleVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariable = null;


        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:334:2: (iv_ruleVariable= ruleVariable EOF )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:335:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable830);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable841); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:342:1: ruleVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MyID_0= ruleMyID | this_DIGIT_1= RULE_DIGIT | this_REAL_2= RULE_REAL ) ;
    public final AntlrDatatypeRuleToken ruleVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_1=null;
        Token this_REAL_2=null;
        AntlrDatatypeRuleToken this_MyID_0 = null;


         enterRule(); 
            
        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:345:28: ( (this_MyID_0= ruleMyID | this_DIGIT_1= RULE_DIGIT | this_REAL_2= RULE_REAL ) )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:346:1: (this_MyID_0= ruleMyID | this_DIGIT_1= RULE_DIGIT | this_REAL_2= RULE_REAL )
            {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:346:1: (this_MyID_0= ruleMyID | this_DIGIT_1= RULE_DIGIT | this_REAL_2= RULE_REAL )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 16:
            case 28:
                {
                alt6=1;
                }
                break;
            case RULE_DIGIT:
                {
                alt6=2;
                }
                break;
            case RULE_REAL:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:347:5: this_MyID_0= ruleMyID
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAccess().getMyIDParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMyID_in_ruleVariable888);
                    this_MyID_0=ruleMyID();

                    state._fsp--;


                    		current.merge(this_MyID_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:358:10: this_DIGIT_1= RULE_DIGIT
                    {
                    this_DIGIT_1=(Token)match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_ruleVariable914); 

                    		current.merge(this_DIGIT_1);
                        
                     
                        newLeafNode(this_DIGIT_1, grammarAccess.getVariableAccess().getDIGITTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:366:10: this_REAL_2= RULE_REAL
                    {
                    this_REAL_2=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleVariable940); 

                    		current.merge(this_REAL_2);
                        
                     
                        newLeafNode(this_REAL_2, grammarAccess.getVariableAccess().getREALTerminalRuleCall_2()); 
                        

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleMathFormula"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:381:1: entryRuleMathFormula returns [String current=null] : iv_ruleMathFormula= ruleMathFormula EOF ;
    public final String entryRuleMathFormula() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMathFormula = null;


        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:382:2: (iv_ruleMathFormula= ruleMathFormula EOF )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:383:2: iv_ruleMathFormula= ruleMathFormula EOF
            {
             newCompositeNode(grammarAccess.getMathFormulaRule()); 
            pushFollow(FOLLOW_ruleMathFormula_in_entryRuleMathFormula986);
            iv_ruleMathFormula=ruleMathFormula();

            state._fsp--;

             current =iv_ruleMathFormula.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathFormula997); 

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
    // $ANTLR end "entryRuleMathFormula"


    // $ANTLR start "ruleMathFormula"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:390:1: ruleMathFormula returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '(' )? this_Variable_1= ruleVariable (this_MathOperation_2= ruleMathOperation this_Variable_3= ruleVariable )* (kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken ruleMathFormula() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Variable_1 = null;

        AntlrDatatypeRuleToken this_MathOperation_2 = null;

        AntlrDatatypeRuleToken this_Variable_3 = null;


         enterRule(); 
            
        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:393:28: ( ( (kw= '(' )? this_Variable_1= ruleVariable (this_MathOperation_2= ruleMathOperation this_Variable_3= ruleVariable )* (kw= ')' )? ) )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:394:1: ( (kw= '(' )? this_Variable_1= ruleVariable (this_MathOperation_2= ruleMathOperation this_Variable_3= ruleVariable )* (kw= ')' )? )
            {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:394:1: ( (kw= '(' )? this_Variable_1= ruleVariable (this_MathOperation_2= ruleMathOperation this_Variable_3= ruleVariable )* (kw= ')' )? )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:394:2: (kw= '(' )? this_Variable_1= ruleVariable (this_MathOperation_2= ruleMathOperation this_Variable_3= ruleVariable )* (kw= ')' )?
            {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:394:2: (kw= '(' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:395:2: kw= '('
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleMathFormula1036); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMathFormulaAccess().getLeftParenthesisKeyword_0()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getMathFormulaAccess().getVariableParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleVariable_in_ruleMathFormula1060);
            this_Variable_1=ruleVariable();

            state._fsp--;


            		current.merge(this_Variable_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:411:1: (this_MathOperation_2= ruleMathOperation this_Variable_3= ruleVariable )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=15 && LA8_0<=20)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:412:5: this_MathOperation_2= ruleMathOperation this_Variable_3= ruleVariable
            	    {
            	     
            	            newCompositeNode(grammarAccess.getMathFormulaAccess().getMathOperationParserRuleCall_2_0()); 
            	        
            	    pushFollow(FOLLOW_ruleMathOperation_in_ruleMathFormula1088);
            	    this_MathOperation_2=ruleMathOperation();

            	    state._fsp--;


            	    		current.merge(this_MathOperation_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	     
            	            newCompositeNode(grammarAccess.getMathFormulaAccess().getVariableParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruleVariable_in_ruleMathFormula1115);
            	    this_Variable_3=ruleVariable();

            	    state._fsp--;


            	    		current.merge(this_Variable_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:433:3: (kw= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:434:2: kw= ')'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleMathFormula1136); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMathFormulaAccess().getRightParenthesisKeyword_3()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleMathFormula"


    // $ANTLR start "entryRuleCompareFormula"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:447:1: entryRuleCompareFormula returns [String current=null] : iv_ruleCompareFormula= ruleCompareFormula EOF ;
    public final String entryRuleCompareFormula() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompareFormula = null;


        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:448:2: (iv_ruleCompareFormula= ruleCompareFormula EOF )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:449:2: iv_ruleCompareFormula= ruleCompareFormula EOF
            {
             newCompositeNode(grammarAccess.getCompareFormulaRule()); 
            pushFollow(FOLLOW_ruleCompareFormula_in_entryRuleCompareFormula1179);
            iv_ruleCompareFormula=ruleCompareFormula();

            state._fsp--;

             current =iv_ruleCompareFormula.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareFormula1190); 

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
    // $ANTLR end "entryRuleCompareFormula"


    // $ANTLR start "ruleCompareFormula"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:456:1: ruleCompareFormula returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula ) | (this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING ) ) ;
    public final AntlrDatatypeRuleToken ruleCompareFormula() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_5=null;
        AntlrDatatypeRuleToken this_MathFormula_0 = null;

        AntlrDatatypeRuleToken this_CompareOperation_1 = null;

        AntlrDatatypeRuleToken this_MathFormula_2 = null;

        AntlrDatatypeRuleToken this_MathFormula_3 = null;

        AntlrDatatypeRuleToken this_CompareOperation_4 = null;


         enterRule(); 
            
        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:459:28: ( ( (this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula ) | (this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING ) ) )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:460:1: ( (this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula ) | (this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING ) )
            {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:460:1: ( (this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula ) | (this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:460:2: (this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula )
                    {
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:460:2: (this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula )
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:461:5: this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula
                    {
                     
                            newCompositeNode(grammarAccess.getCompareFormulaAccess().getMathFormulaParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleMathFormula_in_ruleCompareFormula1238);
                    this_MathFormula_0=ruleMathFormula();

                    state._fsp--;


                    		current.merge(this_MathFormula_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getCompareFormulaAccess().getCompareOperationParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleCompareOperation_in_ruleCompareFormula1265);
                    this_CompareOperation_1=ruleCompareOperation();

                    state._fsp--;


                    		current.merge(this_CompareOperation_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getCompareFormulaAccess().getMathFormulaParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleMathFormula_in_ruleCompareFormula1292);
                    this_MathFormula_2=ruleMathFormula();

                    state._fsp--;


                    		current.merge(this_MathFormula_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:494:6: (this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING )
                    {
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:494:6: (this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING )
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:495:5: this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING
                    {
                     
                            newCompositeNode(grammarAccess.getCompareFormulaAccess().getMathFormulaParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleMathFormula_in_ruleCompareFormula1327);
                    this_MathFormula_3=ruleMathFormula();

                    state._fsp--;


                    		current.merge(this_MathFormula_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getCompareFormulaAccess().getCompareOperationParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleCompareOperation_in_ruleCompareFormula1354);
                    this_CompareOperation_4=ruleCompareOperation();

                    state._fsp--;


                    		current.merge(this_CompareOperation_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompareFormula1374); 

                    		current.merge(this_STRING_5);
                        
                     
                        newLeafNode(this_STRING_5, grammarAccess.getCompareFormulaAccess().getSTRINGTerminalRuleCall_1_2()); 
                        

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
    // $ANTLR end "ruleCompareFormula"


    // $ANTLR start "entryRuleMyID"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:531:1: entryRuleMyID returns [String current=null] : iv_ruleMyID= ruleMyID EOF ;
    public final String entryRuleMyID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMyID = null;


        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:532:2: (iv_ruleMyID= ruleMyID EOF )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:533:2: iv_ruleMyID= ruleMyID EOF
            {
             newCompositeNode(grammarAccess.getMyIDRule()); 
            pushFollow(FOLLOW_ruleMyID_in_entryRuleMyID1421);
            iv_ruleMyID=ruleMyID();

            state._fsp--;

             current =iv_ruleMyID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMyID1432); 

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
    // $ANTLR end "entryRuleMyID"


    // $ANTLR start "ruleMyID"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:540:1: ruleMyID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_ID_1= RULE_ID | (kw= '!' this_ID_3= RULE_ID ) ) ) ;
    public final AntlrDatatypeRuleToken ruleMyID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:543:28: ( ( (kw= '-' )? (this_ID_1= RULE_ID | (kw= '!' this_ID_3= RULE_ID ) ) ) )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:544:1: ( (kw= '-' )? (this_ID_1= RULE_ID | (kw= '!' this_ID_3= RULE_ID ) ) )
            {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:544:1: ( (kw= '-' )? (this_ID_1= RULE_ID | (kw= '!' this_ID_3= RULE_ID ) ) )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:544:2: (kw= '-' )? (this_ID_1= RULE_ID | (kw= '!' this_ID_3= RULE_ID ) )
            {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:544:2: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:545:2: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleMyID1471); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMyIDAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:550:3: (this_ID_1= RULE_ID | (kw= '!' this_ID_3= RULE_ID ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==28) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:550:8: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMyID1489); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getMyIDAccess().getIDTerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:558:6: (kw= '!' this_ID_3= RULE_ID )
                    {
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:558:6: (kw= '!' this_ID_3= RULE_ID )
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:559:2: kw= '!' this_ID_3= RULE_ID
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleMyID1514); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMyIDAccess().getExclamationMarkKeyword_1_1_0()); 
                        
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMyID1529); 

                    		current.merge(this_ID_3);
                        
                     
                        newLeafNode(this_ID_3, grammarAccess.getMyIDAccess().getIDTerminalRuleCall_1_1_1()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleMyID"


    // $ANTLR start "entryRuleTestcaseElement"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:579:1: entryRuleTestcaseElement returns [String current=null] : iv_ruleTestcaseElement= ruleTestcaseElement EOF ;
    public final String entryRuleTestcaseElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTestcaseElement = null;


        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:580:2: (iv_ruleTestcaseElement= ruleTestcaseElement EOF )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:581:2: iv_ruleTestcaseElement= ruleTestcaseElement EOF
            {
             newCompositeNode(grammarAccess.getTestcaseElementRule()); 
            pushFollow(FOLLOW_ruleTestcaseElement_in_entryRuleTestcaseElement1577);
            iv_ruleTestcaseElement=ruleTestcaseElement();

            state._fsp--;

             current =iv_ruleTestcaseElement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestcaseElement1588); 

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
    // $ANTLR end "entryRuleTestcaseElement"


    // $ANTLR start "ruleTestcaseElement"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:588:1: ruleTestcaseElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CompareFormula_0= ruleCompareFormula | this_MathFormula_1= ruleMathFormula ) ;
    public final AntlrDatatypeRuleToken ruleTestcaseElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CompareFormula_0 = null;

        AntlrDatatypeRuleToken this_MathFormula_1 = null;


         enterRule(); 
            
        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:591:28: ( (this_CompareFormula_0= ruleCompareFormula | this_MathFormula_1= ruleMathFormula ) )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:592:1: (this_CompareFormula_0= ruleCompareFormula | this_MathFormula_1= ruleMathFormula )
            {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:592:1: (this_CompareFormula_0= ruleCompareFormula | this_MathFormula_1= ruleMathFormula )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:593:5: this_CompareFormula_0= ruleCompareFormula
                    {
                     
                            newCompositeNode(grammarAccess.getTestcaseElementAccess().getCompareFormulaParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCompareFormula_in_ruleTestcaseElement1635);
                    this_CompareFormula_0=ruleCompareFormula();

                    state._fsp--;


                    		current.merge(this_CompareFormula_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:605:5: this_MathFormula_1= ruleMathFormula
                    {
                     
                            newCompositeNode(grammarAccess.getTestcaseElementAccess().getMathFormulaParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMathFormula_in_ruleTestcaseElement1668);
                    this_MathFormula_1=ruleMathFormula();

                    state._fsp--;


                    		current.merge(this_MathFormula_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleTestcaseElement"


    // $ANTLR start "entryRuleEnum"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:623:1: entryRuleEnum returns [String current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final String entryRuleEnum() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnum = null;


        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:624:2: (iv_ruleEnum= ruleEnum EOF )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:625:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum1714);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum1725); 

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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:632:1: ruleEnum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'enum' (this_ID_1= RULE_ID | kw= 'Int' | kw= 'Real' | kw= 'Bool' | kw= 'String' ) kw= '{' this_EnumOptions_7= ruleEnumOptions kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleEnum() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_EnumOptions_7 = null;


         enterRule(); 
            
        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:635:28: ( (kw= 'enum' (this_ID_1= RULE_ID | kw= 'Int' | kw= 'Real' | kw= 'Bool' | kw= 'String' ) kw= '{' this_EnumOptions_7= ruleEnumOptions kw= '}' ) )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:636:1: (kw= 'enum' (this_ID_1= RULE_ID | kw= 'Int' | kw= 'Real' | kw= 'Bool' | kw= 'String' ) kw= '{' this_EnumOptions_7= ruleEnumOptions kw= '}' )
            {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:636:1: (kw= 'enum' (this_ID_1= RULE_ID | kw= 'Int' | kw= 'Real' | kw= 'Bool' | kw= 'String' ) kw= '{' this_EnumOptions_7= ruleEnumOptions kw= '}' )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:637:2: kw= 'enum' (this_ID_1= RULE_ID | kw= 'Int' | kw= 'Real' | kw= 'Bool' | kw= 'String' ) kw= '{' this_EnumOptions_7= ruleEnumOptions kw= '}'
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleEnum1763); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnumAccess().getEnumKeyword_0()); 
                
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:642:1: (this_ID_1= RULE_ID | kw= 'Int' | kw= 'Real' | kw= 'Bool' | kw= 'String' )
            int alt14=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
                }
                break;
            case 31:
                {
                alt14=3;
                }
                break;
            case 32:
                {
                alt14=4;
                }
                break;
            case 33:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:642:6: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum1779); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEnumAccess().getIDTerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:651:2: kw= 'Int'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleEnum1803); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEnumAccess().getIntKeyword_1_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:658:2: kw= 'Real'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleEnum1822); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEnumAccess().getRealKeyword_1_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:665:2: kw= 'Bool'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleEnum1841); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEnumAccess().getBoolKeyword_1_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:672:2: kw= 'String'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleEnum1860); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEnumAccess().getStringKeyword_1_4()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,34,FOLLOW_34_in_ruleEnum1874); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getEnumAccess().getEnumOptionsParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleEnumOptions_in_ruleEnum1896);
            this_EnumOptions_7=ruleEnumOptions();

            state._fsp--;


            		current.merge(this_EnumOptions_7);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,35,FOLLOW_35_in_ruleEnum1914); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4()); 
                

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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumOptions"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:708:1: entryRuleEnumOptions returns [String current=null] : iv_ruleEnumOptions= ruleEnumOptions EOF ;
    public final String entryRuleEnumOptions() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumOptions = null;


        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:709:2: (iv_ruleEnumOptions= ruleEnumOptions EOF )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:710:2: iv_ruleEnumOptions= ruleEnumOptions EOF
            {
             newCompositeNode(grammarAccess.getEnumOptionsRule()); 
            pushFollow(FOLLOW_ruleEnumOptions_in_entryRuleEnumOptions1955);
            iv_ruleEnumOptions=ruleEnumOptions();

            state._fsp--;

             current =iv_ruleEnumOptions.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumOptions1966); 

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
    // $ANTLR end "entryRuleEnumOptions"


    // $ANTLR start "ruleEnumOptions"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:717:1: ruleEnumOptions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID )* ;
    public final AntlrDatatypeRuleToken ruleEnumOptions() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:720:28: ( (this_ID_0= RULE_ID )* )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:721:1: (this_ID_0= RULE_ID )*
            {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:721:1: (this_ID_0= RULE_ID )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:721:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumOptions2006); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getEnumOptionsAccess().getIDTerminalRuleCall()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


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
    // $ANTLR end "ruleEnumOptions"


    // $ANTLR start "entryRuleDefine"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:736:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:737:2: (iv_ruleDefine= ruleDefine EOF )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:738:2: iv_ruleDefine= ruleDefine EOF
            {
             newCompositeNode(grammarAccess.getDefineRule()); 
            pushFollow(FOLLOW_ruleDefine_in_entryRuleDefine2052);
            iv_ruleDefine=ruleDefine();

            state._fsp--;

             current =iv_ruleDefine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefine2062); 

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
    // $ANTLR end "entryRuleDefine"


    // $ANTLR start "ruleDefine"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:745:1: ruleDefine returns [EObject current=null] : (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_6= ')' )? ( ruleConditionOperation (otherlv_8= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_11= ')' )? )* otherlv_12= '}' ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;

         enterRule(); 
            
        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:748:28: ( (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_6= ')' )? ( ruleConditionOperation (otherlv_8= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_11= ')' )? )* otherlv_12= '}' ) )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:749:1: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_6= ')' )? ( ruleConditionOperation (otherlv_8= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_11= ')' )? )* otherlv_12= '}' )
            {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:749:1: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_6= ')' )? ( ruleConditionOperation (otherlv_8= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_11= ')' )? )* otherlv_12= '}' )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:749:3: otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_6= ')' )? ( ruleConditionOperation (otherlv_8= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_11= ')' )? )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleDefine2099); 

                	newLeafNode(otherlv_0, grammarAccess.getDefineAccess().getDefineKeyword_0());
                
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:753:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:754:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:754:1: (lv_name_1_0= RULE_ID )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:755:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefine2116); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDefineAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefineRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleDefine2133); 

                	newLeafNode(otherlv_2, grammarAccess.getDefineAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:775:1: (otherlv_3= '(' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:775:3: otherlv_3= '('
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleDefine2146); 

                        	newLeafNode(otherlv_3, grammarAccess.getDefineAccess().getLeftParenthesisKeyword_3());
                        

                    }
                    break;

            }

            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:779:3: ( ruleCompareFormula | ruleMyID )
            int alt17=2;
            switch ( input.LA(1) ) {
            case RULE_DIGIT:
            case RULE_REAL:
            case 26:
                {
                alt17=1;
                }
                break;
            case 16:
                {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 15:
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
                        {
                        alt17=1;
                        }
                        break;
                    case 27:
                        {
                        int LA17_5 = input.LA(4);

                        if ( ((LA17_5>=13 && LA17_5<=14)||LA17_5==35) ) {
                            alt17=2;
                        }
                        else if ( ((LA17_5>=21 && LA17_5<=25)) ) {
                            alt17=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 13:
                    case 14:
                    case 35:
                        {
                        alt17=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 3, input);

                        throw nvae;
                    }

                }
                else if ( (LA17_2==28) ) {
                    int LA17_4 = input.LA(3);

                    if ( (LA17_4==RULE_ID) ) {
                        switch ( input.LA(4) ) {
                        case 15:
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
                            {
                            alt17=1;
                            }
                            break;
                        case 27:
                            {
                            int LA17_5 = input.LA(5);

                            if ( ((LA17_5>=13 && LA17_5<=14)||LA17_5==35) ) {
                                alt17=2;
                            }
                            else if ( ((LA17_5>=21 && LA17_5<=25)) ) {
                                alt17=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 17, 5, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 13:
                        case 14:
                        case 35:
                            {
                            alt17=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 7, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 15:
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
                    {
                    alt17=1;
                    }
                    break;
                case 27:
                    {
                    int LA17_5 = input.LA(3);

                    if ( ((LA17_5>=13 && LA17_5<=14)||LA17_5==35) ) {
                        alt17=2;
                    }
                    else if ( ((LA17_5>=21 && LA17_5<=25)) ) {
                        alt17=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 13:
                case 14:
                case 35:
                    {
                    alt17=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 3, input);

                    throw nvae;
                }

                }
                break;
            case 28:
                {
                int LA17_4 = input.LA(2);

                if ( (LA17_4==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 15:
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
                        {
                        alt17=1;
                        }
                        break;
                    case 27:
                        {
                        int LA17_5 = input.LA(4);

                        if ( ((LA17_5>=13 && LA17_5<=14)||LA17_5==35) ) {
                            alt17=2;
                        }
                        else if ( ((LA17_5>=21 && LA17_5<=25)) ) {
                            alt17=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 13:
                    case 14:
                    case 35:
                        {
                        alt17=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 7, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:780:5: ruleCompareFormula
                    {
                     
                            newCompositeNode(grammarAccess.getDefineAccess().getCompareFormulaParserRuleCall_4_0()); 
                        
                    pushFollow(FOLLOW_ruleCompareFormula_in_ruleDefine2165);
                    ruleCompareFormula();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:789:5: ruleMyID
                    {
                     
                            newCompositeNode(grammarAccess.getDefineAccess().getMyIDParserRuleCall_4_1()); 
                        
                    pushFollow(FOLLOW_ruleMyID_in_ruleDefine2186);
                    ruleMyID();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:796:2: (otherlv_6= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:796:4: otherlv_6= ')'
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleDefine2199); 

                        	newLeafNode(otherlv_6, grammarAccess.getDefineAccess().getRightParenthesisKeyword_5());
                        

                    }
                    break;

            }

            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:800:3: ( ruleConditionOperation (otherlv_8= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_11= ')' )? )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=13 && LA22_0<=14)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:801:5: ruleConditionOperation (otherlv_8= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_11= ')' )?
            	    {
            	     
            	            newCompositeNode(grammarAccess.getDefineAccess().getConditionOperationParserRuleCall_6_0()); 
            	        
            	    pushFollow(FOLLOW_ruleConditionOperation_in_ruleDefine2218);
            	    ruleConditionOperation();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:808:1: (otherlv_8= '(' )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==26) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:808:3: otherlv_8= '('
            	            {
            	            otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleDefine2230); 

            	                	newLeafNode(otherlv_8, grammarAccess.getDefineAccess().getLeftParenthesisKeyword_6_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:812:3: ( ruleCompareFormula | ruleMyID )
            	    int alt20=2;
            	    switch ( input.LA(1) ) {
            	    case RULE_DIGIT:
            	    case RULE_REAL:
            	    case 26:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 16:
            	        {
            	        int LA20_2 = input.LA(2);

            	        if ( (LA20_2==RULE_ID) ) {
            	            switch ( input.LA(3) ) {
            	            case 15:
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
            	                {
            	                alt20=1;
            	                }
            	                break;
            	            case 27:
            	                {
            	                int LA20_5 = input.LA(4);

            	                if ( ((LA20_5>=13 && LA20_5<=14)||LA20_5==35) ) {
            	                    alt20=2;
            	                }
            	                else if ( ((LA20_5>=21 && LA20_5<=25)) ) {
            	                    alt20=1;
            	                }
            	                else {
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 20, 5, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 13:
            	            case 14:
            	            case 35:
            	                {
            	                alt20=2;
            	                }
            	                break;
            	            default:
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 20, 3, input);

            	                throw nvae;
            	            }

            	        }
            	        else if ( (LA20_2==28) ) {
            	            int LA20_4 = input.LA(3);

            	            if ( (LA20_4==RULE_ID) ) {
            	                switch ( input.LA(4) ) {
            	                case 15:
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
            	                    {
            	                    alt20=1;
            	                    }
            	                    break;
            	                case 27:
            	                    {
            	                    int LA20_5 = input.LA(5);

            	                    if ( ((LA20_5>=13 && LA20_5<=14)||LA20_5==35) ) {
            	                        alt20=2;
            	                    }
            	                    else if ( ((LA20_5>=21 && LA20_5<=25)) ) {
            	                        alt20=1;
            	                    }
            	                    else {
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("", 20, 5, input);

            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 13:
            	                case 14:
            	                case 35:
            	                    {
            	                    alt20=2;
            	                    }
            	                    break;
            	                default:
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 20, 7, input);

            	                    throw nvae;
            	                }

            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 20, 4, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 20, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case RULE_ID:
            	        {
            	        switch ( input.LA(2) ) {
            	        case 15:
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
            	            {
            	            alt20=1;
            	            }
            	            break;
            	        case 27:
            	            {
            	            int LA20_5 = input.LA(3);

            	            if ( ((LA20_5>=13 && LA20_5<=14)||LA20_5==35) ) {
            	                alt20=2;
            	            }
            	            else if ( ((LA20_5>=21 && LA20_5<=25)) ) {
            	                alt20=1;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 20, 5, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case 13:
            	        case 14:
            	        case 35:
            	            {
            	            alt20=2;
            	            }
            	            break;
            	        default:
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 20, 3, input);

            	            throw nvae;
            	        }

            	        }
            	        break;
            	    case 28:
            	        {
            	        int LA20_4 = input.LA(2);

            	        if ( (LA20_4==RULE_ID) ) {
            	            switch ( input.LA(3) ) {
            	            case 15:
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
            	                {
            	                alt20=1;
            	                }
            	                break;
            	            case 27:
            	                {
            	                int LA20_5 = input.LA(4);

            	                if ( ((LA20_5>=13 && LA20_5<=14)||LA20_5==35) ) {
            	                    alt20=2;
            	                }
            	                else if ( ((LA20_5>=21 && LA20_5<=25)) ) {
            	                    alt20=1;
            	                }
            	                else {
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 20, 5, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 13:
            	            case 14:
            	            case 35:
            	                {
            	                alt20=2;
            	                }
            	                break;
            	            default:
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 20, 7, input);

            	                throw nvae;
            	            }

            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 20, 4, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:813:5: ruleCompareFormula
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getDefineAccess().getCompareFormulaParserRuleCall_6_2_0()); 
            	                
            	            pushFollow(FOLLOW_ruleCompareFormula_in_ruleDefine2249);
            	            ruleCompareFormula();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:822:5: ruleMyID
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getDefineAccess().getMyIDParserRuleCall_6_2_1()); 
            	                
            	            pushFollow(FOLLOW_ruleMyID_in_ruleDefine2270);
            	            ruleMyID();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }

            	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:829:2: (otherlv_11= ')' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==27) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:829:4: otherlv_11= ')'
            	            {
            	            otherlv_11=(Token)match(input,27,FOLLOW_27_in_ruleDefine2283); 

            	                	newLeafNode(otherlv_11, grammarAccess.getDefineAccess().getRightParenthesisKeyword_6_3());
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_12=(Token)match(input,35,FOLLOW_35_in_ruleDefine2299); 

                	newLeafNode(otherlv_12, grammarAccess.getDefineAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleDefine"


    // $ANTLR start "entryRulePrecondition"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:845:1: entryRulePrecondition returns [String current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final String entryRulePrecondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrecondition = null;


        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:846:2: (iv_rulePrecondition= rulePrecondition EOF )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:847:2: iv_rulePrecondition= rulePrecondition EOF
            {
             newCompositeNode(grammarAccess.getPreconditionRule()); 
            pushFollow(FOLLOW_rulePrecondition_in_entryRulePrecondition2336);
            iv_rulePrecondition=rulePrecondition();

            state._fsp--;

             current =iv_rulePrecondition.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrecondition2347); 

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
    // $ANTLR end "entryRulePrecondition"


    // $ANTLR start "rulePrecondition"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:854:1: rulePrecondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'precondition' kw= '{' this_CompareFormula_2= ruleCompareFormula (this_ConditionOperation_3= ruleConditionOperation this_CompareFormula_4= ruleCompareFormula )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken rulePrecondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CompareFormula_2 = null;

        AntlrDatatypeRuleToken this_ConditionOperation_3 = null;

        AntlrDatatypeRuleToken this_CompareFormula_4 = null;


         enterRule(); 
            
        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:857:28: ( (kw= 'precondition' kw= '{' this_CompareFormula_2= ruleCompareFormula (this_ConditionOperation_3= ruleConditionOperation this_CompareFormula_4= ruleCompareFormula )* kw= '}' ) )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:858:1: (kw= 'precondition' kw= '{' this_CompareFormula_2= ruleCompareFormula (this_ConditionOperation_3= ruleConditionOperation this_CompareFormula_4= ruleCompareFormula )* kw= '}' )
            {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:858:1: (kw= 'precondition' kw= '{' this_CompareFormula_2= ruleCompareFormula (this_ConditionOperation_3= ruleConditionOperation this_CompareFormula_4= ruleCompareFormula )* kw= '}' )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:859:2: kw= 'precondition' kw= '{' this_CompareFormula_2= ruleCompareFormula (this_ConditionOperation_3= ruleConditionOperation this_CompareFormula_4= ruleCompareFormula )* kw= '}'
            {
            kw=(Token)match(input,37,FOLLOW_37_in_rulePrecondition2385); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPreconditionAccess().getPreconditionKeyword_0()); 
                
            kw=(Token)match(input,34,FOLLOW_34_in_rulePrecondition2398); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPreconditionAccess().getLeftCurlyBracketKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getPreconditionAccess().getCompareFormulaParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleCompareFormula_in_rulePrecondition2420);
            this_CompareFormula_2=ruleCompareFormula();

            state._fsp--;


            		current.merge(this_CompareFormula_2);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:881:1: (this_ConditionOperation_3= ruleConditionOperation this_CompareFormula_4= ruleCompareFormula )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=13 && LA23_0<=14)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:882:5: this_ConditionOperation_3= ruleConditionOperation this_CompareFormula_4= ruleCompareFormula
            	    {
            	     
            	            newCompositeNode(grammarAccess.getPreconditionAccess().getConditionOperationParserRuleCall_3_0()); 
            	        
            	    pushFollow(FOLLOW_ruleConditionOperation_in_rulePrecondition2448);
            	    this_ConditionOperation_3=ruleConditionOperation();

            	    state._fsp--;


            	    		current.merge(this_ConditionOperation_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	     
            	            newCompositeNode(grammarAccess.getPreconditionAccess().getCompareFormulaParserRuleCall_3_1()); 
            	        
            	    pushFollow(FOLLOW_ruleCompareFormula_in_rulePrecondition2475);
            	    this_CompareFormula_4=ruleCompareFormula();

            	    state._fsp--;


            	    		current.merge(this_CompareFormula_4);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            kw=(Token)match(input,35,FOLLOW_35_in_rulePrecondition2495); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPreconditionAccess().getRightCurlyBracketKeyword_4()); 
                

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
    // $ANTLR end "rulePrecondition"


    // $ANTLR start "entryRuleTestCondition"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:917:1: entryRuleTestCondition returns [String current=null] : iv_ruleTestCondition= ruleTestCondition EOF ;
    public final String entryRuleTestCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTestCondition = null;


        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:918:2: (iv_ruleTestCondition= ruleTestCondition EOF )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:919:2: iv_ruleTestCondition= ruleTestCondition EOF
            {
             newCompositeNode(grammarAccess.getTestConditionRule()); 
            pushFollow(FOLLOW_ruleTestCondition_in_entryRuleTestCondition2536);
            iv_ruleTestCondition=ruleTestCondition();

            state._fsp--;

             current =iv_ruleTestCondition.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestCondition2547); 

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
    // $ANTLR end "entryRuleTestCondition"


    // $ANTLR start "ruleTestCondition"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:926:1: ruleTestCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING ( (kw= '(' )? this_TestcaseElement_2= ruleTestcaseElement (kw= ')' )? (kw= '(' )? (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )* (kw= ')' )? )? ) ;
    public final AntlrDatatypeRuleToken ruleTestCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_TestcaseElement_2 = null;

        AntlrDatatypeRuleToken this_ConditionOperation_5 = null;

        AntlrDatatypeRuleToken this_TestcaseElement_7 = null;


         enterRule(); 
            
        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:929:28: ( (this_STRING_0= RULE_STRING ( (kw= '(' )? this_TestcaseElement_2= ruleTestcaseElement (kw= ')' )? (kw= '(' )? (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )* (kw= ')' )? )? ) )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:930:1: (this_STRING_0= RULE_STRING ( (kw= '(' )? this_TestcaseElement_2= ruleTestcaseElement (kw= ')' )? (kw= '(' )? (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )* (kw= ')' )? )? )
            {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:930:1: (this_STRING_0= RULE_STRING ( (kw= '(' )? this_TestcaseElement_2= ruleTestcaseElement (kw= ')' )? (kw= '(' )? (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )* (kw= ')' )? )? )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:930:6: this_STRING_0= RULE_STRING ( (kw= '(' )? this_TestcaseElement_2= ruleTestcaseElement (kw= ')' )? (kw= '(' )? (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )* (kw= ')' )? )?
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTestCondition2587); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getTestConditionAccess().getSTRINGTerminalRuleCall_0()); 
                
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:937:1: ( (kw= '(' )? this_TestcaseElement_2= ruleTestcaseElement (kw= ')' )? (kw= '(' )? (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )* (kw= ')' )? )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_DIGIT && LA31_0<=RULE_REAL)||LA31_0==RULE_ID||LA31_0==16||LA31_0==26||LA31_0==28) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:937:2: (kw= '(' )? this_TestcaseElement_2= ruleTestcaseElement (kw= ')' )? (kw= '(' )? (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )* (kw= ')' )?
                    {
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:937:2: (kw= '(' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==26) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:938:2: kw= '('
                            {
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleTestCondition2607); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTestConditionAccess().getLeftParenthesisKeyword_1_0()); 
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getTestConditionAccess().getTestcaseElementParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleTestcaseElement_in_ruleTestCondition2631);
                    this_TestcaseElement_2=ruleTestcaseElement();

                    state._fsp--;


                    		current.merge(this_TestcaseElement_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:954:1: (kw= ')' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==27) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:955:2: kw= ')'
                            {
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleTestCondition2650); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTestConditionAccess().getRightParenthesisKeyword_1_2()); 
                                

                            }
                            break;

                    }

                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:960:3: (kw= '(' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==26) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:961:2: kw= '('
                            {
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleTestCondition2666); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTestConditionAccess().getLeftParenthesisKeyword_1_3()); 
                                

                            }
                            break;

                    }

                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:966:3: (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0>=13 && LA29_0<=14)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:967:5: this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )?
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getTestConditionAccess().getConditionOperationParserRuleCall_1_4_0()); 
                    	        
                    	    pushFollow(FOLLOW_ruleConditionOperation_in_ruleTestCondition2691);
                    	    this_ConditionOperation_5=ruleConditionOperation();

                    	    state._fsp--;


                    	    		current.merge(this_ConditionOperation_5);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        
                    	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:977:1: (kw= '(' )?
                    	    int alt27=2;
                    	    int LA27_0 = input.LA(1);

                    	    if ( (LA27_0==26) ) {
                    	        alt27=1;
                    	    }
                    	    switch (alt27) {
                    	        case 1 :
                    	            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:978:2: kw= '('
                    	            {
                    	            kw=(Token)match(input,26,FOLLOW_26_in_ruleTestCondition2710); 

                    	                    current.merge(kw);
                    	                    newLeafNode(kw, grammarAccess.getTestConditionAccess().getLeftParenthesisKeyword_1_4_1()); 
                    	                

                    	            }
                    	            break;

                    	    }

                    	     
                    	            newCompositeNode(grammarAccess.getTestConditionAccess().getTestcaseElementParserRuleCall_1_4_2()); 
                    	        
                    	    pushFollow(FOLLOW_ruleTestcaseElement_in_ruleTestCondition2734);
                    	    this_TestcaseElement_7=ruleTestcaseElement();

                    	    state._fsp--;


                    	    		current.merge(this_TestcaseElement_7);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        
                    	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:994:1: (kw= ')' )?
                    	    int alt28=2;
                    	    int LA28_0 = input.LA(1);

                    	    if ( (LA28_0==27) ) {
                    	        alt28=1;
                    	    }
                    	    switch (alt28) {
                    	        case 1 :
                    	            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:995:2: kw= ')'
                    	            {
                    	            kw=(Token)match(input,27,FOLLOW_27_in_ruleTestCondition2753); 

                    	                    current.merge(kw);
                    	                    newLeafNode(kw, grammarAccess.getTestConditionAccess().getRightParenthesisKeyword_1_4_3()); 
                    	                

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1000:5: (kw= ')' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==27) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1001:2: kw= ')'
                            {
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleTestCondition2771); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTestConditionAccess().getRightParenthesisKeyword_1_5()); 
                                

                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleTestCondition"


    // $ANTLR start "entryRuleTestcase"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1014:1: entryRuleTestcase returns [String current=null] : iv_ruleTestcase= ruleTestcase EOF ;
    public final String entryRuleTestcase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTestcase = null;


        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1015:2: (iv_ruleTestcase= ruleTestcase EOF )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1016:2: iv_ruleTestcase= ruleTestcase EOF
            {
             newCompositeNode(grammarAccess.getTestcaseRule()); 
            pushFollow(FOLLOW_ruleTestcase_in_entryRuleTestcase2816);
            iv_ruleTestcase=ruleTestcase();

            state._fsp--;

             current =iv_ruleTestcase.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestcase2827); 

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
    // $ANTLR end "entryRuleTestcase"


    // $ANTLR start "ruleTestcase"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1023:1: ruleTestcase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'testcase' kw= '{' (this_TestCondition_2= ruleTestCondition )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleTestcase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TestCondition_2 = null;


         enterRule(); 
            
        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1026:28: ( (kw= 'testcase' kw= '{' (this_TestCondition_2= ruleTestCondition )* kw= '}' ) )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1027:1: (kw= 'testcase' kw= '{' (this_TestCondition_2= ruleTestCondition )* kw= '}' )
            {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1027:1: (kw= 'testcase' kw= '{' (this_TestCondition_2= ruleTestCondition )* kw= '}' )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1028:2: kw= 'testcase' kw= '{' (this_TestCondition_2= ruleTestCondition )* kw= '}'
            {
            kw=(Token)match(input,38,FOLLOW_38_in_ruleTestcase2865); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTestcaseAccess().getTestcaseKeyword_0()); 
                
            kw=(Token)match(input,34,FOLLOW_34_in_ruleTestcase2878); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTestcaseAccess().getLeftCurlyBracketKeyword_1()); 
                
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1039:1: (this_TestCondition_2= ruleTestCondition )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_STRING) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1040:5: this_TestCondition_2= ruleTestCondition
            	    {
            	     
            	            newCompositeNode(grammarAccess.getTestcaseAccess().getTestConditionParserRuleCall_2()); 
            	        
            	    pushFollow(FOLLOW_ruleTestCondition_in_ruleTestcase2901);
            	    this_TestCondition_2=ruleTestCondition();

            	    state._fsp--;


            	    		current.merge(this_TestCondition_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            kw=(Token)match(input,35,FOLLOW_35_in_ruleTestcase2921); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTestcaseAccess().getRightCurlyBracketKeyword_3()); 
                

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
    // $ANTLR end "ruleTestcase"


    // $ANTLR start "entryRuleDatatype"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1064:1: entryRuleDatatype returns [String current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final String entryRuleDatatype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDatatype = null;


        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1065:2: (iv_ruleDatatype= ruleDatatype EOF )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1066:2: iv_ruleDatatype= ruleDatatype EOF
            {
             newCompositeNode(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype2962);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;

             current =iv_ruleDatatype.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype2973); 

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
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1073:1: ruleDatatype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Int' | kw= 'Real' | kw= 'Bool' | kw= 'String' ) ;
    public final AntlrDatatypeRuleToken ruleDatatype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1076:28: ( (kw= 'Int' | kw= 'Real' | kw= 'Bool' | kw= 'String' ) )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1077:1: (kw= 'Int' | kw= 'Real' | kw= 'Bool' | kw= 'String' )
            {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1077:1: (kw= 'Int' | kw= 'Real' | kw= 'Bool' | kw= 'String' )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt33=1;
                }
                break;
            case 31:
                {
                alt33=2;
                }
                break;
            case 32:
                {
                alt33=3;
                }
                break;
            case 33:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1078:2: kw= 'Int'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleDatatype3011); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDatatypeAccess().getIntKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1085:2: kw= 'Real'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleDatatype3030); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDatatypeAccess().getRealKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1092:2: kw= 'Bool'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleDatatype3049); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDatatypeAccess().getBoolKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1099:2: kw= 'String'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleDatatype3068); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDatatypeAccess().getStringKeyword_3()); 
                        

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
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleFunction"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1112:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1113:2: (iv_ruleFunction= ruleFunction EOF )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1114:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction3108);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction3118); 

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1121:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ruleDatatype ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )* )* otherlv_8= ')' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1124:28: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ruleDatatype ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )* )* otherlv_8= ')' ) )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1125:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ruleDatatype ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )* )* otherlv_8= ')' )
            {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1125:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ruleDatatype ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )* )* otherlv_8= ')' )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1125:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ruleDatatype ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )* )* otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleFunction3155); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
                
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1129:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1130:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1130:1: (lv_name_1_0= RULE_ID )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1131:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction3172); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleFunction3189); 

                	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
                
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1151:1: ( ruleDatatype ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )* )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=30 && LA35_0<=33)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1152:5: ruleDatatype ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )*
            	    {
            	     
            	            newCompositeNode(grammarAccess.getFunctionAccess().getDatatypeParserRuleCall_3_0()); 
            	        
            	    pushFollow(FOLLOW_ruleDatatype_in_ruleFunction3206);
            	    ruleDatatype();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1159:1: ( (lv_name_4_0= RULE_ID ) )
            	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1160:1: (lv_name_4_0= RULE_ID )
            	    {
            	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1160:1: (lv_name_4_0= RULE_ID )
            	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1161:3: lv_name_4_0= RULE_ID
            	    {
            	    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction3222); 

            	    			newLeafNode(lv_name_4_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFunctionRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_4_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1177:2: (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )*
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==40) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1177:4: otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleFunction3240); 

            	    	        	newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getCommaKeyword_3_2_0());
            	    	        
            	    	     
            	    	            newCompositeNode(grammarAccess.getFunctionAccess().getDatatypeParserRuleCall_3_2_1()); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleDatatype_in_ruleFunction3256);
            	    	    ruleDatatype();

            	    	    state._fsp--;

            	    	     
            	    	            afterParserOrEnumRuleCall();
            	    	        
            	    	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1189:1: ( (lv_name_7_0= RULE_ID ) )
            	    	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1190:1: (lv_name_7_0= RULE_ID )
            	    	    {
            	    	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1190:1: (lv_name_7_0= RULE_ID )
            	    	    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1191:3: lv_name_7_0= RULE_ID
            	    	    {
            	    	    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction3272); 

            	    	    			newLeafNode(lv_name_7_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_3_2_2_0()); 
            	    	    		

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getFunctionRule());
            	    	    	        }
            	    	           		setWithLastConsumed(
            	    	           			current, 
            	    	           			"name",
            	    	            		lv_name_7_0, 
            	    	            		"ID");
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop34;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleFunction3293); 

                	newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleRun"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1219:1: entryRuleRun returns [String current=null] : iv_ruleRun= ruleRun EOF ;
    public final String entryRuleRun() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRun = null;


        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1220:2: (iv_ruleRun= ruleRun EOF )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1221:2: iv_ruleRun= ruleRun EOF
            {
             newCompositeNode(grammarAccess.getRunRule()); 
            pushFollow(FOLLOW_ruleRun_in_entryRuleRun3330);
            iv_ruleRun=ruleRun();

            state._fsp--;

             current =iv_ruleRun.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRun3341); 

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
    // $ANTLR end "entryRuleRun"


    // $ANTLR start "ruleRun"
    // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1228:1: ruleRun returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'run' ;
    public final AntlrDatatypeRuleToken ruleRun() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1231:28: (kw= 'run' )
            // ../com.capstone.dsl/src-gen/org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1233:2: kw= 'run'
            {
            kw=(Token)match(input,41,FOLLOW_41_in_ruleRun3378); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRunAccess().getRunKeyword()); 
                

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
    // $ANTLR end "ruleRun"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA10_eotS =
        "\34\uffff";
    static final String DFA10_eofS =
        "\34\uffff";
    static final String DFA10_minS =
        "\2\4\1\7\1\17\1\7\2\17\6\4\1\25\5\4\1\17\1\7\1\17\1\7\2\17\2\uffff"+
        "\1\17";
    static final String DFA10_maxS =
        "\3\34\1\33\1\7\2\33\6\34\1\31\5\34\1\33\1\34\1\33\1\7\2\33\2\uffff"+
        "\1\33";
    static final String DFA10_acceptS =
        "\31\uffff\1\2\1\1\1\uffff";
    static final String DFA10_specialS =
        "\34\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\5\1\6\1\uffff\1\3\10\uffff\1\2\11\uffff\1\1\1\uffff\1\4",
            "\1\5\1\6\1\uffff\1\3\10\uffff\1\2\13\uffff\1\4",
            "\1\3\24\uffff\1\4",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff"+
            "\1\15",
            "\1\23",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff"+
            "\1\15",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff"+
            "\1\15",
            "\1\27\1\30\1\uffff\1\25\10\uffff\1\24\13\uffff\1\26",
            "\1\27\1\30\1\uffff\1\25\10\uffff\1\24\13\uffff\1\26",
            "\1\27\1\30\1\uffff\1\25\10\uffff\1\24\13\uffff\1\26",
            "\1\27\1\30\1\uffff\1\25\10\uffff\1\24\13\uffff\1\26",
            "\1\27\1\30\1\uffff\1\25\10\uffff\1\24\13\uffff\1\26",
            "\1\27\1\30\1\uffff\1\25\10\uffff\1\24\13\uffff\1\26",
            "\1\16\1\17\1\20\1\21\1\22",
            "\2\32\1\31\1\32\10\uffff\1\32\11\uffff\1\32\1\uffff\1\32",
            "\2\32\1\31\1\32\10\uffff\1\32\11\uffff\1\32\1\uffff\1\32",
            "\2\32\1\31\1\32\10\uffff\1\32\11\uffff\1\32\1\uffff\1\32",
            "\2\32\1\31\1\32\10\uffff\1\32\11\uffff\1\32\1\uffff\1\32",
            "\2\32\1\31\1\32\10\uffff\1\32\11\uffff\1\32\1\uffff\1\32",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff"+
            "\1\15",
            "\1\25\24\uffff\1\26",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff"+
            "\1\15",
            "\1\33",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff"+
            "\1\15",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff"+
            "\1\15",
            "",
            "",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff"+
            "\1\15"
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
            return "460:1: ( (this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula ) | (this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING ) )";
        }
    }
    static final String DFA13_eotS =
        "\27\uffff";
    static final String DFA13_eofS =
        "\3\uffff\1\17\1\uffff\2\17\6\uffff\1\17\2\uffff\1\17\1\uffff\1"+
        "\17\1\uffff\3\17";
    static final String DFA13_minS =
        "\2\4\1\7\1\6\1\7\2\6\6\4\1\6\2\uffff\1\6\1\7\1\6\1\7\3\6";
    static final String DFA13_maxS =
        "\3\34\1\43\1\7\2\43\6\34\1\43\2\uffff\1\43\1\34\1\43\1\7\3\43";
    static final String DFA13_acceptS =
        "\16\uffff\1\1\1\2\7\uffff";
    static final String DFA13_specialS =
        "\27\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\5\1\6\1\uffff\1\3\10\uffff\1\2\11\uffff\1\1\1\uffff\1\4",
            "\1\5\1\6\1\uffff\1\3\10\uffff\1\2\13\uffff\1\4",
            "\1\3\24\uffff\1\4",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\1\17"+
            "\1\15\7\uffff\1\17",
            "\1\20",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\1\17"+
            "\1\15\7\uffff\1\17",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\1\17"+
            "\1\15\7\uffff\1\17",
            "\1\24\1\25\1\uffff\1\22\10\uffff\1\21\13\uffff\1\23",
            "\1\24\1\25\1\uffff\1\22\10\uffff\1\21\13\uffff\1\23",
            "\1\24\1\25\1\uffff\1\22\10\uffff\1\21\13\uffff\1\23",
            "\1\24\1\25\1\uffff\1\22\10\uffff\1\21\13\uffff\1\23",
            "\1\24\1\25\1\uffff\1\22\10\uffff\1\21\13\uffff\1\23",
            "\1\24\1\25\1\uffff\1\22\10\uffff\1\21\13\uffff\1\23",
            "\1\17\6\uffff\2\17\6\uffff\5\16\2\17\7\uffff\1\17",
            "",
            "",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\1\17"+
            "\1\15\7\uffff\1\17",
            "\1\22\24\uffff\1\23",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\1\17"+
            "\1\15\7\uffff\1\17",
            "\1\26",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\1\17"+
            "\1\15\7\uffff\1\17",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\1\17"+
            "\1\15\7\uffff\1\17",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\1\17"+
            "\1\15\7\uffff\1\17"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "592:1: (this_CompareFormula_0= ruleCompareFormula | this_MathFormula_1= ruleMathFormula )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemyDSL_in_ruleModel130 = new BitSet(new long[]{0x000002F020000002L});
    public static final BitSet FOLLOW_rulemyDSL_in_entryRulemyDSL166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemyDSL176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rulemyDSL217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefine_in_rulemyDSL244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecondition_in_rulemyDSL265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestcase_in_rulemyDSL286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rulemyDSL313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRun_in_rulemyDSL334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionOperation_in_entryRuleConditionOperation370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionOperation381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleConditionOperation419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleConditionOperation438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathOperation_in_entryRuleMathOperation479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathOperation490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleMathOperation528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleMathOperation547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleMathOperation566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleMathOperation585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleMathOperation604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleMathOperation623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCompareOperation713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleCompareOperation732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCompareOperation751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCompareOperation770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCompareOperation789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyID_in_ruleVariable888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_ruleVariable914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleVariable940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathFormula_in_entryRuleMathFormula986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathFormula997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMathFormula1036 = new BitSet(new long[]{0x00000000100100B0L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleMathFormula1060 = new BitSet(new long[]{0x00000000081F8002L});
    public static final BitSet FOLLOW_ruleMathOperation_in_ruleMathFormula1088 = new BitSet(new long[]{0x00000000100100B0L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleMathFormula1115 = new BitSet(new long[]{0x00000000081F8002L});
    public static final BitSet FOLLOW_27_in_ruleMathFormula1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareFormula_in_entryRuleCompareFormula1179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareFormula1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathFormula_in_ruleCompareFormula1238 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleCompareFormula1265 = new BitSet(new long[]{0x00000000140100B0L});
    public static final BitSet FOLLOW_ruleMathFormula_in_ruleCompareFormula1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathFormula_in_ruleCompareFormula1327 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleCompareFormula1354 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompareFormula1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyID_in_entryRuleMyID1421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMyID1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleMyID1471 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMyID1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleMyID1514 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMyID1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestcaseElement_in_entryRuleTestcaseElement1577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestcaseElement1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareFormula_in_ruleTestcaseElement1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathFormula_in_ruleTestcaseElement1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum1714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleEnum1763 = new BitSet(new long[]{0x00000003C0000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum1779 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30_in_ruleEnum1803 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31_in_ruleEnum1822 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32_in_ruleEnum1841 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_ruleEnum1860 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleEnum1874 = new BitSet(new long[]{0x0000000800000080L});
    public static final BitSet FOLLOW_ruleEnumOptions_in_ruleEnum1896 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleEnum1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumOptions_in_entryRuleEnumOptions1955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumOptions1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumOptions2006 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleDefine_in_entryRuleDefine2052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefine2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDefine2099 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefine2116 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleDefine2133 = new BitSet(new long[]{0x00000000140100B0L});
    public static final BitSet FOLLOW_26_in_ruleDefine2146 = new BitSet(new long[]{0x00000000140100B0L});
    public static final BitSet FOLLOW_ruleCompareFormula_in_ruleDefine2165 = new BitSet(new long[]{0x0000000808006000L});
    public static final BitSet FOLLOW_ruleMyID_in_ruleDefine2186 = new BitSet(new long[]{0x0000000808006000L});
    public static final BitSet FOLLOW_27_in_ruleDefine2199 = new BitSet(new long[]{0x0000000800006000L});
    public static final BitSet FOLLOW_ruleConditionOperation_in_ruleDefine2218 = new BitSet(new long[]{0x00000000140100B0L});
    public static final BitSet FOLLOW_26_in_ruleDefine2230 = new BitSet(new long[]{0x00000000140100B0L});
    public static final BitSet FOLLOW_ruleCompareFormula_in_ruleDefine2249 = new BitSet(new long[]{0x0000000808006000L});
    public static final BitSet FOLLOW_ruleMyID_in_ruleDefine2270 = new BitSet(new long[]{0x0000000808006000L});
    public static final BitSet FOLLOW_27_in_ruleDefine2283 = new BitSet(new long[]{0x0000000800006000L});
    public static final BitSet FOLLOW_35_in_ruleDefine2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecondition_in_entryRulePrecondition2336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrecondition2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePrecondition2385 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePrecondition2398 = new BitSet(new long[]{0x00000000140100B0L});
    public static final BitSet FOLLOW_ruleCompareFormula_in_rulePrecondition2420 = new BitSet(new long[]{0x0000000800006000L});
    public static final BitSet FOLLOW_ruleConditionOperation_in_rulePrecondition2448 = new BitSet(new long[]{0x00000000140100B0L});
    public static final BitSet FOLLOW_ruleCompareFormula_in_rulePrecondition2475 = new BitSet(new long[]{0x0000000800006000L});
    public static final BitSet FOLLOW_35_in_rulePrecondition2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestCondition_in_entryRuleTestCondition2536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestCondition2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTestCondition2587 = new BitSet(new long[]{0x00000000140100B2L});
    public static final BitSet FOLLOW_26_in_ruleTestCondition2607 = new BitSet(new long[]{0x00000000140100B0L});
    public static final BitSet FOLLOW_ruleTestcaseElement_in_ruleTestCondition2631 = new BitSet(new long[]{0x000000000C006002L});
    public static final BitSet FOLLOW_27_in_ruleTestCondition2650 = new BitSet(new long[]{0x000000000C006002L});
    public static final BitSet FOLLOW_26_in_ruleTestCondition2666 = new BitSet(new long[]{0x0000000008006002L});
    public static final BitSet FOLLOW_ruleConditionOperation_in_ruleTestCondition2691 = new BitSet(new long[]{0x00000000140100B0L});
    public static final BitSet FOLLOW_26_in_ruleTestCondition2710 = new BitSet(new long[]{0x00000000140100B0L});
    public static final BitSet FOLLOW_ruleTestcaseElement_in_ruleTestCondition2734 = new BitSet(new long[]{0x0000000008006002L});
    public static final BitSet FOLLOW_27_in_ruleTestCondition2753 = new BitSet(new long[]{0x0000000008006002L});
    public static final BitSet FOLLOW_27_in_ruleTestCondition2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestcase_in_entryRuleTestcase2816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestcase2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTestcase2865 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleTestcase2878 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_ruleTestCondition_in_ruleTestcase2901 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_35_in_ruleTestcase2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype2962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDatatype3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDatatype3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDatatype3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDatatype3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction3108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleFunction3155 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction3172 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFunction3189 = new BitSet(new long[]{0x00000003C8000000L});
    public static final BitSet FOLLOW_ruleDatatype_in_ruleFunction3206 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction3222 = new BitSet(new long[]{0x00000103C8000000L});
    public static final BitSet FOLLOW_40_in_ruleFunction3240 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_ruleDatatype_in_ruleFunction3256 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction3272 = new BitSet(new long[]{0x00000103C8000000L});
    public static final BitSet FOLLOW_27_in_ruleFunction3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRun_in_entryRuleRun3330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRun3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleRun3378 = new BitSet(new long[]{0x0000000000000002L});

}