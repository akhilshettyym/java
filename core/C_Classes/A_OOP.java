package akhilshettyym.JAVA.core.C_Classes;

// Java OOP Example: Understanding Classes and Objects

/*
 * OOP stands for Object-Oriented Programming.
 * In OOP, we organize code by creating "classes" that act as templates for "objects".
 * Objects combine both data (fields/attributes) and behaviors (methods/functions).
 *
 * Advantages of OOP:
 * - Code reuse through inheritance and class templates
 * - Clear structure and modularity
 * - Easier maintenance and debugging
 * - Encourages "Don't Repeat Yourself" (DRY) principle
 */

// Defining a class called Car
class Car {
  // Fields (Attributes) of the class
  String brand;
  String model;
  int year;

  // Constructor: Used to initialize objects when created
  Car(String brand, String model, int year) {
    this.brand = brand;
    this.model = model;
    this.year = year;
  }

  // Method (Behavior): Displays details about the car
  void displayInfo() {
    System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
  }
}

// Main class to run the application
public class A_OOP {

  public static void main(String[] args) {

    // Creating objects (instances) of the Car class
    Car car1 = new Car("Volvo", "XC90", 2020);
    Car car2 = new Car("Audi", "Q7", 2022);
    Car car3 = new Car("Toyota", "Camry", 2021);

    // Calling method on each object to display information
    System.out.println("=== Car Objects ===");
    car1.displayInfo(); // Outputs: Brand: Volvo, Model: XC90, Year: 2020
    car2.displayInfo(); // Outputs: Brand: Audi, Model: Q7, Year: 2022
    car3.displayInfo(); // Outputs: Brand: Toyota, Model: Camry, Year: 2021

    /*
     * Summary:
     * - The Car class defines a template for cars.
     * - car1, car2, and car3 are objects created from the Car class.
     * - Each object holds its own data but shares the same behavior (methods).
     *
     * This is the essence of Object-Oriented Programming.
     */
  }
}