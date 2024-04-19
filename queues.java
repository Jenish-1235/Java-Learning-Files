public class queues {


    // implementation using array
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void add(int data){
            if (rear == size-1) {
                System.out.println("full queue");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        public static int remove(){
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i<rear; i++ ){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;

        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("queue empty");
                return -1;
            }
            return arr[0];

        }
    }
    public static void main(String[] args) {
        // queue : - works on principle of first in first out.
        /*
         * Implementation: - 
         * 
         * 1. Array : - Fixed Size
         * index 0 is front , last elements index is rear.
         * 
         * 2. 
         */
    }


    // implementation using linkedlist
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class queue_using_linkedlist{
        
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty2(){
            return head == null & tail == null;
        }

        public static void add2(int data){
            Node newNode  = new Node(data);
            if (tail == null) {
                tail = head = newNode;
                return ;
                
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove2(){
            if (isEmpty2()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }

        public static int peek2(){
            if (isEmpty2()) {
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
    }
}
