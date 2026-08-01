package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

public class ZL_SumEle {
    public static void main(String[] args) {
        int[] num = { 10, 20, 30, 40, 50 };
        int sum = 0;

        for (int n : num) {
            sum = sum + n;
        }
        System.out.println("Sum of all elements are : " + sum);
    }
}