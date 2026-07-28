public class N_TwoSums {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
        int target = 8;
        boolean exists = hasTwoSum(arr, target);
        System.out.print(exists + " Two sums exists");
    }

    public static boolean hasTwoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target)
                return true;
            else if (sum < target)
                left++;
            else
                right--;
        }
        return false;
    }
}