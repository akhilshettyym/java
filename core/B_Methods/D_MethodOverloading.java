package akhilshettyym.JAVA.core.B_Methods;

public class D_MethodOverloading {

    // Method to add two integers
    static int add(int x, int y) {
        return x + y;
    }

    // Overloaded method to add two doubles
    static double add(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {

        int sumInteger = add(8, 5); // Calls int version
        double sumDouble = add(4.3, 6.26); // Calls double version

        // Display the results with descriptive text
        System.out.println("Sum of integers: " + sumInteger);
        System.out.println("Sum of doubles: " + sumDouble);
    }
}