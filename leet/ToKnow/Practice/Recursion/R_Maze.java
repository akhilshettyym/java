package akhilshettyym.JAVA.leet.ToKnow.Practice.Recursion;

// Count total paths in a maze to move from (0,0) to (n,m)
import java.util.Scanner;

public class R_Maze {
    public static int countPaths(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        int downPaths = countPaths(i + 1, j, n, m);
        int rightPaths = countPaths(i, j + 1, n, m);

        return downPaths + rightPaths;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns : ");
        int m = sc.nextInt();

        int total = countPaths(0, 0, n, m);
        System.out.print("The total number of paths are : " + total);
        sc.close();
    }
}