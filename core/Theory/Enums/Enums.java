// /*What is enum in Java?
// enum (short for enumeration) is a special data type in Java that allows you
// to define a fixed set of constants. These constants represent predefined
// values that don’t change.

// Why use enum?
// Improves code readability – Makes the code more understandable and
// meaningful.
// Prevents invalid values – Only allows predefined constants, preventing
// incorrect inputs.
// Better than using final static constants – More organized and type-safe.

// How enum Works in Java?
// enum is like a class with predefined constants.
// Each constant inside enum is an object.
// You can add fields, methods, and constructors inside an enum.

// You can also override methods in enum.

// */

// package MeAndCode.Enums;

// enum day {
// sunday, monday, tuesday, wednesday, thursday, friday, saturday
// }

// public class Enums {
// public static void main(String[] args) {
// day today = day.friday;
// System.out.println("Today is :" + today);

// if (today == day.saturday || today == day.sunday){
// System.out.println("Today is weekend");
// }else{
// System.out.println("Today is weekday");
// }
// }
// }

// // enum Size {
// // SMALL(10), MEDIUM(20), LARGE(30); // Enum constants with values

// // private int price; // Variable to store price

// // // Constructor
// // Size(int price) {
// // this.price = price;
// // }

// // // Method to get price
// // public int getPrice() {
// // return price;
// // }
// // }

// // public class EnumWithMethods {
// // public static void main(String[] args) {
// // Size s = Size.MEDIUM;
// // System.out.println("Size: " + s);
// // System.out.println("Price: $" + s.getPrice());
// // }
// // }