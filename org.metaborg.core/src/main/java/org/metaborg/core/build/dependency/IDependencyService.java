package org.metaborg.core.build.dependency;

import org.metaborg.core.MetaborgException;
import org.metaborg.core.language.ILanguageComponent;
import org.metaborg.core.project.IProject;

/**
 * Interface for a service that returns compile-time and runtime language component dependencies for projects.
 */
public interface IDependencyService {
    /**
     * Gets compile-time language component dependencies for given project.
     * 
     * @param project
     *            Project to get compile-time dependencies for.
     * @return Compile-time language component dependencies.
     * @throws MetaborgException
     *             When getting dependencies fails unexpectedly.
     */
    public abstract Iterable<ILanguageComponent> compileDependencies(IProject project) throws MetaborgException;

    /**
     * Gets runtime language component dependencies for given project.
     * 
     * @param project
     *            Project to get runtime dependencies for.
     * @return Runtime language component dependencies.
     * @throws MetaborgException
     *             When getting dependencies fails unexpectedly.
     */
    public abstract Iterable<ILanguageComponent> runtimeDependencies(IProject project) throws MetaborgException;
}
