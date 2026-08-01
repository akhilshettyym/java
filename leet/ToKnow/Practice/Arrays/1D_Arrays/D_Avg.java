public class D_Avg {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int sum = 0;

        for (int i = 0; i <= numbers.length; i++) {
            sum = sum + i;
        }
        System.out.println("Average of numbers in an array :" + sum / (numbers.length));
    }
}