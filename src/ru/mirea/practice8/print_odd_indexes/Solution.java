package ru.mirea.practice8.print_odd_indexes;

import java.util.Scanner;

public class Solution {
    static Scanner scan = new Scanner(System.in);
    public static void PrintOddIndexes(){
        int number1 = scan.nextInt();

        if(number1 == 0)
            return;
        else
            System.out.println(number1);

        int number2 = scan.nextInt();

        if(number2 == 0)
            return;

        PrintOddIndexes();
    }
    public static void main(String[] args) {
        PrintOddIndexes();
    }
}
