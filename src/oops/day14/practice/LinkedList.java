package oops.day14.practice;

public class LinkedList<T extends Comparable<T>> {

    Node<T> head;
    Node<T> tail;

    // Add Method
    public void add(T data) {

        Node<T> newNode =
                new Node<>(data);

        if (head == null) {

            head = tail = newNode;

        } else {

            newNode.next = head;

            head = newNode;
        }
    }

    // Append Method
    public void append(T data) {

        Node<T> newNode =
                new Node<>(data);

        if (head == null) {

            head = tail = newNode;

        } else {

            tail.next = newNode;

            tail = newNode;
        }
    }

    // Insert Between Nodes
    public void insertAfter(
            Node<T> previousNode,
            T data) {

        if (previousNode == null) {

            System.out.println(
                    "Previous Node Cannot Be Null");

            return;
        }

        Node<T> newNode =
                new Node<>(data);

        newNode.next =
                previousNode.next;

        previousNode.next = newNode;
    }

    // Pop First Element
    public T pop() {

        if (head == null) {

            return null;
        }

        T data = head.data;

        head = head.next;

        return data;
    }

    // Pop Last Element
    public T popLast() {

        if (head == null) {

            return null;
        }

        if (head == tail) {

            T data = head.data;

            head = tail = null;

            return data;
        }

        Node<T> temp = head;

        while (temp.next != tail) {

            temp = temp.next;
        }

        T data = tail.data;

        tail = temp;

        tail.next = null;

        return data;
    }

    // Search Node
    public Node<T> search(T key) {

        Node<T> temp = head;

        while (temp != null) {

            if (temp.data.equals(key)) {

                return temp;
            }

            temp = temp.next;
        }

        return null;
    }

    // Delete Specific Node
    public void delete(T key) {

        if (head == null) {

            return;
        }

        if (head.data.equals(key)) {

            head = head.next;

            return;
        }

        Node<T> temp = head;

        while (temp.next != null
                && !temp.next.data.equals(key)) {

            temp = temp.next;
        }

        if (temp.next != null) {

            temp.next = temp.next.next;
        }
    }

    // Size Method
    public int size() {

        int count = 0;

        Node<T> temp = head;

        while (temp != null) {

            count++;

            temp = temp.next;
        }

        return count;
    }

    // Display Linked List
    public void display() {

        Node<T> temp = head;

        while (temp != null) {

            System.out.print(
                    temp.data);

            if (temp.next != null) {

                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }
}
