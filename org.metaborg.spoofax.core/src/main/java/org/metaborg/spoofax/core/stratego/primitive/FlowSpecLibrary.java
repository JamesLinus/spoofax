package org.metaborg.spoofax.core.stratego.primitive;

import java.util.Set;

import org.metaborg.spoofax.core.stratego.primitive.generic.GenericPrimitiveLibrary;
import org.spoofax.interpreter.library.AbstractPrimitive;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class FlowSpecLibrary extends GenericPrimitiveLibrary {
    public static final String INJECTION_NAME = "FlowSpecLibrary";
    public static final String REGISTRY_NAME = "FLOWSPEC";

    @Inject
    public FlowSpecLibrary(@Named(INJECTION_NAME) Set<AbstractPrimitive> primitives) {
        super(primitives, FlowSpecLibrary.REGISTRY_NAME);
    }

}
