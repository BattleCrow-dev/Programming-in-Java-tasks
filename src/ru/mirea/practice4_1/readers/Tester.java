package ru.mirea.practice4_1.readers;

public class Tester {
    public static void main(String[] args) {
        Reader reader = new Reader("Пашков Дмитрий", "ABC-123", "ИИТ", "11.06.2004", "898982585869");

        reader.takeBook(2);
        reader.returnBook(2);
        System.out.println();

        reader.takeBook("Приключение", "Ужасы");
        reader.returnBook("Приключение", "Ужасы");
        System.out.println();

        reader.takeBook(new Book("Приключение", "Неизвестен"), new Book("Ужасы", "Стивен Кинг"));
        reader.returnBook(new Book("Приключение", "Неизвестен"), new Book("Ужасы", "Стивен Кинг"));
        System.out.println();
    }
}
