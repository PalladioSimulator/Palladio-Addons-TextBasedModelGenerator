package org.palladiosimulator.textual.tpcm.util;

import java.util.Optional;

import org.palladiosimulator.textual.tpcm.language.PrimitiveTypeEnum;

import com.google.inject.ImplementedBy;

import de.uka.ipd.sdq.stoex.analyser.visitors.TypeEnum;

@ImplementedBy(DefaultStoexTypeConverter.class)
public interface IStoexTypeConverter {
	
	Optional<PrimitiveTypeEnum> getTPCMPrimitiveType(TypeEnum stoexEnum);

}
