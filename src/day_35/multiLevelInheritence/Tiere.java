package day_35.multiLevelInheritence;

public class Tiere {

    String name;
    String beine;
    String farbe;

    public void essen(String name) {
        System.out.println("Animal isst " + name);
    }

    public void trinken(String name) {
        System.out.println("Animal trinkt " + name);
    }

    @Override
    public String toString() {
        return "Tiere{" +
                "name='" + name + '\'' +
                ", beine='" + beine + '\'' +
                ", farbe='" + farbe + '\'' +
                '}';
    }
}
