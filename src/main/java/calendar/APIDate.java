package calendar;

public interface APIDate {
    String toString();
    int getDay();
    void setDay(int day) throws TooHighDayException, TooLowDayException;
    int getMonth();
    void setMonth(int month) throws TooHighMonthException, TooLowMonthException;
    int getYear();
    void setYear(int year);
    void oneYearLater();
    void oneYearEarlier();
    void oneMonthLater();
    void oneMonthEarlier();
    void oneDayLater();
    void oneDayEarlier();
}
