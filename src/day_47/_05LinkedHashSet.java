package day_47;

import java.util.LinkedHashSet;

public class _05LinkedHashSet {

    public static void main(String[] args) {


        // erlaubt Duplikaten nicht
        // sortiert je nach Einfügung wie Lists
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();


        linkedHashSet.add("Aaa");
        linkedHashSet.add("Baa");
        linkedHashSet.add("Daa");
        linkedHashSet.add("Daa");
        linkedHashSet.add("Daa");
        linkedHashSet.add("Caa");
        linkedHashSet.add("Qaa");
        linkedHashSet.add("Qaa");
        linkedHashSet.add("Qaa");
        linkedHashSet.add("Kaa");
        linkedHashSet.add("aa");
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        linkedHashSet.add(null);

        linkedHashSet.forEach(System.out::println);




    }
}
