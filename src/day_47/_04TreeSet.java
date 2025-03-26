package day_47;

import java.util.TreeSet;

public class _04TreeSet {

    public static void main(String[] args) {

        // erlaubt Duplikaten nicht
        // sortiert von Kleine zu Grosse
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(1234);
        numbers.add(1234);
        numbers.add(1234);
        numbers.add(1234);
        numbers.add(234);
        numbers.add(234);
        numbers.add(234);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(65);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);

        //numbers.get()


        System.out.println("numbers.first() = " + numbers.first());
        System.out.println("numbers.last() = " + numbers.last());

        System.out.println("numbers.pollFirst() = " + numbers.pollFirst());
        System.out.println("numbers.pollLast() = " + numbers.pollLast());


        System.out.println("numbers.subSet(60,90) = " + numbers.subSet(60, 90)); // zwischenheit

        System.out.println("numbers.headSet(90) = " + numbers.headSet(80));// kleiner als 80

        System.out.println("numbers.tailSet(80) = " + numbers.tailSet(80));// grosser als 80

        System.out.println("numbers.floor(85) = " + numbers.floor(85)); // gibt nacheste kleine Wert - 80

        System.out.println("numbers.ceiling(85) = " + numbers.ceiling(85)); // gibt nacheste grosse Wert - 90

        numbers.forEach(System.out::println);

    }
}
