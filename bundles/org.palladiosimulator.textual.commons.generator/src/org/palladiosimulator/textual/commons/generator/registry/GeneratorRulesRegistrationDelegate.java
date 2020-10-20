package org.palladiosimulator.textual.commons.generator.registry;

@FunctionalInterface
public interface GeneratorRulesRegistrationDelegate {
	void doRegistration(GeneratorRuleRegistrationFacade registry);
}
