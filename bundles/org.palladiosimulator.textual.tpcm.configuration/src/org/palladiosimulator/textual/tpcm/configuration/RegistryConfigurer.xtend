package org.palladiosimulator.textual.tpcm.configuration

import org.palladiosimulator.textual.tpcm.registry.GeneratorTransformationRegistry
import org.palladiosimulator.textual.tpcm.registry.TransformationRegistryConfigurer

class RegistryConfigurer implements TransformationRegistryConfigurer {

    override void configure(GeneratorTransformationRegistry registry) {
        RepositoryConfigurer.configureRepositoryTransformations(registry)
        ResourceTypesConfigurer.configureResourceTypesTransformations(registry)
        ResourceEnvironmentConfigurer.configureResourceEnvironmentTransformations(registry)
        AllocationConfigurer.configureAllocationTransformations(registry)
        SystemRegistryConfigurer.configureSystemTransformations(registry)
        UsageProfileConfigurer.configureUsageProfileTransformations(registry)
    }
    
}
