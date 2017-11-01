package exceptions;

public class NumberOutOfRangeException extends Exception {

    public NumberOutOfRangeException() {
    }

    public NumberOutOfRangeException(String message) {
        super(message);
    }

    public NumberOutOfRangeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NumberOutOfRangeException(Throwable cause) {
        super(cause);
    }

    public NumberOutOfRangeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
