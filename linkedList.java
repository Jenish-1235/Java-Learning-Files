import java.util.LinkedList;
public class linkedList {
    Node head;
    private int size = 0;

    // this class is created to make the node of our linked list

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    /*
     * Adding element is linked list
     * add first , add last
     */
    
     public void addFirst(String data){
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
     }

     public void addLast(String data){
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        size++;
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newnode;
     }

     public void printList(){
         Node currentNode = head;
         while (currentNode != null) {
            System.out.print(currentNode.data + "-->");
             currentNode = currentNode.next;
         }

         System.out.println("NULL");
     }
    public static void main(String[] args) {

        // Linked List

        /*
         * It store data in simple form of nodes. Nodes consist 2 data , 1st is information and 2nd is next.
         * 
         * Information is data of that particular node and Next is pointer that points to next element of linked list.
         * 
         * First node is called head of link list.
         * 
         * Types of linked list :-
         * 1.Singular
         * 2.Double
         * 3.Circular
         * 
         * In double type:- previous and next both are stored
         * Circular :- last node connects to first node. so at end null node is not there
         * 
         * when we have to do insertion lots of time we use linked list as its time complexity is O(1);
         * when we have to do searching lots of time we use arraylist as its time complexity is O(1) while linked list's time complexity is O(n);
         * 
         */
        
        //  Creating linkedList from scratch.
        linkedList list_from_scratch = new linkedList();

        list_from_scratch.addFirst("a");
        list_from_scratch.addFirst("is");
        list_from_scratch.addLast("jenish");
        list_from_scratch.printList();

    }

    // delete from linked list :- delete first , delete last;

    public void deleteFirst(String data){
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(String data){
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondlastNode = head;
        Node lastNode = head.next;

        while (lastNode.next !=null) {
            lastNode = lastNode.next;
            secondlastNode = secondlastNode.next;
        }

        secondlastNode.next = null;
    }

    public void getSize(){
        System.out.println(size);
    }

    public void reverseIterate(){

        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }

    }


}
