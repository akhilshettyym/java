package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

import java.util.Scanner;

public class K_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of the Circle :");
        float r = sc.nextFloat();
        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;
        System.out.println("Perimeter of the circle is :" + perimeter);
        System.out.println("Area of the circle is :" + area);
        sc.close();
    }
}