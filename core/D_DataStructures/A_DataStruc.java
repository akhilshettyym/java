package akhilshettyym.JAVA.core.D_DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class A_DataStruc {
  public static void main(String[] args) {

    // 1. ArrayList
    System.out.println("=== ArrayList ===");
    ArrayList<String> carList = new ArrayList<>();
    carList.add("Volvo");
    carList.add("BMW");
    carList.add("Ford");
    carList.add("Mazda");
    System.out.println("ArrayList: " + carList);

    // 2. LinkedList
    System.out.println("\n=== LinkedList ===");
    LinkedList<String> carLinkedList = new LinkedList<>();
    carLinkedList.add("Volvo");
    carLinkedList.add("BMW");
    carLinkedList.add("Ford");
    carLinkedList.add("Mazda");
    System.out.println("LinkedList: " + carLinkedList);

    // 3. HashMap
    System.out.println("\n=== HashMap ===");
    HashMap<String, String> capitalCities = new HashMap<>();
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println("HashMap: " + capitalCities);

    // 4. HashSet
    System.out.println("\n=== HashSet ===");
    HashSet<String> carSet = new HashSet<>();
    carSet.add("Volvo");
    carSet.add("BMW");
    carSet.add("Ford");
    carSet.add("BMW"); // duplicate
    carSet.add("Mazda");
    System.out.println("HashSet (unique values): " + carSet);

    // 5. Iterator
    System.out.println("\n=== Iterator (ArrayList) ===");
    Iterator<String> it = carList.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}