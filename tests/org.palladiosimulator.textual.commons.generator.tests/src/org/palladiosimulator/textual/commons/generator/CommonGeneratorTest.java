package org.palladiosimulator.textual.commons.generator;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.util.Collections;

import com.google.inject.Inject;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.util.RuntimeIOException;
import org.junit.jupiter.api.BeforeAll;

import tools.mdsd.library.standalone.initialization.StandaloneInitializationException;
import tools.mdsd.library.standalone.initialization.StandaloneInitializerBuilder;

public class CommonGeneratorTest {
    @Inject
    MultiSourceGenerator underTest;
    @Inject
    IGeneratorContext dummyGeneratorContext;
    @Inject
    ParseHelper<?> parseHelper;

    @BeforeAll
    static void init() throws StandaloneInitializationException {
        StandaloneInitializerBuilder.builder()
            .useEcoreClasspathDetection(true)
            .build()
            .init();
    }

    protected ResourceSet parseAndGenerate(String tpcmModel) throws Exception {
        var model = parseHelper.parse(tpcmModel);
        var fsa = new InMemoryFileSystemAccess() {
            protected String getFileName(String fileName, String outputConfigName) {
                return String.format("%s///%s", outputConfigName, fileName);
            };
        };
        underTest.doGenerate(model.eResource()
            .getResourceSet(), fsa, dummyGeneratorContext);

        var res = new ResourceSetImpl();
        fsa.getAllFiles()
            .keySet()
            .forEach(name -> {
                var splitName = name.split("///");
                if (splitName.length != 2) {
                    fail("Assumptions of test case violated: outputConfig and filename should be separated by single occurence of \"///\"");
                }
                var r = res.createResource(fsa.getURI(splitName[1], splitName[0]));
                try {
                    r.load(fsa.readBinaryFile(splitName[1], splitName[0]), Collections.emptyMap());
                } catch (RuntimeIOException | IOException e) {
                    throw new RuntimeException(e);
                }
            });
        return res;
    }

}
