public class P_MaxSub {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = kadane(arr);
        System.out.println("Maximum subarray sum: " + maxSum);
    }

    public static int kadane(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 0; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }
}