/*
 * ProActive Parallel Suite(TM):
 * The Open Source library for parallel and distributed
 * Workflows & Scheduling, Orchestration, Cloud Automation
 * and Big Data Analysis on Enterprise Grids & Clouds.
 *
 * Copyright (c) 2007 - 2017 ActiveEon
 * Contact: contact@activeeon.com
 *
 * This library is free software: you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation: version 3 of
 * the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 * If needed, contact us to obtain a release under GPL Version 2 or 3
 * or a different license than the AGPL.
 */
package org.ow2.proactive.catalog.util;

import org.ow2.proactive.catalog.util.parser.SupportedParserKinds;


/**
 * @author ActiveEon Team
 * @since 8/9/2018
 */
public class WorkflowExtensionAdderUtil {

    public final static String WORKFLOW_EXTENSION = ".xml";

    /**
     *
     * @param objectName
     * @param kind
     * @return add the .xml extension to objectName for workflow kind if the extension was not yet in name
     */
    public static String addXmlExtensionForWorkflowKind(String objectName, String kind) {
        if (kind != null && kind.toLowerCase().startsWith(SupportedParserKinds.WORKFLOW.toString().toLowerCase()) &&
            !objectName.endsWith(WORKFLOW_EXTENSION)) {
            objectName += WORKFLOW_EXTENSION;
        }
        return objectName;
    }
}
