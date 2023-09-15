package ru.mirea.practice7.printable;

public class Tester {
    public static void main(String[] args) {
        Printable[] printables = {new Magazine("Magazine"), new Magazine("HTML"), new Book("Hi, bro!"), new Book("Chertov, Vorob'ev")};

        Magazine.printMagazines(printables);
        Book.printBooks(printables);
    }
}
