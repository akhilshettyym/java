package akhilshettyym.JAVA.leet.ToKnow.Advanced.LinkedList;

import java.util.Scanner;

public class C_ReverseLL {

    Node head;
    private int size;

    C_ReverseLL() {
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
        size++;
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
        size++;
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
        size++;
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
        size--;
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

    // Reverse a linked list iteratively
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            // Update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // Reverse a linked list recursively
    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
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
        C_ReverseLL list = new C_ReverseLL();

        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("1. Add a node to the list in the begining");
        System.out.println("2. Add a node to the list at the end");
        System.out.println("3. Add to a particular position in the list");
        System.out.println("4. Delete the first node from the list");
        System.out.println("5. Delete the last node from the list");
        System.out.println("6. Delete a particular position from the list");
        System.out.println("7. Size of the list");
        System.out.println("8. Reverse the list iteratively");
        System.out.println("9. Reverse the list recursively");
        System.out.println("10. Exit !!!");
        System.out.print("--------------------------------------------------");

        int choice = 0;
        while (choice != 10) {
            System.out.print("\nEnter your choice from the above : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add : ");
                    String addStart = sc.next();
                    list.addFirst(addStart);
                    System.out.println("--------------------------------------------------");
                    list.printList();
                    System.out.print("--------------------------------------------------");
                    break;

                case 2:
                    System.out.print("Enter element to add : ");
                    String addEnd = sc.next();
                    list.addLast(addEnd);
                    System.out.println("--------------------------------------------------");
                    list.printList();
                    System.out.print("--------------------------------------------------");
                    break;

                case 3:
                    System.out.print("Enter the position : ");
                    int addPo = sc.nextInt();
                    System.out.print("Enter element to add : ");
                    String addEle = sc.next();
                    list.addPos(addPo, addEle);
                    System.out.println("--------------------------------------------------");
                    list.printList();
                    System.out.print("--------------------------------------------------");
                    break;

                case 4:
                    System.out.println("Deleting the first node ! : ");
                    list.deleteFirst();
                    System.out.println("--------------------------------------------------");
                    list.printList();
                    System.out.print("--------------------------------------------------");
                    break;

                case 5:
                    System.out.println("Deleting the last node ! : ");
                    list.deleteLast();
                    System.out.println("--------------------------------------------------");
                    list.printList();
                    System.out.print("--------------------------------------------------");
                    break;

                case 6:
                    System.out.print("Enter the position : ");
                    int delPo = sc.nextInt();
                    list.delPos(delPo);
                    System.out.println("--------------------------------------------------");
                    list.printList();
                    System.out.print("--------------------------------------------------");
                    break;

                case 7:
                    System.out.println("--------------------------------------------------");
                    System.out.println("Size of the list : " + list.getSize());
                    System.out.print("--------------------------------------------------");
                    break;

                case 8:
                    System.out.println("--------------------------------------------------");
                    list.reverseIterate();
                    list.printList();
                    System.out.print("--------------------------------------------------");
                    break;

                case 9:
                    System.out.println("--------------------------------------------------");
                    list.head = list.reverseRecursive(list.head);
                    list.printList();
                    System.out.print("--------------------------------------------------");
                    break;

                case 10:
                    System.out.println("--------------------------------------------------");
                    System.out.println("Final List : ");
                    list.printList();
                    System.out.println("--------------------------------------------------");
                    System.out.print("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice... try again...");
            }
        }
        sc.close();
    }
}