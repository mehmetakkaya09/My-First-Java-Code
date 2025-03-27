package day_48;

import java.util.*;

public class _04MapValueTypes {

    public static void main(String[] args) {

        // Wir haben Klassen und innerhalb Klassen haben wir viele Studenten
        // klasse 3 hat July, Mark, Eve
        // klasse 4 hat Blagoja, Süreyya, Vadim

        String[] namesArray1 = {"July", "Mark", "Eve"};
        String[] namesArray2 = {"Blagoja", "Süreyya", "Vadim"};

        Map<Integer, String[]> map1 = new HashMap<>();
        map1.put(3,namesArray1);
        map1.put(4,namesArray2);

        map1.entrySet().forEach(entry ->{
            System.out.println(entry.getKey() + " = " + Arrays.toString(entry.getValue()));
        });

        System.out.println();

        ArrayList<String> namesList1 = new ArrayList<>(Arrays.asList(namesArray1));
        ArrayList<String> namesList2 = new ArrayList<>(Arrays.asList(namesArray2));

        Map<Integer, List<String>> map2 = new HashMap<>();
        map2.put(3,namesList1);
        map2.put(4,namesList2);

        map2.entrySet().forEach(entry ->{
            System.out.println(entry.getKey() + " = " + entry.getValue());
        });

        System.out.println();

        Map<Integer, String> klasse3 = new HashMap<>();
        klasse3.put(1, "July");
        klasse3.put(2, "Mark");
        klasse3.put(3, "Eve");

        Map<Integer, String> klasse4 = new HashMap<>();
        klasse4.put(4, "Blagoja");
        klasse4.put(5,"Süreyya");
        klasse4.put(6, "Vadim");

        Map<Integer, Map<Integer,String>> map3 = new HashMap<>();

        map3.put(3,klasse3);
        map3.put(4,klasse4);

        map3.entrySet().forEach(entry ->{
            System.out.println(entry.getKey() + " = " + entry.getValue());
        });

        System.out.println();

        List<Map<Integer, String>> classList = new ArrayList<>();
        classList.add(klasse3);
        classList.add(klasse4);

        classList.forEach(System.out::println);
        System.out.println("classList.get(0) = " + classList.get(0));
        System.out.println("classList.get(1) = " + classList.get(1));

        Map<List<String>, Integer> class5 = new HashMap<>();

        class5.put(namesList1,3);
        class5.put(namesList2,4);

        System.out.println();

        class5.entrySet().forEach(entry ->{
            System.out.println(entry.getKey() + " = " + entry.getValue());
        });

    }
}
