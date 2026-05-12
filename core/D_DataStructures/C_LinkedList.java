package akhilshettyym.JAVA.core.D_DataStructures;

import java.util.LinkedList;

public class C_LinkedList {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> cars = new LinkedList<String>();

        // Add elements to the list
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Print the LinkedList
        System.out.println("Initial LinkedList: " + cars);

        // Add element at the beginning
        cars.addFirst("Tesla");
        System.out.println("After addFirst(): " + cars);

        // Add element at the end
        cars.addLast("Honda");
        System.out.println("After addLast(): " + cars);

        // Get the first element
        String firstCar = cars.getFirst();
        System.out.println("First car: " + firstCar);

        // Get the last element
        String lastCar = cars.getLast();
        System.out.println("Last car: " + lastCar);

        // Remove the first element
        cars.removeFirst();
        System.out.println("After removeFirst(): " + cars);

        // Remove the last element
        cars.removeLast();
        System.out.println("After removeLast(): " + cars);

        // Access element by index
        System.out.println("Car at index 2: " + cars.get(2));

        // Modify an element
        cars.set(2, "Hyundai");
        System.out.println("After setting index 2 to Hyundai: " + cars);

        // Remove an element
        cars.remove(1);
        System.out.println("After removing index 1: " + cars);

        // Loop through the LinkedList using for-each loop
        System.out.println("Looping through the list:");
        for (String car : cars) {
            System.out.println(car);
        }
    }
}