package ru.mirea.practice11.date_and_calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Date d = new Date();
        Scanner scan = new Scanner(System.in);

        int year, month, day, hour, minute, second;
        System.out.print("Введите год, месяц, день, час, минуту и секунду: ");
        year = scan.nextInt() - 1900;
        month = scan.nextInt() - 1;
        day = scan.nextInt();
        hour = scan.nextInt();
        minute = scan.nextInt();
        second = scan.nextInt();

        Date enteredDate = new Date(year, month, day, hour, minute, second);
        System.out.println(enteredDate);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(enteredDate);
        System.out.println(calendar.getTime());
    }
}
