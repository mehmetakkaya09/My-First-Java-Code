package day_23;

import java.util.Arrays;

public class _03StudentsNotes {

    public static void main(String[] args) {

        int[] student1 = {50,76,80};
        int[] student2;
        student2 = new int[]{80,53,90};
        int[] student3 = {99,45,90};
        int[] student4 = {82,69,94};
        int[] student5 = {90,66,83};

        int[][] students = new int[5][3];

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;

        System.out.println(Arrays.deepToString(students));

        for (int zeile = 0; zeile < students.length; zeile++) {
            for (int spalte = 0; spalte < students[zeile].length; spalte++) {
                System.out.print(students[zeile][spalte] + " ");
            }
            System.out.println();
        }
        System.out.println("*************************");
        for(int[] zeile : students) {
            int durchschnitt = 0;
            for(int spalte : zeile){
                System.out.print(spalte + " ");
                durchschnitt += spalte;
            }
            durchschnitt /= zeile.length;
            if(durchschnitt >= 70){
                System.out.println("Student ist erfolgreich");
            }else {
                System.out.println("Student ist nicht erfolgreich");
            }
            System.out.println();
        }


    }


}
