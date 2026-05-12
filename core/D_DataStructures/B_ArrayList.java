package akhilshettyym.JAVA.core.D_DataStructures;

// The ArrayList class is a resizable array, which can be found in the java.util package.
// Unlike arrays, ArrayLists can grow and shrink in size dynamically.

import java.util.ArrayList;
import java.util.Collections;  // For sorting

public class B_ArrayList {
  public static void main(String[] args) {

    // 1. Create an ArrayList object
    ArrayList<String> cars = new ArrayList<String>();

    // 2. Add elements to the ArrayList
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println("Original list: " + cars);

    // 3. Add element at a specific index
    cars.add(0, "Mercedes");
    System.out.println("After adding at index 0: " + cars);

    // 4. Access an item
    System.out.println("First car: " + cars.get(0));

    // 5. Change an item
    cars.set(0, "Opel");
    System.out.println("After changing first car: " + cars);

    // 6. Remove an item
    cars.remove(0);
    System.out.println("After removing first car: " + cars);

    // 7. Size of the ArrayList
    System.out.println("Number of cars: " + cars.size());

    // 8. Loop through ArrayList using for loop
    System.out.println("Loop with for loop:");
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }

    // 9. Loop through ArrayList using for-each loop
    System.out.println("Loop with for-each loop:");
    for (String car : cars) {
      System.out.println(car);
    }

    // 10. ArrayList with other types (Integer)
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
    System.out.println("Integer ArrayList:");
    for (int number : myNumbers) {
      System.out.println(number);
    }

    // 11. Sort ArrayList of Strings
    Collections.sort(cars);
    System.out.println("Sorted cars:");
    for (String car : cars) {
      System.out.println(car);
    }

    // 12. Sort ArrayList of Integers
    myNumbers.add(33);
    myNumbers.add(8);
    myNumbers.add(12);
    Collections.sort(myNumbers);
    System.out.println("Sorted numbers:");
    for (int number : myNumbers) {
      System.out.println(number);
    }

    // 13. Clear the ArrayList
    cars.clear();
    System.out.println("Cleared cars list: " + cars);
  }
}