package com.palladiosimulator.textual.repository.scoping

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider

class RepoLangImportURIGlobalScopeProvider extends ImportUriGlobalScopeProvider {
    static val TYPES_URI = "pathmap://PCM_MODELS/PrimitiveTypes.repository"
    static val RESOURCE_TYPES_URI = "pathmap://PCM_MODELS/Palladio.resourcetype"

    /**/
    override protected getImportedUris(Resource resource) {
        val importedURIs = super.getImportedUris(resource);

        #[TYPES_URI, RESOURCE_TYPES_URI].forEach[importedURIs += URI.createURI(it)]
        
        registerUriMappings(resource);

        return importedURIs;
    }
    
    protected def registerUriMappings(Resource resource) {
        //Intentionally left blank
    }

}
