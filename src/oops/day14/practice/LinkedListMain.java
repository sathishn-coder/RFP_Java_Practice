package oops.day14.practice;

public class LinkedListMain {

    public static void main(String[] args) {

        System.out.println(
                "Welcome to Linked List Program");

        LinkedList<Integer> list =
                new LinkedList<>();

        // UC1 Add 70, 30, 56
        list.add(70);
        list.add(30);
        list.add(56);

        System.out.println(
                "\nLinked List After Add:");

        list.display();

        // UC2 Append
        LinkedList<Integer> appendList =
                new LinkedList<>();

        appendList.append(56);
        appendList.append(30);
        appendList.append(70);

        System.out.println(
                "\nLinked List After Append:");

        appendList.display();

        // UC3 Insert 30 Between 56 and 70
        LinkedList<Integer> insertList =
                new LinkedList<>();

        insertList.append(56);
        insertList.append(70);

        Node<Integer> node70 =
                insertList.search(56);

        insertList.insertAfter(node70, 30);

        System.out.println(
                "\nAfter Insert:");

        insertList.display();

        // UC4 Pop First
        insertList.pop();

        System.out.println(
                "\nAfter Pop First:");

        insertList.display();

        // UC5 Pop Last
        appendList.popLast();

        System.out.println(
                "\nAfter Pop Last:");

        appendList.display();

        // UC6 Search
        Node<Integer> found =
                appendList.search(30);

        if (found != null) {

            System.out.println(
                    "\nNode 30 Found");
        }

        // UC7 Insert 40 After 30
        appendList.insertAfter(found, 40);

        System.out.println(
                "\nAfter Insert 40:");

        appendList.display();

        // UC8 Delete 40
        appendList.delete(40);

        System.out.println(
                "\nAfter Delete 40:");

        appendList.display();

        System.out.println(
                "Size : "
                        + appendList.size());

        // UC9 Sorted Linked List
        SortedLinkedList<Integer> sortedList =
                new SortedLinkedList<>();

        sortedList.add(56);
        sortedList.add(30);
        sortedList.add(40);
        sortedList.add(70);

        System.out.println(
                "\nSorted Linked List:");

        sortedList.display();
    }
}
