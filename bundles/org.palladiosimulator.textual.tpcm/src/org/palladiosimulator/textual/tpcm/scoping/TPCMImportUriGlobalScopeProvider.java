package org.palladiosimulator.textual.tpcm.scoping;

import java.util.Iterator;
import java.util.LinkedHashSet;

import javax.inject.Inject;

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
	@Inject
	IResourceScopeCache cache;

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
								.map(Import::getImportURI)
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
