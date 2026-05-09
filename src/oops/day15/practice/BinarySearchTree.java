package oops.day15.practice;

public class BinarySearchTree<K extends Comparable<K>> {

    private INode<K> root;

    // Add Node Method
    public void add(K key) {

        root = addRecursive(root, key);
    }

    // Recursive Insert
    private INode<K> addRecursive(
            INode<K> current,
            K key) {

        if (current == null) {

            return new MyBinaryNode<>(key);
        }

        // Compare Keys
        if (key.compareTo(current.getKey()) < 0) {

            current.setLeft(
                    addRecursive(
                            current.getLeft(),
                            key));

        } else if (key.compareTo(current.getKey()) > 0) {

            current.setRight(
                    addRecursive(
                            current.getRight(),
                            key));
        }

        return current;
    }

    // Size Method
    public int size() {

        return sizeRecursive(root);
    }

    // Recursive Size
    private int sizeRecursive(INode<K> node) {

        if (node == null) {

            return 0;
        }

        return 1
                + sizeRecursive(node.getLeft())
                + sizeRecursive(node.getRight());
    }

    // Search Method
    public boolean search(K key) {

        return searchRecursive(root, key);
    }

    // Recursive Search
    private boolean searchRecursive(
            INode<K> current,
            K key) {

        if (current == null) {

            return false;
        }

        // Key Found
        if (key.compareTo(current.getKey()) == 0) {

            return true;
        }

        // Search Left
        if (key.compareTo(current.getKey()) < 0) {

            return searchRecursive(
                    current.getLeft(),
                    key);
        }

        // Search Right
        return searchRecursive(
                current.getRight(),
                key);
    }

    // Inorder Traversal
    public void display() {

        inorder(root);

        System.out.println();
    }

    private void inorder(INode<K> node) {

        if (node != null) {

            inorder(node.getLeft());

            System.out.print(
                    node.getKey() + " ");

            inorder(node.getRight());
        }
    }
}
