package commons.tree;

public class RBTreeNode {
    public int data;
    public char color;
    public RBTreeNode left;
    public RBTreeNode right;

    public RBTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public RBTreeNode(int data, char color) {
        this.data = data;
        this.color = color;
        this.left = null;
        this.right = null;
    }
}