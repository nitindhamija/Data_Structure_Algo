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
     * and right child but with updated {MIN...MAX} values
     */
    private static TreeNode createBST(int[] pre, int min, int max, int key, int size) {
        if (preIndex > size) // terminal condition to stop when all nodes are traversed from preorder
            return null;

        TreeNode root = null;
        if (key > min && key < max) { // to check if key is in the range {min... max}
            root = new TreeNode(key);// create the node
            preIndex++; // increment the index to select next node from preorder

            if (preIndex <= size) {
                root.left = createBST(pre, min, key, pre[preIndex], size);// update the range for the next node from
                                                                          // preorder to {min... key}
            }
            if (preIndex <= size) {
                root.right = createBST(pre, key, max, pre[preIndex], size);// update the range for the next node from
                // preorder to {key... max}
            }
        }
        return root;

    }

    /*
     * create BST using preorder with the help of a stack ALGO -> create an empty
     * stack, select the first value as root node and push it to stack, while stack
     * is not empty keep popping the top value and compare with next node from
     * preorder, if next node value is less than poped node value then make the next
     * node as left child of the popped node and put the node to stack and increment
     * the counter to select next value from preorder similarly if next node value
     * is greater than popped node then put it as right child of the popped node and
     * add this next node to stack, Complexity ->every item is pushed and popped
     * only once. So at most 2n push/pop operations are performed in the main loops
     * of constructTree(). Therefore, time complexity is O(n).
     */
    private static TreeNode createBSTUsingStack(int[] pre, int size) {
        int i = 0;
        TreeNode root = new TreeNode(pre[i++]);
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while (!stack.isEmpty() && i < size) {
            TreeNode node = stack.pop();
            if (node.data > pre[i]) {
                node.left = new TreeNode(pre[i]);
                stack.push(node.left);
                i++;
            } else {
                node.right = new TreeNode(pre[i]);
                stack.push(node.right);
                i++;
            }
        }
        return root;
    }

    public static void main(String[] args) {

        int[] pre = new int[] { 11, 6, 4, 5, 19, 17, 43, 31, 49 };
        TreeNode root = createBST(pre, Integer.MIN_VALUE, Integer.MAX_VALUE, pre[0], pre.length - 1);
        CreateBinaryTree tree = new CreateBinaryTree();
        System.out.println("\n inorder traversal");
        tree.inorder(root);
        System.out.println("\n preorder traversal for BST creation using MIN-MAX method");
        tree.preorder(root);
        System.out.println("\n preorder traversal for BST creation using STACK method");
        TreeNode root1 = createBSTUsingStack(pre, pre.length);
        tree.preorder(root1);
    }

}