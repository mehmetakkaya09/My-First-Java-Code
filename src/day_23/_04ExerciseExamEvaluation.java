package day_23;

public class _04ExerciseExamEvaluation {

    public static void main(String[] args) {

        // Antworten von 8 Schülern --- answers[8][10]
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, // Antworten des 1. Schülers
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'}, // Antworten des 2. Schülers
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'}, // Antworten des 3. Schülers
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'}, // Antworten des 4. Schülers
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, // Antworten des 5. Schülers
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, // Antworten des 6. Schülers
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, // Antworten des 7. Schülers
                {'D', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}  // Antworten des 8. Schülers
        };

        // Antwortschlüssel für 10 Fragen
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        for (int student = 0; student < answers.length; student++) {
            int richtigeAntworten = 0;
            int falscheAntworten = 0;

            for (int frage = 0; frage < answers[student].length; frage++) {
                if (answers[student][frage] == keys[frage]) {
                    richtigeAntworten++;
                }else {
                    falscheAntworten++;
                }
            }
            System.out.println((student + 1) + ". Student Anzahl richtiger Antworten: " + richtigeAntworten);
            System.out.println((student + 1) + ". Student Anzahl falscher Antworten: " + falscheAntworten);
            System.out.println();
        }







    }
}
