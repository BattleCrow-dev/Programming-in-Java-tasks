package ru.mirea.practice4.studio;

public class Tie extends Clothes implements MenClothing{
    public Tie(Sizes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println(this.getClass().getName() + " " + this.getSize() + " " + this.getPrice() + " " + this.getColor());
    }
}
