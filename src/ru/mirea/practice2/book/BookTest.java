package ru.mirea.practice2.book;

public class BookTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();

        bookshelf.addBook(new Book("ya", "privet", 87, 12));
        bookshelf.addBook(new Book("on", "mario", 2134, 22));
        bookshelf.addBook(new Book("mi", "biba", 12, 32));

        System.out.println(bookshelf);

        bookshelf.sort();

        System.out.println(bookshelf);
    }
}
