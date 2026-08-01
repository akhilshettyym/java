package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

public class ZQ_Copy {
    public static void main(String[] args) {
        int[] original = { 4, 7, 23, 13, 57, 99 };
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        System.out.println("Copied array:");
        for (int num : copy) {
            System.out.print(num + " ");
        }
    }
}