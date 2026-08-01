package akhilshettyym.JAVA.leet.ToKnow.Practice.Functions;

import java.util.Scanner;

public class D_Voting {
    public static void vote(int age) {
        if (age >= 18) {
            System.out.print("Your are eligible to vote");
        } else {
            System.out.print("Your are not eligible to vote !!!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = sc.nextInt();
        vote(age);
        sc.close();
    }
}