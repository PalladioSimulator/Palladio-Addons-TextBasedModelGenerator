package org.palladiosimulator.textual.commons.generator

import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.emf.ecore.resource.ResourceSet

interface MultiSourceGenerator extends IGenerator2 {
    def void doGenerate(ResourceSet resources, IFileSystemAccess2 fsa, IGeneratorContext context)
}