package akhilshettyym.JAVA.leet.ToKnow.Practice.Functions;

import java.util.Scanner;

public class B_Greater {
    public static int greaterNum(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number :");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number :");
        int num2 = sc.nextInt();
        System.out.print("The greater number among two :" + greaterNum(num1, num2));
        sc.close();
    }
}