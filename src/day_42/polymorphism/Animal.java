package day_42.polymorphism;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printAnimalName() {
        System.out.println("Eltern Klasse method");
        System.out.println("Name: " + name);
    }

    public abstract void sound();
}
