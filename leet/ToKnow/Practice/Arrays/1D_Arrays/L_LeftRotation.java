import java.util.Scanner;

public class L_LeftRotation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in an array :");
        int s = sc.nextInt();
        int[] arr = new int[s];

        System.out.println("Enter the elements of an array :");
        for (int i = 0; i < s; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        leftRotation(arr);
        System.out.println("Array after left rotation :");
        for (int num : arr) {
            System.out.println(num + "");
        }
        sc.close();
    }

    public static void leftRotation(int[] arr) {
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
    }
}