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

        System.out.println("kreis2.radius = " + kreis2.radius);
        kreis2.höhe = 5;

        System.out.println("kreis2.getFlaeche() = " + kreis2.getFlaeche());
        System.out.println("kreis2.getUmfang() = " + kreis2.getUmfang());
        System.out.println("kreis2.getVolumen() = " + kreis2.getVolumen());

        Kreis kreis3 = new Kreis(5,7);

        System.out.println("kreis3.höhe = " + kreis3.höhe);
        System.out.println("kreis3.radius = " + kreis3.radius);
        System.out.println("kreis3.getFlaeche() = " + kreis3.getFlaeche());
        System.out.println("kreis3.getUmfang() = " + kreis3.getUmfang());
        System.out.println("kreis3.getVolumen() = " + kreis3.getVolumen());
    }
}
