package day_44;

import java.util.ArrayList;

public class OutOfMemoryExceptionExample {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        int zaehler = 0;

        try {
            while (true) {
                zaehler++;
                list.add("OutOfMemoryExceptionExample");
            }
        }catch (OutOfMemoryError e) {
            System.out.println(e.getMessage());
        }catch (Error e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Mansche Elemente sollen gelöscht werden");
        }
        System.out.println(zaehler);









    }


}
