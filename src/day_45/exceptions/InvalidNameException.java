package day_45.exceptions;

public class InvalidNameException extends Exception{
    // Wenn wir Exception Klasse vererben, erstellen wir eine "checked" Exception
    public InvalidNameException(String message){
        super(message);
    }
}
