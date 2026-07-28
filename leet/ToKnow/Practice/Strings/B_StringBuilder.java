package akhilshettyym.JAVA.leet.ToKnow.Practice.Strings;

public class B_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Akhil");
        System.out.println(sb);

        // Char at index 0
        System.out.println(sb.charAt(0));

        // Replacing a Char
        sb.setCharAt(0, 'a');
        System.out.println(sb);

        // Inserting a Char
        sb.insert(0, 'a');
        System.out.println(sb);

        sb.delete(0, 1);
        System.out.println(sb);

        sb.append(" ");
        sb.append("S");
        sb.append("h");
        sb.append("e");
        sb.append("t");
        sb.append("t");
        sb.append("y");

        System.out.println(sb);
    }
}