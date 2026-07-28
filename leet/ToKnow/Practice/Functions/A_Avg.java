package akhilshettyym.JAVA.leet.ToKnow.Practice.Functions;

import java.util.Scanner;

public class A_Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number:");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
                if (i == num) {
                    System.out.print("The sum of Odd numbers :" + sum);
                }
            }
        }
        sc.close();
    }
}