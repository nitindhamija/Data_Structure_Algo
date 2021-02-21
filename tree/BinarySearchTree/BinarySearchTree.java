package tree.BinarySearchTree;

import commons.tree.TreeNode;
import tree.BinaryTree.CreateBinaryTree;

public class BinarySearchTree {

    public BinarySearchTree() {

    }

    /*
     * Binary search tree insertion, terminal condition is checking the node for
     * null and if key is less then the root then it is part of left subtree else if
     * it is greater than root then it is part of right subtree
     */
    static TreeNode insert(TreeNode root, int key) {
        if (root == null)
            return new TreeNode(key);
        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);

        return root;
    }

    private static TreeNode findInorderSuccessor(TreeNode node) {
        while (node.left.left != null) {
            node = node.left;
        }

        return node;
    }

    /*
     * Binary search tree deletion ALGO first find the node to be deleted by
     * checking if element is part of left or right subtree then once you find it
     * then problem is divided in to 3 parts below 1.) node to be deleted is leaf
     * node i.e no child,2.) node to be deleted is having one child(left or right),
     * 3.)node to be deleted is having two children(left and right both)
     */
    private static TreeNode delete(TreeNode root, int key) {
        if (root == null)
            return null;

        if (root.data > key) // node is in left subtree
            root.left = delete(root.left, key);
        else if (root.data < key) // node is in right subtree
            root.right = delete(root.right, key);
        else if (root.data == key) // node is found
            root = deleteNode(root, key);

        return root;
    }

    /*
     * delete node based on no of children they are having 1.) node to be deleted is
     * leaf node i.e no child then simply return null 2.) node to be deleted is
     * having one child(left or right) then set child data to root and assign null
     * to root's left or right 3.)node to be deleted is having two children(left and
     * right both) in that case find inorder successor of node to replace root's
     * value with it
     * 
     */
    private static TreeNode deleteNode(TreeNode root, int key) {
        if (root.data == key && root.left != null && root.right != null) {
            TreeNode node = findInorderSuccessor(root.right);// find parent of inorder successor
            root.data = node.left.data; // replace root value with inorder successor's value
            node.left = null; // remove inorder successor from the tree
        } else if (root.data == key && root.left != null) {
            root.data = root.left.data; // replace root value with it's left child value
            root.left = null; // remove left child from the tree
        } else if (root.data == key && root.right != null) {
            root.data = root.right.data; // replace root value with it's right child value
            root.right = null; // remove right child from the tree
        } else {
            return null; // simply return null in case node is having no children i.e leaf node
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = insert(null, 11);
        root = insert(root, 6);
        root = insert(root, 8);
        root = insert(root, 19);
        root = insert(root, 4);
        root = insert(root, 10);
        root = insert(root, 5);
        root = insert(root, 17);
        root = insert(root, 43);
        root = insert(root, 49);
        root = insert(root, 31);
        // CreateBinaryTree tree = new CreateBinaryTree();
        CreateBinaryTree.inorder(root);
        System.out.println("\n root " + root.data);
        delete(root, 5); // delete leaf node
        CreateBinaryTree.inorder(root);
        System.out.println("\n root " + root.data);
        delete(root, 8); // delete node having 1 child
        CreateBinaryTree.inorder(root);
        System.out.println("\n root " + root.data);
        delete(root, 19); // delete node having 2 children
        CreateBinaryTree.inorder(root);
    }
}
