package akhilshettyym.JAVA.MyCode.A_JavaTut.JavaDataStructure;

/*Java HashMap
In the ArrayList, Arrays store items as an ordered collection, and you have to access them with an index number (int type). A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).

One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the same type, like: String keys and String values:*/

import java.util.HashMap;

public class B_HashMap {
    public static void main(String[] args) {
        // Creation of HashMap Object called capital Cities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Adding keys and values (Country and city)
        capitalCities.put("India", "New Delhi");
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("This is how a HashMap looks ...");
        System.out.println(capitalCities);
        System.out.println("---------------------------------------------------------------------------------");
        // To access a value in the HashMap, use the get() method and refer to its key:
        System.out.println("To access a value in the HashMap...");
        System.out.println(capitalCities.get("India"));
        System.out.println("---------------------------------------------------------------------------------");
        // To remove an item, use the remove() method and refer to the key:
        // System.out.println(capitalCities.remove("England"));

        System.out.println(capitalCities);
        System.out.println("---------------------------------------------------------------------------------");

        // To find out how many items there are, use the size() method:
        System.out.println("To find out how many items there are... use size()");
        System.out.println(capitalCities.size());
        System.out.println("---------------------------------------------------------------");
        // capitalCities.clear(); To remove all items, use the clear() method:
        // System.out.println(capitalCities);

        System.out.println("Accesing both keys and values.");
        for (String i : capitalCities.keySet()) {
            // System.out.println(i);
            System.out.println("Key : " + i + " Value : " + capitalCities.get(i));
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("Accesing only values.");
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
        System.out.println("---------------------------------------------------------------");

        // *************************************************************************************
        // */
        // Object called people that will store String keys and Integer values
        System.out.println("Object called people that will store String keys and Integer values");
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("Akhil", 22);
        people.put("Baran", 23);
        people.put("Beru", 24);
        people.put("Igris", 25);
        people.put("Tusk", 26);

        for (String i : people.keySet()) {
            System.out.println("Key : " + i + " ! Value : " + people.get(i));
        }
        System.out.println("---------------------------------------------------------------");
    }
}