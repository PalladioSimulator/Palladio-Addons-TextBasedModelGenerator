package org.palladiosimulator.textual.tpcm.ui.internal;

import org.eclipse.xtext.util.Modules2;
import org.palladiosimulator.textual.commons.generator.eclipse.EclipseMultiModelGeneratorModule;
import org.palladiosimulator.textual.tpcm.ui.TPCMUiModule;

import com.google.inject.Module;

public class CustomTpcmActivator extends TpcmActivator {
    
    @Override
    protected Module getUiModule(String grammar) {
        if (ORG_PALLADIOSIMULATOR_TEXTUAL_TPCM_TPCM.equals(grammar)) {
            return Modules2.mixin(new TPCMUiModule(this), new EclipseMultiModelGeneratorModule());
        }
        throw new IllegalArgumentException(grammar);
    }

}
