package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

import java.util.Scanner;

public class M_Rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width of rectangle :");
        float w = sc.nextFloat();
        System.out.print("Enter the height of rectangle :");
        float h = sc.nextFloat();
        System.out.println("The Perimeter of the rectangle is :" + (2 * (h + w)));
        System.out.println("The Area of the rectangle is :" + (h * w));
        sc.close();
    }
}