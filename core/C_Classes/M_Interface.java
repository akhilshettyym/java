package akhilshettyym.JAVA.core.C_Classes;

// Single Interface Example
interface Animal {
  public void animalSound(); // interface method (no body)

  public void sleep(); // interface method (no body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }

  public void sleep() {
    System.out.println("Zzz");
  }
}

// Multiple Interface Example
interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Some text..");
  }

  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}

public class M_Interface {
  public static void main(String[] args) {
    // Single interface example
    Pig myPig = new Pig();
    myPig.animalSound();
    myPig.sleep();

    // Multiple interfaces example
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}