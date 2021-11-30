public class GroupExeption extends RuntimeException{
    public GroupExeption() {
    }

    public GroupExeption(String message) {
        super(message);
    }

    public GroupExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public GroupExeption(Throwable cause) {
        super(cause);
    }

    public GroupExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
