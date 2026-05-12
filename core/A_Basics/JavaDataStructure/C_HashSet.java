package akhilshettyym.JAVA.MyCode.A_JavaTut.JavaDataStructure;

// A HashSet is a collection of items where every item is unique, and it is found in the java.util package:
// If added twice it only appears once in the set because every item in a set has to be unique.
import java.util.HashSet;

public class C_HashSet {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Bently");
        cars.add("Rolls");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println("-------------------------------------------------------------------------");

        // To check whether an item exists in a HashSet, use the contains() method:
        System.out.println("To check whether an item exists in a HashSet, use the contains() method:");
        System.out.println(cars.contains("BMW"));
        System.out.println("-------------------------------------------------------------------------");

        // To remove an item, use the remove() met
        System.out.println("To remove an item, use the remove() met");
        cars.remove("BMW");
        System.out.println(cars);
        System.out.println("-------------------------------------------------------------------------");

        // To remove all items, use the clear() method: cars.clear();

        // To find out how many items there are, use the size method: cars.size();

        System.out.println("Loop through the items of an HashSet with a for-each loop:");
        for (String i : cars) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------------------------------------------");

        // HashSet that stores Integer objects:
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println("-  (" + i + ") was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}