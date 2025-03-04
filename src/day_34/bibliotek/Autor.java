package day_34.bibliotek;

import java.util.ArrayList;

public class Autor {

    private String vorname;
    private String nachname;
    private int autorID;
    private static int id;
    private ArrayList<Buch> büchern;

    static {
        id = 5000;
    }

    {
        autorID = id++;
        vorname = "unbekant";
        nachname = "unbekant";
        büchern = new ArrayList<>();
    }

    public Autor(String vorname, String nachname){
        setVorname(vorname);
        setNachname(nachname);
    }

    public void addBuch(Buch buch){
        büchern.add(buch);
    }

    public void getBüchern(){
        for (Buch buch : büchern) {
            System.out.println(buch.getTitle());
        }
    }

    // benutzer kann autorID einlesen aber nicht verandern.
    public int getAutorID() {
        return autorID;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        vorname = vorname.trim();
        if (vorname.length() > 1) {
            for (int i = 0; i < vorname.length(); i++) {
                if (!Character.isLetterOrDigit(vorname.charAt(i))) {
                    return;
                }
            }
        }else {
            return;
        }
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        nachname = nachname.trim();
        if (nachname.length() > 1) {
            for (int i = 0; i < nachname.length(); i++) {
                if (!Character.isLetterOrDigit(nachname.charAt(i))) {
                    return;
                }
            }
        }else {
            return;
        }
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", autorID=" + autorID +
                '}';
    }
}
