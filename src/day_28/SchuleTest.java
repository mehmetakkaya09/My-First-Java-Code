package day_28;

import java.util.ArrayList;
import java.util.Arrays;

public class SchuleTest {

    public static void main(String[] args) {

        Adresse schule1Adresse = new Adresse("Bayern", "München", "Haupt", 2467);

        Schule schule1 = new Schule("Süd Schule", schule1Adresse);

        Student student1 = new Student("George", "Michael", 40, 400);

        schule1.studentHinzufügen(student1);

        System.out.println(schule1);

        Student student2 = new Student("Ahmet", "Yılmaz", 22, 500);

        Student student3 = new Student("Alina", "Stark", 23, 600);

        // erstellen Sie eine neue Schule mit einer neuen Adresse und mit zwei Studenten

        ArrayList<Student> studenten = new ArrayList<>(Arrays.asList(student2,student3));

        Adresse schule2Adresse = new Adresse("BW", "Stuttgart", "Bahnhof", 5267);

        Schule schule2 = new Schule("Bundes Schule", schule2Adresse, studenten);

        System.out.println(schule2);


    }

}
