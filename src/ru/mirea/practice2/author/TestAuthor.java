package ru.mirea.practice2.author;

public class TestAuthor {
    public static void main(String[] args) {
        System.out.println("Test Author:");
        Author author = new Author("Dmitry", "pashkovvv00@gmail.com", 'M');
        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());

        author.setEmail("None");
        System.out.println(author.getEmail());

        System.out.println(author);
    }
}
