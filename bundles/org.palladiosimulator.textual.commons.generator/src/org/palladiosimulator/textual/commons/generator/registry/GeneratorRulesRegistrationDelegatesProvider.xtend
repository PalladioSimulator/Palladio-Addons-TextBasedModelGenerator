package org.palladiosimulator.textual.commons.generator.registry

import java.util.List

@FunctionalInterface
interface GeneratorRulesRegistrationDelegatesProvider {
    def List<GeneratorRulesRegistrationDelegate> getRegistrationDelegates();
}