package ru.mirea.practice6.priceable;

public class House implements Priceable{
    int price;

    public House(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
