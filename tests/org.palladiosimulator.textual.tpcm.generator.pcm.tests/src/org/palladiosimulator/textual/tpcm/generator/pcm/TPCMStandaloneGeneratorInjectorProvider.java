package org.palladiosimulator.textual.tpcm.generator.pcm;

import org.palladiosimulator.textual.commons.generator.GeneratorTestInjectorProviderMixin;
import org.palladiosimulator.textual.tpcm.TPCMRuntimeModule;
import org.palladiosimulator.textual.tpcm.TPCMStandaloneSetup;
import org.palladiosimulator.textual.tpcm.tests.TPCMInjectorProvider;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class TPCMStandaloneGeneratorInjectorProvider extends TPCMInjectorProvider implements GeneratorTestInjectorProviderMixin {
    
    @Override
    protected Injector internalCreateInjector() {
        return new TPCMStandaloneSetup() {
            @Override
            public Injector createInjector() {
                return Guice.createInjector(getModuleWithTestMixins());
            }
        }.createInjectorAndDoEMFRegistration();
    }

    @Override
    public Module getRuntimeModule() {
        return new TPCMRuntimeModule();
    }
    
}
