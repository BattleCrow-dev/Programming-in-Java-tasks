package ru.mirea.practice8.reverse_number;

import java.util.Scanner;

public class Solution {
    public static int ReverseNumber(int number, int result){
        if(number == 0)
            return result;

        return ReverseNumber(number / 10, result * 10 + number % 10);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scan.nextInt();

        System.out.println(ReverseNumber(number, 0));
    }
}
