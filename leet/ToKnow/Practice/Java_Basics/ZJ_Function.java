package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

import java.util.Scanner;

public class ZJ_Function {

    public static void sumOfTwo(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of a " + a + " and b " + b + " is :" + sum);
        return;
    }

    public static int mulOfTwo(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a :");
        int a = sc.nextInt();
        System.out.print("Enter the number b :");
        int b = sc.nextInt();

        sumOfTwo(a, b);
        System.out.println("The product of two numbers a and b is :" + mulOfTwo(a, b));
        sc.close();
    }
}