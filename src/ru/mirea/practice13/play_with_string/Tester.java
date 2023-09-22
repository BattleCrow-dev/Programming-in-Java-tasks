package ru.mirea.practice13.play_with_string;

import java.util.Scanner;

public class Tester {
    public static void someMethod(String someString){
        System.out.println("Последний символ: " + someString.charAt(someString.length() - 1));
        System.out.println("Оканчивается ли на '!!!': " + someString.endsWith("!!!"));
        System.out.println("Начинается ли на 'I like': " + someString.startsWith("I like"));
        System.out.println("Содержит ли на 'Java': " + someString.contains("Java"));
        System.out.println("Позиция подстроки 'Java': " + someString.indexOf("Java"));
        System.out.println("После изменения 'a' на 'o': " + someString.replace('a', 'o'));
        System.out.println("Верхний регистр: " + someString.toUpperCase());
        System.out.println("Нижний регистр: " + someString.toLowerCase());
        System.out.println("Вырезка с 7-ого по 10-ый символ (включительно): " + someString.substring(7, 11));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        someMethod(scan.nextLine());
    }
}
