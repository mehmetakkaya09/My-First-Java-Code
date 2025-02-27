package day_32;

public class Abendessen {

    static int gemeinsamePizzaStuecke = 8;
    int eigenePizzaStuecke = 8;

    public void nimmStuecke(){
        gemeinsamePizzaStuecke--;
        eigenePizzaStuecke--;
    }

    public void nimmStuecke(int stuecke){
        gemeinsamePizzaStuecke -=stuecke;
        eigenePizzaStuecke -=stuecke;
    }

}
