package ru.mirea.practice8.reverse_number_and_print;

import java.util.Scanner;

public class Solution {
    public static String ReverseNumber(int number){
        if(number == 0)
            return "";

        return (number % 10) + " " + ReverseNumber(number / 10);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(ReverseNumber(number));
    }
}
