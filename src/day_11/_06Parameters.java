package day_11;

public class _06Parameters {

    public static void main(String[] args) {

        biggerNumber(20, 5);
        biggerNumber(5, 10);

        //biggerNumber("mehmet", 20);

        //biggerNumber(100.5, 12);

        //biggerNumber(false, 11);

        short number1 = 1;
        byte number2 = 2;

        biggerNumber(number1, number2); //  implicit casting

        long number3 = 3;
        long number4 = 4;

        biggerNumber((int) number3, (int) number4);


        boolean isEligibleToVote = false;

        vote(isEligibleToVote);

        vote(true);


    }

    public static void biggerNumber(int a, int b) {
        if (a < b) {
            System.out.println(b + " is greater than " + a);
        } else
            System.out.println(a + " is greater than " + b);
    }

    public static void vote(boolean isEligible){
        if(isEligible){
            System.out.println("Diese Person ist wahlberechtigt");
        }else {
            System.out.println("Diese Person ist nicht wahlberechtigt");
        }
    }


}
