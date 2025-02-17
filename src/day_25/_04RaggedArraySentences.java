package day_25;

import utils.ArrayUtil;

import java.util.Arrays;

public class _04RaggedArraySentences {

    public static void main(String[] args) {

        // Ragged-Jagged Arrays können verwendet werden, um Satze in einem Text zu analysieren
        // und Wörter mit unterschiedlicher Anzahl in jedem Satz zu extrahieren

        String text = "Dies ist ein Beispiel für ein Dokument mit Sätzen. Es enthält viele Sätze und in den Sätzen gibt es Wörter. " +
                "Die Sätze werden durch einen Punkt voneinander getrennt. Die Wörter innerhalb eines Satzes werden durch Leerzeichen getrennt.";

        String[] sentences = text.split("\\.");

        ArrayUtil.printArray(sentences);

        String[][] words = new String[sentences.length][];

        for (int i = 0; i < sentences.length; i++) {
            words[i] = sentences[i].trim().split(" ");
        }

        System.out.println("words[1][2] = " + words[1][2]);
        System.out.println("words[0][1] = " + words[0][1]);

        for (String[] sentence : words) {
            for (String word : sentence) {
                System.out.print(word + " * ");
            }
            System.out.println();
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                System.out.println((j + 1) + " - " + words[i][j]);
            }
            System.out.println();
        }


    }

}
