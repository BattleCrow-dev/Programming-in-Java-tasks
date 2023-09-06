package ru.mirea.practice1;

import java.util.Scanner;

public class Practice_1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {

            System.out.print('\n' + "Введите номер задания: ");
            number = scanner.nextInt();

            switch (number) {
                case 0 -> {}
                case 1 -> averageValue();
                case 2 -> sumMaxMin();
                case 3 -> argsPrinter(args);
                case 4 -> harmony();
                case 5 -> factorial();
                default -> System.out.println("Нет такого задания!");
            }

        } while (number != 0);
    }

    public static void averageValue()
    {
        System.out.println("-> Задание 1");

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int sum = 0;

        System.out.println("Введите 5 чисел: ");
        for(int i = 0; i < array.length; i++)
        {
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        System.out.println(sum / array.length);

        System.out.println("Конец задания 1");
    }

    public static void sumMaxMin()
    {
        System.out.println("-> Задание 2");

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("Введите 5 чисел: ");
        for(int i = 0; i < array.length; i++)
            array[i] = scanner.nextInt();

        int sumDoWhile = 0;
        int sumWhile = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        int i = 0;
        do{
            sumDoWhile += array[i];
            max = Math.max(array[i], max);
            min = Math.min(array[i], min);
            i++;
        } while (i < array.length);

        while(i > 0)
        {
            i--;
            sumWhile += array[i];
        }

        System.out.println("Сумма через do..while: " + sumDoWhile);
        System.out.println("Сумма через while: " + sumWhile);
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);

        System.out.println("Конец задания 2");
    }

    public static void argsPrinter(String[] args)
    {
        System.out.println("-> Задание 3");

        for (String arg : args)
            System.out.print(arg + " ");

        System.out.println('\n' + "Конец задания 3");
    }

    public static void harmony()
    {
        System.out.println("-> Задание 4");

        for(int i = 1; i < 11; i++)
            System.out.printf("%.2f%n", 1.0 / i);

        System.out.println("Конец задания 4");
    }

    public static void factorial()
    {
        System.out.println("-> Задание 5");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        int fact = 1;

        for(int i = 1; i <= num; i++)
            fact *= i;

        System.out.println("Факториал числа " + num + " равен: " + fact);
        System.out.println("Конец задания 5");
    }
}
