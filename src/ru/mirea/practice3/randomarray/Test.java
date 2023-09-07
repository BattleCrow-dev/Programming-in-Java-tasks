package ru.mirea.practice3.randomarray;

import java.util.Random;

import static java.util.Arrays.sort;

public class Test {
    public static void main(String[] args) {
        float[] array = new float[10];
        Random rand = new Random();

        for(int i = 0; i < array.length; i++)
            array[i] = Math.abs(rand.nextFloat() % 100);

        System.out.print("Исходный массив: ");
        for(float num : array)
            System.out.print(num + " ");
        System.out.println();

        sort(array);
        System.out.print("Отсортированный массив: ");
        for(float num : array)
            System.out.print(num + " ");
    }
}
