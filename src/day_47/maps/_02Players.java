package day_47.maps;

import java.util.HashMap;
import java.util.Map;

public class _02Players {

    public static void main(String[] args) {

        // In eine Fussball Team wie kann ich Spielernummer und Namen in einem Map speichern?

        Map<Integer, String> spielersMap = new HashMap<>();

        spielersMap.put(1,"De Gea");
        spielersMap.put(10,"Messi");
        spielersMap.put(9, "Ronaldo");
        spielersMap.put(7,"Ronaldo");
        spielersMap.put(11,"Neymar");

        System.out.println("spielersMap.get(7) = " + spielersMap.get(7));
        System.out.println("spielersMap.get(11) = " + spielersMap.get(11));
        System.out.println("spielersMap.get(0) = " + spielersMap.get(0)); // null
        System.out.println("spielersMap.get(\"Benzema\") = " + spielersMap.get("Benzema")); //null


    }


}
