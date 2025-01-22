package day_08;

public class _05CoffeeShop {

    public static void main(String[] args) {

        int maxCapacity = 20;
        int currentCustomer = 0;

        // wenn wir mehr als 20 Kunden haben, beenden wir Loop

        for (int customer = 1; customer < 30; customer++) {
            if (currentCustomer  == maxCapacity) {
                System.out.println("Sorry! Shop is full!!");
                break;
            }
            System.out.println("Customer " + customer + " entered the coffee shop");
            currentCustomer++;
        }








    }



}
