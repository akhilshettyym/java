package akhilshettyym.JAVA.leet.ToKnow.Advanced.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Order {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildNode(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildNode(nodes);
            newNode.right = buildNode(nodes);
            return newNode;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        preOrder(root.left);
        System.out.print(root.data + " ");
        preOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int s = sc.nextInt();

        int nodes[] = new int[s];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < s; i++) {
            if (sc.hasNextInt()) {
                nodes[i] = sc.nextInt();
            }
        }
        Node root = BinaryTree.buildNode(nodes);

        System.out.println("The root of the tree is : " + root.data);

        System.out.print("PreOrder : ");
        preOrder(root);
        System.out.print("\nInOrder : ");
        inOrder(root);
        System.out.print("\nPostOrder : ");
        postOrder(root);
        System.out.println("\nLevelOrder : ");
        levelOrder(root);

        sc.close();
    }
}