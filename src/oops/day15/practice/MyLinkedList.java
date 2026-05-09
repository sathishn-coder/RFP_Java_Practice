package oops.day15.practice;

public class MyLinkedList<K, V> {

    MyMapNode<K, V> head;

   
    public void add(K key, V value) {

        MyMapNode<K, V> temp = head;

        
        while (temp != null) {

            if (temp.key.equals(key)) {

                Integer count =
                        (Integer) temp.value;

                temp.value =
                        (V) Integer.valueOf(count + 1);

                return;
            }

            temp = temp.next;
        }

        
        MyMapNode<K, V> newNode =
                new MyMapNode<>(key, value);

        newNode.next = head;

        head = newNode;
    }

    
    public void remove(K key) {

        if (head == null) {

            return;
        }

        
        if (head.key.equals(key)) {

            head = head.next;

            return;
        }

        MyMapNode<K, V> temp = head;

        while (temp.next != null
                && !temp.next.key.equals(key)) {

            temp = temp.next;
        }

        if (temp.next != null) {

            temp.next = temp.next.next;
        }
    }

    // Display Linked List
    public void display() {

        MyMapNode<K, V> temp = head;

        while (temp != null) {

            System.out.println(
                    temp.key
                            + " : "
                            + temp.value);

            temp = temp.next;
        }
    }
}