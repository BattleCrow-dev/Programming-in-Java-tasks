package ru.mirea.practice20.generic_example;

public class Main {
    public static void main(String[] args) {
        GenericClass<Integer, String, Double> genericObj = new GenericClass<>(12345, "Some string", 1.234);
        genericObj.printClassNames();
    }
}
