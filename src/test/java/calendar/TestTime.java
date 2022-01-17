package calendar;

import time.Time;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class TestTime {
    @Test
    public void testConstructor() {
        Time t1;
        t1 = new Time();
        assertEquals(12,t1.getHour());
        assertEquals(0,t1.getMinute());

        Time t2;
        t2 = new Time(0,30);
        assertEquals(0,t2.getHour());
        assertEquals(30,t2.getMinute());
    }

    @Test
    public  void testOneHourLater() {
        Time t1;
        t1 = new Time();
        t1.oneHourLater();
        assertEquals(13,t1.getHour());

        Time t2;
        t2 = new Time(23,0);
        t2.oneHourLater();
        assertEquals(0, t2.getHour());
    }

    @Test
    public  void testOneHourEarlier() {
        Time t1;
        t1 = new Time();
        t1.oneHourEarlier();
        assertEquals(11,t1.getHour());

        Time t2;
        t2 = new Time(0,0);
        t2.oneHourEarlier();
        assertEquals(23, t2.getHour());
    }

    @Test
    public  void testOneMinuteLater() {
        Time t1;
        t1 = new Time();
        t1.oneHourLater();
        assertEquals(13,t1.getHour());

        Time t2;
        t2 = new Time(23,0);
        t2.oneHourLater();
        assertEquals(0, t2.getHour());
    }

    @Test
    public  void testOneMinuteEarlier() {
        Time t1;
        t1 = new Time();
        t1.oneMinuteEarlier();
        assertEquals(59,t1.getMinute());

        Time t2;
        t2 = new Time(0,0);
        t2.oneMinuteLater();
        assertEquals(1, t2.getMinute());
    }
}