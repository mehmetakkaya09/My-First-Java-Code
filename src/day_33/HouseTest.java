package day_33;

public class HouseTest {

    public static void main(String[] args) {

        House house1 = new House("Hannover", "4", 1000, 2020);
        House house2 = new House("München", "3", 1200, 2022);
        House house3 = new House("Köln", "2", 900, 2024);

        house2.setNumRooms("5");
        System.out.println(house2.getNumRooms());


        RealEstate vadimsRealEstate = new RealEstate();

        vadimsRealEstate.addHouse(house1);

        System.out.println(vadimsRealEstate.availableHouses);

        RealEstate blagojasRealEstate = new RealEstate();

        blagojasRealEstate.addHouse(house2);

        System.out.println(blagojasRealEstate.availableHouses);

        RealEstate sureyyasRealEstate = new RealEstate();

        sureyyasRealEstate.addHouse(house3);

        System.out.println(sureyyasRealEstate.availableHouses);

        System.out.println("***************************");

        System.out.println(RealEstate.allAvailableHouses);


    }



}
