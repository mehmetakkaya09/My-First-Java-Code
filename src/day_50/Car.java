package day_50;

public class Car {

    Engine engine; // obligatorisch für ein Auto
    Driver driver; // optional

    Car(Engine engine) {
        this.engine = engine; // Composition ist starke(obligatorische) Type von "has a relation"
    }

    Car(Engine engine, Driver driver) {
        this.engine = engine;
        this.driver = driver; // Aggregation ist nicht starke(optionale) Type von "has a relation"
    }




}
