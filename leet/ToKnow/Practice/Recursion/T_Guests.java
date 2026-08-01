package akhilshettyym.JAVA.leet.ToKnow.Practice.Recursion;

import java.util.Scanner;
// Find the number ways in which you can invite n people to your party, single or in pairs

public class T_Guests {
    public static int placeGuests(int n) {
        if (n <= 1) {
            return 1;
        }

        int ways1 = placeGuests(n - 1);
        int ways2 = (n - 1) * placeGuests(n - 2);
        return ways1 + ways2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of guests : ");
        int n = sc.nextInt();

        int result = placeGuests(n);
        System.out.println("Result :" + result);
        sc.close();
    }
}