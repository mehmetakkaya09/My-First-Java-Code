package day_47;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class _02ArrayDequeue {

    public static void main(String[] args) {

        ArrayDeque<String> names = new ArrayDeque<>();

        names.add("Vadim");
        names.add("Süreyya");// add() method speichert die Data in letztem Platz
        names.push("Blagoja");// push() method speichert die Data in erstem Platz.
        names.addFirst("Mehmet");// addFist() method speichert die Data in erstem Platz.
        names.addLast("George");// addLast() method speichert die Data in letztem Platz.

        System.out.println("names.peek() = " + names.peek());
        System.out.println("names.poll() = " + names.poll());
        System.out.println("names.peekFirst() = " + names.peekFirst());// gibt erste element zurück
        System.out.println("names.pop() = " + names.pop());

        System.out.println("names.peekLast() = " + names.peekLast());
        System.out.println("names.pollLast() = " + names.pollLast()); // löscht letzte Element

        System.out.println("names.peekLast() = " + names.peekLast()); // gibt letzte element zurück

        names.clear(); // löscht alles
        try {
            System.out.println("names.removeLast() = " + names.removeLast()); // löscht letzte Element
        } catch (NoSuchElementException e) {
            System.out.println("Es gibt keine Element");
        }
        names.forEach(System.out::println);




    }
}
