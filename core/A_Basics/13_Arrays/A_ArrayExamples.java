public class A_ArrayExamples {
    public static void main(String[] args) {

        // Declare and initialize a String array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // Access and print the first element (index 0)
        System.out.println("First car: " + cars[0]);  // Output: Volvo

        // Change the value of the first element
        cars[0] = "Opel";

        // Print the changed value
        System.out.println("First car after update: " + cars[0]);  // Output: Opel

        // Print the total number of elements in the array
        System.out.println("Number of cars: " + cars.length);  // Output: 4

        System.out.println(); // Line break

        // Declare and initialize an int array
        int[] myNum = {10, 20, 30, 40};

        // Print all elements of the int array using a loop
        System.out.println("Integer array values:");
        for (int i = 0; i < myNum.length; i++) {
            System.out.println("Element at index " + i + ": " + myNum[i]);
        }

        System.out.println(); // Line break

        // Use for-each loop to print the string array
        System.out.println("Car brands using for-each loop:");
        for (String car : cars) {
            System.out.println(car);
        }
    }
}

/*

First car: Volvo
First car after update: Opel
Number of cars: 4

Integer array values:
Element at index 0: 10
Element at index 1: 20
Element at index 2: 30
Element at index 3: 40

Car brands using for-each loop:
Opel
BMW
Ford
Mazda

 */