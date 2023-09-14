package ru.mirea.practice6.printable;

public class Tester {
    public static void main(String[] args) {
        Printable[] objects = {new Book("hello_world"), new Shop("goodbye_world"), new Book("return_to_world")};

        for(Printable object : objects){
            object.print();
        }
    }
}
