package org.metaborg.spoofax.meta.core.project;

import org.metaborg.meta.core.project.ILanguageSpec;
import org.metaborg.spoofax.meta.core.config.ISpoofaxLanguageSpecConfig;
import org.metaborg.spoofax.meta.core.project.ISpoofaxLanguageSpecPaths;

/**
 * Spoofax specialized version of a language specification project.
 */
public interface ISpoofaxLanguageSpec extends ILanguageSpec {
    /**
     * {@inheritDoc}
     */
    ISpoofaxLanguageSpecConfig config();

    /**
     * {@inheritDoc}
     */
    ISpoofaxLanguageSpecPaths paths();
}