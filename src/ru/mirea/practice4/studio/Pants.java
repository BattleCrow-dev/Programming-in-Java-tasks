package ru.mirea.practice4.studio;

public class Pants extends Clothes implements MenClothing, WomenClothing{

    public Pants(Sizes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println(this.getClass().getName() + " " + this.getSize() + " " + this.getPrice() + " " + this.getColor());
    }

    @Override
    public void dressWoman() {
        System.out.println(this.getClass().getName() + " " + this.getSize() + " " + this.getPrice() + " " + this.getColor());
    }
}
