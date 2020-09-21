/*******************************************************************************
 * Copyright (c) 2016, 2020 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.storable.model.query.predicate;

import java.util.List;

/**
 * {@link StorablePredicate} "AND" aggregation definition.
 *
 * @since 1.0.0
 */
public interface AndPredicate extends StorablePredicate {

    /**
     * Gets the {@link StorablePredicate} {@link List}
     *
     * @return The {@link StorablePredicate} {@link List}
     * @since 1.0.0
     */
    List<StorablePredicate> getPredicates();
}
