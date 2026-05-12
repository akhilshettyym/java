public class A_Math {
    public static void main(String[] args) {

        // Math.max(x, y) - returns the higher of two values
        int maxValue = Math.max(5, 10);
        System.out.println("Maximum value: " + maxValue);  // Output: 10

        // Math.min(x, y) - returns the lower of two values
        int minValue = Math.min(5, 10);
        System.out.println("Minimum value: " + minValue);  // Output: 5

        // Math.sqrt(x) - returns the square root of x
        double squareRoot = Math.sqrt(64);
        System.out.println("Square root of 64: " + squareRoot);  // Output: 8.0

        // Math.abs(x) - returns the absolute (positive) value of x
        double absoluteValue = Math.abs(-4.7);
        System.out.println("Absolute value of -4.7: " + absoluteValue);  // Output: 4.7

        // Math.random() - returns a random number between 0.0 and 1.0
        double randomVal = Math.random();
        System.out.println("Random value between 0.0 and 1.0: " + randomVal);

        // Random number between 0 and 100 (inclusive)
        int randomInt = (int)(Math.random() * 101);
        System.out.println("Random integer between 0 and 100: " + randomInt);
    }
}