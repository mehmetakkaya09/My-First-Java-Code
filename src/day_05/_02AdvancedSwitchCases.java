package day_05;

public class _02AdvancedSwitchCases {

    public static void main(String[] args) {

        int day = 7;
        String strDay = "";
        String dayType = "";

        switch (day) {
            case 1 -> {
                strDay = "Monday"; //break
            }
            case 2 -> strDay = "Tuesday";
            case 3 -> strDay = "Wednesday";
            case 4 -> strDay = "Thursday";
            case 5 -> strDay = "Friday";
            case 6 -> strDay = "Saturday";
            case 7 -> strDay = "Sunday";
            default -> System.out.println("Invalid day");
        }

        switch (day){
            case 1,2,3,4,5 -> dayType = "Weekdays"; //break
            case 6,7 -> dayType = "Weekend";
            default -> System.out.println("Invalid day");
        }

        System.out.println(strDay);
        System.out.println(dayType);






    }


}
