package day_29;

public class StudentTest {

    public static void main(String[] args) {

        Student student1 = new Student("Jack");

        System.out.println("student1.name = " + student1.name);

        System.out.println("student1.klasse.toLowerCase() = " + student1.klasse.toLowerCase());

        System.out.println("student1 = " + student1);

        Student student2 = new Student();
        student2.klasse = "7-h";
        System.out.println("student2 = " + student2);

        Student student3 = new Student("Olga", 20, "Computer-1");

        student3.klasse = "Geschichte-2";

        System.out.println("student3 = " + student3);

    }

}
