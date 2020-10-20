package org.palladiosimulator.textual.commons.generator.standalone;

import java.util.ServiceLoader;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.xtext.Constants;
import org.palladiosimulator.textual.commons.generator.MultiModelGeneratorFragment;
import org.palladiosimulator.textual.commons.generator.MultiModelGeneratorFragmentCollector;
import org.palladiosimulator.textual.commons.generator.MultiModelGeneratorFragmentProvider;

import com.google.inject.Injector;

public class ServiceLoaderMultiModuleGeneratorFragmentCollector implements MultiModelGeneratorFragmentCollector {
    private final String languageName;
    private final Injector injector;

    @Inject
    public ServiceLoaderMultiModuleGeneratorFragmentCollector(@Named(Constants.LANGUAGE_NAME) String languageName,
            Injector injector) {
        this.languageName = languageName;
        this.injector = injector;
    }

    @Override
    public Iterable<MultiModelGeneratorFragment> getGeneratorFragments() {
        var loader = ServiceLoader.load(MultiModelGeneratorFragmentProvider.class);
        return loader.stream()
            .map(p -> p.get())
            .filter(fp -> fp.getLanguage().equals(languageName))
            .map(prov -> ((MultiModelGeneratorFragmentProvider) prov).getGeneratorFragment(injector))
            .collect(Collectors.toList());
    }


}
