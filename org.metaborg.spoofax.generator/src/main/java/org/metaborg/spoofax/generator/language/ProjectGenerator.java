package org.metaborg.spoofax.generator.language;

import java.io.IOException;

import org.metaborg.spoofax.generator.BaseGenerator;
import org.metaborg.spoofax.generator.project.GeneratorProjectSettings;

public class ProjectGenerator extends BaseGenerator {
    public ProjectGenerator(GeneratorProjectSettings settings) {
        super(settings);
    }


    public void generateAll() throws IOException {
        generateCommonLibrary();
        generateEditorServices();
    }

    public void generateCommonLibrary() throws IOException {
        writer.write("lib/editor-common.generated.str", true);
    }

    public void generateEditorServices() throws IOException {
        writer.write("src-gen/editor/Colorer.generated.esv", true);
    }
}