package ru.mirea.practice14.parse_money;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester {
    public static String line = "50.25 USD, 25 EU, 100 RUB, 55 ERR, 12.45 EU, 100 TYUE, w273yhogiweqourhqwruo, 0.004 EU.";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("((?<!\\d)(?<!\\.))\\d+(\\.\\d{1,2})?\\s?(USD|EU|RUB)");
        Matcher matcher = pattern.matcher(line);
        while(matcher.find())
            System.out.print(matcher.group() + "; ");
    }
}
