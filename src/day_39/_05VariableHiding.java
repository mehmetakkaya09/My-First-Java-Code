package day_39;

public class _05VariableHiding {

    // instances gehört zur abhangige Klasse (_05VariableHiding)
    public String name;
    public int age;


    public _05VariableHiding(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Kinder3 extends _05VariableHiding {

    // Variable Hiding

    // Instance Variables kann man nicht überschreiben.
    // instances gehört zur abhangige Klasse (Kinder3)
    public String name;
    public int age;

    Kinder3(String name, int age) {
        super(name, age);
//        this.name = name;
//        this.age = age;
    }

    public void method() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
    //Informationen oder Kenntnisse beweisen
}