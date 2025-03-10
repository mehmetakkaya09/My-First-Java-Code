package day_37.constructor;

public class StudentTest {

    public static void main(String[] args) {

        Student student = new Student("Sureyya");
        Student student2 = new Student("Blagoja", 30);

        student2.geschlecht = 'M';
        student2.nummer = 5;
        student2.adresse = "Berlin";

        student.defaultField = 0;
        student.publicField = 9;
        student.protectedField = 8;
    }


}
