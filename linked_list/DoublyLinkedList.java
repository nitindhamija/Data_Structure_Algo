package DS_ALGO_PROG.linked_list;

/**
 * Time Complexity insertion at front O(1) for rest O(n) deletion at front O(1)
 * for rest O(n) however if direct node references are given then it is O(1)
 * searching O(n)
 * 
 */
public class DoublyLinkedList {
    Node head;

    class Node {
        int data;
        Node prev, next;

        Node(int n) {
            this.data = n;
            this.prev = null;
            this.next = null;
        }
    }

    DoublyLinkedList() {
        this.head = null;
    }

    private boolean isEmpty() {
        return this.head == null;
    }

    public void insertAtFront(int n) {
        Node new_node = new Node(n);
        if (isEmpty()) {
            this.head = new_node;
            return;
        } else {
            new_node.next = this.head;
            this.head.prev = new_node;
            this.head = new_node;
            new_node.prev = null;
        }

    }

    public void insertAtBack(int n) {
        Node new_node = new Node(n);
        if (isEmpty()) {
            this.head = new_node;
            return;
        }
        Node curr = this.head;
        while (curr.next != null) {
            curr = curr.next;
        }
        // though this line can be avoided since by defualt node pointer are null and
        // since this will always be last node it's next will be null
        new_node.next = null;

        curr.next = new_node;
        new_node.prev = curr;

    }

    void insertAfterNode(int k, int n) {
        // edge case where no node is there
        if (isEmpty()) {
            System.out.println("node not found");
            return;
        }
        Node new_node = new Node(n);
        Node curr = this.head;
        Node prev = null;
        while (curr != null && curr.data != k) {
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) {
            System.out.println("node not found");
            return;
        }
        if (prev == null) { // edge case where only 1 single matching node
            curr.next = new_node;
            new_node.prev = curr;
        } else {
            new_node.prev = curr;
            new_node.next = curr.next;
            curr.next.prev = new_node;
            curr.next = new_node;
        }

    }

    /** time complexity O(n) */
    void deleteNode(int n) {
        if (isEmpty()) { // edge case no data
            System.out.println("delete : node not found");
            return;
        }
        Node curr = this.head;
        Node prev = null;
        while (curr != null && curr.data != n) {
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) { // no node match
            System.out.println("delete : node not found");
            return;
        }

        if (prev == null) { // head node to delete
            this.head = curr.next;
        }
        if (curr.next != null) {
            curr.next.prev = curr.prev;
        }
        if (curr.prev != null) {
            curr.prev.next = curr.next;
        }
        curr = null;

    }

    public void print() {

        if (isEmpty()) {
            System.out.println("no data");
            return;
        }
        Node curr = this.head;
        while (curr != null) {
            System.out.print(" => " + curr.data);
            curr = curr.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtBack(1);
        dll.insertAtBack(4);
        dll.insertAtBack(10);
        dll.insertAtFront(5);
        dll.insertAfterNode(4, 100);
        dll.insertAfterNode(7, 100);
        dll.print();

        DoublyLinkedList dll1 = new DoublyLinkedList();
        dll1.insertAfterNode(11, 2);

        DoublyLinkedList dll2 = new DoublyLinkedList();
        dll2.insertAtFront(11);
        dll2.insertAfterNode(11, 2);
        dll2.print();

        DoublyLinkedList dll3 = new DoublyLinkedList();
        dll3.deleteNode(4);
        dll3.insertAtFront(11);
        dll3.deleteNode(4);
        dll3.deleteNode(11);
        dll3.print();

        dll3.insertAtFront(5);
        dll3.insertAtFront(6);
        dll3.insertAtFront(11);
        dll3.print();
        dll3.deleteNode(6);

        dll3.insertAtFront(100);
        dll3.print();
        dll3.deleteNode(100);

        dll3.print();

        // dll3.insertAfterNode(11, 2);
        // dll3.print();
    }

}
