package org.palladiosimulator.textual.tpcm.generator.pcm;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.textual.commons.generator.registry.RootElementFilter;
import org.palladiosimulator.textual.tpcm.language.LanguagePackage;

public class TPCMRootElementFilter implements RootElementFilter {

    @Override
    public boolean translatesToRootElement(EObject object) {
        return LanguagePackage.eINSTANCE.getFragment().isInstance(object)
                && !LanguagePackage.eINSTANCE.getMappingConfiguration().isInstance(object);
    }

}
