package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

import java.util.Scanner;

public class V_BinDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long bin, dec = 0, j = 1, rem;

        System.out.print("Input a binary number: ");
        bin = sc.nextLong();

        while (bin != 0) {
            rem = bin % 10;
            dec = dec + rem * j;
            j = j * 2;
            bin = bin / 10;
        }
        System.out.println("Decimal Number: " + dec);
        sc.close();
    }
}