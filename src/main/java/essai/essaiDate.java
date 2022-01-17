package essai;

import date.Date;

public class essaiDate {
    public static void main(String args[]) {
        try {
            Date date;
            date = new Date(2022,9,5);
            System.out.println("date : "+ date.getDay() + "/" + date.getMonth());
            date.setDay(70);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
