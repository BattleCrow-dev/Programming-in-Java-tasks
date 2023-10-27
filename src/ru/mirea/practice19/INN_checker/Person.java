package ru.mirea.practice19.INN_checker;

public class Person {
    private final String name;
    private final String INN;

    public Person(String name, String INN) {
        this.name = name;
        this.INN = INN;
    }

    public String getName() {
        return name;
    }

    public String getINN() {
        return INN;
    }
}
