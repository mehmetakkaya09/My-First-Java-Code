package day_46;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _02LinkedList {
    public static void main(String[] args) {

        List<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        colors.add("orange");
        colors.add("violet");
        colors.add("violet"); // Lists erlauben Duplikaten

        System.out.println(colors);
        System.out.println("*****************************************");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("color: " + colors.get(i));
        }

        System.out.println("*****************************************");
        for (String color : colors) { // advanced loop, enhanced loop, for each loop
            System.out.println("each color: " + color);
        }
        System.out.println("*****************************************");

        colors.forEach( // lambda
                (color) -> System.out.println("lambda color: " + color)
        );

        System.out.println("*****************************************");


        colors.forEach((color) -> {
            color = color.toUpperCase();
            System.out.println("lambda  UPPER color: " + color);
        });

        System.out.println("***************************************");


        colors.forEach(System.out::println);

//        for (String color : colors) {
//            if (color.equals("red")) {
//                colors.remove(color);
//            }
//        }

        Iterator<String> iterator = colors.iterator();

//        System.out.println("iterator.hasNext() = " + iterator.hasNext());
//
//        System.out.println("iterator.next() = " + iterator.next());
//        System.out.println("iterator.next() = " + iterator.next());
//        System.out.println("iterator.next() = " + iterator.next());
//        System.out.println("iterator.next() = " + iterator.next());
//
//        System.out.println("iterator.hasNext() = " + iterator.hasNext());
        System.out.println("*******************************");
        while (iterator.hasNext()) {
            if (iterator.next().equals("violet")) {
                iterator.remove();
            }
        }

        System.out.println(colors);
        System.out.println("*******************************");




    }

}
