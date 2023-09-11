package ru.mirea.practice4_1.persons;

public class Tester {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Дима", 19);

        person1.move();
        person2.move();

        person1.talk();
        person2.talk();
    }
}
