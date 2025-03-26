package day_47;

import java.util.HashSet;
import java.util.Set;

public class _03HashSet {

    public static void main(String[] args) {

        // Es gibt keine Ordnung
        // Set erlaubt Duplikaten nicht
        // man kann nur ein "null" Wert speichern
        Set<String> names = new HashSet<>();

        names.add("Vadim");
        names.add("Vadim");
        names.add("Vadim");
        names.add("Blagoja");
        names.add("Blagoja");
        names.add("Süreyya");
        names.add("Süreyya");
        names.add("Süreyya");
        names.add("Süreyya");
        names.add("Süreyya");
        names.add("Süreyya");
        names.add("Mehmet");
        names.add("Mehmet");
        names.add("Mehmet");
        names.add("mehmet");

        names.forEach((name)->{
            System.out.println(name + " = " + name.hashCode());
        });

        Set<Integer> numbers = new HashSet<>();
        numbers.add(145);
        numbers.add(242);
        numbers.add(34);
        numbers.add(41);

        for (Integer number : numbers) {
            System.out.println(number);
        }


    }

}
