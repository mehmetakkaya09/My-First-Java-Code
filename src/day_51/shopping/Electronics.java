package day_51.shopping;

public class Electronics extends Product{

    private String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void ship() {
        super.ship();
        System.out.println("Shipping electronics with extra care");
    }

    public double applyDiscount(double originalPrice) {
        // Apply a 10% discount for electronics
        return originalPrice * 0.9;
    }

    public void displayInfo() {
        System.out.println("Product: " + getName());
        System.out.println("Category: Electronics");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + getPrice());
    }
}
