package ru.mirea.practice11.compare_date;

import java.util.Date;
import java.util.Scanner;

public class CompareDate {
    public static void main(String[] args) {
        Date date = new Date();
        Scanner scan = new Scanner(System.in);

        int year, month, day, hour, minute, second;
        System.out.print("Введите год, месяц, день, час, минуту и секунду: ");
        year = scan.nextInt() - 1900;
        month = scan.nextInt() - 1;
        day = scan.nextInt();
        hour = scan.nextInt();
        minute = scan.nextInt();
        second = scan.nextInt();

        Date curTime = new Date(date.getTime());
        Date enteredDate = new Date(year, month, day, hour, minute, second);

        System.out.println("Текущее: " + curTime);
        System.out.println("Введённое: " + enteredDate);
        System.out.print("Сравнение: ");
        if(curTime.after(enteredDate))
            System.out.println("ввели дату из прошлого!");
        else if(curTime.before(enteredDate))
            System.out.println("ввели дату из будущего!");
        else
            System.out.println("идеально попал в текущее время!");
    }
}
