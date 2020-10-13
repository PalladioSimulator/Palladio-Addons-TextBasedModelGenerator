package org.palladiosimulator.textual.commons.generator.rules

import java.util.function.Function
import java.util.List
import java.util.function.Predicate
import java.util.function.Consumer

interface GeneratorRuleBuilder<S, T> {
    /**
     * Defines a transformation for a child element.
     * 
     * @param contentProvider Provider for how get this element from the source element
     * @param target The desired target type for these elements
     * @see ValueApplierConfigurer
     */
    def <PS, PT> ValueApplierRule<PT, T> map(Function<S, PS> contentProvider, Class<PT> target);
    
    /**
     * Defines a transformation for a child element.
     * 
     * @param contentProvider Provider for how get this element from the source element
     * @see ValueApplierConfigurer
     */
    def <PS, PT> ValueApplierRule<PT, T> map(Function<S, PS> contentProvider);

    /**
     * Defines a transformation for child elements.
     * 
     * @param contentProvider Provider for how get these elements from the source element
     * @see ValueApplierConfigurer
     */
    def <PS, PT> ValueApplierRule<List<PT>, T> mapAll(Function<S, ? extends List<PS>> contentProvider);
   
    /**
     * Defines a transformation for child elements.
     * 
     * @param contentProvider Provider for how get these elements from the source element
     * @param target The desired target type for these elements
     * @see ValueApplierConfigurer
     */
    def <PS, PT> ValueApplierRule<List<PT>, T> mapAll(Function<S, ? extends List<PS>> contentProvider, Class<PT> target);

    /** 
     * (Required)
     * Defines how the target object can be created from the given source.
     */
    def void setCreate(Function<S, T> factory);

    /**
     * (Optional)
     * Defines a predicate for this transformation. This makes sure that the transformation only happens, if the
     * predicate defined here tests successfully.
     */
    def void setWhen(Predicate<S> guard);
    
    /**
     * (Optional)
     * Defines what to do after all child element transformations have finished.
     */
    def void setAfter(Consumer<T> callback);
    
    /**
     * Build the resulting rule.
     */
    def ExecutableRule<S, T> build();
}