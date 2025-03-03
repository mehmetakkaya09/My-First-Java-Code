package day_33;

public class _03StaticAndInitBlocks {

    //static String laender = "Deutschland";
    static String laender;
    String stadt;



    static { // static block
             // werden VOR ALLEM NUR EINMAL ausgeführt, wenn diese Klasse verwendet werden.
              System.out.println("STATIC BLOCK FUNKTIONIERT");
             laender = "Deutschland";
    }

    public _03StaticAndInitBlocks(String stadt) {
        System.out.println("KONSTRUCTOR FUNKTIONIERT");
        //laender = "Deutschland";
        this.stadt = stadt;
    }

    public _03StaticAndInitBlocks() {
    }

    {
        System.out.println("INIT BLOCK FUNKTIONIERT");
        this.stadt= "unbekannt";
    }

    static {
        System.out.println("STATIC BLOCK 2 FUNKTIONIERT");
        laender = "England";
    }



}
//int variable;
