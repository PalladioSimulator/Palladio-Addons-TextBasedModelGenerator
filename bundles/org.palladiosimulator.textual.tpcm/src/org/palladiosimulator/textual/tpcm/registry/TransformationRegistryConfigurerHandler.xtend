package org.palladiosimulator.textual.tpcm.registry

import org.eclipse.core.runtime.SafeRunner
import org.eclipse.core.runtime.Platform

class TransformationRegistryConfigurerHandler {
    static val EXTENSION_POINT_FQN = "org.palladiosimulator.textual.tpcm.configure";
    
    def static void execute() {
        val extensionRegistry = Platform.extensionRegistry
        if(extensionRegistry === null) {
            return;
        }
        
        val registry = GeneratorTransformationRegistry.INSTANCE;
        val extensions = extensionRegistry.getConfigurationElementsFor(EXTENSION_POINT_FQN);
        for (element : extensions) {
        	val ext = element.createExecutableExtension("class")
        	if(ext instanceof TransformationRegistryConfigurer) {
        	    SafeRunner.run [
        	        (ext as TransformationRegistryConfigurer).configure(registry);
        	    ]
        	}
        }
    }
}