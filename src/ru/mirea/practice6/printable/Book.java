package ru.mirea.practice6.printable;

public class Book implements Printable{
    String text;

    public Book(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println(text);
    }
}
