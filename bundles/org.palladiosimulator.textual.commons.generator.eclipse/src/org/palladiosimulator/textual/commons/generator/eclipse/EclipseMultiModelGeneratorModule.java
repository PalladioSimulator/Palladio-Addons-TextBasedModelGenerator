package org.palladiosimulator.textual.commons.generator.eclipse;

import org.palladiosimulator.textual.commons.generator.CommonMultiModelGeneratorModule;
import org.palladiosimulator.textual.commons.generator.MultiModelGeneratorFragmentCollector;

public class EclipseMultiModelGeneratorModule extends CommonMultiModelGeneratorModule {
    
    public Class<? extends MultiModelGeneratorFragmentCollector> bindGeneratorFragmentProvider() {
        return ExtensionPointMultiModuleGeneratorFragmentCollector.class;
    }
}
