package akhilshettyym.JAVA.leet.ToKnow.Practice.OOPS;

// Multiple inheritance is possible in interface and not in classes
abstract class Animal {
    abstract void walk();
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on four legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on two legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}