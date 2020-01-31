package com.palladiosimulator.textual.repository

import com.palladiosimulator.textual.repository.RepoLangRuntimeModule
import com.palladiosimulator.textual.repository.scoping.StandaloneRepoLangImportURIGlobalScopeProvider

class RepoLangStandaloneModule extends RepoLangRuntimeModule {
    
    override bindIGlobalScopeProvider() {
        StandaloneRepoLangImportURIGlobalScopeProvider
    }
    
}