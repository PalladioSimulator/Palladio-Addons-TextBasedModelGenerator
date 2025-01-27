package org.palladiosimulator.textual.commons.generator.eclipse;

import java.util.stream.Collectors;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import org.eclipse.xtext.Constants;
import org.palladiosimulator.commons.eclipseutils.ExtensionHelper;
import org.palladiosimulator.textual.commons.generator.MultiModelGeneratorFragment;
import org.palladiosimulator.textual.commons.generator.MultiModelGeneratorFragmentCollector;
import org.palladiosimulator.textual.commons.generator.MultiModelGeneratorFragmentProvider;

import com.google.inject.Injector;

public class ExtensionPointMultiModuleGeneratorFragmentCollector implements MultiModelGeneratorFragmentCollector {
    static final String EXTENSION_POINT_FQN = "org.palladiosimulator.textual.commons.generator.fragment";
    static final String EXTENSION_EXTENSION_ATTRIBUTE = "generator";
    static final String EXTENSION_CLASS_ATTRIBUTE = "class";
    static final String EXTENSION_LANGUAGE_ATTRIBUTE = "language";

    private final String languageName;
    private final Injector injector;

    @Inject
    public ExtensionPointMultiModuleGeneratorFragmentCollector(@Named(Constants.LANGUAGE_NAME) String languageName,
            Injector injector) {
        this.languageName = languageName;
        this.injector = injector;
    }

    @Override
    public Iterable<MultiModelGeneratorFragment> getGeneratorFragments() {
        return ExtensionHelper
            .getExecutableExtensions(EXTENSION_POINT_FQN, EXTENSION_EXTENSION_ATTRIBUTE, EXTENSION_CLASS_ATTRIBUTE,
                    EXTENSION_LANGUAGE_ATTRIBUTE, languageName, MultiModelGeneratorFragmentProvider.class)
            .stream()
            .map(prov -> prov.getGeneratorFragment(injector))
            .collect(Collectors.toList());
    }

}
