package tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

import commons.tree.TreeNode;

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

    public static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(" -> " + root.data);
        inorder(root.right);

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