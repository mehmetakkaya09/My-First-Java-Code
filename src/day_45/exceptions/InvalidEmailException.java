package day_45.exceptions;

public class InvalidEmailException extends RuntimeException{
    // Wenn wir RunTimeException Klasse vererben, erstellen wir eine "unchecked" Exception
    public InvalidEmailException(){
        super("Invalid Email");
    }
}
