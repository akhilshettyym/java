package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

import java.util.Scanner;

public class E_ProdOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number :");
        int num1 = sc.nextInt();
        System.out.println("Input second number :");
        int num2 = sc.nextInt();
        System.out.println("Sum of num1 and num2 :" + (num1 * num2));
        sc.close();
    }
}