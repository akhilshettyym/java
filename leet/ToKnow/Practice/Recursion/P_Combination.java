package akhilshettyym.JAVA.leet.ToKnow.Practice.Recursion;

import java.util.Scanner;

public class P_Combination {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vw", "xyz" };

    public static void printComb(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);

        String mapping = keypad[currChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string : ");
        String str = sc.nextLine();

        System.out.println("The combination is as follows :");
        printComb(str, 0, "");
        sc.close();
    }
}