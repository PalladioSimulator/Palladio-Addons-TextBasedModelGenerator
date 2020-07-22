package org.palladiosimulator.textual.tpcm.registry

import org.palladiosimulator.textual.tpcm.registry.TransformationRegistryConfigurerProvider
import org.eclipse.core.runtime.Platform
import java.util.Collections

class ExtensionPointTransformationRegistryConfigurerProvider implements TransformationRegistryConfigurerProvider {
    static val EXTENSION_POINT_FQN = "org.palladiosimulator.textual.tpcm.configure";

    override getConfigurer() {
        val extensionRegistry = Platform.extensionRegistry
        if (extensionRegistry === null) {
            return Collections.emptyList();
        }

        val extensions = extensionRegistry.getConfigurationElementsFor(EXTENSION_POINT_FQN);
        return extensions.map[it.createExecutableExtension("class")].filter(TransformationRegistryConfigurer).toList
    }

}
