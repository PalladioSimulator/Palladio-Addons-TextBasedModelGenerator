package org.palladiosimulator.textual.tpcm.generator.pcm;

import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.palladiosimulator.textual.commons.generator.registry.ProvidedMapping;
import org.palladiosimulator.textual.commons.generator.registry.RegisteredMappingProvider;
import org.palladiosimulator.textual.tpcm.language.LanguagePackage;
import org.palladiosimulator.textual.tpcm.language.MappingContent;

import com.google.common.collect.Streams;

public class TPCMRegisteredMappingProvider implements RegisteredMappingProvider {

    @Override
    public Collection<ProvidedMapping> retrieveMappings(ResourceSet resourceSet) {
        return Streams.stream(resourceSet.getAllContents())
            .filter(LanguagePackage.eINSTANCE.getMappingContent()::isInstance)
            .map(MappingContent.class::cast)
            .map(n -> new ProvidedMapping(n.getImported(), resolveTarget(resourceSet, n)))
            .collect(Collectors.toList());
    }
    
    private EObject resolveTarget(ResourceSet resourceSet, MappingContent mapping) {
        return resourceSet.getEObject(URI.createURI(mapping.getAbsoluteUri()), true);
    }

}
