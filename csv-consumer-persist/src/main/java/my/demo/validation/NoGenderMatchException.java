package my.demo.validation;

public class NoGenderMatchException extends RuntimeException {

    public NoGenderMatchException(String message) {
        super(message);
    }
}
