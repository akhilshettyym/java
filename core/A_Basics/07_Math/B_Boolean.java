public class B_Boolean {
    public static void main(String[] args) {

        // Boolean values
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println("Is Java fun? " + isJavaFun);         // true
        System.out.println("Is fish tasty? " + isFishTasty);     // false

        // Boolean expression using comparison operator
        int x = 10;
        int y = 9;

        System.out.println("Is x greater than y? " + (x > y));   // true
        System.out.println("Is x equal to 10? " + (x == 10));    // true
        System.out.println("Is 10 equal to 15? " + (10 == 15));  // false

        // Another direct boolean expression
        System.out.println("Is 10 > 9? " + (10 > 9));             // true

        // Real-life example: Voting eligibility check
        int myAge = 25;
        int votingAge = 18;

        System.out.println("Am I old enough to vote? " + (myAge >= votingAge));  // true

        // Using if-else to display voting eligibility message
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
    }
}