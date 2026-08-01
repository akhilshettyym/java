package akhilshettyym.JAVA.leet.ToKnow.Practice.Recursion;

// Print all the subsets of a set of first n natural numbers
import java.util.ArrayList;
import java.util.Scanner;

public class U_Subsets {
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = -0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }
        subset.add(n);
        findSubsets(n - 1, subset);

        subset.remove(subset.size() - 1);
        findSubsets(n - 1, subset);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();

        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);

        sc.close();
    }
}