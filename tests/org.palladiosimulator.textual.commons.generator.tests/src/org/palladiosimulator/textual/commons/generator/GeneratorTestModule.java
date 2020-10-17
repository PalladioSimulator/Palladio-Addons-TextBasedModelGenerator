package org.palladiosimulator.textual.commons.generator;

import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.service.AbstractGenericModule;
import org.eclipse.xtext.util.CancelIndicator;

import com.google.inject.Provider;

public class GeneratorTestModule extends AbstractGenericModule {
    
    public Provider<IGeneratorContext> provideGeneratorContext() {
        return () -> {
            var context = new GeneratorContext();
            context.setCancelIndicator(CancelIndicator.NullImpl);
            return context;
        };
    }
}
