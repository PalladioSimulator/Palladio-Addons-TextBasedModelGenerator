package org.palladiosimulator.textual.commons.generator.registry;

import java.util.Collection;

import org.eclipse.emf.ecore.resource.ResourceSet;

public interface RegisteredMappingProvider {
    
    Collection<ProvidedMapping> retrieveMappings(ResourceSet resourceSet);

}
