package akhilshettyym.JAVA.leet.ToKnow.Practice.Recursion;

import java.util.Scanner;

public class H_TowerOfHanoi {
    public static void towerOfHanoi(int n, String src, String help, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, help);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, help, src, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number n :");
        int n = sc.nextInt();

        double s = Math.pow(2, n) - 1;

        towerOfHanoi(n, "S", "H", "D");
        System.out.println("---------------------------");
        System.out.println("Number of steps taken :" + s);
        System.out.println("===========================");

        sc.close();
    }
}