package day_38.accessModifiers.B;

import day_38.accessModifiers.A.Klasse1;

public class Kinder2 extends Klasse1 {

    public Kinder2(){
        super("","");
    }


    public void method() {

        super.publicInstance = "public";
        super.protectedInstance = "protected";


    }


}
