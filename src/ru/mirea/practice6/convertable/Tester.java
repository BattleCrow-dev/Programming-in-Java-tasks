package ru.mirea.practice6.convertable;

public class Tester {
    public static void main(String[] args) {
        Value value = new Value(100, "Цельсий");

        value.convert("Фаренгейт");
        System.out.println(value.getValue());
        value.convert("Фаренгейт");
        System.out.println(value.getValue());
        value.convert("Цельсий");
        System.out.println(value.getValue());
        value.convert("Кельвин");
        System.out.println(value.getValue());
        value.convert("Фаренгейт");
        System.out.println(value.getValue());
    }
}
