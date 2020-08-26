package org.palladiosimulator.textual.tpcm.naming;

import org.eclipse.xtext.naming.IQualifiedNameConverter.DefaultImpl;

public class TPCMQualifiedNameConverter extends DefaultImpl {
	
	@Override
	public String getDelimiter() {
		return "::";
	}

}
