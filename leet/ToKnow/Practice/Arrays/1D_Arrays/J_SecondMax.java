public class J_SecondMax {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 5, 6 };
        Max(arr);
    }

    public static void Max(int[] arr) {
        int firstMax = arr[0];
        int secondMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > secondMax) {
                if (arr[i] > firstMax) {
                    secondMax = firstMax;
                    firstMax = arr[i];
                } else {
                    secondMax = arr[i];
                }
            }
        }
        System.out.println("First Maximum number is :" + firstMax);
        System.out.println("Second Maximum number is :" + secondMax);
    }
}