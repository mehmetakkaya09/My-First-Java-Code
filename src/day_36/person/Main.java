package day_36.person;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Person");
        Developer developer = new Developer("Developer");
        Tester tester = new Tester("Tester");
        Student student = new Student("Student");

        person.introduce();
        person.commonTask();


        developer.introduce();
        developer.commonTask();


        tester.introduce();
        tester.commonTask();


        student.introduce();
        student.commonTask();
        student.study();

    }


}
