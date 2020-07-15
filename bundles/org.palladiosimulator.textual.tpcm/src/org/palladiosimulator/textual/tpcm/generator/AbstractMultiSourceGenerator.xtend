package org.palladiosimulator.textual.tpcm.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.emf.ecore.resource.Resource

abstract class AbstractMultiSourceGenerator extends AbstractGenerator implements MultiSourceGenerator {
    
    override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
        doGenerate(input.resourceSet, fsa, context);
    }
    
}