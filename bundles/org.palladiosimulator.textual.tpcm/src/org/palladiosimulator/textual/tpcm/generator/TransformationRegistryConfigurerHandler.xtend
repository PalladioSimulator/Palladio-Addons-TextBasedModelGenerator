package org.palladiosimulator.textual.tpcm.generator

import org.eclipse.core.runtime.SafeRunner
import org.eclipse.core.runtime.Platform

class TransformationRegistryConfigurerHandler {
    static val EXTENSION_POINT_FQN = "org.palladiosimulator.textual.tpcm.configure";
    
    def static void execute() {
        val extensions = Platform.extensionRegistry.getConfigurationElementsFor(EXTENSION_POINT_FQN);
        for (element : extensions) {
        	val ext = element.createExecutableExtension("class")
        	if(ext instanceof TransformationRegistryConfigurer) {
        	    SafeRunner.run [
        	        (ext as TransformationRegistryConfigurer).configure(GeneratorTransformationRegistry.INSTANCE);
        	    ]
        	}
        }
    }
}