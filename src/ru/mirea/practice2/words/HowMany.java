package ru.mirea.practice2.words;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;

        System.out.print("Введите строку текста : ");
        line = scanner.nextLine();

        int wordsCount = 1;
        for(int i = 0; i < line.length(); i++)
            wordsCount += line.charAt(i) == ' ' ? 1 : 0;

        System.out.println("Количество слов: " + wordsCount);
    }
}
