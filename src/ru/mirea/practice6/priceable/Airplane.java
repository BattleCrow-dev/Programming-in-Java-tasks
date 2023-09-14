package ru.mirea.practice6.priceable;

public class Airplane implements Priceable{
    int price;

    public Airplane(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
