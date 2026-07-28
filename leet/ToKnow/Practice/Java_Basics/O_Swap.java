package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

import java.util.Scanner;

public class O_Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number :");
        int num2 = sc.nextInt();
        System.out.println("Before Swapping " + num1 + " and " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping " + num1 + " and " + num2);
        sc.close();
    }
}