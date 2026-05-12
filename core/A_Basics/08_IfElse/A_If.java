public class A_If {
    public static void main(String[] args) {

        // Example 1: Simple if statement with direct values
        if (20 > 18) {
            System.out.println("20 is greater than 18");  // This will print
        }

        // Example 2: if statement with variables
        int x = 20;
        int y = 18;

        if (x > y) {
            System.out.println("x is greater than y");    // This will also print
        }

        // Explanation:
        // x = 20
        // y = 18
        // The condition (x > y) evaluates to true, so the block inside 'if' runs.
    }
}