package ru.mirea.practice6.nameable;

public class Tester {
    public static void main(String[] args) {
        Nameable[] objects = {new Human("Димас"), new Dog("Жучка"), new Cat("Мурка"), new Planet("Юпитер")};

        for(Nameable object : objects){
            System.out.println(object.getClass().toString() + " : " + object.getName());
        }
    }
}
