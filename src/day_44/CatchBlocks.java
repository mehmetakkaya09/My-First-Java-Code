package day_44;

public class CatchBlocks {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 0;

        int res = 0;

        int[] arr = new int[1];

        try {

            try {
                res = num1 / num2;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                num2 = 2;
                res = num1 / num2;
            }

            arr[2] = res; // wenn Java ArrayIndexOutOfBoundsException sieht, spring Java Compiler direkt catch Block und überprüft catch Block
            System.out.println(arr[2]);
        } catch (
                ArrayIndexOutOfBoundsException e) { // Wenn diese Exception fehlende Kode handeln kann, java funktioniert catch block. Sonst wirft Java diese nicht gehandelte Exception
            System.out.println(e.getMessage());
            arr[0] = res;
        }

        System.out.println(arr[0]);

        String str = "Hello";

        int[] arr2 = new int[10];

        try {
            //arr2 = new int[2_000_000_000];
            str.charAt(9);
            arr[2] = 5;
        //} catch (IndexOutOfBoundsException e) { catch blocks haben eine bestimmte Reihe. Frühere catch block muss immer gleich oder kleiner als nachste catch blocks sein
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (OutOfMemoryError e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("3. Try block");
            str.charAt(9);
            arr[2] = 5;
        }catch (Exception e) {
            System.out.println("letzte catch = " + e.getMessage());
        }finally {
            System.out.println("finally block : " + " Scanner ist geschlossen.. DB ist geschlossen");
        }

        // in try block schreiben wir Kode, die falsch sein kann
        // in catch blocks fangen wir diese fehlers
        // nachste catch blocks muss ahnliche (Class) Stufe oder grosser als frühere (Class) Stufe sein
        // finally blocks funktioniert unter jede Bedingung.


    }


}
