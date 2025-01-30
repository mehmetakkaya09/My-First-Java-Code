package day_14;

public class Kuchen {

    String baecker;
    int stuecke = 10;
    boolean mitEi;
    static int gesamtStuecke = 10; // global variables


    public void essen(){
        System.out.println(baecker + " hat eine Stücke gegessen");
        stuecke--;
        gesamtStuecke--;
        System.out.println("Rest Stücke ist " + gesamtStuecke);
    }

}
