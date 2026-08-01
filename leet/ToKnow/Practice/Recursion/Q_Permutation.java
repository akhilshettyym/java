package akhilshettyym.JAVA.leet.ToKnow.Practice.Recursion;

import java.util.Scanner;

public class Q_Permutation {
    public static void printPerm(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPerm(newStr, permutation + currChar);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string :");
        String str = sc.nextLine();

        printPerm(str, "");
        sc.close();
    }
}