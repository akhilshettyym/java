package akhilshettyym.JAVA.core.F_Advanced;
/* 
 * To sort objects, we need to define a rule that determines the sorting order.
 * The Comparator and Comparable interfaces allow us to define custom sorting logic.
 *
 * COMPARATOR:
 * - The Comparator interface enables us to create a class with a compare() method.
 * - The compare() method should return:
 *   - Negative if the first object should come before the second.
 *   - Positive if the second object should come before the first.
 *   - Zero if both objects are equal in sorting order.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Define a Car class
class Car {
    public String brand;
    public String model;
    public int year;
    
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}

// Create a comparator using generics
class SortByYear implements Comparator<Car> { 
    public int compare(Car a, Car b) {
        return Integer.compare(a.year, b.year); // More concise way to compare integers
    }
}

public class C_Comparator {
    public static void main(String[] args) { 
        // Create a list of cars
        ArrayList<Car> myCars = new ArrayList<>();  // <> (diamond operator) for cleaner syntax
        myCars.add(new Car("BMW", "X5", 1999));
        myCars.add(new Car("Honda", "Accord", 2006));
        myCars.add(new Car("Ford", "Mustang", 1970));

        // Sort the cars using a comparator
        Collections.sort(myCars, new SortByYear());

        // Display the sorted cars
        for (Car c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }
    }
}