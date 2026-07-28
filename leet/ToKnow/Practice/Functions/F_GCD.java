package akhilshettyym.JAVA.leet.ToKnow.Practice.Functions;

import java.util.Scanner;

public class F_GCD {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number :");
        int num2 = sc.nextInt();
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + findGCD(num1, num2));
        sc.close();
    }
}