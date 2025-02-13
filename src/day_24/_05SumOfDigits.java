package day_24;

public class _05SumOfDigits {

    public static void main(String[] args) {

        String str = "asd54?=(01LKH";

        // Addieren Sie alle zahlen indem Sie str zerbrechen

        char[] chars = str.toCharArray();

        int sum = 0;

        for (char c : chars) {
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(String.valueOf(c));
                //sum += Character.getNumericValue(c);
            }
        }
        System.out.println(sum);

        String[] strArray = str.split("");

        //strArray.for   for each loop
        //strArray.fori  klassische for loop
        //strArray.forr  emgekehrte for loop

        int sum2 = 0;

        for (int i = 0; i < strArray.length; i++) {
            if(Character.isDigit(strArray[i].charAt(strArray[i].length()-1))){
                sum2 += Integer.parseInt(strArray[i]);
            }
        }
        System.out.println(sum2);
    }


}
