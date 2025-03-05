package day_35.mitarbeiter;

public class Sekretaer extends Mitarbeiter{

    String büroName;
    int managerID;

    public void berichtErstellen() {
        System.out.println("Sekretaer hat einen Bericht erstellt");
    }

    public void listeErstellen() {
        System.out.println("Sekretaer hat eine Liste erstellt");
    }


}
