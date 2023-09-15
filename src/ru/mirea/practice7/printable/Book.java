package ru.mirea.practice7.printable;

public class Book implements Printable{
    private String text;

    public Book(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println(text);
    }

    public static void printBooks(Printable[] printables){
        for(Printable printable : printables)
            if(printable instanceof Book)
                printable.print();
    }
}
