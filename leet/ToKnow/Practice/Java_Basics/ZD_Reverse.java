package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

import java.util.Scanner;

public class ZD_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string :");
        char[] letters = sc.nextLine().toCharArray();

        System.out.println("Reversed string :");

        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.println(letters[i]);
        }
        System.out.println("\n");
        sc.close();
    }
}