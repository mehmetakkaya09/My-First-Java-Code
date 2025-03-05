package day_35.mitarbeiter;

public class Main {

    public static void main(String[] args) {

        Mitarbeiter mitarbeiter = new Mitarbeiter();
        Entwickler entwickler = new Entwickler();
        Anwalt anwalt = new Anwalt();
        Sekretaer sekretaer = new Sekretaer();



        mitarbeiter.name = "John";
        //mitarbeiter.codeVeröffentlichen();

        entwickler.name = "George";
        entwickler.projektName = "Amazon";
        entwickler.gehaltErhöhen();
        entwickler.codeVeröffentlichen();

        anwalt.name = "Cindy";
        anwalt.fallStatus = "2. Sitzung";
        anwalt.urlaubNehmen(3);
        anwalt.gerichtBeitreten();

        sekretaer.name = "Michelle";
        sekretaer.büroName = "Haupt";
        sekretaer.kündigen();
        sekretaer.listeErstellen();
















    }
}
