public class H_IsSorted {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 5, 1, 8, 9 };
        boolean isSorted = checkSorted(arr);
        System.out.println("Is array sorted :" + isSorted);
    }

    public static boolean checkSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
