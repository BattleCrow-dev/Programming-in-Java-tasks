package ru.mirea.practice2.words;

import java.util.Scanner;
import java.util.StringTokenizer;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;

        System.out.print("Введите строку текста : ");
        line = scanner.nextLine();

        System.out.println("Количество слов: " + new StringTokenizer(line, " ").countTokens());
    }
}
