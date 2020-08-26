package org.palladiosimulator.textual.tpcm.util;

import java.util.Optional;

import org.palladiosimulator.textual.tpcm.language.PrimitiveTypeEnum;

import de.uka.ipd.sdq.stoex.analyser.visitors.TypeEnum;

public class DefaultStoexTypeConverter implements IStoexTypeConverter {

	@Override
	public Optional<PrimitiveTypeEnum> getTPCMPrimitiveType(TypeEnum stoexEnum) {
		switch (stoexEnum) {
		case BOOL:
		case BOOL_PMF:
			return Optional.of(PrimitiveTypeEnum.BOOL);

		case DOUBLE:
		case DOUBLE_PDF:
		case DOUBLE_PMF:
			return Optional.of(PrimitiveTypeEnum.DOUBLE);

		case ENUM:
		case ENUM_PMF:
			return Optional.of(PrimitiveTypeEnum.STRING);

		case INT:
		case INT_PMF:
			return Optional.of(PrimitiveTypeEnum.INT);

		default:
			return Optional.empty();
		}
	}

}
