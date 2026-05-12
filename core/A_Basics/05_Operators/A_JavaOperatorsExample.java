public class A_JavaOperatorsExample {
    public static void main(String[] args) {

        // 1. Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: a + b = " + (a + b)); // 15
        System.out.println("Subtraction: a - b = " + (a - b)); // 5
        System.out.println("Multiplication: a * b = " + (a * b)); // 50
        System.out.println("Division: a / b = " + (a / b)); // 2
        System.out.println("Modulus: a % b = " + (a % b)); // 0
        System.out.println("Increment: ++a = " + (++a)); // 11
        System.out.println("Decrement: --b = " + (--b)); // 4

        System.out.println("----------------------");

        // 2. Assignment Operators
        int x = 10;
        System.out.println("Assignment Operators:");
        x += 5; // x = x + 5
        System.out.println("x += 5 -> " + x); // 15
        x -= 3; // x = x - 3
        System.out.println("x -= 3 -> " + x); // 12
        x *= 2; // x = x * 2
        System.out.println("x *= 2 -> " + x); // 24
        x /= 4; // x = x / 4
        System.out.println("x /= 4 -> " + x); // 6
        x %= 4; // x = x % 4
        System.out.println("x %= 4 -> " + x); // 2

        System.out.println("----------------------");

        // 3. Comparison Operators
        int y = 7;
        System.out.println("Comparison Operators:");
        System.out.println("x == y -> " + (x == y)); // false
        System.out.println("x != y -> " + (x != y)); // true
        System.out.println("x > y -> " + (x > y)); // false
        System.out.println("x < y -> " + (x < y)); // true
        System.out.println("x >= y -> " + (x >= y)); // false
        System.out.println("x <= y -> " + (x <= y)); // true

        System.out.println("----------------------");

        // 4. Logical Operators
        boolean cond1 = (x < 5); // false (2 < 5)
        boolean cond2 = (y < 10); // true (7 < 10)

        System.out.println("Logical Operators:");
        System.out.println("cond1 && cond2 -> " + (cond1 && cond2)); // false
        System.out.println("cond1 || cond2 -> " + (cond1 || cond2)); // true
        System.out.println("!cond1 -> " + (!cond1)); // true

        System.out.println("----------------------");

        // Extra: Bitwise Assignment Example (optional for intro)
        int bitVal = 6; // 110 in binary
        bitVal &= 3; // 011 in binary -> result: 2 (010)
        System.out.println("Bitwise AND Assignment (bitVal &= 3): " + bitVal); // 2
    }
}