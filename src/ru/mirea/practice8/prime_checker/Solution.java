package ru.mirea.practice8.prime_checker;

import java.util.Scanner;

public class Solution {
    public static boolean isPrime(int number, int del){
        if(del > Math.pow(number, 0.5))
            return true;

        if(number % del == 0)
            return false;

        return isPrime(number, del + 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scan.nextInt();

        System.out.println(isPrime(number, 2) ? "YES" : "NO");
    }
}
