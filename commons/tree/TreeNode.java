package DS_ALGO_PROG.commons.tree;

public class TreeNode {
    public int data, height;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public TreeNode(int data, int height) {
        this.data = data;
        this.height = height;
        this.left = null;
        this.right = null;
    }
}