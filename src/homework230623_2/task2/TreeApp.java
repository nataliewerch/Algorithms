package homework230623_2.task2;

public class TreeApp {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);

        System.out.println(SymmetricTree.isSymmetric(root));
    }
}
