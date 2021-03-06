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
 */
package fr.cnes.sonar.plugins.shellcheck.settings;

import org.sonar.api.PropertyType;
import org.sonar.api.config.PropertyDefinition;

import java.util.Arrays;
import java.util.List;

/**
 * Define all SonarQube properties provided by this plugin.
 */
public class ShellcheckPluginProperties {


    /**
     * Prefix used by all properties of this plugin.
     **/
    private static final String PROPERTIES_PREFIX = "sonar.shellcheck.";

    /**
     * ShellCheck name.
     **/
    public static final String SHELLCHECK_NAME = "ShellCheck";

    // project code file patterns
    /**
     * Key for the Shell suffix property
     **/
    public static final String SHELL_SUFFIX_KEY = PROPERTIES_PREFIX + "shell.file.suffixes";
    /**
     * Default value for the code suffix property
     **/
    public static final String SHELL_SUFFIX_DEFAULT = ".sh,.ksh,.bash";
    /**
     * Name for the code suffix property
     **/
    public static final String SHELL_SUFFIX_NAME = "Shell File Suffixes";
    /**
     * Description for the code suffix property
     **/
    public static final String SHELL_SUFFIX_DESC = "List of suffixes for Shell files to analyze.";

    // project code file patterns
    /**
     * Key for the F77 suffix property
     **/
    public static final String F77_SUFFIX_KEY = PROPERTIES_PREFIX + "f77.file.suffixes";
    /**
     * Default value for the code suffix property
     **/
    public static final String F77_SUFFIX_DEFAULT = ".f,.f77,.for,.fpp,.ftn,.F,.F77,.FOR,.FPP,.FTN";

    // project code file patterns
    /**
     * Key for the F90 suffix property
     **/
    public static final String F90_SUFFIX_KEY = PROPERTIES_PREFIX + "f90.file.suffixes";
    /**
     * Default value for the code suffix property
     **/
    public static final String F90_SUFFIX_DEFAULT = ".f90,.F90";
    /**
     * Name for the code suffix property
     **/
    public static final String F90_SUFFIX_NAME = "Fortran 90 File Suffixes";
    /**
     * Description for the code suffix property
     **/
    public static final String F90_SUFFIX_DESC = "List of suffixes for Fortran 90 files to analyze.";

    // Reports path
    /**
     * Key for the report path property
     **/
    public static final String REPORT_REGEX_KEY = PROPERTIES_PREFIX + "reports.regex";
    /**
     * Name for the report path property
     **/
    public static final String REPORT_REGEX_NAME = "Result files";
    /**
     * Description for the report path property
     **/
    public static final String REPORT_REGEX_DESC = "Regular expression for Shellcheck checkstyle formatted results in the project directory.";
    /**
     * Default value for the report path property
     **/
    public static final String REPORT_REGEX_DEFAULT = ".*-shellcheck.res";
    /**
     * ShellCheck launching mode key
     */
    public static final String AUTOLAUNCH_PROP_KEY = PROPERTIES_PREFIX + "launch";
    /**
     * ShellCheck launching mode default value
     */
    public static final String AUTOLAUNCH_PROP_DEFAULT = "false";
    /**
     * Launching mode name
     */
    public static final String AUTOLAUNCH_PROP_NAME = "Shellcheck auto-launch";
    /**
     * Launching mode description
     */
    public static final String AUTOLAUNCH_PROP_DESC = "Auto-launch shellcheck on analysis using shellcheck alias (prior installation required).";

    private ShellcheckPluginProperties() {
        super();
    }

    /**
     * Plugin properties extensions.
     *
     * @return The list of built properties.
     */
    public static List<PropertyDefinition> getProperties() {
        return Arrays.asList(
            PropertyDefinition.builder(AUTOLAUNCH_PROP_KEY)
                .defaultValue(AUTOLAUNCH_PROP_DEFAULT)
                .category(SHELLCHECK_NAME)
                .name(AUTOLAUNCH_PROP_NAME)
                .description(AUTOLAUNCH_PROP_DESC)
                .type(PropertyType.BOOLEAN)
                .index(0)
                .build()
            ,
            PropertyDefinition.builder(REPORT_REGEX_KEY)
                .defaultValue(REPORT_REGEX_DEFAULT)
                .category(SHELLCHECK_NAME)
                .name(REPORT_REGEX_NAME).description(REPORT_REGEX_DESC)
                .index(1)
                .build());
    }

}
