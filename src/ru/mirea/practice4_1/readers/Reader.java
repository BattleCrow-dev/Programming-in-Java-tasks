package ru.mirea.practice4_1.readers;

public class Reader {
    private String fullName;
    private String readerNumber;
    private String faculty;
    private String birthDate;
    private String phoneNumber;

    public Reader() {
        this.fullName = "None";
        this.readerNumber = "None";
        this.faculty = "None";
        this.birthDate = "None";
        this.phoneNumber = "None";
    }

    public Reader(String fullName, String readerNumber, String faculty, String birthDate, String phoneNumber) {
        this.fullName = fullName;
        this.readerNumber = readerNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int count){
        System.out.println(fullName + " взял " + count + " книги");
    }

    public void takeBook(String... books){
        System.out.print(fullName + " взял книги: ");
        for(String book : books)
            System.out.print(book + " ");
        System.out.println();
    }

    public void takeBook(Book... books){
        System.out.print(fullName + " взял книги: " );
        for(Book book : books)
            System.out.print(book.getName() + " ");
        System.out.println();
    }

    public void returnBook(int count){
        System.out.println(fullName + " вернул " + count + " книги");
    }

    public void returnBook(String... books){
        System.out.print(fullName + " вернул книги: ");
        for(String book : books)
            System.out.print(book + " ");
        System.out.println();
    }

    public void returnBook(Book... books){
        System.out.print(fullName + " вернул книги: " );
        for(Book book : books)
            System.out.print(book.getName() + " ");
        System.out.println();
    }
}
