package org.palladiosimulator.textual.commons.generator.registry;

import org.eclipse.emf.ecore.EObject;

public interface RootElementFilter {
    
    boolean translatesToRootElement(EObject object);

}
