package day_45;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class _02FileRead {

    public static void main(String[] args)  {

        File file = new File("src/day_45/data.txt");

        Scanner reader;// = new Scanner(file); // Datenbank, API,
        //reader = new Scanner(file); // checked Exception
        try {
            reader = new Scanner(file); // checked Exception
            System.out.println("Daten werden eingelesen..");
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            //System.out.println(reader.nextLine());
            System.out.println(7/0);
        } catch (FileNotFoundException fnfe) {   //
            System.out.println("File not found");
        } catch (NoSuchElementException nsee) {
            System.out.println("Es gibt keine solche Element");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            System.out.println(7/0);

//        System.out.println(reader.nextLine());
//        System.out.println(reader.nextLine()); Boiler Plate
//        System.out.println(reader.hasNext());
//        System.out.println(reader.nextLine());
//        System.out.println(reader.hasNext());
//        System.out.println(reader.nextLine());


    }

}
