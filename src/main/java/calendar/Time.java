package calendar;

public class Time {
    int hour;
    int minute;

    public Time() {
        this.hour = 12;
        this.minute = 0;
    }

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public void oneHourMore() {
        if(getHour()==23) {
            this.hour = 0;
        } else {
            this.hour = getHour()+1;
        }
    }

    public void oneHourLess() {
        if(getHour()==0) {
            this.hour = 23;
        } else {
            this.hour = getHour()-1;
        }
    }

    public void oneMinuteMore() {
        if(getMinute()==60) {
            this.minute = 1;
            oneHourMore();
        } else {
            this.minute = getMinute()+1;
        }
    }

    public void oneMinuteLess() {
        if(getMinute()==0) {
            this.minute = 59;
            oneHourLess();
        } else {
            this.minute = (getMinute()-1);
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) throws TooHighHourException, TooLowHourException {
        if (hour<0) throw new TooLowHourException();
        if (hour>23) throw new TooHighHourException();
        this.hour = 0;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) throws TooLowMinuteException, TooHighMinuteException {
        if (minute<0) throw new TooLowMinuteException();
        if (minute>60) throw new TooHighMinuteException();
        this.minute = minute;
    }
}