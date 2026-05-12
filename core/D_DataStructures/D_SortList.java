package akhilshettyym.JAVA.core.D_DataStructures;

import java.util.ArrayList;
import java.util.Collections;

public class D_SortList {
  public static void main(String[] args) {

    // Sort an ArrayList of Strings in Ascending Order
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    Collections.sort(cars);  // Sort cars alphabetically
    System.out.println("Sorted Strings (Ascending):");
    for (String i : cars) {
      System.out.println(i);
    }

    // Sort an ArrayList of Integers in Ascending Order
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(8);
    myNumbers.add(12);
    Collections.sort(myNumbers);  // Sort numbers numerically
    System.out.println("\\nSorted Integers (Ascending):");
    for (int i : myNumbers) {
      System.out.println(i);
    }

    // Sort an ArrayList of Strings in Descending Order
    ArrayList<String> carsDesc = new ArrayList<String>();
    carsDesc.add("Volvo");
    carsDesc.add("BMW");
    carsDesc.add("Ford");
    carsDesc.add("Mazda");
    Collections.sort(carsDesc, Collections.reverseOrder()); // Sort in reverse
    System.out.println("\\nSorted Strings (Descending):");
    for (String i : carsDesc) {
      System.out.println(i);
    }

    // Sort an ArrayList of Integers in Descending Order
    ArrayList<Integer> myNumbersDesc = new ArrayList<Integer>();
    myNumbersDesc.add(33);
    myNumbersDesc.add(15);
    myNumbersDesc.add(20);
    myNumbersDesc.add(34);
    myNumbersDesc.add(8);
    myNumbersDesc.add(12);
    Collections.sort(myNumbersDesc, Collections.reverseOrder()); // Sort in reverse
    System.out.println("\\nSorted Integers (Descending):");
    for (int i : myNumbersDesc) {
      System.out.println(i);
    }
  }
}