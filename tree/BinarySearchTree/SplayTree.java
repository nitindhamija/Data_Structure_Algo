package tree.BinarySearchTree;

import commons.tree.STreeNode;

/**
 * splay tree is practically better in performance as compared to AVL/RBtree
 * beacuase it splays i.e it makes the last accessed/inserted element at the
 * root or nearer to the root that way if that element is accessed again it will
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

    public void splay(STreeNode root, STreeNode node) {
        // STreeNode p = node.parent;
        // if parent node is null then only root node is there so no need to splay
        while (node.parent != null) {
            // check if parent of node is root then only one rotation either left or right
            // is required
            if (node.parent == root && node == root.left) {
                rightRotate(node.parent);
            } else if (node.parent == root && node == root.right) {
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

        splay(this.root, node);
    }

    /**
     * top down splaying approach first we splay for the key node then we delete the
     * root node i.e split operation and perform join operation of left and right
     * subtree
     */
    public void delete(int key) {
        // STreeNode node = new STreeNode(key);
        STreeNode node = null;
        // if root is null then tree is empty so simply return
        if (this.root == null) {
            System.out.println("tree is empty");
            return;
        }
        // find the key node if present or last accessed leaf node if not present
        node = findNode(this.root, key);
        // splay is to be done on last accessed leaf node if key is not present
        if (node.data != key) {
            System.out.println("key not present ->" + key);
            splay(this.root, node);
            return;
        }
        // splay around the key node
        splay(this.root, node);
        // split the root node
        STreeNode leftSubtree = node.left;
        STreeNode rightSubtree = node.right;
        if (leftSubtree != null)
            leftSubtree.parent = null;
        if (rightSubtree != null)
            rightSubtree.parent = null;
        node = null;

        // join the left and right subtree
        if (leftSubtree == null) {
            this.root = rightSubtree;// if only right subtree make it's top node root of tree
        } else {
            STreeNode temp = findNode(leftSubtree, key);// if left subtree is there then find max node from left
                                                        // subtree since key is root node at this time and each node in
                                                        // left subtree is smaller than key node so this function works
                                                        // here as it will return last accessed leaf node which is also
                                                        // the max node in left subtree otherwise you can also use the
                                                        // logic while(node.right!=null) node=node.right; as this will
                                                        // also return the max node of left subtree
            splay(leftSubtree, temp); // then splay left subtree around max node
            // add right subtree as right child of the max node
            if (rightSubtree != null) {
                temp.right = rightSubtree;
                rightSubtree.parent = temp;
            }
            this.root = temp; // make max node as the root of the tree
        }

    }

    // find the node to be deleted or if the node is not present then return last
    // accessed leaf node
    private STreeNode findNode(STreeNode root, int key) {
        STreeNode y = null;
        STreeNode x = root;

        while (x != null) {
            y = x;
            if (x.data == key)
                return x; // if key node is present then return it
            else if (x.data > key) {
                x = x.left;
            } else {
                x = x.right;
            }
        }

        return y; // if key node is not present the return last accessed leaf node
    }

    private STreeNode searchHelper(STreeNode node, int key) {
        if (node == null | key == node.data)
            return node;
        else if (key < node.data)
            return searchHelper(node.left, key);
        else
            return searchHelper(node.right, key);
    }

    public STreeNode search(int key) {
        STreeNode x = searchHelper(this.root, key);
        if (x != null) {
            splay(this.root, x);
        }
        return x;
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

    private void printHelper(STreeNode currPtr, String indent, boolean last) {
        // print the tree structure on the screen
        if (currPtr != null) {
            System.out.print(indent);
            if (last) {
                System.out.print("R----");
                indent += "     ";
            } else {
                System.out.print("L----");
                indent += "|    ";
            }

            System.out.println(currPtr.data);

            printHelper(currPtr.left, indent, false);
            printHelper(currPtr.right, indent, true);
        }
    }

    // print the tree structure on the screen
    public void prettyPrint() {
        System.out.println("\n");
        printHelper(this.root, "", true);
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
        sp.prettyPrint();
        sp.search(17);
        sp.prettyPrint();
        sp.search(13);
        sp.prettyPrint();
        sp.delete(16);
        sp.prettyPrint();
        sp.delete(11); // case key is not present
        sp.prettyPrint();
        sp.delete(10);// case to delete root node
        sp.prettyPrint();
        sp.delete(17);// case to leaf node and where right subtree get's null
        sp.prettyPrint();
        sp.delete(7);// case left subtree is null
        sp.prettyPrint();

    }

}