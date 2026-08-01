package akhilshettyym.JAVA.leet.ToKnow.Advanced.LinkedList;

import java.util.LinkedList;

public class CollectionsLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("you");
        list.addFirst("are");
        list.addFirst("How");
        System.out.println(list);

        list.addLast("Akhil");
        System.out.println(list);

        list.remove();
        System.out.println(list);
        
        list.removeLast();

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " => ");
        }
        System.out.print("NULL");
    }
}