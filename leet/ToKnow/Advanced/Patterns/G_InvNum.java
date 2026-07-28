package akhilshettyym.JAVA.leet.ToKnow.Advanced.Patterns;

import java.util.Scanner;

public class G_InvNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.println(j);
            }
            System.out.println();
        }        
        sc.close();
    }
}