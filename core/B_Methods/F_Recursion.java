package akhilshettyym.JAVA.core.B_Methods;

public class F_Recursion {

    public static void main(String[] args) {
        // Sum from 1 to 10
        int sumUpTo10 = sumUpTo(10);
        System.out.println("Sum from 1 to 10: " + sumUpTo10); // Outputs: 55

        // Sum from 5 to 10
        int sumBetween = sumInRange(5, 10);
        System.out.println("Sum from 5 to 10: " + sumBetween); // Outputs: 45
    }

    // Recursively sum numbers from 1 to n
    public static int sumUpTo(int n) {
        if (n > 0) {
            return n + sumUpTo(n - 1); // Recursive call
        } else {
            return 0; // Base case
        }
    }

    // Recursively sum numbers from start to end
    public static int sumInRange(int start, int end) {
        if (start > end) {
            // Optional: handle reversed order
            return 0;
        }
        if (start == end) {
            return end; // Base case
        } else {
            return end + sumInRange(start, end - 1); // Recursive call
        }
    }
}