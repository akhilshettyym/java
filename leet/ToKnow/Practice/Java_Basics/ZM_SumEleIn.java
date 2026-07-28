package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

import java.util.Arrays;
import java.util.Scanner;

public class ZM_SumEleIn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = s.nextInt();

        int[] num = new int[n];

        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++) {
            num[i] = s.nextInt();
        }
        System.out.println("Array :" + Arrays.toString(num));

        int sum = 0;
        for (int SumOfArr : num) {
            sum += SumOfArr;
        }
        System.out.println("The sum of array elements are : " + sum);
        s.close();
    }
}