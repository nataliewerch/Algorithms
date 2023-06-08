package homework020623.task1;

import org.w3c.dom.Node;

public class BinaryTree {

    private Node root;

    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = insertRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = insertRecursive(current.right, data);
        }
        return current;
    }

    public void traversePreOrder() {
        PreOrder(root);
    }

    private void PreOrder(Node node) {
        if (node != null) {
            System.out.println(node.data + " ");
            PreOrder(node.left);
            PreOrder(node.right);
        }
    }
}

