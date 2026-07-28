package akhilshettyym.JAVA.leet.ToKnow.Practice.Recursion;

import java.util.Scanner;

public class L_MoveAllX {
    public static void moveAllX(String str, int idx, int count, String newStr) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;
            moveAllX(str, idx + 1, count, newStr);
        } else {
            newStr += currChar;
            moveAllX(str, idx + 1, count, newStr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string :");
        String str = sc.nextLine();
        moveAllX(str, 0, 0, "");
        sc.close();
    }
}