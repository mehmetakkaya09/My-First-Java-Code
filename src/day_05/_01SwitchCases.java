package day_05;

public class _01SwitchCases {

    String day; // null

    public static void main(String[] args) {

        //In Switch Cases können wir nur byte, short, integer, char oder String benutzen.
        // Wir vergleichen immer ein wert in Switch Cases



        int day = 1;
        String strDay = ""; // local variables haben keine default Werte deswegen sie müssen immer intialisiert werden
        String dayType = "";
        if (day > 0 && day < 8) {
            switch (day) {
                case 1:
                    strDay = "Monday";
                    break; //optional. Wenn wir break nicht benutzen Java geht weiter.
                case 2:
                    strDay = "Tuesday";
                    break;
                case 3:
                    strDay = "Wednesday";
                    break;
                case 4:
                    strDay = "Thursday";
                    break;
                case 5:
                    strDay = "Friday";
                    break;
                case 6:
                    strDay = "Saturday";
                    break;
                case 7:
                    strDay = "Sunday";
                    break;
                default:
                    System.out.println("Invalid day");
            }

            switch (day) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    dayType = "Weekdays";
                    break;
                case 6:
                case 7:
                    dayType = "Weekend";
                    break;
                default:
                    System.out.println("Invalid day");
            }


            System.out.println("Day " + day + " is " + strDay + " and its " + dayType);
        }

        // jahreszeiten - Je nach Monat nummer geben Sie Jahreszeit in Console aus.

        int month = 1;
        String season = "";



    }


}
