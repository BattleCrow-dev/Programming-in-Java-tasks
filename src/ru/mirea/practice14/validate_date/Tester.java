package ru.mirea.practice14.validate_date;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester {
    public static String line1 = "29/02/2000";
    public static String line2 = "30/04/2003";
    public static String line3 = "01/01/2003";

    public static String line4 = "32/02/2001";
    public static String line5 = "30-04-2003";
    public static String line6 = "1/1/1899";

    public static void main(String[] args) {

        // Без проверки на високосные годы и на февраль
        Pattern pattern = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|[2-9][0-9])\\d{2}$");

        Matcher matcher1 = pattern.matcher(line1);
        Matcher matcher2 = pattern.matcher(line2);
        Matcher matcher3 = pattern.matcher(line3);
        Matcher matcher4 = pattern.matcher(line4);
        Matcher matcher5 = pattern.matcher(line5);
        Matcher matcher6 = pattern.matcher(line6);

        if(matcher1.find())
            System.out.println("ЯВЛЯЕТСЯ");
        else
            System.out.println("НЕ ЯВЛЯЕТСЯ");

        if(matcher2.find())
            System.out.println("ЯВЛЯЕТСЯ");
        else
            System.out.println("НЕ ЯВЛЯЕТСЯ");

        if(matcher3.find())
            System.out.println("ЯВЛЯЕТСЯ");
        else
            System.out.println("НЕ ЯВЛЯЕТСЯ");

        if(matcher4.find())
            System.out.println("ЯВЛЯЕТСЯ");
        else
            System.out.println("НЕ ЯВЛЯЕТСЯ");

        if(matcher5.find())
            System.out.println("ЯВЛЯЕТСЯ");
        else
            System.out.println("НЕ ЯВЛЯЕТСЯ");

        if(matcher6.find())
            System.out.println("ЯВЛЯЕТСЯ");
        else
            System.out.println("НЕ ЯВЛЯЕТСЯ");
    }
}
