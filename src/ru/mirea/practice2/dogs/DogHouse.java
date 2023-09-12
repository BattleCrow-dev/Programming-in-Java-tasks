package ru.mirea.practice2.dogs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DogHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Dog> dogs = new ArrayList<>();
        String name;
        int age;

        for(int i = 0; i < 2; i++){
            System.out.println("Введите кличку: ");
            name = scanner.next();
            System.out.println("Введите возраст: ");
            age = scanner.nextInt();
            dogs.add(new Dog(name, age));
        }
        System.out.println(dogs.get(0).fromDogToHuman());
        System.out.println(dogs);
    }
}
