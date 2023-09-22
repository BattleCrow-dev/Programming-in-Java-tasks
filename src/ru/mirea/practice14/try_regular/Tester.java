package ru.mirea.practice14.try_regular;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Tester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String line = scan.nextLine();

        System.out.print("Введите разделитель: ");
        String delimiter = scan.nextLine();
        Pattern pattern = Pattern.compile(delimiter);

        System.out.println(Arrays.toString(pattern.split(line)));
    }
}
