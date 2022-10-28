- [youtube channel to checkout for leetcode prob](#youtube-channel-to-checkout-for-leetcode-prob)
- [IMP DataStructure to know for writing programs during interviews](#imp-datastructure-to-know-for-writing-programs-during-interviews)
  - [ArrayDeque](#arraydeque)
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
    - [sqaure root of x using binary search](#sqaure-root-of-x-using-binary-search)
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
  - [pascal triange II](#pascal-triange-ii)
    - [iterative sol](#iterative-sol-1)
    - [recursive sol (TLE but with memoization it is ok)](#recursive-sol-tle-but-with-memoization-it-is-ok)
  - [Add Binary](#add-binary)
  - [Implement strStr()](#implement-strstr)
    - [sliding window my sol with TC O(m \* (m - n)) SC O(n)](#sliding-window-my-sol-with-tc-om--m---n-sc-on)
    - [normal TC O(m \* n) SC O(1)](#normal-tc-om--n-sc-o1)
  - [to check KMP optimze sol TC O(m + n) SC O(n)](#to-check-kmp-optimze-sol-tc-om--n-sc-on)
  - [longest common prefix](#longest-common-prefix)
  - [2-pointer technique](#2-pointer-technique)
    - [Array Partition](#array-partition)
    - [two sum II (sorted array)](#two-sum-ii-sorted-array)
      - [O(n) sol using two pointers](#on-sol-using-two-pointers)
      - [O(n log n) sol using binary search](#on-log-n-sol-using-binary-search)
    - [Minimum Size Subarray Sum (revise)](#minimum-size-subarray-sum-revise)
      - [using 2 pointer/ sliding window O(log(n))](#using-2-pointer-sliding-window-ologn)
      - [sol using outer loop and binary search TC O(n log n) TODO](#sol-using-outer-loop-and-binary-search-tc-on-log-n-todo)
    - [min window substring TODO](#min-window-substring-todo)
  - [rotate array TC O(n) in place SC O(1)](#rotate-array-tc-on-in-place-sc-o1)
    - [reverse words in a string REVISIT](#reverse-words-in-a-string-revisit)
      - [using stack](#using-stack)
      - [two pointer revers algo | in place](#two-pointer-revers-algo--in-place)
    - [move zeros](#move-zeros)
      - [simple approach O(n) inplace](#simple-approach-on-inplace)
      - [2 pointer optimized O(n) inplace](#2-pointer-optimized-on-inplace)
- [hash tables](#hash-tables)
  - [design hashset](#design-hashset)
    - [arraylist implementation](#arraylist-implementation)
    - [BST implementation](#bst-implementation)
  - [hashmap implementation](#hashmap-implementation)
    - [using linked list](#using-linked-list)
  - [single number prob](#single-number-prob)
  - [intersection of 2 arrays](#intersection-of-2-arrays)
    - [using hash set TC O(m + n) SC(m + n)](#using-hash-set-tc-om--n-scm--n)
    - [using sorting and 2 pointer TC O(n logn)](#using-sorting-and-2-pointer-tc-on-logn)
    - [using sorting and binary search Time complexity: O(nlogn)](#using-sorting-and-binary-search-time-complexity-onlogn)
  - [happy number problem](#happy-number-problem)
    - [loop detection using hashset TC log(n) SC log(n)](#loop-detection-using-hashset-tc-logn-sc-logn)
    - [using floyd's loop detection algo TC log(n) SC O(1) better approach than hashset](#using-floyds-loop-detection-algo-tc-logn-sc-o1-better-approach-than-hashset)
    - [math sol](#math-sol)
  - [two sum (non sorted) return indices](#two-sum-non-sorted-return-indices)
    - [using extra space hashmap TC O(n) SC O(n)](#using-extra-space-hashmap-tc-on-sc-on)
    - [using sorting and 2 pointer technique TC n logn SC is n( 3n to be exact)](#using-sorting-and-2-pointer-technique-tc-n-logn-sc-is-n-3n-to-be-exact)
  - [isomorphic sol](#isomorphic-sol)
    - [using 2 array trick from discuss](#using-2-array-trick-from-discuss)
    - [sol using 2 hashmap approach is similar but not very readable](#sol-using-2-hashmap-approach-is-similar-but-not-very-readable)
    - [transformation trick](#transformation-trick)
    - [using a single map](#using-a-single-map)
  - [minimum index sum of two lists](#minimum-index-sum-of-two-lists)
    - [using a hashmap](#using-a-hashmap)
  - [first unique character in string](#first-unique-character-in-string)
    - [single pass sol using array of size 26 lower case alphabets (better approach since only one loop)](#single-pass-sol-using-array-of-size-26-lower-case-alphabets-better-approach-since-only-one-loop)
    - [using hashmap with 2 pass](#using-hashmap-with-2-pass)
  - [intersection of 2 arrays II](#intersection-of-2-arrays-ii)
    - [using hashmap TC O(M + N) SC O(M)](#using-hashmap-tc-om--n-sc-om)
    - [using sorting and 2 pointer technique](#using-sorting-and-2-pointer-technique)
  - [contains Duplicate II](#contains-duplicate-ii)
    - [using hashmap](#using-hashmap)
    - [using hashset](#using-hashset)
  - [group anagrams](#group-anagrams)
    - [using sorting key](#using-sorting-key)
    - [from discus](#from-discus)
  - [valid Sudoku](#valid-sudoku)
    - [using hashset/hashmap approach and using %, / for block traversal in matrix (5ms leetcode)](#using-hashsethashmap-approach-and-using---for-block-traversal-in-matrix-5ms-leetcode)
      - [logic explanation](#logic-explanation)
      - [only we used boolean array here instead of hashset to improve space complexity 3ms on leetcode](#only-we-used-boolean-array-here-instead-of-hashset-to-improve-space-complexity-3ms-on-leetcode)
    - [sol using choice of key in hashmap](#sol-using-choice-of-key-in-hashmap)
    - [GFG clean sol using the same approach](#gfg-clean-sol-using-the-same-approach)
- [tree](#tree)
  - [Binary Tree](#binary-tree)
    - [isSymmetric tree prob](#issymmetric-tree-prob)
      - [bottom up recursive sol](#bottom-up-recursive-sol)
      - [iterative solution](#iterative-solution)
  - [is Valid BST](#is-valid-bst)
    - [intuitive sol with upper and lower limits](#intuitive-sol-with-upper-and-lower-limits)
    - [inorder traversal sol](#inorder-traversal-sol)
      - [recursive sol](#recursive-sol)
      - [iterative sol IMP REVISIT](#iterative-sol-imp-revisit)
    - [inorder successor/predecessor in BST](#inorder-successorpredecessor-in-bst)
      - [successor using intution method 1](#successor-using-intution-method-1)
      - [predecessor using intution method 1](#predecessor-using-intution-method-1)
      - [successor using inorder traversa](#successor-using-inorder-traversa)
      - [predecessor of a node in BST using inorder traversal](#predecessor-of-a-node-in-bst-using-inorder-traversal)
    - [BSTIterator inorder](#bstiterator-inorder)
      - [using stack](#using-stack-1)
    - [search in BST iterative and recursive](#search-in-bst-iterative-and-recursive)
      - [iterative](#iterative-1)
      - [recursive](#recursive-1)
    - [deletion in BST](#deletion-in-bst)
    - [kth largest element in a stream](#kth-largest-element-in-a-stream)
    - [kth smallest element in a stream](#kth-smallest-element-in-a-stream)
    - [kth smallest/largest element in a BST](#kth-smallestlargest-element-in-a-bst)
    - [find median of integer stream (TODO)](#find-median-of-integer-stream-todo)
    - [inorder/preorder using morris traversal(TODO)](#inorderpreorder-using-morris-traversaltodo)
    - [Lowest Common Ancestor of a Binary Search Tree](#lowest-common-ancestor-of-a-binary-search-tree)
      - [using recursion](#using-recursion)
      - [iterative sol](#iterative-sol-2)
    - [contains duplicate III](#contains-duplicate-iii)
    - [is binary tree balanced](#is-binary-tree-balanced)
      - [non optimal sol TC O(n^2)](#non-optimal-sol-tc-on2)
      - [optimal sol TC O(n) SC O(n)](#optimal-sol-tc-on-sc-on)
    - [convert sorten int array to BST TC O(n) SC(n) for recursion](#convert-sorten-int-array-to-bst-tc-on-scn-for-recursion)
  - [n-ary tree](#n-ary-tree)
    - [preorder traversal of 3-ary tree](#preorder-traversal-of-3-ary-tree)
      - [recursive sol TC O(n) [SC (n) to check]](#recursive-sol-tc-on-sc-n-to-check)
      - [iterative sol TC O(n) SC(n)](#iterative-sol-tc-on-scn)
    - [postoreder traversal of n-ary tree](#postoreder-traversal-of-n-ary-tree)
      - [recursive sol](#recursive-sol-1)
      - [iterative sol TC o(n) SC(n)](#iterative-sol-tc-on-scn-1)
    - [level order traversal of n-ary tree](#level-order-traversal-of-n-ary-tree)
    - [Maximum Depth of N-ary Tree](#maximum-depth-of-n-ary-tree)
      - [bottom up recursive sol](#bottom-up-recursive-sol-1)
      - [top down recursive sol](#top-down-recursive-sol)
      - [iterative sol](#iterative-sol-3)
  - [trie](#trie)
    - [application of trie](#application-of-trie)
    - [comparison with balanced tree and hashmap (very IMP)](#comparison-with-balanced-tree-and-hashmap-very-imp)
    - [Add and Search Word - Data structure design (IMP)](#add-and-search-word---data-structure-design-imp)
    - [LC 667 map sum pairs](#lc-667-map-sum-pairs)
      - [brute force](#brute-force)
      - [trie solution(optimal)](#trie-solutionoptimal)
    - [replace words](#replace-words)
    - [TODO design search autocomplete system (IMP) Hard](#todo-design-search-autocomplete-system-imp-hard)
    - [word search ||](#word-search-)
      - [using DFS (though correct but not optimal Time limit exceeds)](#using-dfs-though-correct-but-not-optimal-time-limit-exceeds)
    - [Maximum XOR of Two Numbers in an Array](#maximum-xor-of-two-numbers-in-an-array)
      - [brtute force is O(n^2) with 2 loops](#brtute-force-is-on2-with-2-loops)
      - [using trie](#using-trie)
- [sliding window](#sliding-window)
  - [Longest Substring with K Distinct Characters](#longest-substring-with-k-distinct-characters)
    - [SOL : trick is to use hashmap with char and their freq to keep k unique char and keep expanding and shrinking window till map is size is k exactly](#sol--trick-is-to-use-hashmap-with-char-and-their-freq-to-keep-k-unique-char-and-keep-expanding-and-shrinking-window-till-map-is-size-is-k-exactly)
- [sorting](#sorting)
  - [merge sort TC O(nlogn) SC(n)](#merge-sort-tc-onlogn-scn)
    - [Applications of Merge Sort:](#applications-of-merge-sort)
  - [quick sort](#quick-sort)
    - [using end index as the pivot](#using-end-index-as-the-pivot)
      - [Time taken by QuickSort, in general, can be written as following.](#time-taken-by-quicksort-in-general-can-be-written-as-following)
    - [if we use middle element as pivot then partition algo is bit different](#if-we-use-middle-element-as-pivot-then-partition-algo-is-bit-different)
    - [QuickSort Tail Call Optimization (Reducing worst case space to Log n )](#quicksort-tail-call-optimization-reducing-worst-case-space-to-log-n-)
  - [quick sort vs merge sort](#quick-sort-vs-merge-sort)
  - [importance of stability of sorting](#importance-of-stability-of-sorting)
  - [heap sort (TODO)](#heap-sort-todo)
- [my calendar II](#my-calendar-ii)
    - [Inuition Algo brute force sol TC O(n^2) SC O(n)](#inuition-algo-brute-force-sol-tc-on2-sc-on)
    - [boundary Count Intuition Algo](#boundary-count-intuition-algo)
      - [TC n\* (4logn + n) = O(n^2) SC O(n)](#tc-n-4logn--n--on2-sc-on)
- [bitwise operator](#bitwise-operator)
- [recursion](#recursion)
  - [time complexity calculation with recursion and memoization](#time-complexity-calculation-with-recursion-and-memoization)
  - [tail recursion](#tail-recursion)
  - [search in a 2 d matrix](#search-in-a-2-d-matrix)
  - [backtracking and pruning](#backtracking-and-pruning)
    - [N queen problem](#n-queen-problem)
      - [Explanation](#explanation)
    - [leetcode 489 : robot room cleaner](#leetcode-489--robot-room-cleaner)
    - [sudoku solver](#sudoku-solver)
    - [combinations](#combinations)
    - [22. Generate Parentheses](#22-generate-parentheses)
    - [largest area in histogram](#largest-area-in-histogram)
    - [permutations](#permutations)
      - [using boolean array to improve TC(easy to understand & explain)](#using-boolean-array-to-improve-tceasy-to-understand--explain)
    - [Letter Combinations of a Phone Number](#letter-combinations-of-a-phone-number)
    - [The Skyline Problem](#the-skyline-problem)
      - [improvements by using treemap](#improvements-by-using-treemap)
- [patterns](#patterns)
  - [2 pointer](#2-pointer)
    - [2 sum BST (daily challange)](#2-sum-bst-daily-challange)
      - [using inorder traversal of BST and 2 pointer](#using-inorder-traversal-of-bst-and-2-pointer)
      - [optimization here we traverse the BST 2 times so TC O(2n) however we can use BST property to do this in single traversal](#optimization-here-we-traverse-the-bst-2-times-so-tc-o2n-however-we-can-use-bst-property-to-do-this-in-single-traversal)
- [graph](#graph)
  - [BSF traversal](#bsf-traversal)
  - [DFS traversal](#dfs-traversal)
  - [no of provices prob](#no-of-provices-prob)
    - [sol by converting adjacency matrix to list first](#sol-by-converting-adjacency-matrix-to-list-first)
    - [sol with adjacency matrix](#sol-with-adjacency-matrix)
  - [flood fill](#flood-fill)

goal of these notes is to identify patterns and then map it to problems
keep revisting these problems and algo's to keep it fresh in the memory until you no longer needs to revisit again

# youtube channel to checkout for leetcode prob

- tech dose (https://www.youtube.com/watch?v=K0NgGYEAkA4)
- takeuforward by raj vikrmaditya
- neetcode
- tushar roy

# IMP DataStructure to know for writing programs during interviews

## ArrayDeque

- Array Double Ended Queue or Array Deck
- The ArrayDeque in Java provides a way to apply resizable-array in addition to the implementation of the Deque interface.
- Array deques have no capacity restrictions and they grow as necessary to support usage.
  They are not thread-safe
- ArrayDeque class is likely to be faster than Stack when used as a stack and faster than LinkedList when used as a queue
- null elements not allowed
- https://docs.oracle.com/javase/7/docs/api/java/util/Deque.html

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
    // 3.another way is to use recursion with 2 pointers left and right, trick is point left to head in recursive method so that when we reach last node we have access to first node and comparsion can be done

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

### template 2

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

## first read about graph and connect component of a graph

A connected component of an undirected graph is a subgraph in which every two vertices are connected to each other by a path(s), and which is connected to no other vertices outside the subgraph.

### return no of island (a variable of connected component problem)

#### using BFS

if m = n then
Time complexity O(n^2) for main for loops and for worst case all 1's BFS traversal will be O(n^2) then for checking 8 neighbors of each node in BFS 8 so total TC = O(n^2) + O(n^2) \* 8
space complexity O(n^2) for extra visited flag 2d array + O(n^2) for queue worst case where whole matrix is an island with all 1's

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

- all 8 neighbor nodes in matrix could be taken as below and then using a for loop of 1 to 8 for r + rDir[i] and c + cDir

```
            // int[] rDir = {-1, 1, 0, 0, -1, 1, -1, 1};
            // int[] cDir = {0, 0, -1, 1, -1, 1, 1, -1};
```

- or it can be taken as

```
                for(int i = -1; i <= 1; i++){
                    for(int j = -1; j <= 1; j++){
                        int nrow = pair.row + i;
                        int ncol = pair.col + j;
                    }
                }
```

#### using DFS (flood filling technique)

in this method instead of taking extra visited flag array to keep track of visited node we flood the nodes i.e visited cell

```

class Solution {
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
}
```

### open the lock (imp problem) (REVISE)

#### using BFS and single queue time complexity around 300 ms

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

- it is difficult to see this problem as graph traversal prob but if you look carefully then this problem breaks down in to graph rooted at the number itself, now this root can sqrt(n) choices/branches to follow and then the remainder (r = n - (i\*i)) of each choice becomes a node itself which again will have sqrt(r) choices and so on
  now we can use BFS with queue to solve this prob

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

### sqaure root of x using binary search

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
trick to solve such prob is to draw a 2d line graph with index and no now you will see line going upwards and then downwards at pivot and then upwards again

now based on this graph you can deduce your binary search conditions

- first check if mid element itself is the target if return it
- then check if low till mid elements are sorted in array if so then further check if target lies inside the bound of low and mid of array is so then Binary search for low ,mid-1 else targets lies outside bounds and search for right half
- now if low till mid is not sorted then that means in between we have a pivot but mid to high will be sorted so check if element is inside the bounds of mid to high if so element is in right half else left half

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
- The only scenario left is where isBadVersion(mid) -> true isBadVersion(mid)⇒true. This tells us that mid may or may not be the first bad version, but we can tell for sure that all versions after midmid can be discarded. Therefore we set right = midright=mid as the new search space of interval [left,mid][left,mid] (inclusive).

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
                while(mid >= left && nums[mid] == target)   mid--;
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

sol with new test cases added of leetcode (2.00000, Integer.MIN) and (-1.00000, Integer.MIN)

```
class Solution {
    public double myPow(double x, int n) {
       if(n == Integer.MIN_VALUE)
                n += 2;
        if(n > 0)
            return helper(x, n);
        else
            return 1/helper(x, -n);

    }

    double helper(double x, int n){
         if(n == 0)
            return 1;
        return (n % 2 == 0) ? myPow(x*x, n/2) : x * myPow(x*x, n/2);
    }
}

for those struggling to understand the overflow case why we need to add n += 2 in case Integer.MIN_VALUE

Integer.MIN_VALUE = - Integer.MIN_VALUE due to overflow i.e min -> -2^31 max 2^31 - 1 so -min = 2^31 which overflows resulting in min
second if you add only +1 then it changes from even to odd case so another case will fail (-1.00000 , min)
so adding +2 saves us from overflow
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

## pascal triange II

- using pattern O(rowindex) exta space TC O(n^2)
- https://leetcode.com/explore/learn/card/array-and-string/204/conclusion/1171/

### iterative sol

```
public List<Integer> getRow(int rowIndex) {
      Integer[] result =  new Integer[rowIndex + 1];
      Arrays.fill(result, 0);
      result[0] = 1;
      for(int i = 1; i < rowIndex + 1; i++)
        for(int j = i; j >= 1; j--)
          result[j] += result[j - 1];
      return Arrays.asList(result);
    }
```

### recursive sol (TLE but with memoization it is ok)

```
class Solution {
    public List<Integer> getRow(int rowIndex) {
        var res = new ArrayList<Integer>();
        for(int j = 0; j <= rowIndex; j++)
           res.add(pascal(rowIndex, j));
     return res;
    }

    int pascal(int i, int j){
        if(i == j || j == 0)
            return 1;
        return pascal(i - 1, j - 1) + pascal(i - 1, j);
    }
}
```

above sol is not good since duplicate calculations are done recursively to avoid that use memoization and with TLE is avoided

```
class Solution {
    Map<String,Integer> cache = new HashMap<>();

    public List<Integer> getRow(int rowIndex) {
        var res = new ArrayList<Integer>();
        for(int j = 0; j <= rowIndex; j++)
           res.add(pascal(rowIndex, j));
        return res;
    }

    int pascal(int i, int j){
        if(i == j || j == 0)
            return 1;
        String key = Integer.toString(i) + Integer.toString(j);
        if(cache.containsKey(key))
            return cache.get(key);
        int res = pascal(i - 1, j - 1) + pascal(i - 1, j);
        cache.put(key,res);
        return res;
    }
}
```

```
- using binomial coefficient
- TC O(n) O(rowIndex) extra space
class Solution {
    public List<Integer> getRow(int n) {
        List<Integer> list = new LinkedList<>();
        long nCk = 1;
        for (int k = 0; k <= n; k++) {
            list.add((int) nCk);
            nCk = nCk * (n - k) / (k + 1);
        }

        return list;
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

## to check KMP optimze sol TC O(m + n) SC O(n)

- Knuth morris patt algo for pattern searching( check neetcode and techdose you tube channel)
- // on line no 2062 we are doing prevLPS + 1 instead of lps[PrevLPS] + 1 since prevLPS will always be the value of longest prefix equal to suffix for covered string

```
class Solution {
    public int strStr(String haystack, String needle) {
        int subLen = needle.length(), strLen = haystack.length();

        if(subLen == 0)
            return 0;
        if(subLen > strLen)
            return -1;
        int[] lps = new int[subLen];
        int i = 1, prevLPS = 0;
        lps[prevLPS] = 0;

        while(i < subLen){
            if(needle.charAt(i) == needle.charAt(prevLPS)){
               lps[i] = prevLPS + 1;
               i++;
               prevLPS++;
            }else if(prevLPS == 0){
                lps[i] = 0;
                i++;
            }else{
                prevLPS = lps[prevLPS - 1];
            }
        }

        int strIndex = 0, subIndex = 0;
        while(strIndex < strLen){
            if(haystack.charAt(strIndex) == needle.charAt(subIndex)){
                strIndex++;
                subIndex++;
            }else if(subIndex == 0)
                strIndex++;
             else
                subIndex = lps[subIndex - 1];

            if(subIndex == subLen)
                return strIndex - subLen;
        }
        return -1;
    }
}
```

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

max of min(a,b) will be when array is sorted then simply pair the adjacent elements in pair

```
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i += 2)
            sum += nums[i];
        return sum;
    }
}
```

### two sum II (sorted array)

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

### reverse words in a string REVISIT

many ways to solve it like using split method of regex to break words in string array and processing in reverse and 2 ways shown below

- https://leetcode.com/problems/reverse-words-in-a-string-iii/solution/

#### using stack

- using stack TC O(n) SC O(k + l)
  k is no of words in string to store in stack
  l is length of biggest word in string to store in stringbuilder

```
class Solution {
    public String reverseWords(String s) {
        int len = s.length(), i = 0;
        Stack<String> stk = new Stack<>();
        while(i < len){
            StringBuilder sb = new StringBuilder();
            while(i < len && s.charAt(i) != ' '){
                sb.append(s.charAt(i));
                i++;
            }
            if(!sb.isEmpty()){
                stk.push(sb.toString());
            }
            i++;
        }
       StringBuilder res = new StringBuilder();
       while(!stk.isEmpty()){
           res.append(stk.pop());
           res.append(" ");
       }
        return res.toString().trim();
    }
}
```

#### two pointer revers algo | in place

- in place SC O(1) TC O(n)
- reverse whole string
- then reverse each word and take care of spaces

```
class Solution {
    public String reverseWords(String s) {
        int len = s.length();
        char[] str = s.toCharArray();
        reverse(str, 0, len - 1);
        reverseWords(str, len);
        return cleanSpaces(str, len);
    }
    void reverse(char[] str, int start, int end){
        while(start < end){
            char temp = str[start];
            str[start++] = str[end];
            str[end--] = temp;
        }
    }

    void reverseWords(char[] str, int end){
        int i = 0, j = 0;
        while(i < end){
            while(i < j || i < end && str[i] == ' ') i++;
            while(j < i || j < end && str[j] != ' ') j++;
            reverse(str, i, j - 1);
        }
    }
    String cleanSpaces(char[] str,int len){
        int i = 0, j = 0;
        while(i < len){
            while(i < len && str[i] == ' ') i++;
            while(i < len && str[i] != ' ') str[j++] = str[i++];
            while(i < len && str[i] == ' ') i++;
            if(i < len) str[j++] = ' ';
        }
        return new String(str).substring(0 , j);
    }
}
```

### move zeros

https://leetcode.com/explore/learn/card/array-and-string/204/conclusion/1174/

#### simple approach O(n) inplace

```
public void moveZeroes(int[] nums) {
    if (nums == null || nums.length == 0) return;

    int insertPos = 0;
    for (int num: nums) {
        if (num != 0) nums[insertPos++] = num;
    }

    while (insertPos < nums.length) {
        nums[insertPos++] = 0;
    }
}
```

this sol is not good for the case 0,0,0,0,0,0,1
since n-1 unessary writes will happen in while loop
so below sol is better in reducing total no of operations for such cases however in normal case with few 0 it might not be best since we incurr write cost due to swapping

#### 2 pointer optimized O(n) inplace

```
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                swap(nums, i , j++);
            }
        }
    }
       void swap(int[] nums, int i, int k){
            int temp = nums[i];
            nums[i] = nums[k];
            nums[k] = temp;
        }
}
```

# hash tables

## design hashset

- https://leetcode.com/explore/learn/card/hash-table/182/practical-applications/1139/discuss/170092/can-you-guys-think-before-doing

- https://aaronice.gitbook.io/lintcode/hash-table/design-hashset

### arraylist implementation

```
class MyHashSet {
    int MAX_LEN = 100000;
    List<Integer>[] bucket;

    public MyHashSet() {
        this.bucket = new ArrayList[MAX_LEN];
    }

    public void add(int key) {
        int index = hash(key);
        if(getPos(key, index) < 0){
            if(bucket[index] == null){
                bucket[index] = new ArrayList<Integer>();
            }
            bucket[index].add(key);
        }
    }

    public void remove(int key) {
        int index = hash(key);
        int eleIndex = getPos(key, index);
        if(eleIndex >= 0)
            bucket[index].remove(eleIndex);
    }

    public boolean contains(int key) {
        int index = hash(key);
        return getPos(key, index) < 0 ? false: true;
    }

    private int getPos(int key, int index){
        List<Integer> temp =  bucket[index];
        if(temp == null)
            return -1;
        for(int i = 0; i < temp.size(); i++ ){
            if(key == temp.get(i))
                return i;
        }
        return -1;
    }

    private int hash(int key){
        return key % MAX_LEN;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
```

### BST implementation

```
class MyHashSet {

  /** Initialize your data structure here. */
  private Bucket[] bucketArray;
  private int keyRange;
  public MyHashSet() {
    this.keyRange = 769;
    this.bucketArray = new Bucket[this.keyRange];
    for (int i = 0; i < this.keyRange; i++) {
      this.bucketArray[i] = new Bucket();
    }
  }

  protected int _hash(int key) {
    return key % this.keyRange;
  }

  public void add(int key) {
    int bucketIndex = this._hash(key);
    this.bucketArray[bucketIndex].insert(key);
  }

  public void remove(int key) {
    int bucketIndex = this._hash(key);
    this.bucketArray[bucketIndex].delete(key);
  }

  /** Returns true if this set contains the specified element */
  public boolean contains(int key) {
    int bucketIndex = this._hash(key);
    return this.bucketArray[bucketIndex].exists(key);
  }
}


class Bucket {
  private BSTree tree;

  public Bucket() {
    tree = new BSTree();
  }

  public void insert(Integer key) {
    this.tree.root = this.tree.insertToBST(this.tree.root, key);
  }

  public void delete(Integer key) {
    this.tree.root = this.tree.deleteFromBST(this.tree.root, key);
  }

  public boolean exists(Integer key) {
    TreeNode node = this.tree.searchBST(this.tree.root, key);
    return node != null;
  }
}


class BSTree {
  TreeNode root = null;

  public TreeNode searchBST(TreeNode root, int val) {
    if (root == null || val == root.val) {
      return root;
    }
    return root.val > val ? searchBST(root.left, val) : searchBST(root.right, val);
  }

  public TreeNode insertToBST(TreeNode root, int val) {
    if (root == null) {
      return new TreeNode(val);
    }

    if (root.val < val) {
      root.right = insertToBST(root.right, val);
    }
    else if (root.val > val) {
      root.left = insertToBST(root.left, val);
    }
    else {
      return root;
    }
    return root;
  }

  public TreeNode deleteFromBST(TreeNode root, int key) {
    if (root == null) {
      return null;
    }
    if (root.val < key) {
      root.right = deleteFromBST(root.right, key);
    }
    else if (root.val > key) {
      root.left = deleteFromBST(root.left, key);
    }
    else {
      if (root.left == null && root.right == null) {
        root = null;
      }
      else if (root.right != null) {
        root.val = successor(root);
        root.right = deleteFromBST(root.right, root.val);
      }
      else {
        root.val = predecessor(root);
        root.left = deleteFromBST(root.left, root.val);
      }
    }
    return root;
  }

  private int successor(TreeNode root) {
    root = root.right;
    while (root.left != null) {
      root = root.left;
    }
    return root.val;
  }

  private int predecessor(TreeNode root) {
    root = root.left;
    while (root.right != null) {
      root = root.right;
    }
    return root.val;
  }
}


class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  public TreeNode(int x) {
    val = x;
  }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
```

## hashmap implementation

### using linked list

```
 class MyHashMap {
    class ListNode{
        int val, key;
        ListNode next;

        ListNode(int k, int v){
            this.key=k;
            this.val=v;
        }
    }

    ListNode[] main;

    public MyHashMap() {
        main = new ListNode[100000];
    }

    public void put(int key, int value) {
        int index = indexHash(key);
        if(main[index] == null){
            main[index] = new ListNode(-1, -1);
        }
        ListNode prev = find(main[index], key);
        if(prev.next==null){
            prev.next = new ListNode(key, value);
        }else{
            prev.next.val = value;
        }
    }

    public int get(int key) {
        int index = indexHash(key);

        if(main[index] == null){
            return -1;
        }
        ListNode node = find(main[index], key);
        return node.next==null?-1:node.next.val;
    }

    public void remove(int key) {
            int index = indexHash(key);
            if (main[index] == null) return;

            ListNode prev = find(main[index], key);
            if (prev.next == null) return;
            prev.next = prev.next.next;
    }

    ListNode find(ListNode bucket, int key){
        ListNode node = bucket, prev=null;
        while(node!=null && node.key!=key){
            prev = node;
            node = node.next;
        }

        return prev;
    }

    int indexHash(int key){
        return (key) % main.length;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
```

## single number prob

- using xor, set, map , sum of elements
- https://leetcode.com/explore/learn/card/hash-table/183/combination-with-other-algorithms/1176/discuss/1771720/C%2B%2B-EASY-SOLUTIONS-(SORTING-XOR-MAPS-(OR-FREQUENCY-ARRAY))/1404899

## intersection of 2 arrays

- https://leetcode.com/problems/intersection-of-two-arrays/solution/
- https://leetcode.com/problems/intersection-of-two-arrays/discuss/81969/Three-Java-Solutions

### using hash set TC O(m + n) SC(m + n)

```
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     Set<Integer> set1 = new HashSet<>();
     Set<Integer> set2 =  new HashSet<>();
     for(Integer n : nums1) set1.add(n);
     for(Integer n : nums2) set2.add(n);

     if(set1.size() < set2.size())
            return findIntersection(set1, set2);
        else
            return findIntersection(set2, set1);
    }
    int[] findIntersection(Set<Integer> set1, Set<Integer> set2){
        int[] res = new int[set1.size()];
        int i = 0;
        for(Integer n : set1)
            if(set2.contains(n))
                res[i++] = n;
        return Arrays.copyOf(res,i);
    }
}
```

- optimized with fewer checks TC and SC still the same

```
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }
}
```

### using sorting and 2 pointer TC O(n logn)

```
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[set.size()];
        int k = 0;
        for (Integer num : set) {
            result[k++] = num;
        }
        return result;
    }
}
```

### using sorting and binary search Time complexity: O(nlogn)

```
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums2);
        for (Integer num : nums1) {
            if (binarySearch(nums2, num)) {
                set.add(num);
            }
        }
        int i = 0;
        int[] result = new int[set.size()];
        for (Integer num : set) {
            result[i++] = num;
        }
        return result;
    }

    public boolean binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
```

## happy number problem

- https://leetcode.com/explore/learn/card/hash-table/183/combination-with-other-algorithms/1131

here the idea of different sol is to detect loop or check if n has become 1 at any stage so this problem can be related to detecting loops in linked list and so we can use here floyd's loop detection algorithn with 2 pointer or use a hashset to detect the loop simply by checking if n already exists in set

### loop detection using hashset TC log(n) SC log(n)

time complexity here mostly due to getNext() and as per the explanation of leetcode sol it is log(n)

```
class Solution {
    public boolean isHappy(int n) {
    Set<Integer> seen = new HashSet<>();
        while(n != 1 && !seen.contains(n)){
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }
    int getNext(int n){
        int sum = 0;
        while(n != 0){
            int temp = n % 10;
            sum += temp * temp;
            n = n/10;
        }
        return sum;
    }
}
```

### using floyd's loop detection algo TC log(n) SC O(1) better approach than hashset

19 -> 82 -> 68 -> 100 -> 1

```
class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);

        while(fast != 1 && fast != slow)
            {
                fast = getNext(getNext(fast));
                slow = getNext(slow);
            }
        return fast == 1;
        }

    int getNext(int n){
        int sum = 0;
        while(n != 0){
            int temp = n % 10;
            sum += temp * temp;
            n = n/10;
        }
        return sum;
    }
}
```

### math sol

- n will decrease to seed point, which is in 1 to 9. Only 1 and 7 will be the valid seed.

```
public boolean isHappy(int n) {
        if(n == 1 || n == 7) return true;
        else if(n < 10) return false;
        int m = 0;
        while(n != 0){
            int tail = n % 10;
            m += tail * tail;
            n = n/10;
        }
        return isHappy(m);
    }
```

## two sum (non sorted) return indices

- here extra space is needed to keep track of indices and return that's why hashmap or 2d array is needed
- sliding window will not work here

- sliding window can't work on unsorted array for example consider the case [3,2,3] target is 6 now sliding window size is 2, now sliding window will fail here reasons are given below sliding window works on the problem where consecutive elements are concerned, since array is unsorted, we are not sure if consecutive elements will always sum up to target it might happen that non consecutive elements i.e elements not part of window sum up to target and that is what happens with [3,2,3] now if the array is sorted then array will be [2,3,3] now as you can see sum of consecutive elements will be moving in upwards direction always as we move the window hence we can continue moving the window till the sum is less than target and we know for sure that consecutive elements will sum up to target else target does not exist.

### using extra space hashmap TC O(n) SC O(n)

```
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[] {map.get(target - nums[i]),  i };
            }
          map.put(nums[i], i);
        }
        return new int[] {-1,  -1 };
    }
}
```

### using sorting and 2 pointer technique TC n logn SC is n( 3n to be exact)

time complexity of soring nlogn in case or merge/heap sort and and then single traversal to check sum
so TC is n + nlogn = nlogn
and SC is 2n for 2d array and sorting also uses n so it's 3n i.e n

```
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[][] orig = new int[nums.length][2];
        for(int i = 0; i < nums.length; i++)
        {   orig[i][0] = nums[i];
            orig[i][1] = i;
        }

        Arrays.sort(orig, Comparator.comparingInt(o -> o[0]));
        int str = 0, end = nums.length - 1;
        while(str < end){
            int sum = orig[str][0] + orig[end][0];
            if(sum == target)
                return new int[] {orig[str][1], orig[end][1]};
            else if(sum > target)
                end--;
            else
                str++;
        }
        return null;
    }
}
```

## isomorphic sol

### using 2 array trick from discuss

```
class Solution {
  public boolean isIsomorphic (String s, String t) {
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
```

### sol using 2 hashmap approach is similar but not very readable

```
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> mapping_s_t = new LinkedHashMap<>();
        Map<Character,Character> mapping_t_s = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++){
            char sval = s.charAt(i);
            char tval = t.charAt(i);
            if(!mapping_s_t.containsKey(sval) && !mapping_t_s.containsKey(tval)){
                mapping_s_t.put(sval, tval);
                mapping_t_s.put(tval, sval);
            }else if((mapping_s_t.containsKey(sval) && mapping_s_t.get(sval) != tval) ||
                      (mapping_t_s.containsKey(tval)  && mapping_t_s.get(tval) != sval))
                return false;
        }

      return true;
    }
}
```

### transformation trick

- by transforming the char to it's index in both string and store in array or string builder with a delimeter " " or ,
- https://leetcode.com/problems/isomorphic-strings/solution/

```
class Solution {
    private String transformString(String s) {
        Map<Character, Integer> indexMapping = new HashMap<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);

            if (!indexMapping.containsKey(c1)) {
                indexMapping.put(c1, i);
            }

            builder.append(Integer.toString(indexMapping.get(c1)));
            builder.append(" ");
        }
        return builder.toString();
    }

    public boolean isIsomorphic(String s, String t) {
        return transformString(s).equals(transformString(t));
    }
}
```

### using a single map

```
class Solution {
    public boolean isIsomorphic(String s, String t) {
      Map<Character, Character> map = new HashMap<>();
        if(s.length() != t.length()){
        return false;
    }

    for(int i =0; i<s.length();i++){
        if((map.containsKey(s.charAt(i)) && t.charAt(i) != map.get(s.charAt(i)))){
            return false;
        }
        if(!map.containsKey(s.charAt(i))) {
            if(!map.values().contains(t.charAt(i))){
             map.put(s.charAt(i),t.charAt(i));
            }
            else{
                 return false;
            }
        }
    }
        return true;
    }
}
```

## minimum index sum of two lists

- https://leetcode.com/problems/minimum-index-sum-of-two-lists/solution/

### using a hashmap

- hash map linear TC approach TC (m + n) SC (m * x) hashmap size grows upto m*x where x refers to average string length.
- j <= sum is for early termination of the loop. It might be helpful to the speed.

```
public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;
        for(int i = 0;i< list1.length; i++)
            map.put(list1[i],i);
        for(int j = 0;j < list2.length && j <= minSum; j++){
            if(map.containsKey(list2[j])){
                int sum = j + map.get(list2[j]);
                if(sum < minSum){
                    minSum = sum;
                    res.clear();
                    res.add(list2[j]);
                }else if(sum == minSum){
                    res.add(list2[j]);
                }
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
```

- here the trick is iterate the list1 and list2 store i + j as key and list of matching restaurant as values in map

TC O(m*n*x) SC(m\*x)
m length of list1 n length of list 2

```
public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap < Integer, List < String >> map = new HashMap < > ();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    if (!map.containsKey(i + j))
                        map.put(i + j, new ArrayList < String > ());
                    map.get(i + j).add(list1[i]);
                }
            }
        }
        int min_index_sum = Integer.MAX_VALUE;
        for (int key: map.keySet())
            min_index_sum = Math.min(min_index_sum, key);
        String[] res = new String[map.get(min_index_sum).size()];
        return map.get(min_index_sum).toArray(res);
    }
}
```

## first unique character in string

### single pass sol using array of size 26 lower case alphabets (better approach since only one loop)

- Here i am using only a single loop on the array which can range up to 10^5 elements as per the problem
  and i am achieving this by storing the index of each character in 0th column of my 2d array and now i can easily find out if the current character is encounter more than one by comparing 1st column value which shows the frequency of the each char in the string and once i find a duplicate character i set firstIndex i.e 0th column value to -1 so that these elements can be ignored during my second loop of 26 elements, yes there is second loop but since it looping up to a constant no it is consider constant O(26) ~ O(1)
  And after the loop finishes, finally now we have an 2 array of each encounter char with their first occurrence position in the array and the freq
  now since we need to find first non repeating character, we will need to find minimum index non repeating character from the array.

TC O(N) SC O(1) since O(26) is constant

```
class Solution {
    public int firstUniqChar(String s) {
        int[][] arr = new int[26][2];

        for(int i = 0; i < s.length(); i++){
            int index = s.charAt(i) - 'a';
            if(arr[index][1] > 0)
                arr[index][0] = -1;
            else{
                arr[index][0] = i + 1;
                arr[index][1] = arr[index][1] + 1;
            }
        }
        int minIndex = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++)
            if(arr[i][0] > 0 && minIndex > arr[i][0])
                minIndex = arr[i][0];

        return minIndex != Integer.MAX_VALUE ? minIndex - 1 : -1;
    }
}
```

### using hashmap with 2 pass

TC O(N) SC O(1) since O(26) is constant

```
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> seen = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(seen.containsKey(c))
                seen.put(c,seen.get(c) + 1);
            else
                seen.put(c, 1);
        }

        for(int i = 0; i < s.length(); i++){
            if(seen.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
```

## intersection of 2 arrays II

- https://leetcode.com/explore/learn/card/hash-table/184/comparison-with-other-data-structures/1178

- https://leetcode.com/explore/learn/card/hash-table/184/comparison-with-other-data-structures/1178/discuss/1468295/Python-2-approaches-and-3-Follow-up-Questions-Clean-and-Concise

### using hashmap TC O(M + N) SC O(M)

```
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // count freq of nums1
        HashMap<Integer, Integer> map = new HashMap();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // collect result
        ArrayList<Integer> result = new ArrayList();
        for (int num: nums2) {
            if (map.containsKey(num)){
                result.add(num);
                map.put(num, map.get(num) - 1);
                map.remove(num, 0);
            }
        }
       // convert
       int[] r = new int[result.size()];
       for(int i = 0; i < result.size(); i++) {
           r[i] = result.get(i);
       }
       return r;
    }
}
```

### using sorting and 2 pointer technique

TC nlog(n) + n so O(nlogn) SC O(n) if merge sort is used for sorting

```
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> res = new ArrayList<>();
        int len = nums1.length > nums2.length ? nums2.length : nums1.length;
        int left = 0, right = 0;
        while(left < nums1.length && right < nums2.length){
            if(nums1[left] < nums2[right])
                left++;
            else if (nums1[left] > nums2[right])
                right++;
            else{
                res.add(nums1[left]);
                left++;
                right++;
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}
```

## contains Duplicate II

- https://leetcode.com/explore/learn/card/hash-table/184/comparison-with-other-data-structures/1121

### using hashmap

TC O(n) SC O(n)

```
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     if(nums.length == 1)
         return false;
     Map<Integer,Integer> map = new HashMap<>();
     for(int i = 0; i < nums.length; i++){
        Integer duplicateIndex = map.put(nums[i], i);
        if( duplicateIndex != null && i - duplicateIndex <= k)
            return true;
     }
        return false;
    }
}
```

### using hashset

TC O(n) SC O(n)

```
public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
 }
```

## group anagrams

### using sorting key

TC O (mlogm) \* O(n) SC O(n)

```
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
     for(String str: strs){
         char[] tempCharArr = str.toCharArray();
         Arrays.sort(tempCharArr);
         String s = new String(tempCharArr);
         if(map.containsKey(s)){
             map.get(s).add(str);
         }else{
             List<String> temp = new ArrayList<>();
             temp.add(str);
             map.put(s, temp);
         }
     }
     return new ArrayList<>(map.values());
    }
}
```

### from discus

TC O(n \* m) SC O(n)

```
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String str: strs) {
            char[] freqArr = new char[26];
            for (int i = 0; i < str.length(); i++) {
                freqArr[str.charAt(i) - 'a']++;
            }
            String key = new String(freqArr);
            if (groups.containsKey(key)) {
                groups.get(key).add(str);
            } else {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(str);
                groups.put(key, newGroup);
            }
        }

        return new ArrayList<>(groups.values());
    }

}
```

## valid Sudoku

- https://leetcode.com/explore/learn/card/hash-table/185/hash_table_design_the_key/1126/

### using hashset/hashmap approach and using %, / for block traversal in matrix (5ms leetcode)

here to improve space complexity we can make use of boolean array instead of hashmap also as shown in after the first section

- https://leetcode.com/explore/learn/card/hash-table/185/hash_table_design_the_key/1126/discuss/15450/Shared-my-concise-Java-code
- TC O(n^2) SC (3n)

```
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            Set<Character> row = new HashSet<>();
            Set<Character> col = new HashSet<>();
            Set<Character> box = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.' && !row.add(board[i][j]))
                   return false;
                if(board[j][i] != '.' && !col.add(board[j][i]))
                   return false;
                int m = (3 * (i / 3)) + j / 3;
                int n = (3 * (i % 3)) + j % 3;
                if(board[m][n] != '.' && !box.add(board[m][n]))
                   return false;
            }
        }
           return true;
    }
}
```

#### logic explanation

Great solution!. Just trying to explain how to think about % and /. These two operators can be helpful for matrix traversal problems.

For a block traversal, it goes the following way.

0,0, 0,1, 0,2; < --- 3 Horizontal Steps followed by 1 Vertical step to next level.

1,0, 1,1, 1,2; < --- 3 Horizontal Steps followed by 1 Vertical step to next level.

2,0, 2,1, 2,2; < --- 3 Horizontal Steps.

And so on...
But, the j iterates from 0 to 9.

But we need to stop after 3 horizontal steps, and go down 1 step vertical.

Use % for horizontal traversal. Because % increments by 1 for each j : 0%3 = 0 , 1%3 = 1, 2%3 = 2, and resets back. So this covers horizontal traversal for each block by 3 steps.

Use / for vertical traversal. Because / increments by 1 after every 3 j: 0/3 = 0; 1/3 = 0; 2/3 =0; 3/3 = 1.

So far, for a given block, you can traverse the whole block using just j.

But because j is just 0 to 9, it will stay only first block. But to increment block, use i. To move horizontally to next block, use % again : ColIndex = 3 \* i%3 (Multiply by 3 so that the next block is after 3 columns. Ie 0,0 is start of first block, second block is 0,3 (not 0,1);

Similarly, to move to next block vertically, use / and multiply by 3 as explained above. Hope this helps.

#### only we used boolean array here instead of hashset to improve space complexity 3ms on leetcode

```
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){

            boolean[] row =  new boolean[9];
            boolean[] col =  new boolean[9];
            boolean[] box =  new boolean[9];
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.')
                {}
                else if(row[board[i][j] - '1'])
                    return false;
                else
                    row[board[i][j] - '1'] = true;

                if(board[j][i] == '.')
                {}
                else if(col[board[j][i] - '1'])
                    return false;
                else
                    col[board[j][i] - '1'] = true;

                int m = (3 * (i / 3)) + j / 3;
                int n = (3 * (i % 3)) + j % 3;
                 if(board[m][n] == '.')
                {}
                else if(box[board[m][n] - '1'])
                    return false;
                else
                    box[board[m][n] - '1'] = true;

            }
        }
           return true;
    }
}
```

### sol using choice of key in hashmap

Collect the set of things we see, encoded as strings. For example:

'4' in row 7 is encoded as "(4)7".
'4' in column 7 is encoded as "7(4)".
'4' in the top-right block is encoded as "0(4)2".
Scream false if we ever fail to add something because it was already added (i.e., seen before).
![](img/sudoku.png)

- here if you analyse top right block will always have 0(value)2 as the values similarly top left will always have 0(value)0 so when same value appears in block we will know

```
class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    String key = "(" + board[i][j] + ")";
                    if(!seen.add(key + i) || !seen.add(j + key) || !seen.add(i/3 + key + j/3))
                        return false;
                }
            }
        }
           return true;
    }
}
```

### GFG clean sol using the same approach

- https://www.geeksforgeeks.org/check-if-given-sudoku-board-configuration-is-valid-or-not/?ref=lbp

# tree

## Binary Tree

- BFS vs DFS travesal of binary tree
- https://www.geeksforgeeks.org/bfs-vs-dfs-binary-tree/?ref=lbp
  A Tree is typically traversed in two ways:

- Breadth First Traversal (Or Level Order Traversal) (using queue)
- Depth First Traversals (using stack)
  - Inorder Traversal (Left-Root-Right) must know iterative method which can be used to solve other BST prob
  - Preorder Traversal (Root-Left-Right)
  - Postorder Traversal (Left-Right-Root)

Why do we care?

- There are many tree questions that can be solved using any of the above four traversals. Examples of such questions are size, maximum, minimum, print left view, etc.

Is there any difference in terms of Time Complexity?

- All four traversals require O(n) time as they visit every node exactly once.

Is there any difference in terms of Extra Space?

- There is difference in terms of extra space required.

- Extra Space required for Level Order Traversal is O(w) where w is maximum width of Binary Tree. In level order traversal, queue one by one stores nodes of different level.
- Extra Space required for Depth First Traversals is O(h) where h is maximum height of Binary Tree. In Depth First Traversals, stack (or function call stack) stores all ancestors of a node.

### isSymmetric tree prob

#### bottom up recursive sol

TC O(n) SC O(n)

```
class Solution {

    public boolean isSymmetric(TreeNode root) {
    return root == null || isMirror(root.left, root.right);
    }
    boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.val != right.val) return false;
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
```

#### iterative solution

- main logic is we can use queue and put right and left children of two nodes in opposite order i.e
  ```
     q.offer(left.left);
     q.offer(right.right);
     q.offer(left.right);
     q.offer(right.left);
  ```

TC O(n) SC(n)

```
class Solution {

    public boolean isSymmetric(TreeNode root) {
        if(root == null)
         return true;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root.left);
        q.offer(root.right);
        while(!q.isEmpty()){
            TreeNode left = q.poll();
            TreeNode right = q.poll();
            if(left == null && right == null)
                continue;

            if((left == null && right != null) || (left != null && right == null))
                return false;

            if(left.val != right.val)
                return false;

                q.offer(left.left);
                q.offer(right.right);
                q.offer(left.right);
                q.offer(right.left);
         }
        return true;
    }
}
```

## is Valid BST

- https://leetcode.com/problems/validate-binary-search-tree/
- https://www.geeksforgeeks.org/a-program-to-check-if-a-binary-tree-is-bst-or-not/

### intuitive sol with upper and lower limits

- trick is to use upper and lower limits for each node, check if max value in left subtree is smaller than the node and min value in right subtree greater than the node.

```
class Solution {
    public boolean isValidBST(TreeNode root) {

        return BSTHelper(root,null,null);
    }
   boolean BSTHelper(TreeNode root,Integer l, Integer r){
        if(root == null)
            return true;
        if(l != null && root.val <= l)
            return false;
        if(r != null && root.val >= r)
            return false;
        return BSTHelper(root.left,l ,root.val) && BSTHelper(root.right, root.val, r);
    }
}
```

### inorder traversal sol

- another approach is to inorder traversal and keep track of prev node and check if prev node data < node data as inorder traversal yeilds sorted data in BST

#### recursive sol

```
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Integer prev;
    public boolean isValidBST(TreeNode root) {
      prev = null;
    return  inOrder(root);
    }
    boolean inOrder(TreeNode root){
        if(root == null)
            return true;
        if(!inOrder(root.left))
            return false;

        if(prev != null && prev >= root.val)
            return false;
        prev = root.val;

     return inOrder(root.right);
    }
}
```

#### iterative sol IMP REVISIT

```
 public boolean isValidBST(TreeNode root) {
        Integer prev = null;
        Deque<TreeNode> stack = new ArrayDeque<>();
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(prev != null && prev >= root.val)
                return false;
            prev = root.val;
            root = root.right;
        }
        return true;
    }
```

### inorder successor/predecessor in BST

    - https://www.geeksforgeeks.org/inorder-predecessor-successor-given-key-bst/?ref=lbp
    - https://www.techiedelight.com/find-inorder-successor-given-key-bst/
    - https://www.geeksforgeeks.org/inorder-successor-in-binary-search-tree/

#### successor using intution method 1

TC O(h) or O(logn) h is height of tree, n is the no of nodes in tree SC due to call stack O(h)

```
    /**
     * if key is found and If its right subtree is not null The successor will be
     * the left most child of right subtree or right child itself.
     * If right subtree of node is NULL, then succ is one of the ancestors. Do the following.
     * Travel up using the parent pointer until you see a node which is left child of its parent.
     * The parent of such a node is the succ.
     * to find the ancestors do this if key is smaller then root then set root as succ(makes sense since root can be succ for it's left subtree ) and recurse for left subtree
     *
     **/
    public static TreeNode inorderSuccessor(TreeNode root, TreeNode succ, int key) {
        if (root == null)
            return succ;
        if (root.data == key) {
            if (root.right != null) {
                return leftmost(root.right);
            }
        } else if (key > root.data) {
            return inorderSuccessor(root.right, succ, key);
        } else {
            succ = root;
            return inorderSuccessor(root.left, succ, key);
        }
        return succ;
    }

    public static TreeNode leftmost(TreeNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }
```

#### predecessor using intution method 1

```
 /**
     * if key is found and If its left subtree is not null The successor will be
     * the right most child of right subtree or left child itself.
     * If left subtree of node is NULL, then succ is one of the ancestors. Do the following.
     * Travel up using the parent pointer until you see a node which is right child of its parent.
     * The parent of such a node is the pred.
     * to find the ancestors do this if key is greater then root then set root as pred and recurse for right subtree
     *
     **/
   public static TreeNode inorderPredecessor(TreeNode root, TreeNode pred, int key) {
        if (root == null)
            return pred;
        if (root.data == key) {
            if (root.left != null) {
                return rightmost(root.left);
            }
        } else if (key > root.data) {
            pred = root;
            return inorderSuccessor(root.right, pred, key);
        } else {
            return inorderSuccessor(root.left, pred, key);
        }
        return pred;
    }

    public static TreeNode rightmost(TreeNode node) {
        while (node.right != null)
            node = node.right;
        return node;
    }
```

#### successor using inorder traversa

- i can see that by traversing in order sorted sequence is produced so while traversing i can check the first node greter than the key is our succ
- this iterative inorder template is very useful for handling BST prob

```
 public TreeNode inorderSuccessor(TreeNode root, int key) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(root.data == key)
                return root;
            root = root.right;
        }
        return null;
    }
```

#### predecessor of a node in BST using inorder traversal

```
 public TreeNode inorderPredecessor(TreeNode root, int key) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode pred;
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(root.data == key)
                return pred;
            pred = root;
            root = root.right;
        }
        return null;
    }
```

### BSTIterator inorder

- https://leetcode.com/explore/learn/card/introduction-to-data-structure-binary-search-tree/140/introduction-to-a-bst/1008/

#### using stack

```
public class BSTIterator {
    private Stack<TreeNode> stack = new Stack<TreeNode>();

    public BSTIterator(TreeNode root) {
        pushAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode tmpNode = stack.pop();
        pushAll(tmpNode.right);
        return tmpNode.val;
    }

    private void pushAll(TreeNode node) {
        for (; node != null; stack.push(node), node = node.left);
    }
}
```

### search in BST iterative and recursive

#### iterative

```
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
            return null;
        while(root != null && root.val != val){
            root = val > root.val ? root.right : root.left;
        }
        return root;
    }
}
```

#### recursive

```
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
            return null;
        if(root.val == val)
            return root;
        else if(root.val > val)
            return searchBST(root.left, val);
        else
            return searchBST(root.right, val);
    }
}
```

### deletion in BST

in the below sol we are actually deleting the node and not replacing it's value and deleting inorder successor

```
class Solution {
  public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            TreeNode rightSmallest = root.right;
            while (rightSmallest.left != null) rightSmallest = rightSmallest.left;
            rightSmallest.left = root.left;
            return root.right;
        }
        return root;
    }
}
```

### kth largest element in a stream

- check if iterative inorder traversal of BST can be used to solve the problem(TODO)

- https://leetcode.com/explore/learn/card/introduction-to-data-structure-binary-search-tree/142/conclusion/1018
- this problem is a perfect one to be solved with a heap, also known as a priority queue. check (https://leetcode.com/problems/kth-largest-element-in-a-stream/solution/)
- Well, a heap is also capable of removing the smallest element quickly, so what if we just keep removing the smallest element from nums until nums.length == k, That's the key to solving this problem - use a min-heap(min means that the heap will remove/find the smallest element, a max heap is the same thing but for the largest element) and keep the heap at size k.That way, the smallest element in the heap (the one we can access in O(1) will always be the kth largest element.
- naive trivial way is to sort the array and then return kth largest from end in O(1) constant time by removing largest/smallest from end till we have n - k + 1 elements in array, but since add operation will be O(n) and then sorting again will cost nlogn so in short insert will be n \* n log n = n^2

Given N as the length of nums and M as the number of calls to add(),

- Time complexity: O(N⋅log(N)+M⋅log(k))

- The time complexity is split into two parts. First, the constructor needs to turn nums into a heap of size k. In Python, heapq.heapify() can turn nums into a heap in O(N) time. Then, we need to remove from the heap until there are only k elements in it, which means removing N - k elements. Since k can be, say 1, in terms of big O this is N operations, with each operation costing log(N). Therefore, the constructor costsO(N+N⋅log(N))=O(N⋅log(N)).

- Next, every call to add() involves adding an element to heap and potentially removing an element from heap. Since our heap is of size k, every call to add() at worst costs O(2∗log(k))=O(log(k)). That means M calls to add() costsO(M⋅log(k)).

- Space complexity: O(N)

- The only extra space we use is the heap. While during add() calls we limit the size of the heap to k, in the constructor we start by converting nums into a heap, which means the heap will initially be of size N.
  // PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder()); for max heap by default it is min heap

- sol using BST as mentioned in explore card https://leetcode.com/problems/kth-largest-element-in-a-stream/discuss/147729/O(h)-Java-Solution-Using-BST

```
class KthLargest {
    private final Queue<Integer> heap;
    private final int k;

    public KthLargest(int k, int[] nums) {
        this.heap = new PriorityQueue<>();
        this.k = k;
        for(int num : nums)
            heap.offer(num);

        while(heap.size() > k)
            heap.poll();
    }

    public int add(int val) {
        heap.offer(val);
        if(heap.size() > this.k)
            heap.poll();

        return heap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
```

### kth smallest element in a stream

-same approach can be used here only thing to change is use of max heap instead of min heap

```
class KthLargest {
    private final Queue<Integer> heap;
    private final int k;

    public KthLargest(int k, int[] nums) {
        this.heap = new PriorityQueue<>(Collections.reverseOrder());
        this.k = k;
        for(int num : nums)
            heap.offer(num);

        while(heap.size() > k)
            heap.poll();
    }

    public int add(int val) {
        heap.offer(val);
        if(heap.size() > this.k)
            heap.poll();

        return heap.peek();
    }
}
```

### kth smallest/largest element in a BST

- https://leetcode.com/problems/kth-smallest-element-in-a-bst/
- this can be solved with inorder traversal by simply decrementing the k value and when it reaches 0 we are at the kth smallest element in inorder traversal, however TC for this sol is O(n) where n is the no of nodes in BST and SC is O(h), which can be reduced to O(1) using morris traversal
- also if there are freq insertion/deletion operation in BST and freq access to kth smallest element then heap is ideal choice since insertion/deletion is log(n) and min/max heap smallest/largest element access is O(1)
- stack can be taken as stack, arrayDeque, linkedlist in java
- LinkedList<TreeNode> stack = new LinkedList<>();

- sol to the follow up https://leetcode.com/problems/kth-smallest-element-in-a-bst/solution/
- ideal sol for follow up is modify the strcuture of tree to have left subtree node count lNodeCount++ of all nodes during construction/insertion/deletion that way if k = lNodeCount + 1 for a node then that node is the kth smallest node which can be found in O(h) as explained in below gfg link
- https://www.geeksforgeeks.org/find-k-th-smallest-element-in-bst-order-statistics-in-bst/

```
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        while(root != null ||  !stack.isEmpty()){
            while(root !=  null){
                stack.push(root);
                root =  root.left;
            }
            root = stack.pop();

            if(--k == 0)
                return root.val;
            root = root.right;
        }
        return -1;
    }
}
```

- Complexity Analysis

Time complexity: O(H + k), where H is a tree height. This complexity is defined by the stack, which contains at least H + k elements, since before starting to pop out one has to go down to a leaf. This results in O(log N + k) for the balanced tree and O(N + k) for completely unbalanced tree with all the nodes in the left subtree.
Space complexity: O(H) to keep the stack, where H is a tree height. That makes O(N) in the worst case of the skewed tree, and O(logN) in the average case of the balanced tree.

- IMPORTENT if we use here max heap then TC will be nlogn for construction of maxheap and then for removing k elements from top is nlog(n) and accessing the top element is O(1) so total TC 2nlog(n) + O(1)
- so using heap is not better here since construction cost is higher and since it an array not a stream where we need to freq access the kth smallest element but we have stream where kth smallest element keep on changing then heap could be better choice.

### find median of integer stream (TODO)

### inorder/preorder using morris traversal(TODO)

### Lowest Common Ancestor of a Binary Search Tree

- https://leetcode.com/explore/learn/card/introduction-to-data-structure-binary-search-tree/142/conclusion/1012/
- https://www.geeksforgeeks.org/lowest-common-ancestor-in-a-binary-search-tree/?ref=lbp
- trick is if LCA lies in between the node 1 and node2 so if a node n is greater than both n1 and n2 then LCA lier in left subtree else if n is smaller than both n1 and n2 then LCA lies in right subtree else node n is the LCA

#### using recursion

TC O(h) SC O(h), SC O(1) if recusion stack is not considered

```
class Solution {
    //TreeNode lca;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return root;
        if(root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p , q);
        else if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);
        else{
            return root;
        }
    }
}
```

#### iterative sol

TC O(h) SC SC O(1)

```
class Solution {
    //TreeNode lca;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       while(root != null){
           if(root.val > p.val && root.val > q.val)
               root = root.left;
           else if(root.val < p.val && root.val < q.val)
               root = root.right;
           else
               return root;
       }
        return null;
    }
}
```

### contains duplicate III

- https://www.youtube.com/watch?v=Cu7g9ovYHNI

- using brute force TC will O(n\*k)
- in earlier contains duplicate II prob we used hashmap/hashset to solve the prob since there we are not having t i.e we were actually looking for duplicates but here the prob is slightly different as we have to find nearest duplicate i.e num[j] - num[i] <= t
- here we look at the brute force sol in outer loop we are going through the array and in inner loop we are checking the diff between nums[i] and elements from i + 1 to k elements so essentially for each element we are doing k operations so it n \* k
- we can optimise the k operations we use a BST because in BST insertion, deletion, searching all operation are log n so here we can maintain a BST of size k that way we can do all operation in log(k) size , so we can use treeset here we can add k elements to tree and while adding the numbers we can check the range num - t or num + t + 1 in the set any any num exists between this range then we found the nearest duplicate
  or alternatively you use floor and ceiling method of treeset to check if nearest duplicate exists

TC O (n log(k))
SC O (log(k))

```
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < nums.length; i++){
            Integer floor = set.floor(nums[i]);
            Integer ceiling = set.ceiling(nums[i]);

            if((floor != null &&  (long) nums[i] - floor <= t) || (ceiling != null &&  (long) ceiling - nums[i] <= t))
                return true;

            set.add(nums[i]);
            if(set.size() > k)
                set.remove(nums[i - k]);
        }
        return false;
    }
}
```

- we can use subset method of treeset to improve the readablilty of the code and it is simply combining the check of floor and ceil together

```
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();
        for(int i = 0; i < nums.length; i++){
            long from = (long) nums[i] - t;
            long to = (long) nums[i] + t + 1;
            SortedSet<Long> subSet = set.subSet(from, to);

            if(subSet.size() > 0)
                return true;

            set.add((long)nums[i]);
            if(set.size() > k)
                set.remove((long)nums[i - k]);
        }
        return false;
    }
}
```

### is binary tree balanced

- ideally below sol is correct but not optimal For the current node root, calling height() for its left and right children actually has to access all of its children, thus the complexity is O(N). We do this for each node in the tree, so the overall complexity of isBalanced will be O(N^2) in worst case(skewed binary tree and full binary tree). This is a top down approach.
- height function time complexity is O(n) and in first sol we are calling height multiple times i.e for each node in tree from main function so it is not optimal while in second sol we are calling height function only once from mail function
  simply by having a flag to keep track of any unbalanced node in tree
- check for other approaches from discuss https://leetcode.com/explore/learn/card/introduction-to-data-structure-binary-search-tree/143/appendix-height-balanced-bst/1027/discuss/35691/The-bottom-up-O(N)-solution-would-be-better

#### non optimal sol TC O(n^2)

```
class Solution {
    public boolean isBalanced(TreeNode root) {
       if(root == null)
           return true;
        int lh = height(root.left);
        int rh = height(root.right);
        return (Math.abs(lh - rh) <= 1) && isBalanced(root.left) && isBalanced(root.right);
    }

    int height(TreeNode root){
        if(root == null)
            return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }
}
```

#### optimal sol TC O(n) SC O(n)

```
class Solution {
    private boolean result = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null)
           return result;
        height(root);
        return result;
    }

    int height(TreeNode root){
        if(root == null || !result)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        if(Math.abs(lh - rh) > 1)
            result = false;

        return 1 + Math.max(lh, rh);
    }
}
```

### convert sorten int array to BST TC O(n) SC(n) for recursion

- since the array is sorted we can assume the root at the middle and know with sorted property of array we know all elements left of middle are part of left subtree for the node and elements to the right of middle are part of right subtree so algorithm is
  - terminal conition is low > high for case where there is only one element left and low and high are same
  - make the middle as root
  - root.left = recurse for(nums, low, mid - 1)
  - root.right = recurse for(nums,mid + 1, high)
  - return root

```
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int low = 0, high = nums.length - 1;
        return helper(nums, low, high);
    }
    TreeNode helper(int[] nums,int low,int high){
        if(low > high)
            return null;
        int mid = low + (high - low)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, low, mid - 1);
        root.right = helper(nums, mid + 1, high);
        return root;
    }
}
```

## n-ary tree

- tree having atmost n chillder is n-ary tree binary tree is a type of n-ary tree
- inorder does not make sense for n-ary tree and is not practical though can be done with some trick
- preorder, postorder and level-order make sense for n-ary tree and is practical

### preorder traversal of 3-ary tree

- https://leetcode.com/explore/learn/card/n-ary-tree/130/traversal/925/

#### recursive sol TC O(n) [SC (n) to check]

- Time complexity: O(n)
- also using linked list is better

```
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {

    public List<Integer> preorder(Node root) {
        List<Integer> res =  new ArrayList<>();
        preOrderRec(res, root);
        return res;
    }

    public void preOrderRec(List<Integer> res, Node root){
        if(root == null)
            return;
        res.add(root.val);
        for(Node child: root.children){
            preOrderRec(res, child);
        }
    }
}
```

#### iterative sol TC O(n) SC(n)

- Time complexity: O(n)
- Space complexity: O(n), worst case is when 2 levels only, first level contains only the root, all other nodes is the children who is in 2nd level. The max elements in stack is n - 1:
- also add operation of both arraylist and linkedlist takes constant time O(1) but using linked list is better than arraylist since rehashing occurs in arraylist on reaching threshold capacity and in java linkedlist is doubly linkedlist which maintains both head and tail and add operation O(1)

```
class Solution {

    public List<Integer> preorder(Node root) {
        List<Integer> res = new LinkedList<>();
        if(root == null)
            return res;
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);

        while(!stack.isEmpty()){
            root = stack.pop();
            res.add(root.val);
            int size = root.children.size();
            for(int i = size - 1; i >= 0; i--)
               stack.push(root.children.get(i));
        }
        return res;
    }
}
```

### postoreder traversal of n-ary tree

#### recursive sol

```
class Solution {
    List<Integer> res = new LinkedList<>();
    public List<Integer> postorder(Node root) {
         if(root == null)
            return res;
        for(Node child: root.children){
            postorder(child);
        }
        res.add(root.val);
       return res;
    }
}
```

#### iterative sol TC o(n) SC(n)

```
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new LinkedList<>();
        if(root == null)
            return res;
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);

        while(!stack.isEmpty()){
            root = stack.pop();
            res.add(root.val);
            for(Node child: root.children)
                stack.push(child);
        }
        Collections.reverse(res);
        return res;
    }
}
```

### level order traversal of n-ary tree

TC O(n) SC O(n)

```
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new LinkedList<>();
        if(root == null)
            return res;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            List<Integer> levelList = new ArrayList();
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node temp = q.poll();
                levelList.add(temp.val);
                for(Node child: temp.children)
                    q.offer(child);
            }
            res.add(levelList);
        }
        return res;
    }
}

```

### Maximum Depth of N-ary Tree

#### bottom up recursive sol

TC O(n) SC O(n) in worst case of skewed n-ary tree as there will be n - 1 call stack

- main logic is to extend the idea applied to binary tree to n-ary tree for finding max depth i.e a node depth is 1 + max(depth of it's children)
- this is bottom up recursive approach as children depth helps up finding the depth of the tree

```
class Solution {

    public int maxDepth(Node root) {
        if(root == null)
            return 0;
        int depth = 0;
        for(Node child : root.children){
            depth = Math.max(maxDepth(child), depth);
        }
        return depth + 1;
    }

}
```

#### top down recursive sol

TC O(n) SC O(n) in worst case of skewed n-ary tree as there will be n - 1 call stack

- here we check if assume current root node depth as 1 then this info can be passed down to it's children and using this children will know their depth and in similar fashion children of children will know their depth and when we hit the leaf node we update the gloabal ans with max depth, once we have traversed the complete tree we will have our ans with max depth.
- this is top down approach

```
class Solution {
    int ans = 0;
    public int maxDepth(Node root) {
        if(root == null)
            return 0;
       maxDep(root, 1);
     return ans;
    }
    void maxDep(Node node, int depth){

        if(isLeafNode(node))
           ans = Math.max(ans, depth);
        for(Node child: node.children){
            maxDep(child, depth + 1);
        }
    }
    boolean isLeafNode(Node node){
        return node.children == null || node.children.size() == 0;
    }
}
```

#### iterative sol

- main logic is simply do a level order BFS traversal using quueu and keep count of levels/depth

## trie

- https://leetcode.com/problems/implement-trie-prefix-tree/
- https://leetcode.com/problems/implement-trie-prefix-tree/solution/

```
class TrieNode {
    final int N = 26;
    TrieNode[] links = new TrieNode[N];
    boolean isWordEnd = false;

    boolean containsKey(char c){
        return links[c - 'a'] != null;
    }
    void put(char c, TrieNode node){
        links[c - 'a'] = node;
    }
    TrieNode getNode(char c){
        return links[c - 'a'];
    }
    boolean isEnd(){
        return isWordEnd;
    }
    void setEnd(){
        isWordEnd = true;
    }
}

class Trie {
    TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }
    // time complexity O(m) m -> length of word
    // space complexity O(m) -> m new nodes to create in worst case
    public void insert(String word) {
        TrieNode curr = this.root;
        char[] words = word.toCharArray();
        for(char c : words){
            if(!curr.containsKey(c)){
                curr.put(c, new TrieNode());
            }
            curr = curr.getNode(c);
        }
        curr.setEnd();
    }
    // TC o(m) SC O(1)
    public boolean search(String word) {
        TrieNode curr = this.root;
        char[] words = word.toCharArray();
        for(char c: words){

            if(!curr.containsKey(c))
                return false;
            curr = curr.getNode(c);
        }
        return curr.isEnd();
    }
    // TC o(m) SC O(1)
    public boolean startsWith(String prefix) {
        char[] words = prefix.toCharArray();
        TrieNode curr = this.root;
        for(char c: words){

            if(!curr.containsKey(c))
                return false;
            curr = curr.getNode(c);
        }
        return true;
    }
}

```

### application of trie

is very efficient data structure used to for retrieval of retrieval of a key in a dataset of strings

- autocomplete,
- spell checker,
- boggle game,
- t9 predictive text on nokia 300 or similar phones with keypad,
- ip routing (longest prefix matching)

### comparison with balanced tree and hashmap (very IMP)

There are several other data structures, like balanced trees and hash tables, which give us the possibility to search for a word in a dataset of strings. Then why do we need trie? Although hash table has O(1) time complexity for looking for a key, it is not efficient in the following operations :

- Finding all keys with a common prefix.
- Enumerating a dataset of strings in lexicographical order.
- another reason why trie outperforms hash table, is that as hash table increases in size, there are lots of hash collisions and the search time complexity could deteriorate to O(n), where n is the number of keys inserted. Trie could use less space compared to Hash Table when storing many keys with the same prefix. In this case using trie has only O(m) time complexity, where m is the key length.
- Searching for a key in a balanced tree costs O(mlogn) time complexity.

### Add and Search Word - Data structure design (IMP)

https://leetcode.com/explore/learn/card/trie/148/practical-application-i/1052/

```
class Node {
     Node[] links;
    private boolean isWordEnd;
    Node(){
        links = new Node[26];
        isWordEnd = false;
    }
    boolean containsKey(char c){
        return links[c - 'a'] != null;
    }

    void put(char c, Node n){
        links[c - 'a'] = n;
    }

    Node getNode(char c){
        return links[c - 'a'];
    }

    void setEnd(){
        isWordEnd = true;
    }

    boolean isEnd(){
        return isWordEnd;
    }
}

class WordDictionary {
    Node root;
    public WordDictionary() {
        root = new Node();
    }

    public void addWord(String word) {
        Node curr = this.root;
        char[] words = word.toCharArray();
        for(char c : words){
            if(!curr.containsKey(c))
                curr.put(c, new Node());
            curr = curr.getNode(c);
        }
        curr.setEnd();
    }

    public boolean search(String word) {
       char[] words = word.toCharArray();
       return isMatch(words, 0, this.root);
    }
    // trick is when we encounter . we need to check the next char in the array and terminal cond is when index is array length
    boolean isMatch(char[] words,int index, Node node){
        if(index == words.length)
            return node.isEnd();
        if(words[index] == '.'){
            for(int i = 0; i < node.links.length; i++ ){
                if(node.links[i] != null && isMatch(words, index + 1, node.links[i]))
                    return true;
            }
        }else
            return node.links[words[index] - 'a'] != null && isMatch(words, index + 1, node.links[words[index] - 'a']);
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
```

### LC 667 map sum pairs

- https://leetcode.com/problems/map-sum-pairs/
- https://www.youtube.com/watch?v=Z7dkugscqLA

#### brute force

- simply use hashmap to store key value pairs then iterate over hashmap and sum the val of all entry matching the prefix.
- TC for insert is O(1) and for sum is O(n\*k) n is no of entries in map and k is length of key.
- SC is O(n)

#### trie solution(optimal)

- since this problem deals with prefix we can use trie here
- main trick is to add value of key to every prefix node of key while inserting the key value pairs e.g (apple, 3)
- a , ap, app, appl, apple are all prefixes of key apple so we will put val 3 for every prefix node while constructing this trie
- now sum function is straight forward search prefix and return the last node val as that will be having the sum of all key's val matching prefix
- also the problem says, If the key already existed, the original key-value pair will be overridden to the new one. e.g
- apple , 3
- app, 2,
- ap -> 5
- app, 1
- ap -> 4
- in the above example (app, 1) overrides existing key, value pair (app, 2) so now search ap should return 4 instead 6 so we need subtract old value and add new value i.e but with trie implmentation we don't know keep track of old key,val pair so we will need another DS i.e hashmap to keep track of actual key, val pair, actual value to be added should be (val - map.getOrDefault(key, 0))

```
class Node {
    Map<Character, Node> links;
    int val;
    private boolean isWordEnd;
    Node(){
        links = new HashMap<>();
        isWordEnd = false;
        val = 0;
    }

    void setEnd(){
        isWordEnd = true;
    }

    boolean isEnd(){
        return isWordEnd;
    }
    void setVal(int value){
        val = value;
    }
    int getVal(){
        return val;
    }
}

class MapSum {
    Node root;
    Map<String, Integer> map;

    public MapSum() {
        root = new Node();
        map = new HashMap<>();
    }

    public void insert(String key, int value) {
        Node curr = root;
        char[] arr = key.toCharArray();
        int delta = value - map.getOrDefault(key, 0);
        map.put(key, value);
        curr.val += delta;

      for(char c : arr){
          curr.links.putIfAbsent(c, new Node());
          curr = curr.links.get(c);
          curr.val += delta;
      }
    }

    public int sum(String prefix) {
        Node curr = root;
        char[] arr = prefix.toCharArray();
        for(char c : arr){
            if(!curr.links.containsKey(c))
                return 0;
            curr = curr.links.get(c);
        }
        return curr.val;
    }
}

```

- TC for insert is O(k) k is key length and for sum is O(p) p is the length of prefix
- SC is O(n \* k) for n no of key, value pair and k is avg length of key

### replace words

brite force Intuitive

```
class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] sen = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String dic: dictionary){
            for(int i = 0; i < sen.length; i++){
                if(sen[i].startsWith(dic))
                    sen[i] = dic;
            }
        }
        return String.join(" ",sen);
    }
}
```

### TODO design search autocomplete system (IMP) Hard

### word search ||

#### using DFS (though correct but not optimal Time limit exceeds)

```
class Solution {
    int row, col;

    public List<String> findWords(char[][] board, String[] words) {
        row = board.length;
        col = board[0].length;
        var output = new ArrayList<String>();

        for(String word : words){
            for(int i = 0; i < row; i++){
                for(int j = 0; j < col; j++){
                    if(!output.contains(word) && DFS(board, i , j, word, 0))
                            output.add(word);
                    }
                }
            }
        return output;
        }

    Boolean DFS(char[][] board, int i , int j, String word, int index){
        if(index == word.length()) return true;

        if( i < 0 || i >= row || j < 0 || j >= col || board[i][j] != word.charAt(index))
            return false;

        board[i][j] = '#';

       var result = DFS(board, i + 1, j, word, index + 1) ||
              DFS(board, i - 1, j, word, index + 1) ||
              DFS(board, i, j + 1, word, index + 1) ||
              DFS(board, i, j - 1, word, index + 1);
        board[i][j] = word.charAt(index);
        return result;

    }
}
```

- TC is (N*m N*m * no of words) N*m is for outer loops in main function where for each cell we are checking if the words starts with and then recursive DFS also check for each cell in worst case it N*m for each DFS call so for n no of words it is (N*m N*m * no of words)
- worst case is all cell having same letter i.e 3\*3 box having a,a,a,a,a,a,a,a,a then dic is aaaaaaaaaaa here length if word is 11 and for each cell we willl traverse the whole board
- we can use DFS and hashmap to improve the time complexity as instead of doing DFS on each cell we should only test for words starting with letter matching the word i.e for cell with matcing letter in the board
- check https://www.youtube.com/watch?v=EmvsBM7o-5k
- DFS + trie will reduce the time complexity (N*M N*M \*length of longest word)

```
class Node {
    Node[] links;
    String word;
    boolean isEnd;

    Node(){
        links = new Node[26];
        //isEnd = false;
        //word = "";
    }

    boolean containsKey(char c){
        return links[c - 'a'] != null;
    }

    void put(char c, Node node){
        links[c - 'a'] = node;
    }

    Node getNext(char c){
        return links[c - 'a'];
    }
    void setWord(String word){
        this.word = word;
    }

    String getWord(){
        return word;
    }

    void setEnd(boolean flag){
         isEnd = flag;
    }

    boolean getEnd(){
        return isEnd;
    }
}


class Solution {
    int row, col;
    Node root;

    Solution(){
        root = new Node();
    }


    public List<String> findWords(char[][] board, String[] words) {
        row = board.length;
        col = board[0].length;
        var output = new ArrayList<String>();

        for(String word : words)
            buildTrie(word);


            for(int i = 0; i < row; i++){
                for(int j = 0; j < col; j++){
                    DFS(board, i , j, output, root);
                    }
                }

        return output;
    }

    void buildTrie(String word){
        Node curr = root;
        char[] arr = word.toCharArray();
        for(char c: arr){
            if(!curr.containsKey(c))
                curr.put(c, new Node());
            curr = curr.getNext(c);
        }
        curr.setEnd(true);
        curr.setWord(word);
    }

    void DFS(char[][] board, int i , int j,  List<String> output, Node curr){
        char c = board[i][j];
        if(c == '#' || !curr.containsKey(c))
            return;

        curr = curr.getNext(c);

        if(curr.getEnd())
        {
            curr.setEnd(false);
            output.add(curr.getWord());
        }

        board[i][j] = '#';

        if(i < row - 1)   DFS(board, i + 1, j,  output, curr);
        if(i > 0)   DFS(board, i - 1, j, output, curr);
        if(j < col - 1)   DFS(board, i, j + 1,  output, curr);
        if(j > 0 )   DFS(board, i, j - 1,  output, curr);

        board[i][j] = c;
    }
}
```

### Maximum XOR of Two Numbers in an Array

refernce - check take y forward trie series youtube channel

#### brtute force is O(n^2) with 2 loops

#### using trie

- main trick is to create a trie of binary bits of every number in array using bit manipulation
- check if the ith bit is set in a no using (num >> i) & 1
- for xor to be maximum with a num x the bit of the other no should be opposite from leftmost to rightmost

```
class Node {
    Node[] links;

    Node(){
        links = new Node[2];
    }

    boolean containsKey(int idx){
        return links[idx] != null;
    }

    Node get(int idx){
        return links[idx];
    }

    void put(int idx, Node node){
        links[idx] = node;
    }
}

class Trie{
    Node root;

    Trie(){
        root = new Node();
    }

    public void insert(int n){
        Node curr = root;
        for(int i = 31; i >= 0 ; i--){
            int bit = getBit(n, i);
            if(!curr.containsKey(bit)){
                curr.put(bit, new Node());
            }
            curr = curr.get(bit);
        }
    }

   public int getMax(int x){
        Node curr = root;
        int res = 0;
        for(int i = 31; i >= 0; i--){
            int bit = getBit(x, i);
            int reqBit = 1 - bit;
            if(curr.containsKey(reqBit)){
                res = res | (1 << i);
                curr = curr.get(reqBit);
            }else
                curr = curr.get(bit);
        }
        return res;
    }

    private int getBit(int n, int i){
        return ((n >> i) & 1);
    }
}

class Solution {
    Trie trie;

    Solution(){
        trie = new Trie();
    }

    public int findMaximumXOR(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int num : nums){
            trie.insert(num);
        }

        for(int num: nums){
            max = Math.max(max, trie.getMax(num));
        }
        return max;
    }
}
```

# sliding window

## Longest Substring with K Distinct Characters

- https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1/#(submitted on GFG)
- https://write.geeksforgeeks.org/improve-post/3992063
- https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/(premium)

### SOL : trick is to use hashmap with char and their freq to keep k unique char and keep expanding and shrinking window till map is size is k exactly

- https://designgurus.org/path-player?courseid=grokking-the-coding-interview&unit=grokking-the-coding-interview_1628541009794_1Unit

```
class Solution {
    public int longestkSubstr(String s, int k) {
        Map<Character, Integer> map =  new HashMap<>();
        if (s == null || s.length() == 0 || s.length() < k)
            return -1;

        int len = s.length(), winStart = 0, longest = -1;
        for(int i = 0; i < len; i++ ){
            char end = s.charAt(i);
            map.put(end, map.getOrDefault(end, 0) + 1);
            if(map.size() == k){
                longest = Math.max(longest, i - winStart + 1);
            }
            while(map.size() > k){
                char beg = s.charAt(winStart);
                map.put(beg, map.get(beg) - 1);
                if(map.get(beg) == 0 )
                    map.remove(beg);
                winStart++;
            }

        }
         return longest;
    }
}
```

# sorting

## merge sort TC O(nlogn) SC(n)

Time complexity of Merge Sort is O(nLogn) in all 3 cases (worst, average and best) as merge sort always divides the array into two halves and takes linear time to merge two halves.
Auxiliary Space: O(n)

- divide and conquer techqnique where we keep breaking the array in 2 halves until both halv become atomic and then perform merge on 2 halves
- for merging we take extra space of length r - l + 1 in each call stack
- we compare elements from first array and second array and put in extra array in increasing order
- finally we copy the elements from extra/buffer array to orig array using the start/low pointer

```
class Solution
{
    void merge(int arr[], int l, int m, int r)
    {    int[] merged = new int[r - l + 1];
         int idx1 = l, idx2 = m + 1;
         int k = 0;
         while(idx1 <= m && idx2 <= r){
             if(arr[idx1] <= arr[idx2]){
                 merged[k++] = arr[idx1++];
             }
             else{
                 merged[k++] = arr[idx2++];
             }
         }
         while(idx1 <= m){
             merged[k++] = arr[idx1++];
         }
         while(idx2 <= r){
             merged[k++] = arr[idx2++];
         }
         for(int i = 0,j = l; i < merged.length; i++, j++)
            arr[j] = merged[i];
    }
    void mergeSort(int arr[], int l, int r)
    {
        if(l < r)
        {
            int mid =  l + (r - l)/2;
            mergeSort(arr, l , mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l , mid, r);
        }
    }
}
```

### Applications of Merge Sort:

- Merge Sort is useful for sorting linked lists in O(nLogn) time. In the case of linked lists, the case is different mainly due to the difference in memory allocation of arrays and linked lists. Unlike arrays, linked list nodes may not be adjacent in memory. Unlike an array, in the linked list, we can insert items in the middle in O(1) extra space and O(1) time. Therefore, the merge operation of merge sort can be implemented without extra space for linked lists.

- In arrays, we can do random access as elements are contiguous in memory. Let us say we have an integer (4-byte) array A and let the address of A[0] be x then to access A[i], we can directly access the memory at (x + i\*4). Unlike arrays, we can not do random access in the linked list. Quick Sort requires a lot of this kind of access. In a linked list to access i’th index, we have to travel each and every node from the head to i’th node as we don’t have a continuous block of memory. Therefore, the overhead increases for quicksort. Merge sort accesses data sequentially and the need of random access is low.

## quick sort

quick sort is not stable and in place sorting but it uses the recursion stack which in worst case(already sorted) could be O(n) so it is not completely in place

- explore 3-way quicksort for handling duplicates(TODO)
- quick sort optimlization (TODO)
- https://www.geeksforgeeks.org/quick-sort/?ref=lbp

### using end index as the pivot

```
class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        if(low >= high)
        return;
        int pivot = partition(arr, low, high);
        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);
    }
    static int partition(int arr[], int low, int high)
    {
        int mid = high;
        int i = low - 1;
        for(int j = low; j < arr.length; j++){
            if(arr[j] < arr[mid]){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, mid);
        return i + 1;
    }
    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


```

if you use first element as pivot index then partition logic is diff having 2 points left and right

#### Time taken by QuickSort, in general, can be written as following.

T(n) = T(k) + T(n-k-1) + \theta (n)

The first two terms are for two recursive calls, the last term is for the partition process. k is the number of elements which are smaller than pivot.

- The worst case occurs when the partition process always picks greatest or smallest element as pivot. If we consider above partition strategy where last element is always picked as pivot, the worst case would occur when the array is already sorted in increasing or decreasing order.
  Following is recurrence for worst case.

- T(n) = T(0) + T(n-1) + \theta (n)which is equivalent to T(n) = T(n-1) + \theta (n) The solution of above recurrence is (n2).

- The best case occurs when the partition process always picks the middle element as pivot. Following is recurrence for best case.

- T(n) = 2T(n/2) + \theta (n) which is O(nlogn) and average is also O(nlogn)

### if we use middle element as pivot then partition algo is bit different

- there we need to us e 2 pointers left and right and we will keep incrementing left till we find an element > pivot and keep decrementing right till we find an element < pivot till left index < right index
- and do swaping

- https://stackoverflow.com/questions/27886150/quick-sort-with-middle-element-as-pivot

### QuickSort Tail Call Optimization (Reducing worst case space to Log n )

- https://www.geeksforgeeks.org/quicksort-tail-call-optimization-reducing-worst-case-space-log-n/
- a recursive function can be tail call optimized if recursive call is the last statement of the function
- so we can apply tail call optimization on quicksort to reduce the space complexity
- partition function is in place but we have recursion call stack, a simple implementation of QuickSort makes two calls to itself and in worst case requires O(n) space on function call stack.
- check what is tail call elimination https://www.geeksforgeeks.org/tail-call-elimination/

so for quick sort we can apply this tail call optimization as below

```
  static void quickSort(int arr[], int low, int high)
    {
        while(low < high)
        {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            low = pivot + 1;
        }
    }
```

Although we have reduced number of recursive calls, the above code can still use O(n) auxiliary space in worst case. In worst case, it is possible that array is divided in a way that the first part always has n-1 elements. For example, this may happen when last element is choses as pivot and array is sorted in increasing order.

- We can optimize the above code to make a recursive call only for the smaller part after partition.
- Reference:
  http://www.cs.nthu.edu.tw/~wkhon/algo08-tutorials/tutorial2b.pdf

```
  static void quickSort(int arr[], int low, int high)
    {
        while(low < high)
        {
            int pivot = partition(arr, low, high);
            if(pivot - low < high - pivot){
                quickSort(arr, low, pivot - 1);
                low = pivot + 1;
            }
            else{
                quickSort(arr, pivot + 1, high)
                high = pivot - 1;
            }
        }
    }
```

In the above code, if left part becomes smaller, then we make recursive call for left part. Else for the right part. In worst case (for space), when both parts are of equal sizes in all recursive calls, we use O(Log n) extra space.

## quick sort vs merge sort

- choose merge sort for sorting linkedlist since merge sort require less random access than quick sort and most of the time data is accessed sequentially
- we can insert element in middle in O(1) extra space and O(1) extra time in merge operation of merge sort

- choose quicksort for sorting array since quicksort requires a lot of random access
- and in array anyhow we can not insert element in middle in O(1) time and space so no considerable benefit of using merge sort.
- Quick Sort is also a cache friendly sorting algorithm as it has good locality of reference when used for arrays.

## importance of stability of sorting

- https://www.geeksforgeeks.org/stability-in-sorting-algorithms/

## heap sort (TODO)

- https://www.geeksforgeeks.org/heap-sort/?ref=lbp
- check heap DS from tech dose

# my calendar II

- here double booking is allowed but not triple booking
- https://leetcode.com/problems/my-calendar-ii

### Inuition Algo brute force sol TC O(n^2) SC O(n)

- Maintain a list of bookings and a list of overlaps/double bookings. When booking a new event [start, end), if it conflicts with a double booking, it will have a triple booking and be invalid.
  and we have to store only overlapped part in the overlaps booking since a booking is triple booking if it overlaps with any booking in overlapping list
  e.g we book [10, 20] [10, 40] [5, 15] in order
  now overlapping list will be having [10, 20] after [10, 40] book and now when [5, 15] it has to be checked for triple booking i.e so we need to compare it with overlapped section of the booking only i.e 10, 20 in our case if instead of 5, 15 we had 20, 40 coming this is fine since it overlaps with only 10, 40 and not 10, 20 so we store the intersection part only in overlapped list

```
class MyCalendarTwo {
   List<int[]> booking;
   List<int[]> overlaps;
    public MyCalendarTwo() {
        booking = new ArrayList<>();
        overlaps = new ArrayList<>();
    }

    public boolean book(int start, int end) {

       for(int[] ol: overlaps){
           if(start < ol[1] && end > ol[0])
               return false;
       }

       for(int[] b: booking){
           if(start < b[1] && end > b[0])
                // this is an imp trick here we only have to store the overlapping part in overlap list
               overlaps.add(new int[]{Math.max(start, b[0]), Math.min(end, b[1])});
       }

       booking.add(new int[] {start, end});
       return true;
    }
}

```

### boundary Count Intuition Algo

however this sol is not able to return the bookings data

- We will consider 'start' time as +1 and 'end' time as -1

  - If we currently only have 'start' and 'end' time
    - The sum between them will equal to 0, which will balance out
    - Now, if we add an overlap between the 'start/end' time we will have the following
      - s0, s1, e0, e1
    - Then the sum will be
      - 1 2 1 0
    - Since, there is an overlap, we can see that our highest sum is equal to 2
  - We can continue this approach to 3 or more overlaps
    - Example:
      - s0, s1, s2, e0, e1, e3
      - 1 2 3 2 1 0
    - In this case, our sum has reached 3 and we have found our triple booking

  When booking a new event [start, end), count delta[start]++ and delta[end]--. When processing the values of delta in sorted order of their keys, the running sum active is the number of events open at that time. If the sum is 3 or more, that time is (at least) triple booked.

```
class MyCalendarTwo {
    TreeMap<Integer, Integer> delta;

    public MyCalendarTwo() {
        delta = new TreeMap();
    }

    public boolean book(int start, int end) {
        delta.put(start, delta.getOrDefault(start, 0) + 1);
        delta.put(end, delta.getOrDefault(end, 0) - 1);

        int active = 0;
        for (int d: delta.values()) {
            active += d;
            if (active >= 3) {
                delta.put(start, delta.get(start) - 1);
                delta.put(end, delta.get(end) + 1);
                if (delta.get(start) == 0)
                    delta.remove(start);
                return false;
            }
        }
        return true;
    }
}
```

#### TC n\* (4logn + n) = O(n^2) SC O(n)

4 logn for 4 put operation and n for delta traverse so booke function TC is O(n) for n calls to book it is O(n^2)

# bitwise operator

- https://www.programiz.com/java-programming/bitwise-operators

1's complement is change every 1 to 0 and 0 to 1 in number
2's complement is adding 1 to 1's complement

The bitwise complement operator is a unary operator (works with only one operand). It is denoted by ~.
It is important to note that the bitwise complement of any integer N is equal to - (N + 1).

Java Signed Right Shift Operator
When we shift any number to the right, the least significant bits (rightmost) are discarded and the most significant position (leftmost) is filled with the sign bit.

for calculating signed right shift of -ve number we first have to take 2's complement of binary no and them perform the shift operation.

unsigned right shift operation fills the leftmost position with 0's

# recursion

## time complexity calculation with recursion and memoization

- no of recursive calls will not be always linear( chech fibonaacci recursive call tree, it is 2-ary tree in general it forms n-ary tree) but with memoization it can be made linear
- use tail recursion if possible to avoid implicit call stack space
- duplicate calculation in recursion will occur when we have multiple recursive calls in calculation/recurrance relation e.g fibonacci, pascal triange, climbstairs

## tail recursion

- https://leetcode.com/explore/featured/card/recursion-i/256/complexity-analysis/2374/
- Tail recursion is a recursion where the recursive call is the final instruction in the recursion function. And there should be only one recursive call in the function.
- with tail recursion system call stack reuse the space allocated for earlier recursive call since in tail recursion, we know that as soon as we return from the recursive call we are going to immediately return as well, so we can skip the entire chain of recursive calls returning and return straight to the original caller. That means we don't need a call stack at all for all of the recursive calls, which saves us space.

## search in a 2 d matrix

- https://leetcode.com/explore/learn/card/recursion-ii/470/divide-and-conquer/2872/

as per master theorem TC is O(mn) = 3T(m/2 * n/2) if it is sqaure matrix then O(n*n) = 3T(n^2/4) + O(1)
and since it satisfy case 1 of master theorem it can be represented as n^logb(a) TC = O(mn)log4(3)s

```
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;
        return search(matrix, target, row, col, 0, 0);
    }

   boolean search(int[][] matrix, int target, int row, int col, int rowStart, int colStart){
       if( rowStart > row || colStart > col)
           return false;

       if(row == rowStart && col == colStart && target != matrix[row][col])
            return false;

        int pivotR =  rowStart + (row - rowStart)/2;
        int pivotC = colStart + (col - colStart)/2;
        if(target == matrix[pivotR][pivotC])
            return true;
        else if(target < matrix[pivotR][pivotC])
            return search(matrix, target, pivotR, pivotC, rowStart, colStart ) ||
                search(matrix, target, row, pivotC,pivotR + 1, colStart) ||
                search(matrix, target, pivotR , col, rowStart, pivotC + 1);
        else
             return search(matrix, target, row, col, pivotR + 1, pivotC + 1 ) ||
                search(matrix, target, row, pivotC,pivotR + 1, colStart) ||
                search(matrix, target, pivotR , col, rowStart, pivotC + 1);

    }
}
```

## backtracking and pruning

Backtracking reduced the number of steps taken to reach the final result. This is known as pruning the recursion tree because we don't take unnecessary paths.

- https://leetcode.com/explore/learn/card/recursion-ii/507/beyond-recursion/2903/discuss/18239/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partioning)

### N queen problem

- https://leetcode.com/explore/learn/card/recursion-ii/472/backtracking/2804/
- https://www.youtube.com/watch?v=i05Ju7AftcM

time complexity is 4TO(n) we can improve this with hashing

```
class Solution {
    public int totalNQueens(int n) {
      int[][] board = new int[n][n];
      return solveNQueen(0, board, 0, n);
    }

    int solveNQueen(int col, int[][] board, int count, int n){

        for(int row = 0; row < n; row++){
            if(isSafe(col, row ,board,count,n)){
                board[row][col] = 1;
                if(col + 1  == n)
                    count++;
                else
                    count = solveNQueen(col+1, board,count,n);
                board[row][col] = 0;
            }
        }
        return count;
    }

    boolean isSafe(int col, int row, int[][] board, int count, int n){
        int dupRow = row;
        int dupCol = col;
        while(col >= 0 &&  row >= 0){
            if(board[row][col] == 1) return false;
            row--;
            col--;
        }
        row = dupRow;
        col = dupCol;
        while(col >= 0){
            if(board[row][col] == 1) return false;
            col--;
        }
        col =  dupCol;
        while(row < n && col >= 0){
             if(board[row][col] == 1) return false;
             row++;
             col--;
         }
       return true;
    }
  }
```

#### Explanation

- we only need to search left and lower diagnol and upper diagnol direction since for any value of col queens are filled till previous cols, so we only need to look in these directions
  and so when you draw the board and you can see for any queen put at (i, j) (i+j) gives us the lower diagnal traversal and n-1 + j - i gives us upper diagonal and we can use hashing to avoid cheking every position in whole left, lower, upper diagonal and do this in constant time O(1) and als this way we don't need to keep the board[][]

```
class Solution {
    public int totalNQueens(int n) {
      var left = new boolean[n];
      var upperDiag = new boolean[(2 * n) - 1];
      var lowerDiag = new boolean[(2 * n) - 1];

      return solveNQueen(0,  n, left, upperDiag, lowerDiag);
    }

    int solveNQueen(int col, int n, boolean[] left, boolean[] upperDiag, boolean[] lowerDiag){
      if(col == n)
          return 1;
        int count = 0;
        for(int row = 0; row < n; row++){
            if(!left[row] && !lowerDiag[row + col] && !upperDiag[n-1 + col - row])
            {
                left[row] = true;
                lowerDiag[row + col] = true;
                upperDiag[n - 1 + col - row] = true;

                count += solveNQueen(col+1, n, left, upperDiag, lowerDiag);

                left[row] = false;
                lowerDiag[row + col] = false;
                upperDiag[n - 1 + col - row] = false;
            }
        }
        return count;
    }
  }
```

if(col == n) check can be placed outside loop like the backtracking template by having a global static var in the class
reference below

- https://aaronice.gitbook.io/lintcode/backtracking/n-queens-ii

### leetcode 489 : robot room cleaner

- https://zhenchaogan.gitbook.io/leetcode-solution/leetcode-489-robot-room-cleaner

```
void cleanRoom(Robot robot){
    set<pair<int, int>> visited;
    robotClean(robot, visited, 0, 0, 0);
}

robotClean(Robot robot, set<pair<int,int>> visited, int i , int j, int dir){
    robot.clean();
    visited.insert({i,j});
    pair<int,int> dirs[4] = {{-1,0},{1,0},{0,1},{0,-1}};
    for(int k = 0; k < 4; k++){
        int new_i = i + dirs[k].first;
        int new_j = j + dirs[k].second;
        if(!visisted.contains({new_i,new_j} && robot.move()){
            robotClean(robot, visited, new_i, new_j, dir);
            backtrack(robot);
        }
        //dir = (dir + 1)%dir;
        robot.turnRight();
    }
}

void backtrack(Robot robot){
    robot.turnRight();
            robot.turnRight();
            robot.move();
            robot.turnRight();
            robot.turnRight();
}

```

### sudoku solver

- https://leetcode.com/explore/learn/card/recursion-ii/472/backtracking/2796/
- https://www.youtube.com/watch?v=FWAIf_EVUKE

```
class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    boolean solve(char[][] board)  {
     for(int row = 0; row < board.length; row ++){
         for(int col = 0; col < board[0].length; col++){
             if(board[row][col] == '.'){
                 for(char c = '1'; c <= '9'; c++){
                     if(isSafe(board, row, col, c)){
                         board[row][col] = c;
                         if(solve(board))
                             return true;
                         else
                             board[row][col] ='.';
                     }
                 }
                 return false;
             }
         }
      }
      return true;
    }
    boolean isSafe(char[][] board, int row, int col, char c){
        for(int i = 0; i < 9; i++){
            if(board[row][i] == c) return false;
            if(board[i][col] == c) return false;
            int subRow =  3 * (row / 3) + i / 3;
            int subCol =  3 * (col / 3) + i % 3;
            if(board[subRow][subCol] == c) return false;
        }
        return true;
    }
}
```

### combinations

- https://leetcode.com/explore/learn/card/recursion-ii/472/backtracking/2798/
- https://leetcode.com/explore/learn/card/recursion-ii/472/backtracking/2798/discuss/2580251/Java-backtracking-sol-with-explanation-of-n-k-+-1-performance-improvement

- Change the condition of for-loop to i <= n - k + 1 imporves the performance since it avoid calls which will not add any valid combinations to the final result
- - Take combine(4, 2) as an example, the program does not need to try the combination starting with 4, because it has been covered by those starting with 1, 2 and 3.The same applies for each sub-problem in the recursions.

- - similary take another example of combine(4,3) the sol does not need to take in to account combination starting with 3 and 4 since they have already been covered by combination starting with 1, 2

feel free to give thumbs up if you like the sol

```
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        helper(new ArrayList<Integer>() , res, 1, n, k);
        return res;
    }
    void helper(List<Integer> list, List<List<Integer>> res,int start, int end, int k){

        if(k == 0){
            res.add(new ArrayList(list));
            return;
        }

        for(int i = start; i <= end - k + 1; i++){
            list.add(i);
            helper(list, res, i + 1, end, k - 1);
            list.remove(list.size() - 1);
        }
    }
}
```

### 22. Generate Parentheses

- https://leetcode.com/problems/generate-parentheses/
- base case would be when len of string becomes 2n, trick is to keep on adding "(" till n and then keep on adding ) when count of close ) < open )

```
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(new StringBuilder(),res,0,0, n);
        return res;
    }

    void backtrack(StringBuilder sb,List<String> res,int open, int close, int n){
        if(sb.length() == n*2){
            res.add(sb.toString());
            return;
        }

        if(open < n){
            sb.append("(");
            backtrack(sb, res, open+1,close, n);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(close < open){
            sb.append(")");
            backtrack(sb, res, open, close+1, n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
```

### largest area in histogram

- https://leetcode.com/explore/learn/card/recursion-ii/507/beyond-recursion/2901/
- https://www.youtube.com/watch?v=X0X6G-eWgQ8
- https://www.youtube.com/watch?v=jC_cWLy7jSI

Time complexity is O(4n) and space complexity is O(4n)

- trick is to find the left smaller and right smaller for a bar at index i, that way max area for the bar is (rs - ls + 1 ) \* bar height, so the naive solution will be do this for every element in the array so TC will be O(n^2) + O(n^2) + O(n) = O(n^2)
- to optimize TC compute the left & right smaller array using stack check the youtube link for how to calculate the LS and RS array
- below sol uses multiple passes i.e O(4n) 2n for loop and 2n stack operation for push/pop further with another observation it can be done in single pass but that is hard to understand and to explain so avoid that unless interviewer ask for further optimizatation, for that refer the youtube video
- - Note: + 1 -> for adjust 0 based index

```
class Solution {
    public int largestRectangleArea(int[] heights) {
        var n = heights.length;
        var leftSmaller = new int[n];
        var rightSmaller = new int[n];
        var stack = new ArrayDeque<Integer>();
        var rstack = new ArrayDeque<Integer>();
        var maxArea = 0;
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()) leftSmaller[i] = 0;
            else leftSmaller[i] = stack.peek() + 1;
            stack.push(i);
        }

        for(int i = n - 1; i >= 0 ; i--){
            while(!rstack.isEmpty() && heights[rstack.peek()] >= heights[i]){
                rstack.pop();
            }
            if(rstack.isEmpty()) rightSmaller[i] = n - 1;
            else rightSmaller[i] = rstack.peek() - 1;
            rstack.push(i);
            maxArea = Math.max(maxArea, (rightSmaller[i] - leftSmaller[i] + 1) * heights[i]);
        }
        return maxArea;
    }
}
```

### permutations

- https://leetcode.com/explore/learn/card/recursion-ii/507/beyond-recursion/2903/
- list.contains() is O(n) operation to do this in O(1) time we can use additional boolean array or use swaping logic( check discuss section), we can also use hashset but using boolean array is better

```
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        backtrack(nums, new ArrayList<Integer>(), res);
        return res;
    }

    void backtrack(int[] nums, List<Integer> list,List<List<Integer>> res){
        if(list.size() == nums.length){
            res.add(new ArrayList(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(isValid(list, i, nums)){
               list.add(nums[i]);
               backtrack(nums, list, res);
               list.remove(list.size()-1);
            }
        }
    }
    boolean isValid(List<Integer> list, int i, int[] nums){
        return !list.contains(nums[i]);
    }
}
```

#### using boolean array to improve TC(easy to understand & explain)

```
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        backtrack(nums, new ArrayList<Integer>(),new boolean[nums.length], res);
        return res;
    }

    void backtrack(int[] nums, List<Integer> list, boolean[] used, List<List<Integer>> res){
        if(list.size() == nums.length){
            res.add(new ArrayList(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;
               list.add(nums[i]);
               used[i] = true;
               backtrack(nums, list, used, res);
               list.remove(list.size() - 1);
               used[i] = false;
        }
    }
}
```

### Letter Combinations of a Phone Number

- https://leetcode.com/explore/learn/card/recursion-ii/507/beyond-recursion/2905
- use backtracking and keypad map or an array / iterative sol uses queue FIFO

```
class Solution {
    private static final String[] KEY_PAD = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> letterCombinations(String digits) {
        var res = new ArrayList<String>();
        if(digits.length() == 0)
            return res;
        backtrack(digits, 0 ,new StringBuilder(),res);
        return res;
    }
    void backtrack(String digits, int idx, StringBuilder temp, List<String> res){
        if(idx == digits.length()){
            res.add(new String(temp));
            return;
        }
        char[] keys = KEY_PAD[digits.charAt(idx) - '0'].toCharArray();

        for(char c : keys){
            temp.append(c);
            backtrack(digits, idx + 1, temp, res);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}
```

### The Skyline Problem

- https://leetcode.com/explore/learn/card/recursion-ii/507/beyond-recursion/3006/
- https://leetcode.com/explore/learn/card/recursion-ii/507/beyond-recursion/3006/discuss/61192/Once-for-all-explanation-with-clean-Java-code(O(n2)time-O(n)-space)
- Intution:
- if we consider the start and end coardinates of all buildings and then sort them on start coardinates
- a starting point(x,y) will either be overshadowed by other buildings or will overshadow them and to know this we will have keep track of all buildings heights and find max height building if needed also when you reach end point(x,y) this building will no longer impact others i.e shadowing so we need to remove it from list so add, find max , remove these operation can be done efficiently in maxheap or BST so we can use priority queue here however remove operation in PQ is O(n) so use treemap remove O(log(n)) to improve TC

- Algorithm

```
for position in sorted(all start points and all end points)
       if this position is a start point
              add its height
       else if this position is a end point
              delete its height
       compare current max height with previous max height, if different, add
       current position together with this new max height to our result, at the
       same time, update previous max height to current max height;
```

```
class Node {
    int x;
    int y;
    Node(int start, int height){
        x = start;
        y = height;
    }
}

class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
     List<Node> nodes = new ArrayList();
     List<List<Integer>> res = new ArrayList();
        for(int[] b: buildings){
            nodes.add(new Node(b[0], -b[2]));
            nodes.add(new Node(b[1], b[2]));
        }

        Collections.sort(nodes,(a, b) -> {
           if(a.x != b.x)
               return a.x - b.x;
            return a.y - b.y;
        });

        var pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        pq.offer(0);
        int prevMax = 0;
        for(Node node: nodes){
            if(node.y < 0)
                pq.offer(-node.y);
            else
                pq.remove(node.y);
            int max = pq.peek();
            if(prevMax != max){
                res.add(Arrays.asList(node.x,max));
                prevMax = max;
            }
        }
        return res;
    }
}
```

#### improvements by using treemap

```
class Node {
    int x;
    int y;
    Node(int start, int height){
        x = start;
        y = height;
    }
}

class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
     List<Node> nodes = new ArrayList();
     List<List<Integer>> res = new ArrayList();
        for(int[] b: buildings){
            nodes.add(new Node(b[0], -b[2]));
            nodes.add(new Node(b[1], b[2]));
        }

        Collections.sort(nodes,(a, b) -> {
           if(a.x != b.x)
               return a.x - b.x;
            return a.y - b.y;
        });

        var pq = new TreeMap<Integer,Integer>(Collections.reverseOrder());
        pq.put(0, 1);
        int prevMax = 0;
        for(Node node: nodes){
            if(node.y < 0){
                int cnt =  pq.getOrDefault(-node.y, 0);
                pq.put(-node.y, cnt + 1);
            }
            else{
                int cnt =  pq.getOrDefault(node.y, 0);
                if(cnt == 1)
                    pq.remove(node.y);
                else
                    pq.put(node.y, cnt - 1);
            }

            int max = pq.firstKey();
            if(prevMax != max){
                res.add(Arrays.asList(node.x, max));
                prevMax = max;
            }
        }
        return res;
    }
}
```

# patterns

## 2 pointer

### 2 sum BST (daily challange)

- https://leetcode.com/problems/two-sum-iv-input-is-a-bst/

#### using inorder traversal of BST and 2 pointer

- first traverse the BST using inorder traversal and store the sorted elements in a arraylist
- then use 2 pointer to point start and end of the list and keep of checking sum = target else if sum > target --end else start++
- TC is O(n) SC O(n)
- using arrayDeque is faster than stack and dequq can be used as FIFO and LIFO so learn how to use and what methods to use for FIFO or LIFO

```
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        var nums = new ArrayList<Integer>();
        inorder(root, nums);
        int i = 0;
        int j = nums.size() - 1;
        while(i < j){
            var sum = nums.get(i) + nums.get(j);
            if(sum == k) return true;
            else if(sum < k) i++;
            else j--;
        }
        return false;
    }

    void inorder(TreeNode root, List<Integer> nums){
        var stack = new ArrayDeque<TreeNode>();
        while(root != null || !stack.isEmpty()){
            while(root != null)
            {
                stack.addFirst(root);
                root = root.left;
            }
            root = stack.removeFirst();
            nums.add(root.val);
            root = root.right;
        }
    }
}
```

#### optimization here we traverse the BST 2 times so TC O(2n) however we can use BST property to do this in single traversal

- https://leetcode.com/problems/two-sum-iv-input-is-a-bst/discuss/106071/Iterative-solution-with-O(n)-time-O(logn)-space-with-detailed-explanation.-Only-traverse-the-binary-tree-once!!!
- https://leetcode.com/problems/two-sum-iv-input-is-a-bst/discuss/2683131/Java-sol-with-O(n)-TC-and-O(log-n)-SC-using-single-Traversal

- keep 2 stacks left and right and reach the leftmost and rightmost node in the BST
- now since duplicate node are not allowed we can loop while(left.val != right.val)
- rest logic is same as 2 sum above only thing is we have to find predessor and successor of left and right node as we progress so we have to keep the parent nodes in the stack
- Further the methods could be generalized in to find both pred and succ and leftmost/rightmost node

- TC is O(n) SC O(h) where h is hight of tree so O(log n)

```

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        var leftStack = new ArrayDeque<TreeNode>();
        var rightStack = new ArrayDeque<TreeNode>();

        var left = findLeftMost(root, leftStack);
        var right = findRightMost(root, rightStack);

        while(left.val != right.val){
            var sum = left.val + right.val;
            if(sum == k) return true;
            else if(sum < k){
                left = findSuccessor(left.right, leftStack);
            }else {
                right = findPredecessor(right.left, rightStack);
            }
        }
        return false;
    }

    TreeNode findSuccessor(TreeNode left, Deque<TreeNode> leftStack){
        while(left != null){
            leftStack.addFirst(left);
            left = left.left;
        }
        return leftStack.pop();
    }

    TreeNode findPredecessor(TreeNode right, Deque<TreeNode> rightStack){
         while(right != null){
            rightStack.addFirst(right);
            right = right.right;
        }
        return rightStack.pop();
    }

    TreeNode findLeftMost(TreeNode temp, Deque<TreeNode> leftStack){
       while(temp != null){
            leftStack.addFirst(temp);
            temp = temp.left;
        }
        return leftStack.pop();
    }

    TreeNode findRightMost(TreeNode temp, Deque<TreeNode> rightStack){
          while(temp != null){
            rightStack.addFirst(temp);
            temp = temp.right;
        }
        return rightStack.pop();
    }
}
```

# graph

- refer graph seriers by striver on takeuforward channel
- a graph can have multiple connected components

## BSF traversal

- requires queue to do level order traversal
- req visisted array to keep check of visited nodes
- SC is O(n) no of nodes + O(n) check for nodes visited using bool array + O(n) for storing n nodes in queue
- TC is O(n) for N nodes + O(2E) for loop on adjacecny list of node i.e degree of node so sum of degree of every node = 2 E so TC is O(n +2 E)

```
//{ Driver Code Starts
// Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                // adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.bfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] vis = new boolean[V];
        var res = new ArrayList<Integer>();
        var q = new ArrayDeque<Integer>();
        q.offerLast(0);
        vis[0] = true;
        BFS(res, adj, q, vis);

        <!-- if graph have multiple connected components
        for(int i = 0; i < V; i++){
            if(!vis[i])
                BFS(res, adj, q, vis);
        } -->
        return res;
    }
    void BFS(List<Integer> res , ArrayList<ArrayList<Integer>> adj, Deque<Integer> q , boolean[] vis){

        while(!q.isEmpty()){
            int ele = q.removeFirst();
            res.add(ele);
            for(Integer neighbor: adj.get(ele)){
                if(!vis[neighbor])
                {
                    q.offerLast(neighbor);
                    vis[neighbor] = true;
                }
            }
        }
    }
}
```

## DFS traversal

- uses recursion to do depth traversal
- req visisted array to keep check of visited nodes
- TC is O(n) all no of nodes + O(2E) for loop on adjacecny list of node i.e degree of node so sum of degree of every node = 2 E so TC is O(n +2 E)
- SC is O(n) storing of n nodes + O(n) for visited array + O(n) for n recursive calls in case of skewed graph i.e O(n)

```
class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        var vis = new boolean[V];
        var res = new ArrayList<Integer>();
        DFS(res, vis, adj, 0);
        return res;
    }

    void DFS(List<Integer> res, boolean[] vis, ArrayList<ArrayList<Integer>> adj, Integer node){
        res.add(node);
        vis[node] = true;
        for(Integer neighbor: adj.get(node)){
            if(!vis[neighbor])
                DFS(res, vis, adj, neighbor);
        }
    }
}
```

## no of provices prob

- https://leetcode.com/problems/number-of-provinces/discuss/2752929/clean-JAVA-sol-with-adjacency-matrix-and-list-both
- https://leetcode.com/problems/number-of-provinces/
- https://www.youtube.com/watch?v=ACzkVtewUYA&list=PLgUwDviBIf0oE3gA41TKO2H5bHpPd7fzn&index=7

### sol by converting adjacency matrix to list first

SC -> O(n) : vis array + O(n) : dfs calls worst case skewed graph + O(n + 2E) adjacency list = O(n)
TC -> O(nn) for converion to list + O(n) + O(n+2E) = O(nn)

```
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        var adjls = new ArrayList<ArrayList<Integer>>();
        convertAdjMatrixToList(adjls,isConnected,v);
        var vis = new int[v];
        int count = 0;
        for(int i = 0; i < v; i++){
            if(vis[i] == 0){
                DFS(adjls, i, vis);
                count++;
            }
        }
        return count;
    }

    void DFS(ArrayList<ArrayList<Integer>> adjls, int i , int[] vis){
        vis[i] = 1;
        for(Integer neighbor: adjls.get(i)){
            if(vis[neighbor] == 0)
                DFS(adjls, neighbor, vis);
        }
    }

    void convertAdjMatrixToList(ArrayList<ArrayList<Integer>> adjls, int[][] isConnected, int v){
         for(int i = 0; i < v; i++){
            adjls.add(new ArrayList<Integer>());
            for(int j = 0; j < v; j++){
                if(i != j && isConnected[i][j] == 1){
                    adjls.get(i).add(j);
                }
            }
        }
    }
}
```

### sol with adjacency matrix

SC -> O(n) : vis array + O(n) : dfs calls worst case skewed graph = O(n)
TC -> O(n) for loop + O(n+2E) for dfs traversal = O(n)

here's my java sol from (leetcode)without converting to Adjacency List

```

class Solution {
public int findCircleNum(int[][] isConnected) {
int v = isConnected.length;
var vis = new boolean[v];
int count = 0;

        for(int i = 0; i < v; i++){
            if(!vis[i]){
                DFS(isConnected, i, vis, v);
                count++;
            }
        }
        return count;
    }

    void DFS(int[][] isConnected, int i , boolean[] vis, int v){
        for(int j = 0; j < v; j++){
            if(!vis[j] && isConnected[i][j] == 1){
                vis[j] = true;
                DFS(isConnected, j, vis,v);
            }
        }
    }

}

```

## flood fill

- https://www.youtube.com/watch?v=C-2_uSRli8o&list=PLgUwDviBIf0oE3gA41TKO2H5bHpPd7fzn&index=9
- https://practice.geeksforgeeks.org/problems/flood-fill-algorithm1856/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=flood-fill-algorithm

TC O(n*m*4) SC O(n\*m)

```
class Solution
{
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        int icolor = image[sr][sc];
        DFS(image, sr, sc , icolor, newColor);
        return image;
    }

    void DFS(int[][] image, int row, int col,int icolor, int newColor){
        int[] rDir = {1,-1, 0, 0};
        int[] cDir = {0, 0, 1, -1};
        image[row][col] = newColor;
        for(int i = 0; i < 4; i++){
            int newr= row + rDir[i];
            int newc = col + cDir[i];
            if(isSafe(image, newr, newc, icolor, newColor)){
                DFS(image, newr, newc, icolor, newColor);
            }
        }
    }
    boolean isSafe(int[][] image, int newr, int newc, int icolor, int newColor){
        if(newr >= 0 && newc >= 0 && newr < image.length && newc < image[0].length && image[newr][newc] == icolor && image[newr][newc] != newColor)
            return true;
        return false;
    }
}
```

- the check image[newr][newc] == icolor && image[newr][newc] != newColor is important since icolor and newcolor could be same and if not checked then it can result in stackoverflow
