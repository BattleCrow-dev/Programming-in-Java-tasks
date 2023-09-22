package ru.mirea.practice14.parse_money;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester {
    public static String line = "50.25 USD, 25 EUR, 100 RUB, 55 ERR, 100 TYUE, w273yhogiweqourhqwruo, 154.78 USD";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?\\s?(USD|EUR|RUB)");
        Matcher matcher = pattern.matcher(line);
        while(matcher.find())
            System.out.print(matcher.group() + "; ");
    }
}
