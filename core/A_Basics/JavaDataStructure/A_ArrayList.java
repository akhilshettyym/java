package akhilshettyym.JAVA.MyCode.A_JavaTut.JavaDataStructure;

import java.util.ArrayList;
import java.util.Collections;

public class A_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        students.add("Akhil");
        students.add("Igris");
        students.add("Tusk");
        students.add("Baran");
        students.add("Beru");
        students.add("Cha");

        System.out.println("---------------------------------");
        System.out.println("Inserting element at index 2.");
        students.add(2, "Kargalgan");
        System.out.println(students);
        System.out.println("---------------------------------");
        System.out.println("Accessing elements using get.");
        System.out.println(students.get(2));

        System.out.println("---------------------------------");
        System.out.println("Modifying an element.");
        System.out.println(students.set(0, "Shetty"));

        System.out.println("---------------------------------");
        System.out.println(students);

        System.out.println("Checking the size of the array");
        System.out.println(students.size());

        System.out.println("---------------------------------");
        System.out.println("Checking wheather an elemet is in the list.");
        System.out.println(students.contains("Akhil"));
        System.out.println("---------------------------------");
        System.out.println("Looping thru array list !");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out.println("---------------------------------");
        System.out.println("Looping thru array list using for each!");
        for (String i : students) {
            System.out.println(i);
        }

        // By using above example try to sort the values (ascending order and descending
        // order).
        System.out.println("---------------------------------------------------------------");
        System.out.println("By using above example try to sort the values (ascending order)");
        Collections.sort(students);
        System.out.println(students);
        System.out.println("---------------------------------------------------------------");
        System.out.println("By using above example try to sort the values (descending order)");
        Collections.sort(students, Collections.reverseOrder());
        System.out.println(students);
        // ************************************************************************************

        System.out.println("---------------------------------");
        System.out.println("Removing an element from the list.");
        System.out.println(students.remove(6));
        System.out.println("---------------------------------");
        System.out.println("Clearing an entire array.");
        students.clear();
        System.out.println(students);
        System.out.println("---------------------------------");
    }
}