package akhilshettyym.JAVA.core.B_Methods;

public class A_Methods {

  // This is a user-defined method named 'myMethod'
  // 'static' means this method belongs to the class itself, not objects
  // 'void' means this method does not return any value
  static void myMethod() {
    // This line will be executed each time the method is called
    System.out.println("I just got executed!");
  }

  // This is the main method: the starting point of any Java program
  public static void main(String[] args) {

    // Calling the method multiple times
    myMethod(); // Output: I just got executed!
    myMethod(); // Output: I just got executed!
    myMethod(); // Output: I just got executed!
  }
}