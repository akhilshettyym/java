package akhilshettyym.JAVA.leet.ToKnow.Advanced.LinkedList;

public class B_delete {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add the node at the start
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add the node at the last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Delete the node from the start
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void printList() {
        if (head == null) {
            System.out.println("The list is empty !!");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[]) {
        B_delete list = new B_delete();
        list.addFirst("Akhil");
        list.addFirst("I'm");
        list.addFirst("I");
        list.printList();

        list.addLast("Shetty");
        list.addLast("M");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
    }
}