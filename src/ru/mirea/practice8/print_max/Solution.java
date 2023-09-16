package ru.mirea.practice8.print_max;

import java.util.Scanner;

public class Solution {
    static Scanner scan = new Scanner(System.in);
    public static int PrintMax(){
        int number = scan.nextInt();

        if(number == 0)
            return 0;

        return Math.max(number, PrintMax());
    }
    public static void main(String[] args) {
        System.out.println(PrintMax());
    }
}
