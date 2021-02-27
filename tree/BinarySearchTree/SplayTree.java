package tree.BinarySearchTree;

import commons.tree.STreeNode;

/**
 * splay tree is practically better in performance as compared to AVL/RBtree
 * beacuase it splays i.e it makes the last accessed/inserted element at the
 * root or nearer to the roor that way if that element is accessed again it will
 * take either O(1) o(2) i.e less than o(log n) in caching spay tree should be
 * choosen
 * 
 * Can we do better than AVL or Red-Black trees in practical situations? Like
 * AVL and Red-Black Trees, Splay tree is also self-balancing BST. The main idea
 * of splay tree is to bring the recently accessed item to root of the tree,
 * this makes the recently searched item to be accessible in O(1) time if
 * accessed again. The idea is to use locality of reference (In a typical
 * application, 80% of the access are to 20% of the items). Imagine a situation
 * where we have millions or billions of keys and only few of them are accessed
 * frequently, which is very likely in many practical applications.
 * 
 * All splay tree operations run in O(log n) time on average, where n is the
 * number of entries in the tree. Any single operation can take Theta(n) time in
 * the worst case.
 */
public class SplayTree {
    STreeNode root;

    private STreeNode rightRotate(STreeNode y) {
        STreeNode x = y.left;// store left of node y to x
        STreeNode t = x.right;// store right child of left node of current node y
        // align parents as per the rotations
        // if right child of left child of node is not null then change it's parent to
        // node
        if (t != null) {
            t.parent = y;
        }
        x.parent = y.parent; // copy node's parent to left child's parent
        // if node's parent is null then this means it was root node so simple return
        // the rotated node
        if (y.parent == null)
            this.root = x;
        else if (y == y.parent.left) // if node is left child of it's parent update parent left to rotated node
            y.parent.left = x;
        else
            y.parent.right = x;// if node is right child of it's parent update parent left to rotated node

        y.parent = x;// update node's parent to rotated node

        // perform rotations
        x.right = y;
        y.left = t;

        // return new root node after this rotation
        return x;
    }

    private STreeNode leftRotate(STreeNode y) {
        STreeNode x = y.right;// store left of node y to x
        STreeNode t = x.left;// store right child of left node of current node y

        if (t != null)
            t.parent = y;
        x.parent = y.parent;
        if (y.parent == null)
            this.root = x;
        else if (y == y.parent.left)
            y.parent.left = x;
        else
            y.parent.right = x;

        y.parent = x;
        // perform rotations
        x.left = y;
        y.right = t;

        // return new root node after this rotation
        return x;
    }

    public void splay(STreeNode node) {
        // STreeNode p = node.parent;
        // if parent node is null then only root node is there so no need to splay
        while (node.parent != null) {
            // check if parent of node is root then only one rotation either left or right
            // is required
            if (node.parent == this.root && node == this.root.left) {
                rightRotate(node.parent);
            } else if (node.parent == this.root && node == this.root.right) {
                leftRotate(node.parent);
            } // zig zig rotations i.e 2 right rotations needed to make node as root
            else if (node == node.parent.left && node.parent == node.parent.parent.left) {
                rightRotate(node.parent.parent);
                rightRotate(node.parent);
            } // zag zag rotations i.e 2 left rotations needed
            else if (node == node.parent.right && node.parent == node.parent.parent.right) {
                leftRotate(node.parent.parent);
                leftRotate(node.parent);
            } // zig zag rotations i.e 1 right and 1 left rotations is required
            else if (node == node.parent.left && node.parent == node.parent.parent.right) {
                rightRotate(node.parent); // here call rotation on parent first
                leftRotate(node.parent); // here call rotation on grand parent but since earlier rotaion has changed
                                         // grandparent to parent of the node i.e node has moved upwards so node.parent
                                         // instead of node.parent.parent
            } // zag zig rotations i.e 1 left and 1 right rotations is required
            else {
                leftRotate(node.parent);
                rightRotate(node.parent);
            }

        }

    }

    public void insert(int key) {
        STreeNode node = new STreeNode(key);
        STreeNode y = null;
        STreeNode x = this.root;

        while (x != null) {
            y = x;
            if (x.data > key)
                x = x.left;
            else
                x = x.right;
        }
        node.parent = y;
        if (y == null)
            this.root = node;
        else if (y.data > node.data)
            y.left = node;
        else
            y.right = node;

        splay(node);
    }

    // A utility function to print preorder traversal
    // of the tree.
    // The function also prints height of every node
    void preOrder(STreeNode node) {

        if (node != null) {
            System.out.print(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public static void main(String[] args) {
        SplayTree sp = new SplayTree();
        sp.insert(15);
        sp.insert(10);
        sp.insert(17);
        sp.insert(7);
        sp.insert(13);
        sp.insert(16);
        sp.insert(14);
        sp.preOrder(sp.root);

    }

}