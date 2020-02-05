package Java_Collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // ArrayList
        System.out.println("\nArrayList of Books:");
        System.out.println("------------------------------------------------------------------------");
        List arrList = new ArrayList();
        arrList.add("The Hobbit");
        arrList.add("The Fellowship Of The Ring");
        arrList.add("The Two Towers");
        arrList.add("The Return Of The King");
        arrList.add("The Silmarillion");

        Iterator books = arrList.iterator();
        while(books.hasNext()) {
            Object book = books.next();
            System.out.print(book + "\n");
        }

        System.out.print("\n \n");

        // Set
        System.out.println("HashSet Example. The set sorts itself!");
        System.out.println("------------------------------------------------------------------------");
        int oddSet[] = {7,9,13,11,3,1,5};
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 7; i++) {
            set.add(oddSet[i]);
        }
        System.out.println(set + "\n \n");

        //  Map
        System.out.println("HashMap Of First Lines. Hash maps map keys and values together in pairs.");
        System.out.println("------------------------------------------------------------------------");
        Map bookLines = new HashMap();
        bookLines.put("Fahrenheit 451", "It was a pleasure to burn.");
        bookLines.put("The Princess Bride", "This is my favorite book in all the world, though I have never read it.");
        bookLines.put("The Hobbit", "In a hole in the ground, there lived a hobbit.");
        bookLines.put("Peter Pan", "All children, except on, grow up.");
        bookLines.put("Moby Dick", "Call Me Ishmael");

        bookLines.forEach((key, value) -> System.out.println("Book: " + key
                + ". First Line: " + value));

        // Queue
        System.out.println("\n\nQueue Example. Queues keep elements in the order you add them.");
        System.out.println("------------------------------------------------------------------------");
        Queue<String> sentence = new LinkedList<>();

        sentence.add("Does");
        sentence.add("This");
        sentence.add("Sentence");
        sentence.add("Make");
        sentence.add("Sense?");

        sentence.forEach(word -> {
            System.out.print(word + " ");
        });

        // Tree
        System.out.println("\n\n\nTreeSet Example. Tree Sets have their values sorted from least to greatest.");
        System.out.println("------------------------------------------------------------------------");
        TreeSet ratings = new TreeSet();
        ratings.add("Less");
        ratings.add("Better");
        ratings.add("Worse");
        ratings.add("Best");
        ratings.add("Worst");
        Iterator list = ratings.iterator();
        while(list.hasNext()) {
            Object rating = list.next();
            System.out.print(rating + "\n");
        }

    }
}
