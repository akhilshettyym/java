public class B_ArrayLoopExample {
    public static void main(String[] args) {

        // Declare and initialize the array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // Loop through the array using a traditional for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println(); // Blank line for readability

        // Loop through the array using a for-each loop
        System.out.println("Using for-each loop:");
        for (String car : cars) {
            System.out.println(car);
        }
    }
}

/*

Using for loop:
Volvo
BMW
Ford
Mazda

Using for-each loop:
Volvo
BMW
Ford
Mazda

 */