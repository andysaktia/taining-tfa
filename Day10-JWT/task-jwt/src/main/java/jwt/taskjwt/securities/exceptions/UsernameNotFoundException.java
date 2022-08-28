package jwt.taskjwt.securities.exceptions;

public class UsernameNotFoundException extends RuntimeException{
    public UsernameNotFoundException() {
        super();
    }

    public UsernameNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public UsernameNotFoundException(String message) {
        super(message);
    }

    public UsernameNotFoundException(Throwable cause) {
        super(cause);
    }
}
