package day_33;

import java.util.ArrayList;

public class RealEstate {

    // has a relation = Wenn einE Klasse eine andere KlassE Objekt verwendet, ist es "has a relation"
    // RealEstate Klasse hat eine House(List)

    // "is a relation" ist INHERITENCE

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
