package org.metaborg.spoofax.core.context.scopegraph;

import org.metaborg.core.context.IContextInternal;
import org.metaborg.nabl2.context.IScopeGraphContext;
import org.metaborg.nabl2.context.IScopeGraphUnit;

public interface ISpoofaxScopeGraphContext<U extends IScopeGraphUnit> extends IContextInternal, IScopeGraphContext<U> {

    /** Remove unit from the context */
    void removeUnit(String resource);

}