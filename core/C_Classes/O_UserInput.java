package akhilshettyym.JAVA.core.C_Classes;

import java.util.Scanner;

public class O_UserInput {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); // Create a Scanner object

    System.out.println("Enter name, age and salary:");

    // Read String input
    System.out.print("Name: ");
    String name = myObj.nextLine();

    // Read integer input
    System.out.print("Age: ");
    int age = myObj.nextInt();

    // Read double input
    System.out.print("Salary: ");
    double salary = myObj.nextDouble();

    // Output the input values
    System.out.println("\nUser Input Summary:");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);

    myObj.close(); // Close the scanner
  }
}