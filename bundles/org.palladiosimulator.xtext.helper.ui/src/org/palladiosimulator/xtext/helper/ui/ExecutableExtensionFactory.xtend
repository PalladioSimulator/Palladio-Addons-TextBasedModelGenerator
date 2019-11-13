package org.palladiosimulator.xtext.helper.ui

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory

class ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
	
	override protected getBundle() {
		return Activator.^default.bundle
	}
	
	override protected getInjector() {
		return Activator.^default.injector
	}
	
}