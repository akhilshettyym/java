package akhilshettyym.JAVA.core.B_Methods;

public class E_Scope {

  public static void main(String[] args) {

    // ===== Method Scope Example =====
    // Code here cannot use variable x because it hasn't been declared yet

    int x = 100; // Variable x is declared and initialized

    // Code here can use x
    System.out.println("Method Scope - x: " + x); // Output: 100

    // ===== Block Scope Example =====
    {
      // Code here cannot use variable y because it hasn't been declared yet

      int y = 200; // Variable y is declared inside this block

      // Code here can use y
      System.out.println("Block Scope - y: " + y); // Output: 200
    }

    // Code here cannot use variable y because it's out of scope
    // System.out.println(y); // This would cause a compilation error
  }
}