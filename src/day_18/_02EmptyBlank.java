package day_18;

public class _02EmptyBlank {

    public static void main(String[] args) {

        String firstname = "          ";

        System.out.println("System.identityHashCode(firstname) = " + System.identityHashCode(firstname));

        boolean empty = firstname.isEmpty(); // unsere String muss ganz leer sein.

        System.out.println("empty = " + empty);

        String firstname2 = "          ";

        boolean blank = firstname2.isBlank(); // spaces werden nicht geprüft.

        System.out.println("blank = " + blank);

        firstname.trim(); // erste und letzte spaces werden gelöscht.


        firstname = firstname.trim(); // String is immutable -- man kann nicht verandern!!!
        String firstname3 = firstname.trim(); // ""
        System.out.println("System.identityHashCode(firstname) = " + System.identityHashCode(firstname));

        empty = firstname.isEmpty();

        System.out.println("empty = " + empty);

        String firstname4 = "                      Blagoja                      "; // String buffer hacking.

        String trimmed = firstname4.trim();

        System.out.println(firstname4);

        System.out.println("trimmed = " + trimmed);

        boolean blagoja = firstname4.equals("Blagoja");

        boolean blagoja2 = trimmed.equals("Blagoja");

        System.out.println("blagoja = " + blagoja);
        System.out.println("blagoja2 = " + blagoja2);

    }


}
