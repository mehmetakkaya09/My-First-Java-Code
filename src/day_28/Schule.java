package day_28;

import java.util.ArrayList;

public class Schule {

    public String name;
    public Adresse adresse;
    public ArrayList<Student> studenten;

    public Schule(String name, Adresse adresse) {
        this.name = name;
        this.adresse = adresse;
        this.studenten = new ArrayList<>();
    }

    public Schule(String name, Adresse adresse, ArrayList<Student> studenten) {
        this(name,adresse);
        this.studenten = studenten;
    }

    public void studentHinzufügen(Student student) {
        studenten.add(student);
    }

    @Override
    public String toString() {
        return "Schule{" +
                "name='" + name + '\'' +
                ", adresse=" + adresse +
                ", studenten=" + studenten +
                '}';
    }
}
