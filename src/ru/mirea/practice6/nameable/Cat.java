package ru.mirea.practice6.nameable;

public class Cat implements Nameable{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
