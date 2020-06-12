package org.palladiosimulator.textual.tpcm.configuration

import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext
import org.palladiosimulator.textual.tpcm.generator.GeneratorTransformationRegistry

class ConfigurationActivator implements BundleActivator {
    
    override start(BundleContext context) throws Exception {
        val configurer = new RegistryConfigurer
        val registry = GeneratorTransformationRegistry.INSTANCE
        configurer.setupRegistry(registry)
    }
    
    override stop(BundleContext context) throws Exception {
        
    }
    
}