package akhilshettyym.JAVA.core.D_DataStructures;

import java.util.HashMap;

public class E_HashMap {
  public static void main(String[] args) {

    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");

    // Print the entire HashMap
    System.out.println("Full HashMap: " + capitalCities);

    // Access an item by key
    System.out.println("Capital of England: " + capitalCities.get("England"));

    // Remove an item by key
    capitalCities.remove("Germany");
    System.out.println("After removing Germany: " + capitalCities);

    // Print size of the HashMap
    System.out.println("HashMap size: " + capitalCities.size());

    // Print all keys
    System.out.println("Keys:");
    for (String key : capitalCities.keySet()) {
      System.out.println(key);
    }

    // Print all values
    System.out.println("Values:");
    for (String value : capitalCities.values()) {
      System.out.println(value);
    }

    // Print keys and values
    System.out.println("Key-Value Pairs:");
    for (String key : capitalCities.keySet()) {
      System.out.println("key: " + key + " value: " + capitalCities.get(key));
    }

    // Example using different types: String keys, Integer values
    HashMap<String, Integer> people = new HashMap<String, Integer>();
    people.put("John", 32);
    people.put("Steve", 30);
    people.put("Angie", 33);

    // Print name and age
    System.out.println("\nPeople and their ages:");
    for (String name : people.keySet()) {
      System.out.println("key: " + name + " value: " + people.get(name));
    }
  }
}