package ru.mirea.practice8.print_odd;

import java.util.Objects;
import java.util.Scanner;

public class Solution {
    static Scanner scan = new Scanner(System.in);
    public static void PrintOdd(){
        int number = scan.nextInt();

        if(number == 0)
            return;

        if(number % 2 == 1)
            System.out.println(number + " ");

        PrintOdd();
    }

    public static void main(String[] args) {
        PrintOdd();
    }
}
