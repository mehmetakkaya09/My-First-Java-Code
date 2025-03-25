package day_46.queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        //FIR - First in First out
        Queue<String> namesQueue = new LinkedList<>();

        namesQueue.add("Mehmet");
        namesQueue.add("Vadim");
        namesQueue.add("Süreyya");
        namesQueue.add("Blagoja");

        System.out.println(namesQueue);

        namesQueue.remove();

        System.out.println(namesQueue);

        System.out.println("namesQueue.peek() = " + namesQueue.peek());
        namesQueue.poll();

        System.out.println(namesQueue);

        System.out.println("***************************************");


        System.out.println("namesQueue.peek() = " + namesQueue.peek());
        namesQueue.poll();

        System.out.println(namesQueue);

        System.out.println("namesQueue.peek() = " + namesQueue.peek());
        namesQueue.poll();

        System.out.println(namesQueue);

        try {
            namesQueue.remove();
        } catch (NoSuchElementException nsee) {
            System.out.println("Es gibt keine Element in Queue");
        }
        namesQueue.poll();


    }


}
