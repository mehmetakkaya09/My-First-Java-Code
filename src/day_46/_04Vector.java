package day_46;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class _04Vector {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> vector = new Vector<>();

        arrayList.add(1);
        vector.add(2);

        Thread t1 = new Thread(()->{
            int count = 0;
            System.out.println("Thread - 1");
            for (int i = 0; i < 1_000_000; i++) {
                arrayList.add(i);
                count++;
            }
            System.out.println("Thread 1 counter for adding : " + count);
        });

        Thread t2 = new Thread(()->{
            int count = 0;
            System.out.println("Thread - 2");
            for (int i = 0; i < 1_000_000; i++) {
                arrayList.add(i);
                count++;
            }
            System.out.println("Thread 2 counter for adding : " + count);
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        // weil ArrayList nicht syncronisch ist, konnten wir nicht alle Integers hinzufügen
        System.out.println(arrayList.size());

        System.out.println("*******************************************");
        System.out.println();


        t1 = new Thread(()->{
            int count = 0;
            System.out.println("Thread - 1");
            for (int i = 0; i < 1_000_000; i++) {
                vector.add(i);
                count++;
            }
            System.out.println("Thread 1 counter for adding : " + count);
        });

        t2 = new Thread(()->{
            int count = 0;
            System.out.println("Thread - 2");
            for (int i = 0; i < 1_000_000; i++) {
                vector.add(i);
                count++;
            }
            System.out.println("Thread 2 counter for adding : " + count);
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        // weil Vector syncronisch ist, konnten wir alle Integers hinzufügen
        // thread 1 wartet auf thread 2
        // thread 2 wartet auf thread 1
        // ,,, usw
        System.out.println(vector.size());








    }
}
