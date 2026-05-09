package oops.day15.practice;

public class MyHashTable<K, V> {

    
    private final int SIZE = 10;

    
    MyLinkedList<K, V>[] table;

    public MyHashTable() {

        table =
                new MyLinkedList[SIZE];

        for (int i = 0; i < SIZE; i++) {

            table[i] =
                    new MyLinkedList<>();
        }
    }

 
    private int getIndex(K key) {

        return Math.abs(
                key.hashCode()) % SIZE;
    }

  
    public void add(K key, V value) {

        int index = getIndex(key);

        table[index].add(key, value);
    }

  
    public void remove(K key) {

        int index = getIndex(key);

        table[index].remove(key);
    }

   
    public void display() {

        for (int i = 0; i < SIZE; i++) {

            if (table[i] != null) {

                table[i].display();
            }
        }
    }
}
