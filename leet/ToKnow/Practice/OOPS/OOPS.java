package akhilshettyym.JAVA.leet.ToKnow.Practice.OOPS;

class Car {
    String brand;
    String color;

    public void drive() {
        System.out.println("Driving to nowhere ");
    }

    public void printBrand() {
        System.out.println(this.brand);
    }

    public void printColor() {
        System.out.println(this.color);
    }

    Car() {
        System.out.println("Non-parameterised Constructor in Car");
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age) {
        System.out.println("Parameterised constructor in Student");
        this.name = name;
        this.age = age;
    }
}

public class OOPS {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Maserati";
        car1.color = "black";

        Car car2 = new Car();
        car2.brand = "Porsche";
        car2.color = "red";

        car1.drive();
        car1.printBrand();
        car2.printColor();

        Student student1 = new Student("Akhil", 22);

        student1.printInfo();

        // Student s2 = new Student(s1); Copy constructors.
    }
}