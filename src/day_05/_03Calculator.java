package day_05;

public class _03Calculator {
    public static void main(String[] args) {

        char operator = '*';
        int num1 = 5;
        int num2 = 7;
        int res = 0;

        res = switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> 0;
        };


        System.out.println(res);

        int number = 3;
        int tempInt = 0;
        String tempString = "";
        switch (number) {
            case 1 -> tempInt = 8 + 2;
            case 2 -> tempString = "Two";
            case 3 -> tempString = "Three";
            case 4 -> tempString = "Four";
            default -> tempString = "invalid";
        };

        String day = "Tuesday";
        int dayInt = 0;

        switch (day){
            case "Monday" -> dayInt = 1;
            case "Tuesday" -> dayInt = 2;
            default -> System.out.println("Invalid day");
        }

        System.out.println("dayInt = " + dayInt);

//        double doubleNum = 5;
//
//        switch (doubleNum){
//
//        }

        //System.out.println("str = " + str);


    }
}
