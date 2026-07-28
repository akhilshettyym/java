package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

import java.util.Arrays;

public class SortArray {
  public static void main(String[] args) {
    int[] arr = { 80, 60, 50, 70, 20, 30, 10, 90, 40, 100 };

    Arrays.sort(arr); // built-in sort

    System.out.println("Sorted array:");
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}