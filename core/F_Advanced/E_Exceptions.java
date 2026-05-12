package akhilshettyym.JAVA.core.F_Advanced;
/**
 * Java Exceptions
 * When executing Java code, different errors can occur:
 * - Coding errors made by the programmer
 * - Errors due to wrong input
 * - Unforeseeable runtime issues
 *
 * When an error occurs, Java will normally stop and generate an error message.
 * The technical term for this is: Java will "throw an exception" (throw an
 * error).
 */

public class E_Exceptions {
    public static void main(String[] args) {

        // ===================== Example 1: Handling ArithmeticException
        // =====================
        System.out.println("Try-Catch Example 1");

        int a = 0;
        int b = 0;

        try {
            // Attempting division by zero, which causes ArithmeticException
            b = 20 / a;
        } catch (ArithmeticException e) {
            // Handling the exception and displaying an appropriate message
            System.out.println("You can't divide by zero!");
        }

        // This will always execute, and b remains 0 since an exception occurred
        System.out.println("The result is: " + b);

        // ==================================================================================

        // ===================== Example 2: Handling ArrayIndexOutOfBoundsException
        // =====================
        System.out.println("\nTry-Catch Example 2");

        try {
            int[] myNumbers = { 1, 2, 3 };

            // Accessing a valid index (No Error)
            System.out.println("Value at index 2: " + myNumbers[2]);

            // Attempting to access an invalid index (Index 10 does not exist)
            System.out.println("Value at index 10: " + myNumbers[10]);

        } catch (Exception e) {
            // Handling the exception
            System.out.println("Array index is out of bounds!");
        } finally {
            // The finally block always executes, whether an exception occurs or not
            System.out.println("This will always be printed.");
        }
    }
}