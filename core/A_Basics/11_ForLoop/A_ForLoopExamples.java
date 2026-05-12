public class A_ForLoopExamples {
    public static void main(String[] args) {
        
        // Example 1: Print numbers from 0 to 4
        // Statement 1: int i = 0 (initialize counter)
        // Statement 2: i < 5 (loop runs while condition is true)
        // Statement 3: i++ (increment counter after each loop)
        System.out.println("Example 1: Print numbers from 0 to 4");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println(); // Line break for clarity

        // Example 2: Print even numbers between 0 and 10
        // Statement 1: int i = 0 (start from 0)
        // Statement 2: i <= 10 (loop runs while i is 10 or less)
        // Statement 3: i = i + 2 (increment by 2 to get even numbers)
        System.out.println("Example 2: Print even numbers between 0 and 10");
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
    }
}

/*

Example 1: Print numbers from 0 to 4
0
1
2
3
4

Example 2: Print even numbers between 0 and 10
0
2
4
6
8
10

 */