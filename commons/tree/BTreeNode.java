package commons.tree;

public class BTreeNode {
    public int[] keys; // keys of nodes
    public int MinDeg; // Minimum degree of B-tree node
    public BTreeNode[] children; // Child node
    public int num; // Number of keys of node
    public boolean isLeaf; // True when leaf node

    // Constructor
    public BTreeNode(int deg, boolean isLeaf) {

        this.MinDeg = deg;
        this.isLeaf = isLeaf;
        this.keys = new int[2 * this.MinDeg - 1]; // Node has 2*MinDeg-1 keys at most
        this.children = new BTreeNode[2 * this.MinDeg];
        this.num = 0;
    }
}