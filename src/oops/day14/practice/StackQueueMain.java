package oops.day14.practice;

public class StackQueueMain {

    public static void main(String[] args) {

        System.out.println(
                "Welcome to Stack and Queue Program");

        // ================= STACK =================

        Stack<Integer> stack =
                new Stack<>();

        // Push Elements
        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.println(
                "\nStack Elements:");

        stack.display();

        // Peek
        System.out.println(
                "\nPeek Element: "
                        + stack.peek());

        // Pop Till Empty
        System.out.println(
                "\nPopped Elements:");

        while (!stack.isEmpty()) {

            System.out.println(
                    stack.pop());
        }

        // ================= QUEUE =================

        Queue<Integer> queue =
                new Queue<>();

        // Enqueue Elements
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        System.out.println(
                "\nQueue Elements:");

        queue.display();

        // Dequeue
        System.out.println(
                "\nDequeued Element: "
                        + queue.dequeue());

        System.out.println(
                "\nQueue After Dequeue:");

        queue.display();
    }
}
