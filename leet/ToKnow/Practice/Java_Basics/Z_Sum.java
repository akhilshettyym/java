package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

import java.util.Scanner;

public class Z_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input an integer: ");

        long n = sc.nextLong();

        System.out.println("The sum of the digits is: " + sumDigits(n));
        sc.close();
    }

    public static long sumDigits(long n) {
        long sum = 0;
        while (n != 0) {
            // sum += n % 10;
            sum = sum + n % 10;
            n /= 10;
        }
        return sum;
    }
}