package oops.day14.practice;

public class LinkedList1<T> {

    Node1<T> head;

    Node1<T> tail;

    // Add at Beginning
    public void add(T data) {

        Node1<T> newNode =
                new Node1<>(data);

        if (head == null) {

            head = tail = newNode;

        } else {

            newNode.next = head;

            head = newNode;
        }
    }

    // Append at End
    public void append(T data) {

        Node1<T> newNode =
                new Node1<>(data);

        if (head == null) {

            head = tail = newNode;

        } else {

            tail.next = newNode;

            tail = newNode;
        }
    }

    // Pop First Node
    public T pop() {

        if (head == null) {

            return null;
        }

        T data = head.data;

        head = head.next;

        return data;
    }

    // Peek First Node
    public T peek() {

        if (head == null) {

            return null;
        }

        return head.data;
    }

    // Check Empty
    public boolean isEmpty() {

        return head == null;
    }

    // Display Linked List
    public void display() {

        Node1<T> temp = head;

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
