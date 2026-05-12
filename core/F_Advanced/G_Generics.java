package akhilshettyym.JAVA.core.F_Advanced;
// Generic class that can hold any type T
class Box<T> {
    T value; // T is a placeholder for any data type

    // Method to set the value in the box
    void set(T value) {
        this.value = value;
    }

    // Method to get the value from the box
    T get() {
        return value;
    }
}

// Generic class that calculates statistics over numeric types (bounded by
// Number)
class Stats<T extends Number> {
    T[] nums; // Array of numbers of type T

    // Constructor to initialize the array of numbers
    Stats(T[] nums) {
        this.nums = nums;
    }

    // Method to calculate the average of the numbers
    double average() {
        double sum = 0;
        for (T num : nums) {
            sum += num.doubleValue(); // Convert to double for calculation
        }
        return sum / nums.length; // Return the average
    }
}

public class G_Generics {
    // Generic method that prints elements of any array type
    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        // Example of using the generic class Box with String
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, Generics!");
        System.out.println("Box contains: " + stringBox.get());

        // Example of using the generic class Box with Integer
        Box<Integer> intBox = new Box<>();
        intBox.set(42);
        System.out.println("Box contains: " + intBox.get());

        // Example of using the generic method printArray with String array
        String[] names = { "Jenny", "Liam" };
        System.out.println("\nPrinting String array:");
        printArray(names);

        // Example of using the generic method printArray with Integer array
        Integer[] numbers = { 1, 2, 3 };
        System.out.println("\nPrinting Integer array:");
        printArray(numbers);

        // Examples of using Stats class with Integer numbers
        Integer[] intNums = { 10, 20, 30, 40 };
        Stats<Integer> intStats = new Stats<>(intNums);
        System.out.println("\nInteger array average: " + intStats.average());

        // Using Stats class with Double numbers
        Double[] doubleNums = { 1.5, 2.5, 3.5 };
        Stats<Double> doubleStats = new Stats<>(doubleNums);
        System.out.println("Double array average: " + doubleStats.average());
    }
}