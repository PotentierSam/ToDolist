package calendar;

public class TooHighMinuteException extends Exception{
    public TooHighMinuteException() {
        super("Minute number to HIGH, please choose between 0 and 59");
    }
}
