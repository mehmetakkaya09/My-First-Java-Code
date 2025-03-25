package day_46;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _03PerformanceTestLists {

    public static void main(String[] args) {

        int numberOfElements = 2_000_000;
        long startTime;
        long endTime;
        long duration;
        DecimalFormat df = new DecimalFormat("#,###");

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        //In ArrayList erstellen wir nur Daten und wir fügen diese Daten Ende von ArrayList hinzu
        System.out.println("Sequenziell Data hinzufügen..");
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            arrayList.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Duration for ArrayList : " + df.format(duration));

        System.out.println("---------------------------------------------");
        System.out.println();

        //In LinkedList erstellen wir für jede Data ein Node(Objekt, die frühere und nachste Data Adresse befinden) und wir fügen danach diese Daten Ende von ArrayList hinzu
        System.out.println("Sequenziell Data hinzufügen..");
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Duration for LinkedList : " + df.format(duration));

        System.out.println("---------------------------------------------");
        System.out.println();


        System.out.println("Sequenziell Data hinzufügen in bestimmte Index(Adresse)..");
        startTime = System.nanoTime();

        // binary search 300_000
        // 1_000_000
        // 500_000
        // 250_000
        // 325_000
        // 287_500
        arrayList.add(300,500);
        arrayList.add(300,500);
        arrayList.add(300,500);
        arrayList.add(300,500);
        arrayList.add(300,500);
        arrayList.add(300,500);

        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Duration for ArrayList : " + df.format(duration));

        System.out.println("---------------------------------------------");
        System.out.println();


        System.out.println("Sequenziell Data hinzufügen in bestimmte Index(Adresse)..");
        startTime = System.nanoTime();

        linkedList.add(300,500);
        linkedList.add(300,500);
        linkedList.add(300,500);
        linkedList.add(300,500);
        linkedList.add(300,500);
        linkedList.add(300,500);

        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Duration for LinkedList : " + df.format(duration));

        System.out.println("---------------------------------------------");
        System.out.println();




    }


}
