package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

import java.util.Scanner;

public class G_Multi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(num + "x" + (i + 1) + "=" + num * (i + 1));
        }
        sc.close();
    }
}