package day_42.polymorphism;

import java.util.ArrayList;

public class AnimalTest {

    public static void main(String[] args) {

        //Animal animal = new Animal("Katze");

        Dog dog = new Dog("Hund");

        Cat cat = new Cat("Katze");

        Duck duck = new Duck("Ente");

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(dog);
        animals.add(cat);
        animals.add(duck);

        dog.sound();

        //non-polymorfik variable
        //dog = new Cat("Katze2");

        //polymorfik variable
        Animal      animal               = new Dog("Hund2");
  //referenztyp    objekt referenz        Objekttyp

        System.out.println("animal.getClass() = " + animal.getClass());
        System.out.println("animal.getClass().getSimpleName() = " + animal.getClass().getSimpleName());

        animal.sound();

        animal = new Cat("Katze2");
        System.out.println("animal.getClass().getSimpleName() = " + animal.getClass().getSimpleName());

        animal.sound();

        animal = new Duck("Ente2");
        System.out.println("animal.getClass().getSimpleName() = " + animal.getClass().getSimpleName());

        animal.sound();


        Animal animal1 = new Dog("Hund3");
        Animal animal2 = new Cat("Katze3");
        Animal animal3 = new Duck("Ente3");


        ArrayList<Animal> animalList = new ArrayList<>();

        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        System.out.println();
        System.out.println();

        for (Animal tier : animalList) {
            if (tier instanceof Dog) {
                tier.sound();
            }else if (tier instanceof Cat) {
                //Wir müssen downcasting machen weil scratch() method innerhalb Animal Class nicht befindet
                ((Cat) tier).scratch();
            }else if (tier instanceof Duck) {
                ((Duck) tier).fly();
            }
        }

        //Pattern Matching
        // kommt mit Java 17
        // man kann objectypen einfach mit eine temporar variable definieren
        // man soll auf jeden Fall kein downcasting machen.

        System.out.println();
        System.out.println();

        for (Animal tier : animalList) {
            if (tier instanceof Dog) {
                tier.sound();
            }else if (tier instanceof Cat katze) { // katze ist ein temporar variable um katze class methoden einfach zuzugreifen
                katze.scratch();
            }else if (tier instanceof Duck ente) {
                ente.fly();
            }
        }

    }
}
