package tree.BinarySearchTree;

import java.util.Stack;

import commons.tree.TreeNode;
import tree.BinaryTree.CreateBinaryTree;

public class CreateBSTFromPreorder {
    private static int preIndex = 0;

    /*
     * traditional approach of creating a BST from given preorder is below 1.)
     * select first element as root from preorder 2.) scan from left to right the
     * preorder to find first element who greater than root now all nodes left of
     * that element will be part of left subtree and right of that node including
     * the node itself will be part of right subtree now only problem with this
     * approach is time complexity would o(n^2) in worst case of skewed BST So below
     * AlGO creates the BST in O(n) time MIN-MAX approach select first node as root
     * from preorder and assume every node value must be in range must {MIN... MAX}
     * and traverse preorder from left to right using static index preIndex and
     * create node if key value is in range {MIN... MAX} and recurse for the left
     * and right child but with updated {MIN...MAX} values preorder -> { 11, 6, 4,
     * 5, 19, 17, 43, 31, 49 }
     */
    private static TreeNode createBST(int[] pre, int min, int max, int key, int size) {
        if (preIndex > size) // terminal condition to stop when all nodes are traversed from preorder
            return null;

        TreeNode root = null;
        if (key > min && key < max) { // to check if key is in the range {min... max}
            root = new TreeNode(key);// create the node
            preIndex++; // increment the index to select next node from preorder

            if (preIndex <= size) {
                root.left = createBST(pre, min, root.data, pre[preIndex], size);// update the range for the next node
                                                                                // from
                // preorder to {min... key}
            }
            if (preIndex <= size) {
                root.right = createBST(pre, root.data, max, pre[preIndex], size);// update the range for the next node
                                                                                 // from
                // preorder to {key... max}
            }
        }
        return root;

    }

    /*
     * create BST using preorder with the help of a stack ALGO -> create an empty
     * stack, select the first value as root node and push it to stack, traverse the
     * preorder from next element and create a temp node and keep popping the stack
     * while stack is not empty and stack's top value is less than preorder next
     * node, now make this greater value from preorder as the right child of stack's
     * top value and push this right child to stack, however if the next value from
     * preorder is less than stack's top value then make this as the left child of
     * stack't top value and push this left child to stack->every item is pushed and
     * popped only once. So at most 2n push/pop operations are performed in the main
     * loops of constructTree(). Therefore, time complexity is O(n).
     */
    private static TreeNode createBSTUsingStack(int[] pre, int size) {
        // int i = 0;
        TreeNode root = new TreeNode(pre[0]);
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root); // push root to the stack
        for (int i = 1; i < size; i++) { // traverse the preorder starting from left to right with next index
            TreeNode temp = null; // create a temp node
            // keep popping the stack to temp node while stack is not empty and stack's top
            // value is less than next node from preorder
            while (!stack.isEmpty() && pre[i] > stack.peek().data) {
                temp = stack.pop();
            }

            if (temp != null) { // if temp is not empty i.e the stack is empty and next element was greater then
                                // stack's top value
                temp.right = new TreeNode(pre[i]); // so make this greater node as the right child of stack's top value
                                                   // i.e last popped value
                stack.push(temp.right); // push this new node to the stack
            } else { // it the next element from preorder was less than stack's top value
                temp = stack.peek();
                temp.left = new TreeNode(pre[i]);// make next node as the left child of stack's top value
                stack.push(temp.left);// push this new node to the stack
            }

            // while (!stack.isEmpty() && i < size) {
            // TreeNode node = stack.pop();
            // if (node.data > pre[i]) {
            // node.left = new TreeNode(pre[i]);
            // stack.push(node.left);
            // } else {
            // node.right = new TreeNode(pre[i]);
            // stack.push(node.right);
            // }
            // i++;
            // }
        }
        return root;
    }

    public static void main(String[] args) {

        int[] pre = new int[] { 11, 6, 4, 5, 19, 17, 43, 31, 49 };
        TreeNode root = createBST(pre, Integer.MIN_VALUE, Integer.MAX_VALUE, pre[0], pre.length - 1);
        // CreateBinaryTree tree = new CreateBinaryTree();
        System.out.println("\n inorder traversal");
        CreateBinaryTree.inorder(root);
        System.out.println("\n preorder traversal for BST creation using MIN-MAX method");
        CreateBinaryTree.preorder(root);
        System.out.println("\n preorder traversal for BST creation using STACK method");
        TreeNode root1 = createBSTUsingStack(pre, pre.length);
        CreateBinaryTree.preorder(root1);
    }

}