package tree.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

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

    private TreeNode findInorderSuccessor(TreeNode node) {
        while (node.left.left != null) {
            node = node.left;
        }

        return node;
    }

    /*
     * Binary search tree deletion ALGO first find the node to be deleted by
     * checking if element is part of left or right subtree then once you find it
     * then problem is divided in to 3 parts below 1.) node to be deleted is leaf
     * node i.e no child,2. ) node to be deleted is having one child(left or right),
     * 3.)node to be deleted is having two children(left and right both) The current
     * node must be one of the ancestors of the deleted node. Update the height of
     * the current node.Get the balance factor (left subtree height – right subtree
     * height) of the current node. If balance factor is greater than 1, then the
     * current node is unbalanced and we are either in Left Left case or Left Right
     * case. To check whether it is Left Left case or Left Right case, get the
     * balance factor of left subtree. If balance factor of the left subtree is
     * greater than or equal to 0, then it is Left Left case, else Left Right case.
     * If balance factor is less than -1, then the current node is unbalanced and we
     * are either in Right Right case or Right Left case. To check whether it is
     * Right Right case or Right Left case, get the balance factor of right subtree.
     * If the balance factor of the right subtree is smaller than or equal to 0,
     * then it is Right Right case, else Right Left case
     */
    private TreeNode delete(TreeNode root, int key) {
        if (root == null)
            return null;

        if (root.data > key) // node is in left subtree
            root.left = delete(root.left, key);
        else if (root.data < key) // node is in right subtree
            root.right = delete(root.right, key);
        else if (root.data == key) // node is found
            root = deleteNode(root, key);

        // If the tree had only one node then return
        if (root == null)
            return root;

        // STEP 2: UPDATE HEIGHT OF THE CURRENT NODE
        root.height = max(height(root.left), height(root.right)) + 1;

        // STEP 3: GET THE BALANCE FACTOR OF THIS NODE (to check whether
        // this node became unbalanced)
        int balance = getBalance(root);
        // If this node becomes unbalanced, then there are 4 cases
        // Left Left Case
        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);
        // Left Right Case
        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // right right case
        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);
        // right left case
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

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
    private TreeNode deleteNode(TreeNode root, int key) {
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

    void levelOrderTraversal(TreeNode node) {
        System.out.println("level order traversal of tree");
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        int level = node.height;
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();

            if (temp != null) {
                System.out.println("level -> " + (level - temp.height) + " " + temp.data);
                if (node.left != null)
                    q.add(temp.left);
                if (node.right != null)
                    q.add(temp.right);

            }

        }

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
        avl.levelOrderTraversal(avl.root);
        avl.root = avl.delete(avl.root, 25);
        avl.levelOrderTraversal(avl.root);
        avl.root = avl.delete(avl.root, 20);
        avl.levelOrderTraversal(avl.root);
        avl.root = avl.delete(avl.root, 10);
        avl.levelOrderTraversal(avl.root);
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