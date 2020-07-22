package org.palladiosimulator.textual.tpcm.registry

import java.util.List

@FunctionalInterface
interface TransformationRegistryConfigurerProvider {
    def List<TransformationRegistryConfigurer> getConfigurer();
}