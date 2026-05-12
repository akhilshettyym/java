// Java Type Casting Example
public class A_TypeCasting {
    public static void main(String[] args) {

        // Widening Casting (Automatic) - small to large type conversion
        int myInt = 9;
        double myDouble = myInt; // int to double (automatic)
        System.out.println("Widening Casting:");
        System.out.println("Integer value: " + myInt); // Outputs 9
        System.out.println("Converted to double: " + myDouble); // Outputs 9.0

        System.out.println("----------------------");

        // Narrowing Casting (Manual) - large to small type conversion
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // double to int (manual)
        System.out.println("Narrowing Casting:");
        System.out.println("Double value: " + myDouble2); // Outputs 9.78
        System.out.println("Converted to int: " + myInt2); // Outputs 9 (decimal part lost)

        System.out.println("----------------------");

        // Real-life example: Calculating percentage using type casting
        int maxScore = 500; // Maximum possible score
        int userScore = 423; // User's actual score

        /* Convert userScore to float to ensure accurate division */
        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("Real-Life Example: Percentage Calculation");
        System.out.println("User's percentage: " + percentage + "%"); // Outputs accurate percentage
    }
}