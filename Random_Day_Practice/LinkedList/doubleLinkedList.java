package Random_Day_Practice.LinkedList;

public class doubleLinkedList {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static int size=0;

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size() == 0;
    }
    
    //Insertion at begin
    public static void instBeg(int data) {
        Node node = new Node(data);
        size++;
        if (head == null) {
            head = node;
            return;
        }

        node.next = head;
        head.prev = node;
        head = node;
    }

    //Insertion at Last
    public static void delLast(int data) {
        Node node = new Node(data);
        size++;
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }

    //Insertion at Middle
    public static void instMiddle(int data, int index) {
        Node node = new Node(data);
        size++;
        if (head == null) {
            head = node;
            return;
        }
        int i = 0;
        Node temp = head;
        while (i < index - 1) {
            temp = temp.next;
        }


        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        node.prev = temp;
    }
    

    //Deletion at Begin
    public static void delBeg() {
        if (head == null) {
            return;
        }

        if (size == 1) {
            head = null;
            size = 0;
            return;
        }

        size--;
        head = head.next;
        head.prev = null;
    }

    //Deletion at Last
    public static void delLast() {
        if (head == null) {
            return;
        }

        if (size == 1) {
            head = null;
            size = 0;
            return;
        }

        size--;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }



}
