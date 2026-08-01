public class G_Min {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 1 };

        int min = findMin(arr);
        System.out.println("The minimum number in an array is :" + min);
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}