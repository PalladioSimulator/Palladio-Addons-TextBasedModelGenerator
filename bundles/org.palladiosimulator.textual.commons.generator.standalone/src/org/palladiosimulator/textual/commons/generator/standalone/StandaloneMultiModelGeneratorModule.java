package org.palladiosimulator.textual.commons.generator.standalone;

import org.palladiosimulator.textual.commons.generator.CommonMultiModelGeneratorModule;
import org.palladiosimulator.textual.commons.generator.MultiModelGeneratorFragmentCollector;

public class StandaloneMultiModelGeneratorModule extends CommonMultiModelGeneratorModule {

    public Class<? extends MultiModelGeneratorFragmentCollector> bindGeneratorFragmentProvider() {
        return ServiceLoaderMultiModuleGeneratorFragmentCollector.class;
    }
}
