package day_51.shopping;

public class Clothing extends Product{
    private char size;

    public Clothing(String name, double price, char size) {
        super(name, price);
        this.size = size;
    }

    public char getSize() {
        return size;
    }

    public void ship() {
        super.ship();
        System.out.println("Shipping clothing with standard shipping");
    }

    public double applyDiscount(double originalPrice) {
        // Apply 20% discount for clothing
        return originalPrice * 0.8;
    }

    public void displayInfo() {
        System.out.println("Product: " + getName());
        System.out.println("Category: Textile");
        System.out.println("Size: " + size);
        System.out.println("Price: " + getPrice());
    }

}
