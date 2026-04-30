// File: BSTOperations.java
class BSTOperations {

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            // one child or no child
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            // two children
            Node min = findMin(root.right);
            root.data = min.data;
            root.right = delete(root.right, min.data);
        }
        return root;
    }

    Node findMin(Node root) {
        while (root.left != null)
            root = root.left;
        return root;
    }
}
