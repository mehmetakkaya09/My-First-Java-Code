package day_48;

import java.util.*;

public class _02MapLoops {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();

        students.put("John", 9);
        students.put("Sally", 11);
        students.put("George", 10);
        students.put("Jennifer", 11);
        students.put("Chris", 9);
        students.put("Ahmet", 10);
        students.put("July", 12);

        System.out.println("students.keySet() = " + students.keySet());

        System.out.println("students.values() = " + students.values());

        for (String student : students.keySet()) {
            System.out.print(student + " | ");
        }

        Set<String> keySet = students.keySet();
        System.out.println();

        keySet.forEach((student)->{
            System.out.print(student + " | ");
        });

        System.out.println();

        for (Integer age : students.values()) {
            System.out.print(age + " | ");
        }


        Collection<Integer> ages = students.values();

        System.out.println();

        ages.forEach(age -> {
            System.out.print(age + " | ");
        });

        System.out.println();

        for (String key : keySet) {
            System.out.println(key + " : " + students.get(key));
        }
        System.out.println();

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " : " + student.getValue());
        }


    }


}
