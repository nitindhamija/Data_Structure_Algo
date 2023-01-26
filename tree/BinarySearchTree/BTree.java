// package tree.BinarySearchTree;

// import commons.tree.BTreeNode;

// public class BTree {
// BTreeNode root;
// int minDeg;

// BTree(int md) {
// this.minDeg = md;
// }

// private void insert(int key) {
// if (this.root == null) {
// this.root = new BTreeNode(this.minDeg, true);
// this.root.keys[0] = key;
// this.root.num++;
// } else if (checkIfNodeFull(this.root)) {
// BTreeNode s = new BTreeNode(this.minDeg, false);
// // Make old root as child of new root
// s.children[0] = root;
// // Split the old root and move 1 key to the new root
// s.splitChild(0, root);
// } else {

// }
// }

// private boolean checkIfNodeFull(BTreeNode node) {
// return node.num == (2 * this.minDeg - 1);
// }

// public static void main(String[] args) {
// BTree bt = new BTree(2);
// bt.insert(10);
// }

// }
