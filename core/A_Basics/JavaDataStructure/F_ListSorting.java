package akhilshettyym.JAVA.MyCode.A_JavaTut.JavaDataStructure;

import java.util.ArrayList;
import java.util.Collections;

public class F_ListSorting {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------------------------");

        // Sorting an ArrayList of Strings alphabetically in ascending order
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Collections.sort(cars); // Sort cars in ascending order

        System.out.println("Sorted Cars (Ascending Order):");
        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println("---------------------------------------------------------------");

        // Sort an ArrayList of Integers numerically in ascending order
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers); // Sort numbers in ascending order

        System.out.println("Sorted Numbers (Ascending Order):");
        for (int num : myNumbers) {
            System.out.println(num);
        }

        System.out.println("---------------------------------------------------------------");

        /*
         * You can also sort a list in reverse order using the reverseOrder() method.
         * Below, we sort an ArrayList of Strings alphabetically in reverse/descending
         * order.
         */
        ArrayList<String> carz = new ArrayList<>();
        carz.add("Volvo");
        carz.add("BMW");
        carz.add("Ford");
        carz.add("Mazda");

        Collections.sort(carz, Collections.reverseOrder()); // Sort cars in descending order

        System.out.println("Sorted Cars (Descending Order):");
        for (String car : carz) {
            System.out.println(car);
        }

        System.out.println("---------------------------------------------------------------");

        // Sort an ArrayList of Integers numerically in reverse/descending order
        ArrayList<Integer> myNumberz = new ArrayList<>();
        myNumberz.add(33);
        myNumberz.add(15);
        myNumberz.add(20);
        myNumberz.add(34);
        myNumberz.add(8);
        myNumberz.add(12);

        Collections.sort(myNumberz, Collections.reverseOrder()); // Sort numbers in descending order

        System.out.println("Sorted Numbers (Descending Order):");
        for (int num : myNumberz) {
            System.out.println(num);
        }

        System.out.println("---------------------------------------------------------------");
    }
}