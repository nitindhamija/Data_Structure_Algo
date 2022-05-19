- [youtube channel to checkout for leetcode prob](#youtube-channel-to-checkout-for-leetcode-prob)
- [Linked List](#linked-list)
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
    - [improved version from discuss comments](#improved-version-from-discuss-comments)
- [stack and queues](#stack-and-queues)
  - [implement a circular queue](#implement-a-circular-queue)
  - [implementation with better isFull and isEmpty check](#implementation-with-better-isfull-and-isempty-check)
  - [application of queue with BFS](#application-of-queue-with-bfs)
    - [template 1](#template-1)
    - [template 2](#template-2)
  - [first read about graph and connect component of a graph](#first-read-about-graph-and-connect-component-of-a-graph)
    - [return no of island (a variable of connected component problem)](#return-no-of-island-a-variable-of-connected-component-problem)
      - [using BFS](#using-bfs)
      - [using DFS (flood filling technique)](#using-dfs-flood-filling-technique)
    - [open the lock (imp problem) (REVISE)](#open-the-lock-imp-problem-revise)
      - [using BFS and single queue time complexity around 300 ms](#using-bfs-and-single-queue-time-complexity-around-300-ms)
    - [using bidirectional search](#using-bidirectional-search)
    - [optimal solution time complexity less than 15 ms](#optimal-solution-time-complexity-less-than-15-ms)
    - [Perfect Squares( sol using BFS, DP TODO, Math Solution)](#perfect-squares-sol-using-bfs-dp-todo-math-solution)
      - [using BFS and queue time complexity (n \* sqrt(n))](#using-bfs-and-queue-time-complexity-n--sqrtn)
      - [Mathematical solution (Most optimal time complexity)](#mathematical-solution-most-optimal-time-complexity)
    - [min stack problem](#min-stack-problem)
  - [using extra space time complexity O(1) for all operation and space complexity O(n)](#using-extra-space-time-complexity-o1-for-all-operation-and-space-complexity-on)
      - [without extra space TC O(1) SC(1)](#without-extra-space-tc-o1-sc1)
      - [using a stack of Nodes having both val and min for each node](#using-a-stack-of-nodes-having-both-val-and-min-for-each-node)
      - [using a linked list node only slight diff from above solution](#using-a-linked-list-node-only-slight-diff-from-above-solution)
    - [valid paranthese](#valid-paranthese)
      - [my submission ok but not as good as above](#my-submission-ok-but-not-as-good-as-above)
- [binary search O(log(n)](#binary-search-ologn)
  - [template 1](#template-1-1)
    - [iterative sol](#iterative-sol)
    - [sqrure root of x using binary search](#sqrure-root-of-x-using-binary-search)
    - [checkout below also](#checkout-below-also)
    - [here below part is extra to calculate the fractional part up to p point](#here-below-part-is-extra-to-calculate-the-fractional-part-up-to-p-point)
  - [search in a rotated sorted array](#search-in-a-rotated-sorted-array)
  - [template 2](#template-2-1)
    - [first bad version problem](#first-bad-version-problem)
      - [iterative](#iterative)
      - [recursive](#recursive)
    - [find peak element](#find-peak-element)
    - [Find Minimum in Rotated Sorted Array](#find-minimum-in-rotated-sorted-array)
      - [recursive approach find pivot next element of pivot is min element in array](#recursive-approach-find-pivot-next-element-of-pivot-is-min-element-in-array)
      - [iterative approach](#iterative-approach)
  - [template 3](#template-3)
    - [Search for a Range](#search-for-a-range)
      - [gfg sol](#gfg-sol)
      - [sol with template 3 instructions](#sol-with-template-3-instructions)
      - [sol with single binary search (Easy and clean)](#sol-with-single-binary-search-easy-and-clean)
    - [implement pow(x,n)](#implement-powxn)
    - [Find Smallest Letter Greater Than Target](#find-smallest-letter-greater-than-target)
    - [Find Minimum in Rotated Sorted Array with duplicates](#find-minimum-in-rotated-sorted-array-with-duplicates)
      - [iterative approach](#iterative-approach-1)
      - [recursive approach](#recursive-approach)
- [Arrays & String](#arrays--string)
  - [find pivot index](#find-pivot-index)
  - [largest no atleast twice the size of every other no](#largest-no-atleast-twice-the-size-of-every-other-no)
    - [simple sol using two passes](#simple-sol-using-two-passes)
    - [using only single pass optimized](#using-only-single-pass-optimized)
  - [plus one](#plus-one)
  - [spiral traverse of matrix](#spiral-traverse-of-matrix)
  - [pascal triange](#pascal-triange)
  - [Add Binary](#add-binary)
  - [Implement strStr()](#implement-strstr)
    - [sliding window my sol with TC O(m \* (m - n)) SC O(n)](#sliding-window-my-sol-with-tc-om--m---n-sc-on)
    - [normal TC O(m \* n) SC O(1)](#normal-tc-om--n-sc-o1)
  - [to check KMP optimze sol](#to-check-kmp-optimze-sol)
  - [longest common prefix](#longest-common-prefix)
  - [2-pointer technique](#2-pointer-technique)
    - [Array Partition](#array-partition)
    - [two sum II](#two-sum-ii)
      - [O(n) sol using two pointers](#on-sol-using-two-pointers)
      - [O(n log n) sol using binary search](#on-log-n-sol-using-binary-search)
    - [Minimum Size Subarray Sum (revise)](#minimum-size-subarray-sum-revise)
      - [using 2 pointer/ sliding window O(log(n))](#using-2-pointer-sliding-window-ologn)
      - [sol using outer loop and binary search TC O(n log n) TODO](#sol-using-outer-loop-and-binary-search-tc-on-log-n-todo)
    - [min window substring TODO](#min-window-substring-todo)
  - [rotate array TC O(n) in place SC O(1)](#rotate-array-tc-on-in-place-sc-o1)

goal of these notes is to identify patterns and then map it to problems
keep revisting these problems and algo's to keep it fresh in the memory until you no longer needs to revisit again

# youtube channel to checkout for leetcode prob

- tech dose (https://www.youtube.com/watch?v=K0NgGYEAkA4)
- neetcode

# Linked List

## to detect cycle/loop in linked list

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

## circular linked list applications

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

## to detect loop and find first node of the loop (FLOYD cycle detetction algorithm)

/\*\*

- Definition for singly-linked list. class ListNode { int val; ListNode next;
- ListNode(int x) { val = x; next = null; } }
  \*/

### FLOYD cycle detetction algorithm

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

## to find intersection of two linked list

### using 2 pointer technique

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

### Method 3(Using difference of node counts)

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

## to delete nth node from the end of the linked list

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

## reverse linked list recursive sol O(n) time and O(n) space complexity due to

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

## using 2 pointers we are reversing each node link to prev step by step

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

## remove all matching nodes from linked list O(n)

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

## Odd Even Linked List

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

## to check for palindrome

    // 1. use stack method
    // 2.break the linked list in half and reverse the second half and compare it
    // with first and take care of odd case time complexity O(n) space complexity
    // O(1)
    // 3.use recursion and and two pointers left and right

```
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
```

## Merge Two Sorted Lists

```
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
```

## two sum problem

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.

```
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
```

## flattening of a multilevel linked list

- using recursion
- using stack
- this problem is similar to conversion of tree to linkedlist

https://www.geeksforgeeks.org/flatten-a-multi-level-linked-list-set-2-depth-wise/

### using recursion (DFS)

```
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
```

### using stack ( not good in terms of time and space complexity)

```
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
```

## Copy List with Random Pointer

### using extra space hashing

https://www.geeksforgeeks.org/clone-linked-list-next-arbit-pointer-set-2/
Time complexity : O(n)
Auxiliary space : O(n)

### optimal

https://www.geeksforgeeks.org/clone-linked-list-next-random-pointer-o1-space/

Time Complexity: O(n)
Auxiliary Space: O(1)

```
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
```

## rotate a linked list by k places

time complexity o(n) i.e 2n to be exact
space complexity O(1)

- if list is empty or has only 1 element or if list is to
- if list has more than one node then get the length of the list
- since for a list of n nodes, n rotation will have no effect and since k can be greater than n so we can simply avoid full cycle rotation i.e multiple of n from k and then value of remainder will decide how many rotation we actually have to perform.
- now at this step we have k rotations to perform so first we will find the pivot node and it's previous node , pivot node is nothing but our new head node of rotated list and from value of k and n node we know that new head node will be n-k places away from the current head node so we will reach to that node and make it our new head node of the list

```
- Definition for singly-linked list.
- public class ListNode {
-     int val;
-     ListNode next;
-     ListNode() {}
-     ListNode(int val) { this.val = val; }
-     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
- }


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

### improved version from discuss comments

```
best Google Coding Style.....

  public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null || k == 0)
      return head;

    int length = 1;
    ListNode tail = head;
    for (; tail.next != null; tail = tail.next)
      ++length;
    tail.next = head; // circle the list

    final int t = length - k % length;
    for (int i = 0; i < t; ++i)
      tail = tail.next;
    ListNode newHead = tail.next;
    tail.next = null;

    return newHead;
  }
}
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

## application of queue with BFS

https://leetcode.com/explore/learn/card/queue-stack/231/practical-application-queue/1372/

### template 1

```

/\*\*

- Return the length of the shortest path between root and target node.
  \*/
  int BFS(Node root, Node target) {
  Queue<Node> queue; // store all nodes which are waiting to be processed
  int step = 0; // number of steps neeeded from root to current node
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
  return -1; // there is no path from root to target
  }

```

- As shown in the code, in each round, the nodes in the queue are the nodes which are waiting to be processed.
- After each outer while loop, we are one step farther from the root node. The variable step indicates the distance from the root node and the current node we are visiting.

### template 2

Sometimes, it is important to make sure that we never visit a node twice. Otherwise, we might get stuck in an infinite loop, e.g. in graph with cycle. If so, we can add a hash set to the code above to solve this problem. Here is the pseudocode after modification:

```

/\*\*

- Return the length of the shortest path between root and target node.
  \*/
  int BFS(Node root, Node target) {
  Queue<Node> queue; // store all nodes which are waiting to be processed
  Set<Node> visited; // store all the nodes that we've visited
  int step = 0; // number of steps neeeded from root to current node
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
  return -1; // there is no path from root to target
  }

```

## first read about graph and connect component of a graph

A connected component of an undirected graph is a subgraph in which every two vertices are connected to each other by a path(s), and which is connected to no other vertices outside the subgraph.

### return no of island (a variable of connected component problem)

#### using BFS

Time complexity O(m,n) m no of rows and n no of columns
space complexity O(m,n) for extra visited flag 2d array

```

class Solution {
static class Cell{
int row,column;
Cell(int row,int column){
this.row=row;
this.column=column;
}
}

      boolean isSafe(char[][] grid,int i, int j,boolean[][] visited){
            return ((i>=0 && i<grid.length) && (j>=0 && j< grid[0].length) && !visited[i][j] && grid[i][j]=='1');
        }
    /*since adjacent nodes connected horizontly or vertically has be considered and not diagonoly in which case it would 8 neighboring nodes instead of 4 here.*/
      void BFS(char[][] grid,int i, int j,boolean[][] visited){
          //since adjacent nodes connected horizontly or vertically has be considered and not diagonoly in which case it would 8 neighboring nodes instead of 4 here.
          int[] row = {-1,0,0,1};
          int[] column = {0,-1,1,0};

          Queue<Cell> q=new LinkedList<>();
          q.add(new Cell(i,j));
          visited[i][j] = true;

          while(!q.isEmpty()){
              int r=q.peek().row;
              int c=q.peek().column;
              q.remove();

              for(int k=0;k<4;k++)
              {
                  if(isSafe(grid,r+row[k],c+column[k],visited)){
                          visited[r+row[k]][c+column[k]]=true;
                          q.add(new Cell(r+row[k],c+column[k]));
                  }
              }
           }
        }

    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count=0;
        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){

                if(grid[i][j]=='1' && !visited[i][j]){
                    BFS(grid,i,j,visited);
                    count++;
                }
            }
        }
        return count;
    }

}

```

#### using DFS (flood filling technique)

in this method instead of taking extra visited flag array to keep track of visited node we flood the nodes i.e visited cell

```

public class Solution {

private int n;
private int m;

public int numIslands(char[][] grid) {
int count = 0;
n = grid.length;
if (n == 0) return 0;
m = grid[0].length;
for (int i = 0; i < n; i++){
for (int j = 0; j < m; j++)
if (grid[i][j] == '1') {
DFSMarking(grid, i, j);
++count;
}
}
return count;
}

private void DFSMarking(char[][] grid, int i, int j) {
if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') return;
grid[i][j] = '0';
DFSMarking(grid, i + 1, j);
DFSMarking(grid, i - 1, j);
DFSMarking(grid, i, j + 1);
DFSMarking(grid, i, j - 1);
}

```

### open the lock (imp problem) (REVISE)

#### using BFS and single queue time complexity around 300 ms

```

class Solution {
public int openLock(String[] deadends, String target) {
Queue<String> q = new LinkedList<>();
Set<String> deads = new HashSet<>(Arrays.asList(deadends));
Set<String> visited = new HashSet<>();
q.offer("0000");
visited.add("0000");
int level = 0;
while(!q.isEmpty()) {
int size = q.size();
while(size > 0) {
String s = q.poll();
if(deads.contains(s)) {
size --;
continue;
}
if(s.equals(target)) return level;
StringBuilder sb = new StringBuilder(s);
for(int i = 0; i < 4; i ++) {
char c = sb.charAt(i);
String s1 = sb.substring(0, i) + (c == '9' ? 0 : c - '0' + 1) + sb.substring(i + 1);
String s2 = sb.substring(0, i) + (c == '0' ? 9 : c - '0' - 1) + sb.substring(i + 1);
if(!visited.contains(s1) && !deads.contains(s1)) {
q.offer(s1);
visited.add(s1);
}
if(!visited.contains(s2) && !deads.contains(s2)) {
q.offer(s2);
visited.add(s2);
}
}
size --;
}
level ++;
}
return -1;
}
}

```

### using bidirectional search

using bi direction approach we can reduce the time complexity considerably refer link below to know more
https://www.geeksforgeeks.org/bidirectional-search/

### optimal solution time complexity less than 15 ms

- since it is given that locks no will digit only we can parse the locks combination to int like '0000' -> 0 and '1234' -> 1234

- we use 2 queues to keep track of visited nodes in forward dir i.e from source to destination and in backward direction i.e from dest to source.

- that way we reduce the problem in 2 subgraphs and hence reduce the complexity from b^d to b^d/2+b^d/2 where b is branch/depth levels of graph and and d is the distance between source and destination

```

class Solution {
public int openLock(String[] deadends, String target) {

        int[] pow10 = {1, 10, 100, 1000};
        int[] visit = new int[10000]; // 0: not visited, 1: visited through forward direction, -1: visited through backward direction, 2: deadends
        for(String dead: deadends) {
            visit[Integer.parseInt(dead)] = 2;
        }
        int src = 0, dest = Integer.parseInt(target), steps = 0, dir = 1;
        if(visit[src] == 2 || visit[dest] == 2) return -1;
        if(src == dest) return 0;
        Queue<Integer> forward = new LinkedList<>(), backward = new LinkedList<>();
        forward.add(src);
        visit[src] = 1;
        backward.add(dest);
        visit[dest] = -1;
        while(!forward.isEmpty() && !backward.isEmpty()) {
            if(forward.size() > backward.size()) {
                Queue<Integer> tmp = forward; forward = backward; backward = tmp;
                dir = -dir;
            }
            steps++;
            int size = forward.size();
            while(size-- > 0) {
                int cur = forward.poll();
                for(int p: pow10) {
                    int d = (cur / p) % 10;
                    for(int i = -1; i <= 1; i += 2) {
                        int z = d + i;
                        z = z == -1 ? 9 : (z == 10 ? 0 : z);
                        int next = cur + (z - d) * p;
                        if(visit[next] == -dir) return steps;
                        if(visit[next] == 0) {
                            forward.add(next);
                            visit[next] = dir;
                        }
                    }
                }
            }
        }
        return -1;
    }

}

```

### Perfect Squares( sol using BFS, DP TODO, Math Solution)

https://www.geeksforgeeks.org/minimum-number-of-squares-whose-sum-equals-to-given-number-n/

Given an integer n, return the least number of perfect square numbers that sum to n.

A perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.

#### using BFS and queue time complexity (n \* sqrt(n))

this method is better than recursive exponential approach and max n number will be pushed to queue and for each n at max sqrt(n) comparison will be made so time complexity is n \* sqrt(n)

```

class Solution {
public int numSquares(int n) {
if(n==1)
return 1;
Queue<Integer> q= new LinkedList<>();
q.add(n);
Set<Integer> vis = new HashSet<>();
int steps=0;
while(!q.isEmpty()){
int size=q.size();
steps++;
while(size-- > 0){
int node=q.poll();
for(int i = 1; (i*i) <= node; i++){
int rem = node - ( i * i);
if( rem == 0)
return steps;
if(!vis.contains(rem)){
q.add(rem);
vis.add(rem);
}
}
}
}
return -1;
}
}

```

#### Mathematical solution (Most optimal time complexity)

The solution is based on Lagrange’s Four Square Theorem.
According to the theorem, there can be atmost 4 solutions to the problem, i.e. 1, 2, 3, 4

Case 1:

Ans = 1 => This can happen iff the number is a square number.
n = {a2 : a ∈ W}
Example : 1, 4, 9, etc.

Case 2:

Ans = 2 => This is possible if the number is the sum of 2 square numbers.

n = {a2 + b2 : a, b ∈ W}
Example : 2, 5, 18, etc.

Case 3:

Ans = 3 => This can happen if the number is not of the form 4k(8m + 7).

For more information on this : https://en.wikipedia.org/wiki/Legendre%27s_three-square_theorem

n = {a2 + b2 + c2 : a, b, c ∈ W} ⟷ n ≢ {4k(8m + 7) : k, m ∈ W }
Example : 6, 11, 12 etc.

Case 4:

Ans = 4 => This can happen if the number is of the form 4k(8m + 7).

n = {a2 + b2 + c2 + d2 : a, b, c, d ∈ W} ⟷ n ≡ {4k(8m + 7) : k, m ∈ W }
Example : 7, 15, 23 etc.

```

class Solution {

    static boolean isSquare(int n){
        int sqrtN=(int)Math.sqrt(n);
        return (sqrtN * sqrtN) == n;
    }
    public int numSquares(int n) {
        //case 1 is n is a square no then simply return 1
        if(isSquare(n))
            return 1;

        /* case 2 if n can be represented sum of 2 square no i.e if n - ( i * i) should be a square no any value of i starting from 1 to sqrt of n */
        for(int i = 1; i < (int) Math.sqrt(n); i++){
            if(isSquare(n - ( i * i)))
                return 2;
        }
        // case 4 if no is of the form 4a(8k+7)

        while(n%4==0){
            n>>=2;
        }
        if(n%8==7)
            return 4;
        //if not any of the above case then it is case 3
        return 3;
    }

}

```

### min stack problem

https://www.geeksforgeeks.org/design-a-stack-that-supports-getmin-in-o1-time-and-o1-extra-space/

## using extra space time complexity O(1) for all operation and space complexity O(n)

```

class MinStack {
Stack<Integer> actual;
Stack<Integer> aux;

    public MinStack() {
        this.actual=new Stack<>();
        this.aux=new Stack<>();
    }

    public void push(int val) {
        actual.push(val);
        if(aux.isEmpty())
            aux.push(val);
        else if(val<=aux.peek())
            aux.push(val);
    }

    public void pop() {
        int top = actual.pop();
        if(!aux.isEmpty() && top==aux.peek())
            aux.pop();
    }

    public int top() {
       return actual.peek();
    }

    public int getMin() {
        return aux.peek();
    }

}

```

#### without extra space TC O(1) SC(1)

this sol would not work if -2^31 <= val <= 2^31 - 1

```

class MinStack {
Stack<Integer> s;
int min;

    public MinStack() {
        this.s=new Stack<>();
    }

    public void push(int val) {
      if(s.isEmpty()){
        min=val;
        s.push(val);
      }
      else if(val<min){
          s.push(2 * val - min);
          min=val;
      }
      else
        s.push(val);
    }

    public void pop() {
     int top=s.pop();
     if(top < min)
         min= 2 * min - top;
    }

    public int top() {
       return s.peek();
    }

    public int getMin() {
        return min;
    }

}

```

#### using a stack of Nodes having both val and min for each node

```

class MinStack {
private Stack<Node> s;

    MinStack(){
        this.s=new Stack<Node>();
    }
    public void push(int x) {

      if(s.isEmpty()){
          s.push(new Node(x,x));
      }else if(x < s.peek().min){
          s.push(new Node(x,x));
      }else
          s.push(new Node(x,s.peek().min));
    }

    public void pop() {
        s.pop();
    }

    public int top() {
        return s.peek().val;
    }

    public int getMin() {
        return s.peek().min;
    }

    private class Node {
        int val;
        int min;

        private Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

}

```

#### using a linked list node only slight diff from above solution

this solution can be used to get max element also instead of min we will keep track max element

```

class MinStack {
private Node head;

    public void push(int x) {
        if (head == null)
            head = new Node(x, x, null);
        else
            head = new Node(x, Math.min(x, head.min), head);
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    private class Node {
        int val;
        int min;
        Node next;

        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

}

```

### valid paranthese

best sol TC O(n) SC O(n) 1ms beats 99% on leetcode

```

class Solution {
public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {

            if (c == '(') {
                stack.push(')');
            }
            else if () {
                stack.push(']');
            }
            else if (c == '{') {
                stack.push('}');
            }
            else if (stack.isEmpty() || c != stack.pop())){
                return false;
            }
        }
        return stack.isEmpty();
    }

}

```

#### my submission ok but not as good as above

```

class Solution {
Stack<Character> st= new Stack<>();
public boolean isValid(String s) {

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            switch(c){
                case '}':
                    if(checkValid('{')){
                        st.pop();
                        continue;
                    }
                    else
                        return false;

                case ']':
                    if(checkValid('[')){
                        st.pop();
                        continue;
                    }
                    else
                        return false;

                case ')':
                    if(checkValid('(')){
                        st.pop();
                        continue;
                    }
                    else
                        return false;
            }
           st.push(c);
        }
        return st.isEmpty();
    }

public boolean checkValid(char c) {
return (st.isEmpty() || !st.peek().equals(c)) ? false : true;
}

}

```

# binary search O(log(n)

there are 3 templates for binary search

## template 1

- Template 1 is used to search for an element or condition which can be determined by accessing a single index in the array check below link for more info (https://leetcode.com/explore/learn/card/binary-search/125/template-i/938/)

### iterative sol

```

class Solution {
public int search(int[] nums, int target) {
int beg = 0,end = nums.length - 1;

        while(beg <= end){
            int mid = beg + (end - beg)/2;
            if(nums[mid]== target)
                return mid;
            else if(nums[mid] < target){
                    beg=mid + 1;
            }else{
                    end=mid - 1;
            }
        }
        return -1;
    }

}

```

`int mid = (low + high)/2;`

But if we calculate the middle index like this means our code is not 100% correct, it contains bugs.
That is, it fails for larger values of int variables low and high. Specifically, it fails if the sum of low and high is greater than the maximum positive int value(231 – 1 )
The sum overflows to a negative value and the value stays negative when divided by 2.
In java, it throws ArrayIndexOutOfBoundException.
so always get middle like
`int mid = low + (high – low)/2;` i.e 3 + 5-3/2 = 4

### sqrure root of x using binary search

```

class Solution {
public int mySqrt(int x) {
if(x==0 || x==1)
return x;
int l=1, r=x/2;
int sqrtX=-1;

        while(l <= r){
           int mid = l + (r - l)/2;
            if(mid == x/mid)
                return mid;
            if(mid < x/mid){
                l = mid + 1;
                sqrtX = mid;
            }
            else
                r= mid - 1;
        }
        return sqrtX;
    }

}

```

### checkout below also

https://www.geeksforgeeks.org/find-square-root-number-upto-given-precision-using-binary-search/?ref=lbp

### here below part is extra to calculate the fractional part up to p point

```

// For computing the fractional part
// of square root upto given precision
double increment = 0.1;
for (int i = 0; i < precision; i++) {
while (ans \* ans <= number) {
ans += increment;
}

         // loop terminates when ans * ans > number
         ans = ans - increment;
         increment = increment / 10;
     }
     return (float)ans;

```

## search in a rotated sorted array

https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/

```

class Solution {
public int search(int[] nums, int target) {
return bSearch(nums,0,nums.length-1,target);

}
int bSearch(int[] nums,int l, int h, int target){
if(l > h)
return -1;
int mid = l + (h - l)/2;
if(nums[mid] == target)
return mid;
if(nums[l] <= nums[mid] ){
if(target >= nums[l] && target <= nums[mid] )
return bSearch(nums,l, mid-1,target);
return bSearch(nums,mid + 1, h, target);
}
if(target >= nums[mid] && target <= nums[h])
return bSearch(nums,mid+1,h,target);
return bSearch(nums,l,mid-1,target);
}
}

```

## template 2

- Template #2 is an advanced form of Binary Search. It is used to search for an element or condition which requires accessing the current index and its immediate right neighbor's index in the array.
- (https://leetcode.com/explore/learn/card/binary-search/126/template-ii/937/)

- An advanced way to implement Binary Search.
- Search Condition needs to access the element's immediate right neighbor
- Use the element's right neighbor to determine if the condition is met and decide whether to go left or right
- Guarantees Search Space is at least 2 in size at each step
- Post-processing required. Loop/Recursion ends when you have 1 element left. Need to assess if the remaining element meets the condition.

```
Initial Condition: left = 0,
right = length
Termination: left == right
Searching Left: right = mid
Searching Right: left = mid+1
```

### first bad version problem

- https://leetcode.com/explore/learn/card/binary-search/126/template-ii/947/
- my sol as per the template 2 correct but not optimal

```
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 0, right = n;
        while(left < right){
            int mid = left + (right - left)/2;
            if(!isBadVersion(mid) && isBadVersion(mid + 1))
                return mid + 1;
            else if(isBadVersion(mid))
                right = mid;
            else
                left = mid + 1;
        }
     return -1;
    }
}
```

#### iterative

- discuss better sol in TC
- The only scenario left is where isBadVersion(mid) \Rightarrow true isBadVersion(mid)⇒true. This tells us that mid may or may not be the first bad version, but we can tell for sure that all versions after midmid can be discarded. Therefore we set right = midright=mid as the new search space of interval [left,mid][left,mid] (inclusive).

```
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while(left < right){
            int mid = left + (right - left)/2;
            if(isBadVersion(mid)){
                right = mid;
            }else
                left = mid + 1;
        }
     return left;
    }
}
```

#### recursive

TC O(log(n)) SC O(log(n)) for call stack
at each step search space is reduced to half and call stack also redcued to half

```
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
     return recSearch(1,n);
    }
    int recSearch(int l, int r){
       if(l == r)
           return l;
       int mid = l +  (r - l)/2;
        if(isBadVersion(mid))
           return recSearch(l , mid);
        else
           return recSearch(mid + 1, r);
    }
}
```

### find peak element

- https://leetcode.com/explore/learn/card/binary-search/126/template-ii/948/

```
class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while(l < r){
            int mid = l + (r - l)/2;
            if(nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}
```

- lc sol https://leetcode.com/problems/find-peak-element/solution/

### Find Minimum in Rotated Sorted Array

#### recursive approach find pivot next element of pivot is min element in array

```
class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        if(r == 0)
            return nums[l];
        int pivot = findPivot(nums, l, r);
        if(pivot == nums.length - 1)
            return nums[0];
        return nums[pivot + 1];
        }
    //recrusive find of pivot
    // try iterative find of pivot also
    int findPivot(int[] nums,int l ,int r){
        if(r < l)
            return -1;
        if(l == r)
            return l;
        int mid = l + (r - l)/2;
        if(mid < r && nums[mid] > nums[mid + 1])
            return mid;
        else if(mid > l && nums[mid] < nums[mid - 1])
            return mid - 1;
        else if(nums[l] < nums[mid])
            return findPivot(nums,mid + 1, r);
        else
            return findPivot(nums, l, mid -1);
    }
}
```

#### iterative approach

- https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/solution/

- if first element is less than last then return first element as there are effectively no rotations, if mid element is less than right element then left half inclusive of mid has min else right half

```
class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        if(nums[l] < nums[r])
            return nums[l];

        while(l < r){
            int mid = l + (r - l)/2;
            if(nums[mid] < nums[r])
                r = mid;
            else
                l = mid + 1;
        }
        return nums[l];
    }
}
```

## template 3

- https://leetcode.com/explore/learn/card/binary-search/135/template-iii/936/
- Search Condition needs to access element's immediate left and right neighbors
- Use element's neighbors to determine if condition is met and decide whether to go left or right
- Gurantees Search Space is at least 3 in size at each step
- Post-processing required. Loop/Recursion ends when you have 2 elements left. Need to assess if the remaining elements meet the condition.

### Search for a Range

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

#### gfg sol

- https://www.geeksforgeeks.org/find-first-and-last-positions-of-an-element-in-a-sorted-array/
- the solution is to use 2 binary searches one for finding first index of matching element and other one for finding the last index of element
  in the code further improvements are done by checking the value of first index if it is -1 then it means element is not in array so simply return [-1,-1] also pass the found first index as lower bound for second binary search

```
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int[] res = {-1, -1};

        if(nums.length == 0 )
            return res;

        // find starting postion
        while( l <= r){
            int mid = l + (r - l)/2;
            if(nums[mid] == target){
                res[0] = mid;
                r = mid - 1;
            }
            else if(nums[mid] < target)
                l= mid + 1;
            else
                r= mid - 1;
        }
        if(res[0] == -1){
            res[1] = -1;
            return res;
        }

        // find last position
        l = res[0]; r = nums.length - 1;
        while(l <= r){
            int mid = l + (r - l)/2;
             if(nums[mid] == target){
                res[1] = mid;
                l = mid + 1;
            }
            else if(nums[mid] < target)
                l= mid + 1;
            else
                r= mid - 1;
        }
        return res;


    }
}
```

- https://leetcode.com/explore/learn/card/binary-search/135/template-iii/944/discuss/2039143/clean-and-easy-to-understand-Binary-search-iterative-with-improvements-or-0-ms-beats-100

#### sol with template 3 instructions

```
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int[] res = {-1, -1};

        if(nums.length == 0 )
            return res;

        // find starting postion
        while( l + 1 < r){
            int mid = l + (r - l)/2;
            if(nums[mid] == target){
                //res[0] = mid;
                r = mid;
            }
            else if(nums[mid] < target)
                l = mid;
            else
                r = mid;
        }
        if(nums[l] == target)
            res[0] = l;
        else if(nums[r] == target)
            res[0] = r;
        else{
            res[0] = res[1] = -1;
            return res;
        }

        // find last position
        l = res[0]; r = nums.length - 1;
        while(l + 1 < r){
            int mid = l + (r - l)/2;
             if(nums[mid] == target){
                l = mid;
            }
            else if(nums[mid] < target)
                l = mid;
            else
                r = mid;
        }

        if(nums[r] == target)
            res[1] = r;
        else if(nums[l] == target)
            res[1] = l;
        else
            res[1] = -1;

        return res;


    }
}
```

#### sol with single binary search (Easy and clean)

here once we find the target element with normal binary search, we use while loops to get first and last index of the target element

```
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        Arrays.fill(res, -1);
        if (nums == null || nums.length == 0) return res;
        int left = 0, right = nums.length;
        while(left < right) {
            int mid = left + (right-left) / 2;
            if (nums[mid] == target) {
                int temp = mid;
                while(mid >= left && nums[mid] == target) mid--;
                res[0] = mid+1;
                mid = temp;
                while(mid < right && nums[mid] == target) mid++;
                res[1] = mid-1;
                return res;
            } else if (target < nums[mid]) {
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return res;
    }
}
```

### implement pow(x,n)

https://leetcode.com/explore/learn/card/binary-search/137/conclusion/982/discuss/19544/5-different-choices-when-talk-with-interviewers

```
 class Solution {
    public double myPow(double x, int n) {

        if(n == 0)
            return 1;

        if( x == 0.0)
            return 0;

        double temp = myPow(x, n/2);
        if(n % 2 == 0)
            return temp * temp;
        else if( n > 0)
                return x * temp * temp;
        else
            return (temp * temp)/x;

    }
}
```

### Find Smallest Letter Greater Than Target

https://leetcode.com/explore/learn/card/binary-search/137/conclusion/977/

```
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0, r = letters.length;
        while( l < r){
            int mid = l + (r - l)/2;
            if(letters[mid] <= target)
                l = mid + 1;
            else
                r = mid;
        }
        return letters[l % letters.length];
    }
}
```

### Find Minimum in Rotated Sorted Array with duplicates

https://leetcode.com/explore/learn/card/binary-search/144/more-practices/1031/

#### iterative approach

```
class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        if(nums[l] < nums[r])
            return nums[l];

     while(l < r){
         int mid = l + (r - l)/2;
         if(nums[mid] > nums[r])
             l = mid + 1;
         else if(nums[mid] < nums[r])
             r = mid;
         else
             r--;
     }
    return nums[l];
    }
}
```

#### recursive approach

```
class Solution {
    public int findMin(int[] num) {
       return findMin(num, 0, num.length-1);
    }
    public int findMin(int[] num, int left, int right){
    //base case arr length is 1
    if(right==left){
        return num[left];
    }
    // base case arr length is 2
    if(right == left + 1){
        return Math.min(num[left], num[right]);
    }
    // 3 3 1 3 3 3

    int middle = (right-left)/2 + left;
    // already sorted
    if(num[right] > num[left]){
        return num[left];
    //right shift one
    }else if(num[right] == num[left]){
        return findMin(num, left+1, right);
    //go right
    }else if(num[middle] >= num[left]){
        return findMin(num, middle, right);
    //go left
    }else{
        return findMin(num, left, middle);
    }
    }
}
```

# Arrays & String

- Dynamic arrays are called arraylist in java and vector in c++
- arrays are contigious memory locations that is how random access is possible using index postion
- Arrays are sorted using Arrays.sort() and arraylist can be sorted using Collections.sort()
- TODO check which algo quicksort or mergesort is used by Collections.sort or Arrays.sort in java

## find pivot index

```
class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }
}

```

## largest no atleast twice the size of every other no

### simple sol using two passes

- first get the max element index in one loop
- then another loop to check every other element should be less than nums[max]/2
- don't forget to skip max element itself in second loop

```
class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length == 1)
            return 0;
        int max=0;
        for(int i = 1;i < nums.length; i++){
            if(nums[max] < nums[i])
                max = i;
        }
        for(int i = 0; i< nums.length; i++){
            if(i !=max && nums[i] * 2 > nums[max])
                return -1;
        }
        return max;
    }
}
```

### using only single pass optimized

- approach is to calcular largest and second largest in the array
- then the prob simply reduces to check the second largest in the end
- sol also handles negative values and overflow errors

```
class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = Integer.MIN_VALUE, sLargest = Integer.MIN_VALUE, largest = Integer.MIN_VALUE;

        for(int i = 0;i < nums.length; i++){
            if(largest < nums[i]){
                sLargest = largest;
                largest = nums[i];
                maxIndex = i;
            }else if(sLargest < nums[i]){
                sLargest = nums[i];
            }
        }

        return nums[maxIndex]/2 >= sLargest ? maxIndex : -1 ;
    }
}
```

## plus one

https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1148
worst case(all 9's in array) time complexity is O(n)

```
class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int r = len - 1;

        while(r >= 0)
        {   if(digits[r] < 9){
                digits[r]++;
                return digits;
            }
            digits[r] = 0;
            r--;
        }

        int[] res= new int[len + 1];
        res[0] = 1;
        return res;
    }
}
```

## spiral traverse of matrix

https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1168
https://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/

- his is a very simple and easy to understand solution. I traverse right and increment rowBegin, then traverse down and decrement colEnd, then I traverse left and decrement rowEnd, and finally I traverse up and increment colBegin.

- The only tricky part is that when I traverse left or up I have to check whether the row or col still exists to prevent duplicates

```
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length, col= matrix[0].length, i;
        List<Integer> res = new ArrayList<>();
        int left = 0, right = col - 1, up = 0, down = row - 1;

        while(left <= right && up <= down){
            for( i = left; i <= right ; i++)
                res.add(matrix[up][i]);
            up++;
            for( i = up; i <= down; i++)
                res.add(matrix[i][right]);
            right--;
            //check if row exits since up++ happended;
            if(up < down){
            for( i = right; i >= left; i--)
                res.add(matrix[down][i]);
            down--;
            }
            //check if column exits since r-- happened
            if(left < right){
            for( i = down; i >= up; i--)
                res.add(matrix[i][left]);
            left++;
            }
        }
        return res;
    }
}
```

## pascal triange

- https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1170

- https://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/

```
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner= new ArrayList<>();
        inner.add(1);
        outer.add(inner);


        for(int i = 1; i < numRows; i++)
        {   List<Integer> temp = new ArrayList<>();
            List<Integer> prev = outer.get(i - 1);
            for(int j = 0; j <= i; j++){
                int sum = (j == 0 ) ? prev.get(j) : j == prev.size() ? prev.get(j - 1) : prev.get(j) + prev.get(j - 1);
                temp.add(sum);
                }
         outer.add(temp);

        }
      return outer;
    }
}
```

## Add Binary

https://leetcode.com/explore/learn/card/array-and-string/203/introduction-to-string/1160/

```
class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1 , j = b.length() - 1, sum = 0;
        StringBuilder sb = new StringBuilder();

        while(i >= 0 || j >= 0){
            sum =  sum / 2;  ;
            sum += i >= 0 ? a.charAt(i--) - '0' : 0;
            sum += j >= 0 ? b.charAt(j--) - '0' : 0;
            sb.insert(0,sum % 2 == 0 ? 0 : 1);
        }
        if(sum/2 != 0)
            sb.insert(0,1);
        return sb.toString();
    }
}
```

## Implement strStr()

https://leetcode.com/explore/learn/card/array-and-string/203/introduction-to-string/1161

https://www.geeksforgeeks.org/check-string-substring-another/

### sliding window my sol with TC O(m \* (m - n)) SC O(n)

```
class Solution {
    public int strStr(String haystack, String needle) {
        int subLen = needle.length(), strLen = haystack.length();

        if(subLen == 0)
            return 0;
        if(subLen > strLen)
            return -1;

        int str = 0, end = 0;
        StringBuilder subStrBuilder = new StringBuilder();
        subStrBuilder.append(needle);
        StringBuilder sb = new StringBuilder();
        while(end < strLen){
            sb.append(haystack.charAt(end));
            if(end - str + 1 < subLen)
               end++;
            else if(end - str + 1 == subLen){
               if(sb.compareTo(subStrBuilder) == 0)
                   return str;
               sb.deleteCharAt(0);
               str++;
               end++;
            }
        }
        return -1;
    }
}
```

### normal TC O(m \* n) SC O(1)

```
public int strStr(String haystack, String needle) {
  for (int i = 0; ; i++) {
    for (int j = 0; ; j++) {
      if (j == needle.length()) return i;
      if (i + j == haystack.length()) return -1;
      if (needle.charAt(j) != haystack.charAt(i + j)) break;
    }
  }
}
```

## to check KMP optimze sol

## longest common prefix

```
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i = 1;i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length() - 1);
            if((prefix.isEmpty())
                break;
        }
        return prefix;
    }
}
```

## 2-pointer technique

### Array Partition

### two sum II

- https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1153/

#### O(n) sol using two pointers

```
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int str = 0, end = numbers.length - 1;

        while(str < end){
            int sum = numbers[str] + numbers[end];
            if( sum == target)
                return new int[]{str + 1 , end + 1};
            else if(sum < target)
                str++;
            else
                end--;
        }
        return new int[]{-1 , -1};
    }
}
```

#### O(n log n) sol using binary search

TC is O(n/2 log n) to be exact

you are doing binary search O(log n) operation at max n/2 times since you are moving pointer i,j at each step

```
class Solution {
    private int binarySearch(int arr[] , int t , int l , int h ){
        while(l<h){
            int mid  = (l+h)/2;
            if(arr[mid]>t){
                h = mid;
            }else if(arr[mid]<t){
                l = mid+1;
            }else if(arr[mid]==t){
                return mid;

            }
        }
        return l;
    }
    public int[] twoSum(int[] nums, int target) {
      int i =0;
    int j = nums.length-1;
       while(i<j){
          if(nums[i]+nums[j]==target){
              return new int[]{i+1 , j+1};
          } else if(nums[i]+nums[j]>target){
              j = binarySearch(nums,target -(int)nums[i]  , i+1 , j-1);
          }else{
               i= binarySearch(nums,target  -(int)nums[j]  , i+1 , j-1);
          }
       }
       return new int[]{-1 , -1};

        }


    }
```

### Minimum Size Subarray Sum (revise)

- https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1299/

#### using 2 pointer/ sliding window O(log(n))

- https://www.youtube.com/watch?v=K0NgGYEAkA4
- this sol actually uses sliding window via 2 pointers

```
	class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int str = 0, end = 0, sum = 0, minlen = Integer.MAX_VALUE;
        for(;end < nums.length; end++){
            sum += nums[end];
            while(sum >= target){
                minlen = Math.min(minlen, end - str + 1);
                sum -= nums[str++];
            }
        }
        return minlen == Integer.MAX_VALUE ? 0 : minlen;
    }
}
```

#### sol using outer loop and binary search TC O(n log n) TODO

### min window substring TODO

- https://leetcode.com/problems/minimum-window-substring/discuss/26808/Here-is-a-10-line-template-that-can-solve-most-'substring'-problems

## rotate array TC O(n) in place SC O(1)

- algo is to divide the array in half using k i.e 0, n-k-1 and n-k, n
- then reverse each half
- then reverse the whole array

```
class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if(k % len == 0)
            return;
        k = k % len;
        reverse(nums,0, len - k - 1);
        reverse(nums, len - k, len - 1);
        reverse(nums, 0, len - 1);
    }

    void reverse(int[] nums, int s, int e){
        while(s < e){
            int temp = nums[s];
            nums[s++] = nums[e];
            nums[e--] = temp;
        }
    }
}
```
