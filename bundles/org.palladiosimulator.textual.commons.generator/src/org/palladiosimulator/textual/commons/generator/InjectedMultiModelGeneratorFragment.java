package org.palladiosimulator.textual.commons.generator;

import com.google.inject.Inject;

import org.palladiosimulator.textual.commons.generator.registry.GeneratorRulesRegistrationDelegate;
import org.palladiosimulator.textual.commons.generator.registry.RegisteredMappingProvider;
import org.palladiosimulator.textual.commons.generator.registry.RootElementFilter;

public class InjectedMultiModelGeneratorFragment implements MultiModelGeneratorFragment {
    
    private final RootElementFilter filter;
    private final RegisteredMappingProvider mappingProvider;
    private final ModelFileExtensionRegistrationDelegate extensionRegistrationDelegate;
    private final GeneratorRulesRegistrationDelegate rulesRegistrationDelegate;

    @Inject
    public InjectedMultiModelGeneratorFragment(RootElementFilter filter, RegisteredMappingProvider mappingProvider,
            ModelFileExtensionRegistrationDelegate extensionRegistrationDelegate, GeneratorRulesRegistrationDelegate rulesRegistrationDelegate) {
        this.filter = filter;
        this.mappingProvider = mappingProvider;
        this.extensionRegistrationDelegate = extensionRegistrationDelegate;
        this.rulesRegistrationDelegate = rulesRegistrationDelegate;        
    }

    @Override
    public RootElementFilter getRootElementFilter() {
        return filter;
    }

    @Override
    public RegisteredMappingProvider getRegisteredMappingProvider() {
        return mappingProvider;
    }

    @Override
    public ModelFileExtensionRegistrationDelegate getFileExtensionRegistrationDelegate() {
        return extensionRegistrationDelegate;
    }

    @Override
    public GeneratorRulesRegistrationDelegate getRulesRegistrationDelegate() {
        return rulesRegistrationDelegate;
    }

}
