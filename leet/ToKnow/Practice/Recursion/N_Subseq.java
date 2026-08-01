package akhilshettyym.JAVA.leet.ToKnow.Practice.Recursion;

import java.util.Scanner;

public class N_Subseq {
    public static void subSequences(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);

        subSequences(str, idx + 1, newStr + currChar);
        subSequences(str, idx + 1, newStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        subSequences(str, 0, "");
        sc.close();
    }
}