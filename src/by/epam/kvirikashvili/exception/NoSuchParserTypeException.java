package by.epam.kvirikashvili.exception;

public class NoSuchParserTypeException extends Exception {
    public NoSuchParserTypeException() {
        super();
    }

    public NoSuchParserTypeException(String message) {
        super(message);
    }

    public NoSuchParserTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchParserTypeException(Throwable cause) {
        super(cause);
    }

    protected NoSuchParserTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
