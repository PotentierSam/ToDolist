package calendar;

public class TooHighMonthException extends Exception {
    public TooHighMonthException() {
        super("Month number to HIGH, please choose between 1 and 12");
    }
}
