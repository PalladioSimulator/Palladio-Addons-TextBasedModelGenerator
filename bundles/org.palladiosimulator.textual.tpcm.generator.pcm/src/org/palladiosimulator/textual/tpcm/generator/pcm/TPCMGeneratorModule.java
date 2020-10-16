package org.palladiosimulator.textual.tpcm.generator.pcm;

import org.eclipse.xtext.service.AbstractGenericModule;
import org.palladiosimulator.textual.commons.generator.InjectedMultiModelGeneratorFragment;
import org.palladiosimulator.textual.commons.generator.ModelFileExtensionRegistrationDelegate;
import org.palladiosimulator.textual.commons.generator.MultiModelGeneratorFragment;
import org.palladiosimulator.textual.commons.generator.registry.GeneratorRulesRegistrationDelegate;
import org.palladiosimulator.textual.commons.generator.registry.RegisteredMappingProvider;
import org.palladiosimulator.textual.commons.generator.registry.RootElementFilter;

public class TPCMGeneratorModule extends AbstractGenericModule {

    public Class<? extends MultiModelGeneratorFragment> bindMultiModelGeneratorFragment() {
        return InjectedMultiModelGeneratorFragment.class;
    }

    public Class<? extends RootElementFilter> bindRootElementFilter() {
        return TPCMRootElementFilter.class;
    }

    public Class<? extends RegisteredMappingProvider> bindRegisteredMappingProvider() {
        return TPCMRegisteredMappingProvider.class;
    }

    public Class<? extends ModelFileExtensionRegistrationDelegate> bindFileExtensionRegistrationDelegate() {
        return TCPMModelFileExtensionRegistrationDelegate.class;
    }

    public Class<? extends GeneratorRulesRegistrationDelegate> bindRulesRegistrationDelegate() {
        return TPCMGeneratorRulesRegistrationDelegate.class;
    }
}
