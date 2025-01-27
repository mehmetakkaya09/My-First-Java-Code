package day_11;

public class _03DebuggingMethodCall {

    public static void main(String[] args) {

        System.out.println("Zeile 7");
        blagojasMethod();
        System.out.println("Zeile 9");
        blagojasMethod();
        System.out.println("Zeile 11");
        blagojasMethod();
    }

    public static void blagojasMethod(){
        System.out.println("Zeile 15");
    }




}
