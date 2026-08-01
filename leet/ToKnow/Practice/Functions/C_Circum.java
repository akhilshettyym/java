package akhilshettyym.JAVA.leet.ToKnow.Practice.Functions;

import java.util.Scanner;

public class C_Circum {
    public static double area(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

    public static double circum(double radius) {
        double circum = 2 * Math.PI * radius;
        return circum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of a circle :");
        double radius = sc.nextDouble();
        System.out.println("The area of a circle with radius " + radius + " is: " + area(radius));

        System.out.println("The circumference of a circle with radius " + radius + " is: " + circum(radius));
        sc.close();
    }
}