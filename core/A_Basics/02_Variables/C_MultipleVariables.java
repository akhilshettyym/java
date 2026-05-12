// Java Declare Multiple Variables Example

public class C_MultipleVariables {
    public static void main(String[] args) {

        // Declaring multiple variables in separate lines
        int x = 5;
        int y = 6;
        int z = 50;
        System.out.println("Sum (Separate Declaration): " + (x + y + z));

        // Declaring multiple variables in a single line
        int a = 5, b = 6, c = 50;
        System.out.println("Sum (Single Line Declaration): " + (a + b + c));

        // Assigning the same value to multiple variables
        int p, q, r;
        p = q = r = 50; // All variables get the value 50
        System.out.println("Sum (Same Value for All): " + (p + q + r));
    }
}