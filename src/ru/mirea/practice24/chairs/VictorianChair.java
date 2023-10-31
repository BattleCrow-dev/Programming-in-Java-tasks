package ru.mirea.practice24.chairs;

public class VictorianChair implements Chair {
    private final int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
