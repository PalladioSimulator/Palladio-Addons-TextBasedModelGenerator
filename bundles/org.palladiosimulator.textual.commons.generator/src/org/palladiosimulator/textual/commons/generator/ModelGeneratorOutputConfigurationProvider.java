package org.palladiosimulator.textual.commons.generator;

import java.util.Set;

import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfigurationProvider;

public class ModelGeneratorOutputConfigurationProvider extends OutputConfigurationProvider {
    
    @Override
    public Set<OutputConfiguration> getOutputConfigurations() {
        var result = super.getOutputConfigurations(); 
        if (result.size() > 0) {
            result.iterator().next().setOutputDirectory("./model-gen");
        }
        return result;
    }

}
