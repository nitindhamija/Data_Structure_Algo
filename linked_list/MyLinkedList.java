package DS_ALGO_PROG.linked_list;

/**
 * Time Complexity insertion at front O(1) for rest O(n) deletion at front O(1)
 * for rest O(n) however if direct node references are given then it is O(1)
 * searching O(n)
 * 
 */
class Node {
    int data;
    Node next;

    Node(int n) {
        this.data = n;
        this.next = null;
    }
}

public class MyLinkedList {
    Node head;

    MyLinkedList() {
        this.head = null;
    }

    MyLinkedList(Node root) {
        this.head = root;
    }

    public void insertAtFront(int n) {
        if (this.head == null) {
            this.head = new Node(n);
            return;
        }

        Node new_node = new Node(n);
        new_node.next = this.head;
        head = new_node;

    }

    // here time complexity is O(n) sicne direct reference to after node is not
    // given, if given time complexity would be O(1)
    public void insertAfterNode(int node, int n) {
        if (isEmpty()) {
            System.out.println("no data");
            return;
        }
        Node new_node = new Node(n);
        Node curr_pointer = this.head;

        while (curr_pointer != null && curr_pointer.data != node) {
            curr_pointer = curr_pointer.next;
        }
        if (curr_pointer == null) {
            System.out.println("key not found");
            return;
        }
        new_node.next = curr_pointer.next;
        curr_pointer.next = new_node;

    }

    public void insertAtEnd(int n) {
        Node new_node = new Node(n);
        if (this.head == null) {
            this.head = new_node;
            return;
        }
        Node curr = this.head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new_node;

    }

    public void deleteNode(int n) {
        if (isEmpty()) {
            System.out.println("invalid operation. list is empty");
            return;
        }
        // edge case if the node to delete is head node then simply move the head
        // pointer to next node;
        if (this.head.data == n) {
            this.head = this.head.next;
            return;
        }
        // for rest both cases last node delete or middle node will be handled by below
        // case.
        Node curr = this.head;
        Node prev = null;
        while (curr != null && curr.data != n) {
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) {
            System.out.println("invalid operation. no such element in the list");
        }

        prev.next = curr.next;
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

    boolean isEmpty() {
        return this.head == null;
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.insertAtFront(1);
        myLinkedList.insertAtFront(5);
        myLinkedList.insertAtFront(-1);
        myLinkedList.insertAtFront(10);
        myLinkedList.insertAtFront(11);
        myLinkedList.print();

        myLinkedList.insertAtEnd(100);
        myLinkedList.print();
        myLinkedList.insertAfterNode(5, 70);
        myLinkedList.print();
        myLinkedList.insertAfterNode(75, 71);
        myLinkedList.print();

    }
}

/**
 * Note: Advantages over singly linked list 1) A DLL can be traversed in both
 * forward and backward direction. 2) The delete operation in DLL is more
 * efficient if pointer to the node to be deleted is given. 3) We can quickly
 * insert a new node before a given node. In singly linked list, to delete a
 * node, pointer to the previous node is needed. To get this previous node,
 * sometimes the list is traversed. In DLL, we can get the previous node using
 * previous pointer.
 * 
 * Disadvantages over singly linked list 1) Every node of DLL Require extra
 * space for an previous pointer. It is possible to implement DLL with single
 * pointer though (See
 * https://www.geeksforgeeks.org/xor-linked-list-a-memory-efficient-doubly-linked-list-set-1/).
 * 2) All operations require an extra pointer previous to be maintained. For
 * example, in insertion, we need to modify previous pointers together with next
 * pointers. For example in following functions for insertions at different
 * positions, we need 1 or 2 extra steps to set previous pointer.
 */
