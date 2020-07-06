package org.palladiosimulator.textual.tpcm.scoping;

import java.util.LinkedHashSet;

import javax.inject.Inject;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.palladiosimulator.textual.tpcm.language.LanguagePackage;
import org.palladiosimulator.textual.tpcm.resource.TPCMResourceDescriptionStrategy;

import com.google.common.base.Splitter;
import com.google.inject.Provider;

public class TPCMImportUriGlobalScopeProvider extends ImportUriGlobalScopeProvider {
	private static final Splitter SPLITTER = Splitter.on(',');

	@Inject
	IResourceDescription.Manager descriptionManager;

	@Inject
	IResourceScopeCache cache;

	@Override
	protected LinkedHashSet<URI> getImportedUris(Resource resource) {
		return cache.get(TPCMImportUriGlobalScopeProvider.class.getSimpleName(), resource,
				new Provider<LinkedHashSet<URI>>() {
					@Override
					public LinkedHashSet<URI> get() {
						var uniqueImportURIs = collectImportUris(resource, new LinkedHashSet<URI>(5));

						var uriIter = uniqueImportURIs.iterator();
						while (uriIter.hasNext()) {
							if (!EcoreUtil2.isValidUri(resource, uriIter.next())) {
								uriIter.remove();
							}
						}
						return uniqueImportURIs;
					}

					private LinkedHashSet<URI> collectImportUris(Resource resource,
							LinkedHashSet<URI> uniqueImportURIs) {
						var resourceDescription = descriptionManager.getResourceDescription(resource);
						var elements = resourceDescription.getExportedObjectsByType(LanguagePackage.Literals.MODEL);

						elements.forEach(desc -> {
							var userData = desc.getUserData(TPCMResourceDescriptionStrategy.INCLUDES);
							if (userData != null) {
								SPLITTER.split(userData).forEach(uri -> {
									var includedUri = URI.createURI(uri);
									includedUri = includedUri.resolve(resource.getURI());
									if (uniqueImportURIs.add(includedUri)) {
										collectImportUris(resource.getResourceSet().getResource(includedUri, true),
												uniqueImportURIs);
									}
								});
							}
						});
						return uniqueImportURIs;
					}
				});
	}

}
