package MeAndCode.Loops;

public class While {
    public static void main(String[] args) {
        // Printing numbers directly
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);

        System.out.println("Using loops !!");
        int i = 1; // Initializing loop variable

        // While loop runs as long as i is less than or equal to 3
        while (i <= 3) {
            System.out.println(i); // Printing current value of i
            i++; // Incrementing i by 1 in each iteration
        }

        System.out.println("Finished running while loop !!!");

        // Demonstrating an infinite loop (Uncomment to test, it will run indefinitely)
        // while (true) {
        // System.out.println("This is an infinite loop!");
        // }

        // Using while loop to sum numbers from 1 to 5
        int sum = 0, num = 1;
        while (num <= 5) {
            sum += num; // Adding current number to sum
            num++; // Incrementing number
        }
        System.out.println("Sum of numbers from 1 to 5 is: " + sum);

        // Using while loop for countdown
        int countdown = 5;
        System.out.println("Countdown begins:");
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Blast off!");
    }
}

// If the condition never becomes false, the while loop keeps getting executed.
// Such a loop is known as an infinite loop.

// The while loop is useful for scenarios where the number of iterations is not
// fixed.
// Examples: reading user input, waiting for a condition to be met, looping
// through a file, etc.