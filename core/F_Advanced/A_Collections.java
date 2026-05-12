package akhilshettyym.JAVA.core.F_Advanced;
import java.util.*;

public class A_Collections {
    public static void main(String[] args) {
        // ---------------------- LIST INTERFACE ----------------------
        // ArrayList Example (Dynamic array that allows duplicate elements)
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Apple"); // Allows duplicates
        System.out.println("\nArrayList: " + arrayList);

        // LinkedList Example (Doubly linked list - better for frequent insertions &
        // deletions)
        List<String> linkedList = new LinkedList<>(arrayList);
        linkedList.add("Date");
        System.out.println("\nLinkedList: " + linkedList);

        // ---------------------- SET INTERFACE ----------------------
        // HashSet Example (Unordered set, does not allow duplicates)
        Set<String> hashSet = new HashSet<>(arrayList);
        System.out.println("\nHashSet (removes duplicates, unordered): " + hashSet);

        // TreeSet Example (Sorted set, does not allow duplicates)
        Set<String> treeSet = new TreeSet<>(arrayList);
        System.out.println("TreeSet (sorted, unique): " + treeSet);

        // ---------------------- QUEUE INTERFACE ----------------------
        // PriorityQueue Example (Elements are retrieved in sorted order)
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(5);
        priorityQueue.add(20);
        System.out.println("\nPriorityQueue (natural order): " + priorityQueue);
        System.out.println("Polling from PriorityQueue: " + priorityQueue.poll()); // Removes & returns the smallest

        // ---------------------- MAP INTERFACE ----------------------
        // HashMap Example (Stores key-value pairs, unordered)
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(3, "Three");
        hashMap.put(2, "Two");
        System.out.println("\nHashMap (unordered): " + hashMap);

        // TreeMap Example (Sorted map based on keys)
        Map<Integer, String> treeMap = new TreeMap<>(hashMap);
        System.out.println("\nTreeMap (sorted by key): " + treeMap);

        // ---------------------- COLLECTIONS CLASS OPERATIONS ----------------------
        // Sorting a List using Collections.sort()
        System.out.println("---------------------------------------------------");
        System.out.println("                    Collections");
        System.out.println("---------------------------------------------------");

        Collections.sort(arrayList);
        System.out.println("\nSorted ArrayList: " + arrayList);

        // Reversing a List
        Collections.reverse(arrayList);
        System.out.println("\nReversed ArrayList: " + arrayList);

        // Finding max and min in a List
        System.out.println("\nMax element in ArrayList: " + Collections.max(arrayList));
        System.out.println("\nMin element in ArrayList: " + Collections.min(arrayList));

        // Shuffling a List randomly
        Collections.shuffle(arrayList);
        System.out.println("\nShuffled ArrayList: " + arrayList);
    }
}