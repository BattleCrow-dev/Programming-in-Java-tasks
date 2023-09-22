package ru.mirea.practice14.compare_with_abcdefghijklmnopqrstuv18340;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String line = scan.nextLine();

        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher = pattern.matcher(line);

        if(matcher.matches())
            System.out.println("ДА");
        else
            System.out.println("НЕТ");
    }
}
