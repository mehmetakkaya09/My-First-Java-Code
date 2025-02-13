package day_24;

public class _04CharacterClassMethoden {

    public static void main(String[] args) {

        String str = "ASGEB98798)=)/()&bkjb567";
        String letters = ""; // Buchstabe
        int countLetters = 0;
        String numbers = "";
        int countNumbers = 0;
        String specialChars = "";
        int countSpecialChars = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                letters += str.charAt(i);
                countLetters++;
            } else if (Character.isDigit(str.charAt(i))) {
                numbers += str.charAt(i);
                countNumbers++;
            }else {
                specialChars += str.charAt(i);
                countSpecialChars++;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("countLetters = " + countLetters);
        System.out.println("numbers = " + numbers);
        System.out.println("countNumbers = " + countNumbers);
        System.out.println("specialChars = " + specialChars);
        System.out.println("countSpecialChars = " + countSpecialChars);


    }



}
