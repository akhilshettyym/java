package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

public class ZN_LargestEle {
    public static void main(String[] args) {
        int[] numbers = { 3, 6, 2, 9, 15, 1 };
        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Largest element in the array is : " + max);
    }
}