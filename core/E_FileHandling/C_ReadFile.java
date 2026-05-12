package akhilshettyym.JAVA.core.E_FileHandling;

import java.io.File;                // Import File class for file operations
import java.io.FileNotFoundException; // Import for handling file not found errors
import java.util.Scanner;           // Import Scanner class for reading file content

public class C_ReadFile {
    public static void main(String[] args) {
        // Define the filename to read
        String filename = "example.txt";

        // Reading the file contents
        try {
            // Create a File object with the filename
            File file = new File(filename);
            // Create a Scanner object to read the file
            Scanner scanner = new Scanner(file);

            // Read each line until no more lines are available
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }

            // Close the scanner after reading
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            e.printStackTrace();
        }

        // Get information about the file
        File infoFile = new File(filename);
        if (infoFile.exists()) {
            System.out.println("\nFile Information:");
            System.out.println("File name: " + infoFile.getName());
            System.out.println("Absolute path: " + infoFile.getAbsolutePath());
            System.out.println("Writable: " + infoFile.canWrite());
            System.out.println("Readable: " + infoFile.canRead());
            System.out.println("File size in bytes: " + infoFile.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}