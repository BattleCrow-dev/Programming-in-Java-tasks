package ru.mirea.practice8.from_A_to_B;

import java.util.Scanner;

public class Solution {
    public static void UpSequence(int n, int k){
        if(n > k)
            return;

        System.out.print(n + " ");
        UpSequence(n + 1, k);
    }

    public static void DownSequence(int n, int k){
        if(n < k)
            return;

        System.out.print(n + " ");
        DownSequence(n - 1, k);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите начало последовательности: ");
        int a = scan.nextInt();
        System.out.print("Введите предел последовательности: ");
        int b = scan.nextInt();

        if(a >= b)
            DownSequence(a, b);
        else
            UpSequence(a, b);
    }
}
