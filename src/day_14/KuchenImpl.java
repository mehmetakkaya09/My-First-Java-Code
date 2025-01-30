package day_14;

public class KuchenImpl {

    public static void main(String[] args) {

        Kuchen kuchen = new Kuchen();
        System.out.println("kuchen.stuecke = " + kuchen.stuecke);
        kuchen.baecker = "Sureyya";
        kuchen.essen();

        Kuchen kuchen2 = new Kuchen();
        System.out.println("kuchen2.stuecke = " + kuchen2.stuecke);
        kuchen2.baecker = "Blagoja";
        kuchen2.essen();

        Kuchen kuchen3 = new Kuchen();
        System.out.println("kuchen3.stuecke = " + kuchen3.stuecke);
        kuchen2.baecker = "Vadim";
        kuchen2.essen();


    }

}
