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
package org.ow2.proactive.catalog.graphql.schema.type.filter;

/**
 * @author ActiveEon Team
 * @since 09/06/2017
 */
public class BaseWhereArgs<T> {

    private final T eq;

    private final T ne;

    private final T gt;

    private final T gte;

    private final T lt;

    private final T lte;

    private final T[] in;

    private final T[] notIn;

    private final Boolean isNull;

    public BaseWhereArgs(T eq, T ne, T gt, T gte, T lt, T lte, T[] in, T[] notIn, Boolean isNull) {
        this.eq = eq;
        this.ne = ne;
        this.gt = gt;
        this.gte = gte;
        this.lt = lt;
        this.lte = lte;
        this.in = in;
        this.notIn = notIn;
        this.isNull = isNull;
    }

    public T getEq() {
        return eq;
    }

    public T getNe() {
        return ne;
    }

    public T getGt() {
        return gt;
    }

    public T getGte() {
        return gte;
    }

    public T getLt() {
        return lt;
    }

    public T getLte() {
        return lte;
    }

    public T[] getIn() {
        return in;
    }

    public T[] getNotIn() {
        return notIn;
    }

    public Boolean getNull() {
        return isNull;
    }
}
