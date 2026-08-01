public class M_Dups {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 1, 4, 5, 6 };
        int dups = removeDuplicate(arr);

        System.out.print("The array after the removal of dups :");
        for (int i = 0; i < dups; i++) {
            System.out.print(arr[i] + "");
        }
    }

    public static int removeDuplicate(int[] arr) {
        if (arr.length == 0)
            return 0;

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}