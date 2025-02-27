package day_32;

public class LaenderTest {

    public static void main(String[] args) {

        Laender laender1 = new Laender("Deutschland", "D", 49);
        Laender laender2 = new Laender("Vereinigtes Königreich", "UK", 44);
        Laender laender3 = new Laender("Amerika", "USA", 1);
        Laender laender4 = new Laender("Türkei", "TR", 90);

        Laender.laenderZaehler++;
        laender2.dummyZaehler++;
        System.out.println(laender1);
        System.out.println(laender2);
        System.out.println(laender3);
        System.out.println(laender4);

        laender1.addLaender("Deutschland");
        laender2.addLaender("UK");
        laender3.addLaender("USA");
        laender4.addLaender("Türkei");

        System.out.println(laender1.instanceLaendern);
        System.out.println(laender1.staticLaendern);
        System.out.println(laender2.instanceLaendern);
        System.out.println(laender2.staticLaendern);
        System.out.println(laender3.instanceLaendern);
        System.out.println(laender3.staticLaendern);
        System.out.println(laender4.instanceLaendern);
        System.out.println(laender4.staticLaendern);


    }

}
