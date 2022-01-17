package time;

public class Time {
    int hour;
    int minute;

    public Time() {
        setHour(12);
        setMinute(0);
    }

    public Time(int hour, int minute) {
        setHour(hour);
        setMinute(minute);
    }

    public void oneHourLater() {
        if(getHour()==23) {
            setHour(0);
        } else {
            setHour(getHour()+1);
        }
    }

    public void oneHourEarlier() {
        if(getHour()==0) {
            setHour(23);
        } else {
            setHour(getHour()-1);
        }
    }

    public void oneMinuteLater() {
        if(getMinute()==60) {
            setMinute(1);
        } else {
            setMinute(getMinute()+1);
        }
    }

    public void oneMinuteEarlier() {
        if(getMinute()==0) {
            setMinute(59);
        } else {
            setMinute(getMinute()-1);
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour>=0 && hour<24){
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}