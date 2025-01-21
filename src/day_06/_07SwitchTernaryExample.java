package day_06;

import java.util.Scanner;

public class _07SwitchTernaryExample {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day number: ");
        int day = scanner.nextInt();
        String dayStr = "";

        dayStr = day == 1 ? "Monday"
                : day == 2 ? "Tuesday"
                : day == 3 ? "Wednesday"
                : day == 4 ? "Thusrday"
                : day == 5 ? "Friday"
                : day == 6 ? "Saturday"
                : day == 7 ? "Sunday"
                : "Invalid day";

        System.out.println("Today is " + dayStr);


    }



}
//        switch (day) {
//            case 1:
//                dayStr = "Monday";
//                break;
//                case 2:
//                    dayStr = "Tuesday";
//                    break;
//                    case 3:
//                        dayStr = "Wednesday";
//                        break;
//                        case 4:
//                            dayStr = "Thursday";
//                            break;
//                            case 5:
//                                dayStr = "Friday";
//                                break;
//                                case 6:
//                                    dayStr = "Saturday";
//                                    break;
//                                    case 7:
//                                        dayStr = "Sunday";
//                                        break;
//            default:
//                System.out.println("Invalid day");
//        }
