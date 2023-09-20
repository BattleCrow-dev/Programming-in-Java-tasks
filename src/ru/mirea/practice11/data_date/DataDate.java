package ru.mirea.practice11.data_date;

import java.util.Calendar;
import java.util.Date;

public class DataDate {
    public static void main(String[] args) {
        Date date = new Date();

        String lastname = "Пашков";
        Date receivingDate = new Date(123, Calendar.SEPTEMBER, 5, 12, 40, 0);
        Date acceptDate = new Date(date.getTime());

        System.out.println(lastname);
        System.out.println(receivingDate);
        System.out.println(acceptDate);
    }
}
