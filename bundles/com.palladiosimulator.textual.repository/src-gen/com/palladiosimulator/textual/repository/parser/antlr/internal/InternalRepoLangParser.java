package com.palladiosimulator.textual.repository.parser.antlr.internal;

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
import com.palladiosimulator.textual.repository.services.RepoLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRepoLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Repository'", "'import'", "'.*'", "'Types'", "'{'", "'}'", "'.'", "'Interface'", "'('", "','", "')'", "':'", "'struct'", "'extends'", "'collection'", "'of'", "'Component'", "'provides'", "'requires'", "'as'", "'SEFF'", "'on'", "'IA'", "'ACQ'", "'REL'", "'LOOP'", "'RET'", "'SET'", "'EXT'", "'->'", "'RETURN:'", "':='", "'PBR'", "'GBR'", "'PAR'", "'SYNC'", "'|'", "'PassiveResource'", "'STRUCTURE'", "'NUMBER_OF_ELEMENTS'", "'VALUE'", "'BYTESIZE'", "'TYPE'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRepoLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRepoLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRepoLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRepoLang.g"; }



     	private RepoLangGrammarAccess grammarAccess;

        public InternalRepoLangParser(TokenStream input, RepoLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Repository";
       	}

       	@Override
       	protected RepoLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRepository"
    // InternalRepoLang.g:65:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalRepoLang.g:65:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalRepoLang.g:66:2: iv_ruleRepository= ruleRepository EOF
            {
             newCompositeNode(grammarAccess.getRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepository=ruleRepository();

            state._fsp--;

             current =iv_ruleRepository; 
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
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // InternalRepoLang.g:72:1: ruleRepository returns [EObject current=null] : (otherlv_0= 'Repository' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImportedRepository ) )* ( (lv_types_3_0= ruleTypeRepo ) )? ( (lv_elements_4_0= ruleNamedElement ) )* ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_imports_2_0 = null;

        EObject lv_types_3_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:78:2: ( (otherlv_0= 'Repository' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImportedRepository ) )* ( (lv_types_3_0= ruleTypeRepo ) )? ( (lv_elements_4_0= ruleNamedElement ) )* ) )
            // InternalRepoLang.g:79:2: (otherlv_0= 'Repository' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImportedRepository ) )* ( (lv_types_3_0= ruleTypeRepo ) )? ( (lv_elements_4_0= ruleNamedElement ) )* )
            {
            // InternalRepoLang.g:79:2: (otherlv_0= 'Repository' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImportedRepository ) )* ( (lv_types_3_0= ruleTypeRepo ) )? ( (lv_elements_4_0= ruleNamedElement ) )* )
            // InternalRepoLang.g:80:3: otherlv_0= 'Repository' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImportedRepository ) )* ( (lv_types_3_0= ruleTypeRepo ) )? ( (lv_elements_4_0= ruleNamedElement ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRepositoryAccess().getRepositoryKeyword_0());
            		
            // InternalRepoLang.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRepoLang.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRepoLang.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalRepoLang.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRepositoryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepositoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRepoLang.g:102:3: ( (lv_imports_2_0= ruleImportedRepository ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRepoLang.g:103:4: (lv_imports_2_0= ruleImportedRepository )
            	    {
            	    // InternalRepoLang.g:103:4: (lv_imports_2_0= ruleImportedRepository )
            	    // InternalRepoLang.g:104:5: lv_imports_2_0= ruleImportedRepository
            	    {

            	    					newCompositeNode(grammarAccess.getRepositoryAccess().getImportsImportedRepositoryParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_imports_2_0=ruleImportedRepository();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_2_0,
            	    						"com.palladiosimulator.textual.repository.RepoLang.ImportedRepository");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalRepoLang.g:121:3: ( (lv_types_3_0= ruleTypeRepo ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRepoLang.g:122:4: (lv_types_3_0= ruleTypeRepo )
                    {
                    // InternalRepoLang.g:122:4: (lv_types_3_0= ruleTypeRepo )
                    // InternalRepoLang.g:123:5: lv_types_3_0= ruleTypeRepo
                    {

                    					newCompositeNode(grammarAccess.getRepositoryAccess().getTypesTypeRepoParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_types_3_0=ruleTypeRepo();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    					}
                    					set(
                    						current,
                    						"types",
                    						lv_types_3_0,
                    						"com.palladiosimulator.textual.repository.RepoLang.TypeRepo");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalRepoLang.g:140:3: ( (lv_elements_4_0= ruleNamedElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18||LA3_0==27) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRepoLang.g:141:4: (lv_elements_4_0= ruleNamedElement )
            	    {
            	    // InternalRepoLang.g:141:4: (lv_elements_4_0= ruleNamedElement )
            	    // InternalRepoLang.g:142:5: lv_elements_4_0= ruleNamedElement
            	    {

            	    					newCompositeNode(grammarAccess.getRepositoryAccess().getElementsNamedElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_elements_4_0=ruleNamedElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"com.palladiosimulator.textual.repository.RepoLang.NamedElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleImportedRepository"
    // InternalRepoLang.g:163:1: entryRuleImportedRepository returns [EObject current=null] : iv_ruleImportedRepository= ruleImportedRepository EOF ;
    public final EObject entryRuleImportedRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportedRepository = null;


        try {
            // InternalRepoLang.g:163:59: (iv_ruleImportedRepository= ruleImportedRepository EOF )
            // InternalRepoLang.g:164:2: iv_ruleImportedRepository= ruleImportedRepository EOF
            {
             newCompositeNode(grammarAccess.getImportedRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportedRepository=ruleImportedRepository();

            state._fsp--;

             current =iv_ruleImportedRepository; 
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
    // $ANTLR end "entryRuleImportedRepository"


    // $ANTLR start "ruleImportedRepository"
    // InternalRepoLang.g:170:1: ruleImportedRepository returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImportedRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:176:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalRepoLang.g:177:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalRepoLang.g:177:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalRepoLang.g:178:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImportedRepositoryAccess().getImportKeyword_0());
            		
            // InternalRepoLang.g:182:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalRepoLang.g:183:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalRepoLang.g:183:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalRepoLang.g:184:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportedRepositoryAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportedRepositoryRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"com.palladiosimulator.textual.repository.RepoLang.QualifiedNameWithWildcard");
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
    // $ANTLR end "ruleImportedRepository"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalRepoLang.g:205:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalRepoLang.g:205:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalRepoLang.g:206:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalRepoLang.g:212:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:218:2: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // InternalRepoLang.g:219:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // InternalRepoLang.g:219:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // InternalRepoLang.g:220:3: this_FQN_0= ruleFQN (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getFQNParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_FQN_0=ruleFQN();

            state._fsp--;


            			current.merge(this_FQN_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalRepoLang.g:230:3: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRepoLang.g:231:4: kw= '.*'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleNamedElement"
    // InternalRepoLang.g:241:1: entryRuleNamedElement returns [EObject current=null] : iv_ruleNamedElement= ruleNamedElement EOF ;
    public final EObject entryRuleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedElement = null;


        try {
            // InternalRepoLang.g:241:53: (iv_ruleNamedElement= ruleNamedElement EOF )
            // InternalRepoLang.g:242:2: iv_ruleNamedElement= ruleNamedElement EOF
            {
             newCompositeNode(grammarAccess.getNamedElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedElement=ruleNamedElement();

            state._fsp--;

             current =iv_ruleNamedElement; 
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
    // $ANTLR end "entryRuleNamedElement"


    // $ANTLR start "ruleNamedElement"
    // InternalRepoLang.g:248:1: ruleNamedElement returns [EObject current=null] : (this_Interface_0= ruleInterface | this_Component_1= ruleComponent ) ;
    public final EObject ruleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject this_Interface_0 = null;

        EObject this_Component_1 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:254:2: ( (this_Interface_0= ruleInterface | this_Component_1= ruleComponent ) )
            // InternalRepoLang.g:255:2: (this_Interface_0= ruleInterface | this_Component_1= ruleComponent )
            {
            // InternalRepoLang.g:255:2: (this_Interface_0= ruleInterface | this_Component_1= ruleComponent )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==27) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRepoLang.g:256:3: this_Interface_0= ruleInterface
                    {

                    			newCompositeNode(grammarAccess.getNamedElementAccess().getInterfaceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interface_0=ruleInterface();

                    state._fsp--;


                    			current = this_Interface_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRepoLang.g:265:3: this_Component_1= ruleComponent
                    {

                    			newCompositeNode(grammarAccess.getNamedElementAccess().getComponentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Component_1=ruleComponent();

                    state._fsp--;


                    			current = this_Component_1;
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
    // $ANTLR end "ruleNamedElement"


    // $ANTLR start "entryRuleTypeRepo"
    // InternalRepoLang.g:277:1: entryRuleTypeRepo returns [EObject current=null] : iv_ruleTypeRepo= ruleTypeRepo EOF ;
    public final EObject entryRuleTypeRepo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRepo = null;


        try {
            // InternalRepoLang.g:277:49: (iv_ruleTypeRepo= ruleTypeRepo EOF )
            // InternalRepoLang.g:278:2: iv_ruleTypeRepo= ruleTypeRepo EOF
            {
             newCompositeNode(grammarAccess.getTypeRepoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeRepo=ruleTypeRepo();

            state._fsp--;

             current =iv_ruleTypeRepo; 
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
    // $ANTLR end "entryRuleTypeRepo"


    // $ANTLR start "ruleTypeRepo"
    // InternalRepoLang.g:284:1: ruleTypeRepo returns [EObject current=null] : (otherlv_0= 'Types' otherlv_1= '{' ( (lv_dataTypes__Repository_2_0= ruleCustomType ) )+ otherlv_3= '}' ) ;
    public final EObject ruleTypeRepo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_dataTypes__Repository_2_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:290:2: ( (otherlv_0= 'Types' otherlv_1= '{' ( (lv_dataTypes__Repository_2_0= ruleCustomType ) )+ otherlv_3= '}' ) )
            // InternalRepoLang.g:291:2: (otherlv_0= 'Types' otherlv_1= '{' ( (lv_dataTypes__Repository_2_0= ruleCustomType ) )+ otherlv_3= '}' )
            {
            // InternalRepoLang.g:291:2: (otherlv_0= 'Types' otherlv_1= '{' ( (lv_dataTypes__Repository_2_0= ruleCustomType ) )+ otherlv_3= '}' )
            // InternalRepoLang.g:292:3: otherlv_0= 'Types' otherlv_1= '{' ( (lv_dataTypes__Repository_2_0= ruleCustomType ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeRepoAccess().getTypesKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeRepoAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRepoLang.g:300:3: ( (lv_dataTypes__Repository_2_0= ruleCustomType ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23||LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRepoLang.g:301:4: (lv_dataTypes__Repository_2_0= ruleCustomType )
            	    {
            	    // InternalRepoLang.g:301:4: (lv_dataTypes__Repository_2_0= ruleCustomType )
            	    // InternalRepoLang.g:302:5: lv_dataTypes__Repository_2_0= ruleCustomType
            	    {

            	    					newCompositeNode(grammarAccess.getTypeRepoAccess().getDataTypes__RepositoryCustomTypeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_dataTypes__Repository_2_0=ruleCustomType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTypeRepoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dataTypes__Repository",
            	    						lv_dataTypes__Repository_2_0,
            	    						"com.palladiosimulator.textual.repository.RepoLang.CustomType");
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

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTypeRepoAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleTypeRepo"


    // $ANTLR start "entryRuleFQN"
    // InternalRepoLang.g:327:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalRepoLang.g:327:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalRepoLang.g:328:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalRepoLang.g:334:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRepoLang.g:340:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalRepoLang.g:341:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalRepoLang.g:341:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalRepoLang.g:342:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalRepoLang.g:349:3: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRepoLang.g:350:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleInterface"
    // InternalRepoLang.g:367:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalRepoLang.g:367:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalRepoLang.g:368:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalRepoLang.g:374:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_signature_3_0= ruleSignature ) )+ otherlv_4= '}' )? ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_signature_3_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:380:2: ( (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_signature_3_0= ruleSignature ) )+ otherlv_4= '}' )? ) )
            // InternalRepoLang.g:381:2: (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_signature_3_0= ruleSignature ) )+ otherlv_4= '}' )? )
            {
            // InternalRepoLang.g:381:2: (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_signature_3_0= ruleSignature ) )+ otherlv_4= '}' )? )
            // InternalRepoLang.g:382:3: otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_signature_3_0= ruleSignature ) )+ otherlv_4= '}' )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
            		
            // InternalRepoLang.g:386:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRepoLang.g:387:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRepoLang.g:387:4: (lv_name_1_0= RULE_ID )
            // InternalRepoLang.g:388:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterfaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRepoLang.g:404:3: (otherlv_2= '{' ( (lv_signature_3_0= ruleSignature ) )+ otherlv_4= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRepoLang.g:405:4: otherlv_2= '{' ( (lv_signature_3_0= ruleSignature ) )+ otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalRepoLang.g:409:4: ( (lv_signature_3_0= ruleSignature ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalRepoLang.g:410:5: (lv_signature_3_0= ruleSignature )
                    	    {
                    	    // InternalRepoLang.g:410:5: (lv_signature_3_0= ruleSignature )
                    	    // InternalRepoLang.g:411:6: lv_signature_3_0= ruleSignature
                    	    {

                    	    						newCompositeNode(grammarAccess.getInterfaceAccess().getSignatureSignatureParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_signature_3_0=ruleSignature();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"signature",
                    	    							lv_signature_3_0,
                    	    							"com.palladiosimulator.textual.repository.RepoLang.Signature");
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

                    otherlv_4=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_2_2());
                    			

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleSignature"
    // InternalRepoLang.g:437:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalRepoLang.g:437:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalRepoLang.g:438:2: iv_ruleSignature= ruleSignature EOF
            {
             newCompositeNode(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignature=ruleSignature();

            state._fsp--;

             current =iv_ruleSignature; 
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
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalRepoLang.g:444:1: ruleSignature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_parameters_2_0= ruleSignatureParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleSignatureParameter ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:450:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_parameters_2_0= ruleSignatureParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleSignatureParameter ) ) )* otherlv_5= ')' )? ) )
            // InternalRepoLang.g:451:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_parameters_2_0= ruleSignatureParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleSignatureParameter ) ) )* otherlv_5= ')' )? )
            {
            // InternalRepoLang.g:451:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_parameters_2_0= ruleSignatureParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleSignatureParameter ) ) )* otherlv_5= ')' )? )
            // InternalRepoLang.g:452:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_parameters_2_0= ruleSignatureParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleSignatureParameter ) ) )* otherlv_5= ')' )?
            {
            // InternalRepoLang.g:452:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRepoLang.g:453:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRepoLang.g:453:4: (lv_name_0_0= RULE_ID )
            // InternalRepoLang.g:454:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSignatureAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRepoLang.g:470:3: (otherlv_1= '(' ( (lv_parameters_2_0= ruleSignatureParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleSignatureParameter ) ) )* otherlv_5= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRepoLang.g:471:4: otherlv_1= '(' ( (lv_parameters_2_0= ruleSignatureParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleSignatureParameter ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getSignatureAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalRepoLang.g:475:4: ( (lv_parameters_2_0= ruleSignatureParameter ) )
                    // InternalRepoLang.g:476:5: (lv_parameters_2_0= ruleSignatureParameter )
                    {
                    // InternalRepoLang.g:476:5: (lv_parameters_2_0= ruleSignatureParameter )
                    // InternalRepoLang.g:477:6: lv_parameters_2_0= ruleSignatureParameter
                    {

                    						newCompositeNode(grammarAccess.getSignatureAccess().getParametersSignatureParameterParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_parameters_2_0=ruleSignatureParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSignatureRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_2_0,
                    							"com.palladiosimulator.textual.repository.RepoLang.SignatureParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRepoLang.g:494:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleSignatureParameter ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==20) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalRepoLang.g:495:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleSignatureParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSignatureAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalRepoLang.g:499:5: ( (lv_parameters_4_0= ruleSignatureParameter ) )
                    	    // InternalRepoLang.g:500:6: (lv_parameters_4_0= ruleSignatureParameter )
                    	    {
                    	    // InternalRepoLang.g:500:6: (lv_parameters_4_0= ruleSignatureParameter )
                    	    // InternalRepoLang.g:501:7: lv_parameters_4_0= ruleSignatureParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSignatureAccess().getParametersSignatureParameterParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_parameters_4_0=ruleSignatureParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSignatureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_4_0,
                    	    								"com.palladiosimulator.textual.repository.RepoLang.SignatureParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSignatureAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleSignatureParameter"
    // InternalRepoLang.g:528:1: entryRuleSignatureParameter returns [EObject current=null] : iv_ruleSignatureParameter= ruleSignatureParameter EOF ;
    public final EObject entryRuleSignatureParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignatureParameter = null;


        try {
            // InternalRepoLang.g:528:59: (iv_ruleSignatureParameter= ruleSignatureParameter EOF )
            // InternalRepoLang.g:529:2: iv_ruleSignatureParameter= ruleSignatureParameter EOF
            {
             newCompositeNode(grammarAccess.getSignatureParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignatureParameter=ruleSignatureParameter();

            state._fsp--;

             current =iv_ruleSignatureParameter; 
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
    // $ANTLR end "entryRuleSignatureParameter"


    // $ANTLR start "ruleSignatureParameter"
    // InternalRepoLang.g:535:1: ruleSignatureParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleSignatureParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRepoLang.g:541:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // InternalRepoLang.g:542:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // InternalRepoLang.g:542:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            // InternalRepoLang.g:543:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) )
            {
            // InternalRepoLang.g:543:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRepoLang.g:544:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRepoLang.g:544:4: (lv_name_0_0= RULE_ID )
            // InternalRepoLang.g:545:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSignatureParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignatureParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSignatureParameterAccess().getColonKeyword_1());
            		
            // InternalRepoLang.g:565:3: ( ( ruleFQN ) )
            // InternalRepoLang.g:566:4: ( ruleFQN )
            {
            // InternalRepoLang.g:566:4: ( ruleFQN )
            // InternalRepoLang.g:567:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignatureParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSignatureParameterAccess().getTypeDataTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


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
    // $ANTLR end "ruleSignatureParameter"


    // $ANTLR start "entryRuleCustomType"
    // InternalRepoLang.g:585:1: entryRuleCustomType returns [EObject current=null] : iv_ruleCustomType= ruleCustomType EOF ;
    public final EObject entryRuleCustomType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomType = null;


        try {
            // InternalRepoLang.g:585:51: (iv_ruleCustomType= ruleCustomType EOF )
            // InternalRepoLang.g:586:2: iv_ruleCustomType= ruleCustomType EOF
            {
             newCompositeNode(grammarAccess.getCustomTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomType=ruleCustomType();

            state._fsp--;

             current =iv_ruleCustomType; 
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
    // $ANTLR end "entryRuleCustomType"


    // $ANTLR start "ruleCustomType"
    // InternalRepoLang.g:592:1: ruleCustomType returns [EObject current=null] : (this_CustomCompositeType_0= ruleCustomCompositeType | this_CustomCollectionType_1= ruleCustomCollectionType ) ;
    public final EObject ruleCustomType() throws RecognitionException {
        EObject current = null;

        EObject this_CustomCompositeType_0 = null;

        EObject this_CustomCollectionType_1 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:598:2: ( (this_CustomCompositeType_0= ruleCustomCompositeType | this_CustomCollectionType_1= ruleCustomCollectionType ) )
            // InternalRepoLang.g:599:2: (this_CustomCompositeType_0= ruleCustomCompositeType | this_CustomCollectionType_1= ruleCustomCollectionType )
            {
            // InternalRepoLang.g:599:2: (this_CustomCompositeType_0= ruleCustomCompositeType | this_CustomCollectionType_1= ruleCustomCollectionType )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRepoLang.g:600:3: this_CustomCompositeType_0= ruleCustomCompositeType
                    {

                    			newCompositeNode(grammarAccess.getCustomTypeAccess().getCustomCompositeTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomCompositeType_0=ruleCustomCompositeType();

                    state._fsp--;


                    			current = this_CustomCompositeType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRepoLang.g:609:3: this_CustomCollectionType_1= ruleCustomCollectionType
                    {

                    			newCompositeNode(grammarAccess.getCustomTypeAccess().getCustomCollectionTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomCollectionType_1=ruleCustomCollectionType();

                    state._fsp--;


                    			current = this_CustomCollectionType_1;
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
    // $ANTLR end "ruleCustomType"


    // $ANTLR start "entryRuleCustomCompositeType"
    // InternalRepoLang.g:621:1: entryRuleCustomCompositeType returns [EObject current=null] : iv_ruleCustomCompositeType= ruleCustomCompositeType EOF ;
    public final EObject entryRuleCustomCompositeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomCompositeType = null;


        try {
            // InternalRepoLang.g:621:60: (iv_ruleCustomCompositeType= ruleCustomCompositeType EOF )
            // InternalRepoLang.g:622:2: iv_ruleCustomCompositeType= ruleCustomCompositeType EOF
            {
             newCompositeNode(grammarAccess.getCustomCompositeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomCompositeType=ruleCustomCompositeType();

            state._fsp--;

             current =iv_ruleCustomCompositeType; 
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
    // $ANTLR end "entryRuleCustomCompositeType"


    // $ANTLR start "ruleCustomCompositeType"
    // InternalRepoLang.g:628:1: ruleCustomCompositeType returns [EObject current=null] : (otherlv_0= 'struct' ( (lv_entityName_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_innerDeclaration_CompositeDataType_5_0= ruleCustomInnerDeclaration ) )* otherlv_6= '}' ) ;
    public final EObject ruleCustomCompositeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_entityName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_innerDeclaration_CompositeDataType_5_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:634:2: ( (otherlv_0= 'struct' ( (lv_entityName_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_innerDeclaration_CompositeDataType_5_0= ruleCustomInnerDeclaration ) )* otherlv_6= '}' ) )
            // InternalRepoLang.g:635:2: (otherlv_0= 'struct' ( (lv_entityName_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_innerDeclaration_CompositeDataType_5_0= ruleCustomInnerDeclaration ) )* otherlv_6= '}' )
            {
            // InternalRepoLang.g:635:2: (otherlv_0= 'struct' ( (lv_entityName_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_innerDeclaration_CompositeDataType_5_0= ruleCustomInnerDeclaration ) )* otherlv_6= '}' )
            // InternalRepoLang.g:636:3: otherlv_0= 'struct' ( (lv_entityName_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_innerDeclaration_CompositeDataType_5_0= ruleCustomInnerDeclaration ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomCompositeTypeAccess().getStructKeyword_0());
            		
            // InternalRepoLang.g:640:3: ( (lv_entityName_1_0= RULE_ID ) )
            // InternalRepoLang.g:641:4: (lv_entityName_1_0= RULE_ID )
            {
            // InternalRepoLang.g:641:4: (lv_entityName_1_0= RULE_ID )
            // InternalRepoLang.g:642:5: lv_entityName_1_0= RULE_ID
            {
            lv_entityName_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_entityName_1_0, grammarAccess.getCustomCompositeTypeAccess().getEntityNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomCompositeTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entityName",
            						lv_entityName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRepoLang.g:658:3: (otherlv_2= 'extends' ( ( ruleFQN ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRepoLang.g:659:4: otherlv_2= 'extends' ( ( ruleFQN ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getCustomCompositeTypeAccess().getExtendsKeyword_2_0());
                    			
                    // InternalRepoLang.g:663:4: ( ( ruleFQN ) )
                    // InternalRepoLang.g:664:5: ( ruleFQN )
                    {
                    // InternalRepoLang.g:664:5: ( ruleFQN )
                    // InternalRepoLang.g:665:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomCompositeTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCustomCompositeTypeAccess().getParentType_CompositeDataTypeCompositeDataTypeCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getCustomCompositeTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRepoLang.g:684:3: ( (lv_innerDeclaration_CompositeDataType_5_0= ruleCustomInnerDeclaration ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRepoLang.g:685:4: (lv_innerDeclaration_CompositeDataType_5_0= ruleCustomInnerDeclaration )
            	    {
            	    // InternalRepoLang.g:685:4: (lv_innerDeclaration_CompositeDataType_5_0= ruleCustomInnerDeclaration )
            	    // InternalRepoLang.g:686:5: lv_innerDeclaration_CompositeDataType_5_0= ruleCustomInnerDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getCustomCompositeTypeAccess().getInnerDeclaration_CompositeDataTypeCustomInnerDeclarationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_innerDeclaration_CompositeDataType_5_0=ruleCustomInnerDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCustomCompositeTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"innerDeclaration_CompositeDataType",
            	    						lv_innerDeclaration_CompositeDataType_5_0,
            	    						"com.palladiosimulator.textual.repository.RepoLang.CustomInnerDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCustomCompositeTypeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCustomCompositeType"


    // $ANTLR start "entryRuleCustomInnerDeclaration"
    // InternalRepoLang.g:711:1: entryRuleCustomInnerDeclaration returns [EObject current=null] : iv_ruleCustomInnerDeclaration= ruleCustomInnerDeclaration EOF ;
    public final EObject entryRuleCustomInnerDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomInnerDeclaration = null;


        try {
            // InternalRepoLang.g:711:63: (iv_ruleCustomInnerDeclaration= ruleCustomInnerDeclaration EOF )
            // InternalRepoLang.g:712:2: iv_ruleCustomInnerDeclaration= ruleCustomInnerDeclaration EOF
            {
             newCompositeNode(grammarAccess.getCustomInnerDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomInnerDeclaration=ruleCustomInnerDeclaration();

            state._fsp--;

             current =iv_ruleCustomInnerDeclaration; 
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
    // $ANTLR end "entryRuleCustomInnerDeclaration"


    // $ANTLR start "ruleCustomInnerDeclaration"
    // InternalRepoLang.g:718:1: ruleCustomInnerDeclaration returns [EObject current=null] : ( ( (lv_entityName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleCustomInnerDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_entityName_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRepoLang.g:724:2: ( ( ( (lv_entityName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // InternalRepoLang.g:725:2: ( ( (lv_entityName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // InternalRepoLang.g:725:2: ( ( (lv_entityName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            // InternalRepoLang.g:726:3: ( (lv_entityName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) )
            {
            // InternalRepoLang.g:726:3: ( (lv_entityName_0_0= RULE_ID ) )
            // InternalRepoLang.g:727:4: (lv_entityName_0_0= RULE_ID )
            {
            // InternalRepoLang.g:727:4: (lv_entityName_0_0= RULE_ID )
            // InternalRepoLang.g:728:5: lv_entityName_0_0= RULE_ID
            {
            lv_entityName_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_entityName_0_0, grammarAccess.getCustomInnerDeclarationAccess().getEntityNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomInnerDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entityName",
            						lv_entityName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomInnerDeclarationAccess().getColonKeyword_1());
            		
            // InternalRepoLang.g:748:3: ( ( ruleFQN ) )
            // InternalRepoLang.g:749:4: ( ruleFQN )
            {
            // InternalRepoLang.g:749:4: ( ruleFQN )
            // InternalRepoLang.g:750:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomInnerDeclarationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCustomInnerDeclarationAccess().getDatatype_InnerDeclarationDataTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


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
    // $ANTLR end "ruleCustomInnerDeclaration"


    // $ANTLR start "entryRuleCustomCollectionType"
    // InternalRepoLang.g:768:1: entryRuleCustomCollectionType returns [EObject current=null] : iv_ruleCustomCollectionType= ruleCustomCollectionType EOF ;
    public final EObject entryRuleCustomCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomCollectionType = null;


        try {
            // InternalRepoLang.g:768:61: (iv_ruleCustomCollectionType= ruleCustomCollectionType EOF )
            // InternalRepoLang.g:769:2: iv_ruleCustomCollectionType= ruleCustomCollectionType EOF
            {
             newCompositeNode(grammarAccess.getCustomCollectionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomCollectionType=ruleCustomCollectionType();

            state._fsp--;

             current =iv_ruleCustomCollectionType; 
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
    // $ANTLR end "entryRuleCustomCollectionType"


    // $ANTLR start "ruleCustomCollectionType"
    // InternalRepoLang.g:775:1: ruleCustomCollectionType returns [EObject current=null] : (otherlv_0= 'collection' ( (lv_entityName_1_0= RULE_ID ) ) otherlv_2= 'of' ( ( ruleFQN ) ) ) ;
    public final EObject ruleCustomCollectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_entityName_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRepoLang.g:781:2: ( (otherlv_0= 'collection' ( (lv_entityName_1_0= RULE_ID ) ) otherlv_2= 'of' ( ( ruleFQN ) ) ) )
            // InternalRepoLang.g:782:2: (otherlv_0= 'collection' ( (lv_entityName_1_0= RULE_ID ) ) otherlv_2= 'of' ( ( ruleFQN ) ) )
            {
            // InternalRepoLang.g:782:2: (otherlv_0= 'collection' ( (lv_entityName_1_0= RULE_ID ) ) otherlv_2= 'of' ( ( ruleFQN ) ) )
            // InternalRepoLang.g:783:3: otherlv_0= 'collection' ( (lv_entityName_1_0= RULE_ID ) ) otherlv_2= 'of' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomCollectionTypeAccess().getCollectionKeyword_0());
            		
            // InternalRepoLang.g:787:3: ( (lv_entityName_1_0= RULE_ID ) )
            // InternalRepoLang.g:788:4: (lv_entityName_1_0= RULE_ID )
            {
            // InternalRepoLang.g:788:4: (lv_entityName_1_0= RULE_ID )
            // InternalRepoLang.g:789:5: lv_entityName_1_0= RULE_ID
            {
            lv_entityName_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_entityName_1_0, grammarAccess.getCustomCollectionTypeAccess().getEntityNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomCollectionTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entityName",
            						lv_entityName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomCollectionTypeAccess().getOfKeyword_2());
            		
            // InternalRepoLang.g:809:3: ( ( ruleFQN ) )
            // InternalRepoLang.g:810:4: ( ruleFQN )
            {
            // InternalRepoLang.g:810:4: ( ruleFQN )
            // InternalRepoLang.g:811:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomCollectionTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCustomCollectionTypeAccess().getInnerType_CollectionDataTypeDataTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


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
    // $ANTLR end "ruleCustomCollectionType"


    // $ANTLR start "entryRuleComponent"
    // InternalRepoLang.g:829:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalRepoLang.g:829:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalRepoLang.g:830:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalRepoLang.g:836:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'provides' ( (lv_provides_3_0= ruleRoleSpecification ) ) (otherlv_4= ',' ( (lv_provides_5_0= ruleRoleSpecification ) ) )* )? (otherlv_6= 'requires' ( (lv_requires_7_0= ruleRoleSpecification ) ) (otherlv_8= ',' ( (lv_requires_9_0= ruleRoleSpecification ) ) )* )? (otherlv_10= '{' ( (lv_seffs_11_0= ruleSeff ) )* ( (lv_passiveResources_12_0= rulePassiveResource ) )* otherlv_13= '}' )? ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        EObject lv_provides_3_0 = null;

        EObject lv_provides_5_0 = null;

        EObject lv_requires_7_0 = null;

        EObject lv_requires_9_0 = null;

        EObject lv_seffs_11_0 = null;

        EObject lv_passiveResources_12_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:842:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'provides' ( (lv_provides_3_0= ruleRoleSpecification ) ) (otherlv_4= ',' ( (lv_provides_5_0= ruleRoleSpecification ) ) )* )? (otherlv_6= 'requires' ( (lv_requires_7_0= ruleRoleSpecification ) ) (otherlv_8= ',' ( (lv_requires_9_0= ruleRoleSpecification ) ) )* )? (otherlv_10= '{' ( (lv_seffs_11_0= ruleSeff ) )* ( (lv_passiveResources_12_0= rulePassiveResource ) )* otherlv_13= '}' )? ) )
            // InternalRepoLang.g:843:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'provides' ( (lv_provides_3_0= ruleRoleSpecification ) ) (otherlv_4= ',' ( (lv_provides_5_0= ruleRoleSpecification ) ) )* )? (otherlv_6= 'requires' ( (lv_requires_7_0= ruleRoleSpecification ) ) (otherlv_8= ',' ( (lv_requires_9_0= ruleRoleSpecification ) ) )* )? (otherlv_10= '{' ( (lv_seffs_11_0= ruleSeff ) )* ( (lv_passiveResources_12_0= rulePassiveResource ) )* otherlv_13= '}' )? )
            {
            // InternalRepoLang.g:843:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'provides' ( (lv_provides_3_0= ruleRoleSpecification ) ) (otherlv_4= ',' ( (lv_provides_5_0= ruleRoleSpecification ) ) )* )? (otherlv_6= 'requires' ( (lv_requires_7_0= ruleRoleSpecification ) ) (otherlv_8= ',' ( (lv_requires_9_0= ruleRoleSpecification ) ) )* )? (otherlv_10= '{' ( (lv_seffs_11_0= ruleSeff ) )* ( (lv_passiveResources_12_0= rulePassiveResource ) )* otherlv_13= '}' )? )
            // InternalRepoLang.g:844:3: otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'provides' ( (lv_provides_3_0= ruleRoleSpecification ) ) (otherlv_4= ',' ( (lv_provides_5_0= ruleRoleSpecification ) ) )* )? (otherlv_6= 'requires' ( (lv_requires_7_0= ruleRoleSpecification ) ) (otherlv_8= ',' ( (lv_requires_9_0= ruleRoleSpecification ) ) )* )? (otherlv_10= '{' ( (lv_seffs_11_0= ruleSeff ) )* ( (lv_passiveResources_12_0= rulePassiveResource ) )* otherlv_13= '}' )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalRepoLang.g:848:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRepoLang.g:849:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRepoLang.g:849:4: (lv_name_1_0= RULE_ID )
            // InternalRepoLang.g:850:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRepoLang.g:866:3: (otherlv_2= 'provides' ( (lv_provides_3_0= ruleRoleSpecification ) ) (otherlv_4= ',' ( (lv_provides_5_0= ruleRoleSpecification ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRepoLang.g:867:4: otherlv_2= 'provides' ( (lv_provides_3_0= ruleRoleSpecification ) ) (otherlv_4= ',' ( (lv_provides_5_0= ruleRoleSpecification ) ) )*
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getProvidesKeyword_2_0());
                    			
                    // InternalRepoLang.g:871:4: ( (lv_provides_3_0= ruleRoleSpecification ) )
                    // InternalRepoLang.g:872:5: (lv_provides_3_0= ruleRoleSpecification )
                    {
                    // InternalRepoLang.g:872:5: (lv_provides_3_0= ruleRoleSpecification )
                    // InternalRepoLang.g:873:6: lv_provides_3_0= ruleRoleSpecification
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getProvidesRoleSpecificationParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_provides_3_0=ruleRoleSpecification();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"provides",
                    							lv_provides_3_0,
                    							"com.palladiosimulator.textual.repository.RepoLang.RoleSpecification");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRepoLang.g:890:4: (otherlv_4= ',' ( (lv_provides_5_0= ruleRoleSpecification ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==20) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalRepoLang.g:891:5: otherlv_4= ',' ( (lv_provides_5_0= ruleRoleSpecification ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalRepoLang.g:895:5: ( (lv_provides_5_0= ruleRoleSpecification ) )
                    	    // InternalRepoLang.g:896:6: (lv_provides_5_0= ruleRoleSpecification )
                    	    {
                    	    // InternalRepoLang.g:896:6: (lv_provides_5_0= ruleRoleSpecification )
                    	    // InternalRepoLang.g:897:7: lv_provides_5_0= ruleRoleSpecification
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getProvidesRoleSpecificationParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_provides_5_0=ruleRoleSpecification();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"provides",
                    	    								lv_provides_5_0,
                    	    								"com.palladiosimulator.textual.repository.RepoLang.RoleSpecification");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRepoLang.g:916:3: (otherlv_6= 'requires' ( (lv_requires_7_0= ruleRoleSpecification ) ) (otherlv_8= ',' ( (lv_requires_9_0= ruleRoleSpecification ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRepoLang.g:917:4: otherlv_6= 'requires' ( (lv_requires_7_0= ruleRoleSpecification ) ) (otherlv_8= ',' ( (lv_requires_9_0= ruleRoleSpecification ) ) )*
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getRequiresKeyword_3_0());
                    			
                    // InternalRepoLang.g:921:4: ( (lv_requires_7_0= ruleRoleSpecification ) )
                    // InternalRepoLang.g:922:5: (lv_requires_7_0= ruleRoleSpecification )
                    {
                    // InternalRepoLang.g:922:5: (lv_requires_7_0= ruleRoleSpecification )
                    // InternalRepoLang.g:923:6: lv_requires_7_0= ruleRoleSpecification
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getRequiresRoleSpecificationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_requires_7_0=ruleRoleSpecification();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"requires",
                    							lv_requires_7_0,
                    							"com.palladiosimulator.textual.repository.RepoLang.RoleSpecification");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRepoLang.g:940:4: (otherlv_8= ',' ( (lv_requires_9_0= ruleRoleSpecification ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==20) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalRepoLang.g:941:5: otherlv_8= ',' ( (lv_requires_9_0= ruleRoleSpecification ) )
                    	    {
                    	    otherlv_8=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalRepoLang.g:945:5: ( (lv_requires_9_0= ruleRoleSpecification ) )
                    	    // InternalRepoLang.g:946:6: (lv_requires_9_0= ruleRoleSpecification )
                    	    {
                    	    // InternalRepoLang.g:946:6: (lv_requires_9_0= ruleRoleSpecification )
                    	    // InternalRepoLang.g:947:7: lv_requires_9_0= ruleRoleSpecification
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getRequiresRoleSpecificationParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_requires_9_0=ruleRoleSpecification();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requires",
                    	    								lv_requires_9_0,
                    	    								"com.palladiosimulator.textual.repository.RepoLang.RoleSpecification");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRepoLang.g:966:3: (otherlv_10= '{' ( (lv_seffs_11_0= ruleSeff ) )* ( (lv_passiveResources_12_0= rulePassiveResource ) )* otherlv_13= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRepoLang.g:967:4: otherlv_10= '{' ( (lv_seffs_11_0= ruleSeff ) )* ( (lv_passiveResources_12_0= rulePassiveResource ) )* otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,15,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalRepoLang.g:971:4: ( (lv_seffs_11_0= ruleSeff ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==31) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalRepoLang.g:972:5: (lv_seffs_11_0= ruleSeff )
                    	    {
                    	    // InternalRepoLang.g:972:5: (lv_seffs_11_0= ruleSeff )
                    	    // InternalRepoLang.g:973:6: lv_seffs_11_0= ruleSeff
                    	    {

                    	    						newCompositeNode(grammarAccess.getComponentAccess().getSeffsSeffParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_seffs_11_0=ruleSeff();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"seffs",
                    	    							lv_seffs_11_0,
                    	    							"com.palladiosimulator.textual.repository.RepoLang.Seff");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // InternalRepoLang.g:990:4: ( (lv_passiveResources_12_0= rulePassiveResource ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==48) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalRepoLang.g:991:5: (lv_passiveResources_12_0= rulePassiveResource )
                    	    {
                    	    // InternalRepoLang.g:991:5: (lv_passiveResources_12_0= rulePassiveResource )
                    	    // InternalRepoLang.g:992:6: lv_passiveResources_12_0= rulePassiveResource
                    	    {

                    	    						newCompositeNode(grammarAccess.getComponentAccess().getPassiveResourcesPassiveResourceParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
                    	    lv_passiveResources_12_0=rulePassiveResource();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"passiveResources",
                    	    							lv_passiveResources_12_0,
                    	    							"com.palladiosimulator.textual.repository.RepoLang.PassiveResource");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4_3());
                    			

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleRoleSpecification"
    // InternalRepoLang.g:1018:1: entryRuleRoleSpecification returns [EObject current=null] : iv_ruleRoleSpecification= ruleRoleSpecification EOF ;
    public final EObject entryRuleRoleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleSpecification = null;


        try {
            // InternalRepoLang.g:1018:58: (iv_ruleRoleSpecification= ruleRoleSpecification EOF )
            // InternalRepoLang.g:1019:2: iv_ruleRoleSpecification= ruleRoleSpecification EOF
            {
             newCompositeNode(grammarAccess.getRoleSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoleSpecification=ruleRoleSpecification();

            state._fsp--;

             current =iv_ruleRoleSpecification; 
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
    // $ANTLR end "entryRuleRoleSpecification"


    // $ANTLR start "ruleRoleSpecification"
    // InternalRepoLang.g:1025:1: ruleRoleSpecification returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleRoleSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalRepoLang.g:1031:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalRepoLang.g:1032:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalRepoLang.g:1032:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalRepoLang.g:1033:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalRepoLang.g:1033:3: ( (otherlv_0= RULE_ID ) )
            // InternalRepoLang.g:1034:4: (otherlv_0= RULE_ID )
            {
            // InternalRepoLang.g:1034:4: (otherlv_0= RULE_ID )
            // InternalRepoLang.g:1035:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleSpecificationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_0, grammarAccess.getRoleSpecificationAccess().getInterfaceInterfaceCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleSpecificationAccess().getAsKeyword_1());
            		
            // InternalRepoLang.g:1050:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRepoLang.g:1051:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRepoLang.g:1051:4: (lv_name_2_0= RULE_ID )
            // InternalRepoLang.g:1052:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRoleSpecificationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
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
    // $ANTLR end "ruleRoleSpecification"


    // $ANTLR start "entryRuleSeff"
    // InternalRepoLang.g:1072:1: entryRuleSeff returns [EObject current=null] : iv_ruleSeff= ruleSeff EOF ;
    public final EObject entryRuleSeff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeff = null;


        try {
            // InternalRepoLang.g:1072:45: (iv_ruleSeff= ruleSeff EOF )
            // InternalRepoLang.g:1073:2: iv_ruleSeff= ruleSeff EOF
            {
             newCompositeNode(grammarAccess.getSeffRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeff=ruleSeff();

            state._fsp--;

             current =iv_ruleSeff; 
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
    // $ANTLR end "entryRuleSeff"


    // $ANTLR start "ruleSeff"
    // InternalRepoLang.g:1079:1: ruleSeff returns [EObject current=null] : (otherlv_0= 'SEFF' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_actions_6_0= ruleSeffAction ) )* otherlv_7= '}' ) ;
    public final EObject ruleSeff() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_actions_6_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:1085:2: ( (otherlv_0= 'SEFF' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_actions_6_0= ruleSeffAction ) )* otherlv_7= '}' ) )
            // InternalRepoLang.g:1086:2: (otherlv_0= 'SEFF' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_actions_6_0= ruleSeffAction ) )* otherlv_7= '}' )
            {
            // InternalRepoLang.g:1086:2: (otherlv_0= 'SEFF' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_actions_6_0= ruleSeffAction ) )* otherlv_7= '}' )
            // InternalRepoLang.g:1087:3: otherlv_0= 'SEFF' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_actions_6_0= ruleSeffAction ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getSeffAccess().getSEFFKeyword_0());
            		
            // InternalRepoLang.g:1091:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRepoLang.g:1092:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalRepoLang.g:1092:4: (lv_name_1_0= RULE_ID )
                    // InternalRepoLang.g:1093:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getSeffAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSeffRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSeffAccess().getOnKeyword_2());
            		
            // InternalRepoLang.g:1113:3: ( (otherlv_3= RULE_ID ) )
            // InternalRepoLang.g:1114:4: (otherlv_3= RULE_ID )
            {
            // InternalRepoLang.g:1114:4: (otherlv_3= RULE_ID )
            // InternalRepoLang.g:1115:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSeffRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_3, grammarAccess.getSeffAccess().getRoleRoleSpecificationCrossReference_3_0());
            				

            }


            }

            // InternalRepoLang.g:1126:3: ( ( ruleFQN ) )
            // InternalRepoLang.g:1127:4: ( ruleFQN )
            {
            // InternalRepoLang.g:1127:4: ( ruleFQN )
            // InternalRepoLang.g:1128:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSeffRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSeffAccess().getSignatureSignatureCrossReference_4_0());
            				
            pushFollow(FOLLOW_7);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getSeffAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalRepoLang.g:1146:3: ( (lv_actions_6_0= ruleSeffAction ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=33 && LA23_0<=39)||(LA23_0>=43 && LA23_0<=45)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRepoLang.g:1147:4: (lv_actions_6_0= ruleSeffAction )
            	    {
            	    // InternalRepoLang.g:1147:4: (lv_actions_6_0= ruleSeffAction )
            	    // InternalRepoLang.g:1148:5: lv_actions_6_0= ruleSeffAction
            	    {

            	    					newCompositeNode(grammarAccess.getSeffAccess().getActionsSeffActionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_actions_6_0=ruleSeffAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSeffRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_6_0,
            	    						"com.palladiosimulator.textual.repository.RepoLang.SeffAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSeffAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleSeff"


    // $ANTLR start "entryRuleSeffAction"
    // InternalRepoLang.g:1173:1: entryRuleSeffAction returns [EObject current=null] : iv_ruleSeffAction= ruleSeffAction EOF ;
    public final EObject entryRuleSeffAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeffAction = null;


        try {
            // InternalRepoLang.g:1173:51: (iv_ruleSeffAction= ruleSeffAction EOF )
            // InternalRepoLang.g:1174:2: iv_ruleSeffAction= ruleSeffAction EOF
            {
             newCompositeNode(grammarAccess.getSeffActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeffAction=ruleSeffAction();

            state._fsp--;

             current =iv_ruleSeffAction; 
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
    // $ANTLR end "entryRuleSeffAction"


    // $ANTLR start "ruleSeffAction"
    // InternalRepoLang.g:1180:1: ruleSeffAction returns [EObject current=null] : (this_SeffInternalAction_0= ruleSeffInternalAction | this_SeffAcquireAction_1= ruleSeffAcquireAction | this_SeffReleaseAction_2= ruleSeffReleaseAction | this_SeffExternalCallAction_3= ruleSeffExternalCallAction | this_SeffProbabilisticBranchAction_4= ruleSeffProbabilisticBranchAction | this_SeffGuardedBranchAction_5= ruleSeffGuardedBranchAction | this_SeffForkAction_6= ruleSeffForkAction | this_SeffLoopAction_7= ruleSeffLoopAction | this_SeffSetReturnAction_8= ruleSeffSetReturnAction | this_SeffSetVariableAction_9= ruleSeffSetVariableAction ) ;
    public final EObject ruleSeffAction() throws RecognitionException {
        EObject current = null;

        EObject this_SeffInternalAction_0 = null;

        EObject this_SeffAcquireAction_1 = null;

        EObject this_SeffReleaseAction_2 = null;

        EObject this_SeffExternalCallAction_3 = null;

        EObject this_SeffProbabilisticBranchAction_4 = null;

        EObject this_SeffGuardedBranchAction_5 = null;

        EObject this_SeffForkAction_6 = null;

        EObject this_SeffLoopAction_7 = null;

        EObject this_SeffSetReturnAction_8 = null;

        EObject this_SeffSetVariableAction_9 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:1186:2: ( (this_SeffInternalAction_0= ruleSeffInternalAction | this_SeffAcquireAction_1= ruleSeffAcquireAction | this_SeffReleaseAction_2= ruleSeffReleaseAction | this_SeffExternalCallAction_3= ruleSeffExternalCallAction | this_SeffProbabilisticBranchAction_4= ruleSeffProbabilisticBranchAction | this_SeffGuardedBranchAction_5= ruleSeffGuardedBranchAction | this_SeffForkAction_6= ruleSeffForkAction | this_SeffLoopAction_7= ruleSeffLoopAction | this_SeffSetReturnAction_8= ruleSeffSetReturnAction | this_SeffSetVariableAction_9= ruleSeffSetVariableAction ) )
            // InternalRepoLang.g:1187:2: (this_SeffInternalAction_0= ruleSeffInternalAction | this_SeffAcquireAction_1= ruleSeffAcquireAction | this_SeffReleaseAction_2= ruleSeffReleaseAction | this_SeffExternalCallAction_3= ruleSeffExternalCallAction | this_SeffProbabilisticBranchAction_4= ruleSeffProbabilisticBranchAction | this_SeffGuardedBranchAction_5= ruleSeffGuardedBranchAction | this_SeffForkAction_6= ruleSeffForkAction | this_SeffLoopAction_7= ruleSeffLoopAction | this_SeffSetReturnAction_8= ruleSeffSetReturnAction | this_SeffSetVariableAction_9= ruleSeffSetVariableAction )
            {
            // InternalRepoLang.g:1187:2: (this_SeffInternalAction_0= ruleSeffInternalAction | this_SeffAcquireAction_1= ruleSeffAcquireAction | this_SeffReleaseAction_2= ruleSeffReleaseAction | this_SeffExternalCallAction_3= ruleSeffExternalCallAction | this_SeffProbabilisticBranchAction_4= ruleSeffProbabilisticBranchAction | this_SeffGuardedBranchAction_5= ruleSeffGuardedBranchAction | this_SeffForkAction_6= ruleSeffForkAction | this_SeffLoopAction_7= ruleSeffLoopAction | this_SeffSetReturnAction_8= ruleSeffSetReturnAction | this_SeffSetVariableAction_9= ruleSeffSetVariableAction )
            int alt24=10;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt24=1;
                }
                break;
            case 34:
                {
                alt24=2;
                }
                break;
            case 35:
                {
                alt24=3;
                }
                break;
            case 39:
                {
                alt24=4;
                }
                break;
            case 43:
                {
                alt24=5;
                }
                break;
            case 44:
                {
                alt24=6;
                }
                break;
            case 45:
                {
                alt24=7;
                }
                break;
            case 36:
                {
                alt24=8;
                }
                break;
            case 37:
                {
                alt24=9;
                }
                break;
            case 38:
                {
                alt24=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalRepoLang.g:1188:3: this_SeffInternalAction_0= ruleSeffInternalAction
                    {

                    			newCompositeNode(grammarAccess.getSeffActionAccess().getSeffInternalActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SeffInternalAction_0=ruleSeffInternalAction();

                    state._fsp--;


                    			current = this_SeffInternalAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRepoLang.g:1197:3: this_SeffAcquireAction_1= ruleSeffAcquireAction
                    {

                    			newCompositeNode(grammarAccess.getSeffActionAccess().getSeffAcquireActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SeffAcquireAction_1=ruleSeffAcquireAction();

                    state._fsp--;


                    			current = this_SeffAcquireAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRepoLang.g:1206:3: this_SeffReleaseAction_2= ruleSeffReleaseAction
                    {

                    			newCompositeNode(grammarAccess.getSeffActionAccess().getSeffReleaseActionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SeffReleaseAction_2=ruleSeffReleaseAction();

                    state._fsp--;


                    			current = this_SeffReleaseAction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRepoLang.g:1215:3: this_SeffExternalCallAction_3= ruleSeffExternalCallAction
                    {

                    			newCompositeNode(grammarAccess.getSeffActionAccess().getSeffExternalCallActionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SeffExternalCallAction_3=ruleSeffExternalCallAction();

                    state._fsp--;


                    			current = this_SeffExternalCallAction_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRepoLang.g:1224:3: this_SeffProbabilisticBranchAction_4= ruleSeffProbabilisticBranchAction
                    {

                    			newCompositeNode(grammarAccess.getSeffActionAccess().getSeffProbabilisticBranchActionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SeffProbabilisticBranchAction_4=ruleSeffProbabilisticBranchAction();

                    state._fsp--;


                    			current = this_SeffProbabilisticBranchAction_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRepoLang.g:1233:3: this_SeffGuardedBranchAction_5= ruleSeffGuardedBranchAction
                    {

                    			newCompositeNode(grammarAccess.getSeffActionAccess().getSeffGuardedBranchActionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_SeffGuardedBranchAction_5=ruleSeffGuardedBranchAction();

                    state._fsp--;


                    			current = this_SeffGuardedBranchAction_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRepoLang.g:1242:3: this_SeffForkAction_6= ruleSeffForkAction
                    {

                    			newCompositeNode(grammarAccess.getSeffActionAccess().getSeffForkActionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_SeffForkAction_6=ruleSeffForkAction();

                    state._fsp--;


                    			current = this_SeffForkAction_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRepoLang.g:1251:3: this_SeffLoopAction_7= ruleSeffLoopAction
                    {

                    			newCompositeNode(grammarAccess.getSeffActionAccess().getSeffLoopActionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_SeffLoopAction_7=ruleSeffLoopAction();

                    state._fsp--;


                    			current = this_SeffLoopAction_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRepoLang.g:1260:3: this_SeffSetReturnAction_8= ruleSeffSetReturnAction
                    {

                    			newCompositeNode(grammarAccess.getSeffActionAccess().getSeffSetReturnActionParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_SeffSetReturnAction_8=ruleSeffSetReturnAction();

                    state._fsp--;


                    			current = this_SeffSetReturnAction_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalRepoLang.g:1269:3: this_SeffSetVariableAction_9= ruleSeffSetVariableAction
                    {

                    			newCompositeNode(grammarAccess.getSeffActionAccess().getSeffSetVariableActionParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_SeffSetVariableAction_9=ruleSeffSetVariableAction();

                    state._fsp--;


                    			current = this_SeffSetVariableAction_9;
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
    // $ANTLR end "ruleSeffAction"


    // $ANTLR start "entryRuleSeffInternalAction"
    // InternalRepoLang.g:1281:1: entryRuleSeffInternalAction returns [EObject current=null] : iv_ruleSeffInternalAction= ruleSeffInternalAction EOF ;
    public final EObject entryRuleSeffInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeffInternalAction = null;


        try {
            // InternalRepoLang.g:1281:59: (iv_ruleSeffInternalAction= ruleSeffInternalAction EOF )
            // InternalRepoLang.g:1282:2: iv_ruleSeffInternalAction= ruleSeffInternalAction EOF
            {
             newCompositeNode(grammarAccess.getSeffInternalActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeffInternalAction=ruleSeffInternalAction();

            state._fsp--;

             current =iv_ruleSeffInternalAction; 
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
    // $ANTLR end "entryRuleSeffInternalAction"


    // $ANTLR start "ruleSeffInternalAction"
    // InternalRepoLang.g:1288:1: ruleSeffInternalAction returns [EObject current=null] : (otherlv_0= 'IA' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_demand_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSeffInternalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_demand_3_0=null;


        	enterRule();

        try {
            // InternalRepoLang.g:1294:2: ( (otherlv_0= 'IA' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_demand_3_0= RULE_STRING ) ) ) )
            // InternalRepoLang.g:1295:2: (otherlv_0= 'IA' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_demand_3_0= RULE_STRING ) ) )
            {
            // InternalRepoLang.g:1295:2: (otherlv_0= 'IA' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_demand_3_0= RULE_STRING ) ) )
            // InternalRepoLang.g:1296:3: otherlv_0= 'IA' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_demand_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSeffInternalActionAccess().getIAKeyword_0());
            		
            // InternalRepoLang.g:1300:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==RULE_ID) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // InternalRepoLang.g:1301:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalRepoLang.g:1301:4: (lv_name_1_0= RULE_ID )
                    // InternalRepoLang.g:1302:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getSeffInternalActionAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSeffInternalActionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalRepoLang.g:1318:3: ( (otherlv_2= RULE_ID ) )
            // InternalRepoLang.g:1319:4: (otherlv_2= RULE_ID )
            {
            // InternalRepoLang.g:1319:4: (otherlv_2= RULE_ID )
            // InternalRepoLang.g:1320:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSeffInternalActionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_2, grammarAccess.getSeffInternalActionAccess().getDemandTypeProcessingResourceTypeCrossReference_2_0());
            				

            }


            }

            // InternalRepoLang.g:1331:3: ( (lv_demand_3_0= RULE_STRING ) )
            // InternalRepoLang.g:1332:4: (lv_demand_3_0= RULE_STRING )
            {
            // InternalRepoLang.g:1332:4: (lv_demand_3_0= RULE_STRING )
            // InternalRepoLang.g:1333:5: lv_demand_3_0= RULE_STRING
            {
            lv_demand_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_demand_3_0, grammarAccess.getSeffInternalActionAccess().getDemandSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSeffInternalActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"demand",
            						lv_demand_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleSeffInternalAction"


    // $ANTLR start "entryRuleSeffAcquireAction"
    // InternalRepoLang.g:1353:1: entryRuleSeffAcquireAction returns [EObject current=null] : iv_ruleSeffAcquireAction= ruleSeffAcquireAction EOF ;
    public final EObject entryRuleSeffAcquireAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeffAcquireAction = null;


        try {
            // InternalRepoLang.g:1353:58: (iv_ruleSeffAcquireAction= ruleSeffAcquireAction EOF )
            // InternalRepoLang.g:1354:2: iv_ruleSeffAcquireAction= ruleSeffAcquireAction EOF
            {
             newCompositeNode(grammarAccess.getSeffAcquireActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeffAcquireAction=ruleSeffAcquireAction();

            state._fsp--;

             current =iv_ruleSeffAcquireAction; 
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
    // $ANTLR end "entryRuleSeffAcquireAction"


    // $ANTLR start "ruleSeffAcquireAction"
    // InternalRepoLang.g:1360:1: ruleSeffAcquireAction returns [EObject current=null] : (otherlv_0= 'ACQ' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= ')' )? ) ;
    public final EObject ruleSeffAcquireAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_amount_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalRepoLang.g:1366:2: ( (otherlv_0= 'ACQ' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= ')' )? ) )
            // InternalRepoLang.g:1367:2: (otherlv_0= 'ACQ' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= ')' )? )
            {
            // InternalRepoLang.g:1367:2: (otherlv_0= 'ACQ' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= ')' )? )
            // InternalRepoLang.g:1368:3: otherlv_0= 'ACQ' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSeffAcquireActionAccess().getACQKeyword_0());
            		
            // InternalRepoLang.g:1372:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==RULE_ID) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalRepoLang.g:1373:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalRepoLang.g:1373:4: (lv_name_1_0= RULE_ID )
                    // InternalRepoLang.g:1374:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getSeffAcquireActionAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSeffAcquireActionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalRepoLang.g:1390:3: ( (otherlv_2= RULE_ID ) )
            // InternalRepoLang.g:1391:4: (otherlv_2= RULE_ID )
            {
            // InternalRepoLang.g:1391:4: (otherlv_2= RULE_ID )
            // InternalRepoLang.g:1392:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSeffAcquireActionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_2, grammarAccess.getSeffAcquireActionAccess().getResourcePassiveResourceCrossReference_2_0());
            				

            }


            }

            // InternalRepoLang.g:1403:3: (otherlv_3= '(' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==19) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRepoLang.g:1404:4: otherlv_3= '(' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_28); 

                    				newLeafNode(otherlv_3, grammarAccess.getSeffAcquireActionAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalRepoLang.g:1408:4: ( (lv_amount_4_0= RULE_INT ) )
                    // InternalRepoLang.g:1409:5: (lv_amount_4_0= RULE_INT )
                    {
                    // InternalRepoLang.g:1409:5: (lv_amount_4_0= RULE_INT )
                    // InternalRepoLang.g:1410:6: lv_amount_4_0= RULE_INT
                    {
                    lv_amount_4_0=(Token)match(input,RULE_INT,FOLLOW_29); 

                    						newLeafNode(lv_amount_4_0, grammarAccess.getSeffAcquireActionAccess().getAmountINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSeffAcquireActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"amount",
                    							lv_amount_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSeffAcquireActionAccess().getRightParenthesisKeyword_3_2());
                    			

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
    // $ANTLR end "ruleSeffAcquireAction"


    // $ANTLR start "entryRuleSeffReleaseAction"
    // InternalRepoLang.g:1435:1: entryRuleSeffReleaseAction returns [EObject current=null] : iv_ruleSeffReleaseAction= ruleSeffReleaseAction EOF ;
    public final EObject entryRuleSeffReleaseAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeffReleaseAction = null;


        try {
            // InternalRepoLang.g:1435:58: (iv_ruleSeffReleaseAction= ruleSeffReleaseAction EOF )
            // InternalRepoLang.g:1436:2: iv_ruleSeffReleaseAction= ruleSeffReleaseAction EOF
            {
             newCompositeNode(grammarAccess.getSeffReleaseActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeffReleaseAction=ruleSeffReleaseAction();

            state._fsp--;

             current =iv_ruleSeffReleaseAction; 
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
    // $ANTLR end "entryRuleSeffReleaseAction"


    // $ANTLR start "ruleSeffReleaseAction"
    // InternalRepoLang.g:1442:1: ruleSeffReleaseAction returns [EObject current=null] : (otherlv_0= 'REL' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= ')' )? ) ;
    public final EObject ruleSeffReleaseAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_amount_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalRepoLang.g:1448:2: ( (otherlv_0= 'REL' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= ')' )? ) )
            // InternalRepoLang.g:1449:2: (otherlv_0= 'REL' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= ')' )? )
            {
            // InternalRepoLang.g:1449:2: (otherlv_0= 'REL' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= ')' )? )
            // InternalRepoLang.g:1450:3: otherlv_0= 'REL' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSeffReleaseActionAccess().getRELKeyword_0());
            		
            // InternalRepoLang.g:1454:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==RULE_ID) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalRepoLang.g:1455:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalRepoLang.g:1455:4: (lv_name_1_0= RULE_ID )
                    // InternalRepoLang.g:1456:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getSeffReleaseActionAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSeffReleaseActionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalRepoLang.g:1472:3: ( (otherlv_2= RULE_ID ) )
            // InternalRepoLang.g:1473:4: (otherlv_2= RULE_ID )
            {
            // InternalRepoLang.g:1473:4: (otherlv_2= RULE_ID )
            // InternalRepoLang.g:1474:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSeffReleaseActionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_2, grammarAccess.getSeffReleaseActionAccess().getResourcePassiveResourceCrossReference_2_0());
            				

            }


            }

            // InternalRepoLang.g:1485:3: (otherlv_3= '(' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==19) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRepoLang.g:1486:4: otherlv_3= '(' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_28); 

                    				newLeafNode(otherlv_3, grammarAccess.getSeffReleaseActionAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalRepoLang.g:1490:4: ( (lv_amount_4_0= RULE_INT ) )
                    // InternalRepoLang.g:1491:5: (lv_amount_4_0= RULE_INT )
                    {
                    // InternalRepoLang.g:1491:5: (lv_amount_4_0= RULE_INT )
                    // InternalRepoLang.g:1492:6: lv_amount_4_0= RULE_INT
                    {
                    lv_amount_4_0=(Token)match(input,RULE_INT,FOLLOW_29); 

                    						newLeafNode(lv_amount_4_0, grammarAccess.getSeffReleaseActionAccess().getAmountINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSeffReleaseActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"amount",
                    							lv_amount_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSeffReleaseActionAccess().getRightParenthesisKeyword_3_2());
                    			

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
    // $ANTLR end "ruleSeffReleaseAction"


    // $ANTLR start "entryRuleSeffLoopAction"
    // InternalRepoLang.g:1517:1: entryRuleSeffLoopAction returns [EObject current=null] : iv_ruleSeffLoopAction= ruleSeffLoopAction EOF ;
    public final EObject entryRuleSeffLoopAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeffLoopAction = null;


        try {
            // InternalRepoLang.g:1517:55: (iv_ruleSeffLoopAction= ruleSeffLoopAction EOF )
            // InternalRepoLang.g:1518:2: iv_ruleSeffLoopAction= ruleSeffLoopAction EOF
            {
             newCompositeNode(grammarAccess.getSeffLoopActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeffLoopAction=ruleSeffLoopAction();

            state._fsp--;

             current =iv_ruleSeffLoopAction; 
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
    // $ANTLR end "entryRuleSeffLoopAction"


    // $ANTLR start "ruleSeffLoopAction"
    // InternalRepoLang.g:1524:1: ruleSeffLoopAction returns [EObject current=null] : (otherlv_0= 'LOOP' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_count_3_0= RULE_STRING ) ) otherlv_4= ')' ( (lv_actions_5_0= ruleSubSeff ) ) ) ;
    public final EObject ruleSeffLoopAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_count_3_0=null;
        Token otherlv_4=null;
        EObject lv_actions_5_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:1530:2: ( (otherlv_0= 'LOOP' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_count_3_0= RULE_STRING ) ) otherlv_4= ')' ( (lv_actions_5_0= ruleSubSeff ) ) ) )
            // InternalRepoLang.g:1531:2: (otherlv_0= 'LOOP' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_count_3_0= RULE_STRING ) ) otherlv_4= ')' ( (lv_actions_5_0= ruleSubSeff ) ) )
            {
            // InternalRepoLang.g:1531:2: (otherlv_0= 'LOOP' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_count_3_0= RULE_STRING ) ) otherlv_4= ')' ( (lv_actions_5_0= ruleSubSeff ) ) )
            // InternalRepoLang.g:1532:3: otherlv_0= 'LOOP' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_count_3_0= RULE_STRING ) ) otherlv_4= ')' ( (lv_actions_5_0= ruleSubSeff ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getSeffLoopActionAccess().getLOOPKeyword_0());
            		
            // InternalRepoLang.g:1536:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRepoLang.g:1537:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalRepoLang.g:1537:4: (lv_name_1_0= RULE_ID )
                    // InternalRepoLang.g:1538:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getSeffLoopActionAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSeffLoopActionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,19,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getSeffLoopActionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalRepoLang.g:1558:3: ( (lv_count_3_0= RULE_STRING ) )
            // InternalRepoLang.g:1559:4: (lv_count_3_0= RULE_STRING )
            {
            // InternalRepoLang.g:1559:4: (lv_count_3_0= RULE_STRING )
            // InternalRepoLang.g:1560:5: lv_count_3_0= RULE_STRING
            {
            lv_count_3_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_count_3_0, grammarAccess.getSeffLoopActionAccess().getCountSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSeffLoopActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"count",
            						lv_count_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getSeffLoopActionAccess().getRightParenthesisKeyword_4());
            		
            // InternalRepoLang.g:1580:3: ( (lv_actions_5_0= ruleSubSeff ) )
            // InternalRepoLang.g:1581:4: (lv_actions_5_0= ruleSubSeff )
            {
            // InternalRepoLang.g:1581:4: (lv_actions_5_0= ruleSubSeff )
            // InternalRepoLang.g:1582:5: lv_actions_5_0= ruleSubSeff
            {

            					newCompositeNode(grammarAccess.getSeffLoopActionAccess().getActionsSubSeffParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_actions_5_0=ruleSubSeff();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeffLoopActionRule());
            					}
            					set(
            						current,
            						"actions",
            						lv_actions_5_0,
            						"com.palladiosimulator.textual.repository.RepoLang.SubSeff");
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
    // $ANTLR end "ruleSeffLoopAction"


    // $ANTLR start "entryRuleSeffSetReturnAction"
    // InternalRepoLang.g:1603:1: entryRuleSeffSetReturnAction returns [EObject current=null] : iv_ruleSeffSetReturnAction= ruleSeffSetReturnAction EOF ;
    public final EObject entryRuleSeffSetReturnAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeffSetReturnAction = null;


        try {
            // InternalRepoLang.g:1603:60: (iv_ruleSeffSetReturnAction= ruleSeffSetReturnAction EOF )
            // InternalRepoLang.g:1604:2: iv_ruleSeffSetReturnAction= ruleSeffSetReturnAction EOF
            {
             newCompositeNode(grammarAccess.getSeffSetReturnActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeffSetReturnAction=ruleSeffSetReturnAction();

            state._fsp--;

             current =iv_ruleSeffSetReturnAction; 
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
    // $ANTLR end "entryRuleSeffSetReturnAction"


    // $ANTLR start "ruleSeffSetReturnAction"
    // InternalRepoLang.g:1610:1: ruleSeffSetReturnAction returns [EObject current=null] : (otherlv_0= 'RET' ( (lv_name_1_0= RULE_ID ) )? ( (lv_returnValue_2_0= ruleSeffReturnParameter ) ) ) ;
    public final EObject ruleSeffSetReturnAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_returnValue_2_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:1616:2: ( (otherlv_0= 'RET' ( (lv_name_1_0= RULE_ID ) )? ( (lv_returnValue_2_0= ruleSeffReturnParameter ) ) ) )
            // InternalRepoLang.g:1617:2: (otherlv_0= 'RET' ( (lv_name_1_0= RULE_ID ) )? ( (lv_returnValue_2_0= ruleSeffReturnParameter ) ) )
            {
            // InternalRepoLang.g:1617:2: (otherlv_0= 'RET' ( (lv_name_1_0= RULE_ID ) )? ( (lv_returnValue_2_0= ruleSeffReturnParameter ) ) )
            // InternalRepoLang.g:1618:3: otherlv_0= 'RET' ( (lv_name_1_0= RULE_ID ) )? ( (lv_returnValue_2_0= ruleSeffReturnParameter ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getSeffSetReturnActionAccess().getRETKeyword_0());
            		
            // InternalRepoLang.g:1622:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRepoLang.g:1623:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalRepoLang.g:1623:4: (lv_name_1_0= RULE_ID )
                    // InternalRepoLang.g:1624:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getSeffSetReturnActionAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSeffSetReturnActionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalRepoLang.g:1640:3: ( (lv_returnValue_2_0= ruleSeffReturnParameter ) )
            // InternalRepoLang.g:1641:4: (lv_returnValue_2_0= ruleSeffReturnParameter )
            {
            // InternalRepoLang.g:1641:4: (lv_returnValue_2_0= ruleSeffReturnParameter )
            // InternalRepoLang.g:1642:5: lv_returnValue_2_0= ruleSeffReturnParameter
            {

            					newCompositeNode(grammarAccess.getSeffSetReturnActionAccess().getReturnValueSeffReturnParameterParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_returnValue_2_0=ruleSeffReturnParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeffSetReturnActionRule());
            					}
            					set(
            						current,
            						"returnValue",
            						lv_returnValue_2_0,
            						"com.palladiosimulator.textual.repository.RepoLang.SeffReturnParameter");
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
    // $ANTLR end "ruleSeffSetReturnAction"


    // $ANTLR start "entryRuleSeffSetVariableAction"
    // InternalRepoLang.g:1663:1: entryRuleSeffSetVariableAction returns [EObject current=null] : iv_ruleSeffSetVariableAction= ruleSeffSetVariableAction EOF ;
    public final EObject entryRuleSeffSetVariableAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeffSetVariableAction = null;


        try {
            // InternalRepoLang.g:1663:62: (iv_ruleSeffSetVariableAction= ruleSeffSetVariableAction EOF )
            // InternalRepoLang.g:1664:2: iv_ruleSeffSetVariableAction= ruleSeffSetVariableAction EOF
            {
             newCompositeNode(grammarAccess.getSeffSetVariableActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeffSetVariableAction=ruleSeffSetVariableAction();

            state._fsp--;

             current =iv_ruleSeffSetVariableAction; 
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
    // $ANTLR end "entryRuleSeffSetVariableAction"


    // $ANTLR start "ruleSeffSetVariableAction"
    // InternalRepoLang.g:1670:1: ruleSeffSetVariableAction returns [EObject current=null] : (otherlv_0= 'SET' ( (lv_name_1_0= RULE_ID ) )? ( (lv_setValues_2_0= ruleSeffReferenceParameter ) )+ ) ;
    public final EObject ruleSeffSetVariableAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_setValues_2_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:1676:2: ( (otherlv_0= 'SET' ( (lv_name_1_0= RULE_ID ) )? ( (lv_setValues_2_0= ruleSeffReferenceParameter ) )+ ) )
            // InternalRepoLang.g:1677:2: (otherlv_0= 'SET' ( (lv_name_1_0= RULE_ID ) )? ( (lv_setValues_2_0= ruleSeffReferenceParameter ) )+ )
            {
            // InternalRepoLang.g:1677:2: (otherlv_0= 'SET' ( (lv_name_1_0= RULE_ID ) )? ( (lv_setValues_2_0= ruleSeffReferenceParameter ) )+ )
            // InternalRepoLang.g:1678:3: otherlv_0= 'SET' ( (lv_name_1_0= RULE_ID ) )? ( (lv_setValues_2_0= ruleSeffReferenceParameter ) )+
            {
            otherlv_0=(Token)match(input,38,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getSeffSetVariableActionAccess().getSETKeyword_0());
            		
            // InternalRepoLang.g:1682:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRepoLang.g:1683:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalRepoLang.g:1683:4: (lv_name_1_0= RULE_ID )
                    // InternalRepoLang.g:1684:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getSeffSetVariableActionAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSeffSetVariableActionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalRepoLang.g:1700:3: ( (lv_setValues_2_0= ruleSeffReferenceParameter ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_STRING) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRepoLang.g:1701:4: (lv_setValues_2_0= ruleSeffReferenceParameter )
            	    {
            	    // InternalRepoLang.g:1701:4: (lv_setValues_2_0= ruleSeffReferenceParameter )
            	    // InternalRepoLang.g:1702:5: lv_setValues_2_0= ruleSeffReferenceParameter
            	    {

            	    					newCompositeNode(grammarAccess.getSeffSetVariableActionAccess().getSetValuesSeffReferenceParameterParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_setValues_2_0=ruleSeffReferenceParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSeffSetVariableActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"setValues",
            	    						lv_setValues_2_0,
            	    						"com.palladiosimulator.textual.repository.RepoLang.SeffReferenceParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
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
    // $ANTLR end "ruleSeffSetVariableAction"


    // $ANTLR start "entryRuleSeffExternalCallAction"
    // InternalRepoLang.g:1723:1: entryRuleSeffExternalCallAction returns [EObject current=null] : iv_ruleSeffExternalCallAction= ruleSeffExternalCallAction EOF ;
    public final EObject entryRuleSeffExternalCallAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeffExternalCallAction = null;


        try {
            // InternalRepoLang.g:1723:63: (iv_ruleSeffExternalCallAction= ruleSeffExternalCallAction EOF )
            // InternalRepoLang.g:1724:2: iv_ruleSeffExternalCallAction= ruleSeffExternalCallAction EOF
            {
             newCompositeNode(grammarAccess.getSeffExternalCallActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeffExternalCallAction=ruleSeffExternalCallAction();

            state._fsp--;

             current =iv_ruleSeffExternalCallAction; 
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
    // $ANTLR end "entryRuleSeffExternalCallAction"


    // $ANTLR start "ruleSeffExternalCallAction"
    // InternalRepoLang.g:1730:1: ruleSeffExternalCallAction returns [EObject current=null] : (otherlv_0= 'EXT' ( (lv_name_1_0= RULE_ID ) )? ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' )? ( ( ruleFQN ) ) (otherlv_5= '{' ( (lv_bindings_6_0= ruleSeffCallParameter ) )+ (otherlv_7= 'RETURN:' ( (lv_returning_8_0= ruleSeffReferenceParameter ) )+ )? otherlv_9= '}' )? ) ;
    public final EObject ruleSeffExternalCallAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_bindings_6_0 = null;

        EObject lv_returning_8_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:1736:2: ( (otherlv_0= 'EXT' ( (lv_name_1_0= RULE_ID ) )? ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' )? ( ( ruleFQN ) ) (otherlv_5= '{' ( (lv_bindings_6_0= ruleSeffCallParameter ) )+ (otherlv_7= 'RETURN:' ( (lv_returning_8_0= ruleSeffReferenceParameter ) )+ )? otherlv_9= '}' )? ) )
            // InternalRepoLang.g:1737:2: (otherlv_0= 'EXT' ( (lv_name_1_0= RULE_ID ) )? ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' )? ( ( ruleFQN ) ) (otherlv_5= '{' ( (lv_bindings_6_0= ruleSeffCallParameter ) )+ (otherlv_7= 'RETURN:' ( (lv_returning_8_0= ruleSeffReferenceParameter ) )+ )? otherlv_9= '}' )? )
            {
            // InternalRepoLang.g:1737:2: (otherlv_0= 'EXT' ( (lv_name_1_0= RULE_ID ) )? ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' )? ( ( ruleFQN ) ) (otherlv_5= '{' ( (lv_bindings_6_0= ruleSeffCallParameter ) )+ (otherlv_7= 'RETURN:' ( (lv_returning_8_0= ruleSeffReferenceParameter ) )+ )? otherlv_9= '}' )? )
            // InternalRepoLang.g:1738:3: otherlv_0= 'EXT' ( (lv_name_1_0= RULE_ID ) )? ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' )? ( ( ruleFQN ) ) (otherlv_5= '{' ( (lv_bindings_6_0= ruleSeffCallParameter ) )+ (otherlv_7= 'RETURN:' ( (lv_returning_8_0= ruleSeffReferenceParameter ) )+ )? otherlv_9= '}' )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSeffExternalCallActionAccess().getEXTKeyword_0());
            		
            // InternalRepoLang.g:1742:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==RULE_ID) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // InternalRepoLang.g:1743:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalRepoLang.g:1743:4: (lv_name_1_0= RULE_ID )
                    // InternalRepoLang.g:1744:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getSeffExternalCallActionAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSeffExternalCallActionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalRepoLang.g:1760:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==40) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // InternalRepoLang.g:1761:4: ( (otherlv_2= RULE_ID ) ) otherlv_3= '->'
                    {
                    // InternalRepoLang.g:1761:4: ( (otherlv_2= RULE_ID ) )
                    // InternalRepoLang.g:1762:5: (otherlv_2= RULE_ID )
                    {
                    // InternalRepoLang.g:1762:5: (otherlv_2= RULE_ID )
                    // InternalRepoLang.g:1763:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSeffExternalCallActionRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_34); 

                    						newLeafNode(otherlv_2, grammarAccess.getSeffExternalCallActionAccess().getRoleRoleSpecificationCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSeffExternalCallActionAccess().getHyphenMinusGreaterThanSignKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalRepoLang.g:1779:3: ( ( ruleFQN ) )
            // InternalRepoLang.g:1780:4: ( ruleFQN )
            {
            // InternalRepoLang.g:1780:4: ( ruleFQN )
            // InternalRepoLang.g:1781:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSeffExternalCallActionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSeffExternalCallActionAccess().getCalledSignatureCrossReference_3_0());
            				
            pushFollow(FOLLOW_11);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRepoLang.g:1795:3: (otherlv_5= '{' ( (lv_bindings_6_0= ruleSeffCallParameter ) )+ (otherlv_7= 'RETURN:' ( (lv_returning_8_0= ruleSeffReferenceParameter ) )+ )? otherlv_9= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==15) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRepoLang.g:1796:4: otherlv_5= '{' ( (lv_bindings_6_0= ruleSeffCallParameter ) )+ (otherlv_7= 'RETURN:' ( (lv_returning_8_0= ruleSeffReferenceParameter ) )+ )? otherlv_9= '}'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_32); 

                    				newLeafNode(otherlv_5, grammarAccess.getSeffExternalCallActionAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalRepoLang.g:1800:4: ( (lv_bindings_6_0= ruleSeffCallParameter ) )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_STRING)) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalRepoLang.g:1801:5: (lv_bindings_6_0= ruleSeffCallParameter )
                    	    {
                    	    // InternalRepoLang.g:1801:5: (lv_bindings_6_0= ruleSeffCallParameter )
                    	    // InternalRepoLang.g:1802:6: lv_bindings_6_0= ruleSeffCallParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getSeffExternalCallActionAccess().getBindingsSeffCallParameterParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_35);
                    	    lv_bindings_6_0=ruleSeffCallParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSeffExternalCallActionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"bindings",
                    	    							lv_bindings_6_0,
                    	    							"com.palladiosimulator.textual.repository.RepoLang.SeffCallParameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt36 >= 1 ) break loop36;
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);

                    // InternalRepoLang.g:1819:4: (otherlv_7= 'RETURN:' ( (lv_returning_8_0= ruleSeffReferenceParameter ) )+ )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==41) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalRepoLang.g:1820:5: otherlv_7= 'RETURN:' ( (lv_returning_8_0= ruleSeffReferenceParameter ) )+
                            {
                            otherlv_7=(Token)match(input,41,FOLLOW_32); 

                            					newLeafNode(otherlv_7, grammarAccess.getSeffExternalCallActionAccess().getRETURNKeyword_4_2_0());
                            				
                            // InternalRepoLang.g:1824:5: ( (lv_returning_8_0= ruleSeffReferenceParameter ) )+
                            int cnt37=0;
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==RULE_STRING) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // InternalRepoLang.g:1825:6: (lv_returning_8_0= ruleSeffReferenceParameter )
                            	    {
                            	    // InternalRepoLang.g:1825:6: (lv_returning_8_0= ruleSeffReferenceParameter )
                            	    // InternalRepoLang.g:1826:7: lv_returning_8_0= ruleSeffReferenceParameter
                            	    {

                            	    							newCompositeNode(grammarAccess.getSeffExternalCallActionAccess().getReturningSeffReferenceParameterParserRuleCall_4_2_1_0());
                            	    						
                            	    pushFollow(FOLLOW_36);
                            	    lv_returning_8_0=ruleSeffReferenceParameter();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getSeffExternalCallActionRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"returning",
                            	    								lv_returning_8_0,
                            	    								"com.palladiosimulator.textual.repository.RepoLang.SeffReferenceParameter");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt37 >= 1 ) break loop37;
                                        EarlyExitException eee =
                                            new EarlyExitException(37, input);
                                        throw eee;
                                }
                                cnt37++;
                            } while (true);


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getSeffExternalCallActionAccess().getRightCurlyBracketKeyword_4_3());
                    			

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
    // $ANTLR end "ruleSeffExternalCallAction"


    // $ANTLR start "entryRuleSeffCallParameter"
    // InternalRepoLang.g:1853:1: entryRuleSeffCallParameter returns [EObject current=null] : iv_ruleSeffCallParameter= ruleSeffCallParameter EOF ;
    public final EObject entryRuleSeffCallParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeffCallParameter = null;


        try {
            // InternalRepoLang.g:1853:58: (iv_ruleSeffCallParameter= ruleSeffCallParameter EOF )
            // InternalRepoLang.g:1854:2: iv_ruleSeffCallParameter= ruleSeffCallParameter EOF
            {
             newCompositeNode(grammarAccess.getSeffCallParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeffCallParameter=ruleSeffCallParameter();

            state._fsp--;

             current =iv_ruleSeffCallParameter; 
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
    // $ANTLR end "entryRuleSeffCallParameter"


    // $ANTLR start "ruleSeffCallParameter"
    // InternalRepoLang.g:1860:1: ruleSeffCallParameter returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_referenceName_1_0= RULE_STRING ) ) ) otherlv_2= '(' ( (lv_values_3_0= ruleSeffVariableChar ) )+ otherlv_4= ')' ) ;
    public final EObject ruleSeffCallParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_referenceName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:1866:2: ( ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_referenceName_1_0= RULE_STRING ) ) ) otherlv_2= '(' ( (lv_values_3_0= ruleSeffVariableChar ) )+ otherlv_4= ')' ) )
            // InternalRepoLang.g:1867:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_referenceName_1_0= RULE_STRING ) ) ) otherlv_2= '(' ( (lv_values_3_0= ruleSeffVariableChar ) )+ otherlv_4= ')' )
            {
            // InternalRepoLang.g:1867:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_referenceName_1_0= RULE_STRING ) ) ) otherlv_2= '(' ( (lv_values_3_0= ruleSeffVariableChar ) )+ otherlv_4= ')' )
            // InternalRepoLang.g:1868:3: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_referenceName_1_0= RULE_STRING ) ) ) otherlv_2= '(' ( (lv_values_3_0= ruleSeffVariableChar ) )+ otherlv_4= ')'
            {
            // InternalRepoLang.g:1868:3: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_referenceName_1_0= RULE_STRING ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_STRING) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalRepoLang.g:1869:4: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalRepoLang.g:1869:4: ( (otherlv_0= RULE_ID ) )
                    // InternalRepoLang.g:1870:5: (otherlv_0= RULE_ID )
                    {
                    // InternalRepoLang.g:1870:5: (otherlv_0= RULE_ID )
                    // InternalRepoLang.g:1871:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSeffCallParameterRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_31); 

                    						newLeafNode(otherlv_0, grammarAccess.getSeffCallParameterAccess().getParameterSignatureParameterCrossReference_0_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRepoLang.g:1883:4: ( (lv_referenceName_1_0= RULE_STRING ) )
                    {
                    // InternalRepoLang.g:1883:4: ( (lv_referenceName_1_0= RULE_STRING ) )
                    // InternalRepoLang.g:1884:5: (lv_referenceName_1_0= RULE_STRING )
                    {
                    // InternalRepoLang.g:1884:5: (lv_referenceName_1_0= RULE_STRING )
                    // InternalRepoLang.g:1885:6: lv_referenceName_1_0= RULE_STRING
                    {
                    lv_referenceName_1_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

                    						newLeafNode(lv_referenceName_1_0, grammarAccess.getSeffCallParameterAccess().getReferenceNameSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSeffCallParameterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"referenceName",
                    							lv_referenceName_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,19,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getSeffCallParameterAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRepoLang.g:1906:3: ( (lv_values_3_0= ruleSeffVariableChar ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=49 && LA41_0<=53)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalRepoLang.g:1907:4: (lv_values_3_0= ruleSeffVariableChar )
            	    {
            	    // InternalRepoLang.g:1907:4: (lv_values_3_0= ruleSeffVariableChar )
            	    // InternalRepoLang.g:1908:5: lv_values_3_0= ruleSeffVariableChar
            	    {

            	    					newCompositeNode(grammarAccess.getSeffCallParameterAccess().getValuesSeffVariableCharParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_38);
            	    lv_values_3_0=ruleSeffVariableChar();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSeffCallParameterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"values",
            	    						lv_values_3_0,
            	    						"com.palladiosimulator.textual.repository.RepoLang.SeffVariableChar");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSeffCallParameterAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleSeffCallParameter"


    // $ANTLR start "entryRuleSeffReferenceParameter"
    // InternalRepoLang.g:1933:1: entryRuleSeffReferenceParameter returns [EObject current=null] : iv_ruleSeffReferenceParameter= ruleSeffReferenceParameter EOF ;
    public final EObject entryRuleSeffReferenceParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeffReferenceParameter = null;


        try {
            // InternalRepoLang.g:1933:63: (iv_ruleSeffReferenceParameter= ruleSeffReferenceParameter EOF )
            // InternalRepoLang.g:1934:2: iv_ruleSeffReferenceParameter= ruleSeffReferenceParameter EOF
            {
             newCompositeNode(grammarAccess.getSeffReferenceParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeffReferenceParameter=ruleSeffReferenceParameter();

            state._fsp--;

             current =iv_ruleSeffReferenceParameter; 
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
    // $ANTLR end "entryRuleSeffReferenceParameter"


    // $ANTLR start "ruleSeffReferenceParameter"
    // InternalRepoLang.g:1940:1: ruleSeffReferenceParameter returns [EObject current=null] : ( ( (lv_referenceName_0_0= RULE_STRING ) ) otherlv_1= '(' ( (lv_values_2_0= ruleSeffVariableChar ) )+ otherlv_3= ')' ) ;
    public final EObject ruleSeffReferenceParameter() throws RecognitionException {
        EObject current = null;

        Token lv_referenceName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:1946:2: ( ( ( (lv_referenceName_0_0= RULE_STRING ) ) otherlv_1= '(' ( (lv_values_2_0= ruleSeffVariableChar ) )+ otherlv_3= ')' ) )
            // InternalRepoLang.g:1947:2: ( ( (lv_referenceName_0_0= RULE_STRING ) ) otherlv_1= '(' ( (lv_values_2_0= ruleSeffVariableChar ) )+ otherlv_3= ')' )
            {
            // InternalRepoLang.g:1947:2: ( ( (lv_referenceName_0_0= RULE_STRING ) ) otherlv_1= '(' ( (lv_values_2_0= ruleSeffVariableChar ) )+ otherlv_3= ')' )
            // InternalRepoLang.g:1948:3: ( (lv_referenceName_0_0= RULE_STRING ) ) otherlv_1= '(' ( (lv_values_2_0= ruleSeffVariableChar ) )+ otherlv_3= ')'
            {
            // InternalRepoLang.g:1948:3: ( (lv_referenceName_0_0= RULE_STRING ) )
            // InternalRepoLang.g:1949:4: (lv_referenceName_0_0= RULE_STRING )
            {
            // InternalRepoLang.g:1949:4: (lv_referenceName_0_0= RULE_STRING )
            // InternalRepoLang.g:1950:5: lv_referenceName_0_0= RULE_STRING
            {
            lv_referenceName_0_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(lv_referenceName_0_0, grammarAccess.getSeffReferenceParameterAccess().getReferenceNameSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSeffReferenceParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"referenceName",
            						lv_referenceName_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getSeffReferenceParameterAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRepoLang.g:1970:3: ( (lv_values_2_0= ruleSeffVariableChar ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=49 && LA42_0<=53)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalRepoLang.g:1971:4: (lv_values_2_0= ruleSeffVariableChar )
            	    {
            	    // InternalRepoLang.g:1971:4: (lv_values_2_0= ruleSeffVariableChar )
            	    // InternalRepoLang.g:1972:5: lv_values_2_0= ruleSeffVariableChar
            	    {

            	    					newCompositeNode(grammarAccess.getSeffReferenceParameterAccess().getValuesSeffVariableCharParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_38);
            	    lv_values_2_0=ruleSeffVariableChar();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSeffReferenceParameterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"values",
            	    						lv_values_2_0,
            	    						"com.palladiosimulator.textual.repository.RepoLang.SeffVariableChar");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSeffReferenceParameterAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleSeffReferenceParameter"


    // $ANTLR start "entryRuleSeffReturnParameter"
    // InternalRepoLang.g:1997:1: entryRuleSeffReturnParameter returns [EObject current=null] : iv_ruleSeffReturnParameter= ruleSeffReturnParameter EOF ;
    public final EObject entryRuleSeffReturnParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeffReturnParameter = null;


        try {
            // InternalRepoLang.g:1997:60: (iv_ruleSeffReturnParameter= ruleSeffReturnParameter EOF )
            // InternalRepoLang.g:1998:2: iv_ruleSeffReturnParameter= ruleSeffReturnParameter EOF
            {
             newCompositeNode(grammarAccess.getSeffReturnParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeffReturnParameter=ruleSeffReturnParameter();

            state._fsp--;

             current =iv_ruleSeffReturnParameter; 
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
    // $ANTLR end "entryRuleSeffReturnParameter"


    // $ANTLR start "ruleSeffReturnParameter"
    // InternalRepoLang.g:2004:1: ruleSeffReturnParameter returns [EObject current=null] : (otherlv_0= '(' ( (lv_values_1_0= ruleSeffVariableChar ) )+ otherlv_2= ')' ) ;
    public final EObject ruleSeffReturnParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_values_1_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:2010:2: ( (otherlv_0= '(' ( (lv_values_1_0= ruleSeffVariableChar ) )+ otherlv_2= ')' ) )
            // InternalRepoLang.g:2011:2: (otherlv_0= '(' ( (lv_values_1_0= ruleSeffVariableChar ) )+ otherlv_2= ')' )
            {
            // InternalRepoLang.g:2011:2: (otherlv_0= '(' ( (lv_values_1_0= ruleSeffVariableChar ) )+ otherlv_2= ')' )
            // InternalRepoLang.g:2012:3: otherlv_0= '(' ( (lv_values_1_0= ruleSeffVariableChar ) )+ otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getSeffReturnParameterAccess().getLeftParenthesisKeyword_0());
            		
            // InternalRepoLang.g:2016:3: ( (lv_values_1_0= ruleSeffVariableChar ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=49 && LA43_0<=53)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalRepoLang.g:2017:4: (lv_values_1_0= ruleSeffVariableChar )
            	    {
            	    // InternalRepoLang.g:2017:4: (lv_values_1_0= ruleSeffVariableChar )
            	    // InternalRepoLang.g:2018:5: lv_values_1_0= ruleSeffVariableChar
            	    {

            	    					newCompositeNode(grammarAccess.getSeffReturnParameterAccess().getValuesSeffVariableCharParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_38);
            	    lv_values_1_0=ruleSeffVariableChar();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSeffReturnParameterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"values",
            	    						lv_values_1_0,
            	    						"com.palladiosimulator.textual.repository.RepoLang.SeffVariableChar");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getSeffReturnParameterAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleSeffReturnParameter"


    // $ANTLR start "entryRuleSeffVariableChar"
    // InternalRepoLang.g:2043:1: entryRuleSeffVariableChar returns [EObject current=null] : iv_ruleSeffVariableChar= ruleSeffVariableChar EOF ;
    public final EObject entryRuleSeffVariableChar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeffVariableChar = null;


        try {
            // InternalRepoLang.g:2043:57: (iv_ruleSeffVariableChar= ruleSeffVariableChar EOF )
            // InternalRepoLang.g:2044:2: iv_ruleSeffVariableChar= ruleSeffVariableChar EOF
            {
             newCompositeNode(grammarAccess.getSeffVariableCharRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeffVariableChar=ruleSeffVariableChar();

            state._fsp--;

             current =iv_ruleSeffVariableChar; 
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
    // $ANTLR end "entryRuleSeffVariableChar"


    // $ANTLR start "ruleSeffVariableChar"
    // InternalRepoLang.g:2050:1: ruleSeffVariableChar returns [EObject current=null] : ( ( (lv_characterisationType_0_0= ruleCharType ) ) otherlv_1= ':=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSeffVariableChar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_characterisationType_0_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:2056:2: ( ( ( (lv_characterisationType_0_0= ruleCharType ) ) otherlv_1= ':=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalRepoLang.g:2057:2: ( ( (lv_characterisationType_0_0= ruleCharType ) ) otherlv_1= ':=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalRepoLang.g:2057:2: ( ( (lv_characterisationType_0_0= ruleCharType ) ) otherlv_1= ':=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalRepoLang.g:2058:3: ( (lv_characterisationType_0_0= ruleCharType ) ) otherlv_1= ':=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalRepoLang.g:2058:3: ( (lv_characterisationType_0_0= ruleCharType ) )
            // InternalRepoLang.g:2059:4: (lv_characterisationType_0_0= ruleCharType )
            {
            // InternalRepoLang.g:2059:4: (lv_characterisationType_0_0= ruleCharType )
            // InternalRepoLang.g:2060:5: lv_characterisationType_0_0= ruleCharType
            {

            					newCompositeNode(grammarAccess.getSeffVariableCharAccess().getCharacterisationTypeCharTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_39);
            lv_characterisationType_0_0=ruleCharType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeffVariableCharRule());
            					}
            					set(
            						current,
            						"characterisationType",
            						lv_characterisationType_0_0,
            						"com.palladiosimulator.textual.repository.RepoLang.CharType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getSeffVariableCharAccess().getColonEqualsSignKeyword_1());
            		
            // InternalRepoLang.g:2081:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalRepoLang.g:2082:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalRepoLang.g:2082:4: (lv_value_2_0= RULE_STRING )
            // InternalRepoLang.g:2083:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getSeffVariableCharAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSeffVariableCharRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleSeffVariableChar"


    // $ANTLR start "entryRuleSeffProbabilisticBranchAction"
    // InternalRepoLang.g:2103:1: entryRuleSeffProbabilisticBranchAction returns [EObject current=null] : iv_ruleSeffProbabilisticBranchAction= ruleSeffProbabilisticBranchAction EOF ;
    public final EObject entryRuleSeffProbabilisticBranchAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeffProbabilisticBranchAction = null;


        try {
            // InternalRepoLang.g:2103:70: (iv_ruleSeffProbabilisticBranchAction= ruleSeffProbabilisticBranchAction EOF )
            // InternalRepoLang.g:2104:2: iv_ruleSeffProbabilisticBranchAction= ruleSeffProbabilisticBranchAction EOF
            {
             newCompositeNode(grammarAccess.getSeffProbabilisticBranchActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeffProbabilisticBranchAction=ruleSeffProbabilisticBranchAction();

            state._fsp--;

             current =iv_ruleSeffProbabilisticBranchAction; 
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
    // $ANTLR end "entryRuleSeffProbabilisticBranchAction"


    // $ANTLR start "ruleSeffProbabilisticBranchAction"
    // InternalRepoLang.g:2110:1: ruleSeffProbabilisticBranchAction returns [EObject current=null] : (otherlv_0= 'PBR' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_branches_3_0= ruleSeffProbabilisticBranch ) )+ otherlv_4= '}' ) ;
    public final EObject ruleSeffProbabilisticBranchAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_branches_3_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:2116:2: ( (otherlv_0= 'PBR' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_branches_3_0= ruleSeffProbabilisticBranch ) )+ otherlv_4= '}' ) )
            // InternalRepoLang.g:2117:2: (otherlv_0= 'PBR' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_branches_3_0= ruleSeffProbabilisticBranch ) )+ otherlv_4= '}' )
            {
            // InternalRepoLang.g:2117:2: (otherlv_0= 'PBR' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_branches_3_0= ruleSeffProbabilisticBranch ) )+ otherlv_4= '}' )
            // InternalRepoLang.g:2118:3: otherlv_0= 'PBR' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_branches_3_0= ruleSeffProbabilisticBranch ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getSeffProbabilisticBranchActionAccess().getPBRKeyword_0());
            		
            // InternalRepoLang.g:2122:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRepoLang.g:2123:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalRepoLang.g:2123:4: (lv_name_1_0= RULE_ID )
                    // InternalRepoLang.g:2124:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getSeffProbabilisticBranchActionAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSeffProbabilisticBranchActionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getSeffProbabilisticBranchActionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRepoLang.g:2144:3: ( (lv_branches_3_0= ruleSeffProbabilisticBranch ) )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_INT) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalRepoLang.g:2145:4: (lv_branches_3_0= ruleSeffProbabilisticBranch )
            	    {
            	    // InternalRepoLang.g:2145:4: (lv_branches_3_0= ruleSeffProbabilisticBranch )
            	    // InternalRepoLang.g:2146:5: lv_branches_3_0= ruleSeffProbabilisticBranch
            	    {

            	    					newCompositeNode(grammarAccess.getSeffProbabilisticBranchActionAccess().getBranchesSeffProbabilisticBranchParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_41);
            	    lv_branches_3_0=ruleSeffProbabilisticBranch();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSeffProbabilisticBranchActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"branches",
            	    						lv_branches_3_0,
            	    						"com.palladiosimulator.textual.repository.RepoLang.SeffProbabilisticBranch");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSeffProbabilisticBranchActionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSeffProbabilisticBranchAction"


    // $ANTLR start "entryRuleSeffProbabilisticBranch"
    // InternalRepoLang.g:2171:1: entryRuleSeffProbabilisticBranch returns [EObject current=null] : iv_ruleSeffProbabilisticBranch= ruleSeffProbabilisticBranch EOF ;
    public final EObject entryRuleSeffProbabilisticBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeffProbabilisticBranch = null;


        try {
            // InternalRepoLang.g:2171:64: (iv_ruleSeffProbabilisticBranch= ruleSeffProbabilisticBranch EOF )
            // InternalRepoLang.g:2172:2: iv_ruleSeffProbabilisticBranch= ruleSeffProbabilisticBranch EOF
            {
             newCompositeNode(grammarAccess.getSeffProbabilisticBranchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeffProbabilisticBranch=ruleSeffProbabilisticBranch();

            state._fsp--;

             current =iv_ruleSeffProbabilisticBranch; 
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
    // $ANTLR end "entryRuleSeffProbabilisticBranch"


    // $ANTLR start "ruleSeffProbabilisticBranch"
    // InternalRepoLang.g:2178:1: ruleSeffProbabilisticBranch returns [EObject current=null] : ( ( (lv_probability_0_0= ruleProbability ) ) otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) )? ( (lv_seff_3_0= ruleSubSeff ) ) ) ;
    public final EObject ruleSeffProbabilisticBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_probability_0_0 = null;

        EObject lv_seff_3_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:2184:2: ( ( ( (lv_probability_0_0= ruleProbability ) ) otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) )? ( (lv_seff_3_0= ruleSubSeff ) ) ) )
            // InternalRepoLang.g:2185:2: ( ( (lv_probability_0_0= ruleProbability ) ) otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) )? ( (lv_seff_3_0= ruleSubSeff ) ) )
            {
            // InternalRepoLang.g:2185:2: ( ( (lv_probability_0_0= ruleProbability ) ) otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) )? ( (lv_seff_3_0= ruleSubSeff ) ) )
            // InternalRepoLang.g:2186:3: ( (lv_probability_0_0= ruleProbability ) ) otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) )? ( (lv_seff_3_0= ruleSubSeff ) )
            {
            // InternalRepoLang.g:2186:3: ( (lv_probability_0_0= ruleProbability ) )
            // InternalRepoLang.g:2187:4: (lv_probability_0_0= ruleProbability )
            {
            // InternalRepoLang.g:2187:4: (lv_probability_0_0= ruleProbability )
            // InternalRepoLang.g:2188:5: lv_probability_0_0= ruleProbability
            {

            					newCompositeNode(grammarAccess.getSeffProbabilisticBranchAccess().getProbabilityProbabilityParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_probability_0_0=ruleProbability();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeffProbabilisticBranchRule());
            					}
            					set(
            						current,
            						"probability",
            						lv_probability_0_0,
            						"com.palladiosimulator.textual.repository.RepoLang.Probability");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getSeffProbabilisticBranchAccess().getColonKeyword_1());
            		
            // InternalRepoLang.g:2209:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRepoLang.g:2210:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalRepoLang.g:2210:4: (lv_name_2_0= RULE_ID )
                    // InternalRepoLang.g:2211:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getSeffProbabilisticBranchAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSeffProbabilisticBranchRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalRepoLang.g:2227:3: ( (lv_seff_3_0= ruleSubSeff ) )
            // InternalRepoLang.g:2228:4: (lv_seff_3_0= ruleSubSeff )
            {
            // InternalRepoLang.g:2228:4: (lv_seff_3_0= ruleSubSeff )
            // InternalRepoLang.g:2229:5: lv_seff_3_0= ruleSubSeff
            {

            					newCompositeNode(grammarAccess.getSeffProbabilisticBranchAccess().getSeffSubSeffParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_seff_3_0=ruleSubSeff();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeffProbabilisticBranchRule());
            					}
            					set(
            						current,
            						"seff",
            						lv_seff_3_0,
            						"com.palladiosimulator.textual.repository.RepoLang.SubSeff");
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
    // $ANTLR end "ruleSeffProbabilisticBranch"


    // $ANTLR start "entryRuleSeffGuardedBranchAction"
    // InternalRepoLang.g:2250:1: entryRuleSeffGuardedBranchAction returns [EObject current=null] : iv_ruleSeffGuardedBranchAction= ruleSeffGuardedBranchAction EOF ;
    public final EObject entryRuleSeffGuardedBranchAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeffGuardedBranchAction = null;


        try {
            // InternalRepoLang.g:2250:64: (iv_ruleSeffGuardedBranchAction= ruleSeffGuardedBranchAction EOF )
            // InternalRepoLang.g:2251:2: iv_ruleSeffGuardedBranchAction= ruleSeffGuardedBranchAction EOF
            {
             newCompositeNode(grammarAccess.getSeffGuardedBranchActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeffGuardedBranchAction=ruleSeffGuardedBranchAction();

            state._fsp--;

             current =iv_ruleSeffGuardedBranchAction; 
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
    // $ANTLR end "entryRuleSeffGuardedBranchAction"


    // $ANTLR start "ruleSeffGuardedBranchAction"
    // InternalRepoLang.g:2257:1: ruleSeffGuardedBranchAction returns [EObject current=null] : (otherlv_0= 'GBR' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_branches_3_0= ruleSeffGuardedBranch ) )+ otherlv_4= '}' ) ;
    public final EObject ruleSeffGuardedBranchAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_branches_3_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:2263:2: ( (otherlv_0= 'GBR' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_branches_3_0= ruleSeffGuardedBranch ) )+ otherlv_4= '}' ) )
            // InternalRepoLang.g:2264:2: (otherlv_0= 'GBR' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_branches_3_0= ruleSeffGuardedBranch ) )+ otherlv_4= '}' )
            {
            // InternalRepoLang.g:2264:2: (otherlv_0= 'GBR' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_branches_3_0= ruleSeffGuardedBranch ) )+ otherlv_4= '}' )
            // InternalRepoLang.g:2265:3: otherlv_0= 'GBR' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_branches_3_0= ruleSeffGuardedBranch ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getSeffGuardedBranchActionAccess().getGBRKeyword_0());
            		
            // InternalRepoLang.g:2269:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRepoLang.g:2270:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalRepoLang.g:2270:4: (lv_name_1_0= RULE_ID )
                    // InternalRepoLang.g:2271:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getSeffGuardedBranchActionAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSeffGuardedBranchActionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getSeffGuardedBranchActionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRepoLang.g:2291:3: ( (lv_branches_3_0= ruleSeffGuardedBranch ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_STRING) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalRepoLang.g:2292:4: (lv_branches_3_0= ruleSeffGuardedBranch )
            	    {
            	    // InternalRepoLang.g:2292:4: (lv_branches_3_0= ruleSeffGuardedBranch )
            	    // InternalRepoLang.g:2293:5: lv_branches_3_0= ruleSeffGuardedBranch
            	    {

            	    					newCompositeNode(grammarAccess.getSeffGuardedBranchActionAccess().getBranchesSeffGuardedBranchParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_42);
            	    lv_branches_3_0=ruleSeffGuardedBranch();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSeffGuardedBranchActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"branches",
            	    						lv_branches_3_0,
            	    						"com.palladiosimulator.textual.repository.RepoLang.SeffGuardedBranch");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSeffGuardedBranchActionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSeffGuardedBranchAction"


    // $ANTLR start "entryRuleSeffGuardedBranch"
    // InternalRepoLang.g:2318:1: entryRuleSeffGuardedBranch returns [EObject current=null] : iv_ruleSeffGuardedBranch= ruleSeffGuardedBranch EOF ;
    public final EObject entryRuleSeffGuardedBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeffGuardedBranch = null;


        try {
            // InternalRepoLang.g:2318:58: (iv_ruleSeffGuardedBranch= ruleSeffGuardedBranch EOF )
            // InternalRepoLang.g:2319:2: iv_ruleSeffGuardedBranch= ruleSeffGuardedBranch EOF
            {
             newCompositeNode(grammarAccess.getSeffGuardedBranchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeffGuardedBranch=ruleSeffGuardedBranch();

            state._fsp--;

             current =iv_ruleSeffGuardedBranch; 
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
    // $ANTLR end "entryRuleSeffGuardedBranch"


    // $ANTLR start "ruleSeffGuardedBranch"
    // InternalRepoLang.g:2325:1: ruleSeffGuardedBranch returns [EObject current=null] : ( ( (lv_condition_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) )? ( (lv_seff_3_0= ruleSubSeff ) ) ) ;
    public final EObject ruleSeffGuardedBranch() throws RecognitionException {
        EObject current = null;

        Token lv_condition_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_seff_3_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:2331:2: ( ( ( (lv_condition_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) )? ( (lv_seff_3_0= ruleSubSeff ) ) ) )
            // InternalRepoLang.g:2332:2: ( ( (lv_condition_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) )? ( (lv_seff_3_0= ruleSubSeff ) ) )
            {
            // InternalRepoLang.g:2332:2: ( ( (lv_condition_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) )? ( (lv_seff_3_0= ruleSubSeff ) ) )
            // InternalRepoLang.g:2333:3: ( (lv_condition_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) )? ( (lv_seff_3_0= ruleSubSeff ) )
            {
            // InternalRepoLang.g:2333:3: ( (lv_condition_0_0= RULE_STRING ) )
            // InternalRepoLang.g:2334:4: (lv_condition_0_0= RULE_STRING )
            {
            // InternalRepoLang.g:2334:4: (lv_condition_0_0= RULE_STRING )
            // InternalRepoLang.g:2335:5: lv_condition_0_0= RULE_STRING
            {
            lv_condition_0_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_condition_0_0, grammarAccess.getSeffGuardedBranchAccess().getConditionSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSeffGuardedBranchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getSeffGuardedBranchAccess().getColonKeyword_1());
            		
            // InternalRepoLang.g:2355:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalRepoLang.g:2356:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalRepoLang.g:2356:4: (lv_name_2_0= RULE_ID )
                    // InternalRepoLang.g:2357:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getSeffGuardedBranchAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSeffGuardedBranchRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalRepoLang.g:2373:3: ( (lv_seff_3_0= ruleSubSeff ) )
            // InternalRepoLang.g:2374:4: (lv_seff_3_0= ruleSubSeff )
            {
            // InternalRepoLang.g:2374:4: (lv_seff_3_0= ruleSubSeff )
            // InternalRepoLang.g:2375:5: lv_seff_3_0= ruleSubSeff
            {

            					newCompositeNode(grammarAccess.getSeffGuardedBranchAccess().getSeffSubSeffParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_seff_3_0=ruleSubSeff();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeffGuardedBranchRule());
            					}
            					set(
            						current,
            						"seff",
            						lv_seff_3_0,
            						"com.palladiosimulator.textual.repository.RepoLang.SubSeff");
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
    // $ANTLR end "ruleSeffGuardedBranch"


    // $ANTLR start "entryRuleSeffForkAction"
    // InternalRepoLang.g:2396:1: entryRuleSeffForkAction returns [EObject current=null] : iv_ruleSeffForkAction= ruleSeffForkAction EOF ;
    public final EObject entryRuleSeffForkAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeffForkAction = null;


        try {
            // InternalRepoLang.g:2396:55: (iv_ruleSeffForkAction= ruleSeffForkAction EOF )
            // InternalRepoLang.g:2397:2: iv_ruleSeffForkAction= ruleSeffForkAction EOF
            {
             newCompositeNode(grammarAccess.getSeffForkActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeffForkAction=ruleSeffForkAction();

            state._fsp--;

             current =iv_ruleSeffForkAction; 
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
    // $ANTLR end "entryRuleSeffForkAction"


    // $ANTLR start "ruleSeffForkAction"
    // InternalRepoLang.g:2403:1: ruleSeffForkAction returns [EObject current=null] : (otherlv_0= 'PAR' ( (lv_sync_1_0= 'SYNC' ) )? ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' ( (lv_forks_4_0= ruleSeffFork ) ) (otherlv_5= '|' ( (lv_forks_6_0= ruleSeffFork ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleSeffForkAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_sync_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_forks_4_0 = null;

        EObject lv_forks_6_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:2409:2: ( (otherlv_0= 'PAR' ( (lv_sync_1_0= 'SYNC' ) )? ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' ( (lv_forks_4_0= ruleSeffFork ) ) (otherlv_5= '|' ( (lv_forks_6_0= ruleSeffFork ) ) )* otherlv_7= '}' ) )
            // InternalRepoLang.g:2410:2: (otherlv_0= 'PAR' ( (lv_sync_1_0= 'SYNC' ) )? ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' ( (lv_forks_4_0= ruleSeffFork ) ) (otherlv_5= '|' ( (lv_forks_6_0= ruleSeffFork ) ) )* otherlv_7= '}' )
            {
            // InternalRepoLang.g:2410:2: (otherlv_0= 'PAR' ( (lv_sync_1_0= 'SYNC' ) )? ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' ( (lv_forks_4_0= ruleSeffFork ) ) (otherlv_5= '|' ( (lv_forks_6_0= ruleSeffFork ) ) )* otherlv_7= '}' )
            // InternalRepoLang.g:2411:3: otherlv_0= 'PAR' ( (lv_sync_1_0= 'SYNC' ) )? ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' ( (lv_forks_4_0= ruleSeffFork ) ) (otherlv_5= '|' ( (lv_forks_6_0= ruleSeffFork ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getSeffForkActionAccess().getPARKeyword_0());
            		
            // InternalRepoLang.g:2415:3: ( (lv_sync_1_0= 'SYNC' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==46) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalRepoLang.g:2416:4: (lv_sync_1_0= 'SYNC' )
                    {
                    // InternalRepoLang.g:2416:4: (lv_sync_1_0= 'SYNC' )
                    // InternalRepoLang.g:2417:5: lv_sync_1_0= 'SYNC'
                    {
                    lv_sync_1_0=(Token)match(input,46,FOLLOW_40); 

                    					newLeafNode(lv_sync_1_0, grammarAccess.getSeffForkActionAccess().getSyncSYNCKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSeffForkActionRule());
                    					}
                    					setWithLastConsumed(current, "sync", lv_sync_1_0 != null, "SYNC");
                    				

                    }


                    }
                    break;

            }

            // InternalRepoLang.g:2429:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalRepoLang.g:2430:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalRepoLang.g:2430:4: (lv_name_2_0= RULE_ID )
                    // InternalRepoLang.g:2431:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getSeffForkActionAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSeffForkActionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getSeffForkActionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRepoLang.g:2451:3: ( (lv_forks_4_0= ruleSeffFork ) )
            // InternalRepoLang.g:2452:4: (lv_forks_4_0= ruleSeffFork )
            {
            // InternalRepoLang.g:2452:4: (lv_forks_4_0= ruleSeffFork )
            // InternalRepoLang.g:2453:5: lv_forks_4_0= ruleSeffFork
            {

            					newCompositeNode(grammarAccess.getSeffForkActionAccess().getForksSeffForkParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_44);
            lv_forks_4_0=ruleSeffFork();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeffForkActionRule());
            					}
            					add(
            						current,
            						"forks",
            						lv_forks_4_0,
            						"com.palladiosimulator.textual.repository.RepoLang.SeffFork");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRepoLang.g:2470:3: (otherlv_5= '|' ( (lv_forks_6_0= ruleSeffFork ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==47) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalRepoLang.g:2471:4: otherlv_5= '|' ( (lv_forks_6_0= ruleSeffFork ) )
            	    {
            	    otherlv_5=(Token)match(input,47,FOLLOW_40); 

            	    				newLeafNode(otherlv_5, grammarAccess.getSeffForkActionAccess().getVerticalLineKeyword_5_0());
            	    			
            	    // InternalRepoLang.g:2475:4: ( (lv_forks_6_0= ruleSeffFork ) )
            	    // InternalRepoLang.g:2476:5: (lv_forks_6_0= ruleSeffFork )
            	    {
            	    // InternalRepoLang.g:2476:5: (lv_forks_6_0= ruleSeffFork )
            	    // InternalRepoLang.g:2477:6: lv_forks_6_0= ruleSeffFork
            	    {

            	    						newCompositeNode(grammarAccess.getSeffForkActionAccess().getForksSeffForkParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_44);
            	    lv_forks_6_0=ruleSeffFork();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSeffForkActionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"forks",
            	    							lv_forks_6_0,
            	    							"com.palladiosimulator.textual.repository.RepoLang.SeffFork");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSeffForkActionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSeffForkAction"


    // $ANTLR start "entryRuleSeffFork"
    // InternalRepoLang.g:2503:1: entryRuleSeffFork returns [EObject current=null] : iv_ruleSeffFork= ruleSeffFork EOF ;
    public final EObject entryRuleSeffFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeffFork = null;


        try {
            // InternalRepoLang.g:2503:49: (iv_ruleSeffFork= ruleSeffFork EOF )
            // InternalRepoLang.g:2504:2: iv_ruleSeffFork= ruleSeffFork EOF
            {
             newCompositeNode(grammarAccess.getSeffForkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeffFork=ruleSeffFork();

            state._fsp--;

             current =iv_ruleSeffFork; 
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
    // $ANTLR end "entryRuleSeffFork"


    // $ANTLR start "ruleSeffFork"
    // InternalRepoLang.g:2510:1: ruleSeffFork returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_seff_1_0= ruleSubSeff ) ) ) ;
    public final EObject ruleSeffFork() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_seff_1_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:2516:2: ( ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_seff_1_0= ruleSubSeff ) ) ) )
            // InternalRepoLang.g:2517:2: ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_seff_1_0= ruleSubSeff ) ) )
            {
            // InternalRepoLang.g:2517:2: ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_seff_1_0= ruleSubSeff ) ) )
            // InternalRepoLang.g:2518:3: ( (lv_name_0_0= RULE_ID ) )? ( (lv_seff_1_0= ruleSubSeff ) )
            {
            // InternalRepoLang.g:2518:3: ( (lv_name_0_0= RULE_ID ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalRepoLang.g:2519:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalRepoLang.g:2519:4: (lv_name_0_0= RULE_ID )
                    // InternalRepoLang.g:2520:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getSeffForkAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSeffForkRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalRepoLang.g:2536:3: ( (lv_seff_1_0= ruleSubSeff ) )
            // InternalRepoLang.g:2537:4: (lv_seff_1_0= ruleSubSeff )
            {
            // InternalRepoLang.g:2537:4: (lv_seff_1_0= ruleSubSeff )
            // InternalRepoLang.g:2538:5: lv_seff_1_0= ruleSubSeff
            {

            					newCompositeNode(grammarAccess.getSeffForkAccess().getSeffSubSeffParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_seff_1_0=ruleSubSeff();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeffForkRule());
            					}
            					set(
            						current,
            						"seff",
            						lv_seff_1_0,
            						"com.palladiosimulator.textual.repository.RepoLang.SubSeff");
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
    // $ANTLR end "ruleSeffFork"


    // $ANTLR start "entryRuleSubSeff"
    // InternalRepoLang.g:2559:1: entryRuleSubSeff returns [EObject current=null] : iv_ruleSubSeff= ruleSubSeff EOF ;
    public final EObject entryRuleSubSeff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSeff = null;


        try {
            // InternalRepoLang.g:2559:48: (iv_ruleSubSeff= ruleSubSeff EOF )
            // InternalRepoLang.g:2560:2: iv_ruleSubSeff= ruleSubSeff EOF
            {
             newCompositeNode(grammarAccess.getSubSeffRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubSeff=ruleSubSeff();

            state._fsp--;

             current =iv_ruleSubSeff; 
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
    // $ANTLR end "entryRuleSubSeff"


    // $ANTLR start "ruleSubSeff"
    // InternalRepoLang.g:2566:1: ruleSubSeff returns [EObject current=null] : (otherlv_0= '{' ( (lv_actions_1_0= ruleSeffAction ) )+ otherlv_2= '}' ) ;
    public final EObject ruleSubSeff() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_actions_1_0 = null;



        	enterRule();

        try {
            // InternalRepoLang.g:2572:2: ( (otherlv_0= '{' ( (lv_actions_1_0= ruleSeffAction ) )+ otherlv_2= '}' ) )
            // InternalRepoLang.g:2573:2: (otherlv_0= '{' ( (lv_actions_1_0= ruleSeffAction ) )+ otherlv_2= '}' )
            {
            // InternalRepoLang.g:2573:2: (otherlv_0= '{' ( (lv_actions_1_0= ruleSeffAction ) )+ otherlv_2= '}' )
            // InternalRepoLang.g:2574:3: otherlv_0= '{' ( (lv_actions_1_0= ruleSeffAction ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getSubSeffAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalRepoLang.g:2578:3: ( (lv_actions_1_0= ruleSeffAction ) )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=33 && LA54_0<=39)||(LA54_0>=43 && LA54_0<=45)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalRepoLang.g:2579:4: (lv_actions_1_0= ruleSeffAction )
            	    {
            	    // InternalRepoLang.g:2579:4: (lv_actions_1_0= ruleSeffAction )
            	    // InternalRepoLang.g:2580:5: lv_actions_1_0= ruleSeffAction
            	    {

            	    					newCompositeNode(grammarAccess.getSubSeffAccess().getActionsSeffActionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_actions_1_0=ruleSeffAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubSeffRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_1_0,
            	    						"com.palladiosimulator.textual.repository.RepoLang.SeffAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getSubSeffAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleSubSeff"


    // $ANTLR start "entryRulePassiveResource"
    // InternalRepoLang.g:2605:1: entryRulePassiveResource returns [EObject current=null] : iv_rulePassiveResource= rulePassiveResource EOF ;
    public final EObject entryRulePassiveResource() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePassiveResource = null;


        try {
            // InternalRepoLang.g:2605:56: (iv_rulePassiveResource= rulePassiveResource EOF )
            // InternalRepoLang.g:2606:2: iv_rulePassiveResource= rulePassiveResource EOF
            {
             newCompositeNode(grammarAccess.getPassiveResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePassiveResource=rulePassiveResource();

            state._fsp--;

             current =iv_rulePassiveResource; 
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
    // $ANTLR end "entryRulePassiveResource"


    // $ANTLR start "rulePassiveResource"
    // InternalRepoLang.g:2612:1: rulePassiveResource returns [EObject current=null] : (otherlv_0= 'PassiveResource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject rulePassiveResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_capacity_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRepoLang.g:2618:2: ( (otherlv_0= 'PassiveResource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalRepoLang.g:2619:2: (otherlv_0= 'PassiveResource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalRepoLang.g:2619:2: (otherlv_0= 'PassiveResource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalRepoLang.g:2620:3: otherlv_0= 'PassiveResource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPassiveResourceAccess().getPassiveResourceKeyword_0());
            		
            // InternalRepoLang.g:2624:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRepoLang.g:2625:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRepoLang.g:2625:4: (lv_name_1_0= RULE_ID )
            // InternalRepoLang.g:2626:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPassiveResourceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPassiveResourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getPassiveResourceAccess().getLeftParenthesisKeyword_2());
            		
            // InternalRepoLang.g:2646:3: ( (lv_capacity_3_0= RULE_INT ) )
            // InternalRepoLang.g:2647:4: (lv_capacity_3_0= RULE_INT )
            {
            // InternalRepoLang.g:2647:4: (lv_capacity_3_0= RULE_INT )
            // InternalRepoLang.g:2648:5: lv_capacity_3_0= RULE_INT
            {
            lv_capacity_3_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_capacity_3_0, grammarAccess.getPassiveResourceAccess().getCapacityINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPassiveResourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"capacity",
            						lv_capacity_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPassiveResourceAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "rulePassiveResource"


    // $ANTLR start "entryRuleProbability"
    // InternalRepoLang.g:2672:1: entryRuleProbability returns [String current=null] : iv_ruleProbability= ruleProbability EOF ;
    public final String entryRuleProbability() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProbability = null;


        try {
            // InternalRepoLang.g:2672:51: (iv_ruleProbability= ruleProbability EOF )
            // InternalRepoLang.g:2673:2: iv_ruleProbability= ruleProbability EOF
            {
             newCompositeNode(grammarAccess.getProbabilityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProbability=ruleProbability();

            state._fsp--;

             current =iv_ruleProbability.getText(); 
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
    // $ANTLR end "entryRuleProbability"


    // $ANTLR start "ruleProbability"
    // InternalRepoLang.g:2679:1: ruleProbability returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleProbability() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalRepoLang.g:2685:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT ) ) )
            // InternalRepoLang.g:2686:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT ) )
            {
            // InternalRepoLang.g:2686:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT ) )
            // InternalRepoLang.g:2687:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_46); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getProbabilityAccess().getINTTerminalRuleCall_0());
            		
            // InternalRepoLang.g:2694:3: (kw= '.' this_INT_2= RULE_INT )
            // InternalRepoLang.g:2695:4: kw= '.' this_INT_2= RULE_INT
            {
            kw=(Token)match(input,17,FOLLOW_28); 

            				current.merge(kw);
            				newLeafNode(kw, grammarAccess.getProbabilityAccess().getFullStopKeyword_1_0());
            			
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            				current.merge(this_INT_2);
            			

            				newLeafNode(this_INT_2, grammarAccess.getProbabilityAccess().getINTTerminalRuleCall_1_1());
            			

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
    // $ANTLR end "ruleProbability"


    // $ANTLR start "ruleCharType"
    // InternalRepoLang.g:2712:1: ruleCharType returns [Enumerator current=null] : ( (enumLiteral_0= 'STRUCTURE' ) | (enumLiteral_1= 'NUMBER_OF_ELEMENTS' ) | (enumLiteral_2= 'VALUE' ) | (enumLiteral_3= 'BYTESIZE' ) | (enumLiteral_4= 'TYPE' ) ) ;
    public final Enumerator ruleCharType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRepoLang.g:2718:2: ( ( (enumLiteral_0= 'STRUCTURE' ) | (enumLiteral_1= 'NUMBER_OF_ELEMENTS' ) | (enumLiteral_2= 'VALUE' ) | (enumLiteral_3= 'BYTESIZE' ) | (enumLiteral_4= 'TYPE' ) ) )
            // InternalRepoLang.g:2719:2: ( (enumLiteral_0= 'STRUCTURE' ) | (enumLiteral_1= 'NUMBER_OF_ELEMENTS' ) | (enumLiteral_2= 'VALUE' ) | (enumLiteral_3= 'BYTESIZE' ) | (enumLiteral_4= 'TYPE' ) )
            {
            // InternalRepoLang.g:2719:2: ( (enumLiteral_0= 'STRUCTURE' ) | (enumLiteral_1= 'NUMBER_OF_ELEMENTS' ) | (enumLiteral_2= 'VALUE' ) | (enumLiteral_3= 'BYTESIZE' ) | (enumLiteral_4= 'TYPE' ) )
            int alt55=5;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt55=1;
                }
                break;
            case 50:
                {
                alt55=2;
                }
                break;
            case 51:
                {
                alt55=3;
                }
                break;
            case 52:
                {
                alt55=4;
                }
                break;
            case 53:
                {
                alt55=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalRepoLang.g:2720:3: (enumLiteral_0= 'STRUCTURE' )
                    {
                    // InternalRepoLang.g:2720:3: (enumLiteral_0= 'STRUCTURE' )
                    // InternalRepoLang.g:2721:4: enumLiteral_0= 'STRUCTURE'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getCharTypeAccess().getSTRUCTUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCharTypeAccess().getSTRUCTUREEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRepoLang.g:2728:3: (enumLiteral_1= 'NUMBER_OF_ELEMENTS' )
                    {
                    // InternalRepoLang.g:2728:3: (enumLiteral_1= 'NUMBER_OF_ELEMENTS' )
                    // InternalRepoLang.g:2729:4: enumLiteral_1= 'NUMBER_OF_ELEMENTS'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getCharTypeAccess().getNUMBER_OF_ELEMENTSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCharTypeAccess().getNUMBER_OF_ELEMENTSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRepoLang.g:2736:3: (enumLiteral_2= 'VALUE' )
                    {
                    // InternalRepoLang.g:2736:3: (enumLiteral_2= 'VALUE' )
                    // InternalRepoLang.g:2737:4: enumLiteral_2= 'VALUE'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getCharTypeAccess().getVALUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCharTypeAccess().getVALUEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRepoLang.g:2744:3: (enumLiteral_3= 'BYTESIZE' )
                    {
                    // InternalRepoLang.g:2744:3: (enumLiteral_3= 'BYTESIZE' )
                    // InternalRepoLang.g:2745:4: enumLiteral_3= 'BYTESIZE'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getCharTypeAccess().getBYTESIZEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCharTypeAccess().getBYTESIZEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRepoLang.g:2752:3: (enumLiteral_4= 'TYPE' )
                    {
                    // InternalRepoLang.g:2752:3: (enumLiteral_4= 'TYPE' )
                    // InternalRepoLang.g:2753:4: enumLiteral_4= 'TYPE'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getCharTypeAccess().getTYPEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getCharTypeAccess().getTYPEEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleCharType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008045002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002810000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000030008002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020108002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000108002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001000080010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001000000010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000038FE00010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000010030L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x003E000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x003E000000200000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000008010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000010000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000038FE00000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000020000L});

}