package akhilshettyym.JAVA.core.C_Classes;

// Superclass (Parent)
class Vehicle {
  // Protected attribute: accessible in subclass
  protected String brand = "Ford";

  // Public method: can be used by subclass
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

// Subclass (Child) inherits from Vehicle
class Car extends Vehicle {
  // Private attribute: only accessible within Car
  private String modelName = "Mustang";

  public static void main(String[] args) {
    // Create a Car object
    Car myCar = new Car();

    // Access method from superclass
    myCar.honk();

    // Access attribute from superclass and subclass
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}

/*
 * ======================
 * Demonstrating `final`
 * ======================
 * 
 * // Uncommenting this will throw a compile error
 * final class FinalVehicle {
 * public void drive() {
 * System.out.println("Driving safely...");
 * }
 * }
 * 
 * // This would fail:
 * // class Bus extends FinalVehicle {} // Error: cannot inherit from final
 * class
 */