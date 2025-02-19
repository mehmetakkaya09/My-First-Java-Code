package day_27;

public class KreisTest {

    public static void main(String[] args) {

        Kreis kreis = new Kreis();
        kreis.höhe = 1;
        System.out.println("kreis.höhe = " + kreis.höhe);

        System.out.println("kreis.radius = " + kreis.radius);

        System.out.println("kreis.getFlaeche() = " + kreis.getFlaeche());
        System.out.println("kreis.getUmfang() = " + kreis.getUmfang());
        System.out.println("kreis.getVolumen() = " + kreis.getVolumen());

        Kreis kreis2 = new Kreis(2);
        //kreis2.radius = 8;
        kreis2.setRadius(8);

        System.out.println("kreis2.radius = " + kreis2.radius);
        //kreis2.höhe = 5;
        kreis2.setHöhe(5);

        System.out.println("kreis2.getFlaeche() = " + kreis2.getFlaeche());
        System.out.println("kreis2.getUmfang() = " + kreis2.getUmfang());
        System.out.println("kreis2.getVolumen() = " + kreis2.getVolumen());

        Kreis kreis3 = new Kreis(5,7);

        System.out.println("kreis3.getRadius() = " + kreis3.getRadius());
        System.out.println("kreis3.getHöhe() = " + kreis3.getHöhe());
        System.out.println("kreis3.getFlaeche() = " + kreis3.getFlaeche());
        System.out.println("kreis3.getUmfang() = " + kreis3.getUmfang());
        System.out.println("kreis3.getVolumen() = " + kreis3.getVolumen());
    }
}
