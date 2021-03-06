/*******************************************************************************
 * Copyright (c) 2017, 2021 Eurotech and/or its affiliates and others
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.scheduler.trigger.quartz;

import org.eclipse.kapua.commons.model.query.AbstractKapuaQuery;
import org.eclipse.kapua.model.id.KapuaId;
import org.eclipse.kapua.service.scheduler.trigger.TriggerQuery;

/**
 * {@link TriggerQuery} implementation.
 *
 * @since 1.0.0
 */
public class TriggerQueryImpl extends AbstractKapuaQuery implements TriggerQuery {

    /**
     * Constructor.
     *
     * @since 1.0.0
     */
    private TriggerQueryImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param scopeId The scope {@link KapuaId}.
     * @since 1.0.0
     */
    public TriggerQueryImpl(KapuaId scopeId) {
        this();
        setScopeId(scopeId);
    }

}
