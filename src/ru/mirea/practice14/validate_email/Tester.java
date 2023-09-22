package ru.mirea.practice14.validate_email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester {
    public static String line1 = "user@example.com";
    public static String line2 = "root@localhost";

    public static String line3 = "myhost@@@com.ru";
    public static String line4 = "@my.ru";
    public static String line5 = "Julia String.";

    public static void main(String[] args) {

        // Наверняка не полноценная регулярка
        Pattern pattern = Pattern.compile("[a-z0-9]+@(localhost|[a-z]+(\\.[a-z]+))");

        /*
        Вот полноценная ;)

        (?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|"(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21\x23-\x5b\x5d-\x7f]|\\[\x01-\x09\x0b\x0c\x0e-\x7f])*")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21-\x5a\x53-\x7f]|\\[\x01-\x09\x0b\x0c\x0e-\x7f])+)\])
         */

        Matcher matcher1 = pattern.matcher(line1);
        Matcher matcher2 = pattern.matcher(line2);
        Matcher matcher3 = pattern.matcher(line3);
        Matcher matcher4 = pattern.matcher(line4);
        Matcher matcher5 = pattern.matcher(line5);

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
    }
}
