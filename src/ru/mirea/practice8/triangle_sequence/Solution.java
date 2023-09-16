package ru.mirea.practice8.triangle_sequence;

import java.util.Scanner;

public class Solution {
    public static void TriangleSequence(int n, int k){
        if(n > k)
            return;

        for(int i = 0; i < n; i++)
            System.out.print(n + " ");

        TriangleSequence(n + 1, k);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите предел последовательности: ");
        int n = scan.nextInt();

        TriangleSequence(1, n);
    }
}
