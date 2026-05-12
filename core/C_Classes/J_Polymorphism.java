package akhilshettyym.JAVA.core.C_Classes;

// Superclass
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

// Subclass 1
class Pig extends Animal {
  @Override
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

// Subclass 2
class Dog extends Animal {
  @Override
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

// Main class to demonstrate polymorphism
public class J_Polymorphism {
  public static void main(String[] args) {
    Animal myAnimal = new Animal(); // Base type reference, base object
    Animal myPig = new Pig();       // Base type reference, Pig object
    Animal myDog = new Dog();       // Base type reference, Dog object

    myAnimal.animalSound();  // Output: The animal makes a sound
    myPig.animalSound();     // Output: The pig says: wee wee
    myDog.animalSound();     // Output: The dog says: bow wow
  }
}