package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

public class H_Smalest {
    public static void main(String[] args) {
        int[] arr = { 101, 50, 100, 47, 69, 625 };
        int min = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("The smallest element in the array is : " + min);
    }
}