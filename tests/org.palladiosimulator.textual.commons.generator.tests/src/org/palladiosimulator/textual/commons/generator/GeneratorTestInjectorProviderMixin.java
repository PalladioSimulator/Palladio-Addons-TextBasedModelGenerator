package org.palladiosimulator.textual.commons.generator;

import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.util.Modules2;
import org.palladiosimulator.textual.commons.generator.eclipse.EclipseMultiModelGeneratorModule;
import org.palladiosimulator.textual.commons.generator.standalone.StandaloneMultiModelGeneratorModule;

public interface GeneratorTestInjectorProviderMixin {

    com.google.inject.Module getRuntimeModule();
    
    default com.google.inject.Module getModuleWithTestMixins() {
        return Modules2.mixin(getRuntimeModule(), getGeneratorModule(), new GeneratorTestModule());
    }
    
    default com.google.inject.Module getGeneratorModule() {
        if (Platform.isRunning()) {
            return new EclipseMultiModelGeneratorModule() {
                @Override
                public Class<? extends IXtextBuilderParticipant> bindIXtextBuilderParticipant() {
                    return null;
                }   
            };
        } else {
            return new StandaloneMultiModelGeneratorModule() {
                @Override
                public Class<? extends IXtextBuilderParticipant> bindIXtextBuilderParticipant() {
                    return null;
                }   
            };
        }
    }
    
    
    
    
    
}
