// Java Variables Example - Demonstrating Different Variable Types

public class A_Variables {
    public static void main(String[] args) {

        // String variable - stores text
        String name = "John";
        System.out.println("Name: " + name);

        // Integer variable - stores whole numbers
        int myNum = 15;
        System.out.println("Integer Number: " + myNum);

        // Assigning value later
        int anotherNum;
        anotherNum = 25;
        System.out.println("Another Number: " + anotherNum);

        // Changing variable value
        myNum = 20; // Overwriting previous value
        System.out.println("Updated Number: " + myNum);

        // Final variable - cannot be changed once assigned
        final int constantNum = 50;
        System.out.println("Final Constant Number: " + constantNum);
        // constantNum = 100; // This line would cause an error

        // Different data types
        float myFloatNum = 5.99f; // Float variable (must have 'f' at the end)
        char myLetter = 'D'; // Character variable (single quotes)
        boolean myBool = true; // Boolean variable (true/false)
        String myText = "Hello"; // String variable

        // Printing different types
        System.out.println("Float Number: " + myFloatNum);
        System.out.println("Character: " + myLetter);
        System.out.println("Boolean: " + myBool);
        System.out.println("Text: " + myText);
    }
}