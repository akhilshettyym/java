package akhilshettyym.JAVA.core.C_Classes;

// Java Classes and Objects Example
// This file demonstrates how classes and objects work in Java

// Class definition - acts as a "blueprint" for creating objects
public class B_Classes {

  // Attribute (field/property) of the class
  int x = 5;

  public static void main(String[] args) {

    System.out.println("=== Creating a Single Object ===");

    // Creating an object of the class Main
    B_Classes myObj = new B_Classes();

    // Accessing the object's property
    System.out.println("Value of x from myObj: " + myObj.x); // Output: 5

    System.out.println("\n=== Creating Multiple Objects ===");

    // Creating multiple objects from the same class
    B_Classes myObj1 = new B_Classes();  // Object 1
    B_Classes myObj2 = new B_Classes();  // Object 2

    // Both objects have their own copy of x
    System.out.println("Value of x from myObj1: " + myObj1.x); // Output: 5
    System.out.println("Value of x from myObj2: " + myObj2.x); // Output: 5

    /*
     * At this point, all the code is written in a single class file.
     * Let's simulate having multiple classes for better structure.
     * We do this using an inner static class below.
     */

    System.out.println("\n=== Using Multiple Classes (Simulated) ===");

    // Creating object of a separate class called OtherClass
    OtherClass obj = new OtherClass();
    obj.printFromMainObject(); // Accesses Main class's variable x from another class
  }

  // This static nested class simulates accessing a class from a different file
  static class OtherClass {
    void printFromMainObject() {
      // Creating an object of Main class
      B_Classes anotherObj = new B_Classes();
      // Accessing the field x of Main class
      System.out.println("Value of x accessed from OtherClass: " + anotherObj.x); // Output: 5
    }
  }
}