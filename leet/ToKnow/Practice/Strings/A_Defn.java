package akhilshettyym.JAVA.leet.ToKnow.Practice.Strings;

import java.util.Scanner;

// Strings are immutable
public class A_Defn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Akhil";
        System.out.println("Name :" + name);
        String fullName = "Akhil Shetty M";
        System.out.println("Full Name :" + fullName);
        String sentence = "My name is Akhil Shetty";
        System.out.println("A sentence :" + sentence);

        // Taking input form the user
        // sc.next(); - will read only one word. and cut down by space.
        // hence use sc.nextLine();
        System.out.println("Enter your name :");
        String pudar = sc.nextLine();

        System.out.println("Your name is :" + pudar);
        sc.close();

        String firstName = "Akhil ";
        String secondName = "Shetty";
        String fullName2 = firstName + " " + secondName;
        System.out.println("Full name concatinated :" + fullName2);

        System.out.println("Length of the string :" + fullName2.length());

        for (int i = 0; i < fullName2.length(); i++) {
            System.out.println("Print letters individually " + fullName2.charAt(i));
        }

        String name1 = "Tony";
        String name2 = "Tony";
        if (name1.compareTo(name2) == 0) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }

        String name3 = sentence.substring(11, sentence.length());
        System.out.println("Sub String :" + name3);
    }
}