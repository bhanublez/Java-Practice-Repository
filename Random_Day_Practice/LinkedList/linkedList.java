package Random_Day_Practice.LinkedList;

public class linkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static int size = 0;
    static Node head;
    static Node tail;

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size() == 0;
    }

    // Insertion at beginning
    public static void insertionAtBigning(int data) {
        Node node = new Node(data);
        size++;
        if (head == null) {
            head = tail = node;
            return;
        }
        node.next = head;
        head = node;
    }

    // Insertion at Last in linked list
    public static void insertionAtLast(int data) {
        Node node = new Node(data);
        size++;
        if (head == null) {
            node = node.next;
            head = node;
        }

        tail.next = node;
        tail = node;
    }

    // Insertion at Middle LinkedList
    public static void insertionAtMiddle(int data, int index) {
        if (index == 0) {
            insertionAtBigning(data);
            return;
        }
        Node node = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        node.next = temp.next;
        temp.next = node;
    }

    // Deletion at Beginning
    public static void deletionAtBeginning() {
        if (head == null) {
            System.out.println("LInked list is Empty");
            return;
        }
        if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        head = head.next;
        size--;
    }

    public static void deletionAtLast() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
    }

    //Deletion at Middle Linked List
    public static void deletionAtMiddle(int index) {
        if (head == null || size == 0) {
            deletionAtBeginning();
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }
    
}
