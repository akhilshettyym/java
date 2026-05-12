public class C_ForLoopExamples {
    public static void main(String[] args) {

        // Example 1: Count to 100 by tens
        System.out.println("Counting by tens from 0 to 100:");
        for (int i = 0; i <= 100; i += 10) {
            System.out.println(i);
        }

        System.out.println(); // Line break for clarity

        // Example 2: Print even numbers between 0 and 10
        System.out.println("Even numbers between 0 and 10:");
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        System.out.println(); // Line break for clarity

        // Example 3: Multiplication table for number 2
        int number = 2;
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

/*

Counting by tens from 0 to 100:
0
10
20
30
40
50
60
70
80
90
100

Even numbers between 0 and 10:
0
2
4
6
8
10

Multiplication table for 2:
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20

 */