package org.palladiosimulator.textual.commons.generator;

import org.palladiosimulator.textual.commons.generator.registry.GeneratorRulesRegistrationDelegate;
import org.palladiosimulator.textual.commons.generator.registry.RegisteredMappingProvider;
import org.palladiosimulator.textual.commons.generator.registry.RootElementFilter;

public interface MultiModelGeneratorFragment {
    static final String NAMED_DELEGATE = "org.palladiosimulator.textual.commons.generator.delegate";
    
    RootElementFilter getRootElementFilter();
    
    RegisteredMappingProvider getRegisteredMappingProvider();
    
    ModelFileExtensionRegistrationDelegate getFileExtensionRegistrationDelegate();
    
    GeneratorRulesRegistrationDelegate getRulesRegistrationDelegate();

}
