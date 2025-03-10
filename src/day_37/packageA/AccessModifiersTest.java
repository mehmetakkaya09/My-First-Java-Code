package day_37.packageA;

public class AccessModifiersTest {

    public static void main(String[] args) {

        AccessModifiers accessModifiers = new AccessModifiers();

        //Ausser der Klasse ist PRIVATE nicht sichtbar/erreichbar
        //accessModifiers.privateModifierField;

        // Weil diese Klasse in gleiche Pakette befindet, können wir zugreifen
        accessModifiers.defaultModifierField = 3;

        accessModifiers.defaultModifierMethod();

        // Weil beide Klasse in gleiche Pakette befinden, können wir immer diese protected variablen und methoden zugreifen, auch wenn wir keine Inheritence Abhangigkeit haben.
        accessModifiers.protectedModifierField = true;

        accessModifiers.protectedModifierMethod();

        // public variablen und methoden sind überall sichtbar/erreichbar
        accessModifiers.publicModifierField = 2.0;
        accessModifiers.publicModifierMethod();

    }


}
