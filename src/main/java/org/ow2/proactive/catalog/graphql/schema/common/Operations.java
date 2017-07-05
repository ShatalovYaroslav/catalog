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
package org.ow2.proactive.catalog.graphql.schema.common;

import java.util.Arrays;
import java.util.Optional;

import com.google.common.base.CaseFormat;


/**
 * @author ActiveEon Team
 * @since 12/06/2017
 */
public enum Operations {
    EQ,
    NE,
    GT,
    GTE,
    LT,
    LTE,
    IN,
    NOT_IN,
    IS_NULL,
    BETWEEN,
    NOT_BETWEEN,
    LIKE,
    NOT_LIKE;

    public String getName() {
        return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, name());
    }

    public static Operations fromValue(String value) throws IllegalArgumentException {
        Optional<Operations> operationsOptional = Arrays.stream(Operations.values())
                                                        .filter(opertaion -> CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL,
                                                                                                            opertaion.name())
                                                                                                        .equals(value))
                                                        .findAny();
        if (!operationsOptional.isPresent()) {
            throw new IllegalArgumentException(value + " does not exist");
        }
        return operationsOptional.get();
    }
}
