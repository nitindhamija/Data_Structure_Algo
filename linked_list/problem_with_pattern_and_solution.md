- [to detect cycle/loop in linked list](#to-detect-cycleloop-in-linked-list)
- [circular linked list applications](#circular-linked-list-applications)
- [to detect loop and find first node of the loop (FLOYD cycle detetction algorithm)](#to-detect-loop-and-find-first-node-of-the-loop-floyd-cycle-detetction-algorithm)
  - [FLOYD cycle detetction algorithm](#floyd-cycle-detetction-algorithm)
- [to find intersection of two linked list](#to-find-intersection-of-two-linked-list)
  - [using 2 pointer technique](#using-2-pointer-technique)
- [Method 3(Using difference of node counts)](#method-3using-difference-of-node-counts)
- [to delete nth node from the end of the linked list](#to-delete-nth-node-from-the-end-of-the-linked-list)
- [reverse linked list recursive sol O(n) time and O(n) space complexity due to](#reverse-linked-list-recursive-sol-on-time-and-on-space-complexity-due-to)
- [using 2 pointers we are reversing each node link to prev step by step](#using-2-pointers-we-are-reversing-each-node-link-to-prev-step-by-step)
- [remove all matching nodes from linked list O(n)](#remove-all-matching-nodes-from-linked-list-on)
- [Odd Even Linked List](#odd-even-linked-list)
- [to check for palindrome](#to-check-for-palindrome)
- [Merge Two Sorted Lists](#merge-two-sorted-lists)
- [two sum problem](#two-sum-problem)
- [flattening of a multilevel linked list](#flattening-of-a-multilevel-linked-list)
  - [using recursion (DFS)](#using-recursion-dfs)
  - [using stack ( not good in terms of time and space complexity)](#using-stack--not-good-in-terms-of-time-and-space-complexity)
- [Copy List with Random Pointer](#copy-list-with-random-pointer)
  - [using extra space hashing](#using-extra-space-hashing)
  - [optimal](#optimal)
- [rotate a linked list by k places](#rotate-a-linked-list-by-k-places)
- [stack and queues](#stack-and-queues)
  - [implement a circular queue](#implement-a-circular-queue)
  - [implementation with better isFull and isEmpty check](#implementation-with-better-isfull-and-isempty-check)
- [application of queue with BFS](#application-of-queue-with-bfs)
  - [template 1](#template-1)
  - [template 2](#template-2)

goal of these notes is to identify patterns and then map it to probmens

# to detect cycle/loop in linked list

package DS_ALGO_PROG.linked_list;

// Definition for singly-linked list.
class ListNode {
int val;
ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

}

public class DetectCycle {
public boolean hasCycle(ListNode head) {
// if list has one or less nodes then no cycle can form
if (head == null || head.next == null) {
return false;
}
// at this point minimum 2 nodes are there
var ptr1 = head;
var ptr2 = head.next;

        // keep on speeding ptr with diff speed unless they point to same node or till
        // fast pointer reaches the end of list in case of no cycle
        while (ptr2 != null && ptr2.next != null && ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
        }
        // check if both ptr refers to same node then cycle is there else not
        return ptr1 == ptr2;

    }

}

# circular linked list applications

/\*\*

- Advantages of Circular Linked Lists: 1) Any node can be a starting point. We
- can traverse the whole list by starting from any point. We just need to stop
- when the first visited node is visited again.
-
- 2.  Useful for implementation of queue. Unlike this implementation, we don’t
- need to maintain two pointers for front and rear if we use circular linked
- list. We can maintain a pointer to the last inserted node and front can
- always be obtained as next of last.
-
- 3.  Circular lists are useful in applications to repeatedly go around the
- list. For example, when multiple applications are running on a PC, it is
- common for the operating system to put the running applications on a list and
- then to cycle through them, giving each of them a slice of time to execute,
- and then making them wait while the CPU is given to another application. It
- is convenient for the operating system to use a circular list so that when it
- reaches the end of the list it can cycle around to the front of the list.
-
- 4.  Circular Doubly Linked Lists are used for implementation of advanced data
- structures like Fibonacci Heap.
  \*/

// Insertion - same cases for deletion
// A node can be added in three ways:

// Insertion in an empty list
// Insertion at the beginning of the list
// Insertion at the end of the list
// Insertion in between the nodes

# to detect loop and find first node of the loop (FLOYD cycle detetction algorithm)

/\*\*

- Definition for singly-linked list. class ListNode { int val; ListNode next;
- ListNode(int x) { val = x; next = null; } }
  \*/

## FLOYD cycle detetction algorithm

/\*\*

- https://www.geeksforgeeks.org/find-first-node-of-loop-in-a-linked-list/ many
- ways to detect loop and first node of the loop like hashset can keep track of
- visited node and floyd algo and other way is to point next of visited node to
- a temp node and this way time comp is O(n) but linked list is destroyed
  \*/

public class FLoydCycleDetection {
public ListNode detectCycle(ListNode head) {
if (head == null || head.next == null) {
return null;
}

        var ptr1 = head;
        var ptr2 = head;

        while (ptr1 != null && ptr2 != null && ptr2.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;

            if (ptr1 == ptr2) {
                var slow = head;
                // distance of first loop node from head and the first meeting point from the
                // first node will always be same since as per the algo m+k=(x-2y)l i.e int
                // multiple of l length of loop i.e
                // so now when slow takes m step from head node and ptr2 will take the same step
                // from meeting point k i.e m steps
                // now at this time ptr2 has completed m+k steps in loop and that means it has
                // covered full circle 1 time or many times and now is at the head of the loop.
                // and on the other hand slow has also reached head of the loop and both pointer
                // again met at that point so
                while (slow != ptr2) {
                    slow = slow.next;
                    ptr2 = ptr2.next;
                }
                return slow;
            }
        }
        return null;

    }

}

# to find intersection of two linked list

## using 2 pointer technique

// https://www.geeksforgeeks.org/write-a-function-to-get-the-intersection-point-of-two-linked-lists/
// // 2 pointer technique
// Using Two pointers :

// Initialize two pointers ptr1 and ptr2 at the head1 and head2.
// Traverse through the lists,one node at a time.
// When ptr1 reaches the end of a list, then redirect it to the head2.
// similarly when ptr2 reaches the end of a list, redirect it the head1.
// Once both of them go through reassigning, they will be equidistant from
// the collision point
// If at any node ptr1 meets ptr2, then it is the intersection node.
// After second iteration if there is no intersection node it returns NULL.

# Method 3(Using difference of node counts)

// Get count of the nodes in the first list, let count be c1.
// Get count of the nodes in the second list, let count be c2.
// Get the difference of counts d = abs(c1 – c2)
// Now traverse the bigger list from the first node till d nodes so that from
// here onwards both the lists have equal no of nodes
// Then we can traverse both the lists in parallel till we come across a common
// node. (Note that getting a common node is done by comparing the address of
// the nodes)

public class Solution {
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null)
            return null;

        var ptr1 = headA;
        var ptr2 = headB;

        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;

            if (ptr1 == ptr2) {
                return ptr1;
            }
            if (ptr1 == null)
                ptr1 = headB;
            if (ptr2 == null)
                ptr2 = headA;

        }
        if (ptr1 == ptr2)
            return ptr1;
        else
            return null;

    }

}

# to delete nth node from the end of the linked list

    // https://www.geeksforgeeks.org/delete-nth-node-from-the-end-of-the-given-linked-list/
    public ListNode removeNthFromEnd(ListNode head, int n) {

        var ptr1 = head;
        var ptr2 = head;

        for (int i = 0; i < n; i++) {
            if (ptr1.next == null) {
                if (i == n - 1)
                    head = head.next;
                return head;
            }
            ptr1 = ptr1.next;
        }
        while (ptr1.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        if (ptr2.next != null)
            ptr2.next = ptr2.next.next;

        return head;
    }

# reverse linked list recursive sol O(n) time and O(n) space complexity due to

    // n stack calls
    ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode newHead = reverse(head.next);
        ListNode headnext = head.next;
        headnext.next = head;
        head.next = null;

        return newHead;
    }

    // mine still O(n) but not as good as others
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        var h = head;
        var curr = head;
        var ptr = head.next;

        while (ptr != null) {
            var temp = ptr.next;
            ptr.next = h;
            curr.next = temp;

            h = ptr;
            ptr = curr.next;
        }
        return h;
    }

# using 2 pointers we are reversing each node link to prev step by step

    public ListNode reverseList(ListNode head) {
        /* iterative solution */
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

# remove all matching nodes from linked list O(n)

    /**
     * Definition for singly-linked list. public class ListNode { int val; ListNode
     * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
     * ListNode next) { this.val = val; this.next = next; } }
     */
    class Solution {
        public ListNode removeElements(ListNode head, int val) {

            while (head != null && head.val == val) {
                head = head.next;
            }
            if (head == null)
                return head;

            var newHead = head;

            while (head.next != null) {
                if (head.next.val == val)
                    head.next = head.next.next;
                else
                    head = head.next;
            }

            return newHead;

        }

    }

# Odd Even Linked List

    /**
     * Definition for singly-linked list. public class ListNode { int val; ListNode
     * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
     * ListNode next) { this.val = val; this.next = next; } }
     */
    class Solution {
        public ListNode oddEvenList(ListNode head) {
            if (head == null || head.next == null || head.next.next == null)
                return head;

            var o = head;
            var e = head.next;
            var temp = head.next;
            while (o.next != null && e.next != null) {
                o.next = e.next;
                o = o.next;
                e.next = o.next;
                e = e.next;
            }
            o.next = temp;
            return head;
        }
    }

# to check for palindrome

    // 1. use stack method
    // 2.break the linked list in half and reverse the second half and compare it
    // with first and take care of odd case time complexity O(n) space complexity
    // O(1)
    // 3.use recursion and and two pointers left and right

    /**
     * Definition for singly-linked list. public class ListNode { int val; ListNode
     * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
     * ListNode next) { this.val = val; this.next = next; } }
     */
    class Solution {
        public boolean isPalindrome(ListNode head) {
            if (head == null)
                return false;

            if (head.next == null)
                return true;
            var slow = head;
            var fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            var temp = reverse(slow);
            var curr = head;
            while (temp != null) {
                if (temp.val != curr.val)
                    return false;

                curr = curr.next;
                temp = temp.next;
            }
            return temp == null;
        }

        ListNode reverse(ListNode head) {
            ListNode prev = null;
            // if(head==null || head.next==null)
            // return head;

            while (head != null) {
                var next = head.next;
                head.next = prev;
                prev = head;
                head = next;

            }
            return prev;

        }
    }

# Merge Two Sorted Lists

/\*\*

- Definition for singly-linked list.
- public class ListNode {
-     int val;
-     ListNode next;
-     ListNode() {}
-     ListNode(int val) { this.val = val; }
-     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
- }
  \*/
  class Solution {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
  ListNode dummy= new ListNode(-1);
  ListNode newList=dummy;
  while(list1!=null && list2!=null){
  if(list1.val<=list2.val)
  {
  newList.next=list1;
  list1=list1.next;
  }
  else
  {
  newList.next=list2;
  list2=list2.next;
  }
  newList=newList.next;
  }
  if(list1!=null){
  newList.next=list1;
  }
  if(list2!=null){
  newList.next=list2;
  }
  return dummy.next;
  }
  }

# two sum problem

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.

/\*\*

- Definition for singly-linked list.
- public class ListNode {
-     int val;
-     ListNode next;
-     ListNode() {}
-     ListNode(int val) { this.val = val; }
-     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
- }
  \*/
  class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
  var h1=l1;
  var h2=l2;
  ListNode p1=null;
  ListNode p2=null;
  int c=0;
  int carry=0;
  while(l1!=null || l2!=null){

              var sum = SumLinkedList(l1!=null?l1.val:0,l2!=null?l2.val:0,carry);
              if(l1!=null)
              {   l1.val=sum%10;
                  p1=l1;
                  l1=l1.next;
                  c++;
              }
              if(l2!=null)
              {   l2.val=sum%10;
                  p2=l2;
                  l2=l2.next;
                  c--;
              }
              carry=sum/10;
          }

          if(c>=0 && carry>0)
              p1.next=new ListNode(carry);
          else if(c<0 && carry>0)
              p2.next=new ListNode(carry);

          return c>=0?h1:h2;
      }

      int SumLinkedList(int a, int b, int carry){
          return (a+b+carry);
      }

}

# flattening of a multilevel linked list

- using recursion
- using stack
- this problem is similar to conversion of tree to linkedlist

https://www.geeksforgeeks.org/flatten-a-multi-level-linked-list-set-2-depth-wise/

## using recursion (DFS)

/_
// Definition for a Node.
class Node {
public int val;
public Node prev;
public Node next;
public Node child;
};
_/

class Solution {
static Node last;
public Node flatten(Node head) {
if(head==null)
return null;
last=head;
var next=head.next;

        if(head.child!=null){
            head.next=flatten(head.child);
            if(head.next!=null)
                head.next.prev=head;
            head.child=null;
        }
        if(next!=null){
            var prev=last;
            prev.next=flatten(next);
            if(prev.next!=null)
                prev.next.prev=prev;
        }
        return head;
    }

}

## using stack ( not good in terms of time and space complexity)

    /*

// Definition for a Node.
class Node {
public int val;
public Node prev;
public Node next;
public Node child;
};
\*/

class Solution {

    public Node flatten(Node head) {

        if(head==null)
            return null;

        Stack<Node> stack= new Stack<>();
        Node pre=null;
        stack.push(head);

        while(!stack.isEmpty()){

           var temp = stack.pop();

            if(temp.next!=null)
               stack.push(temp.next);

            if(temp.child!=null)
               stack.push(temp.child);

            if(pre!=null){
                pre.next=temp;
                temp.prev=pre;
                pre.child=null;
            }

            pre=temp;
        }
        return head;
    }

}

# Copy List with Random Pointer

## using extra space hashing

https://www.geeksforgeeks.org/clone-linked-list-next-arbit-pointer-set-2/
Time complexity : O(n)
Auxiliary space : O(n)

## optimal

https://www.geeksforgeeks.org/clone-linked-list-next-random-pointer-o1-space/

Time Complexity: O(n)
Auxiliary Space: O(1)

/\*
// Definition for a Node.
class Node {
int val;
Node next;
Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

}
\*/

class Solution {
public Node copyRandomList(Node head) {

        if(head==null)
            return null;
        var orig=head;

        //interweaving part
        while(orig!=null){
            var next=orig.next;
            orig.next= new Node(orig.val);
            orig=orig.next;
            orig.next=next;
            orig=orig.next;
        }
        //reinit pointers to interweaved list
          orig=head;

        //assign random pointers of clone with correct node
        while(orig!=null){

            if(orig.next!=null)
                orig.next.random=orig.random!=null?orig.random.next:orig.random;
        // no NPE since orig.next will be clone list last node always
            orig=orig.next.next;
        }

        //separating the list
         var copy=head.next;

         orig=head;
         var clone=copy;

        while(orig!=null){
            var temp=clone.next;
            orig.next=temp;
            clone.next=temp!=null?temp.next:temp;
            orig=orig.next;
            clone=clone.next;
        }
        return copy;
        }

}

# rotate a linked list by k places

time complexity o(n) i.e 2n to be exact
space complexity O(1)

- if list is empty or has only 1 element or if list is to
- if list has more than one node then get the length of the list
- since for a list of n nodes, n rotation will have no effect and since k can be greater than n so we can simply avoid full cycle rotation i.e multiple of n from k and then value of remainder will decide how many rotation we actually have to perform.
- now at this step we have k rotations to perform so first we will find the pivot node and it's previous node , pivot node is nothing but our new head node of rotated list and from value of k and n node we know that new head node will be n-k places away from the current head node so we will reach to that node and make it our new head node of the list

- Definition for singly-linked list.
- public class ListNode {
-     int val;
-     ListNode next;
-     ListNode() {}
-     ListNode(int val) { this.val = val; }
-     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
- }

  ```
  class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null || head.next==null || k==0)
            return head;

        int length=0;
        var curr=head;
        while(curr!=null){
            length++;
            curr=curr.next;
        }

        k=k%length;
        if(k==0)
            return head;

        curr=head;
        ListNode pre=null;
        int pivotIndex = length-k;
        int i=0;

        while(i < pivotIndex ){
            pre=curr;
            curr=curr.next;
            i++;
        }

        pre.next=null;
  		var newHead=curr;
        while(curr!=null && curr.next!=null){
            curr=curr.next;
        }
  		curr.next=head;
        return newHead;
    }
  }
  ```

```

```

# stack and queues

## implement a circular queue

```
class MyCircularQueue {
int size;
int head;
int tail;
int[] data;

    public MyCircularQueue(int k) {
        this.head=-1;
        this.tail=-1;
        this.size=k;
        this.data = new int[k];
    }

    public boolean enQueue(int value) {
        if(isFull())
            return false;
        if(head==-1)
            head=(head + 1) % size;

        tail=(tail + 1) % size;
        data[tail]=value;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty())
            return false;
        if(head==tail)
        {
            head=-1;
            tail=-1;
        }
        else
            head=(head + 1) % size;
        return true;
    }

    public int Front() {
        if(isEmpty())
            return -1;
        else return data[head];
    }

    public int Rear() {
        if(isEmpty())
            return -1;
        else return data[tail];
    }

    public boolean isEmpty() {
        if(this.head==-1)
            return true;
        else return false;
    }

    public boolean isFull() {
        if((head==0 && tail==size-1) || (tail==head-1))
            return true;
        else return false;
    }

}

/\*\*

- Your MyCircularQueue object will be instantiated and called as such:
- MyCircularQueue obj = new MyCircularQueue(k);
- boolean param_1 = obj.enQueue(value);
- boolean param_2 = obj.deQueue();
- int param_3 = obj.Front();
- int param_4 = obj.Rear();
- boolean param_5 = obj.isEmpty();
- boolean param_6 = obj.isFull();
  \*/
```

## implementation with better isFull and isEmpty check

```
class MyCircularQueue {
int size,head,tail;
int[] data;

    public MyCircularQueue(int k) {
        this.head=-1;
        this.tail=-1;
        this.data = new int[k];
    }

    public boolean enQueue(int value) {
        if(isFull())
            return false;
        if(head==-1)
            head=(head + 1) % data.length;

        tail=(tail + 1) % data.length;
        data[tail]=value;
        size++;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty())
            return false;
        if(head==tail)
        {
            head=-1;
            tail=-1;
        }
        else
            head=(head + 1) % data.length;
        size--;
        return true;
    }

    public int Front() {
        if(isEmpty())
            return -1;
        else return data[head];
    }

    public int Rear() {
        if(isEmpty())
            return -1;
        else return data[tail];
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean isFull() {
        return size==data.length;
    }

}

/\*\*

- Your MyCircularQueue object will be instantiated and called as such:
- MyCircularQueue obj = new MyCircularQueue(k);
- boolean param_1 = obj.enQueue(value);
- boolean param_2 = obj.deQueue();
- int param_3 = obj.Front();
- int param_4 = obj.Rear();
- boolean param_5 = obj.isEmpty();
- boolean param_6 = obj.isFull();
  \*/
```

# application of queue with BFS

https://leetcode.com/explore/learn/card/queue-stack/231/practical-application-queue/1372/

## template 1

```
/**
 * Return the length of the shortest path between root and target node.
 */
int BFS(Node root, Node target) {
    Queue<Node> queue;  // store all nodes which are waiting to be processed
    int step = 0;       // number of steps neeeded from root to current node
    // initialize
    add root to queue;
    // BFS
    while (queue is not empty) {
        // iterate the nodes which are already in the queue
        int size = queue.size();
        for (int i = 0; i < size; ++i) {
            Node cur = the first node in queue;
            return step if cur is target;
            for (Node next : the neighbors of cur) {
                add next to queue;
            }
            remove the first node from queue;
        }
        step = step + 1;
    }
    return -1;          // there is no path from root to target
}
```

- As shown in the code, in each round, the nodes in the queue are the nodes which are waiting to be processed.
- After each outer while loop, we are one step farther from the root node. The variable step indicates the distance from the root node and the current node we are visiting.

## template 2

Sometimes, it is important to make sure that we never visit a node twice. Otherwise, we might get stuck in an infinite loop, e.g. in graph with cycle. If so, we can add a hash set to the code above to solve this problem. Here is the pseudocode after modification:

```
/**
 * Return the length of the shortest path between root and target node.
 */
int BFS(Node root, Node target) {
    Queue<Node> queue;  // store all nodes which are waiting to be processed
    Set<Node> visited;  // store all the nodes that we've visited
    int step = 0;       // number of steps neeeded from root to current node
    // initialize
    add root to queue;
    add root to visited;
    // BFS
    while (queue is not empty) {
        // iterate the nodes which are already in the queue
        int size = queue.size();
        for (int i = 0; i < size; ++i) {
            Node cur = the first node in queue;
            return step if cur is target;
            for (Node next : the neighbors of cur) {
                if (next is not in visited) {
                    add next to queue;
                    add next to visited;
                }
            }
            remove the first node from queue;
        }
        step = step + 1;
    }
    return -1;          // there is no path from root to target
}
```
