package day_40.kuchen;

public class KuchenTest {

    public static void main(String[] args) {

        //BaseKuchen baseKuchen = new BaseKuchen();

        EinfacherKuchen einfacherKuchen = new EinfacherKuchen(400, 200, 2, 500, 50 );

        System.out.println("einfacherKuchen.getIstGemischt() = " + einfacherKuchen.getIstGemischt());
        einfacherKuchen.mischen();
        System.out.println("einfacherKuchen.getIstGemischt() = " + einfacherKuchen.getIstGemischt());

        einfacherKuchen.backen();






    }

}
