package oops.day15.practice;

public class HashTableMain {

    public static void main(String[] args) {

        System.out.println(
                "Welcome to Hash Table Program");

      

        String sentence =
                "To be or not to be";

        MyHashTable<String, Integer> hashTable =
                new MyHashTable<>();

     
        String[] words =
                sentence.toLowerCase().split(" ");

     
        for (String word : words) {

            hashTable.add(word, 1);
        }

        System.out.println(
                "\nWord Frequency for Sentence:");

        hashTable.display();

       

        String paragraph =
                "Paranoids are not paranoid because they are paranoid "
                        + "but because they keep putting themselves "
                        + "deliberately into paranoid avoidable situations";

        MyHashTable<String, Integer> paragraphTable =
                new MyHashTable<>();

        String[] paraWords =
                paragraph.toLowerCase().split(" ");

        for (String word : paraWords) {

            paragraphTable.add(word, 1);
        }

        System.out.println(
                "\nWord Frequency for Paragraph:");

        paragraphTable.display();

        

        paragraphTable.remove("avoidable");

        System.out.println(
                "\nAfter Removing 'avoidable':");

        paragraphTable.display();
    }
}
