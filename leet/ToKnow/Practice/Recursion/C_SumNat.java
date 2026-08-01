package akhilshettyym.JAVA.leet.ToKnow.Practice.Recursion;

import java.util.Scanner;

public class C_SumNat {
    // Sum of n natural numbers
    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the initial value :");
        int i = sc.nextInt();
        System.out.print("Enter the final value :");
        int n = sc.nextInt();
        printSum(i, n, sum);
        sc.close();
    }
}