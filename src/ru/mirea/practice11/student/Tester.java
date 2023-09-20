package ru.mirea.practice11.student;

import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        Student student = new Student(new Date(104, 6, 11, 17, 0, 0));

        System.out.println(student);
        student.setType(1);
        System.out.println(student);
        student.setType(2);
        System.out.println(student);
        student.setType(3);
        System.out.println(student);
        student.setType(4);
        System.out.println(student);
    }
}
