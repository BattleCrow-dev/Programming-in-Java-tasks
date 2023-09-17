package ru.mirea.practice9.merge_sort;

import java.util.Comparator;

public class SortingStudentsByID implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getIdNumber() - o2.getIdNumber();
    }
}
