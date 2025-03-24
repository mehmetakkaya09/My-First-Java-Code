package day_45;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _01CheckedException {

    public static void main(String[] args) {

        readFile("src/day_45/data.txt");

    }

    public static void readFile(String path) {
        File file = new File(path);

        try {
            Scanner readFile = new Scanner(file);  // checked Exception
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }


    }
//    public static void readFile(String path) throws FileNotFoundException {
//        File file = new File(path);
//
//        Scanner readFile = new Scanner(file);  // checked Exception
//    }
//
}
