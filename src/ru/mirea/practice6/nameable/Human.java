package ru.mirea.practice6.nameable;

public class Human implements Nameable {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
