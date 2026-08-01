package akhilshettyym.JAVA.leet.ToKnow.Advanced.Patterns;

import java.util.Scanner;

public class F_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(j + " ");
            }
            System.out.println();
        }        
        sc.close();
    }
}