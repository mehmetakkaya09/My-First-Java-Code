package day_12;

public class _02Calculator {

    public static void main(String[] args) {

        //int addition = (int) calculator(2,4, '+');
        double addition = calculator(2,4, '+');
        System.out.println("addition = " + addition);

        double subtraction = calculator(10,5, '-');
        System.out.println("subtraction = " + subtraction);

        double multiplication = calculator(5,7, '*');
        System.out.println("multiplication = " + multiplication);

        double division = calculator(21,3, '/');
        System.out.println("division = " + division);

        double ungultig = calculator(5,7, '#');
        System.out.println("ungultig = " + ungultig);


    }

    public static double calculator (int number1, int number2, char operator) {

        double result = 0;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            default:
                result = -1;
        }

        return result;
    }


}
