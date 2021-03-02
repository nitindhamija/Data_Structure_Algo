package tree.BinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

import commons.tree.TreeNode;
import jdk.nashorn.api.tree.Tree;

public class CreateBinaryTree {
    TreeNode root;

    public CreateBinaryTree() {
        this.root = new TreeNode(1);
        this.root.left = new TreeNode(2);
        this.root.right = new TreeNode(3);
        this.root.left.left = new TreeNode(4);
        this.root.left.right = new TreeNode(5);
        this.root.right.left = new TreeNode(6);
        this.root.right.right = new TreeNode(7);
    }

    private static void InsertAtLevelOrder(TreeNode node, int key) {
        if (node == null) {
            node = new TreeNode(key);
            return;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(node);
        while (!q.isEmpty()) {
            node = q.poll();

            if (node.left == null) {
                node.left = new TreeNode(key);
                break;
            } else {
                q.add(node.left);
            }

            if (node.right == null) {
                node.right = new TreeNode(key);
                break;
            } else {
                q.add(node.right);
            }

        }

    }

    // recursive approach to inorder traversal
    public static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(" -> " + root.data);
        inorder(root.right);

    }

    // iterative approach to inorder traversal
    public static void inorderIterative(TreeNode root) {
        Stack<TreeNode> s1 = new Stack<TreeNode>();

        if (root == null) {
            return;
        }
        TreeNode temp = root;
        // s1.push(root);
        while (!s1.isEmpty() || temp != null) {
            while (temp != null) {
                s1.push(temp);
                temp = temp.left;
            }
            temp = s1.pop();
            System.out.print(temp.data + " -> ");
            temp = temp.right;

        }

    }

    // iterative approach to preorder traversal
    public static void preorderIterative(TreeNode root) {
        Stack<TreeNode> s1 = new Stack<TreeNode>();

        if (root == null) {
            return;
        }

        s1.push(root);
        while (!s1.isEmpty()) {
            TreeNode temp = s1.pop();
            System.out.print(temp.data);
            if (temp.right != null)
                s1.push(temp.right);
            if (temp.left != null)
                s1.push(temp.left);

        }

    }

    // iterative approach to postorder traversal
    public static void postorderIterative(TreeNode root) {
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        List<Integer> output = new ArrayList<Integer>();

        if (root == null) {
            return;
        }

        s1.push(root);
        while (!s1.isEmpty()) {
            TreeNode temp = s1.pop();
            output.add(temp.data);
            if (temp.left != null)
                s1.push(temp.left);
            if (temp.right != null)
                s1.push(temp.right);

        }
        Collections.reverse(output);
        System.out.println(output);

    }

    public static void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(" -> " + root.data);
        preorder(root.left);
        preorder(root.right);

    }

    public static void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(" -> " + root.data);

    }

    public static void main(String[] args) {
        CreateBinaryTree tree = new CreateBinaryTree();
        System.out.println("inorder traversal");
        CreateBinaryTree.inorder(tree.root);
        System.out.println("\ninorder traversal iterative");
        CreateBinaryTree.inorderIterative(tree.root);
        System.out.println("\npreorder traversal iterative");
        CreateBinaryTree.preorderIterative(tree.root);
        System.out.println("\npostorder traversal iterative");
        CreateBinaryTree.postorderIterative(tree.root);
        System.out.println("\npre-order traversal");
        CreateBinaryTree.preorder(tree.root);
        System.out.println("\npost-order traversal");
        CreateBinaryTree.postorder(tree.root);
        System.out.println("\ninserting an element at level order");
        CreateBinaryTree.InsertAtLevelOrder(tree.root, 8);
        System.out.println("\nbinary tree after insertion->inoreder traversal");
        CreateBinaryTree.inorder(tree.root);

    }
}