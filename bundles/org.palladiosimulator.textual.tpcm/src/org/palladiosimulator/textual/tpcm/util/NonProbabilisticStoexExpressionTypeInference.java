package org.palladiosimulator.textual.tpcm.util;

import java.util.Optional;

import javax.inject.Inject;

import org.palladiosimulator.textual.tpcm.language.PrimitiveTypeEnum;

import de.uka.ipd.sdq.stoex.Expression;
import de.uka.ipd.sdq.stoex.analyser.visitors.NonProbabilisticExpressionInferTypeVisitor;

public class NonProbabilisticStoexExpressionTypeInference implements IExpressionPrimitiveTypeInference {

	@Inject
	IStoexTypeConverter stoexTypeConverter;
	
	@Override
	public Optional<PrimitiveTypeEnum> getExpressionType(Expression expression) {
		var visitor = new NonProbabilisticExpressionInferTypeVisitor();
		var type = visitor.getType(expression);
		return stoexTypeConverter.getTPCMPrimitiveType(type);
	}

}
