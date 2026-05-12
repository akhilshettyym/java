package akhilshettyym.JAVA.core.C_Classes;

// Abstract class
abstract class Animal {
  // Abstract method (no body)
  public abstract void animalSound();

  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherits from Animal)
class Pig extends Animal {
  @Override
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

public class L_Abstraction {
  public static void main(String[] args) {
    Pig myPig = new Pig();   // Create a Pig object
    myPig.animalSound();     // Calls the abstract method (implemented in Pig)
    myPig.sleep();           // Calls the regular method from Animal
  }
}