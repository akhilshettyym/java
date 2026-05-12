package akhilshettyym.JAVA.core.C_Classes;

public class K_InnerClass {

  // Outer class
  static class OuterClass {
    int x = 10;

    // Regular (non-static) Inner Class
    class InnerClass {
      int y = 5;

      public int sumXY() {
        return x + y; // Accessing outer class variable
      }
    }

    // Private Inner Class
    private class PrivateInnerClass {
      int z = 7;

      public int getZ() {
        return z;
      }
    }

    public int accessPrivateInner() {
      PrivateInnerClass privateInner = new PrivateInnerClass();
      return privateInner.getZ();
    }

    // Static Inner Class
    static class StaticInnerClass {
      int w = 3;
    }
  }

  public static void main(String[] args) {
    // Accessing Regular Inner Class
    OuterClass outer = new OuterClass();
    OuterClass.InnerClass inner = outer.new InnerClass();
    System.out.println("Sum from InnerClass (x + y): " + inner.sumXY()); // Outputs 15

    // Accessing Private Inner Class via public method
    System.out.println("Accessing private inner class value z: " + outer.accessPrivateInner()); // Outputs 7

    // Accessing Static Inner Class without creating OuterClass object
    OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
    System.out.println("Static inner class variable w: " + staticInner.w); // Outputs 3
  }
}
