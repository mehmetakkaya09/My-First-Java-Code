package day_35.multiLevelInheritence;

public class Main {

    public static void main(String[] args) {

        Tiere tiere = new Tiere();
        Vögel vögel = new Vögel();
        Eagle eagle = new Eagle();

        tiere.farbe = "Weiss";

        vögel.farbe = "Grau";
        vögel.flügelGrösse = 2;
        vögel.trinken("Wasser");
        vögel.fliegen("Süd");

        eagle.farbe = "Schwarz";
        eagle.flügelGrösse = 5;
        eagle.art = "Gross";
        eagle.essen("Kaninchen");
        eagle.fliegen("Deutschland");
        eagle.jacken("Kaninchen");







    }


}
