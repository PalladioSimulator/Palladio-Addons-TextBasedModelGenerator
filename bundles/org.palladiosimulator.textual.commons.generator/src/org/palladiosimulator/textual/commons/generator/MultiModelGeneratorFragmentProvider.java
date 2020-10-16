package org.palladiosimulator.textual.commons.generator;

import com.google.inject.Injector;

public interface MultiModelGeneratorFragmentProvider {
    
    String getLanguage();

    MultiModelGeneratorFragment getGeneratorFragment(Injector injector);
    
}
