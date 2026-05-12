// Java Identifiers Example

public class D_Identifiers {
    public static void main(String[] args) {

        // Correct and recommended identifier (descriptive)
        int minutesPerHour = 60;
        System.out.println("Minutes per Hour: " + minutesPerHour);

        // Less readable identifier (not recommended)
        int m = 60;
        System.out.println("Value of m: " + m);

        // Using valid variable names
        int totalMarks = 100; // Descriptive identifier
        int _score = 95; // Valid (underscore at the beginning)
        int $price = 500; // Valid (dollar sign at the beginning)

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Score: " + _score);
        System.out.println("Price: " + $price);

        // Invalid identifiers (Uncommenting these will cause errors)
        // int 1stRank = 1; // Error: Cannot start with a number
        // int my var = 10; // Error: Cannot contain spaces
        // int float = 20; // Error: Reserved keyword cannot be used
    }
}