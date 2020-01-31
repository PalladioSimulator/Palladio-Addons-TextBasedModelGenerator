package com.palladiosimulator.textual.repository.scoping

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource

class StandaloneRepoLangImportURIGlobalScopeProvider extends RepoLangImportURIGlobalScopeProvider {
    static val String[][] mappings = #[
        #["pathmap://PCM_MODELS/Palladio.resourcetype", "Palladio.resourcetype"],
        #["pathmap://PCM_MODELS/PrimitiveTypes.repository", "PrimitiveTypes.repository"]
    ]

    override registerUriMappings(Resource resource) {
        val uriMap = resource.resourceSet.URIConverter.URIMap

        for (String[] mapping : mappings) {
            if (!uriMap.containsKey(mapping.get(0))) {
                val cl = Thread.currentThread().getContextClassLoader();
                val url = cl.getResource(mapping.get(1))?.toString();

                uriMap.put(URI.createURI(mapping.get(0)), URI.createURI(url));
            }
        }
    }

}
