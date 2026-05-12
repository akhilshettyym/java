public class A_BreakAndContinueExamples {
    public static void main(String[] args) {

        // --- BREAK IN FOR LOOP ---
        System.out.println("Break in for loop:");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break; // Exit the loop when i equals 4
            }
            System.out.println(i);
        }

        System.out.println(); // Line break for clarity

        // --- CONTINUE IN FOR LOOP ---
        System.out.println("Continue in for loop:");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue; // Skip the rest of the loop when i equals 4
            }
            System.out.println(i);
        }

        System.out.println(); // Line break for clarity

        // --- BREAK IN WHILE LOOP ---
        System.out.println("Break in while loop:");
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break; // Exit the loop when i equals 4
            }
        }

        System.out.println(); // Line break for clarity

        // --- CONTINUE IN WHILE LOOP ---
        System.out.println("Continue in while loop:");
        int j = 0;
        while (j < 10) {
            if (j == 4) {
                j++; // Make sure to increment before continue to avoid infinite loop
                continue; // Skip the rest of the loop when j equals 4
            }
            System.out.println(j);
            j++;
        }
    }
}

/*

Break in for loop:
0
1
2
3

Continue in for loop:
0
1
2
3
5
6
7
8
9

Break in while loop:
0
1
2
3

Continue in while loop:
0
1
2
3
5
6
7
8
9

 */