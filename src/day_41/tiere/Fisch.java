package day_41.tiere;

public class Fisch extends BaseTiere implements Swimmible{

    public Fisch(String name, int alter, String farbe) {
        super(name, alter, farbe);
    }

    @Override
    public void essen() {
        System.out.println(getName() + " isst Plankton");
    }

    @Override
    public void trinken() {
        System.out.println(getName() + " trinkt Wasser");
    }

    @Override
    public void schlafen() {
        System.out.println(getName() + " schlaeft im Wasser");
    }

    @Override
    public void schwimmen() {
        System.out.println(getName() + " schwimmt im Wasser");
    }

    @Override
    public void tauchen() {
        System.out.println(getName() + " taucht tief im Wasser");
    }
}
