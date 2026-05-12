package akhilshettyym.JAVA.MyCode.A_JavaTut.JavaDataStructure;

/* An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. It is called an "iterator" because "iterating" is the technical term for looping.
To use an Iterator, you must import it from the java.util package. */
import java.util.Iterator;
import java.util.ArrayList;

public class D_Iterator {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Get the iterator
    Iterator<String> it = cars.iterator();
    System.out.println("----------------------------------------------");
    // Print the first item
    System.out.println("First element from the list : " + it.next());
    // Print the second item
    System.out.println("Second element from the list : " + it.next());

    System.out.println("----------------------------------------------");
    System.out.println("To loop through a collection, use the hasNext() and next() methods of the Iterator:");
    while (it.hasNext()) {
      System.out.println("Next element from the list : " + it.next());
    }
    System.out.println("----------------------------------------------");

    // Iterator to remove numbers less than 10 from a collection:
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(12);
    numbers.add(8);
    numbers.add(2);
    numbers.add(23);
    System.out.println(numbers);

    Iterator<Integer> iter = numbers.iterator();

    while (iter.hasNext()) {
      Integer i = iter.next();
      if (i < 10) {
        iter.remove();
      }
    }
    System.out.println("Modified List: " + numbers);
  }
}

// Note : Trying to remove items using a for loop or a for-each loop would not
// work correctly because the collection is changing size at the same time that
// the code is trying to loop.