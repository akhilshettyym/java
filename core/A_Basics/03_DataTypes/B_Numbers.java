// Java Numbers - Example

public class B_Numbers {
    public static void main(String[] args) {

        // Integer Types
        byte myByte = 100; // Byte (-128 to 127)
        short myShort = 5000; // Short (-32,768 to 32,767)
        int myInt = 100000; // Int (-2 billion to +2 billion)
        long myLong = 15000000000L; // Long (-9 quintillion to +9 quintillion)

        // Printing Integer Types
        System.out.println("Byte Value: " + myByte);
        System.out.println("Short Value: " + myShort);
        System.out.println("Int Value: " + myInt);
        System.out.println("Long Value: " + myLong);

        System.out.println("----------------------------");

        // Floating Point Types
        float myFloat = 5.75f; // Float (6-7 decimal digits)
        double myDouble = 19.99d; // Double (15-16 decimal digits)

        // Printing Floating Point Types
        System.out.println("Float Value: " + myFloat);
        System.out.println("Double Value: " + myDouble);

        System.out.println("----------------------------");

        // Scientific Numbers
        float sciFloat = 35e3f; // 35 * 10^3 = 35000
        double sciDouble = 12E4d; // 12 * 10^4 = 120000

        // Printing Scientific Numbers
        System.out.println("Scientific Float Value: " + sciFloat);
        System.out.println("Scientific Double Value: " + sciDouble);
    }
}