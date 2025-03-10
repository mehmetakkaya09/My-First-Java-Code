package day_37.packageB;

import day_37.packageA.AccessModifiers;

public class AccessModTestB {

    public static void main(String[] args) {

        AccessModifiers accessModifiers = new AccessModifiers();

        //accessModifiers.privateModifierField;


        //Weil beide Klassepakette unterschiedlich ist, kann man zu default variablen und methoden nicht zugreifen
//        accessModifiers.defaultModifierField = 3;
//
//        accessModifiers.defaultModifierMethod();

        // Weil es keine Inheritence Abhangigkeit gibt, kann man diese protected variablen und methoden ausser gleicher Pakette nicht zugreifen. Wir brauchen Inheritence(is a relationship) Abhankeit
//        accessModifiers.protectedModifierField = true;
//
//        accessModifiers.protectedModifierMethod();

        // public variablen und methoden sind überall sichtbar/erreichbar
        accessModifiers.publicModifierField = 2.0;
        accessModifiers.publicModifierMethod();

    }



}
