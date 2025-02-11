package day_22;

public class _02Cities {

    public static void main(String[] args) {

        String[] cities = {"Berlin", "Münich", "Hamburg", "Köln", "Frankfurt"};

        for (String city : cities) {
            System.out.println(city);
        }

        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }

        boolean isOk = false;
        for (String city : cities) {
            if (city.equalsIgnoreCase("köln")) {
                isOk = true;
                break;
            }
        }

        if (isOk) {
            System.out.println("Stadt ist gefunden");
        }else {
            System.out.println("Stadt ist nicht gefunden");
        }

    }

}
