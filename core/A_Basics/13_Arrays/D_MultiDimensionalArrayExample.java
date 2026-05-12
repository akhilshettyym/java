public class D_MultiDimensionalArrayExample {
    public static void main(String[] args) {
        // Declare and initialize a 2D array (array of arrays)
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

        // Accessing elements: print the 3rd element of the 2nd array (index [1][2])
        System.out.println("Original element at myNumbers[1][2]: " + myNumbers[1][2]); // Outputs 7

        // Changing an element value at index [1][2]
        myNumbers[1][2] = 9;
        System.out.println("Changed element at myNumbers[1][2]: " + myNumbers[1][2]); // Outputs 9

        System.out.println("\nLooping through the 2D array using nested for loops:");
        // Loop through the 2D array using nested for loops
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.print(myNumbers[i][j] + " ");
            }
            System.out.println(); // New line for each row
        }

        System.out.println("\nLooping through the 2D array using nested for-each loops:");
        // Loop through the 2D array using nested for-each loops
        for (int[] row : myNumbers) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println(); // New line for each row
        }
    }
}

/*

Original element at myNumbers[1][2]: 7
Changed element at myNumbers[1][2]: 9

Looping through the 2D array using nested for loops:
1 2 3 4 
5 6 9 

Looping through the 2D array using nested for-each loops:
1 2 3 4 
5 6 9 

 */