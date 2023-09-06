package ru.mirea.practice2.reverse;

public class ReverseTest {
    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d", "e", "f", "g"};

        System.out.print("Начальный массив: ");
        for(String x : array)
            System.out.print(x + " ");

        for(int i = 0; i < array.length / 2; i++){
            String temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        System.out.print("\nРазвёрнутый массив: ");
        for(String x : array)
            System.out.print(x + " ");
    }
}
