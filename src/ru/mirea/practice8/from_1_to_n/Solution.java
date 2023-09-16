package ru.mirea.practice8.from_1_to_n;

import java.util.Scanner;

public class Solution {
    public static void Sequence(int n, int k){
        if(n > k)
            return;

        System.out.print(n + " ");
        Sequence(n + 1, k);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите предел последовательности: ");
        int n = scan.nextInt();

        Sequence(1, n);
    }
}
