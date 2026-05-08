package oops.day_11_12.practice;

public class Queue {
	Node front;
    Node rear;

    // Enqueue
    public void enqueue(String data) {

        Node node = new Node(data);

        if (rear == null) {

            front = rear = node;

            return;
        }

        rear.next = node;

        rear = node;
    }

    // Display Queue
    public void display() {

        Node temp = front;

        while (temp != null) {

            System.out.println(temp.data);

            temp = temp.next;
        }
    }

}
