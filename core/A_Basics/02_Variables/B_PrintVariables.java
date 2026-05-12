// Java Print Variables Example - Displaying and Combining Variables

public class B_PrintVariables {
    public static void main(String[] args) {

        // String variable
        String name = "John";
        System.out.println("Hello " + name); // Combining text and variable

        // Combining two string variables
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName; // Concatenation of Strings
        System.out.println("Full Name: " + fullName);

        // Numeric variables
        int x = 5;
        int y = 6;
        System.out.println("Sum of x and y: " + (x + y)); // Addition of numbers

        // Demonstrating concatenation vs addition
        System.out.println("x + y as text: " + x + y); // This treats x and y as text (concatenation)
        System.out.println("Actual sum: " + (x + y)); // Using parentheses ensures proper addition
    }
}