package calendar;

public class TooLowMonthException extends Exception {
    public TooLowMonthException() {
        super("Month number to LOW, please choose between 1 and 12");
    }
}
