package ru.mirea.practice19.INN_checker;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static final Person[] persons = {new Person("Дима", "12345"), new Person("Гриша", "111222"), new Person("Тёмыч", "98765")};

    private static boolean checkPerson(String name, String INN) {
        for(Person person : persons)
            if(Objects.equals(person.getName(), name) && Objects.equals(person.getINN(), INN))
                return true;

        throw new IllegalArgumentException("Такой пользователь не существует в базе!");
    }

    public static void main(String[] args) {
        String name, INN;
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите имя: ");
        name = scan.next();
        System.out.print("Введите ИНН: ");
        INN = scan.next();

        if(checkPerson(name, INN))
            System.out.println("Такой есть!");
        else
            System.out.println("Такого нет!");
    }
}
