package ru.mirea.practice4.internetshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class UsersPool {
    private final List<User> users = new ArrayList<>(){};
    private User activeUser = null;

    public UsersPool() {
        users.add(new User("Admin", "root", "admin"));
        activeUser = users.get(0);
    }

    public void Registration(){
        Scanner scan = new Scanner(System.in);
        String name, login, password;

        System.out.print("\nEnter the name: ");
        name = scan.next();

        System.out.print("Enter the login: ");
        login = scan.next();

        System.out.print("Enter the password: ");
        password = scan.next();

        for(User user :users)
            if(Objects.equals(user.getLogin(), login)) {
                System.out.println("This login already used!");
                return;
            }

        users.add(new User(name, login, password));
    }

    public void RemoveUser(String name){
        if(Objects.equals(activeUser.getName(), "Admin")) {
            users.removeIf(user -> Objects.equals(user.getName(), name));
            System.out.println("Success");
            return;
        }
        System.out.println("You aren't admin!");
    }

    public void Authorization(String login, String password){
        for(User user : users){
            if(Objects.equals(user.getLogin(), login) && Objects.equals(user.getPassword(), password)){
                activeUser = user;
                System.out.println("Hi, " + user.getName() + "! You are active user!");
                return;
            }
        }
        System.out.println("You aren't registered!");
    }

    public void PushProductToCatalog(String name, int price){
        if(Objects.equals(activeUser.getName(), "Admin")) {
            activeUser.PushToCatalog(name, price);
            System.out.println("Success");
            return;
        }
        System.out.println("You aren't admin!");
    }

    public void PushProductToBasket(String name){
            activeUser.PushToBasket(name);
    }

    public void DeleteProductFromBasket(String name){
        activeUser.DeleteFromBasket(name);
    }

    public void SeeTheCatalog(){
        activeUser.ShowCatalog();
    }

    public void SeeTheBasket(){
        activeUser.ShowBasket();
    }
}
