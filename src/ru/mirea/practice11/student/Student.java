package ru.mirea.practice11.student;

import java.text.DateFormat;
import java.util.Date;

public class Student {
    private final Date birthDate;
    private int type = 0;

    public Student(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        DateFormat df = DateFormat.getDateInstance(type % 4);
        return "Student{" + "birthDate=" + df.format(birthDate) + '}';
    }
}
