package org.strategoxt.imp.runtime.stratego;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.imp.runtime.stratego.adapter.IWrappedAstNode;

/**
 * @author Lennart Kats <lennart add lclnet.nl>
 */
public class OriginPositionLayoutIncludedPrimitive extends AbstractOriginPrimitive {

	public OriginPositionLayoutIncludedPrimitive() {
		super("SSL_EXT_origin_pos_layout_included");
	}

	@Override
	protected IStrategoTerm call(IContext env, IWrappedAstNode node) {
		ITermFactory factory = env.getFactory();
		int start = TextPositions.getStartPosNodeWithLayout(node.getNode());
		int end =  TextPositions.getEndPosNodeWithLayout(node.getNode());
		return factory.makeTuple(
				factory.makeInt(start),
				factory.makeInt(end)
		);
	}

}