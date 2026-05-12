public class C_AgeArrayExamples {
    public static void main(String[] args) {
        // An array storing different ages
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};

        // Calculate the average age
        float sum = 0;
        int length = ages.length;

        // Loop through the array to sum all ages
        for (int age : ages) {
            sum += age;
        }

        // Calculate average by dividing sum by the number of elements
        float average = sum / length;

        // Print the average age
        System.out.println("The average age is: " + average);

        // Find the lowest age
        int lowestAge = ages[0]; // Start with the first element

        // Loop through the ages to find the lowest value
        for (int age : ages) {
            if (age < lowestAge) {
                lowestAge = age;  // Update lowestAge if a smaller age is found
            }
        }

        // Print the lowest age
        System.out.println("The lowest age in the array is: " + lowestAge);
    }
}

/*

The average age is: 38.25
The lowest age in the array is: 18

 */