package day_37.packageB;

import day_37.packageA.AccessModifiers;
import day_37.singleton.Singleton;

public class ChildB extends AccessModifiers {

    public void method() {
        super.protectedModifierField = false;
        super.protectedModifierMethod();
    }

    public static void main(String[] args) {

        ChildB obj = new ChildB();

        // Auch wenn beide Klasse in unterschiedliche Pakette befinden, weil es zwischen zwei klasse Inheritence Abhangigkeit gibt, kann man diese variablen und methoden zugreifen.
        obj.protectedModifierField = true;

        obj.protectedModifierMethod();

        obj.publicModifierField = 3.9;
        obj.publicModifierMethod();

        //Singleton singleton5 = Singleton.createObjekt();



    }

}
