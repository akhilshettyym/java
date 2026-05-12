// Java Characters and Strings - Example

public class D_Characters {
    public static void main(String[] args) {

        // Character variables
        char myGrade = 'B';
        System.out.println("My grade is: " + myGrade);

        // ASCII values to characters
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println("ASCII to Characters:");
        System.out.println(myVar1); // A
        System.out.println(myVar2); // B
        System.out.println(myVar3); // C

        System.out.println("----------------------------");

        // String variable
        String greeting = "Hello, World!";
        System.out.println("Greeting message: " + greeting);

        // String concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);
    }
}