package org.metaborg.spoofax.generator.project;

import java.util.regex.Pattern;

public class NameUtil {
 
    private static final Pattern PART = Pattern.compile("[A-Za-z][A-Za-z0-9]*");
    private static final Pattern NAME = Pattern.compile(PART+"(-"+PART+")*");
    private static final Pattern ID = Pattern.compile(NAME+"(\\."+NAME+")*");

    public static boolean isValidName(String name) {
        return name != null && !name.isEmpty() && NAME.matcher(name).matches();
    }

    public static boolean isValidId(String id) {
        return id != null && !id.isEmpty() && ID.matcher(id).matches();
    }

    public static boolean isValidFileExtension(String ext) {
        return PART.matcher(ext).matches();
    }

    public static String toJavaId(String id) {
        return id.replace('-', '_');
    }

    private NameUtil() {
    }

}
