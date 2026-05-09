package oops.day14.practice;

public class SortedLinkedList<T extends Comparable<T>> {

    Node<T> head;

    // Add in Sorted Order
    public void add(T data) {

        Node<T> newNode =
                new Node<>(data);

        // Empty List
        if (head == null
                || head.data.compareTo(data) > 0) {

            newNode.next = head;

            head = newNode;

            return;
        }

        Node<T> temp = head;

        while (temp.next != null
                && temp.next.data.compareTo(data) < 0) {

            temp = temp.next;
        }

        newNode.next = temp.next;

        temp.next = newNode;
    }

    // Display List
    public void display() {

        Node<T> temp = head;

        while (temp != null) {

            System.out.print(temp.data);

            if (temp.next != null) {

                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }
}
