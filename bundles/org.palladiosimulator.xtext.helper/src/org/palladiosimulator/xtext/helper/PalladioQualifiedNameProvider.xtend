package org.palladiosimulator.xtext.helper

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.emf.ecore.EObject

import org.palladiosimulator.pcm.repository.Interface
import org.palladiosimulator.pcm.repository.CompositeDataType
import org.eclipse.xtext.naming.QualifiedName
import org.palladiosimulator.pcm.repository.CollectionDataType
import org.palladiosimulator.pcm.core.entity.Entity

class PalladioQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	override getFullyQualifiedName(EObject obj) {
		return  obj.toFQN
	}
	
	def dispatch toFQN(EObject d) {
		QualifiedName.create(d.toString)
	}
	
	def dispatch toFQN(Entity e) {
		val container = e.eContainer
		if (container != null && container instanceof Entity)
			return QualifiedName.create(container.qualifiedName.toString, e.entityName)
			
		QualifiedName.create(e.entityName)
	}
	
	def dispatch toFQN(CompositeDataType d) {
		QualifiedName.create(d.repository__DataType.entityName, d.entityName)
		
	}
	
	def dispatch toFQN(CollectionDataType d) {
		QualifiedName.create(d.repository__DataType.entityName, d.entityName)
		
	}
	
	def dispatch toFQN(Interface i) {
		QualifiedName.create(i.repository__Interface.entityName, i.entityName)
	}
	
	
}