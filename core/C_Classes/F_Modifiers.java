package akhilshettyym.JAVA.core.C_Classes;

// ===============================
// Java Modifiers - Full Example
// ===============================

// Abstract class: Cannot be instantiated directly
abstract class Person {
    public String fname = "John"; // public attribute
    public int age = 24; // public attribute

    // Abstract method (no body): must be implemented in subclass
    public abstract void study();
}

// Subclass of abstract class Person
class Student extends Person {
    public int graduationYear = 2024;

    // Implementing the abstract method
    public void study() {
        System.out.println("Studying all day long...");
    }
}

// Main class demonstrating various modifiers
public class F_Modifiers {

    // =======================
    // Access Modifiers
    // =======================
    public int publicAttribute = 10; // Can be accessed anywhere
    protected int protectedAttribute = 30; // Accessible in the same package + subclasses
    int defaultAttribute = 40; // Accessible in the same package (default access)

    // =======================
    // Non-Access Modifiers
    // =======================
    final int finalValue = 100; // Cannot be changed after assignment
    static int staticCount = 0; // Shared by all instances

    // Static method: No object needed to call it
    static void printStaticMessage() {
        System.out.println("Static method: Can be called without an object");
    }

    // Instance (non-static) method: Requires an object
    public void printPublicMessage() {
        System.out.println("Public method: Called using an object");
    }

    // Demonstrating final attribute
    public void showFinal() {
        System.out.println("Final value: " + finalValue);
        // finalValue = 200; // This line would give a compile-time error
    }

    // Main method: Entry point of program
    public static void main(String[] args) {
        // Call static method
        printStaticMessage();

        // Create object of ModifiersDemo
        // ModifiersDemo demo = new ModifiersDemo();

        // Accessing attributes
        // System.out.println("Public Attribute: " + demo.publicAttribute);
        // // System.out.println("Private Attribute: " + demo.privateAttribute); // Not
        // // accessible
        // System.out.println("Protected Attribute: " + demo.protectedAttribute);
        // System.out.println("Default Attribute: " + demo.defaultAttribute);

        // Calling instance methods
        // demo.printPublicMessage();
        // demo.showFinal();

        // Demonstrating abstract class and subclass
        Student student = new Student();
        System.out.println("Name: " + student.fname);
        System.out.println("Age: " + student.age);
        System.out.println("Graduation Year: " + student.graduationYear);
        student.study(); // Calls overridden method from abstract class
    }
}
