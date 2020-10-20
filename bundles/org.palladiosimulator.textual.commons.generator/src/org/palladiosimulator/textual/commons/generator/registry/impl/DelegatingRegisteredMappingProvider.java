package org.palladiosimulator.textual.commons.generator.registry.impl;

import java.util.Collection;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.palladiosimulator.textual.commons.generator.MultiModelGeneratorFragment;
import org.palladiosimulator.textual.commons.generator.MultiModelGeneratorFragmentCollector;
import org.palladiosimulator.textual.commons.generator.registry.ProvidedMapping;
import org.palladiosimulator.textual.commons.generator.registry.RegisteredMappingProvider;

import com.google.common.collect.Streams;

public class DelegatingRegisteredMappingProvider implements RegisteredMappingProvider {
    private final Collection<RegisteredMappingProvider> providers;

    @Inject
    public DelegatingRegisteredMappingProvider(MultiModelGeneratorFragmentCollector providerCollector) {
        providers = Streams.stream(providerCollector.getGeneratorFragments())
            .map(MultiModelGeneratorFragment::getRegisteredMappingProvider)
            .collect(Collectors.toList());
    }

    @Override
    public Collection<ProvidedMapping> retrieveMappings(ResourceSet resourceSet) {
        return providers.stream()
            .flatMap(provider -> provider.retrieveMappings(resourceSet)
                .stream())
            .collect(Collectors.toList());
    }

}
