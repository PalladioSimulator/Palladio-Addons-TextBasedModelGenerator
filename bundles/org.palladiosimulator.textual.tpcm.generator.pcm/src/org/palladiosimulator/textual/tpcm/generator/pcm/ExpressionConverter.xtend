package org.palladiosimulator.textual.tpcm.generator.pcm

import de.uka.ipd.sdq.stoex.Expression
import org.eclipse.xtext.nodemodel.util.NodeModelUtils

class ExpressionConverter {
    def static String getOriginalExpressionString (Expression expression) {
        return NodeModelUtils.findActualNodeFor(expression).text
    }
}