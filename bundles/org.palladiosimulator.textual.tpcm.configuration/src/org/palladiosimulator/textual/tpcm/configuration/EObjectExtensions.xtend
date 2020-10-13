package org.palladiosimulator.textual.tpcm.configuration

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.util.EList

class EObjectExtensions {
    static def <T extends EObject> addAllUnOwned(EList<T> list, Iterable<T> toAdd) {
        list.addAll(toAdd.filter[it.eContainer === null]);
    } 
}