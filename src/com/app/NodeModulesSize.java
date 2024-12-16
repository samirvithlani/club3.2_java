package com.app;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class NodeModulesSize {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String basePath = "D:/projects"; // Change to your directory
        List<File> nodeModulesDirs = new ArrayList<>();
        long totalSize = 0;

        // Find all node_modules folders
        findNodeModules(new File(basePath), nodeModulesDirs);

        System.out.println("\nCalculating sizes of 'node_modules' folders...");
        for (File folder : nodeModulesDirs) {
            long size = getFolderSize(folder);
            totalSize += size;
            System.out.printf("Found: %s | Size: %.2f GB%n", folder.getAbsolutePath(), size / (1024.0 * 1024 * 1024));
        }

        System.out.printf("\nTotal size of all 'node_modules' folders: %.2f GB%n", totalSize / (1024.0 * 1024 * 1024));
        System.out.println("\nStarting deletion of all 'node_modules' folders...");

        // Delete all node_modules folders
        for (File folder : nodeModulesDirs) {
            if (deleteFolder(folder)) {
                System.out.println("Deleted: " + folder.getAbsolutePath());
            } else {
                System.out.println("Failed to delete: " + folder.getAbsolutePath());
            }
        }

        System.out.printf("\nTotal folders deleted: %d%n", nodeModulesDirs.size());
        System.out.printf("Time taken: %.2f seconds%n", (System.currentTimeMillis() - startTime) / 1000.0);
    }

    // Recursively find all node_modules folders
    private static void findNodeModules(File directory, List<File> result) {
        if (directory == null || !directory.isDirectory()) return;

        File[] files = directory.listFiles();
        if (files == null) return;

        for (File file : files) {
            if (file.isDirectory()) {
                if (file.getName().equals("node_modules")) {
                    result.add(file);
                    System.out.println("Found: " + file.getAbsolutePath());
                    continue; // Skip deeper traversal into this node_modules
                }
                findNodeModules(file, result);
            }
        }
    }

    // Calculate folder size recursively
    private static long getFolderSize(File folder) {
        long size = 0;
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    size += file.length();
                } else if (file.isDirectory()) {
                    size += getFolderSize(file);
                }
            }
        }
        return size;
    }

    // Delete a folder recursively
    private static boolean deleteFolder(File folder) {
        if (folder == null || !folder.exists()) return false;

        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteFolder(file);
                } else {
                    file.delete();
                }
            }
        }
        return folder.delete();
    }
}
