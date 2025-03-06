package day_36.person;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce(){
        System.out.println("Ich bin ein Person");
    }

    public void commonTask(){
        System.out.println("Eine gemeinsame Aufgabe für alle Personen wird ausgeführt");
    }



}
