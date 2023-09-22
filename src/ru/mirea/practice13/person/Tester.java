package ru.mirea.practice13.person;

public class Tester {
    public static void main(String[] args) {
        Person p1 = new Person("Сидоров");
        Person p2 = new Person("Пашков", "Дмитрий", "Сергеевич");

        System.out.println(p1.getFullName());
        System.out.println();
        System.out.println(p2.getFullName());
    }
}
