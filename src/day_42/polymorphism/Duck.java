package day_42.polymorphism;

public class Duck extends Animal{

    public Duck(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Ich bin eine Ente und Ich mache quaken-quaken laut");
    }

    public void fly(){
        System.out.println("Ich bin eine Ente und Ich kann fliegen");
    }
}
