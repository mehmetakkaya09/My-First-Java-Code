package day_16;

import day_16.person.Vehicle;

public class VehicleImpl {

    public static void main(String[] args) {
        Vehicle car1 = new Vehicle(); // new Vehicle()  ist drinn Heap ---- ABER car1 (objekt referenz) ist drin Stack und beinhaltet nur abhangige Objektadresse information
        car1.brandName = "Audi";
        car1.model = "A4";
        car1.year = 2022;


        //Vehicle car2 = new Vehicle();

        System.out.println("car1 = " + car1);
        System.out.println("car1.brandName = " + car1.brandName);

        //car1 = null;
       // car1 = car2;

        System.out.println("car1 = " + car1);
       // System.out.println("car2 = " + car2);
        System.out.println("car1.brandName = " + car1.brandName);
        System.out.println("car1.year = " + car1.year);

        for (int i = 0; i < 1_000_000; i++) {
            Vehicle car2 = new Vehicle();
            System.out.println(car2);
        }

        //System.gc();



    }


}
