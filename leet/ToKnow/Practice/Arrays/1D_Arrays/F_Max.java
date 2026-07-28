public class F_Max {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 6, 7, 8, 0, 9 };

        int max = findMax(arr);
        System.out.println("Maximum element in an array is :" + max);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}