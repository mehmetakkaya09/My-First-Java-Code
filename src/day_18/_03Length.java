package day_18;

import java.util.Scanner;

public class _03Length {

    public static void main(String[] args) {

        String name = "sureyya";

        System.out.println("name.length() = " + name.length()); // gibt char Anzahl zurück

        String name2 = "   sureyya   ";

        System.out.println("name2.length() = " + name2.length());

        // firstname muss min aus 3 char bestehen und nicht leer sein

        Scanner sc = new Scanner(System.in);
        String firstname = "";

        do {
            System.out.print("Enter a name: ");
            firstname = sc.nextLine().trim();
            if (firstname.length() >= 3 && !firstname.isBlank()) {
                break;
            }else
                System.out.println("firstname muss min aus 3 char bestehen und nicht leer sein");
        }while (true);

        System.out.println(firstname);

        sc.close();

    }

}
