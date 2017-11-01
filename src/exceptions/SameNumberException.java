package exceptions;

public class SameNumberException extends Exception {

    public SameNumberException() {
    }

    public SameNumberException(String message) {
        super(message);
    }

    public SameNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public SameNumberException(Throwable cause) {
        super(cause);
    }

    public SameNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

