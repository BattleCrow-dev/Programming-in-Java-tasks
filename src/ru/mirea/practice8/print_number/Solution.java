package ru.mirea.practice8.print_number;

import java.util.Scanner;

public class Solution {
    public static String PrintNumber(int number){
        if(number == 0)
            return "";

        return PrintNumber(number / 10) + " " + (number % 10);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(PrintNumber(number));
    }
}
