package akhilshettyym.JAVA.core.D_DataStructures;

import java.util.HashSet;

public class F_HashSet {
  public static void main(String[] args) {
    // Create a HashSet of Strings
    HashSet<String> cars = new HashSet<String>();

    // Add items to the HashSet
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW"); // Duplicate entry - will not be added
    cars.add("Mazda");

    // Display all items in the HashSet (unordered and unique)
    System.out.println("Car Brands in HashSet:");
    System.out.println(cars);

    // Check if a specific item exists in the set
    System.out.println("Contains Mazda? " + cars.contains("Mazda"));

    // Remove an item from the HashSet
    cars.remove("Volvo");
    System.out.println("After removing Volvo: " + cars);

    // Get the size of the HashSet
    System.out.println("Size of HashSet: " + cars.size());

    // Loop through the HashSet using for-each
    System.out.println("Iterating through HashSet:");
    for (String car : cars) {
      System.out.println(car);
    }

    // Clear all items from the HashSet
    cars.clear();
    System.out.println("After clear(): " + cars);

    // Working with Integer HashSet
    HashSet<Integer> numbers = new HashSet<Integer>();

    numbers.add(4);
    numbers.add(7);
    numbers.add(8);

    // Check which numbers from 1 to 10 exist in the set
    System.out.println("\nCheck presence of numbers 1 to 10:");
    for (int i = 1; i <= 10; i++) {
      if (numbers.contains(i)) {
        System.out.println(i + " was found in the set.");
      } else {
        System.out.println(i + " was not found in the set.");
      }
    }
  }
}