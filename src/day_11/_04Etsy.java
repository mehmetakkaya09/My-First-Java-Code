package day_11;

public class _04Etsy {

    public static void main(String[] args) {


        // test starten
        // anmelden (Login)
        // produkt suchen
        // produkt kaufen
        // test beenden

        testStart();
        login();
        search();
        buy();
        logout();

        end2endTest();
    }

    public static void testStart(){
        System.out.println("Test wurde gestartet");
    }

    public static void login(){
        System.out.println("Es wurde angemeldet");
    }

    public static void search(){
        System.out.println("Produkt wurde gesucht");
    }

    public static void buy(){
        System.out.println("Produkt wurde gekauft");
    }

    public static void logout(){
        System.out.println("Test wurde beendet");
    }

    public static void end2endTest(){
        testStart();
        login();
        search();
        buy();
        logout();
    }





}
