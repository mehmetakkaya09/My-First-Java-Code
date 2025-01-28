package day_12;

public class _06LoginExample {

    public static void main(String[] args) {
        login();
        login("token");
        login("mehmet@email.com", "passForMehmet");
        login("mehmet@email.com", "passForMehmet", 3);
        login("mehmet@email.com", "passForMehmet", "token");

    }

    public static void login() {
        System.out.println("Diese login ist für alle");
    }

    public static void login(String token) {
        System.out.println("Durch Token können Sie anmelden");
    }

    public static void login(String email, String password) {
        System.out.println("Durch email und pass können Sie anmelden");
    }
    public static void login(String email, String password, int turn) {
        System.out.println("Durch email und pass können Sie " + turn + " mal anmelden");
    }

    public static String login(String email, String password, String token) {
        System.out.println("Melden durch email und password an und gibt ein Token zurück");
        return token;
    }

}
