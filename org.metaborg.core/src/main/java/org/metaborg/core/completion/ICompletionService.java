package org.metaborg.core.completion;

import org.metaborg.core.MetaborgException;
import org.metaborg.core.syntax.ParseResult;

public interface ICompletionService {
    Iterable<ICompletion> get(ParseResult<?> parseResult, int offset) throws MetaborgException;
}