package org.palladiosimulator.textual.tpcm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class FeatureBasedTraversalError {
	
	public EStructuralFeature feature;
	public EObject object;
	public String description;

	public static FeatureBasedTraversalError create(EStructuralFeature feature,	EObject object,	String description) {
		var error = new FeatureBasedTraversalError();
		error.feature = feature;
		error.object = object;
		error.description = description;
		return error;
	}

}
