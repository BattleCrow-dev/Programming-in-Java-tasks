package ru.mirea.practice8.without_two_zeros;

import java.util.Scanner;

public class Solution {
    public static int WithoutTwoZeros(int a, int b) {
        return (a > b + 1) ? 0 : (a == 0 || b == 0) ? 1 : WithoutTwoZeros(a, b - 1) + WithoutTwoZeros(a - 1, b - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите a: ");
        int a = scan.nextInt();
        System.out.print("Введите b: ");
        int b = scan.nextInt();

        System.out.println(WithoutTwoZeros(a, b));
    }
}
