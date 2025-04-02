package day_51.shopping;

import java.util.ArrayList;

public class OnlineShopping {

    public static void main(String[] args) {

        Product electronic1 = new Electronics("Iphone 16", 1000, "Apple");

        double discountElectronic = electronic1.applyDiscount(1500);

        Product clothing1 = new Clothing("Jacket", 200, 'M');

        double discountClothing = clothing1.applyDiscount(250);

        System.out.println("discountClothing = " + discountClothing);
        System.out.println("discountElectronic = " + discountElectronic);

        ArrayList<Product> products = new ArrayList<>();

        products.add(electronic1);
        products.add(clothing1);

        for (Product product : products) {
            if (product instanceof Clothing cloth) {
                cloth.ship();
            }else if (product instanceof Electronics electronic) {
                electronic.ship();
            }
        }



    }
}
