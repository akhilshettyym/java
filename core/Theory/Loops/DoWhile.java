package MeAndCode.Loops;

public class DoWhile {
    public static void main(String[] args) {
        // Demonstrating while loop
        int a = 0;
        while (a < 5) { // While loop checks condition first
            System.out.println(a);
            a++;
        }

        // Demonstrating do-while loop
        int b = 10; // Even if b starts at 10, the loop executes at least once
        do {
            System.out.println(b);
            b++;
        } while (b < 5);

        // Print first n natural numbers using do-while loop
        int n = 10;
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
    }
}

// While checks the condition first before executing the code.
// Do-while executes the code at least once before checking the condition.