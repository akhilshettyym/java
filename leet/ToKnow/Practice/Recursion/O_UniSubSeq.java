package akhilshettyym.JAVA.leet.ToKnow.Practice.Recursion;

import java.util.HashSet;
import java.util.Scanner;

public class O_UniSubSeq {
    public static void subSequences(String str, int idx, String newStr, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newStr)) {
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(idx);

        subSequences(str, idx + 1, newStr + currChar, set);
        subSequences(str, idx + 1, newStr, set);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        HashSet<String> set = new HashSet<>();
        subSequences(str, 0, "", set);
        sc.close();
    }
}