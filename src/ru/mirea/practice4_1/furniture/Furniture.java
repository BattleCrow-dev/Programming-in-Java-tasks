package ru.mirea.practice4_1.furniture;

public abstract class Furniture {
    private String type;
    private int price;

    public Furniture() {
        this.type = "None";
        this.price = 0;
    }

    public Furniture(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
