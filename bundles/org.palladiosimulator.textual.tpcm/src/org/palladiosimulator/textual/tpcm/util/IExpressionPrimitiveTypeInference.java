package org.palladiosimulator.textual.tpcm.util;

import java.util.Optional;

import org.palladiosimulator.textual.tpcm.language.PrimitiveTypeEnum;

import com.google.inject.ImplementedBy;

import de.uka.ipd.sdq.stoex.Expression;

@ImplementedBy(NonProbabilisticStoexExpressionTypeInference.class)
public interface IExpressionPrimitiveTypeInference {
	
	Optional<PrimitiveTypeEnum> getExpressionType(Expression expression);

}
