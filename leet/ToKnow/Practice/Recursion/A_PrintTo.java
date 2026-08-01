package akhilshettyym.JAVA.leet.ToKnow.Practice.Recursion;

import java.util.Scanner;

public class A_PrintTo {
    // using for loop
    public static void printNum1(int n) {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }

    // Using recurion
    public static void printNum2(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNum2(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
        int n = sc.nextInt();

        System.out.print("Enter your choice - (1:for loop) and (2:Recursion) :");
        int c = sc.nextInt();

        if (c == 1) {
            System.out.println("Running for loop ...");
            printNum1(n);
        } else {
            System.out.println("Running for recursion ...");
            printNum2(n);
        }
        sc.close();
    }
}