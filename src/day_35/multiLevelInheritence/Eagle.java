package day_35.multiLevelInheritence;

public class Eagle extends Vögel{

    String art;

    public void jacken(String tier) {
        System.out.println("Eagle jaeckt " + tier);
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "art='" + art + '\'' +
                ", flügelGrösse=" + flügelGrösse +
                ", name='" + name + '\'' +
                ", beine='" + beine + '\'' +
                ", farbe='" + farbe + '\'' +
                '}';
    }
}
