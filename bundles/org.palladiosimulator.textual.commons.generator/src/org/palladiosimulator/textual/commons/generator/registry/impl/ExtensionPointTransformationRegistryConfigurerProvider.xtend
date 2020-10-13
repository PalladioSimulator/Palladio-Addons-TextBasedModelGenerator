package org.palladiosimulator.textual.commons.generator.registry.impl

import java.util.Collections
import org.eclipse.core.runtime.Platform
import org.palladiosimulator.textual.commons.generator.registry.GeneratorRulesRegistrationDelegate
import org.palladiosimulator.textual.commons.generator.registry.GeneratorRulesRegistrationDelegatesProvider

class ExtensionPointTransformationRegistryConfigurerProvider implements GeneratorRulesRegistrationDelegatesProvider {
    static val EXTENSION_POINT_FQN = "org.palladiosimulator.textual.tpcm.configure";

    override getRegistrationDelegates() {
        val extensionRegistry = Platform.extensionRegistry
        if (extensionRegistry === null) {
            return Collections.emptyList();
        }

        val extensions = extensionRegistry.getConfigurationElementsFor(EXTENSION_POINT_FQN);
        return extensions.map[it.createExecutableExtension("class")].filter(GeneratorRulesRegistrationDelegate).toList
    }

}
