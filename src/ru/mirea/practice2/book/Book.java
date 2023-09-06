package ru.mirea.practice2.book;

public class Book {
    private String author;
    private String title;
    private int year;
    private int pagesCount;

    public Book() {
        this.author = "None";
        this.title = "None";
        this.year = 0;
        this.pagesCount = 0;
    }

    public Book(String author, String title, int year, int pagesCount) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.pagesCount = pagesCount;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", pagesCount=" + pagesCount +
                '}';
    }
}
