package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

import java.util.Scanner;

public class S_DecBin {
    public static void main(String args[]) {

        int i = 1, j;
        int bin[] = new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");
        int dec = sc.nextInt();

        int quot = dec;

        while (quot != 0) {
            bin[i++] = quot % 2;
            quot = quot / 2;
            // System.out.println("bin[i++]"+ bin[i++]);
            // System.out.println("bin[i++]"+ quot);
        }

        sc.close();

        System.out.print("Binary number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(bin[j]);
        }
        System.out.print("\n");
    }
}