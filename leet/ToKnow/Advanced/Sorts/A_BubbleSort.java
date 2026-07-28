package akhilshettyym.JAVA.leet.ToKnow.Advanced.Sorts;

import java.util.Scanner;

public class A_BubbleSort {
    public static void Sort(int[] arr, int s) {
        for (int i = 0; i < s - 1; i++) {
            for (int j = 0; j < s - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < s; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array : ");
        int s = sc.nextInt();

        int[] arr = new int[s];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < s; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        Sort(arr, s);
        sc.close();
    }
}

/*
 * Push largest element to the end with iterations
 * Time Complexity = O(n^2);
 * 
 * First pass - for int i = 0
 * arr = {6 3 9 5 2 8}
 * - (compare 6 & 3) - (6 > 3) - swap - 3 6 9 5 2 8
 * - (compare 6 & 9) - (6 > 9) - no s - 3 6 9 5 2 8
 * - (compare 9 & 5) - (9 > 5) - swap - 3 6 5 9 2 8
 * - (compare 9 & 2) - (9 > 2) - swap - 3 6 5 2 9 8
 * - (compare 9 & 8) - (9 > 8) - swap - 3 6 5 2 8 9
 * 
 * Second pass - for int i = 1
 * arr = {3 6 5 2 8 9}
 * - (compare 3 & 6) - (3 > 6) - no s - 3 6 5 2 8 9
 * - (compare 6 & 5) - (6 > 5) - swap - 3 5 6 2 8 9
 * - (compare 6 & 2) - (6 > 2) - swap - 3 5 2 6 8 9
 * - (compare 6 & 8) - (6 > 8) - no s - 3 5 2 6 8 9
 * - (compare 8 & 9) - (8 > 9) - no s - 3 5 2 6 8 9
 * 
 * Third pass - for int i = 2
 * arr = {3 5 2 6 8 9}
 * - (compare 3 & 5) - (3 > 5) - no s - 3 5 2 6 8 9
 * - (compare 5 & 2) - (5 > 2) - swap - 3 2 5 6 8 9
 * - (compare 5 & 6) - (5 > 6) - no s - 3 2 5 6 8 9
 * - (compare 6 & 8) - (6 > 8) - no s - 3 2 5 6 8 9
 * - (compare 8 & 9) - (8 > 9) - no s - 3 2 5 6 8 9
 */