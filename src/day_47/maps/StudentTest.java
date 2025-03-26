package day_47.maps;

import java.util.HashMap;
import java.util.Map;

public class StudentTest {

    public static void main(String[] args) {

        Map<Integer, Student> studentMap = new HashMap<>();

        Student student1 = new Student("Vadim", 1000, 90);
        Student student2 = new Student("Süreyya", 2000, 80);
        Student student3 = new Student("Blagoja", 3000, 95);

        studentMap.put(student1.getId(), student1);
        studentMap.put(student2.getId(), student2);
        studentMap.put(student3.getId(), student3);

        System.out.println("studentMap.get(1000) = " + studentMap.get(1000));
        System.out.println("studentMap.get(1000).getName() = " + studentMap.get(1000).getName());
        System.out.println("studentMap.get(3000).getGrade() = " + studentMap.get(3000).getGrade());
        System.out.println("studentMap.get(2000).getId() = " + studentMap.get(2000).getId());

        System.out.println("studentMap.get(3000).getName() = " + studentMap.get(3000).getName());



    }
}
