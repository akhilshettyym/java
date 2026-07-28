package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

import java.util.Scanner;

public class T_DecHex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rem;
        String hexdec = "";
        char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

        System.out.print("Enter a Decimal Number : ");
        int dec = sc.nextInt();

        while (dec > 0) {
            rem = dec % 16;
            hexdec = hex[rem] + hexdec;
            dec = dec / 16;
        }
        sc.close();
        System.out.println("Hexadecimal number is :" + hexdec);
    }
}