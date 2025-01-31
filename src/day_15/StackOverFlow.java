package day_15;

public class StackOverFlow {

    public static void recursiveMethod(int num, int endpoint){
        System.out.println("Number of stack overflow is " + num);

        if (num >= endpoint){
            return;
        }

        recursiveMethod(num+1, endpoint);
    }

    public static void main(String[] args) {
        recursiveMethod(1, 100);
    }


}
