package tree.BinaryTree;

import commons.tree.TreeNode;

public class CreateBinaryTreeFromInPrePostOrder {
    private static int preIndex = 0;
    private static int postIndex = 0;

    private CreateBinaryTreeFromInPrePostOrder() {

    }

    /*
     * one way to implement Binary tree from inorder preorder ALGO-> root is taken
     * from inorder middle and the preorder is traversed left to right to create
     * node and it's left and right from in order indexes
     */
    public static TreeNode create(int in_start, int in_end, int[] in, int[] pre, TreeNode root) {
        if (in_end == in_start)
            return new TreeNode(in[in_start]);

        int rootIndex = (in_start + in_end) / 2;

        for (int i = 0; i < pre.length; i++) {
            if (in[rootIndex] == pre[i]) {
                root = new TreeNode(pre[i]);
                break;
            }

        }
        root.left = create(in_start, rootIndex - 1, in, pre, root.left);
        root.right = create(rootIndex + 1, in_end, in, pre, root.right);
        return root;

    }

    /*
     * ideal way to implement Binary tree from inorder preorder ALGO-> root is taken
     * from preorder(ROOT-LEFT-RIGHT) in left to right order and then inorder is
     * traversed left to right to fine the index of the root node to determine left
     * and right child of the node and then same function is called with
     * start,rootIndex-1 for left child and rootIndex+1,end for right child
     */
    public static TreeNode createInOrderPreOrder(int start, int end, int[] in, int[] pre) {
        if (start > end)
            return null;

        TreeNode node = new TreeNode(pre[preIndex++]);

        if (end == start)
            return node;
        int rootIndex = 0;

        for (int i = 0; i < in.length; i++) {
            if (node.data == in[i]) {
                {
                    rootIndex = i;
                    break;
                }
            }
        }
        node.left = createInOrderPreOrder(start, rootIndex - 1, in, pre);
        node.right = createInOrderPreOrder(rootIndex + 1, end, in, pre);
        return node;

    }

    /*
     * ideal way to implement Binary tree from inorder preorder ALGO-> root is taken
     * from postorder(LEFT-RIGHT-ROOT) in right to left order and then inorder is
     * traversed left to right to fine the index of the root node to determine left
     * and right child of the node and then same function is called with
     * start,rootIndex-1 for left child and rootIndex+1,end for right child
     */
    public static TreeNode createInOrderPostOrder(int start, int end, int[] in, int[] post) {
        if (start > end)
            return null;

        TreeNode node = new TreeNode(post[postIndex--]);

        if (end == start)
            return node;
        int rootIndex = 0;

        for (int i = 0; i < in.length; i++) {
            if (node.data == in[i]) {
                {
                    rootIndex = i;
                    break;
                }
            }
        }

        node.right = createInOrderPostOrder(rootIndex + 1, end, in, post);
        node.left = createInOrderPostOrder(start, rootIndex - 1, in, post);

        return node;

    }

    /*
     * we can't construct unique binary tree from only preorder and postorder, we
     * can only implement Full Binary tree from preorder postorder ALGO-> root is
     * taken from preorder(ROOT-LEFT-RIGHT) in left to right order and then
     * postorder is traversed left to right to fine the index of the root node to
     * determine left and right child of the node and then same function is called
     * with start,rootIndex-1 for left child and rootIndex+1,end for right child
     */
    public static TreeNode createPreOrderPostOrder(int start, int end, int[] post, int[] pre) {
        if (preIndex >= pre.length || start > end)
            return null;

        TreeNode node = new TreeNode(pre[preIndex++]);

        if (end == start || preIndex >= pre.length)
            return node;
        int rootIndex = 0;

        for (int i = 0; i < post.length; i++) {
            if (pre[preIndex] == post[i]) {
                rootIndex = i;
                break;
            }

        }
        if (start <= end) {
            node.left = createPreOrderPostOrder(start, rootIndex, post, pre);
            node.right = createPreOrderPostOrder(rootIndex + 1, end - 1, post, pre);
        }
        return node;

    }

    public static void main(String[] args) {

        int[] inOrder = new int[] { 4, 2, 5, 1, 6, 3, 7 };
        int[] preOrder = new int[] { 1, 2, 4, 5, 3, 6, 7 };
        int[] postOrder = new int[] { 4, 5, 2, 6, 7, 3, 1 };
        TreeNode root = create(0, inOrder.length - 1, inOrder, preOrder, new TreeNode(0));
        CreateBinaryTree tree = new CreateBinaryTree();
        tree.inorder(root);
        TreeNode root1 = createInOrderPreOrder(0, inOrder.length - 1, inOrder, preOrder);
        System.out.println("\n binary tree constructed from inorder preorder");
        tree.inorder(root1);
        postIndex = postOrder.length - 1;
        TreeNode root2 = createInOrderPostOrder(0, inOrder.length - 1, inOrder, postOrder);
        System.out.println("\n binary tree constructed from inorder postorder");
        tree.inorder(root2);
        preIndex = 0;
        TreeNode root3 = createPreOrderPostOrder(0, postOrder.length - 1, postOrder, preOrder);
        System.out.println("\n full binary tree constructed from preorder postorder");
        tree.inorder(root3);

    }
}