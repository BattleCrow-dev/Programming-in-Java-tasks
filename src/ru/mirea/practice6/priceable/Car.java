package ru.mirea.practice6.priceable;

public class Car implements Priceable{
    int price;

    public Car(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
