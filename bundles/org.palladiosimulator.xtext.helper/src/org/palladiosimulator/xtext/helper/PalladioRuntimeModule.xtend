package org.palladiosimulator.xtext.helper

import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule

class PalladioRuntimeModule extends AbstractGenericResourceRuntimeModule {
	
	override protected getFileExtensions() {
		"repository,system,usage,allocation"
	}
	
	override protected getLanguageName() {
		"PCM"
	}
	
	def bindIDefaultResourceDescriptionStrategy() {
		 return PalladioResourceDescriptionStrategy
	}
		
	override bindIQualifiedNameProvider() {
		return PalladioQualifiedNameProvider
	}
	
}