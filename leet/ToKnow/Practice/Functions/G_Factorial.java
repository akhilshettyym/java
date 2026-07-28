package akhilshettyym.JAVA.leet.ToKnow.Practice.Functions;

import java.util.Scanner;

public class G_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.print("Please enter a non-zero number !!");
        } else if (num < 0) {
            System.out.print("Please enter a non negative number !!");
        } else {
            long fact = 1;
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.print("Factorial of the number " + num + " is " + fact);
            sc.close();
        }
    }
}