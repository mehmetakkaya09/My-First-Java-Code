package day_32;

public class AbendessenTest {

    public static void main(String[] args) {

        Abendessen sureyya = new Abendessen();
        Abendessen vadim = new Abendessen();
        Abendessen blagoja = new Abendessen();
        Abendessen mehmet = new Abendessen();

        System.out.println(Abendessen.gemeinsamePizzaStuecke);

        vadim.nimmStuecke();
        System.out.println(Abendessen.gemeinsamePizzaStuecke); // gemeinsame Pizza
        System.out.println(vadim.eigenePizzaStuecke); // vadims selber Pizza


        blagoja.nimmStuecke();

        System.out.println(Abendessen.gemeinsamePizzaStuecke); // gemeinsame Pizza
        System.out.println(blagoja.eigenePizzaStuecke); // blagojas selber Pizza

        sureyya.nimmStuecke();

        System.out.println(Abendessen.gemeinsamePizzaStuecke); // gemeinsame Pizza
        System.out.println(sureyya.eigenePizzaStuecke);// surayyas selber Pizza

        mehmet.nimmStuecke();
        System.out.println(Abendessen.gemeinsamePizzaStuecke);
        System.out.println(mehmet.eigenePizzaStuecke);

        vadim.nimmStuecke(2);

        System.out.println(Abendessen.gemeinsamePizzaStuecke); // gemeinsame Pizza
        System.out.println(vadim.eigenePizzaStuecke); // vadims selber Pizza

    }


}
