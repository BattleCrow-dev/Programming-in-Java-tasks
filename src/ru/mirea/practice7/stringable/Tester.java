package ru.mirea.practice7.stringable;

public class Tester {
    public static void main(String[] args) {
        ProcessStrings stringTools = new ProcessStrings();

        System.out.println(stringTools.getCharCount("qwerty12345"));
        System.out.println(stringTools.deleteEven("qwerty12345"));
        System.out.println(stringTools.reverse("qwerty12345"));
    }
}
