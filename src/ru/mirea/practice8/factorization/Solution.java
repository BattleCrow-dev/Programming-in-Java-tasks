package ru.mirea.practice8.factorization;

import java.util.Scanner;

public class Solution {
    public static boolean isPrime(int number, int del){
        if(del > Math.pow(number, 0.5))
            return true;

        if(number % del == 0)
            return false;

        return isPrime(number, del + 1);
    }
    public static void Factorization(int number, int del){
        if (number == 1)
            return;

        if (!isPrime(del, 2) || (number % del) != 0)
            Factorization(number,del + 1);
        else
        {
            System.out.println(del + " ");
            Factorization(number / del, del);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scan.nextInt();

        Factorization(number, 2);
    }
}
