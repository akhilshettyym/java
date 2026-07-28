package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

import java.util.Scanner;

public class ZE_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string containing letters, numbers, spaces and other char :");
        String test = sc.nextLine();
        System.out.println(test);
        count(test);
        sc.close();
    }

    private static void count(String x) {
        char[] ch = x.toCharArray();

        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;

        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                other++;
            }
        }
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);
    }
}