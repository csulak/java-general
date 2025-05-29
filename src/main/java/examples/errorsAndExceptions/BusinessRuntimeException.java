package examples.errorsAndExceptions;

public class BusinessRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public BusinessRuntimeException(String message) {
        super(message);
    }

    public BusinessRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessRuntimeException(Throwable cause) {
        super(cause);
    }
}
