package calendar;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class TestDate {
    @Test
    public void testConstructor() {
        Date d1;
        d1 = new Date();
        assertEquals(1666,d1.getYear());
        assertEquals(1,d1.getMonth());
        assertEquals(1,d1.getDay());

        Date d2;
        d2 = new Date(2022,9,5);
        assertEquals(2022,d2.getYear());
        assertEquals(9,d2.getMonth());
        assertEquals(5,d2.getDay());
    }

    @Test
    public  void testOneYearLater() {
        Date d1;
        d1 = new Date();
        d1.oneYearLater();
        assertEquals(1667,d1.getYear());

        Date d2;
        d2 = new Date(2022,9,5);
        d2.oneYearLater();
        assertEquals(2023, d2.getYear());
    }

    @Test
    public  void testOneYearEarlier() {
        Date d1;
        d1 = new Date();
        d1.oneYearEarlier();
        assertEquals(1665,d1.getYear());

        Date d2;
        d2 = new Date(2022,9,5);
        d2.oneYearEarlier();
        assertEquals(2021, d2.getYear());
    }

    @Test
    public  void testOneMonthLater() {
        Date d1;
        d1 = new Date();
        d1.oneMonthLater();
        assertEquals(2,d1.getMonth());

        Date d2;
        d2 = new Date(2022,9,5);
        d2.oneMonthLater();
        assertEquals(10, d2.getMonth());
    }

    @Test
    public  void testOneMonthEarlier() {
        Date d1;
        d1 = new Date();
        d1.oneMonthEarlier();
        assertEquals(12,d1.getMonth());

        Date d2;
        d2 = new Date(2022,9,5);
        d2.oneMonthEarlier();
        assertEquals(8, d2.getMonth());
    }

    @Test
    public  void testOneDayLater() {
        Date d1;
        d1 = new Date();
        d1.oneDayLater();
        assertEquals(2,d1.getDay());

        Date d2;
        d2 = new Date(2022,9,5);
        d2.oneDayLater();
        assertEquals(6, d2.getDay());
    }

    @Test
    public  void testOneDayEarlier() {
        Date d1;
        d1 = new Date();
        d1.oneDayEarlier();
        assertEquals(31,d1.getDay());

        Date d2;
        d2 = new Date(2022,9,5);
        d2.oneDayEarlier();
        assertEquals(4, d2.getDay());
    }
}
