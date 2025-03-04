package day_34.bibliotek;

public class BibliotekTest {

    public static void main(String[] args) {

        Autor autor1 = new Autor("Fyodor", "Dostoyevski");
        Autor autor2 = new Autor("William", "Shakespeare");
        Autor autor3 = new Autor("Charles", "Dickens");

        Buch buch1 = new Buch(autor1, "Arme Leute","ANACONDA", 1234221, "Klassiker");
        Buch buch2 = new Buch(autor1, "Verbrechen und Strafe","Gustav Kiepenheuer", 532342, "Klassiker");
        Buch buch3 = new Buch(autor2, "Romeo und Julia","Nikol", 345366, "Klassiker");
        Buch buch4 = new Buch(autor3, "Oliver Twist","ANACONDA", 5678473, "Kinderbücher");

        autor1.addBuch(buch1);
        autor1.addBuch(buch2);
        autor2.addBuch(buch3);
        autor3.addBuch(buch4);

        System.out.println(autor1);
        autor1.getBüchern();

        System.out.println(buch4);

        Bibliotek bibliotek1 = new Bibliotek("Humbolt", "Universitaet Humbolt");
        bibliotek1.addBuch(buch1);
        bibliotek1.addBuch(buch2, buch3, buch4);

        System.out.println("***********************************");

        bibliotek1.getBücher();


    }



}
