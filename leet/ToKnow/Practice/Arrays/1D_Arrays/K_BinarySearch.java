import java.util.Scanner;

public class K_BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        System.out.print("Enter the target element :");
        int target = sc.nextInt();

        int index = binarySearch(arr, target);
        System.out.println("The target value is at the index :" + index);
        sc.close();
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}