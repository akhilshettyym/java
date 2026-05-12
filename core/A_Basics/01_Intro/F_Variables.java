// Java Variables Example
public class F_Variables {
    public static void main(String[] args) {
        // String variable: Stores text values
        String name = "John";
        System.out.println("Name: " + name);

        // Integer variable: Stores whole numbers
        int myNum = 15;
        System.out.println("Integer Value: " + myNum);

        // Assigning value later
        int anotherNum;
        anotherNum = 25;
        System.out.println("Assigned Later: " + anotherNum);

        // Overwriting variable value
        myNum = 20; // myNum was 15, now updated to 20
        System.out.println("Updated Integer Value: " + myNum);

        // Final variable (constant) - cannot be changed
        final int fixedValue = 100;
        System.out.println("Final Variable: " + fixedValue);
        // fixedValue = 200; // This would cause an error

        // Float variable: Stores decimal numbers (suffix 'f' required)
        float myFloatNum = 5.99f;
        System.out.println("Float Value: " + myFloatNum);

        // Char variable: Stores a single character
        char myLetter = 'D';
        System.out.println("Character Value: " + myLetter);

        // Boolean variable: Stores true or false
        boolean myBool = true;
        System.out.println("Boolean Value: " + myBool);

        // Another example of String
        String myText = "Hello, Java!";
        System.out.println("String Example: " + myText);
    }
}