package akhilshettyym.JAVA.leet.ToKnow.Practice.OOPS;

// import F_Interface;
class Shape {
    public void area() {
        // Base class / Parent class
        System.out.println("Display area");
    }
}

class Triangle extends Shape {
    // Inherited properties of base class ie. of Shape
    // Child / sub class
    public void area(int l, int h) {
        System.out.println(l / 2 * l * h);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(l / 2 * l * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

public class Inheritance {
    public static void main(String[] args) {

        // F_Interface.Account account1 = new bank.Account();
    }
}

/*
 * Single Level inheritance - Base -> Derived
 * Multi-level inheritance - Base -> Derived -> Derived
 * Heirarchial inheritance
 * Hybrid inheritance -
 */