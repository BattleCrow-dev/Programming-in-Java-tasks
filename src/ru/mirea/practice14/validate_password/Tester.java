package ru.mirea.practice14.validate_password;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester {
    public static String line1 = "F032_Password";
    public static String line2 = "TrySpy12";

    public static String line3 = "smart_pass";
    public static String line4 = "A007";

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("(?=.+[0-9])(?=.+[a-z])(?=.+[A-Z])[0-9a-zA-Z_]{8,}");

        Matcher matcher1 = pattern.matcher(line1);
        Matcher matcher2 = pattern.matcher(line2);
        Matcher matcher3 = pattern.matcher(line3);
        Matcher matcher4 = pattern.matcher(line4);

        if(matcher1.find())
            System.out.println("ХОРОШИЙ");
        else
            System.out.println("ПЛОХОЙ");

        if(matcher2.find())
            System.out.println("ХОРОШИЙ");
        else
            System.out.println("ПЛОХОЙ");

        if(matcher3.find())
            System.out.println("ХОРОШИЙ");
        else
            System.out.println("ПЛОХОЙ");

        if(matcher4.find())
            System.out.println("ХОРОШИЙ");
        else
            System.out.println("ПЛОХОЙ");
    }
}
