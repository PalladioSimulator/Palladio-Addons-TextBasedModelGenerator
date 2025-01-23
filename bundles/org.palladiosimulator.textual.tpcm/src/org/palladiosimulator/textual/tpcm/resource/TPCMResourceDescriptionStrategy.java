package org.palladiosimulator.textual.tpcm.resource;

import java.util.HashMap;

import com.google.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;
import org.eclipse.xtext.util.IAcceptor;
import org.palladiosimulator.textual.tpcm.language.Model;

import com.google.common.collect.Lists;

public class TPCMResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
	public static final String INCLUDES = "includes";
	public static final String ENTITY_TYPE = "entity_type";

	@Inject
	ImportUriResolver uriResolver;

	@Override
	public boolean createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if (eObject instanceof Model) {
			this.createEObjectDescriptionForModel((Model) eObject, acceptor);
			return true;
		}  else {
			return super.createEObjectDescriptions(eObject, acceptor);
		}
	}

	private void createEObjectDescriptionForModel(Model model, IAcceptor<IEObjectDescription> acceptor) {
		final var uris = Lists.<String>newArrayList();

		model.getImports().stream().map(uriResolver).forEach(uris::add);
		final var userData = new HashMap<String, String>();
		userData.put(INCLUDES, String.join(",", uris));

		acceptor.accept(EObjectDescription.create(QualifiedName.create(model.eResource().getURI().toString()), model,
				userData));
	}
}
