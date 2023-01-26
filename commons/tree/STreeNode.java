package commons.tree;

public class STreeNode {
    public int data;
    public STreeNode left;
    public STreeNode right;
    public STreeNode parent;

    public STreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = null;
    }

}