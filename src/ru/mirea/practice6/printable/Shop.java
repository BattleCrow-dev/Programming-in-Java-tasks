package ru.mirea.practice6.printable;

public class Shop implements Printable{
    String text;

    public Shop(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println(text);
    }
}
