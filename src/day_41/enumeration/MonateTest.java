package day_41.enumeration;

public class MonateTest {

    public static void main(String[] args) {

        Monate monate = Monate.APRIL;

        System.out.println("monate.name() = " + monate.name());
        System.out.println("monate.getJahresZeit() = " + monate.getJahresZeit());
        System.out.println("monate.getNummerDerMonat() = " + monate.getNummerDerMonat());


        System.out.println("Monate.istGültigerMonat(\"september\") = " + (Monate.istGültigerMonat("september")));
        System.out.println("Monate.istGültigerMonat(\"montag\") = " + (Monate.istGültigerMonat("montag")));
    }
}
