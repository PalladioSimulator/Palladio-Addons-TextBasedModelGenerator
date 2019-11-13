package org.palladiosimulator.xtext.helper

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport

class PalladioSupport extends AbstractGenericResourceSupport {
	
	override protected createGuiceModule() {
		new PalladioRuntimeModule
	}
	
	
	
}