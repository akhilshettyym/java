package akhilshettyym.JAVA.leet.ToKnow.Advanced.Sorts;

import java.util.Scanner;

public class C_InsertionSort {
    public static void printSorted(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array :");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.print("Enter the elements of an array :");
        for (int i = 0; i < s; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        for (int i = 0; i < s; i++) {
            int cur = arr[i];
            int j = i - 1;
            while (j >= 0 && cur < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = cur;
        }
        printSorted(arr);
        sc.close();
    }
}