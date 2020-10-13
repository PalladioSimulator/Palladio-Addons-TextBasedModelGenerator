package org.palladiosimulator.textual.tpcm.configuration

import org.palladiosimulator.textual.commons.generator.registry.GeneratorRuleRegistrationFacade
import org.palladiosimulator.textual.commons.generator.registry.GeneratorRulesRegistrationDelegate

class RegistryConfigurer implements GeneratorRulesRegistrationDelegate {

    override void doRegistration(GeneratorRuleRegistrationFacade registry) {
        #[new RepositoryConfigurer,  
            new ResourceTypesConfigurer, 
            new ResourceEnvironmentConfigurer, 
            new AllocationConfigurer, 
            new SystemRegistryConfigurer, 
            new UsageProfileConfigurer
        ].forEach[doRegistration(registry)]
    }
    
}
