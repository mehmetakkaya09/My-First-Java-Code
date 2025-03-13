package day_40.form;

public class FormTest {

    public static void main(String[] args) {

        Kreis kreis = new Kreis(3);

        System.out.println("kreis.umfang() = " + kreis.umfang());

        System.out.println("kreis.flaeche() = " + kreis.flaeche());
        //Form form = new Form("Kreis");

        Rechteck rechteck = new Rechteck(2,6);
        System.out.println("rechteck.umfang() = " + rechteck.umfang());
        System.out.println("rechteck.flaeche() = " + rechteck.flaeche());
    }


}
