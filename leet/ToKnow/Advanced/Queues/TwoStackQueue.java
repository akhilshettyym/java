package akhilshettyym.JAVA.leet.ToKnow.Advanced.Queues;

/* Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

Implement the MyQueue class:

void push(int x) Pushes element x to the back of the queue.
int pop() Removes the element from the front of the queue and returns it.
int peek() Returns the element at the front of the queue.
boolean empty() Returns true if the queue is empty, false otherwise.
Notes:

You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.
Runtime 0ms */
import java.util.*;

public class TwoStackQueue {
    static class QueueC {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public static int remove() {
            if (s1.isEmpty()) {
                return -1;
            }
            return s1.pop();
        }

        public static int peek() {
            if (s1.isEmpty()) {
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

/*
 * class MyQueue {
 * Stack<Integer> s1;
 * Stack<Integer> s2;
 * 
 * public MyQueue(){
 * s1 = new Stack<>();
 * s2 = new Stack<>();
 * }
 * 
 * public void push(int x) {
 * while(!s1.isEmpty()) {
 * s2.push(s1.pop());
 * }
 * s1.push(x);
 * while(!s2.isEmpty()) {
 * s1.push(s2.pop());
 * }
 * }
 * 
 * public int pop() {
 * if(s1.isEmpty()) {
 * return -1;
 * }
 * return s1.pop();
 * }
 * 
 * public int peek() {
 * if(s1.isEmpty()) {
 * return -1;
 * }
 * return s1.peek();
 * }
 * 
 * public boolean empty() {
 * return s1.isEmpty();
 * }
 * }
 * 
 * /**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */