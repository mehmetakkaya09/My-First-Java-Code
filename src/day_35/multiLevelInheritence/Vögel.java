package day_35.multiLevelInheritence;

public class Vögel extends Tiere{

    double flügelGrösse;

    public void fliegen(String ort) {
        System.out.println("Vögel fliegt nach " + ort);
    }

    @Override
    public String toString() {
        return "Vögel{" +
                "flügelGrösse=" + flügelGrösse +
                ", name='" + name + '\'' +
                ", beine='" + beine + '\'' +
                ", farbe='" + farbe + '\'' +
                '}';
    }
}
