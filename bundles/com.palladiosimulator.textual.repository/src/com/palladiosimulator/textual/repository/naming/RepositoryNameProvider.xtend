package com.palladiosimulator.textual.repository.naming

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.palladiosimulator.pcm.repository.CollectionDataType
import org.palladiosimulator.pcm.repository.CompositeDataType
import org.palladiosimulator.pcm.repository.Repository
import org.eclipse.xtext.naming.QualifiedName
import org.palladiosimulator.pcm.resourcetype.ResourceType

class RepositoryNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	def qualifiedName(ResourceType r) {
		QualifiedName.create(r.entityName)
	}
	
	def qualifiedName(Repository r) {
		QualifiedName.create(r.entityName)
	}

	def qualifiedName(CollectionDataType d) {
		QualifiedName.create(d.entityName)
	}
	
	def qualifiedName(CompositeDataType d) {
		QualifiedName.create(d.entityName)
	}

	
	
}