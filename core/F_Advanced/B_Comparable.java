package akhilshettyym.JAVA.core.F_Advanced;
/*
 * The Comparable interface allows an object to define its own sorting rule using the compareTo() method.
 *
 * - The compareTo() method is used to compare objects.
 * - It returns:
 *      - Negative value if 'this' object should come first in sorting.
 *      - Positive value if the other object should come first.
 *      - Zero if both are considered equal in sorting.
 *
 * - Many Java classes like String and Integer already implement Comparable, allowing sorting without a Comparator.
 */

import java.util.ArrayList;
import java.util.Collections;

// Define a Car class that implements Comparable<Car>
class Car implements Comparable<Car> {
    public String brand;
    public String model;
    public int year;

    // Constructor to initialize Car object
    public Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    // Implement the compareTo() method to define sorting by 'year'
    public int compareTo(Car other) {
        return Integer.compare(this.year, other.year); // Compares car years directly
    }
}

public class B_Comparable {
    public static void main(String[] args) {
        // Create a list of Car objects
        ArrayList<Car> myCars = new ArrayList<>();
        myCars.add(new Car("BMW", "X5", 1999));
        myCars.add(new Car("Honda", "Accord", 2006));
        myCars.add(new Car("Ford", "Mustang", 1970));

        // Sort the cars using their compareTo() method (Sorting by year)
        Collections.sort(myCars);

        // Display the sorted list of cars
        for (Car c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }
    }
}

/*
 * Comparator vs. Comparable
 * A comparator is an object with one method that is used to compare two
 * different objects.
 * 
 * A comparable is an object which can compare itself with other objects.
 * 
 * It is easier to use the Comparable interface when possible, but the
 * Comparator interface is
 * more powerful because it allows you to sort any kind of object even if you
 * cannot change its code.
 */