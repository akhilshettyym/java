package akhilshettyym.JAVA.leet.ToKnow.Practice.Recursion;

import java.util.Scanner;

public class F_Power {
    public static int printPow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xPownm1 = printPow(x, n - 1);
        int xPown = x * xPownm1;
        return xPown;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number x :");
        int x = sc.nextInt();
        System.out.print("Enter a number n :");
        int n = sc.nextInt();

        int result = printPow(x, n);
        System.out.println("Power :" + result);
        sc.close();
    }
}
