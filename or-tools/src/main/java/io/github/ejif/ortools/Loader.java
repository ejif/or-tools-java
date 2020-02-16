
package io.github.ejif.ortools;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Utility class for loading libraries.
 */
public final class Loader {

    private static final File CACHE = getCache();

    private static File getCache() {
        File[] dirs = {
                new File(System.getProperty("io.github.ejif.cache", "")),
                new File(System.getProperty("user.home"), ".ejif"),
        };
        for (File dir : dirs) {
            if (ensureDirExists(dir)) {
                return dir;
            }
        }
        throw new IllegalStateException("Failed to create cache dir");
    }

    /**
     * Loads all libraries in the same JAR as this class.
     *
     * @param clazz a class loaded from a JAR file.
     */
    public static void load(Class<?> clazz) {
        URL jar = clazz.getProtectionDomain().getCodeSource().getLocation();
        File dir = new File(CACHE, new File(jar.getFile()).getName());
        if (!dir.exists()) {
            if (!dir.mkdirs()) {
                throw new IllegalStateException("Failed to create cache dir: " + dir);
            }
            try (ZipInputStream zip = new ZipInputStream(jar.openStream())) {
                for (ZipEntry e = zip.getNextEntry(); e != null; e = zip.getNextEntry()) {
                    if (e.isDirectory() || e.getName().endsWith("MANIFEST.MF") || e.getName().endsWith(".class")) {
                        continue;
                    }
                    Path dest = Paths.get(dir.toString(), new File(e.getName()).toString());
                    if (!ensureDirExists(dest.toFile().getParentFile())) {
                        throw new IllegalStateException("Failed to copy resource: " + dest);
                    }
                    Files.copy(zip, dest);
                }
            } catch (IOException e) {
                throw new IllegalStateException("Error copying libraries", e);
            }
        }
        try {
            Files.walk(dir.toPath()).filter(Files::isRegularFile).forEach(path -> System.load(path.toString()));
        } catch (IOException e) {
            throw new IllegalStateException("Error loading libraries", e);
        }
    }

    private static boolean ensureDirExists(File dir) {
        return dir.exists() && dir.isDirectory() || dir.mkdirs();
    }

    private Loader() {}
}
