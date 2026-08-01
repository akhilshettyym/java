package akhilshettyym.JAVA.leet.ToKnow.Practice.Recursion;

import java.util.Scanner;

public class J_Occurance {
    public static int first = -1;
    public static int last = -1;

    public static void Occurance(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        Occurance(str, idx + 1, element);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string :");
        String str = sc.next();
        Occurance(str, 0, 'a');
        sc.close();
    }
}