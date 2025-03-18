package day_42.polymorphism;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Ich bin eine Katze und Ich mache einen miau-miau laut");
    }

    public void scratch(){
        System.out.println("Ich bin eine Katze und Ich kratze.");
    }
}
