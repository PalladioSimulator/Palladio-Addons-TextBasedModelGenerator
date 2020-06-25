/*
 * generated by Xtext 2.22.0
 */
package com.palladiosimulator.textual.repository.tests

import com.google.inject.Inject
import com.palladiosimulator.textual.repository.repoLang.Repository
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(RepoLangInjectorProvider)
class RepoLangParsingTest {
	@Inject
	ParseHelper<Repository> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: �errors.join(", ")�''', errors.isEmpty)
	}
}
