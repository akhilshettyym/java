public class B_StringConcatenationExample {
    public static void main(String[] args) {

        // Using + operator to concatenate strings
        String firstName = "John";
        String lastName = "Doe";

        // Concatenating firstName and lastName with a space in between
        String fullNamePlus = firstName + " " + lastName;
        System.out.println("Using + operator: " + fullNamePlus);

        // ------------------------------------------

        // Using concat() method to join strings
        String first = "John ";
        String last = "Doe";

        // concat() joins the strings directly
        String fullNameConcat = first.concat(last);
        System.out.println("Using concat() method: " + fullNameConcat);

        // ------------------------------------------

        // Additional example: combining string with numbers
        int age = 25;
        String intro = firstName + " is " + age + " years old.";
        System.out.println("Combining strings and numbers: " + intro);
    }
}