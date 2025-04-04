package day_40.kuchen;

import java.util.ArrayList;

public class KuchenFabrik {

    public String name;

    private ArrayList<BaseKuchen> kuchens;

    public KuchenFabrik(String name) {
        this.name = name;
        kuchens = new ArrayList<>();
    }

    public void addKuchen(BaseKuchen kuchen) {
        kuchens.add(kuchen);
    }
    public void kuchenInfo(){
        int schokoladenKuchen = 0;
        int einfacherKuchen = 0;
        int walnussKuchen = 0;
        for(BaseKuchen kuchen : kuchens){
            if (kuchen instanceof SchokoladenKuchen) {
                schokoladenKuchen++;
            }else if (kuchen instanceof EinfacherKuchen) {
                einfacherKuchen++;
            } else if (kuchen instanceof WalnussKuchen) {
                walnussKuchen++;
            }
        }
        System.out.println("Schokoladen Kuchen anzahl: " + schokoladenKuchen);
        System.out.println("Einfacher Kuchen anzahl: " + einfacherKuchen);
        System.out.println("Walnuss Kuchen anzahl: " + walnussKuchen);
    }
}
