package ExceptionHandling_Questions.question2;

public class CreditsOutofRangeException extends RuntimeException{
    public CreditsOutofRangeException(String message){
        super(message);
    }
}
