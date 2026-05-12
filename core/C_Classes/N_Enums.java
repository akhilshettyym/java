package akhilshettyym.JAVA.core.C_Classes;

public class N_Enums {

  // Define enum inside the class
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) {

    // Accessing enum constant
    Level myVar = Level.MEDIUM;
    System.out.println("Current level: " + myVar);

    // Using enum in switch statement
    switch (myVar) {
      case LOW:
        System.out.println("Low level");
        break;
      case MEDIUM:
        System.out.println("Medium level");
        break;
      case HIGH:
        System.out.println("High level");
        break;
    }

    // Looping through enum values
    System.out.println("All levels:");
    for (Level level : Level.values()) {
      System.out.println(level);
    }
  }
}
