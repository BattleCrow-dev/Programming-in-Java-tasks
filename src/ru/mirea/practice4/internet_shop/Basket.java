package ru.mirea.practice4.internet_shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Basket {
    private final List<Product> productsToBuy = new ArrayList<>();

    public void PushToBasket(Product product){
        productsToBuy.add(product);
    }
    public void RemoveFromBasket(Product product){
        productsToBuy.remove(product);
    }
    public void RemoveAllFromBasket(){
        productsToBuy.clear();
    }
    public Product GetProduct(String name){
        for(Product product : productsToBuy)
            if(Objects.equals(product.getName(), name))
                return product;
        return null;
    }
    public void ShowProductsInBasket(){
        if(productsToBuy.size() == 0){
            System.out.println("Empty");
        }
        for(Product product : productsToBuy){
            product.ShowInfo();
        }
    }
}
