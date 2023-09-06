package ru.mirea.practice2.shop;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        System.out.println("Введите 5 имён компьютеров: ");
        for(int i = 0; i < 5; i++){
            shop.addComputer(scanner.nextLine());
        }

        System.out.println(shop);
    }
}
