package ru.mirea.practice8.count_of_max;

import java.util.Scanner;

public class Solution {
    static Scanner scan = new Scanner(System.in);
    // Как сделать без параметров???
    public static int CountOfMax(int count, int max){
        int number = scan.nextInt();

        if(number == 0)
            return count;

        if(number > max)
            return CountOfMax(1, number);
        else if(number == max)
            return CountOfMax(count + 1, max);
        else
            return CountOfMax(count, max);
    }
    public static void main(String[] args) {
        System.out.println(CountOfMax(0, Integer.MIN_VALUE));
    }
}
