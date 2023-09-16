package ru.mirea.practice8.palindrome;

import java.util.Scanner;

public class Solution {
    public static boolean isPalindrome(String word, int index){
        if(word.charAt(index) != word.charAt(word.length() - index - 1))
            return false;

        if(index > word.length() - index - 1)
            return true;

        return isPalindrome(word, index + 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите слово: ");
        String word = scan.next();

        System.out.println(isPalindrome(word, 0));
    }
}
