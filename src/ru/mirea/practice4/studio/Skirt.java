package ru.mirea.practice4.studio;

public class Skirt extends Clothes implements WomenClothing{
    public Skirt(Sizes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.println(this.getClass().getName() + " " + this.getSize() + " " + this.getPrice() + " " + this.getColor());
    }
}
