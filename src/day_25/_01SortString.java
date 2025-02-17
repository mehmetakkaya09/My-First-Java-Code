package day_25;

import java.util.Arrays;

public class _01SortString {

    public static void main(String[] args) {

        /*
        Schreiben Sie eine Methode, die Buchstaben und Zahlen aus alphanumerischen String sortieren kann
        Für das folgende alphanumerische Beispiel geben Sie die String unten ein;
        Wir müssen den String in Teilstrings mit aufeinanderfolgenden Buchstaben oder Zahlen aufteilen, den einzelnen String sortieren und wieder anfügen.
        Ex:
        Input: “DC501GCCCA098911" OutPut: “CD015ACCCG011899"
         */

        String str = "DC501GCCCA098911";
        System.out.println(teileGruppe(str));

        String gruppe = teileGruppe(str);

        String res = sortiereString(gruppe);

        System.out.println(res);

    }
    // zuerst können wir jede Buchstabegruppe und Zahlgruppe teilen. DC,501,GCCCA,098911   chars
    // jede gruppe kann ich sortieren
    // alle gruppe werde ich nochmal verbinden


    public static String teileGruppe(String str) {
        String result = "";

        // wenn nach eine Buchstabe eine Zahl kommt werde ich ein "," schreiben
        // wenn nach ein Zahl eine Buchstabe kommt werde ich nochmal ein "," schreiben

        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
            if (Character.isLetter(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isDigit(str.charAt(i + 1))) {
                    result += ",";
                }
            }
            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isLetter(str.charAt(i + 1))) {
                    result += ",";
                }
            }
        }
        return result;
    }

    public static String sortiereString(String str) {

        // zuerst werden wir je nach "," unsere Gruppe teilen
        // danach werden wir in jeder Gruppe jede char teilen und sortieren
        // zuletzt werden wir sorierte Gruppe nochmal verbinden

        String result = "";
        String[] arr = str.split(",");

        for (String gruppe : arr) {
            char[] jedeChar = gruppe.toCharArray();
            Arrays.sort(jedeChar);
            result += new String(jedeChar);
        }
        return result;
    }




}
