package date;

public class TooHighDayException extends Exception {
    public TooHighDayException() {
        super("Day number to HIGH, please choose between 1 and 31");
    }
}
