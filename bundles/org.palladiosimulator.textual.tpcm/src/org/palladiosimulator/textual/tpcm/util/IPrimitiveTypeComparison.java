package org.palladiosimulator.textual.tpcm.util;

import org.palladiosimulator.textual.tpcm.language.PrimitiveTypeEnum;

import com.google.inject.ImplementedBy;

@ImplementedBy(IPrimitiveTypeComparison.DefaultComparison.class)
public interface IPrimitiveTypeComparison {
	
	boolean isAssignableFrom(PrimitiveTypeEnum targetType, PrimitiveTypeEnum assignableFromType);
	
	public class DefaultComparison implements IPrimitiveTypeComparison {
		@Override
		public boolean isAssignableFrom(PrimitiveTypeEnum targetType, PrimitiveTypeEnum assignableFromType) {
			if (targetType == null || assignableFromType == null) {
				return false;
			} else if (targetType == assignableFromType) {
				return true;
			} else if (targetType == PrimitiveTypeEnum.DOUBLE) {
				return assignableFromType == PrimitiveTypeEnum.LONG
						|| assignableFromType == PrimitiveTypeEnum.INT
						|| assignableFromType == PrimitiveTypeEnum.BYTE;
			} else if (targetType == PrimitiveTypeEnum.LONG) {
				return assignableFromType == PrimitiveTypeEnum.INT
						|| assignableFromType == PrimitiveTypeEnum.BYTE;
			} else if (targetType == PrimitiveTypeEnum.INT) {
				return assignableFromType == PrimitiveTypeEnum.BYTE;
			} else if (targetType == PrimitiveTypeEnum.STRING) {
				return assignableFromType == PrimitiveTypeEnum.CHAR;
			}
			return false;
		}
	}

}
