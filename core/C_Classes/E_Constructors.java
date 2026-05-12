package akhilshettyym.JAVA.core.C_Classes;

// Java Constructors Demonstration

public class E_Constructors {

  // === Attribute Declaration ===
  int x;
  int modelYear;
  String modelName;

  // === Default Constructor ===
  // A constructor with no parameters
  public E_Constructors() {
    x = 5; // Initializes x to 5
  }

  // === Parameterized Constructor (Single Parameter) ===
  public E_Constructors(int y) {
    x = y; // Initializes x using a passed value
  }

  // === Parameterized Constructor (Multiple Parameters) ===
  public E_Constructors(int year, String name) {
    modelYear = year;       // Set modelYear to passed year
    modelName = name;       // Set modelName to passed name
  }

  public static void main(String[] args) {

    System.out.println("=== Default Constructor Example ===");

    // Calls the default constructor
    E_Constructors obj1 = new E_Constructors();
    System.out.println("Value of x (default constructor): " + obj1.x); // Output: 5

    System.out.println("\n=== Constructor with Parameter ===");

    // Calls the constructor with one parameter
    E_Constructors obj2 = new E_Constructors(10);
    System.out.println("Value of x (parameterized): " + obj2.x); // Output: 10

    System.out.println("\n=== Constructor with Multiple Parameters ===");

    // Calls the constructor with multiple parameters
    E_Constructors myCar = new E_Constructors(1969, "Mustang");
    System.out.println("Car: " + myCar.modelYear + " " + myCar.modelName); // Output: 1969 Mustang
  }
}