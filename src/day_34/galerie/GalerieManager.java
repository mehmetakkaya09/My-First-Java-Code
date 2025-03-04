package day_34.galerie;

public class GalerieManager {

    public static void main(String[] args) {

        Auto auto1 = new Auto("Mercedes", "Schwarz", "E250");
        Auto auto2 = new Auto("Audi", "Weiss", "A6");
        Auto auto3 = new Auto("Tesla", "Blau", "Cybertruck");

        Galerie galerie1 = new Galerie("West", "New York");

        galerie1.addAuto(auto1);
        galerie1.addAuto(auto2);

        System.out.println(galerie1.getAutos());

        Galerie galerie2 = new Galerie("East", "Madrid");

        galerie2.addAuto(auto3);

        System.out.println(galerie2.getAutos());

        System.out.println("********************************");

        System.out.println(Galerie.getAlleAutos());


        System.out.println("auto2.getVIN() = " + auto2.getVIN());
        galerie1.deleteAutoByVIN(auto2.getVIN());

        System.out.println("galerie 1 ********************************");
        System.out.println(galerie1.getAutos());
        System.out.println(galerie1.getVerkaufteAutos());

        System.out.println("gemeinsame Galerien ********************************");
        System.out.println(Galerie.getAlleAutos());
        System.out.println(Galerie.getAlleVerkaufteAutos());

        galerie2.deleteAutoByVIN(auto3.getVIN());

        System.out.println("galerie 2 ********************************");
        System.out.println(galerie2.getAutos());
        System.out.println(galerie2.getVerkaufteAutos());

        System.out.println("gemeinsame Galerien ********************************");
        System.out.println(Galerie.getAlleAutos());
        System.out.println(Galerie.getAlleVerkaufteAutos());
    }

}
