package oops.day15.practice;

public class BSTMain {

    public static void main(String[] args) {

        System.out.println(
                "Welcome to Binary Search Tree Program");

        // Create BST
        BinarySearchTree<Integer> bst =
                new BinarySearchTree<>();

        // UC1 Add Nodes
        bst.add(56);
        bst.add(30);
        bst.add(70);

        System.out.println(
                "\nBST After Adding 56, 30, 70:");

        bst.display();

        // UC2 Create Full Binary Tree
        bst.add(22);
        bst.add(40);
        bst.add(60);
        bst.add(95);
        bst.add(11);
        bst.add(65);
        bst.add(3);
        bst.add(16);
        bst.add(63);
        bst.add(67);

        System.out.println(
                "\nComplete Binary Tree:");

        bst.display();

        // Size of BST
        System.out.println(
                "\nSize of BST : "
                        + bst.size());

        // UC3 Search 63
        boolean found =
                bst.search(63);

        if (found) {

            System.out.println(
                    "\n63 Found in BST");

        } else {

            System.out.println(
                    "\n63 Not Found in BST");
        }
    }
}
