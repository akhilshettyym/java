package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

public class ZS_CountEO {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 23, 7, 99, 33, 100 };
        int evenCount = 0, oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                // System.out.println(num + " is even");
                evenCount++;
            } else {
                // System.out.println(num + " is odd");
                oddCount++;
            }
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}