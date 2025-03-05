package day_35.mitarbeiter;

public class Mitarbeiter {

    String name;
    int mitarbeiterID;
    double gehalt;
    int arbeitsstunden;
    int überstunden;
    int urlaubtage;
    char geschlecht;

    public void gehaltErhöhen(){
        System.out.println("Gehaltssteigerung beantragt!");
    }

    public void urlaubNehmen(int tage){
        System.out.println("Urlaub für " +tage + " Tage beantragt!");
    }

    public void kündigen() {
        System.out.println("Kündigung beantragt!");
    }


}
