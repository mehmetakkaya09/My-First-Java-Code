package day_46;

import java.util.EmptyStackException;
import java.util.Stack;

public class _05Stack {

    public static void main(String[] args) {

        // LIFO - SYNCRONISCH
        Stack<String> names = new Stack<>();

        // um eine neue Element hinzuzufügen, benutzen wir push() method anstatt add()
        names.push("Blagoja");
        names.push("Vadim");
        names.push("Süreyya");
        names.push("Mehmet");

        System.out.println(names);

        // Ich möchte ein Element löschen.

        // LIFO - Last in First out
        // Weil ich zuletzt "Mehmet" hinzugefügt habe, wurde erstmal "Mehmet" mit der pop() Method.
        names.pop();

        System.out.println(names);

        // Ich möchte meistens diese Element wissen, die ich löschen werde.

        System.out.println(names.peek());

        names.pop();

        System.out.println(names);

        names.push("Süreyya");

        System.out.println(names);

        System.out.println(names.peek());

        names.pop();

        System.out.println(names);

        System.out.println(names.peek());

        names.pop();

        System.out.println(names);

        System.out.println(names.peek());

        names.pop();
        System.out.println(names);

        try {
            System.out.println(names.peek());
        }catch (EmptyStackException ese){
            System.out.println("Es gibt keine Element in Stack");
        }

        names.push("John");

        System.out.println(names);

    }
}
