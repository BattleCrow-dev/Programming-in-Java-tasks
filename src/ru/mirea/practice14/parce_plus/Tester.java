package ru.mirea.practice14.parce_plus;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester {
    public static String line1 = "(1 + 8) – 9 / 4";
    public static String line2 = "6 / 5 – 2 * 9";

    public static void main(String[] args) {
        // Задание так себе, я ищу комбинацию "число + {что-угодно} + '+'"
        Pattern pattern = Pattern.compile("\\d*\\+");
        Matcher matcher1 = pattern.matcher(line1);
        Matcher matcher2 = pattern.matcher(line2);

        if(matcher1.find())
            System.out.println("В первой есть числа, за которыми стоит '+'!");
        else
            System.out.println("В первой нет чисел, за которыми стоит '+'!");

        System.out.println();

        if(matcher2.find())
            System.out.println("Во второй есть числа, за которыми стоит '+'!");
        else
            System.out.println("Во второй нет чисел, за которыми стоит '+'!");
    }
}
