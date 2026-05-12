public class C_ElseIf {
    public static void main(String[] args) {

        // Declare and initialize the 'time' variable
        int time = 22;

        // Check the time and respond accordingly
        if (time < 10) {
            System.out.println("Good morning."); // Runs if time is less than 10
        } else if (time < 18) {
            System.out.println("Good day."); // Runs if time is 10 or more, but less than 18
        } else {
            System.out.println("Good evening."); // Runs if time is 18 or more
        }
        // Output: "Good evening." (because time is 22)
    }
}