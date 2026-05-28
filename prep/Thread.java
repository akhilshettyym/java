// package akhilshettyym.JAVA.prep;

// class A extends Thread {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("HI");
//         }
//     }
// }

// class B extends Thread {
//     public void run() {
//         for (int i = 0; i <= 10; i++) {
//             System.out.println("HEHE");

//             try {
//                 // Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class Thread {
//     public static void main(String[] args) {
//         A obj1 = new A();
//         B obj2 = new B();

//         obj1.start();
//         obj2.start();
//     }
// }