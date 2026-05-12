public class E_Example {
    public static void main(String[] args) {

        // 1. Door security code check
        int doorCode = 1337;
        if (doorCode == 1337) {
            System.out.println("Correct code. The door is now open.");
        } else {
            System.out.println("Wrong code. The door remains closed.");
        }

        // 2. Check if a number is positive, negative, or zero
        int myNum = 10; 
        if (myNum > 0) {
            System.out.println("The value is a positive number.");
        } else if (myNum < 0) {
            System.out.println("The value is a negative number.");
        } else {
            System.out.println("The value is 0.");
        }

        // 3. Check if someone is old enough to vote
        int myAge = 25;
        int votingAge = 18;
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }

        // 4. Check if a number is even or odd
        int numberToCheck = 5;
        if (numberToCheck % 2 == 0) {
            System.out.println(numberToCheck + " is even");
        } else {
            System.out.println(numberToCheck + " is odd");
        }
    }
}