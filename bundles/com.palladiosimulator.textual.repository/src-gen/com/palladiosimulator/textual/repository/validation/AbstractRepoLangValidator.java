/*
 * generated by Xtext 2.22.0
 */
package com.palladiosimulator.textual.repository.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractRepoLangValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(com.palladiosimulator.textual.repository.repoLang.RepoLangPackage.eINSTANCE);
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://palladiosimulator.org/PalladioComponentModel/Repository/5.2"));
		return result;
	}
}
