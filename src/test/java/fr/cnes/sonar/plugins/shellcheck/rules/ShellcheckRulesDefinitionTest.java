/*
 * This file is part of sonar-shellcheck-cnes-plugin.
 *
 * sonar-shellcheck-cnes-plugin is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * sonar-shellcheck-cnes-plugin is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with sonar-shellcheck-cnes-plugin.  If not, see <http://www.gnu.org/licenses/>.
 *//*

package fr.cnes.sonar.plugins.shellcheck.rules;

import fr.cnes.sonar.plugins.shellcheck.rules.ShellcheckRulesDefinition;
import org.junit.Assert;
import org.junit.Test;
import org.sonar.api.server.rule.RulesDefinition;

public class ShellcheckRulesDefinitionTest {

	@Test
	public void test_creation_of_repositories_and_rules() {
		RulesDefinition.Context context = new RulesDefinition.Context();
		Assert.assertEquals(0, context.repositories().size());
		new ShellcheckRulesDefinition().define(context);
		Assert.assertEquals(3, context.repositories().size());
		Assert.assertEquals(39, context.repository("shell-rules").rules().size());
		Assert.assertEquals(57, context.repository("f77-rules").rules().size());
		Assert.assertEquals(63, context.repository("f90-rules").rules().size());
	}

	@Test
	public void test_creation_of_repositories_and_rules_for_bad_language() {
		RulesDefinition.Context context = new RulesDefinition.Context();
		Assert.assertEquals(0, context.repositories().size());
		new ShellcheckRulesDefinition(){
			@Override
			public void define(Context context) {
				createRepository(context, "bad");
			}
		}.define(context);
		Assert.assertEquals(1, context.repositories().size());
		Assert.assertEquals(0, context.repository("bad-rules").rules().size());
	}

}
*/
