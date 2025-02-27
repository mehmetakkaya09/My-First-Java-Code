package day_32;

public class Motorrad {

    public static String marke = "Yamaha"; // yamaha
    public String modell;
    public int id; // weil id instance ist, kann das nur einmal erhöht werden
    public static int neueID = 1000;
    public String farbe;

    public Motorrad(String modell, String farbe){
        this.modell = modell;
        this.farbe = farbe;
        //id++;
        neueID++;
        this.id = neueID;
    }

    @Override
    public String toString() {
        return "Motorrad{" +
                "marke='" + marke + '\'' +
                "modell='" + modell + '\'' +
                ", id=" + id +
                ", farbe='" + farbe + '\'' +
                '}';
    }
}
