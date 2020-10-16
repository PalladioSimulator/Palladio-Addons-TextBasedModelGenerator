package org.palladiosimulator.textual.commons.generator.registry.impl;

import java.util.Collection;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.textual.commons.generator.MultiModelGeneratorFragment;
import org.palladiosimulator.textual.commons.generator.MultiModelGeneratorFragmentCollector;
import org.palladiosimulator.textual.commons.generator.registry.RootElementFilter;

import com.google.common.collect.Streams;

public class DelegatingRootElementFilter implements RootElementFilter {
    private final Collection<RootElementFilter> filters;
    @Inject
    public DelegatingRootElementFilter(MultiModelGeneratorFragmentCollector providerCollector) {
        filters = Streams.stream(providerCollector.getGeneratorFragments())
            .map(MultiModelGeneratorFragment::getRootElementFilter)
            .collect(Collectors.toList());
    }

    @Override
    public boolean translatesToRootElement(EObject object) {
        return filters.stream().anyMatch(f -> f.translatesToRootElement(object));
    }

}
