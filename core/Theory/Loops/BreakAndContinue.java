package MeAndCode.Loops;

public class BreakAndContinue {
    public static void main(String[] args) {
        // Demonstrating break statement in a for loop
        System.out.println("Break example in for loop:");
        for (int k = 0; k < 10; k++) {
            if (k == 5) {
                System.out.println("Breaking loop at k = 5");
                break;
            }
            System.out.println("k: " + k);
        }

        // Demonstrating continue statement in a for loop // used to skip
        System.out.println("Continue example in for loop:");
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                System.out.println("Skipping m = 5");
                continue;
            }
            System.out.println("m: " + m);
        }

        // Demonstrating break in a while loop
        System.out.println("Break example in while loop:");
        int x = 0;
        while (x < 10) {
            if (x == 5) {
                System.out.println("Breaking loop at x = 5");
                break;
            }
            System.out.println("x: " + x);
            x++;
        }

        // Demonstrating continue in a while loop
        System.out.println("Continue example in while loop:");
        int y = 0;
        while (y < 10) {
            y++;
            if (y == 5) {
                System.out.println("Skipping y = 5");
                continue;
            }
            System.out.println("y: " + y);
        }
    }
}

// Break statement exits the loop immediately.
// Continue statement skips the current iteration and moves to the next one.
