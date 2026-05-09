package oops.day14.practice;

public class Queue<T> {

    LinkedList1<T> linkedList =
            new LinkedList1<>();

    // Enqueue Method
    public void enqueue(T data) {

        linkedList.append(data);
    }

    // Dequeue Method
    public T dequeue() {

        return linkedList.pop();
    }

    // Display Queue
    public void display() {

        linkedList.display();
    }
}
