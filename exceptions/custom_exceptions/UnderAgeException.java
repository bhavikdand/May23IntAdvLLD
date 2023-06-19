package exceptions.custom_exceptions;

public class UnderAgeException extends Exception{

    public UnderAgeException(){
        super("You are underage");
    }

    public UnderAgeException(String message){
        super(message);
    }
}
