package akhilshettyym.JAVA.leet.ToKnow.Advanced.Queues;

public class ArrayCircularQueue {
    static class Queue {
        int arr[];
        int size;
        int rear = -1;
        int front = -1;

        public Queue(int n) {
            arr = new int[n];
            size = n;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Full Queue");
                return;
            }
            if(front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int result = arr[front];

            //single element condition
            if(rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            rear--;
            return result;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}