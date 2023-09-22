package ru.mirea.practice13.telephone;

public class Tester {
    public static void main(String[] args) {
        Telephone telephone = new Telephone();
        System.out.println(telephone.parseNumber("+104289652211"));
        System.out.println(telephone.parseNumber("+79175655655"));
        System.out.println(telephone.parseNumber("89175655655"));
    }
}
