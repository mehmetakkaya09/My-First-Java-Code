package day_22;

import utils.ArrayUtil;

public class _06StringArray {

    public static void main(String[] args) {

        String[] autosArr = {"Toyota", "Opel", "Honda", "   Mercedes    ", "BYD"};

        System.out.println(autosArr[0].length());//6
        System.out.println(autosArr[4].charAt(2));//D
        System.out.println(autosArr[3].trim().length());//8
        System.out.println(autosArr[2].substring(2,3));//n
        System.out.println(autosArr[2].substring(2));//nda
        System.out.println(autosArr[2].equals(autosArr[3]));//false

        String str = "It will split the String to the Arrays";

        System.out.println(str);

        String[] newStr = str.split(" ");

        ArrayUtil.printArray(newStr);

        System.out.println(newStr[2]);//split

        String[] eachLetterAsStringArray = str.split("");

        System.out.println("*****************");

        ArrayUtil.printArray(eachLetterAsStringArray);
        System.out.println(eachLetterAsStringArray[4]);

        char[] eachLetterCharArray = str.toCharArray();

        System.out.println("*****************");
        for (char ch : eachLetterCharArray) {
            System.out.println(ch);
        }

    }

}
