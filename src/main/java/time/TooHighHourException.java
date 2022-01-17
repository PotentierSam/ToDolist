package time;

public class TooHighHourException extends Exception {
    public TooHighHourException() {
        super("Hour number to HIGH, please choose between 0 and 23");
    }
}
