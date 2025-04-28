package day_52;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileReadAndWrite {

    public static void main(String[] args) {

        //String filePath = "C:\\Users\\peace\\IdeaProjects\\My-First-Java-Code";

//        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
//        System.out.println("System.getProperty(\"home\") = " + System.getProperty("home"));
//
//        System.out.println("System.getProperty(\"java.runtime.version\") = " + System.getProperty("java.runtime.version"));
//
//        System.out.println("System.getProperty(\"user.dir\") = " + System.getProperty("user.dir"));
        //int div = 10/0; // unchecked

        String filePath = System.getProperty("user.dir") + "/UserInfos";
        PrintWriter printWriter = null; //checked

        try {
            printWriter = new PrintWriter(new FileOutputStream(filePath,false));
            printWriter.println("Hallo Ich bin Blagoja");
            printWriter.println("Hallo Ich bin Vadim");
        }catch (FileNotFoundException fnfe) {
            System.out.println("There is no File. Check File Path!..");
        }finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }

        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(filePath));
            //System.out.println(scanner.nextLine());
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }catch (FileNotFoundException fnfe) {
            System.out.println("There is no File. Check File Path!..");
        }finally {
            if (scanner != null) {
                scanner.close();
            }
        }












    }



}
