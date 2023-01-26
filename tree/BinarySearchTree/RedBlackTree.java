// package tree.BinarySearchTree;

// import commons.tree.RBTreeNode;
// import sun.awt.www.content.image.png;

// public class RedBlackTree {
// private static RBTreeNode root;

// static RBTreeNode checkParentSiblingNode(RBTreeNode pPNode, RBTreeNode pNode)
// {
// RBTreeNode sNode;
// if (pPNode.left.data == pNode.data)
// sNode = pPNode.right;
// else
// sNode = pPNode.left;

// if (sNode.color == 'R') {
// pPNode.left.color = 'B';
// pPNode.right.color = 'B';
// }
// if (pPNode.data != root.data && pPNode.color == 'B') {
// pPNode.color = 'R';
// }

// }

// static RBTreeNode insertBST(RBTreeNode pNode, RBTreeNode node, int key) {
// if (node == null)
// return new RBTreeNode(key, 'R');
// if (key < node.data)
// node.left = insertBST(node, node.left, key);
// else if (key > node.data)
// node.right = insertBST(node, node.right, key);

// if (node.color == 'B')
// return node;
// else {
// checkParentSiblingNode(pNode, node);
// }
// }

// public static RBTreeNode insert(RBTreeNode node, int data) {
// if (node == null) {
// node = new RBTreeNode(data, 'B');
// return node;
// }
// RBTreeNode temp = insertBST(node, data);

// }

// public static void main(String[] args) {
// RBTreeNode root = RedBlackTree.insert(null, 10);

// }
// }