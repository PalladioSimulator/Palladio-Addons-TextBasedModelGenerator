package com.palladiosimulator.textual.repository.ide.contentassist.antlr.internal;

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
import com.palladiosimulator.textual.repository.services.RepoLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRepoLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'STRUCTURE'", "'NUMBER_OF_ELEMENTS'", "'VALUE'", "'BYTESIZE'", "'TYPE'", "'Repository'", "'import'", "'.*'", "'Types'", "'{'", "'}'", "'.'", "'Interface'", "'('", "')'", "','", "':'", "'struct'", "'extends'", "'collection'", "'of'", "'Component'", "'provides'", "'requires'", "'as'", "'SEFF'", "'on'", "'IA'", "'ACQ'", "'REL'", "'LOOP'", "'RET'", "'SET'", "'EXT'", "'->'", "'RETURN:'", "':='", "'PBR'", "'GBR'", "'PAR'", "'|'", "'PassiveResource'", "'SYNC'"
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
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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

    	public void setGrammarAccess(RepoLangGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRepository"
    // InternalRepoLang.g:53:1: entryRuleRepository : ruleRepository EOF ;
    public final void entryRuleRepository() throws RecognitionException {
        try {
            // InternalRepoLang.g:54:1: ( ruleRepository EOF )
            // InternalRepoLang.g:55:1: ruleRepository EOF
            {
             before(grammarAccess.getRepositoryRule()); 
            pushFollow(FOLLOW_1);
            ruleRepository();

            state._fsp--;

             after(grammarAccess.getRepositoryRule()); 
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
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // InternalRepoLang.g:62:1: ruleRepository : ( ( rule__Repository__Group__0 ) ) ;
    public final void ruleRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:66:2: ( ( ( rule__Repository__Group__0 ) ) )
            // InternalRepoLang.g:67:2: ( ( rule__Repository__Group__0 ) )
            {
            // InternalRepoLang.g:67:2: ( ( rule__Repository__Group__0 ) )
            // InternalRepoLang.g:68:3: ( rule__Repository__Group__0 )
            {
             before(grammarAccess.getRepositoryAccess().getGroup()); 
            // InternalRepoLang.g:69:3: ( rule__Repository__Group__0 )
            // InternalRepoLang.g:69:4: rule__Repository__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Repository__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleImportedRepository"
    // InternalRepoLang.g:78:1: entryRuleImportedRepository : ruleImportedRepository EOF ;
    public final void entryRuleImportedRepository() throws RecognitionException {
        try {
            // InternalRepoLang.g:79:1: ( ruleImportedRepository EOF )
            // InternalRepoLang.g:80:1: ruleImportedRepository EOF
            {
             before(grammarAccess.getImportedRepositoryRule()); 
            pushFollow(FOLLOW_1);
            ruleImportedRepository();

            state._fsp--;

             after(grammarAccess.getImportedRepositoryRule()); 
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
    // $ANTLR end "entryRuleImportedRepository"


    // $ANTLR start "ruleImportedRepository"
    // InternalRepoLang.g:87:1: ruleImportedRepository : ( ( rule__ImportedRepository__Group__0 ) ) ;
    public final void ruleImportedRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:91:2: ( ( ( rule__ImportedRepository__Group__0 ) ) )
            // InternalRepoLang.g:92:2: ( ( rule__ImportedRepository__Group__0 ) )
            {
            // InternalRepoLang.g:92:2: ( ( rule__ImportedRepository__Group__0 ) )
            // InternalRepoLang.g:93:3: ( rule__ImportedRepository__Group__0 )
            {
             before(grammarAccess.getImportedRepositoryAccess().getGroup()); 
            // InternalRepoLang.g:94:3: ( rule__ImportedRepository__Group__0 )
            // InternalRepoLang.g:94:4: rule__ImportedRepository__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportedRepository__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportedRepositoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportedRepository"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalRepoLang.g:103:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalRepoLang.g:104:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalRepoLang.g:105:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalRepoLang.g:112:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:116:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalRepoLang.g:117:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalRepoLang.g:117:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalRepoLang.g:118:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalRepoLang.g:119:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalRepoLang.g:119:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleNamedElement"
    // InternalRepoLang.g:128:1: entryRuleNamedElement : ruleNamedElement EOF ;
    public final void entryRuleNamedElement() throws RecognitionException {
        try {
            // InternalRepoLang.g:129:1: ( ruleNamedElement EOF )
            // InternalRepoLang.g:130:1: ruleNamedElement EOF
            {
             before(grammarAccess.getNamedElementRule()); 
            pushFollow(FOLLOW_1);
            ruleNamedElement();

            state._fsp--;

             after(grammarAccess.getNamedElementRule()); 
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
    // $ANTLR end "entryRuleNamedElement"


    // $ANTLR start "ruleNamedElement"
    // InternalRepoLang.g:137:1: ruleNamedElement : ( ( rule__NamedElement__Alternatives ) ) ;
    public final void ruleNamedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:141:2: ( ( ( rule__NamedElement__Alternatives ) ) )
            // InternalRepoLang.g:142:2: ( ( rule__NamedElement__Alternatives ) )
            {
            // InternalRepoLang.g:142:2: ( ( rule__NamedElement__Alternatives ) )
            // InternalRepoLang.g:143:3: ( rule__NamedElement__Alternatives )
            {
             before(grammarAccess.getNamedElementAccess().getAlternatives()); 
            // InternalRepoLang.g:144:3: ( rule__NamedElement__Alternatives )
            // InternalRepoLang.g:144:4: rule__NamedElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NamedElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNamedElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedElement"


    // $ANTLR start "entryRuleTypeRepo"
    // InternalRepoLang.g:153:1: entryRuleTypeRepo : ruleTypeRepo EOF ;
    public final void entryRuleTypeRepo() throws RecognitionException {
        try {
            // InternalRepoLang.g:154:1: ( ruleTypeRepo EOF )
            // InternalRepoLang.g:155:1: ruleTypeRepo EOF
            {
             before(grammarAccess.getTypeRepoRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeRepo();

            state._fsp--;

             after(grammarAccess.getTypeRepoRule()); 
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
    // $ANTLR end "entryRuleTypeRepo"


    // $ANTLR start "ruleTypeRepo"
    // InternalRepoLang.g:162:1: ruleTypeRepo : ( ( rule__TypeRepo__Group__0 ) ) ;
    public final void ruleTypeRepo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:166:2: ( ( ( rule__TypeRepo__Group__0 ) ) )
            // InternalRepoLang.g:167:2: ( ( rule__TypeRepo__Group__0 ) )
            {
            // InternalRepoLang.g:167:2: ( ( rule__TypeRepo__Group__0 ) )
            // InternalRepoLang.g:168:3: ( rule__TypeRepo__Group__0 )
            {
             before(grammarAccess.getTypeRepoAccess().getGroup()); 
            // InternalRepoLang.g:169:3: ( rule__TypeRepo__Group__0 )
            // InternalRepoLang.g:169:4: rule__TypeRepo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeRepo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeRepoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeRepo"


    // $ANTLR start "entryRuleFQN"
    // InternalRepoLang.g:178:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalRepoLang.g:179:1: ( ruleFQN EOF )
            // InternalRepoLang.g:180:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalRepoLang.g:187:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:191:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalRepoLang.g:192:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalRepoLang.g:192:2: ( ( rule__FQN__Group__0 ) )
            // InternalRepoLang.g:193:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalRepoLang.g:194:3: ( rule__FQN__Group__0 )
            // InternalRepoLang.g:194:4: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleInterface"
    // InternalRepoLang.g:203:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // InternalRepoLang.g:204:1: ( ruleInterface EOF )
            // InternalRepoLang.g:205:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalRepoLang.g:212:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:216:2: ( ( ( rule__Interface__Group__0 ) ) )
            // InternalRepoLang.g:217:2: ( ( rule__Interface__Group__0 ) )
            {
            // InternalRepoLang.g:217:2: ( ( rule__Interface__Group__0 ) )
            // InternalRepoLang.g:218:3: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // InternalRepoLang.g:219:3: ( rule__Interface__Group__0 )
            // InternalRepoLang.g:219:4: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleSignature"
    // InternalRepoLang.g:228:1: entryRuleSignature : ruleSignature EOF ;
    public final void entryRuleSignature() throws RecognitionException {
        try {
            // InternalRepoLang.g:229:1: ( ruleSignature EOF )
            // InternalRepoLang.g:230:1: ruleSignature EOF
            {
             before(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_1);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getSignatureRule()); 
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
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalRepoLang.g:237:1: ruleSignature : ( ( rule__Signature__Group__0 ) ) ;
    public final void ruleSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:241:2: ( ( ( rule__Signature__Group__0 ) ) )
            // InternalRepoLang.g:242:2: ( ( rule__Signature__Group__0 ) )
            {
            // InternalRepoLang.g:242:2: ( ( rule__Signature__Group__0 ) )
            // InternalRepoLang.g:243:3: ( rule__Signature__Group__0 )
            {
             before(grammarAccess.getSignatureAccess().getGroup()); 
            // InternalRepoLang.g:244:3: ( rule__Signature__Group__0 )
            // InternalRepoLang.g:244:4: rule__Signature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleSignatureParameter"
    // InternalRepoLang.g:253:1: entryRuleSignatureParameter : ruleSignatureParameter EOF ;
    public final void entryRuleSignatureParameter() throws RecognitionException {
        try {
            // InternalRepoLang.g:254:1: ( ruleSignatureParameter EOF )
            // InternalRepoLang.g:255:1: ruleSignatureParameter EOF
            {
             before(grammarAccess.getSignatureParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleSignatureParameter();

            state._fsp--;

             after(grammarAccess.getSignatureParameterRule()); 
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
    // $ANTLR end "entryRuleSignatureParameter"


    // $ANTLR start "ruleSignatureParameter"
    // InternalRepoLang.g:262:1: ruleSignatureParameter : ( ( rule__SignatureParameter__Group__0 ) ) ;
    public final void ruleSignatureParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:266:2: ( ( ( rule__SignatureParameter__Group__0 ) ) )
            // InternalRepoLang.g:267:2: ( ( rule__SignatureParameter__Group__0 ) )
            {
            // InternalRepoLang.g:267:2: ( ( rule__SignatureParameter__Group__0 ) )
            // InternalRepoLang.g:268:3: ( rule__SignatureParameter__Group__0 )
            {
             before(grammarAccess.getSignatureParameterAccess().getGroup()); 
            // InternalRepoLang.g:269:3: ( rule__SignatureParameter__Group__0 )
            // InternalRepoLang.g:269:4: rule__SignatureParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SignatureParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignatureParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignatureParameter"


    // $ANTLR start "entryRuleCustomType"
    // InternalRepoLang.g:278:1: entryRuleCustomType : ruleCustomType EOF ;
    public final void entryRuleCustomType() throws RecognitionException {
        try {
            // InternalRepoLang.g:279:1: ( ruleCustomType EOF )
            // InternalRepoLang.g:280:1: ruleCustomType EOF
            {
             before(grammarAccess.getCustomTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomType();

            state._fsp--;

             after(grammarAccess.getCustomTypeRule()); 
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
    // $ANTLR end "entryRuleCustomType"


    // $ANTLR start "ruleCustomType"
    // InternalRepoLang.g:287:1: ruleCustomType : ( ( rule__CustomType__Alternatives ) ) ;
    public final void ruleCustomType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:291:2: ( ( ( rule__CustomType__Alternatives ) ) )
            // InternalRepoLang.g:292:2: ( ( rule__CustomType__Alternatives ) )
            {
            // InternalRepoLang.g:292:2: ( ( rule__CustomType__Alternatives ) )
            // InternalRepoLang.g:293:3: ( rule__CustomType__Alternatives )
            {
             before(grammarAccess.getCustomTypeAccess().getAlternatives()); 
            // InternalRepoLang.g:294:3: ( rule__CustomType__Alternatives )
            // InternalRepoLang.g:294:4: rule__CustomType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CustomType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCustomTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomType"


    // $ANTLR start "entryRuleCustomCompositeType"
    // InternalRepoLang.g:303:1: entryRuleCustomCompositeType : ruleCustomCompositeType EOF ;
    public final void entryRuleCustomCompositeType() throws RecognitionException {
        try {
            // InternalRepoLang.g:304:1: ( ruleCustomCompositeType EOF )
            // InternalRepoLang.g:305:1: ruleCustomCompositeType EOF
            {
             before(grammarAccess.getCustomCompositeTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomCompositeType();

            state._fsp--;

             after(grammarAccess.getCustomCompositeTypeRule()); 
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
    // $ANTLR end "entryRuleCustomCompositeType"


    // $ANTLR start "ruleCustomCompositeType"
    // InternalRepoLang.g:312:1: ruleCustomCompositeType : ( ( rule__CustomCompositeType__Group__0 ) ) ;
    public final void ruleCustomCompositeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:316:2: ( ( ( rule__CustomCompositeType__Group__0 ) ) )
            // InternalRepoLang.g:317:2: ( ( rule__CustomCompositeType__Group__0 ) )
            {
            // InternalRepoLang.g:317:2: ( ( rule__CustomCompositeType__Group__0 ) )
            // InternalRepoLang.g:318:3: ( rule__CustomCompositeType__Group__0 )
            {
             before(grammarAccess.getCustomCompositeTypeAccess().getGroup()); 
            // InternalRepoLang.g:319:3: ( rule__CustomCompositeType__Group__0 )
            // InternalRepoLang.g:319:4: rule__CustomCompositeType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomCompositeType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomCompositeTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomCompositeType"


    // $ANTLR start "entryRuleCustomInnerDeclaration"
    // InternalRepoLang.g:328:1: entryRuleCustomInnerDeclaration : ruleCustomInnerDeclaration EOF ;
    public final void entryRuleCustomInnerDeclaration() throws RecognitionException {
        try {
            // InternalRepoLang.g:329:1: ( ruleCustomInnerDeclaration EOF )
            // InternalRepoLang.g:330:1: ruleCustomInnerDeclaration EOF
            {
             before(grammarAccess.getCustomInnerDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomInnerDeclaration();

            state._fsp--;

             after(grammarAccess.getCustomInnerDeclarationRule()); 
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
    // $ANTLR end "entryRuleCustomInnerDeclaration"


    // $ANTLR start "ruleCustomInnerDeclaration"
    // InternalRepoLang.g:337:1: ruleCustomInnerDeclaration : ( ( rule__CustomInnerDeclaration__Group__0 ) ) ;
    public final void ruleCustomInnerDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:341:2: ( ( ( rule__CustomInnerDeclaration__Group__0 ) ) )
            // InternalRepoLang.g:342:2: ( ( rule__CustomInnerDeclaration__Group__0 ) )
            {
            // InternalRepoLang.g:342:2: ( ( rule__CustomInnerDeclaration__Group__0 ) )
            // InternalRepoLang.g:343:3: ( rule__CustomInnerDeclaration__Group__0 )
            {
             before(grammarAccess.getCustomInnerDeclarationAccess().getGroup()); 
            // InternalRepoLang.g:344:3: ( rule__CustomInnerDeclaration__Group__0 )
            // InternalRepoLang.g:344:4: rule__CustomInnerDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomInnerDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomInnerDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomInnerDeclaration"


    // $ANTLR start "entryRuleCustomCollectionType"
    // InternalRepoLang.g:353:1: entryRuleCustomCollectionType : ruleCustomCollectionType EOF ;
    public final void entryRuleCustomCollectionType() throws RecognitionException {
        try {
            // InternalRepoLang.g:354:1: ( ruleCustomCollectionType EOF )
            // InternalRepoLang.g:355:1: ruleCustomCollectionType EOF
            {
             before(grammarAccess.getCustomCollectionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomCollectionType();

            state._fsp--;

             after(grammarAccess.getCustomCollectionTypeRule()); 
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
    // $ANTLR end "entryRuleCustomCollectionType"


    // $ANTLR start "ruleCustomCollectionType"
    // InternalRepoLang.g:362:1: ruleCustomCollectionType : ( ( rule__CustomCollectionType__Group__0 ) ) ;
    public final void ruleCustomCollectionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:366:2: ( ( ( rule__CustomCollectionType__Group__0 ) ) )
            // InternalRepoLang.g:367:2: ( ( rule__CustomCollectionType__Group__0 ) )
            {
            // InternalRepoLang.g:367:2: ( ( rule__CustomCollectionType__Group__0 ) )
            // InternalRepoLang.g:368:3: ( rule__CustomCollectionType__Group__0 )
            {
             before(grammarAccess.getCustomCollectionTypeAccess().getGroup()); 
            // InternalRepoLang.g:369:3: ( rule__CustomCollectionType__Group__0 )
            // InternalRepoLang.g:369:4: rule__CustomCollectionType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomCollectionType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomCollectionTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomCollectionType"


    // $ANTLR start "entryRuleComponent"
    // InternalRepoLang.g:378:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalRepoLang.g:379:1: ( ruleComponent EOF )
            // InternalRepoLang.g:380:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalRepoLang.g:387:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:391:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalRepoLang.g:392:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalRepoLang.g:392:2: ( ( rule__Component__Group__0 ) )
            // InternalRepoLang.g:393:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalRepoLang.g:394:3: ( rule__Component__Group__0 )
            // InternalRepoLang.g:394:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleRoleSpecification"
    // InternalRepoLang.g:403:1: entryRuleRoleSpecification : ruleRoleSpecification EOF ;
    public final void entryRuleRoleSpecification() throws RecognitionException {
        try {
            // InternalRepoLang.g:404:1: ( ruleRoleSpecification EOF )
            // InternalRepoLang.g:405:1: ruleRoleSpecification EOF
            {
             before(grammarAccess.getRoleSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleRoleSpecification();

            state._fsp--;

             after(grammarAccess.getRoleSpecificationRule()); 
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
    // $ANTLR end "entryRuleRoleSpecification"


    // $ANTLR start "ruleRoleSpecification"
    // InternalRepoLang.g:412:1: ruleRoleSpecification : ( ( rule__RoleSpecification__Group__0 ) ) ;
    public final void ruleRoleSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:416:2: ( ( ( rule__RoleSpecification__Group__0 ) ) )
            // InternalRepoLang.g:417:2: ( ( rule__RoleSpecification__Group__0 ) )
            {
            // InternalRepoLang.g:417:2: ( ( rule__RoleSpecification__Group__0 ) )
            // InternalRepoLang.g:418:3: ( rule__RoleSpecification__Group__0 )
            {
             before(grammarAccess.getRoleSpecificationAccess().getGroup()); 
            // InternalRepoLang.g:419:3: ( rule__RoleSpecification__Group__0 )
            // InternalRepoLang.g:419:4: rule__RoleSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoleSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoleSpecification"


    // $ANTLR start "entryRuleSeff"
    // InternalRepoLang.g:428:1: entryRuleSeff : ruleSeff EOF ;
    public final void entryRuleSeff() throws RecognitionException {
        try {
            // InternalRepoLang.g:429:1: ( ruleSeff EOF )
            // InternalRepoLang.g:430:1: ruleSeff EOF
            {
             before(grammarAccess.getSeffRule()); 
            pushFollow(FOLLOW_1);
            ruleSeff();

            state._fsp--;

             after(grammarAccess.getSeffRule()); 
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
    // $ANTLR end "entryRuleSeff"


    // $ANTLR start "ruleSeff"
    // InternalRepoLang.g:437:1: ruleSeff : ( ( rule__Seff__Group__0 ) ) ;
    public final void ruleSeff() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:441:2: ( ( ( rule__Seff__Group__0 ) ) )
            // InternalRepoLang.g:442:2: ( ( rule__Seff__Group__0 ) )
            {
            // InternalRepoLang.g:442:2: ( ( rule__Seff__Group__0 ) )
            // InternalRepoLang.g:443:3: ( rule__Seff__Group__0 )
            {
             before(grammarAccess.getSeffAccess().getGroup()); 
            // InternalRepoLang.g:444:3: ( rule__Seff__Group__0 )
            // InternalRepoLang.g:444:4: rule__Seff__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Seff__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeffAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeff"


    // $ANTLR start "entryRuleSeffAction"
    // InternalRepoLang.g:453:1: entryRuleSeffAction : ruleSeffAction EOF ;
    public final void entryRuleSeffAction() throws RecognitionException {
        try {
            // InternalRepoLang.g:454:1: ( ruleSeffAction EOF )
            // InternalRepoLang.g:455:1: ruleSeffAction EOF
            {
             before(grammarAccess.getSeffActionRule()); 
            pushFollow(FOLLOW_1);
            ruleSeffAction();

            state._fsp--;

             after(grammarAccess.getSeffActionRule()); 
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
    // $ANTLR end "entryRuleSeffAction"


    // $ANTLR start "ruleSeffAction"
    // InternalRepoLang.g:462:1: ruleSeffAction : ( ( rule__SeffAction__Alternatives ) ) ;
    public final void ruleSeffAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:466:2: ( ( ( rule__SeffAction__Alternatives ) ) )
            // InternalRepoLang.g:467:2: ( ( rule__SeffAction__Alternatives ) )
            {
            // InternalRepoLang.g:467:2: ( ( rule__SeffAction__Alternatives ) )
            // InternalRepoLang.g:468:3: ( rule__SeffAction__Alternatives )
            {
             before(grammarAccess.getSeffActionAccess().getAlternatives()); 
            // InternalRepoLang.g:469:3: ( rule__SeffAction__Alternatives )
            // InternalRepoLang.g:469:4: rule__SeffAction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SeffAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSeffActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeffAction"


    // $ANTLR start "entryRuleSeffInternalAction"
    // InternalRepoLang.g:478:1: entryRuleSeffInternalAction : ruleSeffInternalAction EOF ;
    public final void entryRuleSeffInternalAction() throws RecognitionException {
        try {
            // InternalRepoLang.g:479:1: ( ruleSeffInternalAction EOF )
            // InternalRepoLang.g:480:1: ruleSeffInternalAction EOF
            {
             before(grammarAccess.getSeffInternalActionRule()); 
            pushFollow(FOLLOW_1);
            ruleSeffInternalAction();

            state._fsp--;

             after(grammarAccess.getSeffInternalActionRule()); 
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
    // $ANTLR end "entryRuleSeffInternalAction"


    // $ANTLR start "ruleSeffInternalAction"
    // InternalRepoLang.g:487:1: ruleSeffInternalAction : ( ( rule__SeffInternalAction__Group__0 ) ) ;
    public final void ruleSeffInternalAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:491:2: ( ( ( rule__SeffInternalAction__Group__0 ) ) )
            // InternalRepoLang.g:492:2: ( ( rule__SeffInternalAction__Group__0 ) )
            {
            // InternalRepoLang.g:492:2: ( ( rule__SeffInternalAction__Group__0 ) )
            // InternalRepoLang.g:493:3: ( rule__SeffInternalAction__Group__0 )
            {
             before(grammarAccess.getSeffInternalActionAccess().getGroup()); 
            // InternalRepoLang.g:494:3: ( rule__SeffInternalAction__Group__0 )
            // InternalRepoLang.g:494:4: rule__SeffInternalAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SeffInternalAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeffInternalActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeffInternalAction"


    // $ANTLR start "entryRuleSeffAcquireAction"
    // InternalRepoLang.g:503:1: entryRuleSeffAcquireAction : ruleSeffAcquireAction EOF ;
    public final void entryRuleSeffAcquireAction() throws RecognitionException {
        try {
            // InternalRepoLang.g:504:1: ( ruleSeffAcquireAction EOF )
            // InternalRepoLang.g:505:1: ruleSeffAcquireAction EOF
            {
             before(grammarAccess.getSeffAcquireActionRule()); 
            pushFollow(FOLLOW_1);
            ruleSeffAcquireAction();

            state._fsp--;

             after(grammarAccess.getSeffAcquireActionRule()); 
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
    // $ANTLR end "entryRuleSeffAcquireAction"


    // $ANTLR start "ruleSeffAcquireAction"
    // InternalRepoLang.g:512:1: ruleSeffAcquireAction : ( ( rule__SeffAcquireAction__Group__0 ) ) ;
    public final void ruleSeffAcquireAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:516:2: ( ( ( rule__SeffAcquireAction__Group__0 ) ) )
            // InternalRepoLang.g:517:2: ( ( rule__SeffAcquireAction__Group__0 ) )
            {
            // InternalRepoLang.g:517:2: ( ( rule__SeffAcquireAction__Group__0 ) )
            // InternalRepoLang.g:518:3: ( rule__SeffAcquireAction__Group__0 )
            {
             before(grammarAccess.getSeffAcquireActionAccess().getGroup()); 
            // InternalRepoLang.g:519:3: ( rule__SeffAcquireAction__Group__0 )
            // InternalRepoLang.g:519:4: rule__SeffAcquireAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SeffAcquireAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeffAcquireActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeffAcquireAction"


    // $ANTLR start "entryRuleSeffReleaseAction"
    // InternalRepoLang.g:528:1: entryRuleSeffReleaseAction : ruleSeffReleaseAction EOF ;
    public final void entryRuleSeffReleaseAction() throws RecognitionException {
        try {
            // InternalRepoLang.g:529:1: ( ruleSeffReleaseAction EOF )
            // InternalRepoLang.g:530:1: ruleSeffReleaseAction EOF
            {
             before(grammarAccess.getSeffReleaseActionRule()); 
            pushFollow(FOLLOW_1);
            ruleSeffReleaseAction();

            state._fsp--;

             after(grammarAccess.getSeffReleaseActionRule()); 
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
    // $ANTLR end "entryRuleSeffReleaseAction"


    // $ANTLR start "ruleSeffReleaseAction"
    // InternalRepoLang.g:537:1: ruleSeffReleaseAction : ( ( rule__SeffReleaseAction__Group__0 ) ) ;
    public final void ruleSeffReleaseAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:541:2: ( ( ( rule__SeffReleaseAction__Group__0 ) ) )
            // InternalRepoLang.g:542:2: ( ( rule__SeffReleaseAction__Group__0 ) )
            {
            // InternalRepoLang.g:542:2: ( ( rule__SeffReleaseAction__Group__0 ) )
            // InternalRepoLang.g:543:3: ( rule__SeffReleaseAction__Group__0 )
            {
             before(grammarAccess.getSeffReleaseActionAccess().getGroup()); 
            // InternalRepoLang.g:544:3: ( rule__SeffReleaseAction__Group__0 )
            // InternalRepoLang.g:544:4: rule__SeffReleaseAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SeffReleaseAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeffReleaseActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeffReleaseAction"


    // $ANTLR start "entryRuleSeffLoopAction"
    // InternalRepoLang.g:553:1: entryRuleSeffLoopAction : ruleSeffLoopAction EOF ;
    public final void entryRuleSeffLoopAction() throws RecognitionException {
        try {
            // InternalRepoLang.g:554:1: ( ruleSeffLoopAction EOF )
            // InternalRepoLang.g:555:1: ruleSeffLoopAction EOF
            {
             before(grammarAccess.getSeffLoopActionRule()); 
            pushFollow(FOLLOW_1);
            ruleSeffLoopAction();

            state._fsp--;

             after(grammarAccess.getSeffLoopActionRule()); 
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
    // $ANTLR end "entryRuleSeffLoopAction"


    // $ANTLR start "ruleSeffLoopAction"
    // InternalRepoLang.g:562:1: ruleSeffLoopAction : ( ( rule__SeffLoopAction__Group__0 ) ) ;
    public final void ruleSeffLoopAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:566:2: ( ( ( rule__SeffLoopAction__Group__0 ) ) )
            // InternalRepoLang.g:567:2: ( ( rule__SeffLoopAction__Group__0 ) )
            {
            // InternalRepoLang.g:567:2: ( ( rule__SeffLoopAction__Group__0 ) )
            // InternalRepoLang.g:568:3: ( rule__SeffLoopAction__Group__0 )
            {
             before(grammarAccess.getSeffLoopActionAccess().getGroup()); 
            // InternalRepoLang.g:569:3: ( rule__SeffLoopAction__Group__0 )
            // InternalRepoLang.g:569:4: rule__SeffLoopAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SeffLoopAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeffLoopActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeffLoopAction"


    // $ANTLR start "entryRuleSeffSetReturnAction"
    // InternalRepoLang.g:578:1: entryRuleSeffSetReturnAction : ruleSeffSetReturnAction EOF ;
    public final void entryRuleSeffSetReturnAction() throws RecognitionException {
        try {
            // InternalRepoLang.g:579:1: ( ruleSeffSetReturnAction EOF )
            // InternalRepoLang.g:580:1: ruleSeffSetReturnAction EOF
            {
             before(grammarAccess.getSeffSetReturnActionRule()); 
            pushFollow(FOLLOW_1);
            ruleSeffSetReturnAction();

            state._fsp--;

             after(grammarAccess.getSeffSetReturnActionRule()); 
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
    // $ANTLR end "entryRuleSeffSetReturnAction"


    // $ANTLR start "ruleSeffSetReturnAction"
    // InternalRepoLang.g:587:1: ruleSeffSetReturnAction : ( ( rule__SeffSetReturnAction__Group__0 ) ) ;
    public final void ruleSeffSetReturnAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:591:2: ( ( ( rule__SeffSetReturnAction__Group__0 ) ) )
            // InternalRepoLang.g:592:2: ( ( rule__SeffSetReturnAction__Group__0 ) )
            {
            // InternalRepoLang.g:592:2: ( ( rule__SeffSetReturnAction__Group__0 ) )
            // InternalRepoLang.g:593:3: ( rule__SeffSetReturnAction__Group__0 )
            {
             before(grammarAccess.getSeffSetReturnActionAccess().getGroup()); 
            // InternalRepoLang.g:594:3: ( rule__SeffSetReturnAction__Group__0 )
            // InternalRepoLang.g:594:4: rule__SeffSetReturnAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SeffSetReturnAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeffSetReturnActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeffSetReturnAction"


    // $ANTLR start "entryRuleSeffSetVariableAction"
    // InternalRepoLang.g:603:1: entryRuleSeffSetVariableAction : ruleSeffSetVariableAction EOF ;
    public final void entryRuleSeffSetVariableAction() throws RecognitionException {
        try {
            // InternalRepoLang.g:604:1: ( ruleSeffSetVariableAction EOF )
            // InternalRepoLang.g:605:1: ruleSeffSetVariableAction EOF
            {
             before(grammarAccess.getSeffSetVariableActionRule()); 
            pushFollow(FOLLOW_1);
            ruleSeffSetVariableAction();

            state._fsp--;

             after(grammarAccess.getSeffSetVariableActionRule()); 
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
    // $ANTLR end "entryRuleSeffSetVariableAction"


    // $ANTLR start "ruleSeffSetVariableAction"
    // InternalRepoLang.g:612:1: ruleSeffSetVariableAction : ( ( rule__SeffSetVariableAction__Group__0 ) ) ;
    public final void ruleSeffSetVariableAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:616:2: ( ( ( rule__SeffSetVariableAction__Group__0 ) ) )
            // InternalRepoLang.g:617:2: ( ( rule__SeffSetVariableAction__Group__0 ) )
            {
            // InternalRepoLang.g:617:2: ( ( rule__SeffSetVariableAction__Group__0 ) )
            // InternalRepoLang.g:618:3: ( rule__SeffSetVariableAction__Group__0 )
            {
             before(grammarAccess.getSeffSetVariableActionAccess().getGroup()); 
            // InternalRepoLang.g:619:3: ( rule__SeffSetVariableAction__Group__0 )
            // InternalRepoLang.g:619:4: rule__SeffSetVariableAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SeffSetVariableAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeffSetVariableActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeffSetVariableAction"


    // $ANTLR start "entryRuleSeffExternalCallAction"
    // InternalRepoLang.g:628:1: entryRuleSeffExternalCallAction : ruleSeffExternalCallAction EOF ;
    public final void entryRuleSeffExternalCallAction() throws RecognitionException {
        try {
            // InternalRepoLang.g:629:1: ( ruleSeffExternalCallAction EOF )
            // InternalRepoLang.g:630:1: ruleSeffExternalCallAction EOF
            {
             before(grammarAccess.getSeffExternalCallActionRule()); 
            pushFollow(FOLLOW_1);
            ruleSeffExternalCallAction();

            state._fsp--;

             after(grammarAccess.getSeffExternalCallActionRule()); 
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
    // $ANTLR end "entryRuleSeffExternalCallAction"


    // $ANTLR start "ruleSeffExternalCallAction"
    // InternalRepoLang.g:637:1: ruleSeffExternalCallAction : ( ( rule__SeffExternalCallAction__Group__0 ) ) ;
    public final void ruleSeffExternalCallAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:641:2: ( ( ( rule__SeffExternalCallAction__Group__0 ) ) )
            // InternalRepoLang.g:642:2: ( ( rule__SeffExternalCallAction__Group__0 ) )
            {
            // InternalRepoLang.g:642:2: ( ( rule__SeffExternalCallAction__Group__0 ) )
            // InternalRepoLang.g:643:3: ( rule__SeffExternalCallAction__Group__0 )
            {
             before(grammarAccess.getSeffExternalCallActionAccess().getGroup()); 
            // InternalRepoLang.g:644:3: ( rule__SeffExternalCallAction__Group__0 )
            // InternalRepoLang.g:644:4: rule__SeffExternalCallAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SeffExternalCallAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeffExternalCallActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeffExternalCallAction"


    // $ANTLR start "entryRuleSeffCallParameter"
    // InternalRepoLang.g:653:1: entryRuleSeffCallParameter : ruleSeffCallParameter EOF ;
    public final void entryRuleSeffCallParameter() throws RecognitionException {
        try {
            // InternalRepoLang.g:654:1: ( ruleSeffCallParameter EOF )
            // InternalRepoLang.g:655:1: ruleSeffCallParameter EOF
            {
             before(grammarAccess.getSeffCallParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleSeffCallParameter();

            state._fsp--;

             after(grammarAccess.getSeffCallParameterRule()); 
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
    // $ANTLR end "entryRuleSeffCallParameter"


    // $ANTLR start "ruleSeffCallParameter"
    // InternalRepoLang.g:662:1: ruleSeffCallParameter : ( ( rule__SeffCallParameter__Group__0 ) ) ;
    public final void ruleSeffCallParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:666:2: ( ( ( rule__SeffCallParameter__Group__0 ) ) )
            // InternalRepoLang.g:667:2: ( ( rule__SeffCallParameter__Group__0 ) )
            {
            // InternalRepoLang.g:667:2: ( ( rule__SeffCallParameter__Group__0 ) )
            // InternalRepoLang.g:668:3: ( rule__SeffCallParameter__Group__0 )
            {
             before(grammarAccess.getSeffCallParameterAccess().getGroup()); 
            // InternalRepoLang.g:669:3: ( rule__SeffCallParameter__Group__0 )
            // InternalRepoLang.g:669:4: rule__SeffCallParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SeffCallParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeffCallParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeffCallParameter"


    // $ANTLR start "entryRuleSeffReferenceParameter"
    // InternalRepoLang.g:678:1: entryRuleSeffReferenceParameter : ruleSeffReferenceParameter EOF ;
    public final void entryRuleSeffReferenceParameter() throws RecognitionException {
        try {
            // InternalRepoLang.g:679:1: ( ruleSeffReferenceParameter EOF )
            // InternalRepoLang.g:680:1: ruleSeffReferenceParameter EOF
            {
             before(grammarAccess.getSeffReferenceParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleSeffReferenceParameter();

            state._fsp--;

             after(grammarAccess.getSeffReferenceParameterRule()); 
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
    // $ANTLR end "entryRuleSeffReferenceParameter"


    // $ANTLR start "ruleSeffReferenceParameter"
    // InternalRepoLang.g:687:1: ruleSeffReferenceParameter : ( ( rule__SeffReferenceParameter__Group__0 ) ) ;
    public final void ruleSeffReferenceParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:691:2: ( ( ( rule__SeffReferenceParameter__Group__0 ) ) )
            // InternalRepoLang.g:692:2: ( ( rule__SeffReferenceParameter__Group__0 ) )
            {
            // InternalRepoLang.g:692:2: ( ( rule__SeffReferenceParameter__Group__0 ) )
            // InternalRepoLang.g:693:3: ( rule__SeffReferenceParameter__Group__0 )
            {
             before(grammarAccess.getSeffReferenceParameterAccess().getGroup()); 
            // InternalRepoLang.g:694:3: ( rule__SeffReferenceParameter__Group__0 )
            // InternalRepoLang.g:694:4: rule__SeffReferenceParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SeffReferenceParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeffReferenceParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeffReferenceParameter"


    // $ANTLR start "entryRuleSeffReturnParameter"
    // InternalRepoLang.g:703:1: entryRuleSeffReturnParameter : ruleSeffReturnParameter EOF ;
    public final void entryRuleSeffReturnParameter() throws RecognitionException {
        try {
            // InternalRepoLang.g:704:1: ( ruleSeffReturnParameter EOF )
            // InternalRepoLang.g:705:1: ruleSeffReturnParameter EOF
            {
             before(grammarAccess.getSeffReturnParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleSeffReturnParameter();

            state._fsp--;

             after(grammarAccess.getSeffReturnParameterRule()); 
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
    // $ANTLR end "entryRuleSeffReturnParameter"


    // $ANTLR start "ruleSeffReturnParameter"
    // InternalRepoLang.g:712:1: ruleSeffReturnParameter : ( ( rule__SeffReturnParameter__Group__0 ) ) ;
    public final void ruleSeffReturnParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:716:2: ( ( ( rule__SeffReturnParameter__Group__0 ) ) )
            // InternalRepoLang.g:717:2: ( ( rule__SeffReturnParameter__Group__0 ) )
            {
            // InternalRepoLang.g:717:2: ( ( rule__SeffReturnParameter__Group__0 ) )
            // InternalRepoLang.g:718:3: ( rule__SeffReturnParameter__Group__0 )
            {
             before(grammarAccess.getSeffReturnParameterAccess().getGroup()); 
            // InternalRepoLang.g:719:3: ( rule__SeffReturnParameter__Group__0 )
            // InternalRepoLang.g:719:4: rule__SeffReturnParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SeffReturnParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeffReturnParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeffReturnParameter"


    // $ANTLR start "entryRuleSeffVariableChar"
    // InternalRepoLang.g:728:1: entryRuleSeffVariableChar : ruleSeffVariableChar EOF ;
    public final void entryRuleSeffVariableChar() throws RecognitionException {
        try {
            // InternalRepoLang.g:729:1: ( ruleSeffVariableChar EOF )
            // InternalRepoLang.g:730:1: ruleSeffVariableChar EOF
            {
             before(grammarAccess.getSeffVariableCharRule()); 
            pushFollow(FOLLOW_1);
            ruleSeffVariableChar();

            state._fsp--;

             after(grammarAccess.getSeffVariableCharRule()); 
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
    // $ANTLR end "entryRuleSeffVariableChar"


    // $ANTLR start "ruleSeffVariableChar"
    // InternalRepoLang.g:737:1: ruleSeffVariableChar : ( ( rule__SeffVariableChar__Group__0 ) ) ;
    public final void ruleSeffVariableChar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:741:2: ( ( ( rule__SeffVariableChar__Group__0 ) ) )
            // InternalRepoLang.g:742:2: ( ( rule__SeffVariableChar__Group__0 ) )
            {
            // InternalRepoLang.g:742:2: ( ( rule__SeffVariableChar__Group__0 ) )
            // InternalRepoLang.g:743:3: ( rule__SeffVariableChar__Group__0 )
            {
             before(grammarAccess.getSeffVariableCharAccess().getGroup()); 
            // InternalRepoLang.g:744:3: ( rule__SeffVariableChar__Group__0 )
            // InternalRepoLang.g:744:4: rule__SeffVariableChar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SeffVariableChar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeffVariableCharAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeffVariableChar"


    // $ANTLR start "entryRuleSeffProbabilisticBranchAction"
    // InternalRepoLang.g:753:1: entryRuleSeffProbabilisticBranchAction : ruleSeffProbabilisticBranchAction EOF ;
    public final void entryRuleSeffProbabilisticBranchAction() throws RecognitionException {
        try {
            // InternalRepoLang.g:754:1: ( ruleSeffProbabilisticBranchAction EOF )
            // InternalRepoLang.g:755:1: ruleSeffProbabilisticBranchAction EOF
            {
             before(grammarAccess.getSeffProbabilisticBranchActionRule()); 
            pushFollow(FOLLOW_1);
            ruleSeffProbabilisticBranchAction();

            state._fsp--;

             after(grammarAccess.getSeffProbabilisticBranchActionRule()); 
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
    // $ANTLR end "entryRuleSeffProbabilisticBranchAction"


    // $ANTLR start "ruleSeffProbabilisticBranchAction"
    // InternalRepoLang.g:762:1: ruleSeffProbabilisticBranchAction : ( ( rule__SeffProbabilisticBranchAction__Group__0 ) ) ;
    public final void ruleSeffProbabilisticBranchAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:766:2: ( ( ( rule__SeffProbabilisticBranchAction__Group__0 ) ) )
            // InternalRepoLang.g:767:2: ( ( rule__SeffProbabilisticBranchAction__Group__0 ) )
            {
            // InternalRepoLang.g:767:2: ( ( rule__SeffProbabilisticBranchAction__Group__0 ) )
            // InternalRepoLang.g:768:3: ( rule__SeffProbabilisticBranchAction__Group__0 )
            {
             before(grammarAccess.getSeffProbabilisticBranchActionAccess().getGroup()); 
            // InternalRepoLang.g:769:3: ( rule__SeffProbabilisticBranchAction__Group__0 )
            // InternalRepoLang.g:769:4: rule__SeffProbabilisticBranchAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SeffProbabilisticBranchAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeffProbabilisticBranchActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeffProbabilisticBranchAction"


    // $ANTLR start "entryRuleSeffProbabilisticBranch"
    // InternalRepoLang.g:778:1: entryRuleSeffProbabilisticBranch : ruleSeffProbabilisticBranch EOF ;
    public final void entryRuleSeffProbabilisticBranch() throws RecognitionException {
        try {
            // InternalRepoLang.g:779:1: ( ruleSeffProbabilisticBranch EOF )
            // InternalRepoLang.g:780:1: ruleSeffProbabilisticBranch EOF
            {
             before(grammarAccess.getSeffProbabilisticBranchRule()); 
            pushFollow(FOLLOW_1);
            ruleSeffProbabilisticBranch();

            state._fsp--;

             after(grammarAccess.getSeffProbabilisticBranchRule()); 
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
    // $ANTLR end "entryRuleSeffProbabilisticBranch"


    // $ANTLR start "ruleSeffProbabilisticBranch"
    // InternalRepoLang.g:787:1: ruleSeffProbabilisticBranch : ( ( rule__SeffProbabilisticBranch__Group__0 ) ) ;
    public final void ruleSeffProbabilisticBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:791:2: ( ( ( rule__SeffProbabilisticBranch__Group__0 ) ) )
            // InternalRepoLang.g:792:2: ( ( rule__SeffProbabilisticBranch__Group__0 ) )
            {
            // InternalRepoLang.g:792:2: ( ( rule__SeffProbabilisticBranch__Group__0 ) )
            // InternalRepoLang.g:793:3: ( rule__SeffProbabilisticBranch__Group__0 )
            {
             before(grammarAccess.getSeffProbabilisticBranchAccess().getGroup()); 
            // InternalRepoLang.g:794:3: ( rule__SeffProbabilisticBranch__Group__0 )
            // InternalRepoLang.g:794:4: rule__SeffProbabilisticBranch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SeffProbabilisticBranch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeffProbabilisticBranchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeffProbabilisticBranch"


    // $ANTLR start "entryRuleSeffGuardedBranchAction"
    // InternalRepoLang.g:803:1: entryRuleSeffGuardedBranchAction : ruleSeffGuardedBranchAction EOF ;
    public final void entryRuleSeffGuardedBranchAction() throws RecognitionException {
        try {
            // InternalRepoLang.g:804:1: ( ruleSeffGuardedBranchAction EOF )
            // InternalRepoLang.g:805:1: ruleSeffGuardedBranchAction EOF
            {
             before(grammarAccess.getSeffGuardedBranchActionRule()); 
            pushFollow(FOLLOW_1);
            ruleSeffGuardedBranchAction();

            state._fsp--;

             after(grammarAccess.getSeffGuardedBranchActionRule()); 
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
    // $ANTLR end "entryRuleSeffGuardedBranchAction"


    // $ANTLR start "ruleSeffGuardedBranchAction"
    // InternalRepoLang.g:812:1: ruleSeffGuardedBranchAction : ( ( rule__SeffGuardedBranchAction__Group__0 ) ) ;
    public final void ruleSeffGuardedBranchAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:816:2: ( ( ( rule__SeffGuardedBranchAction__Group__0 ) ) )
            // InternalRepoLang.g:817:2: ( ( rule__SeffGuardedBranchAction__Group__0 ) )
            {
            // InternalRepoLang.g:817:2: ( ( rule__SeffGuardedBranchAction__Group__0 ) )
            // InternalRepoLang.g:818:3: ( rule__SeffGuardedBranchAction__Group__0 )
            {
             before(grammarAccess.getSeffGuardedBranchActionAccess().getGroup()); 
            // InternalRepoLang.g:819:3: ( rule__SeffGuardedBranchAction__Group__0 )
            // InternalRepoLang.g:819:4: rule__SeffGuardedBranchAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SeffGuardedBranchAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeffGuardedBranchActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeffGuardedBranchAction"


    // $ANTLR start "entryRuleSeffGuardedBranch"
    // InternalRepoLang.g:828:1: entryRuleSeffGuardedBranch : ruleSeffGuardedBranch EOF ;
    public final void entryRuleSeffGuardedBranch() throws RecognitionException {
        try {
            // InternalRepoLang.g:829:1: ( ruleSeffGuardedBranch EOF )
            // InternalRepoLang.g:830:1: ruleSeffGuardedBranch EOF
            {
             before(grammarAccess.getSeffGuardedBranchRule()); 
            pushFollow(FOLLOW_1);
            ruleSeffGuardedBranch();

            state._fsp--;

             after(grammarAccess.getSeffGuardedBranchRule()); 
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
    // $ANTLR end "entryRuleSeffGuardedBranch"


    // $ANTLR start "ruleSeffGuardedBranch"
    // InternalRepoLang.g:837:1: ruleSeffGuardedBranch : ( ( rule__SeffGuardedBranch__Group__0 ) ) ;
    public final void ruleSeffGuardedBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:841:2: ( ( ( rule__SeffGuardedBranch__Group__0 ) ) )
            // InternalRepoLang.g:842:2: ( ( rule__SeffGuardedBranch__Group__0 ) )
            {
            // InternalRepoLang.g:842:2: ( ( rule__SeffGuardedBranch__Group__0 ) )
            // InternalRepoLang.g:843:3: ( rule__SeffGuardedBranch__Group__0 )
            {
             before(grammarAccess.getSeffGuardedBranchAccess().getGroup()); 
            // InternalRepoLang.g:844:3: ( rule__SeffGuardedBranch__Group__0 )
            // InternalRepoLang.g:844:4: rule__SeffGuardedBranch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SeffGuardedBranch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeffGuardedBranchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeffGuardedBranch"


    // $ANTLR start "entryRuleSeffForkAction"
    // InternalRepoLang.g:853:1: entryRuleSeffForkAction : ruleSeffForkAction EOF ;
    public final void entryRuleSeffForkAction() throws RecognitionException {
        try {
            // InternalRepoLang.g:854:1: ( ruleSeffForkAction EOF )
            // InternalRepoLang.g:855:1: ruleSeffForkAction EOF
            {
             before(grammarAccess.getSeffForkActionRule()); 
            pushFollow(FOLLOW_1);
            ruleSeffForkAction();

            state._fsp--;

             after(grammarAccess.getSeffForkActionRule()); 
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
    // $ANTLR end "entryRuleSeffForkAction"


    // $ANTLR start "ruleSeffForkAction"
    // InternalRepoLang.g:862:1: ruleSeffForkAction : ( ( rule__SeffForkAction__Group__0 ) ) ;
    public final void ruleSeffForkAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:866:2: ( ( ( rule__SeffForkAction__Group__0 ) ) )
            // InternalRepoLang.g:867:2: ( ( rule__SeffForkAction__Group__0 ) )
            {
            // InternalRepoLang.g:867:2: ( ( rule__SeffForkAction__Group__0 ) )
            // InternalRepoLang.g:868:3: ( rule__SeffForkAction__Group__0 )
            {
             before(grammarAccess.getSeffForkActionAccess().getGroup()); 
            // InternalRepoLang.g:869:3: ( rule__SeffForkAction__Group__0 )
            // InternalRepoLang.g:869:4: rule__SeffForkAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SeffForkAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeffForkActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeffForkAction"


    // $ANTLR start "entryRuleSeffFork"
    // InternalRepoLang.g:878:1: entryRuleSeffFork : ruleSeffFork EOF ;
    public final void entryRuleSeffFork() throws RecognitionException {
        try {
            // InternalRepoLang.g:879:1: ( ruleSeffFork EOF )
            // InternalRepoLang.g:880:1: ruleSeffFork EOF
            {
             before(grammarAccess.getSeffForkRule()); 
            pushFollow(FOLLOW_1);
            ruleSeffFork();

            state._fsp--;

             after(grammarAccess.getSeffForkRule()); 
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
    // $ANTLR end "entryRuleSeffFork"


    // $ANTLR start "ruleSeffFork"
    // InternalRepoLang.g:887:1: ruleSeffFork : ( ( rule__SeffFork__Group__0 ) ) ;
    public final void ruleSeffFork() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:891:2: ( ( ( rule__SeffFork__Group__0 ) ) )
            // InternalRepoLang.g:892:2: ( ( rule__SeffFork__Group__0 ) )
            {
            // InternalRepoLang.g:892:2: ( ( rule__SeffFork__Group__0 ) )
            // InternalRepoLang.g:893:3: ( rule__SeffFork__Group__0 )
            {
             before(grammarAccess.getSeffForkAccess().getGroup()); 
            // InternalRepoLang.g:894:3: ( rule__SeffFork__Group__0 )
            // InternalRepoLang.g:894:4: rule__SeffFork__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SeffFork__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeffForkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeffFork"


    // $ANTLR start "entryRuleSubSeff"
    // InternalRepoLang.g:903:1: entryRuleSubSeff : ruleSubSeff EOF ;
    public final void entryRuleSubSeff() throws RecognitionException {
        try {
            // InternalRepoLang.g:904:1: ( ruleSubSeff EOF )
            // InternalRepoLang.g:905:1: ruleSubSeff EOF
            {
             before(grammarAccess.getSubSeffRule()); 
            pushFollow(FOLLOW_1);
            ruleSubSeff();

            state._fsp--;

             after(grammarAccess.getSubSeffRule()); 
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
    // $ANTLR end "entryRuleSubSeff"


    // $ANTLR start "ruleSubSeff"
    // InternalRepoLang.g:912:1: ruleSubSeff : ( ( rule__SubSeff__Group__0 ) ) ;
    public final void ruleSubSeff() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:916:2: ( ( ( rule__SubSeff__Group__0 ) ) )
            // InternalRepoLang.g:917:2: ( ( rule__SubSeff__Group__0 ) )
            {
            // InternalRepoLang.g:917:2: ( ( rule__SubSeff__Group__0 ) )
            // InternalRepoLang.g:918:3: ( rule__SubSeff__Group__0 )
            {
             before(grammarAccess.getSubSeffAccess().getGroup()); 
            // InternalRepoLang.g:919:3: ( rule__SubSeff__Group__0 )
            // InternalRepoLang.g:919:4: rule__SubSeff__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubSeff__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubSeffAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubSeff"


    // $ANTLR start "entryRulePassiveResource"
    // InternalRepoLang.g:928:1: entryRulePassiveResource : rulePassiveResource EOF ;
    public final void entryRulePassiveResource() throws RecognitionException {
        try {
            // InternalRepoLang.g:929:1: ( rulePassiveResource EOF )
            // InternalRepoLang.g:930:1: rulePassiveResource EOF
            {
             before(grammarAccess.getPassiveResourceRule()); 
            pushFollow(FOLLOW_1);
            rulePassiveResource();

            state._fsp--;

             after(grammarAccess.getPassiveResourceRule()); 
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
    // $ANTLR end "entryRulePassiveResource"


    // $ANTLR start "rulePassiveResource"
    // InternalRepoLang.g:937:1: rulePassiveResource : ( ( rule__PassiveResource__Group__0 ) ) ;
    public final void rulePassiveResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:941:2: ( ( ( rule__PassiveResource__Group__0 ) ) )
            // InternalRepoLang.g:942:2: ( ( rule__PassiveResource__Group__0 ) )
            {
            // InternalRepoLang.g:942:2: ( ( rule__PassiveResource__Group__0 ) )
            // InternalRepoLang.g:943:3: ( rule__PassiveResource__Group__0 )
            {
             before(grammarAccess.getPassiveResourceAccess().getGroup()); 
            // InternalRepoLang.g:944:3: ( rule__PassiveResource__Group__0 )
            // InternalRepoLang.g:944:4: rule__PassiveResource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PassiveResource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPassiveResourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePassiveResource"


    // $ANTLR start "entryRuleProbability"
    // InternalRepoLang.g:953:1: entryRuleProbability : ruleProbability EOF ;
    public final void entryRuleProbability() throws RecognitionException {
        try {
            // InternalRepoLang.g:954:1: ( ruleProbability EOF )
            // InternalRepoLang.g:955:1: ruleProbability EOF
            {
             before(grammarAccess.getProbabilityRule()); 
            pushFollow(FOLLOW_1);
            ruleProbability();

            state._fsp--;

             after(grammarAccess.getProbabilityRule()); 
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
    // $ANTLR end "entryRuleProbability"


    // $ANTLR start "ruleProbability"
    // InternalRepoLang.g:962:1: ruleProbability : ( ( rule__Probability__Group__0 ) ) ;
    public final void ruleProbability() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:966:2: ( ( ( rule__Probability__Group__0 ) ) )
            // InternalRepoLang.g:967:2: ( ( rule__Probability__Group__0 ) )
            {
            // InternalRepoLang.g:967:2: ( ( rule__Probability__Group__0 ) )
            // InternalRepoLang.g:968:3: ( rule__Probability__Group__0 )
            {
             before(grammarAccess.getProbabilityAccess().getGroup()); 
            // InternalRepoLang.g:969:3: ( rule__Probability__Group__0 )
            // InternalRepoLang.g:969:4: rule__Probability__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Probability__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProbabilityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProbability"


    // $ANTLR start "ruleCharType"
    // InternalRepoLang.g:978:1: ruleCharType : ( ( rule__CharType__Alternatives ) ) ;
    public final void ruleCharType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:982:1: ( ( ( rule__CharType__Alternatives ) ) )
            // InternalRepoLang.g:983:2: ( ( rule__CharType__Alternatives ) )
            {
            // InternalRepoLang.g:983:2: ( ( rule__CharType__Alternatives ) )
            // InternalRepoLang.g:984:3: ( rule__CharType__Alternatives )
            {
             before(grammarAccess.getCharTypeAccess().getAlternatives()); 
            // InternalRepoLang.g:985:3: ( rule__CharType__Alternatives )
            // InternalRepoLang.g:985:4: rule__CharType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CharType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCharTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharType"


    // $ANTLR start "rule__NamedElement__Alternatives"
    // InternalRepoLang.g:993:1: rule__NamedElement__Alternatives : ( ( ruleInterface ) | ( ruleComponent ) );
    public final void rule__NamedElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:997:1: ( ( ruleInterface ) | ( ruleComponent ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            else if ( (LA1_0==32) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRepoLang.g:998:2: ( ruleInterface )
                    {
                    // InternalRepoLang.g:998:2: ( ruleInterface )
                    // InternalRepoLang.g:999:3: ruleInterface
                    {
                     before(grammarAccess.getNamedElementAccess().getInterfaceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInterface();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getInterfaceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRepoLang.g:1004:2: ( ruleComponent )
                    {
                    // InternalRepoLang.g:1004:2: ( ruleComponent )
                    // InternalRepoLang.g:1005:3: ruleComponent
                    {
                     before(grammarAccess.getNamedElementAccess().getComponentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComponent();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getComponentParserRuleCall_1()); 

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
    // $ANTLR end "rule__NamedElement__Alternatives"


    // $ANTLR start "rule__CustomType__Alternatives"
    // InternalRepoLang.g:1014:1: rule__CustomType__Alternatives : ( ( ruleCustomCompositeType ) | ( ruleCustomCollectionType ) );
    public final void rule__CustomType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1018:1: ( ( ruleCustomCompositeType ) | ( ruleCustomCollectionType ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                alt2=1;
            }
            else if ( (LA2_0==30) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRepoLang.g:1019:2: ( ruleCustomCompositeType )
                    {
                    // InternalRepoLang.g:1019:2: ( ruleCustomCompositeType )
                    // InternalRepoLang.g:1020:3: ruleCustomCompositeType
                    {
                     before(grammarAccess.getCustomTypeAccess().getCustomCompositeTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCustomCompositeType();

                    state._fsp--;

                     after(grammarAccess.getCustomTypeAccess().getCustomCompositeTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRepoLang.g:1025:2: ( ruleCustomCollectionType )
                    {
                    // InternalRepoLang.g:1025:2: ( ruleCustomCollectionType )
                    // InternalRepoLang.g:1026:3: ruleCustomCollectionType
                    {
                     before(grammarAccess.getCustomTypeAccess().getCustomCollectionTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCustomCollectionType();

                    state._fsp--;

                     after(grammarAccess.getCustomTypeAccess().getCustomCollectionTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__CustomType__Alternatives"


    // $ANTLR start "rule__SeffAction__Alternatives"
    // InternalRepoLang.g:1035:1: rule__SeffAction__Alternatives : ( ( ruleSeffInternalAction ) | ( ruleSeffAcquireAction ) | ( ruleSeffReleaseAction ) | ( ruleSeffExternalCallAction ) | ( ruleSeffProbabilisticBranchAction ) | ( ruleSeffGuardedBranchAction ) | ( ruleSeffForkAction ) | ( ruleSeffLoopAction ) | ( ruleSeffSetReturnAction ) | ( ruleSeffSetVariableAction ) );
    public final void rule__SeffAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1039:1: ( ( ruleSeffInternalAction ) | ( ruleSeffAcquireAction ) | ( ruleSeffReleaseAction ) | ( ruleSeffExternalCallAction ) | ( ruleSeffProbabilisticBranchAction ) | ( ruleSeffGuardedBranchAction ) | ( ruleSeffForkAction ) | ( ruleSeffLoopAction ) | ( ruleSeffSetReturnAction ) | ( ruleSeffSetVariableAction ) )
            int alt3=10;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt3=1;
                }
                break;
            case 39:
                {
                alt3=2;
                }
                break;
            case 40:
                {
                alt3=3;
                }
                break;
            case 44:
                {
                alt3=4;
                }
                break;
            case 48:
                {
                alt3=5;
                }
                break;
            case 49:
                {
                alt3=6;
                }
                break;
            case 50:
                {
                alt3=7;
                }
                break;
            case 41:
                {
                alt3=8;
                }
                break;
            case 42:
                {
                alt3=9;
                }
                break;
            case 43:
                {
                alt3=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRepoLang.g:1040:2: ( ruleSeffInternalAction )
                    {
                    // InternalRepoLang.g:1040:2: ( ruleSeffInternalAction )
                    // InternalRepoLang.g:1041:3: ruleSeffInternalAction
                    {
                     before(grammarAccess.getSeffActionAccess().getSeffInternalActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSeffInternalAction();

                    state._fsp--;

                     after(grammarAccess.getSeffActionAccess().getSeffInternalActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRepoLang.g:1046:2: ( ruleSeffAcquireAction )
                    {
                    // InternalRepoLang.g:1046:2: ( ruleSeffAcquireAction )
                    // InternalRepoLang.g:1047:3: ruleSeffAcquireAction
                    {
                     before(grammarAccess.getSeffActionAccess().getSeffAcquireActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSeffAcquireAction();

                    state._fsp--;

                     after(grammarAccess.getSeffActionAccess().getSeffAcquireActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRepoLang.g:1052:2: ( ruleSeffReleaseAction )
                    {
                    // InternalRepoLang.g:1052:2: ( ruleSeffReleaseAction )
                    // InternalRepoLang.g:1053:3: ruleSeffReleaseAction
                    {
                     before(grammarAccess.getSeffActionAccess().getSeffReleaseActionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSeffReleaseAction();

                    state._fsp--;

                     after(grammarAccess.getSeffActionAccess().getSeffReleaseActionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRepoLang.g:1058:2: ( ruleSeffExternalCallAction )
                    {
                    // InternalRepoLang.g:1058:2: ( ruleSeffExternalCallAction )
                    // InternalRepoLang.g:1059:3: ruleSeffExternalCallAction
                    {
                     before(grammarAccess.getSeffActionAccess().getSeffExternalCallActionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSeffExternalCallAction();

                    state._fsp--;

                     after(grammarAccess.getSeffActionAccess().getSeffExternalCallActionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRepoLang.g:1064:2: ( ruleSeffProbabilisticBranchAction )
                    {
                    // InternalRepoLang.g:1064:2: ( ruleSeffProbabilisticBranchAction )
                    // InternalRepoLang.g:1065:3: ruleSeffProbabilisticBranchAction
                    {
                     before(grammarAccess.getSeffActionAccess().getSeffProbabilisticBranchActionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSeffProbabilisticBranchAction();

                    state._fsp--;

                     after(grammarAccess.getSeffActionAccess().getSeffProbabilisticBranchActionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRepoLang.g:1070:2: ( ruleSeffGuardedBranchAction )
                    {
                    // InternalRepoLang.g:1070:2: ( ruleSeffGuardedBranchAction )
                    // InternalRepoLang.g:1071:3: ruleSeffGuardedBranchAction
                    {
                     before(grammarAccess.getSeffActionAccess().getSeffGuardedBranchActionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleSeffGuardedBranchAction();

                    state._fsp--;

                     after(grammarAccess.getSeffActionAccess().getSeffGuardedBranchActionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRepoLang.g:1076:2: ( ruleSeffForkAction )
                    {
                    // InternalRepoLang.g:1076:2: ( ruleSeffForkAction )
                    // InternalRepoLang.g:1077:3: ruleSeffForkAction
                    {
                     before(grammarAccess.getSeffActionAccess().getSeffForkActionParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleSeffForkAction();

                    state._fsp--;

                     after(grammarAccess.getSeffActionAccess().getSeffForkActionParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRepoLang.g:1082:2: ( ruleSeffLoopAction )
                    {
                    // InternalRepoLang.g:1082:2: ( ruleSeffLoopAction )
                    // InternalRepoLang.g:1083:3: ruleSeffLoopAction
                    {
                     before(grammarAccess.getSeffActionAccess().getSeffLoopActionParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleSeffLoopAction();

                    state._fsp--;

                     after(grammarAccess.getSeffActionAccess().getSeffLoopActionParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalRepoLang.g:1088:2: ( ruleSeffSetReturnAction )
                    {
                    // InternalRepoLang.g:1088:2: ( ruleSeffSetReturnAction )
                    // InternalRepoLang.g:1089:3: ruleSeffSetReturnAction
                    {
                     before(grammarAccess.getSeffActionAccess().getSeffSetReturnActionParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleSeffSetReturnAction();

                    state._fsp--;

                     after(grammarAccess.getSeffActionAccess().getSeffSetReturnActionParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalRepoLang.g:1094:2: ( ruleSeffSetVariableAction )
                    {
                    // InternalRepoLang.g:1094:2: ( ruleSeffSetVariableAction )
                    // InternalRepoLang.g:1095:3: ruleSeffSetVariableAction
                    {
                     before(grammarAccess.getSeffActionAccess().getSeffSetVariableActionParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleSeffSetVariableAction();

                    state._fsp--;

                     after(grammarAccess.getSeffActionAccess().getSeffSetVariableActionParserRuleCall_9()); 

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
    // $ANTLR end "rule__SeffAction__Alternatives"


    // $ANTLR start "rule__SeffCallParameter__Alternatives_0"
    // InternalRepoLang.g:1104:1: rule__SeffCallParameter__Alternatives_0 : ( ( ( rule__SeffCallParameter__ParameterAssignment_0_0 ) ) | ( ( rule__SeffCallParameter__ReferenceNameAssignment_0_1 ) ) );
    public final void rule__SeffCallParameter__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1108:1: ( ( ( rule__SeffCallParameter__ParameterAssignment_0_0 ) ) | ( ( rule__SeffCallParameter__ReferenceNameAssignment_0_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRepoLang.g:1109:2: ( ( rule__SeffCallParameter__ParameterAssignment_0_0 ) )
                    {
                    // InternalRepoLang.g:1109:2: ( ( rule__SeffCallParameter__ParameterAssignment_0_0 ) )
                    // InternalRepoLang.g:1110:3: ( rule__SeffCallParameter__ParameterAssignment_0_0 )
                    {
                     before(grammarAccess.getSeffCallParameterAccess().getParameterAssignment_0_0()); 
                    // InternalRepoLang.g:1111:3: ( rule__SeffCallParameter__ParameterAssignment_0_0 )
                    // InternalRepoLang.g:1111:4: rule__SeffCallParameter__ParameterAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SeffCallParameter__ParameterAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSeffCallParameterAccess().getParameterAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRepoLang.g:1115:2: ( ( rule__SeffCallParameter__ReferenceNameAssignment_0_1 ) )
                    {
                    // InternalRepoLang.g:1115:2: ( ( rule__SeffCallParameter__ReferenceNameAssignment_0_1 ) )
                    // InternalRepoLang.g:1116:3: ( rule__SeffCallParameter__ReferenceNameAssignment_0_1 )
                    {
                     before(grammarAccess.getSeffCallParameterAccess().getReferenceNameAssignment_0_1()); 
                    // InternalRepoLang.g:1117:3: ( rule__SeffCallParameter__ReferenceNameAssignment_0_1 )
                    // InternalRepoLang.g:1117:4: rule__SeffCallParameter__ReferenceNameAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SeffCallParameter__ReferenceNameAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSeffCallParameterAccess().getReferenceNameAssignment_0_1()); 

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
    // $ANTLR end "rule__SeffCallParameter__Alternatives_0"


    // $ANTLR start "rule__CharType__Alternatives"
    // InternalRepoLang.g:1125:1: rule__CharType__Alternatives : ( ( ( 'STRUCTURE' ) ) | ( ( 'NUMBER_OF_ELEMENTS' ) ) | ( ( 'VALUE' ) ) | ( ( 'BYTESIZE' ) ) | ( ( 'TYPE' ) ) );
    public final void rule__CharType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1129:1: ( ( ( 'STRUCTURE' ) ) | ( ( 'NUMBER_OF_ELEMENTS' ) ) | ( ( 'VALUE' ) ) | ( ( 'BYTESIZE' ) ) | ( ( 'TYPE' ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            case 15:
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
                    // InternalRepoLang.g:1130:2: ( ( 'STRUCTURE' ) )
                    {
                    // InternalRepoLang.g:1130:2: ( ( 'STRUCTURE' ) )
                    // InternalRepoLang.g:1131:3: ( 'STRUCTURE' )
                    {
                     before(grammarAccess.getCharTypeAccess().getSTRUCTUREEnumLiteralDeclaration_0()); 
                    // InternalRepoLang.g:1132:3: ( 'STRUCTURE' )
                    // InternalRepoLang.g:1132:4: 'STRUCTURE'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getCharTypeAccess().getSTRUCTUREEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRepoLang.g:1136:2: ( ( 'NUMBER_OF_ELEMENTS' ) )
                    {
                    // InternalRepoLang.g:1136:2: ( ( 'NUMBER_OF_ELEMENTS' ) )
                    // InternalRepoLang.g:1137:3: ( 'NUMBER_OF_ELEMENTS' )
                    {
                     before(grammarAccess.getCharTypeAccess().getNUMBER_OF_ELEMENTSEnumLiteralDeclaration_1()); 
                    // InternalRepoLang.g:1138:3: ( 'NUMBER_OF_ELEMENTS' )
                    // InternalRepoLang.g:1138:4: 'NUMBER_OF_ELEMENTS'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getCharTypeAccess().getNUMBER_OF_ELEMENTSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRepoLang.g:1142:2: ( ( 'VALUE' ) )
                    {
                    // InternalRepoLang.g:1142:2: ( ( 'VALUE' ) )
                    // InternalRepoLang.g:1143:3: ( 'VALUE' )
                    {
                     before(grammarAccess.getCharTypeAccess().getVALUEEnumLiteralDeclaration_2()); 
                    // InternalRepoLang.g:1144:3: ( 'VALUE' )
                    // InternalRepoLang.g:1144:4: 'VALUE'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getCharTypeAccess().getVALUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRepoLang.g:1148:2: ( ( 'BYTESIZE' ) )
                    {
                    // InternalRepoLang.g:1148:2: ( ( 'BYTESIZE' ) )
                    // InternalRepoLang.g:1149:3: ( 'BYTESIZE' )
                    {
                     before(grammarAccess.getCharTypeAccess().getBYTESIZEEnumLiteralDeclaration_3()); 
                    // InternalRepoLang.g:1150:3: ( 'BYTESIZE' )
                    // InternalRepoLang.g:1150:4: 'BYTESIZE'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getCharTypeAccess().getBYTESIZEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRepoLang.g:1154:2: ( ( 'TYPE' ) )
                    {
                    // InternalRepoLang.g:1154:2: ( ( 'TYPE' ) )
                    // InternalRepoLang.g:1155:3: ( 'TYPE' )
                    {
                     before(grammarAccess.getCharTypeAccess().getTYPEEnumLiteralDeclaration_4()); 
                    // InternalRepoLang.g:1156:3: ( 'TYPE' )
                    // InternalRepoLang.g:1156:4: 'TYPE'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getCharTypeAccess().getTYPEEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__CharType__Alternatives"


    // $ANTLR start "rule__Repository__Group__0"
    // InternalRepoLang.g:1164:1: rule__Repository__Group__0 : rule__Repository__Group__0__Impl rule__Repository__Group__1 ;
    public final void rule__Repository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1168:1: ( rule__Repository__Group__0__Impl rule__Repository__Group__1 )
            // InternalRepoLang.g:1169:2: rule__Repository__Group__0__Impl rule__Repository__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Repository__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repository__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__0"


    // $ANTLR start "rule__Repository__Group__0__Impl"
    // InternalRepoLang.g:1176:1: rule__Repository__Group__0__Impl : ( 'Repository' ) ;
    public final void rule__Repository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1180:1: ( ( 'Repository' ) )
            // InternalRepoLang.g:1181:1: ( 'Repository' )
            {
            // InternalRepoLang.g:1181:1: ( 'Repository' )
            // InternalRepoLang.g:1182:2: 'Repository'
            {
             before(grammarAccess.getRepositoryAccess().getRepositoryKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRepositoryAccess().getRepositoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__0__Impl"


    // $ANTLR start "rule__Repository__Group__1"
    // InternalRepoLang.g:1191:1: rule__Repository__Group__1 : rule__Repository__Group__1__Impl rule__Repository__Group__2 ;
    public final void rule__Repository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1195:1: ( rule__Repository__Group__1__Impl rule__Repository__Group__2 )
            // InternalRepoLang.g:1196:2: rule__Repository__Group__1__Impl rule__Repository__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Repository__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repository__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__1"


    // $ANTLR start "rule__Repository__Group__1__Impl"
    // InternalRepoLang.g:1203:1: rule__Repository__Group__1__Impl : ( ( rule__Repository__NameAssignment_1 ) ) ;
    public final void rule__Repository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1207:1: ( ( ( rule__Repository__NameAssignment_1 ) ) )
            // InternalRepoLang.g:1208:1: ( ( rule__Repository__NameAssignment_1 ) )
            {
            // InternalRepoLang.g:1208:1: ( ( rule__Repository__NameAssignment_1 ) )
            // InternalRepoLang.g:1209:2: ( rule__Repository__NameAssignment_1 )
            {
             before(grammarAccess.getRepositoryAccess().getNameAssignment_1()); 
            // InternalRepoLang.g:1210:2: ( rule__Repository__NameAssignment_1 )
            // InternalRepoLang.g:1210:3: rule__Repository__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Repository__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__1__Impl"


    // $ANTLR start "rule__Repository__Group__2"
    // InternalRepoLang.g:1218:1: rule__Repository__Group__2 : rule__Repository__Group__2__Impl rule__Repository__Group__3 ;
    public final void rule__Repository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1222:1: ( rule__Repository__Group__2__Impl rule__Repository__Group__3 )
            // InternalRepoLang.g:1223:2: rule__Repository__Group__2__Impl rule__Repository__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Repository__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repository__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__2"


    // $ANTLR start "rule__Repository__Group__2__Impl"
    // InternalRepoLang.g:1230:1: rule__Repository__Group__2__Impl : ( ( rule__Repository__ImportsAssignment_2 )* ) ;
    public final void rule__Repository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1234:1: ( ( ( rule__Repository__ImportsAssignment_2 )* ) )
            // InternalRepoLang.g:1235:1: ( ( rule__Repository__ImportsAssignment_2 )* )
            {
            // InternalRepoLang.g:1235:1: ( ( rule__Repository__ImportsAssignment_2 )* )
            // InternalRepoLang.g:1236:2: ( rule__Repository__ImportsAssignment_2 )*
            {
             before(grammarAccess.getRepositoryAccess().getImportsAssignment_2()); 
            // InternalRepoLang.g:1237:2: ( rule__Repository__ImportsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRepoLang.g:1237:3: rule__Repository__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Repository__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRepositoryAccess().getImportsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__2__Impl"


    // $ANTLR start "rule__Repository__Group__3"
    // InternalRepoLang.g:1245:1: rule__Repository__Group__3 : rule__Repository__Group__3__Impl rule__Repository__Group__4 ;
    public final void rule__Repository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1249:1: ( rule__Repository__Group__3__Impl rule__Repository__Group__4 )
            // InternalRepoLang.g:1250:2: rule__Repository__Group__3__Impl rule__Repository__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Repository__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repository__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__3"


    // $ANTLR start "rule__Repository__Group__3__Impl"
    // InternalRepoLang.g:1257:1: rule__Repository__Group__3__Impl : ( ( rule__Repository__TypesAssignment_3 )? ) ;
    public final void rule__Repository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1261:1: ( ( ( rule__Repository__TypesAssignment_3 )? ) )
            // InternalRepoLang.g:1262:1: ( ( rule__Repository__TypesAssignment_3 )? )
            {
            // InternalRepoLang.g:1262:1: ( ( rule__Repository__TypesAssignment_3 )? )
            // InternalRepoLang.g:1263:2: ( rule__Repository__TypesAssignment_3 )?
            {
             before(grammarAccess.getRepositoryAccess().getTypesAssignment_3()); 
            // InternalRepoLang.g:1264:2: ( rule__Repository__TypesAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRepoLang.g:1264:3: rule__Repository__TypesAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Repository__TypesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRepositoryAccess().getTypesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__3__Impl"


    // $ANTLR start "rule__Repository__Group__4"
    // InternalRepoLang.g:1272:1: rule__Repository__Group__4 : rule__Repository__Group__4__Impl ;
    public final void rule__Repository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1276:1: ( rule__Repository__Group__4__Impl )
            // InternalRepoLang.g:1277:2: rule__Repository__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Repository__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__4"


    // $ANTLR start "rule__Repository__Group__4__Impl"
    // InternalRepoLang.g:1283:1: rule__Repository__Group__4__Impl : ( ( rule__Repository__ElementsAssignment_4 )* ) ;
    public final void rule__Repository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1287:1: ( ( ( rule__Repository__ElementsAssignment_4 )* ) )
            // InternalRepoLang.g:1288:1: ( ( rule__Repository__ElementsAssignment_4 )* )
            {
            // InternalRepoLang.g:1288:1: ( ( rule__Repository__ElementsAssignment_4 )* )
            // InternalRepoLang.g:1289:2: ( rule__Repository__ElementsAssignment_4 )*
            {
             before(grammarAccess.getRepositoryAccess().getElementsAssignment_4()); 
            // InternalRepoLang.g:1290:2: ( rule__Repository__ElementsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23||LA8_0==32) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRepoLang.g:1290:3: rule__Repository__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Repository__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRepositoryAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__4__Impl"


    // $ANTLR start "rule__ImportedRepository__Group__0"
    // InternalRepoLang.g:1299:1: rule__ImportedRepository__Group__0 : rule__ImportedRepository__Group__0__Impl rule__ImportedRepository__Group__1 ;
    public final void rule__ImportedRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1303:1: ( rule__ImportedRepository__Group__0__Impl rule__ImportedRepository__Group__1 )
            // InternalRepoLang.g:1304:2: rule__ImportedRepository__Group__0__Impl rule__ImportedRepository__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ImportedRepository__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedRepository__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedRepository__Group__0"


    // $ANTLR start "rule__ImportedRepository__Group__0__Impl"
    // InternalRepoLang.g:1311:1: rule__ImportedRepository__Group__0__Impl : ( 'import' ) ;
    public final void rule__ImportedRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1315:1: ( ( 'import' ) )
            // InternalRepoLang.g:1316:1: ( 'import' )
            {
            // InternalRepoLang.g:1316:1: ( 'import' )
            // InternalRepoLang.g:1317:2: 'import'
            {
             before(grammarAccess.getImportedRepositoryAccess().getImportKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getImportedRepositoryAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedRepository__Group__0__Impl"


    // $ANTLR start "rule__ImportedRepository__Group__1"
    // InternalRepoLang.g:1326:1: rule__ImportedRepository__Group__1 : rule__ImportedRepository__Group__1__Impl ;
    public final void rule__ImportedRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1330:1: ( rule__ImportedRepository__Group__1__Impl )
            // InternalRepoLang.g:1331:2: rule__ImportedRepository__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportedRepository__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedRepository__Group__1"


    // $ANTLR start "rule__ImportedRepository__Group__1__Impl"
    // InternalRepoLang.g:1337:1: rule__ImportedRepository__Group__1__Impl : ( ( rule__ImportedRepository__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__ImportedRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1341:1: ( ( ( rule__ImportedRepository__ImportedNamespaceAssignment_1 ) ) )
            // InternalRepoLang.g:1342:1: ( ( rule__ImportedRepository__ImportedNamespaceAssignment_1 ) )
            {
            // InternalRepoLang.g:1342:1: ( ( rule__ImportedRepository__ImportedNamespaceAssignment_1 ) )
            // InternalRepoLang.g:1343:2: ( rule__ImportedRepository__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportedRepositoryAccess().getImportedNamespaceAssignment_1()); 
            // InternalRepoLang.g:1344:2: ( rule__ImportedRepository__ImportedNamespaceAssignment_1 )
            // InternalRepoLang.g:1344:3: rule__ImportedRepository__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ImportedRepository__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportedRepositoryAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedRepository__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalRepoLang.g:1353:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1357:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalRepoLang.g:1358:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalRepoLang.g:1365:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1369:1: ( ( ruleFQN ) )
            // InternalRepoLang.g:1370:1: ( ruleFQN )
            {
            // InternalRepoLang.g:1370:1: ( ruleFQN )
            // InternalRepoLang.g:1371:2: ruleFQN
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFQNParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFQNParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalRepoLang.g:1380:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1384:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalRepoLang.g:1385:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalRepoLang.g:1391:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1395:1: ( ( ( '.*' )? ) )
            // InternalRepoLang.g:1396:1: ( ( '.*' )? )
            {
            // InternalRepoLang.g:1396:1: ( ( '.*' )? )
            // InternalRepoLang.g:1397:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalRepoLang.g:1398:2: ( '.*' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRepoLang.g:1398:3: '.*'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__TypeRepo__Group__0"
    // InternalRepoLang.g:1407:1: rule__TypeRepo__Group__0 : rule__TypeRepo__Group__0__Impl rule__TypeRepo__Group__1 ;
    public final void rule__TypeRepo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1411:1: ( rule__TypeRepo__Group__0__Impl rule__TypeRepo__Group__1 )
            // InternalRepoLang.g:1412:2: rule__TypeRepo__Group__0__Impl rule__TypeRepo__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__TypeRepo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeRepo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRepo__Group__0"


    // $ANTLR start "rule__TypeRepo__Group__0__Impl"
    // InternalRepoLang.g:1419:1: rule__TypeRepo__Group__0__Impl : ( 'Types' ) ;
    public final void rule__TypeRepo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1423:1: ( ( 'Types' ) )
            // InternalRepoLang.g:1424:1: ( 'Types' )
            {
            // InternalRepoLang.g:1424:1: ( 'Types' )
            // InternalRepoLang.g:1425:2: 'Types'
            {
             before(grammarAccess.getTypeRepoAccess().getTypesKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTypeRepoAccess().getTypesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRepo__Group__0__Impl"


    // $ANTLR start "rule__TypeRepo__Group__1"
    // InternalRepoLang.g:1434:1: rule__TypeRepo__Group__1 : rule__TypeRepo__Group__1__Impl rule__TypeRepo__Group__2 ;
    public final void rule__TypeRepo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1438:1: ( rule__TypeRepo__Group__1__Impl rule__TypeRepo__Group__2 )
            // InternalRepoLang.g:1439:2: rule__TypeRepo__Group__1__Impl rule__TypeRepo__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__TypeRepo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeRepo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRepo__Group__1"


    // $ANTLR start "rule__TypeRepo__Group__1__Impl"
    // InternalRepoLang.g:1446:1: rule__TypeRepo__Group__1__Impl : ( '{' ) ;
    public final void rule__TypeRepo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1450:1: ( ( '{' ) )
            // InternalRepoLang.g:1451:1: ( '{' )
            {
            // InternalRepoLang.g:1451:1: ( '{' )
            // InternalRepoLang.g:1452:2: '{'
            {
             before(grammarAccess.getTypeRepoAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTypeRepoAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRepo__Group__1__Impl"


    // $ANTLR start "rule__TypeRepo__Group__2"
    // InternalRepoLang.g:1461:1: rule__TypeRepo__Group__2 : rule__TypeRepo__Group__2__Impl rule__TypeRepo__Group__3 ;
    public final void rule__TypeRepo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1465:1: ( rule__TypeRepo__Group__2__Impl rule__TypeRepo__Group__3 )
            // InternalRepoLang.g:1466:2: rule__TypeRepo__Group__2__Impl rule__TypeRepo__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__TypeRepo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeRepo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRepo__Group__2"


    // $ANTLR start "rule__TypeRepo__Group__2__Impl"
    // InternalRepoLang.g:1473:1: rule__TypeRepo__Group__2__Impl : ( ( ( rule__TypeRepo__DataTypes__RepositoryAssignment_2 ) ) ( ( rule__TypeRepo__DataTypes__RepositoryAssignment_2 )* ) ) ;
    public final void rule__TypeRepo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1477:1: ( ( ( ( rule__TypeRepo__DataTypes__RepositoryAssignment_2 ) ) ( ( rule__TypeRepo__DataTypes__RepositoryAssignment_2 )* ) ) )
            // InternalRepoLang.g:1478:1: ( ( ( rule__TypeRepo__DataTypes__RepositoryAssignment_2 ) ) ( ( rule__TypeRepo__DataTypes__RepositoryAssignment_2 )* ) )
            {
            // InternalRepoLang.g:1478:1: ( ( ( rule__TypeRepo__DataTypes__RepositoryAssignment_2 ) ) ( ( rule__TypeRepo__DataTypes__RepositoryAssignment_2 )* ) )
            // InternalRepoLang.g:1479:2: ( ( rule__TypeRepo__DataTypes__RepositoryAssignment_2 ) ) ( ( rule__TypeRepo__DataTypes__RepositoryAssignment_2 )* )
            {
            // InternalRepoLang.g:1479:2: ( ( rule__TypeRepo__DataTypes__RepositoryAssignment_2 ) )
            // InternalRepoLang.g:1480:3: ( rule__TypeRepo__DataTypes__RepositoryAssignment_2 )
            {
             before(grammarAccess.getTypeRepoAccess().getDataTypes__RepositoryAssignment_2()); 
            // InternalRepoLang.g:1481:3: ( rule__TypeRepo__DataTypes__RepositoryAssignment_2 )
            // InternalRepoLang.g:1481:4: rule__TypeRepo__DataTypes__RepositoryAssignment_2
            {
            pushFollow(FOLLOW_11);
            rule__TypeRepo__DataTypes__RepositoryAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeRepoAccess().getDataTypes__RepositoryAssignment_2()); 

            }

            // InternalRepoLang.g:1484:2: ( ( rule__TypeRepo__DataTypes__RepositoryAssignment_2 )* )
            // InternalRepoLang.g:1485:3: ( rule__TypeRepo__DataTypes__RepositoryAssignment_2 )*
            {
             before(grammarAccess.getTypeRepoAccess().getDataTypes__RepositoryAssignment_2()); 
            // InternalRepoLang.g:1486:3: ( rule__TypeRepo__DataTypes__RepositoryAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28||LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRepoLang.g:1486:4: rule__TypeRepo__DataTypes__RepositoryAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TypeRepo__DataTypes__RepositoryAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTypeRepoAccess().getDataTypes__RepositoryAssignment_2()); 

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
    // $ANTLR end "rule__TypeRepo__Group__2__Impl"


    // $ANTLR start "rule__TypeRepo__Group__3"
    // InternalRepoLang.g:1495:1: rule__TypeRepo__Group__3 : rule__TypeRepo__Group__3__Impl ;
    public final void rule__TypeRepo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1499:1: ( rule__TypeRepo__Group__3__Impl )
            // InternalRepoLang.g:1500:2: rule__TypeRepo__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeRepo__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRepo__Group__3"


    // $ANTLR start "rule__TypeRepo__Group__3__Impl"
    // InternalRepoLang.g:1506:1: rule__TypeRepo__Group__3__Impl : ( '}' ) ;
    public final void rule__TypeRepo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1510:1: ( ( '}' ) )
            // InternalRepoLang.g:1511:1: ( '}' )
            {
            // InternalRepoLang.g:1511:1: ( '}' )
            // InternalRepoLang.g:1512:2: '}'
            {
             before(grammarAccess.getTypeRepoAccess().getRightCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTypeRepoAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRepo__Group__3__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalRepoLang.g:1522:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1526:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalRepoLang.g:1527:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // InternalRepoLang.g:1534:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1538:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:1539:1: ( RULE_ID )
            {
            // InternalRepoLang.g:1539:1: ( RULE_ID )
            // InternalRepoLang.g:1540:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // InternalRepoLang.g:1549:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1553:1: ( rule__FQN__Group__1__Impl )
            // InternalRepoLang.g:1554:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // InternalRepoLang.g:1560:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1564:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalRepoLang.g:1565:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalRepoLang.g:1565:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalRepoLang.g:1566:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalRepoLang.g:1567:2: ( rule__FQN__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRepoLang.g:1567:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // InternalRepoLang.g:1576:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1580:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalRepoLang.g:1581:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // InternalRepoLang.g:1588:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1592:1: ( ( '.' ) )
            // InternalRepoLang.g:1593:1: ( '.' )
            {
            // InternalRepoLang.g:1593:1: ( '.' )
            // InternalRepoLang.g:1594:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // InternalRepoLang.g:1603:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1607:1: ( rule__FQN__Group_1__1__Impl )
            // InternalRepoLang.g:1608:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // InternalRepoLang.g:1614:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1618:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:1619:1: ( RULE_ID )
            {
            // InternalRepoLang.g:1619:1: ( RULE_ID )
            // InternalRepoLang.g:1620:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // InternalRepoLang.g:1630:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1634:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalRepoLang.g:1635:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // InternalRepoLang.g:1642:1: rule__Interface__Group__0__Impl : ( 'Interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1646:1: ( ( 'Interface' ) )
            // InternalRepoLang.g:1647:1: ( 'Interface' )
            {
            // InternalRepoLang.g:1647:1: ( 'Interface' )
            // InternalRepoLang.g:1648:2: 'Interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // InternalRepoLang.g:1657:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1661:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalRepoLang.g:1662:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // InternalRepoLang.g:1669:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__NameAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1673:1: ( ( ( rule__Interface__NameAssignment_1 ) ) )
            // InternalRepoLang.g:1674:1: ( ( rule__Interface__NameAssignment_1 ) )
            {
            // InternalRepoLang.g:1674:1: ( ( rule__Interface__NameAssignment_1 ) )
            // InternalRepoLang.g:1675:2: ( rule__Interface__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 
            // InternalRepoLang.g:1676:2: ( rule__Interface__NameAssignment_1 )
            // InternalRepoLang.g:1676:3: rule__Interface__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Interface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // InternalRepoLang.g:1684:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1688:1: ( rule__Interface__Group__2__Impl )
            // InternalRepoLang.g:1689:2: rule__Interface__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // InternalRepoLang.g:1695:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__Group_2__0 )? ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1699:1: ( ( ( rule__Interface__Group_2__0 )? ) )
            // InternalRepoLang.g:1700:1: ( ( rule__Interface__Group_2__0 )? )
            {
            // InternalRepoLang.g:1700:1: ( ( rule__Interface__Group_2__0 )? )
            // InternalRepoLang.g:1701:2: ( rule__Interface__Group_2__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_2()); 
            // InternalRepoLang.g:1702:2: ( rule__Interface__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRepoLang.g:1702:3: rule__Interface__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group_2__0"
    // InternalRepoLang.g:1711:1: rule__Interface__Group_2__0 : rule__Interface__Group_2__0__Impl rule__Interface__Group_2__1 ;
    public final void rule__Interface__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1715:1: ( rule__Interface__Group_2__0__Impl rule__Interface__Group_2__1 )
            // InternalRepoLang.g:1716:2: rule__Interface__Group_2__0__Impl rule__Interface__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Interface__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2__0"


    // $ANTLR start "rule__Interface__Group_2__0__Impl"
    // InternalRepoLang.g:1723:1: rule__Interface__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Interface__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1727:1: ( ( '{' ) )
            // InternalRepoLang.g:1728:1: ( '{' )
            {
            // InternalRepoLang.g:1728:1: ( '{' )
            // InternalRepoLang.g:1729:2: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2__0__Impl"


    // $ANTLR start "rule__Interface__Group_2__1"
    // InternalRepoLang.g:1738:1: rule__Interface__Group_2__1 : rule__Interface__Group_2__1__Impl rule__Interface__Group_2__2 ;
    public final void rule__Interface__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1742:1: ( rule__Interface__Group_2__1__Impl rule__Interface__Group_2__2 )
            // InternalRepoLang.g:1743:2: rule__Interface__Group_2__1__Impl rule__Interface__Group_2__2
            {
            pushFollow(FOLLOW_10);
            rule__Interface__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2__1"


    // $ANTLR start "rule__Interface__Group_2__1__Impl"
    // InternalRepoLang.g:1750:1: rule__Interface__Group_2__1__Impl : ( ( ( rule__Interface__SignatureAssignment_2_1 ) ) ( ( rule__Interface__SignatureAssignment_2_1 )* ) ) ;
    public final void rule__Interface__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1754:1: ( ( ( ( rule__Interface__SignatureAssignment_2_1 ) ) ( ( rule__Interface__SignatureAssignment_2_1 )* ) ) )
            // InternalRepoLang.g:1755:1: ( ( ( rule__Interface__SignatureAssignment_2_1 ) ) ( ( rule__Interface__SignatureAssignment_2_1 )* ) )
            {
            // InternalRepoLang.g:1755:1: ( ( ( rule__Interface__SignatureAssignment_2_1 ) ) ( ( rule__Interface__SignatureAssignment_2_1 )* ) )
            // InternalRepoLang.g:1756:2: ( ( rule__Interface__SignatureAssignment_2_1 ) ) ( ( rule__Interface__SignatureAssignment_2_1 )* )
            {
            // InternalRepoLang.g:1756:2: ( ( rule__Interface__SignatureAssignment_2_1 ) )
            // InternalRepoLang.g:1757:3: ( rule__Interface__SignatureAssignment_2_1 )
            {
             before(grammarAccess.getInterfaceAccess().getSignatureAssignment_2_1()); 
            // InternalRepoLang.g:1758:3: ( rule__Interface__SignatureAssignment_2_1 )
            // InternalRepoLang.g:1758:4: rule__Interface__SignatureAssignment_2_1
            {
            pushFollow(FOLLOW_14);
            rule__Interface__SignatureAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getSignatureAssignment_2_1()); 

            }

            // InternalRepoLang.g:1761:2: ( ( rule__Interface__SignatureAssignment_2_1 )* )
            // InternalRepoLang.g:1762:3: ( rule__Interface__SignatureAssignment_2_1 )*
            {
             before(grammarAccess.getInterfaceAccess().getSignatureAssignment_2_1()); 
            // InternalRepoLang.g:1763:3: ( rule__Interface__SignatureAssignment_2_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRepoLang.g:1763:4: rule__Interface__SignatureAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Interface__SignatureAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getSignatureAssignment_2_1()); 

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
    // $ANTLR end "rule__Interface__Group_2__1__Impl"


    // $ANTLR start "rule__Interface__Group_2__2"
    // InternalRepoLang.g:1772:1: rule__Interface__Group_2__2 : rule__Interface__Group_2__2__Impl ;
    public final void rule__Interface__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1776:1: ( rule__Interface__Group_2__2__Impl )
            // InternalRepoLang.g:1777:2: rule__Interface__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2__2"


    // $ANTLR start "rule__Interface__Group_2__2__Impl"
    // InternalRepoLang.g:1783:1: rule__Interface__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Interface__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1787:1: ( ( '}' ) )
            // InternalRepoLang.g:1788:1: ( '}' )
            {
            // InternalRepoLang.g:1788:1: ( '}' )
            // InternalRepoLang.g:1789:2: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2__2__Impl"


    // $ANTLR start "rule__Signature__Group__0"
    // InternalRepoLang.g:1799:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1803:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // InternalRepoLang.g:1804:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Signature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0"


    // $ANTLR start "rule__Signature__Group__0__Impl"
    // InternalRepoLang.g:1811:1: rule__Signature__Group__0__Impl : ( ( rule__Signature__NameAssignment_0 ) ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1815:1: ( ( ( rule__Signature__NameAssignment_0 ) ) )
            // InternalRepoLang.g:1816:1: ( ( rule__Signature__NameAssignment_0 ) )
            {
            // InternalRepoLang.g:1816:1: ( ( rule__Signature__NameAssignment_0 ) )
            // InternalRepoLang.g:1817:2: ( rule__Signature__NameAssignment_0 )
            {
             before(grammarAccess.getSignatureAccess().getNameAssignment_0()); 
            // InternalRepoLang.g:1818:2: ( rule__Signature__NameAssignment_0 )
            // InternalRepoLang.g:1818:3: rule__Signature__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Signature__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0__Impl"


    // $ANTLR start "rule__Signature__Group__1"
    // InternalRepoLang.g:1826:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1830:1: ( rule__Signature__Group__1__Impl )
            // InternalRepoLang.g:1831:2: rule__Signature__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1"


    // $ANTLR start "rule__Signature__Group__1__Impl"
    // InternalRepoLang.g:1837:1: rule__Signature__Group__1__Impl : ( ( rule__Signature__Group_1__0 )? ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1841:1: ( ( ( rule__Signature__Group_1__0 )? ) )
            // InternalRepoLang.g:1842:1: ( ( rule__Signature__Group_1__0 )? )
            {
            // InternalRepoLang.g:1842:1: ( ( rule__Signature__Group_1__0 )? )
            // InternalRepoLang.g:1843:2: ( rule__Signature__Group_1__0 )?
            {
             before(grammarAccess.getSignatureAccess().getGroup_1()); 
            // InternalRepoLang.g:1844:2: ( rule__Signature__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRepoLang.g:1844:3: rule__Signature__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signature__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignatureAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1__Impl"


    // $ANTLR start "rule__Signature__Group_1__0"
    // InternalRepoLang.g:1853:1: rule__Signature__Group_1__0 : rule__Signature__Group_1__0__Impl rule__Signature__Group_1__1 ;
    public final void rule__Signature__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1857:1: ( rule__Signature__Group_1__0__Impl rule__Signature__Group_1__1 )
            // InternalRepoLang.g:1858:2: rule__Signature__Group_1__0__Impl rule__Signature__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Signature__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_1__0"


    // $ANTLR start "rule__Signature__Group_1__0__Impl"
    // InternalRepoLang.g:1865:1: rule__Signature__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Signature__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1869:1: ( ( '(' ) )
            // InternalRepoLang.g:1870:1: ( '(' )
            {
            // InternalRepoLang.g:1870:1: ( '(' )
            // InternalRepoLang.g:1871:2: '('
            {
             before(grammarAccess.getSignatureAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_1__0__Impl"


    // $ANTLR start "rule__Signature__Group_1__1"
    // InternalRepoLang.g:1880:1: rule__Signature__Group_1__1 : rule__Signature__Group_1__1__Impl rule__Signature__Group_1__2 ;
    public final void rule__Signature__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1884:1: ( rule__Signature__Group_1__1__Impl rule__Signature__Group_1__2 )
            // InternalRepoLang.g:1885:2: rule__Signature__Group_1__1__Impl rule__Signature__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Signature__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_1__1"


    // $ANTLR start "rule__Signature__Group_1__1__Impl"
    // InternalRepoLang.g:1892:1: rule__Signature__Group_1__1__Impl : ( ( rule__Signature__ParametersAssignment_1_1 ) ) ;
    public final void rule__Signature__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1896:1: ( ( ( rule__Signature__ParametersAssignment_1_1 ) ) )
            // InternalRepoLang.g:1897:1: ( ( rule__Signature__ParametersAssignment_1_1 ) )
            {
            // InternalRepoLang.g:1897:1: ( ( rule__Signature__ParametersAssignment_1_1 ) )
            // InternalRepoLang.g:1898:2: ( rule__Signature__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getSignatureAccess().getParametersAssignment_1_1()); 
            // InternalRepoLang.g:1899:2: ( rule__Signature__ParametersAssignment_1_1 )
            // InternalRepoLang.g:1899:3: rule__Signature__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Signature__ParametersAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getParametersAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_1__1__Impl"


    // $ANTLR start "rule__Signature__Group_1__2"
    // InternalRepoLang.g:1907:1: rule__Signature__Group_1__2 : rule__Signature__Group_1__2__Impl rule__Signature__Group_1__3 ;
    public final void rule__Signature__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1911:1: ( rule__Signature__Group_1__2__Impl rule__Signature__Group_1__3 )
            // InternalRepoLang.g:1912:2: rule__Signature__Group_1__2__Impl rule__Signature__Group_1__3
            {
            pushFollow(FOLLOW_16);
            rule__Signature__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_1__2"


    // $ANTLR start "rule__Signature__Group_1__2__Impl"
    // InternalRepoLang.g:1919:1: rule__Signature__Group_1__2__Impl : ( ( rule__Signature__Group_1_2__0 )* ) ;
    public final void rule__Signature__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1923:1: ( ( ( rule__Signature__Group_1_2__0 )* ) )
            // InternalRepoLang.g:1924:1: ( ( rule__Signature__Group_1_2__0 )* )
            {
            // InternalRepoLang.g:1924:1: ( ( rule__Signature__Group_1_2__0 )* )
            // InternalRepoLang.g:1925:2: ( rule__Signature__Group_1_2__0 )*
            {
             before(grammarAccess.getSignatureAccess().getGroup_1_2()); 
            // InternalRepoLang.g:1926:2: ( rule__Signature__Group_1_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRepoLang.g:1926:3: rule__Signature__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Signature__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSignatureAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_1__2__Impl"


    // $ANTLR start "rule__Signature__Group_1__3"
    // InternalRepoLang.g:1934:1: rule__Signature__Group_1__3 : rule__Signature__Group_1__3__Impl ;
    public final void rule__Signature__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1938:1: ( rule__Signature__Group_1__3__Impl )
            // InternalRepoLang.g:1939:2: rule__Signature__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_1__3"


    // $ANTLR start "rule__Signature__Group_1__3__Impl"
    // InternalRepoLang.g:1945:1: rule__Signature__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Signature__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1949:1: ( ( ')' ) )
            // InternalRepoLang.g:1950:1: ( ')' )
            {
            // InternalRepoLang.g:1950:1: ( ')' )
            // InternalRepoLang.g:1951:2: ')'
            {
             before(grammarAccess.getSignatureAccess().getRightParenthesisKeyword_1_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_1__3__Impl"


    // $ANTLR start "rule__Signature__Group_1_2__0"
    // InternalRepoLang.g:1961:1: rule__Signature__Group_1_2__0 : rule__Signature__Group_1_2__0__Impl rule__Signature__Group_1_2__1 ;
    public final void rule__Signature__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1965:1: ( rule__Signature__Group_1_2__0__Impl rule__Signature__Group_1_2__1 )
            // InternalRepoLang.g:1966:2: rule__Signature__Group_1_2__0__Impl rule__Signature__Group_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Signature__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_1_2__0"


    // $ANTLR start "rule__Signature__Group_1_2__0__Impl"
    // InternalRepoLang.g:1973:1: rule__Signature__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Signature__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1977:1: ( ( ',' ) )
            // InternalRepoLang.g:1978:1: ( ',' )
            {
            // InternalRepoLang.g:1978:1: ( ',' )
            // InternalRepoLang.g:1979:2: ','
            {
             before(grammarAccess.getSignatureAccess().getCommaKeyword_1_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_1_2__0__Impl"


    // $ANTLR start "rule__Signature__Group_1_2__1"
    // InternalRepoLang.g:1988:1: rule__Signature__Group_1_2__1 : rule__Signature__Group_1_2__1__Impl ;
    public final void rule__Signature__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:1992:1: ( rule__Signature__Group_1_2__1__Impl )
            // InternalRepoLang.g:1993:2: rule__Signature__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_1_2__1"


    // $ANTLR start "rule__Signature__Group_1_2__1__Impl"
    // InternalRepoLang.g:1999:1: rule__Signature__Group_1_2__1__Impl : ( ( rule__Signature__ParametersAssignment_1_2_1 ) ) ;
    public final void rule__Signature__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2003:1: ( ( ( rule__Signature__ParametersAssignment_1_2_1 ) ) )
            // InternalRepoLang.g:2004:1: ( ( rule__Signature__ParametersAssignment_1_2_1 ) )
            {
            // InternalRepoLang.g:2004:1: ( ( rule__Signature__ParametersAssignment_1_2_1 ) )
            // InternalRepoLang.g:2005:2: ( rule__Signature__ParametersAssignment_1_2_1 )
            {
             before(grammarAccess.getSignatureAccess().getParametersAssignment_1_2_1()); 
            // InternalRepoLang.g:2006:2: ( rule__Signature__ParametersAssignment_1_2_1 )
            // InternalRepoLang.g:2006:3: rule__Signature__ParametersAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Signature__ParametersAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getParametersAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_1_2__1__Impl"


    // $ANTLR start "rule__SignatureParameter__Group__0"
    // InternalRepoLang.g:2015:1: rule__SignatureParameter__Group__0 : rule__SignatureParameter__Group__0__Impl rule__SignatureParameter__Group__1 ;
    public final void rule__SignatureParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2019:1: ( rule__SignatureParameter__Group__0__Impl rule__SignatureParameter__Group__1 )
            // InternalRepoLang.g:2020:2: rule__SignatureParameter__Group__0__Impl rule__SignatureParameter__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__SignatureParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SignatureParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureParameter__Group__0"


    // $ANTLR start "rule__SignatureParameter__Group__0__Impl"
    // InternalRepoLang.g:2027:1: rule__SignatureParameter__Group__0__Impl : ( ( rule__SignatureParameter__NameAssignment_0 ) ) ;
    public final void rule__SignatureParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2031:1: ( ( ( rule__SignatureParameter__NameAssignment_0 ) ) )
            // InternalRepoLang.g:2032:1: ( ( rule__SignatureParameter__NameAssignment_0 ) )
            {
            // InternalRepoLang.g:2032:1: ( ( rule__SignatureParameter__NameAssignment_0 ) )
            // InternalRepoLang.g:2033:2: ( rule__SignatureParameter__NameAssignment_0 )
            {
             before(grammarAccess.getSignatureParameterAccess().getNameAssignment_0()); 
            // InternalRepoLang.g:2034:2: ( rule__SignatureParameter__NameAssignment_0 )
            // InternalRepoLang.g:2034:3: rule__SignatureParameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SignatureParameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSignatureParameterAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureParameter__Group__0__Impl"


    // $ANTLR start "rule__SignatureParameter__Group__1"
    // InternalRepoLang.g:2042:1: rule__SignatureParameter__Group__1 : rule__SignatureParameter__Group__1__Impl rule__SignatureParameter__Group__2 ;
    public final void rule__SignatureParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2046:1: ( rule__SignatureParameter__Group__1__Impl rule__SignatureParameter__Group__2 )
            // InternalRepoLang.g:2047:2: rule__SignatureParameter__Group__1__Impl rule__SignatureParameter__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SignatureParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SignatureParameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureParameter__Group__1"


    // $ANTLR start "rule__SignatureParameter__Group__1__Impl"
    // InternalRepoLang.g:2054:1: rule__SignatureParameter__Group__1__Impl : ( ':' ) ;
    public final void rule__SignatureParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2058:1: ( ( ':' ) )
            // InternalRepoLang.g:2059:1: ( ':' )
            {
            // InternalRepoLang.g:2059:1: ( ':' )
            // InternalRepoLang.g:2060:2: ':'
            {
             before(grammarAccess.getSignatureParameterAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSignatureParameterAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureParameter__Group__1__Impl"


    // $ANTLR start "rule__SignatureParameter__Group__2"
    // InternalRepoLang.g:2069:1: rule__SignatureParameter__Group__2 : rule__SignatureParameter__Group__2__Impl ;
    public final void rule__SignatureParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2073:1: ( rule__SignatureParameter__Group__2__Impl )
            // InternalRepoLang.g:2074:2: rule__SignatureParameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SignatureParameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureParameter__Group__2"


    // $ANTLR start "rule__SignatureParameter__Group__2__Impl"
    // InternalRepoLang.g:2080:1: rule__SignatureParameter__Group__2__Impl : ( ( rule__SignatureParameter__TypeAssignment_2 ) ) ;
    public final void rule__SignatureParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2084:1: ( ( ( rule__SignatureParameter__TypeAssignment_2 ) ) )
            // InternalRepoLang.g:2085:1: ( ( rule__SignatureParameter__TypeAssignment_2 ) )
            {
            // InternalRepoLang.g:2085:1: ( ( rule__SignatureParameter__TypeAssignment_2 ) )
            // InternalRepoLang.g:2086:2: ( rule__SignatureParameter__TypeAssignment_2 )
            {
             before(grammarAccess.getSignatureParameterAccess().getTypeAssignment_2()); 
            // InternalRepoLang.g:2087:2: ( rule__SignatureParameter__TypeAssignment_2 )
            // InternalRepoLang.g:2087:3: rule__SignatureParameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SignatureParameter__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSignatureParameterAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureParameter__Group__2__Impl"


    // $ANTLR start "rule__CustomCompositeType__Group__0"
    // InternalRepoLang.g:2096:1: rule__CustomCompositeType__Group__0 : rule__CustomCompositeType__Group__0__Impl rule__CustomCompositeType__Group__1 ;
    public final void rule__CustomCompositeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2100:1: ( rule__CustomCompositeType__Group__0__Impl rule__CustomCompositeType__Group__1 )
            // InternalRepoLang.g:2101:2: rule__CustomCompositeType__Group__0__Impl rule__CustomCompositeType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CustomCompositeType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomCompositeType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCompositeType__Group__0"


    // $ANTLR start "rule__CustomCompositeType__Group__0__Impl"
    // InternalRepoLang.g:2108:1: rule__CustomCompositeType__Group__0__Impl : ( 'struct' ) ;
    public final void rule__CustomCompositeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2112:1: ( ( 'struct' ) )
            // InternalRepoLang.g:2113:1: ( 'struct' )
            {
            // InternalRepoLang.g:2113:1: ( 'struct' )
            // InternalRepoLang.g:2114:2: 'struct'
            {
             before(grammarAccess.getCustomCompositeTypeAccess().getStructKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCustomCompositeTypeAccess().getStructKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCompositeType__Group__0__Impl"


    // $ANTLR start "rule__CustomCompositeType__Group__1"
    // InternalRepoLang.g:2123:1: rule__CustomCompositeType__Group__1 : rule__CustomCompositeType__Group__1__Impl rule__CustomCompositeType__Group__2 ;
    public final void rule__CustomCompositeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2127:1: ( rule__CustomCompositeType__Group__1__Impl rule__CustomCompositeType__Group__2 )
            // InternalRepoLang.g:2128:2: rule__CustomCompositeType__Group__1__Impl rule__CustomCompositeType__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__CustomCompositeType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomCompositeType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCompositeType__Group__1"


    // $ANTLR start "rule__CustomCompositeType__Group__1__Impl"
    // InternalRepoLang.g:2135:1: rule__CustomCompositeType__Group__1__Impl : ( ( rule__CustomCompositeType__EntityNameAssignment_1 ) ) ;
    public final void rule__CustomCompositeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2139:1: ( ( ( rule__CustomCompositeType__EntityNameAssignment_1 ) ) )
            // InternalRepoLang.g:2140:1: ( ( rule__CustomCompositeType__EntityNameAssignment_1 ) )
            {
            // InternalRepoLang.g:2140:1: ( ( rule__CustomCompositeType__EntityNameAssignment_1 ) )
            // InternalRepoLang.g:2141:2: ( rule__CustomCompositeType__EntityNameAssignment_1 )
            {
             before(grammarAccess.getCustomCompositeTypeAccess().getEntityNameAssignment_1()); 
            // InternalRepoLang.g:2142:2: ( rule__CustomCompositeType__EntityNameAssignment_1 )
            // InternalRepoLang.g:2142:3: rule__CustomCompositeType__EntityNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CustomCompositeType__EntityNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomCompositeTypeAccess().getEntityNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCompositeType__Group__1__Impl"


    // $ANTLR start "rule__CustomCompositeType__Group__2"
    // InternalRepoLang.g:2150:1: rule__CustomCompositeType__Group__2 : rule__CustomCompositeType__Group__2__Impl rule__CustomCompositeType__Group__3 ;
    public final void rule__CustomCompositeType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2154:1: ( rule__CustomCompositeType__Group__2__Impl rule__CustomCompositeType__Group__3 )
            // InternalRepoLang.g:2155:2: rule__CustomCompositeType__Group__2__Impl rule__CustomCompositeType__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__CustomCompositeType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomCompositeType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCompositeType__Group__2"


    // $ANTLR start "rule__CustomCompositeType__Group__2__Impl"
    // InternalRepoLang.g:2162:1: rule__CustomCompositeType__Group__2__Impl : ( ( rule__CustomCompositeType__Group_2__0 )? ) ;
    public final void rule__CustomCompositeType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2166:1: ( ( ( rule__CustomCompositeType__Group_2__0 )? ) )
            // InternalRepoLang.g:2167:1: ( ( rule__CustomCompositeType__Group_2__0 )? )
            {
            // InternalRepoLang.g:2167:1: ( ( rule__CustomCompositeType__Group_2__0 )? )
            // InternalRepoLang.g:2168:2: ( rule__CustomCompositeType__Group_2__0 )?
            {
             before(grammarAccess.getCustomCompositeTypeAccess().getGroup_2()); 
            // InternalRepoLang.g:2169:2: ( rule__CustomCompositeType__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRepoLang.g:2169:3: rule__CustomCompositeType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CustomCompositeType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomCompositeTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCompositeType__Group__2__Impl"


    // $ANTLR start "rule__CustomCompositeType__Group__3"
    // InternalRepoLang.g:2177:1: rule__CustomCompositeType__Group__3 : rule__CustomCompositeType__Group__3__Impl rule__CustomCompositeType__Group__4 ;
    public final void rule__CustomCompositeType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2181:1: ( rule__CustomCompositeType__Group__3__Impl rule__CustomCompositeType__Group__4 )
            // InternalRepoLang.g:2182:2: rule__CustomCompositeType__Group__3__Impl rule__CustomCompositeType__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__CustomCompositeType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomCompositeType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCompositeType__Group__3"


    // $ANTLR start "rule__CustomCompositeType__Group__3__Impl"
    // InternalRepoLang.g:2189:1: rule__CustomCompositeType__Group__3__Impl : ( '{' ) ;
    public final void rule__CustomCompositeType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2193:1: ( ( '{' ) )
            // InternalRepoLang.g:2194:1: ( '{' )
            {
            // InternalRepoLang.g:2194:1: ( '{' )
            // InternalRepoLang.g:2195:2: '{'
            {
             before(grammarAccess.getCustomCompositeTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCustomCompositeTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCompositeType__Group__3__Impl"


    // $ANTLR start "rule__CustomCompositeType__Group__4"
    // InternalRepoLang.g:2204:1: rule__CustomCompositeType__Group__4 : rule__CustomCompositeType__Group__4__Impl rule__CustomCompositeType__Group__5 ;
    public final void rule__CustomCompositeType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2208:1: ( rule__CustomCompositeType__Group__4__Impl rule__CustomCompositeType__Group__5 )
            // InternalRepoLang.g:2209:2: rule__CustomCompositeType__Group__4__Impl rule__CustomCompositeType__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__CustomCompositeType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomCompositeType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCompositeType__Group__4"


    // $ANTLR start "rule__CustomCompositeType__Group__4__Impl"
    // InternalRepoLang.g:2216:1: rule__CustomCompositeType__Group__4__Impl : ( ( rule__CustomCompositeType__InnerDeclaration_CompositeDataTypeAssignment_4 )* ) ;
    public final void rule__CustomCompositeType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2220:1: ( ( ( rule__CustomCompositeType__InnerDeclaration_CompositeDataTypeAssignment_4 )* ) )
            // InternalRepoLang.g:2221:1: ( ( rule__CustomCompositeType__InnerDeclaration_CompositeDataTypeAssignment_4 )* )
            {
            // InternalRepoLang.g:2221:1: ( ( rule__CustomCompositeType__InnerDeclaration_CompositeDataTypeAssignment_4 )* )
            // InternalRepoLang.g:2222:2: ( rule__CustomCompositeType__InnerDeclaration_CompositeDataTypeAssignment_4 )*
            {
             before(grammarAccess.getCustomCompositeTypeAccess().getInnerDeclaration_CompositeDataTypeAssignment_4()); 
            // InternalRepoLang.g:2223:2: ( rule__CustomCompositeType__InnerDeclaration_CompositeDataTypeAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRepoLang.g:2223:3: rule__CustomCompositeType__InnerDeclaration_CompositeDataTypeAssignment_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__CustomCompositeType__InnerDeclaration_CompositeDataTypeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getCustomCompositeTypeAccess().getInnerDeclaration_CompositeDataTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCompositeType__Group__4__Impl"


    // $ANTLR start "rule__CustomCompositeType__Group__5"
    // InternalRepoLang.g:2231:1: rule__CustomCompositeType__Group__5 : rule__CustomCompositeType__Group__5__Impl ;
    public final void rule__CustomCompositeType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2235:1: ( rule__CustomCompositeType__Group__5__Impl )
            // InternalRepoLang.g:2236:2: rule__CustomCompositeType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomCompositeType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCompositeType__Group__5"


    // $ANTLR start "rule__CustomCompositeType__Group__5__Impl"
    // InternalRepoLang.g:2242:1: rule__CustomCompositeType__Group__5__Impl : ( '}' ) ;
    public final void rule__CustomCompositeType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2246:1: ( ( '}' ) )
            // InternalRepoLang.g:2247:1: ( '}' )
            {
            // InternalRepoLang.g:2247:1: ( '}' )
            // InternalRepoLang.g:2248:2: '}'
            {
             before(grammarAccess.getCustomCompositeTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCustomCompositeTypeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCompositeType__Group__5__Impl"


    // $ANTLR start "rule__CustomCompositeType__Group_2__0"
    // InternalRepoLang.g:2258:1: rule__CustomCompositeType__Group_2__0 : rule__CustomCompositeType__Group_2__0__Impl rule__CustomCompositeType__Group_2__1 ;
    public final void rule__CustomCompositeType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2262:1: ( rule__CustomCompositeType__Group_2__0__Impl rule__CustomCompositeType__Group_2__1 )
            // InternalRepoLang.g:2263:2: rule__CustomCompositeType__Group_2__0__Impl rule__CustomCompositeType__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__CustomCompositeType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomCompositeType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCompositeType__Group_2__0"


    // $ANTLR start "rule__CustomCompositeType__Group_2__0__Impl"
    // InternalRepoLang.g:2270:1: rule__CustomCompositeType__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__CustomCompositeType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2274:1: ( ( 'extends' ) )
            // InternalRepoLang.g:2275:1: ( 'extends' )
            {
            // InternalRepoLang.g:2275:1: ( 'extends' )
            // InternalRepoLang.g:2276:2: 'extends'
            {
             before(grammarAccess.getCustomCompositeTypeAccess().getExtendsKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCustomCompositeTypeAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCompositeType__Group_2__0__Impl"


    // $ANTLR start "rule__CustomCompositeType__Group_2__1"
    // InternalRepoLang.g:2285:1: rule__CustomCompositeType__Group_2__1 : rule__CustomCompositeType__Group_2__1__Impl ;
    public final void rule__CustomCompositeType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2289:1: ( rule__CustomCompositeType__Group_2__1__Impl )
            // InternalRepoLang.g:2290:2: rule__CustomCompositeType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomCompositeType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCompositeType__Group_2__1"


    // $ANTLR start "rule__CustomCompositeType__Group_2__1__Impl"
    // InternalRepoLang.g:2296:1: rule__CustomCompositeType__Group_2__1__Impl : ( ( rule__CustomCompositeType__ParentType_CompositeDataTypeAssignment_2_1 ) ) ;
    public final void rule__CustomCompositeType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2300:1: ( ( ( rule__CustomCompositeType__ParentType_CompositeDataTypeAssignment_2_1 ) ) )
            // InternalRepoLang.g:2301:1: ( ( rule__CustomCompositeType__ParentType_CompositeDataTypeAssignment_2_1 ) )
            {
            // InternalRepoLang.g:2301:1: ( ( rule__CustomCompositeType__ParentType_CompositeDataTypeAssignment_2_1 ) )
            // InternalRepoLang.g:2302:2: ( rule__CustomCompositeType__ParentType_CompositeDataTypeAssignment_2_1 )
            {
             before(grammarAccess.getCustomCompositeTypeAccess().getParentType_CompositeDataTypeAssignment_2_1()); 
            // InternalRepoLang.g:2303:2: ( rule__CustomCompositeType__ParentType_CompositeDataTypeAssignment_2_1 )
            // InternalRepoLang.g:2303:3: rule__CustomCompositeType__ParentType_CompositeDataTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CustomCompositeType__ParentType_CompositeDataTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomCompositeTypeAccess().getParentType_CompositeDataTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCompositeType__Group_2__1__Impl"


    // $ANTLR start "rule__CustomInnerDeclaration__Group__0"
    // InternalRepoLang.g:2312:1: rule__CustomInnerDeclaration__Group__0 : rule__CustomInnerDeclaration__Group__0__Impl rule__CustomInnerDeclaration__Group__1 ;
    public final void rule__CustomInnerDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2316:1: ( rule__CustomInnerDeclaration__Group__0__Impl rule__CustomInnerDeclaration__Group__1 )
            // InternalRepoLang.g:2317:2: rule__CustomInnerDeclaration__Group__0__Impl rule__CustomInnerDeclaration__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__CustomInnerDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomInnerDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomInnerDeclaration__Group__0"


    // $ANTLR start "rule__CustomInnerDeclaration__Group__0__Impl"
    // InternalRepoLang.g:2324:1: rule__CustomInnerDeclaration__Group__0__Impl : ( ( rule__CustomInnerDeclaration__EntityNameAssignment_0 ) ) ;
    public final void rule__CustomInnerDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2328:1: ( ( ( rule__CustomInnerDeclaration__EntityNameAssignment_0 ) ) )
            // InternalRepoLang.g:2329:1: ( ( rule__CustomInnerDeclaration__EntityNameAssignment_0 ) )
            {
            // InternalRepoLang.g:2329:1: ( ( rule__CustomInnerDeclaration__EntityNameAssignment_0 ) )
            // InternalRepoLang.g:2330:2: ( rule__CustomInnerDeclaration__EntityNameAssignment_0 )
            {
             before(grammarAccess.getCustomInnerDeclarationAccess().getEntityNameAssignment_0()); 
            // InternalRepoLang.g:2331:2: ( rule__CustomInnerDeclaration__EntityNameAssignment_0 )
            // InternalRepoLang.g:2331:3: rule__CustomInnerDeclaration__EntityNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CustomInnerDeclaration__EntityNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCustomInnerDeclarationAccess().getEntityNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomInnerDeclaration__Group__0__Impl"


    // $ANTLR start "rule__CustomInnerDeclaration__Group__1"
    // InternalRepoLang.g:2339:1: rule__CustomInnerDeclaration__Group__1 : rule__CustomInnerDeclaration__Group__1__Impl rule__CustomInnerDeclaration__Group__2 ;
    public final void rule__CustomInnerDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2343:1: ( rule__CustomInnerDeclaration__Group__1__Impl rule__CustomInnerDeclaration__Group__2 )
            // InternalRepoLang.g:2344:2: rule__CustomInnerDeclaration__Group__1__Impl rule__CustomInnerDeclaration__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__CustomInnerDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomInnerDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomInnerDeclaration__Group__1"


    // $ANTLR start "rule__CustomInnerDeclaration__Group__1__Impl"
    // InternalRepoLang.g:2351:1: rule__CustomInnerDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__CustomInnerDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2355:1: ( ( ':' ) )
            // InternalRepoLang.g:2356:1: ( ':' )
            {
            // InternalRepoLang.g:2356:1: ( ':' )
            // InternalRepoLang.g:2357:2: ':'
            {
             before(grammarAccess.getCustomInnerDeclarationAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCustomInnerDeclarationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomInnerDeclaration__Group__1__Impl"


    // $ANTLR start "rule__CustomInnerDeclaration__Group__2"
    // InternalRepoLang.g:2366:1: rule__CustomInnerDeclaration__Group__2 : rule__CustomInnerDeclaration__Group__2__Impl ;
    public final void rule__CustomInnerDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2370:1: ( rule__CustomInnerDeclaration__Group__2__Impl )
            // InternalRepoLang.g:2371:2: rule__CustomInnerDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomInnerDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomInnerDeclaration__Group__2"


    // $ANTLR start "rule__CustomInnerDeclaration__Group__2__Impl"
    // InternalRepoLang.g:2377:1: rule__CustomInnerDeclaration__Group__2__Impl : ( ( rule__CustomInnerDeclaration__Datatype_InnerDeclarationAssignment_2 ) ) ;
    public final void rule__CustomInnerDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2381:1: ( ( ( rule__CustomInnerDeclaration__Datatype_InnerDeclarationAssignment_2 ) ) )
            // InternalRepoLang.g:2382:1: ( ( rule__CustomInnerDeclaration__Datatype_InnerDeclarationAssignment_2 ) )
            {
            // InternalRepoLang.g:2382:1: ( ( rule__CustomInnerDeclaration__Datatype_InnerDeclarationAssignment_2 ) )
            // InternalRepoLang.g:2383:2: ( rule__CustomInnerDeclaration__Datatype_InnerDeclarationAssignment_2 )
            {
             before(grammarAccess.getCustomInnerDeclarationAccess().getDatatype_InnerDeclarationAssignment_2()); 
            // InternalRepoLang.g:2384:2: ( rule__CustomInnerDeclaration__Datatype_InnerDeclarationAssignment_2 )
            // InternalRepoLang.g:2384:3: rule__CustomInnerDeclaration__Datatype_InnerDeclarationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CustomInnerDeclaration__Datatype_InnerDeclarationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCustomInnerDeclarationAccess().getDatatype_InnerDeclarationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomInnerDeclaration__Group__2__Impl"


    // $ANTLR start "rule__CustomCollectionType__Group__0"
    // InternalRepoLang.g:2393:1: rule__CustomCollectionType__Group__0 : rule__CustomCollectionType__Group__0__Impl rule__CustomCollectionType__Group__1 ;
    public final void rule__CustomCollectionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2397:1: ( rule__CustomCollectionType__Group__0__Impl rule__CustomCollectionType__Group__1 )
            // InternalRepoLang.g:2398:2: rule__CustomCollectionType__Group__0__Impl rule__CustomCollectionType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CustomCollectionType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomCollectionType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCollectionType__Group__0"


    // $ANTLR start "rule__CustomCollectionType__Group__0__Impl"
    // InternalRepoLang.g:2405:1: rule__CustomCollectionType__Group__0__Impl : ( 'collection' ) ;
    public final void rule__CustomCollectionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2409:1: ( ( 'collection' ) )
            // InternalRepoLang.g:2410:1: ( 'collection' )
            {
            // InternalRepoLang.g:2410:1: ( 'collection' )
            // InternalRepoLang.g:2411:2: 'collection'
            {
             before(grammarAccess.getCustomCollectionTypeAccess().getCollectionKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCustomCollectionTypeAccess().getCollectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCollectionType__Group__0__Impl"


    // $ANTLR start "rule__CustomCollectionType__Group__1"
    // InternalRepoLang.g:2420:1: rule__CustomCollectionType__Group__1 : rule__CustomCollectionType__Group__1__Impl rule__CustomCollectionType__Group__2 ;
    public final void rule__CustomCollectionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2424:1: ( rule__CustomCollectionType__Group__1__Impl rule__CustomCollectionType__Group__2 )
            // InternalRepoLang.g:2425:2: rule__CustomCollectionType__Group__1__Impl rule__CustomCollectionType__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__CustomCollectionType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomCollectionType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCollectionType__Group__1"


    // $ANTLR start "rule__CustomCollectionType__Group__1__Impl"
    // InternalRepoLang.g:2432:1: rule__CustomCollectionType__Group__1__Impl : ( ( rule__CustomCollectionType__EntityNameAssignment_1 ) ) ;
    public final void rule__CustomCollectionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2436:1: ( ( ( rule__CustomCollectionType__EntityNameAssignment_1 ) ) )
            // InternalRepoLang.g:2437:1: ( ( rule__CustomCollectionType__EntityNameAssignment_1 ) )
            {
            // InternalRepoLang.g:2437:1: ( ( rule__CustomCollectionType__EntityNameAssignment_1 ) )
            // InternalRepoLang.g:2438:2: ( rule__CustomCollectionType__EntityNameAssignment_1 )
            {
             before(grammarAccess.getCustomCollectionTypeAccess().getEntityNameAssignment_1()); 
            // InternalRepoLang.g:2439:2: ( rule__CustomCollectionType__EntityNameAssignment_1 )
            // InternalRepoLang.g:2439:3: rule__CustomCollectionType__EntityNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CustomCollectionType__EntityNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomCollectionTypeAccess().getEntityNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCollectionType__Group__1__Impl"


    // $ANTLR start "rule__CustomCollectionType__Group__2"
    // InternalRepoLang.g:2447:1: rule__CustomCollectionType__Group__2 : rule__CustomCollectionType__Group__2__Impl rule__CustomCollectionType__Group__3 ;
    public final void rule__CustomCollectionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2451:1: ( rule__CustomCollectionType__Group__2__Impl rule__CustomCollectionType__Group__3 )
            // InternalRepoLang.g:2452:2: rule__CustomCollectionType__Group__2__Impl rule__CustomCollectionType__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__CustomCollectionType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomCollectionType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCollectionType__Group__2"


    // $ANTLR start "rule__CustomCollectionType__Group__2__Impl"
    // InternalRepoLang.g:2459:1: rule__CustomCollectionType__Group__2__Impl : ( 'of' ) ;
    public final void rule__CustomCollectionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2463:1: ( ( 'of' ) )
            // InternalRepoLang.g:2464:1: ( 'of' )
            {
            // InternalRepoLang.g:2464:1: ( 'of' )
            // InternalRepoLang.g:2465:2: 'of'
            {
             before(grammarAccess.getCustomCollectionTypeAccess().getOfKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCustomCollectionTypeAccess().getOfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCollectionType__Group__2__Impl"


    // $ANTLR start "rule__CustomCollectionType__Group__3"
    // InternalRepoLang.g:2474:1: rule__CustomCollectionType__Group__3 : rule__CustomCollectionType__Group__3__Impl ;
    public final void rule__CustomCollectionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2478:1: ( rule__CustomCollectionType__Group__3__Impl )
            // InternalRepoLang.g:2479:2: rule__CustomCollectionType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomCollectionType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCollectionType__Group__3"


    // $ANTLR start "rule__CustomCollectionType__Group__3__Impl"
    // InternalRepoLang.g:2485:1: rule__CustomCollectionType__Group__3__Impl : ( ( rule__CustomCollectionType__InnerType_CollectionDataTypeAssignment_3 ) ) ;
    public final void rule__CustomCollectionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2489:1: ( ( ( rule__CustomCollectionType__InnerType_CollectionDataTypeAssignment_3 ) ) )
            // InternalRepoLang.g:2490:1: ( ( rule__CustomCollectionType__InnerType_CollectionDataTypeAssignment_3 ) )
            {
            // InternalRepoLang.g:2490:1: ( ( rule__CustomCollectionType__InnerType_CollectionDataTypeAssignment_3 ) )
            // InternalRepoLang.g:2491:2: ( rule__CustomCollectionType__InnerType_CollectionDataTypeAssignment_3 )
            {
             before(grammarAccess.getCustomCollectionTypeAccess().getInnerType_CollectionDataTypeAssignment_3()); 
            // InternalRepoLang.g:2492:2: ( rule__CustomCollectionType__InnerType_CollectionDataTypeAssignment_3 )
            // InternalRepoLang.g:2492:3: rule__CustomCollectionType__InnerType_CollectionDataTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CustomCollectionType__InnerType_CollectionDataTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCustomCollectionTypeAccess().getInnerType_CollectionDataTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCollectionType__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalRepoLang.g:2501:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2505:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalRepoLang.g:2506:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalRepoLang.g:2513:1: rule__Component__Group__0__Impl : ( 'Component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2517:1: ( ( 'Component' ) )
            // InternalRepoLang.g:2518:1: ( 'Component' )
            {
            // InternalRepoLang.g:2518:1: ( 'Component' )
            // InternalRepoLang.g:2519:2: 'Component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalRepoLang.g:2528:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2532:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalRepoLang.g:2533:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalRepoLang.g:2540:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2544:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalRepoLang.g:2545:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalRepoLang.g:2545:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalRepoLang.g:2546:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalRepoLang.g:2547:2: ( rule__Component__NameAssignment_1 )
            // InternalRepoLang.g:2547:3: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalRepoLang.g:2555:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2559:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalRepoLang.g:2560:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalRepoLang.g:2567:1: rule__Component__Group__2__Impl : ( ( rule__Component__Group_2__0 )? ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2571:1: ( ( ( rule__Component__Group_2__0 )? ) )
            // InternalRepoLang.g:2572:1: ( ( rule__Component__Group_2__0 )? )
            {
            // InternalRepoLang.g:2572:1: ( ( rule__Component__Group_2__0 )? )
            // InternalRepoLang.g:2573:2: ( rule__Component__Group_2__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_2()); 
            // InternalRepoLang.g:2574:2: ( rule__Component__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRepoLang.g:2574:3: rule__Component__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalRepoLang.g:2582:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2586:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalRepoLang.g:2587:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // InternalRepoLang.g:2594:1: rule__Component__Group__3__Impl : ( ( rule__Component__Group_3__0 )? ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2598:1: ( ( ( rule__Component__Group_3__0 )? ) )
            // InternalRepoLang.g:2599:1: ( ( rule__Component__Group_3__0 )? )
            {
            // InternalRepoLang.g:2599:1: ( ( rule__Component__Group_3__0 )? )
            // InternalRepoLang.g:2600:2: ( rule__Component__Group_3__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_3()); 
            // InternalRepoLang.g:2601:2: ( rule__Component__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRepoLang.g:2601:3: rule__Component__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // InternalRepoLang.g:2609:1: rule__Component__Group__4 : rule__Component__Group__4__Impl ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2613:1: ( rule__Component__Group__4__Impl )
            // InternalRepoLang.g:2614:2: rule__Component__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // InternalRepoLang.g:2620:1: rule__Component__Group__4__Impl : ( ( rule__Component__Group_4__0 )? ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2624:1: ( ( ( rule__Component__Group_4__0 )? ) )
            // InternalRepoLang.g:2625:1: ( ( rule__Component__Group_4__0 )? )
            {
            // InternalRepoLang.g:2625:1: ( ( rule__Component__Group_4__0 )? )
            // InternalRepoLang.g:2626:2: ( rule__Component__Group_4__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_4()); 
            // InternalRepoLang.g:2627:2: ( rule__Component__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRepoLang.g:2627:3: rule__Component__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Component__Group_2__0"
    // InternalRepoLang.g:2636:1: rule__Component__Group_2__0 : rule__Component__Group_2__0__Impl rule__Component__Group_2__1 ;
    public final void rule__Component__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2640:1: ( rule__Component__Group_2__0__Impl rule__Component__Group_2__1 )
            // InternalRepoLang.g:2641:2: rule__Component__Group_2__0__Impl rule__Component__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Component__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_2__0"


    // $ANTLR start "rule__Component__Group_2__0__Impl"
    // InternalRepoLang.g:2648:1: rule__Component__Group_2__0__Impl : ( 'provides' ) ;
    public final void rule__Component__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2652:1: ( ( 'provides' ) )
            // InternalRepoLang.g:2653:1: ( 'provides' )
            {
            // InternalRepoLang.g:2653:1: ( 'provides' )
            // InternalRepoLang.g:2654:2: 'provides'
            {
             before(grammarAccess.getComponentAccess().getProvidesKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getProvidesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_2__0__Impl"


    // $ANTLR start "rule__Component__Group_2__1"
    // InternalRepoLang.g:2663:1: rule__Component__Group_2__1 : rule__Component__Group_2__1__Impl rule__Component__Group_2__2 ;
    public final void rule__Component__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2667:1: ( rule__Component__Group_2__1__Impl rule__Component__Group_2__2 )
            // InternalRepoLang.g:2668:2: rule__Component__Group_2__1__Impl rule__Component__Group_2__2
            {
            pushFollow(FOLLOW_23);
            rule__Component__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_2__1"


    // $ANTLR start "rule__Component__Group_2__1__Impl"
    // InternalRepoLang.g:2675:1: rule__Component__Group_2__1__Impl : ( ( rule__Component__ProvidesAssignment_2_1 ) ) ;
    public final void rule__Component__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2679:1: ( ( ( rule__Component__ProvidesAssignment_2_1 ) ) )
            // InternalRepoLang.g:2680:1: ( ( rule__Component__ProvidesAssignment_2_1 ) )
            {
            // InternalRepoLang.g:2680:1: ( ( rule__Component__ProvidesAssignment_2_1 ) )
            // InternalRepoLang.g:2681:2: ( rule__Component__ProvidesAssignment_2_1 )
            {
             before(grammarAccess.getComponentAccess().getProvidesAssignment_2_1()); 
            // InternalRepoLang.g:2682:2: ( rule__Component__ProvidesAssignment_2_1 )
            // InternalRepoLang.g:2682:3: rule__Component__ProvidesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__ProvidesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getProvidesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_2__1__Impl"


    // $ANTLR start "rule__Component__Group_2__2"
    // InternalRepoLang.g:2690:1: rule__Component__Group_2__2 : rule__Component__Group_2__2__Impl ;
    public final void rule__Component__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2694:1: ( rule__Component__Group_2__2__Impl )
            // InternalRepoLang.g:2695:2: rule__Component__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_2__2"


    // $ANTLR start "rule__Component__Group_2__2__Impl"
    // InternalRepoLang.g:2701:1: rule__Component__Group_2__2__Impl : ( ( rule__Component__Group_2_2__0 )* ) ;
    public final void rule__Component__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2705:1: ( ( ( rule__Component__Group_2_2__0 )* ) )
            // InternalRepoLang.g:2706:1: ( ( rule__Component__Group_2_2__0 )* )
            {
            // InternalRepoLang.g:2706:1: ( ( rule__Component__Group_2_2__0 )* )
            // InternalRepoLang.g:2707:2: ( rule__Component__Group_2_2__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_2_2()); 
            // InternalRepoLang.g:2708:2: ( rule__Component__Group_2_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==26) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRepoLang.g:2708:3: rule__Component__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Component__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_2__2__Impl"


    // $ANTLR start "rule__Component__Group_2_2__0"
    // InternalRepoLang.g:2717:1: rule__Component__Group_2_2__0 : rule__Component__Group_2_2__0__Impl rule__Component__Group_2_2__1 ;
    public final void rule__Component__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2721:1: ( rule__Component__Group_2_2__0__Impl rule__Component__Group_2_2__1 )
            // InternalRepoLang.g:2722:2: rule__Component__Group_2_2__0__Impl rule__Component__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Component__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_2_2__0"


    // $ANTLR start "rule__Component__Group_2_2__0__Impl"
    // InternalRepoLang.g:2729:1: rule__Component__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Component__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2733:1: ( ( ',' ) )
            // InternalRepoLang.g:2734:1: ( ',' )
            {
            // InternalRepoLang.g:2734:1: ( ',' )
            // InternalRepoLang.g:2735:2: ','
            {
             before(grammarAccess.getComponentAccess().getCommaKeyword_2_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_2_2__0__Impl"


    // $ANTLR start "rule__Component__Group_2_2__1"
    // InternalRepoLang.g:2744:1: rule__Component__Group_2_2__1 : rule__Component__Group_2_2__1__Impl ;
    public final void rule__Component__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2748:1: ( rule__Component__Group_2_2__1__Impl )
            // InternalRepoLang.g:2749:2: rule__Component__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_2_2__1"


    // $ANTLR start "rule__Component__Group_2_2__1__Impl"
    // InternalRepoLang.g:2755:1: rule__Component__Group_2_2__1__Impl : ( ( rule__Component__ProvidesAssignment_2_2_1 ) ) ;
    public final void rule__Component__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2759:1: ( ( ( rule__Component__ProvidesAssignment_2_2_1 ) ) )
            // InternalRepoLang.g:2760:1: ( ( rule__Component__ProvidesAssignment_2_2_1 ) )
            {
            // InternalRepoLang.g:2760:1: ( ( rule__Component__ProvidesAssignment_2_2_1 ) )
            // InternalRepoLang.g:2761:2: ( rule__Component__ProvidesAssignment_2_2_1 )
            {
             before(grammarAccess.getComponentAccess().getProvidesAssignment_2_2_1()); 
            // InternalRepoLang.g:2762:2: ( rule__Component__ProvidesAssignment_2_2_1 )
            // InternalRepoLang.g:2762:3: rule__Component__ProvidesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__ProvidesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getProvidesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_2_2__1__Impl"


    // $ANTLR start "rule__Component__Group_3__0"
    // InternalRepoLang.g:2771:1: rule__Component__Group_3__0 : rule__Component__Group_3__0__Impl rule__Component__Group_3__1 ;
    public final void rule__Component__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2775:1: ( rule__Component__Group_3__0__Impl rule__Component__Group_3__1 )
            // InternalRepoLang.g:2776:2: rule__Component__Group_3__0__Impl rule__Component__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Component__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__0"


    // $ANTLR start "rule__Component__Group_3__0__Impl"
    // InternalRepoLang.g:2783:1: rule__Component__Group_3__0__Impl : ( 'requires' ) ;
    public final void rule__Component__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2787:1: ( ( 'requires' ) )
            // InternalRepoLang.g:2788:1: ( 'requires' )
            {
            // InternalRepoLang.g:2788:1: ( 'requires' )
            // InternalRepoLang.g:2789:2: 'requires'
            {
             before(grammarAccess.getComponentAccess().getRequiresKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRequiresKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__0__Impl"


    // $ANTLR start "rule__Component__Group_3__1"
    // InternalRepoLang.g:2798:1: rule__Component__Group_3__1 : rule__Component__Group_3__1__Impl rule__Component__Group_3__2 ;
    public final void rule__Component__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2802:1: ( rule__Component__Group_3__1__Impl rule__Component__Group_3__2 )
            // InternalRepoLang.g:2803:2: rule__Component__Group_3__1__Impl rule__Component__Group_3__2
            {
            pushFollow(FOLLOW_23);
            rule__Component__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__1"


    // $ANTLR start "rule__Component__Group_3__1__Impl"
    // InternalRepoLang.g:2810:1: rule__Component__Group_3__1__Impl : ( ( rule__Component__RequiresAssignment_3_1 ) ) ;
    public final void rule__Component__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2814:1: ( ( ( rule__Component__RequiresAssignment_3_1 ) ) )
            // InternalRepoLang.g:2815:1: ( ( rule__Component__RequiresAssignment_3_1 ) )
            {
            // InternalRepoLang.g:2815:1: ( ( rule__Component__RequiresAssignment_3_1 ) )
            // InternalRepoLang.g:2816:2: ( rule__Component__RequiresAssignment_3_1 )
            {
             before(grammarAccess.getComponentAccess().getRequiresAssignment_3_1()); 
            // InternalRepoLang.g:2817:2: ( rule__Component__RequiresAssignment_3_1 )
            // InternalRepoLang.g:2817:3: rule__Component__RequiresAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__RequiresAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getRequiresAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__1__Impl"


    // $ANTLR start "rule__Component__Group_3__2"
    // InternalRepoLang.g:2825:1: rule__Component__Group_3__2 : rule__Component__Group_3__2__Impl ;
    public final void rule__Component__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2829:1: ( rule__Component__Group_3__2__Impl )
            // InternalRepoLang.g:2830:2: rule__Component__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__2"


    // $ANTLR start "rule__Component__Group_3__2__Impl"
    // InternalRepoLang.g:2836:1: rule__Component__Group_3__2__Impl : ( ( rule__Component__Group_3_2__0 )* ) ;
    public final void rule__Component__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2840:1: ( ( ( rule__Component__Group_3_2__0 )* ) )
            // InternalRepoLang.g:2841:1: ( ( rule__Component__Group_3_2__0 )* )
            {
            // InternalRepoLang.g:2841:1: ( ( rule__Component__Group_3_2__0 )* )
            // InternalRepoLang.g:2842:2: ( rule__Component__Group_3_2__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_3_2()); 
            // InternalRepoLang.g:2843:2: ( rule__Component__Group_3_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==26) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRepoLang.g:2843:3: rule__Component__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Component__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__2__Impl"


    // $ANTLR start "rule__Component__Group_3_2__0"
    // InternalRepoLang.g:2852:1: rule__Component__Group_3_2__0 : rule__Component__Group_3_2__0__Impl rule__Component__Group_3_2__1 ;
    public final void rule__Component__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2856:1: ( rule__Component__Group_3_2__0__Impl rule__Component__Group_3_2__1 )
            // InternalRepoLang.g:2857:2: rule__Component__Group_3_2__0__Impl rule__Component__Group_3_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Component__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3_2__0"


    // $ANTLR start "rule__Component__Group_3_2__0__Impl"
    // InternalRepoLang.g:2864:1: rule__Component__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Component__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2868:1: ( ( ',' ) )
            // InternalRepoLang.g:2869:1: ( ',' )
            {
            // InternalRepoLang.g:2869:1: ( ',' )
            // InternalRepoLang.g:2870:2: ','
            {
             before(grammarAccess.getComponentAccess().getCommaKeyword_3_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3_2__0__Impl"


    // $ANTLR start "rule__Component__Group_3_2__1"
    // InternalRepoLang.g:2879:1: rule__Component__Group_3_2__1 : rule__Component__Group_3_2__1__Impl ;
    public final void rule__Component__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2883:1: ( rule__Component__Group_3_2__1__Impl )
            // InternalRepoLang.g:2884:2: rule__Component__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3_2__1"


    // $ANTLR start "rule__Component__Group_3_2__1__Impl"
    // InternalRepoLang.g:2890:1: rule__Component__Group_3_2__1__Impl : ( ( rule__Component__RequiresAssignment_3_2_1 ) ) ;
    public final void rule__Component__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2894:1: ( ( ( rule__Component__RequiresAssignment_3_2_1 ) ) )
            // InternalRepoLang.g:2895:1: ( ( rule__Component__RequiresAssignment_3_2_1 ) )
            {
            // InternalRepoLang.g:2895:1: ( ( rule__Component__RequiresAssignment_3_2_1 ) )
            // InternalRepoLang.g:2896:2: ( rule__Component__RequiresAssignment_3_2_1 )
            {
             before(grammarAccess.getComponentAccess().getRequiresAssignment_3_2_1()); 
            // InternalRepoLang.g:2897:2: ( rule__Component__RequiresAssignment_3_2_1 )
            // InternalRepoLang.g:2897:3: rule__Component__RequiresAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__RequiresAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getRequiresAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3_2__1__Impl"


    // $ANTLR start "rule__Component__Group_4__0"
    // InternalRepoLang.g:2906:1: rule__Component__Group_4__0 : rule__Component__Group_4__0__Impl rule__Component__Group_4__1 ;
    public final void rule__Component__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2910:1: ( rule__Component__Group_4__0__Impl rule__Component__Group_4__1 )
            // InternalRepoLang.g:2911:2: rule__Component__Group_4__0__Impl rule__Component__Group_4__1
            {
            pushFollow(FOLLOW_24);
            rule__Component__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4__0"


    // $ANTLR start "rule__Component__Group_4__0__Impl"
    // InternalRepoLang.g:2918:1: rule__Component__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Component__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2922:1: ( ( '{' ) )
            // InternalRepoLang.g:2923:1: ( '{' )
            {
            // InternalRepoLang.g:2923:1: ( '{' )
            // InternalRepoLang.g:2924:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4__0__Impl"


    // $ANTLR start "rule__Component__Group_4__1"
    // InternalRepoLang.g:2933:1: rule__Component__Group_4__1 : rule__Component__Group_4__1__Impl rule__Component__Group_4__2 ;
    public final void rule__Component__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2937:1: ( rule__Component__Group_4__1__Impl rule__Component__Group_4__2 )
            // InternalRepoLang.g:2938:2: rule__Component__Group_4__1__Impl rule__Component__Group_4__2
            {
            pushFollow(FOLLOW_24);
            rule__Component__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4__1"


    // $ANTLR start "rule__Component__Group_4__1__Impl"
    // InternalRepoLang.g:2945:1: rule__Component__Group_4__1__Impl : ( ( rule__Component__SeffsAssignment_4_1 )* ) ;
    public final void rule__Component__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2949:1: ( ( ( rule__Component__SeffsAssignment_4_1 )* ) )
            // InternalRepoLang.g:2950:1: ( ( rule__Component__SeffsAssignment_4_1 )* )
            {
            // InternalRepoLang.g:2950:1: ( ( rule__Component__SeffsAssignment_4_1 )* )
            // InternalRepoLang.g:2951:2: ( rule__Component__SeffsAssignment_4_1 )*
            {
             before(grammarAccess.getComponentAccess().getSeffsAssignment_4_1()); 
            // InternalRepoLang.g:2952:2: ( rule__Component__SeffsAssignment_4_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==36) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRepoLang.g:2952:3: rule__Component__SeffsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Component__SeffsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getSeffsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4__1__Impl"


    // $ANTLR start "rule__Component__Group_4__2"
    // InternalRepoLang.g:2960:1: rule__Component__Group_4__2 : rule__Component__Group_4__2__Impl rule__Component__Group_4__3 ;
    public final void rule__Component__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2964:1: ( rule__Component__Group_4__2__Impl rule__Component__Group_4__3 )
            // InternalRepoLang.g:2965:2: rule__Component__Group_4__2__Impl rule__Component__Group_4__3
            {
            pushFollow(FOLLOW_24);
            rule__Component__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4__2"


    // $ANTLR start "rule__Component__Group_4__2__Impl"
    // InternalRepoLang.g:2972:1: rule__Component__Group_4__2__Impl : ( ( rule__Component__PassiveResourcesAssignment_4_2 )* ) ;
    public final void rule__Component__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2976:1: ( ( ( rule__Component__PassiveResourcesAssignment_4_2 )* ) )
            // InternalRepoLang.g:2977:1: ( ( rule__Component__PassiveResourcesAssignment_4_2 )* )
            {
            // InternalRepoLang.g:2977:1: ( ( rule__Component__PassiveResourcesAssignment_4_2 )* )
            // InternalRepoLang.g:2978:2: ( rule__Component__PassiveResourcesAssignment_4_2 )*
            {
             before(grammarAccess.getComponentAccess().getPassiveResourcesAssignment_4_2()); 
            // InternalRepoLang.g:2979:2: ( rule__Component__PassiveResourcesAssignment_4_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==52) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRepoLang.g:2979:3: rule__Component__PassiveResourcesAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Component__PassiveResourcesAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getPassiveResourcesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4__2__Impl"


    // $ANTLR start "rule__Component__Group_4__3"
    // InternalRepoLang.g:2987:1: rule__Component__Group_4__3 : rule__Component__Group_4__3__Impl ;
    public final void rule__Component__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:2991:1: ( rule__Component__Group_4__3__Impl )
            // InternalRepoLang.g:2992:2: rule__Component__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4__3"


    // $ANTLR start "rule__Component__Group_4__3__Impl"
    // InternalRepoLang.g:2998:1: rule__Component__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Component__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3002:1: ( ( '}' ) )
            // InternalRepoLang.g:3003:1: ( '}' )
            {
            // InternalRepoLang.g:3003:1: ( '}' )
            // InternalRepoLang.g:3004:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4__3__Impl"


    // $ANTLR start "rule__RoleSpecification__Group__0"
    // InternalRepoLang.g:3014:1: rule__RoleSpecification__Group__0 : rule__RoleSpecification__Group__0__Impl rule__RoleSpecification__Group__1 ;
    public final void rule__RoleSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3018:1: ( rule__RoleSpecification__Group__0__Impl rule__RoleSpecification__Group__1 )
            // InternalRepoLang.g:3019:2: rule__RoleSpecification__Group__0__Impl rule__RoleSpecification__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__RoleSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoleSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSpecification__Group__0"


    // $ANTLR start "rule__RoleSpecification__Group__0__Impl"
    // InternalRepoLang.g:3026:1: rule__RoleSpecification__Group__0__Impl : ( ( rule__RoleSpecification__InterfaceAssignment_0 ) ) ;
    public final void rule__RoleSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3030:1: ( ( ( rule__RoleSpecification__InterfaceAssignment_0 ) ) )
            // InternalRepoLang.g:3031:1: ( ( rule__RoleSpecification__InterfaceAssignment_0 ) )
            {
            // InternalRepoLang.g:3031:1: ( ( rule__RoleSpecification__InterfaceAssignment_0 ) )
            // InternalRepoLang.g:3032:2: ( rule__RoleSpecification__InterfaceAssignment_0 )
            {
             before(grammarAccess.getRoleSpecificationAccess().getInterfaceAssignment_0()); 
            // InternalRepoLang.g:3033:2: ( rule__RoleSpecification__InterfaceAssignment_0 )
            // InternalRepoLang.g:3033:3: rule__RoleSpecification__InterfaceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RoleSpecification__InterfaceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRoleSpecificationAccess().getInterfaceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSpecification__Group__0__Impl"


    // $ANTLR start "rule__RoleSpecification__Group__1"
    // InternalRepoLang.g:3041:1: rule__RoleSpecification__Group__1 : rule__RoleSpecification__Group__1__Impl rule__RoleSpecification__Group__2 ;
    public final void rule__RoleSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3045:1: ( rule__RoleSpecification__Group__1__Impl rule__RoleSpecification__Group__2 )
            // InternalRepoLang.g:3046:2: rule__RoleSpecification__Group__1__Impl rule__RoleSpecification__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RoleSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoleSpecification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSpecification__Group__1"


    // $ANTLR start "rule__RoleSpecification__Group__1__Impl"
    // InternalRepoLang.g:3053:1: rule__RoleSpecification__Group__1__Impl : ( 'as' ) ;
    public final void rule__RoleSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3057:1: ( ( 'as' ) )
            // InternalRepoLang.g:3058:1: ( 'as' )
            {
            // InternalRepoLang.g:3058:1: ( 'as' )
            // InternalRepoLang.g:3059:2: 'as'
            {
             before(grammarAccess.getRoleSpecificationAccess().getAsKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRoleSpecificationAccess().getAsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSpecification__Group__1__Impl"


    // $ANTLR start "rule__RoleSpecification__Group__2"
    // InternalRepoLang.g:3068:1: rule__RoleSpecification__Group__2 : rule__RoleSpecification__Group__2__Impl ;
    public final void rule__RoleSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3072:1: ( rule__RoleSpecification__Group__2__Impl )
            // InternalRepoLang.g:3073:2: rule__RoleSpecification__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoleSpecification__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSpecification__Group__2"


    // $ANTLR start "rule__RoleSpecification__Group__2__Impl"
    // InternalRepoLang.g:3079:1: rule__RoleSpecification__Group__2__Impl : ( ( rule__RoleSpecification__NameAssignment_2 ) ) ;
    public final void rule__RoleSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3083:1: ( ( ( rule__RoleSpecification__NameAssignment_2 ) ) )
            // InternalRepoLang.g:3084:1: ( ( rule__RoleSpecification__NameAssignment_2 ) )
            {
            // InternalRepoLang.g:3084:1: ( ( rule__RoleSpecification__NameAssignment_2 ) )
            // InternalRepoLang.g:3085:2: ( rule__RoleSpecification__NameAssignment_2 )
            {
             before(grammarAccess.getRoleSpecificationAccess().getNameAssignment_2()); 
            // InternalRepoLang.g:3086:2: ( rule__RoleSpecification__NameAssignment_2 )
            // InternalRepoLang.g:3086:3: rule__RoleSpecification__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RoleSpecification__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleSpecificationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSpecification__Group__2__Impl"


    // $ANTLR start "rule__Seff__Group__0"
    // InternalRepoLang.g:3095:1: rule__Seff__Group__0 : rule__Seff__Group__0__Impl rule__Seff__Group__1 ;
    public final void rule__Seff__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3099:1: ( rule__Seff__Group__0__Impl rule__Seff__Group__1 )
            // InternalRepoLang.g:3100:2: rule__Seff__Group__0__Impl rule__Seff__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Seff__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seff__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seff__Group__0"


    // $ANTLR start "rule__Seff__Group__0__Impl"
    // InternalRepoLang.g:3107:1: rule__Seff__Group__0__Impl : ( 'SEFF' ) ;
    public final void rule__Seff__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3111:1: ( ( 'SEFF' ) )
            // InternalRepoLang.g:3112:1: ( 'SEFF' )
            {
            // InternalRepoLang.g:3112:1: ( 'SEFF' )
            // InternalRepoLang.g:3113:2: 'SEFF'
            {
             before(grammarAccess.getSeffAccess().getSEFFKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSeffAccess().getSEFFKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seff__Group__0__Impl"


    // $ANTLR start "rule__Seff__Group__1"
    // InternalRepoLang.g:3122:1: rule__Seff__Group__1 : rule__Seff__Group__1__Impl rule__Seff__Group__2 ;
    public final void rule__Seff__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3126:1: ( rule__Seff__Group__1__Impl rule__Seff__Group__2 )
            // InternalRepoLang.g:3127:2: rule__Seff__Group__1__Impl rule__Seff__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Seff__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seff__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seff__Group__1"


    // $ANTLR start "rule__Seff__Group__1__Impl"
    // InternalRepoLang.g:3134:1: rule__Seff__Group__1__Impl : ( ( rule__Seff__NameAssignment_1 )? ) ;
    public final void rule__Seff__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3138:1: ( ( ( rule__Seff__NameAssignment_1 )? ) )
            // InternalRepoLang.g:3139:1: ( ( rule__Seff__NameAssignment_1 )? )
            {
            // InternalRepoLang.g:3139:1: ( ( rule__Seff__NameAssignment_1 )? )
            // InternalRepoLang.g:3140:2: ( rule__Seff__NameAssignment_1 )?
            {
             before(grammarAccess.getSeffAccess().getNameAssignment_1()); 
            // InternalRepoLang.g:3141:2: ( rule__Seff__NameAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRepoLang.g:3141:3: rule__Seff__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Seff__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSeffAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seff__Group__1__Impl"


    // $ANTLR start "rule__Seff__Group__2"
    // InternalRepoLang.g:3149:1: rule__Seff__Group__2 : rule__Seff__Group__2__Impl rule__Seff__Group__3 ;
    public final void rule__Seff__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3153:1: ( rule__Seff__Group__2__Impl rule__Seff__Group__3 )
            // InternalRepoLang.g:3154:2: rule__Seff__Group__2__Impl rule__Seff__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Seff__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seff__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seff__Group__2"


    // $ANTLR start "rule__Seff__Group__2__Impl"
    // InternalRepoLang.g:3161:1: rule__Seff__Group__2__Impl : ( 'on' ) ;
    public final void rule__Seff__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3165:1: ( ( 'on' ) )
            // InternalRepoLang.g:3166:1: ( 'on' )
            {
            // InternalRepoLang.g:3166:1: ( 'on' )
            // InternalRepoLang.g:3167:2: 'on'
            {
             before(grammarAccess.getSeffAccess().getOnKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSeffAccess().getOnKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seff__Group__2__Impl"


    // $ANTLR start "rule__Seff__Group__3"
    // InternalRepoLang.g:3176:1: rule__Seff__Group__3 : rule__Seff__Group__3__Impl rule__Seff__Group__4 ;
    public final void rule__Seff__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3180:1: ( rule__Seff__Group__3__Impl rule__Seff__Group__4 )
            // InternalRepoLang.g:3181:2: rule__Seff__Group__3__Impl rule__Seff__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Seff__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seff__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seff__Group__3"


    // $ANTLR start "rule__Seff__Group__3__Impl"
    // InternalRepoLang.g:3188:1: rule__Seff__Group__3__Impl : ( ( rule__Seff__RoleAssignment_3 ) ) ;
    public final void rule__Seff__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3192:1: ( ( ( rule__Seff__RoleAssignment_3 ) ) )
            // InternalRepoLang.g:3193:1: ( ( rule__Seff__RoleAssignment_3 ) )
            {
            // InternalRepoLang.g:3193:1: ( ( rule__Seff__RoleAssignment_3 ) )
            // InternalRepoLang.g:3194:2: ( rule__Seff__RoleAssignment_3 )
            {
             before(grammarAccess.getSeffAccess().getRoleAssignment_3()); 
            // InternalRepoLang.g:3195:2: ( rule__Seff__RoleAssignment_3 )
            // InternalRepoLang.g:3195:3: rule__Seff__RoleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Seff__RoleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSeffAccess().getRoleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seff__Group__3__Impl"


    // $ANTLR start "rule__Seff__Group__4"
    // InternalRepoLang.g:3203:1: rule__Seff__Group__4 : rule__Seff__Group__4__Impl rule__Seff__Group__5 ;
    public final void rule__Seff__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3207:1: ( rule__Seff__Group__4__Impl rule__Seff__Group__5 )
            // InternalRepoLang.g:3208:2: rule__Seff__Group__4__Impl rule__Seff__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Seff__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seff__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seff__Group__4"


    // $ANTLR start "rule__Seff__Group__4__Impl"
    // InternalRepoLang.g:3215:1: rule__Seff__Group__4__Impl : ( ( rule__Seff__SignatureAssignment_4 ) ) ;
    public final void rule__Seff__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3219:1: ( ( ( rule__Seff__SignatureAssignment_4 ) ) )
            // InternalRepoLang.g:3220:1: ( ( rule__Seff__SignatureAssignment_4 ) )
            {
            // InternalRepoLang.g:3220:1: ( ( rule__Seff__SignatureAssignment_4 ) )
            // InternalRepoLang.g:3221:2: ( rule__Seff__SignatureAssignment_4 )
            {
             before(grammarAccess.getSeffAccess().getSignatureAssignment_4()); 
            // InternalRepoLang.g:3222:2: ( rule__Seff__SignatureAssignment_4 )
            // InternalRepoLang.g:3222:3: rule__Seff__SignatureAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Seff__SignatureAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSeffAccess().getSignatureAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seff__Group__4__Impl"


    // $ANTLR start "rule__Seff__Group__5"
    // InternalRepoLang.g:3230:1: rule__Seff__Group__5 : rule__Seff__Group__5__Impl rule__Seff__Group__6 ;
    public final void rule__Seff__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3234:1: ( rule__Seff__Group__5__Impl rule__Seff__Group__6 )
            // InternalRepoLang.g:3235:2: rule__Seff__Group__5__Impl rule__Seff__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__Seff__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seff__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seff__Group__5"


    // $ANTLR start "rule__Seff__Group__5__Impl"
    // InternalRepoLang.g:3242:1: rule__Seff__Group__5__Impl : ( '{' ) ;
    public final void rule__Seff__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3246:1: ( ( '{' ) )
            // InternalRepoLang.g:3247:1: ( '{' )
            {
            // InternalRepoLang.g:3247:1: ( '{' )
            // InternalRepoLang.g:3248:2: '{'
            {
             before(grammarAccess.getSeffAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSeffAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seff__Group__5__Impl"


    // $ANTLR start "rule__Seff__Group__6"
    // InternalRepoLang.g:3257:1: rule__Seff__Group__6 : rule__Seff__Group__6__Impl rule__Seff__Group__7 ;
    public final void rule__Seff__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3261:1: ( rule__Seff__Group__6__Impl rule__Seff__Group__7 )
            // InternalRepoLang.g:3262:2: rule__Seff__Group__6__Impl rule__Seff__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__Seff__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seff__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seff__Group__6"


    // $ANTLR start "rule__Seff__Group__6__Impl"
    // InternalRepoLang.g:3269:1: rule__Seff__Group__6__Impl : ( ( rule__Seff__ActionsAssignment_6 )* ) ;
    public final void rule__Seff__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3273:1: ( ( ( rule__Seff__ActionsAssignment_6 )* ) )
            // InternalRepoLang.g:3274:1: ( ( rule__Seff__ActionsAssignment_6 )* )
            {
            // InternalRepoLang.g:3274:1: ( ( rule__Seff__ActionsAssignment_6 )* )
            // InternalRepoLang.g:3275:2: ( rule__Seff__ActionsAssignment_6 )*
            {
             before(grammarAccess.getSeffAccess().getActionsAssignment_6()); 
            // InternalRepoLang.g:3276:2: ( rule__Seff__ActionsAssignment_6 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=38 && LA26_0<=44)||(LA26_0>=48 && LA26_0<=50)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRepoLang.g:3276:3: rule__Seff__ActionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Seff__ActionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getSeffAccess().getActionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seff__Group__6__Impl"


    // $ANTLR start "rule__Seff__Group__7"
    // InternalRepoLang.g:3284:1: rule__Seff__Group__7 : rule__Seff__Group__7__Impl ;
    public final void rule__Seff__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3288:1: ( rule__Seff__Group__7__Impl )
            // InternalRepoLang.g:3289:2: rule__Seff__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Seff__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seff__Group__7"


    // $ANTLR start "rule__Seff__Group__7__Impl"
    // InternalRepoLang.g:3295:1: rule__Seff__Group__7__Impl : ( '}' ) ;
    public final void rule__Seff__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3299:1: ( ( '}' ) )
            // InternalRepoLang.g:3300:1: ( '}' )
            {
            // InternalRepoLang.g:3300:1: ( '}' )
            // InternalRepoLang.g:3301:2: '}'
            {
             before(grammarAccess.getSeffAccess().getRightCurlyBracketKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSeffAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seff__Group__7__Impl"


    // $ANTLR start "rule__SeffInternalAction__Group__0"
    // InternalRepoLang.g:3311:1: rule__SeffInternalAction__Group__0 : rule__SeffInternalAction__Group__0__Impl rule__SeffInternalAction__Group__1 ;
    public final void rule__SeffInternalAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3315:1: ( rule__SeffInternalAction__Group__0__Impl rule__SeffInternalAction__Group__1 )
            // InternalRepoLang.g:3316:2: rule__SeffInternalAction__Group__0__Impl rule__SeffInternalAction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SeffInternalAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffInternalAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffInternalAction__Group__0"


    // $ANTLR start "rule__SeffInternalAction__Group__0__Impl"
    // InternalRepoLang.g:3323:1: rule__SeffInternalAction__Group__0__Impl : ( 'IA' ) ;
    public final void rule__SeffInternalAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3327:1: ( ( 'IA' ) )
            // InternalRepoLang.g:3328:1: ( 'IA' )
            {
            // InternalRepoLang.g:3328:1: ( 'IA' )
            // InternalRepoLang.g:3329:2: 'IA'
            {
             before(grammarAccess.getSeffInternalActionAccess().getIAKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSeffInternalActionAccess().getIAKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffInternalAction__Group__0__Impl"


    // $ANTLR start "rule__SeffInternalAction__Group__1"
    // InternalRepoLang.g:3338:1: rule__SeffInternalAction__Group__1 : rule__SeffInternalAction__Group__1__Impl rule__SeffInternalAction__Group__2 ;
    public final void rule__SeffInternalAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3342:1: ( rule__SeffInternalAction__Group__1__Impl rule__SeffInternalAction__Group__2 )
            // InternalRepoLang.g:3343:2: rule__SeffInternalAction__Group__1__Impl rule__SeffInternalAction__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SeffInternalAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffInternalAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffInternalAction__Group__1"


    // $ANTLR start "rule__SeffInternalAction__Group__1__Impl"
    // InternalRepoLang.g:3350:1: rule__SeffInternalAction__Group__1__Impl : ( ( rule__SeffInternalAction__NameAssignment_1 )? ) ;
    public final void rule__SeffInternalAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3354:1: ( ( ( rule__SeffInternalAction__NameAssignment_1 )? ) )
            // InternalRepoLang.g:3355:1: ( ( rule__SeffInternalAction__NameAssignment_1 )? )
            {
            // InternalRepoLang.g:3355:1: ( ( rule__SeffInternalAction__NameAssignment_1 )? )
            // InternalRepoLang.g:3356:2: ( rule__SeffInternalAction__NameAssignment_1 )?
            {
             before(grammarAccess.getSeffInternalActionAccess().getNameAssignment_1()); 
            // InternalRepoLang.g:3357:2: ( rule__SeffInternalAction__NameAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==RULE_ID) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalRepoLang.g:3357:3: rule__SeffInternalAction__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SeffInternalAction__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSeffInternalActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffInternalAction__Group__1__Impl"


    // $ANTLR start "rule__SeffInternalAction__Group__2"
    // InternalRepoLang.g:3365:1: rule__SeffInternalAction__Group__2 : rule__SeffInternalAction__Group__2__Impl rule__SeffInternalAction__Group__3 ;
    public final void rule__SeffInternalAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3369:1: ( rule__SeffInternalAction__Group__2__Impl rule__SeffInternalAction__Group__3 )
            // InternalRepoLang.g:3370:2: rule__SeffInternalAction__Group__2__Impl rule__SeffInternalAction__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__SeffInternalAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffInternalAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffInternalAction__Group__2"


    // $ANTLR start "rule__SeffInternalAction__Group__2__Impl"
    // InternalRepoLang.g:3377:1: rule__SeffInternalAction__Group__2__Impl : ( ( rule__SeffInternalAction__DemandTypeAssignment_2 ) ) ;
    public final void rule__SeffInternalAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3381:1: ( ( ( rule__SeffInternalAction__DemandTypeAssignment_2 ) ) )
            // InternalRepoLang.g:3382:1: ( ( rule__SeffInternalAction__DemandTypeAssignment_2 ) )
            {
            // InternalRepoLang.g:3382:1: ( ( rule__SeffInternalAction__DemandTypeAssignment_2 ) )
            // InternalRepoLang.g:3383:2: ( rule__SeffInternalAction__DemandTypeAssignment_2 )
            {
             before(grammarAccess.getSeffInternalActionAccess().getDemandTypeAssignment_2()); 
            // InternalRepoLang.g:3384:2: ( rule__SeffInternalAction__DemandTypeAssignment_2 )
            // InternalRepoLang.g:3384:3: rule__SeffInternalAction__DemandTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SeffInternalAction__DemandTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSeffInternalActionAccess().getDemandTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffInternalAction__Group__2__Impl"


    // $ANTLR start "rule__SeffInternalAction__Group__3"
    // InternalRepoLang.g:3392:1: rule__SeffInternalAction__Group__3 : rule__SeffInternalAction__Group__3__Impl ;
    public final void rule__SeffInternalAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3396:1: ( rule__SeffInternalAction__Group__3__Impl )
            // InternalRepoLang.g:3397:2: rule__SeffInternalAction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeffInternalAction__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffInternalAction__Group__3"


    // $ANTLR start "rule__SeffInternalAction__Group__3__Impl"
    // InternalRepoLang.g:3403:1: rule__SeffInternalAction__Group__3__Impl : ( ( rule__SeffInternalAction__DemandAssignment_3 ) ) ;
    public final void rule__SeffInternalAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3407:1: ( ( ( rule__SeffInternalAction__DemandAssignment_3 ) ) )
            // InternalRepoLang.g:3408:1: ( ( rule__SeffInternalAction__DemandAssignment_3 ) )
            {
            // InternalRepoLang.g:3408:1: ( ( rule__SeffInternalAction__DemandAssignment_3 ) )
            // InternalRepoLang.g:3409:2: ( rule__SeffInternalAction__DemandAssignment_3 )
            {
             before(grammarAccess.getSeffInternalActionAccess().getDemandAssignment_3()); 
            // InternalRepoLang.g:3410:2: ( rule__SeffInternalAction__DemandAssignment_3 )
            // InternalRepoLang.g:3410:3: rule__SeffInternalAction__DemandAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SeffInternalAction__DemandAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSeffInternalActionAccess().getDemandAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffInternalAction__Group__3__Impl"


    // $ANTLR start "rule__SeffAcquireAction__Group__0"
    // InternalRepoLang.g:3419:1: rule__SeffAcquireAction__Group__0 : rule__SeffAcquireAction__Group__0__Impl rule__SeffAcquireAction__Group__1 ;
    public final void rule__SeffAcquireAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3423:1: ( rule__SeffAcquireAction__Group__0__Impl rule__SeffAcquireAction__Group__1 )
            // InternalRepoLang.g:3424:2: rule__SeffAcquireAction__Group__0__Impl rule__SeffAcquireAction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SeffAcquireAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffAcquireAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffAcquireAction__Group__0"


    // $ANTLR start "rule__SeffAcquireAction__Group__0__Impl"
    // InternalRepoLang.g:3431:1: rule__SeffAcquireAction__Group__0__Impl : ( 'ACQ' ) ;
    public final void rule__SeffAcquireAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3435:1: ( ( 'ACQ' ) )
            // InternalRepoLang.g:3436:1: ( 'ACQ' )
            {
            // InternalRepoLang.g:3436:1: ( 'ACQ' )
            // InternalRepoLang.g:3437:2: 'ACQ'
            {
             before(grammarAccess.getSeffAcquireActionAccess().getACQKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSeffAcquireActionAccess().getACQKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffAcquireAction__Group__0__Impl"


    // $ANTLR start "rule__SeffAcquireAction__Group__1"
    // InternalRepoLang.g:3446:1: rule__SeffAcquireAction__Group__1 : rule__SeffAcquireAction__Group__1__Impl rule__SeffAcquireAction__Group__2 ;
    public final void rule__SeffAcquireAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3450:1: ( rule__SeffAcquireAction__Group__1__Impl rule__SeffAcquireAction__Group__2 )
            // InternalRepoLang.g:3451:2: rule__SeffAcquireAction__Group__1__Impl rule__SeffAcquireAction__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SeffAcquireAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffAcquireAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffAcquireAction__Group__1"


    // $ANTLR start "rule__SeffAcquireAction__Group__1__Impl"
    // InternalRepoLang.g:3458:1: rule__SeffAcquireAction__Group__1__Impl : ( ( rule__SeffAcquireAction__NameAssignment_1 )? ) ;
    public final void rule__SeffAcquireAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3462:1: ( ( ( rule__SeffAcquireAction__NameAssignment_1 )? ) )
            // InternalRepoLang.g:3463:1: ( ( rule__SeffAcquireAction__NameAssignment_1 )? )
            {
            // InternalRepoLang.g:3463:1: ( ( rule__SeffAcquireAction__NameAssignment_1 )? )
            // InternalRepoLang.g:3464:2: ( rule__SeffAcquireAction__NameAssignment_1 )?
            {
             before(grammarAccess.getSeffAcquireActionAccess().getNameAssignment_1()); 
            // InternalRepoLang.g:3465:2: ( rule__SeffAcquireAction__NameAssignment_1 )?
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
                    // InternalRepoLang.g:3465:3: rule__SeffAcquireAction__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SeffAcquireAction__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSeffAcquireActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffAcquireAction__Group__1__Impl"


    // $ANTLR start "rule__SeffAcquireAction__Group__2"
    // InternalRepoLang.g:3473:1: rule__SeffAcquireAction__Group__2 : rule__SeffAcquireAction__Group__2__Impl rule__SeffAcquireAction__Group__3 ;
    public final void rule__SeffAcquireAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3477:1: ( rule__SeffAcquireAction__Group__2__Impl rule__SeffAcquireAction__Group__3 )
            // InternalRepoLang.g:3478:2: rule__SeffAcquireAction__Group__2__Impl rule__SeffAcquireAction__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__SeffAcquireAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffAcquireAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffAcquireAction__Group__2"


    // $ANTLR start "rule__SeffAcquireAction__Group__2__Impl"
    // InternalRepoLang.g:3485:1: rule__SeffAcquireAction__Group__2__Impl : ( ( rule__SeffAcquireAction__ResourceAssignment_2 ) ) ;
    public final void rule__SeffAcquireAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3489:1: ( ( ( rule__SeffAcquireAction__ResourceAssignment_2 ) ) )
            // InternalRepoLang.g:3490:1: ( ( rule__SeffAcquireAction__ResourceAssignment_2 ) )
            {
            // InternalRepoLang.g:3490:1: ( ( rule__SeffAcquireAction__ResourceAssignment_2 ) )
            // InternalRepoLang.g:3491:2: ( rule__SeffAcquireAction__ResourceAssignment_2 )
            {
             before(grammarAccess.getSeffAcquireActionAccess().getResourceAssignment_2()); 
            // InternalRepoLang.g:3492:2: ( rule__SeffAcquireAction__ResourceAssignment_2 )
            // InternalRepoLang.g:3492:3: rule__SeffAcquireAction__ResourceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SeffAcquireAction__ResourceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSeffAcquireActionAccess().getResourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffAcquireAction__Group__2__Impl"


    // $ANTLR start "rule__SeffAcquireAction__Group__3"
    // InternalRepoLang.g:3500:1: rule__SeffAcquireAction__Group__3 : rule__SeffAcquireAction__Group__3__Impl ;
    public final void rule__SeffAcquireAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3504:1: ( rule__SeffAcquireAction__Group__3__Impl )
            // InternalRepoLang.g:3505:2: rule__SeffAcquireAction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeffAcquireAction__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffAcquireAction__Group__3"


    // $ANTLR start "rule__SeffAcquireAction__Group__3__Impl"
    // InternalRepoLang.g:3511:1: rule__SeffAcquireAction__Group__3__Impl : ( ( rule__SeffAcquireAction__Group_3__0 )? ) ;
    public final void rule__SeffAcquireAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3515:1: ( ( ( rule__SeffAcquireAction__Group_3__0 )? ) )
            // InternalRepoLang.g:3516:1: ( ( rule__SeffAcquireAction__Group_3__0 )? )
            {
            // InternalRepoLang.g:3516:1: ( ( rule__SeffAcquireAction__Group_3__0 )? )
            // InternalRepoLang.g:3517:2: ( rule__SeffAcquireAction__Group_3__0 )?
            {
             before(grammarAccess.getSeffAcquireActionAccess().getGroup_3()); 
            // InternalRepoLang.g:3518:2: ( rule__SeffAcquireAction__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==24) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRepoLang.g:3518:3: rule__SeffAcquireAction__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SeffAcquireAction__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSeffAcquireActionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffAcquireAction__Group__3__Impl"


    // $ANTLR start "rule__SeffAcquireAction__Group_3__0"
    // InternalRepoLang.g:3527:1: rule__SeffAcquireAction__Group_3__0 : rule__SeffAcquireAction__Group_3__0__Impl rule__SeffAcquireAction__Group_3__1 ;
    public final void rule__SeffAcquireAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3531:1: ( rule__SeffAcquireAction__Group_3__0__Impl rule__SeffAcquireAction__Group_3__1 )
            // InternalRepoLang.g:3532:2: rule__SeffAcquireAction__Group_3__0__Impl rule__SeffAcquireAction__Group_3__1
            {
            pushFollow(FOLLOW_32);
            rule__SeffAcquireAction__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffAcquireAction__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffAcquireAction__Group_3__0"


    // $ANTLR start "rule__SeffAcquireAction__Group_3__0__Impl"
    // InternalRepoLang.g:3539:1: rule__SeffAcquireAction__Group_3__0__Impl : ( '(' ) ;
    public final void rule__SeffAcquireAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3543:1: ( ( '(' ) )
            // InternalRepoLang.g:3544:1: ( '(' )
            {
            // InternalRepoLang.g:3544:1: ( '(' )
            // InternalRepoLang.g:3545:2: '('
            {
             before(grammarAccess.getSeffAcquireActionAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSeffAcquireActionAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffAcquireAction__Group_3__0__Impl"


    // $ANTLR start "rule__SeffAcquireAction__Group_3__1"
    // InternalRepoLang.g:3554:1: rule__SeffAcquireAction__Group_3__1 : rule__SeffAcquireAction__Group_3__1__Impl rule__SeffAcquireAction__Group_3__2 ;
    public final void rule__SeffAcquireAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3558:1: ( rule__SeffAcquireAction__Group_3__1__Impl rule__SeffAcquireAction__Group_3__2 )
            // InternalRepoLang.g:3559:2: rule__SeffAcquireAction__Group_3__1__Impl rule__SeffAcquireAction__Group_3__2
            {
            pushFollow(FOLLOW_33);
            rule__SeffAcquireAction__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffAcquireAction__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffAcquireAction__Group_3__1"


    // $ANTLR start "rule__SeffAcquireAction__Group_3__1__Impl"
    // InternalRepoLang.g:3566:1: rule__SeffAcquireAction__Group_3__1__Impl : ( ( rule__SeffAcquireAction__AmountAssignment_3_1 ) ) ;
    public final void rule__SeffAcquireAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3570:1: ( ( ( rule__SeffAcquireAction__AmountAssignment_3_1 ) ) )
            // InternalRepoLang.g:3571:1: ( ( rule__SeffAcquireAction__AmountAssignment_3_1 ) )
            {
            // InternalRepoLang.g:3571:1: ( ( rule__SeffAcquireAction__AmountAssignment_3_1 ) )
            // InternalRepoLang.g:3572:2: ( rule__SeffAcquireAction__AmountAssignment_3_1 )
            {
             before(grammarAccess.getSeffAcquireActionAccess().getAmountAssignment_3_1()); 
            // InternalRepoLang.g:3573:2: ( rule__SeffAcquireAction__AmountAssignment_3_1 )
            // InternalRepoLang.g:3573:3: rule__SeffAcquireAction__AmountAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SeffAcquireAction__AmountAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSeffAcquireActionAccess().getAmountAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffAcquireAction__Group_3__1__Impl"


    // $ANTLR start "rule__SeffAcquireAction__Group_3__2"
    // InternalRepoLang.g:3581:1: rule__SeffAcquireAction__Group_3__2 : rule__SeffAcquireAction__Group_3__2__Impl ;
    public final void rule__SeffAcquireAction__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3585:1: ( rule__SeffAcquireAction__Group_3__2__Impl )
            // InternalRepoLang.g:3586:2: rule__SeffAcquireAction__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeffAcquireAction__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffAcquireAction__Group_3__2"


    // $ANTLR start "rule__SeffAcquireAction__Group_3__2__Impl"
    // InternalRepoLang.g:3592:1: rule__SeffAcquireAction__Group_3__2__Impl : ( ')' ) ;
    public final void rule__SeffAcquireAction__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3596:1: ( ( ')' ) )
            // InternalRepoLang.g:3597:1: ( ')' )
            {
            // InternalRepoLang.g:3597:1: ( ')' )
            // InternalRepoLang.g:3598:2: ')'
            {
             before(grammarAccess.getSeffAcquireActionAccess().getRightParenthesisKeyword_3_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSeffAcquireActionAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffAcquireAction__Group_3__2__Impl"


    // $ANTLR start "rule__SeffReleaseAction__Group__0"
    // InternalRepoLang.g:3608:1: rule__SeffReleaseAction__Group__0 : rule__SeffReleaseAction__Group__0__Impl rule__SeffReleaseAction__Group__1 ;
    public final void rule__SeffReleaseAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3612:1: ( rule__SeffReleaseAction__Group__0__Impl rule__SeffReleaseAction__Group__1 )
            // InternalRepoLang.g:3613:2: rule__SeffReleaseAction__Group__0__Impl rule__SeffReleaseAction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SeffReleaseAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffReleaseAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReleaseAction__Group__0"


    // $ANTLR start "rule__SeffReleaseAction__Group__0__Impl"
    // InternalRepoLang.g:3620:1: rule__SeffReleaseAction__Group__0__Impl : ( 'REL' ) ;
    public final void rule__SeffReleaseAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3624:1: ( ( 'REL' ) )
            // InternalRepoLang.g:3625:1: ( 'REL' )
            {
            // InternalRepoLang.g:3625:1: ( 'REL' )
            // InternalRepoLang.g:3626:2: 'REL'
            {
             before(grammarAccess.getSeffReleaseActionAccess().getRELKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSeffReleaseActionAccess().getRELKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReleaseAction__Group__0__Impl"


    // $ANTLR start "rule__SeffReleaseAction__Group__1"
    // InternalRepoLang.g:3635:1: rule__SeffReleaseAction__Group__1 : rule__SeffReleaseAction__Group__1__Impl rule__SeffReleaseAction__Group__2 ;
    public final void rule__SeffReleaseAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3639:1: ( rule__SeffReleaseAction__Group__1__Impl rule__SeffReleaseAction__Group__2 )
            // InternalRepoLang.g:3640:2: rule__SeffReleaseAction__Group__1__Impl rule__SeffReleaseAction__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SeffReleaseAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffReleaseAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReleaseAction__Group__1"


    // $ANTLR start "rule__SeffReleaseAction__Group__1__Impl"
    // InternalRepoLang.g:3647:1: rule__SeffReleaseAction__Group__1__Impl : ( ( rule__SeffReleaseAction__NameAssignment_1 )? ) ;
    public final void rule__SeffReleaseAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3651:1: ( ( ( rule__SeffReleaseAction__NameAssignment_1 )? ) )
            // InternalRepoLang.g:3652:1: ( ( rule__SeffReleaseAction__NameAssignment_1 )? )
            {
            // InternalRepoLang.g:3652:1: ( ( rule__SeffReleaseAction__NameAssignment_1 )? )
            // InternalRepoLang.g:3653:2: ( rule__SeffReleaseAction__NameAssignment_1 )?
            {
             before(grammarAccess.getSeffReleaseActionAccess().getNameAssignment_1()); 
            // InternalRepoLang.g:3654:2: ( rule__SeffReleaseAction__NameAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==RULE_ID) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalRepoLang.g:3654:3: rule__SeffReleaseAction__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SeffReleaseAction__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSeffReleaseActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReleaseAction__Group__1__Impl"


    // $ANTLR start "rule__SeffReleaseAction__Group__2"
    // InternalRepoLang.g:3662:1: rule__SeffReleaseAction__Group__2 : rule__SeffReleaseAction__Group__2__Impl rule__SeffReleaseAction__Group__3 ;
    public final void rule__SeffReleaseAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3666:1: ( rule__SeffReleaseAction__Group__2__Impl rule__SeffReleaseAction__Group__3 )
            // InternalRepoLang.g:3667:2: rule__SeffReleaseAction__Group__2__Impl rule__SeffReleaseAction__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__SeffReleaseAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffReleaseAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReleaseAction__Group__2"


    // $ANTLR start "rule__SeffReleaseAction__Group__2__Impl"
    // InternalRepoLang.g:3674:1: rule__SeffReleaseAction__Group__2__Impl : ( ( rule__SeffReleaseAction__ResourceAssignment_2 ) ) ;
    public final void rule__SeffReleaseAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3678:1: ( ( ( rule__SeffReleaseAction__ResourceAssignment_2 ) ) )
            // InternalRepoLang.g:3679:1: ( ( rule__SeffReleaseAction__ResourceAssignment_2 ) )
            {
            // InternalRepoLang.g:3679:1: ( ( rule__SeffReleaseAction__ResourceAssignment_2 ) )
            // InternalRepoLang.g:3680:2: ( rule__SeffReleaseAction__ResourceAssignment_2 )
            {
             before(grammarAccess.getSeffReleaseActionAccess().getResourceAssignment_2()); 
            // InternalRepoLang.g:3681:2: ( rule__SeffReleaseAction__ResourceAssignment_2 )
            // InternalRepoLang.g:3681:3: rule__SeffReleaseAction__ResourceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SeffReleaseAction__ResourceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSeffReleaseActionAccess().getResourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReleaseAction__Group__2__Impl"


    // $ANTLR start "rule__SeffReleaseAction__Group__3"
    // InternalRepoLang.g:3689:1: rule__SeffReleaseAction__Group__3 : rule__SeffReleaseAction__Group__3__Impl ;
    public final void rule__SeffReleaseAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3693:1: ( rule__SeffReleaseAction__Group__3__Impl )
            // InternalRepoLang.g:3694:2: rule__SeffReleaseAction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeffReleaseAction__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReleaseAction__Group__3"


    // $ANTLR start "rule__SeffReleaseAction__Group__3__Impl"
    // InternalRepoLang.g:3700:1: rule__SeffReleaseAction__Group__3__Impl : ( ( rule__SeffReleaseAction__Group_3__0 )? ) ;
    public final void rule__SeffReleaseAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3704:1: ( ( ( rule__SeffReleaseAction__Group_3__0 )? ) )
            // InternalRepoLang.g:3705:1: ( ( rule__SeffReleaseAction__Group_3__0 )? )
            {
            // InternalRepoLang.g:3705:1: ( ( rule__SeffReleaseAction__Group_3__0 )? )
            // InternalRepoLang.g:3706:2: ( rule__SeffReleaseAction__Group_3__0 )?
            {
             before(grammarAccess.getSeffReleaseActionAccess().getGroup_3()); 
            // InternalRepoLang.g:3707:2: ( rule__SeffReleaseAction__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==24) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRepoLang.g:3707:3: rule__SeffReleaseAction__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SeffReleaseAction__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSeffReleaseActionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReleaseAction__Group__3__Impl"


    // $ANTLR start "rule__SeffReleaseAction__Group_3__0"
    // InternalRepoLang.g:3716:1: rule__SeffReleaseAction__Group_3__0 : rule__SeffReleaseAction__Group_3__0__Impl rule__SeffReleaseAction__Group_3__1 ;
    public final void rule__SeffReleaseAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3720:1: ( rule__SeffReleaseAction__Group_3__0__Impl rule__SeffReleaseAction__Group_3__1 )
            // InternalRepoLang.g:3721:2: rule__SeffReleaseAction__Group_3__0__Impl rule__SeffReleaseAction__Group_3__1
            {
            pushFollow(FOLLOW_32);
            rule__SeffReleaseAction__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffReleaseAction__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReleaseAction__Group_3__0"


    // $ANTLR start "rule__SeffReleaseAction__Group_3__0__Impl"
    // InternalRepoLang.g:3728:1: rule__SeffReleaseAction__Group_3__0__Impl : ( '(' ) ;
    public final void rule__SeffReleaseAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3732:1: ( ( '(' ) )
            // InternalRepoLang.g:3733:1: ( '(' )
            {
            // InternalRepoLang.g:3733:1: ( '(' )
            // InternalRepoLang.g:3734:2: '('
            {
             before(grammarAccess.getSeffReleaseActionAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSeffReleaseActionAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReleaseAction__Group_3__0__Impl"


    // $ANTLR start "rule__SeffReleaseAction__Group_3__1"
    // InternalRepoLang.g:3743:1: rule__SeffReleaseAction__Group_3__1 : rule__SeffReleaseAction__Group_3__1__Impl rule__SeffReleaseAction__Group_3__2 ;
    public final void rule__SeffReleaseAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3747:1: ( rule__SeffReleaseAction__Group_3__1__Impl rule__SeffReleaseAction__Group_3__2 )
            // InternalRepoLang.g:3748:2: rule__SeffReleaseAction__Group_3__1__Impl rule__SeffReleaseAction__Group_3__2
            {
            pushFollow(FOLLOW_33);
            rule__SeffReleaseAction__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffReleaseAction__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReleaseAction__Group_3__1"


    // $ANTLR start "rule__SeffReleaseAction__Group_3__1__Impl"
    // InternalRepoLang.g:3755:1: rule__SeffReleaseAction__Group_3__1__Impl : ( ( rule__SeffReleaseAction__AmountAssignment_3_1 ) ) ;
    public final void rule__SeffReleaseAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3759:1: ( ( ( rule__SeffReleaseAction__AmountAssignment_3_1 ) ) )
            // InternalRepoLang.g:3760:1: ( ( rule__SeffReleaseAction__AmountAssignment_3_1 ) )
            {
            // InternalRepoLang.g:3760:1: ( ( rule__SeffReleaseAction__AmountAssignment_3_1 ) )
            // InternalRepoLang.g:3761:2: ( rule__SeffReleaseAction__AmountAssignment_3_1 )
            {
             before(grammarAccess.getSeffReleaseActionAccess().getAmountAssignment_3_1()); 
            // InternalRepoLang.g:3762:2: ( rule__SeffReleaseAction__AmountAssignment_3_1 )
            // InternalRepoLang.g:3762:3: rule__SeffReleaseAction__AmountAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SeffReleaseAction__AmountAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSeffReleaseActionAccess().getAmountAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReleaseAction__Group_3__1__Impl"


    // $ANTLR start "rule__SeffReleaseAction__Group_3__2"
    // InternalRepoLang.g:3770:1: rule__SeffReleaseAction__Group_3__2 : rule__SeffReleaseAction__Group_3__2__Impl ;
    public final void rule__SeffReleaseAction__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3774:1: ( rule__SeffReleaseAction__Group_3__2__Impl )
            // InternalRepoLang.g:3775:2: rule__SeffReleaseAction__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeffReleaseAction__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReleaseAction__Group_3__2"


    // $ANTLR start "rule__SeffReleaseAction__Group_3__2__Impl"
    // InternalRepoLang.g:3781:1: rule__SeffReleaseAction__Group_3__2__Impl : ( ')' ) ;
    public final void rule__SeffReleaseAction__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3785:1: ( ( ')' ) )
            // InternalRepoLang.g:3786:1: ( ')' )
            {
            // InternalRepoLang.g:3786:1: ( ')' )
            // InternalRepoLang.g:3787:2: ')'
            {
             before(grammarAccess.getSeffReleaseActionAccess().getRightParenthesisKeyword_3_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSeffReleaseActionAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReleaseAction__Group_3__2__Impl"


    // $ANTLR start "rule__SeffLoopAction__Group__0"
    // InternalRepoLang.g:3797:1: rule__SeffLoopAction__Group__0 : rule__SeffLoopAction__Group__0__Impl rule__SeffLoopAction__Group__1 ;
    public final void rule__SeffLoopAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3801:1: ( rule__SeffLoopAction__Group__0__Impl rule__SeffLoopAction__Group__1 )
            // InternalRepoLang.g:3802:2: rule__SeffLoopAction__Group__0__Impl rule__SeffLoopAction__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__SeffLoopAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffLoopAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffLoopAction__Group__0"


    // $ANTLR start "rule__SeffLoopAction__Group__0__Impl"
    // InternalRepoLang.g:3809:1: rule__SeffLoopAction__Group__0__Impl : ( 'LOOP' ) ;
    public final void rule__SeffLoopAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3813:1: ( ( 'LOOP' ) )
            // InternalRepoLang.g:3814:1: ( 'LOOP' )
            {
            // InternalRepoLang.g:3814:1: ( 'LOOP' )
            // InternalRepoLang.g:3815:2: 'LOOP'
            {
             before(grammarAccess.getSeffLoopActionAccess().getLOOPKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSeffLoopActionAccess().getLOOPKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffLoopAction__Group__0__Impl"


    // $ANTLR start "rule__SeffLoopAction__Group__1"
    // InternalRepoLang.g:3824:1: rule__SeffLoopAction__Group__1 : rule__SeffLoopAction__Group__1__Impl rule__SeffLoopAction__Group__2 ;
    public final void rule__SeffLoopAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3828:1: ( rule__SeffLoopAction__Group__1__Impl rule__SeffLoopAction__Group__2 )
            // InternalRepoLang.g:3829:2: rule__SeffLoopAction__Group__1__Impl rule__SeffLoopAction__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__SeffLoopAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffLoopAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffLoopAction__Group__1"


    // $ANTLR start "rule__SeffLoopAction__Group__1__Impl"
    // InternalRepoLang.g:3836:1: rule__SeffLoopAction__Group__1__Impl : ( ( rule__SeffLoopAction__NameAssignment_1 )? ) ;
    public final void rule__SeffLoopAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3840:1: ( ( ( rule__SeffLoopAction__NameAssignment_1 )? ) )
            // InternalRepoLang.g:3841:1: ( ( rule__SeffLoopAction__NameAssignment_1 )? )
            {
            // InternalRepoLang.g:3841:1: ( ( rule__SeffLoopAction__NameAssignment_1 )? )
            // InternalRepoLang.g:3842:2: ( rule__SeffLoopAction__NameAssignment_1 )?
            {
             before(grammarAccess.getSeffLoopActionAccess().getNameAssignment_1()); 
            // InternalRepoLang.g:3843:2: ( rule__SeffLoopAction__NameAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRepoLang.g:3843:3: rule__SeffLoopAction__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SeffLoopAction__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSeffLoopActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffLoopAction__Group__1__Impl"


    // $ANTLR start "rule__SeffLoopAction__Group__2"
    // InternalRepoLang.g:3851:1: rule__SeffLoopAction__Group__2 : rule__SeffLoopAction__Group__2__Impl rule__SeffLoopAction__Group__3 ;
    public final void rule__SeffLoopAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3855:1: ( rule__SeffLoopAction__Group__2__Impl rule__SeffLoopAction__Group__3 )
            // InternalRepoLang.g:3856:2: rule__SeffLoopAction__Group__2__Impl rule__SeffLoopAction__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__SeffLoopAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffLoopAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffLoopAction__Group__2"


    // $ANTLR start "rule__SeffLoopAction__Group__2__Impl"
    // InternalRepoLang.g:3863:1: rule__SeffLoopAction__Group__2__Impl : ( '(' ) ;
    public final void rule__SeffLoopAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3867:1: ( ( '(' ) )
            // InternalRepoLang.g:3868:1: ( '(' )
            {
            // InternalRepoLang.g:3868:1: ( '(' )
            // InternalRepoLang.g:3869:2: '('
            {
             before(grammarAccess.getSeffLoopActionAccess().getLeftParenthesisKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSeffLoopActionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffLoopAction__Group__2__Impl"


    // $ANTLR start "rule__SeffLoopAction__Group__3"
    // InternalRepoLang.g:3878:1: rule__SeffLoopAction__Group__3 : rule__SeffLoopAction__Group__3__Impl rule__SeffLoopAction__Group__4 ;
    public final void rule__SeffLoopAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3882:1: ( rule__SeffLoopAction__Group__3__Impl rule__SeffLoopAction__Group__4 )
            // InternalRepoLang.g:3883:2: rule__SeffLoopAction__Group__3__Impl rule__SeffLoopAction__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__SeffLoopAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffLoopAction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffLoopAction__Group__3"


    // $ANTLR start "rule__SeffLoopAction__Group__3__Impl"
    // InternalRepoLang.g:3890:1: rule__SeffLoopAction__Group__3__Impl : ( ( rule__SeffLoopAction__CountAssignment_3 ) ) ;
    public final void rule__SeffLoopAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3894:1: ( ( ( rule__SeffLoopAction__CountAssignment_3 ) ) )
            // InternalRepoLang.g:3895:1: ( ( rule__SeffLoopAction__CountAssignment_3 ) )
            {
            // InternalRepoLang.g:3895:1: ( ( rule__SeffLoopAction__CountAssignment_3 ) )
            // InternalRepoLang.g:3896:2: ( rule__SeffLoopAction__CountAssignment_3 )
            {
             before(grammarAccess.getSeffLoopActionAccess().getCountAssignment_3()); 
            // InternalRepoLang.g:3897:2: ( rule__SeffLoopAction__CountAssignment_3 )
            // InternalRepoLang.g:3897:3: rule__SeffLoopAction__CountAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SeffLoopAction__CountAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSeffLoopActionAccess().getCountAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffLoopAction__Group__3__Impl"


    // $ANTLR start "rule__SeffLoopAction__Group__4"
    // InternalRepoLang.g:3905:1: rule__SeffLoopAction__Group__4 : rule__SeffLoopAction__Group__4__Impl rule__SeffLoopAction__Group__5 ;
    public final void rule__SeffLoopAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3909:1: ( rule__SeffLoopAction__Group__4__Impl rule__SeffLoopAction__Group__5 )
            // InternalRepoLang.g:3910:2: rule__SeffLoopAction__Group__4__Impl rule__SeffLoopAction__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__SeffLoopAction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffLoopAction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffLoopAction__Group__4"


    // $ANTLR start "rule__SeffLoopAction__Group__4__Impl"
    // InternalRepoLang.g:3917:1: rule__SeffLoopAction__Group__4__Impl : ( ')' ) ;
    public final void rule__SeffLoopAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3921:1: ( ( ')' ) )
            // InternalRepoLang.g:3922:1: ( ')' )
            {
            // InternalRepoLang.g:3922:1: ( ')' )
            // InternalRepoLang.g:3923:2: ')'
            {
             before(grammarAccess.getSeffLoopActionAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSeffLoopActionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffLoopAction__Group__4__Impl"


    // $ANTLR start "rule__SeffLoopAction__Group__5"
    // InternalRepoLang.g:3932:1: rule__SeffLoopAction__Group__5 : rule__SeffLoopAction__Group__5__Impl ;
    public final void rule__SeffLoopAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3936:1: ( rule__SeffLoopAction__Group__5__Impl )
            // InternalRepoLang.g:3937:2: rule__SeffLoopAction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeffLoopAction__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffLoopAction__Group__5"


    // $ANTLR start "rule__SeffLoopAction__Group__5__Impl"
    // InternalRepoLang.g:3943:1: rule__SeffLoopAction__Group__5__Impl : ( ( rule__SeffLoopAction__ActionsAssignment_5 ) ) ;
    public final void rule__SeffLoopAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3947:1: ( ( ( rule__SeffLoopAction__ActionsAssignment_5 ) ) )
            // InternalRepoLang.g:3948:1: ( ( rule__SeffLoopAction__ActionsAssignment_5 ) )
            {
            // InternalRepoLang.g:3948:1: ( ( rule__SeffLoopAction__ActionsAssignment_5 ) )
            // InternalRepoLang.g:3949:2: ( rule__SeffLoopAction__ActionsAssignment_5 )
            {
             before(grammarAccess.getSeffLoopActionAccess().getActionsAssignment_5()); 
            // InternalRepoLang.g:3950:2: ( rule__SeffLoopAction__ActionsAssignment_5 )
            // InternalRepoLang.g:3950:3: rule__SeffLoopAction__ActionsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SeffLoopAction__ActionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSeffLoopActionAccess().getActionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffLoopAction__Group__5__Impl"


    // $ANTLR start "rule__SeffSetReturnAction__Group__0"
    // InternalRepoLang.g:3959:1: rule__SeffSetReturnAction__Group__0 : rule__SeffSetReturnAction__Group__0__Impl rule__SeffSetReturnAction__Group__1 ;
    public final void rule__SeffSetReturnAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3963:1: ( rule__SeffSetReturnAction__Group__0__Impl rule__SeffSetReturnAction__Group__1 )
            // InternalRepoLang.g:3964:2: rule__SeffSetReturnAction__Group__0__Impl rule__SeffSetReturnAction__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__SeffSetReturnAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffSetReturnAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffSetReturnAction__Group__0"


    // $ANTLR start "rule__SeffSetReturnAction__Group__0__Impl"
    // InternalRepoLang.g:3971:1: rule__SeffSetReturnAction__Group__0__Impl : ( 'RET' ) ;
    public final void rule__SeffSetReturnAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3975:1: ( ( 'RET' ) )
            // InternalRepoLang.g:3976:1: ( 'RET' )
            {
            // InternalRepoLang.g:3976:1: ( 'RET' )
            // InternalRepoLang.g:3977:2: 'RET'
            {
             before(grammarAccess.getSeffSetReturnActionAccess().getRETKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSeffSetReturnActionAccess().getRETKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffSetReturnAction__Group__0__Impl"


    // $ANTLR start "rule__SeffSetReturnAction__Group__1"
    // InternalRepoLang.g:3986:1: rule__SeffSetReturnAction__Group__1 : rule__SeffSetReturnAction__Group__1__Impl rule__SeffSetReturnAction__Group__2 ;
    public final void rule__SeffSetReturnAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:3990:1: ( rule__SeffSetReturnAction__Group__1__Impl rule__SeffSetReturnAction__Group__2 )
            // InternalRepoLang.g:3991:2: rule__SeffSetReturnAction__Group__1__Impl rule__SeffSetReturnAction__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__SeffSetReturnAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffSetReturnAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffSetReturnAction__Group__1"


    // $ANTLR start "rule__SeffSetReturnAction__Group__1__Impl"
    // InternalRepoLang.g:3998:1: rule__SeffSetReturnAction__Group__1__Impl : ( ( rule__SeffSetReturnAction__NameAssignment_1 )? ) ;
    public final void rule__SeffSetReturnAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4002:1: ( ( ( rule__SeffSetReturnAction__NameAssignment_1 )? ) )
            // InternalRepoLang.g:4003:1: ( ( rule__SeffSetReturnAction__NameAssignment_1 )? )
            {
            // InternalRepoLang.g:4003:1: ( ( rule__SeffSetReturnAction__NameAssignment_1 )? )
            // InternalRepoLang.g:4004:2: ( rule__SeffSetReturnAction__NameAssignment_1 )?
            {
             before(grammarAccess.getSeffSetReturnActionAccess().getNameAssignment_1()); 
            // InternalRepoLang.g:4005:2: ( rule__SeffSetReturnAction__NameAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRepoLang.g:4005:3: rule__SeffSetReturnAction__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SeffSetReturnAction__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSeffSetReturnActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffSetReturnAction__Group__1__Impl"


    // $ANTLR start "rule__SeffSetReturnAction__Group__2"
    // InternalRepoLang.g:4013:1: rule__SeffSetReturnAction__Group__2 : rule__SeffSetReturnAction__Group__2__Impl ;
    public final void rule__SeffSetReturnAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4017:1: ( rule__SeffSetReturnAction__Group__2__Impl )
            // InternalRepoLang.g:4018:2: rule__SeffSetReturnAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeffSetReturnAction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffSetReturnAction__Group__2"


    // $ANTLR start "rule__SeffSetReturnAction__Group__2__Impl"
    // InternalRepoLang.g:4024:1: rule__SeffSetReturnAction__Group__2__Impl : ( ( rule__SeffSetReturnAction__ReturnValueAssignment_2 ) ) ;
    public final void rule__SeffSetReturnAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4028:1: ( ( ( rule__SeffSetReturnAction__ReturnValueAssignment_2 ) ) )
            // InternalRepoLang.g:4029:1: ( ( rule__SeffSetReturnAction__ReturnValueAssignment_2 ) )
            {
            // InternalRepoLang.g:4029:1: ( ( rule__SeffSetReturnAction__ReturnValueAssignment_2 ) )
            // InternalRepoLang.g:4030:2: ( rule__SeffSetReturnAction__ReturnValueAssignment_2 )
            {
             before(grammarAccess.getSeffSetReturnActionAccess().getReturnValueAssignment_2()); 
            // InternalRepoLang.g:4031:2: ( rule__SeffSetReturnAction__ReturnValueAssignment_2 )
            // InternalRepoLang.g:4031:3: rule__SeffSetReturnAction__ReturnValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SeffSetReturnAction__ReturnValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSeffSetReturnActionAccess().getReturnValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffSetReturnAction__Group__2__Impl"


    // $ANTLR start "rule__SeffSetVariableAction__Group__0"
    // InternalRepoLang.g:4040:1: rule__SeffSetVariableAction__Group__0 : rule__SeffSetVariableAction__Group__0__Impl rule__SeffSetVariableAction__Group__1 ;
    public final void rule__SeffSetVariableAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4044:1: ( rule__SeffSetVariableAction__Group__0__Impl rule__SeffSetVariableAction__Group__1 )
            // InternalRepoLang.g:4045:2: rule__SeffSetVariableAction__Group__0__Impl rule__SeffSetVariableAction__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__SeffSetVariableAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffSetVariableAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffSetVariableAction__Group__0"


    // $ANTLR start "rule__SeffSetVariableAction__Group__0__Impl"
    // InternalRepoLang.g:4052:1: rule__SeffSetVariableAction__Group__0__Impl : ( 'SET' ) ;
    public final void rule__SeffSetVariableAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4056:1: ( ( 'SET' ) )
            // InternalRepoLang.g:4057:1: ( 'SET' )
            {
            // InternalRepoLang.g:4057:1: ( 'SET' )
            // InternalRepoLang.g:4058:2: 'SET'
            {
             before(grammarAccess.getSeffSetVariableActionAccess().getSETKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSeffSetVariableActionAccess().getSETKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffSetVariableAction__Group__0__Impl"


    // $ANTLR start "rule__SeffSetVariableAction__Group__1"
    // InternalRepoLang.g:4067:1: rule__SeffSetVariableAction__Group__1 : rule__SeffSetVariableAction__Group__1__Impl rule__SeffSetVariableAction__Group__2 ;
    public final void rule__SeffSetVariableAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4071:1: ( rule__SeffSetVariableAction__Group__1__Impl rule__SeffSetVariableAction__Group__2 )
            // InternalRepoLang.g:4072:2: rule__SeffSetVariableAction__Group__1__Impl rule__SeffSetVariableAction__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__SeffSetVariableAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffSetVariableAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffSetVariableAction__Group__1"


    // $ANTLR start "rule__SeffSetVariableAction__Group__1__Impl"
    // InternalRepoLang.g:4079:1: rule__SeffSetVariableAction__Group__1__Impl : ( ( rule__SeffSetVariableAction__NameAssignment_1 )? ) ;
    public final void rule__SeffSetVariableAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4083:1: ( ( ( rule__SeffSetVariableAction__NameAssignment_1 )? ) )
            // InternalRepoLang.g:4084:1: ( ( rule__SeffSetVariableAction__NameAssignment_1 )? )
            {
            // InternalRepoLang.g:4084:1: ( ( rule__SeffSetVariableAction__NameAssignment_1 )? )
            // InternalRepoLang.g:4085:2: ( rule__SeffSetVariableAction__NameAssignment_1 )?
            {
             before(grammarAccess.getSeffSetVariableActionAccess().getNameAssignment_1()); 
            // InternalRepoLang.g:4086:2: ( rule__SeffSetVariableAction__NameAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRepoLang.g:4086:3: rule__SeffSetVariableAction__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SeffSetVariableAction__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSeffSetVariableActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffSetVariableAction__Group__1__Impl"


    // $ANTLR start "rule__SeffSetVariableAction__Group__2"
    // InternalRepoLang.g:4094:1: rule__SeffSetVariableAction__Group__2 : rule__SeffSetVariableAction__Group__2__Impl ;
    public final void rule__SeffSetVariableAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4098:1: ( rule__SeffSetVariableAction__Group__2__Impl )
            // InternalRepoLang.g:4099:2: rule__SeffSetVariableAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeffSetVariableAction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffSetVariableAction__Group__2"


    // $ANTLR start "rule__SeffSetVariableAction__Group__2__Impl"
    // InternalRepoLang.g:4105:1: rule__SeffSetVariableAction__Group__2__Impl : ( ( ( rule__SeffSetVariableAction__SetValuesAssignment_2 ) ) ( ( rule__SeffSetVariableAction__SetValuesAssignment_2 )* ) ) ;
    public final void rule__SeffSetVariableAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4109:1: ( ( ( ( rule__SeffSetVariableAction__SetValuesAssignment_2 ) ) ( ( rule__SeffSetVariableAction__SetValuesAssignment_2 )* ) ) )
            // InternalRepoLang.g:4110:1: ( ( ( rule__SeffSetVariableAction__SetValuesAssignment_2 ) ) ( ( rule__SeffSetVariableAction__SetValuesAssignment_2 )* ) )
            {
            // InternalRepoLang.g:4110:1: ( ( ( rule__SeffSetVariableAction__SetValuesAssignment_2 ) ) ( ( rule__SeffSetVariableAction__SetValuesAssignment_2 )* ) )
            // InternalRepoLang.g:4111:2: ( ( rule__SeffSetVariableAction__SetValuesAssignment_2 ) ) ( ( rule__SeffSetVariableAction__SetValuesAssignment_2 )* )
            {
            // InternalRepoLang.g:4111:2: ( ( rule__SeffSetVariableAction__SetValuesAssignment_2 ) )
            // InternalRepoLang.g:4112:3: ( rule__SeffSetVariableAction__SetValuesAssignment_2 )
            {
             before(grammarAccess.getSeffSetVariableActionAccess().getSetValuesAssignment_2()); 
            // InternalRepoLang.g:4113:3: ( rule__SeffSetVariableAction__SetValuesAssignment_2 )
            // InternalRepoLang.g:4113:4: rule__SeffSetVariableAction__SetValuesAssignment_2
            {
            pushFollow(FOLLOW_36);
            rule__SeffSetVariableAction__SetValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSeffSetVariableActionAccess().getSetValuesAssignment_2()); 

            }

            // InternalRepoLang.g:4116:2: ( ( rule__SeffSetVariableAction__SetValuesAssignment_2 )* )
            // InternalRepoLang.g:4117:3: ( rule__SeffSetVariableAction__SetValuesAssignment_2 )*
            {
             before(grammarAccess.getSeffSetVariableActionAccess().getSetValuesAssignment_2()); 
            // InternalRepoLang.g:4118:3: ( rule__SeffSetVariableAction__SetValuesAssignment_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_STRING) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalRepoLang.g:4118:4: rule__SeffSetVariableAction__SetValuesAssignment_2
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__SeffSetVariableAction__SetValuesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getSeffSetVariableActionAccess().getSetValuesAssignment_2()); 

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
    // $ANTLR end "rule__SeffSetVariableAction__Group__2__Impl"


    // $ANTLR start "rule__SeffExternalCallAction__Group__0"
    // InternalRepoLang.g:4128:1: rule__SeffExternalCallAction__Group__0 : rule__SeffExternalCallAction__Group__0__Impl rule__SeffExternalCallAction__Group__1 ;
    public final void rule__SeffExternalCallAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4132:1: ( rule__SeffExternalCallAction__Group__0__Impl rule__SeffExternalCallAction__Group__1 )
            // InternalRepoLang.g:4133:2: rule__SeffExternalCallAction__Group__0__Impl rule__SeffExternalCallAction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SeffExternalCallAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffExternalCallAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group__0"


    // $ANTLR start "rule__SeffExternalCallAction__Group__0__Impl"
    // InternalRepoLang.g:4140:1: rule__SeffExternalCallAction__Group__0__Impl : ( 'EXT' ) ;
    public final void rule__SeffExternalCallAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4144:1: ( ( 'EXT' ) )
            // InternalRepoLang.g:4145:1: ( 'EXT' )
            {
            // InternalRepoLang.g:4145:1: ( 'EXT' )
            // InternalRepoLang.g:4146:2: 'EXT'
            {
             before(grammarAccess.getSeffExternalCallActionAccess().getEXTKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSeffExternalCallActionAccess().getEXTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group__0__Impl"


    // $ANTLR start "rule__SeffExternalCallAction__Group__1"
    // InternalRepoLang.g:4155:1: rule__SeffExternalCallAction__Group__1 : rule__SeffExternalCallAction__Group__1__Impl rule__SeffExternalCallAction__Group__2 ;
    public final void rule__SeffExternalCallAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4159:1: ( rule__SeffExternalCallAction__Group__1__Impl rule__SeffExternalCallAction__Group__2 )
            // InternalRepoLang.g:4160:2: rule__SeffExternalCallAction__Group__1__Impl rule__SeffExternalCallAction__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SeffExternalCallAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffExternalCallAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group__1"


    // $ANTLR start "rule__SeffExternalCallAction__Group__1__Impl"
    // InternalRepoLang.g:4167:1: rule__SeffExternalCallAction__Group__1__Impl : ( ( rule__SeffExternalCallAction__NameAssignment_1 )? ) ;
    public final void rule__SeffExternalCallAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4171:1: ( ( ( rule__SeffExternalCallAction__NameAssignment_1 )? ) )
            // InternalRepoLang.g:4172:1: ( ( rule__SeffExternalCallAction__NameAssignment_1 )? )
            {
            // InternalRepoLang.g:4172:1: ( ( rule__SeffExternalCallAction__NameAssignment_1 )? )
            // InternalRepoLang.g:4173:2: ( rule__SeffExternalCallAction__NameAssignment_1 )?
            {
             before(grammarAccess.getSeffExternalCallActionAccess().getNameAssignment_1()); 
            // InternalRepoLang.g:4174:2: ( rule__SeffExternalCallAction__NameAssignment_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==RULE_ID) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // InternalRepoLang.g:4174:3: rule__SeffExternalCallAction__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SeffExternalCallAction__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSeffExternalCallActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group__1__Impl"


    // $ANTLR start "rule__SeffExternalCallAction__Group__2"
    // InternalRepoLang.g:4182:1: rule__SeffExternalCallAction__Group__2 : rule__SeffExternalCallAction__Group__2__Impl rule__SeffExternalCallAction__Group__3 ;
    public final void rule__SeffExternalCallAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4186:1: ( rule__SeffExternalCallAction__Group__2__Impl rule__SeffExternalCallAction__Group__3 )
            // InternalRepoLang.g:4187:2: rule__SeffExternalCallAction__Group__2__Impl rule__SeffExternalCallAction__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__SeffExternalCallAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffExternalCallAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group__2"


    // $ANTLR start "rule__SeffExternalCallAction__Group__2__Impl"
    // InternalRepoLang.g:4194:1: rule__SeffExternalCallAction__Group__2__Impl : ( ( rule__SeffExternalCallAction__Group_2__0 )? ) ;
    public final void rule__SeffExternalCallAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4198:1: ( ( ( rule__SeffExternalCallAction__Group_2__0 )? ) )
            // InternalRepoLang.g:4199:1: ( ( rule__SeffExternalCallAction__Group_2__0 )? )
            {
            // InternalRepoLang.g:4199:1: ( ( rule__SeffExternalCallAction__Group_2__0 )? )
            // InternalRepoLang.g:4200:2: ( rule__SeffExternalCallAction__Group_2__0 )?
            {
             before(grammarAccess.getSeffExternalCallActionAccess().getGroup_2()); 
            // InternalRepoLang.g:4201:2: ( rule__SeffExternalCallAction__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==45) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalRepoLang.g:4201:3: rule__SeffExternalCallAction__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SeffExternalCallAction__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSeffExternalCallActionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group__2__Impl"


    // $ANTLR start "rule__SeffExternalCallAction__Group__3"
    // InternalRepoLang.g:4209:1: rule__SeffExternalCallAction__Group__3 : rule__SeffExternalCallAction__Group__3__Impl rule__SeffExternalCallAction__Group__4 ;
    public final void rule__SeffExternalCallAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4213:1: ( rule__SeffExternalCallAction__Group__3__Impl rule__SeffExternalCallAction__Group__4 )
            // InternalRepoLang.g:4214:2: rule__SeffExternalCallAction__Group__3__Impl rule__SeffExternalCallAction__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__SeffExternalCallAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffExternalCallAction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group__3"


    // $ANTLR start "rule__SeffExternalCallAction__Group__3__Impl"
    // InternalRepoLang.g:4221:1: rule__SeffExternalCallAction__Group__3__Impl : ( ( rule__SeffExternalCallAction__CalledAssignment_3 ) ) ;
    public final void rule__SeffExternalCallAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4225:1: ( ( ( rule__SeffExternalCallAction__CalledAssignment_3 ) ) )
            // InternalRepoLang.g:4226:1: ( ( rule__SeffExternalCallAction__CalledAssignment_3 ) )
            {
            // InternalRepoLang.g:4226:1: ( ( rule__SeffExternalCallAction__CalledAssignment_3 ) )
            // InternalRepoLang.g:4227:2: ( rule__SeffExternalCallAction__CalledAssignment_3 )
            {
             before(grammarAccess.getSeffExternalCallActionAccess().getCalledAssignment_3()); 
            // InternalRepoLang.g:4228:2: ( rule__SeffExternalCallAction__CalledAssignment_3 )
            // InternalRepoLang.g:4228:3: rule__SeffExternalCallAction__CalledAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SeffExternalCallAction__CalledAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSeffExternalCallActionAccess().getCalledAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group__3__Impl"


    // $ANTLR start "rule__SeffExternalCallAction__Group__4"
    // InternalRepoLang.g:4236:1: rule__SeffExternalCallAction__Group__4 : rule__SeffExternalCallAction__Group__4__Impl ;
    public final void rule__SeffExternalCallAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4240:1: ( rule__SeffExternalCallAction__Group__4__Impl )
            // InternalRepoLang.g:4241:2: rule__SeffExternalCallAction__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeffExternalCallAction__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group__4"


    // $ANTLR start "rule__SeffExternalCallAction__Group__4__Impl"
    // InternalRepoLang.g:4247:1: rule__SeffExternalCallAction__Group__4__Impl : ( ( rule__SeffExternalCallAction__Group_4__0 )? ) ;
    public final void rule__SeffExternalCallAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4251:1: ( ( ( rule__SeffExternalCallAction__Group_4__0 )? ) )
            // InternalRepoLang.g:4252:1: ( ( rule__SeffExternalCallAction__Group_4__0 )? )
            {
            // InternalRepoLang.g:4252:1: ( ( rule__SeffExternalCallAction__Group_4__0 )? )
            // InternalRepoLang.g:4253:2: ( rule__SeffExternalCallAction__Group_4__0 )?
            {
             before(grammarAccess.getSeffExternalCallActionAccess().getGroup_4()); 
            // InternalRepoLang.g:4254:2: ( rule__SeffExternalCallAction__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==20) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRepoLang.g:4254:3: rule__SeffExternalCallAction__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SeffExternalCallAction__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSeffExternalCallActionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group__4__Impl"


    // $ANTLR start "rule__SeffExternalCallAction__Group_2__0"
    // InternalRepoLang.g:4263:1: rule__SeffExternalCallAction__Group_2__0 : rule__SeffExternalCallAction__Group_2__0__Impl rule__SeffExternalCallAction__Group_2__1 ;
    public final void rule__SeffExternalCallAction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4267:1: ( rule__SeffExternalCallAction__Group_2__0__Impl rule__SeffExternalCallAction__Group_2__1 )
            // InternalRepoLang.g:4268:2: rule__SeffExternalCallAction__Group_2__0__Impl rule__SeffExternalCallAction__Group_2__1
            {
            pushFollow(FOLLOW_37);
            rule__SeffExternalCallAction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffExternalCallAction__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group_2__0"


    // $ANTLR start "rule__SeffExternalCallAction__Group_2__0__Impl"
    // InternalRepoLang.g:4275:1: rule__SeffExternalCallAction__Group_2__0__Impl : ( ( rule__SeffExternalCallAction__RoleAssignment_2_0 ) ) ;
    public final void rule__SeffExternalCallAction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4279:1: ( ( ( rule__SeffExternalCallAction__RoleAssignment_2_0 ) ) )
            // InternalRepoLang.g:4280:1: ( ( rule__SeffExternalCallAction__RoleAssignment_2_0 ) )
            {
            // InternalRepoLang.g:4280:1: ( ( rule__SeffExternalCallAction__RoleAssignment_2_0 ) )
            // InternalRepoLang.g:4281:2: ( rule__SeffExternalCallAction__RoleAssignment_2_0 )
            {
             before(grammarAccess.getSeffExternalCallActionAccess().getRoleAssignment_2_0()); 
            // InternalRepoLang.g:4282:2: ( rule__SeffExternalCallAction__RoleAssignment_2_0 )
            // InternalRepoLang.g:4282:3: rule__SeffExternalCallAction__RoleAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__SeffExternalCallAction__RoleAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSeffExternalCallActionAccess().getRoleAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group_2__0__Impl"


    // $ANTLR start "rule__SeffExternalCallAction__Group_2__1"
    // InternalRepoLang.g:4290:1: rule__SeffExternalCallAction__Group_2__1 : rule__SeffExternalCallAction__Group_2__1__Impl ;
    public final void rule__SeffExternalCallAction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4294:1: ( rule__SeffExternalCallAction__Group_2__1__Impl )
            // InternalRepoLang.g:4295:2: rule__SeffExternalCallAction__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeffExternalCallAction__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group_2__1"


    // $ANTLR start "rule__SeffExternalCallAction__Group_2__1__Impl"
    // InternalRepoLang.g:4301:1: rule__SeffExternalCallAction__Group_2__1__Impl : ( '->' ) ;
    public final void rule__SeffExternalCallAction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4305:1: ( ( '->' ) )
            // InternalRepoLang.g:4306:1: ( '->' )
            {
            // InternalRepoLang.g:4306:1: ( '->' )
            // InternalRepoLang.g:4307:2: '->'
            {
             before(grammarAccess.getSeffExternalCallActionAccess().getHyphenMinusGreaterThanSignKeyword_2_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSeffExternalCallActionAccess().getHyphenMinusGreaterThanSignKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group_2__1__Impl"


    // $ANTLR start "rule__SeffExternalCallAction__Group_4__0"
    // InternalRepoLang.g:4317:1: rule__SeffExternalCallAction__Group_4__0 : rule__SeffExternalCallAction__Group_4__0__Impl rule__SeffExternalCallAction__Group_4__1 ;
    public final void rule__SeffExternalCallAction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4321:1: ( rule__SeffExternalCallAction__Group_4__0__Impl rule__SeffExternalCallAction__Group_4__1 )
            // InternalRepoLang.g:4322:2: rule__SeffExternalCallAction__Group_4__0__Impl rule__SeffExternalCallAction__Group_4__1
            {
            pushFollow(FOLLOW_35);
            rule__SeffExternalCallAction__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffExternalCallAction__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group_4__0"


    // $ANTLR start "rule__SeffExternalCallAction__Group_4__0__Impl"
    // InternalRepoLang.g:4329:1: rule__SeffExternalCallAction__Group_4__0__Impl : ( '{' ) ;
    public final void rule__SeffExternalCallAction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4333:1: ( ( '{' ) )
            // InternalRepoLang.g:4334:1: ( '{' )
            {
            // InternalRepoLang.g:4334:1: ( '{' )
            // InternalRepoLang.g:4335:2: '{'
            {
             before(grammarAccess.getSeffExternalCallActionAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSeffExternalCallActionAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group_4__0__Impl"


    // $ANTLR start "rule__SeffExternalCallAction__Group_4__1"
    // InternalRepoLang.g:4344:1: rule__SeffExternalCallAction__Group_4__1 : rule__SeffExternalCallAction__Group_4__1__Impl rule__SeffExternalCallAction__Group_4__2 ;
    public final void rule__SeffExternalCallAction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4348:1: ( rule__SeffExternalCallAction__Group_4__1__Impl rule__SeffExternalCallAction__Group_4__2 )
            // InternalRepoLang.g:4349:2: rule__SeffExternalCallAction__Group_4__1__Impl rule__SeffExternalCallAction__Group_4__2
            {
            pushFollow(FOLLOW_38);
            rule__SeffExternalCallAction__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffExternalCallAction__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group_4__1"


    // $ANTLR start "rule__SeffExternalCallAction__Group_4__1__Impl"
    // InternalRepoLang.g:4356:1: rule__SeffExternalCallAction__Group_4__1__Impl : ( ( ( rule__SeffExternalCallAction__BindingsAssignment_4_1 ) ) ( ( rule__SeffExternalCallAction__BindingsAssignment_4_1 )* ) ) ;
    public final void rule__SeffExternalCallAction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4360:1: ( ( ( ( rule__SeffExternalCallAction__BindingsAssignment_4_1 ) ) ( ( rule__SeffExternalCallAction__BindingsAssignment_4_1 )* ) ) )
            // InternalRepoLang.g:4361:1: ( ( ( rule__SeffExternalCallAction__BindingsAssignment_4_1 ) ) ( ( rule__SeffExternalCallAction__BindingsAssignment_4_1 )* ) )
            {
            // InternalRepoLang.g:4361:1: ( ( ( rule__SeffExternalCallAction__BindingsAssignment_4_1 ) ) ( ( rule__SeffExternalCallAction__BindingsAssignment_4_1 )* ) )
            // InternalRepoLang.g:4362:2: ( ( rule__SeffExternalCallAction__BindingsAssignment_4_1 ) ) ( ( rule__SeffExternalCallAction__BindingsAssignment_4_1 )* )
            {
            // InternalRepoLang.g:4362:2: ( ( rule__SeffExternalCallAction__BindingsAssignment_4_1 ) )
            // InternalRepoLang.g:4363:3: ( rule__SeffExternalCallAction__BindingsAssignment_4_1 )
            {
             before(grammarAccess.getSeffExternalCallActionAccess().getBindingsAssignment_4_1()); 
            // InternalRepoLang.g:4364:3: ( rule__SeffExternalCallAction__BindingsAssignment_4_1 )
            // InternalRepoLang.g:4364:4: rule__SeffExternalCallAction__BindingsAssignment_4_1
            {
            pushFollow(FOLLOW_36);
            rule__SeffExternalCallAction__BindingsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSeffExternalCallActionAccess().getBindingsAssignment_4_1()); 

            }

            // InternalRepoLang.g:4367:2: ( ( rule__SeffExternalCallAction__BindingsAssignment_4_1 )* )
            // InternalRepoLang.g:4368:3: ( rule__SeffExternalCallAction__BindingsAssignment_4_1 )*
            {
             before(grammarAccess.getSeffExternalCallActionAccess().getBindingsAssignment_4_1()); 
            // InternalRepoLang.g:4369:3: ( rule__SeffExternalCallAction__BindingsAssignment_4_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID||LA39_0==RULE_STRING) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalRepoLang.g:4369:4: rule__SeffExternalCallAction__BindingsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__SeffExternalCallAction__BindingsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getSeffExternalCallActionAccess().getBindingsAssignment_4_1()); 

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
    // $ANTLR end "rule__SeffExternalCallAction__Group_4__1__Impl"


    // $ANTLR start "rule__SeffExternalCallAction__Group_4__2"
    // InternalRepoLang.g:4378:1: rule__SeffExternalCallAction__Group_4__2 : rule__SeffExternalCallAction__Group_4__2__Impl rule__SeffExternalCallAction__Group_4__3 ;
    public final void rule__SeffExternalCallAction__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4382:1: ( rule__SeffExternalCallAction__Group_4__2__Impl rule__SeffExternalCallAction__Group_4__3 )
            // InternalRepoLang.g:4383:2: rule__SeffExternalCallAction__Group_4__2__Impl rule__SeffExternalCallAction__Group_4__3
            {
            pushFollow(FOLLOW_38);
            rule__SeffExternalCallAction__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffExternalCallAction__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group_4__2"


    // $ANTLR start "rule__SeffExternalCallAction__Group_4__2__Impl"
    // InternalRepoLang.g:4390:1: rule__SeffExternalCallAction__Group_4__2__Impl : ( ( rule__SeffExternalCallAction__Group_4_2__0 )? ) ;
    public final void rule__SeffExternalCallAction__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4394:1: ( ( ( rule__SeffExternalCallAction__Group_4_2__0 )? ) )
            // InternalRepoLang.g:4395:1: ( ( rule__SeffExternalCallAction__Group_4_2__0 )? )
            {
            // InternalRepoLang.g:4395:1: ( ( rule__SeffExternalCallAction__Group_4_2__0 )? )
            // InternalRepoLang.g:4396:2: ( rule__SeffExternalCallAction__Group_4_2__0 )?
            {
             before(grammarAccess.getSeffExternalCallActionAccess().getGroup_4_2()); 
            // InternalRepoLang.g:4397:2: ( rule__SeffExternalCallAction__Group_4_2__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRepoLang.g:4397:3: rule__SeffExternalCallAction__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SeffExternalCallAction__Group_4_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSeffExternalCallActionAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group_4__2__Impl"


    // $ANTLR start "rule__SeffExternalCallAction__Group_4__3"
    // InternalRepoLang.g:4405:1: rule__SeffExternalCallAction__Group_4__3 : rule__SeffExternalCallAction__Group_4__3__Impl ;
    public final void rule__SeffExternalCallAction__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4409:1: ( rule__SeffExternalCallAction__Group_4__3__Impl )
            // InternalRepoLang.g:4410:2: rule__SeffExternalCallAction__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeffExternalCallAction__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group_4__3"


    // $ANTLR start "rule__SeffExternalCallAction__Group_4__3__Impl"
    // InternalRepoLang.g:4416:1: rule__SeffExternalCallAction__Group_4__3__Impl : ( '}' ) ;
    public final void rule__SeffExternalCallAction__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4420:1: ( ( '}' ) )
            // InternalRepoLang.g:4421:1: ( '}' )
            {
            // InternalRepoLang.g:4421:1: ( '}' )
            // InternalRepoLang.g:4422:2: '}'
            {
             before(grammarAccess.getSeffExternalCallActionAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSeffExternalCallActionAccess().getRightCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group_4__3__Impl"


    // $ANTLR start "rule__SeffExternalCallAction__Group_4_2__0"
    // InternalRepoLang.g:4432:1: rule__SeffExternalCallAction__Group_4_2__0 : rule__SeffExternalCallAction__Group_4_2__0__Impl rule__SeffExternalCallAction__Group_4_2__1 ;
    public final void rule__SeffExternalCallAction__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4436:1: ( rule__SeffExternalCallAction__Group_4_2__0__Impl rule__SeffExternalCallAction__Group_4_2__1 )
            // InternalRepoLang.g:4437:2: rule__SeffExternalCallAction__Group_4_2__0__Impl rule__SeffExternalCallAction__Group_4_2__1
            {
            pushFollow(FOLLOW_35);
            rule__SeffExternalCallAction__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffExternalCallAction__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group_4_2__0"


    // $ANTLR start "rule__SeffExternalCallAction__Group_4_2__0__Impl"
    // InternalRepoLang.g:4444:1: rule__SeffExternalCallAction__Group_4_2__0__Impl : ( 'RETURN:' ) ;
    public final void rule__SeffExternalCallAction__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4448:1: ( ( 'RETURN:' ) )
            // InternalRepoLang.g:4449:1: ( 'RETURN:' )
            {
            // InternalRepoLang.g:4449:1: ( 'RETURN:' )
            // InternalRepoLang.g:4450:2: 'RETURN:'
            {
             before(grammarAccess.getSeffExternalCallActionAccess().getRETURNKeyword_4_2_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSeffExternalCallActionAccess().getRETURNKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group_4_2__0__Impl"


    // $ANTLR start "rule__SeffExternalCallAction__Group_4_2__1"
    // InternalRepoLang.g:4459:1: rule__SeffExternalCallAction__Group_4_2__1 : rule__SeffExternalCallAction__Group_4_2__1__Impl ;
    public final void rule__SeffExternalCallAction__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4463:1: ( rule__SeffExternalCallAction__Group_4_2__1__Impl )
            // InternalRepoLang.g:4464:2: rule__SeffExternalCallAction__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeffExternalCallAction__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__Group_4_2__1"


    // $ANTLR start "rule__SeffExternalCallAction__Group_4_2__1__Impl"
    // InternalRepoLang.g:4470:1: rule__SeffExternalCallAction__Group_4_2__1__Impl : ( ( ( rule__SeffExternalCallAction__ReturningAssignment_4_2_1 ) ) ( ( rule__SeffExternalCallAction__ReturningAssignment_4_2_1 )* ) ) ;
    public final void rule__SeffExternalCallAction__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4474:1: ( ( ( ( rule__SeffExternalCallAction__ReturningAssignment_4_2_1 ) ) ( ( rule__SeffExternalCallAction__ReturningAssignment_4_2_1 )* ) ) )
            // InternalRepoLang.g:4475:1: ( ( ( rule__SeffExternalCallAction__ReturningAssignment_4_2_1 ) ) ( ( rule__SeffExternalCallAction__ReturningAssignment_4_2_1 )* ) )
            {
            // InternalRepoLang.g:4475:1: ( ( ( rule__SeffExternalCallAction__ReturningAssignment_4_2_1 ) ) ( ( rule__SeffExternalCallAction__ReturningAssignment_4_2_1 )* ) )
            // InternalRepoLang.g:4476:2: ( ( rule__SeffExternalCallAction__ReturningAssignment_4_2_1 ) ) ( ( rule__SeffExternalCallAction__ReturningAssignment_4_2_1 )* )
            {
            // InternalRepoLang.g:4476:2: ( ( rule__SeffExternalCallAction__ReturningAssignment_4_2_1 ) )
            // InternalRepoLang.g:4477:3: ( rule__SeffExternalCallAction__ReturningAssignment_4_2_1 )
            {
             before(grammarAccess.getSeffExternalCallActionAccess().getReturningAssignment_4_2_1()); 
            // InternalRepoLang.g:4478:3: ( rule__SeffExternalCallAction__ReturningAssignment_4_2_1 )
            // InternalRepoLang.g:4478:4: rule__SeffExternalCallAction__ReturningAssignment_4_2_1
            {
            pushFollow(FOLLOW_36);
            rule__SeffExternalCallAction__ReturningAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSeffExternalCallActionAccess().getReturningAssignment_4_2_1()); 

            }

            // InternalRepoLang.g:4481:2: ( ( rule__SeffExternalCallAction__ReturningAssignment_4_2_1 )* )
            // InternalRepoLang.g:4482:3: ( rule__SeffExternalCallAction__ReturningAssignment_4_2_1 )*
            {
             before(grammarAccess.getSeffExternalCallActionAccess().getReturningAssignment_4_2_1()); 
            // InternalRepoLang.g:4483:3: ( rule__SeffExternalCallAction__ReturningAssignment_4_2_1 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_STRING) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalRepoLang.g:4483:4: rule__SeffExternalCallAction__ReturningAssignment_4_2_1
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__SeffExternalCallAction__ReturningAssignment_4_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getSeffExternalCallActionAccess().getReturningAssignment_4_2_1()); 

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
    // $ANTLR end "rule__SeffExternalCallAction__Group_4_2__1__Impl"


    // $ANTLR start "rule__SeffCallParameter__Group__0"
    // InternalRepoLang.g:4493:1: rule__SeffCallParameter__Group__0 : rule__SeffCallParameter__Group__0__Impl rule__SeffCallParameter__Group__1 ;
    public final void rule__SeffCallParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4497:1: ( rule__SeffCallParameter__Group__0__Impl rule__SeffCallParameter__Group__1 )
            // InternalRepoLang.g:4498:2: rule__SeffCallParameter__Group__0__Impl rule__SeffCallParameter__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__SeffCallParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffCallParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffCallParameter__Group__0"


    // $ANTLR start "rule__SeffCallParameter__Group__0__Impl"
    // InternalRepoLang.g:4505:1: rule__SeffCallParameter__Group__0__Impl : ( ( rule__SeffCallParameter__Alternatives_0 ) ) ;
    public final void rule__SeffCallParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4509:1: ( ( ( rule__SeffCallParameter__Alternatives_0 ) ) )
            // InternalRepoLang.g:4510:1: ( ( rule__SeffCallParameter__Alternatives_0 ) )
            {
            // InternalRepoLang.g:4510:1: ( ( rule__SeffCallParameter__Alternatives_0 ) )
            // InternalRepoLang.g:4511:2: ( rule__SeffCallParameter__Alternatives_0 )
            {
             before(grammarAccess.getSeffCallParameterAccess().getAlternatives_0()); 
            // InternalRepoLang.g:4512:2: ( rule__SeffCallParameter__Alternatives_0 )
            // InternalRepoLang.g:4512:3: rule__SeffCallParameter__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__SeffCallParameter__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSeffCallParameterAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffCallParameter__Group__0__Impl"


    // $ANTLR start "rule__SeffCallParameter__Group__1"
    // InternalRepoLang.g:4520:1: rule__SeffCallParameter__Group__1 : rule__SeffCallParameter__Group__1__Impl rule__SeffCallParameter__Group__2 ;
    public final void rule__SeffCallParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4524:1: ( rule__SeffCallParameter__Group__1__Impl rule__SeffCallParameter__Group__2 )
            // InternalRepoLang.g:4525:2: rule__SeffCallParameter__Group__1__Impl rule__SeffCallParameter__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__SeffCallParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffCallParameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffCallParameter__Group__1"


    // $ANTLR start "rule__SeffCallParameter__Group__1__Impl"
    // InternalRepoLang.g:4532:1: rule__SeffCallParameter__Group__1__Impl : ( '(' ) ;
    public final void rule__SeffCallParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4536:1: ( ( '(' ) )
            // InternalRepoLang.g:4537:1: ( '(' )
            {
            // InternalRepoLang.g:4537:1: ( '(' )
            // InternalRepoLang.g:4538:2: '('
            {
             before(grammarAccess.getSeffCallParameterAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSeffCallParameterAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffCallParameter__Group__1__Impl"


    // $ANTLR start "rule__SeffCallParameter__Group__2"
    // InternalRepoLang.g:4547:1: rule__SeffCallParameter__Group__2 : rule__SeffCallParameter__Group__2__Impl rule__SeffCallParameter__Group__3 ;
    public final void rule__SeffCallParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4551:1: ( rule__SeffCallParameter__Group__2__Impl rule__SeffCallParameter__Group__3 )
            // InternalRepoLang.g:4552:2: rule__SeffCallParameter__Group__2__Impl rule__SeffCallParameter__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__SeffCallParameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffCallParameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffCallParameter__Group__2"


    // $ANTLR start "rule__SeffCallParameter__Group__2__Impl"
    // InternalRepoLang.g:4559:1: rule__SeffCallParameter__Group__2__Impl : ( ( ( rule__SeffCallParameter__ValuesAssignment_2 ) ) ( ( rule__SeffCallParameter__ValuesAssignment_2 )* ) ) ;
    public final void rule__SeffCallParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4563:1: ( ( ( ( rule__SeffCallParameter__ValuesAssignment_2 ) ) ( ( rule__SeffCallParameter__ValuesAssignment_2 )* ) ) )
            // InternalRepoLang.g:4564:1: ( ( ( rule__SeffCallParameter__ValuesAssignment_2 ) ) ( ( rule__SeffCallParameter__ValuesAssignment_2 )* ) )
            {
            // InternalRepoLang.g:4564:1: ( ( ( rule__SeffCallParameter__ValuesAssignment_2 ) ) ( ( rule__SeffCallParameter__ValuesAssignment_2 )* ) )
            // InternalRepoLang.g:4565:2: ( ( rule__SeffCallParameter__ValuesAssignment_2 ) ) ( ( rule__SeffCallParameter__ValuesAssignment_2 )* )
            {
            // InternalRepoLang.g:4565:2: ( ( rule__SeffCallParameter__ValuesAssignment_2 ) )
            // InternalRepoLang.g:4566:3: ( rule__SeffCallParameter__ValuesAssignment_2 )
            {
             before(grammarAccess.getSeffCallParameterAccess().getValuesAssignment_2()); 
            // InternalRepoLang.g:4567:3: ( rule__SeffCallParameter__ValuesAssignment_2 )
            // InternalRepoLang.g:4567:4: rule__SeffCallParameter__ValuesAssignment_2
            {
            pushFollow(FOLLOW_40);
            rule__SeffCallParameter__ValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSeffCallParameterAccess().getValuesAssignment_2()); 

            }

            // InternalRepoLang.g:4570:2: ( ( rule__SeffCallParameter__ValuesAssignment_2 )* )
            // InternalRepoLang.g:4571:3: ( rule__SeffCallParameter__ValuesAssignment_2 )*
            {
             before(grammarAccess.getSeffCallParameterAccess().getValuesAssignment_2()); 
            // InternalRepoLang.g:4572:3: ( rule__SeffCallParameter__ValuesAssignment_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=11 && LA42_0<=15)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalRepoLang.g:4572:4: rule__SeffCallParameter__ValuesAssignment_2
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__SeffCallParameter__ValuesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getSeffCallParameterAccess().getValuesAssignment_2()); 

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
    // $ANTLR end "rule__SeffCallParameter__Group__2__Impl"


    // $ANTLR start "rule__SeffCallParameter__Group__3"
    // InternalRepoLang.g:4581:1: rule__SeffCallParameter__Group__3 : rule__SeffCallParameter__Group__3__Impl ;
    public final void rule__SeffCallParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4585:1: ( rule__SeffCallParameter__Group__3__Impl )
            // InternalRepoLang.g:4586:2: rule__SeffCallParameter__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeffCallParameter__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffCallParameter__Group__3"


    // $ANTLR start "rule__SeffCallParameter__Group__3__Impl"
    // InternalRepoLang.g:4592:1: rule__SeffCallParameter__Group__3__Impl : ( ')' ) ;
    public final void rule__SeffCallParameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4596:1: ( ( ')' ) )
            // InternalRepoLang.g:4597:1: ( ')' )
            {
            // InternalRepoLang.g:4597:1: ( ')' )
            // InternalRepoLang.g:4598:2: ')'
            {
             before(grammarAccess.getSeffCallParameterAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSeffCallParameterAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffCallParameter__Group__3__Impl"


    // $ANTLR start "rule__SeffReferenceParameter__Group__0"
    // InternalRepoLang.g:4608:1: rule__SeffReferenceParameter__Group__0 : rule__SeffReferenceParameter__Group__0__Impl rule__SeffReferenceParameter__Group__1 ;
    public final void rule__SeffReferenceParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4612:1: ( rule__SeffReferenceParameter__Group__0__Impl rule__SeffReferenceParameter__Group__1 )
            // InternalRepoLang.g:4613:2: rule__SeffReferenceParameter__Group__0__Impl rule__SeffReferenceParameter__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__SeffReferenceParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffReferenceParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReferenceParameter__Group__0"


    // $ANTLR start "rule__SeffReferenceParameter__Group__0__Impl"
    // InternalRepoLang.g:4620:1: rule__SeffReferenceParameter__Group__0__Impl : ( ( rule__SeffReferenceParameter__ReferenceNameAssignment_0 ) ) ;
    public final void rule__SeffReferenceParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4624:1: ( ( ( rule__SeffReferenceParameter__ReferenceNameAssignment_0 ) ) )
            // InternalRepoLang.g:4625:1: ( ( rule__SeffReferenceParameter__ReferenceNameAssignment_0 ) )
            {
            // InternalRepoLang.g:4625:1: ( ( rule__SeffReferenceParameter__ReferenceNameAssignment_0 ) )
            // InternalRepoLang.g:4626:2: ( rule__SeffReferenceParameter__ReferenceNameAssignment_0 )
            {
             before(grammarAccess.getSeffReferenceParameterAccess().getReferenceNameAssignment_0()); 
            // InternalRepoLang.g:4627:2: ( rule__SeffReferenceParameter__ReferenceNameAssignment_0 )
            // InternalRepoLang.g:4627:3: rule__SeffReferenceParameter__ReferenceNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SeffReferenceParameter__ReferenceNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSeffReferenceParameterAccess().getReferenceNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReferenceParameter__Group__0__Impl"


    // $ANTLR start "rule__SeffReferenceParameter__Group__1"
    // InternalRepoLang.g:4635:1: rule__SeffReferenceParameter__Group__1 : rule__SeffReferenceParameter__Group__1__Impl rule__SeffReferenceParameter__Group__2 ;
    public final void rule__SeffReferenceParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4639:1: ( rule__SeffReferenceParameter__Group__1__Impl rule__SeffReferenceParameter__Group__2 )
            // InternalRepoLang.g:4640:2: rule__SeffReferenceParameter__Group__1__Impl rule__SeffReferenceParameter__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__SeffReferenceParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffReferenceParameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReferenceParameter__Group__1"


    // $ANTLR start "rule__SeffReferenceParameter__Group__1__Impl"
    // InternalRepoLang.g:4647:1: rule__SeffReferenceParameter__Group__1__Impl : ( '(' ) ;
    public final void rule__SeffReferenceParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4651:1: ( ( '(' ) )
            // InternalRepoLang.g:4652:1: ( '(' )
            {
            // InternalRepoLang.g:4652:1: ( '(' )
            // InternalRepoLang.g:4653:2: '('
            {
             before(grammarAccess.getSeffReferenceParameterAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSeffReferenceParameterAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReferenceParameter__Group__1__Impl"


    // $ANTLR start "rule__SeffReferenceParameter__Group__2"
    // InternalRepoLang.g:4662:1: rule__SeffReferenceParameter__Group__2 : rule__SeffReferenceParameter__Group__2__Impl rule__SeffReferenceParameter__Group__3 ;
    public final void rule__SeffReferenceParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4666:1: ( rule__SeffReferenceParameter__Group__2__Impl rule__SeffReferenceParameter__Group__3 )
            // InternalRepoLang.g:4667:2: rule__SeffReferenceParameter__Group__2__Impl rule__SeffReferenceParameter__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__SeffReferenceParameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffReferenceParameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReferenceParameter__Group__2"


    // $ANTLR start "rule__SeffReferenceParameter__Group__2__Impl"
    // InternalRepoLang.g:4674:1: rule__SeffReferenceParameter__Group__2__Impl : ( ( ( rule__SeffReferenceParameter__ValuesAssignment_2 ) ) ( ( rule__SeffReferenceParameter__ValuesAssignment_2 )* ) ) ;
    public final void rule__SeffReferenceParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4678:1: ( ( ( ( rule__SeffReferenceParameter__ValuesAssignment_2 ) ) ( ( rule__SeffReferenceParameter__ValuesAssignment_2 )* ) ) )
            // InternalRepoLang.g:4679:1: ( ( ( rule__SeffReferenceParameter__ValuesAssignment_2 ) ) ( ( rule__SeffReferenceParameter__ValuesAssignment_2 )* ) )
            {
            // InternalRepoLang.g:4679:1: ( ( ( rule__SeffReferenceParameter__ValuesAssignment_2 ) ) ( ( rule__SeffReferenceParameter__ValuesAssignment_2 )* ) )
            // InternalRepoLang.g:4680:2: ( ( rule__SeffReferenceParameter__ValuesAssignment_2 ) ) ( ( rule__SeffReferenceParameter__ValuesAssignment_2 )* )
            {
            // InternalRepoLang.g:4680:2: ( ( rule__SeffReferenceParameter__ValuesAssignment_2 ) )
            // InternalRepoLang.g:4681:3: ( rule__SeffReferenceParameter__ValuesAssignment_2 )
            {
             before(grammarAccess.getSeffReferenceParameterAccess().getValuesAssignment_2()); 
            // InternalRepoLang.g:4682:3: ( rule__SeffReferenceParameter__ValuesAssignment_2 )
            // InternalRepoLang.g:4682:4: rule__SeffReferenceParameter__ValuesAssignment_2
            {
            pushFollow(FOLLOW_40);
            rule__SeffReferenceParameter__ValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSeffReferenceParameterAccess().getValuesAssignment_2()); 

            }

            // InternalRepoLang.g:4685:2: ( ( rule__SeffReferenceParameter__ValuesAssignment_2 )* )
            // InternalRepoLang.g:4686:3: ( rule__SeffReferenceParameter__ValuesAssignment_2 )*
            {
             before(grammarAccess.getSeffReferenceParameterAccess().getValuesAssignment_2()); 
            // InternalRepoLang.g:4687:3: ( rule__SeffReferenceParameter__ValuesAssignment_2 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=11 && LA43_0<=15)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalRepoLang.g:4687:4: rule__SeffReferenceParameter__ValuesAssignment_2
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__SeffReferenceParameter__ValuesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getSeffReferenceParameterAccess().getValuesAssignment_2()); 

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
    // $ANTLR end "rule__SeffReferenceParameter__Group__2__Impl"


    // $ANTLR start "rule__SeffReferenceParameter__Group__3"
    // InternalRepoLang.g:4696:1: rule__SeffReferenceParameter__Group__3 : rule__SeffReferenceParameter__Group__3__Impl ;
    public final void rule__SeffReferenceParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4700:1: ( rule__SeffReferenceParameter__Group__3__Impl )
            // InternalRepoLang.g:4701:2: rule__SeffReferenceParameter__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeffReferenceParameter__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReferenceParameter__Group__3"


    // $ANTLR start "rule__SeffReferenceParameter__Group__3__Impl"
    // InternalRepoLang.g:4707:1: rule__SeffReferenceParameter__Group__3__Impl : ( ')' ) ;
    public final void rule__SeffReferenceParameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4711:1: ( ( ')' ) )
            // InternalRepoLang.g:4712:1: ( ')' )
            {
            // InternalRepoLang.g:4712:1: ( ')' )
            // InternalRepoLang.g:4713:2: ')'
            {
             before(grammarAccess.getSeffReferenceParameterAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSeffReferenceParameterAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReferenceParameter__Group__3__Impl"


    // $ANTLR start "rule__SeffReturnParameter__Group__0"
    // InternalRepoLang.g:4723:1: rule__SeffReturnParameter__Group__0 : rule__SeffReturnParameter__Group__0__Impl rule__SeffReturnParameter__Group__1 ;
    public final void rule__SeffReturnParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4727:1: ( rule__SeffReturnParameter__Group__0__Impl rule__SeffReturnParameter__Group__1 )
            // InternalRepoLang.g:4728:2: rule__SeffReturnParameter__Group__0__Impl rule__SeffReturnParameter__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__SeffReturnParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffReturnParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReturnParameter__Group__0"


    // $ANTLR start "rule__SeffReturnParameter__Group__0__Impl"
    // InternalRepoLang.g:4735:1: rule__SeffReturnParameter__Group__0__Impl : ( '(' ) ;
    public final void rule__SeffReturnParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4739:1: ( ( '(' ) )
            // InternalRepoLang.g:4740:1: ( '(' )
            {
            // InternalRepoLang.g:4740:1: ( '(' )
            // InternalRepoLang.g:4741:2: '('
            {
             before(grammarAccess.getSeffReturnParameterAccess().getLeftParenthesisKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSeffReturnParameterAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReturnParameter__Group__0__Impl"


    // $ANTLR start "rule__SeffReturnParameter__Group__1"
    // InternalRepoLang.g:4750:1: rule__SeffReturnParameter__Group__1 : rule__SeffReturnParameter__Group__1__Impl rule__SeffReturnParameter__Group__2 ;
    public final void rule__SeffReturnParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4754:1: ( rule__SeffReturnParameter__Group__1__Impl rule__SeffReturnParameter__Group__2 )
            // InternalRepoLang.g:4755:2: rule__SeffReturnParameter__Group__1__Impl rule__SeffReturnParameter__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__SeffReturnParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffReturnParameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReturnParameter__Group__1"


    // $ANTLR start "rule__SeffReturnParameter__Group__1__Impl"
    // InternalRepoLang.g:4762:1: rule__SeffReturnParameter__Group__1__Impl : ( ( ( rule__SeffReturnParameter__ValuesAssignment_1 ) ) ( ( rule__SeffReturnParameter__ValuesAssignment_1 )* ) ) ;
    public final void rule__SeffReturnParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4766:1: ( ( ( ( rule__SeffReturnParameter__ValuesAssignment_1 ) ) ( ( rule__SeffReturnParameter__ValuesAssignment_1 )* ) ) )
            // InternalRepoLang.g:4767:1: ( ( ( rule__SeffReturnParameter__ValuesAssignment_1 ) ) ( ( rule__SeffReturnParameter__ValuesAssignment_1 )* ) )
            {
            // InternalRepoLang.g:4767:1: ( ( ( rule__SeffReturnParameter__ValuesAssignment_1 ) ) ( ( rule__SeffReturnParameter__ValuesAssignment_1 )* ) )
            // InternalRepoLang.g:4768:2: ( ( rule__SeffReturnParameter__ValuesAssignment_1 ) ) ( ( rule__SeffReturnParameter__ValuesAssignment_1 )* )
            {
            // InternalRepoLang.g:4768:2: ( ( rule__SeffReturnParameter__ValuesAssignment_1 ) )
            // InternalRepoLang.g:4769:3: ( rule__SeffReturnParameter__ValuesAssignment_1 )
            {
             before(grammarAccess.getSeffReturnParameterAccess().getValuesAssignment_1()); 
            // InternalRepoLang.g:4770:3: ( rule__SeffReturnParameter__ValuesAssignment_1 )
            // InternalRepoLang.g:4770:4: rule__SeffReturnParameter__ValuesAssignment_1
            {
            pushFollow(FOLLOW_40);
            rule__SeffReturnParameter__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSeffReturnParameterAccess().getValuesAssignment_1()); 

            }

            // InternalRepoLang.g:4773:2: ( ( rule__SeffReturnParameter__ValuesAssignment_1 )* )
            // InternalRepoLang.g:4774:3: ( rule__SeffReturnParameter__ValuesAssignment_1 )*
            {
             before(grammarAccess.getSeffReturnParameterAccess().getValuesAssignment_1()); 
            // InternalRepoLang.g:4775:3: ( rule__SeffReturnParameter__ValuesAssignment_1 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=11 && LA44_0<=15)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalRepoLang.g:4775:4: rule__SeffReturnParameter__ValuesAssignment_1
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__SeffReturnParameter__ValuesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getSeffReturnParameterAccess().getValuesAssignment_1()); 

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
    // $ANTLR end "rule__SeffReturnParameter__Group__1__Impl"


    // $ANTLR start "rule__SeffReturnParameter__Group__2"
    // InternalRepoLang.g:4784:1: rule__SeffReturnParameter__Group__2 : rule__SeffReturnParameter__Group__2__Impl ;
    public final void rule__SeffReturnParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4788:1: ( rule__SeffReturnParameter__Group__2__Impl )
            // InternalRepoLang.g:4789:2: rule__SeffReturnParameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeffReturnParameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReturnParameter__Group__2"


    // $ANTLR start "rule__SeffReturnParameter__Group__2__Impl"
    // InternalRepoLang.g:4795:1: rule__SeffReturnParameter__Group__2__Impl : ( ')' ) ;
    public final void rule__SeffReturnParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4799:1: ( ( ')' ) )
            // InternalRepoLang.g:4800:1: ( ')' )
            {
            // InternalRepoLang.g:4800:1: ( ')' )
            // InternalRepoLang.g:4801:2: ')'
            {
             before(grammarAccess.getSeffReturnParameterAccess().getRightParenthesisKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSeffReturnParameterAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReturnParameter__Group__2__Impl"


    // $ANTLR start "rule__SeffVariableChar__Group__0"
    // InternalRepoLang.g:4811:1: rule__SeffVariableChar__Group__0 : rule__SeffVariableChar__Group__0__Impl rule__SeffVariableChar__Group__1 ;
    public final void rule__SeffVariableChar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4815:1: ( rule__SeffVariableChar__Group__0__Impl rule__SeffVariableChar__Group__1 )
            // InternalRepoLang.g:4816:2: rule__SeffVariableChar__Group__0__Impl rule__SeffVariableChar__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__SeffVariableChar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffVariableChar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffVariableChar__Group__0"


    // $ANTLR start "rule__SeffVariableChar__Group__0__Impl"
    // InternalRepoLang.g:4823:1: rule__SeffVariableChar__Group__0__Impl : ( ( rule__SeffVariableChar__CharacterisationTypeAssignment_0 ) ) ;
    public final void rule__SeffVariableChar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4827:1: ( ( ( rule__SeffVariableChar__CharacterisationTypeAssignment_0 ) ) )
            // InternalRepoLang.g:4828:1: ( ( rule__SeffVariableChar__CharacterisationTypeAssignment_0 ) )
            {
            // InternalRepoLang.g:4828:1: ( ( rule__SeffVariableChar__CharacterisationTypeAssignment_0 ) )
            // InternalRepoLang.g:4829:2: ( rule__SeffVariableChar__CharacterisationTypeAssignment_0 )
            {
             before(grammarAccess.getSeffVariableCharAccess().getCharacterisationTypeAssignment_0()); 
            // InternalRepoLang.g:4830:2: ( rule__SeffVariableChar__CharacterisationTypeAssignment_0 )
            // InternalRepoLang.g:4830:3: rule__SeffVariableChar__CharacterisationTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SeffVariableChar__CharacterisationTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSeffVariableCharAccess().getCharacterisationTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffVariableChar__Group__0__Impl"


    // $ANTLR start "rule__SeffVariableChar__Group__1"
    // InternalRepoLang.g:4838:1: rule__SeffVariableChar__Group__1 : rule__SeffVariableChar__Group__1__Impl rule__SeffVariableChar__Group__2 ;
    public final void rule__SeffVariableChar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4842:1: ( rule__SeffVariableChar__Group__1__Impl rule__SeffVariableChar__Group__2 )
            // InternalRepoLang.g:4843:2: rule__SeffVariableChar__Group__1__Impl rule__SeffVariableChar__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__SeffVariableChar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffVariableChar__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffVariableChar__Group__1"


    // $ANTLR start "rule__SeffVariableChar__Group__1__Impl"
    // InternalRepoLang.g:4850:1: rule__SeffVariableChar__Group__1__Impl : ( ':=' ) ;
    public final void rule__SeffVariableChar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4854:1: ( ( ':=' ) )
            // InternalRepoLang.g:4855:1: ( ':=' )
            {
            // InternalRepoLang.g:4855:1: ( ':=' )
            // InternalRepoLang.g:4856:2: ':='
            {
             before(grammarAccess.getSeffVariableCharAccess().getColonEqualsSignKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSeffVariableCharAccess().getColonEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffVariableChar__Group__1__Impl"


    // $ANTLR start "rule__SeffVariableChar__Group__2"
    // InternalRepoLang.g:4865:1: rule__SeffVariableChar__Group__2 : rule__SeffVariableChar__Group__2__Impl ;
    public final void rule__SeffVariableChar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4869:1: ( rule__SeffVariableChar__Group__2__Impl )
            // InternalRepoLang.g:4870:2: rule__SeffVariableChar__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeffVariableChar__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffVariableChar__Group__2"


    // $ANTLR start "rule__SeffVariableChar__Group__2__Impl"
    // InternalRepoLang.g:4876:1: rule__SeffVariableChar__Group__2__Impl : ( ( rule__SeffVariableChar__ValueAssignment_2 ) ) ;
    public final void rule__SeffVariableChar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4880:1: ( ( ( rule__SeffVariableChar__ValueAssignment_2 ) ) )
            // InternalRepoLang.g:4881:1: ( ( rule__SeffVariableChar__ValueAssignment_2 ) )
            {
            // InternalRepoLang.g:4881:1: ( ( rule__SeffVariableChar__ValueAssignment_2 ) )
            // InternalRepoLang.g:4882:2: ( rule__SeffVariableChar__ValueAssignment_2 )
            {
             before(grammarAccess.getSeffVariableCharAccess().getValueAssignment_2()); 
            // InternalRepoLang.g:4883:2: ( rule__SeffVariableChar__ValueAssignment_2 )
            // InternalRepoLang.g:4883:3: rule__SeffVariableChar__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SeffVariableChar__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSeffVariableCharAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffVariableChar__Group__2__Impl"


    // $ANTLR start "rule__SeffProbabilisticBranchAction__Group__0"
    // InternalRepoLang.g:4892:1: rule__SeffProbabilisticBranchAction__Group__0 : rule__SeffProbabilisticBranchAction__Group__0__Impl rule__SeffProbabilisticBranchAction__Group__1 ;
    public final void rule__SeffProbabilisticBranchAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4896:1: ( rule__SeffProbabilisticBranchAction__Group__0__Impl rule__SeffProbabilisticBranchAction__Group__1 )
            // InternalRepoLang.g:4897:2: rule__SeffProbabilisticBranchAction__Group__0__Impl rule__SeffProbabilisticBranchAction__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__SeffProbabilisticBranchAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffProbabilisticBranchAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffProbabilisticBranchAction__Group__0"


    // $ANTLR start "rule__SeffProbabilisticBranchAction__Group__0__Impl"
    // InternalRepoLang.g:4904:1: rule__SeffProbabilisticBranchAction__Group__0__Impl : ( 'PBR' ) ;
    public final void rule__SeffProbabilisticBranchAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4908:1: ( ( 'PBR' ) )
            // InternalRepoLang.g:4909:1: ( 'PBR' )
            {
            // InternalRepoLang.g:4909:1: ( 'PBR' )
            // InternalRepoLang.g:4910:2: 'PBR'
            {
             before(grammarAccess.getSeffProbabilisticBranchActionAccess().getPBRKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSeffProbabilisticBranchActionAccess().getPBRKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffProbabilisticBranchAction__Group__0__Impl"


    // $ANTLR start "rule__SeffProbabilisticBranchAction__Group__1"
    // InternalRepoLang.g:4919:1: rule__SeffProbabilisticBranchAction__Group__1 : rule__SeffProbabilisticBranchAction__Group__1__Impl rule__SeffProbabilisticBranchAction__Group__2 ;
    public final void rule__SeffProbabilisticBranchAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4923:1: ( rule__SeffProbabilisticBranchAction__Group__1__Impl rule__SeffProbabilisticBranchAction__Group__2 )
            // InternalRepoLang.g:4924:2: rule__SeffProbabilisticBranchAction__Group__1__Impl rule__SeffProbabilisticBranchAction__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__SeffProbabilisticBranchAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffProbabilisticBranchAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffProbabilisticBranchAction__Group__1"


    // $ANTLR start "rule__SeffProbabilisticBranchAction__Group__1__Impl"
    // InternalRepoLang.g:4931:1: rule__SeffProbabilisticBranchAction__Group__1__Impl : ( ( rule__SeffProbabilisticBranchAction__NameAssignment_1 )? ) ;
    public final void rule__SeffProbabilisticBranchAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4935:1: ( ( ( rule__SeffProbabilisticBranchAction__NameAssignment_1 )? ) )
            // InternalRepoLang.g:4936:1: ( ( rule__SeffProbabilisticBranchAction__NameAssignment_1 )? )
            {
            // InternalRepoLang.g:4936:1: ( ( rule__SeffProbabilisticBranchAction__NameAssignment_1 )? )
            // InternalRepoLang.g:4937:2: ( rule__SeffProbabilisticBranchAction__NameAssignment_1 )?
            {
             before(grammarAccess.getSeffProbabilisticBranchActionAccess().getNameAssignment_1()); 
            // InternalRepoLang.g:4938:2: ( rule__SeffProbabilisticBranchAction__NameAssignment_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRepoLang.g:4938:3: rule__SeffProbabilisticBranchAction__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SeffProbabilisticBranchAction__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSeffProbabilisticBranchActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffProbabilisticBranchAction__Group__1__Impl"


    // $ANTLR start "rule__SeffProbabilisticBranchAction__Group__2"
    // InternalRepoLang.g:4946:1: rule__SeffProbabilisticBranchAction__Group__2 : rule__SeffProbabilisticBranchAction__Group__2__Impl rule__SeffProbabilisticBranchAction__Group__3 ;
    public final void rule__SeffProbabilisticBranchAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4950:1: ( rule__SeffProbabilisticBranchAction__Group__2__Impl rule__SeffProbabilisticBranchAction__Group__3 )
            // InternalRepoLang.g:4951:2: rule__SeffProbabilisticBranchAction__Group__2__Impl rule__SeffProbabilisticBranchAction__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__SeffProbabilisticBranchAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffProbabilisticBranchAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffProbabilisticBranchAction__Group__2"


    // $ANTLR start "rule__SeffProbabilisticBranchAction__Group__2__Impl"
    // InternalRepoLang.g:4958:1: rule__SeffProbabilisticBranchAction__Group__2__Impl : ( '{' ) ;
    public final void rule__SeffProbabilisticBranchAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4962:1: ( ( '{' ) )
            // InternalRepoLang.g:4963:1: ( '{' )
            {
            // InternalRepoLang.g:4963:1: ( '{' )
            // InternalRepoLang.g:4964:2: '{'
            {
             before(grammarAccess.getSeffProbabilisticBranchActionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSeffProbabilisticBranchActionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffProbabilisticBranchAction__Group__2__Impl"


    // $ANTLR start "rule__SeffProbabilisticBranchAction__Group__3"
    // InternalRepoLang.g:4973:1: rule__SeffProbabilisticBranchAction__Group__3 : rule__SeffProbabilisticBranchAction__Group__3__Impl rule__SeffProbabilisticBranchAction__Group__4 ;
    public final void rule__SeffProbabilisticBranchAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4977:1: ( rule__SeffProbabilisticBranchAction__Group__3__Impl rule__SeffProbabilisticBranchAction__Group__4 )
            // InternalRepoLang.g:4978:2: rule__SeffProbabilisticBranchAction__Group__3__Impl rule__SeffProbabilisticBranchAction__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__SeffProbabilisticBranchAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffProbabilisticBranchAction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffProbabilisticBranchAction__Group__3"


    // $ANTLR start "rule__SeffProbabilisticBranchAction__Group__3__Impl"
    // InternalRepoLang.g:4985:1: rule__SeffProbabilisticBranchAction__Group__3__Impl : ( ( ( rule__SeffProbabilisticBranchAction__BranchesAssignment_3 ) ) ( ( rule__SeffProbabilisticBranchAction__BranchesAssignment_3 )* ) ) ;
    public final void rule__SeffProbabilisticBranchAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:4989:1: ( ( ( ( rule__SeffProbabilisticBranchAction__BranchesAssignment_3 ) ) ( ( rule__SeffProbabilisticBranchAction__BranchesAssignment_3 )* ) ) )
            // InternalRepoLang.g:4990:1: ( ( ( rule__SeffProbabilisticBranchAction__BranchesAssignment_3 ) ) ( ( rule__SeffProbabilisticBranchAction__BranchesAssignment_3 )* ) )
            {
            // InternalRepoLang.g:4990:1: ( ( ( rule__SeffProbabilisticBranchAction__BranchesAssignment_3 ) ) ( ( rule__SeffProbabilisticBranchAction__BranchesAssignment_3 )* ) )
            // InternalRepoLang.g:4991:2: ( ( rule__SeffProbabilisticBranchAction__BranchesAssignment_3 ) ) ( ( rule__SeffProbabilisticBranchAction__BranchesAssignment_3 )* )
            {
            // InternalRepoLang.g:4991:2: ( ( rule__SeffProbabilisticBranchAction__BranchesAssignment_3 ) )
            // InternalRepoLang.g:4992:3: ( rule__SeffProbabilisticBranchAction__BranchesAssignment_3 )
            {
             before(grammarAccess.getSeffProbabilisticBranchActionAccess().getBranchesAssignment_3()); 
            // InternalRepoLang.g:4993:3: ( rule__SeffProbabilisticBranchAction__BranchesAssignment_3 )
            // InternalRepoLang.g:4993:4: rule__SeffProbabilisticBranchAction__BranchesAssignment_3
            {
            pushFollow(FOLLOW_43);
            rule__SeffProbabilisticBranchAction__BranchesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSeffProbabilisticBranchActionAccess().getBranchesAssignment_3()); 

            }

            // InternalRepoLang.g:4996:2: ( ( rule__SeffProbabilisticBranchAction__BranchesAssignment_3 )* )
            // InternalRepoLang.g:4997:3: ( rule__SeffProbabilisticBranchAction__BranchesAssignment_3 )*
            {
             before(grammarAccess.getSeffProbabilisticBranchActionAccess().getBranchesAssignment_3()); 
            // InternalRepoLang.g:4998:3: ( rule__SeffProbabilisticBranchAction__BranchesAssignment_3 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_INT) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalRepoLang.g:4998:4: rule__SeffProbabilisticBranchAction__BranchesAssignment_3
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__SeffProbabilisticBranchAction__BranchesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getSeffProbabilisticBranchActionAccess().getBranchesAssignment_3()); 

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
    // $ANTLR end "rule__SeffProbabilisticBranchAction__Group__3__Impl"


    // $ANTLR start "rule__SeffProbabilisticBranchAction__Group__4"
    // InternalRepoLang.g:5007:1: rule__SeffProbabilisticBranchAction__Group__4 : rule__SeffProbabilisticBranchAction__Group__4__Impl ;
    public final void rule__SeffProbabilisticBranchAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5011:1: ( rule__SeffProbabilisticBranchAction__Group__4__Impl )
            // InternalRepoLang.g:5012:2: rule__SeffProbabilisticBranchAction__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeffProbabilisticBranchAction__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffProbabilisticBranchAction__Group__4"


    // $ANTLR start "rule__SeffProbabilisticBranchAction__Group__4__Impl"
    // InternalRepoLang.g:5018:1: rule__SeffProbabilisticBranchAction__Group__4__Impl : ( '}' ) ;
    public final void rule__SeffProbabilisticBranchAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5022:1: ( ( '}' ) )
            // InternalRepoLang.g:5023:1: ( '}' )
            {
            // InternalRepoLang.g:5023:1: ( '}' )
            // InternalRepoLang.g:5024:2: '}'
            {
             before(grammarAccess.getSeffProbabilisticBranchActionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSeffProbabilisticBranchActionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffProbabilisticBranchAction__Group__4__Impl"


    // $ANTLR start "rule__SeffProbabilisticBranch__Group__0"
    // InternalRepoLang.g:5034:1: rule__SeffProbabilisticBranch__Group__0 : rule__SeffProbabilisticBranch__Group__0__Impl rule__SeffProbabilisticBranch__Group__1 ;
    public final void rule__SeffProbabilisticBranch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5038:1: ( rule__SeffProbabilisticBranch__Group__0__Impl rule__SeffProbabilisticBranch__Group__1 )
            // InternalRepoLang.g:5039:2: rule__SeffProbabilisticBranch__Group__0__Impl rule__SeffProbabilisticBranch__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__SeffProbabilisticBranch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffProbabilisticBranch__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffProbabilisticBranch__Group__0"


    // $ANTLR start "rule__SeffProbabilisticBranch__Group__0__Impl"
    // InternalRepoLang.g:5046:1: rule__SeffProbabilisticBranch__Group__0__Impl : ( ( rule__SeffProbabilisticBranch__ProbabilityAssignment_0 ) ) ;
    public final void rule__SeffProbabilisticBranch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5050:1: ( ( ( rule__SeffProbabilisticBranch__ProbabilityAssignment_0 ) ) )
            // InternalRepoLang.g:5051:1: ( ( rule__SeffProbabilisticBranch__ProbabilityAssignment_0 ) )
            {
            // InternalRepoLang.g:5051:1: ( ( rule__SeffProbabilisticBranch__ProbabilityAssignment_0 ) )
            // InternalRepoLang.g:5052:2: ( rule__SeffProbabilisticBranch__ProbabilityAssignment_0 )
            {
             before(grammarAccess.getSeffProbabilisticBranchAccess().getProbabilityAssignment_0()); 
            // InternalRepoLang.g:5053:2: ( rule__SeffProbabilisticBranch__ProbabilityAssignment_0 )
            // InternalRepoLang.g:5053:3: rule__SeffProbabilisticBranch__ProbabilityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SeffProbabilisticBranch__ProbabilityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSeffProbabilisticBranchAccess().getProbabilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffProbabilisticBranch__Group__0__Impl"


    // $ANTLR start "rule__SeffProbabilisticBranch__Group__1"
    // InternalRepoLang.g:5061:1: rule__SeffProbabilisticBranch__Group__1 : rule__SeffProbabilisticBranch__Group__1__Impl rule__SeffProbabilisticBranch__Group__2 ;
    public final void rule__SeffProbabilisticBranch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5065:1: ( rule__SeffProbabilisticBranch__Group__1__Impl rule__SeffProbabilisticBranch__Group__2 )
            // InternalRepoLang.g:5066:2: rule__SeffProbabilisticBranch__Group__1__Impl rule__SeffProbabilisticBranch__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__SeffProbabilisticBranch__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffProbabilisticBranch__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffProbabilisticBranch__Group__1"


    // $ANTLR start "rule__SeffProbabilisticBranch__Group__1__Impl"
    // InternalRepoLang.g:5073:1: rule__SeffProbabilisticBranch__Group__1__Impl : ( ':' ) ;
    public final void rule__SeffProbabilisticBranch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5077:1: ( ( ':' ) )
            // InternalRepoLang.g:5078:1: ( ':' )
            {
            // InternalRepoLang.g:5078:1: ( ':' )
            // InternalRepoLang.g:5079:2: ':'
            {
             before(grammarAccess.getSeffProbabilisticBranchAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSeffProbabilisticBranchAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffProbabilisticBranch__Group__1__Impl"


    // $ANTLR start "rule__SeffProbabilisticBranch__Group__2"
    // InternalRepoLang.g:5088:1: rule__SeffProbabilisticBranch__Group__2 : rule__SeffProbabilisticBranch__Group__2__Impl rule__SeffProbabilisticBranch__Group__3 ;
    public final void rule__SeffProbabilisticBranch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5092:1: ( rule__SeffProbabilisticBranch__Group__2__Impl rule__SeffProbabilisticBranch__Group__3 )
            // InternalRepoLang.g:5093:2: rule__SeffProbabilisticBranch__Group__2__Impl rule__SeffProbabilisticBranch__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__SeffProbabilisticBranch__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffProbabilisticBranch__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffProbabilisticBranch__Group__2"


    // $ANTLR start "rule__SeffProbabilisticBranch__Group__2__Impl"
    // InternalRepoLang.g:5100:1: rule__SeffProbabilisticBranch__Group__2__Impl : ( ( rule__SeffProbabilisticBranch__NameAssignment_2 )? ) ;
    public final void rule__SeffProbabilisticBranch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5104:1: ( ( ( rule__SeffProbabilisticBranch__NameAssignment_2 )? ) )
            // InternalRepoLang.g:5105:1: ( ( rule__SeffProbabilisticBranch__NameAssignment_2 )? )
            {
            // InternalRepoLang.g:5105:1: ( ( rule__SeffProbabilisticBranch__NameAssignment_2 )? )
            // InternalRepoLang.g:5106:2: ( rule__SeffProbabilisticBranch__NameAssignment_2 )?
            {
             before(grammarAccess.getSeffProbabilisticBranchAccess().getNameAssignment_2()); 
            // InternalRepoLang.g:5107:2: ( rule__SeffProbabilisticBranch__NameAssignment_2 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRepoLang.g:5107:3: rule__SeffProbabilisticBranch__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SeffProbabilisticBranch__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSeffProbabilisticBranchAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffProbabilisticBranch__Group__2__Impl"


    // $ANTLR start "rule__SeffProbabilisticBranch__Group__3"
    // InternalRepoLang.g:5115:1: rule__SeffProbabilisticBranch__Group__3 : rule__SeffProbabilisticBranch__Group__3__Impl ;
    public final void rule__SeffProbabilisticBranch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5119:1: ( rule__SeffProbabilisticBranch__Group__3__Impl )
            // InternalRepoLang.g:5120:2: rule__SeffProbabilisticBranch__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeffProbabilisticBranch__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffProbabilisticBranch__Group__3"


    // $ANTLR start "rule__SeffProbabilisticBranch__Group__3__Impl"
    // InternalRepoLang.g:5126:1: rule__SeffProbabilisticBranch__Group__3__Impl : ( ( rule__SeffProbabilisticBranch__SeffAssignment_3 ) ) ;
    public final void rule__SeffProbabilisticBranch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5130:1: ( ( ( rule__SeffProbabilisticBranch__SeffAssignment_3 ) ) )
            // InternalRepoLang.g:5131:1: ( ( rule__SeffProbabilisticBranch__SeffAssignment_3 ) )
            {
            // InternalRepoLang.g:5131:1: ( ( rule__SeffProbabilisticBranch__SeffAssignment_3 ) )
            // InternalRepoLang.g:5132:2: ( rule__SeffProbabilisticBranch__SeffAssignment_3 )
            {
             before(grammarAccess.getSeffProbabilisticBranchAccess().getSeffAssignment_3()); 
            // InternalRepoLang.g:5133:2: ( rule__SeffProbabilisticBranch__SeffAssignment_3 )
            // InternalRepoLang.g:5133:3: rule__SeffProbabilisticBranch__SeffAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SeffProbabilisticBranch__SeffAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSeffProbabilisticBranchAccess().getSeffAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffProbabilisticBranch__Group__3__Impl"


    // $ANTLR start "rule__SeffGuardedBranchAction__Group__0"
    // InternalRepoLang.g:5142:1: rule__SeffGuardedBranchAction__Group__0 : rule__SeffGuardedBranchAction__Group__0__Impl rule__SeffGuardedBranchAction__Group__1 ;
    public final void rule__SeffGuardedBranchAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5146:1: ( rule__SeffGuardedBranchAction__Group__0__Impl rule__SeffGuardedBranchAction__Group__1 )
            // InternalRepoLang.g:5147:2: rule__SeffGuardedBranchAction__Group__0__Impl rule__SeffGuardedBranchAction__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__SeffGuardedBranchAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffGuardedBranchAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffGuardedBranchAction__Group__0"


    // $ANTLR start "rule__SeffGuardedBranchAction__Group__0__Impl"
    // InternalRepoLang.g:5154:1: rule__SeffGuardedBranchAction__Group__0__Impl : ( 'GBR' ) ;
    public final void rule__SeffGuardedBranchAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5158:1: ( ( 'GBR' ) )
            // InternalRepoLang.g:5159:1: ( 'GBR' )
            {
            // InternalRepoLang.g:5159:1: ( 'GBR' )
            // InternalRepoLang.g:5160:2: 'GBR'
            {
             before(grammarAccess.getSeffGuardedBranchActionAccess().getGBRKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSeffGuardedBranchActionAccess().getGBRKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffGuardedBranchAction__Group__0__Impl"


    // $ANTLR start "rule__SeffGuardedBranchAction__Group__1"
    // InternalRepoLang.g:5169:1: rule__SeffGuardedBranchAction__Group__1 : rule__SeffGuardedBranchAction__Group__1__Impl rule__SeffGuardedBranchAction__Group__2 ;
    public final void rule__SeffGuardedBranchAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5173:1: ( rule__SeffGuardedBranchAction__Group__1__Impl rule__SeffGuardedBranchAction__Group__2 )
            // InternalRepoLang.g:5174:2: rule__SeffGuardedBranchAction__Group__1__Impl rule__SeffGuardedBranchAction__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__SeffGuardedBranchAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffGuardedBranchAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffGuardedBranchAction__Group__1"


    // $ANTLR start "rule__SeffGuardedBranchAction__Group__1__Impl"
    // InternalRepoLang.g:5181:1: rule__SeffGuardedBranchAction__Group__1__Impl : ( ( rule__SeffGuardedBranchAction__NameAssignment_1 )? ) ;
    public final void rule__SeffGuardedBranchAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5185:1: ( ( ( rule__SeffGuardedBranchAction__NameAssignment_1 )? ) )
            // InternalRepoLang.g:5186:1: ( ( rule__SeffGuardedBranchAction__NameAssignment_1 )? )
            {
            // InternalRepoLang.g:5186:1: ( ( rule__SeffGuardedBranchAction__NameAssignment_1 )? )
            // InternalRepoLang.g:5187:2: ( rule__SeffGuardedBranchAction__NameAssignment_1 )?
            {
             before(grammarAccess.getSeffGuardedBranchActionAccess().getNameAssignment_1()); 
            // InternalRepoLang.g:5188:2: ( rule__SeffGuardedBranchAction__NameAssignment_1 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalRepoLang.g:5188:3: rule__SeffGuardedBranchAction__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SeffGuardedBranchAction__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSeffGuardedBranchActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffGuardedBranchAction__Group__1__Impl"


    // $ANTLR start "rule__SeffGuardedBranchAction__Group__2"
    // InternalRepoLang.g:5196:1: rule__SeffGuardedBranchAction__Group__2 : rule__SeffGuardedBranchAction__Group__2__Impl rule__SeffGuardedBranchAction__Group__3 ;
    public final void rule__SeffGuardedBranchAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5200:1: ( rule__SeffGuardedBranchAction__Group__2__Impl rule__SeffGuardedBranchAction__Group__3 )
            // InternalRepoLang.g:5201:2: rule__SeffGuardedBranchAction__Group__2__Impl rule__SeffGuardedBranchAction__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__SeffGuardedBranchAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffGuardedBranchAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffGuardedBranchAction__Group__2"


    // $ANTLR start "rule__SeffGuardedBranchAction__Group__2__Impl"
    // InternalRepoLang.g:5208:1: rule__SeffGuardedBranchAction__Group__2__Impl : ( '{' ) ;
    public final void rule__SeffGuardedBranchAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5212:1: ( ( '{' ) )
            // InternalRepoLang.g:5213:1: ( '{' )
            {
            // InternalRepoLang.g:5213:1: ( '{' )
            // InternalRepoLang.g:5214:2: '{'
            {
             before(grammarAccess.getSeffGuardedBranchActionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSeffGuardedBranchActionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffGuardedBranchAction__Group__2__Impl"


    // $ANTLR start "rule__SeffGuardedBranchAction__Group__3"
    // InternalRepoLang.g:5223:1: rule__SeffGuardedBranchAction__Group__3 : rule__SeffGuardedBranchAction__Group__3__Impl rule__SeffGuardedBranchAction__Group__4 ;
    public final void rule__SeffGuardedBranchAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5227:1: ( rule__SeffGuardedBranchAction__Group__3__Impl rule__SeffGuardedBranchAction__Group__4 )
            // InternalRepoLang.g:5228:2: rule__SeffGuardedBranchAction__Group__3__Impl rule__SeffGuardedBranchAction__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__SeffGuardedBranchAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffGuardedBranchAction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffGuardedBranchAction__Group__3"


    // $ANTLR start "rule__SeffGuardedBranchAction__Group__3__Impl"
    // InternalRepoLang.g:5235:1: rule__SeffGuardedBranchAction__Group__3__Impl : ( ( ( rule__SeffGuardedBranchAction__BranchesAssignment_3 ) ) ( ( rule__SeffGuardedBranchAction__BranchesAssignment_3 )* ) ) ;
    public final void rule__SeffGuardedBranchAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5239:1: ( ( ( ( rule__SeffGuardedBranchAction__BranchesAssignment_3 ) ) ( ( rule__SeffGuardedBranchAction__BranchesAssignment_3 )* ) ) )
            // InternalRepoLang.g:5240:1: ( ( ( rule__SeffGuardedBranchAction__BranchesAssignment_3 ) ) ( ( rule__SeffGuardedBranchAction__BranchesAssignment_3 )* ) )
            {
            // InternalRepoLang.g:5240:1: ( ( ( rule__SeffGuardedBranchAction__BranchesAssignment_3 ) ) ( ( rule__SeffGuardedBranchAction__BranchesAssignment_3 )* ) )
            // InternalRepoLang.g:5241:2: ( ( rule__SeffGuardedBranchAction__BranchesAssignment_3 ) ) ( ( rule__SeffGuardedBranchAction__BranchesAssignment_3 )* )
            {
            // InternalRepoLang.g:5241:2: ( ( rule__SeffGuardedBranchAction__BranchesAssignment_3 ) )
            // InternalRepoLang.g:5242:3: ( rule__SeffGuardedBranchAction__BranchesAssignment_3 )
            {
             before(grammarAccess.getSeffGuardedBranchActionAccess().getBranchesAssignment_3()); 
            // InternalRepoLang.g:5243:3: ( rule__SeffGuardedBranchAction__BranchesAssignment_3 )
            // InternalRepoLang.g:5243:4: rule__SeffGuardedBranchAction__BranchesAssignment_3
            {
            pushFollow(FOLLOW_44);
            rule__SeffGuardedBranchAction__BranchesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSeffGuardedBranchActionAccess().getBranchesAssignment_3()); 

            }

            // InternalRepoLang.g:5246:2: ( ( rule__SeffGuardedBranchAction__BranchesAssignment_3 )* )
            // InternalRepoLang.g:5247:3: ( rule__SeffGuardedBranchAction__BranchesAssignment_3 )*
            {
             before(grammarAccess.getSeffGuardedBranchActionAccess().getBranchesAssignment_3()); 
            // InternalRepoLang.g:5248:3: ( rule__SeffGuardedBranchAction__BranchesAssignment_3 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_STRING) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalRepoLang.g:5248:4: rule__SeffGuardedBranchAction__BranchesAssignment_3
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__SeffGuardedBranchAction__BranchesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getSeffGuardedBranchActionAccess().getBranchesAssignment_3()); 

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
    // $ANTLR end "rule__SeffGuardedBranchAction__Group__3__Impl"


    // $ANTLR start "rule__SeffGuardedBranchAction__Group__4"
    // InternalRepoLang.g:5257:1: rule__SeffGuardedBranchAction__Group__4 : rule__SeffGuardedBranchAction__Group__4__Impl ;
    public final void rule__SeffGuardedBranchAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5261:1: ( rule__SeffGuardedBranchAction__Group__4__Impl )
            // InternalRepoLang.g:5262:2: rule__SeffGuardedBranchAction__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeffGuardedBranchAction__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffGuardedBranchAction__Group__4"


    // $ANTLR start "rule__SeffGuardedBranchAction__Group__4__Impl"
    // InternalRepoLang.g:5268:1: rule__SeffGuardedBranchAction__Group__4__Impl : ( '}' ) ;
    public final void rule__SeffGuardedBranchAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5272:1: ( ( '}' ) )
            // InternalRepoLang.g:5273:1: ( '}' )
            {
            // InternalRepoLang.g:5273:1: ( '}' )
            // InternalRepoLang.g:5274:2: '}'
            {
             before(grammarAccess.getSeffGuardedBranchActionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSeffGuardedBranchActionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffGuardedBranchAction__Group__4__Impl"


    // $ANTLR start "rule__SeffGuardedBranch__Group__0"
    // InternalRepoLang.g:5284:1: rule__SeffGuardedBranch__Group__0 : rule__SeffGuardedBranch__Group__0__Impl rule__SeffGuardedBranch__Group__1 ;
    public final void rule__SeffGuardedBranch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5288:1: ( rule__SeffGuardedBranch__Group__0__Impl rule__SeffGuardedBranch__Group__1 )
            // InternalRepoLang.g:5289:2: rule__SeffGuardedBranch__Group__0__Impl rule__SeffGuardedBranch__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__SeffGuardedBranch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffGuardedBranch__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffGuardedBranch__Group__0"


    // $ANTLR start "rule__SeffGuardedBranch__Group__0__Impl"
    // InternalRepoLang.g:5296:1: rule__SeffGuardedBranch__Group__0__Impl : ( ( rule__SeffGuardedBranch__ConditionAssignment_0 ) ) ;
    public final void rule__SeffGuardedBranch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5300:1: ( ( ( rule__SeffGuardedBranch__ConditionAssignment_0 ) ) )
            // InternalRepoLang.g:5301:1: ( ( rule__SeffGuardedBranch__ConditionAssignment_0 ) )
            {
            // InternalRepoLang.g:5301:1: ( ( rule__SeffGuardedBranch__ConditionAssignment_0 ) )
            // InternalRepoLang.g:5302:2: ( rule__SeffGuardedBranch__ConditionAssignment_0 )
            {
             before(grammarAccess.getSeffGuardedBranchAccess().getConditionAssignment_0()); 
            // InternalRepoLang.g:5303:2: ( rule__SeffGuardedBranch__ConditionAssignment_0 )
            // InternalRepoLang.g:5303:3: rule__SeffGuardedBranch__ConditionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SeffGuardedBranch__ConditionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSeffGuardedBranchAccess().getConditionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffGuardedBranch__Group__0__Impl"


    // $ANTLR start "rule__SeffGuardedBranch__Group__1"
    // InternalRepoLang.g:5311:1: rule__SeffGuardedBranch__Group__1 : rule__SeffGuardedBranch__Group__1__Impl rule__SeffGuardedBranch__Group__2 ;
    public final void rule__SeffGuardedBranch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5315:1: ( rule__SeffGuardedBranch__Group__1__Impl rule__SeffGuardedBranch__Group__2 )
            // InternalRepoLang.g:5316:2: rule__SeffGuardedBranch__Group__1__Impl rule__SeffGuardedBranch__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__SeffGuardedBranch__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffGuardedBranch__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffGuardedBranch__Group__1"


    // $ANTLR start "rule__SeffGuardedBranch__Group__1__Impl"
    // InternalRepoLang.g:5323:1: rule__SeffGuardedBranch__Group__1__Impl : ( ':' ) ;
    public final void rule__SeffGuardedBranch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5327:1: ( ( ':' ) )
            // InternalRepoLang.g:5328:1: ( ':' )
            {
            // InternalRepoLang.g:5328:1: ( ':' )
            // InternalRepoLang.g:5329:2: ':'
            {
             before(grammarAccess.getSeffGuardedBranchAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSeffGuardedBranchAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffGuardedBranch__Group__1__Impl"


    // $ANTLR start "rule__SeffGuardedBranch__Group__2"
    // InternalRepoLang.g:5338:1: rule__SeffGuardedBranch__Group__2 : rule__SeffGuardedBranch__Group__2__Impl rule__SeffGuardedBranch__Group__3 ;
    public final void rule__SeffGuardedBranch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5342:1: ( rule__SeffGuardedBranch__Group__2__Impl rule__SeffGuardedBranch__Group__3 )
            // InternalRepoLang.g:5343:2: rule__SeffGuardedBranch__Group__2__Impl rule__SeffGuardedBranch__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__SeffGuardedBranch__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffGuardedBranch__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffGuardedBranch__Group__2"


    // $ANTLR start "rule__SeffGuardedBranch__Group__2__Impl"
    // InternalRepoLang.g:5350:1: rule__SeffGuardedBranch__Group__2__Impl : ( ( rule__SeffGuardedBranch__NameAssignment_2 )? ) ;
    public final void rule__SeffGuardedBranch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5354:1: ( ( ( rule__SeffGuardedBranch__NameAssignment_2 )? ) )
            // InternalRepoLang.g:5355:1: ( ( rule__SeffGuardedBranch__NameAssignment_2 )? )
            {
            // InternalRepoLang.g:5355:1: ( ( rule__SeffGuardedBranch__NameAssignment_2 )? )
            // InternalRepoLang.g:5356:2: ( rule__SeffGuardedBranch__NameAssignment_2 )?
            {
             before(grammarAccess.getSeffGuardedBranchAccess().getNameAssignment_2()); 
            // InternalRepoLang.g:5357:2: ( rule__SeffGuardedBranch__NameAssignment_2 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalRepoLang.g:5357:3: rule__SeffGuardedBranch__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SeffGuardedBranch__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSeffGuardedBranchAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffGuardedBranch__Group__2__Impl"


    // $ANTLR start "rule__SeffGuardedBranch__Group__3"
    // InternalRepoLang.g:5365:1: rule__SeffGuardedBranch__Group__3 : rule__SeffGuardedBranch__Group__3__Impl ;
    public final void rule__SeffGuardedBranch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5369:1: ( rule__SeffGuardedBranch__Group__3__Impl )
            // InternalRepoLang.g:5370:2: rule__SeffGuardedBranch__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeffGuardedBranch__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffGuardedBranch__Group__3"


    // $ANTLR start "rule__SeffGuardedBranch__Group__3__Impl"
    // InternalRepoLang.g:5376:1: rule__SeffGuardedBranch__Group__3__Impl : ( ( rule__SeffGuardedBranch__SeffAssignment_3 ) ) ;
    public final void rule__SeffGuardedBranch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5380:1: ( ( ( rule__SeffGuardedBranch__SeffAssignment_3 ) ) )
            // InternalRepoLang.g:5381:1: ( ( rule__SeffGuardedBranch__SeffAssignment_3 ) )
            {
            // InternalRepoLang.g:5381:1: ( ( rule__SeffGuardedBranch__SeffAssignment_3 ) )
            // InternalRepoLang.g:5382:2: ( rule__SeffGuardedBranch__SeffAssignment_3 )
            {
             before(grammarAccess.getSeffGuardedBranchAccess().getSeffAssignment_3()); 
            // InternalRepoLang.g:5383:2: ( rule__SeffGuardedBranch__SeffAssignment_3 )
            // InternalRepoLang.g:5383:3: rule__SeffGuardedBranch__SeffAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SeffGuardedBranch__SeffAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSeffGuardedBranchAccess().getSeffAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffGuardedBranch__Group__3__Impl"


    // $ANTLR start "rule__SeffForkAction__Group__0"
    // InternalRepoLang.g:5392:1: rule__SeffForkAction__Group__0 : rule__SeffForkAction__Group__0__Impl rule__SeffForkAction__Group__1 ;
    public final void rule__SeffForkAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5396:1: ( rule__SeffForkAction__Group__0__Impl rule__SeffForkAction__Group__1 )
            // InternalRepoLang.g:5397:2: rule__SeffForkAction__Group__0__Impl rule__SeffForkAction__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__SeffForkAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffForkAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffForkAction__Group__0"


    // $ANTLR start "rule__SeffForkAction__Group__0__Impl"
    // InternalRepoLang.g:5404:1: rule__SeffForkAction__Group__0__Impl : ( 'PAR' ) ;
    public final void rule__SeffForkAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5408:1: ( ( 'PAR' ) )
            // InternalRepoLang.g:5409:1: ( 'PAR' )
            {
            // InternalRepoLang.g:5409:1: ( 'PAR' )
            // InternalRepoLang.g:5410:2: 'PAR'
            {
             before(grammarAccess.getSeffForkActionAccess().getPARKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getSeffForkActionAccess().getPARKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffForkAction__Group__0__Impl"


    // $ANTLR start "rule__SeffForkAction__Group__1"
    // InternalRepoLang.g:5419:1: rule__SeffForkAction__Group__1 : rule__SeffForkAction__Group__1__Impl rule__SeffForkAction__Group__2 ;
    public final void rule__SeffForkAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5423:1: ( rule__SeffForkAction__Group__1__Impl rule__SeffForkAction__Group__2 )
            // InternalRepoLang.g:5424:2: rule__SeffForkAction__Group__1__Impl rule__SeffForkAction__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__SeffForkAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffForkAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffForkAction__Group__1"


    // $ANTLR start "rule__SeffForkAction__Group__1__Impl"
    // InternalRepoLang.g:5431:1: rule__SeffForkAction__Group__1__Impl : ( ( rule__SeffForkAction__SyncAssignment_1 )? ) ;
    public final void rule__SeffForkAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5435:1: ( ( ( rule__SeffForkAction__SyncAssignment_1 )? ) )
            // InternalRepoLang.g:5436:1: ( ( rule__SeffForkAction__SyncAssignment_1 )? )
            {
            // InternalRepoLang.g:5436:1: ( ( rule__SeffForkAction__SyncAssignment_1 )? )
            // InternalRepoLang.g:5437:2: ( rule__SeffForkAction__SyncAssignment_1 )?
            {
             before(grammarAccess.getSeffForkActionAccess().getSyncAssignment_1()); 
            // InternalRepoLang.g:5438:2: ( rule__SeffForkAction__SyncAssignment_1 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==53) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalRepoLang.g:5438:3: rule__SeffForkAction__SyncAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SeffForkAction__SyncAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSeffForkActionAccess().getSyncAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffForkAction__Group__1__Impl"


    // $ANTLR start "rule__SeffForkAction__Group__2"
    // InternalRepoLang.g:5446:1: rule__SeffForkAction__Group__2 : rule__SeffForkAction__Group__2__Impl rule__SeffForkAction__Group__3 ;
    public final void rule__SeffForkAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5450:1: ( rule__SeffForkAction__Group__2__Impl rule__SeffForkAction__Group__3 )
            // InternalRepoLang.g:5451:2: rule__SeffForkAction__Group__2__Impl rule__SeffForkAction__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__SeffForkAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffForkAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffForkAction__Group__2"


    // $ANTLR start "rule__SeffForkAction__Group__2__Impl"
    // InternalRepoLang.g:5458:1: rule__SeffForkAction__Group__2__Impl : ( ( rule__SeffForkAction__NameAssignment_2 )? ) ;
    public final void rule__SeffForkAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5462:1: ( ( ( rule__SeffForkAction__NameAssignment_2 )? ) )
            // InternalRepoLang.g:5463:1: ( ( rule__SeffForkAction__NameAssignment_2 )? )
            {
            // InternalRepoLang.g:5463:1: ( ( rule__SeffForkAction__NameAssignment_2 )? )
            // InternalRepoLang.g:5464:2: ( rule__SeffForkAction__NameAssignment_2 )?
            {
             before(grammarAccess.getSeffForkActionAccess().getNameAssignment_2()); 
            // InternalRepoLang.g:5465:2: ( rule__SeffForkAction__NameAssignment_2 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalRepoLang.g:5465:3: rule__SeffForkAction__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SeffForkAction__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSeffForkActionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffForkAction__Group__2__Impl"


    // $ANTLR start "rule__SeffForkAction__Group__3"
    // InternalRepoLang.g:5473:1: rule__SeffForkAction__Group__3 : rule__SeffForkAction__Group__3__Impl rule__SeffForkAction__Group__4 ;
    public final void rule__SeffForkAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5477:1: ( rule__SeffForkAction__Group__3__Impl rule__SeffForkAction__Group__4 )
            // InternalRepoLang.g:5478:2: rule__SeffForkAction__Group__3__Impl rule__SeffForkAction__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__SeffForkAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffForkAction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffForkAction__Group__3"


    // $ANTLR start "rule__SeffForkAction__Group__3__Impl"
    // InternalRepoLang.g:5485:1: rule__SeffForkAction__Group__3__Impl : ( '{' ) ;
    public final void rule__SeffForkAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5489:1: ( ( '{' ) )
            // InternalRepoLang.g:5490:1: ( '{' )
            {
            // InternalRepoLang.g:5490:1: ( '{' )
            // InternalRepoLang.g:5491:2: '{'
            {
             before(grammarAccess.getSeffForkActionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSeffForkActionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffForkAction__Group__3__Impl"


    // $ANTLR start "rule__SeffForkAction__Group__4"
    // InternalRepoLang.g:5500:1: rule__SeffForkAction__Group__4 : rule__SeffForkAction__Group__4__Impl rule__SeffForkAction__Group__5 ;
    public final void rule__SeffForkAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5504:1: ( rule__SeffForkAction__Group__4__Impl rule__SeffForkAction__Group__5 )
            // InternalRepoLang.g:5505:2: rule__SeffForkAction__Group__4__Impl rule__SeffForkAction__Group__5
            {
            pushFollow(FOLLOW_46);
            rule__SeffForkAction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffForkAction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffForkAction__Group__4"


    // $ANTLR start "rule__SeffForkAction__Group__4__Impl"
    // InternalRepoLang.g:5512:1: rule__SeffForkAction__Group__4__Impl : ( ( rule__SeffForkAction__ForksAssignment_4 ) ) ;
    public final void rule__SeffForkAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5516:1: ( ( ( rule__SeffForkAction__ForksAssignment_4 ) ) )
            // InternalRepoLang.g:5517:1: ( ( rule__SeffForkAction__ForksAssignment_4 ) )
            {
            // InternalRepoLang.g:5517:1: ( ( rule__SeffForkAction__ForksAssignment_4 ) )
            // InternalRepoLang.g:5518:2: ( rule__SeffForkAction__ForksAssignment_4 )
            {
             before(grammarAccess.getSeffForkActionAccess().getForksAssignment_4()); 
            // InternalRepoLang.g:5519:2: ( rule__SeffForkAction__ForksAssignment_4 )
            // InternalRepoLang.g:5519:3: rule__SeffForkAction__ForksAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SeffForkAction__ForksAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSeffForkActionAccess().getForksAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffForkAction__Group__4__Impl"


    // $ANTLR start "rule__SeffForkAction__Group__5"
    // InternalRepoLang.g:5527:1: rule__SeffForkAction__Group__5 : rule__SeffForkAction__Group__5__Impl rule__SeffForkAction__Group__6 ;
    public final void rule__SeffForkAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5531:1: ( rule__SeffForkAction__Group__5__Impl rule__SeffForkAction__Group__6 )
            // InternalRepoLang.g:5532:2: rule__SeffForkAction__Group__5__Impl rule__SeffForkAction__Group__6
            {
            pushFollow(FOLLOW_46);
            rule__SeffForkAction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffForkAction__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffForkAction__Group__5"


    // $ANTLR start "rule__SeffForkAction__Group__5__Impl"
    // InternalRepoLang.g:5539:1: rule__SeffForkAction__Group__5__Impl : ( ( rule__SeffForkAction__Group_5__0 )* ) ;
    public final void rule__SeffForkAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5543:1: ( ( ( rule__SeffForkAction__Group_5__0 )* ) )
            // InternalRepoLang.g:5544:1: ( ( rule__SeffForkAction__Group_5__0 )* )
            {
            // InternalRepoLang.g:5544:1: ( ( rule__SeffForkAction__Group_5__0 )* )
            // InternalRepoLang.g:5545:2: ( rule__SeffForkAction__Group_5__0 )*
            {
             before(grammarAccess.getSeffForkActionAccess().getGroup_5()); 
            // InternalRepoLang.g:5546:2: ( rule__SeffForkAction__Group_5__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==51) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalRepoLang.g:5546:3: rule__SeffForkAction__Group_5__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__SeffForkAction__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getSeffForkActionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffForkAction__Group__5__Impl"


    // $ANTLR start "rule__SeffForkAction__Group__6"
    // InternalRepoLang.g:5554:1: rule__SeffForkAction__Group__6 : rule__SeffForkAction__Group__6__Impl ;
    public final void rule__SeffForkAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5558:1: ( rule__SeffForkAction__Group__6__Impl )
            // InternalRepoLang.g:5559:2: rule__SeffForkAction__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeffForkAction__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffForkAction__Group__6"


    // $ANTLR start "rule__SeffForkAction__Group__6__Impl"
    // InternalRepoLang.g:5565:1: rule__SeffForkAction__Group__6__Impl : ( '}' ) ;
    public final void rule__SeffForkAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5569:1: ( ( '}' ) )
            // InternalRepoLang.g:5570:1: ( '}' )
            {
            // InternalRepoLang.g:5570:1: ( '}' )
            // InternalRepoLang.g:5571:2: '}'
            {
             before(grammarAccess.getSeffForkActionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSeffForkActionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffForkAction__Group__6__Impl"


    // $ANTLR start "rule__SeffForkAction__Group_5__0"
    // InternalRepoLang.g:5581:1: rule__SeffForkAction__Group_5__0 : rule__SeffForkAction__Group_5__0__Impl rule__SeffForkAction__Group_5__1 ;
    public final void rule__SeffForkAction__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5585:1: ( rule__SeffForkAction__Group_5__0__Impl rule__SeffForkAction__Group_5__1 )
            // InternalRepoLang.g:5586:2: rule__SeffForkAction__Group_5__0__Impl rule__SeffForkAction__Group_5__1
            {
            pushFollow(FOLLOW_42);
            rule__SeffForkAction__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffForkAction__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffForkAction__Group_5__0"


    // $ANTLR start "rule__SeffForkAction__Group_5__0__Impl"
    // InternalRepoLang.g:5593:1: rule__SeffForkAction__Group_5__0__Impl : ( '|' ) ;
    public final void rule__SeffForkAction__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5597:1: ( ( '|' ) )
            // InternalRepoLang.g:5598:1: ( '|' )
            {
            // InternalRepoLang.g:5598:1: ( '|' )
            // InternalRepoLang.g:5599:2: '|'
            {
             before(grammarAccess.getSeffForkActionAccess().getVerticalLineKeyword_5_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSeffForkActionAccess().getVerticalLineKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffForkAction__Group_5__0__Impl"


    // $ANTLR start "rule__SeffForkAction__Group_5__1"
    // InternalRepoLang.g:5608:1: rule__SeffForkAction__Group_5__1 : rule__SeffForkAction__Group_5__1__Impl ;
    public final void rule__SeffForkAction__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5612:1: ( rule__SeffForkAction__Group_5__1__Impl )
            // InternalRepoLang.g:5613:2: rule__SeffForkAction__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeffForkAction__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffForkAction__Group_5__1"


    // $ANTLR start "rule__SeffForkAction__Group_5__1__Impl"
    // InternalRepoLang.g:5619:1: rule__SeffForkAction__Group_5__1__Impl : ( ( rule__SeffForkAction__ForksAssignment_5_1 ) ) ;
    public final void rule__SeffForkAction__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5623:1: ( ( ( rule__SeffForkAction__ForksAssignment_5_1 ) ) )
            // InternalRepoLang.g:5624:1: ( ( rule__SeffForkAction__ForksAssignment_5_1 ) )
            {
            // InternalRepoLang.g:5624:1: ( ( rule__SeffForkAction__ForksAssignment_5_1 ) )
            // InternalRepoLang.g:5625:2: ( rule__SeffForkAction__ForksAssignment_5_1 )
            {
             before(grammarAccess.getSeffForkActionAccess().getForksAssignment_5_1()); 
            // InternalRepoLang.g:5626:2: ( rule__SeffForkAction__ForksAssignment_5_1 )
            // InternalRepoLang.g:5626:3: rule__SeffForkAction__ForksAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__SeffForkAction__ForksAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSeffForkActionAccess().getForksAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffForkAction__Group_5__1__Impl"


    // $ANTLR start "rule__SeffFork__Group__0"
    // InternalRepoLang.g:5635:1: rule__SeffFork__Group__0 : rule__SeffFork__Group__0__Impl rule__SeffFork__Group__1 ;
    public final void rule__SeffFork__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5639:1: ( rule__SeffFork__Group__0__Impl rule__SeffFork__Group__1 )
            // InternalRepoLang.g:5640:2: rule__SeffFork__Group__0__Impl rule__SeffFork__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__SeffFork__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeffFork__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffFork__Group__0"


    // $ANTLR start "rule__SeffFork__Group__0__Impl"
    // InternalRepoLang.g:5647:1: rule__SeffFork__Group__0__Impl : ( ( rule__SeffFork__NameAssignment_0 )? ) ;
    public final void rule__SeffFork__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5651:1: ( ( ( rule__SeffFork__NameAssignment_0 )? ) )
            // InternalRepoLang.g:5652:1: ( ( rule__SeffFork__NameAssignment_0 )? )
            {
            // InternalRepoLang.g:5652:1: ( ( rule__SeffFork__NameAssignment_0 )? )
            // InternalRepoLang.g:5653:2: ( rule__SeffFork__NameAssignment_0 )?
            {
             before(grammarAccess.getSeffForkAccess().getNameAssignment_0()); 
            // InternalRepoLang.g:5654:2: ( rule__SeffFork__NameAssignment_0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalRepoLang.g:5654:3: rule__SeffFork__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SeffFork__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSeffForkAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffFork__Group__0__Impl"


    // $ANTLR start "rule__SeffFork__Group__1"
    // InternalRepoLang.g:5662:1: rule__SeffFork__Group__1 : rule__SeffFork__Group__1__Impl ;
    public final void rule__SeffFork__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5666:1: ( rule__SeffFork__Group__1__Impl )
            // InternalRepoLang.g:5667:2: rule__SeffFork__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeffFork__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffFork__Group__1"


    // $ANTLR start "rule__SeffFork__Group__1__Impl"
    // InternalRepoLang.g:5673:1: rule__SeffFork__Group__1__Impl : ( ( rule__SeffFork__SeffAssignment_1 ) ) ;
    public final void rule__SeffFork__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5677:1: ( ( ( rule__SeffFork__SeffAssignment_1 ) ) )
            // InternalRepoLang.g:5678:1: ( ( rule__SeffFork__SeffAssignment_1 ) )
            {
            // InternalRepoLang.g:5678:1: ( ( rule__SeffFork__SeffAssignment_1 ) )
            // InternalRepoLang.g:5679:2: ( rule__SeffFork__SeffAssignment_1 )
            {
             before(grammarAccess.getSeffForkAccess().getSeffAssignment_1()); 
            // InternalRepoLang.g:5680:2: ( rule__SeffFork__SeffAssignment_1 )
            // InternalRepoLang.g:5680:3: rule__SeffFork__SeffAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SeffFork__SeffAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSeffForkAccess().getSeffAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffFork__Group__1__Impl"


    // $ANTLR start "rule__SubSeff__Group__0"
    // InternalRepoLang.g:5689:1: rule__SubSeff__Group__0 : rule__SubSeff__Group__0__Impl rule__SubSeff__Group__1 ;
    public final void rule__SubSeff__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5693:1: ( rule__SubSeff__Group__0__Impl rule__SubSeff__Group__1 )
            // InternalRepoLang.g:5694:2: rule__SubSeff__Group__0__Impl rule__SubSeff__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__SubSeff__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSeff__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSeff__Group__0"


    // $ANTLR start "rule__SubSeff__Group__0__Impl"
    // InternalRepoLang.g:5701:1: rule__SubSeff__Group__0__Impl : ( '{' ) ;
    public final void rule__SubSeff__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5705:1: ( ( '{' ) )
            // InternalRepoLang.g:5706:1: ( '{' )
            {
            // InternalRepoLang.g:5706:1: ( '{' )
            // InternalRepoLang.g:5707:2: '{'
            {
             before(grammarAccess.getSubSeffAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSubSeffAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSeff__Group__0__Impl"


    // $ANTLR start "rule__SubSeff__Group__1"
    // InternalRepoLang.g:5716:1: rule__SubSeff__Group__1 : rule__SubSeff__Group__1__Impl rule__SubSeff__Group__2 ;
    public final void rule__SubSeff__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5720:1: ( rule__SubSeff__Group__1__Impl rule__SubSeff__Group__2 )
            // InternalRepoLang.g:5721:2: rule__SubSeff__Group__1__Impl rule__SubSeff__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__SubSeff__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSeff__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSeff__Group__1"


    // $ANTLR start "rule__SubSeff__Group__1__Impl"
    // InternalRepoLang.g:5728:1: rule__SubSeff__Group__1__Impl : ( ( ( rule__SubSeff__ActionsAssignment_1 ) ) ( ( rule__SubSeff__ActionsAssignment_1 )* ) ) ;
    public final void rule__SubSeff__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5732:1: ( ( ( ( rule__SubSeff__ActionsAssignment_1 ) ) ( ( rule__SubSeff__ActionsAssignment_1 )* ) ) )
            // InternalRepoLang.g:5733:1: ( ( ( rule__SubSeff__ActionsAssignment_1 ) ) ( ( rule__SubSeff__ActionsAssignment_1 )* ) )
            {
            // InternalRepoLang.g:5733:1: ( ( ( rule__SubSeff__ActionsAssignment_1 ) ) ( ( rule__SubSeff__ActionsAssignment_1 )* ) )
            // InternalRepoLang.g:5734:2: ( ( rule__SubSeff__ActionsAssignment_1 ) ) ( ( rule__SubSeff__ActionsAssignment_1 )* )
            {
            // InternalRepoLang.g:5734:2: ( ( rule__SubSeff__ActionsAssignment_1 ) )
            // InternalRepoLang.g:5735:3: ( rule__SubSeff__ActionsAssignment_1 )
            {
             before(grammarAccess.getSubSeffAccess().getActionsAssignment_1()); 
            // InternalRepoLang.g:5736:3: ( rule__SubSeff__ActionsAssignment_1 )
            // InternalRepoLang.g:5736:4: rule__SubSeff__ActionsAssignment_1
            {
            pushFollow(FOLLOW_30);
            rule__SubSeff__ActionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubSeffAccess().getActionsAssignment_1()); 

            }

            // InternalRepoLang.g:5739:2: ( ( rule__SubSeff__ActionsAssignment_1 )* )
            // InternalRepoLang.g:5740:3: ( rule__SubSeff__ActionsAssignment_1 )*
            {
             before(grammarAccess.getSubSeffAccess().getActionsAssignment_1()); 
            // InternalRepoLang.g:5741:3: ( rule__SubSeff__ActionsAssignment_1 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=38 && LA55_0<=44)||(LA55_0>=48 && LA55_0<=50)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalRepoLang.g:5741:4: rule__SubSeff__ActionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__SubSeff__ActionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getSubSeffAccess().getActionsAssignment_1()); 

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
    // $ANTLR end "rule__SubSeff__Group__1__Impl"


    // $ANTLR start "rule__SubSeff__Group__2"
    // InternalRepoLang.g:5750:1: rule__SubSeff__Group__2 : rule__SubSeff__Group__2__Impl ;
    public final void rule__SubSeff__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5754:1: ( rule__SubSeff__Group__2__Impl )
            // InternalRepoLang.g:5755:2: rule__SubSeff__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubSeff__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSeff__Group__2"


    // $ANTLR start "rule__SubSeff__Group__2__Impl"
    // InternalRepoLang.g:5761:1: rule__SubSeff__Group__2__Impl : ( '}' ) ;
    public final void rule__SubSeff__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5765:1: ( ( '}' ) )
            // InternalRepoLang.g:5766:1: ( '}' )
            {
            // InternalRepoLang.g:5766:1: ( '}' )
            // InternalRepoLang.g:5767:2: '}'
            {
             before(grammarAccess.getSubSeffAccess().getRightCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSubSeffAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSeff__Group__2__Impl"


    // $ANTLR start "rule__PassiveResource__Group__0"
    // InternalRepoLang.g:5777:1: rule__PassiveResource__Group__0 : rule__PassiveResource__Group__0__Impl rule__PassiveResource__Group__1 ;
    public final void rule__PassiveResource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5781:1: ( rule__PassiveResource__Group__0__Impl rule__PassiveResource__Group__1 )
            // InternalRepoLang.g:5782:2: rule__PassiveResource__Group__0__Impl rule__PassiveResource__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PassiveResource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PassiveResource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PassiveResource__Group__0"


    // $ANTLR start "rule__PassiveResource__Group__0__Impl"
    // InternalRepoLang.g:5789:1: rule__PassiveResource__Group__0__Impl : ( 'PassiveResource' ) ;
    public final void rule__PassiveResource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5793:1: ( ( 'PassiveResource' ) )
            // InternalRepoLang.g:5794:1: ( 'PassiveResource' )
            {
            // InternalRepoLang.g:5794:1: ( 'PassiveResource' )
            // InternalRepoLang.g:5795:2: 'PassiveResource'
            {
             before(grammarAccess.getPassiveResourceAccess().getPassiveResourceKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getPassiveResourceAccess().getPassiveResourceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PassiveResource__Group__0__Impl"


    // $ANTLR start "rule__PassiveResource__Group__1"
    // InternalRepoLang.g:5804:1: rule__PassiveResource__Group__1 : rule__PassiveResource__Group__1__Impl rule__PassiveResource__Group__2 ;
    public final void rule__PassiveResource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5808:1: ( rule__PassiveResource__Group__1__Impl rule__PassiveResource__Group__2 )
            // InternalRepoLang.g:5809:2: rule__PassiveResource__Group__1__Impl rule__PassiveResource__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__PassiveResource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PassiveResource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PassiveResource__Group__1"


    // $ANTLR start "rule__PassiveResource__Group__1__Impl"
    // InternalRepoLang.g:5816:1: rule__PassiveResource__Group__1__Impl : ( ( rule__PassiveResource__NameAssignment_1 ) ) ;
    public final void rule__PassiveResource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5820:1: ( ( ( rule__PassiveResource__NameAssignment_1 ) ) )
            // InternalRepoLang.g:5821:1: ( ( rule__PassiveResource__NameAssignment_1 ) )
            {
            // InternalRepoLang.g:5821:1: ( ( rule__PassiveResource__NameAssignment_1 ) )
            // InternalRepoLang.g:5822:2: ( rule__PassiveResource__NameAssignment_1 )
            {
             before(grammarAccess.getPassiveResourceAccess().getNameAssignment_1()); 
            // InternalRepoLang.g:5823:2: ( rule__PassiveResource__NameAssignment_1 )
            // InternalRepoLang.g:5823:3: rule__PassiveResource__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PassiveResource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPassiveResourceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PassiveResource__Group__1__Impl"


    // $ANTLR start "rule__PassiveResource__Group__2"
    // InternalRepoLang.g:5831:1: rule__PassiveResource__Group__2 : rule__PassiveResource__Group__2__Impl rule__PassiveResource__Group__3 ;
    public final void rule__PassiveResource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5835:1: ( rule__PassiveResource__Group__2__Impl rule__PassiveResource__Group__3 )
            // InternalRepoLang.g:5836:2: rule__PassiveResource__Group__2__Impl rule__PassiveResource__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__PassiveResource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PassiveResource__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PassiveResource__Group__2"


    // $ANTLR start "rule__PassiveResource__Group__2__Impl"
    // InternalRepoLang.g:5843:1: rule__PassiveResource__Group__2__Impl : ( '(' ) ;
    public final void rule__PassiveResource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5847:1: ( ( '(' ) )
            // InternalRepoLang.g:5848:1: ( '(' )
            {
            // InternalRepoLang.g:5848:1: ( '(' )
            // InternalRepoLang.g:5849:2: '('
            {
             before(grammarAccess.getPassiveResourceAccess().getLeftParenthesisKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPassiveResourceAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PassiveResource__Group__2__Impl"


    // $ANTLR start "rule__PassiveResource__Group__3"
    // InternalRepoLang.g:5858:1: rule__PassiveResource__Group__3 : rule__PassiveResource__Group__3__Impl rule__PassiveResource__Group__4 ;
    public final void rule__PassiveResource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5862:1: ( rule__PassiveResource__Group__3__Impl rule__PassiveResource__Group__4 )
            // InternalRepoLang.g:5863:2: rule__PassiveResource__Group__3__Impl rule__PassiveResource__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__PassiveResource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PassiveResource__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PassiveResource__Group__3"


    // $ANTLR start "rule__PassiveResource__Group__3__Impl"
    // InternalRepoLang.g:5870:1: rule__PassiveResource__Group__3__Impl : ( ( rule__PassiveResource__CapacityAssignment_3 ) ) ;
    public final void rule__PassiveResource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5874:1: ( ( ( rule__PassiveResource__CapacityAssignment_3 ) ) )
            // InternalRepoLang.g:5875:1: ( ( rule__PassiveResource__CapacityAssignment_3 ) )
            {
            // InternalRepoLang.g:5875:1: ( ( rule__PassiveResource__CapacityAssignment_3 ) )
            // InternalRepoLang.g:5876:2: ( rule__PassiveResource__CapacityAssignment_3 )
            {
             before(grammarAccess.getPassiveResourceAccess().getCapacityAssignment_3()); 
            // InternalRepoLang.g:5877:2: ( rule__PassiveResource__CapacityAssignment_3 )
            // InternalRepoLang.g:5877:3: rule__PassiveResource__CapacityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PassiveResource__CapacityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPassiveResourceAccess().getCapacityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PassiveResource__Group__3__Impl"


    // $ANTLR start "rule__PassiveResource__Group__4"
    // InternalRepoLang.g:5885:1: rule__PassiveResource__Group__4 : rule__PassiveResource__Group__4__Impl ;
    public final void rule__PassiveResource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5889:1: ( rule__PassiveResource__Group__4__Impl )
            // InternalRepoLang.g:5890:2: rule__PassiveResource__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PassiveResource__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PassiveResource__Group__4"


    // $ANTLR start "rule__PassiveResource__Group__4__Impl"
    // InternalRepoLang.g:5896:1: rule__PassiveResource__Group__4__Impl : ( ')' ) ;
    public final void rule__PassiveResource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5900:1: ( ( ')' ) )
            // InternalRepoLang.g:5901:1: ( ')' )
            {
            // InternalRepoLang.g:5901:1: ( ')' )
            // InternalRepoLang.g:5902:2: ')'
            {
             before(grammarAccess.getPassiveResourceAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPassiveResourceAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PassiveResource__Group__4__Impl"


    // $ANTLR start "rule__Probability__Group__0"
    // InternalRepoLang.g:5912:1: rule__Probability__Group__0 : rule__Probability__Group__0__Impl rule__Probability__Group__1 ;
    public final void rule__Probability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5916:1: ( rule__Probability__Group__0__Impl rule__Probability__Group__1 )
            // InternalRepoLang.g:5917:2: rule__Probability__Group__0__Impl rule__Probability__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Probability__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Probability__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probability__Group__0"


    // $ANTLR start "rule__Probability__Group__0__Impl"
    // InternalRepoLang.g:5924:1: rule__Probability__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Probability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5928:1: ( ( RULE_INT ) )
            // InternalRepoLang.g:5929:1: ( RULE_INT )
            {
            // InternalRepoLang.g:5929:1: ( RULE_INT )
            // InternalRepoLang.g:5930:2: RULE_INT
            {
             before(grammarAccess.getProbabilityAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getProbabilityAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probability__Group__0__Impl"


    // $ANTLR start "rule__Probability__Group__1"
    // InternalRepoLang.g:5939:1: rule__Probability__Group__1 : rule__Probability__Group__1__Impl ;
    public final void rule__Probability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5943:1: ( rule__Probability__Group__1__Impl )
            // InternalRepoLang.g:5944:2: rule__Probability__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Probability__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probability__Group__1"


    // $ANTLR start "rule__Probability__Group__1__Impl"
    // InternalRepoLang.g:5950:1: rule__Probability__Group__1__Impl : ( ( rule__Probability__Group_1__0 ) ) ;
    public final void rule__Probability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5954:1: ( ( ( rule__Probability__Group_1__0 ) ) )
            // InternalRepoLang.g:5955:1: ( ( rule__Probability__Group_1__0 ) )
            {
            // InternalRepoLang.g:5955:1: ( ( rule__Probability__Group_1__0 ) )
            // InternalRepoLang.g:5956:2: ( rule__Probability__Group_1__0 )
            {
             before(grammarAccess.getProbabilityAccess().getGroup_1()); 
            // InternalRepoLang.g:5957:2: ( rule__Probability__Group_1__0 )
            // InternalRepoLang.g:5957:3: rule__Probability__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Probability__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getProbabilityAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probability__Group__1__Impl"


    // $ANTLR start "rule__Probability__Group_1__0"
    // InternalRepoLang.g:5966:1: rule__Probability__Group_1__0 : rule__Probability__Group_1__0__Impl rule__Probability__Group_1__1 ;
    public final void rule__Probability__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5970:1: ( rule__Probability__Group_1__0__Impl rule__Probability__Group_1__1 )
            // InternalRepoLang.g:5971:2: rule__Probability__Group_1__0__Impl rule__Probability__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__Probability__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Probability__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probability__Group_1__0"


    // $ANTLR start "rule__Probability__Group_1__0__Impl"
    // InternalRepoLang.g:5978:1: rule__Probability__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Probability__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5982:1: ( ( '.' ) )
            // InternalRepoLang.g:5983:1: ( '.' )
            {
            // InternalRepoLang.g:5983:1: ( '.' )
            // InternalRepoLang.g:5984:2: '.'
            {
             before(grammarAccess.getProbabilityAccess().getFullStopKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProbabilityAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probability__Group_1__0__Impl"


    // $ANTLR start "rule__Probability__Group_1__1"
    // InternalRepoLang.g:5993:1: rule__Probability__Group_1__1 : rule__Probability__Group_1__1__Impl ;
    public final void rule__Probability__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:5997:1: ( rule__Probability__Group_1__1__Impl )
            // InternalRepoLang.g:5998:2: rule__Probability__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Probability__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probability__Group_1__1"


    // $ANTLR start "rule__Probability__Group_1__1__Impl"
    // InternalRepoLang.g:6004:1: rule__Probability__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Probability__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6008:1: ( ( RULE_INT ) )
            // InternalRepoLang.g:6009:1: ( RULE_INT )
            {
            // InternalRepoLang.g:6009:1: ( RULE_INT )
            // InternalRepoLang.g:6010:2: RULE_INT
            {
             before(grammarAccess.getProbabilityAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getProbabilityAccess().getINTTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probability__Group_1__1__Impl"


    // $ANTLR start "rule__Repository__NameAssignment_1"
    // InternalRepoLang.g:6020:1: rule__Repository__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Repository__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6024:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:6025:2: ( RULE_ID )
            {
            // InternalRepoLang.g:6025:2: ( RULE_ID )
            // InternalRepoLang.g:6026:3: RULE_ID
            {
             before(grammarAccess.getRepositoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRepositoryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__NameAssignment_1"


    // $ANTLR start "rule__Repository__ImportsAssignment_2"
    // InternalRepoLang.g:6035:1: rule__Repository__ImportsAssignment_2 : ( ruleImportedRepository ) ;
    public final void rule__Repository__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6039:1: ( ( ruleImportedRepository ) )
            // InternalRepoLang.g:6040:2: ( ruleImportedRepository )
            {
            // InternalRepoLang.g:6040:2: ( ruleImportedRepository )
            // InternalRepoLang.g:6041:3: ruleImportedRepository
            {
             before(grammarAccess.getRepositoryAccess().getImportsImportedRepositoryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImportedRepository();

            state._fsp--;

             after(grammarAccess.getRepositoryAccess().getImportsImportedRepositoryParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__ImportsAssignment_2"


    // $ANTLR start "rule__Repository__TypesAssignment_3"
    // InternalRepoLang.g:6050:1: rule__Repository__TypesAssignment_3 : ( ruleTypeRepo ) ;
    public final void rule__Repository__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6054:1: ( ( ruleTypeRepo ) )
            // InternalRepoLang.g:6055:2: ( ruleTypeRepo )
            {
            // InternalRepoLang.g:6055:2: ( ruleTypeRepo )
            // InternalRepoLang.g:6056:3: ruleTypeRepo
            {
             before(grammarAccess.getRepositoryAccess().getTypesTypeRepoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeRepo();

            state._fsp--;

             after(grammarAccess.getRepositoryAccess().getTypesTypeRepoParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__TypesAssignment_3"


    // $ANTLR start "rule__Repository__ElementsAssignment_4"
    // InternalRepoLang.g:6065:1: rule__Repository__ElementsAssignment_4 : ( ruleNamedElement ) ;
    public final void rule__Repository__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6069:1: ( ( ruleNamedElement ) )
            // InternalRepoLang.g:6070:2: ( ruleNamedElement )
            {
            // InternalRepoLang.g:6070:2: ( ruleNamedElement )
            // InternalRepoLang.g:6071:3: ruleNamedElement
            {
             before(grammarAccess.getRepositoryAccess().getElementsNamedElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleNamedElement();

            state._fsp--;

             after(grammarAccess.getRepositoryAccess().getElementsNamedElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__ElementsAssignment_4"


    // $ANTLR start "rule__ImportedRepository__ImportedNamespaceAssignment_1"
    // InternalRepoLang.g:6080:1: rule__ImportedRepository__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__ImportedRepository__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6084:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalRepoLang.g:6085:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalRepoLang.g:6085:2: ( ruleQualifiedNameWithWildcard )
            // InternalRepoLang.g:6086:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportedRepositoryAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportedRepositoryAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedRepository__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__TypeRepo__DataTypes__RepositoryAssignment_2"
    // InternalRepoLang.g:6095:1: rule__TypeRepo__DataTypes__RepositoryAssignment_2 : ( ruleCustomType ) ;
    public final void rule__TypeRepo__DataTypes__RepositoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6099:1: ( ( ruleCustomType ) )
            // InternalRepoLang.g:6100:2: ( ruleCustomType )
            {
            // InternalRepoLang.g:6100:2: ( ruleCustomType )
            // InternalRepoLang.g:6101:3: ruleCustomType
            {
             before(grammarAccess.getTypeRepoAccess().getDataTypes__RepositoryCustomTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCustomType();

            state._fsp--;

             after(grammarAccess.getTypeRepoAccess().getDataTypes__RepositoryCustomTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRepo__DataTypes__RepositoryAssignment_2"


    // $ANTLR start "rule__Interface__NameAssignment_1"
    // InternalRepoLang.g:6110:1: rule__Interface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6114:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:6115:2: ( RULE_ID )
            {
            // InternalRepoLang.g:6115:2: ( RULE_ID )
            // InternalRepoLang.g:6116:3: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__NameAssignment_1"


    // $ANTLR start "rule__Interface__SignatureAssignment_2_1"
    // InternalRepoLang.g:6125:1: rule__Interface__SignatureAssignment_2_1 : ( ruleSignature ) ;
    public final void rule__Interface__SignatureAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6129:1: ( ( ruleSignature ) )
            // InternalRepoLang.g:6130:2: ( ruleSignature )
            {
            // InternalRepoLang.g:6130:2: ( ruleSignature )
            // InternalRepoLang.g:6131:3: ruleSignature
            {
             before(grammarAccess.getInterfaceAccess().getSignatureSignatureParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getSignatureSignatureParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__SignatureAssignment_2_1"


    // $ANTLR start "rule__Signature__NameAssignment_0"
    // InternalRepoLang.g:6140:1: rule__Signature__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Signature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6144:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:6145:2: ( RULE_ID )
            {
            // InternalRepoLang.g:6145:2: ( RULE_ID )
            // InternalRepoLang.g:6146:3: RULE_ID
            {
             before(grammarAccess.getSignatureAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__NameAssignment_0"


    // $ANTLR start "rule__Signature__ParametersAssignment_1_1"
    // InternalRepoLang.g:6155:1: rule__Signature__ParametersAssignment_1_1 : ( ruleSignatureParameter ) ;
    public final void rule__Signature__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6159:1: ( ( ruleSignatureParameter ) )
            // InternalRepoLang.g:6160:2: ( ruleSignatureParameter )
            {
            // InternalRepoLang.g:6160:2: ( ruleSignatureParameter )
            // InternalRepoLang.g:6161:3: ruleSignatureParameter
            {
             before(grammarAccess.getSignatureAccess().getParametersSignatureParameterParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSignatureParameter();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getParametersSignatureParameterParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__ParametersAssignment_1_1"


    // $ANTLR start "rule__Signature__ParametersAssignment_1_2_1"
    // InternalRepoLang.g:6170:1: rule__Signature__ParametersAssignment_1_2_1 : ( ruleSignatureParameter ) ;
    public final void rule__Signature__ParametersAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6174:1: ( ( ruleSignatureParameter ) )
            // InternalRepoLang.g:6175:2: ( ruleSignatureParameter )
            {
            // InternalRepoLang.g:6175:2: ( ruleSignatureParameter )
            // InternalRepoLang.g:6176:3: ruleSignatureParameter
            {
             before(grammarAccess.getSignatureAccess().getParametersSignatureParameterParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSignatureParameter();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getParametersSignatureParameterParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__ParametersAssignment_1_2_1"


    // $ANTLR start "rule__SignatureParameter__NameAssignment_0"
    // InternalRepoLang.g:6185:1: rule__SignatureParameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SignatureParameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6189:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:6190:2: ( RULE_ID )
            {
            // InternalRepoLang.g:6190:2: ( RULE_ID )
            // InternalRepoLang.g:6191:3: RULE_ID
            {
             before(grammarAccess.getSignatureParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSignatureParameterAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureParameter__NameAssignment_0"


    // $ANTLR start "rule__SignatureParameter__TypeAssignment_2"
    // InternalRepoLang.g:6200:1: rule__SignatureParameter__TypeAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__SignatureParameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6204:1: ( ( ( ruleFQN ) ) )
            // InternalRepoLang.g:6205:2: ( ( ruleFQN ) )
            {
            // InternalRepoLang.g:6205:2: ( ( ruleFQN ) )
            // InternalRepoLang.g:6206:3: ( ruleFQN )
            {
             before(grammarAccess.getSignatureParameterAccess().getTypeDataTypeCrossReference_2_0()); 
            // InternalRepoLang.g:6207:3: ( ruleFQN )
            // InternalRepoLang.g:6208:4: ruleFQN
            {
             before(grammarAccess.getSignatureParameterAccess().getTypeDataTypeFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getSignatureParameterAccess().getTypeDataTypeFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSignatureParameterAccess().getTypeDataTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureParameter__TypeAssignment_2"


    // $ANTLR start "rule__CustomCompositeType__EntityNameAssignment_1"
    // InternalRepoLang.g:6219:1: rule__CustomCompositeType__EntityNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CustomCompositeType__EntityNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6223:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:6224:2: ( RULE_ID )
            {
            // InternalRepoLang.g:6224:2: ( RULE_ID )
            // InternalRepoLang.g:6225:3: RULE_ID
            {
             before(grammarAccess.getCustomCompositeTypeAccess().getEntityNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCustomCompositeTypeAccess().getEntityNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCompositeType__EntityNameAssignment_1"


    // $ANTLR start "rule__CustomCompositeType__ParentType_CompositeDataTypeAssignment_2_1"
    // InternalRepoLang.g:6234:1: rule__CustomCompositeType__ParentType_CompositeDataTypeAssignment_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__CustomCompositeType__ParentType_CompositeDataTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6238:1: ( ( ( ruleFQN ) ) )
            // InternalRepoLang.g:6239:2: ( ( ruleFQN ) )
            {
            // InternalRepoLang.g:6239:2: ( ( ruleFQN ) )
            // InternalRepoLang.g:6240:3: ( ruleFQN )
            {
             before(grammarAccess.getCustomCompositeTypeAccess().getParentType_CompositeDataTypeCompositeDataTypeCrossReference_2_1_0()); 
            // InternalRepoLang.g:6241:3: ( ruleFQN )
            // InternalRepoLang.g:6242:4: ruleFQN
            {
             before(grammarAccess.getCustomCompositeTypeAccess().getParentType_CompositeDataTypeCompositeDataTypeFQNParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getCustomCompositeTypeAccess().getParentType_CompositeDataTypeCompositeDataTypeFQNParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getCustomCompositeTypeAccess().getParentType_CompositeDataTypeCompositeDataTypeCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCompositeType__ParentType_CompositeDataTypeAssignment_2_1"


    // $ANTLR start "rule__CustomCompositeType__InnerDeclaration_CompositeDataTypeAssignment_4"
    // InternalRepoLang.g:6253:1: rule__CustomCompositeType__InnerDeclaration_CompositeDataTypeAssignment_4 : ( ruleCustomInnerDeclaration ) ;
    public final void rule__CustomCompositeType__InnerDeclaration_CompositeDataTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6257:1: ( ( ruleCustomInnerDeclaration ) )
            // InternalRepoLang.g:6258:2: ( ruleCustomInnerDeclaration )
            {
            // InternalRepoLang.g:6258:2: ( ruleCustomInnerDeclaration )
            // InternalRepoLang.g:6259:3: ruleCustomInnerDeclaration
            {
             before(grammarAccess.getCustomCompositeTypeAccess().getInnerDeclaration_CompositeDataTypeCustomInnerDeclarationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCustomInnerDeclaration();

            state._fsp--;

             after(grammarAccess.getCustomCompositeTypeAccess().getInnerDeclaration_CompositeDataTypeCustomInnerDeclarationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCompositeType__InnerDeclaration_CompositeDataTypeAssignment_4"


    // $ANTLR start "rule__CustomInnerDeclaration__EntityNameAssignment_0"
    // InternalRepoLang.g:6268:1: rule__CustomInnerDeclaration__EntityNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__CustomInnerDeclaration__EntityNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6272:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:6273:2: ( RULE_ID )
            {
            // InternalRepoLang.g:6273:2: ( RULE_ID )
            // InternalRepoLang.g:6274:3: RULE_ID
            {
             before(grammarAccess.getCustomInnerDeclarationAccess().getEntityNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCustomInnerDeclarationAccess().getEntityNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomInnerDeclaration__EntityNameAssignment_0"


    // $ANTLR start "rule__CustomInnerDeclaration__Datatype_InnerDeclarationAssignment_2"
    // InternalRepoLang.g:6283:1: rule__CustomInnerDeclaration__Datatype_InnerDeclarationAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__CustomInnerDeclaration__Datatype_InnerDeclarationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6287:1: ( ( ( ruleFQN ) ) )
            // InternalRepoLang.g:6288:2: ( ( ruleFQN ) )
            {
            // InternalRepoLang.g:6288:2: ( ( ruleFQN ) )
            // InternalRepoLang.g:6289:3: ( ruleFQN )
            {
             before(grammarAccess.getCustomInnerDeclarationAccess().getDatatype_InnerDeclarationDataTypeCrossReference_2_0()); 
            // InternalRepoLang.g:6290:3: ( ruleFQN )
            // InternalRepoLang.g:6291:4: ruleFQN
            {
             before(grammarAccess.getCustomInnerDeclarationAccess().getDatatype_InnerDeclarationDataTypeFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getCustomInnerDeclarationAccess().getDatatype_InnerDeclarationDataTypeFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getCustomInnerDeclarationAccess().getDatatype_InnerDeclarationDataTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomInnerDeclaration__Datatype_InnerDeclarationAssignment_2"


    // $ANTLR start "rule__CustomCollectionType__EntityNameAssignment_1"
    // InternalRepoLang.g:6302:1: rule__CustomCollectionType__EntityNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CustomCollectionType__EntityNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6306:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:6307:2: ( RULE_ID )
            {
            // InternalRepoLang.g:6307:2: ( RULE_ID )
            // InternalRepoLang.g:6308:3: RULE_ID
            {
             before(grammarAccess.getCustomCollectionTypeAccess().getEntityNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCustomCollectionTypeAccess().getEntityNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCollectionType__EntityNameAssignment_1"


    // $ANTLR start "rule__CustomCollectionType__InnerType_CollectionDataTypeAssignment_3"
    // InternalRepoLang.g:6317:1: rule__CustomCollectionType__InnerType_CollectionDataTypeAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__CustomCollectionType__InnerType_CollectionDataTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6321:1: ( ( ( ruleFQN ) ) )
            // InternalRepoLang.g:6322:2: ( ( ruleFQN ) )
            {
            // InternalRepoLang.g:6322:2: ( ( ruleFQN ) )
            // InternalRepoLang.g:6323:3: ( ruleFQN )
            {
             before(grammarAccess.getCustomCollectionTypeAccess().getInnerType_CollectionDataTypeDataTypeCrossReference_3_0()); 
            // InternalRepoLang.g:6324:3: ( ruleFQN )
            // InternalRepoLang.g:6325:4: ruleFQN
            {
             before(grammarAccess.getCustomCollectionTypeAccess().getInnerType_CollectionDataTypeDataTypeFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getCustomCollectionTypeAccess().getInnerType_CollectionDataTypeDataTypeFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCustomCollectionTypeAccess().getInnerType_CollectionDataTypeDataTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomCollectionType__InnerType_CollectionDataTypeAssignment_3"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // InternalRepoLang.g:6336:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6340:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:6341:2: ( RULE_ID )
            {
            // InternalRepoLang.g:6341:2: ( RULE_ID )
            // InternalRepoLang.g:6342:3: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_1"


    // $ANTLR start "rule__Component__ProvidesAssignment_2_1"
    // InternalRepoLang.g:6351:1: rule__Component__ProvidesAssignment_2_1 : ( ruleRoleSpecification ) ;
    public final void rule__Component__ProvidesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6355:1: ( ( ruleRoleSpecification ) )
            // InternalRepoLang.g:6356:2: ( ruleRoleSpecification )
            {
            // InternalRepoLang.g:6356:2: ( ruleRoleSpecification )
            // InternalRepoLang.g:6357:3: ruleRoleSpecification
            {
             before(grammarAccess.getComponentAccess().getProvidesRoleSpecificationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleSpecification();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getProvidesRoleSpecificationParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ProvidesAssignment_2_1"


    // $ANTLR start "rule__Component__ProvidesAssignment_2_2_1"
    // InternalRepoLang.g:6366:1: rule__Component__ProvidesAssignment_2_2_1 : ( ruleRoleSpecification ) ;
    public final void rule__Component__ProvidesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6370:1: ( ( ruleRoleSpecification ) )
            // InternalRepoLang.g:6371:2: ( ruleRoleSpecification )
            {
            // InternalRepoLang.g:6371:2: ( ruleRoleSpecification )
            // InternalRepoLang.g:6372:3: ruleRoleSpecification
            {
             before(grammarAccess.getComponentAccess().getProvidesRoleSpecificationParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleSpecification();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getProvidesRoleSpecificationParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ProvidesAssignment_2_2_1"


    // $ANTLR start "rule__Component__RequiresAssignment_3_1"
    // InternalRepoLang.g:6381:1: rule__Component__RequiresAssignment_3_1 : ( ruleRoleSpecification ) ;
    public final void rule__Component__RequiresAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6385:1: ( ( ruleRoleSpecification ) )
            // InternalRepoLang.g:6386:2: ( ruleRoleSpecification )
            {
            // InternalRepoLang.g:6386:2: ( ruleRoleSpecification )
            // InternalRepoLang.g:6387:3: ruleRoleSpecification
            {
             before(grammarAccess.getComponentAccess().getRequiresRoleSpecificationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleSpecification();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getRequiresRoleSpecificationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__RequiresAssignment_3_1"


    // $ANTLR start "rule__Component__RequiresAssignment_3_2_1"
    // InternalRepoLang.g:6396:1: rule__Component__RequiresAssignment_3_2_1 : ( ruleRoleSpecification ) ;
    public final void rule__Component__RequiresAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6400:1: ( ( ruleRoleSpecification ) )
            // InternalRepoLang.g:6401:2: ( ruleRoleSpecification )
            {
            // InternalRepoLang.g:6401:2: ( ruleRoleSpecification )
            // InternalRepoLang.g:6402:3: ruleRoleSpecification
            {
             before(grammarAccess.getComponentAccess().getRequiresRoleSpecificationParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleSpecification();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getRequiresRoleSpecificationParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__RequiresAssignment_3_2_1"


    // $ANTLR start "rule__Component__SeffsAssignment_4_1"
    // InternalRepoLang.g:6411:1: rule__Component__SeffsAssignment_4_1 : ( ruleSeff ) ;
    public final void rule__Component__SeffsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6415:1: ( ( ruleSeff ) )
            // InternalRepoLang.g:6416:2: ( ruleSeff )
            {
            // InternalRepoLang.g:6416:2: ( ruleSeff )
            // InternalRepoLang.g:6417:3: ruleSeff
            {
             before(grammarAccess.getComponentAccess().getSeffsSeffParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSeff();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getSeffsSeffParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__SeffsAssignment_4_1"


    // $ANTLR start "rule__Component__PassiveResourcesAssignment_4_2"
    // InternalRepoLang.g:6426:1: rule__Component__PassiveResourcesAssignment_4_2 : ( rulePassiveResource ) ;
    public final void rule__Component__PassiveResourcesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6430:1: ( ( rulePassiveResource ) )
            // InternalRepoLang.g:6431:2: ( rulePassiveResource )
            {
            // InternalRepoLang.g:6431:2: ( rulePassiveResource )
            // InternalRepoLang.g:6432:3: rulePassiveResource
            {
             before(grammarAccess.getComponentAccess().getPassiveResourcesPassiveResourceParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            rulePassiveResource();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getPassiveResourcesPassiveResourceParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__PassiveResourcesAssignment_4_2"


    // $ANTLR start "rule__RoleSpecification__InterfaceAssignment_0"
    // InternalRepoLang.g:6441:1: rule__RoleSpecification__InterfaceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RoleSpecification__InterfaceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6445:1: ( ( ( RULE_ID ) ) )
            // InternalRepoLang.g:6446:2: ( ( RULE_ID ) )
            {
            // InternalRepoLang.g:6446:2: ( ( RULE_ID ) )
            // InternalRepoLang.g:6447:3: ( RULE_ID )
            {
             before(grammarAccess.getRoleSpecificationAccess().getInterfaceInterfaceCrossReference_0_0()); 
            // InternalRepoLang.g:6448:3: ( RULE_ID )
            // InternalRepoLang.g:6449:4: RULE_ID
            {
             before(grammarAccess.getRoleSpecificationAccess().getInterfaceInterfaceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRoleSpecificationAccess().getInterfaceInterfaceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRoleSpecificationAccess().getInterfaceInterfaceCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSpecification__InterfaceAssignment_0"


    // $ANTLR start "rule__RoleSpecification__NameAssignment_2"
    // InternalRepoLang.g:6460:1: rule__RoleSpecification__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RoleSpecification__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6464:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:6465:2: ( RULE_ID )
            {
            // InternalRepoLang.g:6465:2: ( RULE_ID )
            // InternalRepoLang.g:6466:3: RULE_ID
            {
             before(grammarAccess.getRoleSpecificationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRoleSpecificationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSpecification__NameAssignment_2"


    // $ANTLR start "rule__Seff__NameAssignment_1"
    // InternalRepoLang.g:6475:1: rule__Seff__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Seff__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6479:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:6480:2: ( RULE_ID )
            {
            // InternalRepoLang.g:6480:2: ( RULE_ID )
            // InternalRepoLang.g:6481:3: RULE_ID
            {
             before(grammarAccess.getSeffAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSeffAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seff__NameAssignment_1"


    // $ANTLR start "rule__Seff__RoleAssignment_3"
    // InternalRepoLang.g:6490:1: rule__Seff__RoleAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Seff__RoleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6494:1: ( ( ( RULE_ID ) ) )
            // InternalRepoLang.g:6495:2: ( ( RULE_ID ) )
            {
            // InternalRepoLang.g:6495:2: ( ( RULE_ID ) )
            // InternalRepoLang.g:6496:3: ( RULE_ID )
            {
             before(grammarAccess.getSeffAccess().getRoleRoleSpecificationCrossReference_3_0()); 
            // InternalRepoLang.g:6497:3: ( RULE_ID )
            // InternalRepoLang.g:6498:4: RULE_ID
            {
             before(grammarAccess.getSeffAccess().getRoleRoleSpecificationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSeffAccess().getRoleRoleSpecificationIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSeffAccess().getRoleRoleSpecificationCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seff__RoleAssignment_3"


    // $ANTLR start "rule__Seff__SignatureAssignment_4"
    // InternalRepoLang.g:6509:1: rule__Seff__SignatureAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__Seff__SignatureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6513:1: ( ( ( ruleFQN ) ) )
            // InternalRepoLang.g:6514:2: ( ( ruleFQN ) )
            {
            // InternalRepoLang.g:6514:2: ( ( ruleFQN ) )
            // InternalRepoLang.g:6515:3: ( ruleFQN )
            {
             before(grammarAccess.getSeffAccess().getSignatureSignatureCrossReference_4_0()); 
            // InternalRepoLang.g:6516:3: ( ruleFQN )
            // InternalRepoLang.g:6517:4: ruleFQN
            {
             before(grammarAccess.getSeffAccess().getSignatureSignatureFQNParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getSeffAccess().getSignatureSignatureFQNParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSeffAccess().getSignatureSignatureCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seff__SignatureAssignment_4"


    // $ANTLR start "rule__Seff__ActionsAssignment_6"
    // InternalRepoLang.g:6528:1: rule__Seff__ActionsAssignment_6 : ( ruleSeffAction ) ;
    public final void rule__Seff__ActionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6532:1: ( ( ruleSeffAction ) )
            // InternalRepoLang.g:6533:2: ( ruleSeffAction )
            {
            // InternalRepoLang.g:6533:2: ( ruleSeffAction )
            // InternalRepoLang.g:6534:3: ruleSeffAction
            {
             before(grammarAccess.getSeffAccess().getActionsSeffActionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSeffAction();

            state._fsp--;

             after(grammarAccess.getSeffAccess().getActionsSeffActionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seff__ActionsAssignment_6"


    // $ANTLR start "rule__SeffInternalAction__NameAssignment_1"
    // InternalRepoLang.g:6543:1: rule__SeffInternalAction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SeffInternalAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6547:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:6548:2: ( RULE_ID )
            {
            // InternalRepoLang.g:6548:2: ( RULE_ID )
            // InternalRepoLang.g:6549:3: RULE_ID
            {
             before(grammarAccess.getSeffInternalActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSeffInternalActionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffInternalAction__NameAssignment_1"


    // $ANTLR start "rule__SeffInternalAction__DemandTypeAssignment_2"
    // InternalRepoLang.g:6558:1: rule__SeffInternalAction__DemandTypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__SeffInternalAction__DemandTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6562:1: ( ( ( RULE_ID ) ) )
            // InternalRepoLang.g:6563:2: ( ( RULE_ID ) )
            {
            // InternalRepoLang.g:6563:2: ( ( RULE_ID ) )
            // InternalRepoLang.g:6564:3: ( RULE_ID )
            {
             before(grammarAccess.getSeffInternalActionAccess().getDemandTypeProcessingResourceTypeCrossReference_2_0()); 
            // InternalRepoLang.g:6565:3: ( RULE_ID )
            // InternalRepoLang.g:6566:4: RULE_ID
            {
             before(grammarAccess.getSeffInternalActionAccess().getDemandTypeProcessingResourceTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSeffInternalActionAccess().getDemandTypeProcessingResourceTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSeffInternalActionAccess().getDemandTypeProcessingResourceTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffInternalAction__DemandTypeAssignment_2"


    // $ANTLR start "rule__SeffInternalAction__DemandAssignment_3"
    // InternalRepoLang.g:6577:1: rule__SeffInternalAction__DemandAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SeffInternalAction__DemandAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6581:1: ( ( RULE_STRING ) )
            // InternalRepoLang.g:6582:2: ( RULE_STRING )
            {
            // InternalRepoLang.g:6582:2: ( RULE_STRING )
            // InternalRepoLang.g:6583:3: RULE_STRING
            {
             before(grammarAccess.getSeffInternalActionAccess().getDemandSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSeffInternalActionAccess().getDemandSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffInternalAction__DemandAssignment_3"


    // $ANTLR start "rule__SeffAcquireAction__NameAssignment_1"
    // InternalRepoLang.g:6592:1: rule__SeffAcquireAction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SeffAcquireAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6596:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:6597:2: ( RULE_ID )
            {
            // InternalRepoLang.g:6597:2: ( RULE_ID )
            // InternalRepoLang.g:6598:3: RULE_ID
            {
             before(grammarAccess.getSeffAcquireActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSeffAcquireActionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffAcquireAction__NameAssignment_1"


    // $ANTLR start "rule__SeffAcquireAction__ResourceAssignment_2"
    // InternalRepoLang.g:6607:1: rule__SeffAcquireAction__ResourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__SeffAcquireAction__ResourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6611:1: ( ( ( RULE_ID ) ) )
            // InternalRepoLang.g:6612:2: ( ( RULE_ID ) )
            {
            // InternalRepoLang.g:6612:2: ( ( RULE_ID ) )
            // InternalRepoLang.g:6613:3: ( RULE_ID )
            {
             before(grammarAccess.getSeffAcquireActionAccess().getResourcePassiveResourceCrossReference_2_0()); 
            // InternalRepoLang.g:6614:3: ( RULE_ID )
            // InternalRepoLang.g:6615:4: RULE_ID
            {
             before(grammarAccess.getSeffAcquireActionAccess().getResourcePassiveResourceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSeffAcquireActionAccess().getResourcePassiveResourceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSeffAcquireActionAccess().getResourcePassiveResourceCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffAcquireAction__ResourceAssignment_2"


    // $ANTLR start "rule__SeffAcquireAction__AmountAssignment_3_1"
    // InternalRepoLang.g:6626:1: rule__SeffAcquireAction__AmountAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__SeffAcquireAction__AmountAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6630:1: ( ( RULE_INT ) )
            // InternalRepoLang.g:6631:2: ( RULE_INT )
            {
            // InternalRepoLang.g:6631:2: ( RULE_INT )
            // InternalRepoLang.g:6632:3: RULE_INT
            {
             before(grammarAccess.getSeffAcquireActionAccess().getAmountINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSeffAcquireActionAccess().getAmountINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffAcquireAction__AmountAssignment_3_1"


    // $ANTLR start "rule__SeffReleaseAction__NameAssignment_1"
    // InternalRepoLang.g:6641:1: rule__SeffReleaseAction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SeffReleaseAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6645:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:6646:2: ( RULE_ID )
            {
            // InternalRepoLang.g:6646:2: ( RULE_ID )
            // InternalRepoLang.g:6647:3: RULE_ID
            {
             before(grammarAccess.getSeffReleaseActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSeffReleaseActionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReleaseAction__NameAssignment_1"


    // $ANTLR start "rule__SeffReleaseAction__ResourceAssignment_2"
    // InternalRepoLang.g:6656:1: rule__SeffReleaseAction__ResourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__SeffReleaseAction__ResourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6660:1: ( ( ( RULE_ID ) ) )
            // InternalRepoLang.g:6661:2: ( ( RULE_ID ) )
            {
            // InternalRepoLang.g:6661:2: ( ( RULE_ID ) )
            // InternalRepoLang.g:6662:3: ( RULE_ID )
            {
             before(grammarAccess.getSeffReleaseActionAccess().getResourcePassiveResourceCrossReference_2_0()); 
            // InternalRepoLang.g:6663:3: ( RULE_ID )
            // InternalRepoLang.g:6664:4: RULE_ID
            {
             before(grammarAccess.getSeffReleaseActionAccess().getResourcePassiveResourceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSeffReleaseActionAccess().getResourcePassiveResourceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSeffReleaseActionAccess().getResourcePassiveResourceCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReleaseAction__ResourceAssignment_2"


    // $ANTLR start "rule__SeffReleaseAction__AmountAssignment_3_1"
    // InternalRepoLang.g:6675:1: rule__SeffReleaseAction__AmountAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__SeffReleaseAction__AmountAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6679:1: ( ( RULE_INT ) )
            // InternalRepoLang.g:6680:2: ( RULE_INT )
            {
            // InternalRepoLang.g:6680:2: ( RULE_INT )
            // InternalRepoLang.g:6681:3: RULE_INT
            {
             before(grammarAccess.getSeffReleaseActionAccess().getAmountINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSeffReleaseActionAccess().getAmountINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReleaseAction__AmountAssignment_3_1"


    // $ANTLR start "rule__SeffLoopAction__NameAssignment_1"
    // InternalRepoLang.g:6690:1: rule__SeffLoopAction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SeffLoopAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6694:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:6695:2: ( RULE_ID )
            {
            // InternalRepoLang.g:6695:2: ( RULE_ID )
            // InternalRepoLang.g:6696:3: RULE_ID
            {
             before(grammarAccess.getSeffLoopActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSeffLoopActionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffLoopAction__NameAssignment_1"


    // $ANTLR start "rule__SeffLoopAction__CountAssignment_3"
    // InternalRepoLang.g:6705:1: rule__SeffLoopAction__CountAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SeffLoopAction__CountAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6709:1: ( ( RULE_STRING ) )
            // InternalRepoLang.g:6710:2: ( RULE_STRING )
            {
            // InternalRepoLang.g:6710:2: ( RULE_STRING )
            // InternalRepoLang.g:6711:3: RULE_STRING
            {
             before(grammarAccess.getSeffLoopActionAccess().getCountSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSeffLoopActionAccess().getCountSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffLoopAction__CountAssignment_3"


    // $ANTLR start "rule__SeffLoopAction__ActionsAssignment_5"
    // InternalRepoLang.g:6720:1: rule__SeffLoopAction__ActionsAssignment_5 : ( ruleSubSeff ) ;
    public final void rule__SeffLoopAction__ActionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6724:1: ( ( ruleSubSeff ) )
            // InternalRepoLang.g:6725:2: ( ruleSubSeff )
            {
            // InternalRepoLang.g:6725:2: ( ruleSubSeff )
            // InternalRepoLang.g:6726:3: ruleSubSeff
            {
             before(grammarAccess.getSeffLoopActionAccess().getActionsSubSeffParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSubSeff();

            state._fsp--;

             after(grammarAccess.getSeffLoopActionAccess().getActionsSubSeffParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffLoopAction__ActionsAssignment_5"


    // $ANTLR start "rule__SeffSetReturnAction__NameAssignment_1"
    // InternalRepoLang.g:6735:1: rule__SeffSetReturnAction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SeffSetReturnAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6739:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:6740:2: ( RULE_ID )
            {
            // InternalRepoLang.g:6740:2: ( RULE_ID )
            // InternalRepoLang.g:6741:3: RULE_ID
            {
             before(grammarAccess.getSeffSetReturnActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSeffSetReturnActionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffSetReturnAction__NameAssignment_1"


    // $ANTLR start "rule__SeffSetReturnAction__ReturnValueAssignment_2"
    // InternalRepoLang.g:6750:1: rule__SeffSetReturnAction__ReturnValueAssignment_2 : ( ruleSeffReturnParameter ) ;
    public final void rule__SeffSetReturnAction__ReturnValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6754:1: ( ( ruleSeffReturnParameter ) )
            // InternalRepoLang.g:6755:2: ( ruleSeffReturnParameter )
            {
            // InternalRepoLang.g:6755:2: ( ruleSeffReturnParameter )
            // InternalRepoLang.g:6756:3: ruleSeffReturnParameter
            {
             before(grammarAccess.getSeffSetReturnActionAccess().getReturnValueSeffReturnParameterParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSeffReturnParameter();

            state._fsp--;

             after(grammarAccess.getSeffSetReturnActionAccess().getReturnValueSeffReturnParameterParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffSetReturnAction__ReturnValueAssignment_2"


    // $ANTLR start "rule__SeffSetVariableAction__NameAssignment_1"
    // InternalRepoLang.g:6765:1: rule__SeffSetVariableAction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SeffSetVariableAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6769:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:6770:2: ( RULE_ID )
            {
            // InternalRepoLang.g:6770:2: ( RULE_ID )
            // InternalRepoLang.g:6771:3: RULE_ID
            {
             before(grammarAccess.getSeffSetVariableActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSeffSetVariableActionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffSetVariableAction__NameAssignment_1"


    // $ANTLR start "rule__SeffSetVariableAction__SetValuesAssignment_2"
    // InternalRepoLang.g:6780:1: rule__SeffSetVariableAction__SetValuesAssignment_2 : ( ruleSeffReferenceParameter ) ;
    public final void rule__SeffSetVariableAction__SetValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6784:1: ( ( ruleSeffReferenceParameter ) )
            // InternalRepoLang.g:6785:2: ( ruleSeffReferenceParameter )
            {
            // InternalRepoLang.g:6785:2: ( ruleSeffReferenceParameter )
            // InternalRepoLang.g:6786:3: ruleSeffReferenceParameter
            {
             before(grammarAccess.getSeffSetVariableActionAccess().getSetValuesSeffReferenceParameterParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSeffReferenceParameter();

            state._fsp--;

             after(grammarAccess.getSeffSetVariableActionAccess().getSetValuesSeffReferenceParameterParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffSetVariableAction__SetValuesAssignment_2"


    // $ANTLR start "rule__SeffExternalCallAction__NameAssignment_1"
    // InternalRepoLang.g:6795:1: rule__SeffExternalCallAction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SeffExternalCallAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6799:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:6800:2: ( RULE_ID )
            {
            // InternalRepoLang.g:6800:2: ( RULE_ID )
            // InternalRepoLang.g:6801:3: RULE_ID
            {
             before(grammarAccess.getSeffExternalCallActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSeffExternalCallActionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__NameAssignment_1"


    // $ANTLR start "rule__SeffExternalCallAction__RoleAssignment_2_0"
    // InternalRepoLang.g:6810:1: rule__SeffExternalCallAction__RoleAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__SeffExternalCallAction__RoleAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6814:1: ( ( ( RULE_ID ) ) )
            // InternalRepoLang.g:6815:2: ( ( RULE_ID ) )
            {
            // InternalRepoLang.g:6815:2: ( ( RULE_ID ) )
            // InternalRepoLang.g:6816:3: ( RULE_ID )
            {
             before(grammarAccess.getSeffExternalCallActionAccess().getRoleRoleSpecificationCrossReference_2_0_0()); 
            // InternalRepoLang.g:6817:3: ( RULE_ID )
            // InternalRepoLang.g:6818:4: RULE_ID
            {
             before(grammarAccess.getSeffExternalCallActionAccess().getRoleRoleSpecificationIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSeffExternalCallActionAccess().getRoleRoleSpecificationIDTerminalRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getSeffExternalCallActionAccess().getRoleRoleSpecificationCrossReference_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__RoleAssignment_2_0"


    // $ANTLR start "rule__SeffExternalCallAction__CalledAssignment_3"
    // InternalRepoLang.g:6829:1: rule__SeffExternalCallAction__CalledAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__SeffExternalCallAction__CalledAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6833:1: ( ( ( ruleFQN ) ) )
            // InternalRepoLang.g:6834:2: ( ( ruleFQN ) )
            {
            // InternalRepoLang.g:6834:2: ( ( ruleFQN ) )
            // InternalRepoLang.g:6835:3: ( ruleFQN )
            {
             before(grammarAccess.getSeffExternalCallActionAccess().getCalledSignatureCrossReference_3_0()); 
            // InternalRepoLang.g:6836:3: ( ruleFQN )
            // InternalRepoLang.g:6837:4: ruleFQN
            {
             before(grammarAccess.getSeffExternalCallActionAccess().getCalledSignatureFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getSeffExternalCallActionAccess().getCalledSignatureFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSeffExternalCallActionAccess().getCalledSignatureCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__CalledAssignment_3"


    // $ANTLR start "rule__SeffExternalCallAction__BindingsAssignment_4_1"
    // InternalRepoLang.g:6848:1: rule__SeffExternalCallAction__BindingsAssignment_4_1 : ( ruleSeffCallParameter ) ;
    public final void rule__SeffExternalCallAction__BindingsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6852:1: ( ( ruleSeffCallParameter ) )
            // InternalRepoLang.g:6853:2: ( ruleSeffCallParameter )
            {
            // InternalRepoLang.g:6853:2: ( ruleSeffCallParameter )
            // InternalRepoLang.g:6854:3: ruleSeffCallParameter
            {
             before(grammarAccess.getSeffExternalCallActionAccess().getBindingsSeffCallParameterParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSeffCallParameter();

            state._fsp--;

             after(grammarAccess.getSeffExternalCallActionAccess().getBindingsSeffCallParameterParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__BindingsAssignment_4_1"


    // $ANTLR start "rule__SeffExternalCallAction__ReturningAssignment_4_2_1"
    // InternalRepoLang.g:6863:1: rule__SeffExternalCallAction__ReturningAssignment_4_2_1 : ( ruleSeffReferenceParameter ) ;
    public final void rule__SeffExternalCallAction__ReturningAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6867:1: ( ( ruleSeffReferenceParameter ) )
            // InternalRepoLang.g:6868:2: ( ruleSeffReferenceParameter )
            {
            // InternalRepoLang.g:6868:2: ( ruleSeffReferenceParameter )
            // InternalRepoLang.g:6869:3: ruleSeffReferenceParameter
            {
             before(grammarAccess.getSeffExternalCallActionAccess().getReturningSeffReferenceParameterParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSeffReferenceParameter();

            state._fsp--;

             after(grammarAccess.getSeffExternalCallActionAccess().getReturningSeffReferenceParameterParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffExternalCallAction__ReturningAssignment_4_2_1"


    // $ANTLR start "rule__SeffCallParameter__ParameterAssignment_0_0"
    // InternalRepoLang.g:6878:1: rule__SeffCallParameter__ParameterAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__SeffCallParameter__ParameterAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6882:1: ( ( ( RULE_ID ) ) )
            // InternalRepoLang.g:6883:2: ( ( RULE_ID ) )
            {
            // InternalRepoLang.g:6883:2: ( ( RULE_ID ) )
            // InternalRepoLang.g:6884:3: ( RULE_ID )
            {
             before(grammarAccess.getSeffCallParameterAccess().getParameterSignatureParameterCrossReference_0_0_0()); 
            // InternalRepoLang.g:6885:3: ( RULE_ID )
            // InternalRepoLang.g:6886:4: RULE_ID
            {
             before(grammarAccess.getSeffCallParameterAccess().getParameterSignatureParameterIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSeffCallParameterAccess().getParameterSignatureParameterIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getSeffCallParameterAccess().getParameterSignatureParameterCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffCallParameter__ParameterAssignment_0_0"


    // $ANTLR start "rule__SeffCallParameter__ReferenceNameAssignment_0_1"
    // InternalRepoLang.g:6897:1: rule__SeffCallParameter__ReferenceNameAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__SeffCallParameter__ReferenceNameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6901:1: ( ( RULE_STRING ) )
            // InternalRepoLang.g:6902:2: ( RULE_STRING )
            {
            // InternalRepoLang.g:6902:2: ( RULE_STRING )
            // InternalRepoLang.g:6903:3: RULE_STRING
            {
             before(grammarAccess.getSeffCallParameterAccess().getReferenceNameSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSeffCallParameterAccess().getReferenceNameSTRINGTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffCallParameter__ReferenceNameAssignment_0_1"


    // $ANTLR start "rule__SeffCallParameter__ValuesAssignment_2"
    // InternalRepoLang.g:6912:1: rule__SeffCallParameter__ValuesAssignment_2 : ( ruleSeffVariableChar ) ;
    public final void rule__SeffCallParameter__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6916:1: ( ( ruleSeffVariableChar ) )
            // InternalRepoLang.g:6917:2: ( ruleSeffVariableChar )
            {
            // InternalRepoLang.g:6917:2: ( ruleSeffVariableChar )
            // InternalRepoLang.g:6918:3: ruleSeffVariableChar
            {
             before(grammarAccess.getSeffCallParameterAccess().getValuesSeffVariableCharParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSeffVariableChar();

            state._fsp--;

             after(grammarAccess.getSeffCallParameterAccess().getValuesSeffVariableCharParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffCallParameter__ValuesAssignment_2"


    // $ANTLR start "rule__SeffReferenceParameter__ReferenceNameAssignment_0"
    // InternalRepoLang.g:6927:1: rule__SeffReferenceParameter__ReferenceNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__SeffReferenceParameter__ReferenceNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6931:1: ( ( RULE_STRING ) )
            // InternalRepoLang.g:6932:2: ( RULE_STRING )
            {
            // InternalRepoLang.g:6932:2: ( RULE_STRING )
            // InternalRepoLang.g:6933:3: RULE_STRING
            {
             before(grammarAccess.getSeffReferenceParameterAccess().getReferenceNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSeffReferenceParameterAccess().getReferenceNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReferenceParameter__ReferenceNameAssignment_0"


    // $ANTLR start "rule__SeffReferenceParameter__ValuesAssignment_2"
    // InternalRepoLang.g:6942:1: rule__SeffReferenceParameter__ValuesAssignment_2 : ( ruleSeffVariableChar ) ;
    public final void rule__SeffReferenceParameter__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6946:1: ( ( ruleSeffVariableChar ) )
            // InternalRepoLang.g:6947:2: ( ruleSeffVariableChar )
            {
            // InternalRepoLang.g:6947:2: ( ruleSeffVariableChar )
            // InternalRepoLang.g:6948:3: ruleSeffVariableChar
            {
             before(grammarAccess.getSeffReferenceParameterAccess().getValuesSeffVariableCharParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSeffVariableChar();

            state._fsp--;

             after(grammarAccess.getSeffReferenceParameterAccess().getValuesSeffVariableCharParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReferenceParameter__ValuesAssignment_2"


    // $ANTLR start "rule__SeffReturnParameter__ValuesAssignment_1"
    // InternalRepoLang.g:6957:1: rule__SeffReturnParameter__ValuesAssignment_1 : ( ruleSeffVariableChar ) ;
    public final void rule__SeffReturnParameter__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6961:1: ( ( ruleSeffVariableChar ) )
            // InternalRepoLang.g:6962:2: ( ruleSeffVariableChar )
            {
            // InternalRepoLang.g:6962:2: ( ruleSeffVariableChar )
            // InternalRepoLang.g:6963:3: ruleSeffVariableChar
            {
             before(grammarAccess.getSeffReturnParameterAccess().getValuesSeffVariableCharParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSeffVariableChar();

            state._fsp--;

             after(grammarAccess.getSeffReturnParameterAccess().getValuesSeffVariableCharParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffReturnParameter__ValuesAssignment_1"


    // $ANTLR start "rule__SeffVariableChar__CharacterisationTypeAssignment_0"
    // InternalRepoLang.g:6972:1: rule__SeffVariableChar__CharacterisationTypeAssignment_0 : ( ruleCharType ) ;
    public final void rule__SeffVariableChar__CharacterisationTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6976:1: ( ( ruleCharType ) )
            // InternalRepoLang.g:6977:2: ( ruleCharType )
            {
            // InternalRepoLang.g:6977:2: ( ruleCharType )
            // InternalRepoLang.g:6978:3: ruleCharType
            {
             before(grammarAccess.getSeffVariableCharAccess().getCharacterisationTypeCharTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCharType();

            state._fsp--;

             after(grammarAccess.getSeffVariableCharAccess().getCharacterisationTypeCharTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffVariableChar__CharacterisationTypeAssignment_0"


    // $ANTLR start "rule__SeffVariableChar__ValueAssignment_2"
    // InternalRepoLang.g:6987:1: rule__SeffVariableChar__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SeffVariableChar__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:6991:1: ( ( RULE_STRING ) )
            // InternalRepoLang.g:6992:2: ( RULE_STRING )
            {
            // InternalRepoLang.g:6992:2: ( RULE_STRING )
            // InternalRepoLang.g:6993:3: RULE_STRING
            {
             before(grammarAccess.getSeffVariableCharAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSeffVariableCharAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffVariableChar__ValueAssignment_2"


    // $ANTLR start "rule__SeffProbabilisticBranchAction__NameAssignment_1"
    // InternalRepoLang.g:7002:1: rule__SeffProbabilisticBranchAction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SeffProbabilisticBranchAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:7006:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:7007:2: ( RULE_ID )
            {
            // InternalRepoLang.g:7007:2: ( RULE_ID )
            // InternalRepoLang.g:7008:3: RULE_ID
            {
             before(grammarAccess.getSeffProbabilisticBranchActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSeffProbabilisticBranchActionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffProbabilisticBranchAction__NameAssignment_1"


    // $ANTLR start "rule__SeffProbabilisticBranchAction__BranchesAssignment_3"
    // InternalRepoLang.g:7017:1: rule__SeffProbabilisticBranchAction__BranchesAssignment_3 : ( ruleSeffProbabilisticBranch ) ;
    public final void rule__SeffProbabilisticBranchAction__BranchesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:7021:1: ( ( ruleSeffProbabilisticBranch ) )
            // InternalRepoLang.g:7022:2: ( ruleSeffProbabilisticBranch )
            {
            // InternalRepoLang.g:7022:2: ( ruleSeffProbabilisticBranch )
            // InternalRepoLang.g:7023:3: ruleSeffProbabilisticBranch
            {
             before(grammarAccess.getSeffProbabilisticBranchActionAccess().getBranchesSeffProbabilisticBranchParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSeffProbabilisticBranch();

            state._fsp--;

             after(grammarAccess.getSeffProbabilisticBranchActionAccess().getBranchesSeffProbabilisticBranchParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffProbabilisticBranchAction__BranchesAssignment_3"


    // $ANTLR start "rule__SeffProbabilisticBranch__ProbabilityAssignment_0"
    // InternalRepoLang.g:7032:1: rule__SeffProbabilisticBranch__ProbabilityAssignment_0 : ( ruleProbability ) ;
    public final void rule__SeffProbabilisticBranch__ProbabilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:7036:1: ( ( ruleProbability ) )
            // InternalRepoLang.g:7037:2: ( ruleProbability )
            {
            // InternalRepoLang.g:7037:2: ( ruleProbability )
            // InternalRepoLang.g:7038:3: ruleProbability
            {
             before(grammarAccess.getSeffProbabilisticBranchAccess().getProbabilityProbabilityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProbability();

            state._fsp--;

             after(grammarAccess.getSeffProbabilisticBranchAccess().getProbabilityProbabilityParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffProbabilisticBranch__ProbabilityAssignment_0"


    // $ANTLR start "rule__SeffProbabilisticBranch__NameAssignment_2"
    // InternalRepoLang.g:7047:1: rule__SeffProbabilisticBranch__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SeffProbabilisticBranch__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:7051:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:7052:2: ( RULE_ID )
            {
            // InternalRepoLang.g:7052:2: ( RULE_ID )
            // InternalRepoLang.g:7053:3: RULE_ID
            {
             before(grammarAccess.getSeffProbabilisticBranchAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSeffProbabilisticBranchAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffProbabilisticBranch__NameAssignment_2"


    // $ANTLR start "rule__SeffProbabilisticBranch__SeffAssignment_3"
    // InternalRepoLang.g:7062:1: rule__SeffProbabilisticBranch__SeffAssignment_3 : ( ruleSubSeff ) ;
    public final void rule__SeffProbabilisticBranch__SeffAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:7066:1: ( ( ruleSubSeff ) )
            // InternalRepoLang.g:7067:2: ( ruleSubSeff )
            {
            // InternalRepoLang.g:7067:2: ( ruleSubSeff )
            // InternalRepoLang.g:7068:3: ruleSubSeff
            {
             before(grammarAccess.getSeffProbabilisticBranchAccess().getSeffSubSeffParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSubSeff();

            state._fsp--;

             after(grammarAccess.getSeffProbabilisticBranchAccess().getSeffSubSeffParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffProbabilisticBranch__SeffAssignment_3"


    // $ANTLR start "rule__SeffGuardedBranchAction__NameAssignment_1"
    // InternalRepoLang.g:7077:1: rule__SeffGuardedBranchAction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SeffGuardedBranchAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:7081:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:7082:2: ( RULE_ID )
            {
            // InternalRepoLang.g:7082:2: ( RULE_ID )
            // InternalRepoLang.g:7083:3: RULE_ID
            {
             before(grammarAccess.getSeffGuardedBranchActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSeffGuardedBranchActionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffGuardedBranchAction__NameAssignment_1"


    // $ANTLR start "rule__SeffGuardedBranchAction__BranchesAssignment_3"
    // InternalRepoLang.g:7092:1: rule__SeffGuardedBranchAction__BranchesAssignment_3 : ( ruleSeffGuardedBranch ) ;
    public final void rule__SeffGuardedBranchAction__BranchesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:7096:1: ( ( ruleSeffGuardedBranch ) )
            // InternalRepoLang.g:7097:2: ( ruleSeffGuardedBranch )
            {
            // InternalRepoLang.g:7097:2: ( ruleSeffGuardedBranch )
            // InternalRepoLang.g:7098:3: ruleSeffGuardedBranch
            {
             before(grammarAccess.getSeffGuardedBranchActionAccess().getBranchesSeffGuardedBranchParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSeffGuardedBranch();

            state._fsp--;

             after(grammarAccess.getSeffGuardedBranchActionAccess().getBranchesSeffGuardedBranchParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffGuardedBranchAction__BranchesAssignment_3"


    // $ANTLR start "rule__SeffGuardedBranch__ConditionAssignment_0"
    // InternalRepoLang.g:7107:1: rule__SeffGuardedBranch__ConditionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__SeffGuardedBranch__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:7111:1: ( ( RULE_STRING ) )
            // InternalRepoLang.g:7112:2: ( RULE_STRING )
            {
            // InternalRepoLang.g:7112:2: ( RULE_STRING )
            // InternalRepoLang.g:7113:3: RULE_STRING
            {
             before(grammarAccess.getSeffGuardedBranchAccess().getConditionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSeffGuardedBranchAccess().getConditionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffGuardedBranch__ConditionAssignment_0"


    // $ANTLR start "rule__SeffGuardedBranch__NameAssignment_2"
    // InternalRepoLang.g:7122:1: rule__SeffGuardedBranch__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SeffGuardedBranch__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:7126:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:7127:2: ( RULE_ID )
            {
            // InternalRepoLang.g:7127:2: ( RULE_ID )
            // InternalRepoLang.g:7128:3: RULE_ID
            {
             before(grammarAccess.getSeffGuardedBranchAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSeffGuardedBranchAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffGuardedBranch__NameAssignment_2"


    // $ANTLR start "rule__SeffGuardedBranch__SeffAssignment_3"
    // InternalRepoLang.g:7137:1: rule__SeffGuardedBranch__SeffAssignment_3 : ( ruleSubSeff ) ;
    public final void rule__SeffGuardedBranch__SeffAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:7141:1: ( ( ruleSubSeff ) )
            // InternalRepoLang.g:7142:2: ( ruleSubSeff )
            {
            // InternalRepoLang.g:7142:2: ( ruleSubSeff )
            // InternalRepoLang.g:7143:3: ruleSubSeff
            {
             before(grammarAccess.getSeffGuardedBranchAccess().getSeffSubSeffParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSubSeff();

            state._fsp--;

             after(grammarAccess.getSeffGuardedBranchAccess().getSeffSubSeffParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffGuardedBranch__SeffAssignment_3"


    // $ANTLR start "rule__SeffForkAction__SyncAssignment_1"
    // InternalRepoLang.g:7152:1: rule__SeffForkAction__SyncAssignment_1 : ( ( 'SYNC' ) ) ;
    public final void rule__SeffForkAction__SyncAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:7156:1: ( ( ( 'SYNC' ) ) )
            // InternalRepoLang.g:7157:2: ( ( 'SYNC' ) )
            {
            // InternalRepoLang.g:7157:2: ( ( 'SYNC' ) )
            // InternalRepoLang.g:7158:3: ( 'SYNC' )
            {
             before(grammarAccess.getSeffForkActionAccess().getSyncSYNCKeyword_1_0()); 
            // InternalRepoLang.g:7159:3: ( 'SYNC' )
            // InternalRepoLang.g:7160:4: 'SYNC'
            {
             before(grammarAccess.getSeffForkActionAccess().getSyncSYNCKeyword_1_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getSeffForkActionAccess().getSyncSYNCKeyword_1_0()); 

            }

             after(grammarAccess.getSeffForkActionAccess().getSyncSYNCKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffForkAction__SyncAssignment_1"


    // $ANTLR start "rule__SeffForkAction__NameAssignment_2"
    // InternalRepoLang.g:7171:1: rule__SeffForkAction__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SeffForkAction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:7175:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:7176:2: ( RULE_ID )
            {
            // InternalRepoLang.g:7176:2: ( RULE_ID )
            // InternalRepoLang.g:7177:3: RULE_ID
            {
             before(grammarAccess.getSeffForkActionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSeffForkActionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffForkAction__NameAssignment_2"


    // $ANTLR start "rule__SeffForkAction__ForksAssignment_4"
    // InternalRepoLang.g:7186:1: rule__SeffForkAction__ForksAssignment_4 : ( ruleSeffFork ) ;
    public final void rule__SeffForkAction__ForksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:7190:1: ( ( ruleSeffFork ) )
            // InternalRepoLang.g:7191:2: ( ruleSeffFork )
            {
            // InternalRepoLang.g:7191:2: ( ruleSeffFork )
            // InternalRepoLang.g:7192:3: ruleSeffFork
            {
             before(grammarAccess.getSeffForkActionAccess().getForksSeffForkParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSeffFork();

            state._fsp--;

             after(grammarAccess.getSeffForkActionAccess().getForksSeffForkParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffForkAction__ForksAssignment_4"


    // $ANTLR start "rule__SeffForkAction__ForksAssignment_5_1"
    // InternalRepoLang.g:7201:1: rule__SeffForkAction__ForksAssignment_5_1 : ( ruleSeffFork ) ;
    public final void rule__SeffForkAction__ForksAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:7205:1: ( ( ruleSeffFork ) )
            // InternalRepoLang.g:7206:2: ( ruleSeffFork )
            {
            // InternalRepoLang.g:7206:2: ( ruleSeffFork )
            // InternalRepoLang.g:7207:3: ruleSeffFork
            {
             before(grammarAccess.getSeffForkActionAccess().getForksSeffForkParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSeffFork();

            state._fsp--;

             after(grammarAccess.getSeffForkActionAccess().getForksSeffForkParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffForkAction__ForksAssignment_5_1"


    // $ANTLR start "rule__SeffFork__NameAssignment_0"
    // InternalRepoLang.g:7216:1: rule__SeffFork__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SeffFork__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:7220:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:7221:2: ( RULE_ID )
            {
            // InternalRepoLang.g:7221:2: ( RULE_ID )
            // InternalRepoLang.g:7222:3: RULE_ID
            {
             before(grammarAccess.getSeffForkAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSeffForkAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffFork__NameAssignment_0"


    // $ANTLR start "rule__SeffFork__SeffAssignment_1"
    // InternalRepoLang.g:7231:1: rule__SeffFork__SeffAssignment_1 : ( ruleSubSeff ) ;
    public final void rule__SeffFork__SeffAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:7235:1: ( ( ruleSubSeff ) )
            // InternalRepoLang.g:7236:2: ( ruleSubSeff )
            {
            // InternalRepoLang.g:7236:2: ( ruleSubSeff )
            // InternalRepoLang.g:7237:3: ruleSubSeff
            {
             before(grammarAccess.getSeffForkAccess().getSeffSubSeffParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSubSeff();

            state._fsp--;

             after(grammarAccess.getSeffForkAccess().getSeffSubSeffParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeffFork__SeffAssignment_1"


    // $ANTLR start "rule__SubSeff__ActionsAssignment_1"
    // InternalRepoLang.g:7246:1: rule__SubSeff__ActionsAssignment_1 : ( ruleSeffAction ) ;
    public final void rule__SubSeff__ActionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:7250:1: ( ( ruleSeffAction ) )
            // InternalRepoLang.g:7251:2: ( ruleSeffAction )
            {
            // InternalRepoLang.g:7251:2: ( ruleSeffAction )
            // InternalRepoLang.g:7252:3: ruleSeffAction
            {
             before(grammarAccess.getSubSeffAccess().getActionsSeffActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSeffAction();

            state._fsp--;

             after(grammarAccess.getSubSeffAccess().getActionsSeffActionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSeff__ActionsAssignment_1"


    // $ANTLR start "rule__PassiveResource__NameAssignment_1"
    // InternalRepoLang.g:7261:1: rule__PassiveResource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PassiveResource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:7265:1: ( ( RULE_ID ) )
            // InternalRepoLang.g:7266:2: ( RULE_ID )
            {
            // InternalRepoLang.g:7266:2: ( RULE_ID )
            // InternalRepoLang.g:7267:3: RULE_ID
            {
             before(grammarAccess.getPassiveResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPassiveResourceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PassiveResource__NameAssignment_1"


    // $ANTLR start "rule__PassiveResource__CapacityAssignment_3"
    // InternalRepoLang.g:7276:1: rule__PassiveResource__CapacityAssignment_3 : ( RULE_INT ) ;
    public final void rule__PassiveResource__CapacityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRepoLang.g:7280:1: ( ( RULE_INT ) )
            // InternalRepoLang.g:7281:2: ( RULE_INT )
            {
            // InternalRepoLang.g:7281:2: ( RULE_INT )
            // InternalRepoLang.g:7282:3: RULE_INT
            {
             before(grammarAccess.getPassiveResourceAccess().getCapacityINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPassiveResourceAccess().getCapacityINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PassiveResource__CapacityAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000001008A0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100800002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000050000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000600100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0010001000200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00071FC000200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00071FC000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000200000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000000000000F802L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0020000000100010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00071FC000000000L});

}