package day_28;

public class StudentTest {

    public static void main(String[] args) {

        Student student1 = new Student();
        System.out.println("student1.vorname.toLowerCase() = " + student1.vorname.toLowerCase());
        student1.vorname = "Judy";
        student1.nachname = "Jr";
        student1.age = 20;
        student1.id= 2000;

        System.out.println("student1.vorname = " + student1.vorname);

        Student student2 = new Student("Jack");
        System.out.println("student2.vorname.toLowerCase() = " + student2.vorname.toLowerCase());
        System.out.println("student2.nachname.toUpperCase() = " + student2.nachname.toUpperCase());


        Student student3 = new Student("Ketty", "Perry");
        System.out.println("student3.vorname.toLowerCase() = " + student3.vorname.toLowerCase());
        System.out.println("student3.nachname.toUpperCase() = " + student3.nachname.toUpperCase());
        System.out.println("student3.id = " + student3.id);

        Student student4 = new Student("George", "Michael", 40, 400);
        System.out.println("student4.vorname = " + student4.vorname);
        System.out.println("student4.nachname = " + student4.nachname);
        System.out.println("student4.age = " + student4.age);
        System.out.println("student4.id = " + student4.id);

        System.out.println("************************");
        student4.showInfo();
        System.out.println("************************");

        System.out.println(student4);
    }

}
