package org.palladiosimulator.textual.tpcm.generator.pcm;

import org.palladiosimulator.textual.commons.generator.MultiModelGeneratorFragment;
import org.palladiosimulator.textual.commons.generator.MultiModelGeneratorFragmentProvider;

import com.google.inject.Injector;

public class PCMGeneratorFragmentProvider implements MultiModelGeneratorFragmentProvider {
    
    @Override
    public String getLanguage() {
        return "org.palladiosimulator.textual.tpcm.TPCM";
    }
    
    @Override
    public MultiModelGeneratorFragment getGeneratorFragment(Injector injector) {
        return injector.createChildInjector(new TPCMGeneratorModule())
            .getInstance(MultiModelGeneratorFragment.class);
    }
}
