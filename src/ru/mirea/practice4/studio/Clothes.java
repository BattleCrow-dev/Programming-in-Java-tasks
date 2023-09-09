package ru.mirea.practice4.studio;

public abstract class Clothes {
    Sizes size;
    double price;
    String color;

    public Clothes() {
        this.size = Sizes.XXS;
        this.price = 0;
        this.color = "None";
    }

    public Clothes(Sizes size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Sizes getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}
