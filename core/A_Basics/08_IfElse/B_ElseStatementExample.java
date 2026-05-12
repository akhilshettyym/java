public class B_ElseStatementExample {
    public static void main(String[] args) {

        // Declare and initialize the 'time' variable
        int time = 20;

        // Check if time is less than 18
        if (time < 18) {
            System.out.println("Good day.");  // This will run if the condition is true
        } else {
            System.out.println("Good evening.");  // This runs if the condition is false
        }

        // Output: "Good evening." (because 20 is NOT less than 18)
    }
}