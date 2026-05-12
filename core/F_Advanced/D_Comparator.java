package akhilshettyym.JAVA.core.F_Advanced;
import java.util.*;

// Custom comparator to sort even numbers first, then odd numbers
class SortEvenFirst implements Comparator<Integer> { // Use <Integer> to specify type
    public int compare(Integer a, Integer b) {
        boolean aIsEven = (a % 2) == 0;
        boolean bIsEven = (b % 2) == 0;

        if (aIsEven == bIsEven) {
            return Integer.compare(a, b); // Cleaner way to compare numbers
        } else {
            return aIsEven ? -1 : 1; // Even numbers come first
        }
    }
}

public class D_Comparator {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        // Use generics for Comparator
        Comparator<Integer> myComparator = new SortEvenFirst();
        Collections.sort(myNumbers, myComparator);

        // Print sorted numbers
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}