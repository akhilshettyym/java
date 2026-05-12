package akhilshettyym.JAVA.core.F_Advanced;
public class H_Exceptions {
    // Method that uses throw to generate a custom exception based on age
    static void checkAge(int age) {
        if (age < 18) {
            // Throw an ArithmeticException if age is below 18
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            // Otherwise, print access granted
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        // Example with an invalid index to trigger ArrayIndexOutOfBoundsException
        try {
            int[] myNumbers = { 1, 2, 3 };
            System.out.println(myNumbers[10]); // This will cause an error
        } catch (Exception e) {
            // Handle any exception
            System.out.println("Something went wrong: " + e.toString());
        }

        // Example with try-catch-finally
        try {
            int[] myNumbers = { 1, 2, 3 };
            System.out.println(myNumbers[10]); // This will cause an error
        } catch (Exception e) {
            // Handle the error
            System.out.println("Caught an error: " + e.getMessage());
        } finally {
            // Code here executes regardless of an exception
            System.out.println("The 'try-catch' block is finished.");
        }

        // Example of using throw for custom exceptions
        System.out.println("\nAge Check:");
        try {
            checkAge(15); // Will throw an exception
        } catch (ArithmeticException e) {
            // Handle the custom exception
            System.out.println("Caught exception: " + e.getMessage());
        }

        // If age is 20, no exception will be thrown
        checkAge(20);
    }
}