package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

import java.util.Scanner;

public class Q_AddBin {
    public static void main(String[] args) {
        int i = 0, remainder = 0;
        long bin1, bin2;
        int[] sum = new int[20];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Binary number :");
        bin1 = sc.nextLong();
        System.out.print("Enter the Second Binary number :");
        bin2 = sc.nextLong();

        while (bin1 != 0 || bin2 != 0) {
            sum[i++] = (int) ((bin1 % 10 + bin2 % 10 + remainder) % 2);
            remainder = (int) ((bin1 % 10 + bin2 % 10 + remainder) / 2);
            bin1 = bin1 / 10;
            bin2 = bin2 / 10;
        }

        if (remainder != 0) {
            sum[i++] = remainder;
        }
        i--;

        System.out.println("The sum of two Binary numbers is :");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        sc.close();
    }
}