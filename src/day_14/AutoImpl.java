package day_14;

public class AutoImpl {

    public static void main(String[] args) {

        Auto auto1 = new Auto();

        auto1.farbe = "Grau";
        auto1.marke = "Audi";
        auto1.antrieb = "Benzin";
        auto1.bauJahr = 2020;
        auto1.türNummer = 5;
        auto1.serienNummer = 512312;
        auto1.geschwindigkeit = 100;
        auto1.istDefekt = false;
        auto1.getInfo();
        auto1.fahren();

        System.out.println("auto1.geschwindigkeit = " + auto1.geschwindigkeit);
        auto1.beschleunigen();
        System.out.println("auto1.geschwindigkeit = " + auto1.geschwindigkeit);
        auto1.bremsen();
        System.out.println("auto1.geschwindigkeit = " + auto1.geschwindigkeit);

        System.out.println();
        System.out.println("-------------------");
        System.out.println();

        Auto auto2 = new Auto();

        auto2.farbe = "Blau";
        auto2.marke = "Tesla";
        auto2.antrieb = "Elektrisch";
        auto2.bauJahr = 2023;
        auto2.türNummer = 5;
        auto2.serienNummer = 512331;
        auto2.geschwindigkeit = 120;
        auto2.istDefekt = true;
        auto2.getInfo();
        auto2.fahren();

        System.out.println("auto2.geschwindigkeit = " + auto2.geschwindigkeit);
        auto2.bremsen();
        System.out.println("auto2.geschwindigkeit = " + auto2.geschwindigkeit);
        auto2.beschleunigen();
        auto2.beschleunigen();
        auto2.beschleunigen();
        System.out.println("auto2.geschwindigkeit = " + auto2.geschwindigkeit);


    }

}
