package akhilshettyym.JAVA.MyCode.A_JavaTut.JavaDataStructure;

// In the previous chapter, you learned about the ArrayList class. The LinkedList class is almost identical to the ArrayList:
// package MeAndCode.JavaDataStructure;
import java.util.LinkedList;
import java.util.Collections;

public class E_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> marks = new LinkedList<Integer>();
        marks.add(90);
        marks.add(36);
        marks.add(77);
        marks.add(45);
        marks.add(50);
        marks.add(29);
        System.out.println(marks);
        System.out.println("---------------------------------------------------------------");
        System.out.println("By using above example try to sort the values (ascending order)");
        Collections.sort(marks);
        System.out.println(marks);
        System.out.println("---------------------------------------------------------------");
        System.out.println("By using above example try to sort the values (Descending order)");
        Collections.sort(marks, Collections.reverseOrder());
        System.out.println(marks);
        System.out.println("---------------------------------------------------------------");

        System.out.println("Adding an element in first index");
        marks.addFirst(100);
        System.out.println(marks); // [100, 90, 77, 50, 45, 36, 29]
        System.out.println("---------------------------------------------------------------");
        System.out.println("Adding an element in Last index");
        marks.addLast(100);
        System.out.println(marks); // [100, 90, 77, 50, 45, 36, 29, 100]
        System.out.println("---------------------------------------------------------------");
        System.out.println("Removing an element from the first index");
        marks.removeFirst();
        System.out.println(marks); // [90, 77, 50, 45, 36, 29, 100]
        System.out.println("---------------------------------------------------------------");
        System.out.println("Removing an element from the last index");
        marks.removeLast();
        System.out.println(marks); // [90, 77, 50, 45, 36, 29]

        System.out.println("---------------------------------------------------------------");
        System.out.println("To display the first item in the list");
        System.out.println(marks.getFirst());
        System.out.println("---------------------------------------------------------------");
        System.out.println("To display the last item in the list");
        System.out.println(marks.getLast());
        System.out.println("---------------------------------------------------------------");
    }
}

/*
 * ArrayList vs. LinkedList in Java
 * Both ArrayList and LinkedList implement the List interface, but they function
 * differently.
 * 
 * 1. How They Work
 * ArrayList
 * Uses an internal array to store elements.
 * When adding a new element and the array is full, it creates a new larger
 * array and copies old elements into it.
 * Provides fast random access (O(1)) but slow insertions/deletions (O(n)) due
 * to shifting elements.
 * 
 * LinkedList
 * Uses nodes (containers) to store elements.
 * Each node contains the data and a link to the next node (and previous node in
 * doubly linked list).
 * Provides fast insertions/deletions (O(1)) but slow random access (O(n)) as it
 * needs to traverse nodes.
 * 
 * 2. When to Use
 * Use ArrayList when fast access (random access) is needed.
 * Use LinkedList when frequent insertions/deletions are required.
 * 
 * 3. Performance Comparison
 * Operation ArrayList LinkedList
 * Access (get/set) Fast O(1) Slow O(n) (must traverse)
 * Insert at end Fast O(1) (amortized) Fast O(1)
 * Insert at middle Slow O(n) (shifts elements) Fast O(1) (direct linking)
 * Delete from end Fast O(1) Fast O(1)
 * Delete from middle Slow O(n) Fast O(1)
 * 
 * 4. Special Methods in LinkedList
 * Method Description
 * addFirst() Adds an item to the beginning of the list
 * addLast() Adds an item to the end of the list
 * removeFirst() Removes the first item in the list
 * removeLast() Removes the last item in the list
 * getFirst() Retrieves the first item in the list
 * getLast() Retrieves the last item in the list
 */