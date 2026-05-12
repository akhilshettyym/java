package akhilshettyym.JAVA.core.C_Classes;

// =============================
// Java Encapsulation Example
// =============================

// Class with private attribute and public getter/setter methods
class Person {
  // 1. Private attribute - cannot be accessed directly from outside
  private String name;

  // 2. Public Getter method - allows read access
  public String getName() {
    return name;
  }

  // 3. Public Setter method - allows write access
  public void setName(String newName) {
    this.name = newName; // 'this' refers to the current object's attribute
  }
}

// Main class to demonstrate Encapsulation
public class G_Encapsulation {
  public static void main(String[] args) {
    Person myObj = new Person();

    // These lines will give errors if uncommented
    // myObj.name = "John"; // Error: name has private access
    // System.out.println(myObj.name); // Error: name has private access

    // Correct way: use setter to assign value
    myObj.setName("John");

    // Correct way: use getter to retrieve value
    System.out.println("Name: " + myObj.getName()); // Outputs: Name: John
  }
}
