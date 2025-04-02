package day_51.shopping;

public abstract class Product implements Shippable, Discountable{
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void ship() {
        System.out.println("Shipping " + name);
    }

    public double applyDiscount(double originalPrice) {
        // default implamentasyon : no descount
        return originalPrice;
    }

    public abstract void displayInfo();

}
