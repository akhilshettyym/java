package akhilshettyym.JAVA.core.E_FileHandling;

import java.io.File; // Import the File class
import java.io.FileWriter; // Import the FileWriter class for writing to files
import java.io.IOException; // Import IOException to handle errors

public class B_CreateWrite {
    public static void main(String[] args) {
        // Step 1: Create a new file
        try {
            // Specify the file path; for Windows use double backslashes
            File myFile = new File("example.txt");

            // Create the file if it doesn't exist
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred during file creation.");
            e.printStackTrace();
        }

        // Step 2: Write to the file
        try {
            // FileWriter object to write to "example.txt"
            FileWriter writer = new FileWriter("example.txt");

            // Write some text to the file
            writer.write("Java makes file handling straightforward and fun!");

            // Close the writer to free resources and save the file
            writer.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}