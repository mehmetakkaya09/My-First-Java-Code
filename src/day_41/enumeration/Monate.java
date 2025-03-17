package day_41.enumeration;

public enum Monate {

    JANUAR(1,"Winter"),
    FEBRUAR(2,"Winter"),
    MARZ(3,"Frühling"),
    APRIL(4,"Frühling"),
    MAI(5,"Frühling"),
    JUNE(6,"Sommer"),
    JULI(7,"Sommer"),
    AUGUST(8,"Sommer"),
    SEPTEMBER(9,"Autumn"),
    OKTOBER(10,"Autumn"),
    NOVEMBER(11,"Autumn"),
    DECEMBER(12,"Winter");

    private int nummerDerMonat;
    private String jahresZeit;

    Monate(int nummerDerMonat, String jahresZeit) {
        this.nummerDerMonat = nummerDerMonat;
        this.jahresZeit = jahresZeit;
    }

    public int getNummerDerMonat() {
        return nummerDerMonat;
    }

    public void setNummerDerMonat(int nummerDerMonat) {
        this.nummerDerMonat = nummerDerMonat;
    }

    public String getJahresZeit() {
        return jahresZeit;
    }

    public void setJahresZeit(String jahresZeit) {
        this.jahresZeit = jahresZeit;
    }

    public static boolean istGültigerMonat(String monat){
        for (Monate monate : Monate.values()) {
            if (monate.name().equalsIgnoreCase(monat)) {
                return true;
            }
        }
        return false;
    }

}
