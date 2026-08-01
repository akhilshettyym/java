package akhilshettyym.JAVA.leet.ToKnow.Practice.Recursion;

import java.util.Scanner;

public class M_RemoveDup {
    public static boolean[] map = new boolean[26];

    public static void removeDup(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            removeDup(str, idx + 1, newStr);
        } else {
            newStr += currChar;
            map[currChar - 'a'] = true;
            removeDup(str, idx + 1, newStr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string :");
        String str = sc.nextLine();

        removeDup(str, 0, "");
        sc.close();
    }
}