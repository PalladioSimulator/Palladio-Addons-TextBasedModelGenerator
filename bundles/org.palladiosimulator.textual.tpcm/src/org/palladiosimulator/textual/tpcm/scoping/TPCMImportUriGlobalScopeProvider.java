package org.palladiosimulator.textual.tpcm.scoping;

import java.util.Iterator;
import java.util.LinkedHashSet;

import com.google.inject.Inject;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.palladiosimulator.textual.tpcm.language.Import;
import org.palladiosimulator.textual.tpcm.language.Model;

import com.google.common.collect.Iterators;
import com.google.inject.Provider;

public class TPCMImportUriGlobalScopeProvider extends ImportUriGlobalScopeProvider {
    public static final String IMPORT_RESOURCES_PATHMAP_TEMPLATE = "pathmap://TPCM_RESOURCES_%s/";
	public static final String IMPORT_RESOURCES_URI_TEMPLATE = IMPORT_RESOURCES_PATHMAP_TEMPLATE + "%s.tpcm";
	@Inject
	IResourceScopeCache cache;
	
	public static String getURIFromImport(Import imp) {
	    if (imp.getNamespace() != null) {
            return String.format(IMPORT_RESOURCES_URI_TEMPLATE, 
                    imp.getNamespace().toUpperCase(), imp.getImportURI());
        } else return imp.getImportURI();
	}

	@Override
	protected LinkedHashSet<URI> getImportedUris(Resource resource) {
		return cache.get(TPCMImportUriGlobalScopeProvider.class.getSimpleName(), resource,
				new Provider<LinkedHashSet<URI>>() {
					@Override
					public LinkedHashSet<URI> get() {
						final LinkedHashSet<URI> uniqueImportURIs = new LinkedHashSet<URI>(5);
						IAcceptor<String> collector = createURICollector(resource, uniqueImportURIs);
						var iterator = Iterators.filter(resource.getContents().iterator(), Model.class);
						while (iterator.hasNext()) {
							Model object = iterator.next();
							object.getImports().stream()
								.map(TPCMImportUriGlobalScopeProvider::getURIFromImport)
								.forEach(collector::accept);
						}
						Iterator<URI> uriIter = uniqueImportURIs.iterator();
						while (uriIter.hasNext()) {
							if (!EcoreUtil2.isValidUri(resource, uriIter.next()))
								uriIter.remove();
						}
						return uniqueImportURIs;
					}
				});
	}

}
