package time;

public class TooLowHourException extends Exception {
    public TooLowHourException() {
        super("Hour number to LOW, please choose between 0 and 23");
    }
}
