package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

public class ZP_Reverse {
    public static void main(String[] args) {
        int[] num = { 4, 8, 12, 16, 20 };

        System.out.println("Reversed array : ");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i] + "");
        }
    }
}