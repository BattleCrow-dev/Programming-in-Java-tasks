package ru.mirea.practice3.even_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int n = 0;

        while(true) {
            System.out.print("Введите размер массива: ");
            if (scan.hasNextInt()) {
                n = scan.nextInt();
                break;
            } else {
                System.out.println("Вы ввели что-то не то!");
            }
        }

        int[] array = new int[n];

        System.out.print("Исходный массив: ");
        for(int i = 0; i < n; i++) {
            array[i] = rand.nextInt(0, n + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        List<Integer> evenArray = new ArrayList<>();
        for(int num : array)
            if(num % 2 == 0)
                evenArray.add(num);

        System.out.print("Чётные элементы из массива: ");
        for(Integer num : evenArray)
            System.out.print(num + " ");
    }
}
