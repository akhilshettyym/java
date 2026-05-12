package akhilshettyym.JAVA.core.D_DataStructures;

public class H_Wrapper {
  public static void main(String[] args) {
    // Create wrapper objects using primitive values
    Integer myInt = 5;
    Double myDouble = 5.99;
    Character myChar = 'A';

    System.out.println("Wrapper Objects:");
    System.out.println(myInt);
    System.out.println(myDouble);
    System.out.println(myChar);

    // Access primitive values using wrapper methods
    System.out.println("\nUnboxed Primitive Values:");
    System.out.println("intValue: " + myInt.intValue());
    System.out.println("doubleValue: " + myDouble.doubleValue());
    System.out.println("charValue: " + myChar.charValue());

    // Convert wrapper to string and use string methods
    String myString = myInt.toString();
    System.out.println("\nConverted to String:");
    System.out.println("String: " + myString);
    System.out.println("Length of string: " + myString.length());

    // Example: using wrapper class in collections
    java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(myInt);

    System.out.println("\nWrapper Objects in ArrayList:");
    for (Integer num : numbers) {
      System.out.println(num);
    }
  }
}