package org.palladiosimulator.textual.tpcm.util;

import org.palladiosimulator.textual.tpcm.language.Datatype;
import org.palladiosimulator.textual.tpcm.language.PrimitiveTypeEnum;

import com.google.inject.ImplementedBy;

import de.uka.ipd.sdq.stoex.AbstractNamedReference;
import org.eclipse.lsp4j.jsonrpc.messages.Either;

@ImplementedBy(NamedReferenceDataTypeResolver.class)
public interface INamedReferenceDataTypeResolver {

	Either<FeatureBasedTraversalError, PrimitiveTypeEnum> resolveRequiredPrimitive(AbstractNamedReference ref, Datatype datatype);
	
}
