package day_36.person;

public class Student extends Person{

    public Student(String name) {
        //System.out.println();
        super(name);
    }

    public void introduce(){
        System.out.println("Ich bin ein Student");
    }

    public void study() {
        System.out.println("Ich lerne fleissig für Prüfungen");
    }
}
