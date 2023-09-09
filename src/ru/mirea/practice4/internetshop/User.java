package ru.mirea.practice4.internetshop;

import java.util.Objects;

public class User {
    private static final Catalog catalog = new Catalog();
    private final Basket basket = new Basket();
    private final String name;
    private final String login;
    private final String password;

    public User(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public void PushToCatalog(String name, int price){
        if(Objects.equals(this.name, "Admin")){
            catalog.PushToShop(new Product(name, price));
            System.out.println("Success");
            return;
        }
        System.out.println("You cannot do this!");
    }
    public void PushToBasket(String name){
        if(catalog.GetProduct(name) != null) {
            basket.PushToBasket(catalog.GetProduct(name));
            catalog.DeleteFromShop(catalog.GetProduct(name));
            System.out.println("Success");
        }
        System.out.println("Not found!");
    }

    public void DeleteFromBasket(String name){
        if(basket.GetProduct(name) != null) {
            catalog.PushToShop(basket.GetProduct(name));
            basket.RemoveFromBasket(basket.GetProduct(name));
            System.out.println("Success");
        }
        System.out.println("Not found!");
    }
    public String getPassword() {
        return password;
    }

    public void ShowBasket(){
        basket.ShowProductsInBasket();
    }

    public void ShowCatalog(){
        catalog.ShowProductsInCatalog();
    }
}
