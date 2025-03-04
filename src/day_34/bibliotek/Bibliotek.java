package day_34.bibliotek;

import java.util.ArrayList;
import java.util.Arrays;

public class Bibliotek {

    private String name;
    private String adresse;
    private ArrayList<Buch> bücher;

    {
        bücher = new ArrayList();
    }

    public Bibliotek(String name, String adresse) {
        setName(name);
        setAdresse(adresse);
    }

    public void addBuch(Buch buch) {
        this.bücher.add(buch);
    }

    public void addBuch(Buch... bücher){
        for (Buch buch : bücher) {
            this.bücher.add(buch);
        }
        //this.bücher.addAll(Arrays.asList(bücher));
    }

    public void getBücher(){
        for (Buch buch : bücher) {
            System.out.println(buch.getTitle() + " -> " + buch.getAutor().getVorname() + " " + buch.getAutor().getNachname());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Bibliotek{" +
                "name='" + name + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
