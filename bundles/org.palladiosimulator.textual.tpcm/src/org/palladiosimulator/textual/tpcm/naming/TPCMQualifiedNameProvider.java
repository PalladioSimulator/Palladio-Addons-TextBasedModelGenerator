package org.palladiosimulator.textual.tpcm.naming;

import java.util.Arrays;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.palladiosimulator.textual.tpcm.language.AssemblyContext;
import org.palladiosimulator.textual.tpcm.language.Datatype;
import org.palladiosimulator.textual.tpcm.language.LanguagePackage;

import com.google.inject.Inject;

public class TPCMQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	@Inject
	private IQualifiedNameConverter converter;

	protected QualifiedName qualifiedName(AssemblyContext ctx) {
		// Handle the case of the short hand assembly notation by virtually containing
		// in the enclosing entity
		var qfn = getParentFQNWithoutDirectContainerIfInstance(ctx, 
				LanguagePackage.Literals.SYSTEM_PROVIDED_ROLE,
				LanguagePackage.Literals.CONNECTOR);
				
		return qfn.append(converter.toQualifiedName(ctx.getName()));
	}
	
	protected QualifiedName qualifiedName(Datatype dt) {
		// Handle the case of the short hand data type declaration syntax by virtually containing
		// in the enclosing entity
		var qfn = getParentFQNWithoutDirectContainerIfInstance(dt, 
				LanguagePackage.Literals.COMPOSED_DATATYPE_ELEMENT);
				
		return qfn.append(converter.toQualifiedName(dt.getName()));
	}
	
	protected QualifiedName getParentFQNWithoutDirectContainerIfInstance(EObject object, EClass... classes) {
		final var directContainer = object.eContainer();
		EObject container = directContainer;
		if (directContainer != null) {
			if (Arrays.asList(classes).stream().anyMatch(cls -> cls.isInstance(directContainer))) {
				container = directContainer.eContainer();
			}
		}
		if (container != null) {
			return getFullyQualifiedName(container);
		}
		return QualifiedName.EMPTY;
	}

}
