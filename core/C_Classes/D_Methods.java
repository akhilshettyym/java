package akhilshettyym.JAVA.core.C_Classes;

// Main.java
public class D_Methods {

    // Static method: can be called without creating an object
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method: requires creating an object of Main
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Method to simulate full throttle of a car
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // Method to display the max speed, accepting an int parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    // Main method: entry point of the Java application
    public static void main(String[] args) {
        // Call static method directly (no object needed)
        myStaticMethod();

        // To call a public method, create an object of Main
        D_Methods myCar = new D_Methods();

        // Call the public method on the object
        myCar.myPublicMethod();

        // Call the custom methods related to a "car"
        myCar.fullThrottle(); // Outputs: The car is going as fast as it can!
        myCar.speed(200); // Outputs: Max speed is: 200
    }
}

// Second.java
// This class demonstrates creating an object of Main and calling its methods
class Second {
    public static void main(String[] args) {
        // Create an object of Main class
        D_Methods myCar = new D_Methods();

        // Call methods on the object
        myCar.fullThrottle(); // Outputs: The car is going as fast as it can!
        myCar.speed(200); // Outputs: Max speed is: 200
    }
}