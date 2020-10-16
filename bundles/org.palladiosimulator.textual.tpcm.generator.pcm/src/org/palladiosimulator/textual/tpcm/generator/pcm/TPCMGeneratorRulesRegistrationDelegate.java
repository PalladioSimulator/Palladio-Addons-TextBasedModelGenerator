package org.palladiosimulator.textual.tpcm.generator.pcm;

import java.util.Arrays;
import java.util.Collection;

import org.palladiosimulator.textual.commons.generator.registry.GeneratorRuleRegistrationFacade;
import org.palladiosimulator.textual.commons.generator.registry.GeneratorRulesRegistrationDelegate;

public class TPCMGeneratorRulesRegistrationDelegate implements GeneratorRulesRegistrationDelegate {

    @Override
    public void doRegistration(GeneratorRuleRegistrationFacade registry) {
        collectDelegates().forEach(del -> del.doRegistration(registry));
    }

    Collection<GeneratorRulesRegistrationDelegate> collectDelegates() {
        return Arrays.asList(new RepositoryConfigurer(), new ResourceTypesConfigurer(), new SystemRegistryConfigurer(),
                new UsageProfileConfigurer(), new AllocationConfigurer(), new ResourceEnvironmentConfigurer());
    }

}
