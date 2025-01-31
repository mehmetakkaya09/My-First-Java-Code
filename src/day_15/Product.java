package day_15;

public class Product {


    // fields, Properties, states, data members
    // instances / object variables === heap
    String name;  // weil name Info für Product Objekt gehört, name soll in Heap gespeichert werden.
    int price;  // weil price Info für Product Objekt gehört, price soll in Heap gespeichert werden.

    public double berechnung(int zahl){  // alle methoden werden in Stack gespeichert.
        double sum = zahl * price; // sum variable ist ein local variable. deswegen wird diese Variable in Stack gespeichert.
        return sum;
    }

    public static void main(String[] args) {
                //stack     // heap
        Product product1 = new Product();
                //beinhaltet diese Objekt Location Info
        System.out.println(product1);
        // product1 ist eine Variable, die die Referenz/Adresse/Location des im Heap und im Stack erstellen Objekte enthalt.

        Product product2 = new Product();

        System.out.println(product2);

        //System.gc();

        product1 = product2; // Garbage Collector hat product1 objekt aus Heap automatisch gelöscht.

        System.out.println(product1);
        System.out.println(product2);



    }


}
