package org.metaborg.spoofax.core.terms;

import org.metaborg.core.language.ILanguageComponent;
import org.metaborg.core.language.ILanguageImpl;
import org.spoofax.interpreter.terms.ITermFactory;

/**
 * Interface for retrieving term factories for languages and generic use.
 */
public interface ITermFactoryService {
    /**
     * Return the term factory to be used when constructing new terms for given language implementation.
     * 
     * @param impl
     *            Implementation to get the term factory for.
     * @return Language-specific term factory.
     */
    public ITermFactory get(ILanguageImpl impl);

    /**
     * Return the term factory to be used when constructing new terms for given language component.
     * 
     * @param component
     *            Component to get the term factory for.
     * @return Language-specific term factory.
     */
    public ITermFactory get(ILanguageComponent component);

    /**
     * Returns the generic term factory.
     * 
     * @return Generic term factory.
     */
    public ITermFactory getGeneric();
}
