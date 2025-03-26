package day_47;

import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class _01PriorityQueue {

    public static void main(String[] args) {

        Queue<Integer> numbers = new PriorityQueue<>();

        numbers.add(100);
        numbers.add(4);
        numbers.add(50);
        numbers.add(10);
        numbers.add(-7);
        numbers.add(0);

        // Java ordnet diese Queue automatisch je nach ASCII TABLE
        // Nach diese Ordnung funktioniert FIFO logik.

        System.out.println(numbers);

        if (numbers.peek() == -7) {
            System.out.println("If Condition : " + numbers.peek());
            numbers.remove();
        }

        System.out.println("numbers.peek() = " + numbers.peek()); // Welche Element wird zunachst gelöscht werden. Wir können nur zunachst löschende Elementinformation lernen.
        System.out.println("numbers.poll() = " + numbers.poll()); // Löscht die nachste(Erste) Element.

        System.out.println("numbers.peek() = " + numbers.peek());
        System.out.println("numbers.poll() = " + numbers.poll());


        System.out.println("numbers.peek() = " + numbers.peek());
        System.out.println("numbers.poll() = " + numbers.poll());


        System.out.println("numbers.peek() = " + numbers.peek());
        System.out.println("numbers.poll() = " + numbers.poll());


        System.out.println("numbers.peek() = " + numbers.peek());
        System.out.println("numbers.poll() = " + numbers.poll());


        System.out.println("numbers.peek() = " + numbers.peek());
        try {
            System.out.println("numbers.poll() = " + numbers.remove());
        } catch (NoSuchElementException nsee) {
            System.out.println("Es gibt kein Element");
        }

        Queue<String> names = new PriorityQueue<>();

        // natural order - Ascii Table order
        // Grosse Buchstaben kommt immer vor der kleinen Buchstaben
        names.add("Süreyya");
        names.add("Süreyya");
        names.add("blagoja");
        names.add("Boris");
        names.add("Vadim");
        names.add("Mehmet");
        names.add("9");
        names.add(".");
        names.add(":");
        names.add("!");

        names.forEach(System.out::println);

        System.out.println("names.peek() = " + names.peek());
        System.out.println("names.poll() = " + names.poll());

    }


}
