package ru.mirea.practice8.sum_of_digits_k_s;

import java.util.Scanner;

public class Solution {

    public static int SumOfDigitsKS(int len, int sum, int k, int s){
            if(len == k) {
                return sum == s ? 1 : 0;
            }

            int c = (len == 0 ? 1 : 0);
            int res = 0;

            for(int i = c; i < 10; i++) {
                res += SumOfDigitsKS(len + 1, sum + i, k, s);
            }

            return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите k: ");
        int k = scan.nextInt();
        System.out.print("Введите s: ");
        int s = scan.nextInt();

        System.out.println(SumOfDigitsKS(0, 0, k, s));
    }
}
