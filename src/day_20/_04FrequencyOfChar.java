package day_20;

public class _04FrequencyOfChar {

    public static void main(String[] args) {

        // Erstelle einen neuen String, der angibt, wie oft jedes Zeichen im gegebenen String vorkommt.
        // Beispiel: "AAABIBFDEEDP"  ==>  "A3B3I1F1D2E2P1"
        String str = "AAABIBFDEBEDP";

        String frequency = frequencyOfChar(str);

        System.out.println(frequency);

    }

    public static String frequencyOfChar(String str) {

        String chars = "";//ABIFDEP
        // Zuerst einen String mit eindeutigen Zeichen erstellen
        for (int i = 0; i < str.length(); i++) {
            if (!chars.contains(str.charAt(i) + "")) {
                chars += str.charAt(i);
            }
        }

        // Dann für jedes eindeutige Zeichen ermitteln, wie oft es im String vorkommt.
        // AAABIBFDEBEDP   "A3B3I1F1D2E2P1"
        String ergebnis = "";
        for (int i = 0; i < chars.length(); i++) {
            int zahler = 0;
            for (int j = 0; j < str.length(); j++) {
                if (chars.charAt(i) == str.charAt(j)) {
                    zahler++;
                }
            }
            ergebnis += chars.charAt(i) + "" + zahler;
        }

        return ergebnis;

    }



}
