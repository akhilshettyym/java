package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

import java.util.Scanner;

public class ZA_HexArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of Hexagon (one side):");
        int s = sc.nextInt();

        System.out.print("The area of the Hexagon is :" + hexagonArea(s) + "\n");
        sc.close();
    }

    public static double hexagonArea(double s) {
        return (6 * (s * s)) / (4 * Math.tan(Math.PI / 6));
    }
}