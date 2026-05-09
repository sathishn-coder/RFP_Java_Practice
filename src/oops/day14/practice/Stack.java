package oops.day14.practice;

public class Stack<T> {

    LinkedList1<T> linkedList =
            new LinkedList1<>();

    // Push Method
    public void push(T data) {

        linkedList.add(data);
    }

    // Pop Method
    public T pop() {

        return linkedList.pop();
    }

    // Peek Method
    public T peek() {

        return linkedList.peek();
    }

    // Check Empty
    public boolean isEmpty() {

        return linkedList.isEmpty();
    }

    // Display Stack
    public void display() {

        linkedList.display();
    }
}
