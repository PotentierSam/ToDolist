package essai;

import time.Time;

public class essaiHeure {

    public void essai() {
        Time t;
        t = new Time(15,52);
        System.out.println("time : "+ t.getHour() + ":" + t.getMinute());
    }
}
