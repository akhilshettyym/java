package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

import java.util.Scanner;

public class ZB_PolyArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of sides on the polygon :");
        int n = sc.nextInt();
        System.out.print("Input the length of one of the sides :");
        int s = sc.nextInt();
        System.out.println("The area of the Polygon is :" + polygonArea(n, s));
        sc.close();
    }

    public static double polygonArea(double n, double s) {
        return (n * (s * s)) / (4 * Math.tan(Math.PI / n));
    }
}