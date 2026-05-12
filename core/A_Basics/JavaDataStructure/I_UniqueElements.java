package akhilshettyym.JAVA.MyCode.A_JavaTut.JavaDataStructure;

/*Write a program to add an unique element in a new list by comparing two given lists.
Ex: Input: List1 = [car, bike, bus, train, truck]    List2 = [car, bike ,train, truck]
Output: NewList = [bus] */
import java.util.ArrayList;

public class I_UniqueElements {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("car");
        list1.add("bike");
        list1.add("bus");
        list1.add("train");
        list1.add("truck");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("car");
        list2.add("bike");
        list2.add("train");
        list2.add("truck");

        ArrayList<String> newList = new ArrayList<String>();

        for (String item : list1) {
            if (!list2.contains(item)) {
                newList.add(item);
            }
        }
        // System.out.println("New Array List with unique elements :" + newList);
        System.out.println("NewList = " + newList);
    }
}