public class B_NestedLoopsExample {
    public static void main(String[] args) {

        // Outer loop: runs from i = 1 to i = 2
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times

            // Inner loop: runs from j = 1 to j = 3 for each outer loop iteration
            for (int j = 1; j <= 3; j++) {
                System.out.println("  Inner: " + j); // Executes 6 times total (2 * 3)
            }
        }
    }
}

/*

Outer: 1
  Inner: 1
  Inner: 2
  Inner: 3
Outer: 2
  Inner: 1
  Inner: 2
  Inner: 3

 */