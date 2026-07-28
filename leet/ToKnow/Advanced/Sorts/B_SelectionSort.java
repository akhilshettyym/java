package akhilshettyym.JAVA.leet.ToKnow.Advanced.Sorts;

import java.util.Scanner;

public class B_SelectionSort {
    public static void Sort(int[] arr, int s) {
        for (int i = 0; i < s - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < s; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
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
 * Divide the list into two parts: sorted and unsorted.
 * Find the smallest element in the unsorted part.
 * Swap it with the first element of the unsorted part.
 * Move the boundary of the sorted part one step forward.
 * Repeat until the entire list is sorted
 * 
 * SELECTION SORT -
 * First Pass - for int i = 0
 * arr = {6 3 9 5 2 8}
 * - smallest: 6 - (6 > 3) - smallest: 3
 * - smallest: 3 - (3 > 9) - smallest: 3
 * - smallest: 3 - (3 > 5) - smallest: 3
 * - smallest: 3 - (3 > 2) - smallest: 2
 * - smallest: 2 - (2 > 8) - smallest: 2
 * arr = {2 3 9 5 6 8}
 * 
 * Second Pass - for int i =1 || arr[0] fixed
 * arr = {2, 3, 9, 5, 6, 8}
 * - smallest: 3 - (3 > 9) - smallest: 3
 * - smallest: 3 - (3 > 5) - smallest: 3
 * - smallest: 3 - (3 > 6) - smallest: 3
 * - smallest: 3 - (3 > 8) - smallest: 3
 * arr = {2, 3, 9, 5, 6, 8}
 * 
 * Third Pass - for int i = 2 || arr[1] fixed
 * arr = {2, 3, 9, 5, 6, 8}
 * - smallest: 9 - (9 > 5) - smallest: 5
 * - smallest: 5 - (5 > 6) - smallest: 5
 * - smallest: 5 - (5 > 8) - smallest: 5
 * arr = {2, 3, 5, 9, 6, 8}
 * 
 * Fourth Pass - for int i = 3 || arr[2] fixed
 * arr = {2, 3, 5, 9, 6, 8}
 * - smallest: 9 - (9 > 6) - smallest: 6
 * - smallest: 6 - (6 > 8) - smallest: 6
 * arr = {2, 3, 5, 6, 9, 8}
 * 
 * Fifth Pass - for int i = 4 || arr[3] fixed
 * arr = {2, 3, 5, 6, 9, 8}
 * - smallest: 9 - (9 > 8) - smallest: 8
 * arr = {2, 3, 5, 6, 8, 9}
 */