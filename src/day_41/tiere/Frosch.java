package day_41.tiere;

public class Frosch extends BaseTiere implements Swimmible, Runnable {

    public Frosch(String name, int alter, String farbe) {
        super(name, alter, farbe);
    }

    @Override
    public void essen() {
        System.out.println(getName() + " isst Insekten");
    }

    @Override
    public void trinken() {
        System.out.println(getName() + " trinkt Wasser");
    }

    @Override
    public void schlafen() {
        System.out.println(getName() + " schlaeft im Teich");
    }

    @Override
    public void schwimmen() {
        System.out.println(getName() + " schwimmt im Wasser");
    }

    @Override
    public void tauchen() {
        System.out.println(getName() + " taucht unter im Wasser");
    }

    @Override
    public void laufen() {
        System.out.println(getName() + " lauft auf dem Land");
    }

    @Override
    public void springen() {
        System.out.println(getName() + " springt 3 Meter weit");
    }
}
