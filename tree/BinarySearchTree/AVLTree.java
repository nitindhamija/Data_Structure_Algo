package tree.BinarySearchTree;

import commons.tree.TreeNode;

public class AVLTree {

    TreeNode root;

    // A utility function to get the height of the tree
    int height(TreeNode N) {
        if (N == null)
            return 0;

        return N.height;
    }

    // A utility function to get maximum of two integers
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Get Balance factor of node N
    int getBalance(TreeNode N) {
        if (N == null)
            return 0;

        return height(N.left) - height(N.right);
    }

    private TreeNode rightRotate(TreeNode y) {
        TreeNode x = y.left;// store left of node y to x
        TreeNode t = x.right;// store right child of left node of current node y
        // perform rotations
        x.right = y;
        y.left = t;
        // update heights of rotated nodes in order of earlier root and new root
        y.height = 1 + max(height(y.left), height(y.right));
        x.height = 1 + max(height(x.left), height(x.right));
        // return new root node after this rotation
        return x;
    }

    private TreeNode leftRotate(TreeNode y) {
        TreeNode x = y.right;// store left of node y to x
        TreeNode t = x.left;// store right child of left node of current node y
        // perform rotations
        x.left = y;
        y.right = t;
        // update heights of rotated nodes in order of earlier root and new root
        y.height = 1 + max(height(y.left), height(y.right));
        x.height = 1 + max(height(x.left), height(x.right));
        // return new root node after this rotation
        return x;
    }

    // private String getTab(int i) {
    // String tab = "";
    // switch (i) {
    // case 4:
    // tab = "\t\t\t\t";
    // break;
    // case 3:
    // tab = "\t\t\t";
    // break;
    // case 2:
    // tab = "\t\t";
    // break;
    // case 1:
    // tab = "\t";
    // break;
    // default:
    // System.out.println("height is too large");

    // }
    // return tab;

    // }

    // A utility function to print preorder traversal
    // of the tree.
    // The function also prints height of every node
    void preOrder(TreeNode node) {

        if (node != null) {
            System.out.print(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    /*
     * Following is the implementation for AVL Tree Insertion. The following
     * implementation uses the recursive BST insert to insert a new node. In the
     * recursive BST insert, after insertion, we get pointers to all ancestors one
     * by one in a bottom-up manner. So we don’t need parent pointer to travel up.
     * The recursive code itself travels up and visits all the ancestors of the
     * newly inserted node 1) Perform the normal BST insertion. 2) The current node
     * must be one of the ancestors of the newly inserted node. Update the height of
     * the current node 3) get the balance factor(left subtree height – right
     * subtree height) of the current node. 4.) If balance factor is greater than 1,
     * then the current node is unbalanced and we are either in Left Left case or
     * left Right case. To check whether it is left left case or not, compare the
     * newly inserted key with the key in left subtree root. 5) If balance factor is
     * less than -1, then the current node is unbalanced and we are either in Right
     * Right case or Right-Left case. To check whether it is Right Right case or
     * not, compare the newly inserted key with the key in right subtree root.
     */
    private TreeNode insert(TreeNode root, int key) {
        if (root == null)
            return new TreeNode(key, 1);
        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);

        root.height = 1 + max(height(root.left), height(root.right));// increment the current node height by 1

        int balance = getBalance(root); // check if current node is still balanced

        if (balance > 1 && key < root.left.data) // LL case which require right rotation to be balanced
            return rightRotate(root);

        if (balance > 1 && key > root.left.data) {// LR case which require left and right rotation to be balanced
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && key > root.right.data) // RR case which require right rotation to be balanced
            return leftRotate(root);

        if (balance < -1 && key < root.right.data) {// RL case which require right and left rotation to be balanced
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    public static void main(String[] args) {
        AVLTree avl = new AVLTree();
        avl.root = avl.insert(avl.root, 10);
        avl.root = avl.insert(avl.root, 20);
        avl.root = avl.insert(avl.root, 30);
        avl.root = avl.insert(avl.root, 40);
        avl.root = avl.insert(avl.root, 50);
        avl.root = avl.insert(avl.root, 25);

        System.out.println("Preorder traversal of constructed tree is : ");
        avl.preOrder(avl.root);

        // since avl tree is balance BST so it's worst case time complexity is O(h)=
        // O(log(n))

        // Time Complexity: The rotation operations (left and right rotate) take
        // constant time as only a few pointers are being changed there. Updating the
        // height and getting the balance factor also takes constant time. So the time
        // complexity of AVL insert remains same as BST insert which is O(h) where h is
        // the height of the tree. Since AVL tree is balanced, the height is O(Logn). So
        // time complexity of AVL insert is O(Logn)

        // Comparison with Red Black Tree
        // The AVL tree and other self-balancing search trees like Red Black are useful
        // to get all basic operations done in O(log n) time. The AVL trees are more
        // balanced compared to Red-Black Trees, but they may cause more rotations
        // during insertion and deletion. So if your application involves many frequent
        // insertions and deletions, then Red Black trees should be preferred. And if
        // the insertions and deletions are less frequent and search is the more
        // frequent operation, then AVL tree should be preferred over Red Black Tree.
    }

}