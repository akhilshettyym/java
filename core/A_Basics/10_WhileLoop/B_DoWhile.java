public class B_DoWhile {
    public static void main(String[] args) {
        int i = 0;

        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        // Output:
        // 0
        // 1
        // 2
        // 3
        // 4
    }
}

/* Explanation:
The do block runs first no matter what.

After the block runs once, it checks the condition i < 5.

If true, it repeats the loop. If false, it exits. */