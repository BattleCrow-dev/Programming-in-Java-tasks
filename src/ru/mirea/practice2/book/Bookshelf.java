package ru.mirea.practice2.book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bookshelf {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public Book findMinYear(){
        int min = Integer.MAX_VALUE;
        Book minBook = null;

        for (Book book : books) {
            if (book.getYear() < min) {
                min = book.getYear();
                minBook = book;
            }
        }

        return minBook;
    }

    public Book findMaxYear(){
        int max = Integer.MIN_VALUE;
        Book maxBook = null;

        for (Book book : books) {
            if (book.getYear() > max) {
                max = book.getYear();
                maxBook = book;
            }
        }

        return maxBook;
    }

    public void sort() {
        books.sort(Comparator.comparingInt(Book::getYear));
    }

    @Override
    public String toString() {
        return "Bookshelf{" +
                "books=" + books +
                '}';
    }
}
