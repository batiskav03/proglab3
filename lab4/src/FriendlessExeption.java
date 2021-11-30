public class FriendlessExeption extends Exception{
    public FriendlessExeption() {
    }

    public FriendlessExeption(String message) {
        super(message);
    }

    public FriendlessExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public FriendlessExeption(Throwable cause) {
        super(cause);
    }

    public FriendlessExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
