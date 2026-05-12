package akhilshettyym.JAVA.core.B_Methods;

public class C_MethodReturn {

    // Method with one parameter: returns 5 + the given value
    static int addFive(int x) {
        return 5 + x;
    }

    // Method with two parameters: returns the sum of x and y
    static int addNumbers(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {

        // Calling method with one parameter and printing the result directly
        System.out.println("=== Return Value from Single Parameter Method (addFive) ===");
        System.out.println("5 + 3 = " + addFive(3)); // Output: 8

        // Calling method with two parameters and printing the result directly
        System.out.println("\n=== Return Value from Two Parameters Method (addNumbers) ===");
        System.out.println("5 + 3 = " + addNumbers(5, 3)); // Output: 8

        // Storing the return value in a variable and printing it
        System.out.println("\n=== Storing Returned Value in a Variable ===");
        int result = addNumbers(10, 20);
        System.out.println("10 + 20 = " + result); // Output: 30
    }
}