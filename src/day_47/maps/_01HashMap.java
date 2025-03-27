package day_47.maps;

import java.util.HashMap;
import java.util.Map;

public class _01HashMap {
    public static void main(String[] args) {
          //Key DT   Value Datatype
        Map<String, Double> salaries = new HashMap<>();

        // Maps haben keine index
        // Maps(Keys) erlauben Duplikaten nicht.
        // Keys müssen immer einzigartig sein.
        // Wenn man ein Key zweimal definieren, kann man nur den Wert von Key verandern.
                  //SCHLUSSEL     WERT
                    //  KEY      VALUE
        salaries.put("Blagoja", 50_000.0);
        salaries.put("Blagoja", 70_000.0);
        salaries.put("Süreyya", 60_000.0);
        salaries.put("Vadim", 60_000.0);


        System.out.println(salaries);

        // um eine Key Information(Wert) einzulesen, benutzt man get() method
        // get() method nimmt Key(Schlüssel), und gibt (Value) Wert zurück
        System.out.println("salaries.get(\"Vadim\") = " + salaries.get("Vadim"));
        System.out.println("salaries.get(\"Blagoja\") = " + salaries.get("Blagoja"));
        System.out.println("salaries.get(\"Süreyya\") = " + salaries.get("Süreyya"));


    }
}
