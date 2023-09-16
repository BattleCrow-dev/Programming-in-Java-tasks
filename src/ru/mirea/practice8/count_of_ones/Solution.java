package ru.mirea.practice8.count_of_ones;

import java.util.Objects;
import java.util.Scanner;

public class Solution {
    static Scanner scan = new Scanner(System.in);
    public static int CountOfOnes(){
        String str1 = scan.next();
        String str2 = scan.next();

        if (Objects.equals(str1, "0") && Objects.equals(str2, "0"))
            return 0;

        return (Objects.equals(str1, "1") && Objects.equals(str2, "1")) ? CountOfOnes() + 2: (Objects.equals(str1, "1") || Objects.equals(str2, "1")) ? CountOfOnes() + 1 : CountOfOnes();
    }

    public static void main(String[] args) {
        System.out.println(CountOfOnes());
    }
}
