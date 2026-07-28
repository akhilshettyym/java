// Count the number elements that are greater than the given number 
public class I_Greater {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 5, 6, 7, 8, 9 };
        int x = 5;
        int count = Greater(arr, x);
        System.out.println("The number :" + count);
    }

    public static int Greater(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        return count;
    }
}