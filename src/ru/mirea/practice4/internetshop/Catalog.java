package ru.mirea.practice4.internetshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Catalog {
    private final List<Product> productsInShop = new ArrayList<>();

    public void PushToShop(Product product){
        productsInShop.add(product);
    }

    public void DeleteFromShop(Product product){
        productsInShop.remove(product);
    }
    public Product GetProduct(String name){
        for(Product product : productsInShop)
            if(Objects.equals(product.getName(), name))
                return product;
        return null;
    }
    public void ShowProductsInCatalog(){
        if(productsInShop.size() == 0){
            System.out.println("Empty");
        }
        for(Product product : productsInShop){
            product.ShowInfo();
        }
    }
}
