package akhilshettyym.JAVA.core.C_Classes;

// Java Class Attributes Demonstration

public class C_Attributes {

  // === Declaring Class Attributes ===
  // These are also called "fields"
  int x = 5;
  int y = 3;

  // Final attribute - cannot be changed after initialization
  final int z = 10;

  // Multiple attributes
  String fname = "John";
  String lname = "Doe";
  int age = 24;

  public static void main(String[] args) {

    System.out.println("=== Accessing Class Attributes ===");

    // Create an object to access attributes
    C_Attributes myObj = new C_Attributes();
    System.out.println("x = " + myObj.x); // Output: 5
    System.out.println("y = " + myObj.y); // Output: 3

    System.out.println("\n=== Modifying Attribute Values ===");

    // Change attribute x
    myObj.x = 40;
    System.out.println("Modified x = " + myObj.x); // Output: 40

    System.out.println("\n=== Overriding Default Value ===");

    // Create a new object and override default x value
    C_Attributes anotherObj = new C_Attributes();
    anotherObj.x = 25;
    System.out.println("anotherObj.x = " + anotherObj.x); // Output: 25

    System.out.println("\n=== Using Final Attribute ===");

    // Attempting to modify final variable z would cause a compile error
    // myObj.z = 15; // Uncommenting this line will cause an error

    System.out.println("Final attribute z = " + myObj.z); // Output: 10

    System.out.println("\n=== Attribute Values in Multiple Objects ===");

    C_Attributes myObj1 = new C_Attributes();
    C_Attributes myObj2 = new C_Attributes();

    myObj2.x = 99; // Change only in myObj2

    System.out.println("myObj1.x = " + myObj1.x); // Output: 5
    System.out.println("myObj2.x = " + myObj2.x); // Output: 99

    System.out.println("\n=== Multiple Attributes ===");

    System.out.println("Name: " + myObj.fname + " " + myObj.lname); // Output: John Doe
    System.out.println("Age: " + myObj.age); // Output: 24
  }
}