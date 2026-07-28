package akhilshettyym.JAVA.leet.ToKnow.Practice.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements.
        list.add(625);
        list.add(170);
        list.add(200);
        System.out.print("Adding elements to the list : " + list + "\n");

        // Get elements
        System.out.print("Get an element from the list : " + list.get(1));

        // Add elements
        list.add(1, 1);
        System.out.print("Adding an element to the list : " + list + "\n");

        // Set elements
        list.set(0, 965);
        System.out.print("Setting an element to a specific index : " + list + "\n");

        // Remove element
        list.remove(2);
        System.out.print("Removing an element : " + list + "\n");

        // Size of a list
        int size = list.size();
        System.out.print("Size of a list : " + size + "\n");

        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Sorting
        Collections.sort(list);
        System.out.print("Sorting using Colections : " + list);
    }
}