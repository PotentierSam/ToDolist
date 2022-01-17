package time;

public class TooLowMinuteException extends Exception {
    public TooLowMinuteException() {
        super("Minute number to LOW, please choose between 0 and 59");
    }
}
