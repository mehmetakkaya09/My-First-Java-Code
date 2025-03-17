package day_41.tiere;

public class TiereTest {

    public static void main(String[] args) {


        Fisch fisch = new Fisch("Nemo", 2, "Orange");
        Frosch frosch = new Frosch("Kermit", 3, "Grün");
        Vogel vogel = new Vogel("Angry Birds", 1, "Rot");

        fisch.essen();
        fisch.trinken();
        fisch.schlafen();
        fisch.schwimmen();
        fisch.tauchen();
        System.out.println();

        frosch.essen();
        frosch.trinken();
        frosch.schlafen();
        frosch.schwimmen();
        frosch.tauchen();
        frosch.laufen();
        frosch.springen();
        System.out.println();

        vogel.essen();
        vogel.trinken();
        vogel.schlafen();
        vogel.fliegen();
        vogel.landen();


    }
}
