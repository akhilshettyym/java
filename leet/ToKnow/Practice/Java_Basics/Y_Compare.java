package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

import java.util.Scanner;

public class Y_Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second number :");
        int num2 = sc.nextInt();

        if (num1 != num2) {
            System.out.println(num1 + "!=" + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + "<" + num2);
        } else {
            System.out.println(num1 + "<=" + num2);
        }
        sc.close();
    }
}