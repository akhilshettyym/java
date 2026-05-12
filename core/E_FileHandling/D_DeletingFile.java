package akhilshettyym.JAVA.core.E_FileHandling;

import java.io.File;

public class D_DeletingFile {
    public static void main(String[] args) {
        // Example 1: Delete a file
        File fileToDelete = new File("example.txt");

        if (fileToDelete.delete()) {
            System.out.println("Deleted the file: " + fileToDelete.getName());
        } else {
            System.out.println("Failed to delete the file: " + fileToDelete.getName());
        }

        // Example 2: Delete a folder (must be empty)
        // Specify the folder path (update to your folder path)
        File folderToDelete = new File("C:\\Users\\MyName\\Test");

        if (folderToDelete.delete()) {
            System.out.println("Deleted the folder: " + folderToDelete.getName());
        } else {
            System.out.println("Failed to delete the folder: " + folderToDelete.getName());
        }
    }
}