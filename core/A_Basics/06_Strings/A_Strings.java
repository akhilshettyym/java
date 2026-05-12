public class A_Strings {
    public static void main(String[] args) {

        // Declaring and initializing a String
        String greeting = "Hello";
        System.out.println("Greeting: " + greeting);

        // String Length
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // length() returns the number of characters in the string
        System.out.println("The length of the txt string is: " + txt.length());

        System.out.println("-----------------------------");

        // Using toUpperCase() and toLowerCase() methods
        String message = "Hello World";
        System.out.println("Original: " + message);
        System.out.println("Uppercase: " + message.toUpperCase()); // Outputs "HELLO WORLD"
        System.out.println("Lowercase: " + message.toLowerCase()); // Outputs "hello world"

        System.out.println("-----------------------------");

        // Finding the index of a substring using indexOf()
        String sentence = "Please locate where 'locate' occurs!";
        int position = sentence.indexOf("locate");
        System.out.println("Index of 'locate' in sentence: " + position); // Outputs 7

        System.out.println("-----------------------------");

        // Additional string examples (optional)
        String name = "Akhil";
        String welcomeMessage = "Welcome, " + name + "!"; // String concatenation
        System.out.println(welcomeMessage);

        // Using escape characters
        String quote = "He said, \"Java is fun!\"";
        System.out.println(quote);
    }
}