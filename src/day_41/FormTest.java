package day_41;

public class FormTest {

    public static void main(String[] args) {

        // Aus Interfaces kann man nicht ein Objekt erstellen
        //Form form = new Form();

        // Aus Abstract Klassen kann man nicht ein Objekt erstellen
        //BaseForm baseForm = new BaseForm();

        Kreis kreis = new Kreis("Blau",3);

        System.out.println("kreis.umfang() = " + kreis.umfang());
        System.out.println("kreis.flaeche() = " + kreis.flaeche());


    }

}
