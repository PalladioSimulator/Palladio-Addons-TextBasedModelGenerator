package org.palladiosimulator.textual.tpcm.configuration

import de.uka.ipd.sdq.stoex.Expression
import org.eclipse.xtext.nodemodel.util.NodeModelUtils

class ExpressionConverter {
    def static String getOriginalExpressionString (Expression expression) {
        return NodeModelUtils.findActualNodeFor(expression).text
    }
}