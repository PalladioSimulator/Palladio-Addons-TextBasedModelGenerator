package org.palladiosimulator.textual.tpcm.generator

import org.eclipse.xtext.builder.BuilderParticipant
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import org.eclipse.xtext.resource.IContainer
import com.google.inject.Inject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.CoreException
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.resource.IResourceDescription.Delta
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.builder.IXtextBuilderParticipant.IBuildContext
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2
import org.eclipse.xtext.generator.GeneratorContext
import org.eclipse.xtext.util.CancelIndicator

class CustomBuilderParticipant extends BuilderParticipant {
    @Inject
    ResourceDescriptionsProvider resourceDescriptionsProvider;

    @Inject
    IContainer.Manager containerManager;

    @Inject(optional=true)
    MultiSourceGenerator generator;

    protected ThreadLocal<Boolean> buildSemaphor = new ThreadLocal<Boolean>();

    override void build(IBuildContext context, IProgressMonitor monitor) throws CoreException {
        buildSemaphor.set(false);
        super.build(context, monitor);
    }

    override void handleChangedContents(Delta delta, IBuildContext context, IFileSystemAccess fileSystemAccess) {
        if (!buildSemaphor.get() && generator !== null) {
            invokeGenerator(delta, context, fileSystemAccess);
        } else {
            super.handleChangedContents(delta, context, fileSystemAccess);
        }
    }

    override protected handleChangedContents(Delta delta, IBuildContext context,
        EclipseResourceFileSystemAccess2 fileSystemAccess) throws CoreException {
        if (!buildSemaphor.get() && generator !== null) {
            invokeGenerator(delta, context, fileSystemAccess);
        } else {
            super.handleChangedContents(delta, context, fileSystemAccess);
        }
    }

    def invokeGenerator(Delta delta, IBuildContext context, IFileSystemAccess fileSystemAccess) {
        buildSemaphor.set(true);
        var generatorContext = new GeneratorContext();
        generatorContext.cancelIndicator = CancelIndicator.NullImpl
        var resource = context.getResourceSet().getResource(delta.getUri(), true);
        if (shouldGenerate(resource, context)) {
            var index = resourceDescriptionsProvider.createResourceDescriptions();
            var resDesc = index.getResourceDescription(resource.getURI());
            var visibleContainers = containerManager.getVisibleContainers(resDesc, index);
            for (IContainer c : visibleContainers) {
                for (IResourceDescription rd : c.getResourceDescriptions()) {
                    context.getResourceSet().getResource(rd.getURI(), true);
                }
            }

            var resourceSet = context.getResourceSet()
            generator.doGenerate(resourceSet, fileSystemAccess as EclipseResourceFileSystemAccess2, generatorContext);
        }
        return delta
    }
}
