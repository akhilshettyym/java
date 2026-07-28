package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

public class ZO_SearchEle {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int target = 5;
        boolean found = false;

        for (int num : numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(target + " is found in the array...");
        } else {
            System.out.println(target + " is not present in the array");
        }
    }
}