package day_42.polymorphism;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Ich bin einen Hund und Ich mache einen wuf-wuf laut");
    }
}
