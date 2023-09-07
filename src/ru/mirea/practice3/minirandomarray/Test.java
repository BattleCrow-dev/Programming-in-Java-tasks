package ru.mirea.practice3.minirandomarray;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random rand = new Random();

        for(int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10, 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int temp = array[0];
        boolean flag = true;

        for (int value : array){
            if(temp >= value){
                System.out.println("Значения не строго возрастают!");
                flag = false;
                break;
            } else
                temp = value;
        }

        if(flag)
            System.out.println("Значения строго возрастают!");
    }
}
