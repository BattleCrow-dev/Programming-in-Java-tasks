package ru.mirea.practice8.sum_of_digits;

import java.util.Scanner;

public class Solution {

    public static int SumOfDigits(int number){
        return number > 0 ? number % 10 + SumOfDigits(number / 10) : 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scan.nextInt();

        System.out.println(SumOfDigits(number));
    }
}
