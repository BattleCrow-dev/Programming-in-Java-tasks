package ru.mirea.practice4.internetshop;

import java.util.Scanner;

public class TestSystem {
    public static void main(String[] args) {
        UsersPool usersPool = new UsersPool();
        Scanner scan = new Scanner(System.in);

        int input = -2;
        System.out.println("Commands:\n0 - Registration\n1 - Authorization\n2 - Push product in catalog (if admin)\n3 - See the catalog\n4 - See the basket\n5 - Push product to basket\n6 - Delete product from basket\n7 - Delete user (if admin)\n\n-1 - Exit");
        while(input != -1){
            System.out.print("\nEnter the command: ");
            input = scan.nextInt();

            switch (input) {
                case -1 -> {
                    System.out.println("Goodbye, user!");
                }
                case 0-> {
                    usersPool.Registration();
                }
                case 1 -> {
                    String login, password;
                    System.out.print("Authorization:\nEnter the login: ");
                    login = scan.next();
                    System.out.print("Enter the password: ");
                    password = scan.next();
                    usersPool.Authorization(login, password);
                }
                case 2 -> {
                    String name;
                    int price;
                    System.out.print("Push product:\nEnter the name: ");
                    name = scan.next();
                    System.out.print("Enter the price: ");
                    price = scan.nextInt();
                    usersPool.PushProductToCatalog(name, price);
                }
                case 3 -> {
                    usersPool.SeeTheCatalog();
                }
                case 4 -> {
                    usersPool.SeeTheBasket();
                }
                case 5 -> {
                    String name;
                    System.out.print("Push product:\nEnter the name: ");
                    name = scan.next();
                    usersPool.PushProductToBasket(name);
                }
                case 6 -> {
                    String name;
                    System.out.print("Delete product:\nEnter the name: ");
                    name = scan.next();
                    usersPool.DeleteProductFromBasket(name);
                }
                case 7 -> {
                    String name;
                    System.out.print("Delete product:\nEnter the name: ");
                    name = scan.next();
                    usersPool.RemoveUser(name);
                }
            }
        }
    }
}
