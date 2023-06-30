package homework230623_2.task2;

public class SymmetricTree {

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSym(root.left, root.right);
    }

    private static boolean isSym(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) {
            return true;
        }
        if (leftNode == null || rightNode == null) {
            return false;
        }
        return (leftNode.val == rightNode.val) && isSym(leftNode.left, rightNode.right)&&isSym(leftNode.right, rightNode.left);


    }
}
