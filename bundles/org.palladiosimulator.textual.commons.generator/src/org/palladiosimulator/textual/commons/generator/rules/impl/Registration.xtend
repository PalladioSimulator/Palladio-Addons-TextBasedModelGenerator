package org.palladiosimulator.textual.commons.generator.rules.impl

import java.util.ArrayList
import java.util.function.Function
import java.util.function.Predicate
import java.util.List
import java.util.function.Consumer
import org.palladiosimulator.textual.commons.generator.registry.ChildPropertyMapping
import org.palladiosimulator.textual.commons.generator.registry.GeneratorTransformationRegistry
import org.palladiosimulator.textual.commons.generator.rules.ExecutableRule

/**
 * A registration denotes a registered transformation of an object of type A to an object of type B.
 * This registration also contains all the necessary instructions for when a transformation should happen 
 * (what is called a "predicate" here), how the target is created as well as all what transformation steps need to happen.
 */
class Registration<S, T> implements ExecutableRule<S, T> {
    static final Predicate<Object> DEFAULT_PREDICATE = [true];
    
    final Class<S> mappingSource;
    final Class<T> mappingTarget;
    Function<S, T> factory;
    Predicate<S> predicate = DEFAULT_PREDICATE as Predicate<S>;
    Consumer<T> callback = [];
    final List<ChildPropertyMapping<S, T>> contents = new ArrayList;

    new(Class<S> source, Class<T> target, Function<S, T> factory) {
        this(source, target)
        this.factory = factory;
    }

    new(Class<S> source, Class<T> target) {
        this.mappingSource = source;
        this.mappingTarget = target;
    }
    
    def Class<S> getSourceType() {
        return mappingSource;
    }
    
    def Class<T> getTargetType() {
        return mappingTarget;
    }

    /**
     * Tests whether this registration can be used to transform the given source object.
     * 
     * @param instance The object instance to check the mapping for
     */
    def boolean doesMap(Object instance) {
        return mappingSource.isAssignableFrom(instance.class) && predicate.test(mappingSource.cast(instance));
    }
    
    /**
     * Tests whether this registration can be used to transform the given source object into the given
     * target type. If the target type is null, this behaves the same as doesMap(Object).
     * 
     * @param instance The object instance to check the transformation for
     * @param target The desired resulting type of the transformation
     * 
     * @see #doesMap(Object)
     */
    override boolean appliesTo(Object instance, Class<?> target) {
        return (target === null || mappingTarget === target) && doesMap(instance);
    }
    
    /**
     * Checks whether the registration has a predicate.
     */
    def boolean hasPredicate() {
        return predicate !== DEFAULT_PREDICATE;
    }
    
    def boolean hasFactory() {
        return factory !== null;
    }

    /**
     * Creates the target object from the source object using the configured factory.
     * 
     * @see #setFactory(Function)
     */
    def T create(S source) {
        return factory.apply(source);
    }

    /**
     * Adds a transformation for a child property of the source object.
     */
    def addPropertyMapping(ChildPropertyMapping<S, T> mapping) {
        contents.add(mapping)
    }

    def setPredicate(Predicate<S> pred) {
        predicate = pred;
    }

    def setFactory(Function<S, T> factory) {
        this.factory = factory;
    }
    
    def setCallback(Consumer<T> callback) {
        this.callback = callback
    }
    
    /**
     * Applies the complete transformation of the source to the configured target type.
     * 
     * @param source The source object to transform.
     * @param registry The registry to use for resolving possible transformations of child elements.
     * @return The transformed target object.
     */
    override applyTo(S source, T target, GeneratorTransformationRegistry registry) {
        try {
            contents.forEach [
                it.run(source, target, registry)
            ]
        } catch(Exception e) {
            throw new RuntimeException("Exception occurred when transforming object of type " + source.class.simpleName + " to " + target.class.simpleName, e)
        }
        callback.accept(target)
    }
    
     override <U, V> conflictsWith(ExecutableRule<U, V> conflictCandidate) {
        if (conflictCandidate instanceof Registration) {
            if (conflictCandidate.sourceType == this.sourceType && conflictCandidate.targetType == this.targetType && !this.hasPredicate && !conflictCandidate.hasPredicate) {
                return true;    
            }
        } 
        false
    }
    
}