import java.util.*;
public class stack {

    // implementation using linked list.
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Stack_from_ll{
        public static Node head;

        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if (isEmpty()) {
                return -1;

            }
            return head.data;
        }


    }
    public static void main(String[] args) {
        // majorly 3 function in stacks

        // 1.Push  :  time complexity O(1)   -- happens at top of stack
        // 2. Pop : time complexity O(1) -- happens at top of stack
        // 3. Peek : time complexity O(1) -- Happens at top of stack


        // Implementation Methods:
        /*
         * 1. Array
         * 2. Arraylist
         * 3. Linked List
         * 
         * 
         * 1. Array : - Fixed size
         * last index is treated as top.
         * 
         * 2. Arraylist: - Variable size
         * Highest index is considered top
         * 3. Linked List: - Variable size
         * Head is considered as top
         * linked list considered good as it gives good time complexity.
         * 
         */

        //  implementation using collection framework

        Stack<Integer> stack = new Stack<>();
        
    }


    // implementation using arraylist
    class Stack_from_arraylist{
        static ArrayList<Integer> arrayList = new ArrayList<>();

        public static boolean isEmpty(){
            return arrayList.size() == 0;
        }

        public static void push(int number){
            arrayList.add(number);
        }

        public static int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top =  arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
            return top;
        }

        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return arrayList.get(arrayList.size() - 1);
        }
    }

    

}
