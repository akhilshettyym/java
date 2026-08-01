public class E_Reverse {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };

        reverseArray(arr);
        System.out.println("Reversed array :");
        for (int num : arr) {
            System.out.print(num + "");
        }
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}