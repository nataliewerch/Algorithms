package homework020623.task1;

public class BinaryTreeTest {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(4);
        tree.insert(5);
        tree.insert(7);
        tree.insert(8);
        tree.insert(2);
        tree.insert(9);

        tree.traversePreOrder();
    }
}
