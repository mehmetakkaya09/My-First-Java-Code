package day_41.tiere;

public class Vogel extends BaseTiere implements Flyable{
    public Vogel(String name, int alter, String farbe) {
        super(name, alter, farbe);
    }

    @Override
    public void essen() {
        System.out.println(getName() + " isst Körner");
    }

    @Override
    public void trinken() {
        System.out.println(getName() + " trinkt Wasser");
    }

    @Override
    public void schlafen() {
        System.out.println(getName() + " schlaeft auf dem Ast");
    }

    @Override
    public void fliegen() {
        System.out.println(getName() + " fliegt in der Luft");
    }

    @Override
    public void landen() {
        System.out.println(getName() + " landet auf einem Baum");
    }
}
