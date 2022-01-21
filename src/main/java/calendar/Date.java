package calendar;

public class Date implements APIDate {
    int year;
    int month;
    int day;

    public Date() {
        this.year = 1666;
        this.month = 1;
        this.day = 1;
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void oneYearLater() {
        this.year = getYear()+1;
    }

    public void oneYearEarlier() {
        this.year = getYear()-1;
    }

    public void oneMonthLater() {
        if(getMonth()==12) {
            this.month = 1;
            oneYearLater();
        }
        else {
            this.month = getMonth()+1;
        }
    }

    public void oneMonthEarlier() {
        if(getMonth()==1) {
            this.month = 12;
        } else {
            this.month = getMonth()-1;
        }
    }

    public void oneDayLater() {
        if(getDay()==31) {
            this.day = 1;
            oneMonthLater();
        } else {
            this.day = getDay()+1;
        }
    }

    public void oneDayEarlier() {
        if(getDay()==1) {
            this.day = 31;
            oneMonthEarlier();
        } else {
            this.day = (getDay()-1);
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) throws TooHighMonthException, TooLowMonthException {
        if (month>12) throw new TooHighMonthException();
        if (month<1) throw new TooLowMonthException();
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) throws TooHighDayException, TooLowDayException {
        if (day>31) throw new TooHighDayException();
        if (day<1) throw new TooLowDayException();
        this.day = day;
    }
}
