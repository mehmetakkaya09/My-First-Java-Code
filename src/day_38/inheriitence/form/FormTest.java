package day_38.inheriitence.form;

public class FormTest {

    public static void main(String[] args) {

        Kreis kreis =new Kreis("Gelb", 3);

        kreis.zeichnen();
        System.out.println("kreis.flaecheBerechnen() = " + kreis.flaecheBerechnen());

        System.out.println(kreis);

        System.out.println("******************************************\n\n\n");

        Rechteck rechteck = new Rechteck("Blau", 5, 2);

        rechteck.zeichnen();

        System.out.println("rechteck.flaecheBerechnen() = " + rechteck.flaecheBerechnen());

        System.out.println(rechteck);


    }
}
