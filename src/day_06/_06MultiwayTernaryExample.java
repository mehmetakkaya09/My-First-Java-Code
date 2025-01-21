package day_06;

import java.util.Scanner;

public class _06MultiwayTernaryExample {

    public static void main(String[] args) {

        int x;

        x = 2 > 5 ? 2 : 5;

        System.out.println(x);

        System.out.println(10 == 5 ? 10 : 5);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your note: ");
        int note = sc.nextInt();
        String noteStr = "";

//        if (note >= 90){
//            noteStr = "A";
//        }else if (note >= 80){
//            noteStr = "B";
//        }else if (note >= 70){
//            noteStr = "C";
//        }else if (note >= 60){
//            noteStr = "D";
//        }else if (note >= 50){
//            noteStr = "E";
//        }else{
//            noteStr = "F";
//        }

        noteStr = note >= 90 ? "A"
                : note >= 80 ? "B"
                : note >= 70 ? "C"
                : note >= 60 ? "D"
                : note >= 50 ? "E"
                : "F";



        System.out.println("Your note is: " + noteStr);




    }



}
