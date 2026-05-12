package akhilshettyym.JAVA.MyCode.A_JavaTut.JavaDataStructure;

import java.util.TreeSet;

public class H_TreeSet {
    public static void main(String[] args) {
        // Creating a TreeSet of Strings
        TreeSet<String> treeSet = new TreeSet<String>();

        // Adding elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Date");
        treeSet.add("Elderberry");

        // TreeSet automatically sorts elements in ascending order
        System.out.println("\nTreeSet: " + treeSet);

        // Checking if a specific element exists
        System.out.println("\nContains 'Banana': " + treeSet.contains("Banana"));

        // Getting the first (smallest) element
        System.out.println("\nFirst Element: " + treeSet.first());

        // Getting the last (largest) element
        System.out.println("Last Element: " + treeSet.last());

        // Removing an element
        treeSet.remove("Cherry");
        System.out.println("\nAfter removing 'Cherry': " + treeSet);

        // Getting higher and lower elements
        System.out.println("Element higher than 'Banana': " + treeSet.higher("Banana"));
        System.out.println("Element lower than 'Banana': " + treeSet.lower("Banana"));

        // Polling first and last elements (retrieves and removes)
        System.out.println("\nPolling first element: " + treeSet.pollFirst());
        System.out.println("Polling last element: " + treeSet.pollLast());
        System.out.println("TreeSet after polling: " + treeSet);

        // Printing elements in descending order
        System.out.println("\nTreeSet in Descending Order: " + treeSet.descendingSet());

        // Checking size of the TreeSet
        System.out.println("Size of TreeSet: " + treeSet.size());

        // Checking if the TreeSet is empty
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());

        // Clearing all elements
        treeSet.clear();
        System.out.println("\nTreeSet after clear(): " + treeSet);
    }
}
// Duplications are not allowed. no extra logic for sorting.