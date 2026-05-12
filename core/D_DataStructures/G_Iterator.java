package akhilshettyym.JAVA.core.D_DataStructures;

import java.util.HashSet;
import java.util.Iterator;

public class G_Iterator {
  public static void main(String[] args) {
    // Create a HashSet of Strings
    HashSet<String> cars = new HashSet<String>();

    // Add items to the HashSet
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW"); // Duplicate entry - will not be added but removed
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
    System.out.println("Iterating through HashSet using for-each:");
    for (String car : cars) {
      System.out.println(car);
    }

    // Loop through the HashSet using Iterator
    System.out.println("Iterating through HashSet using Iterator:");

    Iterator<String> it = cars.iterator();
    while (it.hasNext()) {
      String car = it.next();
      System.out.println(car);
    }

    // Use Iterator to remove items that contain the letter "a"
    System.out.println("Removing car names that contain the letter 'a':");
    it = cars.iterator(); // Reset iterator
    while (it.hasNext()) {
      String car = it.next();
      if (car.toLowerCase().contains("a")) {
        it.remove(); // Safe way to remove while iterating
      }
    }
    System.out.println("After removal: " + cars);

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