package akhilshettyym.JAVA.core.E_FileHandling;

import java.io.File;
import java.io.IOException;

public class A_Files {
    public static void main(String[] args) {
        // Specify a filename
        String filename = "example.txt";
        // Create a File object
        File file = new File(filename);

        // Check if the file already exists
        if (file.exists()) {
            System.out.println("File already exists: " + file.getName());

            // Display file properties
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File Size in bytes: " + file.length());

            // Delete the file if needed
            if (file.delete()) {
                System.out.println("Deleted the file: " + file.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            try {
                // Create a new file
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

        // Example: Creating a directory
        String dirName = "myDirectory";
        File dir = new File(dirName);
        if (dir.exists()) {
            System.out.println("Directory already exists: " + dir.getName());
        } else {
            if (dir.mkdir()) {
                System.out.println("Directory created: " + dir.getName());
            } else {
                System.out.println("Failed to create directory..");
            }
        }

        // List files in current directory
        String[] filesList = new File(".").list();
        System.out.println("Files and directories in current directory:");
        for (String filenameInList : filesList) {
            System.out.println(filenameInList);
        }
    }
}