package akhilshettyym.JAVA.leet.ToKnow.Practice.Strings;

public class Reverse {
    public static void main(String[] args) {
        String str = "Akhil";

        String reversed = reverse(str);
        System.out.println("Reversed String :" + reversed);
    }

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}

/*
 * for(int i = s.length()-1; i>=0;i--){
 * reversed += s.charAt(i);
 * }
 * return reversed;
 */