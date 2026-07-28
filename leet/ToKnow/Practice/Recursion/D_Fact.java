package akhilshettyym.JAVA.leet.ToKnow.Practice.Recursion;

import java.util.Scanner;

public class D_Fact {
    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_nm1 = factorial(n - 1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.print("Factorial of the number " + n + " is " + result);
        sc.close();
    }
}