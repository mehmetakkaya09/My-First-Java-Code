package day_15;

public class ProductTest {

    String name;

    public static void main(String[] args) {

        //In Stack werden
        //1- Primitive DataTypes (Local Variables)
        //2- Object Referenzen (product1,product3,product3)
        //3- alle Methoden
        // gespeichert.

        //In Heap werden
        //1- String Objekten
        //2- alle Objekten ( new Product() )


                //Stack    // Heap
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        System.out.println(product1); // 1b28cdfa
        System.out.println(product2); // eed1f14
        System.out.println(product3); // 7229724f

        int priceForApfel = 10;     // Stack
        int priceForKartoffel = 20; // Stack

        product1.name = "Apfel";            // Heap
        product1.price = priceForApfel;     // Heap

        product2.name = "Apfel";            // Heap
        product2.price = priceForApfel;     // Heap

        product3.name = "Kartoffel";            // Heap
        product3.price = priceForKartoffel;     // Heap

        System.out.println("product1.name = " + product1.name);
        System.out.println("product3.name = " + product3.name);

        product1 = product3;

        System.out.println("product1.name = " + product1.name);
        System.out.println("product3.name = " + product3.name);
        System.out.println(product1); // 7229724f
        System.out.println(product2); // eed1f14
        System.out.println(product3); // 7229724f

        // Garbage Collector hat erste new Product() Objekt automatisch gelöscht;
        // Wenn ein Objekt keine Referenz hat, löscht Garbage Collector dieses unerreichbare Objekt aus Heap automatisch.



    }
}
