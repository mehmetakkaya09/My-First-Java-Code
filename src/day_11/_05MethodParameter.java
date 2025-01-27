package day_11;

public class _05MethodParameter {

    public static void main(String[] args) {

//        System.out.println("sureyya@etsy.com");
//        System.out.println("blagoja@etsy.com");
//        System.out.println("mehmet@etsy.com");


        login("sureyya", "passSureyya");
        login("blagoja", "passBlagoja");
        login("mehmet", "passMehmet");

//        System.out.println("passSureyya");
//        System.out.println("passBlagoja");
//        System.out.println("passMehmet");

    }

    public static void login(String username, String password){
        System.out.println(username + "@etsy.com");
        System.out.println(password);

        System.out.println(username + " wurde angemeldet");
    }

}
