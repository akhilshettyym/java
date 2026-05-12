package akhilshettyym.JAVA.MyCode.A_JavaTut.JavaDataStructure;

import java.util.Collections;
import java.util.TreeMap;

public class G_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();

        // Adding key-value pairs
        map.put(1, "One");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(2, "Two");

        // Displaying the TreeMap (Keys are automatically sorted in ascending order)
        System.out.println("TreeMap: " + map);

        // Accessing an element
        System.out.println("Value of key 3: " + map.get(3));

        // Removing an element
        map.remove(4);
        System.out.println("After removing key 4: " + map);

        // Checking if a key or value exists
        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains value 'Four'? " + map.containsValue("Four"));

        // Iterating through TreeMap using forEach (Java 8+)
        System.out.println("\nIterating over TreeMap:");
        map.forEach((key, value) -> System.out.println(key + " -> " + value));

        // Navigational Methods
        System.out.println("\nFirst Key: " + map.firstKey()); // Smallest Key
        System.out.println("Last Key: " + map.lastKey()); // Largest Key
        System.out.println("Higher Key than 3: " + map.higherKey(3)); // Next higher key
        System.out.println("Lower Key than 3: " + map.lowerKey(3)); // Next lower key

        // Submaps (Range Queries)
        System.out.println("\nKeys before 4: " + map.headMap(4)); // Keys < 4
        System.out.println("Keys from 3 onwards: " + map.tailMap(3)); // Keys >= 3
        System.out.println("Keys from 2 to 4: " + map.subMap(2, 4)); // Keys 2 to 3

        // Sorting in descending order
        System.out.println("\nDescending Order TreeMap: " + map.descendingMap());

        // Custom Comparator to sort TreeMap in descending order (alternative way)
        TreeMap<Integer, String> descMap = new TreeMap<>(Collections.reverseOrder());
        descMap.putAll(map);
        System.out.println("\nTreeMap with Custom Comparator (Descending): " + descMap);
    }
}
// Automatically sort in order according to the keys and no duplication.