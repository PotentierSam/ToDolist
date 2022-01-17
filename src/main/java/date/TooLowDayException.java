package date;

public class TooLowDayException extends Exception {
    public TooLowDayException() {
        super("Day number to LOW, please choose between 1 and 31");
    }
}
