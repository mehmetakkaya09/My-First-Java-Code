package day_33;

import java.util.ArrayList;

public class RealEstate {

    static ArrayList<House> allAvailableHouses;

    ArrayList<House> availableHouses; //= new ArrayList<>(); // verfügbare Hause

    static {
        allAvailableHouses = new ArrayList<>();
    }

    { // init block funktioniert vor jedem Konstruktor
        availableHouses = new ArrayList<>();
    }


    public void addHouse(House house) {
        availableHouses.add(house);
        allAvailableHouses.add(house);
    }



}
