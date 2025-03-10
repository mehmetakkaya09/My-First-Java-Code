package day_37.singleton;

public class Singleton {

    private static Singleton objekt; // null ---> singleton = 455659002

    private Singleton(){}

    public static Singleton createObjekt(){
        if(objekt == null){
            objekt = new Singleton();
        }
        return objekt;
    }



}
