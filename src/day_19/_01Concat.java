package day_19;

public class _01Concat {

    public static void main(String[] args) {

        String firstname = "John";
        String lastname = "Doe";
        System.out.println("System.identityHashCode(firstname) = " + System.identityHashCode(firstname));

        String fullName = firstname.concat(lastname);
        System.out.println("System.identityHashCode(fullName) = " + System.identityHashCode(fullName));

        System.out.println("firstname.concat(lastname) = " + firstname.concat(lastname));
        System.out.println("System.identityHashCode(firstname.concat(lastname)) = " + System.identityHashCode(firstname.concat(lastname)));

        System.out.println("firstname = " + firstname);
        System.out.println("fullName = " + fullName);

        String str = "Hello";

        System.out.println("str.concat(str) = " + str.concat(str));

        System.out.println("str.concat(\" world\") = " + str.concat(" world"));


    }


}
