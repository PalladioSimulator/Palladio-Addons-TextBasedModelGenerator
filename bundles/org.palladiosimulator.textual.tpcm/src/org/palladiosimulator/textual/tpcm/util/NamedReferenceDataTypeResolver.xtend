package org.palladiosimulator.textual.tpcm.util

import de.uka.ipd.sdq.stoex.AbstractNamedReference
import de.uka.ipd.sdq.stoex.NamespaceReference
import de.uka.ipd.sdq.stoex.StoexPackage
import de.uka.ipd.sdq.stoex.VariableReference
import org.palladiosimulator.textual.tpcm.language.CollectionDatatype
import org.palladiosimulator.textual.tpcm.language.ComposedDatatype
import org.palladiosimulator.textual.tpcm.language.Datatype
import org.palladiosimulator.textual.tpcm.language.LanguagePackage
import org.palladiosimulator.textual.tpcm.language.PrimitiveDatatype
import org.palladiosimulator.textual.tpcm.language.PrimitiveTypeEnum
import org.eclipse.lsp4j.jsonrpc.messages.Either

class NamedReferenceDataTypeResolver implements INamedReferenceDataTypeResolver {
    
    override resolveRequiredPrimitive(AbstractNamedReference ref, Datatype datatype) {
        return resolve(ref, datatype)
    }
    
    def dispatch Either<FeatureBasedTraversalError, PrimitiveTypeEnum> resolve(NamespaceReference ref, ComposedDatatype datatype) {
        var nested = datatype.elements.findFirst[name == ref.referenceName]
        if (nested === null) {
            return Either.forLeft(FeatureBasedTraversalError.create(StoexPackage.Literals.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME, 
                ref, '''«ref.referenceName» does not exist in the enclosing namespace'''))
        } else {
            if (nested.type !== null) {
                return resolve(ref.innerReference_NamespaceReference, nested.type)
            } else if (nested.reference !== null) {
                return resolve(ref.innerReference_NamespaceReference, nested.reference)
            } else {
                return Either.forLeft(FeatureBasedTraversalError.create(LanguagePackage.Literals.COMPOSED_DATATYPE_ELEMENT__TYPE,
                    nested, '''The type of «nested.name» cannot be determined.'''))
            }            
        }
    }
    
    def dispatch Either<FeatureBasedTraversalError, PrimitiveTypeEnum> resolve(NamespaceReference ref, CollectionDatatype datatype) {
        switch (ref.referenceName) {
            case "INNER": return resolve(ref.innerReference_NamespaceReference, datatype.collectionType)
            default: return Either.forLeft(FeatureBasedTraversalError.create(StoexPackage.Literals.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME,
                ref, '''«ref.referenceName» is not a valid member of a collection type. Use INNER if you want to refer to the type of the collection elements.'''))
        }
    }  
    
    def dispatch Either<FeatureBasedTraversalError, PrimitiveTypeEnum> resolve(VariableReference ref, PrimitiveDatatype datatype) {
        switch (ref.referenceName) {
            case "BYTESIZE": return Either.forRight(PrimitiveTypeEnum.INT)
            case "VALUE": return Either.forRight(datatype.type)
            case "TYPE": return Either.forRight(PrimitiveTypeEnum.STRING)
            case "STRUCTURE": return Either.forRight(PrimitiveTypeEnum.STRING)
            default: return Either.forLeft(FeatureBasedTraversalError.create(StoexPackage.Literals.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME,
                ref, '''«ref.referenceName» is not a valid characteristic for the type «datatype.name».'''))
        }
    } 
    
    def dispatch Either<FeatureBasedTraversalError, PrimitiveTypeEnum> resolve(VariableReference ref, CollectionDatatype datatype) {
        switch (ref.referenceName) {
            case "BYTESIZE": return Either.forRight(PrimitiveTypeEnum.INT)
            case "NUMBER_OF_ELEMENTS": return Either.forRight(PrimitiveTypeEnum.INT)
            case "TYPE": return Either.forRight(PrimitiveTypeEnum.STRING)
            case "STRUCTURE": return Either.forRight(PrimitiveTypeEnum.STRING)
            default: return Either.forLeft(FeatureBasedTraversalError.create(StoexPackage.Literals.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME,
                ref, '''«ref.referenceName» is not a valid characteristic on a collection type.'''))
        }
    }  
    
    def dispatch Either<FeatureBasedTraversalError, PrimitiveTypeEnum> resolve(VariableReference ref, ComposedDatatype datatype) {
         switch (ref.referenceName) {
            case "BYTESIZE": return Either.forRight(PrimitiveTypeEnum.INT)
            case "TYPE": return Either.forRight(PrimitiveTypeEnum.STRING)
            case "STRUCTURE": return Either.forRight(PrimitiveTypeEnum.STRING)
            default: return Either.forLeft(FeatureBasedTraversalError.create(StoexPackage.Literals.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME,
                ref, '''«ref.referenceName» is not a valid characteristic on a composition type.'''))  
        }   
    }
        
}
