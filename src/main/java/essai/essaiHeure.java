package essai;

import time.Time;

import java.util.EmptyStackException;

public class essaiHeure {

    public static void main(String args[]) {
        try {
            Time t;
            t = new Time(15,52);
            System.out.println("time : "+ t.getHour() + ":" + t.getMinute());
            t.setMinute(70);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
