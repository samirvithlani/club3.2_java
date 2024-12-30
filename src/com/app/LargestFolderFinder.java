package com.app;

import java.io.File;

public class LargestFolderFinder {
    public static void main(String[] args) {
        String basePath = "C:\\Users\\Samir\\AppData\\Local"; // Change to your directory
        File baseDirectory = new File(basePath);

        if (!baseDirectory.exists() || !baseDirectory.isDirectory()) {
            System.out.println("Invalid directory: " + basePath);
            return;
        }

        System.out.println("Analyzing folders in: " + basePath);
        long startTime = System.currentTimeMillis();

        // Start folder size calculation
        File largestFolder = null;
        long largestSize = 0;

        for (File folder : baseDirectory.listFiles()) {
            if (folder.isDirectory()) {
                System.out.println("Checking folder: " + folder.getAbsolutePath());
                long folderSize = getFolderSize(folder);

                System.out.printf("Size of '%s': %.2f GB%n", folder.getName(), folderSize / (1024.0 * 1024 * 1024));
                
                if (folderSize > largestSize) {
                    largestSize = folderSize;
                    largestFolder = folder;
                }
            }
        }

        // Report the largest folder
        if (largestFolder != null) {
            System.out.printf("\nThe largest folder is '%s' with size: %.2f GB%n",
                    largestFolder.getAbsolutePath(), largestSize / (1024.0 * 1024 * 1024));
        } else {
            System.out.println("No folders found in the specified directory.");
        }

        System.out.printf("Time taken: %.2f seconds%n", (System.currentTimeMillis() - startTime) / 1000.0);
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
}
