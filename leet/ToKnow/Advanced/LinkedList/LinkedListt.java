package akhilshettyym.JAVA.leet.ToKnow.Advanced.LinkedList;

public class LinkedListt {
    Node head;
    private int size;

    LinkedListt() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Adding a node in the start
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Adding a node in the end.
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

    // Deleting from the start
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty !");
            return;
        }
        size--;
        head = head.next;
    }

    // Deleting from the Last
    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty !");
            return;
        }
        size--;
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

    // Adding at a particular position
    public void addPos(int index, String data) {
        if (index < 0 || index > size) {
            System.out.println("Invalid input");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        Node currNode = head;
        for (int i = 0; i < index - 1; i++) {
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    // Deleting at a particular position
    public void delPos(int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid input");
            return;
        }
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size) {
            deleteLast();
            return;
        }
        Node currNode = head;
        Node nextNode = head.next;
        for (int i = 0; i < index - 1; i++) {
            currNode = currNode.next;
            nextNode = nextNode.next;
        }
        currNode.next = nextNode.next;
    }

    // Size of the linked List.
    public int getSize() {
        return size;
    }

    // Print the list
    public void printList() {
        if (head == null) {
            System.out.print("The list is empty !!");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " => ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[]) {
        LinkedListt list = new LinkedListt();
        list.addFirst("you");
        list.addFirst("are");
        list.addFirst("how");
        list.addFirst("HI");
        list.printList();

        list.addLast("bro");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        list.addPos(2, "INTWO");
        list.printList();

        list.delPos(2);
        list.printList();

        System.out.println(list.getSize());
    }
}