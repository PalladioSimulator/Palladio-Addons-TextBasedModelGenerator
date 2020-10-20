package org.palladiosimulator.textual.commons.generator.impl

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.emf.ecore.resource.Resource
import org.palladiosimulator.textual.commons.generator.MultiSourceGenerator

abstract class AbstractMultiSourceGenerator extends AbstractGenerator implements MultiSourceGenerator {
    
    override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
        doGenerate(input.resourceSet, fsa, context);
    }
    
}
