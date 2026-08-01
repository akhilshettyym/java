package akhilshettyym.JAVA.leet.ToKnow.Practice.Recursion;

import java.util.Scanner;

public class S_Tile {
    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        int vertPlacements = placeTiles(n - m, m);
        int horiPlacements = placeTiles(n - 1, m);
        return vertPlacements + horiPlacements;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for n : ");
        int n = sc.nextInt();

        System.out.println("Enter value for m");
        int m = sc.nextInt();

        int result = placeTiles(n, m);
        System.out.println("Result :" + result);
        sc.close();
    }
}