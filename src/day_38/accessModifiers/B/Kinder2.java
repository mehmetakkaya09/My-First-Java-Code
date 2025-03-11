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

    //method overriding : in Kinderklasse, mit gleicher Name, mit gleicher Zurückgabetyp, mit gleichen Paremetern, mit gleiche oder breitere Access Modifier, mit verschiedene Implementation
    // Inheritence
    // Zurückgabetyp ist sehr wichtig - gleich oder Kinderklasse
    // Parametern muss gleich sein
    // Access Modifier muss gleich oder breiter sein
    // mit unterschiedlichen Implementationen
    @Override
    public void spiel() {
        System.out.println("Kinderklasse spiel method");
    }

    @Override
    public String spiel(String spielName){
        return spielName;
    }


}
